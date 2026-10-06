package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_getins_upd extends GXProcedure
{
   public documentodetransporteproduccion_getins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_getins_upd.class ), "" );
   }

   public documentodetransporteproduccion_getins_upd( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        short aP6 ,
                        short aP7 ,
                        java.math.BigDecimal aP8 ,
                        int aP9 ,
                        short aP10 ,
                        int aP11 ,
                        String aP12 ,
                        String aP13 ,
                        short aP14 ,
                        short aP15 ,
                        short aP16 ,
                        java.math.BigDecimal aP17 ,
                        java.math.BigDecimal aP18 ,
                        int aP19 ,
                        String aP20 ,
                        String aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             short aP6 ,
                             short aP7 ,
                             java.math.BigDecimal aP8 ,
                             int aP9 ,
                             short aP10 ,
                             int aP11 ,
                             String aP12 ,
                             String aP13 ,
                             short aP14 ,
                             short aP15 ,
                             short aP16 ,
                             java.math.BigDecimal aP17 ,
                             java.math.BigDecimal aP18 ,
                             int aP19 ,
                             String aP20 ,
                             String aP21 )
   {
      documentodetransporteproduccion_getins_upd.this.AV9EmprCod = aP0;
      documentodetransporteproduccion_getins_upd.this.AV19AlbProCod = aP1;
      documentodetransporteproduccion_getins_upd.this.AV20BarCod = aP2;
      documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = aP3;
      documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = aP4;
      documentodetransporteproduccion_getins_upd.this.AV16BarAlbKgmE = aP5;
      documentodetransporteproduccion_getins_upd.this.AV22AlbHdrAnc = aP6;
      documentodetransporteproduccion_getins_upd.this.AV23AlbHdrgm2 = aP7;
      documentodetransporteproduccion_getins_upd.this.AV24BarAlbMtrE = aP8;
      documentodetransporteproduccion_getins_upd.this.AV25BarAlbPie = aP9;
      documentodetransporteproduccion_getins_upd.this.AV26TubCod = aP10;
      documentodetransporteproduccion_getins_upd.this.AV27BarAlbTub = aP11;
      documentodetransporteproduccion_getins_upd.this.AV28AlbProVal = aP12;
      documentodetransporteproduccion_getins_upd.this.AV8AlbHdrObs = aP13;
      documentodetransporteproduccion_getins_upd.this.AV11FlagFas = aP14;
      documentodetransporteproduccion_getins_upd.this.AV12Moda21 = aP15;
      documentodetransporteproduccion_getins_upd.this.AV13albbar = aP16;
      documentodetransporteproduccion_getins_upd.this.AV14MetAnt = aP17;
      documentodetransporteproduccion_getins_upd.this.AV15KilAnt = aP18;
      documentodetransporteproduccion_getins_upd.this.AV29PieAnt = aP19;
      documentodetransporteproduccion_getins_upd.this.AV18UsurCod = aP20;
      documentodetransporteproduccion_getins_upd.this.AV17Station = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV30F_kgslam) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "KLAMIN", ""), GXv_int2) ;
      documentodetransporteproduccion_getins_upd.this.GXt_int1 = GXv_int2[0] ;
      AV30F_kgslam = GXt_int1 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_20_ins_upd(remoteHandle, context).execute( AV9EmprCod, AV19AlbProCod, AV20BarCod, AV10BarCodReo, AV21BarCodPar, AV16BarAlbKgmE, AV22AlbHdrAnc, AV23AlbHdrgm2, AV24BarAlbMtrE, AV25BarAlbPie, AV26TubCod, AV27BarAlbTub, AV28AlbProVal, AV8AlbHdrObs, AV12Moda21, AV18UsurCod, AV17Station) ;
      if ( ( AV11FlagFas == 1 ) && ( AV12Moda21 == 1 ) )
      {
         GXv_char3[0] = AV9EmprCod ;
         GXv_int4[0] = AV19AlbProCod ;
         GXv_int5[0] = AV20BarCod ;
         GXv_int2[0] = AV10BarCodReo ;
         GXv_char6[0] = AV21BarCodPar ;
         new app.pfas618(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int2, GXv_char6) ;
         documentodetransporteproduccion_getins_upd.this.AV9EmprCod = GXv_char3[0] ;
         documentodetransporteproduccion_getins_upd.this.AV19AlbProCod = GXv_int4[0] ;
         documentodetransporteproduccion_getins_upd.this.AV20BarCod = GXv_int5[0] ;
         documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = GXv_int2[0] ;
         documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = GXv_char6[0] ;
      }
      if ( ( AV11FlagFas == 1 ) && ( AV13albbar == 0 ) )
      {
         GXv_char6[0] = AV9EmprCod ;
         GXv_int4[0] = AV19AlbProCod ;
         GXv_int5[0] = AV20BarCod ;
         GXv_int2[0] = AV10BarCodReo ;
         GXv_char3[0] = AV21BarCodPar ;
         new app.pcopfas(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, GXv_int2, GXv_char3) ;
         documentodetransporteproduccion_getins_upd.this.AV9EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_getins_upd.this.AV19AlbProCod = GXv_int4[0] ;
         documentodetransporteproduccion_getins_upd.this.AV20BarCod = GXv_int5[0] ;
         documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = GXv_int2[0] ;
         documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = GXv_char3[0] ;
         if ( AV30F_kgslam == 0 )
         {
            GXv_char6[0] = AV9EmprCod ;
            GXv_int4[0] = AV19AlbProCod ;
            GXv_int5[0] = AV20BarCod ;
            GXv_int2[0] = AV10BarCodReo ;
            GXv_char3[0] = AV21BarCodPar ;
            new app.pkilfas(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, GXv_int2, GXv_char3) ;
            documentodetransporteproduccion_getins_upd.this.AV9EmprCod = GXv_char6[0] ;
            documentodetransporteproduccion_getins_upd.this.AV19AlbProCod = GXv_int4[0] ;
            documentodetransporteproduccion_getins_upd.this.AV20BarCod = GXv_int5[0] ;
            documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = GXv_int2[0] ;
            documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = GXv_char3[0] ;
         }
      }
      if ( ( AV12Moda21 == 1 ) && ( ( DecimalUtil.compareTo(AV14MetAnt, AV24BarAlbMtrE) != 0 ) || ( DecimalUtil.compareTo(AV15KilAnt, AV16BarAlbKgmE) != 0 ) ) && ( AV13albbar == 1 ) )
      {
         GXv_char6[0] = AV9EmprCod ;
         GXv_int4[0] = AV19AlbProCod ;
         GXv_int5[0] = AV20BarCod ;
         GXv_int2[0] = AV10BarCodReo ;
         GXv_char3[0] = AV21BarCodPar ;
         GXv_decimal7[0] = AV16BarAlbKgmE ;
         GXv_decimal8[0] = AV24BarAlbMtrE ;
         GXv_char9[0] = AV18UsurCod ;
         GXv_char10[0] = AV17Station ;
         new app.pupdmtsfs(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, GXv_int2, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_char9, GXv_char10) ;
         documentodetransporteproduccion_getins_upd.this.AV9EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_getins_upd.this.AV19AlbProCod = GXv_int4[0] ;
         documentodetransporteproduccion_getins_upd.this.AV20BarCod = GXv_int5[0] ;
         documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = GXv_int2[0] ;
         documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = GXv_char3[0] ;
         documentodetransporteproduccion_getins_upd.this.AV16BarAlbKgmE = GXv_decimal7[0] ;
         documentodetransporteproduccion_getins_upd.this.AV24BarAlbMtrE = GXv_decimal8[0] ;
         documentodetransporteproduccion_getins_upd.this.AV18UsurCod = GXv_char9[0] ;
         documentodetransporteproduccion_getins_upd.this.AV17Station = GXv_char10[0] ;
      }
      Gx_mode = ((AV13albbar==0) ? httpContext.getMessage( "INS", "") : httpContext.getMessage( "UPD", "")) ;
      GXv_char10[0] = AV9EmprCod ;
      GXv_int5[0] = AV20BarCod ;
      GXv_int2[0] = AV10BarCodReo ;
      GXv_char9[0] = AV21BarCodPar ;
      GXv_decimal8[0] = AV16BarAlbKgmE ;
      GXv_decimal7[0] = AV24BarAlbMtrE ;
      GXv_int11[0] = AV25BarAlbPie ;
      GXv_decimal12[0] = AV15KilAnt ;
      GXv_decimal13[0] = AV14MetAnt ;
      GXv_int14[0] = AV29PieAnt ;
      GXv_char6[0] = Gx_mode ;
      new app.pcampie(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_int2, GXv_char9, GXv_decimal8, GXv_decimal7, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_char6) ;
      documentodetransporteproduccion_getins_upd.this.AV9EmprCod = GXv_char10[0] ;
      documentodetransporteproduccion_getins_upd.this.AV20BarCod = GXv_int5[0] ;
      documentodetransporteproduccion_getins_upd.this.AV10BarCodReo = GXv_int2[0] ;
      documentodetransporteproduccion_getins_upd.this.AV21BarCodPar = GXv_char9[0] ;
      documentodetransporteproduccion_getins_upd.this.AV16BarAlbKgmE = GXv_decimal8[0] ;
      documentodetransporteproduccion_getins_upd.this.AV24BarAlbMtrE = GXv_decimal7[0] ;
      documentodetransporteproduccion_getins_upd.this.AV25BarAlbPie = GXv_int11[0] ;
      documentodetransporteproduccion_getins_upd.this.AV15KilAnt = GXv_decimal12[0] ;
      documentodetransporteproduccion_getins_upd.this.AV14MetAnt = GXv_decimal13[0] ;
      documentodetransporteproduccion_getins_upd.this.AV29PieAnt = GXv_int14[0] ;
      documentodetransporteproduccion_getins_upd.this.Gx_mode = GXv_char6[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int4 = new long[1] ;
      GXv_char3 = new String[1] ;
      Gx_mode = "" ;
      GXv_char10 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new int[1] ;
      GXv_char6 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV22AlbHdrAnc ;
   private short AV23AlbHdrgm2 ;
   private short AV26TubCod ;
   private short AV11FlagFas ;
   private short AV12Moda21 ;
   private short AV13albbar ;
   private short AV30F_kgslam ;
   private short Gx_err ;
   private int AV20BarCod ;
   private int AV25BarAlbPie ;
   private int AV27BarAlbTub ;
   private int AV29PieAnt ;
   private int GXv_int5[] ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private long AV19AlbProCod ;
   private long GXv_int4[] ;
   private java.math.BigDecimal AV16BarAlbKgmE ;
   private java.math.BigDecimal AV24BarAlbMtrE ;
   private java.math.BigDecimal AV14MetAnt ;
   private java.math.BigDecimal AV15KilAnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String AV9EmprCod ;
   private String AV21BarCodPar ;
   private String AV28AlbProVal ;
   private String AV8AlbHdrObs ;
   private String AV18UsurCod ;
   private String AV17Station ;
   private String GXv_char3[] ;
   private String Gx_mode ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
}

