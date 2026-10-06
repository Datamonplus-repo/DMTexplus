package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxpzhra extends GXProcedure
{
   public pvxpzhra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxpzhra.class ), "" );
   }

   public pvxpzhra( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String aP9 )
   {
      pvxpzhra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvxpzhra.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pvxpzhra.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvxpzhra.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pvxpzhra.this.AV8BarPieCod = aP4[0];
      this.aP4 = aP4;
      pvxpzhra.this.AV22BarPieIdPz = aP5[0];
      this.aP5 = aP5;
      pvxpzhra.this.AV9BarPieKil = aP6[0];
      this.aP6 = aP6;
      pvxpzhra.this.AV20BarPieMet = aP7[0];
      this.aP7 = aP7;
      pvxpzhra.this.AV24BarPieLoc = aP8[0];
      this.aP8 = aP8;
      pvxpzhra.this.AV30MovVX = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pvxpzhra.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      pvxpzhra.this.A396EmprCod = GXv_char2[0] ;
      pvxpzhra.this.AV11EmprNom = GXv_char3[0] ;
      pvxpzhra.this.AV14UsurCod = GXv_char4[0] ;
      GXt_int5 = AV21Martex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int6) ;
      pvxpzhra.this.GXt_int5 = GXv_int6[0] ;
      AV21Martex = GXt_int5 ;
      GXt_int5 = AV29Intexco ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      pvxpzhra.this.GXt_int5 = GXv_int6[0] ;
      AV29Intexco = GXt_int5 ;
      /* Using cursor P02KN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02KN2_A213BarSit[0] ;
         A361DisCod = P02KN2_A361DisCod[0] ;
         A120BarAgrEst = P02KN2_A120BarAgrEst[0] ;
         A228BarUniMed = P02KN2_A228BarUniMed[0] ;
         A211BarRdt = P02KN2_A211BarRdt[0] ;
         A864BarPes = P02KN2_A864BarPes[0] ;
         AV15DisCod = A361DisCod ;
         AV16BarAgrEst = A120BarAgrEst ;
         AV17BarUniMed = A228BarUniMed ;
         AV18BarRdt = A211BarRdt ;
         AV19BarPes = A864BarPes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPBARPIE

      */
      A200BarPieCod = AV8BarPieCod ;
      A44AlbRecCod = A129BarCod ;
      A2186BarPieLoc = AV24BarPieLoc ;
      n2186BarPieLoc = false ;
      A203BarPieKil = AV9BarPieKil ;
      A205BarPieMet = AV20BarPieMet ;
      A201BarPieEst = (byte)(0) ;
      A170BarKilLan = DecimalUtil.doubleToDec(0) ;
      A183BarMetLan = DecimalUtil.doubleToDec(0) ;
      A197BarPConTro = (short)(0) ;
      A908PieOriCod = "" ;
      A1271BarPieLzd = 0 ;
      A1501BarPiePie = 0 ;
      A1691BarPieAnc = (short)(0) ;
      n1691BarPieAnc = false ;
      A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
      n3275BarKgsAut = false ;
      A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
      n3276BarMtsAut = false ;
      A3277BarPieAut = (short)(0) ;
      n3277BarPieAut = false ;
      A6489BarPieIdPz = AV22BarPieIdPz ;
      n6489BarPieIdPz = false ;
      /* Using cursor P02KN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
      /*
         INSERT RECORD ON TABLE TXPALBDET

      */
      A44AlbRecCod = A129BarCod ;
      A2159AlbRecPie = AV8BarPieCod ;
      A4411AlbRecFec = GXutil.resetTime( GXutil.serverDate( context, remoteHandle, pr_default) );
      n4411AlbRecFec = false ;
      A2155AlbRecKgm = AV9BarPieKil ;
      A2156AlbRecKgmU = AV9BarPieKil ;
      A2157AlbRecMtr = AV20BarPieMet ;
      A2158AlbRecMtrU = AV20BarPieMet ;
      /* Using cursor P02KN4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, Boolean.valueOf(n4411AlbRecFec), A4411AlbRecFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
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
      /*
         INSERT RECORD ON TABLE TXPDISALD

      */
      A361DisCod = AV15DisCod ;
      A44AlbRecCod = AV15DisCod ;
      A380DisPieCod = AV8BarPieCod ;
      A382DisPieKil = AV9BarPieKil ;
      A384DisPieMet = AV20BarPieMet ;
      A2184DisPieLoc = "" ;
      A2185DisPieAnc = (short)(0) ;
      A5099DisPieEst = (byte)(0) ;
      /* Using cursor P02KN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = AV8BarPieCod ;
      GXv_char8[0] = "" ;
      GXv_char9[0] = AV30MovVX ;
      new app.pvxgrain(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_char8, GXv_char9) ;
      pvxpzhra.this.A396EmprCod = GXv_char4[0] ;
      pvxpzhra.this.A129BarCod = GXv_int7[0] ;
      pvxpzhra.this.A132BarCodReo = GXv_int6[0] ;
      pvxpzhra.this.A130BarCodPar = GXv_char3[0] ;
      pvxpzhra.this.AV8BarPieCod = GXv_char2[0] ;
      pvxpzhra.this.AV30MovVX = GXv_char9[0] ;
      AV13Texto_i = httpContext.getMessage( "Se agregó pieza ", "") + AV8BarPieCod + httpContext.getMessage( " a Hdr = ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV10EmprCod, AV34Pgmname, AV14UsurCod, AV12Station, AV13Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      if ( GXutil.strcmp(AV16BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char8[0] = A130BarCodPar ;
         new app.pactagr(remoteHandle, context).execute( GXv_char9, GXv_int7, GXv_int6, GXv_char8) ;
         pvxpzhra.this.A396EmprCod = GXv_char9[0] ;
         pvxpzhra.this.A129BarCod = GXv_int7[0] ;
         pvxpzhra.this.A132BarCodReo = GXv_int6[0] ;
         pvxpzhra.this.A130BarCodPar = GXv_char8[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvxpzhra.this.A396EmprCod;
      this.aP1[0] = pvxpzhra.this.A129BarCod;
      this.aP2[0] = pvxpzhra.this.A132BarCodReo;
      this.aP3[0] = pvxpzhra.this.A130BarCodPar;
      this.aP4[0] = pvxpzhra.this.AV8BarPieCod;
      this.aP5[0] = pvxpzhra.this.AV22BarPieIdPz;
      this.aP6[0] = pvxpzhra.this.AV9BarPieKil;
      this.aP7[0] = pvxpzhra.this.AV20BarPieMet;
      this.aP8[0] = pvxpzhra.this.AV24BarPieLoc;
      Application.commitDataStores(context, remoteHandle, pr_default, "pvxpzhra");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV14UsurCod = "" ;
      AV10EmprCod = "" ;
      scmdbuf = "" ;
      P02KN2_A396EmprCod = new String[] {""} ;
      P02KN2_A129BarCod = new int[1] ;
      P02KN2_A132BarCodReo = new byte[1] ;
      P02KN2_A130BarCodPar = new String[] {""} ;
      P02KN2_A213BarSit = new byte[1] ;
      P02KN2_A361DisCod = new int[1] ;
      P02KN2_A120BarAgrEst = new String[] {""} ;
      P02KN2_A228BarUniMed = new String[] {""} ;
      P02KN2_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02KN2_A864BarPes = new short[1] ;
      A120BarAgrEst = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      AV16BarAgrEst = "" ;
      AV17BarUniMed = "" ;
      AV18BarRdt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A2186BarPieLoc = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A6489BarPieIdPz = "" ;
      Gx_emsg = "" ;
      A2159AlbRecPie = "" ;
      A4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV13Texto_i = "" ;
      AV34Pgmname = "" ;
      GXv_char9 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char8 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxpzhra__default(),
         new Object[] {
             new Object[] {
            P02KN2_A396EmprCod, P02KN2_A129BarCod, P02KN2_A132BarCodReo, P02KN2_A130BarCodPar, P02KN2_A213BarSit, P02KN2_A361DisCod, P02KN2_A120BarAgrEst, P02KN2_A228BarUniMed, P02KN2_A211BarRdt, P02KN2_A864BarPes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "PVxPzHrA" ;
      /* GeneXus formulas. */
      AV34Pgmname = "PVxPzHrA" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV21Martex ;
   private byte AV29Intexco ;
   private byte GXt_int5 ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private byte A5099DisPieEst ;
   private byte GXv_int6[] ;
   private short A864BarPes ;
   private short AV19BarPes ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A3277BarPieAut ;
   private short Gx_err ;
   private short A2185DisPieAnc ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV15DisCod ;
   private int GX_INS18 ;
   private int A44AlbRecCod ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int GX_INS299 ;
   private int GX_INS36 ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV9BarPieKil ;
   private java.math.BigDecimal AV20BarPieMet ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal AV18BarRdt ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarPieCod ;
   private String AV22BarPieIdPz ;
   private String AV24BarPieLoc ;
   private String AV30MovVX ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV14UsurCod ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A228BarUniMed ;
   private String AV16BarAgrEst ;
   private String AV17BarUniMed ;
   private String A200BarPieCod ;
   private String A2186BarPieLoc ;
   private String A908PieOriCod ;
   private String A6489BarPieIdPz ;
   private String Gx_emsg ;
   private String A2159AlbRecPie ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV34Pgmname ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private java.util.Date A4411AlbRecFec ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3277BarPieAut ;
   private boolean n6489BarPieIdPz ;
   private boolean n4411AlbRecFec ;
   private String AV13Texto_i ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KN2_A396EmprCod ;
   private int[] P02KN2_A129BarCod ;
   private byte[] P02KN2_A132BarCodReo ;
   private String[] P02KN2_A130BarCodPar ;
   private byte[] P02KN2_A213BarSit ;
   private int[] P02KN2_A361DisCod ;
   private String[] P02KN2_A120BarAgrEst ;
   private String[] P02KN2_A228BarUniMed ;
   private java.math.BigDecimal[] P02KN2_A211BarRdt ;
   private short[] P02KN2_A864BarPes ;
}

final  class pvxpzhra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, DisCod, BarAgrEst, BarUniMed, BarRdt, BarPes FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02KN3", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieIdPz, BarPieImp, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P02KN4", "INSERT INTO TXPALBDET(EmprCod, AlbRecCod, AlbRecPie, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecFec, AlbRecAnh, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieCal, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecPar, AlbRecCue, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P02KN5", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 15);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[8], false);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

