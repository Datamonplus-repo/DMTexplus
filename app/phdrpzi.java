package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrpzi extends GXProcedure
{
   public phdrpzi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrpzi.class ), "" );
   }

   public phdrpzi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          short[] aP6 ,
                          byte[] aP7 ,
                          short[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          String[] aP10 ,
                          java.math.BigDecimal[] aP11 ,
                          java.math.BigDecimal[] aP12 ,
                          int[] aP13 ,
                          String[] aP14 ,
                          String[] aP15 ,
                          String[] aP16 ,
                          String[] aP17 ,
                          String[] aP18 ,
                          byte[] aP19 ,
                          java.math.BigDecimal[] aP20 ,
                          java.math.BigDecimal[] aP21 )
   {
      phdrpzi.this.aP22 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        int[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        byte[] aP19 ,
                        java.math.BigDecimal[] aP20 ,
                        java.math.BigDecimal[] aP21 ,
                        int[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             byte[] aP19 ,
                             java.math.BigDecimal[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             int[] aP22 )
   {
      phdrpzi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrpzi.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdrpzi.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrpzi.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrpzi.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      phdrpzi.this.AV8BarPieMet = aP5[0];
      this.aP5 = aP5;
      phdrpzi.this.AV11BarTrocod = aP6[0];
      this.aP6 = aP6;
      phdrpzi.this.AV12BarTrocal = aP7[0];
      this.aP7 = aP7;
      phdrpzi.this.AV13BARPIEANC = aP8[0];
      this.aP8 = aP8;
      phdrpzi.this.AV15BarPiekil = aP9[0];
      this.aP9 = aP9;
      phdrpzi.this.AV16Bapieobs = aP10[0];
      this.aP10 = aP10;
      phdrpzi.this.AV18Bartrokil = aP11[0];
      this.aP11 = aP11;
      phdrpzi.this.AV19Bartromet = aP12[0];
      this.aP12 = aP12;
      phdrpzi.this.AV21BarPieOrd = aP13[0];
      this.aP13 = aP13;
      phdrpzi.this.AV25BarPieloc = aP14[0];
      this.aP14 = aP14;
      phdrpzi.this.AV27BarPieTono = aP15[0];
      this.aP15 = aP15;
      phdrpzi.this.AV28BarPieSecu = aP16[0];
      this.aP16 = aP16;
      phdrpzi.this.AV29BarPieST = aP17[0];
      this.aP17 = aP17;
      phdrpzi.this.AV30BarPieLote = aP18[0];
      this.aP18 = aP18;
      phdrpzi.this.AV31BarPiedest = aP19[0];
      this.aP19 = aP19;
      phdrpzi.this.AV32tiraskgs = aP20[0];
      this.aP20 = aP20;
      phdrpzi.this.AV33retazoskgs = aP21[0];
      this.aP21 = aP21;
      phdrpzi.this.AV34BarPieCliID = aP22[0];
      this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17EST000 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EST000", ""), GXv_int2) ;
      phdrpzi.this.GXt_int1 = GXv_int2[0] ;
      AV17EST000 = GXt_int1 ;
      GXt_int1 = AV20Fatelca ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FATELC", ""), GXv_int2) ;
      phdrpzi.this.GXt_int1 = GXv_int2[0] ;
      AV20Fatelca = GXt_int1 ;
      GXt_int1 = AV26stamperia ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int2) ;
      phdrpzi.this.GXt_int1 = GXv_int2[0] ;
      AV26stamperia = GXt_int1 ;
      AV22UsurCod = " " ;
      AV23Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV24EmprNom ;
      GXv_char5[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char3, GXv_char4, GXv_char5) ;
      phdrpzi.this.A396EmprCod = GXv_char3[0] ;
      phdrpzi.this.AV24EmprNom = GXv_char4[0] ;
      phdrpzi.this.AV22UsurCod = GXv_char5[0] ;
      /* Using cursor P029K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6116BarPieImp = P029K2_A6116BarPieImp[0] ;
         n6116BarPieImp = P029K2_n6116BarPieImp[0] ;
         A205BarPieMet = P029K2_A205BarPieMet[0] ;
         A3275BarKgsAut = P029K2_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P029K2_n3275BarKgsAut[0] ;
         A3276BarMtsAut = P029K2_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P029K2_n3276BarMtsAut[0] ;
         A1691BarPieAnc = P029K2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P029K2_n1691BarPieAnc[0] ;
         A201BarPieEst = P029K2_A201BarPieEst[0] ;
         A170BarKilLan = P029K2_A170BarKilLan[0] ;
         A183BarMetLan = P029K2_A183BarMetLan[0] ;
         A8707BapieObs = P029K2_A8707BapieObs[0] ;
         n8707BapieObs = P029K2_n8707BapieObs[0] ;
         A1919BarPieObs = P029K2_A1919BarPieObs[0] ;
         n1919BarPieObs = P029K2_n1919BarPieObs[0] ;
         A1642BarPieOrd = P029K2_A1642BarPieOrd[0] ;
         n1642BarPieOrd = P029K2_n1642BarPieOrd[0] ;
         A12779BarPieFdv = P029K2_A12779BarPieFdv[0] ;
         n12779BarPieFdv = P029K2_n12779BarPieFdv[0] ;
         A12780BarPieUsu = P029K2_A12780BarPieUsu[0] ;
         n12780BarPieUsu = P029K2_n12780BarPieUsu[0] ;
         A2186BarPieLoc = P029K2_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P029K2_n2186BarPieLoc[0] ;
         A12935BarPieTono = P029K2_A12935BarPieTono[0] ;
         n12935BarPieTono = P029K2_n12935BarPieTono[0] ;
         A12936BarPieSecu = P029K2_A12936BarPieSecu[0] ;
         n12936BarPieSecu = P029K2_n12936BarPieSecu[0] ;
         A13108BarPieLote = P029K2_A13108BarPieLote[0] ;
         n13108BarPieLote = P029K2_n13108BarPieLote[0] ;
         A13109BarPieST = P029K2_A13109BarPieST[0] ;
         n13109BarPieST = P029K2_n13109BarPieST[0] ;
         A13004BarPieDest = P029K2_A13004BarPieDest[0] ;
         n13004BarPieDest = P029K2_n13004BarPieDest[0] ;
         A9984BarPiePda = P029K2_A9984BarPiePda[0] ;
         n9984BarPiePda = P029K2_n9984BarPiePda[0] ;
         A6472BarTara = P029K2_A6472BarTara[0] ;
         n6472BarTara = P029K2_n6472BarTara[0] ;
         A12924BarPieCliI = P029K2_A12924BarPieCliI[0] ;
         n12924BarPieCliI = P029K2_n12924BarPieCliI[0] ;
         A6116BarPieImp = httpContext.getMessage( "S", "") ;
         n6116BarPieImp = false ;
         if ( ( AV20Fatelca == 0 ) && ( AV17EST000 == 0 ) )
         {
            A205BarPieMet = AV8BarPieMet ;
         }
         A3275BarKgsAut = AV15BarPiekil ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = AV8BarPieMet ;
         n3276BarMtsAut = false ;
         AV10BarPieCod = A200BarPieCod ;
         A1691BarPieAnc = AV13BARPIEANC ;
         n1691BarPieAnc = false ;
         if ( AV17EST000 == 0 )
         {
            A201BarPieEst = (byte)(1) ;
            A170BarKilLan = AV15BarPiekil ;
            A183BarMetLan = AV8BarPieMet ;
            A8707BapieObs = AV16Bapieobs ;
            n8707BapieObs = false ;
         }
         else
         {
            A1919BarPieObs = AV16Bapieobs ;
            n1919BarPieObs = false ;
         }
         A1642BarPieOrd = AV21BarPieOrd ;
         n1642BarPieOrd = false ;
         A12779BarPieFdv = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12779BarPieFdv)) ? GXutil.today( ) : A12779BarPieFdv) ;
         n12779BarPieFdv = false ;
         A12780BarPieUsu = AV22UsurCod ;
         n12780BarPieUsu = false ;
         A2186BarPieLoc = ((AV26stamperia==0) ? A2186BarPieLoc : AV25BarPieloc) ;
         n2186BarPieLoc = false ;
         A12935BarPieTono = AV27BarPieTono ;
         n12935BarPieTono = false ;
         A12936BarPieSecu = AV28BarPieSecu ;
         n12936BarPieSecu = false ;
         A13108BarPieLote = AV30BarPieLote ;
         n13108BarPieLote = false ;
         A13109BarPieST = AV29BarPieST ;
         n13109BarPieST = false ;
         A13004BarPieDest = AV31BarPiedest ;
         n13004BarPieDest = false ;
         A9984BarPiePda = AV32tiraskgs ;
         n9984BarPiePda = false ;
         A6472BarTara = AV33retazoskgs ;
         n6472BarTara = false ;
         /* Using cursor P029K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(AV11BarTrocod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3858BarTroCod = P029K3_A3858BarTroCod[0] ;
            A4990BarTroCal = P029K3_A4990BarTroCal[0] ;
            n4990BarTroCal = P029K3_n4990BarTroCal[0] ;
            A6556BarTroKil = P029K3_A6556BarTroKil[0] ;
            n6556BarTroKil = P029K3_n6556BarTroKil[0] ;
            A3860BarTroMet = P029K3_A3860BarTroMet[0] ;
            n3860BarTroMet = P029K3_n3860BarTroMet[0] ;
            A4990BarTroCal = AV12BarTrocal ;
            n4990BarTroCal = false ;
            if ( AV20Fatelca == 1 )
            {
               A6556BarTroKil = AV18Bartrokil ;
               n6556BarTroKil = false ;
               A3860BarTroMet = AV19Bartromet ;
               n3860BarTroMet = false ;
            }
            /* Using cursor P029K4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n4990BarTroCal), Byte.valueOf(A4990BarTroCal), Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         A12924BarPieCliI = AV34BarPieCliID ;
         n12924BarPieCliI = false ;
         /* Using cursor P029K5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, A205BarPieMet, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrpzi.this.A396EmprCod;
      this.aP1[0] = phdrpzi.this.A129BarCod;
      this.aP2[0] = phdrpzi.this.A132BarCodReo;
      this.aP3[0] = phdrpzi.this.A130BarCodPar;
      this.aP4[0] = phdrpzi.this.A200BarPieCod;
      this.aP5[0] = phdrpzi.this.AV8BarPieMet;
      this.aP6[0] = phdrpzi.this.AV11BarTrocod;
      this.aP7[0] = phdrpzi.this.AV12BarTrocal;
      this.aP8[0] = phdrpzi.this.AV13BARPIEANC;
      this.aP9[0] = phdrpzi.this.AV15BarPiekil;
      this.aP10[0] = phdrpzi.this.AV16Bapieobs;
      this.aP11[0] = phdrpzi.this.AV18Bartrokil;
      this.aP12[0] = phdrpzi.this.AV19Bartromet;
      this.aP13[0] = phdrpzi.this.AV21BarPieOrd;
      this.aP14[0] = phdrpzi.this.AV25BarPieloc;
      this.aP15[0] = phdrpzi.this.AV27BarPieTono;
      this.aP16[0] = phdrpzi.this.AV28BarPieSecu;
      this.aP17[0] = phdrpzi.this.AV29BarPieST;
      this.aP18[0] = phdrpzi.this.AV30BarPieLote;
      this.aP19[0] = phdrpzi.this.AV31BarPiedest;
      this.aP20[0] = phdrpzi.this.AV32tiraskgs;
      this.aP21[0] = phdrpzi.this.AV33retazoskgs;
      this.aP22[0] = phdrpzi.this.AV34BarPieCliID;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrpzi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV22UsurCod = "" ;
      AV23Station = "" ;
      GXv_char3 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P029K2_A396EmprCod = new String[] {""} ;
      P029K2_A129BarCod = new int[1] ;
      P029K2_A132BarCodReo = new byte[1] ;
      P029K2_A130BarCodPar = new String[] {""} ;
      P029K2_A200BarPieCod = new String[] {""} ;
      P029K2_A6116BarPieImp = new String[] {""} ;
      P029K2_n6116BarPieImp = new boolean[] {false} ;
      P029K2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_n3275BarKgsAut = new boolean[] {false} ;
      P029K2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_n3276BarMtsAut = new boolean[] {false} ;
      P029K2_A1691BarPieAnc = new short[1] ;
      P029K2_n1691BarPieAnc = new boolean[] {false} ;
      P029K2_A201BarPieEst = new byte[1] ;
      P029K2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_A8707BapieObs = new String[] {""} ;
      P029K2_n8707BapieObs = new boolean[] {false} ;
      P029K2_A1919BarPieObs = new String[] {""} ;
      P029K2_n1919BarPieObs = new boolean[] {false} ;
      P029K2_A1642BarPieOrd = new int[1] ;
      P029K2_n1642BarPieOrd = new boolean[] {false} ;
      P029K2_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P029K2_n12779BarPieFdv = new boolean[] {false} ;
      P029K2_A12780BarPieUsu = new String[] {""} ;
      P029K2_n12780BarPieUsu = new boolean[] {false} ;
      P029K2_A2186BarPieLoc = new String[] {""} ;
      P029K2_n2186BarPieLoc = new boolean[] {false} ;
      P029K2_A12935BarPieTono = new String[] {""} ;
      P029K2_n12935BarPieTono = new boolean[] {false} ;
      P029K2_A12936BarPieSecu = new String[] {""} ;
      P029K2_n12936BarPieSecu = new boolean[] {false} ;
      P029K2_A13108BarPieLote = new String[] {""} ;
      P029K2_n13108BarPieLote = new boolean[] {false} ;
      P029K2_A13109BarPieST = new String[] {""} ;
      P029K2_n13109BarPieST = new boolean[] {false} ;
      P029K2_A13004BarPieDest = new byte[1] ;
      P029K2_n13004BarPieDest = new boolean[] {false} ;
      P029K2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_n9984BarPiePda = new boolean[] {false} ;
      P029K2_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K2_n6472BarTara = new boolean[] {false} ;
      P029K2_A12924BarPieCliI = new int[1] ;
      P029K2_n12924BarPieCliI = new boolean[] {false} ;
      A6116BarPieImp = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A8707BapieObs = "" ;
      A1919BarPieObs = "" ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A12780BarPieUsu = "" ;
      A2186BarPieLoc = "" ;
      A12935BarPieTono = "" ;
      A12936BarPieSecu = "" ;
      A13108BarPieLote = "" ;
      A13109BarPieST = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A6472BarTara = DecimalUtil.ZERO ;
      AV10BarPieCod = "" ;
      P029K3_A396EmprCod = new String[] {""} ;
      P029K3_A129BarCod = new int[1] ;
      P029K3_A132BarCodReo = new byte[1] ;
      P029K3_A130BarCodPar = new String[] {""} ;
      P029K3_A200BarPieCod = new String[] {""} ;
      P029K3_A3858BarTroCod = new short[1] ;
      P029K3_A4990BarTroCal = new byte[1] ;
      P029K3_n4990BarTroCal = new boolean[] {false} ;
      P029K3_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K3_n6556BarTroKil = new boolean[] {false} ;
      P029K3_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029K3_n3860BarTroMet = new boolean[] {false} ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrpzi__default(),
         new Object[] {
             new Object[] {
            P029K2_A396EmprCod, P029K2_A129BarCod, P029K2_A132BarCodReo, P029K2_A130BarCodPar, P029K2_A200BarPieCod, P029K2_A6116BarPieImp, P029K2_n6116BarPieImp, P029K2_A205BarPieMet, P029K2_A3275BarKgsAut, P029K2_n3275BarKgsAut,
            P029K2_A3276BarMtsAut, P029K2_n3276BarMtsAut, P029K2_A1691BarPieAnc, P029K2_n1691BarPieAnc, P029K2_A201BarPieEst, P029K2_A170BarKilLan, P029K2_A183BarMetLan, P029K2_A8707BapieObs, P029K2_n8707BapieObs, P029K2_A1919BarPieObs,
            P029K2_n1919BarPieObs, P029K2_A1642BarPieOrd, P029K2_n1642BarPieOrd, P029K2_A12779BarPieFdv, P029K2_n12779BarPieFdv, P029K2_A12780BarPieUsu, P029K2_n12780BarPieUsu, P029K2_A2186BarPieLoc, P029K2_n2186BarPieLoc, P029K2_A12935BarPieTono,
            P029K2_n12935BarPieTono, P029K2_A12936BarPieSecu, P029K2_n12936BarPieSecu, P029K2_A13108BarPieLote, P029K2_n13108BarPieLote, P029K2_A13109BarPieST, P029K2_n13109BarPieST, P029K2_A13004BarPieDest, P029K2_n13004BarPieDest, P029K2_A9984BarPiePda,
            P029K2_n9984BarPiePda, P029K2_A6472BarTara, P029K2_n6472BarTara, P029K2_A12924BarPieCliI, P029K2_n12924BarPieCliI
            }
            , new Object[] {
            P029K3_A396EmprCod, P029K3_A129BarCod, P029K3_A132BarCodReo, P029K3_A130BarCodPar, P029K3_A200BarPieCod, P029K3_A3858BarTroCod, P029K3_A4990BarTroCal, P029K3_n4990BarTroCal, P029K3_A6556BarTroKil, P029K3_n6556BarTroKil,
            P029K3_A3860BarTroMet, P029K3_n3860BarTroMet
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
   private byte AV12BarTrocal ;
   private byte AV31BarPiedest ;
   private byte AV17EST000 ;
   private byte AV20Fatelca ;
   private byte AV26stamperia ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A201BarPieEst ;
   private byte A13004BarPieDest ;
   private byte A4990BarTroCal ;
   private short AV11BarTrocod ;
   private short AV13BARPIEANC ;
   private short A1691BarPieAnc ;
   private short A3858BarTroCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21BarPieOrd ;
   private int AV34BarPieCliID ;
   private int A1642BarPieOrd ;
   private int A12924BarPieCliI ;
   private java.math.BigDecimal AV8BarPieMet ;
   private java.math.BigDecimal AV15BarPiekil ;
   private java.math.BigDecimal AV18Bartrokil ;
   private java.math.BigDecimal AV19Bartromet ;
   private java.math.BigDecimal AV32tiraskgs ;
   private java.math.BigDecimal AV33retazoskgs ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal A3860BarTroMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV16Bapieobs ;
   private String AV25BarPieloc ;
   private String AV27BarPieTono ;
   private String AV28BarPieSecu ;
   private String AV29BarPieST ;
   private String AV30BarPieLote ;
   private String AV22UsurCod ;
   private String AV23Station ;
   private String GXv_char3[] ;
   private String AV24EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A6116BarPieImp ;
   private String A8707BapieObs ;
   private String A1919BarPieObs ;
   private String A12780BarPieUsu ;
   private String A2186BarPieLoc ;
   private String A12935BarPieTono ;
   private String A12936BarPieSecu ;
   private String A13108BarPieLote ;
   private String A13109BarPieST ;
   private String AV10BarPieCod ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n6116BarPieImp ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n1691BarPieAnc ;
   private boolean n8707BapieObs ;
   private boolean n1919BarPieObs ;
   private boolean n1642BarPieOrd ;
   private boolean n12779BarPieFdv ;
   private boolean n12780BarPieUsu ;
   private boolean n2186BarPieLoc ;
   private boolean n12935BarPieTono ;
   private boolean n12936BarPieSecu ;
   private boolean n13108BarPieLote ;
   private boolean n13109BarPieST ;
   private boolean n13004BarPieDest ;
   private boolean n9984BarPiePda ;
   private boolean n6472BarTara ;
   private boolean n12924BarPieCliI ;
   private boolean n4990BarTroCal ;
   private boolean n6556BarTroKil ;
   private boolean n3860BarTroMet ;
   private int[] aP22 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private int[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private byte[] aP19 ;
   private java.math.BigDecimal[] aP20 ;
   private java.math.BigDecimal[] aP21 ;
   private IDataStoreProvider pr_default ;
   private String[] P029K2_A396EmprCod ;
   private int[] P029K2_A129BarCod ;
   private byte[] P029K2_A132BarCodReo ;
   private String[] P029K2_A130BarCodPar ;
   private String[] P029K2_A200BarPieCod ;
   private String[] P029K2_A6116BarPieImp ;
   private boolean[] P029K2_n6116BarPieImp ;
   private java.math.BigDecimal[] P029K2_A205BarPieMet ;
   private java.math.BigDecimal[] P029K2_A3275BarKgsAut ;
   private boolean[] P029K2_n3275BarKgsAut ;
   private java.math.BigDecimal[] P029K2_A3276BarMtsAut ;
   private boolean[] P029K2_n3276BarMtsAut ;
   private short[] P029K2_A1691BarPieAnc ;
   private boolean[] P029K2_n1691BarPieAnc ;
   private byte[] P029K2_A201BarPieEst ;
   private java.math.BigDecimal[] P029K2_A170BarKilLan ;
   private java.math.BigDecimal[] P029K2_A183BarMetLan ;
   private String[] P029K2_A8707BapieObs ;
   private boolean[] P029K2_n8707BapieObs ;
   private String[] P029K2_A1919BarPieObs ;
   private boolean[] P029K2_n1919BarPieObs ;
   private int[] P029K2_A1642BarPieOrd ;
   private boolean[] P029K2_n1642BarPieOrd ;
   private java.util.Date[] P029K2_A12779BarPieFdv ;
   private boolean[] P029K2_n12779BarPieFdv ;
   private String[] P029K2_A12780BarPieUsu ;
   private boolean[] P029K2_n12780BarPieUsu ;
   private String[] P029K2_A2186BarPieLoc ;
   private boolean[] P029K2_n2186BarPieLoc ;
   private String[] P029K2_A12935BarPieTono ;
   private boolean[] P029K2_n12935BarPieTono ;
   private String[] P029K2_A12936BarPieSecu ;
   private boolean[] P029K2_n12936BarPieSecu ;
   private String[] P029K2_A13108BarPieLote ;
   private boolean[] P029K2_n13108BarPieLote ;
   private String[] P029K2_A13109BarPieST ;
   private boolean[] P029K2_n13109BarPieST ;
   private byte[] P029K2_A13004BarPieDest ;
   private boolean[] P029K2_n13004BarPieDest ;
   private java.math.BigDecimal[] P029K2_A9984BarPiePda ;
   private boolean[] P029K2_n9984BarPiePda ;
   private java.math.BigDecimal[] P029K2_A6472BarTara ;
   private boolean[] P029K2_n6472BarTara ;
   private int[] P029K2_A12924BarPieCliI ;
   private boolean[] P029K2_n12924BarPieCliI ;
   private String[] P029K3_A396EmprCod ;
   private int[] P029K3_A129BarCod ;
   private byte[] P029K3_A132BarCodReo ;
   private String[] P029K3_A130BarCodPar ;
   private String[] P029K3_A200BarPieCod ;
   private short[] P029K3_A3858BarTroCod ;
   private byte[] P029K3_A4990BarTroCal ;
   private boolean[] P029K3_n4990BarTroCal ;
   private java.math.BigDecimal[] P029K3_A6556BarTroKil ;
   private boolean[] P029K3_n6556BarTroKil ;
   private java.math.BigDecimal[] P029K3_A3860BarTroMet ;
   private boolean[] P029K3_n3860BarTroMet ;
}

final  class phdrpzi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029K2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieImp, BarPieMet, BarKgsAut, BarMtsAut, BarPieAnc, BarPieEst, BarKilLan, BarMetLan, BapieObs, BarPieObs, BarPieOrd, BarPieFdv, BarPieUsu, BarPieLoc, BarPieTono, BarPieSecu, BarPieLote, BarPieST, BarPieDest, BarPiePda, BarTara, BarPieCliI FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029K3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroCal, BarTroKil, BarTroMet FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P029K4", "UPDATE TXPBARTRO SET BarTroCal=?, BarTroKil=?, BarTroMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
         ,new UpdateCursor("P029K5", "UPDATE TXPBARPIE SET BarPieImp=?, BarPieMet=?, BarKgsAut=?, BarMtsAut=?, BarPieAnc=?, BarPieEst=?, BarKilLan=?, BarMetLan=?, BapieObs=?, BarPieObs=?, BarPieOrd=?, BarPieFdv=?, BarPieUsu=?, BarPieLoc=?, BarPieTono=?, BarPieSecu=?, BarPieLote=?, BarPieST=?, BarPieDest=?, BarPiePda=?, BarTara=?, BarPieCliI=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 60);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(24);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(27);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 60);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 10);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 20);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[39]).intValue());
               }
               stmt.setString(23, (String)parms[40], 3);
               stmt.setInt(24, ((Number) parms[41]).intValue());
               stmt.setByte(25, ((Number) parms[42]).byteValue());
               stmt.setString(26, (String)parms[43], 1);
               stmt.setString(27, (String)parms[44], 9);
               return;
      }
   }

}

