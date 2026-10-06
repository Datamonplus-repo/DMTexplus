package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnpiezas extends GXProcedure
{
   public pnpiezas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnpiezas.class ), "" );
   }

   public pnpiezas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           String[] aP5 ,
                                           short[] aP6 ,
                                           int[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           String[] aP9 ,
                                           int[] aP10 ,
                                           byte[] aP11 ,
                                           short[] aP12 ,
                                           short[] aP13 )
   {
      pnpiezas.this.aP14 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        byte[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        java.math.BigDecimal[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             byte[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             java.math.BigDecimal[] aP14 )
   {
      pnpiezas.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnpiezas.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pnpiezas.this.AV20AlbCod = aP2[0];
      this.aP2 = aP2;
      pnpiezas.this.AV17Cant = aP3[0];
      this.aP3 = aP3;
      pnpiezas.this.AV18Unidades = aP4[0];
      this.aP4 = aP4;
      pnpiezas.this.AV19UniMed = aP5[0];
      this.aP5 = aP5;
      pnpiezas.this.AV21Peso = aP6[0];
      this.aP6 = aP6;
      pnpiezas.this.AV22PieUti = aP7[0];
      this.aP7 = aP7;
      pnpiezas.this.AV23UniUti = aP8[0];
      this.aP8 = aP8;
      pnpiezas.this.AV24DisColNom = aP9[0];
      this.aP9 = aP9;
      pnpiezas.this.AV25DisColNum = aP10[0];
      this.aP10 = aP10;
      pnpiezas.this.AV26Flag1 = aP11[0];
      this.aP11 = aP11;
      pnpiezas.this.AV46Anc1 = aP12[0];
      this.aP12 = aP12;
      pnpiezas.this.AV47Anc2 = aP13[0];
      this.aP13 = aP13;
      pnpiezas.this.AV48Dispiepda = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV38Flag_MRdo ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int1) ;
      pnpiezas.this.AV38Flag_MRdo = GXv_int1[0] ;
      AV39Hidro = (byte)(0) ;
      GXv_int1[0] = AV39Hidro ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int1) ;
      pnpiezas.this.AV39Hidro = GXv_int1[0] ;
      GXv_int1[0] = AV54Np1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NP0000", ""), GXv_int1) ;
      pnpiezas.this.AV54Np1 = GXv_int1[0] ;
      /* Using cursor P03WM2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P03WM2_A361DisCod[0] ;
         A396EmprCod = P03WM2_A396EmprCod[0] ;
         A350DisArtRdt = P03WM2_A350DisArtRdt[0] ;
         AV37Rdto = A350DisArtRdt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV29Piezas = AV17Cant ;
      AV30Cont = AV17Cant ;
      if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         AV35Kilos = AV18Unidades ;
         AV36Metros = DecimalUtil.ZERO ;
      }
      AV49Nrecp6 = AV20AlbCod ;
      AV50Nrecp6a = GXutil.padl( GXutil.trim( GXutil.str( AV49Nrecp6, 6, 0)), (short)(6), "0") ;
      AV41TotUnid = DecimalUtil.doubleToDec(0) ;
      AV45TotUnidK = DecimalUtil.doubleToDec(0) ;
      AV51Np = (short)(1) ;
      while ( ( AV30Cont != 0 ) && ( AV18Unidades.doubleValue() != 0 ) )
      {
         if ( AV54Np1 == 0 )
         {
            GXv_int2[0] = AV28ConVal ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "031600", GXv_int2) ;
            pnpiezas.this.AV28ConVal = GXv_int2[0] ;
         }
         AV52NpA = GXutil.padl( GXutil.trim( GXutil.str( AV51Np, 3, 0)), (short)(3), "0") ;
         AV53Npza = AV50Nrecp6a + AV52NpA ;
         /*
            INSERT RECORD ON TABLE TXPDISALD

         */
         A396EmprCod = AV15EmprCod ;
         A361DisCod = AV16DisCod ;
         A380DisPieCod = GXutil.str( AV28ConVal, 8, 0) ;
         if ( AV39Hidro == 1 )
         {
            A380DisPieCod = "*" + GXutil.trim( GXutil.substring( A380DisPieCod, 1, 8)) ;
         }
         if ( AV54Np1 == 1 )
         {
            A380DisPieCod = AV53Npza ;
         }
         A44AlbRecCod = AV20AlbCod ;
         if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            A384DisPieMet = DecimalUtil.doubleToDec(0) ;
            if ( AV30Cont == 1 )
            {
               AV33DisPieKil = AV18Unidades.subtract(AV41TotUnid) ;
            }
            else
            {
               AV33DisPieKil = GXutil.roundDecimal( AV18Unidades.divide(DecimalUtil.doubleToDec(AV29Piezas), 18, java.math.RoundingMode.DOWN), 2) ;
               AV41TotUnid = AV41TotUnid.add(AV33DisPieKil) ;
            }
            if ( AV38Flag_MRdo == 1 )
            {
               AV34DisPieMet = AV33DisPieKil.multiply(AV37Rdto) ;
               A384DisPieMet = AV34DisPieMet ;
            }
            A382DisPieKil = AV33DisPieKil ;
         }
         else
         {
            if ( AV30Cont == 1 )
            {
               AV33DisPieKil = (AV18Unidades.multiply(DecimalUtil.doubleToDec(AV21Peso))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN).subtract(AV45TotUnidK) ;
            }
            else
            {
               AV33DisPieKil = (AV18Unidades.multiply(DecimalUtil.doubleToDec(AV21Peso))).divide(DecimalUtil.doubleToDec((AV29Piezas*1000)), 18, java.math.RoundingMode.DOWN) ;
               AV45TotUnidK = AV45TotUnidK.add(AV33DisPieKil) ;
            }
            A382DisPieKil = AV33DisPieKil ;
            if ( AV30Cont == 1 )
            {
               AV34DisPieMet = AV18Unidades.subtract(AV41TotUnid) ;
            }
            else
            {
               AV34DisPieMet = GXutil.roundDecimal( AV18Unidades.divide(DecimalUtil.doubleToDec(AV29Piezas), 18, java.math.RoundingMode.DOWN), 2) ;
               AV41TotUnid = AV41TotUnid.add(AV34DisPieMet) ;
            }
            A384DisPieMet = AV34DisPieMet ;
            AV35Kilos = AV35Kilos.add(AV33DisPieKil) ;
            AV36Metros = AV36Metros.add(AV34DisPieMet) ;
         }
         A5099DisPieEst = (byte)(0) ;
         AV43DisPieCod = A380DisPieCod ;
         A2185DisPieAnc = AV46Anc1 ;
         A9845DisPieAncc = AV47Anc2 ;
         n9845DisPieAncc = false ;
         A9983DisPiePda = AV48Dispiepda ;
         n9983DisPiePda = false ;
         /* Using cursor P03WM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst), Boolean.valueOf(n9845DisPieAncc), Short.valueOf(A9845DisPieAncc), Boolean.valueOf(n9983DisPiePda), A9983DisPiePda});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         if ( (pr_default.getStatus(1) == 1) )
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
         AV30Cont = (byte)(AV30Cont-1) ;
         AV51Np = (short)(AV51Np+1) ;
      }
      if ( AV26Flag1 == 1 )
      {
         GXv_char3[0] = AV15EmprCod ;
         GXv_int4[0] = AV16DisCod ;
         GXv_int2[0] = AV20AlbCod ;
         GXv_decimal5[0] = AV35Kilos ;
         GXv_decimal6[0] = AV36Metros ;
         GXv_int7[0] = AV29Piezas ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int10[0] = 0 ;
         GXv_char11[0] = httpContext.getMessage( "B", "") ;
         GXv_char12[0] = AV24DisColNom ;
         GXv_int13[0] = AV25DisColNum ;
         GXv_char14[0] = httpContext.getMessage( "INS", "") ;
         GXv_char15[0] = "" ;
         new app.pmodhis(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_char15) ;
         pnpiezas.this.AV15EmprCod = GXv_char3[0] ;
         pnpiezas.this.AV16DisCod = (int)((int)(GXv_int4[0])) ;
         pnpiezas.this.AV20AlbCod = GXv_int2[0] ;
         pnpiezas.this.AV35Kilos = GXv_decimal5[0] ;
         pnpiezas.this.AV36Metros = GXv_decimal6[0] ;
         pnpiezas.this.AV29Piezas = (byte)((byte)(GXv_int7[0])) ;
         pnpiezas.this.AV24DisColNom = GXv_char12[0] ;
         pnpiezas.this.AV25DisColNum = GXv_int13[0] ;
      }
      else
      {
         /* Using cursor P03WM4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV20AlbCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A44AlbRecCod = P03WM4_A44AlbRecCod[0] ;
            A396EmprCod = P03WM4_A396EmprCod[0] ;
            A60AlbRUniUti = P03WM4_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P03WM4_A54AlbRPieUti[0] ;
            A48AlbRFecUlt = P03WM4_A48AlbRFecUlt[0] ;
            A60AlbRUniUti = A60AlbRUniUti.add(AV18Unidades) ;
            A54AlbRPieUti = (int)(A54AlbRPieUti+AV17Cant) ;
            A48AlbRFecUlt = GXutil.today( ) ;
            /* Using cursor P03WM5 */
            pr_default.execute(3, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A48AlbRFecUlt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      /* Using cursor P03WM6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV20AlbCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P03WM6_A44AlbRecCod[0] ;
         A396EmprCod = P03WM6_A396EmprCod[0] ;
         A54AlbRPieUti = P03WM6_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P03WM6_A60AlbRUniUti[0] ;
         AV22PieUti = A54AlbRPieUti ;
         AV23UniUti = A60AlbRUniUti ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV17Cant = (byte)(0) ;
      AV18Unidades = DecimalUtil.doubleToDec(0) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnpiezas.this.AV15EmprCod;
      this.aP1[0] = pnpiezas.this.AV16DisCod;
      this.aP2[0] = pnpiezas.this.AV20AlbCod;
      this.aP3[0] = pnpiezas.this.AV17Cant;
      this.aP4[0] = pnpiezas.this.AV18Unidades;
      this.aP5[0] = pnpiezas.this.AV19UniMed;
      this.aP6[0] = pnpiezas.this.AV21Peso;
      this.aP7[0] = pnpiezas.this.AV22PieUti;
      this.aP8[0] = pnpiezas.this.AV23UniUti;
      this.aP9[0] = pnpiezas.this.AV24DisColNom;
      this.aP10[0] = pnpiezas.this.AV25DisColNum;
      this.aP11[0] = pnpiezas.this.AV26Flag1;
      this.aP12[0] = pnpiezas.this.AV46Anc1;
      this.aP13[0] = pnpiezas.this.AV47Anc2;
      this.aP14[0] = pnpiezas.this.AV48Dispiepda;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnpiezas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P03WM2_A361DisCod = new int[1] ;
      P03WM2_A396EmprCod = new String[] {""} ;
      P03WM2_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      AV37Rdto = DecimalUtil.ZERO ;
      AV35Kilos = DecimalUtil.ZERO ;
      AV36Metros = DecimalUtil.ZERO ;
      AV50Nrecp6a = "" ;
      AV41TotUnid = DecimalUtil.ZERO ;
      AV45TotUnidK = DecimalUtil.ZERO ;
      AV52NpA = "" ;
      AV53Npza = "" ;
      A380DisPieCod = "" ;
      A384DisPieMet = DecimalUtil.ZERO ;
      AV33DisPieKil = DecimalUtil.ZERO ;
      AV34DisPieMet = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      AV43DisPieCod = "" ;
      A9983DisPiePda = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new long[1] ;
      GXv_int2 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      P03WM4_A44AlbRecCod = new int[1] ;
      P03WM4_A396EmprCod = new String[] {""} ;
      P03WM4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03WM4_A54AlbRPieUti = new int[1] ;
      P03WM4_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      P03WM6_A44AlbRecCod = new int[1] ;
      P03WM6_A396EmprCod = new String[] {""} ;
      P03WM6_A54AlbRPieUti = new int[1] ;
      P03WM6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnpiezas__default(),
         new Object[] {
             new Object[] {
            P03WM2_A361DisCod, P03WM2_A396EmprCod, P03WM2_A350DisArtRdt
            }
            , new Object[] {
            }
            , new Object[] {
            P03WM4_A44AlbRecCod, P03WM4_A396EmprCod, P03WM4_A60AlbRUniUti, P03WM4_A54AlbRPieUti, P03WM4_A48AlbRFecUlt
            }
            , new Object[] {
            }
            , new Object[] {
            P03WM6_A44AlbRecCod, P03WM6_A396EmprCod, P03WM6_A54AlbRPieUti, P03WM6_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Cant ;
   private byte AV26Flag1 ;
   private byte AV38Flag_MRdo ;
   private byte AV39Hidro ;
   private byte AV54Np1 ;
   private byte GXv_int1[] ;
   private byte AV29Piezas ;
   private byte AV30Cont ;
   private byte A5099DisPieEst ;
   private short AV21Peso ;
   private short AV46Anc1 ;
   private short AV47Anc2 ;
   private short AV51Np ;
   private short A2185DisPieAnc ;
   private short A9845DisPieAncc ;
   private short Gx_err ;
   private int AV16DisCod ;
   private int AV20AlbCod ;
   private int AV22PieUti ;
   private int AV25DisColNum ;
   private int A361DisCod ;
   private int AV49Nrecp6 ;
   private int AV28ConVal ;
   private int GX_INS36 ;
   private int A44AlbRecCod ;
   private int GXv_int2[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private int GXv_int13[] ;
   private int A54AlbRPieUti ;
   private long GXv_int4[] ;
   private java.math.BigDecimal AV18Unidades ;
   private java.math.BigDecimal AV23UniUti ;
   private java.math.BigDecimal AV48Dispiepda ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal AV37Rdto ;
   private java.math.BigDecimal AV35Kilos ;
   private java.math.BigDecimal AV36Metros ;
   private java.math.BigDecimal AV41TotUnid ;
   private java.math.BigDecimal AV45TotUnidK ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal AV33DisPieKil ;
   private java.math.BigDecimal AV34DisPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A9983DisPiePda ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String AV15EmprCod ;
   private String AV19UniMed ;
   private String AV24DisColNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV50Nrecp6a ;
   private String AV52NpA ;
   private String AV53Npza ;
   private String A380DisPieCod ;
   private String AV43DisPieCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean n9845DisPieAncc ;
   private boolean n9983DisPiePda ;
   private java.math.BigDecimal[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private byte[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private IDataStoreProvider pr_default ;
   private int[] P03WM2_A361DisCod ;
   private String[] P03WM2_A396EmprCod ;
   private java.math.BigDecimal[] P03WM2_A350DisArtRdt ;
   private int[] P03WM4_A44AlbRecCod ;
   private String[] P03WM4_A396EmprCod ;
   private java.math.BigDecimal[] P03WM4_A60AlbRUniUti ;
   private int[] P03WM4_A54AlbRPieUti ;
   private java.util.Date[] P03WM4_A48AlbRFecUlt ;
   private int[] P03WM6_A44AlbRecCod ;
   private String[] P03WM6_A396EmprCod ;
   private int[] P03WM6_A54AlbRPieUti ;
   private java.math.BigDecimal[] P03WM6_A60AlbRUniUti ;
}

final  class pnpiezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WM2", "SELECT DisCod, EmprCod, DisArtRdt FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03WM3", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieAnc, DisPieEst, DisPieAncc, DisPiePda, DisPieLoc, DisPieIdPz, DisPieCodB) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P03WM4", "SELECT AlbRecCod, EmprCod, AlbRUniUti, AlbRPieUti, AlbRFecUlt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03WM5", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbRFecUlt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P03WM6", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRUniUti FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

