package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiemporeallector extends GXProcedure
{
   public tiemporeallector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiemporeallector.class ), "" );
   }

   public tiemporeallector( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            short[] aP5 )
   {
      tiemporeallector.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      tiemporeallector.this.AV16Fase = aP0[0];
      this.aP0 = aP0;
      tiemporeallector.this.AV14HisProlot = aP1[0];
      this.aP1 = aP1;
      tiemporeallector.this.AV15Barcod = aP2[0];
      this.aP2 = aP2;
      tiemporeallector.this.AV8Barcodreo = aP3[0];
      this.aP3 = aP3;
      tiemporeallector.this.AV9Barcodpar = aP4[0];
      this.aP4 = aP4;
      tiemporeallector.this.AV18Hisprotre = aP5[0];
      this.aP5 = aP5;
      tiemporeallector.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV11Grulec) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      tiemporeallector.this.GXt_int1 = GXv_int2[0] ;
      AV11Grulec = GXt_int1 ;
      AV19Lote = GXutil.str( AV15Barcod, 8, 0) + GXutil.str( AV8Barcodreo, 1, 0) + AV9Barcodpar ;
      GXt_char3 = AV12FasActTin ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char5[0] = AV16Fase ;
      GXv_char6[0] = GXt_char3 ;
      new app.fasetinte(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      tiemporeallector.this.AV10EmprCod = GXv_char4[0] ;
      tiemporeallector.this.AV16Fase = GXv_char5[0] ;
      tiemporeallector.this.GXt_char3 = GXv_char6[0] ;
      AV12FasActTin = GXt_char3 ;
      AV13FlagMarca = (short)(((GXutil.strcmp(AV14HisProlot, AV19Lote)==0) ? 1 : 0)) ;
      if ( AV11Grulec == 0 )
      {
         AV13FlagMarca = (short)(((GXutil.strcmp(AV12FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV13FlagMarca)) ;
      }
      else
      {
         AV13FlagMarca = (short)(((GXutil.strcmp(AV14HisProlot, AV19Lote)==0)&&(GXutil.strcmp(AV12FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV13FlagMarca)) ;
      }
      AV20Treal = (short)(((AV13FlagMarca==1) ? AV18Hisprotre : 0)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = tiemporeallector.this.AV16Fase;
      this.aP1[0] = tiemporeallector.this.AV14HisProlot;
      this.aP2[0] = tiemporeallector.this.AV15Barcod;
      this.aP3[0] = tiemporeallector.this.AV8Barcodreo;
      this.aP4[0] = tiemporeallector.this.AV9Barcodpar;
      this.aP5[0] = tiemporeallector.this.AV18Hisprotre;
      this.aP6[0] = tiemporeallector.this.AV20Treal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10EmprCod = "" ;
      GXv_int2 = new byte[1] ;
      AV19Lote = "" ;
      AV12FasActTin = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Barcodreo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV18Hisprotre ;
   private short AV20Treal ;
   private short AV11Grulec ;
   private short AV13FlagMarca ;
   private short Gx_err ;
   private int AV15Barcod ;
   private String AV16Fase ;
   private String AV14HisProlot ;
   private String AV9Barcodpar ;
   private String AV10EmprCod ;
   private String AV19Lote ;
   private String AV12FasActTin ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
}

