package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rvxospnof extends GXProcedure
{
   public rvxospnof( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rvxospnof.class ), "" );
   }

   public rvxospnof( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 )
   {
      rvxospnof.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int[] aP3 )
   {
      rvxospnof.this.AV13VxOFabTip = aP0;
      rvxospnof.this.AV14BarCod = aP1;
      rvxospnof.this.AV15Modo = aP2;
      rvxospnof.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.rvxpedori(remoteHandle, context).execute( ) ;
      if ( GXutil.strcmp(AV15Modo, httpContext.getMessage( "PRI", "")) == 0 )
      {
         AV11Char20 = AV12DatosPed[1-1][3-1] ;
         AV19Ospednuof = CommonUtil.decimalVal( AV11Char20, ".") ;
      }
      else
      {
         AV11Char20 = AV12DatosPed[1-1][3-1] ;
         AV19Ospednuof = CommonUtil.decimalVal( AV11Char20, ".") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = rvxospnof.this.AV9VxPedNuOf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Char20 = "" ;
      AV12DatosPed = new String[99][6] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         GX_J = 1 ;
         while ( GX_J <= 6 )
         {
            AV12DatosPed[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV19Ospednuof = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV14BarCod ;
   private int AV9VxPedNuOf ;
   private int GX_I ;
   private int GX_J ;
   private java.math.BigDecimal AV19Ospednuof ;
   private String AV13VxOFabTip ;
   private String AV15Modo ;
   private String AV11Char20 ;
   private String AV12DatosPed[][] ;
   private int[] aP3 ;
}

