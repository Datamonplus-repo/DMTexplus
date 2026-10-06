package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psinmat extends GXProcedure
{
   public psinmat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psinmat.class ), "" );
   }

   public psinmat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 )
   {
      psinmat.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 )
   {
      psinmat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psinmat.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      psinmat.this.AV9Disartcod = aP2[0];
      this.aP2 = aP2;
      psinmat.this.AV10DisNmtr = aP3[0];
      this.aP3 = aP3;
      psinmat.this.AV14Disclinum = aP4[0];
      this.aP4 = aP4;
      psinmat.this.AV15Discolnom = aP5[0];
      this.aP5 = aP5;
      psinmat.this.AV16Discolnum = aP6[0];
      this.aP6 = aP6;
      psinmat.this.AV13Discod = aP7[0];
      this.aP7 = aP7;
      psinmat.this.AV17PartCod = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8Clicod ;
      new app.psinmat2(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      psinmat.this.A396EmprCod = GXv_char1[0] ;
      psinmat.this.AV8Clicod = GXv_int2[0] ;
      AV17PartCod = httpContext.getMessage( "SIN MATERIA", "") ;
      AV12PartLin = 1 ;
      /*
         INSERT RECORD ON TABLE TXPCPARTI

      */
      A966PartCod = httpContext.getMessage( "SIN MATERIA", "") ;
      A252CliCod = AV8Clicod ;
      A1456ParArtCod = AV9Disartcod ;
      n1456ParArtCod = false ;
      A1457ParNMtr = AV10DisNmtr ;
      n1457ParNMtr = false ;
      A968PartFec = GXutil.today( ) ;
      n968PartFec = false ;
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      A972PartULin = 1 ;
      n972PartULin = false ;
      A2240PartDsc = httpContext.getMessage( "SIN MATERIA", "") ;
      n2240PartDsc = false ;
      A2241PartSec = httpContext.getMessage( "H", "") ;
      n2241PartSec = false ;
      A2244PartReo = httpContext.getMessage( "NO", "") ;
      n2244PartReo = false ;
      A2245PartEstM = "" ;
      n2245PartEstM = false ;
      A2376PartExt = (byte)(0) ;
      n2376PartExt = false ;
      A829TipArtCod = (short)(0) ;
      n829TipArtCod = false ;
      A2747PartOpe = "" ;
      n2747PartOpe = false ;
      A2745PartTipP = "" ;
      n2745PartTipP = false ;
      A3628PartPre = DecimalUtil.doubleToDec(0) ;
      n3628PartPre = false ;
      A3885ParObsLon = "" ;
      n3885ParObsLon = false ;
      A5841ParUEstM = "" ;
      n5841ParUEstM = false ;
      A5848ParUbiLin = (short)(0) ;
      n5848ParUbiLin = false ;
      A5859ParUObsLon = "" ;
      n5859ParUObsLon = false ;
      A5874CruCod = 0 ;
      n5874CruCod = false ;
      A5877PartUni = "" ;
      n5877PartUni = false ;
      A5910PartCnf = "" ;
      n5910PartCnf = false ;
      A5911PartUltPal = (short)(0) ;
      n5911PartUltPal = false ;
      A7030PartCoef = DecimalUtil.doubleToDec(0) ;
      n7030PartCoef = false ;
      A8880Pdo_UltL = 0 ;
      n8880Pdo_UltL = false ;
      A8893Ub_Cod = "" ;
      n8893Ub_Cod = false ;
      A10200PartRemTpo = "" ;
      n10200PartRemTpo = false ;
      A10201PartRemSuc = "" ;
      n10201PartRemSuc = false ;
      A10202PartRemFch = GXutil.nullDate() ;
      n10202PartRemFch = false ;
      A10203PartRemNro = "" ;
      n10203PartRemNro = false ;
      A10204PartOCOCod = "" ;
      n10204PartOCOCod = false ;
      /* Using cursor P04492 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1456ParArtCod), A1456ParArtCod, Boolean.valueOf(n1457ParNMtr), A1457ParNMtr, Boolean.valueOf(n968PartFec), A968PartFec, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n2240PartDsc), A2240PartDsc, Boolean.valueOf(n2241PartSec), A2241PartSec, Boolean.valueOf(n2244PartReo), A2244PartReo, Boolean.valueOf(n2245PartEstM), A2245PartEstM, Boolean.valueOf(n2376PartExt), Byte.valueOf(A2376PartExt), Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n2747PartOpe), A2747PartOpe, Boolean.valueOf(n2745PartTipP), A2745PartTipP, Boolean.valueOf(n3628PartPre), A3628PartPre, Boolean.valueOf(n3885ParObsLon), A3885ParObsLon, Boolean.valueOf(n5841ParUEstM), A5841ParUEstM, Boolean.valueOf(n5848ParUbiLin), Short.valueOf(A5848ParUbiLin), Boolean.valueOf(n5859ParUObsLon), A5859ParUObsLon, Boolean.valueOf(n5874CruCod), Integer.valueOf(A5874CruCod), Boolean.valueOf(n5877PartUni), A5877PartUni, Boolean.valueOf(n5910PartCnf), A5910PartCnf, Boolean.valueOf(n5911PartUltPal), Short.valueOf(A5911PartUltPal), Boolean.valueOf(n7030PartCoef), A7030PartCoef, Boolean.valueOf(n8880Pdo_UltL), Integer.valueOf(A8880Pdo_UltL), Boolean.valueOf(n8893Ub_Cod), A8893Ub_Cod, Boolean.valueOf(n10200PartRemTpo), A10200PartRemTpo, Boolean.valueOf(n10201PartRemSuc), A10201PartRemSuc, Boolean.valueOf(n10202PartRemFch), A10202PartRemFch, Boolean.valueOf(n10203PartRemNro), A10203PartRemNro, Boolean.valueOf(n10204PartOCOCod), A10204PartOCOCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P04493 */
         pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P04493_A396EmprCod[0] ;
            A966PartCod = P04493_A966PartCod[0] ;
            A252CliCod = P04493_A252CliCod[0] ;
            A972PartULin = P04493_A972PartULin[0] ;
            n972PartULin = P04493_n972PartULin[0] ;
            AV12PartLin = (int)(A972PartULin+1) ;
            A972PartULin = (int)(A972PartULin+1) ;
            n972PartULin = false ;
            /* Using cursor P04494 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLPARTI

      */
      A966PartCod = httpContext.getMessage( "SIN MATERIA", "") ;
      A252CliCod = AV8Clicod ;
      A979PartLin = AV12PartLin ;
      A980PartLinTip = httpContext.getMessage( "E", "") ;
      n980PartLinTip = false ;
      A981PartAlbDis = AV13Discod ;
      n981PartAlbDis = false ;
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      A982PartSitDis = GXutil.concat( AV15Discolnom, GXutil.str( AV16Discolnum, 6, 0), " / ") ;
      n982PartSitDis = false ;
      A983PartFecMov = GXutil.today( ) ;
      n983PartFecMov = false ;
      A984KilEnt = DecimalUtil.doubleToDec(999999) ;
      n984KilEnt = false ;
      A985ConEnt = (short)(9999) ;
      n985ConEnt = false ;
      A986KilUti = DecimalUtil.doubleToDec(0) ;
      n986KilUti = false ;
      A987ConUti = (short)(0) ;
      n987ConUti = false ;
      A1877PartLoc = httpContext.getMessage( "SIN PARTIDA", "") ;
      n1877PartLoc = false ;
      A1966KilRes = DecimalUtil.doubleToDec(0) ;
      n1966KilRes = false ;
      A1967ConRes = (short)(0) ;
      n1967ConRes = false ;
      A2022PartPesCo = DecimalUtil.doubleToDec(0) ;
      n2022PartPesCo = false ;
      A2023PartDm = DecimalUtil.doubleToDec(0) ;
      n2023PartDm = false ;
      A2024ParPorAgu = DecimalUtil.doubleToDec(0) ;
      n2024ParPorAgu = false ;
      A1157TipConCod = (short)(0) ;
      n1157TipConCod = false ;
      A2246ParNumCli = AV14Disclinum ;
      n2246ParNumCli = false ;
      A2377ParExtLin = (short)(0) ;
      n2377ParExtLin = false ;
      A5878PartLinUni = "" ;
      n5878PartLinUni = false ;
      A5912PartPalUti = "" ;
      n5912PartPalUti = false ;
      A5913PartPalEst = "" ;
      n5913PartPalEst = false ;
      A5914PartCja = 0 ;
      n5914PartCja = false ;
      A5915PartTarCja = DecimalUtil.doubleToDec(0) ;
      n5915PartTarCja = false ;
      A5916PartTarPal = DecimalUtil.doubleToDec(0) ;
      n5916PartTarPal = false ;
      A10259PartSts = (byte)(0) ;
      n10259PartSts = false ;
      A10260PartFcEv = GXutil.nullDate() ;
      n10260PartFcEv = false ;
      A10261PartHhEv = GXutil.resetTime( GXutil.nullDate() );
      n10261PartHhEv = false ;
      A10262PartTrz = "" ;
      n10262PartTrz = false ;
      A10263PartFm = GXutil.nullDate() ;
      n10263PartFm = false ;
      /* Using cursor P04495 */
      pr_default.execute(3, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n984KilEnt), A984KilEnt, Boolean.valueOf(n985ConEnt), Short.valueOf(A985ConEnt), Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1877PartLoc), A1877PartLoc, Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), Boolean.valueOf(n2022PartPesCo), A2022PartPesCo, Boolean.valueOf(n2023PartDm), A2023PartDm, Boolean.valueOf(n2024ParPorAgu), A2024ParPorAgu, Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), Boolean.valueOf(n2246ParNumCli), A2246ParNumCli, Boolean.valueOf(n2377ParExtLin), Short.valueOf(A2377ParExtLin), Boolean.valueOf(n5878PartLinUni), A5878PartLinUni, Boolean.valueOf(n5912PartPalUti), A5912PartPalUti, Boolean.valueOf(n5913PartPalEst), A5913PartPalEst, Boolean.valueOf(n5914PartCja), Integer.valueOf(A5914PartCja), Boolean.valueOf(n5915PartTarCja), A5915PartTarCja, Boolean.valueOf(n5916PartTarPal), A5916PartTarPal, Boolean.valueOf(n10259PartSts), Byte.valueOf(A10259PartSts), Boolean.valueOf(n10260PartFcEv), A10260PartFcEv, Boolean.valueOf(n10261PartHhEv), A10261PartHhEv, Boolean.valueOf(n10262PartTrz), A10262PartTrz, Boolean.valueOf(n10263PartFm), A10263PartFm});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psinmat.this.A396EmprCod;
      this.aP1[0] = psinmat.this.AV8Clicod;
      this.aP2[0] = psinmat.this.AV9Disartcod;
      this.aP3[0] = psinmat.this.AV10DisNmtr;
      this.aP4[0] = psinmat.this.AV14Disclinum;
      this.aP5[0] = psinmat.this.AV15Discolnom;
      this.aP6[0] = psinmat.this.AV16Discolnum;
      this.aP7[0] = psinmat.this.AV13Discod;
      this.aP8[0] = psinmat.this.AV17PartCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "psinmat");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      A966PartCod = "" ;
      A1456ParArtCod = "" ;
      A1457ParNMtr = "" ;
      A968PartFec = GXutil.nullDate() ;
      A2240PartDsc = "" ;
      A2241PartSec = "" ;
      A2244PartReo = "" ;
      A2245PartEstM = "" ;
      A2747PartOpe = "" ;
      A2745PartTipP = "" ;
      A3628PartPre = DecimalUtil.ZERO ;
      A3885ParObsLon = "" ;
      A5841ParUEstM = "" ;
      A5859ParUObsLon = "" ;
      A5877PartUni = "" ;
      A5910PartCnf = "" ;
      A7030PartCoef = DecimalUtil.ZERO ;
      A8893Ub_Cod = "" ;
      A10200PartRemTpo = "" ;
      A10201PartRemSuc = "" ;
      A10202PartRemFch = GXutil.nullDate() ;
      A10203PartRemNro = "" ;
      A10204PartOCOCod = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P04493_A396EmprCod = new String[] {""} ;
      P04493_A966PartCod = new String[] {""} ;
      P04493_A252CliCod = new int[1] ;
      P04493_A972PartULin = new int[1] ;
      P04493_n972PartULin = new boolean[] {false} ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A983PartFecMov = GXutil.nullDate() ;
      A984KilEnt = DecimalUtil.ZERO ;
      A986KilUti = DecimalUtil.ZERO ;
      A1877PartLoc = "" ;
      A1966KilRes = DecimalUtil.ZERO ;
      A2022PartPesCo = DecimalUtil.ZERO ;
      A2023PartDm = DecimalUtil.ZERO ;
      A2024ParPorAgu = DecimalUtil.ZERO ;
      A2246ParNumCli = "" ;
      A5878PartLinUni = "" ;
      A5912PartPalUti = "" ;
      A5913PartPalEst = "" ;
      A5915PartTarCja = DecimalUtil.ZERO ;
      A5916PartTarPal = DecimalUtil.ZERO ;
      A10260PartFcEv = GXutil.nullDate() ;
      A10261PartHhEv = GXutil.resetTime( GXutil.nullDate() );
      A10262PartTrz = "" ;
      A10263PartFm = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psinmat__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P04493_A396EmprCod, P04493_A966PartCod, P04493_A252CliCod, P04493_A972PartULin, P04493_n972PartULin
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

   private byte A2376PartExt ;
   private byte A10259PartSts ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short A5848ParUbiLin ;
   private short A5911PartUltPal ;
   private short Gx_err ;
   private short A840TrnCod ;
   private short A985ConEnt ;
   private short A987ConUti ;
   private short A1967ConRes ;
   private short A1157TipConCod ;
   private short A2377ParExtLin ;
   private int AV8Clicod ;
   private int AV16Discolnum ;
   private int AV13Discod ;
   private int GXv_int2[] ;
   private int AV12PartLin ;
   private int GX_INS207 ;
   private int A252CliCod ;
   private int A972PartULin ;
   private int A5874CruCod ;
   private int A8880Pdo_UltL ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int A5914PartCja ;
   private java.math.BigDecimal A3628PartPre ;
   private java.math.BigDecimal A7030PartCoef ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A1966KilRes ;
   private java.math.BigDecimal A2022PartPesCo ;
   private java.math.BigDecimal A2023PartDm ;
   private java.math.BigDecimal A2024ParPorAgu ;
   private java.math.BigDecimal A5915PartTarCja ;
   private java.math.BigDecimal A5916PartTarPal ;
   private String A396EmprCod ;
   private String AV9Disartcod ;
   private String AV10DisNmtr ;
   private String AV14Disclinum ;
   private String AV15Discolnom ;
   private String AV17PartCod ;
   private String GXv_char1[] ;
   private String A966PartCod ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A2240PartDsc ;
   private String A2241PartSec ;
   private String A2244PartReo ;
   private String A2245PartEstM ;
   private String A2747PartOpe ;
   private String A2745PartTipP ;
   private String A5841ParUEstM ;
   private String A5877PartUni ;
   private String A5910PartCnf ;
   private String A8893Ub_Cod ;
   private String A10200PartRemTpo ;
   private String A10201PartRemSuc ;
   private String A10203PartRemNro ;
   private String A10204PartOCOCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A1877PartLoc ;
   private String A2246ParNumCli ;
   private String A5878PartLinUni ;
   private String A5912PartPalUti ;
   private String A5913PartPalEst ;
   private String A10262PartTrz ;
   private java.util.Date A10261PartHhEv ;
   private java.util.Date A968PartFec ;
   private java.util.Date A10202PartRemFch ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A10260PartFcEv ;
   private java.util.Date A10263PartFm ;
   private boolean n1456ParArtCod ;
   private boolean n1457ParNMtr ;
   private boolean n968PartFec ;
   private boolean n970ProceCod ;
   private boolean n972PartULin ;
   private boolean n2240PartDsc ;
   private boolean n2241PartSec ;
   private boolean n2244PartReo ;
   private boolean n2245PartEstM ;
   private boolean n2376PartExt ;
   private boolean n829TipArtCod ;
   private boolean n2747PartOpe ;
   private boolean n2745PartTipP ;
   private boolean n3628PartPre ;
   private boolean n3885ParObsLon ;
   private boolean n5841ParUEstM ;
   private boolean n5848ParUbiLin ;
   private boolean n5859ParUObsLon ;
   private boolean n5874CruCod ;
   private boolean n5877PartUni ;
   private boolean n5910PartCnf ;
   private boolean n5911PartUltPal ;
   private boolean n7030PartCoef ;
   private boolean n8880Pdo_UltL ;
   private boolean n8893Ub_Cod ;
   private boolean n10200PartRemTpo ;
   private boolean n10201PartRemSuc ;
   private boolean n10202PartRemFch ;
   private boolean n10203PartRemNro ;
   private boolean n10204PartOCOCod ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n840TrnCod ;
   private boolean n982PartSitDis ;
   private boolean n983PartFecMov ;
   private boolean n984KilEnt ;
   private boolean n985ConEnt ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n1877PartLoc ;
   private boolean n1966KilRes ;
   private boolean n1967ConRes ;
   private boolean n2022PartPesCo ;
   private boolean n2023PartDm ;
   private boolean n2024ParPorAgu ;
   private boolean n1157TipConCod ;
   private boolean n2246ParNumCli ;
   private boolean n2377ParExtLin ;
   private boolean n5878PartLinUni ;
   private boolean n5912PartPalUti ;
   private boolean n5913PartPalEst ;
   private boolean n5914PartCja ;
   private boolean n5915PartTarCja ;
   private boolean n5916PartTarPal ;
   private boolean n10259PartSts ;
   private boolean n10260PartFcEv ;
   private boolean n10261PartHhEv ;
   private boolean n10262PartTrz ;
   private boolean n10263PartFm ;
   private String A3885ParObsLon ;
   private String A5859ParUObsLon ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04493_A396EmprCod ;
   private String[] P04493_A966PartCod ;
   private int[] P04493_A252CliCod ;
   private int[] P04493_A972PartULin ;
   private boolean[] P04493_n972PartULin ;
}

final  class psinmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04492", "INSERT INTO TXPCPARTI(EmprCod, PartCod, CliCod, ParArtCod, ParNMtr, PartFec, ProceCod, PartULin, PartDsc, PartSec, PartReo, PartEstM, PartExt, TipArtCod, PartOpe, PartTipP, PartPre, ParObsLon, ParUEstM, ParUbiLin, ParUObsLon, CruCod, PartUni, PartCnf, PartUltPal, PartCoef, Pdo_UltL, Ub_Cod, PartRemTpo, PartRemSuc, PartRemFch, PartRemNro, PartOCOCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P04493", "SELECT EmprCod, PartCod, CliCod, PartULin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04494", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new UpdateCursor("P04495", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, TrnCod, PartSitDis, PartFecMov, KilEnt, ConEnt, KilUti, ConUti, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 8);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(18, (String)parms[32]);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 400);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 10);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 4);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 4);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DATE );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[58]);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 12);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[62], 18);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
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
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[55]);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(31, (java.util.Date)parms[57], true);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[59], 30);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[61]);
               }
               return;
      }
   }

}

