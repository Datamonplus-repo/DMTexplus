package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdis1jbm extends GXProcedure
{
   public pdis1jbm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdis1jbm.class ), "" );
   }

   public pdis1jbm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 )
   {
      pdis1jbm.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      pdis1jbm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdis1jbm.this.AV8DisCod = aP1[0];
      this.aP1 = aP1;
      pdis1jbm.this.AV12AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdis1jbm.this.AV14AlbRuni = aP3[0];
      this.aP3 = aP3;
      pdis1jbm.this.AV10AlbRUniEnt = aP4[0];
      this.aP4 = aP4;
      pdis1jbm.this.AV13AlbRPieEnt = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPALBREC

      */
      A44AlbRecCod = AV12AlbRecCod ;
      A58AlbRUniEnt = DecimalUtil.doubleToDec(999999) ;
      A52AlbRPieEnt = 9999 ;
      A60AlbRUniUti = AV10AlbRUniEnt ;
      A54AlbRPieUti = AV13AlbRPieEnt ;
      A56AlbRUni = AV14AlbRuni ;
      /* Using cursor P019L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A58AlbRUniEnt, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P019L3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV13AlbRPieEnt), AV10AlbRUniEnt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /* Optimized UPDATE. */
      /* Using cursor P019L4 */
      short AV13AlbRPieEnt374Aux;
      AV13AlbRPieEnt374Aux = (short)(AV13AlbRPieEnt) ;
      pr_default.execute(2, new Object[] {AV14AlbRuni, Short.valueOf(AV13AlbRPieEnt374Aux), AV10AlbRUniEnt, A396EmprCod, Integer.valueOf(AV8DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      /*
         INSERT RECORD ON TABLE TXPDISALB

      */
      A361DisCod = AV8DisCod ;
      A44AlbRecCod = AV12AlbRecCod ;
      A673Piezas = AV13AlbRPieEnt ;
      if ( GXutil.strcmp(AV14AlbRuni, httpContext.getMessage( "M", "")) == 0 )
      {
         A631Metros = AV10AlbRUniEnt ;
      }
      else
      {
         A595Kilos = AV10AlbRUniEnt ;
      }
      /* Using cursor P019L5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P019L6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod), Integer.valueOf(AV12AlbRecCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P019L6_A396EmprCod[0] ;
            A44AlbRecCod = P019L6_A44AlbRecCod[0] ;
            A361DisCod = P019L6_A361DisCod[0] ;
            A673Piezas = P019L6_A673Piezas[0] ;
            A631Metros = P019L6_A631Metros[0] ;
            A595Kilos = P019L6_A595Kilos[0] ;
            A673Piezas = AV13AlbRPieEnt ;
            if ( GXutil.strcmp(AV14AlbRuni, httpContext.getMessage( "M", "")) == 0 )
            {
               A631Metros = AV10AlbRUniEnt ;
            }
            else
            {
               A595Kilos = AV10AlbRUniEnt ;
            }
            /* Using cursor P019L7 */
            pr_default.execute(5, new Object[] {Integer.valueOf(A673Piezas), A631Metros, A595Kilos, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Gx_msg = httpContext.getMessage( "Dis1JBM", "") + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Dispos ", "") + GXutil.str( AV8DisCod, 10, 0) + GXutil.newLine( ) ;
      AV21GXLvl59 = (byte)(0) ;
      /* Using cursor P019L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P019L8_A130BarCodPar[0] ;
         A132BarCodReo = P019L8_A132BarCodReo[0] ;
         A129BarCod = P019L8_A129BarCod[0] ;
         A361DisCod = P019L8_A361DisCod[0] ;
         AV21GXLvl59 = (byte)(1) ;
         Gx_msg += httpContext.getMessage( "Hay HDR.", "") + GXutil.newLine( ) ;
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         Gx_msg += httpContext.getMessage( "Creo Pieza.", "") + GXutil.newLine( ) ;
         A44AlbRecCod = AV12AlbRecCod ;
         A200BarPieCod = GXutil.str( AV12AlbRecCod, 10, 0) ;
         A1501BarPiePie = AV13AlbRPieEnt ;
         if ( GXutil.strcmp(AV14AlbRuni, httpContext.getMessage( "M", "")) == 0 )
         {
            A205BarPieMet = AV10AlbRUniEnt ;
         }
         else
         {
            A203BarPieKil = AV10AlbRUniEnt ;
         }
         /* Using cursor P019L9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Integer.valueOf(A1501BarPiePie)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(7) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            Gx_msg += httpContext.getMessage( "Ya Existe Pieza.", "") + GXutil.newLine( ) ;
            AV22GXLvl75 = (byte)(0) ;
            /* Using cursor P019L10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(AV12AlbRecCod), Integer.valueOf(AV12AlbRecCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A396EmprCod = P019L10_A396EmprCod[0] ;
               A129BarCod = P019L10_A129BarCod[0] ;
               A132BarCodReo = P019L10_A132BarCodReo[0] ;
               A130BarCodPar = P019L10_A130BarCodPar[0] ;
               A200BarPieCod = P019L10_A200BarPieCod[0] ;
               A44AlbRecCod = P019L10_A44AlbRecCod[0] ;
               A1501BarPiePie = P019L10_A1501BarPiePie[0] ;
               A205BarPieMet = P019L10_A205BarPieMet[0] ;
               A203BarPieKil = P019L10_A203BarPieKil[0] ;
               AV22GXLvl75 = (byte)(1) ;
               Gx_msg += httpContext.getMessage( "Modifico la Pieza.", "") + GXutil.newLine( ) ;
               A1501BarPiePie = AV13AlbRPieEnt ;
               if ( GXutil.strcmp(AV14AlbRuni, httpContext.getMessage( "M", "")) == 0 )
               {
                  A205BarPieMet = AV10AlbRUniEnt ;
               }
               else
               {
                  A203BarPieKil = AV10AlbRUniEnt ;
               }
               /* Using cursor P019L11 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A1501BarPiePie), A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(8);
            }
            pr_default.close(8);
            if ( AV22GXLvl75 == 0 )
            {
               Gx_msg += httpContext.getMessage( "No encuentro la pieza.", "") + GXutil.newLine( ) ;
            }
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV21GXLvl59 == 0 )
      {
         Gx_msg += httpContext.getMessage( "No Hay HDR.", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdis1jbm.this.A396EmprCod;
      this.aP1[0] = pdis1jbm.this.AV8DisCod;
      this.aP2[0] = pdis1jbm.this.AV12AlbRecCod;
      this.aP3[0] = pdis1jbm.this.AV14AlbRuni;
      this.aP4[0] = pdis1jbm.this.AV10AlbRUniEnt;
      this.aP5[0] = pdis1jbm.this.AV13AlbRPieEnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdis1jbm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      Gx_emsg = "" ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P019L6_A396EmprCod = new String[] {""} ;
      P019L6_A44AlbRecCod = new int[1] ;
      P019L6_A361DisCod = new int[1] ;
      P019L6_A673Piezas = new int[1] ;
      P019L6_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019L6_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Gx_msg = "" ;
      P019L8_A396EmprCod = new String[] {""} ;
      P019L8_A130BarCodPar = new String[] {""} ;
      P019L8_A132BarCodReo = new byte[1] ;
      P019L8_A129BarCod = new int[1] ;
      P019L8_A361DisCod = new int[1] ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      P019L10_A396EmprCod = new String[] {""} ;
      P019L10_A129BarCod = new int[1] ;
      P019L10_A132BarCodReo = new byte[1] ;
      P019L10_A130BarCodPar = new String[] {""} ;
      P019L10_A200BarPieCod = new String[] {""} ;
      P019L10_A44AlbRecCod = new int[1] ;
      P019L10_A1501BarPiePie = new int[1] ;
      P019L10_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019L10_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdis1jbm__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P019L6_A396EmprCod, P019L6_A44AlbRecCod, P019L6_A361DisCod, P019L6_A673Piezas, P019L6_A631Metros, P019L6_A595Kilos
            }
            , new Object[] {
            }
            , new Object[] {
            P019L8_A396EmprCod, P019L8_A130BarCodPar, P019L8_A132BarCodReo, P019L8_A129BarCod, P019L8_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P019L10_A396EmprCod, P019L10_A129BarCod, P019L10_A132BarCodReo, P019L10_A130BarCodPar, P019L10_A200BarPieCod, P019L10_A44AlbRecCod, P019L10_A1501BarPiePie, P019L10_A205BarPieMet, P019L10_A203BarPieKil
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl59 ;
   private byte A132BarCodReo ;
   private byte AV22GXLvl75 ;
   private short Gx_err ;
   private short A374DisNumPie ;
   private int AV8DisCod ;
   private int AV12AlbRecCod ;
   private int AV13AlbRPieEnt ;
   private int GX_INS7 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int GX_INS35 ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int A129BarCod ;
   private int GX_INS18 ;
   private int A1501BarPiePie ;
   private java.math.BigDecimal AV10AlbRUniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String AV14AlbRuni ;
   private String A56AlbRUni ;
   private String Gx_emsg ;
   private String A392DisUniMed ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P019L6_A396EmprCod ;
   private int[] P019L6_A44AlbRecCod ;
   private int[] P019L6_A361DisCod ;
   private int[] P019L6_A673Piezas ;
   private java.math.BigDecimal[] P019L6_A631Metros ;
   private java.math.BigDecimal[] P019L6_A595Kilos ;
   private String[] P019L8_A396EmprCod ;
   private String[] P019L8_A130BarCodPar ;
   private byte[] P019L8_A132BarCodReo ;
   private int[] P019L8_A129BarCod ;
   private int[] P019L8_A361DisCod ;
   private String[] P019L10_A396EmprCod ;
   private int[] P019L10_A129BarCod ;
   private byte[] P019L10_A132BarCodReo ;
   private String[] P019L10_A130BarCodPar ;
   private String[] P019L10_A200BarPieCod ;
   private int[] P019L10_A44AlbRecCod ;
   private int[] P019L10_A1501BarPiePie ;
   private java.math.BigDecimal[] P019L10_A205BarPieMet ;
   private java.math.BigDecimal[] P019L10_A203BarPieKil ;
}

final  class pdis1jbm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P019L2", "INSERT INTO TXPALBREC(EmprCod, AlbRecCod, AlbRPieEnt, AlbRUni, AlbRUniEnt, AlbRPieUti, AlbRUniUti, CliCod, AlbRef, TrnCod, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, TipEntCod, AlbNumEti, AlbRDes, ProceCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P019L3", "UPDATE TXPALBREC SET AlbRPieUti=AlbRPieUti + ?, AlbRUniUti=AlbRUniUti + ?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P019L4", "UPDATE TXPDISPOS SET DisUniMed=?, DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P019L5", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P019L6", "SELECT EmprCod, AlbRecCod, DisCod, Piezas, Metros, Kilos FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019L7", "UPDATE TXPDISALB SET Piezas=?, Metros=?, Kilos=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P019L8", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019L9", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPiePie, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P019L10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPiePie, BarPieMet, BarPieKil FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbRecCod = ?) AND (BarPieCod = TO_CHAR(?,'999999999')) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019L11", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

