package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calprd_dp extends GXProcedure
{
   public calprd_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_dp.class ), "" );
   }

   public calprd_dp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.SdtCalprd_SDT executeUdp( String aP0 ,
                                        long aP1 )
   {
      calprd_dp.this.aP2 = new app.SdtCalprd_SDT[] {new app.SdtCalprd_SDT()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        app.SdtCalprd_SDT[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             app.SdtCalprd_SDT[] aP2 )
   {
      calprd_dp.this.AV5Emprcod = aP0;
      calprd_dp.this.AV6AlbProcod = aP1;
      calprd_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002C2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Long.valueOf(AV6AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P002C2_A30AlbProCod[0] ;
         A396EmprCod = P002C2_A396EmprCod[0] ;
         A39AlbProPri = P002C2_A39AlbProPri[0] ;
         A33AlbProEst = P002C2_A33AlbProEst[0] ;
         A34AlbProfch = P002C2_A34AlbProfch[0] ;
         A4023AlbFecSal = P002C2_A4023AlbFecSal[0] ;
         A3865AlbHorSal = P002C2_A3865AlbHorSal[0] ;
         A7098AlbUsu = P002C2_A7098AlbUsu[0] ;
         A1243GuiRemCli = P002C2_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P002C2_A1244GuiRemCln[0] ;
         A3869AlbCliDes = P002C2_A3869AlbCliDes[0] ;
         A1259AlbDomEnv = P002C2_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = P002C2_n1259AlbDomEnv[0] ;
         A840TrnCod = P002C2_A840TrnCod[0] ;
         A841TrnNom = P002C2_A841TrnNom[0] ;
         n841TrnNom = P002C2_n841TrnNom[0] ;
         A3868AlbMat = P002C2_A3868AlbMat[0] ;
         A2242AlbSec = P002C2_A2242AlbSec[0] ;
         A5805AlbEnvFtp = P002C2_A5805AlbEnvFtp[0] ;
         A7101AlbLic = P002C2_A7101AlbLic[0] ;
         A10765AlbProAT = P002C2_A10765AlbProAT[0] ;
         A10019AlbHhfm = P002C2_A10019AlbHhfm[0] ;
         A10020AlbGrossT = P002C2_A10020AlbGrossT[0] ;
         A10837AlbTrnNc = P002C2_A10837AlbTrnNc[0] ;
         A10017AlbFmd = P002C2_A10017AlbFmd[0] ;
         n10017AlbFmd = P002C2_n10017AlbFmd[0] ;
         A10835AlbTrnNm = P002C2_A10835AlbTrnNm[0] ;
         A10018ALbFmdc = P002C2_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = P002C2_A10836AlbTrnDm[0] ;
         A5140AlbMarca = P002C2_A5140AlbMarca[0] ;
         A3867AlbLocDes = P002C2_A3867AlbLocDes[0] ;
         A3866AlbLocCar = P002C2_A3866AlbLocCar[0] ;
         A914AlbPObsCon = P002C2_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = P002C2_A5141AlbIvaCod[0] ;
         A7987AlbColCa = P002C2_A7987AlbColCa[0] ;
         A7162AlbDesp = P002C2_A7162AlbDesp[0] ;
         A7986AlbCambio = P002C2_A7986AlbCambio[0] ;
         A7985AlbTipDoc = P002C2_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = P002C2_A7984AlbMotTr[0] ;
         A5803AlbTipCal = P002C2_A5803AlbTipCal[0] ;
         A7988AlbObsCb = P002C2_A7988AlbObsCb[0] ;
         A7102AlbNumT = P002C2_A7102AlbNumT[0] ;
         A7100AlbMarCo = P002C2_A7100AlbMarCo[0] ;
         A7099AlbOComp = P002C2_A7099AlbOComp[0] ;
         A3643TrnNif = P002C2_A3643TrnNif[0] ;
         n3643TrnNif = P002C2_n3643TrnNif[0] ;
         A3093AlbDivTCod = P002C2_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = P002C2_n3093AlbDivTCod[0] ;
         A3109AlbDivAbr = P002C2_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = P002C2_n3109AlbDivAbr[0] ;
         A3108AlbDivCod = P002C2_A3108AlbDivCod[0] ;
         n3108AlbDivCod = P002C2_n3108AlbDivCod[0] ;
         A1253EmprGuiRem = P002C2_A1253EmprGuiRem[0] ;
         A1258GuiRemDom = P002C2_A1258GuiRemDom[0] ;
         n1258GuiRemDom = P002C2_n1258GuiRemDom[0] ;
         A3145GuiRemDivT = P002C2_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = P002C2_n3145GuiRemDivT[0] ;
         A3110GuiRemDiv = P002C2_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = P002C2_n3110GuiRemDiv[0] ;
         A407EmprNom = P002C2_A407EmprNom[0] ;
         n407EmprNom = P002C2_n407EmprNom[0] ;
         A1260BusDomEnv = P002C2_A1260BusDomEnv[0] ;
         n1260BusDomEnv = P002C2_n1260BusDomEnv[0] ;
         A407EmprNom = P002C2_A407EmprNom[0] ;
         n407EmprNom = P002C2_n407EmprNom[0] ;
         A841TrnNom = P002C2_A841TrnNom[0] ;
         n841TrnNom = P002C2_n841TrnNom[0] ;
         A3643TrnNif = P002C2_A3643TrnNif[0] ;
         n3643TrnNif = P002C2_n3643TrnNif[0] ;
         A3109AlbDivAbr = P002C2_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = P002C2_n3109AlbDivAbr[0] ;
         A1244GuiRemCln = P002C2_A1244GuiRemCln[0] ;
         A3145GuiRemDivT = P002C2_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = P002C2_n3145GuiRemDivT[0] ;
         A3110GuiRemDiv = P002C2_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = P002C2_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = P002C2_A1260BusDomEnv[0] ;
         n1260BusDomEnv = P002C2_n1260BusDomEnv[0] ;
         /* Using cursor P002C3 */
         pr_default.execute(1, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = P002C3_A841TrnNom[0] ;
         n841TrnNom = P002C3_n841TrnNom[0] ;
         A3643TrnNif = P002C3_A3643TrnNif[0] ;
         n3643TrnNif = P002C3_n3643TrnNif[0] ;
         pr_default.close(1);
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Emprcod( A396EmprCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albprocod( A30AlbProCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albpropri( A39AlbProPri );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albproest( A33AlbProEst );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albprofch( A34AlbProfch );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albfecsal( A4023AlbFecSal );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albhorsal( A3865AlbHorSal );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albusu( A7098AlbUsu );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Guiremcli( A1243GuiRemCli );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Guiremcln( A1244GuiRemCln );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albclides( A3869AlbCliDes );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albdomenv( A1259AlbDomEnv );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Trncod( A840TrnCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Trnnom( A841TrnNom );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albmat( A3868AlbMat );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albsec( A2242AlbSec );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albenvftp( A5805AlbEnvFtp );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Alblic( A7101AlbLic );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albproat( A10765AlbProAT );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albhhfm( A10019AlbHhfm );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albgrosst( A10020AlbGrossT );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albtrnnc( A10837AlbTrnNc );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albfmd( A10017AlbFmd );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albtrnnm( A10835AlbTrnNm );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albfmdc( A10018ALbFmdc );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albtrndm( A10836AlbTrnDm );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albmarca( A5140AlbMarca );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Alblocdes( A3867AlbLocDes );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albloccar( A3866AlbLocCar );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albpobscon( A914AlbPObsCon );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albivacod( A5141AlbIvaCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albcolca( A7987AlbColCa );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albdesp( A7162AlbDesp );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albcambio( A7986AlbCambio );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albtipdoc( A7985AlbTipDoc );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albmottr( A7984AlbMotTr );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albtipcal( A5803AlbTipCal );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albobscb( A7988AlbObsCb );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albnumt( A7102AlbNumT );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albmarco( A7100AlbMarCo );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albocomp( A7099AlbOComp );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Trnnif( A3643TrnNif );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albdivtcod( A3093AlbDivTCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albdivabr( A3109AlbDivAbr );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Albdivcod( A3108AlbDivCod );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Busdomenv( A1260BusDomEnv );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Emprguirem( A1253EmprGuiRem );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Guiremdom( A1258GuiRemDom );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Guiremdivt( A3145GuiRemDivT );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Guiremdiv( A3110GuiRemDiv );
         Gxm1calprd_sdt.setgxTv_SdtCalprd_SDT_Emprnom( A407EmprNom );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = calprd_dp.this.Gxm1calprd_sdt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1calprd_sdt = new app.SdtCalprd_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P002C2_A252CliCod = new int[1] ;
      P002C2_A266CliEnvLin = new byte[1] ;
      P002C2_A30AlbProCod = new long[1] ;
      P002C2_A396EmprCod = new String[] {""} ;
      P002C2_A39AlbProPri = new String[] {""} ;
      P002C2_A33AlbProEst = new byte[1] ;
      P002C2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P002C2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P002C2_A3865AlbHorSal = new String[] {""} ;
      P002C2_A7098AlbUsu = new String[] {""} ;
      P002C2_A1243GuiRemCli = new int[1] ;
      P002C2_A1244GuiRemCln = new String[] {""} ;
      P002C2_A3869AlbCliDes = new int[1] ;
      P002C2_A1259AlbDomEnv = new byte[1] ;
      P002C2_n1259AlbDomEnv = new boolean[] {false} ;
      P002C2_A840TrnCod = new short[1] ;
      P002C2_A841TrnNom = new String[] {""} ;
      P002C2_n841TrnNom = new boolean[] {false} ;
      P002C2_A3868AlbMat = new String[] {""} ;
      P002C2_A2242AlbSec = new String[] {""} ;
      P002C2_A5805AlbEnvFtp = new byte[1] ;
      P002C2_A7101AlbLic = new String[] {""} ;
      P002C2_A10765AlbProAT = new String[] {""} ;
      P002C2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P002C2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C2_A10837AlbTrnNc = new String[] {""} ;
      P002C2_A10017AlbFmd = new String[] {""} ;
      P002C2_n10017AlbFmd = new boolean[] {false} ;
      P002C2_A10835AlbTrnNm = new String[] {""} ;
      P002C2_A10018ALbFmdc = new String[] {""} ;
      P002C2_A10836AlbTrnDm = new String[] {""} ;
      P002C2_A5140AlbMarca = new String[] {""} ;
      P002C2_A3867AlbLocDes = new byte[1] ;
      P002C2_A3866AlbLocCar = new byte[1] ;
      P002C2_A914AlbPObsCon = new byte[1] ;
      P002C2_A5141AlbIvaCod = new String[] {""} ;
      P002C2_A7987AlbColCa = new String[] {""} ;
      P002C2_A7162AlbDesp = new int[1] ;
      P002C2_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C2_A7985AlbTipDoc = new int[1] ;
      P002C2_A7984AlbMotTr = new String[] {""} ;
      P002C2_A5803AlbTipCal = new byte[1] ;
      P002C2_A7988AlbObsCb = new String[] {""} ;
      P002C2_A7102AlbNumT = new long[1] ;
      P002C2_A7100AlbMarCo = new String[] {""} ;
      P002C2_A7099AlbOComp = new String[] {""} ;
      P002C2_A3643TrnNif = new String[] {""} ;
      P002C2_n3643TrnNif = new boolean[] {false} ;
      P002C2_A3093AlbDivTCod = new String[] {""} ;
      P002C2_n3093AlbDivTCod = new boolean[] {false} ;
      P002C2_A3109AlbDivAbr = new String[] {""} ;
      P002C2_n3109AlbDivAbr = new boolean[] {false} ;
      P002C2_A3108AlbDivCod = new byte[1] ;
      P002C2_n3108AlbDivCod = new boolean[] {false} ;
      P002C2_A1253EmprGuiRem = new String[] {""} ;
      P002C2_A1258GuiRemDom = new byte[1] ;
      P002C2_n1258GuiRemDom = new boolean[] {false} ;
      P002C2_A3145GuiRemDivT = new String[] {""} ;
      P002C2_n3145GuiRemDivT = new boolean[] {false} ;
      P002C2_A3110GuiRemDiv = new byte[1] ;
      P002C2_n3110GuiRemDiv = new boolean[] {false} ;
      P002C2_A407EmprNom = new String[] {""} ;
      P002C2_n407EmprNom = new boolean[] {false} ;
      P002C2_A1260BusDomEnv = new byte[1] ;
      P002C2_n1260BusDomEnv = new boolean[] {false} ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7098AlbUsu = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
      A3868AlbMat = "" ;
      A2242AlbSec = "" ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10837AlbTrnNc = "" ;
      A10017AlbFmd = "" ;
      A10835AlbTrnNm = "" ;
      A10018ALbFmdc = "" ;
      A10836AlbTrnDm = "" ;
      A5140AlbMarca = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      A3093AlbDivTCod = "" ;
      A3109AlbDivAbr = "" ;
      A1253EmprGuiRem = "" ;
      A3145GuiRemDivT = "" ;
      A407EmprNom = "" ;
      P002C3_A841TrnNom = new String[] {""} ;
      P002C3_n841TrnNom = new boolean[] {false} ;
      P002C3_A3643TrnNif = new String[] {""} ;
      P002C3_n3643TrnNif = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_dp__default(),
         new Object[] {
             new Object[] {
            P002C2_A252CliCod, P002C2_A266CliEnvLin, P002C2_A30AlbProCod, P002C2_A396EmprCod, P002C2_A39AlbProPri, P002C2_A33AlbProEst, P002C2_A34AlbProfch, P002C2_A4023AlbFecSal, P002C2_A3865AlbHorSal, P002C2_A7098AlbUsu,
            P002C2_A1243GuiRemCli, P002C2_A1244GuiRemCln, P002C2_A3869AlbCliDes, P002C2_A1259AlbDomEnv, P002C2_n1259AlbDomEnv, P002C2_A840TrnCod, P002C2_A841TrnNom, P002C2_n841TrnNom, P002C2_A3868AlbMat, P002C2_A2242AlbSec,
            P002C2_A5805AlbEnvFtp, P002C2_A7101AlbLic, P002C2_A10765AlbProAT, P002C2_A10019AlbHhfm, P002C2_A10020AlbGrossT, P002C2_A10837AlbTrnNc, P002C2_A10017AlbFmd, P002C2_n10017AlbFmd, P002C2_A10835AlbTrnNm, P002C2_A10018ALbFmdc,
            P002C2_A10836AlbTrnDm, P002C2_A5140AlbMarca, P002C2_A3867AlbLocDes, P002C2_A3866AlbLocCar, P002C2_A914AlbPObsCon, P002C2_A5141AlbIvaCod, P002C2_A7987AlbColCa, P002C2_A7162AlbDesp, P002C2_A7986AlbCambio, P002C2_A7985AlbTipDoc,
            P002C2_A7984AlbMotTr, P002C2_A5803AlbTipCal, P002C2_A7988AlbObsCb, P002C2_A7102AlbNumT, P002C2_A7100AlbMarCo, P002C2_A7099AlbOComp, P002C2_A3643TrnNif, P002C2_n3643TrnNif, P002C2_A3093AlbDivTCod, P002C2_n3093AlbDivTCod,
            P002C2_A3109AlbDivAbr, P002C2_n3109AlbDivAbr, P002C2_A3108AlbDivCod, P002C2_n3108AlbDivCod, P002C2_A1253EmprGuiRem, P002C2_A1258GuiRemDom, P002C2_n1258GuiRemDom, P002C2_A3145GuiRemDivT, P002C2_n3145GuiRemDivT, P002C2_A3110GuiRemDiv,
            P002C2_n3110GuiRemDiv, P002C2_A407EmprNom, P002C2_n407EmprNom, P002C2_A1260BusDomEnv, P002C2_n1260BusDomEnv
            }
            , new Object[] {
            P002C3_A841TrnNom, P002C3_n841TrnNom, P002C3_A3643TrnNif, P002C3_n3643TrnNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A1259AlbDomEnv ;
   private byte A5805AlbEnvFtp ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A3108AlbDivCod ;
   private byte A1258GuiRemDom ;
   private byte A3110GuiRemDiv ;
   private byte A1260BusDomEnv ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int A7162AlbDesp ;
   private int A7985AlbTipDoc ;
   private long AV6AlbProcod ;
   private long A30AlbProCod ;
   private long A7102AlbNumT ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A3865AlbHorSal ;
   private String A7098AlbUsu ;
   private String A1244GuiRemCln ;
   private String A841TrnNom ;
   private String A3868AlbMat ;
   private String A2242AlbSec ;
   private String A7101AlbLic ;
   private String A10765AlbProAT ;
   private String A10837AlbTrnNc ;
   private String A10835AlbTrnNm ;
   private String A10018ALbFmdc ;
   private String A10836AlbTrnDm ;
   private String A5140AlbMarca ;
   private String A5141AlbIvaCod ;
   private String A7987AlbColCa ;
   private String A7984AlbMotTr ;
   private String A7988AlbObsCb ;
   private String A7100AlbMarCo ;
   private String A7099AlbOComp ;
   private String A3643TrnNif ;
   private String A3093AlbDivTCod ;
   private String A3109AlbDivAbr ;
   private String A1253EmprGuiRem ;
   private String A3145GuiRemDivT ;
   private String A407EmprNom ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean n1259AlbDomEnv ;
   private boolean n841TrnNom ;
   private boolean n10017AlbFmd ;
   private boolean n3643TrnNif ;
   private boolean n3093AlbDivTCod ;
   private boolean n3109AlbDivAbr ;
   private boolean n3108AlbDivCod ;
   private boolean n1258GuiRemDom ;
   private boolean n3145GuiRemDivT ;
   private boolean n3110GuiRemDiv ;
   private boolean n407EmprNom ;
   private boolean n1260BusDomEnv ;
   private String A10017AlbFmd ;
   private app.SdtCalprd_SDT[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P002C2_A252CliCod ;
   private byte[] P002C2_A266CliEnvLin ;
   private long[] P002C2_A30AlbProCod ;
   private String[] P002C2_A396EmprCod ;
   private String[] P002C2_A39AlbProPri ;
   private byte[] P002C2_A33AlbProEst ;
   private java.util.Date[] P002C2_A34AlbProfch ;
   private java.util.Date[] P002C2_A4023AlbFecSal ;
   private String[] P002C2_A3865AlbHorSal ;
   private String[] P002C2_A7098AlbUsu ;
   private int[] P002C2_A1243GuiRemCli ;
   private String[] P002C2_A1244GuiRemCln ;
   private int[] P002C2_A3869AlbCliDes ;
   private byte[] P002C2_A1259AlbDomEnv ;
   private boolean[] P002C2_n1259AlbDomEnv ;
   private short[] P002C2_A840TrnCod ;
   private String[] P002C2_A841TrnNom ;
   private boolean[] P002C2_n841TrnNom ;
   private String[] P002C2_A3868AlbMat ;
   private String[] P002C2_A2242AlbSec ;
   private byte[] P002C2_A5805AlbEnvFtp ;
   private String[] P002C2_A7101AlbLic ;
   private String[] P002C2_A10765AlbProAT ;
   private java.util.Date[] P002C2_A10019AlbHhfm ;
   private java.math.BigDecimal[] P002C2_A10020AlbGrossT ;
   private String[] P002C2_A10837AlbTrnNc ;
   private String[] P002C2_A10017AlbFmd ;
   private boolean[] P002C2_n10017AlbFmd ;
   private String[] P002C2_A10835AlbTrnNm ;
   private String[] P002C2_A10018ALbFmdc ;
   private String[] P002C2_A10836AlbTrnDm ;
   private String[] P002C2_A5140AlbMarca ;
   private byte[] P002C2_A3867AlbLocDes ;
   private byte[] P002C2_A3866AlbLocCar ;
   private byte[] P002C2_A914AlbPObsCon ;
   private String[] P002C2_A5141AlbIvaCod ;
   private String[] P002C2_A7987AlbColCa ;
   private int[] P002C2_A7162AlbDesp ;
   private java.math.BigDecimal[] P002C2_A7986AlbCambio ;
   private int[] P002C2_A7985AlbTipDoc ;
   private String[] P002C2_A7984AlbMotTr ;
   private byte[] P002C2_A5803AlbTipCal ;
   private String[] P002C2_A7988AlbObsCb ;
   private long[] P002C2_A7102AlbNumT ;
   private String[] P002C2_A7100AlbMarCo ;
   private String[] P002C2_A7099AlbOComp ;
   private String[] P002C2_A3643TrnNif ;
   private boolean[] P002C2_n3643TrnNif ;
   private String[] P002C2_A3093AlbDivTCod ;
   private boolean[] P002C2_n3093AlbDivTCod ;
   private String[] P002C2_A3109AlbDivAbr ;
   private boolean[] P002C2_n3109AlbDivAbr ;
   private byte[] P002C2_A3108AlbDivCod ;
   private boolean[] P002C2_n3108AlbDivCod ;
   private String[] P002C2_A1253EmprGuiRem ;
   private byte[] P002C2_A1258GuiRemDom ;
   private boolean[] P002C2_n1258GuiRemDom ;
   private String[] P002C2_A3145GuiRemDivT ;
   private boolean[] P002C2_n3145GuiRemDivT ;
   private byte[] P002C2_A3110GuiRemDiv ;
   private boolean[] P002C2_n3110GuiRemDiv ;
   private String[] P002C2_A407EmprNom ;
   private boolean[] P002C2_n407EmprNom ;
   private byte[] P002C2_A1260BusDomEnv ;
   private boolean[] P002C2_n1260BusDomEnv ;
   private String[] P002C3_A841TrnNom ;
   private boolean[] P002C3_n841TrnNom ;
   private String[] P002C3_A3643TrnNif ;
   private boolean[] P002C3_n3643TrnNif ;
   private app.SdtCalprd_SDT Gxm1calprd_sdt ;
}

final  class calprd_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002C2", "SELECT T6.CliCod, T6.CliEnvLin, T1.AlbProCod, T1.EmprCod, T1.AlbProPri, T1.AlbProEst, T1.AlbProfch, T1.AlbFecSal, T1.AlbHorSal, T1.AlbUsu, T1.GuiRemCli AS GuiRemCli, T5.CliNom AS GuiRemCln, T1.AlbCliDes, T1.AlbDomEnv, T1.TrnCod, T3.TrnNom, T1.AlbMat, T1.AlbSec, T1.AlbEnvFtp, T1.AlbLic, T1.AlbProAT, T1.AlbHhfm, T1.AlbGrossT, T1.AlbTrnNc, T1.AlbFmd, T1.AlbTrnNm, T1.ALbFmdc, T1.AlbTrnDm, T1.AlbMarca, T1.AlbLocDes, T1.AlbLocCar, T1.AlbPObsCon, T1.AlbIvaCod, T1.AlbColCa, T1.AlbDesp, T1.AlbCambio, T1.AlbTipDoc, T1.AlbMotTr, T1.AlbTipCal, T1.AlbObsCb, T1.AlbNumT, T1.AlbMarCo, T1.AlbOComp, T3.TrnNif, T1.AlbDivTCod, T4.DivAbr AS AlbDivAbr, T1.AlbDivCod AS AlbDivCod, T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemDom, T5.CliDivTra AS GuiRemDivT, T5.CliDivCod AS GuiRemDiv, T2.EmprNom, COALESCE( T6.CliEnvLin, 0) AS BusDomEnv FROM (((((TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPDIVISA T4 ON T4.DivCod = T1.AlbDivCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprGuiRem AND T5.CliCod = T1.GuiRemCli) LEFT JOIN TXPCLIENV T6 ON T6.EmprCod = T1.EmprGuiRem AND T6.CliCod = T1.GuiRemCli AND T6.CliEnvLin = T1.AlbDomEnv) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002C3", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(22);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[25])[0] = rslt.getString(24, 20);
               ((String[]) buf[26])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(26, 60);
               ((String[]) buf[29])[0] = rslt.getString(27, 255);
               ((String[]) buf[30])[0] = rslt.getString(28, 60);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((byte[]) buf[33])[0] = rslt.getByte(31);
               ((byte[]) buf[34])[0] = rslt.getByte(32);
               ((String[]) buf[35])[0] = rslt.getString(33, 3);
               ((String[]) buf[36])[0] = rslt.getString(34, 20);
               ((int[]) buf[37])[0] = rslt.getInt(35);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(36,4);
               ((int[]) buf[39])[0] = rslt.getInt(37);
               ((String[]) buf[40])[0] = rslt.getString(38, 25);
               ((byte[]) buf[41])[0] = rslt.getByte(39);
               ((String[]) buf[42])[0] = rslt.getString(40, 60);
               ((long[]) buf[43])[0] = rslt.getLong(41);
               ((String[]) buf[44])[0] = rslt.getString(42, 30);
               ((String[]) buf[45])[0] = rslt.getString(43, 30);
               ((String[]) buf[46])[0] = rslt.getString(44, 20);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(47);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(48, 3);
               ((byte[]) buf[55])[0] = rslt.getByte(49);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(51);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(52, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(53);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

