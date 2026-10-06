package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetatinte91__prc extends GXProcedure
{
   public recetatinte91__prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetatinte91__prc.class ), "" );
   }

   public recetatinte91__prc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        java.math.BigDecimal aP7 ,
                        byte aP8 ,
                        java.math.BigDecimal aP9 ,
                        byte aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String aP13 ,
                        String aP14 ,
                        byte aP15 ,
                        String aP16 ,
                        java.math.BigDecimal aP17 ,
                        java.math.BigDecimal aP18 ,
                        java.math.BigDecimal aP19 ,
                        java.math.BigDecimal aP20 ,
                        int aP21 ,
                        short aP22 ,
                        String aP23 ,
                        String aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             java.math.BigDecimal aP7 ,
                             byte aP8 ,
                             java.math.BigDecimal aP9 ,
                             byte aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String aP13 ,
                             String aP14 ,
                             byte aP15 ,
                             String aP16 ,
                             java.math.BigDecimal aP17 ,
                             java.math.BigDecimal aP18 ,
                             java.math.BigDecimal aP19 ,
                             java.math.BigDecimal aP20 ,
                             int aP21 ,
                             short aP22 ,
                             String aP23 ,
                             String aP24 )
   {
      recetatinte91__prc.this.AV14EmprCod = aP0;
      recetatinte91__prc.this.AV13BarCod = aP1;
      recetatinte91__prc.this.AV12BarCodReo = aP2;
      recetatinte91__prc.this.AV11BarCodPar = aP3;
      recetatinte91__prc.this.AV10RecLinMaq = aP4;
      recetatinte91__prc.this.AV8RecLinPro = aP5;
      recetatinte91__prc.this.AV9RecLin = aP6;
      recetatinte91__prc.this.AV19faccon = aP7;
      recetatinte91__prc.this.AV17ForPrdUMe = aP8;
      recetatinte91__prc.this.AV20Prdcant = aP9;
      recetatinte91__prc.this.AV23RecForNro = aP10;
      recetatinte91__prc.this.AV22RecLote = aP11;
      recetatinte91__prc.this.AV21RecManAut = aP12;
      recetatinte91__prc.this.AV16RecPrdDsc = aP13;
      recetatinte91__prc.this.AV15recprdnum = aP14;
      recetatinte91__prc.this.AV24RecPrdTnq = aP15;
      recetatinte91__prc.this.AV26oldRecLote = aP16;
      recetatinte91__prc.this.AV27Cantold = aP17;
      recetatinte91__prc.this.AV28CanResold = aP18;
      recetatinte91__prc.this.AV29oldFacCon = aP19;
      recetatinte91__prc.this.AV31TotaldeKilos = aP20;
      recetatinte91__prc.this.AV33VolumenReceta = aP21;
      recetatinte91__prc.this.AV32ValCos = aP22;
      recetatinte91__prc.this.AV34usurcod = aP23;
      recetatinte91__prc.this.AV35Station = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Inc_obs = " " ;
      AV40GXLvl5 = (byte)(0) ;
      /* Using cursor P0AH02 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar, Short.valueOf(AV10RecLinMaq), Byte.valueOf(AV8RecLinPro), Short.valueOf(AV9RecLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A811RecLin = P0AH02_A811RecLin[0] ;
         A1273RecLinPro = P0AH02_A1273RecLinPro[0] ;
         A2804RecLinMaq = P0AH02_A2804RecLinMaq[0] ;
         A130BarCodPar = P0AH02_A130BarCodPar[0] ;
         A132BarCodReo = P0AH02_A132BarCodReo[0] ;
         A129BarCod = P0AH02_A129BarCod[0] ;
         A396EmprCod = P0AH02_A396EmprCod[0] ;
         A490ForPrdUMe = P0AH02_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AH02_n490ForPrdUMe[0] ;
         A872RecPrdNum = P0AH02_A872RecPrdNum[0] ;
         A875RecPrdDsc = P0AH02_A875RecPrdDsc[0] ;
         A431FacCon = P0AH02_A431FacCon[0] ;
         A686PrdCant = P0AH02_A686PrdCant[0] ;
         A14055RecManAut = P0AH02_A14055RecManAut[0] ;
         A5725RecLote = P0AH02_A5725RecLote[0] ;
         A2394RecForNro = P0AH02_A2394RecForNro[0] ;
         A3274RecPrdTnq = P0AH02_A3274RecPrdTnq[0] ;
         AV40GXLvl5 = (byte)(1) ;
         AV37olfForPrdUMe = A490ForPrdUMe ;
         A872RecPrdNum = AV15recprdnum ;
         A875RecPrdDsc = AV16RecPrdDsc ;
         A490ForPrdUMe = AV17ForPrdUMe ;
         n490ForPrdUMe = false ;
         A431FacCon = AV19faccon ;
         A686PrdCant = AV20Prdcant ;
         A14055RecManAut = AV21RecManAut ;
         A5725RecLote = AV22RecLote ;
         A2394RecForNro = AV23RecForNro ;
         A3274RecPrdTnq = AV24RecPrdTnq ;
         AV30CanRes = AV20Prdcant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         GXv_char1[0] = AV14EmprCod ;
         GXv_char2[0] = A872RecPrdNum ;
         GXv_decimal3[0] = AV30CanRes ;
         GXv_decimal4[0] = AV28CanResold ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3, GXv_decimal4) ;
         recetatinte91__prc.this.AV14EmprCod = GXv_char1[0] ;
         recetatinte91__prc.this.A872RecPrdNum = GXv_char2[0] ;
         recetatinte91__prc.this.AV30CanRes = GXv_decimal3[0] ;
         recetatinte91__prc.this.AV28CanResold = GXv_decimal4[0] ;
         if ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 )
         {
            GXv_char2[0] = AV14EmprCod ;
            GXv_char1[0] = AV15recprdnum ;
            GXv_decimal4[0] = AV27Cantold ;
            GXv_decimal3[0] = AV20Prdcant ;
            GXv_decimal5[0] = AV31TotaldeKilos ;
            GXv_int6[0] = AV33VolumenReceta ;
            GXv_int7[0] = AV32ValCos ;
            GXv_int8[0] = AV17ForPrdUMe ;
            new app.preclin0(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal4, GXv_decimal3, GXv_decimal5, GXv_int6, GXv_int7, GXv_int8) ;
            recetatinte91__prc.this.AV14EmprCod = GXv_char2[0] ;
            recetatinte91__prc.this.AV15recprdnum = GXv_char1[0] ;
            recetatinte91__prc.this.AV27Cantold = GXv_decimal4[0] ;
            recetatinte91__prc.this.AV20Prdcant = GXv_decimal3[0] ;
            recetatinte91__prc.this.AV31TotaldeKilos = GXv_decimal5[0] ;
            recetatinte91__prc.this.AV33VolumenReceta = GXv_int6[0] ;
            recetatinte91__prc.this.AV32ValCos = (short)((short)(GXv_int7[0])) ;
            recetatinte91__prc.this.AV17ForPrdUMe = GXv_int8[0] ;
         }
         AV36Inc_obs = httpContext.getMessage( "LinMaq ", "") + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + httpContext.getMessage( " Linpro ", "") + GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)) + httpContext.getMessage( " Linea ", "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( " Modificada", "") + GXutil.newLine( ) ;
         AV36Inc_obs += httpContext.getMessage( "Producto ", "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( " Factor old ", "") + GXutil.trim( GXutil.str( AV29oldFacCon, 11, 5)) + httpContext.getMessage( " Cant. old ", "") + GXutil.trim( GXutil.str( AV27Cantold, 11, 3)) + httpContext.getMessage( "Un. old ", "") + GXutil.str( AV37olfForPrdUMe, 1, 0) + GXutil.newLine( ) ;
         AV36Inc_obs += httpContext.getMessage( "Factor ", "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( " Cant. ", "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( "Unidad ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + GXutil.newLine( ) ;
         /* Using cursor P0AH03 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A872RecPrdNum, A875RecPrdDsc, A431FacCon, A686PrdCant, A14055RecManAut, A5725RecLote, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV40GXLvl5 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLRECET

         */
         A396EmprCod = AV14EmprCod ;
         A129BarCod = AV13BarCod ;
         A132BarCodReo = AV12BarCodReo ;
         A130BarCodPar = AV11BarCodPar ;
         A2804RecLinMaq = AV10RecLinMaq ;
         A1273RecLinPro = AV8RecLinPro ;
         A811RecLin = AV9RecLin ;
         A719PrdNum = AV15recprdnum ;
         n719PrdNum = false ;
         A872RecPrdNum = AV15recprdnum ;
         A875RecPrdDsc = AV16RecPrdDsc ;
         A490ForPrdUMe = AV17ForPrdUMe ;
         n490ForPrdUMe = false ;
         A431FacCon = AV19faccon ;
         A686PrdCant = AV20Prdcant ;
         A14055RecManAut = AV21RecManAut ;
         A5725RecLote = AV22RecLote ;
         A2394RecForNro = AV23RecForNro ;
         A3274RecPrdTnq = AV24RecPrdTnq ;
         /* Using cursor P0AH04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A5725RecLote, A14055RecManAut});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV30CanRes = AV20Prdcant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         GXv_char2[0] = AV14EmprCod ;
         GXv_char1[0] = AV15recprdnum ;
         GXv_decimal5[0] = AV30CanRes ;
         GXv_decimal4[0] = DecimalUtil.doubleToDec(0) ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal5, GXv_decimal4) ;
         recetatinte91__prc.this.AV14EmprCod = GXv_char2[0] ;
         recetatinte91__prc.this.AV15recprdnum = GXv_char1[0] ;
         recetatinte91__prc.this.AV30CanRes = GXv_decimal5[0] ;
         if ( GXutil.strcmp(GXutil.substring( AV15recprdnum, 1, 1), "0") == 0 )
         {
            GXv_char2[0] = AV14EmprCod ;
            GXv_char1[0] = AV15recprdnum ;
            GXv_decimal5[0] = AV27Cantold ;
            GXv_decimal4[0] = AV20Prdcant ;
            GXv_decimal3[0] = AV31TotaldeKilos ;
            GXv_int7[0] = AV33VolumenReceta ;
            GXv_int6[0] = AV32ValCos ;
            GXv_int8[0] = AV17ForPrdUMe ;
            new app.preclin0(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal5, GXv_decimal4, GXv_decimal3, GXv_int7, GXv_int6, GXv_int8) ;
            recetatinte91__prc.this.AV14EmprCod = GXv_char2[0] ;
            recetatinte91__prc.this.AV15recprdnum = GXv_char1[0] ;
            recetatinte91__prc.this.AV27Cantold = GXv_decimal5[0] ;
            recetatinte91__prc.this.AV20Prdcant = GXv_decimal4[0] ;
            recetatinte91__prc.this.AV31TotaldeKilos = GXv_decimal3[0] ;
            recetatinte91__prc.this.AV33VolumenReceta = GXv_int7[0] ;
            recetatinte91__prc.this.AV32ValCos = (short)((short)(GXv_int6[0])) ;
            recetatinte91__prc.this.AV17ForPrdUMe = GXv_int8[0] ;
         }
         AV36Inc_obs = httpContext.getMessage( "LinMaq ", "") + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + httpContext.getMessage( " Linpro ", "") + GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)) + httpContext.getMessage( " Linea ", "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( " Alta", "") + GXutil.newLine( ) ;
         AV36Inc_obs += httpContext.getMessage( "Producto ", "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( " Factor ", "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( " Cant. ", "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( "Unidad ", "") + GXutil.str( A490ForPrdUMe, 1, 0) + GXutil.newLine( ) ;
      }
      GXv_char2[0] = AV14EmprCod ;
      GXv_int7[0] = AV13BarCod ;
      GXv_int8[0] = AV12BarCodReo ;
      GXv_char1[0] = AV11BarCodPar ;
      GXv_int9[0] = AV10RecLinMaq ;
      GXv_char10[0] = AV34usurcod ;
      new app.pusudatm(remoteHandle, context).execute( GXv_char2, GXv_int7, GXv_int8, GXv_char1, GXv_int9, GXv_char10) ;
      recetatinte91__prc.this.AV14EmprCod = GXv_char2[0] ;
      recetatinte91__prc.this.AV13BarCod = GXv_int7[0] ;
      recetatinte91__prc.this.AV12BarCodReo = GXv_int8[0] ;
      recetatinte91__prc.this.AV11BarCodPar = GXv_char1[0] ;
      recetatinte91__prc.this.AV10RecLinMaq = GXv_int9[0] ;
      recetatinte91__prc.this.AV34usurcod = GXv_char10[0] ;
      if ( GXutil.strcmp(AV36Inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV14EmprCod, AV41Pgmname, AV34usurcod, AV35Station, AV36Inc_obs, AV13BarCod, AV12BarCodReo, AV11BarCodPar) ;
      }
      /* Optimized UPDATE. */
      /* Using cursor P0AH05 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV17ForPrdUMe), AV14EmprCod, AV15recprdnum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "recetatinte91__prc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36Inc_obs = "" ;
      scmdbuf = "" ;
      P0AH02_A811RecLin = new short[1] ;
      P0AH02_A1273RecLinPro = new byte[1] ;
      P0AH02_A2804RecLinMaq = new short[1] ;
      P0AH02_A130BarCodPar = new String[] {""} ;
      P0AH02_A132BarCodReo = new byte[1] ;
      P0AH02_A129BarCod = new int[1] ;
      P0AH02_A396EmprCod = new String[] {""} ;
      P0AH02_A490ForPrdUMe = new byte[1] ;
      P0AH02_n490ForPrdUMe = new boolean[] {false} ;
      P0AH02_A872RecPrdNum = new String[] {""} ;
      P0AH02_A875RecPrdDsc = new String[] {""} ;
      P0AH02_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH02_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH02_A14055RecManAut = new String[] {""} ;
      P0AH02_A5725RecLote = new String[] {""} ;
      P0AH02_A2394RecForNro = new byte[1] ;
      P0AH02_A3274RecPrdTnq = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A14055RecManAut = "" ;
      A5725RecLote = "" ;
      AV30CanRes = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      Gx_emsg = "" ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char10 = new String[1] ;
      AV41Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetatinte91__prc__default(),
         new Object[] {
             new Object[] {
            P0AH02_A811RecLin, P0AH02_A1273RecLinPro, P0AH02_A2804RecLinMaq, P0AH02_A130BarCodPar, P0AH02_A132BarCodReo, P0AH02_A129BarCod, P0AH02_A396EmprCod, P0AH02_A490ForPrdUMe, P0AH02_n490ForPrdUMe, P0AH02_A872RecPrdNum,
            P0AH02_A875RecPrdDsc, P0AH02_A431FacCon, P0AH02_A686PrdCant, P0AH02_A14055RecManAut, P0AH02_A5725RecLote, P0AH02_A2394RecForNro, P0AH02_A3274RecPrdTnq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV41Pgmname = "RecetaTinte91__PRC" ;
      /* GeneXus formulas. */
      AV41Pgmname = "RecetaTinte91__PRC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV8RecLinPro ;
   private byte AV17ForPrdUMe ;
   private byte AV23RecForNro ;
   private byte AV24RecPrdTnq ;
   private byte AV40GXLvl5 ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte AV37olfForPrdUMe ;
   private byte GXv_int8[] ;
   private byte A4338PrdUMeFo ;
   private short AV10RecLinMaq ;
   private short AV9RecLin ;
   private short AV32ValCos ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private int AV13BarCod ;
   private int AV33VolumenReceta ;
   private int A129BarCod ;
   private int GX_INS410 ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV19faccon ;
   private java.math.BigDecimal AV20Prdcant ;
   private java.math.BigDecimal AV27Cantold ;
   private java.math.BigDecimal AV28CanResold ;
   private java.math.BigDecimal AV29oldFacCon ;
   private java.math.BigDecimal AV31TotaldeKilos ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV30CanRes ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String AV14EmprCod ;
   private String AV11BarCodPar ;
   private String AV22RecLote ;
   private String AV21RecManAut ;
   private String AV16RecPrdDsc ;
   private String AV15recprdnum ;
   private String AV26oldRecLote ;
   private String AV34usurcod ;
   private String AV35Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A14055RecManAut ;
   private String A5725RecLote ;
   private String A719PrdNum ;
   private String Gx_emsg ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private String AV41Pgmname ;
   private boolean n490ForPrdUMe ;
   private boolean n719PrdNum ;
   private String AV36Inc_obs ;
   private IDataStoreProvider pr_default ;
   private short[] P0AH02_A811RecLin ;
   private byte[] P0AH02_A1273RecLinPro ;
   private short[] P0AH02_A2804RecLinMaq ;
   private String[] P0AH02_A130BarCodPar ;
   private byte[] P0AH02_A132BarCodReo ;
   private int[] P0AH02_A129BarCod ;
   private String[] P0AH02_A396EmprCod ;
   private byte[] P0AH02_A490ForPrdUMe ;
   private boolean[] P0AH02_n490ForPrdUMe ;
   private String[] P0AH02_A872RecPrdNum ;
   private String[] P0AH02_A875RecPrdDsc ;
   private java.math.BigDecimal[] P0AH02_A431FacCon ;
   private java.math.BigDecimal[] P0AH02_A686PrdCant ;
   private String[] P0AH02_A14055RecManAut ;
   private String[] P0AH02_A5725RecLote ;
   private byte[] P0AH02_A2394RecForNro ;
   private byte[] P0AH02_A3274RecPrdTnq ;
}

