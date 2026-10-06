package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltpin extends GXProcedure
{
   public paltpin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltpin.class ), "" );
   }

   public paltpin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          java.math.BigDecimal[] aP6 ,
                          java.math.BigDecimal[] aP7 )
   {
      paltpin.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 )
   {
      paltpin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltpin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      paltpin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      paltpin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      paltpin.this.AV15AlbRecCod = aP4[0];
      this.aP4 = aP4;
      paltpin.this.AV16BarPieCod = aP5[0];
      this.aP5 = aP5;
      paltpin.this.AV17BarPieKil = aP6[0];
      this.aP6 = aP6;
      paltpin.this.AV18BarPieMet = aP7[0];
      this.aP7 = aP7;
      paltpin.this.AV19BarPiePie = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      paltpin.this.AV21Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV22Erfoc ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int1) ;
      paltpin.this.AV22Erfoc = GXv_int1[0] ;
      GXv_int1[0] = AV23Tejido ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int1) ;
      paltpin.this.AV23Tejido = GXv_int1[0] ;
      GXt_int2 = (byte)(AV24moda21) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      paltpin.this.GXt_int2 = GXv_int1[0] ;
      AV24moda21 = GXt_int2 ;
      if ( AV21Flag1 == 1 )
      {
         AV20ExisR = (byte)(0) ;
         /* Using cursor P00A92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P00A92_A361DisCod[0] ;
            /* Using cursor P00A93 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbRecCod), Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2160HisEmpAlbD = P00A93_A2160HisEmpAlbD[0] ;
               n2160HisEmpAlbD = P00A93_n2160HisEmpAlbD[0] ;
               A2166HisEmpLTip = P00A93_A2166HisEmpLTip[0] ;
               n2166HisEmpLTip = P00A93_n2166HisEmpLTip[0] ;
               A44AlbRecCod = P00A93_A44AlbRecCod[0] ;
               A2165HisEmpLin = P00A93_A2165HisEmpLin[0] ;
               if ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
               {
                  AV20ExisR = (byte)(1) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P00A94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P00A94_A361DisCod[0] ;
         A228BarUniMed = P00A94_A228BarUniMed[0] ;
         A135BarColNom = P00A94_A135BarColNom[0] ;
         A136BarColNum = P00A94_A136BarColNum[0] ;
         A5253BarAcc = P00A94_A5253BarAcc[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A361DisCod ;
         GXv_int5[0] = AV15AlbRecCod ;
         GXv_char6[0] = AV16BarPieCod ;
         GXv_decimal7[0] = AV17BarPieKil ;
         GXv_decimal8[0] = AV18BarPieMet ;
         GXv_int9[0] = AV19BarPiePie ;
         GXv_char10[0] = httpContext.getMessage( "N", "") ;
         GXv_char11[0] = A228BarUniMed ;
         new app.paltpdi(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_char11) ;
         paltpin.this.A396EmprCod = GXv_char3[0] ;
         paltpin.this.A361DisCod = GXv_int4[0] ;
         paltpin.this.AV15AlbRecCod = GXv_int5[0] ;
         paltpin.this.AV16BarPieCod = GXv_char6[0] ;
         paltpin.this.AV17BarPieKil = GXv_decimal7[0] ;
         paltpin.this.AV18BarPieMet = GXv_decimal8[0] ;
         paltpin.this.AV19BarPiePie = GXv_int9[0] ;
         paltpin.this.A228BarUniMed = GXv_char11[0] ;
         if ( AV21Flag1 == 1 )
         {
            if ( AV20ExisR == 1 )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int12[0] = A361DisCod ;
               GXv_int9[0] = AV15AlbRecCod ;
               GXv_decimal8[0] = AV17BarPieKil ;
               GXv_decimal7[0] = AV18BarPieMet ;
               GXv_int5[0] = 1 ;
               GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int4[0] = 0 ;
               GXv_char10[0] = httpContext.getMessage( "B", "") ;
               GXv_char6[0] = A135BarColNom ;
               GXv_int15[0] = A136BarColNum ;
               GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
               GXv_char16[0] = "" ;
               new app.pmodhis(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int9, GXv_decimal8, GXv_decimal7, GXv_int5, GXv_decimal13, GXv_decimal14, GXv_int4, GXv_char10, GXv_char6, GXv_int15, GXv_char3, GXv_char16) ;
               paltpin.this.A396EmprCod = GXv_char11[0] ;
               paltpin.this.A361DisCod = (int)((int)(GXv_int12[0])) ;
               paltpin.this.AV15AlbRecCod = GXv_int9[0] ;
               paltpin.this.AV17BarPieKil = GXv_decimal8[0] ;
               paltpin.this.AV18BarPieMet = GXv_decimal7[0] ;
               paltpin.this.A135BarColNom = GXv_char6[0] ;
               paltpin.this.A136BarColNum = GXv_int15[0] ;
            }
            else
            {
               GXv_char16[0] = A396EmprCod ;
               GXv_int12[0] = A361DisCod ;
               GXv_int15[0] = AV15AlbRecCod ;
               GXv_decimal14[0] = AV17BarPieKil ;
               GXv_decimal13[0] = AV18BarPieMet ;
               GXv_int9[0] = 1 ;
               GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int5[0] = 0 ;
               GXv_char11[0] = httpContext.getMessage( "B", "") ;
               GXv_char10[0] = A135BarColNom ;
               GXv_int4[0] = A136BarColNum ;
               GXv_char6[0] = httpContext.getMessage( "INS", "") ;
               GXv_char3[0] = "" ;
               new app.pmodhis(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int15, GXv_decimal14, GXv_decimal13, GXv_int9, GXv_decimal8, GXv_decimal7, GXv_int5, GXv_char11, GXv_char10, GXv_int4, GXv_char6, GXv_char3) ;
               paltpin.this.A396EmprCod = GXv_char16[0] ;
               paltpin.this.A361DisCod = (int)((int)(GXv_int12[0])) ;
               paltpin.this.AV15AlbRecCod = GXv_int15[0] ;
               paltpin.this.AV17BarPieKil = GXv_decimal14[0] ;
               paltpin.this.AV18BarPieMet = GXv_decimal13[0] ;
               paltpin.this.A135BarColNom = GXv_char10[0] ;
               paltpin.this.A136BarColNum = GXv_int4[0] ;
            }
         }
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         A200BarPieCod = AV16BarPieCod ;
         A44AlbRecCod = AV15AlbRecCod ;
         A203BarPieKil = AV17BarPieKil ;
         A205BarPieMet = AV18BarPieMet ;
         A1501BarPiePie = AV19BarPiePie ;
         A201BarPieEst = (byte)(0) ;
         /* Using cursor P00A95 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(3) == 1) )
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
         if ( ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 ) && ( AV24moda21 == 0 ) )
         {
            A5253BarAcc = httpContext.getMessage( "N", "") ;
         }
         /* Using cursor P00A96 */
         pr_default.execute(4, new Object[] {A5253BarAcc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltpin.this.A396EmprCod;
      this.aP1[0] = paltpin.this.A129BarCod;
      this.aP2[0] = paltpin.this.A132BarCodReo;
      this.aP3[0] = paltpin.this.A130BarCodPar;
      this.aP4[0] = paltpin.this.AV15AlbRecCod;
      this.aP5[0] = paltpin.this.AV16BarPieCod;
      this.aP6[0] = paltpin.this.AV17BarPieKil;
      this.aP7[0] = paltpin.this.AV18BarPieMet;
      this.aP8[0] = paltpin.this.AV19BarPiePie;
      Application.commitDataStores(context, remoteHandle, pr_default, "paltpin");
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
      P00A92_A396EmprCod = new String[] {""} ;
      P00A92_A129BarCod = new int[1] ;
      P00A92_A132BarCodReo = new byte[1] ;
      P00A92_A130BarCodPar = new String[] {""} ;
      P00A92_A361DisCod = new int[1] ;
      P00A93_A396EmprCod = new String[] {""} ;
      P00A93_A2160HisEmpAlbD = new long[1] ;
      P00A93_n2160HisEmpAlbD = new boolean[] {false} ;
      P00A93_A2166HisEmpLTip = new String[] {""} ;
      P00A93_n2166HisEmpLTip = new boolean[] {false} ;
      P00A93_A44AlbRecCod = new int[1] ;
      P00A93_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      P00A94_A396EmprCod = new String[] {""} ;
      P00A94_A129BarCod = new int[1] ;
      P00A94_A132BarCodReo = new byte[1] ;
      P00A94_A130BarCodPar = new String[] {""} ;
      P00A94_A361DisCod = new int[1] ;
      P00A94_A228BarUniMed = new String[] {""} ;
      P00A94_A135BarColNom = new String[] {""} ;
      P00A94_A136BarColNum = new int[1] ;
      P00A94_A5253BarAcc = new String[] {""} ;
      A228BarUniMed = "" ;
      A135BarColNom = "" ;
      A5253BarAcc = "" ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new long[1] ;
      GXv_int15 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char3 = new String[1] ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltpin__default(),
         new Object[] {
             new Object[] {
            P00A92_A396EmprCod, P00A92_A129BarCod, P00A92_A132BarCodReo, P00A92_A130BarCodPar, P00A92_A361DisCod
            }
            , new Object[] {
            P00A93_A396EmprCod, P00A93_A2160HisEmpAlbD, P00A93_n2160HisEmpAlbD, P00A93_A2166HisEmpLTip, P00A93_n2166HisEmpLTip, P00A93_A44AlbRecCod, P00A93_A2165HisEmpLin
            }
            , new Object[] {
            P00A94_A396EmprCod, P00A94_A129BarCod, P00A94_A132BarCodReo, P00A94_A130BarCodPar, P00A94_A361DisCod, P00A94_A228BarUniMed, P00A94_A135BarColNom, P00A94_A136BarColNum, P00A94_A5253BarAcc
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV21Flag1 ;
   private byte AV22Erfoc ;
   private byte AV23Tejido ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte AV20ExisR ;
   private byte A201BarPieEst ;
   private short AV24moda21 ;
   private short A2165HisEmpLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV15AlbRecCod ;
   private int AV19BarPiePie ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A136BarColNum ;
   private int GXv_int15[] ;
   private int GXv_int9[] ;
   private int GXv_int5[] ;
   private int GXv_int4[] ;
   private int GX_INS18 ;
   private int A1501BarPiePie ;
   private long A2160HisEmpAlbD ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV17BarPieKil ;
   private java.math.BigDecimal AV18BarPieMet ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16BarPieCod ;
   private String scmdbuf ;
   private String A2166HisEmpLTip ;
   private String A228BarUniMed ;
   private String A135BarColNom ;
   private String A5253BarAcc ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String A200BarPieCod ;
   private String Gx_emsg ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A92_A396EmprCod ;
   private int[] P00A92_A129BarCod ;
   private byte[] P00A92_A132BarCodReo ;
   private String[] P00A92_A130BarCodPar ;
   private int[] P00A92_A361DisCod ;
   private String[] P00A93_A396EmprCod ;
   private long[] P00A93_A2160HisEmpAlbD ;
   private boolean[] P00A93_n2160HisEmpAlbD ;
   private String[] P00A93_A2166HisEmpLTip ;
   private boolean[] P00A93_n2166HisEmpLTip ;
   private int[] P00A93_A44AlbRecCod ;
   private short[] P00A93_A2165HisEmpLin ;
   private String[] P00A94_A396EmprCod ;
   private int[] P00A94_A129BarCod ;
   private byte[] P00A94_A132BarCodReo ;
   private String[] P00A94_A130BarCodPar ;
   private int[] P00A94_A361DisCod ;
   private String[] P00A94_A228BarUniMed ;
   private String[] P00A94_A135BarColNom ;
   private int[] P00A94_A136BarColNum ;
   private String[] P00A94_A5253BarAcc ;
}

final  class paltpin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00A92", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A93", "SELECT EmprCod, HisEmpAlbD, HisEmpLTip, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00A94", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarUniMed, BarColNom, BarColNum, BarAcc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A95", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00A96", "UPDATE TXPBARCAD SET BarAcc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

