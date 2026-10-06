package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenfas2 extends GXProcedure
{
   public prenfas2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenfas2.class ), "" );
   }

   public prenfas2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prenfas2.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      prenfas2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      prenfas2.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      prenfas2.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenfas2.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenfas2.this.AV19ProCod = aP4[0];
      this.aP4 = aP4;
      prenfas2.this.AV36Contador = aP5[0];
      this.aP5 = aP5;
      prenfas2.this.AV39ExisParFas = aP6[0];
      this.aP6 = aP6;
      prenfas2.this.AV113Fasqui = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV115Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prenfas2.this.GXt_char1 = GXv_char2[0] ;
      AV115Station = GXt_char1 ;
      GXt_char1 = AV37Termcod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prenfas2.this.GXt_char1 = GXv_char2[0] ;
      AV37Termcod = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV111Emprnom ;
      GXv_char4[0] = AV112Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char2, GXv_char3, GXv_char4) ;
      prenfas2.this.AV15EmprCod = GXv_char2[0] ;
      prenfas2.this.AV111Emprnom = GXv_char3[0] ;
      prenfas2.this.AV112Usurcod = GXv_char4[0] ;
      /* Using cursor P03WP2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03WP2_A130BarCodPar[0] ;
         A132BarCodReo = P03WP2_A132BarCodReo[0] ;
         A129BarCod = P03WP2_A129BarCod[0] ;
         A396EmprCod = P03WP2_A396EmprCod[0] ;
         A761ProFasLin = P03WP2_A761ProFasLin[0] ;
         n761ProFasLin = P03WP2_n761ProFasLin[0] ;
         A758ProCod = P03WP2_A758ProCod[0] ;
         AV36Contador = (byte)(AV36Contador+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV119GXLvl16 = (byte)(0) ;
      /* Using cursor P03WP3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P03WP3_A130BarCodPar[0] ;
         A132BarCodReo = P03WP3_A132BarCodReo[0] ;
         A129BarCod = P03WP3_A129BarCod[0] ;
         A396EmprCod = P03WP3_A396EmprCod[0] ;
         A6665FasQuiObs = P03WP3_A6665FasQuiObs[0] ;
         A758ProCod = P03WP3_A758ProCod[0] ;
         A194BarOrdLin = P03WP3_A194BarOrdLin[0] ;
         A5371FasQuiLin = P03WP3_A5371FasQuiLin[0] ;
         AV119GXLvl16 = (byte)(1) ;
         AV113Fasqui = httpContext.getMessage( "S", "") ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV119GXLvl16 == 0 )
      {
         AV113Fasqui = httpContext.getMessage( "N", "") ;
      }
      AV120GXLvl26 = (byte)(0) ;
      /* Using cursor P03WP4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P03WP4_A130BarCodPar[0] ;
         A132BarCodReo = P03WP4_A132BarCodReo[0] ;
         A129BarCod = P03WP4_A129BarCod[0] ;
         A396EmprCod = P03WP4_A396EmprCod[0] ;
         A3295BarParVal = P03WP4_A3295BarParVal[0] ;
         A758ProCod = P03WP4_A758ProCod[0] ;
         A194BarOrdLin = P03WP4_A194BarOrdLin[0] ;
         A1664ParFasCod = P03WP4_A1664ParFasCod[0] ;
         AV120GXLvl26 = (byte)(1) ;
         AV39ExisParFas = httpContext.getMessage( "S", "") ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV120GXLvl26 == 0 )
      {
         AV39ExisParFas = httpContext.getMessage( "N", "") ;
      }
      if ( GXutil.strcmp(AV39ExisParFas, httpContext.getMessage( "S", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         A396EmprCod = httpContext.getMessage( "XYZ", "") ;
         A129BarCod = AV16BarCod ;
         A132BarCodReo = AV17BarCodReo ;
         A130BarCodPar = AV18BarCodPar ;
         A213BarSit = (byte)(9) ;
         AV110Inc_obs = httpContext.getMessage( "Se esta creando un registro ficticio con la empresa XYZ para recosntruir la tabla BARPAR,FASQUI", "") ;
         AV110Inc_obs += httpContext.getMessage( "La HDR =", "") + GXutil.str( AV16BarCod, 8, 0) + "-" + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
         new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV121Pgmname, AV112Usurcod, AV37Termcod, AV110Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
         /* Using cursor P03WP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A213BarSit)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Otro usuario está modificando esta HDR. Inténtelo más tarde", ""));
            AV110Inc_obs = httpContext.getMessage( "Se esta creando un registro ficticio con la empresa XYZ para recosntruir la tabla BARPAR,FASQUI", "") ;
            AV110Inc_obs += httpContext.getMessage( "Otro usuario está modificando esta HDR =", "") + GXutil.str( AV16BarCod, 8, 0) + "-" + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            AV110Inc_obs += httpContext.getMessage( ".Inténtelo más tarde.", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV121Pgmname, AV112Usurcod, AV37Termcod, AV110Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenfas2.this.AV15EmprCod;
      this.aP1[0] = prenfas2.this.AV16BarCod;
      this.aP2[0] = prenfas2.this.AV17BarCodReo;
      this.aP3[0] = prenfas2.this.AV18BarCodPar;
      this.aP4[0] = prenfas2.this.AV19ProCod;
      this.aP5[0] = prenfas2.this.AV36Contador;
      this.aP6[0] = prenfas2.this.AV39ExisParFas;
      this.aP7[0] = prenfas2.this.AV113Fasqui;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenfas2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV115Station = "" ;
      AV37Termcod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV111Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV112Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P03WP2_A130BarCodPar = new String[] {""} ;
      P03WP2_A132BarCodReo = new byte[1] ;
      P03WP2_A129BarCod = new int[1] ;
      P03WP2_A396EmprCod = new String[] {""} ;
      P03WP2_A761ProFasLin = new short[1] ;
      P03WP2_n761ProFasLin = new boolean[] {false} ;
      P03WP2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      P03WP3_A130BarCodPar = new String[] {""} ;
      P03WP3_A132BarCodReo = new byte[1] ;
      P03WP3_A129BarCod = new int[1] ;
      P03WP3_A396EmprCod = new String[] {""} ;
      P03WP3_A6665FasQuiObs = new String[] {""} ;
      P03WP3_A758ProCod = new String[] {""} ;
      P03WP3_A194BarOrdLin = new short[1] ;
      P03WP3_A5371FasQuiLin = new short[1] ;
      A6665FasQuiObs = "" ;
      P03WP4_A130BarCodPar = new String[] {""} ;
      P03WP4_A132BarCodReo = new byte[1] ;
      P03WP4_A129BarCod = new int[1] ;
      P03WP4_A396EmprCod = new String[] {""} ;
      P03WP4_A3295BarParVal = new String[] {""} ;
      P03WP4_A758ProCod = new String[] {""} ;
      P03WP4_A194BarOrdLin = new short[1] ;
      P03WP4_A1664ParFasCod = new short[1] ;
      A3295BarParVal = "" ;
      AV110Inc_obs = "" ;
      AV121Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenfas2__default(),
         new Object[] {
             new Object[] {
            P03WP2_A130BarCodPar, P03WP2_A132BarCodReo, P03WP2_A129BarCod, P03WP2_A396EmprCod, P03WP2_A761ProFasLin, P03WP2_n761ProFasLin, P03WP2_A758ProCod
            }
            , new Object[] {
            P03WP3_A130BarCodPar, P03WP3_A132BarCodReo, P03WP3_A129BarCod, P03WP3_A396EmprCod, P03WP3_A6665FasQuiObs, P03WP3_A758ProCod, P03WP3_A194BarOrdLin, P03WP3_A5371FasQuiLin
            }
            , new Object[] {
            P03WP4_A130BarCodPar, P03WP4_A132BarCodReo, P03WP4_A129BarCod, P03WP4_A396EmprCod, P03WP4_A3295BarParVal, P03WP4_A758ProCod, P03WP4_A194BarOrdLin, P03WP4_A1664ParFasCod
            }
            , new Object[] {
            }
         }
      );
      AV121Pgmname = "PRENFAS2" ;
      /* GeneXus formulas. */
      AV121Pgmname = "PRENFAS2" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV36Contador ;
   private byte A132BarCodReo ;
   private byte AV119GXLvl16 ;
   private byte AV120GXLvl26 ;
   private byte A213BarSit ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int GX_INS12 ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19ProCod ;
   private String AV39ExisParFas ;
   private String AV113Fasqui ;
   private String AV115Station ;
   private String AV37Termcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV111Emprnom ;
   private String GXv_char3[] ;
   private String AV112Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A3295BarParVal ;
   private String AV121Pgmname ;
   private String Gx_emsg ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private String A6665FasQuiObs ;
   private String AV110Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P03WP2_A130BarCodPar ;
   private byte[] P03WP2_A132BarCodReo ;
   private int[] P03WP2_A129BarCod ;
   private String[] P03WP2_A396EmprCod ;
   private short[] P03WP2_A761ProFasLin ;
   private boolean[] P03WP2_n761ProFasLin ;
   private String[] P03WP2_A758ProCod ;
   private String[] P03WP3_A130BarCodPar ;
   private byte[] P03WP3_A132BarCodReo ;
   private int[] P03WP3_A129BarCod ;
   private String[] P03WP3_A396EmprCod ;
   private String[] P03WP3_A6665FasQuiObs ;
   private String[] P03WP3_A758ProCod ;
   private short[] P03WP3_A194BarOrdLin ;
   private short[] P03WP3_A5371FasQuiLin ;
   private String[] P03WP4_A130BarCodPar ;
   private byte[] P03WP4_A132BarCodReo ;
   private int[] P03WP4_A129BarCod ;
   private String[] P03WP4_A396EmprCod ;
   private String[] P03WP4_A3295BarParVal ;
   private String[] P03WP4_A758ProCod ;
   private short[] P03WP4_A194BarOrdLin ;
   private short[] P03WP4_A1664ParFasCod ;
}

final  class prenfas2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WP2", "SELECT * FROM (SELECT BarCodPar, BarCodReo, BarCod, EmprCod, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03WP3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, FasQuiObs, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03WP4", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarParVal, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03WP5", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid, CliCod, DisDes) VALUES(?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

