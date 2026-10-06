package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_bc extends GXWebPanel implements IGxSilentTrn
{
   public tarticu_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticu_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_bc.class ));
   }

   public tarticu_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0810( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0810( ) ;
      standaloneModal( ) ;
      addRow0810( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e11082 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z252CliCod = A252CliCod ;
            Z65ArtCod = A65ArtCod ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_080( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0810( ) ;
         }
         else
         {
            checkExtendedTable0810( ) ;
            if ( AnyError == 0 )
            {
               zm0810( 21) ;
               zm0810( 22) ;
               zm0810( 23) ;
               zm0810( 24) ;
               zm0810( 25) ;
               zm0810( 26) ;
               zm0810( 27) ;
               zm0810( 28) ;
            }
            closeExtendedTableCursors0810( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e12082( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticu_bc.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      GXv_char2[0] = AV57EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticu_bc.this.AV57EmprCod = GXv_char2[0] ;
      tarticu_bc.this.AV16EmprNom = GXv_char3[0] ;
      tarticu_bc.this.AV17UsurCod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV199WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV199WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV200TrnContext.fromxml(AV201WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV200TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV221Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV222GXV1 = 1 ;
         while ( AV222GXV1 <= AV200TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV208TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV200TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV222GXV1));
            if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipArtCod") == 0 )
            {
               AV202Insert_TipArtCod = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ClasCod") == 0 )
            {
               AV203Insert_ClasCod = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ClaTubCod") == 0 )
            {
               AV204Insert_ClaTubCod = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ClaBolCod") == 0 )
            {
               AV205Insert_ClaBolCod = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ArtTh") == 0 )
            {
               AV206Insert_ArtTh = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "Art_Cd") == 0 )
            {
               AV207Insert_Art_Cd = (short)(GXutil.lval( AV208TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            AV222GXV1 = (int)(AV222GXV1+1) ;
         }
      }
      GXt_int6 = AV139Tintutex ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV57EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int7) ;
      tarticu_bc.this.GXt_int6 = GXv_int7[0] ;
      AV139Tintutex = GXt_int6 ;
      GXt_int6 = AV76FecFMa ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV57EmprCod, httpContext.getMessage( "FECFMA", ""), GXv_int7) ;
      tarticu_bc.this.GXt_int6 = GXv_int7[0] ;
      AV76FecFMa = GXt_int6 ;
      AV218ArtFecMod = Gx_date ;
   }

   public void e11082( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         httpContext.popup(formatLink("app.tarticu_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A69ArtDsc))}, new String[] {"Emprcod","CliCod","CliNom","ArtCod","ArtDsc"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV200TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tarticu_ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm0810( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         Z66ArtCorOri = A66ArtCorOri ;
         Z70ArtEncOri = A70ArtEncOri ;
         Z4353ArtUsrCod = A4353ArtUsrCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z5335ArtCodExt = A5335ArtCodExt ;
         Z87ArtMat = A87ArtMat ;
         Z1148ArtPml = A1148ArtPml ;
         Z78ArtGraCru = A78ArtGraCru ;
         Z68ArtCruMin = A68ArtCruMin ;
         Z67ArtCruMax = A67ArtCruMax ;
         Z63ArtAcaMin = A63ArtAcaMin ;
         Z62ArtAcaMax = A62ArtAcaMax ;
         Z95ArtRen = A95ArtRen ;
         Z101ArtTipPle = A101ArtTipPle ;
         Z100ArtTipLar = A100ArtTipLar ;
         Z96ArtSua = A96ArtSua ;
         Z64ArtAcaQui = A64ArtAcaQui ;
         Z73ArtEti = A73ArtEti ;
         Z117ArtUrg = A117ArtUrg ;
         Z88ArtMer = A88ArtMer ;
         Z105ArtTra1 = A105ArtTra1 ;
         Z106ArtTra2 = A106ArtTra2 ;
         Z107ArtTra3 = A107ArtTra3 ;
         Z108ArtTraP1 = A108ArtTraP1 ;
         Z109ArtTraP2 = A109ArtTraP2 ;
         Z110ArtTraP3 = A110ArtTraP3 ;
         Z111ArtUrd1 = A111ArtUrd1 ;
         Z112ArtUrd2 = A112ArtUrd2 ;
         Z113ArtUrd3 = A113ArtUrd3 ;
         Z114ArtUrdP1 = A114ArtUrdP1 ;
         Z115ArtUrdP2 = A115ArtUrdP2 ;
         Z116ArtUrdP3 = A116ArtUrdP3 ;
         Z1229ArtEncCom = A1229ArtEncCom ;
         Z1230ArtEncAnh = A1230ArtEncAnh ;
         Z1903ArtGraAca = A1903ArtGraAca ;
         Z1905ArtRdoA = A1905ArtRdoA ;
         Z1904ArtRdoN = A1904ArtRdoN ;
         Z2791ArtFacAbs = A2791ArtFacAbs ;
         Z2834ArtPle2 = A2834ArtPle2 ;
         Z3121ArtNumCor = A3121ArtNumCor ;
         Z3122ArtAncSal1 = A3122ArtAncSal1 ;
         Z3123ArtAncSal2 = A3123ArtAncSal2 ;
         Z3124ArtAncSal3 = A3124ArtAncSal3 ;
         Z3125ArtGraAca2 = A3125ArtGraAca2 ;
         Z3126ArtGraCru2 = A3126ArtGraCru2 ;
         Z4297ArtPmPPza = A4297ArtPmPPza ;
         Z3683ArtFecCre = A3683ArtFecCre ;
         Z4354ArtFecMod = A4354ArtFecMod ;
         Z5741ArtComer = A5741ArtComer ;
         Z6435ArtRdoCru1 = A6435ArtRdoCru1 ;
         Z6436ArtRdoCru2 = A6436ArtRdoCru2 ;
         Z967ArtNMtr = A967ArtNMtr ;
         Z6462ArtLu = A6462ArtLu ;
         Z4607ArtRb = A4607ArtRb ;
         Z4444ArtPelAnh = A4444ArtPelAnh ;
         Z7412Artgrm2Sc = A7412Artgrm2Sc ;
         Z7413ArtPmlSc = A7413ArtPmlSc ;
         Z7414ArtAncSc = A7414ArtAncSc ;
         Z7415ArtPmlCru = A7415ArtPmlCru ;
         Z7777ArtRdtSc = A7777ArtRdtSc ;
         Z7778ArtUnd = A7778ArtUnd ;
         Z7779ArtBlo = A7779ArtBlo ;
         Z7948ArtCla = A7948ArtCla ;
         Z9730ArtFabsH = A9730ArtFabsH ;
         Z9801ArtFabsT = A9801ArtFabsT ;
         Z9875ArtNProg = A9875ArtNProg ;
         Z9902ArtVbd = A9902ArtVbd ;
         Z9903ArtVbn = A9903ArtVbn ;
         Z9904ArtAb = A9904ArtAb ;
         Z397ArtObsGrm = A397ArtObsGrm ;
         Z398ArtObsAnc = A398ArtObsAnc ;
         Z4980ArtCdb = A4980ArtCdb ;
         Z10027ArtGalga = A10027ArtGalga ;
         Z10028ArtPlatina = A10028ArtPlatina ;
         Z10029ArtPgd = A10029ArtPgd ;
         Z10804ArtHilos = A10804ArtHilos ;
         Z10805ArtPasad = A10805ArtPasad ;
         Z10831ArtAncC = A10831ArtAncC ;
         Z10832ArtGrm2C = A10832ArtGrm2C ;
         Z10833ArtRdoC = A10833ArtRdoC ;
         Z4455ArtAcaFor = A4455ArtAcaFor ;
         Z3682ArtAnu = A3682ArtAnu ;
         Z11627ArtFacUti = A11627ArtFacUti ;
         Z1581ArtNumTip = A1581ArtNumTip ;
         Z12364ArtMT = A12364ArtMT ;
         Z12365ArtTRabs = A12365ArtTRabs ;
         Z12366ArtKgMn = A12366ArtKgMn ;
         Z4446ArtAcaMar = A4446ArtAcaMar ;
         Z4447ArtAcaBak = A4447ArtAcaBak ;
         Z12695ArtElgAnc = A12695ArtElgAnc ;
         Z12696ArtElgLar = A12696ArtElgLar ;
         Z12697ArtRdoCru = A12697ArtRdoCru ;
         Z12698ArtEncLarg = A12698ArtEncLarg ;
         Z12699ArtEncAnc = A12699ArtEncAnc ;
         Z14099ArtRdto4 = A14099ArtRdto4 ;
         Z14100Artdsc2 = A14100Artdsc2 ;
         Z14101ArtgrComp = A14101ArtgrComp ;
         Z14102ArtKgspp = A14102ArtKgspp ;
         Z14103ArtPrepp = A14103ArtPrepp ;
         Z90ArtObsFac = A90ArtObsFac ;
         Z12886ArtObsOtra = A12886ArtObsOtra ;
         Z14295ArtActivo = A14295ArtActivo ;
         Z829TipArtCod = A829TipArtCod ;
         Z10030ArtTh = A10030ArtTh ;
         Z4295ClasCod = A4295ClasCod ;
         Z6108ClaBolCod = A6108ClaBolCod ;
         Z6106ClaTubCod = A6106ClaTubCod ;
         Z10379Art_Cd = A10379Art_Cd ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z272CliEti = A272CliEti ;
         Z306CliUrg = A306CliUrg ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         Z830TipArtDsc = A830TipArtDsc ;
         Z6014TipArtDsc2 = A6014TipArtDsc2 ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         Z10031ArtThN = A10031ArtThN ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         Z4296ClasDsc = A4296ClasDsc ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         Z6109ClaBolDsc = A6109ClaBolDsc ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         Z6107ClaTubDsc = A6107ClaTubDsc ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         Z10380Art_Dc = A10380Art_Dc ;
         Z13751ArtCDsc = A13751ArtCDsc ;
      }
      if ( GX_JID == -20 )
      {
         Z4447ArtAcaBak = A4447ArtAcaBak ;
         Z12695ArtElgAnc = A12695ArtElgAnc ;
         Z12696ArtElgLar = A12696ArtElgLar ;
         Z12697ArtRdoCru = A12697ArtRdoCru ;
         Z12698ArtEncLarg = A12698ArtEncLarg ;
         Z12699ArtEncAnc = A12699ArtEncAnc ;
         Z14099ArtRdto4 = A14099ArtRdto4 ;
         Z14100Artdsc2 = A14100Artdsc2 ;
         Z14101ArtgrComp = A14101ArtgrComp ;
         Z14102ArtKgspp = A14102ArtKgspp ;
         Z14103ArtPrepp = A14103ArtPrepp ;
         Z3072ArtObsLon = A3072ArtObsLon ;
         Z90ArtObsFac = A90ArtObsFac ;
         Z12886ArtObsOtra = A12886ArtObsOtra ;
         Z14295ArtActivo = A14295ArtActivo ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z829TipArtCod = A829TipArtCod ;
         Z10030ArtTh = A10030ArtTh ;
         Z4295ClasCod = A4295ClasCod ;
         Z6108ClaBolCod = A6108ClaBolCod ;
         Z6106ClaTubCod = A6106ClaTubCod ;
         Z10379Art_Cd = A10379Art_Cd ;
         Z65ArtCod = A65ArtCod ;
         Z66ArtCorOri = A66ArtCorOri ;
         Z70ArtEncOri = A70ArtEncOri ;
         Z4353ArtUsrCod = A4353ArtUsrCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z5335ArtCodExt = A5335ArtCodExt ;
         Z87ArtMat = A87ArtMat ;
         Z1148ArtPml = A1148ArtPml ;
         Z78ArtGraCru = A78ArtGraCru ;
         Z68ArtCruMin = A68ArtCruMin ;
         Z67ArtCruMax = A67ArtCruMax ;
         Z63ArtAcaMin = A63ArtAcaMin ;
         Z62ArtAcaMax = A62ArtAcaMax ;
         Z95ArtRen = A95ArtRen ;
         Z101ArtTipPle = A101ArtTipPle ;
         Z100ArtTipLar = A100ArtTipLar ;
         Z96ArtSua = A96ArtSua ;
         Z64ArtAcaQui = A64ArtAcaQui ;
         Z73ArtEti = A73ArtEti ;
         Z117ArtUrg = A117ArtUrg ;
         Z88ArtMer = A88ArtMer ;
         Z105ArtTra1 = A105ArtTra1 ;
         Z106ArtTra2 = A106ArtTra2 ;
         Z107ArtTra3 = A107ArtTra3 ;
         Z108ArtTraP1 = A108ArtTraP1 ;
         Z109ArtTraP2 = A109ArtTraP2 ;
         Z110ArtTraP3 = A110ArtTraP3 ;
         Z111ArtUrd1 = A111ArtUrd1 ;
         Z112ArtUrd2 = A112ArtUrd2 ;
         Z113ArtUrd3 = A113ArtUrd3 ;
         Z114ArtUrdP1 = A114ArtUrdP1 ;
         Z115ArtUrdP2 = A115ArtUrdP2 ;
         Z116ArtUrdP3 = A116ArtUrdP3 ;
         Z1229ArtEncCom = A1229ArtEncCom ;
         Z1230ArtEncAnh = A1230ArtEncAnh ;
         Z1903ArtGraAca = A1903ArtGraAca ;
         Z1905ArtRdoA = A1905ArtRdoA ;
         Z1904ArtRdoN = A1904ArtRdoN ;
         Z2791ArtFacAbs = A2791ArtFacAbs ;
         Z2834ArtPle2 = A2834ArtPle2 ;
         Z3121ArtNumCor = A3121ArtNumCor ;
         Z3122ArtAncSal1 = A3122ArtAncSal1 ;
         Z3123ArtAncSal2 = A3123ArtAncSal2 ;
         Z3124ArtAncSal3 = A3124ArtAncSal3 ;
         Z3125ArtGraAca2 = A3125ArtGraAca2 ;
         Z3126ArtGraCru2 = A3126ArtGraCru2 ;
         Z4297ArtPmPPza = A4297ArtPmPPza ;
         Z3683ArtFecCre = A3683ArtFecCre ;
         Z4354ArtFecMod = A4354ArtFecMod ;
         Z5741ArtComer = A5741ArtComer ;
         Z6435ArtRdoCru1 = A6435ArtRdoCru1 ;
         Z6436ArtRdoCru2 = A6436ArtRdoCru2 ;
         Z967ArtNMtr = A967ArtNMtr ;
         Z6462ArtLu = A6462ArtLu ;
         Z4607ArtRb = A4607ArtRb ;
         Z4444ArtPelAnh = A4444ArtPelAnh ;
         Z7412Artgrm2Sc = A7412Artgrm2Sc ;
         Z7413ArtPmlSc = A7413ArtPmlSc ;
         Z7414ArtAncSc = A7414ArtAncSc ;
         Z7415ArtPmlCru = A7415ArtPmlCru ;
         Z7777ArtRdtSc = A7777ArtRdtSc ;
         Z7778ArtUnd = A7778ArtUnd ;
         Z7779ArtBlo = A7779ArtBlo ;
         Z7948ArtCla = A7948ArtCla ;
         Z9730ArtFabsH = A9730ArtFabsH ;
         Z9801ArtFabsT = A9801ArtFabsT ;
         Z9875ArtNProg = A9875ArtNProg ;
         Z9902ArtVbd = A9902ArtVbd ;
         Z9903ArtVbn = A9903ArtVbn ;
         Z9904ArtAb = A9904ArtAb ;
         Z397ArtObsGrm = A397ArtObsGrm ;
         Z398ArtObsAnc = A398ArtObsAnc ;
         Z4980ArtCdb = A4980ArtCdb ;
         Z10027ArtGalga = A10027ArtGalga ;
         Z10028ArtPlatina = A10028ArtPlatina ;
         Z10029ArtPgd = A10029ArtPgd ;
         Z10804ArtHilos = A10804ArtHilos ;
         Z10805ArtPasad = A10805ArtPasad ;
         Z10831ArtAncC = A10831ArtAncC ;
         Z10832ArtGrm2C = A10832ArtGrm2C ;
         Z10833ArtRdoC = A10833ArtRdoC ;
         Z4455ArtAcaFor = A4455ArtAcaFor ;
         Z3682ArtAnu = A3682ArtAnu ;
         Z11627ArtFacUti = A11627ArtFacUti ;
         Z1581ArtNumTip = A1581ArtNumTip ;
         Z12364ArtMT = A12364ArtMT ;
         Z12365ArtTRabs = A12365ArtTRabs ;
         Z12366ArtKgMn = A12366ArtKgMn ;
         Z4446ArtAcaMar = A4446ArtAcaMar ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z272CliEti = A272CliEti ;
         Z306CliUrg = A306CliUrg ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z6014TipArtDsc2 = A6014TipArtDsc2 ;
         Z4296ClasDsc = A4296ClasDsc ;
         Z6107ClaTubDsc = A6107ClaTubDsc ;
         Z6109ClaBolDsc = A6109ClaBolDsc ;
         Z10031ArtThN = A10031ArtThN ;
         Z10380Art_Dc = A10380Art_Dc ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_date = GXutil.today( ) ;
      AV221Pgmname = "TARTICU_BC" ;
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A4353ArtUsrCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A4353ArtUsrCod = AV17UsurCod ;
         n4353ArtUsrCod = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A73ArtEti)==0) && ( Gx_BScreen == 0 ) )
      {
         A73ArtEti = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n73ArtEti = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3683ArtFecCre)) && ( Gx_BScreen == 0 ) )
      {
         A3683ArtFecCre = GXutil.today( ) ;
         n3683ArtFecCre = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A7779ArtBlo)==0) && ( Gx_BScreen == 0 ) )
      {
         A7779ArtBlo = "*" ;
         n7779ArtBlo = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A14295ArtActivo)==0) && ( Gx_BScreen == 0 ) )
      {
         A14295ArtActivo = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV217Artusrcod = O4353ArtUsrCod ;
      }
   }

   public void load0810( )
   {
      /* Using cursor BC000812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = BC000812_A3072ArtObsLon[0] ;
         n3072ArtObsLon = BC000812_n3072ArtObsLon[0] ;
         A4447ArtAcaBak = BC000812_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = BC000812_n4447ArtAcaBak[0] ;
         A12695ArtElgAnc = BC000812_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = BC000812_n12695ArtElgAnc[0] ;
         A12696ArtElgLar = BC000812_A12696ArtElgLar[0] ;
         n12696ArtElgLar = BC000812_n12696ArtElgLar[0] ;
         A12697ArtRdoCru = BC000812_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = BC000812_n12697ArtRdoCru[0] ;
         A12698ArtEncLarg = BC000812_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = BC000812_n12698ArtEncLarg[0] ;
         A12699ArtEncAnc = BC000812_A12699ArtEncAnc[0] ;
         n12699ArtEncAnc = BC000812_n12699ArtEncAnc[0] ;
         A14099ArtRdto4 = BC000812_A14099ArtRdto4[0] ;
         n14099ArtRdto4 = BC000812_n14099ArtRdto4[0] ;
         A14100Artdsc2 = BC000812_A14100Artdsc2[0] ;
         n14100Artdsc2 = BC000812_n14100Artdsc2[0] ;
         A14101ArtgrComp = BC000812_A14101ArtgrComp[0] ;
         n14101ArtgrComp = BC000812_n14101ArtgrComp[0] ;
         A14102ArtKgspp = BC000812_A14102ArtKgspp[0] ;
         n14102ArtKgspp = BC000812_n14102ArtKgspp[0] ;
         A14103ArtPrepp = BC000812_A14103ArtPrepp[0] ;
         n14103ArtPrepp = BC000812_n14103ArtPrepp[0] ;
         A90ArtObsFac = BC000812_A90ArtObsFac[0] ;
         n90ArtObsFac = BC000812_n90ArtObsFac[0] ;
         A12886ArtObsOtra = BC000812_A12886ArtObsOtra[0] ;
         n12886ArtObsOtra = BC000812_n12886ArtObsOtra[0] ;
         A14295ArtActivo = BC000812_A14295ArtActivo[0] ;
         A829TipArtCod = BC000812_A829TipArtCod[0] ;
         A10030ArtTh = BC000812_A10030ArtTh[0] ;
         n10030ArtTh = BC000812_n10030ArtTh[0] ;
         A4295ClasCod = BC000812_A4295ClasCod[0] ;
         n4295ClasCod = BC000812_n4295ClasCod[0] ;
         A6108ClaBolCod = BC000812_A6108ClaBolCod[0] ;
         n6108ClaBolCod = BC000812_n6108ClaBolCod[0] ;
         A6106ClaTubCod = BC000812_A6106ClaTubCod[0] ;
         n6106ClaTubCod = BC000812_n6106ClaTubCod[0] ;
         A10379Art_Cd = BC000812_A10379Art_Cd[0] ;
         n10379Art_Cd = BC000812_n10379Art_Cd[0] ;
         A66ArtCorOri = BC000812_A66ArtCorOri[0] ;
         n66ArtCorOri = BC000812_n66ArtCorOri[0] ;
         A70ArtEncOri = BC000812_A70ArtEncOri[0] ;
         n70ArtEncOri = BC000812_n70ArtEncOri[0] ;
         A4353ArtUsrCod = BC000812_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = BC000812_n4353ArtUsrCod[0] ;
         A69ArtDsc = BC000812_A69ArtDsc[0] ;
         n69ArtDsc = BC000812_n69ArtDsc[0] ;
         A279CliNom = BC000812_A279CliNom[0] ;
         A5335ArtCodExt = BC000812_A5335ArtCodExt[0] ;
         n5335ArtCodExt = BC000812_n5335ArtCodExt[0] ;
         A407EmprNom = BC000812_A407EmprNom[0] ;
         n407EmprNom = BC000812_n407EmprNom[0] ;
         A87ArtMat = BC000812_A87ArtMat[0] ;
         n87ArtMat = BC000812_n87ArtMat[0] ;
         A830TipArtDsc = BC000812_A830TipArtDsc[0] ;
         n830TipArtDsc = BC000812_n830TipArtDsc[0] ;
         A1148ArtPml = BC000812_A1148ArtPml[0] ;
         n1148ArtPml = BC000812_n1148ArtPml[0] ;
         A78ArtGraCru = BC000812_A78ArtGraCru[0] ;
         n78ArtGraCru = BC000812_n78ArtGraCru[0] ;
         A68ArtCruMin = BC000812_A68ArtCruMin[0] ;
         n68ArtCruMin = BC000812_n68ArtCruMin[0] ;
         A67ArtCruMax = BC000812_A67ArtCruMax[0] ;
         n67ArtCruMax = BC000812_n67ArtCruMax[0] ;
         A63ArtAcaMin = BC000812_A63ArtAcaMin[0] ;
         n63ArtAcaMin = BC000812_n63ArtAcaMin[0] ;
         A62ArtAcaMax = BC000812_A62ArtAcaMax[0] ;
         n62ArtAcaMax = BC000812_n62ArtAcaMax[0] ;
         A95ArtRen = BC000812_A95ArtRen[0] ;
         n95ArtRen = BC000812_n95ArtRen[0] ;
         A101ArtTipPle = BC000812_A101ArtTipPle[0] ;
         n101ArtTipPle = BC000812_n101ArtTipPle[0] ;
         A100ArtTipLar = BC000812_A100ArtTipLar[0] ;
         n100ArtTipLar = BC000812_n100ArtTipLar[0] ;
         A96ArtSua = BC000812_A96ArtSua[0] ;
         n96ArtSua = BC000812_n96ArtSua[0] ;
         A64ArtAcaQui = BC000812_A64ArtAcaQui[0] ;
         n64ArtAcaQui = BC000812_n64ArtAcaQui[0] ;
         A73ArtEti = BC000812_A73ArtEti[0] ;
         n73ArtEti = BC000812_n73ArtEti[0] ;
         A272CliEti = BC000812_A272CliEti[0] ;
         A306CliUrg = BC000812_A306CliUrg[0] ;
         A117ArtUrg = BC000812_A117ArtUrg[0] ;
         n117ArtUrg = BC000812_n117ArtUrg[0] ;
         A88ArtMer = BC000812_A88ArtMer[0] ;
         n88ArtMer = BC000812_n88ArtMer[0] ;
         A105ArtTra1 = BC000812_A105ArtTra1[0] ;
         n105ArtTra1 = BC000812_n105ArtTra1[0] ;
         A106ArtTra2 = BC000812_A106ArtTra2[0] ;
         n106ArtTra2 = BC000812_n106ArtTra2[0] ;
         A107ArtTra3 = BC000812_A107ArtTra3[0] ;
         n107ArtTra3 = BC000812_n107ArtTra3[0] ;
         A108ArtTraP1 = BC000812_A108ArtTraP1[0] ;
         n108ArtTraP1 = BC000812_n108ArtTraP1[0] ;
         A109ArtTraP2 = BC000812_A109ArtTraP2[0] ;
         n109ArtTraP2 = BC000812_n109ArtTraP2[0] ;
         A110ArtTraP3 = BC000812_A110ArtTraP3[0] ;
         n110ArtTraP3 = BC000812_n110ArtTraP3[0] ;
         A111ArtUrd1 = BC000812_A111ArtUrd1[0] ;
         n111ArtUrd1 = BC000812_n111ArtUrd1[0] ;
         A112ArtUrd2 = BC000812_A112ArtUrd2[0] ;
         n112ArtUrd2 = BC000812_n112ArtUrd2[0] ;
         A113ArtUrd3 = BC000812_A113ArtUrd3[0] ;
         n113ArtUrd3 = BC000812_n113ArtUrd3[0] ;
         A114ArtUrdP1 = BC000812_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = BC000812_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = BC000812_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = BC000812_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = BC000812_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = BC000812_n116ArtUrdP3[0] ;
         A1229ArtEncCom = BC000812_A1229ArtEncCom[0] ;
         n1229ArtEncCom = BC000812_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = BC000812_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = BC000812_n1230ArtEncAnh[0] ;
         A1903ArtGraAca = BC000812_A1903ArtGraAca[0] ;
         n1903ArtGraAca = BC000812_n1903ArtGraAca[0] ;
         A1905ArtRdoA = BC000812_A1905ArtRdoA[0] ;
         n1905ArtRdoA = BC000812_n1905ArtRdoA[0] ;
         A1904ArtRdoN = BC000812_A1904ArtRdoN[0] ;
         n1904ArtRdoN = BC000812_n1904ArtRdoN[0] ;
         A2791ArtFacAbs = BC000812_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = BC000812_n2791ArtFacAbs[0] ;
         A2834ArtPle2 = BC000812_A2834ArtPle2[0] ;
         n2834ArtPle2 = BC000812_n2834ArtPle2[0] ;
         A3121ArtNumCor = BC000812_A3121ArtNumCor[0] ;
         n3121ArtNumCor = BC000812_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = BC000812_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = BC000812_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = BC000812_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = BC000812_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = BC000812_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = BC000812_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = BC000812_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = BC000812_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = BC000812_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = BC000812_n3126ArtGraCru2[0] ;
         A4297ArtPmPPza = BC000812_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = BC000812_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = BC000812_A3683ArtFecCre[0] ;
         n3683ArtFecCre = BC000812_n3683ArtFecCre[0] ;
         A4354ArtFecMod = BC000812_A4354ArtFecMod[0] ;
         n4354ArtFecMod = BC000812_n4354ArtFecMod[0] ;
         A4296ClasDsc = BC000812_A4296ClasDsc[0] ;
         n4296ClasDsc = BC000812_n4296ClasDsc[0] ;
         A5741ArtComer = BC000812_A5741ArtComer[0] ;
         n5741ArtComer = BC000812_n5741ArtComer[0] ;
         A6107ClaTubDsc = BC000812_A6107ClaTubDsc[0] ;
         n6107ClaTubDsc = BC000812_n6107ClaTubDsc[0] ;
         A6109ClaBolDsc = BC000812_A6109ClaBolDsc[0] ;
         n6109ClaBolDsc = BC000812_n6109ClaBolDsc[0] ;
         A6435ArtRdoCru1 = BC000812_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = BC000812_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = BC000812_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = BC000812_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = BC000812_A967ArtNMtr[0] ;
         n967ArtNMtr = BC000812_n967ArtNMtr[0] ;
         A6462ArtLu = BC000812_A6462ArtLu[0] ;
         n6462ArtLu = BC000812_n6462ArtLu[0] ;
         A4607ArtRb = BC000812_A4607ArtRb[0] ;
         n4607ArtRb = BC000812_n4607ArtRb[0] ;
         A4444ArtPelAnh = BC000812_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = BC000812_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = BC000812_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = BC000812_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = BC000812_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = BC000812_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = BC000812_A7414ArtAncSc[0] ;
         n7414ArtAncSc = BC000812_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = BC000812_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = BC000812_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = BC000812_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = BC000812_n7777ArtRdtSc[0] ;
         A7778ArtUnd = BC000812_A7778ArtUnd[0] ;
         n7778ArtUnd = BC000812_n7778ArtUnd[0] ;
         A7779ArtBlo = BC000812_A7779ArtBlo[0] ;
         n7779ArtBlo = BC000812_n7779ArtBlo[0] ;
         A7948ArtCla = BC000812_A7948ArtCla[0] ;
         n7948ArtCla = BC000812_n7948ArtCla[0] ;
         A6014TipArtDsc2 = BC000812_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC000812_n6014TipArtDsc2[0] ;
         A9730ArtFabsH = BC000812_A9730ArtFabsH[0] ;
         n9730ArtFabsH = BC000812_n9730ArtFabsH[0] ;
         A9801ArtFabsT = BC000812_A9801ArtFabsT[0] ;
         n9801ArtFabsT = BC000812_n9801ArtFabsT[0] ;
         A9875ArtNProg = BC000812_A9875ArtNProg[0] ;
         n9875ArtNProg = BC000812_n9875ArtNProg[0] ;
         A9902ArtVbd = BC000812_A9902ArtVbd[0] ;
         n9902ArtVbd = BC000812_n9902ArtVbd[0] ;
         A9903ArtVbn = BC000812_A9903ArtVbn[0] ;
         n9903ArtVbn = BC000812_n9903ArtVbn[0] ;
         A9904ArtAb = BC000812_A9904ArtAb[0] ;
         n9904ArtAb = BC000812_n9904ArtAb[0] ;
         A397ArtObsGrm = BC000812_A397ArtObsGrm[0] ;
         n397ArtObsGrm = BC000812_n397ArtObsGrm[0] ;
         A398ArtObsAnc = BC000812_A398ArtObsAnc[0] ;
         n398ArtObsAnc = BC000812_n398ArtObsAnc[0] ;
         A4980ArtCdb = BC000812_A4980ArtCdb[0] ;
         n4980ArtCdb = BC000812_n4980ArtCdb[0] ;
         A10027ArtGalga = BC000812_A10027ArtGalga[0] ;
         n10027ArtGalga = BC000812_n10027ArtGalga[0] ;
         A10028ArtPlatina = BC000812_A10028ArtPlatina[0] ;
         n10028ArtPlatina = BC000812_n10028ArtPlatina[0] ;
         A10029ArtPgd = BC000812_A10029ArtPgd[0] ;
         n10029ArtPgd = BC000812_n10029ArtPgd[0] ;
         A10031ArtThN = BC000812_A10031ArtThN[0] ;
         n10031ArtThN = BC000812_n10031ArtThN[0] ;
         A10380Art_Dc = BC000812_A10380Art_Dc[0] ;
         n10380Art_Dc = BC000812_n10380Art_Dc[0] ;
         A10804ArtHilos = BC000812_A10804ArtHilos[0] ;
         n10804ArtHilos = BC000812_n10804ArtHilos[0] ;
         A10805ArtPasad = BC000812_A10805ArtPasad[0] ;
         n10805ArtPasad = BC000812_n10805ArtPasad[0] ;
         A10831ArtAncC = BC000812_A10831ArtAncC[0] ;
         n10831ArtAncC = BC000812_n10831ArtAncC[0] ;
         A10832ArtGrm2C = BC000812_A10832ArtGrm2C[0] ;
         n10832ArtGrm2C = BC000812_n10832ArtGrm2C[0] ;
         A10833ArtRdoC = BC000812_A10833ArtRdoC[0] ;
         n10833ArtRdoC = BC000812_n10833ArtRdoC[0] ;
         A4455ArtAcaFor = BC000812_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = BC000812_n4455ArtAcaFor[0] ;
         A3682ArtAnu = BC000812_A3682ArtAnu[0] ;
         n3682ArtAnu = BC000812_n3682ArtAnu[0] ;
         A11627ArtFacUti = BC000812_A11627ArtFacUti[0] ;
         n11627ArtFacUti = BC000812_n11627ArtFacUti[0] ;
         A1581ArtNumTip = BC000812_A1581ArtNumTip[0] ;
         n1581ArtNumTip = BC000812_n1581ArtNumTip[0] ;
         A12364ArtMT = BC000812_A12364ArtMT[0] ;
         n12364ArtMT = BC000812_n12364ArtMT[0] ;
         A12365ArtTRabs = BC000812_A12365ArtTRabs[0] ;
         n12365ArtTRabs = BC000812_n12365ArtTRabs[0] ;
         A12366ArtKgMn = BC000812_A12366ArtKgMn[0] ;
         n12366ArtKgMn = BC000812_n12366ArtKgMn[0] ;
         A4446ArtAcaMar = BC000812_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = BC000812_n4446ArtAcaMar[0] ;
         zm0810( -20) ;
      }
      pr_default.close(10);
      onLoadActions0810( ) ;
   }

   public void onLoadActions0810( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A66ArtCorOri)==0) && ( AV139Tintutex == 0 ) )
      {
         A66ArtCorOri = httpContext.getMessage( "N", "") ;
         n66ArtCorOri = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A70ArtEncOri)==0) && ( AV139Tintutex == 0 ) )
      {
         A70ArtEncOri = httpContext.getMessage( "N", "") ;
         n70ArtEncOri = false ;
      }
      AV217Artusrcod = O4353ArtUsrCod ;
      if ( isIns( )  && (0==A117ArtUrg) && ( Gx_BScreen == 0 ) )
      {
         A117ArtUrg = A306CliUrg ;
         n117ArtUrg = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A69ArtDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A69ArtDsc = A4296ClasDsc ;
         n69ArtDsc = false ;
      }
      A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
   }

   public void checkExtendedTable0810( )
   {
      nIsDirty_10 = (short)(0) ;
      standaloneModal( ) ;
      if ( isIns( )  && (GXutil.strcmp("", A66ArtCorOri)==0) && ( AV139Tintutex == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A66ArtCorOri = httpContext.getMessage( "N", "") ;
         n66ArtCorOri = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A70ArtEncOri)==0) && ( AV139Tintutex == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A70ArtEncOri = httpContext.getMessage( "N", "") ;
         n70ArtEncOri = false ;
      }
      /* Using cursor BC000813 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC000813_A407EmprNom[0] ;
      n407EmprNom = BC000813_n407EmprNom[0] ;
      pr_default.close(11);
      /* Using cursor BC000814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
      }
      A830TipArtDsc = BC000814_A830TipArtDsc[0] ;
      n830TipArtDsc = BC000814_n830TipArtDsc[0] ;
      A6014TipArtDsc2 = BC000814_A6014TipArtDsc2[0] ;
      n6014TipArtDsc2 = BC000814_n6014TipArtDsc2[0] ;
      pr_default.close(12);
      /* Using cursor BC000815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n10030ArtTh), Short.valueOf(A10030ArtTh)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10030ArtTh) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tej Hil", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTTH");
            AnyError = (short)(1) ;
         }
      }
      A10031ArtThN = BC000815_A10031ArtThN[0] ;
      n10031ArtThN = BC000815_n10031ArtThN[0] ;
      pr_default.close(13);
      /* Using cursor BC000816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4295ClasCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
            AnyError = (short)(1) ;
         }
      }
      A4296ClasDsc = BC000816_A4296ClasDsc[0] ;
      n4296ClasDsc = BC000816_n4296ClasDsc[0] ;
      pr_default.close(14);
      /* Using cursor BC000817 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6108ClaBolCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ClaBol", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLABOLCOD");
            AnyError = (short)(1) ;
         }
      }
      A6109ClaBolDsc = BC000817_A6109ClaBolDsc[0] ;
      n6109ClaBolDsc = BC000817_n6109ClaBolDsc[0] ;
      pr_default.close(15);
      /* Using cursor BC000818 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6106ClaTubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ClaTub", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLATUBCOD");
            AnyError = (short)(1) ;
         }
      }
      A6107ClaTubDsc = BC000818_A6107ClaTubDsc[0] ;
      n6107ClaTubDsc = BC000818_n6107ClaTubDsc[0] ;
      pr_default.close(16);
      /* Using cursor BC000819 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n10379Art_Cd), Short.valueOf(A10379Art_Cd)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10379Art_Cd) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0700", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ART_CD");
            AnyError = (short)(1) ;
         }
      }
      A10380Art_Dc = BC000819_A10380Art_Dc[0] ;
      n10380Art_Dc = BC000819_n10380Art_Dc[0] ;
      pr_default.close(17);
      /* Using cursor BC000820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC000820_A279CliNom[0] ;
      A272CliEti = BC000820_A272CliEti[0] ;
      A306CliUrg = BC000820_A306CliUrg[0] ;
      pr_default.close(18);
      if ( ! ( ( GXutil.strcmp(A66ArtCorOri, "S") == 0 ) || ( GXutil.strcmp(A66ArtCorOri, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A70ArtEncOri, "S") == 0 ) || ( GXutil.strcmp(A70ArtEncOri, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Encolar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A73ArtEti, "S") == 0 ) || ( GXutil.strcmp(A73ArtEti, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiquetas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV217Artusrcod = O4353ArtUsrCod ;
      if ( isIns( )  && (0==A117ArtUrg) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A117ArtUrg = A306CliUrg ;
         n117ArtUrg = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A69ArtDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A69ArtDsc = A4296ClasDsc ;
         n69ArtDsc = false ;
      }
      nIsDirty_10 = (short)(1) ;
      A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
      if ( ! ( ( ( A117ArtUrg >= 0 ) && ( A117ArtUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0810( )
   {
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
   }

   public void enableDisable( )
   {
   }

   public void getKey0810( )
   {
      /* Using cursor BC000821 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         zm0810( 20) ;
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = BC000822_A3072ArtObsLon[0] ;
         n3072ArtObsLon = BC000822_n3072ArtObsLon[0] ;
         A4447ArtAcaBak = BC000822_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = BC000822_n4447ArtAcaBak[0] ;
         A12695ArtElgAnc = BC000822_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = BC000822_n12695ArtElgAnc[0] ;
         A12696ArtElgLar = BC000822_A12696ArtElgLar[0] ;
         n12696ArtElgLar = BC000822_n12696ArtElgLar[0] ;
         A12697ArtRdoCru = BC000822_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = BC000822_n12697ArtRdoCru[0] ;
         A12698ArtEncLarg = BC000822_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = BC000822_n12698ArtEncLarg[0] ;
         A12699ArtEncAnc = BC000822_A12699ArtEncAnc[0] ;
         n12699ArtEncAnc = BC000822_n12699ArtEncAnc[0] ;
         A14099ArtRdto4 = BC000822_A14099ArtRdto4[0] ;
         n14099ArtRdto4 = BC000822_n14099ArtRdto4[0] ;
         A14100Artdsc2 = BC000822_A14100Artdsc2[0] ;
         n14100Artdsc2 = BC000822_n14100Artdsc2[0] ;
         A14101ArtgrComp = BC000822_A14101ArtgrComp[0] ;
         n14101ArtgrComp = BC000822_n14101ArtgrComp[0] ;
         A14102ArtKgspp = BC000822_A14102ArtKgspp[0] ;
         n14102ArtKgspp = BC000822_n14102ArtKgspp[0] ;
         A14103ArtPrepp = BC000822_A14103ArtPrepp[0] ;
         n14103ArtPrepp = BC000822_n14103ArtPrepp[0] ;
         A90ArtObsFac = BC000822_A90ArtObsFac[0] ;
         n90ArtObsFac = BC000822_n90ArtObsFac[0] ;
         A12886ArtObsOtra = BC000822_A12886ArtObsOtra[0] ;
         n12886ArtObsOtra = BC000822_n12886ArtObsOtra[0] ;
         A14295ArtActivo = BC000822_A14295ArtActivo[0] ;
         A396EmprCod = BC000822_A396EmprCod[0] ;
         A252CliCod = BC000822_A252CliCod[0] ;
         n252CliCod = BC000822_n252CliCod[0] ;
         A829TipArtCod = BC000822_A829TipArtCod[0] ;
         A10030ArtTh = BC000822_A10030ArtTh[0] ;
         n10030ArtTh = BC000822_n10030ArtTh[0] ;
         A4295ClasCod = BC000822_A4295ClasCod[0] ;
         n4295ClasCod = BC000822_n4295ClasCod[0] ;
         A6108ClaBolCod = BC000822_A6108ClaBolCod[0] ;
         n6108ClaBolCod = BC000822_n6108ClaBolCod[0] ;
         A6106ClaTubCod = BC000822_A6106ClaTubCod[0] ;
         n6106ClaTubCod = BC000822_n6106ClaTubCod[0] ;
         A10379Art_Cd = BC000822_A10379Art_Cd[0] ;
         n10379Art_Cd = BC000822_n10379Art_Cd[0] ;
         A65ArtCod = BC000822_A65ArtCod[0] ;
         n65ArtCod = BC000822_n65ArtCod[0] ;
         A66ArtCorOri = BC000822_A66ArtCorOri[0] ;
         n66ArtCorOri = BC000822_n66ArtCorOri[0] ;
         A70ArtEncOri = BC000822_A70ArtEncOri[0] ;
         n70ArtEncOri = BC000822_n70ArtEncOri[0] ;
         A4353ArtUsrCod = BC000822_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = BC000822_n4353ArtUsrCod[0] ;
         A69ArtDsc = BC000822_A69ArtDsc[0] ;
         n69ArtDsc = BC000822_n69ArtDsc[0] ;
         A5335ArtCodExt = BC000822_A5335ArtCodExt[0] ;
         n5335ArtCodExt = BC000822_n5335ArtCodExt[0] ;
         A87ArtMat = BC000822_A87ArtMat[0] ;
         n87ArtMat = BC000822_n87ArtMat[0] ;
         A1148ArtPml = BC000822_A1148ArtPml[0] ;
         n1148ArtPml = BC000822_n1148ArtPml[0] ;
         A78ArtGraCru = BC000822_A78ArtGraCru[0] ;
         n78ArtGraCru = BC000822_n78ArtGraCru[0] ;
         A68ArtCruMin = BC000822_A68ArtCruMin[0] ;
         n68ArtCruMin = BC000822_n68ArtCruMin[0] ;
         A67ArtCruMax = BC000822_A67ArtCruMax[0] ;
         n67ArtCruMax = BC000822_n67ArtCruMax[0] ;
         A63ArtAcaMin = BC000822_A63ArtAcaMin[0] ;
         n63ArtAcaMin = BC000822_n63ArtAcaMin[0] ;
         A62ArtAcaMax = BC000822_A62ArtAcaMax[0] ;
         n62ArtAcaMax = BC000822_n62ArtAcaMax[0] ;
         A95ArtRen = BC000822_A95ArtRen[0] ;
         n95ArtRen = BC000822_n95ArtRen[0] ;
         A101ArtTipPle = BC000822_A101ArtTipPle[0] ;
         n101ArtTipPle = BC000822_n101ArtTipPle[0] ;
         A100ArtTipLar = BC000822_A100ArtTipLar[0] ;
         n100ArtTipLar = BC000822_n100ArtTipLar[0] ;
         A96ArtSua = BC000822_A96ArtSua[0] ;
         n96ArtSua = BC000822_n96ArtSua[0] ;
         A64ArtAcaQui = BC000822_A64ArtAcaQui[0] ;
         n64ArtAcaQui = BC000822_n64ArtAcaQui[0] ;
         A73ArtEti = BC000822_A73ArtEti[0] ;
         n73ArtEti = BC000822_n73ArtEti[0] ;
         A117ArtUrg = BC000822_A117ArtUrg[0] ;
         n117ArtUrg = BC000822_n117ArtUrg[0] ;
         A88ArtMer = BC000822_A88ArtMer[0] ;
         n88ArtMer = BC000822_n88ArtMer[0] ;
         A105ArtTra1 = BC000822_A105ArtTra1[0] ;
         n105ArtTra1 = BC000822_n105ArtTra1[0] ;
         A106ArtTra2 = BC000822_A106ArtTra2[0] ;
         n106ArtTra2 = BC000822_n106ArtTra2[0] ;
         A107ArtTra3 = BC000822_A107ArtTra3[0] ;
         n107ArtTra3 = BC000822_n107ArtTra3[0] ;
         A108ArtTraP1 = BC000822_A108ArtTraP1[0] ;
         n108ArtTraP1 = BC000822_n108ArtTraP1[0] ;
         A109ArtTraP2 = BC000822_A109ArtTraP2[0] ;
         n109ArtTraP2 = BC000822_n109ArtTraP2[0] ;
         A110ArtTraP3 = BC000822_A110ArtTraP3[0] ;
         n110ArtTraP3 = BC000822_n110ArtTraP3[0] ;
         A111ArtUrd1 = BC000822_A111ArtUrd1[0] ;
         n111ArtUrd1 = BC000822_n111ArtUrd1[0] ;
         A112ArtUrd2 = BC000822_A112ArtUrd2[0] ;
         n112ArtUrd2 = BC000822_n112ArtUrd2[0] ;
         A113ArtUrd3 = BC000822_A113ArtUrd3[0] ;
         n113ArtUrd3 = BC000822_n113ArtUrd3[0] ;
         A114ArtUrdP1 = BC000822_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = BC000822_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = BC000822_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = BC000822_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = BC000822_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = BC000822_n116ArtUrdP3[0] ;
         A1229ArtEncCom = BC000822_A1229ArtEncCom[0] ;
         n1229ArtEncCom = BC000822_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = BC000822_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = BC000822_n1230ArtEncAnh[0] ;
         A1903ArtGraAca = BC000822_A1903ArtGraAca[0] ;
         n1903ArtGraAca = BC000822_n1903ArtGraAca[0] ;
         A1905ArtRdoA = BC000822_A1905ArtRdoA[0] ;
         n1905ArtRdoA = BC000822_n1905ArtRdoA[0] ;
         A1904ArtRdoN = BC000822_A1904ArtRdoN[0] ;
         n1904ArtRdoN = BC000822_n1904ArtRdoN[0] ;
         A2791ArtFacAbs = BC000822_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = BC000822_n2791ArtFacAbs[0] ;
         A2834ArtPle2 = BC000822_A2834ArtPle2[0] ;
         n2834ArtPle2 = BC000822_n2834ArtPle2[0] ;
         A3121ArtNumCor = BC000822_A3121ArtNumCor[0] ;
         n3121ArtNumCor = BC000822_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = BC000822_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = BC000822_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = BC000822_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = BC000822_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = BC000822_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = BC000822_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = BC000822_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = BC000822_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = BC000822_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = BC000822_n3126ArtGraCru2[0] ;
         A4297ArtPmPPza = BC000822_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = BC000822_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = BC000822_A3683ArtFecCre[0] ;
         n3683ArtFecCre = BC000822_n3683ArtFecCre[0] ;
         A4354ArtFecMod = BC000822_A4354ArtFecMod[0] ;
         n4354ArtFecMod = BC000822_n4354ArtFecMod[0] ;
         A5741ArtComer = BC000822_A5741ArtComer[0] ;
         n5741ArtComer = BC000822_n5741ArtComer[0] ;
         A6435ArtRdoCru1 = BC000822_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = BC000822_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = BC000822_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = BC000822_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = BC000822_A967ArtNMtr[0] ;
         n967ArtNMtr = BC000822_n967ArtNMtr[0] ;
         A6462ArtLu = BC000822_A6462ArtLu[0] ;
         n6462ArtLu = BC000822_n6462ArtLu[0] ;
         A4607ArtRb = BC000822_A4607ArtRb[0] ;
         n4607ArtRb = BC000822_n4607ArtRb[0] ;
         A4444ArtPelAnh = BC000822_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = BC000822_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = BC000822_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = BC000822_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = BC000822_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = BC000822_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = BC000822_A7414ArtAncSc[0] ;
         n7414ArtAncSc = BC000822_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = BC000822_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = BC000822_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = BC000822_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = BC000822_n7777ArtRdtSc[0] ;
         A7778ArtUnd = BC000822_A7778ArtUnd[0] ;
         n7778ArtUnd = BC000822_n7778ArtUnd[0] ;
         A7779ArtBlo = BC000822_A7779ArtBlo[0] ;
         n7779ArtBlo = BC000822_n7779ArtBlo[0] ;
         A7948ArtCla = BC000822_A7948ArtCla[0] ;
         n7948ArtCla = BC000822_n7948ArtCla[0] ;
         A9730ArtFabsH = BC000822_A9730ArtFabsH[0] ;
         n9730ArtFabsH = BC000822_n9730ArtFabsH[0] ;
         A9801ArtFabsT = BC000822_A9801ArtFabsT[0] ;
         n9801ArtFabsT = BC000822_n9801ArtFabsT[0] ;
         A9875ArtNProg = BC000822_A9875ArtNProg[0] ;
         n9875ArtNProg = BC000822_n9875ArtNProg[0] ;
         A9902ArtVbd = BC000822_A9902ArtVbd[0] ;
         n9902ArtVbd = BC000822_n9902ArtVbd[0] ;
         A9903ArtVbn = BC000822_A9903ArtVbn[0] ;
         n9903ArtVbn = BC000822_n9903ArtVbn[0] ;
         A9904ArtAb = BC000822_A9904ArtAb[0] ;
         n9904ArtAb = BC000822_n9904ArtAb[0] ;
         A397ArtObsGrm = BC000822_A397ArtObsGrm[0] ;
         n397ArtObsGrm = BC000822_n397ArtObsGrm[0] ;
         A398ArtObsAnc = BC000822_A398ArtObsAnc[0] ;
         n398ArtObsAnc = BC000822_n398ArtObsAnc[0] ;
         A4980ArtCdb = BC000822_A4980ArtCdb[0] ;
         n4980ArtCdb = BC000822_n4980ArtCdb[0] ;
         A10027ArtGalga = BC000822_A10027ArtGalga[0] ;
         n10027ArtGalga = BC000822_n10027ArtGalga[0] ;
         A10028ArtPlatina = BC000822_A10028ArtPlatina[0] ;
         n10028ArtPlatina = BC000822_n10028ArtPlatina[0] ;
         A10029ArtPgd = BC000822_A10029ArtPgd[0] ;
         n10029ArtPgd = BC000822_n10029ArtPgd[0] ;
         A10804ArtHilos = BC000822_A10804ArtHilos[0] ;
         n10804ArtHilos = BC000822_n10804ArtHilos[0] ;
         A10805ArtPasad = BC000822_A10805ArtPasad[0] ;
         n10805ArtPasad = BC000822_n10805ArtPasad[0] ;
         A10831ArtAncC = BC000822_A10831ArtAncC[0] ;
         n10831ArtAncC = BC000822_n10831ArtAncC[0] ;
         A10832ArtGrm2C = BC000822_A10832ArtGrm2C[0] ;
         n10832ArtGrm2C = BC000822_n10832ArtGrm2C[0] ;
         A10833ArtRdoC = BC000822_A10833ArtRdoC[0] ;
         n10833ArtRdoC = BC000822_n10833ArtRdoC[0] ;
         A4455ArtAcaFor = BC000822_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = BC000822_n4455ArtAcaFor[0] ;
         A3682ArtAnu = BC000822_A3682ArtAnu[0] ;
         n3682ArtAnu = BC000822_n3682ArtAnu[0] ;
         A11627ArtFacUti = BC000822_A11627ArtFacUti[0] ;
         n11627ArtFacUti = BC000822_n11627ArtFacUti[0] ;
         A1581ArtNumTip = BC000822_A1581ArtNumTip[0] ;
         n1581ArtNumTip = BC000822_n1581ArtNumTip[0] ;
         A12364ArtMT = BC000822_A12364ArtMT[0] ;
         n12364ArtMT = BC000822_n12364ArtMT[0] ;
         A12365ArtTRabs = BC000822_A12365ArtTRabs[0] ;
         n12365ArtTRabs = BC000822_n12365ArtTRabs[0] ;
         A12366ArtKgMn = BC000822_A12366ArtKgMn[0] ;
         n12366ArtKgMn = BC000822_n12366ArtKgMn[0] ;
         A4446ArtAcaMar = BC000822_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = BC000822_n4446ArtAcaMar[0] ;
         O4353ArtUsrCod = A4353ArtUsrCod ;
         n4353ArtUsrCod = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0810( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0810( ) ;
         }
         Gx_mode = sMode10 ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0810( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
      }
      pr_default.close(20);
   }

   public void getEqualNoModal( )
   {
      getKey0810( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_080( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0810( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000823 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(21) == 101) || ( GXutil.strcmp(Z66ArtCorOri, BC000823_A66ArtCorOri[0]) != 0 ) || ( GXutil.strcmp(Z70ArtEncOri, BC000823_A70ArtEncOri[0]) != 0 ) || ( GXutil.strcmp(Z4353ArtUsrCod, BC000823_A4353ArtUsrCod[0]) != 0 ) || ( GXutil.strcmp(Z69ArtDsc, BC000823_A69ArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z5335ArtCodExt, BC000823_A5335ArtCodExt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z87ArtMat, BC000823_A87ArtMat[0]) != 0 ) || ( Z1148ArtPml != BC000823_A1148ArtPml[0] ) || ( Z78ArtGraCru != BC000823_A78ArtGraCru[0] ) || ( Z68ArtCruMin != BC000823_A68ArtCruMin[0] ) || ( Z67ArtCruMax != BC000823_A67ArtCruMax[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z63ArtAcaMin != BC000823_A63ArtAcaMin[0] ) || ( Z62ArtAcaMax != BC000823_A62ArtAcaMax[0] ) || ( DecimalUtil.compareTo(Z95ArtRen, BC000823_A95ArtRen[0]) != 0 ) || ( GXutil.strcmp(Z101ArtTipPle, BC000823_A101ArtTipPle[0]) != 0 ) || ( GXutil.strcmp(Z100ArtTipLar, BC000823_A100ArtTipLar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z96ArtSua, BC000823_A96ArtSua[0]) != 0 ) || ( GXutil.strcmp(Z64ArtAcaQui, BC000823_A64ArtAcaQui[0]) != 0 ) || ( GXutil.strcmp(Z73ArtEti, BC000823_A73ArtEti[0]) != 0 ) || ( Z117ArtUrg != BC000823_A117ArtUrg[0] ) || ( DecimalUtil.compareTo(Z88ArtMer, BC000823_A88ArtMer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z105ArtTra1, BC000823_A105ArtTra1[0]) != 0 ) || ( GXutil.strcmp(Z106ArtTra2, BC000823_A106ArtTra2[0]) != 0 ) || ( GXutil.strcmp(Z107ArtTra3, BC000823_A107ArtTra3[0]) != 0 ) || ( Z108ArtTraP1 != BC000823_A108ArtTraP1[0] ) || ( Z109ArtTraP2 != BC000823_A109ArtTraP2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z110ArtTraP3 != BC000823_A110ArtTraP3[0] ) || ( GXutil.strcmp(Z111ArtUrd1, BC000823_A111ArtUrd1[0]) != 0 ) || ( GXutil.strcmp(Z112ArtUrd2, BC000823_A112ArtUrd2[0]) != 0 ) || ( GXutil.strcmp(Z113ArtUrd3, BC000823_A113ArtUrd3[0]) != 0 ) || ( Z114ArtUrdP1 != BC000823_A114ArtUrdP1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z115ArtUrdP2 != BC000823_A115ArtUrdP2[0] ) || ( Z116ArtUrdP3 != BC000823_A116ArtUrdP3[0] ) || ( Z1229ArtEncCom != BC000823_A1229ArtEncCom[0] ) || ( Z1230ArtEncAnh != BC000823_A1230ArtEncAnh[0] ) || ( Z1903ArtGraAca != BC000823_A1903ArtGraAca[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1905ArtRdoA, BC000823_A1905ArtRdoA[0]) != 0 ) || ( DecimalUtil.compareTo(Z1904ArtRdoN, BC000823_A1904ArtRdoN[0]) != 0 ) || ( DecimalUtil.compareTo(Z2791ArtFacAbs, BC000823_A2791ArtFacAbs[0]) != 0 ) || ( GXutil.strcmp(Z2834ArtPle2, BC000823_A2834ArtPle2[0]) != 0 ) || ( Z3121ArtNumCor != BC000823_A3121ArtNumCor[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3122ArtAncSal1 != BC000823_A3122ArtAncSal1[0] ) || ( Z3123ArtAncSal2 != BC000823_A3123ArtAncSal2[0] ) || ( Z3124ArtAncSal3 != BC000823_A3124ArtAncSal3[0] ) || ( Z3125ArtGraAca2 != BC000823_A3125ArtGraAca2[0] ) || ( Z3126ArtGraCru2 != BC000823_A3126ArtGraCru2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4297ArtPmPPza, BC000823_A4297ArtPmPPza[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3683ArtFecCre), GXutil.resetTime(BC000823_A3683ArtFecCre[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4354ArtFecMod), GXutil.resetTime(BC000823_A4354ArtFecMod[0])) ) || ( GXutil.strcmp(Z5741ArtComer, BC000823_A5741ArtComer[0]) != 0 ) || ( DecimalUtil.compareTo(Z6435ArtRdoCru1, BC000823_A6435ArtRdoCru1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6436ArtRdoCru2, BC000823_A6436ArtRdoCru2[0]) != 0 ) || ( GXutil.strcmp(Z967ArtNMtr, BC000823_A967ArtNMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z6462ArtLu, BC000823_A6462ArtLu[0]) != 0 ) || ( Z4607ArtRb != BC000823_A4607ArtRb[0] ) || ( Z4444ArtPelAnh != BC000823_A4444ArtPelAnh[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7412Artgrm2Sc != BC000823_A7412Artgrm2Sc[0] ) || ( Z7413ArtPmlSc != BC000823_A7413ArtPmlSc[0] ) || ( Z7414ArtAncSc != BC000823_A7414ArtAncSc[0] ) || ( Z7415ArtPmlCru != BC000823_A7415ArtPmlCru[0] ) || ( DecimalUtil.compareTo(Z7777ArtRdtSc, BC000823_A7777ArtRdtSc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7778ArtUnd, BC000823_A7778ArtUnd[0]) != 0 ) || ( GXutil.strcmp(Z7779ArtBlo, BC000823_A7779ArtBlo[0]) != 0 ) || ( Z7948ArtCla != BC000823_A7948ArtCla[0] ) || ( DecimalUtil.compareTo(Z9730ArtFabsH, BC000823_A9730ArtFabsH[0]) != 0 ) || ( DecimalUtil.compareTo(Z9801ArtFabsT, BC000823_A9801ArtFabsT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9875ArtNProg != BC000823_A9875ArtNProg[0] ) || ( Z9902ArtVbd != BC000823_A9902ArtVbd[0] ) || ( Z9903ArtVbn != BC000823_A9903ArtVbn[0] ) || ( Z9904ArtAb != BC000823_A9904ArtAb[0] ) || ( GXutil.strcmp(Z397ArtObsGrm, BC000823_A397ArtObsGrm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z398ArtObsAnc, BC000823_A398ArtObsAnc[0]) != 0 ) || ( GXutil.strcmp(Z4980ArtCdb, BC000823_A4980ArtCdb[0]) != 0 ) || ( GXutil.strcmp(Z10027ArtGalga, BC000823_A10027ArtGalga[0]) != 0 ) || ( GXutil.strcmp(Z10028ArtPlatina, BC000823_A10028ArtPlatina[0]) != 0 ) || ( GXutil.strcmp(Z10029ArtPgd, BC000823_A10029ArtPgd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10804ArtHilos != BC000823_A10804ArtHilos[0] ) || ( Z10805ArtPasad != BC000823_A10805ArtPasad[0] ) || ( Z10831ArtAncC != BC000823_A10831ArtAncC[0] ) || ( Z10832ArtGrm2C != BC000823_A10832ArtGrm2C[0] ) || ( DecimalUtil.compareTo(Z10833ArtRdoC, BC000823_A10833ArtRdoC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4455ArtAcaFor != BC000823_A4455ArtAcaFor[0] ) || ( GXutil.strcmp(Z3682ArtAnu, BC000823_A3682ArtAnu[0]) != 0 ) || ( DecimalUtil.compareTo(Z11627ArtFacUti, BC000823_A11627ArtFacUti[0]) != 0 ) || ( Z1581ArtNumTip != BC000823_A1581ArtNumTip[0] ) || ( Z12364ArtMT != BC000823_A12364ArtMT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12365ArtTRabs != BC000823_A12365ArtTRabs[0] ) || ( DecimalUtil.compareTo(Z12366ArtKgMn, BC000823_A12366ArtKgMn[0]) != 0 ) || ( GXutil.strcmp(Z4446ArtAcaMar, BC000823_A4446ArtAcaMar[0]) != 0 ) || ( GXutil.strcmp(Z4447ArtAcaBak, BC000823_A4447ArtAcaBak[0]) != 0 ) || ( DecimalUtil.compareTo(Z12695ArtElgAnc, BC000823_A12695ArtElgAnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12696ArtElgLar, BC000823_A12696ArtElgLar[0]) != 0 ) || ( DecimalUtil.compareTo(Z12697ArtRdoCru, BC000823_A12697ArtRdoCru[0]) != 0 ) || ( DecimalUtil.compareTo(Z12698ArtEncLarg, BC000823_A12698ArtEncLarg[0]) != 0 ) || ( DecimalUtil.compareTo(Z12699ArtEncAnc, BC000823_A12699ArtEncAnc[0]) != 0 ) || ( DecimalUtil.compareTo(Z14099ArtRdto4, BC000823_A14099ArtRdto4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14100Artdsc2, BC000823_A14100Artdsc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z14101ArtgrComp, BC000823_A14101ArtgrComp[0]) != 0 ) || ( DecimalUtil.compareTo(Z14102ArtKgspp, BC000823_A14102ArtKgspp[0]) != 0 ) || ( DecimalUtil.compareTo(Z14103ArtPrepp, BC000823_A14103ArtPrepp[0]) != 0 ) || ( GXutil.strcmp(Z90ArtObsFac, BC000823_A90ArtObsFac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12886ArtObsOtra, BC000823_A12886ArtObsOtra[0]) != 0 ) || ( GXutil.strcmp(Z14295ArtActivo, BC000823_A14295ArtActivo[0]) != 0 ) || ( Z829TipArtCod != BC000823_A829TipArtCod[0] ) || ( Z10030ArtTh != BC000823_A10030ArtTh[0] ) || ( Z4295ClasCod != BC000823_A4295ClasCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6108ClaBolCod != BC000823_A6108ClaBolCod[0] ) || ( Z6106ClaTubCod != BC000823_A6106ClaTubCod[0] ) || ( Z10379Art_Cd != BC000823_A10379Art_Cd[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0810( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0810( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0810( 0) ;
         checkOptimisticConcurrency0810( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0810( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0810( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000824 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n4444ArtPelAnh), Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc,
                  Boolean.valueOf(n7778ArtUnd), A7778ArtUnd, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n7948ArtCla), Byte.valueOf(A7948ArtCla), Boolean.valueOf(n9730ArtFabsH), A9730ArtFabsH, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, Boolean.valueOf(n9875ArtNProg), Byte.valueOf(A9875ArtNProg), Boolean.valueOf(n9902ArtVbd), Short.valueOf(A9902ArtVbd), Boolean.valueOf(n9903ArtVbn), Short.valueOf(A9903ArtVbn), Boolean.valueOf(n9904ArtAb), Short.valueOf(A9904ArtAb), Boolean.valueOf(n397ArtObsGrm), A397ArtObsGrm, Boolean.valueOf(n398ArtObsAnc), A398ArtObsAnc, Boolean.valueOf(n4980ArtCdb), A4980ArtCdb, Boolean.valueOf(n10027ArtGalga), A10027ArtGalga, Boolean.valueOf(n10028ArtPlatina), A10028ArtPlatina, Boolean.valueOf(n10029ArtPgd), A10029ArtPgd, Boolean.valueOf(n10804ArtHilos), Short.valueOf(A10804ArtHilos), Boolean.valueOf(n10805ArtPasad), Short.valueOf(A10805ArtPasad), Boolean.valueOf(n10831ArtAncC), Short.valueOf(A10831ArtAncC), Boolean.valueOf(n10832ArtGrm2C), Short.valueOf(A10832ArtGrm2C), Boolean.valueOf(n10833ArtRdoC), A10833ArtRdoC, Boolean.valueOf(n4455ArtAcaFor), Integer.valueOf(A4455ArtAcaFor), Boolean.valueOf(n3682ArtAnu), A3682ArtAnu, Boolean.valueOf(n11627ArtFacUti), A11627ArtFacUti, Boolean.valueOf(n1581ArtNumTip), Integer.valueOf(A1581ArtNumTip), Boolean.valueOf(n12364ArtMT), Byte.valueOf(A12364ArtMT), Boolean.valueOf(n12365ArtTRabs), Byte.valueOf(A12365ArtTRabs), Boolean.valueOf(n12366ArtKgMn), A12366ArtKgMn, Boolean.valueOf(n4446ArtAcaMar), A4446ArtAcaMar, Boolean.valueOf(n4447ArtAcaBak), A4447ArtAcaBak, Boolean.valueOf(n12695ArtElgAnc), A12695ArtElgAnc, Boolean.valueOf(n12696ArtElgLar), A12696ArtElgLar, Boolean.valueOf(n12697ArtRdoCru), A12697ArtRdoCru, Boolean.valueOf(n12698ArtEncLarg), A12698ArtEncLarg, Boolean.valueOf(n12699ArtEncAnc), A12699ArtEncAnc, Boolean.valueOf(n14099ArtRdto4), A14099ArtRdto4, Boolean.valueOf(n14100Artdsc2), A14100Artdsc2, Boolean.valueOf(n14101ArtgrComp), A14101ArtgrComp, Boolean.valueOf(n14102ArtKgspp), A14102ArtKgspp, Boolean.valueOf(n14103ArtPrepp), A14103ArtPrepp, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n12886ArtObsOtra), A12886ArtObsOtra, A14295ArtActivo, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n10030ArtTh), Short.valueOf(A10030ArtTh), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n10379Art_Cd), Short.valueOf(A10379Art_Cd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0810( ) ;
         }
         endLevel0810( ) ;
      }
      closeExtendedTableCursors0810( ) ;
   }

   public void update0810( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0810( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0810( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0810( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0810( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000825 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n4444ArtPelAnh), Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc, Boolean.valueOf(n7778ArtUnd), A7778ArtUnd,
                  Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n7948ArtCla), Byte.valueOf(A7948ArtCla), Boolean.valueOf(n9730ArtFabsH), A9730ArtFabsH, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, Boolean.valueOf(n9875ArtNProg), Byte.valueOf(A9875ArtNProg), Boolean.valueOf(n9902ArtVbd), Short.valueOf(A9902ArtVbd), Boolean.valueOf(n9903ArtVbn), Short.valueOf(A9903ArtVbn), Boolean.valueOf(n9904ArtAb), Short.valueOf(A9904ArtAb), Boolean.valueOf(n397ArtObsGrm), A397ArtObsGrm, Boolean.valueOf(n398ArtObsAnc), A398ArtObsAnc, Boolean.valueOf(n4980ArtCdb), A4980ArtCdb, Boolean.valueOf(n10027ArtGalga), A10027ArtGalga, Boolean.valueOf(n10028ArtPlatina), A10028ArtPlatina, Boolean.valueOf(n10029ArtPgd), A10029ArtPgd, Boolean.valueOf(n10804ArtHilos), Short.valueOf(A10804ArtHilos), Boolean.valueOf(n10805ArtPasad), Short.valueOf(A10805ArtPasad), Boolean.valueOf(n10831ArtAncC), Short.valueOf(A10831ArtAncC), Boolean.valueOf(n10832ArtGrm2C), Short.valueOf(A10832ArtGrm2C), Boolean.valueOf(n10833ArtRdoC), A10833ArtRdoC, Boolean.valueOf(n4455ArtAcaFor), Integer.valueOf(A4455ArtAcaFor), Boolean.valueOf(n3682ArtAnu), A3682ArtAnu, Boolean.valueOf(n11627ArtFacUti), A11627ArtFacUti, Boolean.valueOf(n1581ArtNumTip), Integer.valueOf(A1581ArtNumTip), Boolean.valueOf(n12364ArtMT), Byte.valueOf(A12364ArtMT), Boolean.valueOf(n12365ArtTRabs), Byte.valueOf(A12365ArtTRabs), Boolean.valueOf(n12366ArtKgMn), A12366ArtKgMn, Boolean.valueOf(n4446ArtAcaMar), A4446ArtAcaMar, Boolean.valueOf(n4447ArtAcaBak), A4447ArtAcaBak, Boolean.valueOf(n12695ArtElgAnc), A12695ArtElgAnc, Boolean.valueOf(n12696ArtElgLar), A12696ArtElgLar, Boolean.valueOf(n12697ArtRdoCru), A12697ArtRdoCru, Boolean.valueOf(n12698ArtEncLarg), A12698ArtEncLarg, Boolean.valueOf(n12699ArtEncAnc), A12699ArtEncAnc, Boolean.valueOf(n14099ArtRdto4), A14099ArtRdto4, Boolean.valueOf(n14100Artdsc2), A14100Artdsc2, Boolean.valueOf(n14101ArtgrComp), A14101ArtgrComp, Boolean.valueOf(n14102ArtKgspp), A14102ArtKgspp, Boolean.valueOf(n14103ArtPrepp), A14103ArtPrepp, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n12886ArtObsOtra), A12886ArtObsOtra, A14295ArtActivo, Short.valueOf(A829TipArtCod), Boolean.valueOf(n10030ArtTh), Short.valueOf(A10030ArtTh), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n10379Art_Cd), Short.valueOf(A10379Art_Cd), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0810( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int8[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
                     tarticu_bc.this.A396EmprCod = GXv_char4[0] ;
                     tarticu_bc.this.A252CliCod = GXv_int8[0] ;
                     tarticu_bc.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0810( ) ;
      }
      closeExtendedTableCursors0810( ) ;
   }

   public void deferredUpdate0810( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0810( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0810( ) ;
         afterConfirm0810( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0810( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000826 */
               pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0810( ) ;
      Gx_mode = sMode10 ;
   }

   public void onDeleteControls0810( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC000827 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         A407EmprNom = BC000827_A407EmprNom[0] ;
         n407EmprNom = BC000827_n407EmprNom[0] ;
         pr_default.close(25);
         /* Using cursor BC000828 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = BC000828_A279CliNom[0] ;
         A272CliEti = BC000828_A272CliEti[0] ;
         A306CliUrg = BC000828_A306CliUrg[0] ;
         pr_default.close(26);
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         /* Using cursor BC000829 */
         pr_default.execute(27, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
         A830TipArtDsc = BC000829_A830TipArtDsc[0] ;
         n830TipArtDsc = BC000829_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = BC000829_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC000829_n6014TipArtDsc2[0] ;
         pr_default.close(27);
         /* Using cursor BC000830 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         A4296ClasDsc = BC000830_A4296ClasDsc[0] ;
         n4296ClasDsc = BC000830_n4296ClasDsc[0] ;
         pr_default.close(28);
         AV217Artusrcod = O4353ArtUsrCod ;
         /* Using cursor BC000831 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod)});
         A6107ClaTubDsc = BC000831_A6107ClaTubDsc[0] ;
         n6107ClaTubDsc = BC000831_n6107ClaTubDsc[0] ;
         pr_default.close(29);
         /* Using cursor BC000832 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod)});
         A6109ClaBolDsc = BC000832_A6109ClaBolDsc[0] ;
         n6109ClaBolDsc = BC000832_n6109ClaBolDsc[0] ;
         pr_default.close(30);
         /* Using cursor BC000833 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n10030ArtTh), Short.valueOf(A10030ArtTh)});
         A10031ArtThN = BC000833_A10031ArtThN[0] ;
         n10031ArtThN = BC000833_n10031ArtThN[0] ;
         pr_default.close(31);
         /* Using cursor BC000834 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n10379Art_Cd), Short.valueOf(A10379Art_Cd)});
         A10380Art_Dc = BC000834_A10380Art_Dc[0] ;
         n10380Art_Dc = BC000834_n10380Art_Dc[0] ;
         pr_default.close(32);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000835 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor BC000836 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor BC000837 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor BC000838 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor BC000839 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor BC000840 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor BC000841 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor BC000842 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor BC000843 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor BC000844 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor BC000845 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor BC000846 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor BC000847 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor BC000848 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor BC000849 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor BC000850 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor BC000851 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor BC000852 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor BC000853 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor BC000854 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor BC000855 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor BC000856 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor BC000857 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor BC000858 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor BC000859 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor BC000860 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor BC000861 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor BC000862 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor BC000863 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor BC000864 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor BC000865 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor BC000866 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor BC000867 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor BC000868 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor BC000869 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor BC000870 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor BC000871 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor BC000872 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor BC000873 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor BC000874 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor BC000875 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor BC000876 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor BC000877 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor BC000878 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
      }
   }

   public void endLevel0810( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0810( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         if ( isUpd( )  )
         {
            new app.psetartfecmod(remoteHandle, context).execute( A396EmprCod, A252CliCod, A65ArtCod) ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart0810( )
   {
      /* Scan By routine */
      /* Using cursor BC000879 */
      pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = BC000879_A3072ArtObsLon[0] ;
         n3072ArtObsLon = BC000879_n3072ArtObsLon[0] ;
         A4447ArtAcaBak = BC000879_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = BC000879_n4447ArtAcaBak[0] ;
         A12695ArtElgAnc = BC000879_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = BC000879_n12695ArtElgAnc[0] ;
         A12696ArtElgLar = BC000879_A12696ArtElgLar[0] ;
         n12696ArtElgLar = BC000879_n12696ArtElgLar[0] ;
         A12697ArtRdoCru = BC000879_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = BC000879_n12697ArtRdoCru[0] ;
         A12698ArtEncLarg = BC000879_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = BC000879_n12698ArtEncLarg[0] ;
         A12699ArtEncAnc = BC000879_A12699ArtEncAnc[0] ;
         n12699ArtEncAnc = BC000879_n12699ArtEncAnc[0] ;
         A14099ArtRdto4 = BC000879_A14099ArtRdto4[0] ;
         n14099ArtRdto4 = BC000879_n14099ArtRdto4[0] ;
         A14100Artdsc2 = BC000879_A14100Artdsc2[0] ;
         n14100Artdsc2 = BC000879_n14100Artdsc2[0] ;
         A14101ArtgrComp = BC000879_A14101ArtgrComp[0] ;
         n14101ArtgrComp = BC000879_n14101ArtgrComp[0] ;
         A14102ArtKgspp = BC000879_A14102ArtKgspp[0] ;
         n14102ArtKgspp = BC000879_n14102ArtKgspp[0] ;
         A14103ArtPrepp = BC000879_A14103ArtPrepp[0] ;
         n14103ArtPrepp = BC000879_n14103ArtPrepp[0] ;
         A90ArtObsFac = BC000879_A90ArtObsFac[0] ;
         n90ArtObsFac = BC000879_n90ArtObsFac[0] ;
         A12886ArtObsOtra = BC000879_A12886ArtObsOtra[0] ;
         n12886ArtObsOtra = BC000879_n12886ArtObsOtra[0] ;
         A14295ArtActivo = BC000879_A14295ArtActivo[0] ;
         A396EmprCod = BC000879_A396EmprCod[0] ;
         A252CliCod = BC000879_A252CliCod[0] ;
         n252CliCod = BC000879_n252CliCod[0] ;
         A829TipArtCod = BC000879_A829TipArtCod[0] ;
         A10030ArtTh = BC000879_A10030ArtTh[0] ;
         n10030ArtTh = BC000879_n10030ArtTh[0] ;
         A4295ClasCod = BC000879_A4295ClasCod[0] ;
         n4295ClasCod = BC000879_n4295ClasCod[0] ;
         A6108ClaBolCod = BC000879_A6108ClaBolCod[0] ;
         n6108ClaBolCod = BC000879_n6108ClaBolCod[0] ;
         A6106ClaTubCod = BC000879_A6106ClaTubCod[0] ;
         n6106ClaTubCod = BC000879_n6106ClaTubCod[0] ;
         A10379Art_Cd = BC000879_A10379Art_Cd[0] ;
         n10379Art_Cd = BC000879_n10379Art_Cd[0] ;
         A65ArtCod = BC000879_A65ArtCod[0] ;
         n65ArtCod = BC000879_n65ArtCod[0] ;
         A66ArtCorOri = BC000879_A66ArtCorOri[0] ;
         n66ArtCorOri = BC000879_n66ArtCorOri[0] ;
         A70ArtEncOri = BC000879_A70ArtEncOri[0] ;
         n70ArtEncOri = BC000879_n70ArtEncOri[0] ;
         A4353ArtUsrCod = BC000879_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = BC000879_n4353ArtUsrCod[0] ;
         A69ArtDsc = BC000879_A69ArtDsc[0] ;
         n69ArtDsc = BC000879_n69ArtDsc[0] ;
         A279CliNom = BC000879_A279CliNom[0] ;
         A5335ArtCodExt = BC000879_A5335ArtCodExt[0] ;
         n5335ArtCodExt = BC000879_n5335ArtCodExt[0] ;
         A407EmprNom = BC000879_A407EmprNom[0] ;
         n407EmprNom = BC000879_n407EmprNom[0] ;
         A87ArtMat = BC000879_A87ArtMat[0] ;
         n87ArtMat = BC000879_n87ArtMat[0] ;
         A830TipArtDsc = BC000879_A830TipArtDsc[0] ;
         n830TipArtDsc = BC000879_n830TipArtDsc[0] ;
         A1148ArtPml = BC000879_A1148ArtPml[0] ;
         n1148ArtPml = BC000879_n1148ArtPml[0] ;
         A78ArtGraCru = BC000879_A78ArtGraCru[0] ;
         n78ArtGraCru = BC000879_n78ArtGraCru[0] ;
         A68ArtCruMin = BC000879_A68ArtCruMin[0] ;
         n68ArtCruMin = BC000879_n68ArtCruMin[0] ;
         A67ArtCruMax = BC000879_A67ArtCruMax[0] ;
         n67ArtCruMax = BC000879_n67ArtCruMax[0] ;
         A63ArtAcaMin = BC000879_A63ArtAcaMin[0] ;
         n63ArtAcaMin = BC000879_n63ArtAcaMin[0] ;
         A62ArtAcaMax = BC000879_A62ArtAcaMax[0] ;
         n62ArtAcaMax = BC000879_n62ArtAcaMax[0] ;
         A95ArtRen = BC000879_A95ArtRen[0] ;
         n95ArtRen = BC000879_n95ArtRen[0] ;
         A101ArtTipPle = BC000879_A101ArtTipPle[0] ;
         n101ArtTipPle = BC000879_n101ArtTipPle[0] ;
         A100ArtTipLar = BC000879_A100ArtTipLar[0] ;
         n100ArtTipLar = BC000879_n100ArtTipLar[0] ;
         A96ArtSua = BC000879_A96ArtSua[0] ;
         n96ArtSua = BC000879_n96ArtSua[0] ;
         A64ArtAcaQui = BC000879_A64ArtAcaQui[0] ;
         n64ArtAcaQui = BC000879_n64ArtAcaQui[0] ;
         A73ArtEti = BC000879_A73ArtEti[0] ;
         n73ArtEti = BC000879_n73ArtEti[0] ;
         A272CliEti = BC000879_A272CliEti[0] ;
         A306CliUrg = BC000879_A306CliUrg[0] ;
         A117ArtUrg = BC000879_A117ArtUrg[0] ;
         n117ArtUrg = BC000879_n117ArtUrg[0] ;
         A88ArtMer = BC000879_A88ArtMer[0] ;
         n88ArtMer = BC000879_n88ArtMer[0] ;
         A105ArtTra1 = BC000879_A105ArtTra1[0] ;
         n105ArtTra1 = BC000879_n105ArtTra1[0] ;
         A106ArtTra2 = BC000879_A106ArtTra2[0] ;
         n106ArtTra2 = BC000879_n106ArtTra2[0] ;
         A107ArtTra3 = BC000879_A107ArtTra3[0] ;
         n107ArtTra3 = BC000879_n107ArtTra3[0] ;
         A108ArtTraP1 = BC000879_A108ArtTraP1[0] ;
         n108ArtTraP1 = BC000879_n108ArtTraP1[0] ;
         A109ArtTraP2 = BC000879_A109ArtTraP2[0] ;
         n109ArtTraP2 = BC000879_n109ArtTraP2[0] ;
         A110ArtTraP3 = BC000879_A110ArtTraP3[0] ;
         n110ArtTraP3 = BC000879_n110ArtTraP3[0] ;
         A111ArtUrd1 = BC000879_A111ArtUrd1[0] ;
         n111ArtUrd1 = BC000879_n111ArtUrd1[0] ;
         A112ArtUrd2 = BC000879_A112ArtUrd2[0] ;
         n112ArtUrd2 = BC000879_n112ArtUrd2[0] ;
         A113ArtUrd3 = BC000879_A113ArtUrd3[0] ;
         n113ArtUrd3 = BC000879_n113ArtUrd3[0] ;
         A114ArtUrdP1 = BC000879_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = BC000879_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = BC000879_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = BC000879_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = BC000879_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = BC000879_n116ArtUrdP3[0] ;
         A1229ArtEncCom = BC000879_A1229ArtEncCom[0] ;
         n1229ArtEncCom = BC000879_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = BC000879_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = BC000879_n1230ArtEncAnh[0] ;
         A1903ArtGraAca = BC000879_A1903ArtGraAca[0] ;
         n1903ArtGraAca = BC000879_n1903ArtGraAca[0] ;
         A1905ArtRdoA = BC000879_A1905ArtRdoA[0] ;
         n1905ArtRdoA = BC000879_n1905ArtRdoA[0] ;
         A1904ArtRdoN = BC000879_A1904ArtRdoN[0] ;
         n1904ArtRdoN = BC000879_n1904ArtRdoN[0] ;
         A2791ArtFacAbs = BC000879_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = BC000879_n2791ArtFacAbs[0] ;
         A2834ArtPle2 = BC000879_A2834ArtPle2[0] ;
         n2834ArtPle2 = BC000879_n2834ArtPle2[0] ;
         A3121ArtNumCor = BC000879_A3121ArtNumCor[0] ;
         n3121ArtNumCor = BC000879_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = BC000879_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = BC000879_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = BC000879_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = BC000879_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = BC000879_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = BC000879_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = BC000879_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = BC000879_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = BC000879_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = BC000879_n3126ArtGraCru2[0] ;
         A4297ArtPmPPza = BC000879_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = BC000879_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = BC000879_A3683ArtFecCre[0] ;
         n3683ArtFecCre = BC000879_n3683ArtFecCre[0] ;
         A4354ArtFecMod = BC000879_A4354ArtFecMod[0] ;
         n4354ArtFecMod = BC000879_n4354ArtFecMod[0] ;
         A4296ClasDsc = BC000879_A4296ClasDsc[0] ;
         n4296ClasDsc = BC000879_n4296ClasDsc[0] ;
         A5741ArtComer = BC000879_A5741ArtComer[0] ;
         n5741ArtComer = BC000879_n5741ArtComer[0] ;
         A6107ClaTubDsc = BC000879_A6107ClaTubDsc[0] ;
         n6107ClaTubDsc = BC000879_n6107ClaTubDsc[0] ;
         A6109ClaBolDsc = BC000879_A6109ClaBolDsc[0] ;
         n6109ClaBolDsc = BC000879_n6109ClaBolDsc[0] ;
         A6435ArtRdoCru1 = BC000879_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = BC000879_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = BC000879_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = BC000879_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = BC000879_A967ArtNMtr[0] ;
         n967ArtNMtr = BC000879_n967ArtNMtr[0] ;
         A6462ArtLu = BC000879_A6462ArtLu[0] ;
         n6462ArtLu = BC000879_n6462ArtLu[0] ;
         A4607ArtRb = BC000879_A4607ArtRb[0] ;
         n4607ArtRb = BC000879_n4607ArtRb[0] ;
         A4444ArtPelAnh = BC000879_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = BC000879_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = BC000879_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = BC000879_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = BC000879_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = BC000879_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = BC000879_A7414ArtAncSc[0] ;
         n7414ArtAncSc = BC000879_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = BC000879_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = BC000879_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = BC000879_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = BC000879_n7777ArtRdtSc[0] ;
         A7778ArtUnd = BC000879_A7778ArtUnd[0] ;
         n7778ArtUnd = BC000879_n7778ArtUnd[0] ;
         A7779ArtBlo = BC000879_A7779ArtBlo[0] ;
         n7779ArtBlo = BC000879_n7779ArtBlo[0] ;
         A7948ArtCla = BC000879_A7948ArtCla[0] ;
         n7948ArtCla = BC000879_n7948ArtCla[0] ;
         A6014TipArtDsc2 = BC000879_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC000879_n6014TipArtDsc2[0] ;
         A9730ArtFabsH = BC000879_A9730ArtFabsH[0] ;
         n9730ArtFabsH = BC000879_n9730ArtFabsH[0] ;
         A9801ArtFabsT = BC000879_A9801ArtFabsT[0] ;
         n9801ArtFabsT = BC000879_n9801ArtFabsT[0] ;
         A9875ArtNProg = BC000879_A9875ArtNProg[0] ;
         n9875ArtNProg = BC000879_n9875ArtNProg[0] ;
         A9902ArtVbd = BC000879_A9902ArtVbd[0] ;
         n9902ArtVbd = BC000879_n9902ArtVbd[0] ;
         A9903ArtVbn = BC000879_A9903ArtVbn[0] ;
         n9903ArtVbn = BC000879_n9903ArtVbn[0] ;
         A9904ArtAb = BC000879_A9904ArtAb[0] ;
         n9904ArtAb = BC000879_n9904ArtAb[0] ;
         A397ArtObsGrm = BC000879_A397ArtObsGrm[0] ;
         n397ArtObsGrm = BC000879_n397ArtObsGrm[0] ;
         A398ArtObsAnc = BC000879_A398ArtObsAnc[0] ;
         n398ArtObsAnc = BC000879_n398ArtObsAnc[0] ;
         A4980ArtCdb = BC000879_A4980ArtCdb[0] ;
         n4980ArtCdb = BC000879_n4980ArtCdb[0] ;
         A10027ArtGalga = BC000879_A10027ArtGalga[0] ;
         n10027ArtGalga = BC000879_n10027ArtGalga[0] ;
         A10028ArtPlatina = BC000879_A10028ArtPlatina[0] ;
         n10028ArtPlatina = BC000879_n10028ArtPlatina[0] ;
         A10029ArtPgd = BC000879_A10029ArtPgd[0] ;
         n10029ArtPgd = BC000879_n10029ArtPgd[0] ;
         A10031ArtThN = BC000879_A10031ArtThN[0] ;
         n10031ArtThN = BC000879_n10031ArtThN[0] ;
         A10380Art_Dc = BC000879_A10380Art_Dc[0] ;
         n10380Art_Dc = BC000879_n10380Art_Dc[0] ;
         A10804ArtHilos = BC000879_A10804ArtHilos[0] ;
         n10804ArtHilos = BC000879_n10804ArtHilos[0] ;
         A10805ArtPasad = BC000879_A10805ArtPasad[0] ;
         n10805ArtPasad = BC000879_n10805ArtPasad[0] ;
         A10831ArtAncC = BC000879_A10831ArtAncC[0] ;
         n10831ArtAncC = BC000879_n10831ArtAncC[0] ;
         A10832ArtGrm2C = BC000879_A10832ArtGrm2C[0] ;
         n10832ArtGrm2C = BC000879_n10832ArtGrm2C[0] ;
         A10833ArtRdoC = BC000879_A10833ArtRdoC[0] ;
         n10833ArtRdoC = BC000879_n10833ArtRdoC[0] ;
         A4455ArtAcaFor = BC000879_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = BC000879_n4455ArtAcaFor[0] ;
         A3682ArtAnu = BC000879_A3682ArtAnu[0] ;
         n3682ArtAnu = BC000879_n3682ArtAnu[0] ;
         A11627ArtFacUti = BC000879_A11627ArtFacUti[0] ;
         n11627ArtFacUti = BC000879_n11627ArtFacUti[0] ;
         A1581ArtNumTip = BC000879_A1581ArtNumTip[0] ;
         n1581ArtNumTip = BC000879_n1581ArtNumTip[0] ;
         A12364ArtMT = BC000879_A12364ArtMT[0] ;
         n12364ArtMT = BC000879_n12364ArtMT[0] ;
         A12365ArtTRabs = BC000879_A12365ArtTRabs[0] ;
         n12365ArtTRabs = BC000879_n12365ArtTRabs[0] ;
         A12366ArtKgMn = BC000879_A12366ArtKgMn[0] ;
         n12366ArtKgMn = BC000879_n12366ArtKgMn[0] ;
         A4446ArtAcaMar = BC000879_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = BC000879_n4446ArtAcaMar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0810( )
   {
      /* Scan next routine */
      pr_default.readNext(77);
      RcdFound10 = (short)(0) ;
      scanKeyLoad0810( ) ;
   }

   public void scanKeyLoad0810( )
   {
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = BC000879_A3072ArtObsLon[0] ;
         n3072ArtObsLon = BC000879_n3072ArtObsLon[0] ;
         A4447ArtAcaBak = BC000879_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = BC000879_n4447ArtAcaBak[0] ;
         A12695ArtElgAnc = BC000879_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = BC000879_n12695ArtElgAnc[0] ;
         A12696ArtElgLar = BC000879_A12696ArtElgLar[0] ;
         n12696ArtElgLar = BC000879_n12696ArtElgLar[0] ;
         A12697ArtRdoCru = BC000879_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = BC000879_n12697ArtRdoCru[0] ;
         A12698ArtEncLarg = BC000879_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = BC000879_n12698ArtEncLarg[0] ;
         A12699ArtEncAnc = BC000879_A12699ArtEncAnc[0] ;
         n12699ArtEncAnc = BC000879_n12699ArtEncAnc[0] ;
         A14099ArtRdto4 = BC000879_A14099ArtRdto4[0] ;
         n14099ArtRdto4 = BC000879_n14099ArtRdto4[0] ;
         A14100Artdsc2 = BC000879_A14100Artdsc2[0] ;
         n14100Artdsc2 = BC000879_n14100Artdsc2[0] ;
         A14101ArtgrComp = BC000879_A14101ArtgrComp[0] ;
         n14101ArtgrComp = BC000879_n14101ArtgrComp[0] ;
         A14102ArtKgspp = BC000879_A14102ArtKgspp[0] ;
         n14102ArtKgspp = BC000879_n14102ArtKgspp[0] ;
         A14103ArtPrepp = BC000879_A14103ArtPrepp[0] ;
         n14103ArtPrepp = BC000879_n14103ArtPrepp[0] ;
         A90ArtObsFac = BC000879_A90ArtObsFac[0] ;
         n90ArtObsFac = BC000879_n90ArtObsFac[0] ;
         A12886ArtObsOtra = BC000879_A12886ArtObsOtra[0] ;
         n12886ArtObsOtra = BC000879_n12886ArtObsOtra[0] ;
         A14295ArtActivo = BC000879_A14295ArtActivo[0] ;
         A396EmprCod = BC000879_A396EmprCod[0] ;
         A252CliCod = BC000879_A252CliCod[0] ;
         n252CliCod = BC000879_n252CliCod[0] ;
         A829TipArtCod = BC000879_A829TipArtCod[0] ;
         A10030ArtTh = BC000879_A10030ArtTh[0] ;
         n10030ArtTh = BC000879_n10030ArtTh[0] ;
         A4295ClasCod = BC000879_A4295ClasCod[0] ;
         n4295ClasCod = BC000879_n4295ClasCod[0] ;
         A6108ClaBolCod = BC000879_A6108ClaBolCod[0] ;
         n6108ClaBolCod = BC000879_n6108ClaBolCod[0] ;
         A6106ClaTubCod = BC000879_A6106ClaTubCod[0] ;
         n6106ClaTubCod = BC000879_n6106ClaTubCod[0] ;
         A10379Art_Cd = BC000879_A10379Art_Cd[0] ;
         n10379Art_Cd = BC000879_n10379Art_Cd[0] ;
         A65ArtCod = BC000879_A65ArtCod[0] ;
         n65ArtCod = BC000879_n65ArtCod[0] ;
         A66ArtCorOri = BC000879_A66ArtCorOri[0] ;
         n66ArtCorOri = BC000879_n66ArtCorOri[0] ;
         A70ArtEncOri = BC000879_A70ArtEncOri[0] ;
         n70ArtEncOri = BC000879_n70ArtEncOri[0] ;
         A4353ArtUsrCod = BC000879_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = BC000879_n4353ArtUsrCod[0] ;
         A69ArtDsc = BC000879_A69ArtDsc[0] ;
         n69ArtDsc = BC000879_n69ArtDsc[0] ;
         A279CliNom = BC000879_A279CliNom[0] ;
         A5335ArtCodExt = BC000879_A5335ArtCodExt[0] ;
         n5335ArtCodExt = BC000879_n5335ArtCodExt[0] ;
         A407EmprNom = BC000879_A407EmprNom[0] ;
         n407EmprNom = BC000879_n407EmprNom[0] ;
         A87ArtMat = BC000879_A87ArtMat[0] ;
         n87ArtMat = BC000879_n87ArtMat[0] ;
         A830TipArtDsc = BC000879_A830TipArtDsc[0] ;
         n830TipArtDsc = BC000879_n830TipArtDsc[0] ;
         A1148ArtPml = BC000879_A1148ArtPml[0] ;
         n1148ArtPml = BC000879_n1148ArtPml[0] ;
         A78ArtGraCru = BC000879_A78ArtGraCru[0] ;
         n78ArtGraCru = BC000879_n78ArtGraCru[0] ;
         A68ArtCruMin = BC000879_A68ArtCruMin[0] ;
         n68ArtCruMin = BC000879_n68ArtCruMin[0] ;
         A67ArtCruMax = BC000879_A67ArtCruMax[0] ;
         n67ArtCruMax = BC000879_n67ArtCruMax[0] ;
         A63ArtAcaMin = BC000879_A63ArtAcaMin[0] ;
         n63ArtAcaMin = BC000879_n63ArtAcaMin[0] ;
         A62ArtAcaMax = BC000879_A62ArtAcaMax[0] ;
         n62ArtAcaMax = BC000879_n62ArtAcaMax[0] ;
         A95ArtRen = BC000879_A95ArtRen[0] ;
         n95ArtRen = BC000879_n95ArtRen[0] ;
         A101ArtTipPle = BC000879_A101ArtTipPle[0] ;
         n101ArtTipPle = BC000879_n101ArtTipPle[0] ;
         A100ArtTipLar = BC000879_A100ArtTipLar[0] ;
         n100ArtTipLar = BC000879_n100ArtTipLar[0] ;
         A96ArtSua = BC000879_A96ArtSua[0] ;
         n96ArtSua = BC000879_n96ArtSua[0] ;
         A64ArtAcaQui = BC000879_A64ArtAcaQui[0] ;
         n64ArtAcaQui = BC000879_n64ArtAcaQui[0] ;
         A73ArtEti = BC000879_A73ArtEti[0] ;
         n73ArtEti = BC000879_n73ArtEti[0] ;
         A272CliEti = BC000879_A272CliEti[0] ;
         A306CliUrg = BC000879_A306CliUrg[0] ;
         A117ArtUrg = BC000879_A117ArtUrg[0] ;
         n117ArtUrg = BC000879_n117ArtUrg[0] ;
         A88ArtMer = BC000879_A88ArtMer[0] ;
         n88ArtMer = BC000879_n88ArtMer[0] ;
         A105ArtTra1 = BC000879_A105ArtTra1[0] ;
         n105ArtTra1 = BC000879_n105ArtTra1[0] ;
         A106ArtTra2 = BC000879_A106ArtTra2[0] ;
         n106ArtTra2 = BC000879_n106ArtTra2[0] ;
         A107ArtTra3 = BC000879_A107ArtTra3[0] ;
         n107ArtTra3 = BC000879_n107ArtTra3[0] ;
         A108ArtTraP1 = BC000879_A108ArtTraP1[0] ;
         n108ArtTraP1 = BC000879_n108ArtTraP1[0] ;
         A109ArtTraP2 = BC000879_A109ArtTraP2[0] ;
         n109ArtTraP2 = BC000879_n109ArtTraP2[0] ;
         A110ArtTraP3 = BC000879_A110ArtTraP3[0] ;
         n110ArtTraP3 = BC000879_n110ArtTraP3[0] ;
         A111ArtUrd1 = BC000879_A111ArtUrd1[0] ;
         n111ArtUrd1 = BC000879_n111ArtUrd1[0] ;
         A112ArtUrd2 = BC000879_A112ArtUrd2[0] ;
         n112ArtUrd2 = BC000879_n112ArtUrd2[0] ;
         A113ArtUrd3 = BC000879_A113ArtUrd3[0] ;
         n113ArtUrd3 = BC000879_n113ArtUrd3[0] ;
         A114ArtUrdP1 = BC000879_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = BC000879_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = BC000879_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = BC000879_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = BC000879_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = BC000879_n116ArtUrdP3[0] ;
         A1229ArtEncCom = BC000879_A1229ArtEncCom[0] ;
         n1229ArtEncCom = BC000879_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = BC000879_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = BC000879_n1230ArtEncAnh[0] ;
         A1903ArtGraAca = BC000879_A1903ArtGraAca[0] ;
         n1903ArtGraAca = BC000879_n1903ArtGraAca[0] ;
         A1905ArtRdoA = BC000879_A1905ArtRdoA[0] ;
         n1905ArtRdoA = BC000879_n1905ArtRdoA[0] ;
         A1904ArtRdoN = BC000879_A1904ArtRdoN[0] ;
         n1904ArtRdoN = BC000879_n1904ArtRdoN[0] ;
         A2791ArtFacAbs = BC000879_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = BC000879_n2791ArtFacAbs[0] ;
         A2834ArtPle2 = BC000879_A2834ArtPle2[0] ;
         n2834ArtPle2 = BC000879_n2834ArtPle2[0] ;
         A3121ArtNumCor = BC000879_A3121ArtNumCor[0] ;
         n3121ArtNumCor = BC000879_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = BC000879_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = BC000879_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = BC000879_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = BC000879_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = BC000879_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = BC000879_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = BC000879_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = BC000879_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = BC000879_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = BC000879_n3126ArtGraCru2[0] ;
         A4297ArtPmPPza = BC000879_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = BC000879_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = BC000879_A3683ArtFecCre[0] ;
         n3683ArtFecCre = BC000879_n3683ArtFecCre[0] ;
         A4354ArtFecMod = BC000879_A4354ArtFecMod[0] ;
         n4354ArtFecMod = BC000879_n4354ArtFecMod[0] ;
         A4296ClasDsc = BC000879_A4296ClasDsc[0] ;
         n4296ClasDsc = BC000879_n4296ClasDsc[0] ;
         A5741ArtComer = BC000879_A5741ArtComer[0] ;
         n5741ArtComer = BC000879_n5741ArtComer[0] ;
         A6107ClaTubDsc = BC000879_A6107ClaTubDsc[0] ;
         n6107ClaTubDsc = BC000879_n6107ClaTubDsc[0] ;
         A6109ClaBolDsc = BC000879_A6109ClaBolDsc[0] ;
         n6109ClaBolDsc = BC000879_n6109ClaBolDsc[0] ;
         A6435ArtRdoCru1 = BC000879_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = BC000879_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = BC000879_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = BC000879_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = BC000879_A967ArtNMtr[0] ;
         n967ArtNMtr = BC000879_n967ArtNMtr[0] ;
         A6462ArtLu = BC000879_A6462ArtLu[0] ;
         n6462ArtLu = BC000879_n6462ArtLu[0] ;
         A4607ArtRb = BC000879_A4607ArtRb[0] ;
         n4607ArtRb = BC000879_n4607ArtRb[0] ;
         A4444ArtPelAnh = BC000879_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = BC000879_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = BC000879_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = BC000879_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = BC000879_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = BC000879_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = BC000879_A7414ArtAncSc[0] ;
         n7414ArtAncSc = BC000879_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = BC000879_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = BC000879_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = BC000879_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = BC000879_n7777ArtRdtSc[0] ;
         A7778ArtUnd = BC000879_A7778ArtUnd[0] ;
         n7778ArtUnd = BC000879_n7778ArtUnd[0] ;
         A7779ArtBlo = BC000879_A7779ArtBlo[0] ;
         n7779ArtBlo = BC000879_n7779ArtBlo[0] ;
         A7948ArtCla = BC000879_A7948ArtCla[0] ;
         n7948ArtCla = BC000879_n7948ArtCla[0] ;
         A6014TipArtDsc2 = BC000879_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC000879_n6014TipArtDsc2[0] ;
         A9730ArtFabsH = BC000879_A9730ArtFabsH[0] ;
         n9730ArtFabsH = BC000879_n9730ArtFabsH[0] ;
         A9801ArtFabsT = BC000879_A9801ArtFabsT[0] ;
         n9801ArtFabsT = BC000879_n9801ArtFabsT[0] ;
         A9875ArtNProg = BC000879_A9875ArtNProg[0] ;
         n9875ArtNProg = BC000879_n9875ArtNProg[0] ;
         A9902ArtVbd = BC000879_A9902ArtVbd[0] ;
         n9902ArtVbd = BC000879_n9902ArtVbd[0] ;
         A9903ArtVbn = BC000879_A9903ArtVbn[0] ;
         n9903ArtVbn = BC000879_n9903ArtVbn[0] ;
         A9904ArtAb = BC000879_A9904ArtAb[0] ;
         n9904ArtAb = BC000879_n9904ArtAb[0] ;
         A397ArtObsGrm = BC000879_A397ArtObsGrm[0] ;
         n397ArtObsGrm = BC000879_n397ArtObsGrm[0] ;
         A398ArtObsAnc = BC000879_A398ArtObsAnc[0] ;
         n398ArtObsAnc = BC000879_n398ArtObsAnc[0] ;
         A4980ArtCdb = BC000879_A4980ArtCdb[0] ;
         n4980ArtCdb = BC000879_n4980ArtCdb[0] ;
         A10027ArtGalga = BC000879_A10027ArtGalga[0] ;
         n10027ArtGalga = BC000879_n10027ArtGalga[0] ;
         A10028ArtPlatina = BC000879_A10028ArtPlatina[0] ;
         n10028ArtPlatina = BC000879_n10028ArtPlatina[0] ;
         A10029ArtPgd = BC000879_A10029ArtPgd[0] ;
         n10029ArtPgd = BC000879_n10029ArtPgd[0] ;
         A10031ArtThN = BC000879_A10031ArtThN[0] ;
         n10031ArtThN = BC000879_n10031ArtThN[0] ;
         A10380Art_Dc = BC000879_A10380Art_Dc[0] ;
         n10380Art_Dc = BC000879_n10380Art_Dc[0] ;
         A10804ArtHilos = BC000879_A10804ArtHilos[0] ;
         n10804ArtHilos = BC000879_n10804ArtHilos[0] ;
         A10805ArtPasad = BC000879_A10805ArtPasad[0] ;
         n10805ArtPasad = BC000879_n10805ArtPasad[0] ;
         A10831ArtAncC = BC000879_A10831ArtAncC[0] ;
         n10831ArtAncC = BC000879_n10831ArtAncC[0] ;
         A10832ArtGrm2C = BC000879_A10832ArtGrm2C[0] ;
         n10832ArtGrm2C = BC000879_n10832ArtGrm2C[0] ;
         A10833ArtRdoC = BC000879_A10833ArtRdoC[0] ;
         n10833ArtRdoC = BC000879_n10833ArtRdoC[0] ;
         A4455ArtAcaFor = BC000879_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = BC000879_n4455ArtAcaFor[0] ;
         A3682ArtAnu = BC000879_A3682ArtAnu[0] ;
         n3682ArtAnu = BC000879_n3682ArtAnu[0] ;
         A11627ArtFacUti = BC000879_A11627ArtFacUti[0] ;
         n11627ArtFacUti = BC000879_n11627ArtFacUti[0] ;
         A1581ArtNumTip = BC000879_A1581ArtNumTip[0] ;
         n1581ArtNumTip = BC000879_n1581ArtNumTip[0] ;
         A12364ArtMT = BC000879_A12364ArtMT[0] ;
         n12364ArtMT = BC000879_n12364ArtMT[0] ;
         A12365ArtTRabs = BC000879_A12365ArtTRabs[0] ;
         n12365ArtTRabs = BC000879_n12365ArtTRabs[0] ;
         A12366ArtKgMn = BC000879_A12366ArtKgMn[0] ;
         n12366ArtKgMn = BC000879_n12366ArtKgMn[0] ;
         A4446ArtAcaMar = BC000879_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = BC000879_n4446ArtAcaMar[0] ;
      }
      Gx_mode = sMode10 ;
   }

   public void scanKeyEnd0810( )
   {
      pr_default.close(77);
   }

   public void afterConfirm0810( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0810( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0810( )
   {
      /* Before Update Rules */
      if ( isUpd( )  )
      {
         A4353ArtUsrCod = AV17UsurCod ;
         n4353ArtUsrCod = false ;
      }
   }

   public void beforeDelete0810( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0810( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0810( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0810( )
   {
   }

   public void send_integrity_lvl_hashes0810( )
   {
   }

   public void addRow0810( )
   {
      VarsToRow10( bcTARTICU) ;
   }

   public void readRow0810( )
   {
      RowToVars10( bcTARTICU, 1) ;
   }

   public void initializeNonKey0810( )
   {
      A66ArtCorOri = "" ;
      n66ArtCorOri = false ;
      A70ArtEncOri = "" ;
      n70ArtEncOri = false ;
      AV217Artusrcod = "" ;
      A13751ArtCDsc = "" ;
      A279CliNom = "" ;
      A5335ArtCodExt = "" ;
      n5335ArtCodExt = false ;
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A87ArtMat = "" ;
      n87ArtMat = false ;
      A829TipArtCod = (short)(0) ;
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      A1148ArtPml = (short)(0) ;
      n1148ArtPml = false ;
      A78ArtGraCru = (short)(0) ;
      n78ArtGraCru = false ;
      A68ArtCruMin = (short)(0) ;
      n68ArtCruMin = false ;
      A67ArtCruMax = (short)(0) ;
      n67ArtCruMax = false ;
      A63ArtAcaMin = (short)(0) ;
      n63ArtAcaMin = false ;
      A62ArtAcaMax = (short)(0) ;
      n62ArtAcaMax = false ;
      A95ArtRen = DecimalUtil.ZERO ;
      n95ArtRen = false ;
      A101ArtTipPle = "" ;
      n101ArtTipPle = false ;
      A100ArtTipLar = "" ;
      n100ArtTipLar = false ;
      A96ArtSua = "" ;
      n96ArtSua = false ;
      A64ArtAcaQui = "" ;
      n64ArtAcaQui = false ;
      A272CliEti = "" ;
      A306CliUrg = (byte)(0) ;
      A88ArtMer = DecimalUtil.ZERO ;
      n88ArtMer = false ;
      A105ArtTra1 = "" ;
      n105ArtTra1 = false ;
      A106ArtTra2 = "" ;
      n106ArtTra2 = false ;
      A107ArtTra3 = "" ;
      n107ArtTra3 = false ;
      A108ArtTraP1 = (short)(0) ;
      n108ArtTraP1 = false ;
      A109ArtTraP2 = (short)(0) ;
      n109ArtTraP2 = false ;
      A110ArtTraP3 = (short)(0) ;
      n110ArtTraP3 = false ;
      A111ArtUrd1 = "" ;
      n111ArtUrd1 = false ;
      A112ArtUrd2 = "" ;
      n112ArtUrd2 = false ;
      A113ArtUrd3 = "" ;
      n113ArtUrd3 = false ;
      A114ArtUrdP1 = (short)(0) ;
      n114ArtUrdP1 = false ;
      A115ArtUrdP2 = (short)(0) ;
      n115ArtUrdP2 = false ;
      A116ArtUrdP3 = (short)(0) ;
      n116ArtUrdP3 = false ;
      A1229ArtEncCom = (short)(0) ;
      n1229ArtEncCom = false ;
      A1230ArtEncAnh = (short)(0) ;
      n1230ArtEncAnh = false ;
      A1903ArtGraAca = (short)(0) ;
      n1903ArtGraAca = false ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      n1905ArtRdoA = false ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      n1904ArtRdoN = false ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      n2791ArtFacAbs = false ;
      A2834ArtPle2 = "" ;
      n2834ArtPle2 = false ;
      A3121ArtNumCor = (short)(0) ;
      n3121ArtNumCor = false ;
      A3122ArtAncSal1 = (short)(0) ;
      n3122ArtAncSal1 = false ;
      A3123ArtAncSal2 = (short)(0) ;
      n3123ArtAncSal2 = false ;
      A3124ArtAncSal3 = (short)(0) ;
      n3124ArtAncSal3 = false ;
      A3125ArtGraAca2 = (short)(0) ;
      n3125ArtGraAca2 = false ;
      A3126ArtGraCru2 = (short)(0) ;
      n3126ArtGraCru2 = false ;
      A4295ClasCod = (short)(0) ;
      n4295ClasCod = false ;
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      n4297ArtPmPPza = false ;
      A4354ArtFecMod = GXutil.nullDate() ;
      n4354ArtFecMod = false ;
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      A5741ArtComer = "" ;
      n5741ArtComer = false ;
      A6106ClaTubCod = (short)(0) ;
      n6106ClaTubCod = false ;
      A6107ClaTubDsc = "" ;
      n6107ClaTubDsc = false ;
      A6108ClaBolCod = (short)(0) ;
      n6108ClaBolCod = false ;
      A6109ClaBolDsc = "" ;
      n6109ClaBolDsc = false ;
      A6435ArtRdoCru1 = DecimalUtil.ZERO ;
      n6435ArtRdoCru1 = false ;
      A6436ArtRdoCru2 = DecimalUtil.ZERO ;
      n6436ArtRdoCru2 = false ;
      A967ArtNMtr = "" ;
      n967ArtNMtr = false ;
      A6462ArtLu = DecimalUtil.ZERO ;
      n6462ArtLu = false ;
      A4607ArtRb = (short)(0) ;
      n4607ArtRb = false ;
      A4444ArtPelAnh = (short)(0) ;
      n4444ArtPelAnh = false ;
      A7412Artgrm2Sc = (short)(0) ;
      n7412Artgrm2Sc = false ;
      A7413ArtPmlSc = (short)(0) ;
      n7413ArtPmlSc = false ;
      A7414ArtAncSc = (short)(0) ;
      n7414ArtAncSc = false ;
      A7415ArtPmlCru = (short)(0) ;
      n7415ArtPmlCru = false ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      n7777ArtRdtSc = false ;
      A7778ArtUnd = "" ;
      n7778ArtUnd = false ;
      A7948ArtCla = (byte)(0) ;
      n7948ArtCla = false ;
      A6014TipArtDsc2 = "" ;
      n6014TipArtDsc2 = false ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      n9730ArtFabsH = false ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      n9801ArtFabsT = false ;
      A9875ArtNProg = (byte)(0) ;
      n9875ArtNProg = false ;
      A9902ArtVbd = (short)(0) ;
      n9902ArtVbd = false ;
      A9903ArtVbn = (short)(0) ;
      n9903ArtVbn = false ;
      A9904ArtAb = (short)(0) ;
      n9904ArtAb = false ;
      A397ArtObsGrm = "" ;
      n397ArtObsGrm = false ;
      A398ArtObsAnc = "" ;
      n398ArtObsAnc = false ;
      A4980ArtCdb = "" ;
      n4980ArtCdb = false ;
      A10027ArtGalga = "" ;
      n10027ArtGalga = false ;
      A10028ArtPlatina = "" ;
      n10028ArtPlatina = false ;
      A10029ArtPgd = "" ;
      n10029ArtPgd = false ;
      A10030ArtTh = (short)(0) ;
      n10030ArtTh = false ;
      A10031ArtThN = "" ;
      n10031ArtThN = false ;
      A10379Art_Cd = (short)(0) ;
      n10379Art_Cd = false ;
      A10380Art_Dc = "" ;
      n10380Art_Dc = false ;
      A10804ArtHilos = (short)(0) ;
      n10804ArtHilos = false ;
      A10805ArtPasad = (short)(0) ;
      n10805ArtPasad = false ;
      A10831ArtAncC = (short)(0) ;
      n10831ArtAncC = false ;
      A10832ArtGrm2C = (short)(0) ;
      n10832ArtGrm2C = false ;
      A10833ArtRdoC = DecimalUtil.ZERO ;
      n10833ArtRdoC = false ;
      A4455ArtAcaFor = 0 ;
      n4455ArtAcaFor = false ;
      A3682ArtAnu = "" ;
      n3682ArtAnu = false ;
      A11627ArtFacUti = DecimalUtil.ZERO ;
      n11627ArtFacUti = false ;
      A1581ArtNumTip = 0 ;
      n1581ArtNumTip = false ;
      A12364ArtMT = (byte)(0) ;
      n12364ArtMT = false ;
      A12365ArtTRabs = (byte)(0) ;
      n12365ArtTRabs = false ;
      A12366ArtKgMn = DecimalUtil.ZERO ;
      n12366ArtKgMn = false ;
      A4446ArtAcaMar = "" ;
      n4446ArtAcaMar = false ;
      A4447ArtAcaBak = "" ;
      n4447ArtAcaBak = false ;
      A12695ArtElgAnc = DecimalUtil.ZERO ;
      n12695ArtElgAnc = false ;
      A12696ArtElgLar = DecimalUtil.ZERO ;
      n12696ArtElgLar = false ;
      A12697ArtRdoCru = DecimalUtil.ZERO ;
      n12697ArtRdoCru = false ;
      A12698ArtEncLarg = DecimalUtil.ZERO ;
      n12698ArtEncLarg = false ;
      A12699ArtEncAnc = DecimalUtil.ZERO ;
      n12699ArtEncAnc = false ;
      A14099ArtRdto4 = DecimalUtil.ZERO ;
      n14099ArtRdto4 = false ;
      A14100Artdsc2 = "" ;
      n14100Artdsc2 = false ;
      A14101ArtgrComp = DecimalUtil.ZERO ;
      n14101ArtgrComp = false ;
      A14102ArtKgspp = DecimalUtil.ZERO ;
      n14102ArtKgspp = false ;
      A14103ArtPrepp = DecimalUtil.ZERO ;
      n14103ArtPrepp = false ;
      A3072ArtObsLon = "" ;
      n3072ArtObsLon = false ;
      A90ArtObsFac = "" ;
      n90ArtObsFac = false ;
      A12886ArtObsOtra = "" ;
      n12886ArtObsOtra = false ;
      A4353ArtUsrCod = AV17UsurCod ;
      n4353ArtUsrCod = false ;
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      A73ArtEti = httpContext.getMessage( "S", "") ;
      n73ArtEti = false ;
      A117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      A3683ArtFecCre = GXutil.today( ) ;
      n3683ArtFecCre = false ;
      A7779ArtBlo = "*" ;
      n7779ArtBlo = false ;
      A14295ArtActivo = httpContext.getMessage( "S", "") ;
      O4353ArtUsrCod = A4353ArtUsrCod ;
      n4353ArtUsrCod = false ;
      Z66ArtCorOri = "" ;
      Z70ArtEncOri = "" ;
      Z4353ArtUsrCod = "" ;
      Z69ArtDsc = "" ;
      Z5335ArtCodExt = "" ;
      Z87ArtMat = "" ;
      Z1148ArtPml = (short)(0) ;
      Z78ArtGraCru = (short)(0) ;
      Z68ArtCruMin = (short)(0) ;
      Z67ArtCruMax = (short)(0) ;
      Z63ArtAcaMin = (short)(0) ;
      Z62ArtAcaMax = (short)(0) ;
      Z95ArtRen = DecimalUtil.ZERO ;
      Z101ArtTipPle = "" ;
      Z100ArtTipLar = "" ;
      Z96ArtSua = "" ;
      Z64ArtAcaQui = "" ;
      Z73ArtEti = "" ;
      Z117ArtUrg = (byte)(0) ;
      Z88ArtMer = DecimalUtil.ZERO ;
      Z105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      Z108ArtTraP1 = (short)(0) ;
      Z109ArtTraP2 = (short)(0) ;
      Z110ArtTraP3 = (short)(0) ;
      Z111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      Z114ArtUrdP1 = (short)(0) ;
      Z115ArtUrdP2 = (short)(0) ;
      Z116ArtUrdP3 = (short)(0) ;
      Z1229ArtEncCom = (short)(0) ;
      Z1230ArtEncAnh = (short)(0) ;
      Z1903ArtGraAca = (short)(0) ;
      Z1905ArtRdoA = DecimalUtil.ZERO ;
      Z1904ArtRdoN = DecimalUtil.ZERO ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      Z2834ArtPle2 = "" ;
      Z3121ArtNumCor = (short)(0) ;
      Z3122ArtAncSal1 = (short)(0) ;
      Z3123ArtAncSal2 = (short)(0) ;
      Z3124ArtAncSal3 = (short)(0) ;
      Z3125ArtGraAca2 = (short)(0) ;
      Z3126ArtGraCru2 = (short)(0) ;
      Z4297ArtPmPPza = DecimalUtil.ZERO ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      Z5741ArtComer = "" ;
      Z6435ArtRdoCru1 = DecimalUtil.ZERO ;
      Z6436ArtRdoCru2 = DecimalUtil.ZERO ;
      Z967ArtNMtr = "" ;
      Z6462ArtLu = DecimalUtil.ZERO ;
      Z4607ArtRb = (short)(0) ;
      Z4444ArtPelAnh = (short)(0) ;
      Z7412Artgrm2Sc = (short)(0) ;
      Z7413ArtPmlSc = (short)(0) ;
      Z7414ArtAncSc = (short)(0) ;
      Z7415ArtPmlCru = (short)(0) ;
      Z7777ArtRdtSc = DecimalUtil.ZERO ;
      Z7778ArtUnd = "" ;
      Z7779ArtBlo = "" ;
      Z7948ArtCla = (byte)(0) ;
      Z9730ArtFabsH = DecimalUtil.ZERO ;
      Z9801ArtFabsT = DecimalUtil.ZERO ;
      Z9875ArtNProg = (byte)(0) ;
      Z9902ArtVbd = (short)(0) ;
      Z9903ArtVbn = (short)(0) ;
      Z9904ArtAb = (short)(0) ;
      Z397ArtObsGrm = "" ;
      Z398ArtObsAnc = "" ;
      Z4980ArtCdb = "" ;
      Z10027ArtGalga = "" ;
      Z10028ArtPlatina = "" ;
      Z10029ArtPgd = "" ;
      Z10804ArtHilos = (short)(0) ;
      Z10805ArtPasad = (short)(0) ;
      Z10831ArtAncC = (short)(0) ;
      Z10832ArtGrm2C = (short)(0) ;
      Z10833ArtRdoC = DecimalUtil.ZERO ;
      Z4455ArtAcaFor = 0 ;
      Z3682ArtAnu = "" ;
      Z11627ArtFacUti = DecimalUtil.ZERO ;
      Z1581ArtNumTip = 0 ;
      Z12364ArtMT = (byte)(0) ;
      Z12365ArtTRabs = (byte)(0) ;
      Z12366ArtKgMn = DecimalUtil.ZERO ;
      Z4446ArtAcaMar = "" ;
      Z4447ArtAcaBak = "" ;
      Z12695ArtElgAnc = DecimalUtil.ZERO ;
      Z12696ArtElgLar = DecimalUtil.ZERO ;
      Z12697ArtRdoCru = DecimalUtil.ZERO ;
      Z12698ArtEncLarg = DecimalUtil.ZERO ;
      Z12699ArtEncAnc = DecimalUtil.ZERO ;
      Z14099ArtRdto4 = DecimalUtil.ZERO ;
      Z14100Artdsc2 = "" ;
      Z14101ArtgrComp = DecimalUtil.ZERO ;
      Z14102ArtKgspp = DecimalUtil.ZERO ;
      Z14103ArtPrepp = DecimalUtil.ZERO ;
      Z90ArtObsFac = "" ;
      Z12886ArtObsOtra = "" ;
      Z14295ArtActivo = "" ;
      Z829TipArtCod = (short)(0) ;
      Z10030ArtTh = (short)(0) ;
      Z4295ClasCod = (short)(0) ;
      Z6108ClaBolCod = (short)(0) ;
      Z6106ClaTubCod = (short)(0) ;
      Z10379Art_Cd = (short)(0) ;
   }

   public void initAll0810( )
   {
      A396EmprCod = "" ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A65ArtCod = "" ;
      n65ArtCod = false ;
      initializeNonKey0810( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4353ArtUsrCod = i4353ArtUsrCod ;
      n4353ArtUsrCod = false ;
      A73ArtEti = i73ArtEti ;
      n73ArtEti = false ;
      A3683ArtFecCre = i3683ArtFecCre ;
      n3683ArtFecCre = false ;
      A7779ArtBlo = i7779ArtBlo ;
      n7779ArtBlo = false ;
      A14295ArtActivo = i14295ArtActivo ;
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow10( app.SdtTARTICU obj10 )
   {
      obj10.setgxTv_SdtTARTICU_Mode( Gx_mode );
      obj10.setgxTv_SdtTARTICU_Artcorori( A66ArtCorOri );
      obj10.setgxTv_SdtTARTICU_Artencori( A70ArtEncOri );
      obj10.setgxTv_SdtTARTICU_Artcdsc( A13751ArtCDsc );
      obj10.setgxTv_SdtTARTICU_Clinom( A279CliNom );
      obj10.setgxTv_SdtTARTICU_Artcodext( A5335ArtCodExt );
      obj10.setgxTv_SdtTARTICU_Emprnom( A407EmprNom );
      obj10.setgxTv_SdtTARTICU_Artmat( A87ArtMat );
      obj10.setgxTv_SdtTARTICU_Tipartcod( A829TipArtCod );
      obj10.setgxTv_SdtTARTICU_Tipartdsc( A830TipArtDsc );
      obj10.setgxTv_SdtTARTICU_Artpml( A1148ArtPml );
      obj10.setgxTv_SdtTARTICU_Artgracru( A78ArtGraCru );
      obj10.setgxTv_SdtTARTICU_Artcrumin( A68ArtCruMin );
      obj10.setgxTv_SdtTARTICU_Artcrumax( A67ArtCruMax );
      obj10.setgxTv_SdtTARTICU_Artacamin( A63ArtAcaMin );
      obj10.setgxTv_SdtTARTICU_Artacamax( A62ArtAcaMax );
      obj10.setgxTv_SdtTARTICU_Artren( A95ArtRen );
      obj10.setgxTv_SdtTARTICU_Arttipple( A101ArtTipPle );
      obj10.setgxTv_SdtTARTICU_Arttiplar( A100ArtTipLar );
      obj10.setgxTv_SdtTARTICU_Artsua( A96ArtSua );
      obj10.setgxTv_SdtTARTICU_Artacaqui( A64ArtAcaQui );
      obj10.setgxTv_SdtTARTICU_Clieti( A272CliEti );
      obj10.setgxTv_SdtTARTICU_Cliurg( A306CliUrg );
      obj10.setgxTv_SdtTARTICU_Artmer( A88ArtMer );
      obj10.setgxTv_SdtTARTICU_Arttra1( A105ArtTra1 );
      obj10.setgxTv_SdtTARTICU_Arttra2( A106ArtTra2 );
      obj10.setgxTv_SdtTARTICU_Arttra3( A107ArtTra3 );
      obj10.setgxTv_SdtTARTICU_Arttrap1( A108ArtTraP1 );
      obj10.setgxTv_SdtTARTICU_Arttrap2( A109ArtTraP2 );
      obj10.setgxTv_SdtTARTICU_Arttrap3( A110ArtTraP3 );
      obj10.setgxTv_SdtTARTICU_Arturd1( A111ArtUrd1 );
      obj10.setgxTv_SdtTARTICU_Arturd2( A112ArtUrd2 );
      obj10.setgxTv_SdtTARTICU_Arturd3( A113ArtUrd3 );
      obj10.setgxTv_SdtTARTICU_Arturdp1( A114ArtUrdP1 );
      obj10.setgxTv_SdtTARTICU_Arturdp2( A115ArtUrdP2 );
      obj10.setgxTv_SdtTARTICU_Arturdp3( A116ArtUrdP3 );
      obj10.setgxTv_SdtTARTICU_Artenccom( A1229ArtEncCom );
      obj10.setgxTv_SdtTARTICU_Artencanh( A1230ArtEncAnh );
      obj10.setgxTv_SdtTARTICU_Artgraaca( A1903ArtGraAca );
      obj10.setgxTv_SdtTARTICU_Artrdoa( A1905ArtRdoA );
      obj10.setgxTv_SdtTARTICU_Artrdon( A1904ArtRdoN );
      obj10.setgxTv_SdtTARTICU_Artfacabs( A2791ArtFacAbs );
      obj10.setgxTv_SdtTARTICU_Artple2( A2834ArtPle2 );
      obj10.setgxTv_SdtTARTICU_Artnumcor( A3121ArtNumCor );
      obj10.setgxTv_SdtTARTICU_Artancsal1( A3122ArtAncSal1 );
      obj10.setgxTv_SdtTARTICU_Artancsal2( A3123ArtAncSal2 );
      obj10.setgxTv_SdtTARTICU_Artancsal3( A3124ArtAncSal3 );
      obj10.setgxTv_SdtTARTICU_Artgraaca2( A3125ArtGraAca2 );
      obj10.setgxTv_SdtTARTICU_Artgracru2( A3126ArtGraCru2 );
      obj10.setgxTv_SdtTARTICU_Clascod( A4295ClasCod );
      obj10.setgxTv_SdtTARTICU_Artpmppza( A4297ArtPmPPza );
      obj10.setgxTv_SdtTARTICU_Artfecmod( A4354ArtFecMod );
      obj10.setgxTv_SdtTARTICU_Clasdsc( A4296ClasDsc );
      obj10.setgxTv_SdtTARTICU_Artcomer( A5741ArtComer );
      obj10.setgxTv_SdtTARTICU_Clatubcod( A6106ClaTubCod );
      obj10.setgxTv_SdtTARTICU_Clatubdsc( A6107ClaTubDsc );
      obj10.setgxTv_SdtTARTICU_Clabolcod( A6108ClaBolCod );
      obj10.setgxTv_SdtTARTICU_Claboldsc( A6109ClaBolDsc );
      obj10.setgxTv_SdtTARTICU_Artrdocru1( A6435ArtRdoCru1 );
      obj10.setgxTv_SdtTARTICU_Artrdocru2( A6436ArtRdoCru2 );
      obj10.setgxTv_SdtTARTICU_Artnmtr( A967ArtNMtr );
      obj10.setgxTv_SdtTARTICU_Artlu( A6462ArtLu );
      obj10.setgxTv_SdtTARTICU_Artrb( A4607ArtRb );
      obj10.setgxTv_SdtTARTICU_Artpelanh( A4444ArtPelAnh );
      obj10.setgxTv_SdtTARTICU_Artgrm2sc( A7412Artgrm2Sc );
      obj10.setgxTv_SdtTARTICU_Artpmlsc( A7413ArtPmlSc );
      obj10.setgxTv_SdtTARTICU_Artancsc( A7414ArtAncSc );
      obj10.setgxTv_SdtTARTICU_Artpmlcru( A7415ArtPmlCru );
      obj10.setgxTv_SdtTARTICU_Artrdtsc( A7777ArtRdtSc );
      obj10.setgxTv_SdtTARTICU_Artund( A7778ArtUnd );
      obj10.setgxTv_SdtTARTICU_Artcla( A7948ArtCla );
      obj10.setgxTv_SdtTARTICU_Tipartdsc2( A6014TipArtDsc2 );
      obj10.setgxTv_SdtTARTICU_Artfabsh( A9730ArtFabsH );
      obj10.setgxTv_SdtTARTICU_Artfabst( A9801ArtFabsT );
      obj10.setgxTv_SdtTARTICU_Artnprog( A9875ArtNProg );
      obj10.setgxTv_SdtTARTICU_Artvbd( A9902ArtVbd );
      obj10.setgxTv_SdtTARTICU_Artvbn( A9903ArtVbn );
      obj10.setgxTv_SdtTARTICU_Artab( A9904ArtAb );
      obj10.setgxTv_SdtTARTICU_Artobsgrm( A397ArtObsGrm );
      obj10.setgxTv_SdtTARTICU_Artobsanc( A398ArtObsAnc );
      obj10.setgxTv_SdtTARTICU_Artcdb( A4980ArtCdb );
      obj10.setgxTv_SdtTARTICU_Artgalga( A10027ArtGalga );
      obj10.setgxTv_SdtTARTICU_Artplatina( A10028ArtPlatina );
      obj10.setgxTv_SdtTARTICU_Artpgd( A10029ArtPgd );
      obj10.setgxTv_SdtTARTICU_Artth( A10030ArtTh );
      obj10.setgxTv_SdtTARTICU_Artthn( A10031ArtThN );
      obj10.setgxTv_SdtTARTICU_Art_cd( A10379Art_Cd );
      obj10.setgxTv_SdtTARTICU_Art_dc( A10380Art_Dc );
      obj10.setgxTv_SdtTARTICU_Arthilos( A10804ArtHilos );
      obj10.setgxTv_SdtTARTICU_Artpasad( A10805ArtPasad );
      obj10.setgxTv_SdtTARTICU_Artancc( A10831ArtAncC );
      obj10.setgxTv_SdtTARTICU_Artgrm2c( A10832ArtGrm2C );
      obj10.setgxTv_SdtTARTICU_Artrdoc( A10833ArtRdoC );
      obj10.setgxTv_SdtTARTICU_Artacafor( A4455ArtAcaFor );
      obj10.setgxTv_SdtTARTICU_Artanu( A3682ArtAnu );
      obj10.setgxTv_SdtTARTICU_Artfacuti( A11627ArtFacUti );
      obj10.setgxTv_SdtTARTICU_Artnumtip( A1581ArtNumTip );
      obj10.setgxTv_SdtTARTICU_Artmt( A12364ArtMT );
      obj10.setgxTv_SdtTARTICU_Arttrabs( A12365ArtTRabs );
      obj10.setgxTv_SdtTARTICU_Artkgmn( A12366ArtKgMn );
      obj10.setgxTv_SdtTARTICU_Artacamar( A4446ArtAcaMar );
      obj10.setgxTv_SdtTARTICU_Artacabak( A4447ArtAcaBak );
      obj10.setgxTv_SdtTARTICU_Artelganc( A12695ArtElgAnc );
      obj10.setgxTv_SdtTARTICU_Artelglar( A12696ArtElgLar );
      obj10.setgxTv_SdtTARTICU_Artrdocru( A12697ArtRdoCru );
      obj10.setgxTv_SdtTARTICU_Artenclarg( A12698ArtEncLarg );
      obj10.setgxTv_SdtTARTICU_Artencanc( A12699ArtEncAnc );
      obj10.setgxTv_SdtTARTICU_Artrdto4( A14099ArtRdto4 );
      obj10.setgxTv_SdtTARTICU_Artdsc2( A14100Artdsc2 );
      obj10.setgxTv_SdtTARTICU_Artgrcomp( A14101ArtgrComp );
      obj10.setgxTv_SdtTARTICU_Artkgspp( A14102ArtKgspp );
      obj10.setgxTv_SdtTARTICU_Artprepp( A14103ArtPrepp );
      obj10.setgxTv_SdtTARTICU_Artobslon( A3072ArtObsLon );
      obj10.setgxTv_SdtTARTICU_Artobsfac( A90ArtObsFac );
      obj10.setgxTv_SdtTARTICU_Artobsotras( A12886ArtObsOtra );
      obj10.setgxTv_SdtTARTICU_Artusrcod( A4353ArtUsrCod );
      obj10.setgxTv_SdtTARTICU_Artdsc( A69ArtDsc );
      obj10.setgxTv_SdtTARTICU_Arteti( A73ArtEti );
      obj10.setgxTv_SdtTARTICU_Arturg( A117ArtUrg );
      obj10.setgxTv_SdtTARTICU_Artfeccre( A3683ArtFecCre );
      obj10.setgxTv_SdtTARTICU_Artblo( A7779ArtBlo );
      obj10.setgxTv_SdtTARTICU_Artactivo( A14295ArtActivo );
      obj10.setgxTv_SdtTARTICU_Emprcod( A396EmprCod );
      obj10.setgxTv_SdtTARTICU_Clicod( A252CliCod );
      obj10.setgxTv_SdtTARTICU_Artcod( A65ArtCod );
      obj10.setgxTv_SdtTARTICU_Emprcod_Z( Z396EmprCod );
      obj10.setgxTv_SdtTARTICU_Clicod_Z( Z252CliCod );
      obj10.setgxTv_SdtTARTICU_Artcod_Z( Z65ArtCod );
      obj10.setgxTv_SdtTARTICU_Artdsc_Z( Z69ArtDsc );
      obj10.setgxTv_SdtTARTICU_Clinom_Z( Z279CliNom );
      obj10.setgxTv_SdtTARTICU_Artcodext_Z( Z5335ArtCodExt );
      obj10.setgxTv_SdtTARTICU_Emprnom_Z( Z407EmprNom );
      obj10.setgxTv_SdtTARTICU_Artmat_Z( Z87ArtMat );
      obj10.setgxTv_SdtTARTICU_Tipartcod_Z( Z829TipArtCod );
      obj10.setgxTv_SdtTARTICU_Tipartdsc_Z( Z830TipArtDsc );
      obj10.setgxTv_SdtTARTICU_Artpml_Z( Z1148ArtPml );
      obj10.setgxTv_SdtTARTICU_Artgracru_Z( Z78ArtGraCru );
      obj10.setgxTv_SdtTARTICU_Artcrumin_Z( Z68ArtCruMin );
      obj10.setgxTv_SdtTARTICU_Artcrumax_Z( Z67ArtCruMax );
      obj10.setgxTv_SdtTARTICU_Artacamin_Z( Z63ArtAcaMin );
      obj10.setgxTv_SdtTARTICU_Artacamax_Z( Z62ArtAcaMax );
      obj10.setgxTv_SdtTARTICU_Artren_Z( Z95ArtRen );
      obj10.setgxTv_SdtTARTICU_Arttipple_Z( Z101ArtTipPle );
      obj10.setgxTv_SdtTARTICU_Arttiplar_Z( Z100ArtTipLar );
      obj10.setgxTv_SdtTARTICU_Artcorori_Z( Z66ArtCorOri );
      obj10.setgxTv_SdtTARTICU_Artencori_Z( Z70ArtEncOri );
      obj10.setgxTv_SdtTARTICU_Artsua_Z( Z96ArtSua );
      obj10.setgxTv_SdtTARTICU_Artacaqui_Z( Z64ArtAcaQui );
      obj10.setgxTv_SdtTARTICU_Arteti_Z( Z73ArtEti );
      obj10.setgxTv_SdtTARTICU_Clieti_Z( Z272CliEti );
      obj10.setgxTv_SdtTARTICU_Cliurg_Z( Z306CliUrg );
      obj10.setgxTv_SdtTARTICU_Arturg_Z( Z117ArtUrg );
      obj10.setgxTv_SdtTARTICU_Artmer_Z( Z88ArtMer );
      obj10.setgxTv_SdtTARTICU_Arttra1_Z( Z105ArtTra1 );
      obj10.setgxTv_SdtTARTICU_Arttra2_Z( Z106ArtTra2 );
      obj10.setgxTv_SdtTARTICU_Arttra3_Z( Z107ArtTra3 );
      obj10.setgxTv_SdtTARTICU_Arttrap1_Z( Z108ArtTraP1 );
      obj10.setgxTv_SdtTARTICU_Arttrap2_Z( Z109ArtTraP2 );
      obj10.setgxTv_SdtTARTICU_Arttrap3_Z( Z110ArtTraP3 );
      obj10.setgxTv_SdtTARTICU_Arturd1_Z( Z111ArtUrd1 );
      obj10.setgxTv_SdtTARTICU_Arturd2_Z( Z112ArtUrd2 );
      obj10.setgxTv_SdtTARTICU_Arturd3_Z( Z113ArtUrd3 );
      obj10.setgxTv_SdtTARTICU_Arturdp1_Z( Z114ArtUrdP1 );
      obj10.setgxTv_SdtTARTICU_Arturdp2_Z( Z115ArtUrdP2 );
      obj10.setgxTv_SdtTARTICU_Arturdp3_Z( Z116ArtUrdP3 );
      obj10.setgxTv_SdtTARTICU_Artenccom_Z( Z1229ArtEncCom );
      obj10.setgxTv_SdtTARTICU_Artencanh_Z( Z1230ArtEncAnh );
      obj10.setgxTv_SdtTARTICU_Artgraaca_Z( Z1903ArtGraAca );
      obj10.setgxTv_SdtTARTICU_Artrdoa_Z( Z1905ArtRdoA );
      obj10.setgxTv_SdtTARTICU_Artrdon_Z( Z1904ArtRdoN );
      obj10.setgxTv_SdtTARTICU_Artfacabs_Z( Z2791ArtFacAbs );
      obj10.setgxTv_SdtTARTICU_Artple2_Z( Z2834ArtPle2 );
      obj10.setgxTv_SdtTARTICU_Artnumcor_Z( Z3121ArtNumCor );
      obj10.setgxTv_SdtTARTICU_Artancsal1_Z( Z3122ArtAncSal1 );
      obj10.setgxTv_SdtTARTICU_Artancsal2_Z( Z3123ArtAncSal2 );
      obj10.setgxTv_SdtTARTICU_Artancsal3_Z( Z3124ArtAncSal3 );
      obj10.setgxTv_SdtTARTICU_Artgraaca2_Z( Z3125ArtGraAca2 );
      obj10.setgxTv_SdtTARTICU_Artgracru2_Z( Z3126ArtGraCru2 );
      obj10.setgxTv_SdtTARTICU_Clascod_Z( Z4295ClasCod );
      obj10.setgxTv_SdtTARTICU_Artpmppza_Z( Z4297ArtPmPPza );
      obj10.setgxTv_SdtTARTICU_Artfeccre_Z( Z3683ArtFecCre );
      obj10.setgxTv_SdtTARTICU_Artusrcod_Z( Z4353ArtUsrCod );
      obj10.setgxTv_SdtTARTICU_Artfecmod_Z( Z4354ArtFecMod );
      obj10.setgxTv_SdtTARTICU_Clasdsc_Z( Z4296ClasDsc );
      obj10.setgxTv_SdtTARTICU_Artcomer_Z( Z5741ArtComer );
      obj10.setgxTv_SdtTARTICU_Clatubcod_Z( Z6106ClaTubCod );
      obj10.setgxTv_SdtTARTICU_Clatubdsc_Z( Z6107ClaTubDsc );
      obj10.setgxTv_SdtTARTICU_Clabolcod_Z( Z6108ClaBolCod );
      obj10.setgxTv_SdtTARTICU_Claboldsc_Z( Z6109ClaBolDsc );
      obj10.setgxTv_SdtTARTICU_Artrdocru1_Z( Z6435ArtRdoCru1 );
      obj10.setgxTv_SdtTARTICU_Artrdocru2_Z( Z6436ArtRdoCru2 );
      obj10.setgxTv_SdtTARTICU_Artnmtr_Z( Z967ArtNMtr );
      obj10.setgxTv_SdtTARTICU_Artlu_Z( Z6462ArtLu );
      obj10.setgxTv_SdtTARTICU_Artrb_Z( Z4607ArtRb );
      obj10.setgxTv_SdtTARTICU_Artpelanh_Z( Z4444ArtPelAnh );
      obj10.setgxTv_SdtTARTICU_Artgrm2sc_Z( Z7412Artgrm2Sc );
      obj10.setgxTv_SdtTARTICU_Artpmlsc_Z( Z7413ArtPmlSc );
      obj10.setgxTv_SdtTARTICU_Artancsc_Z( Z7414ArtAncSc );
      obj10.setgxTv_SdtTARTICU_Artpmlcru_Z( Z7415ArtPmlCru );
      obj10.setgxTv_SdtTARTICU_Artrdtsc_Z( Z7777ArtRdtSc );
      obj10.setgxTv_SdtTARTICU_Artund_Z( Z7778ArtUnd );
      obj10.setgxTv_SdtTARTICU_Artblo_Z( Z7779ArtBlo );
      obj10.setgxTv_SdtTARTICU_Artcla_Z( Z7948ArtCla );
      obj10.setgxTv_SdtTARTICU_Tipartdsc2_Z( Z6014TipArtDsc2 );
      obj10.setgxTv_SdtTARTICU_Artfabsh_Z( Z9730ArtFabsH );
      obj10.setgxTv_SdtTARTICU_Artfabst_Z( Z9801ArtFabsT );
      obj10.setgxTv_SdtTARTICU_Artnprog_Z( Z9875ArtNProg );
      obj10.setgxTv_SdtTARTICU_Artvbd_Z( Z9902ArtVbd );
      obj10.setgxTv_SdtTARTICU_Artvbn_Z( Z9903ArtVbn );
      obj10.setgxTv_SdtTARTICU_Artab_Z( Z9904ArtAb );
      obj10.setgxTv_SdtTARTICU_Artobsgrm_Z( Z397ArtObsGrm );
      obj10.setgxTv_SdtTARTICU_Artobsanc_Z( Z398ArtObsAnc );
      obj10.setgxTv_SdtTARTICU_Artcdb_Z( Z4980ArtCdb );
      obj10.setgxTv_SdtTARTICU_Artgalga_Z( Z10027ArtGalga );
      obj10.setgxTv_SdtTARTICU_Artplatina_Z( Z10028ArtPlatina );
      obj10.setgxTv_SdtTARTICU_Artpgd_Z( Z10029ArtPgd );
      obj10.setgxTv_SdtTARTICU_Artth_Z( Z10030ArtTh );
      obj10.setgxTv_SdtTARTICU_Artthn_Z( Z10031ArtThN );
      obj10.setgxTv_SdtTARTICU_Art_cd_Z( Z10379Art_Cd );
      obj10.setgxTv_SdtTARTICU_Art_dc_Z( Z10380Art_Dc );
      obj10.setgxTv_SdtTARTICU_Arthilos_Z( Z10804ArtHilos );
      obj10.setgxTv_SdtTARTICU_Artpasad_Z( Z10805ArtPasad );
      obj10.setgxTv_SdtTARTICU_Artancc_Z( Z10831ArtAncC );
      obj10.setgxTv_SdtTARTICU_Artgrm2c_Z( Z10832ArtGrm2C );
      obj10.setgxTv_SdtTARTICU_Artrdoc_Z( Z10833ArtRdoC );
      obj10.setgxTv_SdtTARTICU_Artacafor_Z( Z4455ArtAcaFor );
      obj10.setgxTv_SdtTARTICU_Artanu_Z( Z3682ArtAnu );
      obj10.setgxTv_SdtTARTICU_Artfacuti_Z( Z11627ArtFacUti );
      obj10.setgxTv_SdtTARTICU_Artnumtip_Z( Z1581ArtNumTip );
      obj10.setgxTv_SdtTARTICU_Artmt_Z( Z12364ArtMT );
      obj10.setgxTv_SdtTARTICU_Arttrabs_Z( Z12365ArtTRabs );
      obj10.setgxTv_SdtTARTICU_Artkgmn_Z( Z12366ArtKgMn );
      obj10.setgxTv_SdtTARTICU_Artacamar_Z( Z4446ArtAcaMar );
      obj10.setgxTv_SdtTARTICU_Artacabak_Z( Z4447ArtAcaBak );
      obj10.setgxTv_SdtTARTICU_Artelganc_Z( Z12695ArtElgAnc );
      obj10.setgxTv_SdtTARTICU_Artelglar_Z( Z12696ArtElgLar );
      obj10.setgxTv_SdtTARTICU_Artrdocru_Z( Z12697ArtRdoCru );
      obj10.setgxTv_SdtTARTICU_Artenclarg_Z( Z12698ArtEncLarg );
      obj10.setgxTv_SdtTARTICU_Artencanc_Z( Z12699ArtEncAnc );
      obj10.setgxTv_SdtTARTICU_Artrdto4_Z( Z14099ArtRdto4 );
      obj10.setgxTv_SdtTARTICU_Artdsc2_Z( Z14100Artdsc2 );
      obj10.setgxTv_SdtTARTICU_Artgrcomp_Z( Z14101ArtgrComp );
      obj10.setgxTv_SdtTARTICU_Artkgspp_Z( Z14102ArtKgspp );
      obj10.setgxTv_SdtTARTICU_Artprepp_Z( Z14103ArtPrepp );
      obj10.setgxTv_SdtTARTICU_Artcdsc_Z( Z13751ArtCDsc );
      obj10.setgxTv_SdtTARTICU_Artobsfac_Z( Z90ArtObsFac );
      obj10.setgxTv_SdtTARTICU_Artobsotras_Z( Z12886ArtObsOtra );
      obj10.setgxTv_SdtTARTICU_Artactivo_Z( Z14295ArtActivo );
      obj10.setgxTv_SdtTARTICU_Clicod_N( (byte)((byte)((n252CliCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcod_N( (byte)((byte)((n65ArtCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artdsc_N( (byte)((byte)((n69ArtDsc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcodext_N( (byte)((byte)((n5335ArtCodExt)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artmat_N( (byte)((byte)((n87ArtMat)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Tipartdsc_N( (byte)((byte)((n830TipArtDsc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpml_N( (byte)((byte)((n1148ArtPml)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgracru_N( (byte)((byte)((n78ArtGraCru)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcrumin_N( (byte)((byte)((n68ArtCruMin)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcrumax_N( (byte)((byte)((n67ArtCruMax)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacamin_N( (byte)((byte)((n63ArtAcaMin)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacamax_N( (byte)((byte)((n62ArtAcaMax)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artren_N( (byte)((byte)((n95ArtRen)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttipple_N( (byte)((byte)((n101ArtTipPle)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttiplar_N( (byte)((byte)((n100ArtTipLar)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcorori_N( (byte)((byte)((n66ArtCorOri)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artencori_N( (byte)((byte)((n70ArtEncOri)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artsua_N( (byte)((byte)((n96ArtSua)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacaqui_N( (byte)((byte)((n64ArtAcaQui)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arteti_N( (byte)((byte)((n73ArtEti)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturg_N( (byte)((byte)((n117ArtUrg)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artmer_N( (byte)((byte)((n88ArtMer)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttra1_N( (byte)((byte)((n105ArtTra1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttra2_N( (byte)((byte)((n106ArtTra2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttra3_N( (byte)((byte)((n107ArtTra3)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttrap1_N( (byte)((byte)((n108ArtTraP1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttrap2_N( (byte)((byte)((n109ArtTraP2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttrap3_N( (byte)((byte)((n110ArtTraP3)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturd1_N( (byte)((byte)((n111ArtUrd1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturd2_N( (byte)((byte)((n112ArtUrd2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturd3_N( (byte)((byte)((n113ArtUrd3)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturdp1_N( (byte)((byte)((n114ArtUrdP1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturdp2_N( (byte)((byte)((n115ArtUrdP2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arturdp3_N( (byte)((byte)((n116ArtUrdP3)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artenccom_N( (byte)((byte)((n1229ArtEncCom)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artencanh_N( (byte)((byte)((n1230ArtEncAnh)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgraaca_N( (byte)((byte)((n1903ArtGraAca)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdoa_N( (byte)((byte)((n1905ArtRdoA)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdon_N( (byte)((byte)((n1904ArtRdoN)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfacabs_N( (byte)((byte)((n2791ArtFacAbs)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artple2_N( (byte)((byte)((n2834ArtPle2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artnumcor_N( (byte)((byte)((n3121ArtNumCor)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artancsal1_N( (byte)((byte)((n3122ArtAncSal1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artancsal2_N( (byte)((byte)((n3123ArtAncSal2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artancsal3_N( (byte)((byte)((n3124ArtAncSal3)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgraaca2_N( (byte)((byte)((n3125ArtGraAca2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgracru2_N( (byte)((byte)((n3126ArtGraCru2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Clascod_N( (byte)((byte)((n4295ClasCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpmppza_N( (byte)((byte)((n4297ArtPmPPza)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfeccre_N( (byte)((byte)((n3683ArtFecCre)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artusrcod_N( (byte)((byte)((n4353ArtUsrCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfecmod_N( (byte)((byte)((n4354ArtFecMod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Clasdsc_N( (byte)((byte)((n4296ClasDsc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcomer_N( (byte)((byte)((n5741ArtComer)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Clatubcod_N( (byte)((byte)((n6106ClaTubCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Clatubdsc_N( (byte)((byte)((n6107ClaTubDsc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Clabolcod_N( (byte)((byte)((n6108ClaBolCod)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Claboldsc_N( (byte)((byte)((n6109ClaBolDsc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdocru1_N( (byte)((byte)((n6435ArtRdoCru1)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdocru2_N( (byte)((byte)((n6436ArtRdoCru2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artnmtr_N( (byte)((byte)((n967ArtNMtr)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artlu_N( (byte)((byte)((n6462ArtLu)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrb_N( (byte)((byte)((n4607ArtRb)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpelanh_N( (byte)((byte)((n4444ArtPelAnh)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgrm2sc_N( (byte)((byte)((n7412Artgrm2Sc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpmlsc_N( (byte)((byte)((n7413ArtPmlSc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artancsc_N( (byte)((byte)((n7414ArtAncSc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpmlcru_N( (byte)((byte)((n7415ArtPmlCru)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdtsc_N( (byte)((byte)((n7777ArtRdtSc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artund_N( (byte)((byte)((n7778ArtUnd)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artblo_N( (byte)((byte)((n7779ArtBlo)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcla_N( (byte)((byte)((n7948ArtCla)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Tipartdsc2_N( (byte)((byte)((n6014TipArtDsc2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfabsh_N( (byte)((byte)((n9730ArtFabsH)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfabst_N( (byte)((byte)((n9801ArtFabsT)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artnprog_N( (byte)((byte)((n9875ArtNProg)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artvbd_N( (byte)((byte)((n9902ArtVbd)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artvbn_N( (byte)((byte)((n9903ArtVbn)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artab_N( (byte)((byte)((n9904ArtAb)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artobsgrm_N( (byte)((byte)((n397ArtObsGrm)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artobsanc_N( (byte)((byte)((n398ArtObsAnc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artcdb_N( (byte)((byte)((n4980ArtCdb)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgalga_N( (byte)((byte)((n10027ArtGalga)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artplatina_N( (byte)((byte)((n10028ArtPlatina)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpgd_N( (byte)((byte)((n10029ArtPgd)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artth_N( (byte)((byte)((n10030ArtTh)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artthn_N( (byte)((byte)((n10031ArtThN)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Art_cd_N( (byte)((byte)((n10379Art_Cd)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Art_dc_N( (byte)((byte)((n10380Art_Dc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arthilos_N( (byte)((byte)((n10804ArtHilos)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artpasad_N( (byte)((byte)((n10805ArtPasad)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artancc_N( (byte)((byte)((n10831ArtAncC)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgrm2c_N( (byte)((byte)((n10832ArtGrm2C)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdoc_N( (byte)((byte)((n10833ArtRdoC)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacafor_N( (byte)((byte)((n4455ArtAcaFor)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artanu_N( (byte)((byte)((n3682ArtAnu)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artfacuti_N( (byte)((byte)((n11627ArtFacUti)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artnumtip_N( (byte)((byte)((n1581ArtNumTip)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artmt_N( (byte)((byte)((n12364ArtMT)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Arttrabs_N( (byte)((byte)((n12365ArtTRabs)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artkgmn_N( (byte)((byte)((n12366ArtKgMn)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacamar_N( (byte)((byte)((n4446ArtAcaMar)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artacabak_N( (byte)((byte)((n4447ArtAcaBak)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artelganc_N( (byte)((byte)((n12695ArtElgAnc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artelglar_N( (byte)((byte)((n12696ArtElgLar)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdocru_N( (byte)((byte)((n12697ArtRdoCru)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artenclarg_N( (byte)((byte)((n12698ArtEncLarg)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artencanc_N( (byte)((byte)((n12699ArtEncAnc)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artrdto4_N( (byte)((byte)((n14099ArtRdto4)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artdsc2_N( (byte)((byte)((n14100Artdsc2)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artgrcomp_N( (byte)((byte)((n14101ArtgrComp)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artkgspp_N( (byte)((byte)((n14102ArtKgspp)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artprepp_N( (byte)((byte)((n14103ArtPrepp)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artobslon_N( (byte)((byte)((n3072ArtObsLon)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artobsfac_N( (byte)((byte)((n90ArtObsFac)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Artobsotras_N( (byte)((byte)((n12886ArtObsOtra)?1:0)) );
      obj10.setgxTv_SdtTARTICU_Mode( Gx_mode );
   }

   public void KeyVarsToRow10( app.SdtTARTICU obj10 )
   {
      obj10.setgxTv_SdtTARTICU_Emprcod( A396EmprCod );
      obj10.setgxTv_SdtTARTICU_Clicod( A252CliCod );
      obj10.setgxTv_SdtTARTICU_Artcod( A65ArtCod );
   }

   public void RowToVars10( app.SdtTARTICU obj10 ,
                            int forceLoad )
   {
      Gx_mode = obj10.getgxTv_SdtTARTICU_Mode() ;
      A66ArtCorOri = obj10.getgxTv_SdtTARTICU_Artcorori() ;
      n66ArtCorOri = false ;
      A70ArtEncOri = obj10.getgxTv_SdtTARTICU_Artencori() ;
      n70ArtEncOri = false ;
      A13751ArtCDsc = obj10.getgxTv_SdtTARTICU_Artcdsc() ;
      A279CliNom = obj10.getgxTv_SdtTARTICU_Clinom() ;
      A5335ArtCodExt = obj10.getgxTv_SdtTARTICU_Artcodext() ;
      n5335ArtCodExt = false ;
      A407EmprNom = obj10.getgxTv_SdtTARTICU_Emprnom() ;
      n407EmprNom = false ;
      A87ArtMat = obj10.getgxTv_SdtTARTICU_Artmat() ;
      n87ArtMat = false ;
      A829TipArtCod = obj10.getgxTv_SdtTARTICU_Tipartcod() ;
      A830TipArtDsc = obj10.getgxTv_SdtTARTICU_Tipartdsc() ;
      n830TipArtDsc = false ;
      A1148ArtPml = obj10.getgxTv_SdtTARTICU_Artpml() ;
      n1148ArtPml = false ;
      A78ArtGraCru = obj10.getgxTv_SdtTARTICU_Artgracru() ;
      n78ArtGraCru = false ;
      A68ArtCruMin = obj10.getgxTv_SdtTARTICU_Artcrumin() ;
      n68ArtCruMin = false ;
      A67ArtCruMax = obj10.getgxTv_SdtTARTICU_Artcrumax() ;
      n67ArtCruMax = false ;
      A63ArtAcaMin = obj10.getgxTv_SdtTARTICU_Artacamin() ;
      n63ArtAcaMin = false ;
      A62ArtAcaMax = obj10.getgxTv_SdtTARTICU_Artacamax() ;
      n62ArtAcaMax = false ;
      A95ArtRen = obj10.getgxTv_SdtTARTICU_Artren() ;
      n95ArtRen = false ;
      A101ArtTipPle = obj10.getgxTv_SdtTARTICU_Arttipple() ;
      n101ArtTipPle = false ;
      A100ArtTipLar = obj10.getgxTv_SdtTARTICU_Arttiplar() ;
      n100ArtTipLar = false ;
      A96ArtSua = obj10.getgxTv_SdtTARTICU_Artsua() ;
      n96ArtSua = false ;
      A64ArtAcaQui = obj10.getgxTv_SdtTARTICU_Artacaqui() ;
      n64ArtAcaQui = false ;
      A272CliEti = obj10.getgxTv_SdtTARTICU_Clieti() ;
      A306CliUrg = obj10.getgxTv_SdtTARTICU_Cliurg() ;
      A88ArtMer = obj10.getgxTv_SdtTARTICU_Artmer() ;
      n88ArtMer = false ;
      A105ArtTra1 = obj10.getgxTv_SdtTARTICU_Arttra1() ;
      n105ArtTra1 = false ;
      A106ArtTra2 = obj10.getgxTv_SdtTARTICU_Arttra2() ;
      n106ArtTra2 = false ;
      A107ArtTra3 = obj10.getgxTv_SdtTARTICU_Arttra3() ;
      n107ArtTra3 = false ;
      A108ArtTraP1 = obj10.getgxTv_SdtTARTICU_Arttrap1() ;
      n108ArtTraP1 = false ;
      A109ArtTraP2 = obj10.getgxTv_SdtTARTICU_Arttrap2() ;
      n109ArtTraP2 = false ;
      A110ArtTraP3 = obj10.getgxTv_SdtTARTICU_Arttrap3() ;
      n110ArtTraP3 = false ;
      A111ArtUrd1 = obj10.getgxTv_SdtTARTICU_Arturd1() ;
      n111ArtUrd1 = false ;
      A112ArtUrd2 = obj10.getgxTv_SdtTARTICU_Arturd2() ;
      n112ArtUrd2 = false ;
      A113ArtUrd3 = obj10.getgxTv_SdtTARTICU_Arturd3() ;
      n113ArtUrd3 = false ;
      A114ArtUrdP1 = obj10.getgxTv_SdtTARTICU_Arturdp1() ;
      n114ArtUrdP1 = false ;
      A115ArtUrdP2 = obj10.getgxTv_SdtTARTICU_Arturdp2() ;
      n115ArtUrdP2 = false ;
      A116ArtUrdP3 = obj10.getgxTv_SdtTARTICU_Arturdp3() ;
      n116ArtUrdP3 = false ;
      A1229ArtEncCom = obj10.getgxTv_SdtTARTICU_Artenccom() ;
      n1229ArtEncCom = false ;
      A1230ArtEncAnh = obj10.getgxTv_SdtTARTICU_Artencanh() ;
      n1230ArtEncAnh = false ;
      A1903ArtGraAca = obj10.getgxTv_SdtTARTICU_Artgraaca() ;
      n1903ArtGraAca = false ;
      A1905ArtRdoA = obj10.getgxTv_SdtTARTICU_Artrdoa() ;
      n1905ArtRdoA = false ;
      A1904ArtRdoN = obj10.getgxTv_SdtTARTICU_Artrdon() ;
      n1904ArtRdoN = false ;
      A2791ArtFacAbs = obj10.getgxTv_SdtTARTICU_Artfacabs() ;
      n2791ArtFacAbs = false ;
      A2834ArtPle2 = obj10.getgxTv_SdtTARTICU_Artple2() ;
      n2834ArtPle2 = false ;
      A3121ArtNumCor = obj10.getgxTv_SdtTARTICU_Artnumcor() ;
      n3121ArtNumCor = false ;
      A3122ArtAncSal1 = obj10.getgxTv_SdtTARTICU_Artancsal1() ;
      n3122ArtAncSal1 = false ;
      A3123ArtAncSal2 = obj10.getgxTv_SdtTARTICU_Artancsal2() ;
      n3123ArtAncSal2 = false ;
      A3124ArtAncSal3 = obj10.getgxTv_SdtTARTICU_Artancsal3() ;
      n3124ArtAncSal3 = false ;
      A3125ArtGraAca2 = obj10.getgxTv_SdtTARTICU_Artgraaca2() ;
      n3125ArtGraAca2 = false ;
      A3126ArtGraCru2 = obj10.getgxTv_SdtTARTICU_Artgracru2() ;
      n3126ArtGraCru2 = false ;
      A4295ClasCod = obj10.getgxTv_SdtTARTICU_Clascod() ;
      n4295ClasCod = false ;
      A4297ArtPmPPza = obj10.getgxTv_SdtTARTICU_Artpmppza() ;
      n4297ArtPmPPza = false ;
      A4354ArtFecMod = obj10.getgxTv_SdtTARTICU_Artfecmod() ;
      n4354ArtFecMod = false ;
      A4296ClasDsc = obj10.getgxTv_SdtTARTICU_Clasdsc() ;
      n4296ClasDsc = false ;
      A5741ArtComer = obj10.getgxTv_SdtTARTICU_Artcomer() ;
      n5741ArtComer = false ;
      A6106ClaTubCod = obj10.getgxTv_SdtTARTICU_Clatubcod() ;
      n6106ClaTubCod = false ;
      A6107ClaTubDsc = obj10.getgxTv_SdtTARTICU_Clatubdsc() ;
      n6107ClaTubDsc = false ;
      A6108ClaBolCod = obj10.getgxTv_SdtTARTICU_Clabolcod() ;
      n6108ClaBolCod = false ;
      A6109ClaBolDsc = obj10.getgxTv_SdtTARTICU_Claboldsc() ;
      n6109ClaBolDsc = false ;
      A6435ArtRdoCru1 = obj10.getgxTv_SdtTARTICU_Artrdocru1() ;
      n6435ArtRdoCru1 = false ;
      A6436ArtRdoCru2 = obj10.getgxTv_SdtTARTICU_Artrdocru2() ;
      n6436ArtRdoCru2 = false ;
      A967ArtNMtr = obj10.getgxTv_SdtTARTICU_Artnmtr() ;
      n967ArtNMtr = false ;
      A6462ArtLu = obj10.getgxTv_SdtTARTICU_Artlu() ;
      n6462ArtLu = false ;
      A4607ArtRb = obj10.getgxTv_SdtTARTICU_Artrb() ;
      n4607ArtRb = false ;
      A4444ArtPelAnh = obj10.getgxTv_SdtTARTICU_Artpelanh() ;
      n4444ArtPelAnh = false ;
      A7412Artgrm2Sc = obj10.getgxTv_SdtTARTICU_Artgrm2sc() ;
      n7412Artgrm2Sc = false ;
      A7413ArtPmlSc = obj10.getgxTv_SdtTARTICU_Artpmlsc() ;
      n7413ArtPmlSc = false ;
      A7414ArtAncSc = obj10.getgxTv_SdtTARTICU_Artancsc() ;
      n7414ArtAncSc = false ;
      A7415ArtPmlCru = obj10.getgxTv_SdtTARTICU_Artpmlcru() ;
      n7415ArtPmlCru = false ;
      A7777ArtRdtSc = obj10.getgxTv_SdtTARTICU_Artrdtsc() ;
      n7777ArtRdtSc = false ;
      A7778ArtUnd = obj10.getgxTv_SdtTARTICU_Artund() ;
      n7778ArtUnd = false ;
      A7948ArtCla = obj10.getgxTv_SdtTARTICU_Artcla() ;
      n7948ArtCla = false ;
      A6014TipArtDsc2 = obj10.getgxTv_SdtTARTICU_Tipartdsc2() ;
      n6014TipArtDsc2 = false ;
      A9730ArtFabsH = obj10.getgxTv_SdtTARTICU_Artfabsh() ;
      n9730ArtFabsH = false ;
      A9801ArtFabsT = obj10.getgxTv_SdtTARTICU_Artfabst() ;
      n9801ArtFabsT = false ;
      A9875ArtNProg = obj10.getgxTv_SdtTARTICU_Artnprog() ;
      n9875ArtNProg = false ;
      A9902ArtVbd = obj10.getgxTv_SdtTARTICU_Artvbd() ;
      n9902ArtVbd = false ;
      A9903ArtVbn = obj10.getgxTv_SdtTARTICU_Artvbn() ;
      n9903ArtVbn = false ;
      A9904ArtAb = obj10.getgxTv_SdtTARTICU_Artab() ;
      n9904ArtAb = false ;
      A397ArtObsGrm = obj10.getgxTv_SdtTARTICU_Artobsgrm() ;
      n397ArtObsGrm = false ;
      A398ArtObsAnc = obj10.getgxTv_SdtTARTICU_Artobsanc() ;
      n398ArtObsAnc = false ;
      A4980ArtCdb = obj10.getgxTv_SdtTARTICU_Artcdb() ;
      n4980ArtCdb = false ;
      A10027ArtGalga = obj10.getgxTv_SdtTARTICU_Artgalga() ;
      n10027ArtGalga = false ;
      A10028ArtPlatina = obj10.getgxTv_SdtTARTICU_Artplatina() ;
      n10028ArtPlatina = false ;
      A10029ArtPgd = obj10.getgxTv_SdtTARTICU_Artpgd() ;
      n10029ArtPgd = false ;
      A10030ArtTh = obj10.getgxTv_SdtTARTICU_Artth() ;
      n10030ArtTh = false ;
      A10031ArtThN = obj10.getgxTv_SdtTARTICU_Artthn() ;
      n10031ArtThN = false ;
      A10379Art_Cd = obj10.getgxTv_SdtTARTICU_Art_cd() ;
      n10379Art_Cd = false ;
      A10380Art_Dc = obj10.getgxTv_SdtTARTICU_Art_dc() ;
      n10380Art_Dc = false ;
      A10804ArtHilos = obj10.getgxTv_SdtTARTICU_Arthilos() ;
      n10804ArtHilos = false ;
      A10805ArtPasad = obj10.getgxTv_SdtTARTICU_Artpasad() ;
      n10805ArtPasad = false ;
      A10831ArtAncC = obj10.getgxTv_SdtTARTICU_Artancc() ;
      n10831ArtAncC = false ;
      A10832ArtGrm2C = obj10.getgxTv_SdtTARTICU_Artgrm2c() ;
      n10832ArtGrm2C = false ;
      A10833ArtRdoC = obj10.getgxTv_SdtTARTICU_Artrdoc() ;
      n10833ArtRdoC = false ;
      A4455ArtAcaFor = obj10.getgxTv_SdtTARTICU_Artacafor() ;
      n4455ArtAcaFor = false ;
      A3682ArtAnu = obj10.getgxTv_SdtTARTICU_Artanu() ;
      n3682ArtAnu = false ;
      A11627ArtFacUti = obj10.getgxTv_SdtTARTICU_Artfacuti() ;
      n11627ArtFacUti = false ;
      A1581ArtNumTip = obj10.getgxTv_SdtTARTICU_Artnumtip() ;
      n1581ArtNumTip = false ;
      A12364ArtMT = obj10.getgxTv_SdtTARTICU_Artmt() ;
      n12364ArtMT = false ;
      A12365ArtTRabs = obj10.getgxTv_SdtTARTICU_Arttrabs() ;
      n12365ArtTRabs = false ;
      A12366ArtKgMn = obj10.getgxTv_SdtTARTICU_Artkgmn() ;
      n12366ArtKgMn = false ;
      A4446ArtAcaMar = obj10.getgxTv_SdtTARTICU_Artacamar() ;
      n4446ArtAcaMar = false ;
      A4447ArtAcaBak = obj10.getgxTv_SdtTARTICU_Artacabak() ;
      n4447ArtAcaBak = false ;
      A12695ArtElgAnc = obj10.getgxTv_SdtTARTICU_Artelganc() ;
      n12695ArtElgAnc = false ;
      A12696ArtElgLar = obj10.getgxTv_SdtTARTICU_Artelglar() ;
      n12696ArtElgLar = false ;
      A12697ArtRdoCru = obj10.getgxTv_SdtTARTICU_Artrdocru() ;
      n12697ArtRdoCru = false ;
      A12698ArtEncLarg = obj10.getgxTv_SdtTARTICU_Artenclarg() ;
      n12698ArtEncLarg = false ;
      A12699ArtEncAnc = obj10.getgxTv_SdtTARTICU_Artencanc() ;
      n12699ArtEncAnc = false ;
      A14099ArtRdto4 = obj10.getgxTv_SdtTARTICU_Artrdto4() ;
      n14099ArtRdto4 = false ;
      A14100Artdsc2 = obj10.getgxTv_SdtTARTICU_Artdsc2() ;
      n14100Artdsc2 = false ;
      A14101ArtgrComp = obj10.getgxTv_SdtTARTICU_Artgrcomp() ;
      n14101ArtgrComp = false ;
      A14102ArtKgspp = obj10.getgxTv_SdtTARTICU_Artkgspp() ;
      n14102ArtKgspp = false ;
      A14103ArtPrepp = obj10.getgxTv_SdtTARTICU_Artprepp() ;
      n14103ArtPrepp = false ;
      A3072ArtObsLon = obj10.getgxTv_SdtTARTICU_Artobslon() ;
      n3072ArtObsLon = false ;
      A90ArtObsFac = obj10.getgxTv_SdtTARTICU_Artobsfac() ;
      n90ArtObsFac = false ;
      A12886ArtObsOtra = obj10.getgxTv_SdtTARTICU_Artobsotras() ;
      n12886ArtObsOtra = false ;
      A4353ArtUsrCod = obj10.getgxTv_SdtTARTICU_Artusrcod() ;
      n4353ArtUsrCod = false ;
      A69ArtDsc = obj10.getgxTv_SdtTARTICU_Artdsc() ;
      n69ArtDsc = false ;
      A73ArtEti = obj10.getgxTv_SdtTARTICU_Arteti() ;
      n73ArtEti = false ;
      A117ArtUrg = obj10.getgxTv_SdtTARTICU_Arturg() ;
      n117ArtUrg = false ;
      A3683ArtFecCre = obj10.getgxTv_SdtTARTICU_Artfeccre() ;
      n3683ArtFecCre = false ;
      A7779ArtBlo = obj10.getgxTv_SdtTARTICU_Artblo() ;
      n7779ArtBlo = false ;
      A14295ArtActivo = obj10.getgxTv_SdtTARTICU_Artactivo() ;
      A396EmprCod = obj10.getgxTv_SdtTARTICU_Emprcod() ;
      A252CliCod = obj10.getgxTv_SdtTARTICU_Clicod() ;
      n252CliCod = false ;
      A65ArtCod = obj10.getgxTv_SdtTARTICU_Artcod() ;
      n65ArtCod = false ;
      Z396EmprCod = obj10.getgxTv_SdtTARTICU_Emprcod_Z() ;
      Z252CliCod = obj10.getgxTv_SdtTARTICU_Clicod_Z() ;
      Z65ArtCod = obj10.getgxTv_SdtTARTICU_Artcod_Z() ;
      Z69ArtDsc = obj10.getgxTv_SdtTARTICU_Artdsc_Z() ;
      Z279CliNom = obj10.getgxTv_SdtTARTICU_Clinom_Z() ;
      Z5335ArtCodExt = obj10.getgxTv_SdtTARTICU_Artcodext_Z() ;
      Z407EmprNom = obj10.getgxTv_SdtTARTICU_Emprnom_Z() ;
      Z87ArtMat = obj10.getgxTv_SdtTARTICU_Artmat_Z() ;
      Z829TipArtCod = obj10.getgxTv_SdtTARTICU_Tipartcod_Z() ;
      Z830TipArtDsc = obj10.getgxTv_SdtTARTICU_Tipartdsc_Z() ;
      Z1148ArtPml = obj10.getgxTv_SdtTARTICU_Artpml_Z() ;
      Z78ArtGraCru = obj10.getgxTv_SdtTARTICU_Artgracru_Z() ;
      Z68ArtCruMin = obj10.getgxTv_SdtTARTICU_Artcrumin_Z() ;
      Z67ArtCruMax = obj10.getgxTv_SdtTARTICU_Artcrumax_Z() ;
      Z63ArtAcaMin = obj10.getgxTv_SdtTARTICU_Artacamin_Z() ;
      Z62ArtAcaMax = obj10.getgxTv_SdtTARTICU_Artacamax_Z() ;
      Z95ArtRen = obj10.getgxTv_SdtTARTICU_Artren_Z() ;
      Z101ArtTipPle = obj10.getgxTv_SdtTARTICU_Arttipple_Z() ;
      Z100ArtTipLar = obj10.getgxTv_SdtTARTICU_Arttiplar_Z() ;
      Z66ArtCorOri = obj10.getgxTv_SdtTARTICU_Artcorori_Z() ;
      Z70ArtEncOri = obj10.getgxTv_SdtTARTICU_Artencori_Z() ;
      Z96ArtSua = obj10.getgxTv_SdtTARTICU_Artsua_Z() ;
      Z64ArtAcaQui = obj10.getgxTv_SdtTARTICU_Artacaqui_Z() ;
      Z73ArtEti = obj10.getgxTv_SdtTARTICU_Arteti_Z() ;
      Z272CliEti = obj10.getgxTv_SdtTARTICU_Clieti_Z() ;
      Z306CliUrg = obj10.getgxTv_SdtTARTICU_Cliurg_Z() ;
      Z117ArtUrg = obj10.getgxTv_SdtTARTICU_Arturg_Z() ;
      Z88ArtMer = obj10.getgxTv_SdtTARTICU_Artmer_Z() ;
      Z105ArtTra1 = obj10.getgxTv_SdtTARTICU_Arttra1_Z() ;
      Z106ArtTra2 = obj10.getgxTv_SdtTARTICU_Arttra2_Z() ;
      Z107ArtTra3 = obj10.getgxTv_SdtTARTICU_Arttra3_Z() ;
      Z108ArtTraP1 = obj10.getgxTv_SdtTARTICU_Arttrap1_Z() ;
      Z109ArtTraP2 = obj10.getgxTv_SdtTARTICU_Arttrap2_Z() ;
      Z110ArtTraP3 = obj10.getgxTv_SdtTARTICU_Arttrap3_Z() ;
      Z111ArtUrd1 = obj10.getgxTv_SdtTARTICU_Arturd1_Z() ;
      Z112ArtUrd2 = obj10.getgxTv_SdtTARTICU_Arturd2_Z() ;
      Z113ArtUrd3 = obj10.getgxTv_SdtTARTICU_Arturd3_Z() ;
      Z114ArtUrdP1 = obj10.getgxTv_SdtTARTICU_Arturdp1_Z() ;
      Z115ArtUrdP2 = obj10.getgxTv_SdtTARTICU_Arturdp2_Z() ;
      Z116ArtUrdP3 = obj10.getgxTv_SdtTARTICU_Arturdp3_Z() ;
      Z1229ArtEncCom = obj10.getgxTv_SdtTARTICU_Artenccom_Z() ;
      Z1230ArtEncAnh = obj10.getgxTv_SdtTARTICU_Artencanh_Z() ;
      Z1903ArtGraAca = obj10.getgxTv_SdtTARTICU_Artgraaca_Z() ;
      Z1905ArtRdoA = obj10.getgxTv_SdtTARTICU_Artrdoa_Z() ;
      Z1904ArtRdoN = obj10.getgxTv_SdtTARTICU_Artrdon_Z() ;
      Z2791ArtFacAbs = obj10.getgxTv_SdtTARTICU_Artfacabs_Z() ;
      Z2834ArtPle2 = obj10.getgxTv_SdtTARTICU_Artple2_Z() ;
      Z3121ArtNumCor = obj10.getgxTv_SdtTARTICU_Artnumcor_Z() ;
      Z3122ArtAncSal1 = obj10.getgxTv_SdtTARTICU_Artancsal1_Z() ;
      Z3123ArtAncSal2 = obj10.getgxTv_SdtTARTICU_Artancsal2_Z() ;
      Z3124ArtAncSal3 = obj10.getgxTv_SdtTARTICU_Artancsal3_Z() ;
      Z3125ArtGraAca2 = obj10.getgxTv_SdtTARTICU_Artgraaca2_Z() ;
      Z3126ArtGraCru2 = obj10.getgxTv_SdtTARTICU_Artgracru2_Z() ;
      Z4295ClasCod = obj10.getgxTv_SdtTARTICU_Clascod_Z() ;
      Z4297ArtPmPPza = obj10.getgxTv_SdtTARTICU_Artpmppza_Z() ;
      Z3683ArtFecCre = obj10.getgxTv_SdtTARTICU_Artfeccre_Z() ;
      Z4353ArtUsrCod = obj10.getgxTv_SdtTARTICU_Artusrcod_Z() ;
      O4353ArtUsrCod = obj10.getgxTv_SdtTARTICU_Artusrcod_Z() ;
      Z4354ArtFecMod = obj10.getgxTv_SdtTARTICU_Artfecmod_Z() ;
      Z4296ClasDsc = obj10.getgxTv_SdtTARTICU_Clasdsc_Z() ;
      Z5741ArtComer = obj10.getgxTv_SdtTARTICU_Artcomer_Z() ;
      Z6106ClaTubCod = obj10.getgxTv_SdtTARTICU_Clatubcod_Z() ;
      Z6107ClaTubDsc = obj10.getgxTv_SdtTARTICU_Clatubdsc_Z() ;
      Z6108ClaBolCod = obj10.getgxTv_SdtTARTICU_Clabolcod_Z() ;
      Z6109ClaBolDsc = obj10.getgxTv_SdtTARTICU_Claboldsc_Z() ;
      Z6435ArtRdoCru1 = obj10.getgxTv_SdtTARTICU_Artrdocru1_Z() ;
      Z6436ArtRdoCru2 = obj10.getgxTv_SdtTARTICU_Artrdocru2_Z() ;
      Z967ArtNMtr = obj10.getgxTv_SdtTARTICU_Artnmtr_Z() ;
      Z6462ArtLu = obj10.getgxTv_SdtTARTICU_Artlu_Z() ;
      Z4607ArtRb = obj10.getgxTv_SdtTARTICU_Artrb_Z() ;
      Z4444ArtPelAnh = obj10.getgxTv_SdtTARTICU_Artpelanh_Z() ;
      Z7412Artgrm2Sc = obj10.getgxTv_SdtTARTICU_Artgrm2sc_Z() ;
      Z7413ArtPmlSc = obj10.getgxTv_SdtTARTICU_Artpmlsc_Z() ;
      Z7414ArtAncSc = obj10.getgxTv_SdtTARTICU_Artancsc_Z() ;
      Z7415ArtPmlCru = obj10.getgxTv_SdtTARTICU_Artpmlcru_Z() ;
      Z7777ArtRdtSc = obj10.getgxTv_SdtTARTICU_Artrdtsc_Z() ;
      Z7778ArtUnd = obj10.getgxTv_SdtTARTICU_Artund_Z() ;
      Z7779ArtBlo = obj10.getgxTv_SdtTARTICU_Artblo_Z() ;
      Z7948ArtCla = obj10.getgxTv_SdtTARTICU_Artcla_Z() ;
      Z6014TipArtDsc2 = obj10.getgxTv_SdtTARTICU_Tipartdsc2_Z() ;
      Z9730ArtFabsH = obj10.getgxTv_SdtTARTICU_Artfabsh_Z() ;
      Z9801ArtFabsT = obj10.getgxTv_SdtTARTICU_Artfabst_Z() ;
      Z9875ArtNProg = obj10.getgxTv_SdtTARTICU_Artnprog_Z() ;
      Z9902ArtVbd = obj10.getgxTv_SdtTARTICU_Artvbd_Z() ;
      Z9903ArtVbn = obj10.getgxTv_SdtTARTICU_Artvbn_Z() ;
      Z9904ArtAb = obj10.getgxTv_SdtTARTICU_Artab_Z() ;
      Z397ArtObsGrm = obj10.getgxTv_SdtTARTICU_Artobsgrm_Z() ;
      Z398ArtObsAnc = obj10.getgxTv_SdtTARTICU_Artobsanc_Z() ;
      Z4980ArtCdb = obj10.getgxTv_SdtTARTICU_Artcdb_Z() ;
      Z10027ArtGalga = obj10.getgxTv_SdtTARTICU_Artgalga_Z() ;
      Z10028ArtPlatina = obj10.getgxTv_SdtTARTICU_Artplatina_Z() ;
      Z10029ArtPgd = obj10.getgxTv_SdtTARTICU_Artpgd_Z() ;
      Z10030ArtTh = obj10.getgxTv_SdtTARTICU_Artth_Z() ;
      Z10031ArtThN = obj10.getgxTv_SdtTARTICU_Artthn_Z() ;
      Z10379Art_Cd = obj10.getgxTv_SdtTARTICU_Art_cd_Z() ;
      Z10380Art_Dc = obj10.getgxTv_SdtTARTICU_Art_dc_Z() ;
      Z10804ArtHilos = obj10.getgxTv_SdtTARTICU_Arthilos_Z() ;
      Z10805ArtPasad = obj10.getgxTv_SdtTARTICU_Artpasad_Z() ;
      Z10831ArtAncC = obj10.getgxTv_SdtTARTICU_Artancc_Z() ;
      Z10832ArtGrm2C = obj10.getgxTv_SdtTARTICU_Artgrm2c_Z() ;
      Z10833ArtRdoC = obj10.getgxTv_SdtTARTICU_Artrdoc_Z() ;
      Z4455ArtAcaFor = obj10.getgxTv_SdtTARTICU_Artacafor_Z() ;
      Z3682ArtAnu = obj10.getgxTv_SdtTARTICU_Artanu_Z() ;
      Z11627ArtFacUti = obj10.getgxTv_SdtTARTICU_Artfacuti_Z() ;
      Z1581ArtNumTip = obj10.getgxTv_SdtTARTICU_Artnumtip_Z() ;
      Z12364ArtMT = obj10.getgxTv_SdtTARTICU_Artmt_Z() ;
      Z12365ArtTRabs = obj10.getgxTv_SdtTARTICU_Arttrabs_Z() ;
      Z12366ArtKgMn = obj10.getgxTv_SdtTARTICU_Artkgmn_Z() ;
      Z4446ArtAcaMar = obj10.getgxTv_SdtTARTICU_Artacamar_Z() ;
      Z4447ArtAcaBak = obj10.getgxTv_SdtTARTICU_Artacabak_Z() ;
      Z12695ArtElgAnc = obj10.getgxTv_SdtTARTICU_Artelganc_Z() ;
      Z12696ArtElgLar = obj10.getgxTv_SdtTARTICU_Artelglar_Z() ;
      Z12697ArtRdoCru = obj10.getgxTv_SdtTARTICU_Artrdocru_Z() ;
      Z12698ArtEncLarg = obj10.getgxTv_SdtTARTICU_Artenclarg_Z() ;
      Z12699ArtEncAnc = obj10.getgxTv_SdtTARTICU_Artencanc_Z() ;
      Z14099ArtRdto4 = obj10.getgxTv_SdtTARTICU_Artrdto4_Z() ;
      Z14100Artdsc2 = obj10.getgxTv_SdtTARTICU_Artdsc2_Z() ;
      Z14101ArtgrComp = obj10.getgxTv_SdtTARTICU_Artgrcomp_Z() ;
      Z14102ArtKgspp = obj10.getgxTv_SdtTARTICU_Artkgspp_Z() ;
      Z14103ArtPrepp = obj10.getgxTv_SdtTARTICU_Artprepp_Z() ;
      Z13751ArtCDsc = obj10.getgxTv_SdtTARTICU_Artcdsc_Z() ;
      Z90ArtObsFac = obj10.getgxTv_SdtTARTICU_Artobsfac_Z() ;
      Z12886ArtObsOtra = obj10.getgxTv_SdtTARTICU_Artobsotras_Z() ;
      Z14295ArtActivo = obj10.getgxTv_SdtTARTICU_Artactivo_Z() ;
      n252CliCod = (boolean)((obj10.getgxTv_SdtTARTICU_Clicod_N()==0)?false:true) ;
      n65ArtCod = (boolean)((obj10.getgxTv_SdtTARTICU_Artcod_N()==0)?false:true) ;
      n69ArtDsc = (boolean)((obj10.getgxTv_SdtTARTICU_Artdsc_N()==0)?false:true) ;
      n5335ArtCodExt = (boolean)((obj10.getgxTv_SdtTARTICU_Artcodext_N()==0)?false:true) ;
      n407EmprNom = (boolean)((obj10.getgxTv_SdtTARTICU_Emprnom_N()==0)?false:true) ;
      n87ArtMat = (boolean)((obj10.getgxTv_SdtTARTICU_Artmat_N()==0)?false:true) ;
      n830TipArtDsc = (boolean)((obj10.getgxTv_SdtTARTICU_Tipartdsc_N()==0)?false:true) ;
      n1148ArtPml = (boolean)((obj10.getgxTv_SdtTARTICU_Artpml_N()==0)?false:true) ;
      n78ArtGraCru = (boolean)((obj10.getgxTv_SdtTARTICU_Artgracru_N()==0)?false:true) ;
      n68ArtCruMin = (boolean)((obj10.getgxTv_SdtTARTICU_Artcrumin_N()==0)?false:true) ;
      n67ArtCruMax = (boolean)((obj10.getgxTv_SdtTARTICU_Artcrumax_N()==0)?false:true) ;
      n63ArtAcaMin = (boolean)((obj10.getgxTv_SdtTARTICU_Artacamin_N()==0)?false:true) ;
      n62ArtAcaMax = (boolean)((obj10.getgxTv_SdtTARTICU_Artacamax_N()==0)?false:true) ;
      n95ArtRen = (boolean)((obj10.getgxTv_SdtTARTICU_Artren_N()==0)?false:true) ;
      n101ArtTipPle = (boolean)((obj10.getgxTv_SdtTARTICU_Arttipple_N()==0)?false:true) ;
      n100ArtTipLar = (boolean)((obj10.getgxTv_SdtTARTICU_Arttiplar_N()==0)?false:true) ;
      n66ArtCorOri = (boolean)((obj10.getgxTv_SdtTARTICU_Artcorori_N()==0)?false:true) ;
      n70ArtEncOri = (boolean)((obj10.getgxTv_SdtTARTICU_Artencori_N()==0)?false:true) ;
      n96ArtSua = (boolean)((obj10.getgxTv_SdtTARTICU_Artsua_N()==0)?false:true) ;
      n64ArtAcaQui = (boolean)((obj10.getgxTv_SdtTARTICU_Artacaqui_N()==0)?false:true) ;
      n73ArtEti = (boolean)((obj10.getgxTv_SdtTARTICU_Arteti_N()==0)?false:true) ;
      n117ArtUrg = (boolean)((obj10.getgxTv_SdtTARTICU_Arturg_N()==0)?false:true) ;
      n88ArtMer = (boolean)((obj10.getgxTv_SdtTARTICU_Artmer_N()==0)?false:true) ;
      n105ArtTra1 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttra1_N()==0)?false:true) ;
      n106ArtTra2 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttra2_N()==0)?false:true) ;
      n107ArtTra3 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttra3_N()==0)?false:true) ;
      n108ArtTraP1 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttrap1_N()==0)?false:true) ;
      n109ArtTraP2 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttrap2_N()==0)?false:true) ;
      n110ArtTraP3 = (boolean)((obj10.getgxTv_SdtTARTICU_Arttrap3_N()==0)?false:true) ;
      n111ArtUrd1 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturd1_N()==0)?false:true) ;
      n112ArtUrd2 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturd2_N()==0)?false:true) ;
      n113ArtUrd3 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturd3_N()==0)?false:true) ;
      n114ArtUrdP1 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturdp1_N()==0)?false:true) ;
      n115ArtUrdP2 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturdp2_N()==0)?false:true) ;
      n116ArtUrdP3 = (boolean)((obj10.getgxTv_SdtTARTICU_Arturdp3_N()==0)?false:true) ;
      n1229ArtEncCom = (boolean)((obj10.getgxTv_SdtTARTICU_Artenccom_N()==0)?false:true) ;
      n1230ArtEncAnh = (boolean)((obj10.getgxTv_SdtTARTICU_Artencanh_N()==0)?false:true) ;
      n1903ArtGraAca = (boolean)((obj10.getgxTv_SdtTARTICU_Artgraaca_N()==0)?false:true) ;
      n1905ArtRdoA = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdoa_N()==0)?false:true) ;
      n1904ArtRdoN = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdon_N()==0)?false:true) ;
      n2791ArtFacAbs = (boolean)((obj10.getgxTv_SdtTARTICU_Artfacabs_N()==0)?false:true) ;
      n2834ArtPle2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artple2_N()==0)?false:true) ;
      n3121ArtNumCor = (boolean)((obj10.getgxTv_SdtTARTICU_Artnumcor_N()==0)?false:true) ;
      n3122ArtAncSal1 = (boolean)((obj10.getgxTv_SdtTARTICU_Artancsal1_N()==0)?false:true) ;
      n3123ArtAncSal2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artancsal2_N()==0)?false:true) ;
      n3124ArtAncSal3 = (boolean)((obj10.getgxTv_SdtTARTICU_Artancsal3_N()==0)?false:true) ;
      n3125ArtGraAca2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artgraaca2_N()==0)?false:true) ;
      n3126ArtGraCru2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artgracru2_N()==0)?false:true) ;
      n4295ClasCod = (boolean)((obj10.getgxTv_SdtTARTICU_Clascod_N()==0)?false:true) ;
      n4297ArtPmPPza = (boolean)((obj10.getgxTv_SdtTARTICU_Artpmppza_N()==0)?false:true) ;
      n3683ArtFecCre = (boolean)((obj10.getgxTv_SdtTARTICU_Artfeccre_N()==0)?false:true) ;
      n4353ArtUsrCod = (boolean)((obj10.getgxTv_SdtTARTICU_Artusrcod_N()==0)?false:true) ;
      n4354ArtFecMod = (boolean)((obj10.getgxTv_SdtTARTICU_Artfecmod_N()==0)?false:true) ;
      n4296ClasDsc = (boolean)((obj10.getgxTv_SdtTARTICU_Clasdsc_N()==0)?false:true) ;
      n5741ArtComer = (boolean)((obj10.getgxTv_SdtTARTICU_Artcomer_N()==0)?false:true) ;
      n6106ClaTubCod = (boolean)((obj10.getgxTv_SdtTARTICU_Clatubcod_N()==0)?false:true) ;
      n6107ClaTubDsc = (boolean)((obj10.getgxTv_SdtTARTICU_Clatubdsc_N()==0)?false:true) ;
      n6108ClaBolCod = (boolean)((obj10.getgxTv_SdtTARTICU_Clabolcod_N()==0)?false:true) ;
      n6109ClaBolDsc = (boolean)((obj10.getgxTv_SdtTARTICU_Claboldsc_N()==0)?false:true) ;
      n6435ArtRdoCru1 = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdocru1_N()==0)?false:true) ;
      n6436ArtRdoCru2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdocru2_N()==0)?false:true) ;
      n967ArtNMtr = (boolean)((obj10.getgxTv_SdtTARTICU_Artnmtr_N()==0)?false:true) ;
      n6462ArtLu = (boolean)((obj10.getgxTv_SdtTARTICU_Artlu_N()==0)?false:true) ;
      n4607ArtRb = (boolean)((obj10.getgxTv_SdtTARTICU_Artrb_N()==0)?false:true) ;
      n4444ArtPelAnh = (boolean)((obj10.getgxTv_SdtTARTICU_Artpelanh_N()==0)?false:true) ;
      n7412Artgrm2Sc = (boolean)((obj10.getgxTv_SdtTARTICU_Artgrm2sc_N()==0)?false:true) ;
      n7413ArtPmlSc = (boolean)((obj10.getgxTv_SdtTARTICU_Artpmlsc_N()==0)?false:true) ;
      n7414ArtAncSc = (boolean)((obj10.getgxTv_SdtTARTICU_Artancsc_N()==0)?false:true) ;
      n7415ArtPmlCru = (boolean)((obj10.getgxTv_SdtTARTICU_Artpmlcru_N()==0)?false:true) ;
      n7777ArtRdtSc = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdtsc_N()==0)?false:true) ;
      n7778ArtUnd = (boolean)((obj10.getgxTv_SdtTARTICU_Artund_N()==0)?false:true) ;
      n7779ArtBlo = (boolean)((obj10.getgxTv_SdtTARTICU_Artblo_N()==0)?false:true) ;
      n7948ArtCla = (boolean)((obj10.getgxTv_SdtTARTICU_Artcla_N()==0)?false:true) ;
      n6014TipArtDsc2 = (boolean)((obj10.getgxTv_SdtTARTICU_Tipartdsc2_N()==0)?false:true) ;
      n9730ArtFabsH = (boolean)((obj10.getgxTv_SdtTARTICU_Artfabsh_N()==0)?false:true) ;
      n9801ArtFabsT = (boolean)((obj10.getgxTv_SdtTARTICU_Artfabst_N()==0)?false:true) ;
      n9875ArtNProg = (boolean)((obj10.getgxTv_SdtTARTICU_Artnprog_N()==0)?false:true) ;
      n9902ArtVbd = (boolean)((obj10.getgxTv_SdtTARTICU_Artvbd_N()==0)?false:true) ;
      n9903ArtVbn = (boolean)((obj10.getgxTv_SdtTARTICU_Artvbn_N()==0)?false:true) ;
      n9904ArtAb = (boolean)((obj10.getgxTv_SdtTARTICU_Artab_N()==0)?false:true) ;
      n397ArtObsGrm = (boolean)((obj10.getgxTv_SdtTARTICU_Artobsgrm_N()==0)?false:true) ;
      n398ArtObsAnc = (boolean)((obj10.getgxTv_SdtTARTICU_Artobsanc_N()==0)?false:true) ;
      n4980ArtCdb = (boolean)((obj10.getgxTv_SdtTARTICU_Artcdb_N()==0)?false:true) ;
      n10027ArtGalga = (boolean)((obj10.getgxTv_SdtTARTICU_Artgalga_N()==0)?false:true) ;
      n10028ArtPlatina = (boolean)((obj10.getgxTv_SdtTARTICU_Artplatina_N()==0)?false:true) ;
      n10029ArtPgd = (boolean)((obj10.getgxTv_SdtTARTICU_Artpgd_N()==0)?false:true) ;
      n10030ArtTh = (boolean)((obj10.getgxTv_SdtTARTICU_Artth_N()==0)?false:true) ;
      n10031ArtThN = (boolean)((obj10.getgxTv_SdtTARTICU_Artthn_N()==0)?false:true) ;
      n10379Art_Cd = (boolean)((obj10.getgxTv_SdtTARTICU_Art_cd_N()==0)?false:true) ;
      n10380Art_Dc = (boolean)((obj10.getgxTv_SdtTARTICU_Art_dc_N()==0)?false:true) ;
      n10804ArtHilos = (boolean)((obj10.getgxTv_SdtTARTICU_Arthilos_N()==0)?false:true) ;
      n10805ArtPasad = (boolean)((obj10.getgxTv_SdtTARTICU_Artpasad_N()==0)?false:true) ;
      n10831ArtAncC = (boolean)((obj10.getgxTv_SdtTARTICU_Artancc_N()==0)?false:true) ;
      n10832ArtGrm2C = (boolean)((obj10.getgxTv_SdtTARTICU_Artgrm2c_N()==0)?false:true) ;
      n10833ArtRdoC = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdoc_N()==0)?false:true) ;
      n4455ArtAcaFor = (boolean)((obj10.getgxTv_SdtTARTICU_Artacafor_N()==0)?false:true) ;
      n3682ArtAnu = (boolean)((obj10.getgxTv_SdtTARTICU_Artanu_N()==0)?false:true) ;
      n11627ArtFacUti = (boolean)((obj10.getgxTv_SdtTARTICU_Artfacuti_N()==0)?false:true) ;
      n1581ArtNumTip = (boolean)((obj10.getgxTv_SdtTARTICU_Artnumtip_N()==0)?false:true) ;
      n12364ArtMT = (boolean)((obj10.getgxTv_SdtTARTICU_Artmt_N()==0)?false:true) ;
      n12365ArtTRabs = (boolean)((obj10.getgxTv_SdtTARTICU_Arttrabs_N()==0)?false:true) ;
      n12366ArtKgMn = (boolean)((obj10.getgxTv_SdtTARTICU_Artkgmn_N()==0)?false:true) ;
      n4446ArtAcaMar = (boolean)((obj10.getgxTv_SdtTARTICU_Artacamar_N()==0)?false:true) ;
      n4447ArtAcaBak = (boolean)((obj10.getgxTv_SdtTARTICU_Artacabak_N()==0)?false:true) ;
      n12695ArtElgAnc = (boolean)((obj10.getgxTv_SdtTARTICU_Artelganc_N()==0)?false:true) ;
      n12696ArtElgLar = (boolean)((obj10.getgxTv_SdtTARTICU_Artelglar_N()==0)?false:true) ;
      n12697ArtRdoCru = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdocru_N()==0)?false:true) ;
      n12698ArtEncLarg = (boolean)((obj10.getgxTv_SdtTARTICU_Artenclarg_N()==0)?false:true) ;
      n12699ArtEncAnc = (boolean)((obj10.getgxTv_SdtTARTICU_Artencanc_N()==0)?false:true) ;
      n14099ArtRdto4 = (boolean)((obj10.getgxTv_SdtTARTICU_Artrdto4_N()==0)?false:true) ;
      n14100Artdsc2 = (boolean)((obj10.getgxTv_SdtTARTICU_Artdsc2_N()==0)?false:true) ;
      n14101ArtgrComp = (boolean)((obj10.getgxTv_SdtTARTICU_Artgrcomp_N()==0)?false:true) ;
      n14102ArtKgspp = (boolean)((obj10.getgxTv_SdtTARTICU_Artkgspp_N()==0)?false:true) ;
      n14103ArtPrepp = (boolean)((obj10.getgxTv_SdtTARTICU_Artprepp_N()==0)?false:true) ;
      n3072ArtObsLon = (boolean)((obj10.getgxTv_SdtTARTICU_Artobslon_N()==0)?false:true) ;
      n90ArtObsFac = (boolean)((obj10.getgxTv_SdtTARTICU_Artobsfac_N()==0)?false:true) ;
      n12886ArtObsOtra = (boolean)((obj10.getgxTv_SdtTARTICU_Artobsotras_N()==0)?false:true) ;
      Gx_mode = obj10.getgxTv_SdtTARTICU_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      n252CliCod = false ;
      A65ArtCod = (String)getParm(obj,2) ;
      n65ArtCod = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0810( ) ;
      scanKeyStart0810( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000880 */
         pr_default.execute(78, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(78) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC000880_A407EmprNom[0] ;
         n407EmprNom = BC000880_n407EmprNom[0] ;
         pr_default.close(78);
         /* Using cursor BC000881 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(79) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
         A279CliNom = BC000881_A279CliNom[0] ;
         A272CliEti = BC000881_A272CliEti[0] ;
         A306CliUrg = BC000881_A306CliUrg[0] ;
         pr_default.close(79);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         O4353ArtUsrCod = A4353ArtUsrCod ;
         n4353ArtUsrCod = false ;
      }
      zm0810( -20) ;
      onLoadActions0810( ) ;
      addRow0810( ) ;
      scanKeyEnd0810( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars10( bcTARTICU, 0) ;
      scanKeyStart0810( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000882 */
         pr_default.execute(80, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(80) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC000882_A407EmprNom[0] ;
         n407EmprNom = BC000882_n407EmprNom[0] ;
         pr_default.close(80);
         /* Using cursor BC000883 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(81) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
         A279CliNom = BC000883_A279CliNom[0] ;
         A272CliEti = BC000883_A272CliEti[0] ;
         A306CliUrg = BC000883_A306CliUrg[0] ;
         pr_default.close(81);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         O4353ArtUsrCod = A4353ArtUsrCod ;
         n4353ArtUsrCod = false ;
      }
      zm0810( -20) ;
      onLoadActions0810( ) ;
      addRow0810( ) ;
      scanKeyEnd0810( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0810( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0810( ) ;
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update0810( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert0810( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert0810( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcTARTICU, 1) ;
      saveImpl( ) ;
      VarsToRow10( bcTARTICU) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcTARTICU, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0810( ) ;
      afterTrn( ) ;
      VarsToRow10( bcTARTICU) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         app.SdtTARTICU auxBC = new app.SdtTARTICU( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A252CliCod, A65ArtCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTARTICU);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcTARTICU, 1) ;
      updateImpl( ) ;
      VarsToRow10( bcTARTICU) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcTARTICU, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0810( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow10( bcTARTICU) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars10( bcTARTICU, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0810( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            A65ArtCod = Z65ArtCod ;
            n65ArtCod = false ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tarticu_bc");
      VarsToRow10( bcTARTICU) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcTARTICU.getgxTv_SdtTARTICU_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTARTICU.setgxTv_SdtTARTICU_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTARTICU sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTARTICU )
      {
         bcTARTICU = sdt ;
         if ( GXutil.strcmp(bcTARTICU.getgxTv_SdtTARTICU_Mode(), "") == 0 )
         {
            bcTARTICU.setgxTv_SdtTARTICU_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow10( bcTARTICU) ;
         }
         else
         {
            RowToVars10( bcTARTICU, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTARTICU.getgxTv_SdtTARTICU_Mode(), "") == 0 )
         {
            bcTARTICU.setgxTv_SdtTARTICU_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars10( bcTARTICU, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTARTICU getTARTICU_BC( )
   {
      return bcTARTICU ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      AV52Station = "" ;
      GXt_char1 = "" ;
      AV57EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV199WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV200TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV201WebSession = httpContext.getWebSession();
      AV221Pgmname = "" ;
      AV208TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int7 = new byte[1] ;
      AV218ArtFecMod = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      Z66ArtCorOri = "" ;
      A66ArtCorOri = "" ;
      Z70ArtEncOri = "" ;
      A70ArtEncOri = "" ;
      Z4353ArtUsrCod = "" ;
      A4353ArtUsrCod = "" ;
      Z69ArtDsc = "" ;
      Z5335ArtCodExt = "" ;
      A5335ArtCodExt = "" ;
      Z87ArtMat = "" ;
      A87ArtMat = "" ;
      Z95ArtRen = DecimalUtil.ZERO ;
      A95ArtRen = DecimalUtil.ZERO ;
      Z101ArtTipPle = "" ;
      A101ArtTipPle = "" ;
      Z100ArtTipLar = "" ;
      A100ArtTipLar = "" ;
      Z96ArtSua = "" ;
      A96ArtSua = "" ;
      Z64ArtAcaQui = "" ;
      A64ArtAcaQui = "" ;
      Z73ArtEti = "" ;
      A73ArtEti = "" ;
      Z88ArtMer = DecimalUtil.ZERO ;
      A88ArtMer = DecimalUtil.ZERO ;
      Z105ArtTra1 = "" ;
      A105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      A106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      A107ArtTra3 = "" ;
      Z111ArtUrd1 = "" ;
      A111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      A112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      A113ArtUrd3 = "" ;
      Z1905ArtRdoA = DecimalUtil.ZERO ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      Z1904ArtRdoN = DecimalUtil.ZERO ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      Z2834ArtPle2 = "" ;
      A2834ArtPle2 = "" ;
      Z4297ArtPmPPza = DecimalUtil.ZERO ;
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      A3683ArtFecCre = GXutil.nullDate() ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      A4354ArtFecMod = GXutil.nullDate() ;
      Z5741ArtComer = "" ;
      A5741ArtComer = "" ;
      Z6435ArtRdoCru1 = DecimalUtil.ZERO ;
      A6435ArtRdoCru1 = DecimalUtil.ZERO ;
      Z6436ArtRdoCru2 = DecimalUtil.ZERO ;
      A6436ArtRdoCru2 = DecimalUtil.ZERO ;
      Z967ArtNMtr = "" ;
      A967ArtNMtr = "" ;
      Z6462ArtLu = DecimalUtil.ZERO ;
      A6462ArtLu = DecimalUtil.ZERO ;
      Z7777ArtRdtSc = DecimalUtil.ZERO ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      Z7778ArtUnd = "" ;
      A7778ArtUnd = "" ;
      Z7779ArtBlo = "" ;
      A7779ArtBlo = "" ;
      Z9730ArtFabsH = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      Z9801ArtFabsT = DecimalUtil.ZERO ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      Z397ArtObsGrm = "" ;
      A397ArtObsGrm = "" ;
      Z398ArtObsAnc = "" ;
      A398ArtObsAnc = "" ;
      Z4980ArtCdb = "" ;
      A4980ArtCdb = "" ;
      Z10027ArtGalga = "" ;
      A10027ArtGalga = "" ;
      Z10028ArtPlatina = "" ;
      A10028ArtPlatina = "" ;
      Z10029ArtPgd = "" ;
      A10029ArtPgd = "" ;
      Z10833ArtRdoC = DecimalUtil.ZERO ;
      A10833ArtRdoC = DecimalUtil.ZERO ;
      Z3682ArtAnu = "" ;
      A3682ArtAnu = "" ;
      Z11627ArtFacUti = DecimalUtil.ZERO ;
      A11627ArtFacUti = DecimalUtil.ZERO ;
      Z12366ArtKgMn = DecimalUtil.ZERO ;
      A12366ArtKgMn = DecimalUtil.ZERO ;
      Z4446ArtAcaMar = "" ;
      A4446ArtAcaMar = "" ;
      Z4447ArtAcaBak = "" ;
      A4447ArtAcaBak = "" ;
      Z12695ArtElgAnc = DecimalUtil.ZERO ;
      A12695ArtElgAnc = DecimalUtil.ZERO ;
      Z12696ArtElgLar = DecimalUtil.ZERO ;
      A12696ArtElgLar = DecimalUtil.ZERO ;
      Z12697ArtRdoCru = DecimalUtil.ZERO ;
      A12697ArtRdoCru = DecimalUtil.ZERO ;
      Z12698ArtEncLarg = DecimalUtil.ZERO ;
      A12698ArtEncLarg = DecimalUtil.ZERO ;
      Z12699ArtEncAnc = DecimalUtil.ZERO ;
      A12699ArtEncAnc = DecimalUtil.ZERO ;
      Z14099ArtRdto4 = DecimalUtil.ZERO ;
      A14099ArtRdto4 = DecimalUtil.ZERO ;
      Z14100Artdsc2 = "" ;
      A14100Artdsc2 = "" ;
      Z14101ArtgrComp = DecimalUtil.ZERO ;
      A14101ArtgrComp = DecimalUtil.ZERO ;
      Z14102ArtKgspp = DecimalUtil.ZERO ;
      A14102ArtKgspp = DecimalUtil.ZERO ;
      Z14103ArtPrepp = DecimalUtil.ZERO ;
      A14103ArtPrepp = DecimalUtil.ZERO ;
      Z90ArtObsFac = "" ;
      A90ArtObsFac = "" ;
      Z12886ArtObsOtra = "" ;
      A12886ArtObsOtra = "" ;
      Z14295ArtActivo = "" ;
      A14295ArtActivo = "" ;
      Z13751ArtCDsc = "" ;
      A13751ArtCDsc = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z279CliNom = "" ;
      Z272CliEti = "" ;
      A272CliEti = "" ;
      Z830TipArtDsc = "" ;
      A830TipArtDsc = "" ;
      Z6014TipArtDsc2 = "" ;
      A6014TipArtDsc2 = "" ;
      Z10031ArtThN = "" ;
      A10031ArtThN = "" ;
      Z4296ClasDsc = "" ;
      A4296ClasDsc = "" ;
      Z6109ClaBolDsc = "" ;
      A6109ClaBolDsc = "" ;
      Z6107ClaTubDsc = "" ;
      A6107ClaTubDsc = "" ;
      Z10380Art_Dc = "" ;
      A10380Art_Dc = "" ;
      Z3072ArtObsLon = "" ;
      A3072ArtObsLon = "" ;
      AV217Artusrcod = "" ;
      O4353ArtUsrCod = "" ;
      BC000812_A3072ArtObsLon = new String[] {""} ;
      BC000812_n3072ArtObsLon = new boolean[] {false} ;
      BC000812_A4447ArtAcaBak = new String[] {""} ;
      BC000812_n4447ArtAcaBak = new boolean[] {false} ;
      BC000812_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12695ArtElgAnc = new boolean[] {false} ;
      BC000812_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12696ArtElgLar = new boolean[] {false} ;
      BC000812_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12697ArtRdoCru = new boolean[] {false} ;
      BC000812_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12698ArtEncLarg = new boolean[] {false} ;
      BC000812_A12699ArtEncAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12699ArtEncAnc = new boolean[] {false} ;
      BC000812_A14099ArtRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n14099ArtRdto4 = new boolean[] {false} ;
      BC000812_A14100Artdsc2 = new String[] {""} ;
      BC000812_n14100Artdsc2 = new boolean[] {false} ;
      BC000812_A14101ArtgrComp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n14101ArtgrComp = new boolean[] {false} ;
      BC000812_A14102ArtKgspp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n14102ArtKgspp = new boolean[] {false} ;
      BC000812_A14103ArtPrepp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n14103ArtPrepp = new boolean[] {false} ;
      BC000812_A90ArtObsFac = new String[] {""} ;
      BC000812_n90ArtObsFac = new boolean[] {false} ;
      BC000812_A12886ArtObsOtra = new String[] {""} ;
      BC000812_n12886ArtObsOtra = new boolean[] {false} ;
      BC000812_A14295ArtActivo = new String[] {""} ;
      BC000812_A396EmprCod = new String[] {""} ;
      BC000812_A252CliCod = new int[1] ;
      BC000812_n252CliCod = new boolean[] {false} ;
      BC000812_A829TipArtCod = new short[1] ;
      BC000812_A10030ArtTh = new short[1] ;
      BC000812_n10030ArtTh = new boolean[] {false} ;
      BC000812_A4295ClasCod = new short[1] ;
      BC000812_n4295ClasCod = new boolean[] {false} ;
      BC000812_A6108ClaBolCod = new short[1] ;
      BC000812_n6108ClaBolCod = new boolean[] {false} ;
      BC000812_A6106ClaTubCod = new short[1] ;
      BC000812_n6106ClaTubCod = new boolean[] {false} ;
      BC000812_A10379Art_Cd = new short[1] ;
      BC000812_n10379Art_Cd = new boolean[] {false} ;
      BC000812_A65ArtCod = new String[] {""} ;
      BC000812_n65ArtCod = new boolean[] {false} ;
      BC000812_A66ArtCorOri = new String[] {""} ;
      BC000812_n66ArtCorOri = new boolean[] {false} ;
      BC000812_A70ArtEncOri = new String[] {""} ;
      BC000812_n70ArtEncOri = new boolean[] {false} ;
      BC000812_A4353ArtUsrCod = new String[] {""} ;
      BC000812_n4353ArtUsrCod = new boolean[] {false} ;
      BC000812_A69ArtDsc = new String[] {""} ;
      BC000812_n69ArtDsc = new boolean[] {false} ;
      BC000812_A279CliNom = new String[] {""} ;
      BC000812_A5335ArtCodExt = new String[] {""} ;
      BC000812_n5335ArtCodExt = new boolean[] {false} ;
      BC000812_A407EmprNom = new String[] {""} ;
      BC000812_n407EmprNom = new boolean[] {false} ;
      BC000812_A87ArtMat = new String[] {""} ;
      BC000812_n87ArtMat = new boolean[] {false} ;
      BC000812_A830TipArtDsc = new String[] {""} ;
      BC000812_n830TipArtDsc = new boolean[] {false} ;
      BC000812_A1148ArtPml = new short[1] ;
      BC000812_n1148ArtPml = new boolean[] {false} ;
      BC000812_A78ArtGraCru = new short[1] ;
      BC000812_n78ArtGraCru = new boolean[] {false} ;
      BC000812_A68ArtCruMin = new short[1] ;
      BC000812_n68ArtCruMin = new boolean[] {false} ;
      BC000812_A67ArtCruMax = new short[1] ;
      BC000812_n67ArtCruMax = new boolean[] {false} ;
      BC000812_A63ArtAcaMin = new short[1] ;
      BC000812_n63ArtAcaMin = new boolean[] {false} ;
      BC000812_A62ArtAcaMax = new short[1] ;
      BC000812_n62ArtAcaMax = new boolean[] {false} ;
      BC000812_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n95ArtRen = new boolean[] {false} ;
      BC000812_A101ArtTipPle = new String[] {""} ;
      BC000812_n101ArtTipPle = new boolean[] {false} ;
      BC000812_A100ArtTipLar = new String[] {""} ;
      BC000812_n100ArtTipLar = new boolean[] {false} ;
      BC000812_A96ArtSua = new String[] {""} ;
      BC000812_n96ArtSua = new boolean[] {false} ;
      BC000812_A64ArtAcaQui = new String[] {""} ;
      BC000812_n64ArtAcaQui = new boolean[] {false} ;
      BC000812_A73ArtEti = new String[] {""} ;
      BC000812_n73ArtEti = new boolean[] {false} ;
      BC000812_A272CliEti = new String[] {""} ;
      BC000812_A306CliUrg = new byte[1] ;
      BC000812_A117ArtUrg = new byte[1] ;
      BC000812_n117ArtUrg = new boolean[] {false} ;
      BC000812_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n88ArtMer = new boolean[] {false} ;
      BC000812_A105ArtTra1 = new String[] {""} ;
      BC000812_n105ArtTra1 = new boolean[] {false} ;
      BC000812_A106ArtTra2 = new String[] {""} ;
      BC000812_n106ArtTra2 = new boolean[] {false} ;
      BC000812_A107ArtTra3 = new String[] {""} ;
      BC000812_n107ArtTra3 = new boolean[] {false} ;
      BC000812_A108ArtTraP1 = new short[1] ;
      BC000812_n108ArtTraP1 = new boolean[] {false} ;
      BC000812_A109ArtTraP2 = new short[1] ;
      BC000812_n109ArtTraP2 = new boolean[] {false} ;
      BC000812_A110ArtTraP3 = new short[1] ;
      BC000812_n110ArtTraP3 = new boolean[] {false} ;
      BC000812_A111ArtUrd1 = new String[] {""} ;
      BC000812_n111ArtUrd1 = new boolean[] {false} ;
      BC000812_A112ArtUrd2 = new String[] {""} ;
      BC000812_n112ArtUrd2 = new boolean[] {false} ;
      BC000812_A113ArtUrd3 = new String[] {""} ;
      BC000812_n113ArtUrd3 = new boolean[] {false} ;
      BC000812_A114ArtUrdP1 = new short[1] ;
      BC000812_n114ArtUrdP1 = new boolean[] {false} ;
      BC000812_A115ArtUrdP2 = new short[1] ;
      BC000812_n115ArtUrdP2 = new boolean[] {false} ;
      BC000812_A116ArtUrdP3 = new short[1] ;
      BC000812_n116ArtUrdP3 = new boolean[] {false} ;
      BC000812_A1229ArtEncCom = new short[1] ;
      BC000812_n1229ArtEncCom = new boolean[] {false} ;
      BC000812_A1230ArtEncAnh = new short[1] ;
      BC000812_n1230ArtEncAnh = new boolean[] {false} ;
      BC000812_A1903ArtGraAca = new short[1] ;
      BC000812_n1903ArtGraAca = new boolean[] {false} ;
      BC000812_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n1905ArtRdoA = new boolean[] {false} ;
      BC000812_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n1904ArtRdoN = new boolean[] {false} ;
      BC000812_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n2791ArtFacAbs = new boolean[] {false} ;
      BC000812_A2834ArtPle2 = new String[] {""} ;
      BC000812_n2834ArtPle2 = new boolean[] {false} ;
      BC000812_A3121ArtNumCor = new short[1] ;
      BC000812_n3121ArtNumCor = new boolean[] {false} ;
      BC000812_A3122ArtAncSal1 = new short[1] ;
      BC000812_n3122ArtAncSal1 = new boolean[] {false} ;
      BC000812_A3123ArtAncSal2 = new short[1] ;
      BC000812_n3123ArtAncSal2 = new boolean[] {false} ;
      BC000812_A3124ArtAncSal3 = new short[1] ;
      BC000812_n3124ArtAncSal3 = new boolean[] {false} ;
      BC000812_A3125ArtGraAca2 = new short[1] ;
      BC000812_n3125ArtGraAca2 = new boolean[] {false} ;
      BC000812_A3126ArtGraCru2 = new short[1] ;
      BC000812_n3126ArtGraCru2 = new boolean[] {false} ;
      BC000812_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n4297ArtPmPPza = new boolean[] {false} ;
      BC000812_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      BC000812_n3683ArtFecCre = new boolean[] {false} ;
      BC000812_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      BC000812_n4354ArtFecMod = new boolean[] {false} ;
      BC000812_A4296ClasDsc = new String[] {""} ;
      BC000812_n4296ClasDsc = new boolean[] {false} ;
      BC000812_A5741ArtComer = new String[] {""} ;
      BC000812_n5741ArtComer = new boolean[] {false} ;
      BC000812_A6107ClaTubDsc = new String[] {""} ;
      BC000812_n6107ClaTubDsc = new boolean[] {false} ;
      BC000812_A6109ClaBolDsc = new String[] {""} ;
      BC000812_n6109ClaBolDsc = new boolean[] {false} ;
      BC000812_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n6435ArtRdoCru1 = new boolean[] {false} ;
      BC000812_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n6436ArtRdoCru2 = new boolean[] {false} ;
      BC000812_A967ArtNMtr = new String[] {""} ;
      BC000812_n967ArtNMtr = new boolean[] {false} ;
      BC000812_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n6462ArtLu = new boolean[] {false} ;
      BC000812_A4607ArtRb = new short[1] ;
      BC000812_n4607ArtRb = new boolean[] {false} ;
      BC000812_A4444ArtPelAnh = new short[1] ;
      BC000812_n4444ArtPelAnh = new boolean[] {false} ;
      BC000812_A7412Artgrm2Sc = new short[1] ;
      BC000812_n7412Artgrm2Sc = new boolean[] {false} ;
      BC000812_A7413ArtPmlSc = new short[1] ;
      BC000812_n7413ArtPmlSc = new boolean[] {false} ;
      BC000812_A7414ArtAncSc = new short[1] ;
      BC000812_n7414ArtAncSc = new boolean[] {false} ;
      BC000812_A7415ArtPmlCru = new short[1] ;
      BC000812_n7415ArtPmlCru = new boolean[] {false} ;
      BC000812_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n7777ArtRdtSc = new boolean[] {false} ;
      BC000812_A7778ArtUnd = new String[] {""} ;
      BC000812_n7778ArtUnd = new boolean[] {false} ;
      BC000812_A7779ArtBlo = new String[] {""} ;
      BC000812_n7779ArtBlo = new boolean[] {false} ;
      BC000812_A7948ArtCla = new byte[1] ;
      BC000812_n7948ArtCla = new boolean[] {false} ;
      BC000812_A6014TipArtDsc2 = new String[] {""} ;
      BC000812_n6014TipArtDsc2 = new boolean[] {false} ;
      BC000812_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n9730ArtFabsH = new boolean[] {false} ;
      BC000812_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n9801ArtFabsT = new boolean[] {false} ;
      BC000812_A9875ArtNProg = new byte[1] ;
      BC000812_n9875ArtNProg = new boolean[] {false} ;
      BC000812_A9902ArtVbd = new short[1] ;
      BC000812_n9902ArtVbd = new boolean[] {false} ;
      BC000812_A9903ArtVbn = new short[1] ;
      BC000812_n9903ArtVbn = new boolean[] {false} ;
      BC000812_A9904ArtAb = new short[1] ;
      BC000812_n9904ArtAb = new boolean[] {false} ;
      BC000812_A397ArtObsGrm = new String[] {""} ;
      BC000812_n397ArtObsGrm = new boolean[] {false} ;
      BC000812_A398ArtObsAnc = new String[] {""} ;
      BC000812_n398ArtObsAnc = new boolean[] {false} ;
      BC000812_A4980ArtCdb = new String[] {""} ;
      BC000812_n4980ArtCdb = new boolean[] {false} ;
      BC000812_A10027ArtGalga = new String[] {""} ;
      BC000812_n10027ArtGalga = new boolean[] {false} ;
      BC000812_A10028ArtPlatina = new String[] {""} ;
      BC000812_n10028ArtPlatina = new boolean[] {false} ;
      BC000812_A10029ArtPgd = new String[] {""} ;
      BC000812_n10029ArtPgd = new boolean[] {false} ;
      BC000812_A10031ArtThN = new String[] {""} ;
      BC000812_n10031ArtThN = new boolean[] {false} ;
      BC000812_A10380Art_Dc = new String[] {""} ;
      BC000812_n10380Art_Dc = new boolean[] {false} ;
      BC000812_A10804ArtHilos = new short[1] ;
      BC000812_n10804ArtHilos = new boolean[] {false} ;
      BC000812_A10805ArtPasad = new short[1] ;
      BC000812_n10805ArtPasad = new boolean[] {false} ;
      BC000812_A10831ArtAncC = new short[1] ;
      BC000812_n10831ArtAncC = new boolean[] {false} ;
      BC000812_A10832ArtGrm2C = new short[1] ;
      BC000812_n10832ArtGrm2C = new boolean[] {false} ;
      BC000812_A10833ArtRdoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n10833ArtRdoC = new boolean[] {false} ;
      BC000812_A4455ArtAcaFor = new int[1] ;
      BC000812_n4455ArtAcaFor = new boolean[] {false} ;
      BC000812_A3682ArtAnu = new String[] {""} ;
      BC000812_n3682ArtAnu = new boolean[] {false} ;
      BC000812_A11627ArtFacUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n11627ArtFacUti = new boolean[] {false} ;
      BC000812_A1581ArtNumTip = new int[1] ;
      BC000812_n1581ArtNumTip = new boolean[] {false} ;
      BC000812_A12364ArtMT = new byte[1] ;
      BC000812_n12364ArtMT = new boolean[] {false} ;
      BC000812_A12365ArtTRabs = new byte[1] ;
      BC000812_n12365ArtTRabs = new boolean[] {false} ;
      BC000812_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000812_n12366ArtKgMn = new boolean[] {false} ;
      BC000812_A4446ArtAcaMar = new String[] {""} ;
      BC000812_n4446ArtAcaMar = new boolean[] {false} ;
      BC000813_A407EmprNom = new String[] {""} ;
      BC000813_n407EmprNom = new boolean[] {false} ;
      BC000814_A830TipArtDsc = new String[] {""} ;
      BC000814_n830TipArtDsc = new boolean[] {false} ;
      BC000814_A6014TipArtDsc2 = new String[] {""} ;
      BC000814_n6014TipArtDsc2 = new boolean[] {false} ;
      BC000815_A10031ArtThN = new String[] {""} ;
      BC000815_n10031ArtThN = new boolean[] {false} ;
      BC000816_A4296ClasDsc = new String[] {""} ;
      BC000816_n4296ClasDsc = new boolean[] {false} ;
      BC000817_A6109ClaBolDsc = new String[] {""} ;
      BC000817_n6109ClaBolDsc = new boolean[] {false} ;
      BC000818_A6107ClaTubDsc = new String[] {""} ;
      BC000818_n6107ClaTubDsc = new boolean[] {false} ;
      BC000819_A10380Art_Dc = new String[] {""} ;
      BC000819_n10380Art_Dc = new boolean[] {false} ;
      BC000820_A279CliNom = new String[] {""} ;
      BC000820_A272CliEti = new String[] {""} ;
      BC000820_A306CliUrg = new byte[1] ;
      BC000821_A396EmprCod = new String[] {""} ;
      BC000821_A252CliCod = new int[1] ;
      BC000821_n252CliCod = new boolean[] {false} ;
      BC000821_A65ArtCod = new String[] {""} ;
      BC000821_n65ArtCod = new boolean[] {false} ;
      BC000822_A3072ArtObsLon = new String[] {""} ;
      BC000822_n3072ArtObsLon = new boolean[] {false} ;
      BC000822_A4447ArtAcaBak = new String[] {""} ;
      BC000822_n4447ArtAcaBak = new boolean[] {false} ;
      BC000822_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12695ArtElgAnc = new boolean[] {false} ;
      BC000822_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12696ArtElgLar = new boolean[] {false} ;
      BC000822_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12697ArtRdoCru = new boolean[] {false} ;
      BC000822_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12698ArtEncLarg = new boolean[] {false} ;
      BC000822_A12699ArtEncAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12699ArtEncAnc = new boolean[] {false} ;
      BC000822_A14099ArtRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n14099ArtRdto4 = new boolean[] {false} ;
      BC000822_A14100Artdsc2 = new String[] {""} ;
      BC000822_n14100Artdsc2 = new boolean[] {false} ;
      BC000822_A14101ArtgrComp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n14101ArtgrComp = new boolean[] {false} ;
      BC000822_A14102ArtKgspp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n14102ArtKgspp = new boolean[] {false} ;
      BC000822_A14103ArtPrepp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n14103ArtPrepp = new boolean[] {false} ;
      BC000822_A90ArtObsFac = new String[] {""} ;
      BC000822_n90ArtObsFac = new boolean[] {false} ;
      BC000822_A12886ArtObsOtra = new String[] {""} ;
      BC000822_n12886ArtObsOtra = new boolean[] {false} ;
      BC000822_A14295ArtActivo = new String[] {""} ;
      BC000822_A396EmprCod = new String[] {""} ;
      BC000822_A252CliCod = new int[1] ;
      BC000822_n252CliCod = new boolean[] {false} ;
      BC000822_A829TipArtCod = new short[1] ;
      BC000822_A10030ArtTh = new short[1] ;
      BC000822_n10030ArtTh = new boolean[] {false} ;
      BC000822_A4295ClasCod = new short[1] ;
      BC000822_n4295ClasCod = new boolean[] {false} ;
      BC000822_A6108ClaBolCod = new short[1] ;
      BC000822_n6108ClaBolCod = new boolean[] {false} ;
      BC000822_A6106ClaTubCod = new short[1] ;
      BC000822_n6106ClaTubCod = new boolean[] {false} ;
      BC000822_A10379Art_Cd = new short[1] ;
      BC000822_n10379Art_Cd = new boolean[] {false} ;
      BC000822_A65ArtCod = new String[] {""} ;
      BC000822_n65ArtCod = new boolean[] {false} ;
      BC000822_A66ArtCorOri = new String[] {""} ;
      BC000822_n66ArtCorOri = new boolean[] {false} ;
      BC000822_A70ArtEncOri = new String[] {""} ;
      BC000822_n70ArtEncOri = new boolean[] {false} ;
      BC000822_A4353ArtUsrCod = new String[] {""} ;
      BC000822_n4353ArtUsrCod = new boolean[] {false} ;
      BC000822_A69ArtDsc = new String[] {""} ;
      BC000822_n69ArtDsc = new boolean[] {false} ;
      BC000822_A5335ArtCodExt = new String[] {""} ;
      BC000822_n5335ArtCodExt = new boolean[] {false} ;
      BC000822_A87ArtMat = new String[] {""} ;
      BC000822_n87ArtMat = new boolean[] {false} ;
      BC000822_A1148ArtPml = new short[1] ;
      BC000822_n1148ArtPml = new boolean[] {false} ;
      BC000822_A78ArtGraCru = new short[1] ;
      BC000822_n78ArtGraCru = new boolean[] {false} ;
      BC000822_A68ArtCruMin = new short[1] ;
      BC000822_n68ArtCruMin = new boolean[] {false} ;
      BC000822_A67ArtCruMax = new short[1] ;
      BC000822_n67ArtCruMax = new boolean[] {false} ;
      BC000822_A63ArtAcaMin = new short[1] ;
      BC000822_n63ArtAcaMin = new boolean[] {false} ;
      BC000822_A62ArtAcaMax = new short[1] ;
      BC000822_n62ArtAcaMax = new boolean[] {false} ;
      BC000822_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n95ArtRen = new boolean[] {false} ;
      BC000822_A101ArtTipPle = new String[] {""} ;
      BC000822_n101ArtTipPle = new boolean[] {false} ;
      BC000822_A100ArtTipLar = new String[] {""} ;
      BC000822_n100ArtTipLar = new boolean[] {false} ;
      BC000822_A96ArtSua = new String[] {""} ;
      BC000822_n96ArtSua = new boolean[] {false} ;
      BC000822_A64ArtAcaQui = new String[] {""} ;
      BC000822_n64ArtAcaQui = new boolean[] {false} ;
      BC000822_A73ArtEti = new String[] {""} ;
      BC000822_n73ArtEti = new boolean[] {false} ;
      BC000822_A117ArtUrg = new byte[1] ;
      BC000822_n117ArtUrg = new boolean[] {false} ;
      BC000822_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n88ArtMer = new boolean[] {false} ;
      BC000822_A105ArtTra1 = new String[] {""} ;
      BC000822_n105ArtTra1 = new boolean[] {false} ;
      BC000822_A106ArtTra2 = new String[] {""} ;
      BC000822_n106ArtTra2 = new boolean[] {false} ;
      BC000822_A107ArtTra3 = new String[] {""} ;
      BC000822_n107ArtTra3 = new boolean[] {false} ;
      BC000822_A108ArtTraP1 = new short[1] ;
      BC000822_n108ArtTraP1 = new boolean[] {false} ;
      BC000822_A109ArtTraP2 = new short[1] ;
      BC000822_n109ArtTraP2 = new boolean[] {false} ;
      BC000822_A110ArtTraP3 = new short[1] ;
      BC000822_n110ArtTraP3 = new boolean[] {false} ;
      BC000822_A111ArtUrd1 = new String[] {""} ;
      BC000822_n111ArtUrd1 = new boolean[] {false} ;
      BC000822_A112ArtUrd2 = new String[] {""} ;
      BC000822_n112ArtUrd2 = new boolean[] {false} ;
      BC000822_A113ArtUrd3 = new String[] {""} ;
      BC000822_n113ArtUrd3 = new boolean[] {false} ;
      BC000822_A114ArtUrdP1 = new short[1] ;
      BC000822_n114ArtUrdP1 = new boolean[] {false} ;
      BC000822_A115ArtUrdP2 = new short[1] ;
      BC000822_n115ArtUrdP2 = new boolean[] {false} ;
      BC000822_A116ArtUrdP3 = new short[1] ;
      BC000822_n116ArtUrdP3 = new boolean[] {false} ;
      BC000822_A1229ArtEncCom = new short[1] ;
      BC000822_n1229ArtEncCom = new boolean[] {false} ;
      BC000822_A1230ArtEncAnh = new short[1] ;
      BC000822_n1230ArtEncAnh = new boolean[] {false} ;
      BC000822_A1903ArtGraAca = new short[1] ;
      BC000822_n1903ArtGraAca = new boolean[] {false} ;
      BC000822_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n1905ArtRdoA = new boolean[] {false} ;
      BC000822_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n1904ArtRdoN = new boolean[] {false} ;
      BC000822_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n2791ArtFacAbs = new boolean[] {false} ;
      BC000822_A2834ArtPle2 = new String[] {""} ;
      BC000822_n2834ArtPle2 = new boolean[] {false} ;
      BC000822_A3121ArtNumCor = new short[1] ;
      BC000822_n3121ArtNumCor = new boolean[] {false} ;
      BC000822_A3122ArtAncSal1 = new short[1] ;
      BC000822_n3122ArtAncSal1 = new boolean[] {false} ;
      BC000822_A3123ArtAncSal2 = new short[1] ;
      BC000822_n3123ArtAncSal2 = new boolean[] {false} ;
      BC000822_A3124ArtAncSal3 = new short[1] ;
      BC000822_n3124ArtAncSal3 = new boolean[] {false} ;
      BC000822_A3125ArtGraAca2 = new short[1] ;
      BC000822_n3125ArtGraAca2 = new boolean[] {false} ;
      BC000822_A3126ArtGraCru2 = new short[1] ;
      BC000822_n3126ArtGraCru2 = new boolean[] {false} ;
      BC000822_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n4297ArtPmPPza = new boolean[] {false} ;
      BC000822_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      BC000822_n3683ArtFecCre = new boolean[] {false} ;
      BC000822_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      BC000822_n4354ArtFecMod = new boolean[] {false} ;
      BC000822_A5741ArtComer = new String[] {""} ;
      BC000822_n5741ArtComer = new boolean[] {false} ;
      BC000822_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n6435ArtRdoCru1 = new boolean[] {false} ;
      BC000822_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n6436ArtRdoCru2 = new boolean[] {false} ;
      BC000822_A967ArtNMtr = new String[] {""} ;
      BC000822_n967ArtNMtr = new boolean[] {false} ;
      BC000822_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n6462ArtLu = new boolean[] {false} ;
      BC000822_A4607ArtRb = new short[1] ;
      BC000822_n4607ArtRb = new boolean[] {false} ;
      BC000822_A4444ArtPelAnh = new short[1] ;
      BC000822_n4444ArtPelAnh = new boolean[] {false} ;
      BC000822_A7412Artgrm2Sc = new short[1] ;
      BC000822_n7412Artgrm2Sc = new boolean[] {false} ;
      BC000822_A7413ArtPmlSc = new short[1] ;
      BC000822_n7413ArtPmlSc = new boolean[] {false} ;
      BC000822_A7414ArtAncSc = new short[1] ;
      BC000822_n7414ArtAncSc = new boolean[] {false} ;
      BC000822_A7415ArtPmlCru = new short[1] ;
      BC000822_n7415ArtPmlCru = new boolean[] {false} ;
      BC000822_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n7777ArtRdtSc = new boolean[] {false} ;
      BC000822_A7778ArtUnd = new String[] {""} ;
      BC000822_n7778ArtUnd = new boolean[] {false} ;
      BC000822_A7779ArtBlo = new String[] {""} ;
      BC000822_n7779ArtBlo = new boolean[] {false} ;
      BC000822_A7948ArtCla = new byte[1] ;
      BC000822_n7948ArtCla = new boolean[] {false} ;
      BC000822_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n9730ArtFabsH = new boolean[] {false} ;
      BC000822_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n9801ArtFabsT = new boolean[] {false} ;
      BC000822_A9875ArtNProg = new byte[1] ;
      BC000822_n9875ArtNProg = new boolean[] {false} ;
      BC000822_A9902ArtVbd = new short[1] ;
      BC000822_n9902ArtVbd = new boolean[] {false} ;
      BC000822_A9903ArtVbn = new short[1] ;
      BC000822_n9903ArtVbn = new boolean[] {false} ;
      BC000822_A9904ArtAb = new short[1] ;
      BC000822_n9904ArtAb = new boolean[] {false} ;
      BC000822_A397ArtObsGrm = new String[] {""} ;
      BC000822_n397ArtObsGrm = new boolean[] {false} ;
      BC000822_A398ArtObsAnc = new String[] {""} ;
      BC000822_n398ArtObsAnc = new boolean[] {false} ;
      BC000822_A4980ArtCdb = new String[] {""} ;
      BC000822_n4980ArtCdb = new boolean[] {false} ;
      BC000822_A10027ArtGalga = new String[] {""} ;
      BC000822_n10027ArtGalga = new boolean[] {false} ;
      BC000822_A10028ArtPlatina = new String[] {""} ;
      BC000822_n10028ArtPlatina = new boolean[] {false} ;
      BC000822_A10029ArtPgd = new String[] {""} ;
      BC000822_n10029ArtPgd = new boolean[] {false} ;
      BC000822_A10804ArtHilos = new short[1] ;
      BC000822_n10804ArtHilos = new boolean[] {false} ;
      BC000822_A10805ArtPasad = new short[1] ;
      BC000822_n10805ArtPasad = new boolean[] {false} ;
      BC000822_A10831ArtAncC = new short[1] ;
      BC000822_n10831ArtAncC = new boolean[] {false} ;
      BC000822_A10832ArtGrm2C = new short[1] ;
      BC000822_n10832ArtGrm2C = new boolean[] {false} ;
      BC000822_A10833ArtRdoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n10833ArtRdoC = new boolean[] {false} ;
      BC000822_A4455ArtAcaFor = new int[1] ;
      BC000822_n4455ArtAcaFor = new boolean[] {false} ;
      BC000822_A3682ArtAnu = new String[] {""} ;
      BC000822_n3682ArtAnu = new boolean[] {false} ;
      BC000822_A11627ArtFacUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n11627ArtFacUti = new boolean[] {false} ;
      BC000822_A1581ArtNumTip = new int[1] ;
      BC000822_n1581ArtNumTip = new boolean[] {false} ;
      BC000822_A12364ArtMT = new byte[1] ;
      BC000822_n12364ArtMT = new boolean[] {false} ;
      BC000822_A12365ArtTRabs = new byte[1] ;
      BC000822_n12365ArtTRabs = new boolean[] {false} ;
      BC000822_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000822_n12366ArtKgMn = new boolean[] {false} ;
      BC000822_A4446ArtAcaMar = new String[] {""} ;
      BC000822_n4446ArtAcaMar = new boolean[] {false} ;
      sMode10 = "" ;
      BC000823_A3072ArtObsLon = new String[] {""} ;
      BC000823_n3072ArtObsLon = new boolean[] {false} ;
      BC000823_A4447ArtAcaBak = new String[] {""} ;
      BC000823_n4447ArtAcaBak = new boolean[] {false} ;
      BC000823_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12695ArtElgAnc = new boolean[] {false} ;
      BC000823_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12696ArtElgLar = new boolean[] {false} ;
      BC000823_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12697ArtRdoCru = new boolean[] {false} ;
      BC000823_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12698ArtEncLarg = new boolean[] {false} ;
      BC000823_A12699ArtEncAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12699ArtEncAnc = new boolean[] {false} ;
      BC000823_A14099ArtRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n14099ArtRdto4 = new boolean[] {false} ;
      BC000823_A14100Artdsc2 = new String[] {""} ;
      BC000823_n14100Artdsc2 = new boolean[] {false} ;
      BC000823_A14101ArtgrComp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n14101ArtgrComp = new boolean[] {false} ;
      BC000823_A14102ArtKgspp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n14102ArtKgspp = new boolean[] {false} ;
      BC000823_A14103ArtPrepp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n14103ArtPrepp = new boolean[] {false} ;
      BC000823_A90ArtObsFac = new String[] {""} ;
      BC000823_n90ArtObsFac = new boolean[] {false} ;
      BC000823_A12886ArtObsOtra = new String[] {""} ;
      BC000823_n12886ArtObsOtra = new boolean[] {false} ;
      BC000823_A14295ArtActivo = new String[] {""} ;
      BC000823_A396EmprCod = new String[] {""} ;
      BC000823_A252CliCod = new int[1] ;
      BC000823_n252CliCod = new boolean[] {false} ;
      BC000823_A829TipArtCod = new short[1] ;
      BC000823_A10030ArtTh = new short[1] ;
      BC000823_n10030ArtTh = new boolean[] {false} ;
      BC000823_A4295ClasCod = new short[1] ;
      BC000823_n4295ClasCod = new boolean[] {false} ;
      BC000823_A6108ClaBolCod = new short[1] ;
      BC000823_n6108ClaBolCod = new boolean[] {false} ;
      BC000823_A6106ClaTubCod = new short[1] ;
      BC000823_n6106ClaTubCod = new boolean[] {false} ;
      BC000823_A10379Art_Cd = new short[1] ;
      BC000823_n10379Art_Cd = new boolean[] {false} ;
      BC000823_A65ArtCod = new String[] {""} ;
      BC000823_n65ArtCod = new boolean[] {false} ;
      BC000823_A66ArtCorOri = new String[] {""} ;
      BC000823_n66ArtCorOri = new boolean[] {false} ;
      BC000823_A70ArtEncOri = new String[] {""} ;
      BC000823_n70ArtEncOri = new boolean[] {false} ;
      BC000823_A4353ArtUsrCod = new String[] {""} ;
      BC000823_n4353ArtUsrCod = new boolean[] {false} ;
      BC000823_A69ArtDsc = new String[] {""} ;
      BC000823_n69ArtDsc = new boolean[] {false} ;
      BC000823_A5335ArtCodExt = new String[] {""} ;
      BC000823_n5335ArtCodExt = new boolean[] {false} ;
      BC000823_A87ArtMat = new String[] {""} ;
      BC000823_n87ArtMat = new boolean[] {false} ;
      BC000823_A1148ArtPml = new short[1] ;
      BC000823_n1148ArtPml = new boolean[] {false} ;
      BC000823_A78ArtGraCru = new short[1] ;
      BC000823_n78ArtGraCru = new boolean[] {false} ;
      BC000823_A68ArtCruMin = new short[1] ;
      BC000823_n68ArtCruMin = new boolean[] {false} ;
      BC000823_A67ArtCruMax = new short[1] ;
      BC000823_n67ArtCruMax = new boolean[] {false} ;
      BC000823_A63ArtAcaMin = new short[1] ;
      BC000823_n63ArtAcaMin = new boolean[] {false} ;
      BC000823_A62ArtAcaMax = new short[1] ;
      BC000823_n62ArtAcaMax = new boolean[] {false} ;
      BC000823_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n95ArtRen = new boolean[] {false} ;
      BC000823_A101ArtTipPle = new String[] {""} ;
      BC000823_n101ArtTipPle = new boolean[] {false} ;
      BC000823_A100ArtTipLar = new String[] {""} ;
      BC000823_n100ArtTipLar = new boolean[] {false} ;
      BC000823_A96ArtSua = new String[] {""} ;
      BC000823_n96ArtSua = new boolean[] {false} ;
      BC000823_A64ArtAcaQui = new String[] {""} ;
      BC000823_n64ArtAcaQui = new boolean[] {false} ;
      BC000823_A73ArtEti = new String[] {""} ;
      BC000823_n73ArtEti = new boolean[] {false} ;
      BC000823_A117ArtUrg = new byte[1] ;
      BC000823_n117ArtUrg = new boolean[] {false} ;
      BC000823_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n88ArtMer = new boolean[] {false} ;
      BC000823_A105ArtTra1 = new String[] {""} ;
      BC000823_n105ArtTra1 = new boolean[] {false} ;
      BC000823_A106ArtTra2 = new String[] {""} ;
      BC000823_n106ArtTra2 = new boolean[] {false} ;
      BC000823_A107ArtTra3 = new String[] {""} ;
      BC000823_n107ArtTra3 = new boolean[] {false} ;
      BC000823_A108ArtTraP1 = new short[1] ;
      BC000823_n108ArtTraP1 = new boolean[] {false} ;
      BC000823_A109ArtTraP2 = new short[1] ;
      BC000823_n109ArtTraP2 = new boolean[] {false} ;
      BC000823_A110ArtTraP3 = new short[1] ;
      BC000823_n110ArtTraP3 = new boolean[] {false} ;
      BC000823_A111ArtUrd1 = new String[] {""} ;
      BC000823_n111ArtUrd1 = new boolean[] {false} ;
      BC000823_A112ArtUrd2 = new String[] {""} ;
      BC000823_n112ArtUrd2 = new boolean[] {false} ;
      BC000823_A113ArtUrd3 = new String[] {""} ;
      BC000823_n113ArtUrd3 = new boolean[] {false} ;
      BC000823_A114ArtUrdP1 = new short[1] ;
      BC000823_n114ArtUrdP1 = new boolean[] {false} ;
      BC000823_A115ArtUrdP2 = new short[1] ;
      BC000823_n115ArtUrdP2 = new boolean[] {false} ;
      BC000823_A116ArtUrdP3 = new short[1] ;
      BC000823_n116ArtUrdP3 = new boolean[] {false} ;
      BC000823_A1229ArtEncCom = new short[1] ;
      BC000823_n1229ArtEncCom = new boolean[] {false} ;
      BC000823_A1230ArtEncAnh = new short[1] ;
      BC000823_n1230ArtEncAnh = new boolean[] {false} ;
      BC000823_A1903ArtGraAca = new short[1] ;
      BC000823_n1903ArtGraAca = new boolean[] {false} ;
      BC000823_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n1905ArtRdoA = new boolean[] {false} ;
      BC000823_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n1904ArtRdoN = new boolean[] {false} ;
      BC000823_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n2791ArtFacAbs = new boolean[] {false} ;
      BC000823_A2834ArtPle2 = new String[] {""} ;
      BC000823_n2834ArtPle2 = new boolean[] {false} ;
      BC000823_A3121ArtNumCor = new short[1] ;
      BC000823_n3121ArtNumCor = new boolean[] {false} ;
      BC000823_A3122ArtAncSal1 = new short[1] ;
      BC000823_n3122ArtAncSal1 = new boolean[] {false} ;
      BC000823_A3123ArtAncSal2 = new short[1] ;
      BC000823_n3123ArtAncSal2 = new boolean[] {false} ;
      BC000823_A3124ArtAncSal3 = new short[1] ;
      BC000823_n3124ArtAncSal3 = new boolean[] {false} ;
      BC000823_A3125ArtGraAca2 = new short[1] ;
      BC000823_n3125ArtGraAca2 = new boolean[] {false} ;
      BC000823_A3126ArtGraCru2 = new short[1] ;
      BC000823_n3126ArtGraCru2 = new boolean[] {false} ;
      BC000823_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n4297ArtPmPPza = new boolean[] {false} ;
      BC000823_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      BC000823_n3683ArtFecCre = new boolean[] {false} ;
      BC000823_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      BC000823_n4354ArtFecMod = new boolean[] {false} ;
      BC000823_A5741ArtComer = new String[] {""} ;
      BC000823_n5741ArtComer = new boolean[] {false} ;
      BC000823_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n6435ArtRdoCru1 = new boolean[] {false} ;
      BC000823_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n6436ArtRdoCru2 = new boolean[] {false} ;
      BC000823_A967ArtNMtr = new String[] {""} ;
      BC000823_n967ArtNMtr = new boolean[] {false} ;
      BC000823_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n6462ArtLu = new boolean[] {false} ;
      BC000823_A4607ArtRb = new short[1] ;
      BC000823_n4607ArtRb = new boolean[] {false} ;
      BC000823_A4444ArtPelAnh = new short[1] ;
      BC000823_n4444ArtPelAnh = new boolean[] {false} ;
      BC000823_A7412Artgrm2Sc = new short[1] ;
      BC000823_n7412Artgrm2Sc = new boolean[] {false} ;
      BC000823_A7413ArtPmlSc = new short[1] ;
      BC000823_n7413ArtPmlSc = new boolean[] {false} ;
      BC000823_A7414ArtAncSc = new short[1] ;
      BC000823_n7414ArtAncSc = new boolean[] {false} ;
      BC000823_A7415ArtPmlCru = new short[1] ;
      BC000823_n7415ArtPmlCru = new boolean[] {false} ;
      BC000823_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n7777ArtRdtSc = new boolean[] {false} ;
      BC000823_A7778ArtUnd = new String[] {""} ;
      BC000823_n7778ArtUnd = new boolean[] {false} ;
      BC000823_A7779ArtBlo = new String[] {""} ;
      BC000823_n7779ArtBlo = new boolean[] {false} ;
      BC000823_A7948ArtCla = new byte[1] ;
      BC000823_n7948ArtCla = new boolean[] {false} ;
      BC000823_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n9730ArtFabsH = new boolean[] {false} ;
      BC000823_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n9801ArtFabsT = new boolean[] {false} ;
      BC000823_A9875ArtNProg = new byte[1] ;
      BC000823_n9875ArtNProg = new boolean[] {false} ;
      BC000823_A9902ArtVbd = new short[1] ;
      BC000823_n9902ArtVbd = new boolean[] {false} ;
      BC000823_A9903ArtVbn = new short[1] ;
      BC000823_n9903ArtVbn = new boolean[] {false} ;
      BC000823_A9904ArtAb = new short[1] ;
      BC000823_n9904ArtAb = new boolean[] {false} ;
      BC000823_A397ArtObsGrm = new String[] {""} ;
      BC000823_n397ArtObsGrm = new boolean[] {false} ;
      BC000823_A398ArtObsAnc = new String[] {""} ;
      BC000823_n398ArtObsAnc = new boolean[] {false} ;
      BC000823_A4980ArtCdb = new String[] {""} ;
      BC000823_n4980ArtCdb = new boolean[] {false} ;
      BC000823_A10027ArtGalga = new String[] {""} ;
      BC000823_n10027ArtGalga = new boolean[] {false} ;
      BC000823_A10028ArtPlatina = new String[] {""} ;
      BC000823_n10028ArtPlatina = new boolean[] {false} ;
      BC000823_A10029ArtPgd = new String[] {""} ;
      BC000823_n10029ArtPgd = new boolean[] {false} ;
      BC000823_A10804ArtHilos = new short[1] ;
      BC000823_n10804ArtHilos = new boolean[] {false} ;
      BC000823_A10805ArtPasad = new short[1] ;
      BC000823_n10805ArtPasad = new boolean[] {false} ;
      BC000823_A10831ArtAncC = new short[1] ;
      BC000823_n10831ArtAncC = new boolean[] {false} ;
      BC000823_A10832ArtGrm2C = new short[1] ;
      BC000823_n10832ArtGrm2C = new boolean[] {false} ;
      BC000823_A10833ArtRdoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n10833ArtRdoC = new boolean[] {false} ;
      BC000823_A4455ArtAcaFor = new int[1] ;
      BC000823_n4455ArtAcaFor = new boolean[] {false} ;
      BC000823_A3682ArtAnu = new String[] {""} ;
      BC000823_n3682ArtAnu = new boolean[] {false} ;
      BC000823_A11627ArtFacUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n11627ArtFacUti = new boolean[] {false} ;
      BC000823_A1581ArtNumTip = new int[1] ;
      BC000823_n1581ArtNumTip = new boolean[] {false} ;
      BC000823_A12364ArtMT = new byte[1] ;
      BC000823_n12364ArtMT = new boolean[] {false} ;
      BC000823_A12365ArtTRabs = new byte[1] ;
      BC000823_n12365ArtTRabs = new boolean[] {false} ;
      BC000823_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000823_n12366ArtKgMn = new boolean[] {false} ;
      BC000823_A4446ArtAcaMar = new String[] {""} ;
      BC000823_n4446ArtAcaMar = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      BC000827_A407EmprNom = new String[] {""} ;
      BC000827_n407EmprNom = new boolean[] {false} ;
      BC000828_A279CliNom = new String[] {""} ;
      BC000828_A272CliEti = new String[] {""} ;
      BC000828_A306CliUrg = new byte[1] ;
      BC000829_A830TipArtDsc = new String[] {""} ;
      BC000829_n830TipArtDsc = new boolean[] {false} ;
      BC000829_A6014TipArtDsc2 = new String[] {""} ;
      BC000829_n6014TipArtDsc2 = new boolean[] {false} ;
      BC000830_A4296ClasDsc = new String[] {""} ;
      BC000830_n4296ClasDsc = new boolean[] {false} ;
      BC000831_A6107ClaTubDsc = new String[] {""} ;
      BC000831_n6107ClaTubDsc = new boolean[] {false} ;
      BC000832_A6109ClaBolDsc = new String[] {""} ;
      BC000832_n6109ClaBolDsc = new boolean[] {false} ;
      BC000833_A10031ArtThN = new String[] {""} ;
      BC000833_n10031ArtThN = new boolean[] {false} ;
      BC000834_A10380Art_Dc = new String[] {""} ;
      BC000834_n10380Art_Dc = new boolean[] {false} ;
      BC000835_A396EmprCod = new String[] {""} ;
      BC000835_A252CliCod = new int[1] ;
      BC000835_n252CliCod = new boolean[] {false} ;
      BC000835_A65ArtCod = new String[] {""} ;
      BC000835_n65ArtCod = new boolean[] {false} ;
      BC000835_A499GrpFamCod = new byte[1] ;
      BC000836_A396EmprCod = new String[] {""} ;
      BC000836_A252CliCod = new int[1] ;
      BC000836_n252CliCod = new boolean[] {false} ;
      BC000836_A12814ARTConID = new String[] {""} ;
      BC000836_A65ArtCod = new String[] {""} ;
      BC000836_n65ArtCod = new boolean[] {false} ;
      BC000837_A396EmprCod = new String[] {""} ;
      BC000837_A252CliCod = new int[1] ;
      BC000837_n252CliCod = new boolean[] {false} ;
      BC000837_A65ArtCod = new String[] {""} ;
      BC000837_n65ArtCod = new boolean[] {false} ;
      BC000837_A12363SocInt = new byte[1] ;
      BC000838_A396EmprCod = new String[] {""} ;
      BC000838_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      BC000838_A5728JBCLLin = new short[1] ;
      BC000839_A396EmprCod = new String[] {""} ;
      BC000839_A252CliCod = new int[1] ;
      BC000839_n252CliCod = new boolean[] {false} ;
      BC000839_A5809MMezCod = new String[] {""} ;
      BC000839_A65ArtCod = new String[] {""} ;
      BC000839_n65ArtCod = new boolean[] {false} ;
      BC000840_A396EmprCod = new String[] {""} ;
      BC000840_A252CliCod = new int[1] ;
      BC000840_n252CliCod = new boolean[] {false} ;
      BC000840_A5234MezCod = new String[] {""} ;
      BC000840_A5240MezLin = new byte[1] ;
      BC000841_A396EmprCod = new String[] {""} ;
      BC000841_A252CliCod = new int[1] ;
      BC000841_n252CliCod = new boolean[] {false} ;
      BC000841_A65ArtCod = new String[] {""} ;
      BC000841_n65ArtCod = new boolean[] {false} ;
      BC000841_A4116estreclim = new int[1] ;
      BC000842_A396EmprCod = new String[] {""} ;
      BC000842_A252CliCod = new int[1] ;
      BC000842_n252CliCod = new boolean[] {false} ;
      BC000842_A65ArtCod = new String[] {""} ;
      BC000842_n65ArtCod = new boolean[] {false} ;
      BC000842_A4061EstNomCol = new String[] {""} ;
      BC000843_A396EmprCod = new String[] {""} ;
      BC000843_A9705ErpNped = new String[] {""} ;
      BC000843_A8652ErpLin = new short[1] ;
      BC000844_A396EmprCod = new String[] {""} ;
      BC000844_A252CliCod = new int[1] ;
      BC000844_n252CliCod = new boolean[] {false} ;
      BC000844_A65ArtCod = new String[] {""} ;
      BC000844_n65ArtCod = new boolean[] {false} ;
      BC000844_A7266CAAqP = new String[] {""} ;
      BC000845_A396EmprCod = new String[] {""} ;
      BC000845_A252CliCod = new int[1] ;
      BC000845_n252CliCod = new boolean[] {false} ;
      BC000845_A65ArtCod = new String[] {""} ;
      BC000845_n65ArtCod = new boolean[] {false} ;
      BC000845_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      BC000846_A396EmprCod = new String[] {""} ;
      BC000846_A252CliCod = new int[1] ;
      BC000846_n252CliCod = new boolean[] {false} ;
      BC000846_A65ArtCod = new String[] {""} ;
      BC000846_n65ArtCod = new boolean[] {false} ;
      BC000846_A10972Int_cod = new byte[1] ;
      BC000847_A396EmprCod = new String[] {""} ;
      BC000847_A252CliCod = new int[1] ;
      BC000847_n252CliCod = new boolean[] {false} ;
      BC000847_A65ArtCod = new String[] {""} ;
      BC000847_n65ArtCod = new boolean[] {false} ;
      BC000847_A10577Pg_Procod = new String[] {""} ;
      BC000848_A396EmprCod = new String[] {""} ;
      BC000848_A252CliCod = new int[1] ;
      BC000848_n252CliCod = new boolean[] {false} ;
      BC000848_A65ArtCod = new String[] {""} ;
      BC000848_n65ArtCod = new boolean[] {false} ;
      BC000848_A10272Hz_cod = new String[] {""} ;
      BC000849_A396EmprCod = new String[] {""} ;
      BC000849_A252CliCod = new int[1] ;
      BC000849_n252CliCod = new boolean[] {false} ;
      BC000849_A65ArtCod = new String[] {""} ;
      BC000849_n65ArtCod = new boolean[] {false} ;
      BC000849_A10041ArtSH = new String[] {""} ;
      BC000850_A396EmprCod = new String[] {""} ;
      BC000850_A252CliCod = new int[1] ;
      BC000850_n252CliCod = new boolean[] {false} ;
      BC000850_A65ArtCod = new String[] {""} ;
      BC000850_n65ArtCod = new boolean[] {false} ;
      BC000850_A8427TipoCt = new String[] {""} ;
      BC000850_A8428CapMxMq = new int[1] ;
      BC000851_A396EmprCod = new String[] {""} ;
      BC000851_A252CliCod = new int[1] ;
      BC000851_n252CliCod = new boolean[] {false} ;
      BC000851_A65ArtCod = new String[] {""} ;
      BC000851_n65ArtCod = new boolean[] {false} ;
      BC000851_A8342CodPred = new short[1] ;
      BC000852_A396EmprCod = new String[] {""} ;
      BC000852_A252CliCod = new int[1] ;
      BC000852_n252CliCod = new boolean[] {false} ;
      BC000852_A65ArtCod = new String[] {""} ;
      BC000852_n65ArtCod = new boolean[] {false} ;
      BC000852_A8089ArtcodTj = new String[] {""} ;
      BC000853_A396EmprCod = new String[] {""} ;
      BC000853_A252CliCod = new int[1] ;
      BC000853_n252CliCod = new boolean[] {false} ;
      BC000853_A65ArtCod = new String[] {""} ;
      BC000853_n65ArtCod = new boolean[] {false} ;
      BC000853_A7956Mq_CodM = new String[] {""} ;
      BC000854_A396EmprCod = new String[] {""} ;
      BC000854_A252CliCod = new int[1] ;
      BC000854_n252CliCod = new boolean[] {false} ;
      BC000854_A65ArtCod = new String[] {""} ;
      BC000854_n65ArtCod = new boolean[] {false} ;
      BC000854_A7949Par_Art = new short[1] ;
      BC000855_A396EmprCod = new String[] {""} ;
      BC000855_A252CliCod = new int[1] ;
      BC000855_n252CliCod = new boolean[] {false} ;
      BC000855_A65ArtCod = new String[] {""} ;
      BC000855_n65ArtCod = new boolean[] {false} ;
      BC000855_A7135Lin_fast = new short[1] ;
      BC000856_A396EmprCod = new String[] {""} ;
      BC000856_A252CliCod = new int[1] ;
      BC000856_n252CliCod = new boolean[] {false} ;
      BC000856_A65ArtCod = new String[] {""} ;
      BC000856_n65ArtCod = new boolean[] {false} ;
      BC000856_A6954Mat_lin = new short[1] ;
      BC000857_A396EmprCod = new String[] {""} ;
      BC000857_A602MaqCod = new String[] {""} ;
      BC000857_A6078MaqCliCod = new int[1] ;
      BC000857_A6079MaqArtCod = new String[] {""} ;
      BC000858_A396EmprCod = new String[] {""} ;
      BC000858_A252CliCod = new int[1] ;
      BC000858_n252CliCod = new boolean[] {false} ;
      BC000858_A65ArtCod = new String[] {""} ;
      BC000858_n65ArtCod = new boolean[] {false} ;
      BC000858_A5382EstCatAny = new short[1] ;
      BC000858_A5383EstCatSer = new String[] {""} ;
      BC000858_A5384EstCatTip = new short[1] ;
      BC000859_A396EmprCod = new String[] {""} ;
      BC000859_A252CliCod = new int[1] ;
      BC000859_n252CliCod = new boolean[] {false} ;
      BC000859_A65ArtCod = new String[] {""} ;
      BC000859_n65ArtCod = new boolean[] {false} ;
      BC000859_A4658MdlCod = new String[] {""} ;
      BC000860_A396EmprCod = new String[] {""} ;
      BC000860_A252CliCod = new int[1] ;
      BC000860_n252CliCod = new boolean[] {false} ;
      BC000860_A4175WebEmpCod = new String[] {""} ;
      BC000861_A396EmprCod = new String[] {""} ;
      BC000861_A252CliCod = new int[1] ;
      BC000861_n252CliCod = new boolean[] {false} ;
      BC000861_A4079WEBDISCOD = new String[] {""} ;
      BC000862_A396EmprCod = new String[] {""} ;
      BC000862_A252CliCod = new int[1] ;
      BC000862_n252CliCod = new boolean[] {false} ;
      BC000862_A65ArtCod = new String[] {""} ;
      BC000862_n65ArtCod = new boolean[] {false} ;
      BC000862_A4058CCFColNom = new String[] {""} ;
      BC000862_A4059CCFColNum = new int[1] ;
      BC000863_A396EmprCod = new String[] {""} ;
      BC000863_A252CliCod = new int[1] ;
      BC000863_n252CliCod = new boolean[] {false} ;
      BC000863_A65ArtCod = new String[] {""} ;
      BC000863_n65ArtCod = new boolean[] {false} ;
      BC000863_A1177Dibujo = new String[] {""} ;
      BC000863_A1790DibIntCod = new int[1] ;
      BC000864_A396EmprCod = new String[] {""} ;
      BC000864_A252CliCod = new int[1] ;
      BC000864_n252CliCod = new boolean[] {false} ;
      BC000864_A65ArtCod = new String[] {""} ;
      BC000864_n65ArtCod = new boolean[] {false} ;
      BC000864_A1080LinPre = new byte[1] ;
      BC000865_A396EmprCod = new String[] {""} ;
      BC000865_A3814PePCod = new long[1] ;
      BC000866_A396EmprCod = new String[] {""} ;
      BC000866_A3413OpeManCod = new byte[1] ;
      BC000866_A3430PreManNMt = new String[] {""} ;
      BC000866_A252CliCod = new int[1] ;
      BC000866_n252CliCod = new boolean[] {false} ;
      BC000866_A65ArtCod = new String[] {""} ;
      BC000866_n65ArtCod = new boolean[] {false} ;
      BC000867_A396EmprCod = new String[] {""} ;
      BC000867_A3415ParManNum = new int[1] ;
      BC000868_A396EmprCod = new String[] {""} ;
      BC000868_A3331LanBroCod = new byte[1] ;
      BC000868_A3333LanBroLin = new short[1] ;
      BC000869_A396EmprCod = new String[] {""} ;
      BC000869_A252CliCod = new int[1] ;
      BC000869_n252CliCod = new boolean[] {false} ;
      BC000869_A65ArtCod = new String[] {""} ;
      BC000869_n65ArtCod = new boolean[] {false} ;
      BC000869_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000870_A396EmprCod = new String[] {""} ;
      BC000870_A252CliCod = new int[1] ;
      BC000870_n252CliCod = new boolean[] {false} ;
      BC000870_A65ArtCod = new String[] {""} ;
      BC000870_n65ArtCod = new boolean[] {false} ;
      BC000870_A3288CCalCod = new String[] {""} ;
      BC000871_A396EmprCod = new String[] {""} ;
      BC000871_A252CliCod = new int[1] ;
      BC000871_n252CliCod = new boolean[] {false} ;
      BC000871_A65ArtCod = new String[] {""} ;
      BC000871_n65ArtCod = new boolean[] {false} ;
      BC000871_A3033CCCod = new String[] {""} ;
      BC000872_A396EmprCod = new String[] {""} ;
      BC000872_A252CliCod = new int[1] ;
      BC000872_n252CliCod = new boolean[] {false} ;
      BC000872_A65ArtCod = new String[] {""} ;
      BC000872_n65ArtCod = new boolean[] {false} ;
      BC000872_A2937RecIntCod = new byte[1] ;
      BC000873_A396EmprCod = new String[] {""} ;
      BC000873_A252CliCod = new int[1] ;
      BC000873_n252CliCod = new boolean[] {false} ;
      BC000873_A65ArtCod = new String[] {""} ;
      BC000873_n65ArtCod = new boolean[] {false} ;
      BC000873_A2931Limite2 = new short[1] ;
      BC000874_A396EmprCod = new String[] {""} ;
      BC000874_A252CliCod = new int[1] ;
      BC000874_n252CliCod = new boolean[] {false} ;
      BC000874_A65ArtCod = new String[] {""} ;
      BC000874_n65ArtCod = new boolean[] {false} ;
      BC000874_A71ArtEstAny = new short[1] ;
      BC000874_A2756ArtEstSer = new String[] {""} ;
      BC000875_A396EmprCod = new String[] {""} ;
      BC000875_A252CliCod = new int[1] ;
      BC000875_n252CliCod = new boolean[] {false} ;
      BC000875_A1504CliProCod = new String[] {""} ;
      BC000875_A65ArtCod = new String[] {""} ;
      BC000875_n65ArtCod = new boolean[] {false} ;
      BC000876_A396EmprCod = new String[] {""} ;
      BC000876_A252CliCod = new int[1] ;
      BC000876_n252CliCod = new boolean[] {false} ;
      BC000876_A65ArtCod = new String[] {""} ;
      BC000876_n65ArtCod = new boolean[] {false} ;
      BC000876_A598LinRec = new byte[1] ;
      BC000877_A396EmprCod = new String[] {""} ;
      BC000877_A252CliCod = new int[1] ;
      BC000877_n252CliCod = new boolean[] {false} ;
      BC000877_A65ArtCod = new String[] {""} ;
      BC000877_n65ArtCod = new boolean[] {false} ;
      BC000877_A831TipColCod = new byte[1] ;
      BC000878_A396EmprCod = new String[] {""} ;
      BC000878_A252CliCod = new int[1] ;
      BC000878_n252CliCod = new boolean[] {false} ;
      BC000878_A65ArtCod = new String[] {""} ;
      BC000878_n65ArtCod = new boolean[] {false} ;
      BC000878_A758ProCod = new String[] {""} ;
      BC000879_A3072ArtObsLon = new String[] {""} ;
      BC000879_n3072ArtObsLon = new boolean[] {false} ;
      BC000879_A4447ArtAcaBak = new String[] {""} ;
      BC000879_n4447ArtAcaBak = new boolean[] {false} ;
      BC000879_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12695ArtElgAnc = new boolean[] {false} ;
      BC000879_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12696ArtElgLar = new boolean[] {false} ;
      BC000879_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12697ArtRdoCru = new boolean[] {false} ;
      BC000879_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12698ArtEncLarg = new boolean[] {false} ;
      BC000879_A12699ArtEncAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12699ArtEncAnc = new boolean[] {false} ;
      BC000879_A14099ArtRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n14099ArtRdto4 = new boolean[] {false} ;
      BC000879_A14100Artdsc2 = new String[] {""} ;
      BC000879_n14100Artdsc2 = new boolean[] {false} ;
      BC000879_A14101ArtgrComp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n14101ArtgrComp = new boolean[] {false} ;
      BC000879_A14102ArtKgspp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n14102ArtKgspp = new boolean[] {false} ;
      BC000879_A14103ArtPrepp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n14103ArtPrepp = new boolean[] {false} ;
      BC000879_A90ArtObsFac = new String[] {""} ;
      BC000879_n90ArtObsFac = new boolean[] {false} ;
      BC000879_A12886ArtObsOtra = new String[] {""} ;
      BC000879_n12886ArtObsOtra = new boolean[] {false} ;
      BC000879_A14295ArtActivo = new String[] {""} ;
      BC000879_A396EmprCod = new String[] {""} ;
      BC000879_A252CliCod = new int[1] ;
      BC000879_n252CliCod = new boolean[] {false} ;
      BC000879_A829TipArtCod = new short[1] ;
      BC000879_A10030ArtTh = new short[1] ;
      BC000879_n10030ArtTh = new boolean[] {false} ;
      BC000879_A4295ClasCod = new short[1] ;
      BC000879_n4295ClasCod = new boolean[] {false} ;
      BC000879_A6108ClaBolCod = new short[1] ;
      BC000879_n6108ClaBolCod = new boolean[] {false} ;
      BC000879_A6106ClaTubCod = new short[1] ;
      BC000879_n6106ClaTubCod = new boolean[] {false} ;
      BC000879_A10379Art_Cd = new short[1] ;
      BC000879_n10379Art_Cd = new boolean[] {false} ;
      BC000879_A65ArtCod = new String[] {""} ;
      BC000879_n65ArtCod = new boolean[] {false} ;
      BC000879_A66ArtCorOri = new String[] {""} ;
      BC000879_n66ArtCorOri = new boolean[] {false} ;
      BC000879_A70ArtEncOri = new String[] {""} ;
      BC000879_n70ArtEncOri = new boolean[] {false} ;
      BC000879_A4353ArtUsrCod = new String[] {""} ;
      BC000879_n4353ArtUsrCod = new boolean[] {false} ;
      BC000879_A69ArtDsc = new String[] {""} ;
      BC000879_n69ArtDsc = new boolean[] {false} ;
      BC000879_A279CliNom = new String[] {""} ;
      BC000879_A5335ArtCodExt = new String[] {""} ;
      BC000879_n5335ArtCodExt = new boolean[] {false} ;
      BC000879_A407EmprNom = new String[] {""} ;
      BC000879_n407EmprNom = new boolean[] {false} ;
      BC000879_A87ArtMat = new String[] {""} ;
      BC000879_n87ArtMat = new boolean[] {false} ;
      BC000879_A830TipArtDsc = new String[] {""} ;
      BC000879_n830TipArtDsc = new boolean[] {false} ;
      BC000879_A1148ArtPml = new short[1] ;
      BC000879_n1148ArtPml = new boolean[] {false} ;
      BC000879_A78ArtGraCru = new short[1] ;
      BC000879_n78ArtGraCru = new boolean[] {false} ;
      BC000879_A68ArtCruMin = new short[1] ;
      BC000879_n68ArtCruMin = new boolean[] {false} ;
      BC000879_A67ArtCruMax = new short[1] ;
      BC000879_n67ArtCruMax = new boolean[] {false} ;
      BC000879_A63ArtAcaMin = new short[1] ;
      BC000879_n63ArtAcaMin = new boolean[] {false} ;
      BC000879_A62ArtAcaMax = new short[1] ;
      BC000879_n62ArtAcaMax = new boolean[] {false} ;
      BC000879_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n95ArtRen = new boolean[] {false} ;
      BC000879_A101ArtTipPle = new String[] {""} ;
      BC000879_n101ArtTipPle = new boolean[] {false} ;
      BC000879_A100ArtTipLar = new String[] {""} ;
      BC000879_n100ArtTipLar = new boolean[] {false} ;
      BC000879_A96ArtSua = new String[] {""} ;
      BC000879_n96ArtSua = new boolean[] {false} ;
      BC000879_A64ArtAcaQui = new String[] {""} ;
      BC000879_n64ArtAcaQui = new boolean[] {false} ;
      BC000879_A73ArtEti = new String[] {""} ;
      BC000879_n73ArtEti = new boolean[] {false} ;
      BC000879_A272CliEti = new String[] {""} ;
      BC000879_A306CliUrg = new byte[1] ;
      BC000879_A117ArtUrg = new byte[1] ;
      BC000879_n117ArtUrg = new boolean[] {false} ;
      BC000879_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n88ArtMer = new boolean[] {false} ;
      BC000879_A105ArtTra1 = new String[] {""} ;
      BC000879_n105ArtTra1 = new boolean[] {false} ;
      BC000879_A106ArtTra2 = new String[] {""} ;
      BC000879_n106ArtTra2 = new boolean[] {false} ;
      BC000879_A107ArtTra3 = new String[] {""} ;
      BC000879_n107ArtTra3 = new boolean[] {false} ;
      BC000879_A108ArtTraP1 = new short[1] ;
      BC000879_n108ArtTraP1 = new boolean[] {false} ;
      BC000879_A109ArtTraP2 = new short[1] ;
      BC000879_n109ArtTraP2 = new boolean[] {false} ;
      BC000879_A110ArtTraP3 = new short[1] ;
      BC000879_n110ArtTraP3 = new boolean[] {false} ;
      BC000879_A111ArtUrd1 = new String[] {""} ;
      BC000879_n111ArtUrd1 = new boolean[] {false} ;
      BC000879_A112ArtUrd2 = new String[] {""} ;
      BC000879_n112ArtUrd2 = new boolean[] {false} ;
      BC000879_A113ArtUrd3 = new String[] {""} ;
      BC000879_n113ArtUrd3 = new boolean[] {false} ;
      BC000879_A114ArtUrdP1 = new short[1] ;
      BC000879_n114ArtUrdP1 = new boolean[] {false} ;
      BC000879_A115ArtUrdP2 = new short[1] ;
      BC000879_n115ArtUrdP2 = new boolean[] {false} ;
      BC000879_A116ArtUrdP3 = new short[1] ;
      BC000879_n116ArtUrdP3 = new boolean[] {false} ;
      BC000879_A1229ArtEncCom = new short[1] ;
      BC000879_n1229ArtEncCom = new boolean[] {false} ;
      BC000879_A1230ArtEncAnh = new short[1] ;
      BC000879_n1230ArtEncAnh = new boolean[] {false} ;
      BC000879_A1903ArtGraAca = new short[1] ;
      BC000879_n1903ArtGraAca = new boolean[] {false} ;
      BC000879_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n1905ArtRdoA = new boolean[] {false} ;
      BC000879_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n1904ArtRdoN = new boolean[] {false} ;
      BC000879_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n2791ArtFacAbs = new boolean[] {false} ;
      BC000879_A2834ArtPle2 = new String[] {""} ;
      BC000879_n2834ArtPle2 = new boolean[] {false} ;
      BC000879_A3121ArtNumCor = new short[1] ;
      BC000879_n3121ArtNumCor = new boolean[] {false} ;
      BC000879_A3122ArtAncSal1 = new short[1] ;
      BC000879_n3122ArtAncSal1 = new boolean[] {false} ;
      BC000879_A3123ArtAncSal2 = new short[1] ;
      BC000879_n3123ArtAncSal2 = new boolean[] {false} ;
      BC000879_A3124ArtAncSal3 = new short[1] ;
      BC000879_n3124ArtAncSal3 = new boolean[] {false} ;
      BC000879_A3125ArtGraAca2 = new short[1] ;
      BC000879_n3125ArtGraAca2 = new boolean[] {false} ;
      BC000879_A3126ArtGraCru2 = new short[1] ;
      BC000879_n3126ArtGraCru2 = new boolean[] {false} ;
      BC000879_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n4297ArtPmPPza = new boolean[] {false} ;
      BC000879_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      BC000879_n3683ArtFecCre = new boolean[] {false} ;
      BC000879_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      BC000879_n4354ArtFecMod = new boolean[] {false} ;
      BC000879_A4296ClasDsc = new String[] {""} ;
      BC000879_n4296ClasDsc = new boolean[] {false} ;
      BC000879_A5741ArtComer = new String[] {""} ;
      BC000879_n5741ArtComer = new boolean[] {false} ;
      BC000879_A6107ClaTubDsc = new String[] {""} ;
      BC000879_n6107ClaTubDsc = new boolean[] {false} ;
      BC000879_A6109ClaBolDsc = new String[] {""} ;
      BC000879_n6109ClaBolDsc = new boolean[] {false} ;
      BC000879_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n6435ArtRdoCru1 = new boolean[] {false} ;
      BC000879_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n6436ArtRdoCru2 = new boolean[] {false} ;
      BC000879_A967ArtNMtr = new String[] {""} ;
      BC000879_n967ArtNMtr = new boolean[] {false} ;
      BC000879_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n6462ArtLu = new boolean[] {false} ;
      BC000879_A4607ArtRb = new short[1] ;
      BC000879_n4607ArtRb = new boolean[] {false} ;
      BC000879_A4444ArtPelAnh = new short[1] ;
      BC000879_n4444ArtPelAnh = new boolean[] {false} ;
      BC000879_A7412Artgrm2Sc = new short[1] ;
      BC000879_n7412Artgrm2Sc = new boolean[] {false} ;
      BC000879_A7413ArtPmlSc = new short[1] ;
      BC000879_n7413ArtPmlSc = new boolean[] {false} ;
      BC000879_A7414ArtAncSc = new short[1] ;
      BC000879_n7414ArtAncSc = new boolean[] {false} ;
      BC000879_A7415ArtPmlCru = new short[1] ;
      BC000879_n7415ArtPmlCru = new boolean[] {false} ;
      BC000879_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n7777ArtRdtSc = new boolean[] {false} ;
      BC000879_A7778ArtUnd = new String[] {""} ;
      BC000879_n7778ArtUnd = new boolean[] {false} ;
      BC000879_A7779ArtBlo = new String[] {""} ;
      BC000879_n7779ArtBlo = new boolean[] {false} ;
      BC000879_A7948ArtCla = new byte[1] ;
      BC000879_n7948ArtCla = new boolean[] {false} ;
      BC000879_A6014TipArtDsc2 = new String[] {""} ;
      BC000879_n6014TipArtDsc2 = new boolean[] {false} ;
      BC000879_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n9730ArtFabsH = new boolean[] {false} ;
      BC000879_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n9801ArtFabsT = new boolean[] {false} ;
      BC000879_A9875ArtNProg = new byte[1] ;
      BC000879_n9875ArtNProg = new boolean[] {false} ;
      BC000879_A9902ArtVbd = new short[1] ;
      BC000879_n9902ArtVbd = new boolean[] {false} ;
      BC000879_A9903ArtVbn = new short[1] ;
      BC000879_n9903ArtVbn = new boolean[] {false} ;
      BC000879_A9904ArtAb = new short[1] ;
      BC000879_n9904ArtAb = new boolean[] {false} ;
      BC000879_A397ArtObsGrm = new String[] {""} ;
      BC000879_n397ArtObsGrm = new boolean[] {false} ;
      BC000879_A398ArtObsAnc = new String[] {""} ;
      BC000879_n398ArtObsAnc = new boolean[] {false} ;
      BC000879_A4980ArtCdb = new String[] {""} ;
      BC000879_n4980ArtCdb = new boolean[] {false} ;
      BC000879_A10027ArtGalga = new String[] {""} ;
      BC000879_n10027ArtGalga = new boolean[] {false} ;
      BC000879_A10028ArtPlatina = new String[] {""} ;
      BC000879_n10028ArtPlatina = new boolean[] {false} ;
      BC000879_A10029ArtPgd = new String[] {""} ;
      BC000879_n10029ArtPgd = new boolean[] {false} ;
      BC000879_A10031ArtThN = new String[] {""} ;
      BC000879_n10031ArtThN = new boolean[] {false} ;
      BC000879_A10380Art_Dc = new String[] {""} ;
      BC000879_n10380Art_Dc = new boolean[] {false} ;
      BC000879_A10804ArtHilos = new short[1] ;
      BC000879_n10804ArtHilos = new boolean[] {false} ;
      BC000879_A10805ArtPasad = new short[1] ;
      BC000879_n10805ArtPasad = new boolean[] {false} ;
      BC000879_A10831ArtAncC = new short[1] ;
      BC000879_n10831ArtAncC = new boolean[] {false} ;
      BC000879_A10832ArtGrm2C = new short[1] ;
      BC000879_n10832ArtGrm2C = new boolean[] {false} ;
      BC000879_A10833ArtRdoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n10833ArtRdoC = new boolean[] {false} ;
      BC000879_A4455ArtAcaFor = new int[1] ;
      BC000879_n4455ArtAcaFor = new boolean[] {false} ;
      BC000879_A3682ArtAnu = new String[] {""} ;
      BC000879_n3682ArtAnu = new boolean[] {false} ;
      BC000879_A11627ArtFacUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n11627ArtFacUti = new boolean[] {false} ;
      BC000879_A1581ArtNumTip = new int[1] ;
      BC000879_n1581ArtNumTip = new boolean[] {false} ;
      BC000879_A12364ArtMT = new byte[1] ;
      BC000879_n12364ArtMT = new boolean[] {false} ;
      BC000879_A12365ArtTRabs = new byte[1] ;
      BC000879_n12365ArtTRabs = new boolean[] {false} ;
      BC000879_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC000879_n12366ArtKgMn = new boolean[] {false} ;
      BC000879_A4446ArtAcaMar = new String[] {""} ;
      BC000879_n4446ArtAcaMar = new boolean[] {false} ;
      i4353ArtUsrCod = "" ;
      i73ArtEti = "" ;
      i3683ArtFecCre = GXutil.nullDate() ;
      i7779ArtBlo = "" ;
      i14295ArtActivo = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000880_A407EmprNom = new String[] {""} ;
      BC000880_n407EmprNom = new boolean[] {false} ;
      BC000881_A279CliNom = new String[] {""} ;
      BC000881_A272CliEti = new String[] {""} ;
      BC000881_A306CliUrg = new byte[1] ;
      BC000882_A407EmprNom = new String[] {""} ;
      BC000882_n407EmprNom = new boolean[] {false} ;
      BC000883_A279CliNom = new String[] {""} ;
      BC000883_A272CliEti = new String[] {""} ;
      BC000883_A306CliUrg = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tarticu_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tarticu_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tarticu_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tarticu_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_bc__default(),
         new Object[] {
             new Object[] {
            BC00082_A3072ArtObsLon, BC00082_n3072ArtObsLon, BC00082_A4447ArtAcaBak, BC00082_n4447ArtAcaBak, BC00082_A12695ArtElgAnc, BC00082_n12695ArtElgAnc, BC00082_A12696ArtElgLar, BC00082_n12696ArtElgLar, BC00082_A12697ArtRdoCru, BC00082_n12697ArtRdoCru,
            BC00082_A12698ArtEncLarg, BC00082_n12698ArtEncLarg, BC00082_A12699ArtEncAnc, BC00082_n12699ArtEncAnc, BC00082_A14099ArtRdto4, BC00082_n14099ArtRdto4, BC00082_A14100Artdsc2, BC00082_n14100Artdsc2, BC00082_A14101ArtgrComp, BC00082_n14101ArtgrComp,
            BC00082_A14102ArtKgspp, BC00082_n14102ArtKgspp, BC00082_A14103ArtPrepp, BC00082_n14103ArtPrepp, BC00082_A90ArtObsFac, BC00082_n90ArtObsFac, BC00082_A12886ArtObsOtra, BC00082_n12886ArtObsOtra, BC00082_A14295ArtActivo, BC00082_A396EmprCod,
            BC00082_A252CliCod, BC00082_A829TipArtCod, BC00082_A10030ArtTh, BC00082_n10030ArtTh, BC00082_A4295ClasCod, BC00082_n4295ClasCod, BC00082_A6108ClaBolCod, BC00082_n6108ClaBolCod, BC00082_A6106ClaTubCod, BC00082_n6106ClaTubCod,
            BC00082_A10379Art_Cd, BC00082_n10379Art_Cd, BC00082_A65ArtCod, BC00082_A66ArtCorOri, BC00082_n66ArtCorOri, BC00082_A70ArtEncOri, BC00082_n70ArtEncOri, BC00082_A4353ArtUsrCod, BC00082_n4353ArtUsrCod, BC00082_A69ArtDsc,
            BC00082_n69ArtDsc, BC00082_A5335ArtCodExt, BC00082_n5335ArtCodExt, BC00082_A87ArtMat, BC00082_n87ArtMat, BC00082_A1148ArtPml, BC00082_n1148ArtPml, BC00082_A78ArtGraCru, BC00082_n78ArtGraCru, BC00082_A68ArtCruMin,
            BC00082_n68ArtCruMin, BC00082_A67ArtCruMax, BC00082_n67ArtCruMax, BC00082_A63ArtAcaMin, BC00082_n63ArtAcaMin, BC00082_A62ArtAcaMax, BC00082_n62ArtAcaMax, BC00082_A95ArtRen, BC00082_n95ArtRen, BC00082_A101ArtTipPle,
            BC00082_n101ArtTipPle, BC00082_A100ArtTipLar, BC00082_n100ArtTipLar, BC00082_A96ArtSua, BC00082_n96ArtSua, BC00082_A64ArtAcaQui, BC00082_n64ArtAcaQui, BC00082_A73ArtEti, BC00082_n73ArtEti, BC00082_A117ArtUrg,
            BC00082_n117ArtUrg, BC00082_A88ArtMer, BC00082_n88ArtMer, BC00082_A105ArtTra1, BC00082_n105ArtTra1, BC00082_A106ArtTra2, BC00082_n106ArtTra2, BC00082_A107ArtTra3, BC00082_n107ArtTra3, BC00082_A108ArtTraP1,
            BC00082_n108ArtTraP1, BC00082_A109ArtTraP2, BC00082_n109ArtTraP2, BC00082_A110ArtTraP3, BC00082_n110ArtTraP3, BC00082_A111ArtUrd1, BC00082_n111ArtUrd1, BC00082_A112ArtUrd2, BC00082_n112ArtUrd2, BC00082_A113ArtUrd3,
            BC00082_n113ArtUrd3, BC00082_A114ArtUrdP1, BC00082_n114ArtUrdP1, BC00082_A115ArtUrdP2, BC00082_n115ArtUrdP2, BC00082_A116ArtUrdP3, BC00082_n116ArtUrdP3, BC00082_A1229ArtEncCom, BC00082_n1229ArtEncCom, BC00082_A1230ArtEncAnh,
            BC00082_n1230ArtEncAnh, BC00082_A1903ArtGraAca, BC00082_n1903ArtGraAca, BC00082_A1905ArtRdoA, BC00082_n1905ArtRdoA, BC00082_A1904ArtRdoN, BC00082_n1904ArtRdoN, BC00082_A2791ArtFacAbs, BC00082_n2791ArtFacAbs, BC00082_A2834ArtPle2,
            BC00082_n2834ArtPle2, BC00082_A3121ArtNumCor, BC00082_n3121ArtNumCor, BC00082_A3122ArtAncSal1, BC00082_n3122ArtAncSal1, BC00082_A3123ArtAncSal2, BC00082_n3123ArtAncSal2, BC00082_A3124ArtAncSal3, BC00082_n3124ArtAncSal3, BC00082_A3125ArtGraAca2,
            BC00082_n3125ArtGraAca2, BC00082_A3126ArtGraCru2, BC00082_n3126ArtGraCru2, BC00082_A4297ArtPmPPza, BC00082_n4297ArtPmPPza, BC00082_A3683ArtFecCre, BC00082_n3683ArtFecCre, BC00082_A4354ArtFecMod, BC00082_n4354ArtFecMod, BC00082_A5741ArtComer,
            BC00082_n5741ArtComer, BC00082_A6435ArtRdoCru1, BC00082_n6435ArtRdoCru1, BC00082_A6436ArtRdoCru2, BC00082_n6436ArtRdoCru2, BC00082_A967ArtNMtr, BC00082_n967ArtNMtr, BC00082_A6462ArtLu, BC00082_n6462ArtLu, BC00082_A4607ArtRb,
            BC00082_n4607ArtRb, BC00082_A4444ArtPelAnh, BC00082_n4444ArtPelAnh, BC00082_A7412Artgrm2Sc, BC00082_n7412Artgrm2Sc, BC00082_A7413ArtPmlSc, BC00082_n7413ArtPmlSc, BC00082_A7414ArtAncSc, BC00082_n7414ArtAncSc, BC00082_A7415ArtPmlCru,
            BC00082_n7415ArtPmlCru, BC00082_A7777ArtRdtSc, BC00082_n7777ArtRdtSc, BC00082_A7778ArtUnd, BC00082_n7778ArtUnd, BC00082_A7779ArtBlo, BC00082_n7779ArtBlo, BC00082_A7948ArtCla, BC00082_n7948ArtCla, BC00082_A9730ArtFabsH,
            BC00082_n9730ArtFabsH, BC00082_A9801ArtFabsT, BC00082_n9801ArtFabsT, BC00082_A9875ArtNProg, BC00082_n9875ArtNProg, BC00082_A9902ArtVbd, BC00082_n9902ArtVbd, BC00082_A9903ArtVbn, BC00082_n9903ArtVbn, BC00082_A9904ArtAb,
            BC00082_n9904ArtAb, BC00082_A397ArtObsGrm, BC00082_n397ArtObsGrm, BC00082_A398ArtObsAnc, BC00082_n398ArtObsAnc, BC00082_A4980ArtCdb, BC00082_n4980ArtCdb, BC00082_A10027ArtGalga, BC00082_n10027ArtGalga, BC00082_A10028ArtPlatina,
            BC00082_n10028ArtPlatina, BC00082_A10029ArtPgd, BC00082_n10029ArtPgd, BC00082_A10804ArtHilos, BC00082_n10804ArtHilos, BC00082_A10805ArtPasad, BC00082_n10805ArtPasad, BC00082_A10831ArtAncC, BC00082_n10831ArtAncC, BC00082_A10832ArtGrm2C,
            BC00082_n10832ArtGrm2C, BC00082_A10833ArtRdoC, BC00082_n10833ArtRdoC, BC00082_A4455ArtAcaFor, BC00082_n4455ArtAcaFor, BC00082_A3682ArtAnu, BC00082_n3682ArtAnu, BC00082_A11627ArtFacUti, BC00082_n11627ArtFacUti, BC00082_A1581ArtNumTip,
            BC00082_n1581ArtNumTip, BC00082_A12364ArtMT, BC00082_n12364ArtMT, BC00082_A12365ArtTRabs, BC00082_n12365ArtTRabs, BC00082_A12366ArtKgMn, BC00082_n12366ArtKgMn, BC00082_A4446ArtAcaMar, BC00082_n4446ArtAcaMar
            }
            , new Object[] {
            BC00083_A3072ArtObsLon, BC00083_n3072ArtObsLon, BC00083_A4447ArtAcaBak, BC00083_n4447ArtAcaBak, BC00083_A12695ArtElgAnc, BC00083_n12695ArtElgAnc, BC00083_A12696ArtElgLar, BC00083_n12696ArtElgLar, BC00083_A12697ArtRdoCru, BC00083_n12697ArtRdoCru,
            BC00083_A12698ArtEncLarg, BC00083_n12698ArtEncLarg, BC00083_A12699ArtEncAnc, BC00083_n12699ArtEncAnc, BC00083_A14099ArtRdto4, BC00083_n14099ArtRdto4, BC00083_A14100Artdsc2, BC00083_n14100Artdsc2, BC00083_A14101ArtgrComp, BC00083_n14101ArtgrComp,
            BC00083_A14102ArtKgspp, BC00083_n14102ArtKgspp, BC00083_A14103ArtPrepp, BC00083_n14103ArtPrepp, BC00083_A90ArtObsFac, BC00083_n90ArtObsFac, BC00083_A12886ArtObsOtra, BC00083_n12886ArtObsOtra, BC00083_A14295ArtActivo, BC00083_A396EmprCod,
            BC00083_A252CliCod, BC00083_A829TipArtCod, BC00083_A10030ArtTh, BC00083_n10030ArtTh, BC00083_A4295ClasCod, BC00083_n4295ClasCod, BC00083_A6108ClaBolCod, BC00083_n6108ClaBolCod, BC00083_A6106ClaTubCod, BC00083_n6106ClaTubCod,
            BC00083_A10379Art_Cd, BC00083_n10379Art_Cd, BC00083_A65ArtCod, BC00083_A66ArtCorOri, BC00083_n66ArtCorOri, BC00083_A70ArtEncOri, BC00083_n70ArtEncOri, BC00083_A4353ArtUsrCod, BC00083_n4353ArtUsrCod, BC00083_A69ArtDsc,
            BC00083_n69ArtDsc, BC00083_A5335ArtCodExt, BC00083_n5335ArtCodExt, BC00083_A87ArtMat, BC00083_n87ArtMat, BC00083_A1148ArtPml, BC00083_n1148ArtPml, BC00083_A78ArtGraCru, BC00083_n78ArtGraCru, BC00083_A68ArtCruMin,
            BC00083_n68ArtCruMin, BC00083_A67ArtCruMax, BC00083_n67ArtCruMax, BC00083_A63ArtAcaMin, BC00083_n63ArtAcaMin, BC00083_A62ArtAcaMax, BC00083_n62ArtAcaMax, BC00083_A95ArtRen, BC00083_n95ArtRen, BC00083_A101ArtTipPle,
            BC00083_n101ArtTipPle, BC00083_A100ArtTipLar, BC00083_n100ArtTipLar, BC00083_A96ArtSua, BC00083_n96ArtSua, BC00083_A64ArtAcaQui, BC00083_n64ArtAcaQui, BC00083_A73ArtEti, BC00083_n73ArtEti, BC00083_A117ArtUrg,
            BC00083_n117ArtUrg, BC00083_A88ArtMer, BC00083_n88ArtMer, BC00083_A105ArtTra1, BC00083_n105ArtTra1, BC00083_A106ArtTra2, BC00083_n106ArtTra2, BC00083_A107ArtTra3, BC00083_n107ArtTra3, BC00083_A108ArtTraP1,
            BC00083_n108ArtTraP1, BC00083_A109ArtTraP2, BC00083_n109ArtTraP2, BC00083_A110ArtTraP3, BC00083_n110ArtTraP3, BC00083_A111ArtUrd1, BC00083_n111ArtUrd1, BC00083_A112ArtUrd2, BC00083_n112ArtUrd2, BC00083_A113ArtUrd3,
            BC00083_n113ArtUrd3, BC00083_A114ArtUrdP1, BC00083_n114ArtUrdP1, BC00083_A115ArtUrdP2, BC00083_n115ArtUrdP2, BC00083_A116ArtUrdP3, BC00083_n116ArtUrdP3, BC00083_A1229ArtEncCom, BC00083_n1229ArtEncCom, BC00083_A1230ArtEncAnh,
            BC00083_n1230ArtEncAnh, BC00083_A1903ArtGraAca, BC00083_n1903ArtGraAca, BC00083_A1905ArtRdoA, BC00083_n1905ArtRdoA, BC00083_A1904ArtRdoN, BC00083_n1904ArtRdoN, BC00083_A2791ArtFacAbs, BC00083_n2791ArtFacAbs, BC00083_A2834ArtPle2,
            BC00083_n2834ArtPle2, BC00083_A3121ArtNumCor, BC00083_n3121ArtNumCor, BC00083_A3122ArtAncSal1, BC00083_n3122ArtAncSal1, BC00083_A3123ArtAncSal2, BC00083_n3123ArtAncSal2, BC00083_A3124ArtAncSal3, BC00083_n3124ArtAncSal3, BC00083_A3125ArtGraAca2,
            BC00083_n3125ArtGraAca2, BC00083_A3126ArtGraCru2, BC00083_n3126ArtGraCru2, BC00083_A4297ArtPmPPza, BC00083_n4297ArtPmPPza, BC00083_A3683ArtFecCre, BC00083_n3683ArtFecCre, BC00083_A4354ArtFecMod, BC00083_n4354ArtFecMod, BC00083_A5741ArtComer,
            BC00083_n5741ArtComer, BC00083_A6435ArtRdoCru1, BC00083_n6435ArtRdoCru1, BC00083_A6436ArtRdoCru2, BC00083_n6436ArtRdoCru2, BC00083_A967ArtNMtr, BC00083_n967ArtNMtr, BC00083_A6462ArtLu, BC00083_n6462ArtLu, BC00083_A4607ArtRb,
            BC00083_n4607ArtRb, BC00083_A4444ArtPelAnh, BC00083_n4444ArtPelAnh, BC00083_A7412Artgrm2Sc, BC00083_n7412Artgrm2Sc, BC00083_A7413ArtPmlSc, BC00083_n7413ArtPmlSc, BC00083_A7414ArtAncSc, BC00083_n7414ArtAncSc, BC00083_A7415ArtPmlCru,
            BC00083_n7415ArtPmlCru, BC00083_A7777ArtRdtSc, BC00083_n7777ArtRdtSc, BC00083_A7778ArtUnd, BC00083_n7778ArtUnd, BC00083_A7779ArtBlo, BC00083_n7779ArtBlo, BC00083_A7948ArtCla, BC00083_n7948ArtCla, BC00083_A9730ArtFabsH,
            BC00083_n9730ArtFabsH, BC00083_A9801ArtFabsT, BC00083_n9801ArtFabsT, BC00083_A9875ArtNProg, BC00083_n9875ArtNProg, BC00083_A9902ArtVbd, BC00083_n9902ArtVbd, BC00083_A9903ArtVbn, BC00083_n9903ArtVbn, BC00083_A9904ArtAb,
            BC00083_n9904ArtAb, BC00083_A397ArtObsGrm, BC00083_n397ArtObsGrm, BC00083_A398ArtObsAnc, BC00083_n398ArtObsAnc, BC00083_A4980ArtCdb, BC00083_n4980ArtCdb, BC00083_A10027ArtGalga, BC00083_n10027ArtGalga, BC00083_A10028ArtPlatina,
            BC00083_n10028ArtPlatina, BC00083_A10029ArtPgd, BC00083_n10029ArtPgd, BC00083_A10804ArtHilos, BC00083_n10804ArtHilos, BC00083_A10805ArtPasad, BC00083_n10805ArtPasad, BC00083_A10831ArtAncC, BC00083_n10831ArtAncC, BC00083_A10832ArtGrm2C,
            BC00083_n10832ArtGrm2C, BC00083_A10833ArtRdoC, BC00083_n10833ArtRdoC, BC00083_A4455ArtAcaFor, BC00083_n4455ArtAcaFor, BC00083_A3682ArtAnu, BC00083_n3682ArtAnu, BC00083_A11627ArtFacUti, BC00083_n11627ArtFacUti, BC00083_A1581ArtNumTip,
            BC00083_n1581ArtNumTip, BC00083_A12364ArtMT, BC00083_n12364ArtMT, BC00083_A12365ArtTRabs, BC00083_n12365ArtTRabs, BC00083_A12366ArtKgMn, BC00083_n12366ArtKgMn, BC00083_A4446ArtAcaMar, BC00083_n4446ArtAcaMar
            }
            , new Object[] {
            BC00084_A407EmprNom, BC00084_n407EmprNom
            }
            , new Object[] {
            BC00085_A279CliNom, BC00085_A272CliEti, BC00085_A306CliUrg
            }
            , new Object[] {
            BC00086_A830TipArtDsc, BC00086_n830TipArtDsc, BC00086_A6014TipArtDsc2, BC00086_n6014TipArtDsc2
            }
            , new Object[] {
            BC00087_A10031ArtThN, BC00087_n10031ArtThN
            }
            , new Object[] {
            BC00088_A4296ClasDsc, BC00088_n4296ClasDsc
            }
            , new Object[] {
            BC00089_A6109ClaBolDsc, BC00089_n6109ClaBolDsc
            }
            , new Object[] {
            BC000810_A6107ClaTubDsc, BC000810_n6107ClaTubDsc
            }
            , new Object[] {
            BC000811_A10380Art_Dc, BC000811_n10380Art_Dc
            }
            , new Object[] {
            BC000812_A3072ArtObsLon, BC000812_n3072ArtObsLon, BC000812_A4447ArtAcaBak, BC000812_n4447ArtAcaBak, BC000812_A12695ArtElgAnc, BC000812_n12695ArtElgAnc, BC000812_A12696ArtElgLar, BC000812_n12696ArtElgLar, BC000812_A12697ArtRdoCru, BC000812_n12697ArtRdoCru,
            BC000812_A12698ArtEncLarg, BC000812_n12698ArtEncLarg, BC000812_A12699ArtEncAnc, BC000812_n12699ArtEncAnc, BC000812_A14099ArtRdto4, BC000812_n14099ArtRdto4, BC000812_A14100Artdsc2, BC000812_n14100Artdsc2, BC000812_A14101ArtgrComp, BC000812_n14101ArtgrComp,
            BC000812_A14102ArtKgspp, BC000812_n14102ArtKgspp, BC000812_A14103ArtPrepp, BC000812_n14103ArtPrepp, BC000812_A90ArtObsFac, BC000812_n90ArtObsFac, BC000812_A12886ArtObsOtra, BC000812_n12886ArtObsOtra, BC000812_A14295ArtActivo, BC000812_A396EmprCod,
            BC000812_A252CliCod, BC000812_A829TipArtCod, BC000812_A10030ArtTh, BC000812_n10030ArtTh, BC000812_A4295ClasCod, BC000812_n4295ClasCod, BC000812_A6108ClaBolCod, BC000812_n6108ClaBolCod, BC000812_A6106ClaTubCod, BC000812_n6106ClaTubCod,
            BC000812_A10379Art_Cd, BC000812_n10379Art_Cd, BC000812_A65ArtCod, BC000812_A66ArtCorOri, BC000812_n66ArtCorOri, BC000812_A70ArtEncOri, BC000812_n70ArtEncOri, BC000812_A4353ArtUsrCod, BC000812_n4353ArtUsrCod, BC000812_A69ArtDsc,
            BC000812_n69ArtDsc, BC000812_A279CliNom, BC000812_A5335ArtCodExt, BC000812_n5335ArtCodExt, BC000812_A407EmprNom, BC000812_n407EmprNom, BC000812_A87ArtMat, BC000812_n87ArtMat, BC000812_A830TipArtDsc, BC000812_n830TipArtDsc,
            BC000812_A1148ArtPml, BC000812_n1148ArtPml, BC000812_A78ArtGraCru, BC000812_n78ArtGraCru, BC000812_A68ArtCruMin, BC000812_n68ArtCruMin, BC000812_A67ArtCruMax, BC000812_n67ArtCruMax, BC000812_A63ArtAcaMin, BC000812_n63ArtAcaMin,
            BC000812_A62ArtAcaMax, BC000812_n62ArtAcaMax, BC000812_A95ArtRen, BC000812_n95ArtRen, BC000812_A101ArtTipPle, BC000812_n101ArtTipPle, BC000812_A100ArtTipLar, BC000812_n100ArtTipLar, BC000812_A96ArtSua, BC000812_n96ArtSua,
            BC000812_A64ArtAcaQui, BC000812_n64ArtAcaQui, BC000812_A73ArtEti, BC000812_n73ArtEti, BC000812_A272CliEti, BC000812_A306CliUrg, BC000812_A117ArtUrg, BC000812_n117ArtUrg, BC000812_A88ArtMer, BC000812_n88ArtMer,
            BC000812_A105ArtTra1, BC000812_n105ArtTra1, BC000812_A106ArtTra2, BC000812_n106ArtTra2, BC000812_A107ArtTra3, BC000812_n107ArtTra3, BC000812_A108ArtTraP1, BC000812_n108ArtTraP1, BC000812_A109ArtTraP2, BC000812_n109ArtTraP2,
            BC000812_A110ArtTraP3, BC000812_n110ArtTraP3, BC000812_A111ArtUrd1, BC000812_n111ArtUrd1, BC000812_A112ArtUrd2, BC000812_n112ArtUrd2, BC000812_A113ArtUrd3, BC000812_n113ArtUrd3, BC000812_A114ArtUrdP1, BC000812_n114ArtUrdP1,
            BC000812_A115ArtUrdP2, BC000812_n115ArtUrdP2, BC000812_A116ArtUrdP3, BC000812_n116ArtUrdP3, BC000812_A1229ArtEncCom, BC000812_n1229ArtEncCom, BC000812_A1230ArtEncAnh, BC000812_n1230ArtEncAnh, BC000812_A1903ArtGraAca, BC000812_n1903ArtGraAca,
            BC000812_A1905ArtRdoA, BC000812_n1905ArtRdoA, BC000812_A1904ArtRdoN, BC000812_n1904ArtRdoN, BC000812_A2791ArtFacAbs, BC000812_n2791ArtFacAbs, BC000812_A2834ArtPle2, BC000812_n2834ArtPle2, BC000812_A3121ArtNumCor, BC000812_n3121ArtNumCor,
            BC000812_A3122ArtAncSal1, BC000812_n3122ArtAncSal1, BC000812_A3123ArtAncSal2, BC000812_n3123ArtAncSal2, BC000812_A3124ArtAncSal3, BC000812_n3124ArtAncSal3, BC000812_A3125ArtGraAca2, BC000812_n3125ArtGraAca2, BC000812_A3126ArtGraCru2, BC000812_n3126ArtGraCru2,
            BC000812_A4297ArtPmPPza, BC000812_n4297ArtPmPPza, BC000812_A3683ArtFecCre, BC000812_n3683ArtFecCre, BC000812_A4354ArtFecMod, BC000812_n4354ArtFecMod, BC000812_A4296ClasDsc, BC000812_n4296ClasDsc, BC000812_A5741ArtComer, BC000812_n5741ArtComer,
            BC000812_A6107ClaTubDsc, BC000812_n6107ClaTubDsc, BC000812_A6109ClaBolDsc, BC000812_n6109ClaBolDsc, BC000812_A6435ArtRdoCru1, BC000812_n6435ArtRdoCru1, BC000812_A6436ArtRdoCru2, BC000812_n6436ArtRdoCru2, BC000812_A967ArtNMtr, BC000812_n967ArtNMtr,
            BC000812_A6462ArtLu, BC000812_n6462ArtLu, BC000812_A4607ArtRb, BC000812_n4607ArtRb, BC000812_A4444ArtPelAnh, BC000812_n4444ArtPelAnh, BC000812_A7412Artgrm2Sc, BC000812_n7412Artgrm2Sc, BC000812_A7413ArtPmlSc, BC000812_n7413ArtPmlSc,
            BC000812_A7414ArtAncSc, BC000812_n7414ArtAncSc, BC000812_A7415ArtPmlCru, BC000812_n7415ArtPmlCru, BC000812_A7777ArtRdtSc, BC000812_n7777ArtRdtSc, BC000812_A7778ArtUnd, BC000812_n7778ArtUnd, BC000812_A7779ArtBlo, BC000812_n7779ArtBlo,
            BC000812_A7948ArtCla, BC000812_n7948ArtCla, BC000812_A6014TipArtDsc2, BC000812_n6014TipArtDsc2, BC000812_A9730ArtFabsH, BC000812_n9730ArtFabsH, BC000812_A9801ArtFabsT, BC000812_n9801ArtFabsT, BC000812_A9875ArtNProg, BC000812_n9875ArtNProg,
            BC000812_A9902ArtVbd, BC000812_n9902ArtVbd, BC000812_A9903ArtVbn, BC000812_n9903ArtVbn, BC000812_A9904ArtAb, BC000812_n9904ArtAb, BC000812_A397ArtObsGrm, BC000812_n397ArtObsGrm, BC000812_A398ArtObsAnc, BC000812_n398ArtObsAnc,
            BC000812_A4980ArtCdb, BC000812_n4980ArtCdb, BC000812_A10027ArtGalga, BC000812_n10027ArtGalga, BC000812_A10028ArtPlatina, BC000812_n10028ArtPlatina, BC000812_A10029ArtPgd, BC000812_n10029ArtPgd, BC000812_A10031ArtThN, BC000812_n10031ArtThN,
            BC000812_A10380Art_Dc, BC000812_n10380Art_Dc, BC000812_A10804ArtHilos, BC000812_n10804ArtHilos, BC000812_A10805ArtPasad, BC000812_n10805ArtPasad, BC000812_A10831ArtAncC, BC000812_n10831ArtAncC, BC000812_A10832ArtGrm2C, BC000812_n10832ArtGrm2C,
            BC000812_A10833ArtRdoC, BC000812_n10833ArtRdoC, BC000812_A4455ArtAcaFor, BC000812_n4455ArtAcaFor, BC000812_A3682ArtAnu, BC000812_n3682ArtAnu, BC000812_A11627ArtFacUti, BC000812_n11627ArtFacUti, BC000812_A1581ArtNumTip, BC000812_n1581ArtNumTip,
            BC000812_A12364ArtMT, BC000812_n12364ArtMT, BC000812_A12365ArtTRabs, BC000812_n12365ArtTRabs, BC000812_A12366ArtKgMn, BC000812_n12366ArtKgMn, BC000812_A4446ArtAcaMar, BC000812_n4446ArtAcaMar
            }
            , new Object[] {
            BC000813_A407EmprNom, BC000813_n407EmprNom
            }
            , new Object[] {
            BC000814_A830TipArtDsc, BC000814_n830TipArtDsc, BC000814_A6014TipArtDsc2, BC000814_n6014TipArtDsc2
            }
            , new Object[] {
            BC000815_A10031ArtThN, BC000815_n10031ArtThN
            }
            , new Object[] {
            BC000816_A4296ClasDsc, BC000816_n4296ClasDsc
            }
            , new Object[] {
            BC000817_A6109ClaBolDsc, BC000817_n6109ClaBolDsc
            }
            , new Object[] {
            BC000818_A6107ClaTubDsc, BC000818_n6107ClaTubDsc
            }
            , new Object[] {
            BC000819_A10380Art_Dc, BC000819_n10380Art_Dc
            }
            , new Object[] {
            BC000820_A279CliNom, BC000820_A272CliEti, BC000820_A306CliUrg
            }
            , new Object[] {
            BC000821_A396EmprCod, BC000821_A252CliCod, BC000821_A65ArtCod
            }
            , new Object[] {
            BC000822_A3072ArtObsLon, BC000822_n3072ArtObsLon, BC000822_A4447ArtAcaBak, BC000822_n4447ArtAcaBak, BC000822_A12695ArtElgAnc, BC000822_n12695ArtElgAnc, BC000822_A12696ArtElgLar, BC000822_n12696ArtElgLar, BC000822_A12697ArtRdoCru, BC000822_n12697ArtRdoCru,
            BC000822_A12698ArtEncLarg, BC000822_n12698ArtEncLarg, BC000822_A12699ArtEncAnc, BC000822_n12699ArtEncAnc, BC000822_A14099ArtRdto4, BC000822_n14099ArtRdto4, BC000822_A14100Artdsc2, BC000822_n14100Artdsc2, BC000822_A14101ArtgrComp, BC000822_n14101ArtgrComp,
            BC000822_A14102ArtKgspp, BC000822_n14102ArtKgspp, BC000822_A14103ArtPrepp, BC000822_n14103ArtPrepp, BC000822_A90ArtObsFac, BC000822_n90ArtObsFac, BC000822_A12886ArtObsOtra, BC000822_n12886ArtObsOtra, BC000822_A14295ArtActivo, BC000822_A396EmprCod,
            BC000822_A252CliCod, BC000822_A829TipArtCod, BC000822_A10030ArtTh, BC000822_n10030ArtTh, BC000822_A4295ClasCod, BC000822_n4295ClasCod, BC000822_A6108ClaBolCod, BC000822_n6108ClaBolCod, BC000822_A6106ClaTubCod, BC000822_n6106ClaTubCod,
            BC000822_A10379Art_Cd, BC000822_n10379Art_Cd, BC000822_A65ArtCod, BC000822_A66ArtCorOri, BC000822_n66ArtCorOri, BC000822_A70ArtEncOri, BC000822_n70ArtEncOri, BC000822_A4353ArtUsrCod, BC000822_n4353ArtUsrCod, BC000822_A69ArtDsc,
            BC000822_n69ArtDsc, BC000822_A5335ArtCodExt, BC000822_n5335ArtCodExt, BC000822_A87ArtMat, BC000822_n87ArtMat, BC000822_A1148ArtPml, BC000822_n1148ArtPml, BC000822_A78ArtGraCru, BC000822_n78ArtGraCru, BC000822_A68ArtCruMin,
            BC000822_n68ArtCruMin, BC000822_A67ArtCruMax, BC000822_n67ArtCruMax, BC000822_A63ArtAcaMin, BC000822_n63ArtAcaMin, BC000822_A62ArtAcaMax, BC000822_n62ArtAcaMax, BC000822_A95ArtRen, BC000822_n95ArtRen, BC000822_A101ArtTipPle,
            BC000822_n101ArtTipPle, BC000822_A100ArtTipLar, BC000822_n100ArtTipLar, BC000822_A96ArtSua, BC000822_n96ArtSua, BC000822_A64ArtAcaQui, BC000822_n64ArtAcaQui, BC000822_A73ArtEti, BC000822_n73ArtEti, BC000822_A117ArtUrg,
            BC000822_n117ArtUrg, BC000822_A88ArtMer, BC000822_n88ArtMer, BC000822_A105ArtTra1, BC000822_n105ArtTra1, BC000822_A106ArtTra2, BC000822_n106ArtTra2, BC000822_A107ArtTra3, BC000822_n107ArtTra3, BC000822_A108ArtTraP1,
            BC000822_n108ArtTraP1, BC000822_A109ArtTraP2, BC000822_n109ArtTraP2, BC000822_A110ArtTraP3, BC000822_n110ArtTraP3, BC000822_A111ArtUrd1, BC000822_n111ArtUrd1, BC000822_A112ArtUrd2, BC000822_n112ArtUrd2, BC000822_A113ArtUrd3,
            BC000822_n113ArtUrd3, BC000822_A114ArtUrdP1, BC000822_n114ArtUrdP1, BC000822_A115ArtUrdP2, BC000822_n115ArtUrdP2, BC000822_A116ArtUrdP3, BC000822_n116ArtUrdP3, BC000822_A1229ArtEncCom, BC000822_n1229ArtEncCom, BC000822_A1230ArtEncAnh,
            BC000822_n1230ArtEncAnh, BC000822_A1903ArtGraAca, BC000822_n1903ArtGraAca, BC000822_A1905ArtRdoA, BC000822_n1905ArtRdoA, BC000822_A1904ArtRdoN, BC000822_n1904ArtRdoN, BC000822_A2791ArtFacAbs, BC000822_n2791ArtFacAbs, BC000822_A2834ArtPle2,
            BC000822_n2834ArtPle2, BC000822_A3121ArtNumCor, BC000822_n3121ArtNumCor, BC000822_A3122ArtAncSal1, BC000822_n3122ArtAncSal1, BC000822_A3123ArtAncSal2, BC000822_n3123ArtAncSal2, BC000822_A3124ArtAncSal3, BC000822_n3124ArtAncSal3, BC000822_A3125ArtGraAca2,
            BC000822_n3125ArtGraAca2, BC000822_A3126ArtGraCru2, BC000822_n3126ArtGraCru2, BC000822_A4297ArtPmPPza, BC000822_n4297ArtPmPPza, BC000822_A3683ArtFecCre, BC000822_n3683ArtFecCre, BC000822_A4354ArtFecMod, BC000822_n4354ArtFecMod, BC000822_A5741ArtComer,
            BC000822_n5741ArtComer, BC000822_A6435ArtRdoCru1, BC000822_n6435ArtRdoCru1, BC000822_A6436ArtRdoCru2, BC000822_n6436ArtRdoCru2, BC000822_A967ArtNMtr, BC000822_n967ArtNMtr, BC000822_A6462ArtLu, BC000822_n6462ArtLu, BC000822_A4607ArtRb,
            BC000822_n4607ArtRb, BC000822_A4444ArtPelAnh, BC000822_n4444ArtPelAnh, BC000822_A7412Artgrm2Sc, BC000822_n7412Artgrm2Sc, BC000822_A7413ArtPmlSc, BC000822_n7413ArtPmlSc, BC000822_A7414ArtAncSc, BC000822_n7414ArtAncSc, BC000822_A7415ArtPmlCru,
            BC000822_n7415ArtPmlCru, BC000822_A7777ArtRdtSc, BC000822_n7777ArtRdtSc, BC000822_A7778ArtUnd, BC000822_n7778ArtUnd, BC000822_A7779ArtBlo, BC000822_n7779ArtBlo, BC000822_A7948ArtCla, BC000822_n7948ArtCla, BC000822_A9730ArtFabsH,
            BC000822_n9730ArtFabsH, BC000822_A9801ArtFabsT, BC000822_n9801ArtFabsT, BC000822_A9875ArtNProg, BC000822_n9875ArtNProg, BC000822_A9902ArtVbd, BC000822_n9902ArtVbd, BC000822_A9903ArtVbn, BC000822_n9903ArtVbn, BC000822_A9904ArtAb,
            BC000822_n9904ArtAb, BC000822_A397ArtObsGrm, BC000822_n397ArtObsGrm, BC000822_A398ArtObsAnc, BC000822_n398ArtObsAnc, BC000822_A4980ArtCdb, BC000822_n4980ArtCdb, BC000822_A10027ArtGalga, BC000822_n10027ArtGalga, BC000822_A10028ArtPlatina,
            BC000822_n10028ArtPlatina, BC000822_A10029ArtPgd, BC000822_n10029ArtPgd, BC000822_A10804ArtHilos, BC000822_n10804ArtHilos, BC000822_A10805ArtPasad, BC000822_n10805ArtPasad, BC000822_A10831ArtAncC, BC000822_n10831ArtAncC, BC000822_A10832ArtGrm2C,
            BC000822_n10832ArtGrm2C, BC000822_A10833ArtRdoC, BC000822_n10833ArtRdoC, BC000822_A4455ArtAcaFor, BC000822_n4455ArtAcaFor, BC000822_A3682ArtAnu, BC000822_n3682ArtAnu, BC000822_A11627ArtFacUti, BC000822_n11627ArtFacUti, BC000822_A1581ArtNumTip,
            BC000822_n1581ArtNumTip, BC000822_A12364ArtMT, BC000822_n12364ArtMT, BC000822_A12365ArtTRabs, BC000822_n12365ArtTRabs, BC000822_A12366ArtKgMn, BC000822_n12366ArtKgMn, BC000822_A4446ArtAcaMar, BC000822_n4446ArtAcaMar
            }
            , new Object[] {
            BC000823_A3072ArtObsLon, BC000823_n3072ArtObsLon, BC000823_A4447ArtAcaBak, BC000823_n4447ArtAcaBak, BC000823_A12695ArtElgAnc, BC000823_n12695ArtElgAnc, BC000823_A12696ArtElgLar, BC000823_n12696ArtElgLar, BC000823_A12697ArtRdoCru, BC000823_n12697ArtRdoCru,
            BC000823_A12698ArtEncLarg, BC000823_n12698ArtEncLarg, BC000823_A12699ArtEncAnc, BC000823_n12699ArtEncAnc, BC000823_A14099ArtRdto4, BC000823_n14099ArtRdto4, BC000823_A14100Artdsc2, BC000823_n14100Artdsc2, BC000823_A14101ArtgrComp, BC000823_n14101ArtgrComp,
            BC000823_A14102ArtKgspp, BC000823_n14102ArtKgspp, BC000823_A14103ArtPrepp, BC000823_n14103ArtPrepp, BC000823_A90ArtObsFac, BC000823_n90ArtObsFac, BC000823_A12886ArtObsOtra, BC000823_n12886ArtObsOtra, BC000823_A14295ArtActivo, BC000823_A396EmprCod,
            BC000823_A252CliCod, BC000823_A829TipArtCod, BC000823_A10030ArtTh, BC000823_n10030ArtTh, BC000823_A4295ClasCod, BC000823_n4295ClasCod, BC000823_A6108ClaBolCod, BC000823_n6108ClaBolCod, BC000823_A6106ClaTubCod, BC000823_n6106ClaTubCod,
            BC000823_A10379Art_Cd, BC000823_n10379Art_Cd, BC000823_A65ArtCod, BC000823_A66ArtCorOri, BC000823_n66ArtCorOri, BC000823_A70ArtEncOri, BC000823_n70ArtEncOri, BC000823_A4353ArtUsrCod, BC000823_n4353ArtUsrCod, BC000823_A69ArtDsc,
            BC000823_n69ArtDsc, BC000823_A5335ArtCodExt, BC000823_n5335ArtCodExt, BC000823_A87ArtMat, BC000823_n87ArtMat, BC000823_A1148ArtPml, BC000823_n1148ArtPml, BC000823_A78ArtGraCru, BC000823_n78ArtGraCru, BC000823_A68ArtCruMin,
            BC000823_n68ArtCruMin, BC000823_A67ArtCruMax, BC000823_n67ArtCruMax, BC000823_A63ArtAcaMin, BC000823_n63ArtAcaMin, BC000823_A62ArtAcaMax, BC000823_n62ArtAcaMax, BC000823_A95ArtRen, BC000823_n95ArtRen, BC000823_A101ArtTipPle,
            BC000823_n101ArtTipPle, BC000823_A100ArtTipLar, BC000823_n100ArtTipLar, BC000823_A96ArtSua, BC000823_n96ArtSua, BC000823_A64ArtAcaQui, BC000823_n64ArtAcaQui, BC000823_A73ArtEti, BC000823_n73ArtEti, BC000823_A117ArtUrg,
            BC000823_n117ArtUrg, BC000823_A88ArtMer, BC000823_n88ArtMer, BC000823_A105ArtTra1, BC000823_n105ArtTra1, BC000823_A106ArtTra2, BC000823_n106ArtTra2, BC000823_A107ArtTra3, BC000823_n107ArtTra3, BC000823_A108ArtTraP1,
            BC000823_n108ArtTraP1, BC000823_A109ArtTraP2, BC000823_n109ArtTraP2, BC000823_A110ArtTraP3, BC000823_n110ArtTraP3, BC000823_A111ArtUrd1, BC000823_n111ArtUrd1, BC000823_A112ArtUrd2, BC000823_n112ArtUrd2, BC000823_A113ArtUrd3,
            BC000823_n113ArtUrd3, BC000823_A114ArtUrdP1, BC000823_n114ArtUrdP1, BC000823_A115ArtUrdP2, BC000823_n115ArtUrdP2, BC000823_A116ArtUrdP3, BC000823_n116ArtUrdP3, BC000823_A1229ArtEncCom, BC000823_n1229ArtEncCom, BC000823_A1230ArtEncAnh,
            BC000823_n1230ArtEncAnh, BC000823_A1903ArtGraAca, BC000823_n1903ArtGraAca, BC000823_A1905ArtRdoA, BC000823_n1905ArtRdoA, BC000823_A1904ArtRdoN, BC000823_n1904ArtRdoN, BC000823_A2791ArtFacAbs, BC000823_n2791ArtFacAbs, BC000823_A2834ArtPle2,
            BC000823_n2834ArtPle2, BC000823_A3121ArtNumCor, BC000823_n3121ArtNumCor, BC000823_A3122ArtAncSal1, BC000823_n3122ArtAncSal1, BC000823_A3123ArtAncSal2, BC000823_n3123ArtAncSal2, BC000823_A3124ArtAncSal3, BC000823_n3124ArtAncSal3, BC000823_A3125ArtGraAca2,
            BC000823_n3125ArtGraAca2, BC000823_A3126ArtGraCru2, BC000823_n3126ArtGraCru2, BC000823_A4297ArtPmPPza, BC000823_n4297ArtPmPPza, BC000823_A3683ArtFecCre, BC000823_n3683ArtFecCre, BC000823_A4354ArtFecMod, BC000823_n4354ArtFecMod, BC000823_A5741ArtComer,
            BC000823_n5741ArtComer, BC000823_A6435ArtRdoCru1, BC000823_n6435ArtRdoCru1, BC000823_A6436ArtRdoCru2, BC000823_n6436ArtRdoCru2, BC000823_A967ArtNMtr, BC000823_n967ArtNMtr, BC000823_A6462ArtLu, BC000823_n6462ArtLu, BC000823_A4607ArtRb,
            BC000823_n4607ArtRb, BC000823_A4444ArtPelAnh, BC000823_n4444ArtPelAnh, BC000823_A7412Artgrm2Sc, BC000823_n7412Artgrm2Sc, BC000823_A7413ArtPmlSc, BC000823_n7413ArtPmlSc, BC000823_A7414ArtAncSc, BC000823_n7414ArtAncSc, BC000823_A7415ArtPmlCru,
            BC000823_n7415ArtPmlCru, BC000823_A7777ArtRdtSc, BC000823_n7777ArtRdtSc, BC000823_A7778ArtUnd, BC000823_n7778ArtUnd, BC000823_A7779ArtBlo, BC000823_n7779ArtBlo, BC000823_A7948ArtCla, BC000823_n7948ArtCla, BC000823_A9730ArtFabsH,
            BC000823_n9730ArtFabsH, BC000823_A9801ArtFabsT, BC000823_n9801ArtFabsT, BC000823_A9875ArtNProg, BC000823_n9875ArtNProg, BC000823_A9902ArtVbd, BC000823_n9902ArtVbd, BC000823_A9903ArtVbn, BC000823_n9903ArtVbn, BC000823_A9904ArtAb,
            BC000823_n9904ArtAb, BC000823_A397ArtObsGrm, BC000823_n397ArtObsGrm, BC000823_A398ArtObsAnc, BC000823_n398ArtObsAnc, BC000823_A4980ArtCdb, BC000823_n4980ArtCdb, BC000823_A10027ArtGalga, BC000823_n10027ArtGalga, BC000823_A10028ArtPlatina,
            BC000823_n10028ArtPlatina, BC000823_A10029ArtPgd, BC000823_n10029ArtPgd, BC000823_A10804ArtHilos, BC000823_n10804ArtHilos, BC000823_A10805ArtPasad, BC000823_n10805ArtPasad, BC000823_A10831ArtAncC, BC000823_n10831ArtAncC, BC000823_A10832ArtGrm2C,
            BC000823_n10832ArtGrm2C, BC000823_A10833ArtRdoC, BC000823_n10833ArtRdoC, BC000823_A4455ArtAcaFor, BC000823_n4455ArtAcaFor, BC000823_A3682ArtAnu, BC000823_n3682ArtAnu, BC000823_A11627ArtFacUti, BC000823_n11627ArtFacUti, BC000823_A1581ArtNumTip,
            BC000823_n1581ArtNumTip, BC000823_A12364ArtMT, BC000823_n12364ArtMT, BC000823_A12365ArtTRabs, BC000823_n12365ArtTRabs, BC000823_A12366ArtKgMn, BC000823_n12366ArtKgMn, BC000823_A4446ArtAcaMar, BC000823_n4446ArtAcaMar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000827_A407EmprNom, BC000827_n407EmprNom
            }
            , new Object[] {
            BC000828_A279CliNom, BC000828_A272CliEti, BC000828_A306CliUrg
            }
            , new Object[] {
            BC000829_A830TipArtDsc, BC000829_n830TipArtDsc, BC000829_A6014TipArtDsc2, BC000829_n6014TipArtDsc2
            }
            , new Object[] {
            BC000830_A4296ClasDsc, BC000830_n4296ClasDsc
            }
            , new Object[] {
            BC000831_A6107ClaTubDsc, BC000831_n6107ClaTubDsc
            }
            , new Object[] {
            BC000832_A6109ClaBolDsc, BC000832_n6109ClaBolDsc
            }
            , new Object[] {
            BC000833_A10031ArtThN, BC000833_n10031ArtThN
            }
            , new Object[] {
            BC000834_A10380Art_Dc, BC000834_n10380Art_Dc
            }
            , new Object[] {
            BC000835_A396EmprCod, BC000835_A252CliCod, BC000835_A65ArtCod, BC000835_A499GrpFamCod
            }
            , new Object[] {
            BC000836_A396EmprCod, BC000836_A252CliCod, BC000836_A12814ARTConID, BC000836_A65ArtCod
            }
            , new Object[] {
            BC000837_A396EmprCod, BC000837_A252CliCod, BC000837_A65ArtCod, BC000837_A12363SocInt
            }
            , new Object[] {
            BC000838_A396EmprCod, BC000838_A4929Inc_Dia, BC000838_A5728JBCLLin
            }
            , new Object[] {
            BC000839_A396EmprCod, BC000839_A252CliCod, BC000839_A5809MMezCod, BC000839_A65ArtCod
            }
            , new Object[] {
            BC000840_A396EmprCod, BC000840_A252CliCod, BC000840_A5234MezCod, BC000840_A5240MezLin
            }
            , new Object[] {
            BC000841_A396EmprCod, BC000841_A252CliCod, BC000841_A65ArtCod, BC000841_A4116estreclim
            }
            , new Object[] {
            BC000842_A396EmprCod, BC000842_A252CliCod, BC000842_A65ArtCod, BC000842_A4061EstNomCol
            }
            , new Object[] {
            BC000843_A396EmprCod, BC000843_A9705ErpNped, BC000843_A8652ErpLin
            }
            , new Object[] {
            BC000844_A396EmprCod, BC000844_A252CliCod, BC000844_A65ArtCod, BC000844_A7266CAAqP
            }
            , new Object[] {
            BC000845_A396EmprCod, BC000845_A252CliCod, BC000845_A65ArtCod, BC000845_A11084H_DiaA
            }
            , new Object[] {
            BC000846_A396EmprCod, BC000846_A252CliCod, BC000846_A65ArtCod, BC000846_A10972Int_cod
            }
            , new Object[] {
            BC000847_A396EmprCod, BC000847_A252CliCod, BC000847_A65ArtCod, BC000847_A10577Pg_Procod
            }
            , new Object[] {
            BC000848_A396EmprCod, BC000848_A252CliCod, BC000848_A65ArtCod, BC000848_A10272Hz_cod
            }
            , new Object[] {
            BC000849_A396EmprCod, BC000849_A252CliCod, BC000849_A65ArtCod, BC000849_A10041ArtSH
            }
            , new Object[] {
            BC000850_A396EmprCod, BC000850_A252CliCod, BC000850_A65ArtCod, BC000850_A8427TipoCt, BC000850_A8428CapMxMq
            }
            , new Object[] {
            BC000851_A396EmprCod, BC000851_A252CliCod, BC000851_A65ArtCod, BC000851_A8342CodPred
            }
            , new Object[] {
            BC000852_A396EmprCod, BC000852_A252CliCod, BC000852_A65ArtCod, BC000852_A8089ArtcodTj
            }
            , new Object[] {
            BC000853_A396EmprCod, BC000853_A252CliCod, BC000853_A65ArtCod, BC000853_A7956Mq_CodM
            }
            , new Object[] {
            BC000854_A396EmprCod, BC000854_A252CliCod, BC000854_A65ArtCod, BC000854_A7949Par_Art
            }
            , new Object[] {
            BC000855_A396EmprCod, BC000855_A252CliCod, BC000855_A65ArtCod, BC000855_A7135Lin_fast
            }
            , new Object[] {
            BC000856_A396EmprCod, BC000856_A252CliCod, BC000856_A65ArtCod, BC000856_A6954Mat_lin
            }
            , new Object[] {
            BC000857_A396EmprCod, BC000857_A602MaqCod, BC000857_A6078MaqCliCod, BC000857_A6079MaqArtCod
            }
            , new Object[] {
            BC000858_A396EmprCod, BC000858_A252CliCod, BC000858_A65ArtCod, BC000858_A5382EstCatAny, BC000858_A5383EstCatSer, BC000858_A5384EstCatTip
            }
            , new Object[] {
            BC000859_A396EmprCod, BC000859_A252CliCod, BC000859_A65ArtCod, BC000859_A4658MdlCod
            }
            , new Object[] {
            BC000860_A396EmprCod, BC000860_A252CliCod, BC000860_A4175WebEmpCod
            }
            , new Object[] {
            BC000861_A396EmprCod, BC000861_A252CliCod, BC000861_A4079WEBDISCOD
            }
            , new Object[] {
            BC000862_A396EmprCod, BC000862_A252CliCod, BC000862_A65ArtCod, BC000862_A4058CCFColNom, BC000862_A4059CCFColNum
            }
            , new Object[] {
            BC000863_A396EmprCod, BC000863_A252CliCod, BC000863_A65ArtCod, BC000863_A1177Dibujo, BC000863_A1790DibIntCod
            }
            , new Object[] {
            BC000864_A396EmprCod, BC000864_A252CliCod, BC000864_A65ArtCod, BC000864_A1080LinPre
            }
            , new Object[] {
            BC000865_A396EmprCod, BC000865_A3814PePCod
            }
            , new Object[] {
            BC000866_A396EmprCod, BC000866_A3413OpeManCod, BC000866_A3430PreManNMt, BC000866_A252CliCod, BC000866_A65ArtCod
            }
            , new Object[] {
            BC000867_A396EmprCod, BC000867_A3415ParManNum
            }
            , new Object[] {
            BC000868_A396EmprCod, BC000868_A3331LanBroCod, BC000868_A3333LanBroLin
            }
            , new Object[] {
            BC000869_A396EmprCod, BC000869_A252CliCod, BC000869_A65ArtCod, BC000869_A3319ArtCapKgs
            }
            , new Object[] {
            BC000870_A396EmprCod, BC000870_A252CliCod, BC000870_A65ArtCod, BC000870_A3288CCalCod
            }
            , new Object[] {
            BC000871_A396EmprCod, BC000871_A252CliCod, BC000871_A65ArtCod, BC000871_A3033CCCod
            }
            , new Object[] {
            BC000872_A396EmprCod, BC000872_A252CliCod, BC000872_A65ArtCod, BC000872_A2937RecIntCod
            }
            , new Object[] {
            BC000873_A396EmprCod, BC000873_A252CliCod, BC000873_A65ArtCod, BC000873_A2931Limite2
            }
            , new Object[] {
            BC000874_A396EmprCod, BC000874_A252CliCod, BC000874_A65ArtCod, BC000874_A71ArtEstAny, BC000874_A2756ArtEstSer
            }
            , new Object[] {
            BC000875_A396EmprCod, BC000875_A252CliCod, BC000875_A1504CliProCod, BC000875_A65ArtCod
            }
            , new Object[] {
            BC000876_A396EmprCod, BC000876_A252CliCod, BC000876_A65ArtCod, BC000876_A598LinRec
            }
            , new Object[] {
            BC000877_A396EmprCod, BC000877_A252CliCod, BC000877_A65ArtCod, BC000877_A831TipColCod
            }
            , new Object[] {
            BC000878_A396EmprCod, BC000878_A252CliCod, BC000878_A65ArtCod, BC000878_A758ProCod
            }
            , new Object[] {
            BC000879_A3072ArtObsLon, BC000879_n3072ArtObsLon, BC000879_A4447ArtAcaBak, BC000879_n4447ArtAcaBak, BC000879_A12695ArtElgAnc, BC000879_n12695ArtElgAnc, BC000879_A12696ArtElgLar, BC000879_n12696ArtElgLar, BC000879_A12697ArtRdoCru, BC000879_n12697ArtRdoCru,
            BC000879_A12698ArtEncLarg, BC000879_n12698ArtEncLarg, BC000879_A12699ArtEncAnc, BC000879_n12699ArtEncAnc, BC000879_A14099ArtRdto4, BC000879_n14099ArtRdto4, BC000879_A14100Artdsc2, BC000879_n14100Artdsc2, BC000879_A14101ArtgrComp, BC000879_n14101ArtgrComp,
            BC000879_A14102ArtKgspp, BC000879_n14102ArtKgspp, BC000879_A14103ArtPrepp, BC000879_n14103ArtPrepp, BC000879_A90ArtObsFac, BC000879_n90ArtObsFac, BC000879_A12886ArtObsOtra, BC000879_n12886ArtObsOtra, BC000879_A14295ArtActivo, BC000879_A396EmprCod,
            BC000879_A252CliCod, BC000879_A829TipArtCod, BC000879_A10030ArtTh, BC000879_n10030ArtTh, BC000879_A4295ClasCod, BC000879_n4295ClasCod, BC000879_A6108ClaBolCod, BC000879_n6108ClaBolCod, BC000879_A6106ClaTubCod, BC000879_n6106ClaTubCod,
            BC000879_A10379Art_Cd, BC000879_n10379Art_Cd, BC000879_A65ArtCod, BC000879_A66ArtCorOri, BC000879_n66ArtCorOri, BC000879_A70ArtEncOri, BC000879_n70ArtEncOri, BC000879_A4353ArtUsrCod, BC000879_n4353ArtUsrCod, BC000879_A69ArtDsc,
            BC000879_n69ArtDsc, BC000879_A279CliNom, BC000879_A5335ArtCodExt, BC000879_n5335ArtCodExt, BC000879_A407EmprNom, BC000879_n407EmprNom, BC000879_A87ArtMat, BC000879_n87ArtMat, BC000879_A830TipArtDsc, BC000879_n830TipArtDsc,
            BC000879_A1148ArtPml, BC000879_n1148ArtPml, BC000879_A78ArtGraCru, BC000879_n78ArtGraCru, BC000879_A68ArtCruMin, BC000879_n68ArtCruMin, BC000879_A67ArtCruMax, BC000879_n67ArtCruMax, BC000879_A63ArtAcaMin, BC000879_n63ArtAcaMin,
            BC000879_A62ArtAcaMax, BC000879_n62ArtAcaMax, BC000879_A95ArtRen, BC000879_n95ArtRen, BC000879_A101ArtTipPle, BC000879_n101ArtTipPle, BC000879_A100ArtTipLar, BC000879_n100ArtTipLar, BC000879_A96ArtSua, BC000879_n96ArtSua,
            BC000879_A64ArtAcaQui, BC000879_n64ArtAcaQui, BC000879_A73ArtEti, BC000879_n73ArtEti, BC000879_A272CliEti, BC000879_A306CliUrg, BC000879_A117ArtUrg, BC000879_n117ArtUrg, BC000879_A88ArtMer, BC000879_n88ArtMer,
            BC000879_A105ArtTra1, BC000879_n105ArtTra1, BC000879_A106ArtTra2, BC000879_n106ArtTra2, BC000879_A107ArtTra3, BC000879_n107ArtTra3, BC000879_A108ArtTraP1, BC000879_n108ArtTraP1, BC000879_A109ArtTraP2, BC000879_n109ArtTraP2,
            BC000879_A110ArtTraP3, BC000879_n110ArtTraP3, BC000879_A111ArtUrd1, BC000879_n111ArtUrd1, BC000879_A112ArtUrd2, BC000879_n112ArtUrd2, BC000879_A113ArtUrd3, BC000879_n113ArtUrd3, BC000879_A114ArtUrdP1, BC000879_n114ArtUrdP1,
            BC000879_A115ArtUrdP2, BC000879_n115ArtUrdP2, BC000879_A116ArtUrdP3, BC000879_n116ArtUrdP3, BC000879_A1229ArtEncCom, BC000879_n1229ArtEncCom, BC000879_A1230ArtEncAnh, BC000879_n1230ArtEncAnh, BC000879_A1903ArtGraAca, BC000879_n1903ArtGraAca,
            BC000879_A1905ArtRdoA, BC000879_n1905ArtRdoA, BC000879_A1904ArtRdoN, BC000879_n1904ArtRdoN, BC000879_A2791ArtFacAbs, BC000879_n2791ArtFacAbs, BC000879_A2834ArtPle2, BC000879_n2834ArtPle2, BC000879_A3121ArtNumCor, BC000879_n3121ArtNumCor,
            BC000879_A3122ArtAncSal1, BC000879_n3122ArtAncSal1, BC000879_A3123ArtAncSal2, BC000879_n3123ArtAncSal2, BC000879_A3124ArtAncSal3, BC000879_n3124ArtAncSal3, BC000879_A3125ArtGraAca2, BC000879_n3125ArtGraAca2, BC000879_A3126ArtGraCru2, BC000879_n3126ArtGraCru2,
            BC000879_A4297ArtPmPPza, BC000879_n4297ArtPmPPza, BC000879_A3683ArtFecCre, BC000879_n3683ArtFecCre, BC000879_A4354ArtFecMod, BC000879_n4354ArtFecMod, BC000879_A4296ClasDsc, BC000879_n4296ClasDsc, BC000879_A5741ArtComer, BC000879_n5741ArtComer,
            BC000879_A6107ClaTubDsc, BC000879_n6107ClaTubDsc, BC000879_A6109ClaBolDsc, BC000879_n6109ClaBolDsc, BC000879_A6435ArtRdoCru1, BC000879_n6435ArtRdoCru1, BC000879_A6436ArtRdoCru2, BC000879_n6436ArtRdoCru2, BC000879_A967ArtNMtr, BC000879_n967ArtNMtr,
            BC000879_A6462ArtLu, BC000879_n6462ArtLu, BC000879_A4607ArtRb, BC000879_n4607ArtRb, BC000879_A4444ArtPelAnh, BC000879_n4444ArtPelAnh, BC000879_A7412Artgrm2Sc, BC000879_n7412Artgrm2Sc, BC000879_A7413ArtPmlSc, BC000879_n7413ArtPmlSc,
            BC000879_A7414ArtAncSc, BC000879_n7414ArtAncSc, BC000879_A7415ArtPmlCru, BC000879_n7415ArtPmlCru, BC000879_A7777ArtRdtSc, BC000879_n7777ArtRdtSc, BC000879_A7778ArtUnd, BC000879_n7778ArtUnd, BC000879_A7779ArtBlo, BC000879_n7779ArtBlo,
            BC000879_A7948ArtCla, BC000879_n7948ArtCla, BC000879_A6014TipArtDsc2, BC000879_n6014TipArtDsc2, BC000879_A9730ArtFabsH, BC000879_n9730ArtFabsH, BC000879_A9801ArtFabsT, BC000879_n9801ArtFabsT, BC000879_A9875ArtNProg, BC000879_n9875ArtNProg,
            BC000879_A9902ArtVbd, BC000879_n9902ArtVbd, BC000879_A9903ArtVbn, BC000879_n9903ArtVbn, BC000879_A9904ArtAb, BC000879_n9904ArtAb, BC000879_A397ArtObsGrm, BC000879_n397ArtObsGrm, BC000879_A398ArtObsAnc, BC000879_n398ArtObsAnc,
            BC000879_A4980ArtCdb, BC000879_n4980ArtCdb, BC000879_A10027ArtGalga, BC000879_n10027ArtGalga, BC000879_A10028ArtPlatina, BC000879_n10028ArtPlatina, BC000879_A10029ArtPgd, BC000879_n10029ArtPgd, BC000879_A10031ArtThN, BC000879_n10031ArtThN,
            BC000879_A10380Art_Dc, BC000879_n10380Art_Dc, BC000879_A10804ArtHilos, BC000879_n10804ArtHilos, BC000879_A10805ArtPasad, BC000879_n10805ArtPasad, BC000879_A10831ArtAncC, BC000879_n10831ArtAncC, BC000879_A10832ArtGrm2C, BC000879_n10832ArtGrm2C,
            BC000879_A10833ArtRdoC, BC000879_n10833ArtRdoC, BC000879_A4455ArtAcaFor, BC000879_n4455ArtAcaFor, BC000879_A3682ArtAnu, BC000879_n3682ArtAnu, BC000879_A11627ArtFacUti, BC000879_n11627ArtFacUti, BC000879_A1581ArtNumTip, BC000879_n1581ArtNumTip,
            BC000879_A12364ArtMT, BC000879_n12364ArtMT, BC000879_A12365ArtTRabs, BC000879_n12365ArtTRabs, BC000879_A12366ArtKgMn, BC000879_n12366ArtKgMn, BC000879_A4446ArtAcaMar, BC000879_n4446ArtAcaMar
            }
            , new Object[] {
            BC000880_A407EmprNom, BC000880_n407EmprNom
            }
            , new Object[] {
            BC000881_A279CliNom, BC000881_A272CliEti, BC000881_A306CliUrg
            }
            , new Object[] {
            BC000882_A407EmprNom, BC000882_n407EmprNom
            }
            , new Object[] {
            BC000883_A279CliNom, BC000883_A272CliEti, BC000883_A306CliUrg
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV221Pgmname = "TARTICU_BC" ;
      Z14295ArtActivo = httpContext.getMessage( "S", "") ;
      A14295ArtActivo = httpContext.getMessage( "S", "") ;
      i14295ArtActivo = httpContext.getMessage( "S", "") ;
      Z7779ArtBlo = "*" ;
      n7779ArtBlo = false ;
      A7779ArtBlo = "*" ;
      n7779ArtBlo = false ;
      i7779ArtBlo = "*" ;
      n7779ArtBlo = false ;
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      Z69ArtDsc = "" ;
      n69ArtDsc = false ;
      Z3683ArtFecCre = GXutil.today( ) ;
      n3683ArtFecCre = false ;
      A3683ArtFecCre = GXutil.today( ) ;
      n3683ArtFecCre = false ;
      i3683ArtFecCre = GXutil.today( ) ;
      n3683ArtFecCre = false ;
      Z4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      A4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      O4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      i4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      Z73ArtEti = httpContext.getMessage( "S", "") ;
      n73ArtEti = false ;
      A73ArtEti = httpContext.getMessage( "S", "") ;
      n73ArtEti = false ;
      i73ArtEti = httpContext.getMessage( "S", "") ;
      n73ArtEti = false ;
      Z117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      A117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e12082 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV139Tintutex ;
   private byte AV76FecFMa ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Z117ArtUrg ;
   private byte A117ArtUrg ;
   private byte Z7948ArtCla ;
   private byte A7948ArtCla ;
   private byte Z9875ArtNProg ;
   private byte A9875ArtNProg ;
   private byte Z12364ArtMT ;
   private byte A12364ArtMT ;
   private byte Z12365ArtTRabs ;
   private byte A12365ArtTRabs ;
   private byte Z306CliUrg ;
   private byte A306CliUrg ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV202Insert_TipArtCod ;
   private short AV203Insert_ClasCod ;
   private short AV204Insert_ClaTubCod ;
   private short AV205Insert_ClaBolCod ;
   private short AV206Insert_ArtTh ;
   private short AV207Insert_Art_Cd ;
   private short Z1148ArtPml ;
   private short A1148ArtPml ;
   private short Z78ArtGraCru ;
   private short A78ArtGraCru ;
   private short Z68ArtCruMin ;
   private short A68ArtCruMin ;
   private short Z67ArtCruMax ;
   private short A67ArtCruMax ;
   private short Z63ArtAcaMin ;
   private short A63ArtAcaMin ;
   private short Z62ArtAcaMax ;
   private short A62ArtAcaMax ;
   private short Z108ArtTraP1 ;
   private short A108ArtTraP1 ;
   private short Z109ArtTraP2 ;
   private short A109ArtTraP2 ;
   private short Z110ArtTraP3 ;
   private short A110ArtTraP3 ;
   private short Z114ArtUrdP1 ;
   private short A114ArtUrdP1 ;
   private short Z115ArtUrdP2 ;
   private short A115ArtUrdP2 ;
   private short Z116ArtUrdP3 ;
   private short A116ArtUrdP3 ;
   private short Z1229ArtEncCom ;
   private short A1229ArtEncCom ;
   private short Z1230ArtEncAnh ;
   private short A1230ArtEncAnh ;
   private short Z1903ArtGraAca ;
   private short A1903ArtGraAca ;
   private short Z3121ArtNumCor ;
   private short A3121ArtNumCor ;
   private short Z3122ArtAncSal1 ;
   private short A3122ArtAncSal1 ;
   private short Z3123ArtAncSal2 ;
   private short A3123ArtAncSal2 ;
   private short Z3124ArtAncSal3 ;
   private short A3124ArtAncSal3 ;
   private short Z3125ArtGraAca2 ;
   private short A3125ArtGraAca2 ;
   private short Z3126ArtGraCru2 ;
   private short A3126ArtGraCru2 ;
   private short Z4607ArtRb ;
   private short A4607ArtRb ;
   private short Z4444ArtPelAnh ;
   private short A4444ArtPelAnh ;
   private short Z7412Artgrm2Sc ;
   private short A7412Artgrm2Sc ;
   private short Z7413ArtPmlSc ;
   private short A7413ArtPmlSc ;
   private short Z7414ArtAncSc ;
   private short A7414ArtAncSc ;
   private short Z7415ArtPmlCru ;
   private short A7415ArtPmlCru ;
   private short Z9902ArtVbd ;
   private short A9902ArtVbd ;
   private short Z9903ArtVbn ;
   private short A9903ArtVbn ;
   private short Z9904ArtAb ;
   private short A9904ArtAb ;
   private short Z10804ArtHilos ;
   private short A10804ArtHilos ;
   private short Z10805ArtPasad ;
   private short A10805ArtPasad ;
   private short Z10831ArtAncC ;
   private short A10831ArtAncC ;
   private short Z10832ArtGrm2C ;
   private short A10832ArtGrm2C ;
   private short Z829TipArtCod ;
   private short A829TipArtCod ;
   private short Z10030ArtTh ;
   private short A10030ArtTh ;
   private short Z4295ClasCod ;
   private short A4295ClasCod ;
   private short Z6108ClaBolCod ;
   private short A6108ClaBolCod ;
   private short Z6106ClaTubCod ;
   private short A6106ClaTubCod ;
   private short Z10379Art_Cd ;
   private short A10379Art_Cd ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private int trnEnded ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int AV222GXV1 ;
   private int GX_JID ;
   private int Z4455ArtAcaFor ;
   private int A4455ArtAcaFor ;
   private int Z1581ArtNumTip ;
   private int A1581ArtNumTip ;
   private int GXv_int8[] ;
   private java.math.BigDecimal Z95ArtRen ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal Z88ArtMer ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal Z1905ArtRdoA ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal Z1904ArtRdoN ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal Z2791ArtFacAbs ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal Z4297ArtPmPPza ;
   private java.math.BigDecimal A4297ArtPmPPza ;
   private java.math.BigDecimal Z6435ArtRdoCru1 ;
   private java.math.BigDecimal A6435ArtRdoCru1 ;
   private java.math.BigDecimal Z6436ArtRdoCru2 ;
   private java.math.BigDecimal A6436ArtRdoCru2 ;
   private java.math.BigDecimal Z6462ArtLu ;
   private java.math.BigDecimal A6462ArtLu ;
   private java.math.BigDecimal Z7777ArtRdtSc ;
   private java.math.BigDecimal A7777ArtRdtSc ;
   private java.math.BigDecimal Z9730ArtFabsH ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal Z9801ArtFabsT ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal Z10833ArtRdoC ;
   private java.math.BigDecimal A10833ArtRdoC ;
   private java.math.BigDecimal Z11627ArtFacUti ;
   private java.math.BigDecimal A11627ArtFacUti ;
   private java.math.BigDecimal Z12366ArtKgMn ;
   private java.math.BigDecimal A12366ArtKgMn ;
   private java.math.BigDecimal Z12695ArtElgAnc ;
   private java.math.BigDecimal A12695ArtElgAnc ;
   private java.math.BigDecimal Z12696ArtElgLar ;
   private java.math.BigDecimal A12696ArtElgLar ;
   private java.math.BigDecimal Z12697ArtRdoCru ;
   private java.math.BigDecimal A12697ArtRdoCru ;
   private java.math.BigDecimal Z12698ArtEncLarg ;
   private java.math.BigDecimal A12698ArtEncLarg ;
   private java.math.BigDecimal Z12699ArtEncAnc ;
   private java.math.BigDecimal A12699ArtEncAnc ;
   private java.math.BigDecimal Z14099ArtRdto4 ;
   private java.math.BigDecimal A14099ArtRdto4 ;
   private java.math.BigDecimal Z14101ArtgrComp ;
   private java.math.BigDecimal A14101ArtgrComp ;
   private java.math.BigDecimal Z14102ArtKgspp ;
   private java.math.BigDecimal A14102ArtKgspp ;
   private java.math.BigDecimal Z14103ArtPrepp ;
   private java.math.BigDecimal A14103ArtPrepp ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z65ArtCod ;
   private String A65ArtCod ;
   private String AV52Station ;
   private String GXt_char1 ;
   private String AV57EmprCod ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV221Pgmname ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String Z66ArtCorOri ;
   private String A66ArtCorOri ;
   private String Z70ArtEncOri ;
   private String A70ArtEncOri ;
   private String Z4353ArtUsrCod ;
   private String A4353ArtUsrCod ;
   private String Z69ArtDsc ;
   private String Z5335ArtCodExt ;
   private String A5335ArtCodExt ;
   private String Z87ArtMat ;
   private String A87ArtMat ;
   private String Z101ArtTipPle ;
   private String A101ArtTipPle ;
   private String Z100ArtTipLar ;
   private String A100ArtTipLar ;
   private String Z96ArtSua ;
   private String A96ArtSua ;
   private String Z64ArtAcaQui ;
   private String A64ArtAcaQui ;
   private String Z73ArtEti ;
   private String A73ArtEti ;
   private String Z105ArtTra1 ;
   private String A105ArtTra1 ;
   private String Z106ArtTra2 ;
   private String A106ArtTra2 ;
   private String Z107ArtTra3 ;
   private String A107ArtTra3 ;
   private String Z111ArtUrd1 ;
   private String A111ArtUrd1 ;
   private String Z112ArtUrd2 ;
   private String A112ArtUrd2 ;
   private String Z113ArtUrd3 ;
   private String A113ArtUrd3 ;
   private String Z2834ArtPle2 ;
   private String A2834ArtPle2 ;
   private String Z5741ArtComer ;
   private String A5741ArtComer ;
   private String Z967ArtNMtr ;
   private String A967ArtNMtr ;
   private String Z7778ArtUnd ;
   private String A7778ArtUnd ;
   private String Z7779ArtBlo ;
   private String A7779ArtBlo ;
   private String Z397ArtObsGrm ;
   private String A397ArtObsGrm ;
   private String Z398ArtObsAnc ;
   private String A398ArtObsAnc ;
   private String Z4980ArtCdb ;
   private String A4980ArtCdb ;
   private String Z10027ArtGalga ;
   private String A10027ArtGalga ;
   private String Z10028ArtPlatina ;
   private String A10028ArtPlatina ;
   private String Z10029ArtPgd ;
   private String A10029ArtPgd ;
   private String Z3682ArtAnu ;
   private String A3682ArtAnu ;
   private String Z4446ArtAcaMar ;
   private String A4446ArtAcaMar ;
   private String Z4447ArtAcaBak ;
   private String A4447ArtAcaBak ;
   private String Z90ArtObsFac ;
   private String A90ArtObsFac ;
   private String Z14295ArtActivo ;
   private String A14295ArtActivo ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z279CliNom ;
   private String Z272CliEti ;
   private String A272CliEti ;
   private String Z830TipArtDsc ;
   private String A830TipArtDsc ;
   private String Z6014TipArtDsc2 ;
   private String A6014TipArtDsc2 ;
   private String Z10031ArtThN ;
   private String A10031ArtThN ;
   private String Z4296ClasDsc ;
   private String A4296ClasDsc ;
   private String Z6109ClaBolDsc ;
   private String A6109ClaBolDsc ;
   private String Z6107ClaTubDsc ;
   private String A6107ClaTubDsc ;
   private String Z10380Art_Dc ;
   private String A10380Art_Dc ;
   private String AV217Artusrcod ;
   private String O4353ArtUsrCod ;
   private String sMode10 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String i4353ArtUsrCod ;
   private String i73ArtEti ;
   private String i7779ArtBlo ;
   private String i14295ArtActivo ;
   private java.util.Date AV218ArtFecMod ;
   private java.util.Date Gx_date ;
   private java.util.Date Z3683ArtFecCre ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date Z4354ArtFecMod ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date i3683ArtFecCre ;
   private boolean returnInSub ;
   private boolean n4353ArtUsrCod ;
   private boolean n73ArtEti ;
   private boolean n3683ArtFecCre ;
   private boolean n7779ArtBlo ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n3072ArtObsLon ;
   private boolean n4447ArtAcaBak ;
   private boolean n12695ArtElgAnc ;
   private boolean n12696ArtElgLar ;
   private boolean n12697ArtRdoCru ;
   private boolean n12698ArtEncLarg ;
   private boolean n12699ArtEncAnc ;
   private boolean n14099ArtRdto4 ;
   private boolean n14100Artdsc2 ;
   private boolean n14101ArtgrComp ;
   private boolean n14102ArtKgspp ;
   private boolean n14103ArtPrepp ;
   private boolean n90ArtObsFac ;
   private boolean n12886ArtObsOtra ;
   private boolean n10030ArtTh ;
   private boolean n4295ClasCod ;
   private boolean n6108ClaBolCod ;
   private boolean n6106ClaTubCod ;
   private boolean n10379Art_Cd ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n69ArtDsc ;
   private boolean n5335ArtCodExt ;
   private boolean n407EmprNom ;
   private boolean n87ArtMat ;
   private boolean n830TipArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n63ArtAcaMin ;
   private boolean n62ArtAcaMax ;
   private boolean n95ArtRen ;
   private boolean n101ArtTipPle ;
   private boolean n100ArtTipLar ;
   private boolean n96ArtSua ;
   private boolean n64ArtAcaQui ;
   private boolean n117ArtUrg ;
   private boolean n88ArtMer ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n1903ArtGraAca ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n2791ArtFacAbs ;
   private boolean n2834ArtPle2 ;
   private boolean n3121ArtNumCor ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3126ArtGraCru2 ;
   private boolean n4297ArtPmPPza ;
   private boolean n4354ArtFecMod ;
   private boolean n4296ClasDsc ;
   private boolean n5741ArtComer ;
   private boolean n6107ClaTubDsc ;
   private boolean n6109ClaBolDsc ;
   private boolean n6435ArtRdoCru1 ;
   private boolean n6436ArtRdoCru2 ;
   private boolean n967ArtNMtr ;
   private boolean n6462ArtLu ;
   private boolean n4607ArtRb ;
   private boolean n4444ArtPelAnh ;
   private boolean n7412Artgrm2Sc ;
   private boolean n7413ArtPmlSc ;
   private boolean n7414ArtAncSc ;
   private boolean n7415ArtPmlCru ;
   private boolean n7777ArtRdtSc ;
   private boolean n7778ArtUnd ;
   private boolean n7948ArtCla ;
   private boolean n6014TipArtDsc2 ;
   private boolean n9730ArtFabsH ;
   private boolean n9801ArtFabsT ;
   private boolean n9875ArtNProg ;
   private boolean n9902ArtVbd ;
   private boolean n9903ArtVbn ;
   private boolean n9904ArtAb ;
   private boolean n397ArtObsGrm ;
   private boolean n398ArtObsAnc ;
   private boolean n4980ArtCdb ;
   private boolean n10027ArtGalga ;
   private boolean n10028ArtPlatina ;
   private boolean n10029ArtPgd ;
   private boolean n10031ArtThN ;
   private boolean n10380Art_Dc ;
   private boolean n10804ArtHilos ;
   private boolean n10805ArtPasad ;
   private boolean n10831ArtAncC ;
   private boolean n10832ArtGrm2C ;
   private boolean n10833ArtRdoC ;
   private boolean n4455ArtAcaFor ;
   private boolean n3682ArtAnu ;
   private boolean n11627ArtFacUti ;
   private boolean n1581ArtNumTip ;
   private boolean n12364ArtMT ;
   private boolean n12365ArtTRabs ;
   private boolean n12366ArtKgMn ;
   private boolean n4446ArtAcaMar ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z3072ArtObsLon ;
   private String A3072ArtObsLon ;
   private String Z14100Artdsc2 ;
   private String A14100Artdsc2 ;
   private String Z12886ArtObsOtra ;
   private String A12886ArtObsOtra ;
   private String Z13751ArtCDsc ;
   private String A13751ArtCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV201WebSession ;
   private app.SdtTARTICU bcTARTICU ;
   private IDataStoreProvider pr_default ;
   private String[] BC000812_A3072ArtObsLon ;
   private boolean[] BC000812_n3072ArtObsLon ;
   private String[] BC000812_A4447ArtAcaBak ;
   private boolean[] BC000812_n4447ArtAcaBak ;
   private java.math.BigDecimal[] BC000812_A12695ArtElgAnc ;
   private boolean[] BC000812_n12695ArtElgAnc ;
   private java.math.BigDecimal[] BC000812_A12696ArtElgLar ;
   private boolean[] BC000812_n12696ArtElgLar ;
   private java.math.BigDecimal[] BC000812_A12697ArtRdoCru ;
   private boolean[] BC000812_n12697ArtRdoCru ;
   private java.math.BigDecimal[] BC000812_A12698ArtEncLarg ;
   private boolean[] BC000812_n12698ArtEncLarg ;
   private java.math.BigDecimal[] BC000812_A12699ArtEncAnc ;
   private boolean[] BC000812_n12699ArtEncAnc ;
   private java.math.BigDecimal[] BC000812_A14099ArtRdto4 ;
   private boolean[] BC000812_n14099ArtRdto4 ;
   private String[] BC000812_A14100Artdsc2 ;
   private boolean[] BC000812_n14100Artdsc2 ;
   private java.math.BigDecimal[] BC000812_A14101ArtgrComp ;
   private boolean[] BC000812_n14101ArtgrComp ;
   private java.math.BigDecimal[] BC000812_A14102ArtKgspp ;
   private boolean[] BC000812_n14102ArtKgspp ;
   private java.math.BigDecimal[] BC000812_A14103ArtPrepp ;
   private boolean[] BC000812_n14103ArtPrepp ;
   private String[] BC000812_A90ArtObsFac ;
   private boolean[] BC000812_n90ArtObsFac ;
   private String[] BC000812_A12886ArtObsOtra ;
   private boolean[] BC000812_n12886ArtObsOtra ;
   private String[] BC000812_A14295ArtActivo ;
   private String[] BC000812_A396EmprCod ;
   private int[] BC000812_A252CliCod ;
   private boolean[] BC000812_n252CliCod ;
   private short[] BC000812_A829TipArtCod ;
   private short[] BC000812_A10030ArtTh ;
   private boolean[] BC000812_n10030ArtTh ;
   private short[] BC000812_A4295ClasCod ;
   private boolean[] BC000812_n4295ClasCod ;
   private short[] BC000812_A6108ClaBolCod ;
   private boolean[] BC000812_n6108ClaBolCod ;
   private short[] BC000812_A6106ClaTubCod ;
   private boolean[] BC000812_n6106ClaTubCod ;
   private short[] BC000812_A10379Art_Cd ;
   private boolean[] BC000812_n10379Art_Cd ;
   private String[] BC000812_A65ArtCod ;
   private boolean[] BC000812_n65ArtCod ;
   private String[] BC000812_A66ArtCorOri ;
   private boolean[] BC000812_n66ArtCorOri ;
   private String[] BC000812_A70ArtEncOri ;
   private boolean[] BC000812_n70ArtEncOri ;
   private String[] BC000812_A4353ArtUsrCod ;
   private boolean[] BC000812_n4353ArtUsrCod ;
   private String[] BC000812_A69ArtDsc ;
   private boolean[] BC000812_n69ArtDsc ;
   private String[] BC000812_A279CliNom ;
   private String[] BC000812_A5335ArtCodExt ;
   private boolean[] BC000812_n5335ArtCodExt ;
   private String[] BC000812_A407EmprNom ;
   private boolean[] BC000812_n407EmprNom ;
   private String[] BC000812_A87ArtMat ;
   private boolean[] BC000812_n87ArtMat ;
   private String[] BC000812_A830TipArtDsc ;
   private boolean[] BC000812_n830TipArtDsc ;
   private short[] BC000812_A1148ArtPml ;
   private boolean[] BC000812_n1148ArtPml ;
   private short[] BC000812_A78ArtGraCru ;
   private boolean[] BC000812_n78ArtGraCru ;
   private short[] BC000812_A68ArtCruMin ;
   private boolean[] BC000812_n68ArtCruMin ;
   private short[] BC000812_A67ArtCruMax ;
   private boolean[] BC000812_n67ArtCruMax ;
   private short[] BC000812_A63ArtAcaMin ;
   private boolean[] BC000812_n63ArtAcaMin ;
   private short[] BC000812_A62ArtAcaMax ;
   private boolean[] BC000812_n62ArtAcaMax ;
   private java.math.BigDecimal[] BC000812_A95ArtRen ;
   private boolean[] BC000812_n95ArtRen ;
   private String[] BC000812_A101ArtTipPle ;
   private boolean[] BC000812_n101ArtTipPle ;
   private String[] BC000812_A100ArtTipLar ;
   private boolean[] BC000812_n100ArtTipLar ;
   private String[] BC000812_A96ArtSua ;
   private boolean[] BC000812_n96ArtSua ;
   private String[] BC000812_A64ArtAcaQui ;
   private boolean[] BC000812_n64ArtAcaQui ;
   private String[] BC000812_A73ArtEti ;
   private boolean[] BC000812_n73ArtEti ;
   private String[] BC000812_A272CliEti ;
   private byte[] BC000812_A306CliUrg ;
   private byte[] BC000812_A117ArtUrg ;
   private boolean[] BC000812_n117ArtUrg ;
   private java.math.BigDecimal[] BC000812_A88ArtMer ;
   private boolean[] BC000812_n88ArtMer ;
   private String[] BC000812_A105ArtTra1 ;
   private boolean[] BC000812_n105ArtTra1 ;
   private String[] BC000812_A106ArtTra2 ;
   private boolean[] BC000812_n106ArtTra2 ;
   private String[] BC000812_A107ArtTra3 ;
   private boolean[] BC000812_n107ArtTra3 ;
   private short[] BC000812_A108ArtTraP1 ;
   private boolean[] BC000812_n108ArtTraP1 ;
   private short[] BC000812_A109ArtTraP2 ;
   private boolean[] BC000812_n109ArtTraP2 ;
   private short[] BC000812_A110ArtTraP3 ;
   private boolean[] BC000812_n110ArtTraP3 ;
   private String[] BC000812_A111ArtUrd1 ;
   private boolean[] BC000812_n111ArtUrd1 ;
   private String[] BC000812_A112ArtUrd2 ;
   private boolean[] BC000812_n112ArtUrd2 ;
   private String[] BC000812_A113ArtUrd3 ;
   private boolean[] BC000812_n113ArtUrd3 ;
   private short[] BC000812_A114ArtUrdP1 ;
   private boolean[] BC000812_n114ArtUrdP1 ;
   private short[] BC000812_A115ArtUrdP2 ;
   private boolean[] BC000812_n115ArtUrdP2 ;
   private short[] BC000812_A116ArtUrdP3 ;
   private boolean[] BC000812_n116ArtUrdP3 ;
   private short[] BC000812_A1229ArtEncCom ;
   private boolean[] BC000812_n1229ArtEncCom ;
   private short[] BC000812_A1230ArtEncAnh ;
   private boolean[] BC000812_n1230ArtEncAnh ;
   private short[] BC000812_A1903ArtGraAca ;
   private boolean[] BC000812_n1903ArtGraAca ;
   private java.math.BigDecimal[] BC000812_A1905ArtRdoA ;
   private boolean[] BC000812_n1905ArtRdoA ;
   private java.math.BigDecimal[] BC000812_A1904ArtRdoN ;
   private boolean[] BC000812_n1904ArtRdoN ;
   private java.math.BigDecimal[] BC000812_A2791ArtFacAbs ;
   private boolean[] BC000812_n2791ArtFacAbs ;
   private String[] BC000812_A2834ArtPle2 ;
   private boolean[] BC000812_n2834ArtPle2 ;
   private short[] BC000812_A3121ArtNumCor ;
   private boolean[] BC000812_n3121ArtNumCor ;
   private short[] BC000812_A3122ArtAncSal1 ;
   private boolean[] BC000812_n3122ArtAncSal1 ;
   private short[] BC000812_A3123ArtAncSal2 ;
   private boolean[] BC000812_n3123ArtAncSal2 ;
   private short[] BC000812_A3124ArtAncSal3 ;
   private boolean[] BC000812_n3124ArtAncSal3 ;
   private short[] BC000812_A3125ArtGraAca2 ;
   private boolean[] BC000812_n3125ArtGraAca2 ;
   private short[] BC000812_A3126ArtGraCru2 ;
   private boolean[] BC000812_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC000812_A4297ArtPmPPza ;
   private boolean[] BC000812_n4297ArtPmPPza ;
   private java.util.Date[] BC000812_A3683ArtFecCre ;
   private boolean[] BC000812_n3683ArtFecCre ;
   private java.util.Date[] BC000812_A4354ArtFecMod ;
   private boolean[] BC000812_n4354ArtFecMod ;
   private String[] BC000812_A4296ClasDsc ;
   private boolean[] BC000812_n4296ClasDsc ;
   private String[] BC000812_A5741ArtComer ;
   private boolean[] BC000812_n5741ArtComer ;
   private String[] BC000812_A6107ClaTubDsc ;
   private boolean[] BC000812_n6107ClaTubDsc ;
   private String[] BC000812_A6109ClaBolDsc ;
   private boolean[] BC000812_n6109ClaBolDsc ;
   private java.math.BigDecimal[] BC000812_A6435ArtRdoCru1 ;
   private boolean[] BC000812_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC000812_A6436ArtRdoCru2 ;
   private boolean[] BC000812_n6436ArtRdoCru2 ;
   private String[] BC000812_A967ArtNMtr ;
   private boolean[] BC000812_n967ArtNMtr ;
   private java.math.BigDecimal[] BC000812_A6462ArtLu ;
   private boolean[] BC000812_n6462ArtLu ;
   private short[] BC000812_A4607ArtRb ;
   private boolean[] BC000812_n4607ArtRb ;
   private short[] BC000812_A4444ArtPelAnh ;
   private boolean[] BC000812_n4444ArtPelAnh ;
   private short[] BC000812_A7412Artgrm2Sc ;
   private boolean[] BC000812_n7412Artgrm2Sc ;
   private short[] BC000812_A7413ArtPmlSc ;
   private boolean[] BC000812_n7413ArtPmlSc ;
   private short[] BC000812_A7414ArtAncSc ;
   private boolean[] BC000812_n7414ArtAncSc ;
   private short[] BC000812_A7415ArtPmlCru ;
   private boolean[] BC000812_n7415ArtPmlCru ;
   private java.math.BigDecimal[] BC000812_A7777ArtRdtSc ;
   private boolean[] BC000812_n7777ArtRdtSc ;
   private String[] BC000812_A7778ArtUnd ;
   private boolean[] BC000812_n7778ArtUnd ;
   private String[] BC000812_A7779ArtBlo ;
   private boolean[] BC000812_n7779ArtBlo ;
   private byte[] BC000812_A7948ArtCla ;
   private boolean[] BC000812_n7948ArtCla ;
   private String[] BC000812_A6014TipArtDsc2 ;
   private boolean[] BC000812_n6014TipArtDsc2 ;
   private java.math.BigDecimal[] BC000812_A9730ArtFabsH ;
   private boolean[] BC000812_n9730ArtFabsH ;
   private java.math.BigDecimal[] BC000812_A9801ArtFabsT ;
   private boolean[] BC000812_n9801ArtFabsT ;
   private byte[] BC000812_A9875ArtNProg ;
   private boolean[] BC000812_n9875ArtNProg ;
   private short[] BC000812_A9902ArtVbd ;
   private boolean[] BC000812_n9902ArtVbd ;
   private short[] BC000812_A9903ArtVbn ;
   private boolean[] BC000812_n9903ArtVbn ;
   private short[] BC000812_A9904ArtAb ;
   private boolean[] BC000812_n9904ArtAb ;
   private String[] BC000812_A397ArtObsGrm ;
   private boolean[] BC000812_n397ArtObsGrm ;
   private String[] BC000812_A398ArtObsAnc ;
   private boolean[] BC000812_n398ArtObsAnc ;
   private String[] BC000812_A4980ArtCdb ;
   private boolean[] BC000812_n4980ArtCdb ;
   private String[] BC000812_A10027ArtGalga ;
   private boolean[] BC000812_n10027ArtGalga ;
   private String[] BC000812_A10028ArtPlatina ;
   private boolean[] BC000812_n10028ArtPlatina ;
   private String[] BC000812_A10029ArtPgd ;
   private boolean[] BC000812_n10029ArtPgd ;
   private String[] BC000812_A10031ArtThN ;
   private boolean[] BC000812_n10031ArtThN ;
   private String[] BC000812_A10380Art_Dc ;
   private boolean[] BC000812_n10380Art_Dc ;
   private short[] BC000812_A10804ArtHilos ;
   private boolean[] BC000812_n10804ArtHilos ;
   private short[] BC000812_A10805ArtPasad ;
   private boolean[] BC000812_n10805ArtPasad ;
   private short[] BC000812_A10831ArtAncC ;
   private boolean[] BC000812_n10831ArtAncC ;
   private short[] BC000812_A10832ArtGrm2C ;
   private boolean[] BC000812_n10832ArtGrm2C ;
   private java.math.BigDecimal[] BC000812_A10833ArtRdoC ;
   private boolean[] BC000812_n10833ArtRdoC ;
   private int[] BC000812_A4455ArtAcaFor ;
   private boolean[] BC000812_n4455ArtAcaFor ;
   private String[] BC000812_A3682ArtAnu ;
   private boolean[] BC000812_n3682ArtAnu ;
   private java.math.BigDecimal[] BC000812_A11627ArtFacUti ;
   private boolean[] BC000812_n11627ArtFacUti ;
   private int[] BC000812_A1581ArtNumTip ;
   private boolean[] BC000812_n1581ArtNumTip ;
   private byte[] BC000812_A12364ArtMT ;
   private boolean[] BC000812_n12364ArtMT ;
   private byte[] BC000812_A12365ArtTRabs ;
   private boolean[] BC000812_n12365ArtTRabs ;
   private java.math.BigDecimal[] BC000812_A12366ArtKgMn ;
   private boolean[] BC000812_n12366ArtKgMn ;
   private String[] BC000812_A4446ArtAcaMar ;
   private boolean[] BC000812_n4446ArtAcaMar ;
   private String[] BC000813_A407EmprNom ;
   private boolean[] BC000813_n407EmprNom ;
   private String[] BC000814_A830TipArtDsc ;
   private boolean[] BC000814_n830TipArtDsc ;
   private String[] BC000814_A6014TipArtDsc2 ;
   private boolean[] BC000814_n6014TipArtDsc2 ;
   private String[] BC000815_A10031ArtThN ;
   private boolean[] BC000815_n10031ArtThN ;
   private String[] BC000816_A4296ClasDsc ;
   private boolean[] BC000816_n4296ClasDsc ;
   private String[] BC000817_A6109ClaBolDsc ;
   private boolean[] BC000817_n6109ClaBolDsc ;
   private String[] BC000818_A6107ClaTubDsc ;
   private boolean[] BC000818_n6107ClaTubDsc ;
   private String[] BC000819_A10380Art_Dc ;
   private boolean[] BC000819_n10380Art_Dc ;
   private String[] BC000820_A279CliNom ;
   private String[] BC000820_A272CliEti ;
   private byte[] BC000820_A306CliUrg ;
   private String[] BC000821_A396EmprCod ;
   private int[] BC000821_A252CliCod ;
   private boolean[] BC000821_n252CliCod ;
   private String[] BC000821_A65ArtCod ;
   private boolean[] BC000821_n65ArtCod ;
   private String[] BC000822_A3072ArtObsLon ;
   private boolean[] BC000822_n3072ArtObsLon ;
   private String[] BC000822_A4447ArtAcaBak ;
   private boolean[] BC000822_n4447ArtAcaBak ;
   private java.math.BigDecimal[] BC000822_A12695ArtElgAnc ;
   private boolean[] BC000822_n12695ArtElgAnc ;
   private java.math.BigDecimal[] BC000822_A12696ArtElgLar ;
   private boolean[] BC000822_n12696ArtElgLar ;
   private java.math.BigDecimal[] BC000822_A12697ArtRdoCru ;
   private boolean[] BC000822_n12697ArtRdoCru ;
   private java.math.BigDecimal[] BC000822_A12698ArtEncLarg ;
   private boolean[] BC000822_n12698ArtEncLarg ;
   private java.math.BigDecimal[] BC000822_A12699ArtEncAnc ;
   private boolean[] BC000822_n12699ArtEncAnc ;
   private java.math.BigDecimal[] BC000822_A14099ArtRdto4 ;
   private boolean[] BC000822_n14099ArtRdto4 ;
   private String[] BC000822_A14100Artdsc2 ;
   private boolean[] BC000822_n14100Artdsc2 ;
   private java.math.BigDecimal[] BC000822_A14101ArtgrComp ;
   private boolean[] BC000822_n14101ArtgrComp ;
   private java.math.BigDecimal[] BC000822_A14102ArtKgspp ;
   private boolean[] BC000822_n14102ArtKgspp ;
   private java.math.BigDecimal[] BC000822_A14103ArtPrepp ;
   private boolean[] BC000822_n14103ArtPrepp ;
   private String[] BC000822_A90ArtObsFac ;
   private boolean[] BC000822_n90ArtObsFac ;
   private String[] BC000822_A12886ArtObsOtra ;
   private boolean[] BC000822_n12886ArtObsOtra ;
   private String[] BC000822_A14295ArtActivo ;
   private String[] BC000822_A396EmprCod ;
   private int[] BC000822_A252CliCod ;
   private boolean[] BC000822_n252CliCod ;
   private short[] BC000822_A829TipArtCod ;
   private short[] BC000822_A10030ArtTh ;
   private boolean[] BC000822_n10030ArtTh ;
   private short[] BC000822_A4295ClasCod ;
   private boolean[] BC000822_n4295ClasCod ;
   private short[] BC000822_A6108ClaBolCod ;
   private boolean[] BC000822_n6108ClaBolCod ;
   private short[] BC000822_A6106ClaTubCod ;
   private boolean[] BC000822_n6106ClaTubCod ;
   private short[] BC000822_A10379Art_Cd ;
   private boolean[] BC000822_n10379Art_Cd ;
   private String[] BC000822_A65ArtCod ;
   private boolean[] BC000822_n65ArtCod ;
   private String[] BC000822_A66ArtCorOri ;
   private boolean[] BC000822_n66ArtCorOri ;
   private String[] BC000822_A70ArtEncOri ;
   private boolean[] BC000822_n70ArtEncOri ;
   private String[] BC000822_A4353ArtUsrCod ;
   private boolean[] BC000822_n4353ArtUsrCod ;
   private String[] BC000822_A69ArtDsc ;
   private boolean[] BC000822_n69ArtDsc ;
   private String[] BC000822_A5335ArtCodExt ;
   private boolean[] BC000822_n5335ArtCodExt ;
   private String[] BC000822_A87ArtMat ;
   private boolean[] BC000822_n87ArtMat ;
   private short[] BC000822_A1148ArtPml ;
   private boolean[] BC000822_n1148ArtPml ;
   private short[] BC000822_A78ArtGraCru ;
   private boolean[] BC000822_n78ArtGraCru ;
   private short[] BC000822_A68ArtCruMin ;
   private boolean[] BC000822_n68ArtCruMin ;
   private short[] BC000822_A67ArtCruMax ;
   private boolean[] BC000822_n67ArtCruMax ;
   private short[] BC000822_A63ArtAcaMin ;
   private boolean[] BC000822_n63ArtAcaMin ;
   private short[] BC000822_A62ArtAcaMax ;
   private boolean[] BC000822_n62ArtAcaMax ;
   private java.math.BigDecimal[] BC000822_A95ArtRen ;
   private boolean[] BC000822_n95ArtRen ;
   private String[] BC000822_A101ArtTipPle ;
   private boolean[] BC000822_n101ArtTipPle ;
   private String[] BC000822_A100ArtTipLar ;
   private boolean[] BC000822_n100ArtTipLar ;
   private String[] BC000822_A96ArtSua ;
   private boolean[] BC000822_n96ArtSua ;
   private String[] BC000822_A64ArtAcaQui ;
   private boolean[] BC000822_n64ArtAcaQui ;
   private String[] BC000822_A73ArtEti ;
   private boolean[] BC000822_n73ArtEti ;
   private byte[] BC000822_A117ArtUrg ;
   private boolean[] BC000822_n117ArtUrg ;
   private java.math.BigDecimal[] BC000822_A88ArtMer ;
   private boolean[] BC000822_n88ArtMer ;
   private String[] BC000822_A105ArtTra1 ;
   private boolean[] BC000822_n105ArtTra1 ;
   private String[] BC000822_A106ArtTra2 ;
   private boolean[] BC000822_n106ArtTra2 ;
   private String[] BC000822_A107ArtTra3 ;
   private boolean[] BC000822_n107ArtTra3 ;
   private short[] BC000822_A108ArtTraP1 ;
   private boolean[] BC000822_n108ArtTraP1 ;
   private short[] BC000822_A109ArtTraP2 ;
   private boolean[] BC000822_n109ArtTraP2 ;
   private short[] BC000822_A110ArtTraP3 ;
   private boolean[] BC000822_n110ArtTraP3 ;
   private String[] BC000822_A111ArtUrd1 ;
   private boolean[] BC000822_n111ArtUrd1 ;
   private String[] BC000822_A112ArtUrd2 ;
   private boolean[] BC000822_n112ArtUrd2 ;
   private String[] BC000822_A113ArtUrd3 ;
   private boolean[] BC000822_n113ArtUrd3 ;
   private short[] BC000822_A114ArtUrdP1 ;
   private boolean[] BC000822_n114ArtUrdP1 ;
   private short[] BC000822_A115ArtUrdP2 ;
   private boolean[] BC000822_n115ArtUrdP2 ;
   private short[] BC000822_A116ArtUrdP3 ;
   private boolean[] BC000822_n116ArtUrdP3 ;
   private short[] BC000822_A1229ArtEncCom ;
   private boolean[] BC000822_n1229ArtEncCom ;
   private short[] BC000822_A1230ArtEncAnh ;
   private boolean[] BC000822_n1230ArtEncAnh ;
   private short[] BC000822_A1903ArtGraAca ;
   private boolean[] BC000822_n1903ArtGraAca ;
   private java.math.BigDecimal[] BC000822_A1905ArtRdoA ;
   private boolean[] BC000822_n1905ArtRdoA ;
   private java.math.BigDecimal[] BC000822_A1904ArtRdoN ;
   private boolean[] BC000822_n1904ArtRdoN ;
   private java.math.BigDecimal[] BC000822_A2791ArtFacAbs ;
   private boolean[] BC000822_n2791ArtFacAbs ;
   private String[] BC000822_A2834ArtPle2 ;
   private boolean[] BC000822_n2834ArtPle2 ;
   private short[] BC000822_A3121ArtNumCor ;
   private boolean[] BC000822_n3121ArtNumCor ;
   private short[] BC000822_A3122ArtAncSal1 ;
   private boolean[] BC000822_n3122ArtAncSal1 ;
   private short[] BC000822_A3123ArtAncSal2 ;
   private boolean[] BC000822_n3123ArtAncSal2 ;
   private short[] BC000822_A3124ArtAncSal3 ;
   private boolean[] BC000822_n3124ArtAncSal3 ;
   private short[] BC000822_A3125ArtGraAca2 ;
   private boolean[] BC000822_n3125ArtGraAca2 ;
   private short[] BC000822_A3126ArtGraCru2 ;
   private boolean[] BC000822_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC000822_A4297ArtPmPPza ;
   private boolean[] BC000822_n4297ArtPmPPza ;
   private java.util.Date[] BC000822_A3683ArtFecCre ;
   private boolean[] BC000822_n3683ArtFecCre ;
   private java.util.Date[] BC000822_A4354ArtFecMod ;
   private boolean[] BC000822_n4354ArtFecMod ;
   private String[] BC000822_A5741ArtComer ;
   private boolean[] BC000822_n5741ArtComer ;
   private java.math.BigDecimal[] BC000822_A6435ArtRdoCru1 ;
   private boolean[] BC000822_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC000822_A6436ArtRdoCru2 ;
   private boolean[] BC000822_n6436ArtRdoCru2 ;
   private String[] BC000822_A967ArtNMtr ;
   private boolean[] BC000822_n967ArtNMtr ;
   private java.math.BigDecimal[] BC000822_A6462ArtLu ;
   private boolean[] BC000822_n6462ArtLu ;
   private short[] BC000822_A4607ArtRb ;
   private boolean[] BC000822_n4607ArtRb ;
   private short[] BC000822_A4444ArtPelAnh ;
   private boolean[] BC000822_n4444ArtPelAnh ;
   private short[] BC000822_A7412Artgrm2Sc ;
   private boolean[] BC000822_n7412Artgrm2Sc ;
   private short[] BC000822_A7413ArtPmlSc ;
   private boolean[] BC000822_n7413ArtPmlSc ;
   private short[] BC000822_A7414ArtAncSc ;
   private boolean[] BC000822_n7414ArtAncSc ;
   private short[] BC000822_A7415ArtPmlCru ;
   private boolean[] BC000822_n7415ArtPmlCru ;
   private java.math.BigDecimal[] BC000822_A7777ArtRdtSc ;
   private boolean[] BC000822_n7777ArtRdtSc ;
   private String[] BC000822_A7778ArtUnd ;
   private boolean[] BC000822_n7778ArtUnd ;
   private String[] BC000822_A7779ArtBlo ;
   private boolean[] BC000822_n7779ArtBlo ;
   private byte[] BC000822_A7948ArtCla ;
   private boolean[] BC000822_n7948ArtCla ;
   private java.math.BigDecimal[] BC000822_A9730ArtFabsH ;
   private boolean[] BC000822_n9730ArtFabsH ;
   private java.math.BigDecimal[] BC000822_A9801ArtFabsT ;
   private boolean[] BC000822_n9801ArtFabsT ;
   private byte[] BC000822_A9875ArtNProg ;
   private boolean[] BC000822_n9875ArtNProg ;
   private short[] BC000822_A9902ArtVbd ;
   private boolean[] BC000822_n9902ArtVbd ;
   private short[] BC000822_A9903ArtVbn ;
   private boolean[] BC000822_n9903ArtVbn ;
   private short[] BC000822_A9904ArtAb ;
   private boolean[] BC000822_n9904ArtAb ;
   private String[] BC000822_A397ArtObsGrm ;
   private boolean[] BC000822_n397ArtObsGrm ;
   private String[] BC000822_A398ArtObsAnc ;
   private boolean[] BC000822_n398ArtObsAnc ;
   private String[] BC000822_A4980ArtCdb ;
   private boolean[] BC000822_n4980ArtCdb ;
   private String[] BC000822_A10027ArtGalga ;
   private boolean[] BC000822_n10027ArtGalga ;
   private String[] BC000822_A10028ArtPlatina ;
   private boolean[] BC000822_n10028ArtPlatina ;
   private String[] BC000822_A10029ArtPgd ;
   private boolean[] BC000822_n10029ArtPgd ;
   private short[] BC000822_A10804ArtHilos ;
   private boolean[] BC000822_n10804ArtHilos ;
   private short[] BC000822_A10805ArtPasad ;
   private boolean[] BC000822_n10805ArtPasad ;
   private short[] BC000822_A10831ArtAncC ;
   private boolean[] BC000822_n10831ArtAncC ;
   private short[] BC000822_A10832ArtGrm2C ;
   private boolean[] BC000822_n10832ArtGrm2C ;
   private java.math.BigDecimal[] BC000822_A10833ArtRdoC ;
   private boolean[] BC000822_n10833ArtRdoC ;
   private int[] BC000822_A4455ArtAcaFor ;
   private boolean[] BC000822_n4455ArtAcaFor ;
   private String[] BC000822_A3682ArtAnu ;
   private boolean[] BC000822_n3682ArtAnu ;
   private java.math.BigDecimal[] BC000822_A11627ArtFacUti ;
   private boolean[] BC000822_n11627ArtFacUti ;
   private int[] BC000822_A1581ArtNumTip ;
   private boolean[] BC000822_n1581ArtNumTip ;
   private byte[] BC000822_A12364ArtMT ;
   private boolean[] BC000822_n12364ArtMT ;
   private byte[] BC000822_A12365ArtTRabs ;
   private boolean[] BC000822_n12365ArtTRabs ;
   private java.math.BigDecimal[] BC000822_A12366ArtKgMn ;
   private boolean[] BC000822_n12366ArtKgMn ;
   private String[] BC000822_A4446ArtAcaMar ;
   private boolean[] BC000822_n4446ArtAcaMar ;
   private String[] BC000823_A3072ArtObsLon ;
   private boolean[] BC000823_n3072ArtObsLon ;
   private String[] BC000823_A4447ArtAcaBak ;
   private boolean[] BC000823_n4447ArtAcaBak ;
   private java.math.BigDecimal[] BC000823_A12695ArtElgAnc ;
   private boolean[] BC000823_n12695ArtElgAnc ;
   private java.math.BigDecimal[] BC000823_A12696ArtElgLar ;
   private boolean[] BC000823_n12696ArtElgLar ;
   private java.math.BigDecimal[] BC000823_A12697ArtRdoCru ;
   private boolean[] BC000823_n12697ArtRdoCru ;
   private java.math.BigDecimal[] BC000823_A12698ArtEncLarg ;
   private boolean[] BC000823_n12698ArtEncLarg ;
   private java.math.BigDecimal[] BC000823_A12699ArtEncAnc ;
   private boolean[] BC000823_n12699ArtEncAnc ;
   private java.math.BigDecimal[] BC000823_A14099ArtRdto4 ;
   private boolean[] BC000823_n14099ArtRdto4 ;
   private String[] BC000823_A14100Artdsc2 ;
   private boolean[] BC000823_n14100Artdsc2 ;
   private java.math.BigDecimal[] BC000823_A14101ArtgrComp ;
   private boolean[] BC000823_n14101ArtgrComp ;
   private java.math.BigDecimal[] BC000823_A14102ArtKgspp ;
   private boolean[] BC000823_n14102ArtKgspp ;
   private java.math.BigDecimal[] BC000823_A14103ArtPrepp ;
   private boolean[] BC000823_n14103ArtPrepp ;
   private String[] BC000823_A90ArtObsFac ;
   private boolean[] BC000823_n90ArtObsFac ;
   private String[] BC000823_A12886ArtObsOtra ;
   private boolean[] BC000823_n12886ArtObsOtra ;
   private String[] BC000823_A14295ArtActivo ;
   private String[] BC000823_A396EmprCod ;
   private int[] BC000823_A252CliCod ;
   private boolean[] BC000823_n252CliCod ;
   private short[] BC000823_A829TipArtCod ;
   private short[] BC000823_A10030ArtTh ;
   private boolean[] BC000823_n10030ArtTh ;
   private short[] BC000823_A4295ClasCod ;
   private boolean[] BC000823_n4295ClasCod ;
   private short[] BC000823_A6108ClaBolCod ;
   private boolean[] BC000823_n6108ClaBolCod ;
   private short[] BC000823_A6106ClaTubCod ;
   private boolean[] BC000823_n6106ClaTubCod ;
   private short[] BC000823_A10379Art_Cd ;
   private boolean[] BC000823_n10379Art_Cd ;
   private String[] BC000823_A65ArtCod ;
   private boolean[] BC000823_n65ArtCod ;
   private String[] BC000823_A66ArtCorOri ;
   private boolean[] BC000823_n66ArtCorOri ;
   private String[] BC000823_A70ArtEncOri ;
   private boolean[] BC000823_n70ArtEncOri ;
   private String[] BC000823_A4353ArtUsrCod ;
   private boolean[] BC000823_n4353ArtUsrCod ;
   private String[] BC000823_A69ArtDsc ;
   private boolean[] BC000823_n69ArtDsc ;
   private String[] BC000823_A5335ArtCodExt ;
   private boolean[] BC000823_n5335ArtCodExt ;
   private String[] BC000823_A87ArtMat ;
   private boolean[] BC000823_n87ArtMat ;
   private short[] BC000823_A1148ArtPml ;
   private boolean[] BC000823_n1148ArtPml ;
   private short[] BC000823_A78ArtGraCru ;
   private boolean[] BC000823_n78ArtGraCru ;
   private short[] BC000823_A68ArtCruMin ;
   private boolean[] BC000823_n68ArtCruMin ;
   private short[] BC000823_A67ArtCruMax ;
   private boolean[] BC000823_n67ArtCruMax ;
   private short[] BC000823_A63ArtAcaMin ;
   private boolean[] BC000823_n63ArtAcaMin ;
   private short[] BC000823_A62ArtAcaMax ;
   private boolean[] BC000823_n62ArtAcaMax ;
   private java.math.BigDecimal[] BC000823_A95ArtRen ;
   private boolean[] BC000823_n95ArtRen ;
   private String[] BC000823_A101ArtTipPle ;
   private boolean[] BC000823_n101ArtTipPle ;
   private String[] BC000823_A100ArtTipLar ;
   private boolean[] BC000823_n100ArtTipLar ;
   private String[] BC000823_A96ArtSua ;
   private boolean[] BC000823_n96ArtSua ;
   private String[] BC000823_A64ArtAcaQui ;
   private boolean[] BC000823_n64ArtAcaQui ;
   private String[] BC000823_A73ArtEti ;
   private boolean[] BC000823_n73ArtEti ;
   private byte[] BC000823_A117ArtUrg ;
   private boolean[] BC000823_n117ArtUrg ;
   private java.math.BigDecimal[] BC000823_A88ArtMer ;
   private boolean[] BC000823_n88ArtMer ;
   private String[] BC000823_A105ArtTra1 ;
   private boolean[] BC000823_n105ArtTra1 ;
   private String[] BC000823_A106ArtTra2 ;
   private boolean[] BC000823_n106ArtTra2 ;
   private String[] BC000823_A107ArtTra3 ;
   private boolean[] BC000823_n107ArtTra3 ;
   private short[] BC000823_A108ArtTraP1 ;
   private boolean[] BC000823_n108ArtTraP1 ;
   private short[] BC000823_A109ArtTraP2 ;
   private boolean[] BC000823_n109ArtTraP2 ;
   private short[] BC000823_A110ArtTraP3 ;
   private boolean[] BC000823_n110ArtTraP3 ;
   private String[] BC000823_A111ArtUrd1 ;
   private boolean[] BC000823_n111ArtUrd1 ;
   private String[] BC000823_A112ArtUrd2 ;
   private boolean[] BC000823_n112ArtUrd2 ;
   private String[] BC000823_A113ArtUrd3 ;
   private boolean[] BC000823_n113ArtUrd3 ;
   private short[] BC000823_A114ArtUrdP1 ;
   private boolean[] BC000823_n114ArtUrdP1 ;
   private short[] BC000823_A115ArtUrdP2 ;
   private boolean[] BC000823_n115ArtUrdP2 ;
   private short[] BC000823_A116ArtUrdP3 ;
   private boolean[] BC000823_n116ArtUrdP3 ;
   private short[] BC000823_A1229ArtEncCom ;
   private boolean[] BC000823_n1229ArtEncCom ;
   private short[] BC000823_A1230ArtEncAnh ;
   private boolean[] BC000823_n1230ArtEncAnh ;
   private short[] BC000823_A1903ArtGraAca ;
   private boolean[] BC000823_n1903ArtGraAca ;
   private java.math.BigDecimal[] BC000823_A1905ArtRdoA ;
   private boolean[] BC000823_n1905ArtRdoA ;
   private java.math.BigDecimal[] BC000823_A1904ArtRdoN ;
   private boolean[] BC000823_n1904ArtRdoN ;
   private java.math.BigDecimal[] BC000823_A2791ArtFacAbs ;
   private boolean[] BC000823_n2791ArtFacAbs ;
   private String[] BC000823_A2834ArtPle2 ;
   private boolean[] BC000823_n2834ArtPle2 ;
   private short[] BC000823_A3121ArtNumCor ;
   private boolean[] BC000823_n3121ArtNumCor ;
   private short[] BC000823_A3122ArtAncSal1 ;
   private boolean[] BC000823_n3122ArtAncSal1 ;
   private short[] BC000823_A3123ArtAncSal2 ;
   private boolean[] BC000823_n3123ArtAncSal2 ;
   private short[] BC000823_A3124ArtAncSal3 ;
   private boolean[] BC000823_n3124ArtAncSal3 ;
   private short[] BC000823_A3125ArtGraAca2 ;
   private boolean[] BC000823_n3125ArtGraAca2 ;
   private short[] BC000823_A3126ArtGraCru2 ;
   private boolean[] BC000823_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC000823_A4297ArtPmPPza ;
   private boolean[] BC000823_n4297ArtPmPPza ;
   private java.util.Date[] BC000823_A3683ArtFecCre ;
   private boolean[] BC000823_n3683ArtFecCre ;
   private java.util.Date[] BC000823_A4354ArtFecMod ;
   private boolean[] BC000823_n4354ArtFecMod ;
   private String[] BC000823_A5741ArtComer ;
   private boolean[] BC000823_n5741ArtComer ;
   private java.math.BigDecimal[] BC000823_A6435ArtRdoCru1 ;
   private boolean[] BC000823_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC000823_A6436ArtRdoCru2 ;
   private boolean[] BC000823_n6436ArtRdoCru2 ;
   private String[] BC000823_A967ArtNMtr ;
   private boolean[] BC000823_n967ArtNMtr ;
   private java.math.BigDecimal[] BC000823_A6462ArtLu ;
   private boolean[] BC000823_n6462ArtLu ;
   private short[] BC000823_A4607ArtRb ;
   private boolean[] BC000823_n4607ArtRb ;
   private short[] BC000823_A4444ArtPelAnh ;
   private boolean[] BC000823_n4444ArtPelAnh ;
   private short[] BC000823_A7412Artgrm2Sc ;
   private boolean[] BC000823_n7412Artgrm2Sc ;
   private short[] BC000823_A7413ArtPmlSc ;
   private boolean[] BC000823_n7413ArtPmlSc ;
   private short[] BC000823_A7414ArtAncSc ;
   private boolean[] BC000823_n7414ArtAncSc ;
   private short[] BC000823_A7415ArtPmlCru ;
   private boolean[] BC000823_n7415ArtPmlCru ;
   private java.math.BigDecimal[] BC000823_A7777ArtRdtSc ;
   private boolean[] BC000823_n7777ArtRdtSc ;
   private String[] BC000823_A7778ArtUnd ;
   private boolean[] BC000823_n7778ArtUnd ;
   private String[] BC000823_A7779ArtBlo ;
   private boolean[] BC000823_n7779ArtBlo ;
   private byte[] BC000823_A7948ArtCla ;
   private boolean[] BC000823_n7948ArtCla ;
   private java.math.BigDecimal[] BC000823_A9730ArtFabsH ;
   private boolean[] BC000823_n9730ArtFabsH ;
   private java.math.BigDecimal[] BC000823_A9801ArtFabsT ;
   private boolean[] BC000823_n9801ArtFabsT ;
   private byte[] BC000823_A9875ArtNProg ;
   private boolean[] BC000823_n9875ArtNProg ;
   private short[] BC000823_A9902ArtVbd ;
   private boolean[] BC000823_n9902ArtVbd ;
   private short[] BC000823_A9903ArtVbn ;
   private boolean[] BC000823_n9903ArtVbn ;
   private short[] BC000823_A9904ArtAb ;
   private boolean[] BC000823_n9904ArtAb ;
   private String[] BC000823_A397ArtObsGrm ;
   private boolean[] BC000823_n397ArtObsGrm ;
   private String[] BC000823_A398ArtObsAnc ;
   private boolean[] BC000823_n398ArtObsAnc ;
   private String[] BC000823_A4980ArtCdb ;
   private boolean[] BC000823_n4980ArtCdb ;
   private String[] BC000823_A10027ArtGalga ;
   private boolean[] BC000823_n10027ArtGalga ;
   private String[] BC000823_A10028ArtPlatina ;
   private boolean[] BC000823_n10028ArtPlatina ;
   private String[] BC000823_A10029ArtPgd ;
   private boolean[] BC000823_n10029ArtPgd ;
   private short[] BC000823_A10804ArtHilos ;
   private boolean[] BC000823_n10804ArtHilos ;
   private short[] BC000823_A10805ArtPasad ;
   private boolean[] BC000823_n10805ArtPasad ;
   private short[] BC000823_A10831ArtAncC ;
   private boolean[] BC000823_n10831ArtAncC ;
   private short[] BC000823_A10832ArtGrm2C ;
   private boolean[] BC000823_n10832ArtGrm2C ;
   private java.math.BigDecimal[] BC000823_A10833ArtRdoC ;
   private boolean[] BC000823_n10833ArtRdoC ;
   private int[] BC000823_A4455ArtAcaFor ;
   private boolean[] BC000823_n4455ArtAcaFor ;
   private String[] BC000823_A3682ArtAnu ;
   private boolean[] BC000823_n3682ArtAnu ;
   private java.math.BigDecimal[] BC000823_A11627ArtFacUti ;
   private boolean[] BC000823_n11627ArtFacUti ;
   private int[] BC000823_A1581ArtNumTip ;
   private boolean[] BC000823_n1581ArtNumTip ;
   private byte[] BC000823_A12364ArtMT ;
   private boolean[] BC000823_n12364ArtMT ;
   private byte[] BC000823_A12365ArtTRabs ;
   private boolean[] BC000823_n12365ArtTRabs ;
   private java.math.BigDecimal[] BC000823_A12366ArtKgMn ;
   private boolean[] BC000823_n12366ArtKgMn ;
   private String[] BC000823_A4446ArtAcaMar ;
   private boolean[] BC000823_n4446ArtAcaMar ;
   private String[] BC000827_A407EmprNom ;
   private boolean[] BC000827_n407EmprNom ;
   private String[] BC000828_A279CliNom ;
   private String[] BC000828_A272CliEti ;
   private byte[] BC000828_A306CliUrg ;
   private String[] BC000829_A830TipArtDsc ;
   private boolean[] BC000829_n830TipArtDsc ;
   private String[] BC000829_A6014TipArtDsc2 ;
   private boolean[] BC000829_n6014TipArtDsc2 ;
   private String[] BC000830_A4296ClasDsc ;
   private boolean[] BC000830_n4296ClasDsc ;
   private String[] BC000831_A6107ClaTubDsc ;
   private boolean[] BC000831_n6107ClaTubDsc ;
   private String[] BC000832_A6109ClaBolDsc ;
   private boolean[] BC000832_n6109ClaBolDsc ;
   private String[] BC000833_A10031ArtThN ;
   private boolean[] BC000833_n10031ArtThN ;
   private String[] BC000834_A10380Art_Dc ;
   private boolean[] BC000834_n10380Art_Dc ;
   private String[] BC000835_A396EmprCod ;
   private int[] BC000835_A252CliCod ;
   private boolean[] BC000835_n252CliCod ;
   private String[] BC000835_A65ArtCod ;
   private boolean[] BC000835_n65ArtCod ;
   private byte[] BC000835_A499GrpFamCod ;
   private String[] BC000836_A396EmprCod ;
   private int[] BC000836_A252CliCod ;
   private boolean[] BC000836_n252CliCod ;
   private String[] BC000836_A12814ARTConID ;
   private String[] BC000836_A65ArtCod ;
   private boolean[] BC000836_n65ArtCod ;
   private String[] BC000837_A396EmprCod ;
   private int[] BC000837_A252CliCod ;
   private boolean[] BC000837_n252CliCod ;
   private String[] BC000837_A65ArtCod ;
   private boolean[] BC000837_n65ArtCod ;
   private byte[] BC000837_A12363SocInt ;
   private String[] BC000838_A396EmprCod ;
   private java.util.Date[] BC000838_A4929Inc_Dia ;
   private short[] BC000838_A5728JBCLLin ;
   private String[] BC000839_A396EmprCod ;
   private int[] BC000839_A252CliCod ;
   private boolean[] BC000839_n252CliCod ;
   private String[] BC000839_A5809MMezCod ;
   private String[] BC000839_A65ArtCod ;
   private boolean[] BC000839_n65ArtCod ;
   private String[] BC000840_A396EmprCod ;
   private int[] BC000840_A252CliCod ;
   private boolean[] BC000840_n252CliCod ;
   private String[] BC000840_A5234MezCod ;
   private byte[] BC000840_A5240MezLin ;
   private String[] BC000841_A396EmprCod ;
   private int[] BC000841_A252CliCod ;
   private boolean[] BC000841_n252CliCod ;
   private String[] BC000841_A65ArtCod ;
   private boolean[] BC000841_n65ArtCod ;
   private int[] BC000841_A4116estreclim ;
   private String[] BC000842_A396EmprCod ;
   private int[] BC000842_A252CliCod ;
   private boolean[] BC000842_n252CliCod ;
   private String[] BC000842_A65ArtCod ;
   private boolean[] BC000842_n65ArtCod ;
   private String[] BC000842_A4061EstNomCol ;
   private String[] BC000843_A396EmprCod ;
   private String[] BC000843_A9705ErpNped ;
   private short[] BC000843_A8652ErpLin ;
   private String[] BC000844_A396EmprCod ;
   private int[] BC000844_A252CliCod ;
   private boolean[] BC000844_n252CliCod ;
   private String[] BC000844_A65ArtCod ;
   private boolean[] BC000844_n65ArtCod ;
   private String[] BC000844_A7266CAAqP ;
   private String[] BC000845_A396EmprCod ;
   private int[] BC000845_A252CliCod ;
   private boolean[] BC000845_n252CliCod ;
   private String[] BC000845_A65ArtCod ;
   private boolean[] BC000845_n65ArtCod ;
   private java.util.Date[] BC000845_A11084H_DiaA ;
   private String[] BC000846_A396EmprCod ;
   private int[] BC000846_A252CliCod ;
   private boolean[] BC000846_n252CliCod ;
   private String[] BC000846_A65ArtCod ;
   private boolean[] BC000846_n65ArtCod ;
   private byte[] BC000846_A10972Int_cod ;
   private String[] BC000847_A396EmprCod ;
   private int[] BC000847_A252CliCod ;
   private boolean[] BC000847_n252CliCod ;
   private String[] BC000847_A65ArtCod ;
   private boolean[] BC000847_n65ArtCod ;
   private String[] BC000847_A10577Pg_Procod ;
   private String[] BC000848_A396EmprCod ;
   private int[] BC000848_A252CliCod ;
   private boolean[] BC000848_n252CliCod ;
   private String[] BC000848_A65ArtCod ;
   private boolean[] BC000848_n65ArtCod ;
   private String[] BC000848_A10272Hz_cod ;
   private String[] BC000849_A396EmprCod ;
   private int[] BC000849_A252CliCod ;
   private boolean[] BC000849_n252CliCod ;
   private String[] BC000849_A65ArtCod ;
   private boolean[] BC000849_n65ArtCod ;
   private String[] BC000849_A10041ArtSH ;
   private String[] BC000850_A396EmprCod ;
   private int[] BC000850_A252CliCod ;
   private boolean[] BC000850_n252CliCod ;
   private String[] BC000850_A65ArtCod ;
   private boolean[] BC000850_n65ArtCod ;
   private String[] BC000850_A8427TipoCt ;
   private int[] BC000850_A8428CapMxMq ;
   private String[] BC000851_A396EmprCod ;
   private int[] BC000851_A252CliCod ;
   private boolean[] BC000851_n252CliCod ;
   private String[] BC000851_A65ArtCod ;
   private boolean[] BC000851_n65ArtCod ;
   private short[] BC000851_A8342CodPred ;
   private String[] BC000852_A396EmprCod ;
   private int[] BC000852_A252CliCod ;
   private boolean[] BC000852_n252CliCod ;
   private String[] BC000852_A65ArtCod ;
   private boolean[] BC000852_n65ArtCod ;
   private String[] BC000852_A8089ArtcodTj ;
   private String[] BC000853_A396EmprCod ;
   private int[] BC000853_A252CliCod ;
   private boolean[] BC000853_n252CliCod ;
   private String[] BC000853_A65ArtCod ;
   private boolean[] BC000853_n65ArtCod ;
   private String[] BC000853_A7956Mq_CodM ;
   private String[] BC000854_A396EmprCod ;
   private int[] BC000854_A252CliCod ;
   private boolean[] BC000854_n252CliCod ;
   private String[] BC000854_A65ArtCod ;
   private boolean[] BC000854_n65ArtCod ;
   private short[] BC000854_A7949Par_Art ;
   private String[] BC000855_A396EmprCod ;
   private int[] BC000855_A252CliCod ;
   private boolean[] BC000855_n252CliCod ;
   private String[] BC000855_A65ArtCod ;
   private boolean[] BC000855_n65ArtCod ;
   private short[] BC000855_A7135Lin_fast ;
   private String[] BC000856_A396EmprCod ;
   private int[] BC000856_A252CliCod ;
   private boolean[] BC000856_n252CliCod ;
   private String[] BC000856_A65ArtCod ;
   private boolean[] BC000856_n65ArtCod ;
   private short[] BC000856_A6954Mat_lin ;
   private String[] BC000857_A396EmprCod ;
   private String[] BC000857_A602MaqCod ;
   private int[] BC000857_A6078MaqCliCod ;
   private String[] BC000857_A6079MaqArtCod ;
   private String[] BC000858_A396EmprCod ;
   private int[] BC000858_A252CliCod ;
   private boolean[] BC000858_n252CliCod ;
   private String[] BC000858_A65ArtCod ;
   private boolean[] BC000858_n65ArtCod ;
   private short[] BC000858_A5382EstCatAny ;
   private String[] BC000858_A5383EstCatSer ;
   private short[] BC000858_A5384EstCatTip ;
   private String[] BC000859_A396EmprCod ;
   private int[] BC000859_A252CliCod ;
   private boolean[] BC000859_n252CliCod ;
   private String[] BC000859_A65ArtCod ;
   private boolean[] BC000859_n65ArtCod ;
   private String[] BC000859_A4658MdlCod ;
   private String[] BC000860_A396EmprCod ;
   private int[] BC000860_A252CliCod ;
   private boolean[] BC000860_n252CliCod ;
   private String[] BC000860_A4175WebEmpCod ;
   private String[] BC000861_A396EmprCod ;
   private int[] BC000861_A252CliCod ;
   private boolean[] BC000861_n252CliCod ;
   private String[] BC000861_A4079WEBDISCOD ;
   private String[] BC000862_A396EmprCod ;
   private int[] BC000862_A252CliCod ;
   private boolean[] BC000862_n252CliCod ;
   private String[] BC000862_A65ArtCod ;
   private boolean[] BC000862_n65ArtCod ;
   private String[] BC000862_A4058CCFColNom ;
   private int[] BC000862_A4059CCFColNum ;
   private String[] BC000863_A396EmprCod ;
   private int[] BC000863_A252CliCod ;
   private boolean[] BC000863_n252CliCod ;
   private String[] BC000863_A65ArtCod ;
   private boolean[] BC000863_n65ArtCod ;
   private String[] BC000863_A1177Dibujo ;
   private int[] BC000863_A1790DibIntCod ;
   private String[] BC000864_A396EmprCod ;
   private int[] BC000864_A252CliCod ;
   private boolean[] BC000864_n252CliCod ;
   private String[] BC000864_A65ArtCod ;
   private boolean[] BC000864_n65ArtCod ;
   private byte[] BC000864_A1080LinPre ;
   private String[] BC000865_A396EmprCod ;
   private long[] BC000865_A3814PePCod ;
   private String[] BC000866_A396EmprCod ;
   private byte[] BC000866_A3413OpeManCod ;
   private String[] BC000866_A3430PreManNMt ;
   private int[] BC000866_A252CliCod ;
   private boolean[] BC000866_n252CliCod ;
   private String[] BC000866_A65ArtCod ;
   private boolean[] BC000866_n65ArtCod ;
   private String[] BC000867_A396EmprCod ;
   private int[] BC000867_A3415ParManNum ;
   private String[] BC000868_A396EmprCod ;
   private byte[] BC000868_A3331LanBroCod ;
   private short[] BC000868_A3333LanBroLin ;
   private String[] BC000869_A396EmprCod ;
   private int[] BC000869_A252CliCod ;
   private boolean[] BC000869_n252CliCod ;
   private String[] BC000869_A65ArtCod ;
   private boolean[] BC000869_n65ArtCod ;
   private java.math.BigDecimal[] BC000869_A3319ArtCapKgs ;
   private String[] BC000870_A396EmprCod ;
   private int[] BC000870_A252CliCod ;
   private boolean[] BC000870_n252CliCod ;
   private String[] BC000870_A65ArtCod ;
   private boolean[] BC000870_n65ArtCod ;
   private String[] BC000870_A3288CCalCod ;
   private String[] BC000871_A396EmprCod ;
   private int[] BC000871_A252CliCod ;
   private boolean[] BC000871_n252CliCod ;
   private String[] BC000871_A65ArtCod ;
   private boolean[] BC000871_n65ArtCod ;
   private String[] BC000871_A3033CCCod ;
   private String[] BC000872_A396EmprCod ;
   private int[] BC000872_A252CliCod ;
   private boolean[] BC000872_n252CliCod ;
   private String[] BC000872_A65ArtCod ;
   private boolean[] BC000872_n65ArtCod ;
   private byte[] BC000872_A2937RecIntCod ;
   private String[] BC000873_A396EmprCod ;
   private int[] BC000873_A252CliCod ;
   private boolean[] BC000873_n252CliCod ;
   private String[] BC000873_A65ArtCod ;
   private boolean[] BC000873_n65ArtCod ;
   private short[] BC000873_A2931Limite2 ;
   private String[] BC000874_A396EmprCod ;
   private int[] BC000874_A252CliCod ;
   private boolean[] BC000874_n252CliCod ;
   private String[] BC000874_A65ArtCod ;
   private boolean[] BC000874_n65ArtCod ;
   private short[] BC000874_A71ArtEstAny ;
   private String[] BC000874_A2756ArtEstSer ;
   private String[] BC000875_A396EmprCod ;
   private int[] BC000875_A252CliCod ;
   private boolean[] BC000875_n252CliCod ;
   private String[] BC000875_A1504CliProCod ;
   private String[] BC000875_A65ArtCod ;
   private boolean[] BC000875_n65ArtCod ;
   private String[] BC000876_A396EmprCod ;
   private int[] BC000876_A252CliCod ;
   private boolean[] BC000876_n252CliCod ;
   private String[] BC000876_A65ArtCod ;
   private boolean[] BC000876_n65ArtCod ;
   private byte[] BC000876_A598LinRec ;
   private String[] BC000877_A396EmprCod ;
   private int[] BC000877_A252CliCod ;
   private boolean[] BC000877_n252CliCod ;
   private String[] BC000877_A65ArtCod ;
   private boolean[] BC000877_n65ArtCod ;
   private byte[] BC000877_A831TipColCod ;
   private String[] BC000878_A396EmprCod ;
   private int[] BC000878_A252CliCod ;
   private boolean[] BC000878_n252CliCod ;
   private String[] BC000878_A65ArtCod ;
   private boolean[] BC000878_n65ArtCod ;
   private String[] BC000878_A758ProCod ;
   private String[] BC000879_A3072ArtObsLon ;
   private boolean[] BC000879_n3072ArtObsLon ;
   private String[] BC000879_A4447ArtAcaBak ;
   private boolean[] BC000879_n4447ArtAcaBak ;
   private java.math.BigDecimal[] BC000879_A12695ArtElgAnc ;
   private boolean[] BC000879_n12695ArtElgAnc ;
   private java.math.BigDecimal[] BC000879_A12696ArtElgLar ;
   private boolean[] BC000879_n12696ArtElgLar ;
   private java.math.BigDecimal[] BC000879_A12697ArtRdoCru ;
   private boolean[] BC000879_n12697ArtRdoCru ;
   private java.math.BigDecimal[] BC000879_A12698ArtEncLarg ;
   private boolean[] BC000879_n12698ArtEncLarg ;
   private java.math.BigDecimal[] BC000879_A12699ArtEncAnc ;
   private boolean[] BC000879_n12699ArtEncAnc ;
   private java.math.BigDecimal[] BC000879_A14099ArtRdto4 ;
   private boolean[] BC000879_n14099ArtRdto4 ;
   private String[] BC000879_A14100Artdsc2 ;
   private boolean[] BC000879_n14100Artdsc2 ;
   private java.math.BigDecimal[] BC000879_A14101ArtgrComp ;
   private boolean[] BC000879_n14101ArtgrComp ;
   private java.math.BigDecimal[] BC000879_A14102ArtKgspp ;
   private boolean[] BC000879_n14102ArtKgspp ;
   private java.math.BigDecimal[] BC000879_A14103ArtPrepp ;
   private boolean[] BC000879_n14103ArtPrepp ;
   private String[] BC000879_A90ArtObsFac ;
   private boolean[] BC000879_n90ArtObsFac ;
   private String[] BC000879_A12886ArtObsOtra ;
   private boolean[] BC000879_n12886ArtObsOtra ;
   private String[] BC000879_A14295ArtActivo ;
   private String[] BC000879_A396EmprCod ;
   private int[] BC000879_A252CliCod ;
   private boolean[] BC000879_n252CliCod ;
   private short[] BC000879_A829TipArtCod ;
   private short[] BC000879_A10030ArtTh ;
   private boolean[] BC000879_n10030ArtTh ;
   private short[] BC000879_A4295ClasCod ;
   private boolean[] BC000879_n4295ClasCod ;
   private short[] BC000879_A6108ClaBolCod ;
   private boolean[] BC000879_n6108ClaBolCod ;
   private short[] BC000879_A6106ClaTubCod ;
   private boolean[] BC000879_n6106ClaTubCod ;
   private short[] BC000879_A10379Art_Cd ;
   private boolean[] BC000879_n10379Art_Cd ;
   private String[] BC000879_A65ArtCod ;
   private boolean[] BC000879_n65ArtCod ;
   private String[] BC000879_A66ArtCorOri ;
   private boolean[] BC000879_n66ArtCorOri ;
   private String[] BC000879_A70ArtEncOri ;
   private boolean[] BC000879_n70ArtEncOri ;
   private String[] BC000879_A4353ArtUsrCod ;
   private boolean[] BC000879_n4353ArtUsrCod ;
   private String[] BC000879_A69ArtDsc ;
   private boolean[] BC000879_n69ArtDsc ;
   private String[] BC000879_A279CliNom ;
   private String[] BC000879_A5335ArtCodExt ;
   private boolean[] BC000879_n5335ArtCodExt ;
   private String[] BC000879_A407EmprNom ;
   private boolean[] BC000879_n407EmprNom ;
   private String[] BC000879_A87ArtMat ;
   private boolean[] BC000879_n87ArtMat ;
   private String[] BC000879_A830TipArtDsc ;
   private boolean[] BC000879_n830TipArtDsc ;
   private short[] BC000879_A1148ArtPml ;
   private boolean[] BC000879_n1148ArtPml ;
   private short[] BC000879_A78ArtGraCru ;
   private boolean[] BC000879_n78ArtGraCru ;
   private short[] BC000879_A68ArtCruMin ;
   private boolean[] BC000879_n68ArtCruMin ;
   private short[] BC000879_A67ArtCruMax ;
   private boolean[] BC000879_n67ArtCruMax ;
   private short[] BC000879_A63ArtAcaMin ;
   private boolean[] BC000879_n63ArtAcaMin ;
   private short[] BC000879_A62ArtAcaMax ;
   private boolean[] BC000879_n62ArtAcaMax ;
   private java.math.BigDecimal[] BC000879_A95ArtRen ;
   private boolean[] BC000879_n95ArtRen ;
   private String[] BC000879_A101ArtTipPle ;
   private boolean[] BC000879_n101ArtTipPle ;
   private String[] BC000879_A100ArtTipLar ;
   private boolean[] BC000879_n100ArtTipLar ;
   private String[] BC000879_A96ArtSua ;
   private boolean[] BC000879_n96ArtSua ;
   private String[] BC000879_A64ArtAcaQui ;
   private boolean[] BC000879_n64ArtAcaQui ;
   private String[] BC000879_A73ArtEti ;
   private boolean[] BC000879_n73ArtEti ;
   private String[] BC000879_A272CliEti ;
   private byte[] BC000879_A306CliUrg ;
   private byte[] BC000879_A117ArtUrg ;
   private boolean[] BC000879_n117ArtUrg ;
   private java.math.BigDecimal[] BC000879_A88ArtMer ;
   private boolean[] BC000879_n88ArtMer ;
   private String[] BC000879_A105ArtTra1 ;
   private boolean[] BC000879_n105ArtTra1 ;
   private String[] BC000879_A106ArtTra2 ;
   private boolean[] BC000879_n106ArtTra2 ;
   private String[] BC000879_A107ArtTra3 ;
   private boolean[] BC000879_n107ArtTra3 ;
   private short[] BC000879_A108ArtTraP1 ;
   private boolean[] BC000879_n108ArtTraP1 ;
   private short[] BC000879_A109ArtTraP2 ;
   private boolean[] BC000879_n109ArtTraP2 ;
   private short[] BC000879_A110ArtTraP3 ;
   private boolean[] BC000879_n110ArtTraP3 ;
   private String[] BC000879_A111ArtUrd1 ;
   private boolean[] BC000879_n111ArtUrd1 ;
   private String[] BC000879_A112ArtUrd2 ;
   private boolean[] BC000879_n112ArtUrd2 ;
   private String[] BC000879_A113ArtUrd3 ;
   private boolean[] BC000879_n113ArtUrd3 ;
   private short[] BC000879_A114ArtUrdP1 ;
   private boolean[] BC000879_n114ArtUrdP1 ;
   private short[] BC000879_A115ArtUrdP2 ;
   private boolean[] BC000879_n115ArtUrdP2 ;
   private short[] BC000879_A116ArtUrdP3 ;
   private boolean[] BC000879_n116ArtUrdP3 ;
   private short[] BC000879_A1229ArtEncCom ;
   private boolean[] BC000879_n1229ArtEncCom ;
   private short[] BC000879_A1230ArtEncAnh ;
   private boolean[] BC000879_n1230ArtEncAnh ;
   private short[] BC000879_A1903ArtGraAca ;
   private boolean[] BC000879_n1903ArtGraAca ;
   private java.math.BigDecimal[] BC000879_A1905ArtRdoA ;
   private boolean[] BC000879_n1905ArtRdoA ;
   private java.math.BigDecimal[] BC000879_A1904ArtRdoN ;
   private boolean[] BC000879_n1904ArtRdoN ;
   private java.math.BigDecimal[] BC000879_A2791ArtFacAbs ;
   private boolean[] BC000879_n2791ArtFacAbs ;
   private String[] BC000879_A2834ArtPle2 ;
   private boolean[] BC000879_n2834ArtPle2 ;
   private short[] BC000879_A3121ArtNumCor ;
   private boolean[] BC000879_n3121ArtNumCor ;
   private short[] BC000879_A3122ArtAncSal1 ;
   private boolean[] BC000879_n3122ArtAncSal1 ;
   private short[] BC000879_A3123ArtAncSal2 ;
   private boolean[] BC000879_n3123ArtAncSal2 ;
   private short[] BC000879_A3124ArtAncSal3 ;
   private boolean[] BC000879_n3124ArtAncSal3 ;
   private short[] BC000879_A3125ArtGraAca2 ;
   private boolean[] BC000879_n3125ArtGraAca2 ;
   private short[] BC000879_A3126ArtGraCru2 ;
   private boolean[] BC000879_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC000879_A4297ArtPmPPza ;
   private boolean[] BC000879_n4297ArtPmPPza ;
   private java.util.Date[] BC000879_A3683ArtFecCre ;
   private boolean[] BC000879_n3683ArtFecCre ;
   private java.util.Date[] BC000879_A4354ArtFecMod ;
   private boolean[] BC000879_n4354ArtFecMod ;
   private String[] BC000879_A4296ClasDsc ;
   private boolean[] BC000879_n4296ClasDsc ;
   private String[] BC000879_A5741ArtComer ;
   private boolean[] BC000879_n5741ArtComer ;
   private String[] BC000879_A6107ClaTubDsc ;
   private boolean[] BC000879_n6107ClaTubDsc ;
   private String[] BC000879_A6109ClaBolDsc ;
   private boolean[] BC000879_n6109ClaBolDsc ;
   private java.math.BigDecimal[] BC000879_A6435ArtRdoCru1 ;
   private boolean[] BC000879_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC000879_A6436ArtRdoCru2 ;
   private boolean[] BC000879_n6436ArtRdoCru2 ;
   private String[] BC000879_A967ArtNMtr ;
   private boolean[] BC000879_n967ArtNMtr ;
   private java.math.BigDecimal[] BC000879_A6462ArtLu ;
   private boolean[] BC000879_n6462ArtLu ;
   private short[] BC000879_A4607ArtRb ;
   private boolean[] BC000879_n4607ArtRb ;
   private short[] BC000879_A4444ArtPelAnh ;
   private boolean[] BC000879_n4444ArtPelAnh ;
   private short[] BC000879_A7412Artgrm2Sc ;
   private boolean[] BC000879_n7412Artgrm2Sc ;
   private short[] BC000879_A7413ArtPmlSc ;
   private boolean[] BC000879_n7413ArtPmlSc ;
   private short[] BC000879_A7414ArtAncSc ;
   private boolean[] BC000879_n7414ArtAncSc ;
   private short[] BC000879_A7415ArtPmlCru ;
   private boolean[] BC000879_n7415ArtPmlCru ;
   private java.math.BigDecimal[] BC000879_A7777ArtRdtSc ;
   private boolean[] BC000879_n7777ArtRdtSc ;
   private String[] BC000879_A7778ArtUnd ;
   private boolean[] BC000879_n7778ArtUnd ;
   private String[] BC000879_A7779ArtBlo ;
   private boolean[] BC000879_n7779ArtBlo ;
   private byte[] BC000879_A7948ArtCla ;
   private boolean[] BC000879_n7948ArtCla ;
   private String[] BC000879_A6014TipArtDsc2 ;
   private boolean[] BC000879_n6014TipArtDsc2 ;
   private java.math.BigDecimal[] BC000879_A9730ArtFabsH ;
   private boolean[] BC000879_n9730ArtFabsH ;
   private java.math.BigDecimal[] BC000879_A9801ArtFabsT ;
   private boolean[] BC000879_n9801ArtFabsT ;
   private byte[] BC000879_A9875ArtNProg ;
   private boolean[] BC000879_n9875ArtNProg ;
   private short[] BC000879_A9902ArtVbd ;
   private boolean[] BC000879_n9902ArtVbd ;
   private short[] BC000879_A9903ArtVbn ;
   private boolean[] BC000879_n9903ArtVbn ;
   private short[] BC000879_A9904ArtAb ;
   private boolean[] BC000879_n9904ArtAb ;
   private String[] BC000879_A397ArtObsGrm ;
   private boolean[] BC000879_n397ArtObsGrm ;
   private String[] BC000879_A398ArtObsAnc ;
   private boolean[] BC000879_n398ArtObsAnc ;
   private String[] BC000879_A4980ArtCdb ;
   private boolean[] BC000879_n4980ArtCdb ;
   private String[] BC000879_A10027ArtGalga ;
   private boolean[] BC000879_n10027ArtGalga ;
   private String[] BC000879_A10028ArtPlatina ;
   private boolean[] BC000879_n10028ArtPlatina ;
   private String[] BC000879_A10029ArtPgd ;
   private boolean[] BC000879_n10029ArtPgd ;
   private String[] BC000879_A10031ArtThN ;
   private boolean[] BC000879_n10031ArtThN ;
   private String[] BC000879_A10380Art_Dc ;
   private boolean[] BC000879_n10380Art_Dc ;
   private short[] BC000879_A10804ArtHilos ;
   private boolean[] BC000879_n10804ArtHilos ;
   private short[] BC000879_A10805ArtPasad ;
   private boolean[] BC000879_n10805ArtPasad ;
   private short[] BC000879_A10831ArtAncC ;
   private boolean[] BC000879_n10831ArtAncC ;
   private short[] BC000879_A10832ArtGrm2C ;
   private boolean[] BC000879_n10832ArtGrm2C ;
   private java.math.BigDecimal[] BC000879_A10833ArtRdoC ;
   private boolean[] BC000879_n10833ArtRdoC ;
   private int[] BC000879_A4455ArtAcaFor ;
   private boolean[] BC000879_n4455ArtAcaFor ;
   private String[] BC000879_A3682ArtAnu ;
   private boolean[] BC000879_n3682ArtAnu ;
   private java.math.BigDecimal[] BC000879_A11627ArtFacUti ;
   private boolean[] BC000879_n11627ArtFacUti ;
   private int[] BC000879_A1581ArtNumTip ;
   private boolean[] BC000879_n1581ArtNumTip ;
   private byte[] BC000879_A12364ArtMT ;
   private boolean[] BC000879_n12364ArtMT ;
   private byte[] BC000879_A12365ArtTRabs ;
   private boolean[] BC000879_n12365ArtTRabs ;
   private java.math.BigDecimal[] BC000879_A12366ArtKgMn ;
   private boolean[] BC000879_n12366ArtKgMn ;
   private String[] BC000879_A4446ArtAcaMar ;
   private boolean[] BC000879_n4446ArtAcaMar ;
   private String[] BC000880_A407EmprNom ;
   private boolean[] BC000880_n407EmprNom ;
   private String[] BC000881_A279CliNom ;
   private String[] BC000881_A272CliEti ;
   private byte[] BC000881_A306CliUrg ;
   private String[] BC000882_A407EmprNom ;
   private boolean[] BC000882_n407EmprNom ;
   private String[] BC000883_A279CliNom ;
   private String[] BC000883_A272CliEti ;
   private byte[] BC000883_A306CliUrg ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC00082_A3072ArtObsLon ;
   private String[] BC00082_A4447ArtAcaBak ;
   private java.math.BigDecimal[] BC00082_A12695ArtElgAnc ;
   private java.math.BigDecimal[] BC00082_A12696ArtElgLar ;
   private java.math.BigDecimal[] BC00082_A12697ArtRdoCru ;
   private java.math.BigDecimal[] BC00082_A12698ArtEncLarg ;
   private java.math.BigDecimal[] BC00082_A12699ArtEncAnc ;
   private java.math.BigDecimal[] BC00082_A14099ArtRdto4 ;
   private String[] BC00082_A14100Artdsc2 ;
   private java.math.BigDecimal[] BC00082_A14101ArtgrComp ;
   private java.math.BigDecimal[] BC00082_A14102ArtKgspp ;
   private java.math.BigDecimal[] BC00082_A14103ArtPrepp ;
   private String[] BC00082_A90ArtObsFac ;
   private String[] BC00082_A12886ArtObsOtra ;
   private String[] BC00082_A14295ArtActivo ;
   private String[] BC00082_A396EmprCod ;
   private int[] BC00082_A252CliCod ;
   private short[] BC00082_A829TipArtCod ;
   private short[] BC00082_A10030ArtTh ;
   private short[] BC00082_A4295ClasCod ;
   private short[] BC00082_A6108ClaBolCod ;
   private short[] BC00082_A6106ClaTubCod ;
   private short[] BC00082_A10379Art_Cd ;
   private String[] BC00082_A65ArtCod ;
   private String[] BC00082_A66ArtCorOri ;
   private String[] BC00082_A70ArtEncOri ;
   private String[] BC00082_A4353ArtUsrCod ;
   private String[] BC00082_A69ArtDsc ;
   private String[] BC00082_A5335ArtCodExt ;
   private String[] BC00082_A87ArtMat ;
   private short[] BC00082_A1148ArtPml ;
   private short[] BC00082_A78ArtGraCru ;
   private short[] BC00082_A68ArtCruMin ;
   private short[] BC00082_A67ArtCruMax ;
   private short[] BC00082_A63ArtAcaMin ;
   private short[] BC00082_A62ArtAcaMax ;
   private java.math.BigDecimal[] BC00082_A95ArtRen ;
   private String[] BC00082_A101ArtTipPle ;
   private String[] BC00082_A100ArtTipLar ;
   private String[] BC00082_A96ArtSua ;
   private String[] BC00082_A64ArtAcaQui ;
   private String[] BC00082_A73ArtEti ;
   private byte[] BC00082_A117ArtUrg ;
   private java.math.BigDecimal[] BC00082_A88ArtMer ;
   private String[] BC00082_A105ArtTra1 ;
   private String[] BC00082_A106ArtTra2 ;
   private String[] BC00082_A107ArtTra3 ;
   private short[] BC00082_A108ArtTraP1 ;
   private short[] BC00082_A109ArtTraP2 ;
   private short[] BC00082_A110ArtTraP3 ;
   private String[] BC00082_A111ArtUrd1 ;
   private String[] BC00082_A112ArtUrd2 ;
   private String[] BC00082_A113ArtUrd3 ;
   private short[] BC00082_A114ArtUrdP1 ;
   private short[] BC00082_A115ArtUrdP2 ;
   private short[] BC00082_A116ArtUrdP3 ;
   private short[] BC00082_A1229ArtEncCom ;
   private short[] BC00082_A1230ArtEncAnh ;
   private short[] BC00082_A1903ArtGraAca ;
   private java.math.BigDecimal[] BC00082_A1905ArtRdoA ;
   private java.math.BigDecimal[] BC00082_A1904ArtRdoN ;
   private java.math.BigDecimal[] BC00082_A2791ArtFacAbs ;
   private String[] BC00082_A2834ArtPle2 ;
   private short[] BC00082_A3121ArtNumCor ;
   private short[] BC00082_A3122ArtAncSal1 ;
   private short[] BC00082_A3123ArtAncSal2 ;
   private short[] BC00082_A3124ArtAncSal3 ;
   private short[] BC00082_A3125ArtGraAca2 ;
   private short[] BC00082_A3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC00082_A4297ArtPmPPza ;
   private java.util.Date[] BC00082_A3683ArtFecCre ;
   private java.util.Date[] BC00082_A4354ArtFecMod ;
   private String[] BC00082_A5741ArtComer ;
   private java.math.BigDecimal[] BC00082_A6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC00082_A6436ArtRdoCru2 ;
   private String[] BC00082_A967ArtNMtr ;
   private java.math.BigDecimal[] BC00082_A6462ArtLu ;
   private short[] BC00082_A4607ArtRb ;
   private short[] BC00082_A4444ArtPelAnh ;
   private short[] BC00082_A7412Artgrm2Sc ;
   private short[] BC00082_A7413ArtPmlSc ;
   private short[] BC00082_A7414ArtAncSc ;
   private short[] BC00082_A7415ArtPmlCru ;
   private java.math.BigDecimal[] BC00082_A7777ArtRdtSc ;
   private String[] BC00082_A7778ArtUnd ;
   private String[] BC00082_A7779ArtBlo ;
   private byte[] BC00082_A7948ArtCla ;
   private java.math.BigDecimal[] BC00082_A9730ArtFabsH ;
   private java.math.BigDecimal[] BC00082_A9801ArtFabsT ;
   private byte[] BC00082_A9875ArtNProg ;
   private short[] BC00082_A9902ArtVbd ;
   private short[] BC00082_A9903ArtVbn ;
   private short[] BC00082_A9904ArtAb ;
   private String[] BC00082_A397ArtObsGrm ;
   private String[] BC00082_A398ArtObsAnc ;
   private String[] BC00082_A4980ArtCdb ;
   private String[] BC00082_A10027ArtGalga ;
   private String[] BC00082_A10028ArtPlatina ;
   private String[] BC00082_A10029ArtPgd ;
   private short[] BC00082_A10804ArtHilos ;
   private short[] BC00082_A10805ArtPasad ;
   private short[] BC00082_A10831ArtAncC ;
   private short[] BC00082_A10832ArtGrm2C ;
   private java.math.BigDecimal[] BC00082_A10833ArtRdoC ;
   private int[] BC00082_A4455ArtAcaFor ;
   private String[] BC00082_A3682ArtAnu ;
   private java.math.BigDecimal[] BC00082_A11627ArtFacUti ;
   private int[] BC00082_A1581ArtNumTip ;
   private byte[] BC00082_A12364ArtMT ;
   private byte[] BC00082_A12365ArtTRabs ;
   private java.math.BigDecimal[] BC00082_A12366ArtKgMn ;
   private String[] BC00082_A4446ArtAcaMar ;
   private String[] BC00083_A3072ArtObsLon ;
   private String[] BC00083_A4447ArtAcaBak ;
   private java.math.BigDecimal[] BC00083_A12695ArtElgAnc ;
   private java.math.BigDecimal[] BC00083_A12696ArtElgLar ;
   private java.math.BigDecimal[] BC00083_A12697ArtRdoCru ;
   private java.math.BigDecimal[] BC00083_A12698ArtEncLarg ;
   private java.math.BigDecimal[] BC00083_A12699ArtEncAnc ;
   private java.math.BigDecimal[] BC00083_A14099ArtRdto4 ;
   private String[] BC00083_A14100Artdsc2 ;
   private java.math.BigDecimal[] BC00083_A14101ArtgrComp ;
   private java.math.BigDecimal[] BC00083_A14102ArtKgspp ;
   private java.math.BigDecimal[] BC00083_A14103ArtPrepp ;
   private String[] BC00083_A90ArtObsFac ;
   private String[] BC00083_A12886ArtObsOtra ;
   private String[] BC00083_A14295ArtActivo ;
   private String[] BC00083_A396EmprCod ;
   private int[] BC00083_A252CliCod ;
   private short[] BC00083_A829TipArtCod ;
   private short[] BC00083_A10030ArtTh ;
   private short[] BC00083_A4295ClasCod ;
   private short[] BC00083_A6108ClaBolCod ;
   private short[] BC00083_A6106ClaTubCod ;
   private short[] BC00083_A10379Art_Cd ;
   private String[] BC00083_A65ArtCod ;
   private String[] BC00083_A66ArtCorOri ;
   private String[] BC00083_A70ArtEncOri ;
   private String[] BC00083_A4353ArtUsrCod ;
   private String[] BC00083_A69ArtDsc ;
   private String[] BC00083_A5335ArtCodExt ;
   private String[] BC00083_A87ArtMat ;
   private short[] BC00083_A1148ArtPml ;
   private short[] BC00083_A78ArtGraCru ;
   private short[] BC00083_A68ArtCruMin ;
   private short[] BC00083_A67ArtCruMax ;
   private short[] BC00083_A63ArtAcaMin ;
   private short[] BC00083_A62ArtAcaMax ;
   private java.math.BigDecimal[] BC00083_A95ArtRen ;
   private String[] BC00083_A101ArtTipPle ;
   private String[] BC00083_A100ArtTipLar ;
   private String[] BC00083_A96ArtSua ;
   private String[] BC00083_A64ArtAcaQui ;
   private String[] BC00083_A73ArtEti ;
   private byte[] BC00083_A117ArtUrg ;
   private java.math.BigDecimal[] BC00083_A88ArtMer ;
   private String[] BC00083_A105ArtTra1 ;
   private String[] BC00083_A106ArtTra2 ;
   private String[] BC00083_A107ArtTra3 ;
   private short[] BC00083_A108ArtTraP1 ;
   private short[] BC00083_A109ArtTraP2 ;
   private short[] BC00083_A110ArtTraP3 ;
   private String[] BC00083_A111ArtUrd1 ;
   private String[] BC00083_A112ArtUrd2 ;
   private String[] BC00083_A113ArtUrd3 ;
   private short[] BC00083_A114ArtUrdP1 ;
   private short[] BC00083_A115ArtUrdP2 ;
   private short[] BC00083_A116ArtUrdP3 ;
   private short[] BC00083_A1229ArtEncCom ;
   private short[] BC00083_A1230ArtEncAnh ;
   private short[] BC00083_A1903ArtGraAca ;
   private java.math.BigDecimal[] BC00083_A1905ArtRdoA ;
   private java.math.BigDecimal[] BC00083_A1904ArtRdoN ;
   private java.math.BigDecimal[] BC00083_A2791ArtFacAbs ;
   private String[] BC00083_A2834ArtPle2 ;
   private short[] BC00083_A3121ArtNumCor ;
   private short[] BC00083_A3122ArtAncSal1 ;
   private short[] BC00083_A3123ArtAncSal2 ;
   private short[] BC00083_A3124ArtAncSal3 ;
   private short[] BC00083_A3125ArtGraAca2 ;
   private short[] BC00083_A3126ArtGraCru2 ;
   private java.math.BigDecimal[] BC00083_A4297ArtPmPPza ;
   private java.util.Date[] BC00083_A3683ArtFecCre ;
   private java.util.Date[] BC00083_A4354ArtFecMod ;
   private String[] BC00083_A5741ArtComer ;
   private java.math.BigDecimal[] BC00083_A6435ArtRdoCru1 ;
   private java.math.BigDecimal[] BC00083_A6436ArtRdoCru2 ;
   private String[] BC00083_A967ArtNMtr ;
   private java.math.BigDecimal[] BC00083_A6462ArtLu ;
   private short[] BC00083_A4607ArtRb ;
   private short[] BC00083_A4444ArtPelAnh ;
   private short[] BC00083_A7412Artgrm2Sc ;
   private short[] BC00083_A7413ArtPmlSc ;
   private short[] BC00083_A7414ArtAncSc ;
   private short[] BC00083_A7415ArtPmlCru ;
   private java.math.BigDecimal[] BC00083_A7777ArtRdtSc ;
   private String[] BC00083_A7778ArtUnd ;
   private String[] BC00083_A7779ArtBlo ;
   private byte[] BC00083_A7948ArtCla ;
   private java.math.BigDecimal[] BC00083_A9730ArtFabsH ;
   private java.math.BigDecimal[] BC00083_A9801ArtFabsT ;
   private byte[] BC00083_A9875ArtNProg ;
   private short[] BC00083_A9902ArtVbd ;
   private short[] BC00083_A9903ArtVbn ;
   private short[] BC00083_A9904ArtAb ;
   private String[] BC00083_A397ArtObsGrm ;
   private String[] BC00083_A398ArtObsAnc ;
   private String[] BC00083_A4980ArtCdb ;
   private String[] BC00083_A10027ArtGalga ;
   private String[] BC00083_A10028ArtPlatina ;
   private String[] BC00083_A10029ArtPgd ;
   private short[] BC00083_A10804ArtHilos ;
   private short[] BC00083_A10805ArtPasad ;
   private short[] BC00083_A10831ArtAncC ;
   private short[] BC00083_A10832ArtGrm2C ;
   private java.math.BigDecimal[] BC00083_A10833ArtRdoC ;
   private int[] BC00083_A4455ArtAcaFor ;
   private String[] BC00083_A3682ArtAnu ;
   private java.math.BigDecimal[] BC00083_A11627ArtFacUti ;
   private int[] BC00083_A1581ArtNumTip ;
   private byte[] BC00083_A12364ArtMT ;
   private byte[] BC00083_A12365ArtTRabs ;
   private java.math.BigDecimal[] BC00083_A12366ArtKgMn ;
   private String[] BC00083_A4446ArtAcaMar ;
   private String[] BC00084_A407EmprNom ;
   private String[] BC00085_A279CliNom ;
   private String[] BC00085_A272CliEti ;
   private byte[] BC00085_A306CliUrg ;
   private String[] BC00086_A830TipArtDsc ;
   private String[] BC00086_A6014TipArtDsc2 ;
   private String[] BC00087_A10031ArtThN ;
   private String[] BC00088_A4296ClasDsc ;
   private String[] BC00089_A6109ClaBolDsc ;
   private String[] BC000810_A6107ClaTubDsc ;
   private String[] BC000811_A10380Art_Dc ;
   private boolean[] BC00082_n3072ArtObsLon ;
   private boolean[] BC00082_n4447ArtAcaBak ;
   private boolean[] BC00082_n12695ArtElgAnc ;
   private boolean[] BC00082_n12696ArtElgLar ;
   private boolean[] BC00082_n12697ArtRdoCru ;
   private boolean[] BC00082_n12698ArtEncLarg ;
   private boolean[] BC00082_n12699ArtEncAnc ;
   private boolean[] BC00082_n14099ArtRdto4 ;
   private boolean[] BC00082_n14100Artdsc2 ;
   private boolean[] BC00082_n14101ArtgrComp ;
   private boolean[] BC00082_n14102ArtKgspp ;
   private boolean[] BC00082_n14103ArtPrepp ;
   private boolean[] BC00082_n90ArtObsFac ;
   private boolean[] BC00082_n12886ArtObsOtra ;
   private boolean[] BC00082_n10030ArtTh ;
   private boolean[] BC00082_n4295ClasCod ;
   private boolean[] BC00082_n6108ClaBolCod ;
   private boolean[] BC00082_n6106ClaTubCod ;
   private boolean[] BC00082_n10379Art_Cd ;
   private boolean[] BC00082_n66ArtCorOri ;
   private boolean[] BC00082_n70ArtEncOri ;
   private boolean[] BC00082_n4353ArtUsrCod ;
   private boolean[] BC00082_n69ArtDsc ;
   private boolean[] BC00082_n5335ArtCodExt ;
   private boolean[] BC00082_n87ArtMat ;
   private boolean[] BC00082_n1148ArtPml ;
   private boolean[] BC00082_n78ArtGraCru ;
   private boolean[] BC00082_n68ArtCruMin ;
   private boolean[] BC00082_n67ArtCruMax ;
   private boolean[] BC00082_n63ArtAcaMin ;
   private boolean[] BC00082_n62ArtAcaMax ;
   private boolean[] BC00082_n95ArtRen ;
   private boolean[] BC00082_n101ArtTipPle ;
   private boolean[] BC00082_n100ArtTipLar ;
   private boolean[] BC00082_n96ArtSua ;
   private boolean[] BC00082_n64ArtAcaQui ;
   private boolean[] BC00082_n73ArtEti ;
   private boolean[] BC00082_n117ArtUrg ;
   private boolean[] BC00082_n88ArtMer ;
   private boolean[] BC00082_n105ArtTra1 ;
   private boolean[] BC00082_n106ArtTra2 ;
   private boolean[] BC00082_n107ArtTra3 ;
   private boolean[] BC00082_n108ArtTraP1 ;
   private boolean[] BC00082_n109ArtTraP2 ;
   private boolean[] BC00082_n110ArtTraP3 ;
   private boolean[] BC00082_n111ArtUrd1 ;
   private boolean[] BC00082_n112ArtUrd2 ;
   private boolean[] BC00082_n113ArtUrd3 ;
   private boolean[] BC00082_n114ArtUrdP1 ;
   private boolean[] BC00082_n115ArtUrdP2 ;
   private boolean[] BC00082_n116ArtUrdP3 ;
   private boolean[] BC00082_n1229ArtEncCom ;
   private boolean[] BC00082_n1230ArtEncAnh ;
   private boolean[] BC00082_n1903ArtGraAca ;
   private boolean[] BC00082_n1905ArtRdoA ;
   private boolean[] BC00082_n1904ArtRdoN ;
   private boolean[] BC00082_n2791ArtFacAbs ;
   private boolean[] BC00082_n2834ArtPle2 ;
   private boolean[] BC00082_n3121ArtNumCor ;
   private boolean[] BC00082_n3122ArtAncSal1 ;
   private boolean[] BC00082_n3123ArtAncSal2 ;
   private boolean[] BC00082_n3124ArtAncSal3 ;
   private boolean[] BC00082_n3125ArtGraAca2 ;
   private boolean[] BC00082_n3126ArtGraCru2 ;
   private boolean[] BC00082_n4297ArtPmPPza ;
   private boolean[] BC00082_n3683ArtFecCre ;
   private boolean[] BC00082_n4354ArtFecMod ;
   private boolean[] BC00082_n5741ArtComer ;
   private boolean[] BC00082_n6435ArtRdoCru1 ;
   private boolean[] BC00082_n6436ArtRdoCru2 ;
   private boolean[] BC00082_n967ArtNMtr ;
   private boolean[] BC00082_n6462ArtLu ;
   private boolean[] BC00082_n4607ArtRb ;
   private boolean[] BC00082_n4444ArtPelAnh ;
   private boolean[] BC00082_n7412Artgrm2Sc ;
   private boolean[] BC00082_n7413ArtPmlSc ;
   private boolean[] BC00082_n7414ArtAncSc ;
   private boolean[] BC00082_n7415ArtPmlCru ;
   private boolean[] BC00082_n7777ArtRdtSc ;
   private boolean[] BC00082_n7778ArtUnd ;
   private boolean[] BC00082_n7779ArtBlo ;
   private boolean[] BC00082_n7948ArtCla ;
   private boolean[] BC00082_n9730ArtFabsH ;
   private boolean[] BC00082_n9801ArtFabsT ;
   private boolean[] BC00082_n9875ArtNProg ;
   private boolean[] BC00082_n9902ArtVbd ;
   private boolean[] BC00082_n9903ArtVbn ;
   private boolean[] BC00082_n9904ArtAb ;
   private boolean[] BC00082_n397ArtObsGrm ;
   private boolean[] BC00082_n398ArtObsAnc ;
   private boolean[] BC00082_n4980ArtCdb ;
   private boolean[] BC00082_n10027ArtGalga ;
   private boolean[] BC00082_n10028ArtPlatina ;
   private boolean[] BC00082_n10029ArtPgd ;
   private boolean[] BC00082_n10804ArtHilos ;
   private boolean[] BC00082_n10805ArtPasad ;
   private boolean[] BC00082_n10831ArtAncC ;
   private boolean[] BC00082_n10832ArtGrm2C ;
   private boolean[] BC00082_n10833ArtRdoC ;
   private boolean[] BC00082_n4455ArtAcaFor ;
   private boolean[] BC00082_n3682ArtAnu ;
   private boolean[] BC00082_n11627ArtFacUti ;
   private boolean[] BC00082_n1581ArtNumTip ;
   private boolean[] BC00082_n12364ArtMT ;
   private boolean[] BC00082_n12365ArtTRabs ;
   private boolean[] BC00082_n12366ArtKgMn ;
   private boolean[] BC00082_n4446ArtAcaMar ;
   private boolean[] BC00083_n3072ArtObsLon ;
   private boolean[] BC00083_n4447ArtAcaBak ;
   private boolean[] BC00083_n12695ArtElgAnc ;
   private boolean[] BC00083_n12696ArtElgLar ;
   private boolean[] BC00083_n12697ArtRdoCru ;
   private boolean[] BC00083_n12698ArtEncLarg ;
   private boolean[] BC00083_n12699ArtEncAnc ;
   private boolean[] BC00083_n14099ArtRdto4 ;
   private boolean[] BC00083_n14100Artdsc2 ;
   private boolean[] BC00083_n14101ArtgrComp ;
   private boolean[] BC00083_n14102ArtKgspp ;
   private boolean[] BC00083_n14103ArtPrepp ;
   private boolean[] BC00083_n90ArtObsFac ;
   private boolean[] BC00083_n12886ArtObsOtra ;
   private boolean[] BC00083_n10030ArtTh ;
   private boolean[] BC00083_n4295ClasCod ;
   private boolean[] BC00083_n6108ClaBolCod ;
   private boolean[] BC00083_n6106ClaTubCod ;
   private boolean[] BC00083_n10379Art_Cd ;
   private boolean[] BC00083_n66ArtCorOri ;
   private boolean[] BC00083_n70ArtEncOri ;
   private boolean[] BC00083_n4353ArtUsrCod ;
   private boolean[] BC00083_n69ArtDsc ;
   private boolean[] BC00083_n5335ArtCodExt ;
   private boolean[] BC00083_n87ArtMat ;
   private boolean[] BC00083_n1148ArtPml ;
   private boolean[] BC00083_n78ArtGraCru ;
   private boolean[] BC00083_n68ArtCruMin ;
   private boolean[] BC00083_n67ArtCruMax ;
   private boolean[] BC00083_n63ArtAcaMin ;
   private boolean[] BC00083_n62ArtAcaMax ;
   private boolean[] BC00083_n95ArtRen ;
   private boolean[] BC00083_n101ArtTipPle ;
   private boolean[] BC00083_n100ArtTipLar ;
   private boolean[] BC00083_n96ArtSua ;
   private boolean[] BC00083_n64ArtAcaQui ;
   private boolean[] BC00083_n73ArtEti ;
   private boolean[] BC00083_n117ArtUrg ;
   private boolean[] BC00083_n88ArtMer ;
   private boolean[] BC00083_n105ArtTra1 ;
   private boolean[] BC00083_n106ArtTra2 ;
   private boolean[] BC00083_n107ArtTra3 ;
   private boolean[] BC00083_n108ArtTraP1 ;
   private boolean[] BC00083_n109ArtTraP2 ;
   private boolean[] BC00083_n110ArtTraP3 ;
   private boolean[] BC00083_n111ArtUrd1 ;
   private boolean[] BC00083_n112ArtUrd2 ;
   private boolean[] BC00083_n113ArtUrd3 ;
   private boolean[] BC00083_n114ArtUrdP1 ;
   private boolean[] BC00083_n115ArtUrdP2 ;
   private boolean[] BC00083_n116ArtUrdP3 ;
   private boolean[] BC00083_n1229ArtEncCom ;
   private boolean[] BC00083_n1230ArtEncAnh ;
   private boolean[] BC00083_n1903ArtGraAca ;
   private boolean[] BC00083_n1905ArtRdoA ;
   private boolean[] BC00083_n1904ArtRdoN ;
   private boolean[] BC00083_n2791ArtFacAbs ;
   private boolean[] BC00083_n2834ArtPle2 ;
   private boolean[] BC00083_n3121ArtNumCor ;
   private boolean[] BC00083_n3122ArtAncSal1 ;
   private boolean[] BC00083_n3123ArtAncSal2 ;
   private boolean[] BC00083_n3124ArtAncSal3 ;
   private boolean[] BC00083_n3125ArtGraAca2 ;
   private boolean[] BC00083_n3126ArtGraCru2 ;
   private boolean[] BC00083_n4297ArtPmPPza ;
   private boolean[] BC00083_n3683ArtFecCre ;
   private boolean[] BC00083_n4354ArtFecMod ;
   private boolean[] BC00083_n5741ArtComer ;
   private boolean[] BC00083_n6435ArtRdoCru1 ;
   private boolean[] BC00083_n6436ArtRdoCru2 ;
   private boolean[] BC00083_n967ArtNMtr ;
   private boolean[] BC00083_n6462ArtLu ;
   private boolean[] BC00083_n4607ArtRb ;
   private boolean[] BC00083_n4444ArtPelAnh ;
   private boolean[] BC00083_n7412Artgrm2Sc ;
   private boolean[] BC00083_n7413ArtPmlSc ;
   private boolean[] BC00083_n7414ArtAncSc ;
   private boolean[] BC00083_n7415ArtPmlCru ;
   private boolean[] BC00083_n7777ArtRdtSc ;
   private boolean[] BC00083_n7778ArtUnd ;
   private boolean[] BC00083_n7779ArtBlo ;
   private boolean[] BC00083_n7948ArtCla ;
   private boolean[] BC00083_n9730ArtFabsH ;
   private boolean[] BC00083_n9801ArtFabsT ;
   private boolean[] BC00083_n9875ArtNProg ;
   private boolean[] BC00083_n9902ArtVbd ;
   private boolean[] BC00083_n9903ArtVbn ;
   private boolean[] BC00083_n9904ArtAb ;
   private boolean[] BC00083_n397ArtObsGrm ;
   private boolean[] BC00083_n398ArtObsAnc ;
   private boolean[] BC00083_n4980ArtCdb ;
   private boolean[] BC00083_n10027ArtGalga ;
   private boolean[] BC00083_n10028ArtPlatina ;
   private boolean[] BC00083_n10029ArtPgd ;
   private boolean[] BC00083_n10804ArtHilos ;
   private boolean[] BC00083_n10805ArtPasad ;
   private boolean[] BC00083_n10831ArtAncC ;
   private boolean[] BC00083_n10832ArtGrm2C ;
   private boolean[] BC00083_n10833ArtRdoC ;
   private boolean[] BC00083_n4455ArtAcaFor ;
   private boolean[] BC00083_n3682ArtAnu ;
   private boolean[] BC00083_n11627ArtFacUti ;
   private boolean[] BC00083_n1581ArtNumTip ;
   private boolean[] BC00083_n12364ArtMT ;
   private boolean[] BC00083_n12365ArtTRabs ;
   private boolean[] BC00083_n12366ArtKgMn ;
   private boolean[] BC00083_n4446ArtAcaMar ;
   private boolean[] BC00084_n407EmprNom ;
   private boolean[] BC00086_n830TipArtDsc ;
   private boolean[] BC00086_n6014TipArtDsc2 ;
   private boolean[] BC00087_n10031ArtThN ;
   private boolean[] BC00088_n4296ClasDsc ;
   private boolean[] BC00089_n6109ClaBolDsc ;
   private boolean[] BC000810_n6107ClaTubDsc ;
   private boolean[] BC000811_n10380Art_Dc ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV200TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV208TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV199WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class tarticu_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class tarticu_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class tarticu_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class tarticu_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tarticu_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00082", "SELECT ArtObsLon, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsFac, ArtObsOtra, ArtActivo, EmprCod, CliCod, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd, ArtCod, ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsLon, ArtObsFac, ArtObsOtra, ArtActivo, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00083", "SELECT ArtObsLon, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsFac, ArtObsOtra, ArtActivo, EmprCod, CliCod, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd, ArtCod, ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00084", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00085", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00086", "SELECT TipArtDsc, TipArtDsc2 FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00087", "SELECT ProceNom AS ArtThN FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00088", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00089", "SELECT ClaBolDsc FROM TXPClaBol WHERE EmprCod = ? AND ClaBolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000810", "SELECT ClaTubDsc FROM TXPClaTub WHERE EmprCod = ? AND ClaTubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000811", "SELECT Art_Dc FROM TXPTR0700 WHERE EmprCod = ? AND Art_Cd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000812", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtObsLon, TM1.ArtAcaBak, TM1.ArtElgAnc, TM1.ArtElgLar, TM1.ArtRdoCru, TM1.ArtEncLarg, TM1.ArtEncAnc, TM1.ArtRdto4, TM1.Artdsc2, TM1.ArtgrComp, TM1.ArtKgspp, TM1.ArtPrepp, TM1.ArtObsFac, TM1.ArtObsOtra, TM1.ArtActivo, TM1.EmprCod, TM1.CliCod, TM1.TipArtCod, TM1.ArtTh AS ArtTh, TM1.ClasCod, TM1.ClaBolCod, TM1.ClaTubCod, TM1.Art_Cd, TM1.ArtCod, TM1.ArtCorOri, TM1.ArtEncOri, TM1.ArtUsrCod, TM1.ArtDsc, T3.CliNom, TM1.ArtCodExt, T2.EmprNom, TM1.ArtMat, T4.TipArtDsc, TM1.ArtPml, TM1.ArtGraCru, TM1.ArtCruMin, TM1.ArtCruMax, TM1.ArtAcaMin, TM1.ArtAcaMax, TM1.ArtRen, TM1.ArtTipPle, TM1.ArtTipLar, TM1.ArtSua, TM1.ArtAcaQui, TM1.ArtEti, T3.CliEti, T3.CliUrg, TM1.ArtUrg, TM1.ArtMer, TM1.ArtTra1, TM1.ArtTra2, TM1.ArtTra3, TM1.ArtTraP1, TM1.ArtTraP2, TM1.ArtTraP3, TM1.ArtUrd1, TM1.ArtUrd2, TM1.ArtUrd3, TM1.ArtUrdP1, TM1.ArtUrdP2, TM1.ArtUrdP3, TM1.ArtEncCom, TM1.ArtEncAnh, TM1.ArtGraAca, TM1.ArtRdoA, TM1.ArtRdoN, TM1.ArtFacAbs, TM1.ArtPle2, TM1.ArtNumCor, TM1.ArtAncSal1, TM1.ArtAncSal2, TM1.ArtAncSal3, TM1.ArtGraAca2, TM1.ArtGraCru2, TM1.ArtPmPPza, TM1.ArtFecCre, TM1.ArtFecMod, T5.ClasDsc, TM1.ArtComer, T6.ClaTubDsc, T7.ClaBolDsc, TM1.ArtRdoCru1, TM1.ArtRdoCru2, TM1.ArtNMtr, TM1.ArtLu, TM1.ArtRb, TM1.ArtPelAnh, TM1.Artgrm2Sc, TM1.ArtPmlSc, TM1.ArtAncSc, TM1.ArtPmlCru, TM1.ArtRdtSc, TM1.ArtUnd, TM1.ArtBlo, TM1.ArtCla, T4.TipArtDsc2, TM1.ArtFabsH, TM1.ArtFabsT, TM1.ArtNProg, TM1.ArtVbd, TM1.ArtVbn, TM1.ArtAb, TM1.ArtObsGrm, TM1.ArtObsAnc, TM1.ArtCdb, TM1.ArtGalga, TM1.ArtPlatina, TM1.ArtPgd, T8.ProceNom AS ArtThN, T9.Art_Dc, TM1.ArtHilos, TM1.ArtPasad, TM1.ArtAncC, TM1.ArtGrm2C, TM1.ArtRdoC, TM1.ArtAcaFor, TM1.ArtAnu, TM1.ArtFacUti, TM1.ArtNumTip, TM1.ArtMT, TM1.ArtTRabs, TM1.ArtKgMn, TM1.ArtAcaMar FROM ((((((((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPART T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipArtCod = TM1.TipArtCod) LEFT JOIN TXPCLAPEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.ClasCod = TM1.ClasCod) LEFT JOIN TXPClaTub T6 ON T6.EmprCod = TM1.EmprCod AND T6.ClaTubCod = TM1.ClaTubCod) LEFT JOIN TXPClaBol T7 ON T7.EmprCod = TM1.EmprCod AND T7.ClaBolCod = TM1.ClaBolCod) LEFT JOIN TXPPROCED T8 ON T8.EmprCod = TM1.EmprCod AND T8.ProceCod = TM1.ArtTh) LEFT JOIN TXPTR0700 T9 ON T9.EmprCod = TM1.EmprCod AND T9.Art_Cd = TM1.Art_Cd) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000813", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000814", "SELECT TipArtDsc, TipArtDsc2 FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000815", "SELECT ProceNom AS ArtThN FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000816", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000817", "SELECT ClaBolDsc FROM TXPClaBol WHERE EmprCod = ? AND ClaBolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000818", "SELECT ClaTubDsc FROM TXPClaTub WHERE EmprCod = ? AND ClaTubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000819", "SELECT Art_Dc FROM TXPTR0700 WHERE EmprCod = ? AND Art_Cd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000820", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000821", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000822", "SELECT ArtObsLon, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsFac, ArtObsOtra, ArtActivo, EmprCod, CliCod, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd, ArtCod, ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000823", "SELECT ArtObsLon, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsFac, ArtObsOtra, ArtActivo, EmprCod, CliCod, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd, ArtCod, ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsLon, ArtObsFac, ArtObsOtra, ArtActivo, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000824", "INSERT INTO TXPARTICU(ArtCod, ArtCorOri, ArtEncOri, ArtUsrCod, ArtDsc, ArtCodExt, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtFecCre, ArtFecMod, ArtComer, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtAcaFor, ArtAnu, ArtFacUti, ArtNumTip, ArtMT, ArtTRabs, ArtKgMn, ArtAcaMar, ArtAcaBak, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtObsLon, ArtObsFac, ArtObsOtra, ArtActivo, EmprCod, CliCod, TipArtCod, ArtTh, ClasCod, ClaBolCod, ClaTubCod, Art_Cd, ArtObs, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNumTex1, ArtNumTex2, NumTexCod, ArtCosBase, ArtPreCap, ArtPrMEst, ULinPre, ArtPreUlAc, ArtPreUsrM, ArtAcaAnh, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtValMtr, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtPreObs, ArtPreEst, ArtDefEst, ArtPreUnd, Mat_ObsG) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("BC000825", "UPDATE TXPARTICU SET ArtCorOri=?, ArtEncOri=?, ArtUsrCod=?, ArtDsc=?, ArtCodExt=?, ArtMat=?, ArtPml=?, ArtGraCru=?, ArtCruMin=?, ArtCruMax=?, ArtAcaMin=?, ArtAcaMax=?, ArtRen=?, ArtTipPle=?, ArtTipLar=?, ArtSua=?, ArtAcaQui=?, ArtEti=?, ArtUrg=?, ArtMer=?, ArtTra1=?, ArtTra2=?, ArtTra3=?, ArtTraP1=?, ArtTraP2=?, ArtTraP3=?, ArtUrd1=?, ArtUrd2=?, ArtUrd3=?, ArtUrdP1=?, ArtUrdP2=?, ArtUrdP3=?, ArtEncCom=?, ArtEncAnh=?, ArtGraAca=?, ArtRdoA=?, ArtRdoN=?, ArtFacAbs=?, ArtPle2=?, ArtNumCor=?, ArtAncSal1=?, ArtAncSal2=?, ArtAncSal3=?, ArtGraAca2=?, ArtGraCru2=?, ArtPmPPza=?, ArtFecCre=?, ArtFecMod=?, ArtComer=?, ArtRdoCru1=?, ArtRdoCru2=?, ArtNMtr=?, ArtLu=?, ArtRb=?, ArtPelAnh=?, Artgrm2Sc=?, ArtPmlSc=?, ArtAncSc=?, ArtPmlCru=?, ArtRdtSc=?, ArtUnd=?, ArtBlo=?, ArtCla=?, ArtFabsH=?, ArtFabsT=?, ArtNProg=?, ArtVbd=?, ArtVbn=?, ArtAb=?, ArtObsGrm=?, ArtObsAnc=?, ArtCdb=?, ArtGalga=?, ArtPlatina=?, ArtPgd=?, ArtHilos=?, ArtPasad=?, ArtAncC=?, ArtGrm2C=?, ArtRdoC=?, ArtAcaFor=?, ArtAnu=?, ArtFacUti=?, ArtNumTip=?, ArtMT=?, ArtTRabs=?, ArtKgMn=?, ArtAcaMar=?, ArtAcaBak=?, ArtElgAnc=?, ArtElgLar=?, ArtRdoCru=?, ArtEncLarg=?, ArtEncAnc=?, ArtRdto4=?, Artdsc2=?, ArtgrComp=?, ArtKgspp=?, ArtPrepp=?, ArtObsLon=?, ArtObsFac=?, ArtObsOtra=?, ArtActivo=?, TipArtCod=?, ArtTh=?, ClasCod=?, ClaBolCod=?, ClaTubCod=?, Art_Cd=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("BC000826", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("BC000827", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000828", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000829", "SELECT TipArtDsc, TipArtDsc2 FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000830", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000831", "SELECT ClaTubDsc FROM TXPClaTub WHERE EmprCod = ? AND ClaTubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000832", "SELECT ClaBolDsc FROM TXPClaBol WHERE EmprCod = ? AND ClaBolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000833", "SELECT ProceNom AS ArtThN FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000834", "SELECT Art_Dc FROM TXPTR0700 WHERE EmprCod = ? AND Art_Cd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000835", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000836", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000837", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000838", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000839", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000840", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000841", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000842", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000843", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000844", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000845", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000846", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000847", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000848", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000849", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000850", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000851", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000852", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000853", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000854", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000855", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000856", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000857", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000858", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000859", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000860", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000861", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000862", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000863", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000864", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000865", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000866", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000867", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000868", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000869", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000870", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000871", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000872", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000873", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000874", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000875", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000876", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000877", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000878", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000879", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtObsLon, TM1.ArtAcaBak, TM1.ArtElgAnc, TM1.ArtElgLar, TM1.ArtRdoCru, TM1.ArtEncLarg, TM1.ArtEncAnc, TM1.ArtRdto4, TM1.Artdsc2, TM1.ArtgrComp, TM1.ArtKgspp, TM1.ArtPrepp, TM1.ArtObsFac, TM1.ArtObsOtra, TM1.ArtActivo, TM1.EmprCod, TM1.CliCod, TM1.TipArtCod, TM1.ArtTh AS ArtTh, TM1.ClasCod, TM1.ClaBolCod, TM1.ClaTubCod, TM1.Art_Cd, TM1.ArtCod, TM1.ArtCorOri, TM1.ArtEncOri, TM1.ArtUsrCod, TM1.ArtDsc, T3.CliNom, TM1.ArtCodExt, T2.EmprNom, TM1.ArtMat, T4.TipArtDsc, TM1.ArtPml, TM1.ArtGraCru, TM1.ArtCruMin, TM1.ArtCruMax, TM1.ArtAcaMin, TM1.ArtAcaMax, TM1.ArtRen, TM1.ArtTipPle, TM1.ArtTipLar, TM1.ArtSua, TM1.ArtAcaQui, TM1.ArtEti, T3.CliEti, T3.CliUrg, TM1.ArtUrg, TM1.ArtMer, TM1.ArtTra1, TM1.ArtTra2, TM1.ArtTra3, TM1.ArtTraP1, TM1.ArtTraP2, TM1.ArtTraP3, TM1.ArtUrd1, TM1.ArtUrd2, TM1.ArtUrd3, TM1.ArtUrdP1, TM1.ArtUrdP2, TM1.ArtUrdP3, TM1.ArtEncCom, TM1.ArtEncAnh, TM1.ArtGraAca, TM1.ArtRdoA, TM1.ArtRdoN, TM1.ArtFacAbs, TM1.ArtPle2, TM1.ArtNumCor, TM1.ArtAncSal1, TM1.ArtAncSal2, TM1.ArtAncSal3, TM1.ArtGraAca2, TM1.ArtGraCru2, TM1.ArtPmPPza, TM1.ArtFecCre, TM1.ArtFecMod, T5.ClasDsc, TM1.ArtComer, T6.ClaTubDsc, T7.ClaBolDsc, TM1.ArtRdoCru1, TM1.ArtRdoCru2, TM1.ArtNMtr, TM1.ArtLu, TM1.ArtRb, TM1.ArtPelAnh, TM1.Artgrm2Sc, TM1.ArtPmlSc, TM1.ArtAncSc, TM1.ArtPmlCru, TM1.ArtRdtSc, TM1.ArtUnd, TM1.ArtBlo, TM1.ArtCla, T4.TipArtDsc2, TM1.ArtFabsH, TM1.ArtFabsT, TM1.ArtNProg, TM1.ArtVbd, TM1.ArtVbn, TM1.ArtAb, TM1.ArtObsGrm, TM1.ArtObsAnc, TM1.ArtCdb, TM1.ArtGalga, TM1.ArtPlatina, TM1.ArtPgd, T8.ProceNom AS ArtThN, T9.Art_Dc, TM1.ArtHilos, TM1.ArtPasad, TM1.ArtAncC, TM1.ArtGrm2C, TM1.ArtRdoC, TM1.ArtAcaFor, TM1.ArtAnu, TM1.ArtFacUti, TM1.ArtNumTip, TM1.ArtMT, TM1.ArtTRabs, TM1.ArtKgMn, TM1.ArtAcaMar FROM ((((((((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPART T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipArtCod = TM1.TipArtCod) LEFT JOIN TXPCLAPEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.ClasCod = TM1.ClasCod) LEFT JOIN TXPClaTub T6 ON T6.EmprCod = TM1.EmprCod AND T6.ClaTubCod = TM1.ClaTubCod) LEFT JOIN TXPClaBol T7 ON T7.EmprCod = TM1.EmprCod AND T7.ClaBolCod = TM1.ClaBolCod) LEFT JOIN TXPPROCED T8 ON T8.EmprCod = TM1.EmprCod AND T8.ProceCod = TM1.ArtTh) LEFT JOIN TXPTR0700 T9 ON T9.EmprCod = TM1.EmprCod AND T9.Art_Cd = TM1.Art_Cd) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000880", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000881", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000882", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000883", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(32);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(46, 4);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(48);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(50);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(53, 4);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((short[]) buf[101])[0] = rslt.getShort(54);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(55);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(56);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(57);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(58);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(59);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(63, 30);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(64);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((short[]) buf[123])[0] = rslt.getShort(65);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((short[]) buf[125])[0] = rslt.getShort(66);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((short[]) buf[127])[0] = rslt.getShort(67);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((short[]) buf[129])[0] = rslt.getShort(68);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(69);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[135])[0] = rslt.getGXDate(71);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[137])[0] = rslt.getGXDate(72);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(73, 16);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(76, 10);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[147])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(78);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((short[]) buf[151])[0] = rslt.getShort(79);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((short[]) buf[153])[0] = rslt.getShort(80);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((short[]) buf[155])[0] = rslt.getShort(81);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((short[]) buf[157])[0] = rslt.getShort(82);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((short[]) buf[159])[0] = rslt.getShort(83);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(86, 1);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((byte[]) buf[167])[0] = rslt.getByte(87);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[169])[0] = rslt.getBigDecimal(88,2);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(89,2);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((byte[]) buf[173])[0] = rslt.getByte(90);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((short[]) buf[175])[0] = rslt.getShort(91);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((short[]) buf[177])[0] = rslt.getShort(92);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((short[]) buf[179])[0] = rslt.getShort(93);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(94, 20);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(95, 20);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(96, 20);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(97, 10);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(98, 10);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(99, 10);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((short[]) buf[193])[0] = rslt.getShort(100);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((short[]) buf[195])[0] = rslt.getShort(101);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((short[]) buf[197])[0] = rslt.getShort(102);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((short[]) buf[199])[0] = rslt.getShort(103);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[201])[0] = rslt.getBigDecimal(104,2);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((int[]) buf[203])[0] = rslt.getInt(105);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((String[]) buf[205])[0] = rslt.getString(106, 1);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[207])[0] = rslt.getBigDecimal(107,2);
               ((boolean[]) buf[208])[0] = rslt.wasNull();
               ((int[]) buf[209])[0] = rslt.getInt(108);
               ((boolean[]) buf[210])[0] = rslt.wasNull();
               ((byte[]) buf[211])[0] = rslt.getByte(109);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((byte[]) buf[213])[0] = rslt.getByte(110);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[215])[0] = rslt.getBigDecimal(111,2);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(112, 1);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(32);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(46, 4);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(48);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(50);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(53, 4);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((short[]) buf[101])[0] = rslt.getShort(54);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(55);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(56);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(57);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(58);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(59);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(63, 30);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(64);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((short[]) buf[123])[0] = rslt.getShort(65);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((short[]) buf[125])[0] = rslt.getShort(66);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((short[]) buf[127])[0] = rslt.getShort(67);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((short[]) buf[129])[0] = rslt.getShort(68);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(69);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[135])[0] = rslt.getGXDate(71);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[137])[0] = rslt.getGXDate(72);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(73, 16);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(76, 10);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[147])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(78);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((short[]) buf[151])[0] = rslt.getShort(79);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((short[]) buf[153])[0] = rslt.getShort(80);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((short[]) buf[155])[0] = rslt.getShort(81);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((short[]) buf[157])[0] = rslt.getShort(82);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((short[]) buf[159])[0] = rslt.getShort(83);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(86, 1);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((byte[]) buf[167])[0] = rslt.getByte(87);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[169])[0] = rslt.getBigDecimal(88,2);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(89,2);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((byte[]) buf[173])[0] = rslt.getByte(90);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((short[]) buf[175])[0] = rslt.getShort(91);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((short[]) buf[177])[0] = rslt.getShort(92);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((short[]) buf[179])[0] = rslt.getShort(93);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(94, 20);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(95, 20);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(96, 20);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(97, 10);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(98, 10);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(99, 10);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((short[]) buf[193])[0] = rslt.getShort(100);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((short[]) buf[195])[0] = rslt.getShort(101);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((short[]) buf[197])[0] = rslt.getShort(102);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((short[]) buf[199])[0] = rslt.getShort(103);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[201])[0] = rslt.getBigDecimal(104,2);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((int[]) buf[203])[0] = rslt.getInt(105);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((String[]) buf[205])[0] = rslt.getString(106, 1);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[207])[0] = rslt.getBigDecimal(107,2);
               ((boolean[]) buf[208])[0] = rslt.wasNull();
               ((int[]) buf[209])[0] = rslt.getInt(108);
               ((boolean[]) buf[210])[0] = rslt.wasNull();
               ((byte[]) buf[211])[0] = rslt.getByte(109);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((byte[]) buf[213])[0] = rslt.getByte(110);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[215])[0] = rslt.getBigDecimal(111,2);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(112, 1);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 30);
               ((String[]) buf[52])[0] = rslt.getString(30, 3);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(32, 16);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(34);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(35);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(36);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(37);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(38);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(39);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(43, 6);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(46, 1);
               ((byte[]) buf[85])[0] = rslt.getByte(47);
               ((byte[]) buf[86])[0] = rslt.getByte(48);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(50, 4);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(53);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(54);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(55);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(56, 4);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(57, 4);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(58, 4);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(59);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(60);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((short[]) buf[112])[0] = rslt.getShort(61);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((short[]) buf[114])[0] = rslt.getShort(62);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((short[]) buf[116])[0] = rslt.getShort(63);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(64);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(68, 30);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(69);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(70);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(71);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(72);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(73);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(74);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[140])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[142])[0] = rslt.getGXDate(76);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[144])[0] = rslt.getGXDate(77);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(78, 40);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(79, 16);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(80, 30);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(81, 30);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[154])[0] = rslt.getBigDecimal(82,2);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[156])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(84, 10);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[160])[0] = rslt.getBigDecimal(85,2);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((short[]) buf[162])[0] = rslt.getShort(86);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((short[]) buf[164])[0] = rslt.getShort(87);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((short[]) buf[166])[0] = rslt.getShort(88);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((short[]) buf[168])[0] = rslt.getShort(89);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((short[]) buf[170])[0] = rslt.getShort(90);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((short[]) buf[172])[0] = rslt.getShort(91);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[174])[0] = rslt.getBigDecimal(92,2);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((byte[]) buf[180])[0] = rslt.getByte(95);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(96, 80);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[184])[0] = rslt.getBigDecimal(97,2);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[186])[0] = rslt.getBigDecimal(98,2);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((byte[]) buf[188])[0] = rslt.getByte(99);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((short[]) buf[190])[0] = rslt.getShort(100);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((short[]) buf[192])[0] = rslt.getShort(101);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((short[]) buf[194])[0] = rslt.getShort(102);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(103, 20);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(104, 20);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(105, 20);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(106, 10);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((String[]) buf[204])[0] = rslt.getString(107, 10);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((String[]) buf[206])[0] = rslt.getString(108, 10);
               ((boolean[]) buf[207])[0] = rslt.wasNull();
               ((String[]) buf[208])[0] = rslt.getString(109, 30);
               ((boolean[]) buf[209])[0] = rslt.wasNull();
               ((String[]) buf[210])[0] = rslt.getString(110, 40);
               ((boolean[]) buf[211])[0] = rslt.wasNull();
               ((short[]) buf[212])[0] = rslt.getShort(111);
               ((boolean[]) buf[213])[0] = rslt.wasNull();
               ((short[]) buf[214])[0] = rslt.getShort(112);
               ((boolean[]) buf[215])[0] = rslt.wasNull();
               ((short[]) buf[216])[0] = rslt.getShort(113);
               ((boolean[]) buf[217])[0] = rslt.wasNull();
               ((short[]) buf[218])[0] = rslt.getShort(114);
               ((boolean[]) buf[219])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[220])[0] = rslt.getBigDecimal(115,2);
               ((boolean[]) buf[221])[0] = rslt.wasNull();
               ((int[]) buf[222])[0] = rslt.getInt(116);
               ((boolean[]) buf[223])[0] = rslt.wasNull();
               ((String[]) buf[224])[0] = rslt.getString(117, 1);
               ((boolean[]) buf[225])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[226])[0] = rslt.getBigDecimal(118,2);
               ((boolean[]) buf[227])[0] = rslt.wasNull();
               ((int[]) buf[228])[0] = rslt.getInt(119);
               ((boolean[]) buf[229])[0] = rslt.wasNull();
               ((byte[]) buf[230])[0] = rslt.getByte(120);
               ((boolean[]) buf[231])[0] = rslt.wasNull();
               ((byte[]) buf[232])[0] = rslt.getByte(121);
               ((boolean[]) buf[233])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[234])[0] = rslt.getBigDecimal(122,2);
               ((boolean[]) buf[235])[0] = rslt.wasNull();
               ((String[]) buf[236])[0] = rslt.getString(123, 1);
               ((boolean[]) buf[237])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(32);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(46, 4);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(48);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(50);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(53, 4);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((short[]) buf[101])[0] = rslt.getShort(54);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(55);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(56);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(57);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(58);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(59);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(63, 30);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(64);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((short[]) buf[123])[0] = rslt.getShort(65);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((short[]) buf[125])[0] = rslt.getShort(66);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((short[]) buf[127])[0] = rslt.getShort(67);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((short[]) buf[129])[0] = rslt.getShort(68);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(69);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[135])[0] = rslt.getGXDate(71);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[137])[0] = rslt.getGXDate(72);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(73, 16);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(76, 10);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[147])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(78);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((short[]) buf[151])[0] = rslt.getShort(79);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((short[]) buf[153])[0] = rslt.getShort(80);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((short[]) buf[155])[0] = rslt.getShort(81);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((short[]) buf[157])[0] = rslt.getShort(82);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((short[]) buf[159])[0] = rslt.getShort(83);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(86, 1);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((byte[]) buf[167])[0] = rslt.getByte(87);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[169])[0] = rslt.getBigDecimal(88,2);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(89,2);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((byte[]) buf[173])[0] = rslt.getByte(90);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((short[]) buf[175])[0] = rslt.getShort(91);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((short[]) buf[177])[0] = rslt.getShort(92);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((short[]) buf[179])[0] = rslt.getShort(93);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(94, 20);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(95, 20);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(96, 20);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(97, 10);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(98, 10);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(99, 10);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((short[]) buf[193])[0] = rslt.getShort(100);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((short[]) buf[195])[0] = rslt.getShort(101);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((short[]) buf[197])[0] = rslt.getShort(102);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((short[]) buf[199])[0] = rslt.getShort(103);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[201])[0] = rslt.getBigDecimal(104,2);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((int[]) buf[203])[0] = rslt.getInt(105);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((String[]) buf[205])[0] = rslt.getString(106, 1);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[207])[0] = rslt.getBigDecimal(107,2);
               ((boolean[]) buf[208])[0] = rslt.wasNull();
               ((int[]) buf[209])[0] = rslt.getInt(108);
               ((boolean[]) buf[210])[0] = rslt.wasNull();
               ((byte[]) buf[211])[0] = rslt.getByte(109);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((byte[]) buf[213])[0] = rslt.getByte(110);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[215])[0] = rslt.getBigDecimal(111,2);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(112, 1);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(32);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(46, 4);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(48);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(50);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(53, 4);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((short[]) buf[101])[0] = rslt.getShort(54);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(55);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(56);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(57);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(58);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(59);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(63, 30);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((short[]) buf[121])[0] = rslt.getShort(64);
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((short[]) buf[123])[0] = rslt.getShort(65);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((short[]) buf[125])[0] = rslt.getShort(66);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((short[]) buf[127])[0] = rslt.getShort(67);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((short[]) buf[129])[0] = rslt.getShort(68);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((short[]) buf[131])[0] = rslt.getShort(69);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[135])[0] = rslt.getGXDate(71);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[137])[0] = rslt.getGXDate(72);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(73, 16);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(76, 10);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[147])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(78);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((short[]) buf[151])[0] = rslt.getShort(79);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((short[]) buf[153])[0] = rslt.getShort(80);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((short[]) buf[155])[0] = rslt.getShort(81);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((short[]) buf[157])[0] = rslt.getShort(82);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((short[]) buf[159])[0] = rslt.getShort(83);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(86, 1);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((byte[]) buf[167])[0] = rslt.getByte(87);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[169])[0] = rslt.getBigDecimal(88,2);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(89,2);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((byte[]) buf[173])[0] = rslt.getByte(90);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((short[]) buf[175])[0] = rslt.getShort(91);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((short[]) buf[177])[0] = rslt.getShort(92);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((short[]) buf[179])[0] = rslt.getShort(93);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(94, 20);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(95, 20);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(96, 20);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(97, 10);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(98, 10);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(99, 10);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((short[]) buf[193])[0] = rslt.getShort(100);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((short[]) buf[195])[0] = rslt.getShort(101);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((short[]) buf[197])[0] = rslt.getShort(102);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((short[]) buf[199])[0] = rslt.getShort(103);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[201])[0] = rslt.getBigDecimal(104,2);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((int[]) buf[203])[0] = rslt.getInt(105);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((String[]) buf[205])[0] = rslt.getString(106, 1);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[207])[0] = rslt.getBigDecimal(107,2);
               ((boolean[]) buf[208])[0] = rslt.wasNull();
               ((int[]) buf[209])[0] = rslt.getInt(108);
               ((boolean[]) buf[210])[0] = rslt.wasNull();
               ((byte[]) buf[211])[0] = rslt.getByte(109);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((byte[]) buf[213])[0] = rslt.getByte(110);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[215])[0] = rslt.getBigDecimal(111,2);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(112, 1);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1);
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((String[]) buf[43])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 30);
               ((String[]) buf[52])[0] = rslt.getString(30, 3);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(32, 16);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(34);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(35);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(36);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(37);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(38);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(39);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(43, 6);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(46, 1);
               ((byte[]) buf[85])[0] = rslt.getByte(47);
               ((byte[]) buf[86])[0] = rslt.getByte(48);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(50, 4);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(53);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(54);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(55);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(56, 4);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(57, 4);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(58, 4);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(59);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(60);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((short[]) buf[112])[0] = rslt.getShort(61);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((short[]) buf[114])[0] = rslt.getShort(62);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((short[]) buf[116])[0] = rslt.getShort(63);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(64);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(68, 30);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(69);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(70);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(71);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(72);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(73);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(74);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[140])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[142])[0] = rslt.getGXDate(76);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[144])[0] = rslt.getGXDate(77);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(78, 40);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(79, 16);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(80, 30);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(81, 30);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[154])[0] = rslt.getBigDecimal(82,2);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[156])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(84, 10);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[160])[0] = rslt.getBigDecimal(85,2);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((short[]) buf[162])[0] = rslt.getShort(86);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((short[]) buf[164])[0] = rslt.getShort(87);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((short[]) buf[166])[0] = rslt.getShort(88);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((short[]) buf[168])[0] = rslt.getShort(89);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((short[]) buf[170])[0] = rslt.getShort(90);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((short[]) buf[172])[0] = rslt.getShort(91);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[174])[0] = rslt.getBigDecimal(92,2);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((byte[]) buf[180])[0] = rslt.getByte(95);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(96, 80);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[184])[0] = rslt.getBigDecimal(97,2);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[186])[0] = rslt.getBigDecimal(98,2);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((byte[]) buf[188])[0] = rslt.getByte(99);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((short[]) buf[190])[0] = rslt.getShort(100);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((short[]) buf[192])[0] = rslt.getShort(101);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((short[]) buf[194])[0] = rslt.getShort(102);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getString(103, 20);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((String[]) buf[198])[0] = rslt.getString(104, 20);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(105, 20);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((String[]) buf[202])[0] = rslt.getString(106, 10);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((String[]) buf[204])[0] = rslt.getString(107, 10);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((String[]) buf[206])[0] = rslt.getString(108, 10);
               ((boolean[]) buf[207])[0] = rslt.wasNull();
               ((String[]) buf[208])[0] = rslt.getString(109, 30);
               ((boolean[]) buf[209])[0] = rslt.wasNull();
               ((String[]) buf[210])[0] = rslt.getString(110, 40);
               ((boolean[]) buf[211])[0] = rslt.wasNull();
               ((short[]) buf[212])[0] = rslt.getShort(111);
               ((boolean[]) buf[213])[0] = rslt.wasNull();
               ((short[]) buf[214])[0] = rslt.getShort(112);
               ((boolean[]) buf[215])[0] = rslt.wasNull();
               ((short[]) buf[216])[0] = rslt.getShort(113);
               ((boolean[]) buf[217])[0] = rslt.wasNull();
               ((short[]) buf[218])[0] = rslt.getShort(114);
               ((boolean[]) buf[219])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[220])[0] = rslt.getBigDecimal(115,2);
               ((boolean[]) buf[221])[0] = rslt.wasNull();
               ((int[]) buf[222])[0] = rslt.getInt(116);
               ((boolean[]) buf[223])[0] = rslt.wasNull();
               ((String[]) buf[224])[0] = rslt.getString(117, 1);
               ((boolean[]) buf[225])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[226])[0] = rslt.getBigDecimal(118,2);
               ((boolean[]) buf[227])[0] = rslt.wasNull();
               ((int[]) buf[228])[0] = rslt.getInt(119);
               ((boolean[]) buf[229])[0] = rslt.wasNull();
               ((byte[]) buf[230])[0] = rslt.getByte(120);
               ((boolean[]) buf[231])[0] = rslt.wasNull();
               ((byte[]) buf[232])[0] = rslt.getByte(121);
               ((boolean[]) buf[233])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[234])[0] = rslt.getBigDecimal(122,2);
               ((boolean[]) buf[235])[0] = rslt.wasNull();
               ((String[]) buf[236])[0] = rslt.getString(123, 1);
               ((boolean[]) buf[237])[0] = rslt.wasNull();
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 26);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 6);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 6);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 4);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 4);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 4);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 30);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DATE );
               }
               else
               {
                  stmt.setDate(48, (java.util.Date)parms[95]);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DATE );
               }
               else
               {
                  stmt.setDate(49, (java.util.Date)parms[97]);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 16);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 10);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[109]).shortValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[111]).shortValue());
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[113]).shortValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(58, ((Number) parms[115]).shortValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[119]).shortValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(61, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[125], 1);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(64, ((Number) parms[127]).byteValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(67, ((Number) parms[133]).byteValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[135]).shortValue());
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[137]).shortValue());
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[139]).shortValue());
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[141], 20);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[143], 20);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 20);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[147], 10);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[149], 10);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[151], 10);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(77, ((Number) parms[153]).shortValue());
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(78, ((Number) parms[155]).shortValue());
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(79, ((Number) parms[157]).shortValue());
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(80, ((Number) parms[159]).shortValue());
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(81, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(82, ((Number) parms[163]).intValue());
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[165], 1);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(85, ((Number) parms[169]).intValue());
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(86, ((Number) parms[171]).byteValue());
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(87, ((Number) parms[173]).byteValue());
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(88, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[179], 1);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(91, (java.math.BigDecimal)parms[181], 2);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(92, (java.math.BigDecimal)parms[183], 2);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(93, (java.math.BigDecimal)parms[185], 2);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(94, (java.math.BigDecimal)parms[187], 2);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(95, (java.math.BigDecimal)parms[189], 2);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(96, (java.math.BigDecimal)parms[191], 4);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(97, (String)parms[193], 60);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(98, (java.math.BigDecimal)parms[195], 2);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(99, (java.math.BigDecimal)parms[197], 2);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(100, (java.math.BigDecimal)parms[199], 2);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(101, (String)parms[201]);
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[203], 40);
               }
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(103, (String)parms[205], 200);
               }
               stmt.setString(104, (String)parms[206], 1);
               stmt.setString(105, (String)parms[207], 3);
               if ( ((Boolean) parms[208]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(106, ((Number) parms[209]).intValue());
               }
               stmt.setShort(107, ((Number) parms[210]).shortValue());
               if ( ((Boolean) parms[211]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(108, ((Number) parms[212]).shortValue());
               }
               if ( ((Boolean) parms[213]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(109, ((Number) parms[214]).shortValue());
               }
               if ( ((Boolean) parms[215]).booleanValue() )
               {
                  stmt.setNull( 110 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(110, ((Number) parms[216]).shortValue());
               }
               if ( ((Boolean) parms[217]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(111, ((Number) parms[218]).shortValue());
               }
               if ( ((Boolean) parms[219]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(112, ((Number) parms[220]).shortValue());
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 10);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 6);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 4);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 30);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DATE );
               }
               else
               {
                  stmt.setDate(47, (java.util.Date)parms[93]);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DATE );
               }
               else
               {
                  stmt.setDate(48, (java.util.Date)parms[95]);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 16);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 10);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[107]).shortValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[109]).shortValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[111]).shortValue());
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[113]).shortValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(58, ((Number) parms[115]).shortValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[119], 2);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[121], 1);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(63, ((Number) parms[125]).byteValue());
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(66, ((Number) parms[131]).byteValue());
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[133]).shortValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[135]).shortValue());
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[137]).shortValue());
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[139], 20);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[141], 20);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[143], 20);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 10);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[147], 10);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[149], 10);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(76, ((Number) parms[151]).shortValue());
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(77, ((Number) parms[153]).shortValue());
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(78, ((Number) parms[155]).shortValue());
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(79, ((Number) parms[157]).shortValue());
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(80, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(81, ((Number) parms[161]).intValue());
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[163], 1);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(83, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(84, ((Number) parms[167]).intValue());
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(85, ((Number) parms[169]).byteValue());
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(86, ((Number) parms[171]).byteValue());
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(87, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[175], 1);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(90, (java.math.BigDecimal)parms[179], 2);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(91, (java.math.BigDecimal)parms[181], 2);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(92, (java.math.BigDecimal)parms[183], 2);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(93, (java.math.BigDecimal)parms[185], 2);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(94, (java.math.BigDecimal)parms[187], 2);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(95, (java.math.BigDecimal)parms[189], 4);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(96, (String)parms[191], 60);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(97, (java.math.BigDecimal)parms[193], 2);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(98, (java.math.BigDecimal)parms[195], 2);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(99, (java.math.BigDecimal)parms[197], 2);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(100, (String)parms[199]);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(101, (String)parms[201], 40);
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(102, (String)parms[203], 200);
               }
               stmt.setString(103, (String)parms[204], 1);
               stmt.setShort(104, ((Number) parms[205]).shortValue());
               if ( ((Boolean) parms[206]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(105, ((Number) parms[207]).shortValue());
               }
               if ( ((Boolean) parms[208]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(106, ((Number) parms[209]).shortValue());
               }
               if ( ((Boolean) parms[210]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(107, ((Number) parms[211]).shortValue());
               }
               if ( ((Boolean) parms[212]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(108, ((Number) parms[213]).shortValue());
               }
               if ( ((Boolean) parms[214]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(109, ((Number) parms[215]).shortValue());
               }
               stmt.setString(110, (String)parms[216], 3);
               if ( ((Boolean) parms[217]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(111, ((Number) parms[218]).intValue());
               }
               if ( ((Boolean) parms[219]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(112, (String)parms[220], 16);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

