package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rvxoserp extends GXProcedure
{
   public rvxoserp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rvxoserp.class ), "" );
   }

   public rvxoserp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 )
   {
      rvxoserp.this.aP3 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        long[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             long[] aP3 )
   {
      rvxoserp.this.AV10VxOFabTip = aP0;
      rvxoserp.this.AV13VxOSCod = aP1;
      rvxoserp.this.AV11Modo = aP2;
      rvxoserp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.rvxpedlori(remoteHandle, context).execute( ) ;
      if ( GXutil.strcmp(AV11Modo, httpContext.getMessage( "PRI", "")) == 0 )
      {
         AV8Char20 = AV9DatosPed[1-1][1-1] ;
         AV14VXOsPedERP = GXutil.lval( AV8Char20) ;
      }
      else
      {
         AV8Char20 = AV9DatosPed[1-1][1-1] ;
         AV14VXOsPedERP = GXutil.lval( AV8Char20) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = rvxoserp.this.AV14VXOsPedERP;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Char20 = "" ;
      AV9DatosPed = new String[99][6] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         GX_J = 1 ;
         while ( GX_J <= 6 )
         {
            AV9DatosPed[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13VxOSCod ;
   private int GX_I ;
   private int GX_J ;
   private long AV14VXOsPedERP ;
   private String AV10VxOFabTip ;
   private String AV11Modo ;
   private String AV8Char20 ;
   private String AV9DatosPed[][] ;
   private long[] aP3 ;
}

