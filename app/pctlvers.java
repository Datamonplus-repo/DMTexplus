package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctlvers extends GXProcedure
{
   public pctlvers( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctlvers.class ), "" );
   }

   public pctlvers( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      pctlvers.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      pctlvers.this.AV9EmprCod = aP0[0];
      this.aP0 = aP0;
      pctlvers.this.AV10FecLimite = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV8ContVal ;
      new app.pbuscon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "VERSIF", ""), GXv_int1) ;
      pctlvers.this.AV8ContVal = GXv_int1[0] ;
      if ( AV8ContVal == 0 )
      {
         AV10FecLimite = GXutil.addyr( Gx_date, (short)(10)) ;
      }
      else
      {
         AV11Caracter8 = GXutil.ltrim( GXutil.str( AV8ContVal, 8, 0)) ;
         AV12DD = (byte)(GXutil.lval( GXutil.substring( AV11Caracter8, 1, 2))-33) ;
         AV13MM = (byte)(GXutil.lval( GXutil.substring( AV11Caracter8, 3, 2))-33) ;
         AV14AA = (byte)(GXutil.lval( GXutil.substring( AV11Caracter8, 5, 2))-33) ;
         AV10FecLimite = localUtil.ymdtod( AV14AA, AV13MM, AV12DD) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctlvers.this.AV9EmprCod;
      this.aP1[0] = pctlvers.this.AV10FecLimite;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      Gx_date = GXutil.nullDate() ;
      AV11Caracter8 = "" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV12DD ;
   private byte AV13MM ;
   private byte AV14AA ;
   private short Gx_err ;
   private int AV8ContVal ;
   private int GXv_int1[] ;
   private String AV9EmprCod ;
   private String AV11Caracter8 ;
   private java.util.Date AV10FecLimite ;
   private java.util.Date Gx_date ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
}