final  class recetatinte91__prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH02", "SELECT RecLin, RecLinPro, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, ForPrdUMe, RecPrdNum, RecPrdDsc, FacCon, PrdCant, RecManAut, RecLote, RecForNro, RecPrdTnq FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? and RecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin  FOR UPDATE OF ForPrdUMe, RecPrdNum, RecPrdDsc, FacCon, PrdCant, RecManAut, RecLote, RecForNro, RecPrdTnq NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AH03", "UPDATE TXPLRECET SET ForPrdUMe=?, RecPrdNum=?, RecPrdDsc=?, FacCon=?, PrdCant=?, RecManAut=?, RecLote=?, RecForNro=?, RecPrdTnq=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P0AH04", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, RecForNro, RecPrdTnq, RecLote, RecManAut, PrdCanFin, PrdCanAny, RecCanEns, RecMar, RecLinUsr, RecPesFec, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, RecLotAlm, RecLoteFch) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P0AH05", "UPDATE TXPPRODUC SET PrdUMeFo=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 26);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 3);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 1);
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               stmt.setString(9, (String)parms[9], 6);
               stmt.setString(10, (String)parms[10], 26);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[12]).byteValue());
               }
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[14], 3);
               stmt.setByte(14, ((Number) parms[15]).byteValue());
               stmt.setByte(15, ((Number) parms[16]).byteValue());
               stmt.setString(16, (String)parms[17], 26);
               stmt.setString(17, (String)parms[18], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

