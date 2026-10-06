package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calprd_trn_bc extends GXWebPanel implements IGxSilentTrn
{
   public calprd_trn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public calprd_trn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_trn_bc.class ));
   }

   public calprd_trn_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1Q73( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1Q73( ) ;
      standaloneModal( ) ;
      addRow1Q73( ) ;
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
         e111Q72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z30AlbProCod = A30AlbProCod ;
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

   public void confirm_1Q70( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1Q73( ) ;
         }
         else
         {
            checkExtendedTable1Q73( ) ;
            if ( AnyError == 0 )
            {
               zm1Q73( 19) ;
               zm1Q73( 20) ;
               zm1Q73( 21) ;
               zm1Q73( 22) ;
               zm1Q73( 23) ;
               zm1Q73( 24) ;
            }
            closeExtendedTableCursors1Q73( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121Q72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      calprd_trn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      calprd_trn_bc.this.A396EmprCod = GXv_char2[0] ;
      calprd_trn_bc.this.AV8EmprNom = GXv_char3[0] ;
      calprd_trn_bc.this.AV9UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV24FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      calprd_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV24FirmaD = GXt_int5 ;
      GXt_int7 = AV25avisar ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ATAVIS", ""), GXv_int8) ;
      calprd_trn_bc.this.GXt_int7 = GXv_int8[0] ;
      AV25avisar = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV31Ctrlf) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      calprd_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31Ctrlf = GXt_int5 ;
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      calprd_trn_bc.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      calprd_trn_bc.this.AV10EmprCod = GXv_char4[0] ;
      calprd_trn_bc.this.AV8EmprNom = GXv_char3[0] ;
      calprd_trn_bc.this.AV9UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext9[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV12WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV13TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV33Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV34GXV1 = 1 ;
         while ( AV34GXV1 <= AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV34GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV15Insert_GuiRemCli = (int)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV16Insert_TrnCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbDivCod") == 0 )
            {
               AV17Insert_AlbDivCod = (byte)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV18Insert_EmprGuiRem = AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
            }
            AV34GXV1 = (int)(AV34GXV1+1) ;
         }
      }
   }

   public void e111Q72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1Q73( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         Z39AlbProPri = A39AlbProPri ;
         Z33AlbProEst = A33AlbProEst ;
         Z34AlbProfch = A34AlbProfch ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3868AlbMat = A3868AlbMat ;
         Z2242AlbSec = A2242AlbSec ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         Z841TrnNom = A841TrnNom ;
         Z3643TrnNif = A3643TrnNif ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         Z841TrnNom = A841TrnNom ;
         Z3643TrnNif = A3643TrnNif ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
      if ( GX_JID == -18 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z39AlbProPri = A39AlbProPri ;
         Z33AlbProEst = A33AlbProEst ;
         Z34AlbProfch = A34AlbProfch ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3868AlbMat = A3868AlbMat ;
         Z2242AlbSec = A2242AlbSec ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "Calprd_TRN_BC" ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01Q710 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01Q710_A407EmprNom[0] ;
      n407EmprNom = BC01Q710_n407EmprNom[0] ;
      pr_default.close(8);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && ( Gx_BScreen == 0 ) )
      {
         A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) && ( Gx_BScreen == 0 ) )
      {
         A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A7098AlbUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7098AlbUsu = AV9UsurCod ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10765AlbProAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10765AlbProAT = " " ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10019AlbHhfm) && ( Gx_BScreen == 0 ) )
      {
         A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      }
   }

   public void load1Q73( )
   {
      /* Using cursor BC01Q711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A39AlbProPri = BC01Q711_A39AlbProPri[0] ;
         A33AlbProEst = BC01Q711_A33AlbProEst[0] ;
         A34AlbProfch = BC01Q711_A34AlbProfch[0] ;
         A4023AlbFecSal = BC01Q711_A4023AlbFecSal[0] ;
         A3865AlbHorSal = BC01Q711_A3865AlbHorSal[0] ;
         A7098AlbUsu = BC01Q711_A7098AlbUsu[0] ;
         A1244GuiRemCln = BC01Q711_A1244GuiRemCln[0] ;
         A3869AlbCliDes = BC01Q711_A3869AlbCliDes[0] ;
         A1259AlbDomEnv = BC01Q711_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = BC01Q711_n1259AlbDomEnv[0] ;
         A3868AlbMat = BC01Q711_A3868AlbMat[0] ;
         A2242AlbSec = BC01Q711_A2242AlbSec[0] ;
         A5805AlbEnvFtp = BC01Q711_A5805AlbEnvFtp[0] ;
         A7101AlbLic = BC01Q711_A7101AlbLic[0] ;
         A10765AlbProAT = BC01Q711_A10765AlbProAT[0] ;
         A10019AlbHhfm = BC01Q711_A10019AlbHhfm[0] ;
         A10020AlbGrossT = BC01Q711_A10020AlbGrossT[0] ;
         A10837AlbTrnNc = BC01Q711_A10837AlbTrnNc[0] ;
         A10017AlbFmd = BC01Q711_A10017AlbFmd[0] ;
         n10017AlbFmd = BC01Q711_n10017AlbFmd[0] ;
         A10835AlbTrnNm = BC01Q711_A10835AlbTrnNm[0] ;
         A10018ALbFmdc = BC01Q711_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = BC01Q711_A10836AlbTrnDm[0] ;
         A5140AlbMarca = BC01Q711_A5140AlbMarca[0] ;
         A3867AlbLocDes = BC01Q711_A3867AlbLocDes[0] ;
         A3866AlbLocCar = BC01Q711_A3866AlbLocCar[0] ;
         A914AlbPObsCon = BC01Q711_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = BC01Q711_A5141AlbIvaCod[0] ;
         A7987AlbColCa = BC01Q711_A7987AlbColCa[0] ;
         A7162AlbDesp = BC01Q711_A7162AlbDesp[0] ;
         A7986AlbCambio = BC01Q711_A7986AlbCambio[0] ;
         A7985AlbTipDoc = BC01Q711_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = BC01Q711_A7984AlbMotTr[0] ;
         A5803AlbTipCal = BC01Q711_A5803AlbTipCal[0] ;
         A7988AlbObsCb = BC01Q711_A7988AlbObsCb[0] ;
         A7102AlbNumT = BC01Q711_A7102AlbNumT[0] ;
         A7100AlbMarCo = BC01Q711_A7100AlbMarCo[0] ;
         A7099AlbOComp = BC01Q711_A7099AlbOComp[0] ;
         A3093AlbDivTCod = BC01Q711_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = BC01Q711_n3093AlbDivTCod[0] ;
         A3109AlbDivAbr = BC01Q711_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = BC01Q711_n3109AlbDivAbr[0] ;
         A1258GuiRemDom = BC01Q711_A1258GuiRemDom[0] ;
         n1258GuiRemDom = BC01Q711_n1258GuiRemDom[0] ;
         A3145GuiRemDivT = BC01Q711_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = BC01Q711_n3145GuiRemDivT[0] ;
         A407EmprNom = BC01Q711_A407EmprNom[0] ;
         n407EmprNom = BC01Q711_n407EmprNom[0] ;
         A1253EmprGuiRem = BC01Q711_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = BC01Q711_A1243GuiRemCli[0] ;
         A840TrnCod = BC01Q711_A840TrnCod[0] ;
         A3108AlbDivCod = BC01Q711_A3108AlbDivCod[0] ;
         n3108AlbDivCod = BC01Q711_n3108AlbDivCod[0] ;
         A3110GuiRemDiv = BC01Q711_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = BC01Q711_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = BC01Q711_A1260BusDomEnv[0] ;
         n1260BusDomEnv = BC01Q711_n1260BusDomEnv[0] ;
         zm1Q73( -18) ;
      }
      pr_default.close(9);
      onLoadActions1Q73( ) ;
   }

   public void onLoadActions1Q73( )
   {
      /* Using cursor BC01Q712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A841TrnNom = BC01Q712_A841TrnNom[0] ;
      n841TrnNom = BC01Q712_n841TrnNom[0] ;
      A3643TrnNif = BC01Q712_A3643TrnNif[0] ;
      n3643TrnNif = BC01Q712_n3643TrnNif[0] ;
      pr_default.close(10);
      /* Using cursor BC01Q713 */
      pr_default.execute(11, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A841TrnNom = BC01Q713_A841TrnNom[0] ;
      n841TrnNom = BC01Q713_n841TrnNom[0] ;
      A3643TrnNif = BC01Q713_A3643TrnNif[0] ;
      n3643TrnNif = BC01Q713_n3643TrnNif[0] ;
      pr_default.close(11);
      if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
      {
         A3108AlbDivCod = (byte)(2) ;
         n3108AlbDivCod = false ;
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3108AlbDivCod = A3110GuiRemDiv ;
            n3108AlbDivCod = false ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
      }
   }

   public void checkExtendedTable1Q73( )
   {
      nIsDirty_3 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01Q714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = BC01Q714_A841TrnNom[0] ;
      n841TrnNom = BC01Q714_n841TrnNom[0] ;
      A3643TrnNif = BC01Q714_A3643TrnNif[0] ;
      n3643TrnNif = BC01Q714_n3643TrnNif[0] ;
      pr_default.close(12);
      if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV24FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV25avisar == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A39AlbProPri, "0") == 0 ) || ( GXutil.strcmp(A39AlbProPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia JÁ Faturada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC01Q715 */
      pr_default.execute(13, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = BC01Q715_A1244GuiRemCln[0] ;
      A3145GuiRemDivT = BC01Q715_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = BC01Q715_n3145GuiRemDivT[0] ;
      A3110GuiRemDiv = BC01Q715_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = BC01Q715_n3110GuiRemDiv[0] ;
      pr_default.close(13);
      /* Using cursor BC01Q716 */
      pr_default.execute(14, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A1260BusDomEnv = BC01Q716_A1260BusDomEnv[0] ;
         n1260BusDomEnv = BC01Q716_n1260BusDomEnv[0] ;
      }
      else
      {
         nIsDirty_3 = (short)(1) ;
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
      }
      pr_default.close(14);
      /* Using cursor BC01Q717 */
      pr_default.execute(15, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
      }
      A841TrnNom = BC01Q717_A841TrnNom[0] ;
      n841TrnNom = BC01Q717_n841TrnNom[0] ;
      A3643TrnNif = BC01Q717_A3643TrnNif[0] ;
      n3643TrnNif = BC01Q717_n3643TrnNif[0] ;
      pr_default.close(15);
      if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3108AlbDivCod = (byte)(2) ;
         n3108AlbDivCod = false ;
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3108AlbDivCod = A3110GuiRemDiv ;
            n3108AlbDivCod = false ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3869AlbCliDes = A1243GuiRemCli ;
      }
      /* Using cursor BC01Q718 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
         }
      }
      A3109AlbDivAbr = BC01Q718_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = BC01Q718_n3109AlbDivAbr[0] ;
      pr_default.close(16);
   }

   public void closeExtendedTableCursors1Q73( )
   {
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
   }

   public void enableDisable( )
   {
   }

   public void getKey1Q73( )
   {
      /* Using cursor BC01Q719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01Q720 */
      pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(18) != 101) && ( GXutil.strcmp(BC01Q720_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1Q73( 18) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = BC01Q720_A30AlbProCod[0] ;
         A39AlbProPri = BC01Q720_A39AlbProPri[0] ;
         A33AlbProEst = BC01Q720_A33AlbProEst[0] ;
         A34AlbProfch = BC01Q720_A34AlbProfch[0] ;
         A4023AlbFecSal = BC01Q720_A4023AlbFecSal[0] ;
         A3865AlbHorSal = BC01Q720_A3865AlbHorSal[0] ;
         A7098AlbUsu = BC01Q720_A7098AlbUsu[0] ;
         A3869AlbCliDes = BC01Q720_A3869AlbCliDes[0] ;
         A1259AlbDomEnv = BC01Q720_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = BC01Q720_n1259AlbDomEnv[0] ;
         A3868AlbMat = BC01Q720_A3868AlbMat[0] ;
         A2242AlbSec = BC01Q720_A2242AlbSec[0] ;
         A5805AlbEnvFtp = BC01Q720_A5805AlbEnvFtp[0] ;
         A7101AlbLic = BC01Q720_A7101AlbLic[0] ;
         A10765AlbProAT = BC01Q720_A10765AlbProAT[0] ;
         A10019AlbHhfm = BC01Q720_A10019AlbHhfm[0] ;
         A10020AlbGrossT = BC01Q720_A10020AlbGrossT[0] ;
         A10837AlbTrnNc = BC01Q720_A10837AlbTrnNc[0] ;
         A10017AlbFmd = BC01Q720_A10017AlbFmd[0] ;
         n10017AlbFmd = BC01Q720_n10017AlbFmd[0] ;
         A10835AlbTrnNm = BC01Q720_A10835AlbTrnNm[0] ;
         A10018ALbFmdc = BC01Q720_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = BC01Q720_A10836AlbTrnDm[0] ;
         A5140AlbMarca = BC01Q720_A5140AlbMarca[0] ;
         A3867AlbLocDes = BC01Q720_A3867AlbLocDes[0] ;
         A3866AlbLocCar = BC01Q720_A3866AlbLocCar[0] ;
         A914AlbPObsCon = BC01Q720_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = BC01Q720_A5141AlbIvaCod[0] ;
         A7987AlbColCa = BC01Q720_A7987AlbColCa[0] ;
         A7162AlbDesp = BC01Q720_A7162AlbDesp[0] ;
         A7986AlbCambio = BC01Q720_A7986AlbCambio[0] ;
         A7985AlbTipDoc = BC01Q720_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = BC01Q720_A7984AlbMotTr[0] ;
         A5803AlbTipCal = BC01Q720_A5803AlbTipCal[0] ;
         A7988AlbObsCb = BC01Q720_A7988AlbObsCb[0] ;
         A7102AlbNumT = BC01Q720_A7102AlbNumT[0] ;
         A7100AlbMarCo = BC01Q720_A7100AlbMarCo[0] ;
         A7099AlbOComp = BC01Q720_A7099AlbOComp[0] ;
         A3093AlbDivTCod = BC01Q720_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = BC01Q720_n3093AlbDivTCod[0] ;
         A1258GuiRemDom = BC01Q720_A1258GuiRemDom[0] ;
         n1258GuiRemDom = BC01Q720_n1258GuiRemDom[0] ;
         A1253EmprGuiRem = BC01Q720_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = BC01Q720_A1243GuiRemCli[0] ;
         A840TrnCod = BC01Q720_A840TrnCod[0] ;
         A3108AlbDivCod = BC01Q720_A3108AlbDivCod[0] ;
         n3108AlbDivCod = BC01Q720_n3108AlbDivCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1Q73( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1Q73( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1Q73( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(18);
   }

   public void getEqualNoModal( )
   {
      getKey1Q73( ) ;
      if ( RcdFound3 == 0 )
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
      confirm_1Q70( ) ;
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

   public void checkOptimisticConcurrency1Q73( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01Q721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(19) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(19) == 101) || ( GXutil.strcmp(Z39AlbProPri, BC01Q721_A39AlbProPri[0]) != 0 ) || ( Z33AlbProEst != BC01Q721_A33AlbProEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(BC01Q721_A34AlbProfch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(BC01Q721_A4023AlbFecSal[0])) ) || ( GXutil.strcmp(Z3865AlbHorSal, BC01Q721_A3865AlbHorSal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7098AlbUsu, BC01Q721_A7098AlbUsu[0]) != 0 ) || ( Z3869AlbCliDes != BC01Q721_A3869AlbCliDes[0] ) || ( Z1259AlbDomEnv != BC01Q721_A1259AlbDomEnv[0] ) || ( GXutil.strcmp(Z3868AlbMat, BC01Q721_A3868AlbMat[0]) != 0 ) || ( GXutil.strcmp(Z2242AlbSec, BC01Q721_A2242AlbSec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5805AlbEnvFtp != BC01Q721_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, BC01Q721_A7101AlbLic[0]) != 0 ) || ( GXutil.strcmp(Z10765AlbProAT, BC01Q721_A10765AlbProAT[0]) != 0 ) || !( GXutil.dateCompare(Z10019AlbHhfm, BC01Q721_A10019AlbHhfm[0]) ) || ( DecimalUtil.compareTo(Z10020AlbGrossT, BC01Q721_A10020AlbGrossT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10837AlbTrnNc, BC01Q721_A10837AlbTrnNc[0]) != 0 ) || ( GXutil.strcmp(Z10017AlbFmd, BC01Q721_A10017AlbFmd[0]) != 0 ) || ( GXutil.strcmp(Z10835AlbTrnNm, BC01Q721_A10835AlbTrnNm[0]) != 0 ) || ( GXutil.strcmp(Z10018ALbFmdc, BC01Q721_A10018ALbFmdc[0]) != 0 ) || ( GXutil.strcmp(Z10836AlbTrnDm, BC01Q721_A10836AlbTrnDm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5140AlbMarca, BC01Q721_A5140AlbMarca[0]) != 0 ) || ( Z3867AlbLocDes != BC01Q721_A3867AlbLocDes[0] ) || ( Z3866AlbLocCar != BC01Q721_A3866AlbLocCar[0] ) || ( Z914AlbPObsCon != BC01Q721_A914AlbPObsCon[0] ) || ( GXutil.strcmp(Z5141AlbIvaCod, BC01Q721_A5141AlbIvaCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7987AlbColCa, BC01Q721_A7987AlbColCa[0]) != 0 ) || ( Z7162AlbDesp != BC01Q721_A7162AlbDesp[0] ) || ( DecimalUtil.compareTo(Z7986AlbCambio, BC01Q721_A7986AlbCambio[0]) != 0 ) || ( Z7985AlbTipDoc != BC01Q721_A7985AlbTipDoc[0] ) || ( GXutil.strcmp(Z7984AlbMotTr, BC01Q721_A7984AlbMotTr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5803AlbTipCal != BC01Q721_A5803AlbTipCal[0] ) || ( GXutil.strcmp(Z7988AlbObsCb, BC01Q721_A7988AlbObsCb[0]) != 0 ) || ( Z7102AlbNumT != BC01Q721_A7102AlbNumT[0] ) || ( GXutil.strcmp(Z7100AlbMarCo, BC01Q721_A7100AlbMarCo[0]) != 0 ) || ( GXutil.strcmp(Z7099AlbOComp, BC01Q721_A7099AlbOComp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3093AlbDivTCod, BC01Q721_A3093AlbDivTCod[0]) != 0 ) || ( Z1258GuiRemDom != BC01Q721_A1258GuiRemDom[0] ) || ( GXutil.strcmp(Z1253EmprGuiRem, BC01Q721_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != BC01Q721_A1243GuiRemCli[0] ) || ( Z840TrnCod != BC01Q721_A840TrnCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3108AlbDivCod != BC01Q721_A3108AlbDivCod[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q73( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q73( 0) ;
         checkOptimisticConcurrency1Q73( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q73( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q73( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01Q722 */
                  pr_default.execute(20, new Object[] {Long.valueOf(A30AlbProCod), A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, A2242AlbSec, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1Q73( ) ;
         }
         endLevel1Q73( ) ;
      }
      closeExtendedTableCursors1Q73( ) ;
   }

   public void update1Q73( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q73( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q73( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q73( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01Q723 */
                  pr_default.execute(21, new Object[] {A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, A2242AlbSec, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q73( ) ;
                  if ( AnyError == 0 )
                  {
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
         endLevel1Q73( ) ;
      }
      closeExtendedTableCursors1Q73( ) ;
   }

   public void deferredUpdate1Q73( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q73( ) ;
         afterConfirm1Q73( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q73( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01Q724 */
               pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1Q73( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls1Q73( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV24FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV25avisar == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor BC01Q725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = BC01Q725_A841TrnNom[0] ;
         n841TrnNom = BC01Q725_n841TrnNom[0] ;
         A3643TrnNif = BC01Q725_A3643TrnNif[0] ;
         n3643TrnNif = BC01Q725_n3643TrnNif[0] ;
         pr_default.close(23);
         /* Using cursor BC01Q726 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = BC01Q726_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = BC01Q726_n3109AlbDivAbr[0] ;
         pr_default.close(24);
         /* Using cursor BC01Q727 */
         pr_default.execute(25, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = BC01Q727_A1244GuiRemCln[0] ;
         A3145GuiRemDivT = BC01Q727_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = BC01Q727_n3145GuiRemDivT[0] ;
         A3110GuiRemDiv = BC01Q727_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = BC01Q727_n3110GuiRemDiv[0] ;
         pr_default.close(25);
         /* Using cursor BC01Q728 */
         pr_default.execute(26, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = BC01Q728_A841TrnNom[0] ;
         n841TrnNom = BC01Q728_n841TrnNom[0] ;
         A3643TrnNif = BC01Q728_A3643TrnNif[0] ;
         n3643TrnNif = BC01Q728_n3643TrnNif[0] ;
         pr_default.close(26);
         /* Using cursor BC01Q729 */
         pr_default.execute(27, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A1260BusDomEnv = BC01Q729_A1260BusDomEnv[0] ;
            n1260BusDomEnv = BC01Q729_n1260BusDomEnv[0] ;
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
         }
         pr_default.close(27);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01Q730 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor BC01Q731 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor BC01Q732 */
         pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor BC01Q733 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor BC01Q734 */
         pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
      }
   }

   public void endLevel1Q73( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
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

   public void scanKeyStart1Q73( )
   {
      /* Scan By routine */
      /* Using cursor BC01Q735 */
      pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = BC01Q735_A30AlbProCod[0] ;
         A39AlbProPri = BC01Q735_A39AlbProPri[0] ;
         A33AlbProEst = BC01Q735_A33AlbProEst[0] ;
         A34AlbProfch = BC01Q735_A34AlbProfch[0] ;
         A4023AlbFecSal = BC01Q735_A4023AlbFecSal[0] ;
         A3865AlbHorSal = BC01Q735_A3865AlbHorSal[0] ;
         A7098AlbUsu = BC01Q735_A7098AlbUsu[0] ;
         A1244GuiRemCln = BC01Q735_A1244GuiRemCln[0] ;
         A3869AlbCliDes = BC01Q735_A3869AlbCliDes[0] ;
         A1259AlbDomEnv = BC01Q735_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = BC01Q735_n1259AlbDomEnv[0] ;
         A3868AlbMat = BC01Q735_A3868AlbMat[0] ;
         A2242AlbSec = BC01Q735_A2242AlbSec[0] ;
         A5805AlbEnvFtp = BC01Q735_A5805AlbEnvFtp[0] ;
         A7101AlbLic = BC01Q735_A7101AlbLic[0] ;
         A10765AlbProAT = BC01Q735_A10765AlbProAT[0] ;
         A10019AlbHhfm = BC01Q735_A10019AlbHhfm[0] ;
         A10020AlbGrossT = BC01Q735_A10020AlbGrossT[0] ;
         A10837AlbTrnNc = BC01Q735_A10837AlbTrnNc[0] ;
         A10017AlbFmd = BC01Q735_A10017AlbFmd[0] ;
         n10017AlbFmd = BC01Q735_n10017AlbFmd[0] ;
         A10835AlbTrnNm = BC01Q735_A10835AlbTrnNm[0] ;
         A10018ALbFmdc = BC01Q735_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = BC01Q735_A10836AlbTrnDm[0] ;
         A5140AlbMarca = BC01Q735_A5140AlbMarca[0] ;
         A3867AlbLocDes = BC01Q735_A3867AlbLocDes[0] ;
         A3866AlbLocCar = BC01Q735_A3866AlbLocCar[0] ;
         A914AlbPObsCon = BC01Q735_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = BC01Q735_A5141AlbIvaCod[0] ;
         A7987AlbColCa = BC01Q735_A7987AlbColCa[0] ;
         A7162AlbDesp = BC01Q735_A7162AlbDesp[0] ;
         A7986AlbCambio = BC01Q735_A7986AlbCambio[0] ;
         A7985AlbTipDoc = BC01Q735_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = BC01Q735_A7984AlbMotTr[0] ;
         A5803AlbTipCal = BC01Q735_A5803AlbTipCal[0] ;
         A7988AlbObsCb = BC01Q735_A7988AlbObsCb[0] ;
         A7102AlbNumT = BC01Q735_A7102AlbNumT[0] ;
         A7100AlbMarCo = BC01Q735_A7100AlbMarCo[0] ;
         A7099AlbOComp = BC01Q735_A7099AlbOComp[0] ;
         A3093AlbDivTCod = BC01Q735_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = BC01Q735_n3093AlbDivTCod[0] ;
         A3109AlbDivAbr = BC01Q735_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = BC01Q735_n3109AlbDivAbr[0] ;
         A1258GuiRemDom = BC01Q735_A1258GuiRemDom[0] ;
         n1258GuiRemDom = BC01Q735_n1258GuiRemDom[0] ;
         A3145GuiRemDivT = BC01Q735_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = BC01Q735_n3145GuiRemDivT[0] ;
         A407EmprNom = BC01Q735_A407EmprNom[0] ;
         n407EmprNom = BC01Q735_n407EmprNom[0] ;
         A1253EmprGuiRem = BC01Q735_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = BC01Q735_A1243GuiRemCli[0] ;
         A840TrnCod = BC01Q735_A840TrnCod[0] ;
         A3108AlbDivCod = BC01Q735_A3108AlbDivCod[0] ;
         n3108AlbDivCod = BC01Q735_n3108AlbDivCod[0] ;
         A3110GuiRemDiv = BC01Q735_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = BC01Q735_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = BC01Q735_A1260BusDomEnv[0] ;
         n1260BusDomEnv = BC01Q735_n1260BusDomEnv[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1Q73( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound3 = (short)(0) ;
      scanKeyLoad1Q73( ) ;
   }

   public void scanKeyLoad1Q73( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = BC01Q735_A30AlbProCod[0] ;
         A39AlbProPri = BC01Q735_A39AlbProPri[0] ;
         A33AlbProEst = BC01Q735_A33AlbProEst[0] ;
         A34AlbProfch = BC01Q735_A34AlbProfch[0] ;
         A4023AlbFecSal = BC01Q735_A4023AlbFecSal[0] ;
         A3865AlbHorSal = BC01Q735_A3865AlbHorSal[0] ;
         A7098AlbUsu = BC01Q735_A7098AlbUsu[0] ;
         A1244GuiRemCln = BC01Q735_A1244GuiRemCln[0] ;
         A3869AlbCliDes = BC01Q735_A3869AlbCliDes[0] ;
         A1259AlbDomEnv = BC01Q735_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = BC01Q735_n1259AlbDomEnv[0] ;
         A3868AlbMat = BC01Q735_A3868AlbMat[0] ;
         A2242AlbSec = BC01Q735_A2242AlbSec[0] ;
         A5805AlbEnvFtp = BC01Q735_A5805AlbEnvFtp[0] ;
         A7101AlbLic = BC01Q735_A7101AlbLic[0] ;
         A10765AlbProAT = BC01Q735_A10765AlbProAT[0] ;
         A10019AlbHhfm = BC01Q735_A10019AlbHhfm[0] ;
         A10020AlbGrossT = BC01Q735_A10020AlbGrossT[0] ;
         A10837AlbTrnNc = BC01Q735_A10837AlbTrnNc[0] ;
         A10017AlbFmd = BC01Q735_A10017AlbFmd[0] ;
         n10017AlbFmd = BC01Q735_n10017AlbFmd[0] ;
         A10835AlbTrnNm = BC01Q735_A10835AlbTrnNm[0] ;
         A10018ALbFmdc = BC01Q735_A10018ALbFmdc[0] ;
         A10836AlbTrnDm = BC01Q735_A10836AlbTrnDm[0] ;
         A5140AlbMarca = BC01Q735_A5140AlbMarca[0] ;
         A3867AlbLocDes = BC01Q735_A3867AlbLocDes[0] ;
         A3866AlbLocCar = BC01Q735_A3866AlbLocCar[0] ;
         A914AlbPObsCon = BC01Q735_A914AlbPObsCon[0] ;
         A5141AlbIvaCod = BC01Q735_A5141AlbIvaCod[0] ;
         A7987AlbColCa = BC01Q735_A7987AlbColCa[0] ;
         A7162AlbDesp = BC01Q735_A7162AlbDesp[0] ;
         A7986AlbCambio = BC01Q735_A7986AlbCambio[0] ;
         A7985AlbTipDoc = BC01Q735_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = BC01Q735_A7984AlbMotTr[0] ;
         A5803AlbTipCal = BC01Q735_A5803AlbTipCal[0] ;
         A7988AlbObsCb = BC01Q735_A7988AlbObsCb[0] ;
         A7102AlbNumT = BC01Q735_A7102AlbNumT[0] ;
         A7100AlbMarCo = BC01Q735_A7100AlbMarCo[0] ;
         A7099AlbOComp = BC01Q735_A7099AlbOComp[0] ;
         A3093AlbDivTCod = BC01Q735_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = BC01Q735_n3093AlbDivTCod[0] ;
         A3109AlbDivAbr = BC01Q735_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = BC01Q735_n3109AlbDivAbr[0] ;
         A1258GuiRemDom = BC01Q735_A1258GuiRemDom[0] ;
         n1258GuiRemDom = BC01Q735_n1258GuiRemDom[0] ;
         A3145GuiRemDivT = BC01Q735_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = BC01Q735_n3145GuiRemDivT[0] ;
         A407EmprNom = BC01Q735_A407EmprNom[0] ;
         n407EmprNom = BC01Q735_n407EmprNom[0] ;
         A1253EmprGuiRem = BC01Q735_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = BC01Q735_A1243GuiRemCli[0] ;
         A840TrnCod = BC01Q735_A840TrnCod[0] ;
         A3108AlbDivCod = BC01Q735_A3108AlbDivCod[0] ;
         n3108AlbDivCod = BC01Q735_n3108AlbDivCod[0] ;
         A3110GuiRemDiv = BC01Q735_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = BC01Q735_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = BC01Q735_A1260BusDomEnv[0] ;
         n1260BusDomEnv = BC01Q735_n1260BusDomEnv[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd1Q73( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1Q73( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q73( )
   {
      /* Before Insert Rules */
      if ( AV31Ctrlf == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date10[0] = AV28Fch ;
         GXv_int8[0] = (int)(AV29AlbLast) ;
         GXv_date11[0] = A34AlbProfch ;
         GXv_char2[0] = AV27Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date10, GXv_int8, GXv_date11, GXv_char2) ;
         calprd_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         calprd_trn_bc.this.A39AlbProPri = GXv_char3[0] ;
         calprd_trn_bc.this.AV28Fch = GXv_date10[0] ;
         calprd_trn_bc.this.AV29AlbLast = GXv_int8[0] ;
         calprd_trn_bc.this.A34AlbProfch = GXv_date11[0] ;
         calprd_trn_bc.this.AV27Msg_f = GXv_char2[0] ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor na data, incorreto", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A1260BusDomEnv) && ! (0==A1259AlbDomEnv) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27Msg_f)==0) )
      {
         httpContext.GX_msglist.addItem(AV27Msg_f, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate1Q73( )
   {
      /* Before Update Rules */
      if ( AV31Ctrlf == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date11[0] = AV28Fch ;
         GXv_int8[0] = (int)(AV29AlbLast) ;
         GXv_date10[0] = A34AlbProfch ;
         GXv_char2[0] = AV27Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date11, GXv_int8, GXv_date10, GXv_char2) ;
         calprd_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         calprd_trn_bc.this.A39AlbProPri = GXv_char3[0] ;
         calprd_trn_bc.this.AV28Fch = GXv_date11[0] ;
         calprd_trn_bc.this.AV29AlbLast = GXv_int8[0] ;
         calprd_trn_bc.this.A34AlbProfch = GXv_date10[0] ;
         calprd_trn_bc.this.AV27Msg_f = GXv_char2[0] ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor na data, incorreto", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A1260BusDomEnv) && ! (0==A1259AlbDomEnv) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27Msg_f)==0) )
      {
         httpContext.GX_msglist.addItem(AV27Msg_f, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete1Q73( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q73( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q73( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q73( )
   {
   }

   public void send_integrity_lvl_hashes1Q73( )
   {
   }

   public void addRow1Q73( )
   {
      VarsToRow3( bcCalprd_TRN) ;
   }

   public void readRow1Q73( )
   {
      RowToVars3( bcCalprd_TRN, 1) ;
   }

   public void initializeNonKey1Q73( )
   {
      AV27Msg_f = "" ;
      AV29AlbLast = 0 ;
      AV28Fch = GXutil.nullDate() ;
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      A39AlbProPri = "" ;
      A33AlbProEst = (byte)(0) ;
      A3865AlbHorSal = "" ;
      A1243GuiRemCli = 0 ;
      A1244GuiRemCln = "" ;
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      A840TrnCod = (short)(0) ;
      A841TrnNom = "" ;
      n841TrnNom = false ;
      A3868AlbMat = "" ;
      A2242AlbSec = "" ;
      A5805AlbEnvFtp = (byte)(0) ;
      A7101AlbLic = "" ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10837AlbTrnNc = "" ;
      A10017AlbFmd = "" ;
      n10017AlbFmd = false ;
      A10835AlbTrnNm = "" ;
      A10018ALbFmdc = "" ;
      A10836AlbTrnDm = "" ;
      A5140AlbMarca = "" ;
      A3867AlbLocDes = (byte)(0) ;
      A3866AlbLocCar = (byte)(0) ;
      A914AlbPObsCon = (byte)(0) ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7162AlbDesp = 0 ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7985AlbTipDoc = 0 ;
      A7984AlbMotTr = "" ;
      A5803AlbTipCal = (byte)(0) ;
      A7988AlbObsCb = "" ;
      A7102AlbNumT = 0 ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A1253EmprGuiRem = "" ;
      A1258GuiRemDom = (byte)(0) ;
      n1258GuiRemDom = false ;
      A3145GuiRemDivT = "" ;
      n3145GuiRemDivT = false ;
      A3110GuiRemDiv = (byte)(0) ;
      n3110GuiRemDiv = false ;
      A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A7098AlbUsu = AV9UsurCod ;
      A3869AlbCliDes = 0 ;
      A10765AlbProAT = " " ;
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z39AlbProPri = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      Z1259AlbDomEnv = (byte)(0) ;
      Z3868AlbMat = "" ;
      Z2242AlbSec = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z3867AlbLocDes = (byte)(0) ;
      Z3866AlbLocCar = (byte)(0) ;
      Z914AlbPObsCon = (byte)(0) ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7162AlbDesp = 0 ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7985AlbTipDoc = 0 ;
      Z7984AlbMotTr = "" ;
      Z5803AlbTipCal = (byte)(0) ;
      Z7988AlbObsCb = "" ;
      Z7102AlbNumT = 0 ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      Z1258GuiRemDom = (byte)(0) ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1Q73( )
   {
      A30AlbProCod = 0 ;
      initializeNonKey1Q73( ) ;
   }

   public void standaloneModalInsert( )
   {
      A34AlbProfch = i34AlbProfch ;
      A4023AlbFecSal = i4023AlbFecSal ;
      A7098AlbUsu = i7098AlbUsu ;
      A10765AlbProAT = i10765AlbProAT ;
      A10019AlbHhfm = i10019AlbHhfm ;
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

   public void VarsToRow3( app.SdtCalprd_TRN obj3 )
   {
      obj3.setgxTv_SdtCalprd_TRN_Mode( Gx_mode );
      obj3.setgxTv_SdtCalprd_TRN_Emprcod( A396EmprCod );
      obj3.setgxTv_SdtCalprd_TRN_Busdomenv( A1260BusDomEnv );
      obj3.setgxTv_SdtCalprd_TRN_Albpropri( A39AlbProPri );
      obj3.setgxTv_SdtCalprd_TRN_Albproest( A33AlbProEst );
      obj3.setgxTv_SdtCalprd_TRN_Albhorsal( A3865AlbHorSal );
      obj3.setgxTv_SdtCalprd_TRN_Guiremcli( A1243GuiRemCli );
      obj3.setgxTv_SdtCalprd_TRN_Guiremcln( A1244GuiRemCln );
      obj3.setgxTv_SdtCalprd_TRN_Albdomenv( A1259AlbDomEnv );
      obj3.setgxTv_SdtCalprd_TRN_Trncod( A840TrnCod );
      obj3.setgxTv_SdtCalprd_TRN_Trnnom( A841TrnNom );
      obj3.setgxTv_SdtCalprd_TRN_Albmat( A3868AlbMat );
      obj3.setgxTv_SdtCalprd_TRN_Albsec( A2242AlbSec );
      obj3.setgxTv_SdtCalprd_TRN_Albenvftp( A5805AlbEnvFtp );
      obj3.setgxTv_SdtCalprd_TRN_Alblic( A7101AlbLic );
      obj3.setgxTv_SdtCalprd_TRN_Albgrosst( A10020AlbGrossT );
      obj3.setgxTv_SdtCalprd_TRN_Albtrnnc( A10837AlbTrnNc );
      obj3.setgxTv_SdtCalprd_TRN_Albfmd( A10017AlbFmd );
      obj3.setgxTv_SdtCalprd_TRN_Albtrnnm( A10835AlbTrnNm );
      obj3.setgxTv_SdtCalprd_TRN_Albfmdc( A10018ALbFmdc );
      obj3.setgxTv_SdtCalprd_TRN_Albtrndm( A10836AlbTrnDm );
      obj3.setgxTv_SdtCalprd_TRN_Albmarca( A5140AlbMarca );
      obj3.setgxTv_SdtCalprd_TRN_Alblocdes( A3867AlbLocDes );
      obj3.setgxTv_SdtCalprd_TRN_Albloccar( A3866AlbLocCar );
      obj3.setgxTv_SdtCalprd_TRN_Albpobscon( A914AlbPObsCon );
      obj3.setgxTv_SdtCalprd_TRN_Albivacod( A5141AlbIvaCod );
      obj3.setgxTv_SdtCalprd_TRN_Albcolca( A7987AlbColCa );
      obj3.setgxTv_SdtCalprd_TRN_Albdesp( A7162AlbDesp );
      obj3.setgxTv_SdtCalprd_TRN_Albcambio( A7986AlbCambio );
      obj3.setgxTv_SdtCalprd_TRN_Albtipdoc( A7985AlbTipDoc );
      obj3.setgxTv_SdtCalprd_TRN_Albmottr( A7984AlbMotTr );
      obj3.setgxTv_SdtCalprd_TRN_Albtipcal( A5803AlbTipCal );
      obj3.setgxTv_SdtCalprd_TRN_Albobscb( A7988AlbObsCb );
      obj3.setgxTv_SdtCalprd_TRN_Albnumt( A7102AlbNumT );
      obj3.setgxTv_SdtCalprd_TRN_Albmarco( A7100AlbMarCo );
      obj3.setgxTv_SdtCalprd_TRN_Albocomp( A7099AlbOComp );
      obj3.setgxTv_SdtCalprd_TRN_Trnnif( A3643TrnNif );
      obj3.setgxTv_SdtCalprd_TRN_Albdivtcod( A3093AlbDivTCod );
      obj3.setgxTv_SdtCalprd_TRN_Albdivabr( A3109AlbDivAbr );
      obj3.setgxTv_SdtCalprd_TRN_Albdivcod( A3108AlbDivCod );
      obj3.setgxTv_SdtCalprd_TRN_Emprguirem( A1253EmprGuiRem );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdom( A1258GuiRemDom );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdivt( A3145GuiRemDivT );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdiv( A3110GuiRemDiv );
      obj3.setgxTv_SdtCalprd_TRN_Emprnom( A407EmprNom );
      obj3.setgxTv_SdtCalprd_TRN_Albprofch( A34AlbProfch );
      obj3.setgxTv_SdtCalprd_TRN_Albfecsal( A4023AlbFecSal );
      obj3.setgxTv_SdtCalprd_TRN_Albusu( A7098AlbUsu );
      obj3.setgxTv_SdtCalprd_TRN_Albclides( A3869AlbCliDes );
      obj3.setgxTv_SdtCalprd_TRN_Albproat( A10765AlbProAT );
      obj3.setgxTv_SdtCalprd_TRN_Albhhfm( A10019AlbHhfm );
      obj3.setgxTv_SdtCalprd_TRN_Emprcod( A396EmprCod );
      obj3.setgxTv_SdtCalprd_TRN_Albprocod( A30AlbProCod );
      obj3.setgxTv_SdtCalprd_TRN_Emprcod_Z( Z396EmprCod );
      obj3.setgxTv_SdtCalprd_TRN_Albprocod_Z( Z30AlbProCod );
      obj3.setgxTv_SdtCalprd_TRN_Albpropri_Z( Z39AlbProPri );
      obj3.setgxTv_SdtCalprd_TRN_Albproest_Z( Z33AlbProEst );
      obj3.setgxTv_SdtCalprd_TRN_Albprofch_Z( Z34AlbProfch );
      obj3.setgxTv_SdtCalprd_TRN_Albfecsal_Z( Z4023AlbFecSal );
      obj3.setgxTv_SdtCalprd_TRN_Albhorsal_Z( Z3865AlbHorSal );
      obj3.setgxTv_SdtCalprd_TRN_Albusu_Z( Z7098AlbUsu );
      obj3.setgxTv_SdtCalprd_TRN_Guiremcli_Z( Z1243GuiRemCli );
      obj3.setgxTv_SdtCalprd_TRN_Guiremcln_Z( Z1244GuiRemCln );
      obj3.setgxTv_SdtCalprd_TRN_Albclides_Z( Z3869AlbCliDes );
      obj3.setgxTv_SdtCalprd_TRN_Albdomenv_Z( Z1259AlbDomEnv );
      obj3.setgxTv_SdtCalprd_TRN_Trncod_Z( Z840TrnCod );
      obj3.setgxTv_SdtCalprd_TRN_Trnnom_Z( Z841TrnNom );
      obj3.setgxTv_SdtCalprd_TRN_Albmat_Z( Z3868AlbMat );
      obj3.setgxTv_SdtCalprd_TRN_Albsec_Z( Z2242AlbSec );
      obj3.setgxTv_SdtCalprd_TRN_Albenvftp_Z( Z5805AlbEnvFtp );
      obj3.setgxTv_SdtCalprd_TRN_Alblic_Z( Z7101AlbLic );
      obj3.setgxTv_SdtCalprd_TRN_Albproat_Z( Z10765AlbProAT );
      obj3.setgxTv_SdtCalprd_TRN_Albhhfm_Z( Z10019AlbHhfm );
      obj3.setgxTv_SdtCalprd_TRN_Albgrosst_Z( Z10020AlbGrossT );
      obj3.setgxTv_SdtCalprd_TRN_Albtrnnc_Z( Z10837AlbTrnNc );
      obj3.setgxTv_SdtCalprd_TRN_Albfmd_Z( Z10017AlbFmd );
      obj3.setgxTv_SdtCalprd_TRN_Albtrnnm_Z( Z10835AlbTrnNm );
      obj3.setgxTv_SdtCalprd_TRN_Albfmdc_Z( Z10018ALbFmdc );
      obj3.setgxTv_SdtCalprd_TRN_Albtrndm_Z( Z10836AlbTrnDm );
      obj3.setgxTv_SdtCalprd_TRN_Albmarca_Z( Z5140AlbMarca );
      obj3.setgxTv_SdtCalprd_TRN_Alblocdes_Z( Z3867AlbLocDes );
      obj3.setgxTv_SdtCalprd_TRN_Albloccar_Z( Z3866AlbLocCar );
      obj3.setgxTv_SdtCalprd_TRN_Albpobscon_Z( Z914AlbPObsCon );
      obj3.setgxTv_SdtCalprd_TRN_Albivacod_Z( Z5141AlbIvaCod );
      obj3.setgxTv_SdtCalprd_TRN_Albcolca_Z( Z7987AlbColCa );
      obj3.setgxTv_SdtCalprd_TRN_Albdesp_Z( Z7162AlbDesp );
      obj3.setgxTv_SdtCalprd_TRN_Albcambio_Z( Z7986AlbCambio );
      obj3.setgxTv_SdtCalprd_TRN_Albtipdoc_Z( Z7985AlbTipDoc );
      obj3.setgxTv_SdtCalprd_TRN_Albmottr_Z( Z7984AlbMotTr );
      obj3.setgxTv_SdtCalprd_TRN_Albtipcal_Z( Z5803AlbTipCal );
      obj3.setgxTv_SdtCalprd_TRN_Albobscb_Z( Z7988AlbObsCb );
      obj3.setgxTv_SdtCalprd_TRN_Albnumt_Z( Z7102AlbNumT );
      obj3.setgxTv_SdtCalprd_TRN_Albmarco_Z( Z7100AlbMarCo );
      obj3.setgxTv_SdtCalprd_TRN_Albocomp_Z( Z7099AlbOComp );
      obj3.setgxTv_SdtCalprd_TRN_Trnnif_Z( Z3643TrnNif );
      obj3.setgxTv_SdtCalprd_TRN_Albdivtcod_Z( Z3093AlbDivTCod );
      obj3.setgxTv_SdtCalprd_TRN_Albdivabr_Z( Z3109AlbDivAbr );
      obj3.setgxTv_SdtCalprd_TRN_Albdivcod_Z( Z3108AlbDivCod );
      obj3.setgxTv_SdtCalprd_TRN_Busdomenv_Z( Z1260BusDomEnv );
      obj3.setgxTv_SdtCalprd_TRN_Emprguirem_Z( Z1253EmprGuiRem );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdom_Z( Z1258GuiRemDom );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdivt_Z( Z3145GuiRemDivT );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdiv_Z( Z3110GuiRemDiv );
      obj3.setgxTv_SdtCalprd_TRN_Emprnom_Z( Z407EmprNom );
      obj3.setgxTv_SdtCalprd_TRN_Albdomenv_N( (byte)((byte)((n1259AlbDomEnv)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Trnnom_N( (byte)((byte)((n841TrnNom)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Albfmd_N( (byte)((byte)((n10017AlbFmd)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Trnnif_N( (byte)((byte)((n3643TrnNif)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Albdivtcod_N( (byte)((byte)((n3093AlbDivTCod)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Albdivabr_N( (byte)((byte)((n3109AlbDivAbr)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Albdivcod_N( (byte)((byte)((n3108AlbDivCod)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Busdomenv_N( (byte)((byte)((n1260BusDomEnv)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdom_N( (byte)((byte)((n1258GuiRemDom)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdivt_N( (byte)((byte)((n3145GuiRemDivT)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Guiremdiv_N( (byte)((byte)((n3110GuiRemDiv)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj3.setgxTv_SdtCalprd_TRN_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( app.SdtCalprd_TRN obj3 )
   {
      obj3.setgxTv_SdtCalprd_TRN_Emprcod( A396EmprCod );
      obj3.setgxTv_SdtCalprd_TRN_Albprocod( A30AlbProCod );
   }

   public void RowToVars3( app.SdtCalprd_TRN obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_SdtCalprd_TRN_Mode() ;
      A396EmprCod = obj3.getgxTv_SdtCalprd_TRN_Emprcod() ;
      A1260BusDomEnv = obj3.getgxTv_SdtCalprd_TRN_Busdomenv() ;
      n1260BusDomEnv = false ;
      A39AlbProPri = obj3.getgxTv_SdtCalprd_TRN_Albpropri() ;
      A33AlbProEst = obj3.getgxTv_SdtCalprd_TRN_Albproest() ;
      A3865AlbHorSal = obj3.getgxTv_SdtCalprd_TRN_Albhorsal() ;
      A1243GuiRemCli = obj3.getgxTv_SdtCalprd_TRN_Guiremcli() ;
      A1244GuiRemCln = obj3.getgxTv_SdtCalprd_TRN_Guiremcln() ;
      A1259AlbDomEnv = obj3.getgxTv_SdtCalprd_TRN_Albdomenv() ;
      n1259AlbDomEnv = false ;
      A840TrnCod = obj3.getgxTv_SdtCalprd_TRN_Trncod() ;
      A841TrnNom = obj3.getgxTv_SdtCalprd_TRN_Trnnom() ;
      n841TrnNom = false ;
      A3868AlbMat = obj3.getgxTv_SdtCalprd_TRN_Albmat() ;
      A2242AlbSec = obj3.getgxTv_SdtCalprd_TRN_Albsec() ;
      A5805AlbEnvFtp = obj3.getgxTv_SdtCalprd_TRN_Albenvftp() ;
      A7101AlbLic = obj3.getgxTv_SdtCalprd_TRN_Alblic() ;
      A10020AlbGrossT = obj3.getgxTv_SdtCalprd_TRN_Albgrosst() ;
      A10837AlbTrnNc = obj3.getgxTv_SdtCalprd_TRN_Albtrnnc() ;
      A10017AlbFmd = obj3.getgxTv_SdtCalprd_TRN_Albfmd() ;
      n10017AlbFmd = false ;
      A10835AlbTrnNm = obj3.getgxTv_SdtCalprd_TRN_Albtrnnm() ;
      A10018ALbFmdc = obj3.getgxTv_SdtCalprd_TRN_Albfmdc() ;
      A10836AlbTrnDm = obj3.getgxTv_SdtCalprd_TRN_Albtrndm() ;
      A5140AlbMarca = obj3.getgxTv_SdtCalprd_TRN_Albmarca() ;
      A3867AlbLocDes = obj3.getgxTv_SdtCalprd_TRN_Alblocdes() ;
      A3866AlbLocCar = obj3.getgxTv_SdtCalprd_TRN_Albloccar() ;
      A914AlbPObsCon = obj3.getgxTv_SdtCalprd_TRN_Albpobscon() ;
      A5141AlbIvaCod = obj3.getgxTv_SdtCalprd_TRN_Albivacod() ;
      A7987AlbColCa = obj3.getgxTv_SdtCalprd_TRN_Albcolca() ;
      A7162AlbDesp = obj3.getgxTv_SdtCalprd_TRN_Albdesp() ;
      A7986AlbCambio = obj3.getgxTv_SdtCalprd_TRN_Albcambio() ;
      A7985AlbTipDoc = obj3.getgxTv_SdtCalprd_TRN_Albtipdoc() ;
      A7984AlbMotTr = obj3.getgxTv_SdtCalprd_TRN_Albmottr() ;
      A5803AlbTipCal = obj3.getgxTv_SdtCalprd_TRN_Albtipcal() ;
      A7988AlbObsCb = obj3.getgxTv_SdtCalprd_TRN_Albobscb() ;
      A7102AlbNumT = obj3.getgxTv_SdtCalprd_TRN_Albnumt() ;
      A7100AlbMarCo = obj3.getgxTv_SdtCalprd_TRN_Albmarco() ;
      A7099AlbOComp = obj3.getgxTv_SdtCalprd_TRN_Albocomp() ;
      A3643TrnNif = obj3.getgxTv_SdtCalprd_TRN_Trnnif() ;
      n3643TrnNif = false ;
      A3093AlbDivTCod = obj3.getgxTv_SdtCalprd_TRN_Albdivtcod() ;
      n3093AlbDivTCod = false ;
      A3109AlbDivAbr = obj3.getgxTv_SdtCalprd_TRN_Albdivabr() ;
      n3109AlbDivAbr = false ;
      A3108AlbDivCod = obj3.getgxTv_SdtCalprd_TRN_Albdivcod() ;
      n3108AlbDivCod = false ;
      A1253EmprGuiRem = obj3.getgxTv_SdtCalprd_TRN_Emprguirem() ;
      A1258GuiRemDom = obj3.getgxTv_SdtCalprd_TRN_Guiremdom() ;
      n1258GuiRemDom = false ;
      A3145GuiRemDivT = obj3.getgxTv_SdtCalprd_TRN_Guiremdivt() ;
      n3145GuiRemDivT = false ;
      A3110GuiRemDiv = obj3.getgxTv_SdtCalprd_TRN_Guiremdiv() ;
      n3110GuiRemDiv = false ;
      A407EmprNom = obj3.getgxTv_SdtCalprd_TRN_Emprnom() ;
      n407EmprNom = false ;
      A34AlbProfch = obj3.getgxTv_SdtCalprd_TRN_Albprofch() ;
      A4023AlbFecSal = obj3.getgxTv_SdtCalprd_TRN_Albfecsal() ;
      A7098AlbUsu = obj3.getgxTv_SdtCalprd_TRN_Albusu() ;
      A3869AlbCliDes = obj3.getgxTv_SdtCalprd_TRN_Albclides() ;
      A10765AlbProAT = obj3.getgxTv_SdtCalprd_TRN_Albproat() ;
      A10019AlbHhfm = obj3.getgxTv_SdtCalprd_TRN_Albhhfm() ;
      A396EmprCod = obj3.getgxTv_SdtCalprd_TRN_Emprcod() ;
      A30AlbProCod = obj3.getgxTv_SdtCalprd_TRN_Albprocod() ;
      Z396EmprCod = obj3.getgxTv_SdtCalprd_TRN_Emprcod_Z() ;
      Z30AlbProCod = obj3.getgxTv_SdtCalprd_TRN_Albprocod_Z() ;
      Z39AlbProPri = obj3.getgxTv_SdtCalprd_TRN_Albpropri_Z() ;
      Z33AlbProEst = obj3.getgxTv_SdtCalprd_TRN_Albproest_Z() ;
      Z34AlbProfch = obj3.getgxTv_SdtCalprd_TRN_Albprofch_Z() ;
      Z4023AlbFecSal = obj3.getgxTv_SdtCalprd_TRN_Albfecsal_Z() ;
      Z3865AlbHorSal = obj3.getgxTv_SdtCalprd_TRN_Albhorsal_Z() ;
      Z7098AlbUsu = obj3.getgxTv_SdtCalprd_TRN_Albusu_Z() ;
      Z1243GuiRemCli = obj3.getgxTv_SdtCalprd_TRN_Guiremcli_Z() ;
      Z1244GuiRemCln = obj3.getgxTv_SdtCalprd_TRN_Guiremcln_Z() ;
      Z3869AlbCliDes = obj3.getgxTv_SdtCalprd_TRN_Albclides_Z() ;
      Z1259AlbDomEnv = obj3.getgxTv_SdtCalprd_TRN_Albdomenv_Z() ;
      Z840TrnCod = obj3.getgxTv_SdtCalprd_TRN_Trncod_Z() ;
      Z841TrnNom = obj3.getgxTv_SdtCalprd_TRN_Trnnom_Z() ;
      Z3868AlbMat = obj3.getgxTv_SdtCalprd_TRN_Albmat_Z() ;
      Z2242AlbSec = obj3.getgxTv_SdtCalprd_TRN_Albsec_Z() ;
      Z5805AlbEnvFtp = obj3.getgxTv_SdtCalprd_TRN_Albenvftp_Z() ;
      Z7101AlbLic = obj3.getgxTv_SdtCalprd_TRN_Alblic_Z() ;
      Z10765AlbProAT = obj3.getgxTv_SdtCalprd_TRN_Albproat_Z() ;
      Z10019AlbHhfm = obj3.getgxTv_SdtCalprd_TRN_Albhhfm_Z() ;
      Z10020AlbGrossT = obj3.getgxTv_SdtCalprd_TRN_Albgrosst_Z() ;
      Z10837AlbTrnNc = obj3.getgxTv_SdtCalprd_TRN_Albtrnnc_Z() ;
      Z10017AlbFmd = obj3.getgxTv_SdtCalprd_TRN_Albfmd_Z() ;
      Z10835AlbTrnNm = obj3.getgxTv_SdtCalprd_TRN_Albtrnnm_Z() ;
      Z10018ALbFmdc = obj3.getgxTv_SdtCalprd_TRN_Albfmdc_Z() ;
      Z10836AlbTrnDm = obj3.getgxTv_SdtCalprd_TRN_Albtrndm_Z() ;
      Z5140AlbMarca = obj3.getgxTv_SdtCalprd_TRN_Albmarca_Z() ;
      Z3867AlbLocDes = obj3.getgxTv_SdtCalprd_TRN_Alblocdes_Z() ;
      Z3866AlbLocCar = obj3.getgxTv_SdtCalprd_TRN_Albloccar_Z() ;
      Z914AlbPObsCon = obj3.getgxTv_SdtCalprd_TRN_Albpobscon_Z() ;
      Z5141AlbIvaCod = obj3.getgxTv_SdtCalprd_TRN_Albivacod_Z() ;
      Z7987AlbColCa = obj3.getgxTv_SdtCalprd_TRN_Albcolca_Z() ;
      Z7162AlbDesp = obj3.getgxTv_SdtCalprd_TRN_Albdesp_Z() ;
      Z7986AlbCambio = obj3.getgxTv_SdtCalprd_TRN_Albcambio_Z() ;
      Z7985AlbTipDoc = obj3.getgxTv_SdtCalprd_TRN_Albtipdoc_Z() ;
      Z7984AlbMotTr = obj3.getgxTv_SdtCalprd_TRN_Albmottr_Z() ;
      Z5803AlbTipCal = obj3.getgxTv_SdtCalprd_TRN_Albtipcal_Z() ;
      Z7988AlbObsCb = obj3.getgxTv_SdtCalprd_TRN_Albobscb_Z() ;
      Z7102AlbNumT = obj3.getgxTv_SdtCalprd_TRN_Albnumt_Z() ;
      Z7100AlbMarCo = obj3.getgxTv_SdtCalprd_TRN_Albmarco_Z() ;
      Z7099AlbOComp = obj3.getgxTv_SdtCalprd_TRN_Albocomp_Z() ;
      Z3643TrnNif = obj3.getgxTv_SdtCalprd_TRN_Trnnif_Z() ;
      Z3093AlbDivTCod = obj3.getgxTv_SdtCalprd_TRN_Albdivtcod_Z() ;
      Z3109AlbDivAbr = obj3.getgxTv_SdtCalprd_TRN_Albdivabr_Z() ;
      Z3108AlbDivCod = obj3.getgxTv_SdtCalprd_TRN_Albdivcod_Z() ;
      Z1260BusDomEnv = obj3.getgxTv_SdtCalprd_TRN_Busdomenv_Z() ;
      Z1253EmprGuiRem = obj3.getgxTv_SdtCalprd_TRN_Emprguirem_Z() ;
      Z1258GuiRemDom = obj3.getgxTv_SdtCalprd_TRN_Guiremdom_Z() ;
      Z3145GuiRemDivT = obj3.getgxTv_SdtCalprd_TRN_Guiremdivt_Z() ;
      Z3110GuiRemDiv = obj3.getgxTv_SdtCalprd_TRN_Guiremdiv_Z() ;
      Z407EmprNom = obj3.getgxTv_SdtCalprd_TRN_Emprnom_Z() ;
      n1259AlbDomEnv = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Albdomenv_N()==0)?false:true) ;
      n841TrnNom = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Trnnom_N()==0)?false:true) ;
      n10017AlbFmd = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Albfmd_N()==0)?false:true) ;
      n3643TrnNif = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Trnnif_N()==0)?false:true) ;
      n3093AlbDivTCod = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Albdivtcod_N()==0)?false:true) ;
      n3109AlbDivAbr = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Albdivabr_N()==0)?false:true) ;
      n3108AlbDivCod = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Albdivcod_N()==0)?false:true) ;
      n1260BusDomEnv = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Busdomenv_N()==0)?false:true) ;
      n1258GuiRemDom = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Guiremdom_N()==0)?false:true) ;
      n3145GuiRemDivT = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Guiremdivt_N()==0)?false:true) ;
      n3110GuiRemDiv = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Guiremdiv_N()==0)?false:true) ;
      n407EmprNom = (boolean)((obj3.getgxTv_SdtCalprd_TRN_Emprnom_N()==0)?false:true) ;
      Gx_mode = obj3.getgxTv_SdtCalprd_TRN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1Q73( ) ;
      scanKeyStart1Q73( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01Q736 */
         pr_default.execute(34, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(34) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01Q736_A407EmprNom[0] ;
         n407EmprNom = BC01Q736_n407EmprNom[0] ;
         pr_default.close(34);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
      }
      zm1Q73( -18) ;
      onLoadActions1Q73( ) ;
      addRow1Q73( ) ;
      scanKeyEnd1Q73( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcCalprd_TRN, 0) ;
      scanKeyStart1Q73( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01Q737 */
         pr_default.execute(35, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(35) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01Q737_A407EmprNom[0] ;
         n407EmprNom = BC01Q737_n407EmprNom[0] ;
         pr_default.close(35);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
      }
      zm1Q73( -18) ;
      onLoadActions1Q73( ) ;
      addRow1Q73( ) ;
      scanKeyEnd1Q73( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q73( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1Q73( ) ;
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A30AlbProCod = Z30AlbProCod ;
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
               update1Q73( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
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
                     insert1Q73( ) ;
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
                     insert1Q73( ) ;
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
      RowToVars3( bcCalprd_TRN, 1) ;
      saveImpl( ) ;
      VarsToRow3( bcCalprd_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars3( bcCalprd_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1Q73( ) ;
      afterTrn( ) ;
      VarsToRow3( bcCalprd_TRN) ;
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
         app.SdtCalprd_TRN auxBC = new app.SdtCalprd_TRN( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A30AlbProCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcCalprd_TRN);
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
      RowToVars3( bcCalprd_TRN, 1) ;
      updateImpl( ) ;
      VarsToRow3( bcCalprd_TRN) ;
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
      RowToVars3( bcCalprd_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1Q73( ) ;
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
      VarsToRow3( bcCalprd_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcCalprd_TRN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1Q73( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
         {
            A30AlbProCod = Z30AlbProCod ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "calprd_trn_bc");
      VarsToRow3( bcCalprd_TRN) ;
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
      Gx_mode = bcCalprd_TRN.getgxTv_SdtCalprd_TRN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcCalprd_TRN.setgxTv_SdtCalprd_TRN_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtCalprd_TRN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcCalprd_TRN )
      {
         bcCalprd_TRN = sdt ;
         if ( GXutil.strcmp(bcCalprd_TRN.getgxTv_SdtCalprd_TRN_Mode(), "") == 0 )
         {
            bcCalprd_TRN.setgxTv_SdtCalprd_TRN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcCalprd_TRN) ;
         }
         else
         {
            RowToVars3( bcCalprd_TRN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcCalprd_TRN.getgxTv_SdtCalprd_TRN_Mode(), "") == 0 )
         {
            bcCalprd_TRN.setgxTv_SdtCalprd_TRN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcCalprd_TRN, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtCalprd_TRN getCalprd_TRN_BC( )
   {
      return bcCalprd_TRN ;
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
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      GXt_char1 = "" ;
      AV10EmprCod = "" ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV33Pgmname = "" ;
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV18Insert_EmprGuiRem = "" ;
      Z39AlbProPri = "" ;
      A39AlbProPri = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      A34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      A3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      Z3868AlbMat = "" ;
      A3868AlbMat = "" ;
      Z2242AlbSec = "" ;
      A2242AlbSec = "" ;
      Z7101AlbLic = "" ;
      A7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      A10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      A10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      A10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      A10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      A10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      A10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      A5140AlbMarca = "" ;
      Z5141AlbIvaCod = "" ;
      A5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      A7987AlbColCa = "" ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      Z7984AlbMotTr = "" ;
      A7984AlbMotTr = "" ;
      Z7988AlbObsCb = "" ;
      A7988AlbObsCb = "" ;
      Z7100AlbMarCo = "" ;
      A7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      A7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      A3093AlbDivTCod = "" ;
      Z1253EmprGuiRem = "" ;
      A1253EmprGuiRem = "" ;
      Z1244GuiRemCln = "" ;
      A1244GuiRemCln = "" ;
      Z3145GuiRemDivT = "" ;
      A3145GuiRemDivT = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z841TrnNom = "" ;
      A841TrnNom = "" ;
      Z3643TrnNif = "" ;
      A3643TrnNif = "" ;
      Z3109AlbDivAbr = "" ;
      A3109AlbDivAbr = "" ;
      BC01Q710_A407EmprNom = new String[] {""} ;
      BC01Q710_n407EmprNom = new boolean[] {false} ;
      BC01Q711_A252CliCod = new int[1] ;
      BC01Q711_A266CliEnvLin = new byte[1] ;
      BC01Q711_A30AlbProCod = new long[1] ;
      BC01Q711_A39AlbProPri = new String[] {""} ;
      BC01Q711_A33AlbProEst = new byte[1] ;
      BC01Q711_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q711_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q711_A3865AlbHorSal = new String[] {""} ;
      BC01Q711_A7098AlbUsu = new String[] {""} ;
      BC01Q711_A1244GuiRemCln = new String[] {""} ;
      BC01Q711_A3869AlbCliDes = new int[1] ;
      BC01Q711_A1259AlbDomEnv = new byte[1] ;
      BC01Q711_n1259AlbDomEnv = new boolean[] {false} ;
      BC01Q711_A3868AlbMat = new String[] {""} ;
      BC01Q711_A2242AlbSec = new String[] {""} ;
      BC01Q711_A5805AlbEnvFtp = new byte[1] ;
      BC01Q711_A7101AlbLic = new String[] {""} ;
      BC01Q711_A10765AlbProAT = new String[] {""} ;
      BC01Q711_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q711_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q711_A10837AlbTrnNc = new String[] {""} ;
      BC01Q711_A10017AlbFmd = new String[] {""} ;
      BC01Q711_n10017AlbFmd = new boolean[] {false} ;
      BC01Q711_A10835AlbTrnNm = new String[] {""} ;
      BC01Q711_A10018ALbFmdc = new String[] {""} ;
      BC01Q711_A10836AlbTrnDm = new String[] {""} ;
      BC01Q711_A5140AlbMarca = new String[] {""} ;
      BC01Q711_A3867AlbLocDes = new byte[1] ;
      BC01Q711_A3866AlbLocCar = new byte[1] ;
      BC01Q711_A914AlbPObsCon = new byte[1] ;
      BC01Q711_A5141AlbIvaCod = new String[] {""} ;
      BC01Q711_A7987AlbColCa = new String[] {""} ;
      BC01Q711_A7162AlbDesp = new int[1] ;
      BC01Q711_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q711_A7985AlbTipDoc = new int[1] ;
      BC01Q711_A7984AlbMotTr = new String[] {""} ;
      BC01Q711_A5803AlbTipCal = new byte[1] ;
      BC01Q711_A7988AlbObsCb = new String[] {""} ;
      BC01Q711_A7102AlbNumT = new long[1] ;
      BC01Q711_A7100AlbMarCo = new String[] {""} ;
      BC01Q711_A7099AlbOComp = new String[] {""} ;
      BC01Q711_A3093AlbDivTCod = new String[] {""} ;
      BC01Q711_n3093AlbDivTCod = new boolean[] {false} ;
      BC01Q711_A3109AlbDivAbr = new String[] {""} ;
      BC01Q711_n3109AlbDivAbr = new boolean[] {false} ;
      BC01Q711_A1258GuiRemDom = new byte[1] ;
      BC01Q711_n1258GuiRemDom = new boolean[] {false} ;
      BC01Q711_A3145GuiRemDivT = new String[] {""} ;
      BC01Q711_n3145GuiRemDivT = new boolean[] {false} ;
      BC01Q711_A407EmprNom = new String[] {""} ;
      BC01Q711_n407EmprNom = new boolean[] {false} ;
      BC01Q711_A1253EmprGuiRem = new String[] {""} ;
      BC01Q711_A1243GuiRemCli = new int[1] ;
      BC01Q711_A396EmprCod = new String[] {""} ;
      BC01Q711_A840TrnCod = new short[1] ;
      BC01Q711_A3108AlbDivCod = new byte[1] ;
      BC01Q711_n3108AlbDivCod = new boolean[] {false} ;
      BC01Q711_A3110GuiRemDiv = new byte[1] ;
      BC01Q711_n3110GuiRemDiv = new boolean[] {false} ;
      BC01Q711_A1260BusDomEnv = new byte[1] ;
      BC01Q711_n1260BusDomEnv = new boolean[] {false} ;
      BC01Q712_A841TrnNom = new String[] {""} ;
      BC01Q712_n841TrnNom = new boolean[] {false} ;
      BC01Q712_A3643TrnNif = new String[] {""} ;
      BC01Q712_n3643TrnNif = new boolean[] {false} ;
      BC01Q713_A841TrnNom = new String[] {""} ;
      BC01Q713_n841TrnNom = new boolean[] {false} ;
      BC01Q713_A3643TrnNif = new String[] {""} ;
      BC01Q713_n3643TrnNif = new boolean[] {false} ;
      BC01Q714_A841TrnNom = new String[] {""} ;
      BC01Q714_n841TrnNom = new boolean[] {false} ;
      BC01Q714_A3643TrnNif = new String[] {""} ;
      BC01Q714_n3643TrnNif = new boolean[] {false} ;
      BC01Q715_A1244GuiRemCln = new String[] {""} ;
      BC01Q715_A3145GuiRemDivT = new String[] {""} ;
      BC01Q715_n3145GuiRemDivT = new boolean[] {false} ;
      BC01Q715_A3110GuiRemDiv = new byte[1] ;
      BC01Q715_n3110GuiRemDiv = new boolean[] {false} ;
      BC01Q716_A1260BusDomEnv = new byte[1] ;
      BC01Q716_n1260BusDomEnv = new boolean[] {false} ;
      BC01Q717_A841TrnNom = new String[] {""} ;
      BC01Q717_n841TrnNom = new boolean[] {false} ;
      BC01Q717_A3643TrnNif = new String[] {""} ;
      BC01Q717_n3643TrnNif = new boolean[] {false} ;
      BC01Q718_A3109AlbDivAbr = new String[] {""} ;
      BC01Q718_n3109AlbDivAbr = new boolean[] {false} ;
      BC01Q719_A396EmprCod = new String[] {""} ;
      BC01Q719_A30AlbProCod = new long[1] ;
      BC01Q720_A30AlbProCod = new long[1] ;
      BC01Q720_A39AlbProPri = new String[] {""} ;
      BC01Q720_A33AlbProEst = new byte[1] ;
      BC01Q720_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q720_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q720_A3865AlbHorSal = new String[] {""} ;
      BC01Q720_A7098AlbUsu = new String[] {""} ;
      BC01Q720_A3869AlbCliDes = new int[1] ;
      BC01Q720_A1259AlbDomEnv = new byte[1] ;
      BC01Q720_n1259AlbDomEnv = new boolean[] {false} ;
      BC01Q720_A3868AlbMat = new String[] {""} ;
      BC01Q720_A2242AlbSec = new String[] {""} ;
      BC01Q720_A5805AlbEnvFtp = new byte[1] ;
      BC01Q720_A7101AlbLic = new String[] {""} ;
      BC01Q720_A10765AlbProAT = new String[] {""} ;
      BC01Q720_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q720_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q720_A10837AlbTrnNc = new String[] {""} ;
      BC01Q720_A10017AlbFmd = new String[] {""} ;
      BC01Q720_n10017AlbFmd = new boolean[] {false} ;
      BC01Q720_A10835AlbTrnNm = new String[] {""} ;
      BC01Q720_A10018ALbFmdc = new String[] {""} ;
      BC01Q720_A10836AlbTrnDm = new String[] {""} ;
      BC01Q720_A5140AlbMarca = new String[] {""} ;
      BC01Q720_A3867AlbLocDes = new byte[1] ;
      BC01Q720_A3866AlbLocCar = new byte[1] ;
      BC01Q720_A914AlbPObsCon = new byte[1] ;
      BC01Q720_A5141AlbIvaCod = new String[] {""} ;
      BC01Q720_A7987AlbColCa = new String[] {""} ;
      BC01Q720_A7162AlbDesp = new int[1] ;
      BC01Q720_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q720_A7985AlbTipDoc = new int[1] ;
      BC01Q720_A7984AlbMotTr = new String[] {""} ;
      BC01Q720_A5803AlbTipCal = new byte[1] ;
      BC01Q720_A7988AlbObsCb = new String[] {""} ;
      BC01Q720_A7102AlbNumT = new long[1] ;
      BC01Q720_A7100AlbMarCo = new String[] {""} ;
      BC01Q720_A7099AlbOComp = new String[] {""} ;
      BC01Q720_A3093AlbDivTCod = new String[] {""} ;
      BC01Q720_n3093AlbDivTCod = new boolean[] {false} ;
      BC01Q720_A1258GuiRemDom = new byte[1] ;
      BC01Q720_n1258GuiRemDom = new boolean[] {false} ;
      BC01Q720_A1253EmprGuiRem = new String[] {""} ;
      BC01Q720_A1243GuiRemCli = new int[1] ;
      BC01Q720_A396EmprCod = new String[] {""} ;
      BC01Q720_A840TrnCod = new short[1] ;
      BC01Q720_A3108AlbDivCod = new byte[1] ;
      BC01Q720_n3108AlbDivCod = new boolean[] {false} ;
      sMode3 = "" ;
      BC01Q721_A30AlbProCod = new long[1] ;
      BC01Q721_A39AlbProPri = new String[] {""} ;
      BC01Q721_A33AlbProEst = new byte[1] ;
      BC01Q721_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q721_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q721_A3865AlbHorSal = new String[] {""} ;
      BC01Q721_A7098AlbUsu = new String[] {""} ;
      BC01Q721_A3869AlbCliDes = new int[1] ;
      BC01Q721_A1259AlbDomEnv = new byte[1] ;
      BC01Q721_n1259AlbDomEnv = new boolean[] {false} ;
      BC01Q721_A3868AlbMat = new String[] {""} ;
      BC01Q721_A2242AlbSec = new String[] {""} ;
      BC01Q721_A5805AlbEnvFtp = new byte[1] ;
      BC01Q721_A7101AlbLic = new String[] {""} ;
      BC01Q721_A10765AlbProAT = new String[] {""} ;
      BC01Q721_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q721_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q721_A10837AlbTrnNc = new String[] {""} ;
      BC01Q721_A10017AlbFmd = new String[] {""} ;
      BC01Q721_n10017AlbFmd = new boolean[] {false} ;
      BC01Q721_A10835AlbTrnNm = new String[] {""} ;
      BC01Q721_A10018ALbFmdc = new String[] {""} ;
      BC01Q721_A10836AlbTrnDm = new String[] {""} ;
      BC01Q721_A5140AlbMarca = new String[] {""} ;
      BC01Q721_A3867AlbLocDes = new byte[1] ;
      BC01Q721_A3866AlbLocCar = new byte[1] ;
      BC01Q721_A914AlbPObsCon = new byte[1] ;
      BC01Q721_A5141AlbIvaCod = new String[] {""} ;
      BC01Q721_A7987AlbColCa = new String[] {""} ;
      BC01Q721_A7162AlbDesp = new int[1] ;
      BC01Q721_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q721_A7985AlbTipDoc = new int[1] ;
      BC01Q721_A7984AlbMotTr = new String[] {""} ;
      BC01Q721_A5803AlbTipCal = new byte[1] ;
      BC01Q721_A7988AlbObsCb = new String[] {""} ;
      BC01Q721_A7102AlbNumT = new long[1] ;
      BC01Q721_A7100AlbMarCo = new String[] {""} ;
      BC01Q721_A7099AlbOComp = new String[] {""} ;
      BC01Q721_A3093AlbDivTCod = new String[] {""} ;
      BC01Q721_n3093AlbDivTCod = new boolean[] {false} ;
      BC01Q721_A1258GuiRemDom = new byte[1] ;
      BC01Q721_n1258GuiRemDom = new boolean[] {false} ;
      BC01Q721_A1253EmprGuiRem = new String[] {""} ;
      BC01Q721_A1243GuiRemCli = new int[1] ;
      BC01Q721_A396EmprCod = new String[] {""} ;
      BC01Q721_A840TrnCod = new short[1] ;
      BC01Q721_A3108AlbDivCod = new byte[1] ;
      BC01Q721_n3108AlbDivCod = new boolean[] {false} ;
      BC01Q725_A841TrnNom = new String[] {""} ;
      BC01Q725_n841TrnNom = new boolean[] {false} ;
      BC01Q725_A3643TrnNif = new String[] {""} ;
      BC01Q725_n3643TrnNif = new boolean[] {false} ;
      BC01Q726_A3109AlbDivAbr = new String[] {""} ;
      BC01Q726_n3109AlbDivAbr = new boolean[] {false} ;
      BC01Q727_A1244GuiRemCln = new String[] {""} ;
      BC01Q727_A3145GuiRemDivT = new String[] {""} ;
      BC01Q727_n3145GuiRemDivT = new boolean[] {false} ;
      BC01Q727_A3110GuiRemDiv = new byte[1] ;
      BC01Q727_n3110GuiRemDiv = new boolean[] {false} ;
      BC01Q728_A841TrnNom = new String[] {""} ;
      BC01Q728_n841TrnNom = new boolean[] {false} ;
      BC01Q728_A3643TrnNif = new String[] {""} ;
      BC01Q728_n3643TrnNif = new boolean[] {false} ;
      BC01Q729_A1260BusDomEnv = new byte[1] ;
      BC01Q729_n1260BusDomEnv = new boolean[] {false} ;
      BC01Q730_A396EmprCod = new String[] {""} ;
      BC01Q730_A30AlbProCod = new long[1] ;
      BC01Q730_A12185DltLinObs = new byte[1] ;
      BC01Q731_A396EmprCod = new String[] {""} ;
      BC01Q731_A30AlbProCod = new long[1] ;
      BC01Q731_A12176DltHdr = new int[1] ;
      BC01Q731_A12177DltR = new byte[1] ;
      BC01Q731_A12178DltP = new String[] {""} ;
      BC01Q732_A396EmprCod = new String[] {""} ;
      BC01Q732_A30AlbProCod = new long[1] ;
      BC01Q732_A7540Alb_NFisca = new String[] {""} ;
      BC01Q733_A396EmprCod = new String[] {""} ;
      BC01Q733_A30AlbProCod = new long[1] ;
      BC01Q733_A129BarCod = new int[1] ;
      BC01Q733_A132BarCodReo = new byte[1] ;
      BC01Q733_A130BarCodPar = new String[] {""} ;
      BC01Q734_A396EmprCod = new String[] {""} ;
      BC01Q734_A30AlbProCod = new long[1] ;
      BC01Q734_A915AlbPObsLin = new byte[1] ;
      BC01Q735_A252CliCod = new int[1] ;
      BC01Q735_A266CliEnvLin = new byte[1] ;
      BC01Q735_A30AlbProCod = new long[1] ;
      BC01Q735_A39AlbProPri = new String[] {""} ;
      BC01Q735_A33AlbProEst = new byte[1] ;
      BC01Q735_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q735_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q735_A3865AlbHorSal = new String[] {""} ;
      BC01Q735_A7098AlbUsu = new String[] {""} ;
      BC01Q735_A1244GuiRemCln = new String[] {""} ;
      BC01Q735_A3869AlbCliDes = new int[1] ;
      BC01Q735_A1259AlbDomEnv = new byte[1] ;
      BC01Q735_n1259AlbDomEnv = new boolean[] {false} ;
      BC01Q735_A3868AlbMat = new String[] {""} ;
      BC01Q735_A2242AlbSec = new String[] {""} ;
      BC01Q735_A5805AlbEnvFtp = new byte[1] ;
      BC01Q735_A7101AlbLic = new String[] {""} ;
      BC01Q735_A10765AlbProAT = new String[] {""} ;
      BC01Q735_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      BC01Q735_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q735_A10837AlbTrnNc = new String[] {""} ;
      BC01Q735_A10017AlbFmd = new String[] {""} ;
      BC01Q735_n10017AlbFmd = new boolean[] {false} ;
      BC01Q735_A10835AlbTrnNm = new String[] {""} ;
      BC01Q735_A10018ALbFmdc = new String[] {""} ;
      BC01Q735_A10836AlbTrnDm = new String[] {""} ;
      BC01Q735_A5140AlbMarca = new String[] {""} ;
      BC01Q735_A3867AlbLocDes = new byte[1] ;
      BC01Q735_A3866AlbLocCar = new byte[1] ;
      BC01Q735_A914AlbPObsCon = new byte[1] ;
      BC01Q735_A5141AlbIvaCod = new String[] {""} ;
      BC01Q735_A7987AlbColCa = new String[] {""} ;
      BC01Q735_A7162AlbDesp = new int[1] ;
      BC01Q735_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01Q735_A7985AlbTipDoc = new int[1] ;
      BC01Q735_A7984AlbMotTr = new String[] {""} ;
      BC01Q735_A5803AlbTipCal = new byte[1] ;
      BC01Q735_A7988AlbObsCb = new String[] {""} ;
      BC01Q735_A7102AlbNumT = new long[1] ;
      BC01Q735_A7100AlbMarCo = new String[] {""} ;
      BC01Q735_A7099AlbOComp = new String[] {""} ;
      BC01Q735_A3093AlbDivTCod = new String[] {""} ;
      BC01Q735_n3093AlbDivTCod = new boolean[] {false} ;
      BC01Q735_A3109AlbDivAbr = new String[] {""} ;
      BC01Q735_n3109AlbDivAbr = new boolean[] {false} ;
      BC01Q735_A1258GuiRemDom = new byte[1] ;
      BC01Q735_n1258GuiRemDom = new boolean[] {false} ;
      BC01Q735_A3145GuiRemDivT = new String[] {""} ;
      BC01Q735_n3145GuiRemDivT = new boolean[] {false} ;
      BC01Q735_A407EmprNom = new String[] {""} ;
      BC01Q735_n407EmprNom = new boolean[] {false} ;
      BC01Q735_A1253EmprGuiRem = new String[] {""} ;
      BC01Q735_A1243GuiRemCli = new int[1] ;
      BC01Q735_A396EmprCod = new String[] {""} ;
      BC01Q735_A840TrnCod = new short[1] ;
      BC01Q735_A3108AlbDivCod = new byte[1] ;
      BC01Q735_n3108AlbDivCod = new boolean[] {false} ;
      BC01Q735_A3110GuiRemDiv = new byte[1] ;
      BC01Q735_n3110GuiRemDiv = new boolean[] {false} ;
      BC01Q735_A1260BusDomEnv = new byte[1] ;
      BC01Q735_n1260BusDomEnv = new boolean[] {false} ;
      AV28Fch = GXutil.nullDate() ;
      AV27Msg_f = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      i34AlbProfch = GXutil.nullDate() ;
      i4023AlbFecSal = GXutil.nullDate() ;
      i7098AlbUsu = "" ;
      i10765AlbProAT = "" ;
      i10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01Q736_A407EmprNom = new String[] {""} ;
      BC01Q736_n407EmprNom = new boolean[] {false} ;
      BC01Q737_A407EmprNom = new String[] {""} ;
      BC01Q737_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.calprd_trn_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.calprd_trn_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.calprd_trn_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.calprd_trn_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trn_bc__default(),
         new Object[] {
             new Object[] {
            BC01Q72_A30AlbProCod, BC01Q72_A39AlbProPri, BC01Q72_A33AlbProEst, BC01Q72_A34AlbProfch, BC01Q72_A4023AlbFecSal, BC01Q72_A3865AlbHorSal, BC01Q72_A7098AlbUsu, BC01Q72_A3869AlbCliDes, BC01Q72_A1259AlbDomEnv, BC01Q72_n1259AlbDomEnv,
            BC01Q72_A3868AlbMat, BC01Q72_A2242AlbSec, BC01Q72_A5805AlbEnvFtp, BC01Q72_A7101AlbLic, BC01Q72_A10765AlbProAT, BC01Q72_A10019AlbHhfm, BC01Q72_A10020AlbGrossT, BC01Q72_A10837AlbTrnNc, BC01Q72_A10017AlbFmd, BC01Q72_n10017AlbFmd,
            BC01Q72_A10835AlbTrnNm, BC01Q72_A10018ALbFmdc, BC01Q72_A10836AlbTrnDm, BC01Q72_A5140AlbMarca, BC01Q72_A3867AlbLocDes, BC01Q72_A3866AlbLocCar, BC01Q72_A914AlbPObsCon, BC01Q72_A5141AlbIvaCod, BC01Q72_A7987AlbColCa, BC01Q72_A7162AlbDesp,
            BC01Q72_A7986AlbCambio, BC01Q72_A7985AlbTipDoc, BC01Q72_A7984AlbMotTr, BC01Q72_A5803AlbTipCal, BC01Q72_A7988AlbObsCb, BC01Q72_A7102AlbNumT, BC01Q72_A7100AlbMarCo, BC01Q72_A7099AlbOComp, BC01Q72_A3093AlbDivTCod, BC01Q72_n3093AlbDivTCod,
            BC01Q72_A1258GuiRemDom, BC01Q72_n1258GuiRemDom, BC01Q72_A1253EmprGuiRem, BC01Q72_A1243GuiRemCli, BC01Q72_A396EmprCod, BC01Q72_A840TrnCod, BC01Q72_A3108AlbDivCod, BC01Q72_n3108AlbDivCod
            }
            , new Object[] {
            BC01Q73_A30AlbProCod, BC01Q73_A39AlbProPri, BC01Q73_A33AlbProEst, BC01Q73_A34AlbProfch, BC01Q73_A4023AlbFecSal, BC01Q73_A3865AlbHorSal, BC01Q73_A7098AlbUsu, BC01Q73_A3869AlbCliDes, BC01Q73_A1259AlbDomEnv, BC01Q73_n1259AlbDomEnv,
            BC01Q73_A3868AlbMat, BC01Q73_A2242AlbSec, BC01Q73_A5805AlbEnvFtp, BC01Q73_A7101AlbLic, BC01Q73_A10765AlbProAT, BC01Q73_A10019AlbHhfm, BC01Q73_A10020AlbGrossT, BC01Q73_A10837AlbTrnNc, BC01Q73_A10017AlbFmd, BC01Q73_n10017AlbFmd,
            BC01Q73_A10835AlbTrnNm, BC01Q73_A10018ALbFmdc, BC01Q73_A10836AlbTrnDm, BC01Q73_A5140AlbMarca, BC01Q73_A3867AlbLocDes, BC01Q73_A3866AlbLocCar, BC01Q73_A914AlbPObsCon, BC01Q73_A5141AlbIvaCod, BC01Q73_A7987AlbColCa, BC01Q73_A7162AlbDesp,
            BC01Q73_A7986AlbCambio, BC01Q73_A7985AlbTipDoc, BC01Q73_A7984AlbMotTr, BC01Q73_A5803AlbTipCal, BC01Q73_A7988AlbObsCb, BC01Q73_A7102AlbNumT, BC01Q73_A7100AlbMarCo, BC01Q73_A7099AlbOComp, BC01Q73_A3093AlbDivTCod, BC01Q73_n3093AlbDivTCod,
            BC01Q73_A1258GuiRemDom, BC01Q73_n1258GuiRemDom, BC01Q73_A1253EmprGuiRem, BC01Q73_A1243GuiRemCli, BC01Q73_A396EmprCod, BC01Q73_A840TrnCod, BC01Q73_A3108AlbDivCod, BC01Q73_n3108AlbDivCod
            }
            , new Object[] {
            BC01Q74_A1244GuiRemCln, BC01Q74_A3145GuiRemDivT, BC01Q74_n3145GuiRemDivT, BC01Q74_A3110GuiRemDiv, BC01Q74_n3110GuiRemDiv
            }
            , new Object[] {
            BC01Q75_A407EmprNom, BC01Q75_n407EmprNom
            }
            , new Object[] {
            BC01Q76_A841TrnNom, BC01Q76_n841TrnNom, BC01Q76_A3643TrnNif, BC01Q76_n3643TrnNif
            }
            , new Object[] {
            BC01Q77_A841TrnNom, BC01Q77_n841TrnNom, BC01Q77_A3643TrnNif, BC01Q77_n3643TrnNif
            }
            , new Object[] {
            BC01Q78_A3109AlbDivAbr, BC01Q78_n3109AlbDivAbr
            }
            , new Object[] {
            BC01Q79_A1260BusDomEnv, BC01Q79_n1260BusDomEnv
            }
            , new Object[] {
            BC01Q710_A407EmprNom, BC01Q710_n407EmprNom
            }
            , new Object[] {
            BC01Q711_A252CliCod, BC01Q711_A266CliEnvLin, BC01Q711_A30AlbProCod, BC01Q711_A39AlbProPri, BC01Q711_A33AlbProEst, BC01Q711_A34AlbProfch, BC01Q711_A4023AlbFecSal, BC01Q711_A3865AlbHorSal, BC01Q711_A7098AlbUsu, BC01Q711_A1244GuiRemCln,
            BC01Q711_A3869AlbCliDes, BC01Q711_A1259AlbDomEnv, BC01Q711_n1259AlbDomEnv, BC01Q711_A3868AlbMat, BC01Q711_A2242AlbSec, BC01Q711_A5805AlbEnvFtp, BC01Q711_A7101AlbLic, BC01Q711_A10765AlbProAT, BC01Q711_A10019AlbHhfm, BC01Q711_A10020AlbGrossT,
            BC01Q711_A10837AlbTrnNc, BC01Q711_A10017AlbFmd, BC01Q711_n10017AlbFmd, BC01Q711_A10835AlbTrnNm, BC01Q711_A10018ALbFmdc, BC01Q711_A10836AlbTrnDm, BC01Q711_A5140AlbMarca, BC01Q711_A3867AlbLocDes, BC01Q711_A3866AlbLocCar, BC01Q711_A914AlbPObsCon,
            BC01Q711_A5141AlbIvaCod, BC01Q711_A7987AlbColCa, BC01Q711_A7162AlbDesp, BC01Q711_A7986AlbCambio, BC01Q711_A7985AlbTipDoc, BC01Q711_A7984AlbMotTr, BC01Q711_A5803AlbTipCal, BC01Q711_A7988AlbObsCb, BC01Q711_A7102AlbNumT, BC01Q711_A7100AlbMarCo,
            BC01Q711_A7099AlbOComp, BC01Q711_A3093AlbDivTCod, BC01Q711_n3093AlbDivTCod, BC01Q711_A3109AlbDivAbr, BC01Q711_n3109AlbDivAbr, BC01Q711_A1258GuiRemDom, BC01Q711_n1258GuiRemDom, BC01Q711_A3145GuiRemDivT, BC01Q711_n3145GuiRemDivT, BC01Q711_A407EmprNom,
            BC01Q711_n407EmprNom, BC01Q711_A1253EmprGuiRem, BC01Q711_A1243GuiRemCli, BC01Q711_A396EmprCod, BC01Q711_A840TrnCod, BC01Q711_A3108AlbDivCod, BC01Q711_n3108AlbDivCod, BC01Q711_A3110GuiRemDiv, BC01Q711_n3110GuiRemDiv, BC01Q711_A1260BusDomEnv,
            BC01Q711_n1260BusDomEnv
            }
            , new Object[] {
            BC01Q712_A841TrnNom, BC01Q712_n841TrnNom, BC01Q712_A3643TrnNif, BC01Q712_n3643TrnNif
            }
            , new Object[] {
            BC01Q713_A841TrnNom, BC01Q713_n841TrnNom, BC01Q713_A3643TrnNif, BC01Q713_n3643TrnNif
            }
            , new Object[] {
            BC01Q714_A841TrnNom, BC01Q714_n841TrnNom, BC01Q714_A3643TrnNif, BC01Q714_n3643TrnNif
            }
            , new Object[] {
            BC01Q715_A1244GuiRemCln, BC01Q715_A3145GuiRemDivT, BC01Q715_n3145GuiRemDivT, BC01Q715_A3110GuiRemDiv, BC01Q715_n3110GuiRemDiv
            }
            , new Object[] {
            BC01Q716_A1260BusDomEnv, BC01Q716_n1260BusDomEnv
            }
            , new Object[] {
            BC01Q717_A841TrnNom, BC01Q717_n841TrnNom, BC01Q717_A3643TrnNif, BC01Q717_n3643TrnNif
            }
            , new Object[] {
            BC01Q718_A3109AlbDivAbr, BC01Q718_n3109AlbDivAbr
            }
            , new Object[] {
            BC01Q719_A396EmprCod, BC01Q719_A30AlbProCod
            }
            , new Object[] {
            BC01Q720_A30AlbProCod, BC01Q720_A39AlbProPri, BC01Q720_A33AlbProEst, BC01Q720_A34AlbProfch, BC01Q720_A4023AlbFecSal, BC01Q720_A3865AlbHorSal, BC01Q720_A7098AlbUsu, BC01Q720_A3869AlbCliDes, BC01Q720_A1259AlbDomEnv, BC01Q720_n1259AlbDomEnv,
            BC01Q720_A3868AlbMat, BC01Q720_A2242AlbSec, BC01Q720_A5805AlbEnvFtp, BC01Q720_A7101AlbLic, BC01Q720_A10765AlbProAT, BC01Q720_A10019AlbHhfm, BC01Q720_A10020AlbGrossT, BC01Q720_A10837AlbTrnNc, BC01Q720_A10017AlbFmd, BC01Q720_n10017AlbFmd,
            BC01Q720_A10835AlbTrnNm, BC01Q720_A10018ALbFmdc, BC01Q720_A10836AlbTrnDm, BC01Q720_A5140AlbMarca, BC01Q720_A3867AlbLocDes, BC01Q720_A3866AlbLocCar, BC01Q720_A914AlbPObsCon, BC01Q720_A5141AlbIvaCod, BC01Q720_A7987AlbColCa, BC01Q720_A7162AlbDesp,
            BC01Q720_A7986AlbCambio, BC01Q720_A7985AlbTipDoc, BC01Q720_A7984AlbMotTr, BC01Q720_A5803AlbTipCal, BC01Q720_A7988AlbObsCb, BC01Q720_A7102AlbNumT, BC01Q720_A7100AlbMarCo, BC01Q720_A7099AlbOComp, BC01Q720_A3093AlbDivTCod, BC01Q720_n3093AlbDivTCod,
            BC01Q720_A1258GuiRemDom, BC01Q720_n1258GuiRemDom, BC01Q720_A1253EmprGuiRem, BC01Q720_A1243GuiRemCli, BC01Q720_A396EmprCod, BC01Q720_A840TrnCod, BC01Q720_A3108AlbDivCod, BC01Q720_n3108AlbDivCod
            }
            , new Object[] {
            BC01Q721_A30AlbProCod, BC01Q721_A39AlbProPri, BC01Q721_A33AlbProEst, BC01Q721_A34AlbProfch, BC01Q721_A4023AlbFecSal, BC01Q721_A3865AlbHorSal, BC01Q721_A7098AlbUsu, BC01Q721_A3869AlbCliDes, BC01Q721_A1259AlbDomEnv, BC01Q721_n1259AlbDomEnv,
            BC01Q721_A3868AlbMat, BC01Q721_A2242AlbSec, BC01Q721_A5805AlbEnvFtp, BC01Q721_A7101AlbLic, BC01Q721_A10765AlbProAT, BC01Q721_A10019AlbHhfm, BC01Q721_A10020AlbGrossT, BC01Q721_A10837AlbTrnNc, BC01Q721_A10017AlbFmd, BC01Q721_n10017AlbFmd,
            BC01Q721_A10835AlbTrnNm, BC01Q721_A10018ALbFmdc, BC01Q721_A10836AlbTrnDm, BC01Q721_A5140AlbMarca, BC01Q721_A3867AlbLocDes, BC01Q721_A3866AlbLocCar, BC01Q721_A914AlbPObsCon, BC01Q721_A5141AlbIvaCod, BC01Q721_A7987AlbColCa, BC01Q721_A7162AlbDesp,
            BC01Q721_A7986AlbCambio, BC01Q721_A7985AlbTipDoc, BC01Q721_A7984AlbMotTr, BC01Q721_A5803AlbTipCal, BC01Q721_A7988AlbObsCb, BC01Q721_A7102AlbNumT, BC01Q721_A7100AlbMarCo, BC01Q721_A7099AlbOComp, BC01Q721_A3093AlbDivTCod, BC01Q721_n3093AlbDivTCod,
            BC01Q721_A1258GuiRemDom, BC01Q721_n1258GuiRemDom, BC01Q721_A1253EmprGuiRem, BC01Q721_A1243GuiRemCli, BC01Q721_A396EmprCod, BC01Q721_A840TrnCod, BC01Q721_A3108AlbDivCod, BC01Q721_n3108AlbDivCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01Q725_A841TrnNom, BC01Q725_n841TrnNom, BC01Q725_A3643TrnNif, BC01Q725_n3643TrnNif
            }
            , new Object[] {
            BC01Q726_A3109AlbDivAbr, BC01Q726_n3109AlbDivAbr
            }
            , new Object[] {
            BC01Q727_A1244GuiRemCln, BC01Q727_A3145GuiRemDivT, BC01Q727_n3145GuiRemDivT, BC01Q727_A3110GuiRemDiv, BC01Q727_n3110GuiRemDiv
            }
            , new Object[] {
            BC01Q728_A841TrnNom, BC01Q728_n841TrnNom, BC01Q728_A3643TrnNif, BC01Q728_n3643TrnNif
            }
            , new Object[] {
            BC01Q729_A1260BusDomEnv, BC01Q729_n1260BusDomEnv
            }
            , new Object[] {
            BC01Q730_A396EmprCod, BC01Q730_A30AlbProCod, BC01Q730_A12185DltLinObs
            }
            , new Object[] {
            BC01Q731_A396EmprCod, BC01Q731_A30AlbProCod, BC01Q731_A12176DltHdr, BC01Q731_A12177DltR, BC01Q731_A12178DltP
            }
            , new Object[] {
            BC01Q732_A396EmprCod, BC01Q732_A30AlbProCod, BC01Q732_A7540Alb_NFisca
            }
            , new Object[] {
            BC01Q733_A396EmprCod, BC01Q733_A30AlbProCod, BC01Q733_A129BarCod, BC01Q733_A132BarCodReo, BC01Q733_A130BarCodPar
            }
            , new Object[] {
            BC01Q734_A396EmprCod, BC01Q734_A30AlbProCod, BC01Q734_A915AlbPObsLin
            }
            , new Object[] {
            BC01Q735_A252CliCod, BC01Q735_A266CliEnvLin, BC01Q735_A30AlbProCod, BC01Q735_A39AlbProPri, BC01Q735_A33AlbProEst, BC01Q735_A34AlbProfch, BC01Q735_A4023AlbFecSal, BC01Q735_A3865AlbHorSal, BC01Q735_A7098AlbUsu, BC01Q735_A1244GuiRemCln,
            BC01Q735_A3869AlbCliDes, BC01Q735_A1259AlbDomEnv, BC01Q735_n1259AlbDomEnv, BC01Q735_A3868AlbMat, BC01Q735_A2242AlbSec, BC01Q735_A5805AlbEnvFtp, BC01Q735_A7101AlbLic, BC01Q735_A10765AlbProAT, BC01Q735_A10019AlbHhfm, BC01Q735_A10020AlbGrossT,
            BC01Q735_A10837AlbTrnNc, BC01Q735_A10017AlbFmd, BC01Q735_n10017AlbFmd, BC01Q735_A10835AlbTrnNm, BC01Q735_A10018ALbFmdc, BC01Q735_A10836AlbTrnDm, BC01Q735_A5140AlbMarca, BC01Q735_A3867AlbLocDes, BC01Q735_A3866AlbLocCar, BC01Q735_A914AlbPObsCon,
            BC01Q735_A5141AlbIvaCod, BC01Q735_A7987AlbColCa, BC01Q735_A7162AlbDesp, BC01Q735_A7986AlbCambio, BC01Q735_A7985AlbTipDoc, BC01Q735_A7984AlbMotTr, BC01Q735_A5803AlbTipCal, BC01Q735_A7988AlbObsCb, BC01Q735_A7102AlbNumT, BC01Q735_A7100AlbMarCo,
            BC01Q735_A7099AlbOComp, BC01Q735_A3093AlbDivTCod, BC01Q735_n3093AlbDivTCod, BC01Q735_A3109AlbDivAbr, BC01Q735_n3109AlbDivAbr, BC01Q735_A1258GuiRemDom, BC01Q735_n1258GuiRemDom, BC01Q735_A3145GuiRemDivT, BC01Q735_n3145GuiRemDivT, BC01Q735_A407EmprNom,
            BC01Q735_n407EmprNom, BC01Q735_A1253EmprGuiRem, BC01Q735_A1243GuiRemCli, BC01Q735_A396EmprCod, BC01Q735_A840TrnCod, BC01Q735_A3108AlbDivCod, BC01Q735_n3108AlbDivCod, BC01Q735_A3110GuiRemDiv, BC01Q735_n3110GuiRemDiv, BC01Q735_A1260BusDomEnv,
            BC01Q735_n1260BusDomEnv
            }
            , new Object[] {
            BC01Q736_A407EmprNom, BC01Q736_n407EmprNom
            }
            , new Object[] {
            BC01Q737_A407EmprNom, BC01Q737_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "Calprd_TRN_BC" ;
      Z10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z10765AlbProAT = " " ;
      A10765AlbProAT = " " ;
      i10765AlbProAT = " " ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      i7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      A3869AlbCliDes = 0 ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      Z34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121Q72 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte AV17Insert_AlbDivCod ;
   private byte Z33AlbProEst ;
   private byte A33AlbProEst ;
   private byte Z1259AlbDomEnv ;
   private byte A1259AlbDomEnv ;
   private byte Z5805AlbEnvFtp ;
   private byte A5805AlbEnvFtp ;
   private byte Z3867AlbLocDes ;
   private byte A3867AlbLocDes ;
   private byte Z3866AlbLocCar ;
   private byte A3866AlbLocCar ;
   private byte Z914AlbPObsCon ;
   private byte A914AlbPObsCon ;
   private byte Z5803AlbTipCal ;
   private byte A5803AlbTipCal ;
   private byte Z1258GuiRemDom ;
   private byte A1258GuiRemDom ;
   private byte Z3108AlbDivCod ;
   private byte A3108AlbDivCod ;
   private byte Z1260BusDomEnv ;
   private byte A1260BusDomEnv ;
   private byte Z3110GuiRemDiv ;
   private byte A3110GuiRemDiv ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV24FirmaD ;
   private short AV25avisar ;
   private short AV31Ctrlf ;
   private short AV16Insert_TrnCod ;
   private short Z840TrnCod ;
   private short A840TrnCod ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private int trnEnded ;
   private int GXt_int7 ;
   private int AV34GXV1 ;
   private int AV15Insert_GuiRemCli ;
   private int GX_JID ;
   private int Z3869AlbCliDes ;
   private int A3869AlbCliDes ;
   private int Z7162AlbDesp ;
   private int A7162AlbDesp ;
   private int Z7985AlbTipDoc ;
   private int A7985AlbTipDoc ;
   private int Z1243GuiRemCli ;
   private int A1243GuiRemCli ;
   private int GXv_int8[] ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long Z7102AlbNumT ;
   private long A7102AlbNumT ;
   private long AV29AlbLast ;
   private java.math.BigDecimal Z10020AlbGrossT ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal Z7986AlbCambio ;
   private java.math.BigDecimal A7986AlbCambio ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String GXt_char1 ;
   private String AV10EmprCod ;
   private String AV33Pgmname ;
   private String AV18Insert_EmprGuiRem ;
   private String Z39AlbProPri ;
   private String A39AlbProPri ;
   private String Z3865AlbHorSal ;
   private String A3865AlbHorSal ;
   private String Z7098AlbUsu ;
   private String A7098AlbUsu ;
   private String Z3868AlbMat ;
   private String A3868AlbMat ;
   private String Z2242AlbSec ;
   private String A2242AlbSec ;
   private String Z7101AlbLic ;
   private String A7101AlbLic ;
   private String Z10765AlbProAT ;
   private String A10765AlbProAT ;
   private String Z10837AlbTrnNc ;
   private String A10837AlbTrnNc ;
   private String Z10835AlbTrnNm ;
   private String A10835AlbTrnNm ;
   private String Z10018ALbFmdc ;
   private String A10018ALbFmdc ;
   private String Z10836AlbTrnDm ;
   private String A10836AlbTrnDm ;
   private String Z5140AlbMarca ;
   private String A5140AlbMarca ;
   private String Z5141AlbIvaCod ;
   private String A5141AlbIvaCod ;
   private String Z7987AlbColCa ;
   private String A7987AlbColCa ;
   private String Z7984AlbMotTr ;
   private String A7984AlbMotTr ;
   private String Z7988AlbObsCb ;
   private String A7988AlbObsCb ;
   private String Z7100AlbMarCo ;
   private String A7100AlbMarCo ;
   private String Z7099AlbOComp ;
   private String A7099AlbOComp ;
   private String Z3093AlbDivTCod ;
   private String A3093AlbDivTCod ;
   private String Z1253EmprGuiRem ;
   private String A1253EmprGuiRem ;
   private String Z1244GuiRemCln ;
   private String A1244GuiRemCln ;
   private String Z3145GuiRemDivT ;
   private String A3145GuiRemDivT ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z841TrnNom ;
   private String A841TrnNom ;
   private String Z3643TrnNif ;
   private String A3643TrnNif ;
   private String Z3109AlbDivAbr ;
   private String A3109AlbDivAbr ;
   private String sMode3 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String i7098AlbUsu ;
   private String i10765AlbProAT ;
   private java.util.Date Z10019AlbHhfm ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date i10019AlbHhfm ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Z4023AlbFecSal ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV28Fch ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date i34AlbProfch ;
   private java.util.Date i4023AlbFecSal ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n3093AlbDivTCod ;
   private boolean n3109AlbDivAbr ;
   private boolean n1258GuiRemDom ;
   private boolean n3145GuiRemDivT ;
   private boolean n3108AlbDivCod ;
   private boolean n3110GuiRemDiv ;
   private boolean n1260BusDomEnv ;
   private boolean n841TrnNom ;
   private boolean n3643TrnNif ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z10017AlbFmd ;
   private String A10017AlbFmd ;
   private String AV27Msg_f ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private app.SdtCalprd_TRN bcCalprd_TRN ;
   private IDataStoreProvider pr_default ;
   private String[] BC01Q710_A407EmprNom ;
   private boolean[] BC01Q710_n407EmprNom ;
   private int[] BC01Q711_A252CliCod ;
   private byte[] BC01Q711_A266CliEnvLin ;
   private long[] BC01Q711_A30AlbProCod ;
   private String[] BC01Q711_A39AlbProPri ;
   private byte[] BC01Q711_A33AlbProEst ;
   private java.util.Date[] BC01Q711_A34AlbProfch ;
   private java.util.Date[] BC01Q711_A4023AlbFecSal ;
   private String[] BC01Q711_A3865AlbHorSal ;
   private String[] BC01Q711_A7098AlbUsu ;
   private String[] BC01Q711_A1244GuiRemCln ;
   private int[] BC01Q711_A3869AlbCliDes ;
   private byte[] BC01Q711_A1259AlbDomEnv ;
   private boolean[] BC01Q711_n1259AlbDomEnv ;
   private String[] BC01Q711_A3868AlbMat ;
   private String[] BC01Q711_A2242AlbSec ;
   private byte[] BC01Q711_A5805AlbEnvFtp ;
   private String[] BC01Q711_A7101AlbLic ;
   private String[] BC01Q711_A10765AlbProAT ;
   private java.util.Date[] BC01Q711_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q711_A10020AlbGrossT ;
   private String[] BC01Q711_A10837AlbTrnNc ;
   private String[] BC01Q711_A10017AlbFmd ;
   private boolean[] BC01Q711_n10017AlbFmd ;
   private String[] BC01Q711_A10835AlbTrnNm ;
   private String[] BC01Q711_A10018ALbFmdc ;
   private String[] BC01Q711_A10836AlbTrnDm ;
   private String[] BC01Q711_A5140AlbMarca ;
   private byte[] BC01Q711_A3867AlbLocDes ;
   private byte[] BC01Q711_A3866AlbLocCar ;
   private byte[] BC01Q711_A914AlbPObsCon ;
   private String[] BC01Q711_A5141AlbIvaCod ;
   private String[] BC01Q711_A7987AlbColCa ;
   private int[] BC01Q711_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q711_A7986AlbCambio ;
   private int[] BC01Q711_A7985AlbTipDoc ;
   private String[] BC01Q711_A7984AlbMotTr ;
   private byte[] BC01Q711_A5803AlbTipCal ;
   private String[] BC01Q711_A7988AlbObsCb ;
   private long[] BC01Q711_A7102AlbNumT ;
   private String[] BC01Q711_A7100AlbMarCo ;
   private String[] BC01Q711_A7099AlbOComp ;
   private String[] BC01Q711_A3093AlbDivTCod ;
   private boolean[] BC01Q711_n3093AlbDivTCod ;
   private String[] BC01Q711_A3109AlbDivAbr ;
   private boolean[] BC01Q711_n3109AlbDivAbr ;
   private byte[] BC01Q711_A1258GuiRemDom ;
   private boolean[] BC01Q711_n1258GuiRemDom ;
   private String[] BC01Q711_A3145GuiRemDivT ;
   private boolean[] BC01Q711_n3145GuiRemDivT ;
   private String[] BC01Q711_A407EmprNom ;
   private boolean[] BC01Q711_n407EmprNom ;
   private String[] BC01Q711_A1253EmprGuiRem ;
   private int[] BC01Q711_A1243GuiRemCli ;
   private String[] BC01Q711_A396EmprCod ;
   private short[] BC01Q711_A840TrnCod ;
   private byte[] BC01Q711_A3108AlbDivCod ;
   private boolean[] BC01Q711_n3108AlbDivCod ;
   private byte[] BC01Q711_A3110GuiRemDiv ;
   private boolean[] BC01Q711_n3110GuiRemDiv ;
   private byte[] BC01Q711_A1260BusDomEnv ;
   private boolean[] BC01Q711_n1260BusDomEnv ;
   private String[] BC01Q712_A841TrnNom ;
   private boolean[] BC01Q712_n841TrnNom ;
   private String[] BC01Q712_A3643TrnNif ;
   private boolean[] BC01Q712_n3643TrnNif ;
   private String[] BC01Q713_A841TrnNom ;
   private boolean[] BC01Q713_n841TrnNom ;
   private String[] BC01Q713_A3643TrnNif ;
   private boolean[] BC01Q713_n3643TrnNif ;
   private String[] BC01Q714_A841TrnNom ;
   private boolean[] BC01Q714_n841TrnNom ;
   private String[] BC01Q714_A3643TrnNif ;
   private boolean[] BC01Q714_n3643TrnNif ;
   private String[] BC01Q715_A1244GuiRemCln ;
   private String[] BC01Q715_A3145GuiRemDivT ;
   private boolean[] BC01Q715_n3145GuiRemDivT ;
   private byte[] BC01Q715_A3110GuiRemDiv ;
   private boolean[] BC01Q715_n3110GuiRemDiv ;
   private byte[] BC01Q716_A1260BusDomEnv ;
   private boolean[] BC01Q716_n1260BusDomEnv ;
   private String[] BC01Q717_A841TrnNom ;
   private boolean[] BC01Q717_n841TrnNom ;
   private String[] BC01Q717_A3643TrnNif ;
   private boolean[] BC01Q717_n3643TrnNif ;
   private String[] BC01Q718_A3109AlbDivAbr ;
   private boolean[] BC01Q718_n3109AlbDivAbr ;
   private String[] BC01Q719_A396EmprCod ;
   private long[] BC01Q719_A30AlbProCod ;
   private long[] BC01Q720_A30AlbProCod ;
   private String[] BC01Q720_A39AlbProPri ;
   private byte[] BC01Q720_A33AlbProEst ;
   private java.util.Date[] BC01Q720_A34AlbProfch ;
   private java.util.Date[] BC01Q720_A4023AlbFecSal ;
   private String[] BC01Q720_A3865AlbHorSal ;
   private String[] BC01Q720_A7098AlbUsu ;
   private int[] BC01Q720_A3869AlbCliDes ;
   private byte[] BC01Q720_A1259AlbDomEnv ;
   private boolean[] BC01Q720_n1259AlbDomEnv ;
   private String[] BC01Q720_A3868AlbMat ;
   private String[] BC01Q720_A2242AlbSec ;
   private byte[] BC01Q720_A5805AlbEnvFtp ;
   private String[] BC01Q720_A7101AlbLic ;
   private String[] BC01Q720_A10765AlbProAT ;
   private java.util.Date[] BC01Q720_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q720_A10020AlbGrossT ;
   private String[] BC01Q720_A10837AlbTrnNc ;
   private String[] BC01Q720_A10017AlbFmd ;
   private boolean[] BC01Q720_n10017AlbFmd ;
   private String[] BC01Q720_A10835AlbTrnNm ;
   private String[] BC01Q720_A10018ALbFmdc ;
   private String[] BC01Q720_A10836AlbTrnDm ;
   private String[] BC01Q720_A5140AlbMarca ;
   private byte[] BC01Q720_A3867AlbLocDes ;
   private byte[] BC01Q720_A3866AlbLocCar ;
   private byte[] BC01Q720_A914AlbPObsCon ;
   private String[] BC01Q720_A5141AlbIvaCod ;
   private String[] BC01Q720_A7987AlbColCa ;
   private int[] BC01Q720_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q720_A7986AlbCambio ;
   private int[] BC01Q720_A7985AlbTipDoc ;
   private String[] BC01Q720_A7984AlbMotTr ;
   private byte[] BC01Q720_A5803AlbTipCal ;
   private String[] BC01Q720_A7988AlbObsCb ;
   private long[] BC01Q720_A7102AlbNumT ;
   private String[] BC01Q720_A7100AlbMarCo ;
   private String[] BC01Q720_A7099AlbOComp ;
   private String[] BC01Q720_A3093AlbDivTCod ;
   private boolean[] BC01Q720_n3093AlbDivTCod ;
   private byte[] BC01Q720_A1258GuiRemDom ;
   private boolean[] BC01Q720_n1258GuiRemDom ;
   private String[] BC01Q720_A1253EmprGuiRem ;
   private int[] BC01Q720_A1243GuiRemCli ;
   private String[] BC01Q720_A396EmprCod ;
   private short[] BC01Q720_A840TrnCod ;
   private byte[] BC01Q720_A3108AlbDivCod ;
   private boolean[] BC01Q720_n3108AlbDivCod ;
   private long[] BC01Q721_A30AlbProCod ;
   private String[] BC01Q721_A39AlbProPri ;
   private byte[] BC01Q721_A33AlbProEst ;
   private java.util.Date[] BC01Q721_A34AlbProfch ;
   private java.util.Date[] BC01Q721_A4023AlbFecSal ;
   private String[] BC01Q721_A3865AlbHorSal ;
   private String[] BC01Q721_A7098AlbUsu ;
   private int[] BC01Q721_A3869AlbCliDes ;
   private byte[] BC01Q721_A1259AlbDomEnv ;
   private boolean[] BC01Q721_n1259AlbDomEnv ;
   private String[] BC01Q721_A3868AlbMat ;
   private String[] BC01Q721_A2242AlbSec ;
   private byte[] BC01Q721_A5805AlbEnvFtp ;
   private String[] BC01Q721_A7101AlbLic ;
   private String[] BC01Q721_A10765AlbProAT ;
   private java.util.Date[] BC01Q721_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q721_A10020AlbGrossT ;
   private String[] BC01Q721_A10837AlbTrnNc ;
   private String[] BC01Q721_A10017AlbFmd ;
   private boolean[] BC01Q721_n10017AlbFmd ;
   private String[] BC01Q721_A10835AlbTrnNm ;
   private String[] BC01Q721_A10018ALbFmdc ;
   private String[] BC01Q721_A10836AlbTrnDm ;
   private String[] BC01Q721_A5140AlbMarca ;
   private byte[] BC01Q721_A3867AlbLocDes ;
   private byte[] BC01Q721_A3866AlbLocCar ;
   private byte[] BC01Q721_A914AlbPObsCon ;
   private String[] BC01Q721_A5141AlbIvaCod ;
   private String[] BC01Q721_A7987AlbColCa ;
   private int[] BC01Q721_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q721_A7986AlbCambio ;
   private int[] BC01Q721_A7985AlbTipDoc ;
   private String[] BC01Q721_A7984AlbMotTr ;
   private byte[] BC01Q721_A5803AlbTipCal ;
   private String[] BC01Q721_A7988AlbObsCb ;
   private long[] BC01Q721_A7102AlbNumT ;
   private String[] BC01Q721_A7100AlbMarCo ;
   private String[] BC01Q721_A7099AlbOComp ;
   private String[] BC01Q721_A3093AlbDivTCod ;
   private boolean[] BC01Q721_n3093AlbDivTCod ;
   private byte[] BC01Q721_A1258GuiRemDom ;
   private boolean[] BC01Q721_n1258GuiRemDom ;
   private String[] BC01Q721_A1253EmprGuiRem ;
   private int[] BC01Q721_A1243GuiRemCli ;
   private String[] BC01Q721_A396EmprCod ;
   private short[] BC01Q721_A840TrnCod ;
   private byte[] BC01Q721_A3108AlbDivCod ;
   private boolean[] BC01Q721_n3108AlbDivCod ;
   private String[] BC01Q725_A841TrnNom ;
   private boolean[] BC01Q725_n841TrnNom ;
   private String[] BC01Q725_A3643TrnNif ;
   private boolean[] BC01Q725_n3643TrnNif ;
   private String[] BC01Q726_A3109AlbDivAbr ;
   private boolean[] BC01Q726_n3109AlbDivAbr ;
   private String[] BC01Q727_A1244GuiRemCln ;
   private String[] BC01Q727_A3145GuiRemDivT ;
   private boolean[] BC01Q727_n3145GuiRemDivT ;
   private byte[] BC01Q727_A3110GuiRemDiv ;
   private boolean[] BC01Q727_n3110GuiRemDiv ;
   private String[] BC01Q728_A841TrnNom ;
   private boolean[] BC01Q728_n841TrnNom ;
   private String[] BC01Q728_A3643TrnNif ;
   private boolean[] BC01Q728_n3643TrnNif ;
   private byte[] BC01Q729_A1260BusDomEnv ;
   private boolean[] BC01Q729_n1260BusDomEnv ;
   private String[] BC01Q730_A396EmprCod ;
   private long[] BC01Q730_A30AlbProCod ;
   private byte[] BC01Q730_A12185DltLinObs ;
   private String[] BC01Q731_A396EmprCod ;
   private long[] BC01Q731_A30AlbProCod ;
   private int[] BC01Q731_A12176DltHdr ;
   private byte[] BC01Q731_A12177DltR ;
   private String[] BC01Q731_A12178DltP ;
   private String[] BC01Q732_A396EmprCod ;
   private long[] BC01Q732_A30AlbProCod ;
   private String[] BC01Q732_A7540Alb_NFisca ;
   private String[] BC01Q733_A396EmprCod ;
   private long[] BC01Q733_A30AlbProCod ;
   private int[] BC01Q733_A129BarCod ;
   private byte[] BC01Q733_A132BarCodReo ;
   private String[] BC01Q733_A130BarCodPar ;
   private String[] BC01Q734_A396EmprCod ;
   private long[] BC01Q734_A30AlbProCod ;
   private byte[] BC01Q734_A915AlbPObsLin ;
   private int[] BC01Q735_A252CliCod ;
   private byte[] BC01Q735_A266CliEnvLin ;
   private long[] BC01Q735_A30AlbProCod ;
   private String[] BC01Q735_A39AlbProPri ;
   private byte[] BC01Q735_A33AlbProEst ;
   private java.util.Date[] BC01Q735_A34AlbProfch ;
   private java.util.Date[] BC01Q735_A4023AlbFecSal ;
   private String[] BC01Q735_A3865AlbHorSal ;
   private String[] BC01Q735_A7098AlbUsu ;
   private String[] BC01Q735_A1244GuiRemCln ;
   private int[] BC01Q735_A3869AlbCliDes ;
   private byte[] BC01Q735_A1259AlbDomEnv ;
   private boolean[] BC01Q735_n1259AlbDomEnv ;
   private String[] BC01Q735_A3868AlbMat ;
   private String[] BC01Q735_A2242AlbSec ;
   private byte[] BC01Q735_A5805AlbEnvFtp ;
   private String[] BC01Q735_A7101AlbLic ;
   private String[] BC01Q735_A10765AlbProAT ;
   private java.util.Date[] BC01Q735_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q735_A10020AlbGrossT ;
   private String[] BC01Q735_A10837AlbTrnNc ;
   private String[] BC01Q735_A10017AlbFmd ;
   private boolean[] BC01Q735_n10017AlbFmd ;
   private String[] BC01Q735_A10835AlbTrnNm ;
   private String[] BC01Q735_A10018ALbFmdc ;
   private String[] BC01Q735_A10836AlbTrnDm ;
   private String[] BC01Q735_A5140AlbMarca ;
   private byte[] BC01Q735_A3867AlbLocDes ;
   private byte[] BC01Q735_A3866AlbLocCar ;
   private byte[] BC01Q735_A914AlbPObsCon ;
   private String[] BC01Q735_A5141AlbIvaCod ;
   private String[] BC01Q735_A7987AlbColCa ;
   private int[] BC01Q735_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q735_A7986AlbCambio ;
   private int[] BC01Q735_A7985AlbTipDoc ;
   private String[] BC01Q735_A7984AlbMotTr ;
   private byte[] BC01Q735_A5803AlbTipCal ;
   private String[] BC01Q735_A7988AlbObsCb ;
   private long[] BC01Q735_A7102AlbNumT ;
   private String[] BC01Q735_A7100AlbMarCo ;
   private String[] BC01Q735_A7099AlbOComp ;
   private String[] BC01Q735_A3093AlbDivTCod ;
   private boolean[] BC01Q735_n3093AlbDivTCod ;
   private String[] BC01Q735_A3109AlbDivAbr ;
   private boolean[] BC01Q735_n3109AlbDivAbr ;
   private byte[] BC01Q735_A1258GuiRemDom ;
   private boolean[] BC01Q735_n1258GuiRemDom ;
   private String[] BC01Q735_A3145GuiRemDivT ;
   private boolean[] BC01Q735_n3145GuiRemDivT ;
   private String[] BC01Q735_A407EmprNom ;
   private boolean[] BC01Q735_n407EmprNom ;
   private String[] BC01Q735_A1253EmprGuiRem ;
   private int[] BC01Q735_A1243GuiRemCli ;
   private String[] BC01Q735_A396EmprCod ;
   private short[] BC01Q735_A840TrnCod ;
   private byte[] BC01Q735_A3108AlbDivCod ;
   private boolean[] BC01Q735_n3108AlbDivCod ;
   private byte[] BC01Q735_A3110GuiRemDiv ;
   private boolean[] BC01Q735_n3110GuiRemDiv ;
   private byte[] BC01Q735_A1260BusDomEnv ;
   private boolean[] BC01Q735_n1260BusDomEnv ;
   private String[] BC01Q736_A407EmprNom ;
   private boolean[] BC01Q736_n407EmprNom ;
   private String[] BC01Q737_A407EmprNom ;
   private boolean[] BC01Q737_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private long[] BC01Q72_A30AlbProCod ;
   private String[] BC01Q72_A39AlbProPri ;
   private byte[] BC01Q72_A33AlbProEst ;
   private java.util.Date[] BC01Q72_A34AlbProfch ;
   private java.util.Date[] BC01Q72_A4023AlbFecSal ;
   private String[] BC01Q72_A3865AlbHorSal ;
   private String[] BC01Q72_A7098AlbUsu ;
   private int[] BC01Q72_A3869AlbCliDes ;
   private byte[] BC01Q72_A1259AlbDomEnv ;
   private String[] BC01Q72_A3868AlbMat ;
   private String[] BC01Q72_A2242AlbSec ;
   private byte[] BC01Q72_A5805AlbEnvFtp ;
   private String[] BC01Q72_A7101AlbLic ;
   private String[] BC01Q72_A10765AlbProAT ;
   private java.util.Date[] BC01Q72_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q72_A10020AlbGrossT ;
   private String[] BC01Q72_A10837AlbTrnNc ;
   private String[] BC01Q72_A10017AlbFmd ;
   private String[] BC01Q72_A10835AlbTrnNm ;
   private String[] BC01Q72_A10018ALbFmdc ;
   private String[] BC01Q72_A10836AlbTrnDm ;
   private String[] BC01Q72_A5140AlbMarca ;
   private byte[] BC01Q72_A3867AlbLocDes ;
   private byte[] BC01Q72_A3866AlbLocCar ;
   private byte[] BC01Q72_A914AlbPObsCon ;
   private String[] BC01Q72_A5141AlbIvaCod ;
   private String[] BC01Q72_A7987AlbColCa ;
   private int[] BC01Q72_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q72_A7986AlbCambio ;
   private int[] BC01Q72_A7985AlbTipDoc ;
   private String[] BC01Q72_A7984AlbMotTr ;
   private byte[] BC01Q72_A5803AlbTipCal ;
   private String[] BC01Q72_A7988AlbObsCb ;
   private long[] BC01Q72_A7102AlbNumT ;
   private String[] BC01Q72_A7100AlbMarCo ;
   private String[] BC01Q72_A7099AlbOComp ;
   private String[] BC01Q72_A3093AlbDivTCod ;
   private byte[] BC01Q72_A1258GuiRemDom ;
   private String[] BC01Q72_A1253EmprGuiRem ;
   private int[] BC01Q72_A1243GuiRemCli ;
   private String[] BC01Q72_A396EmprCod ;
   private short[] BC01Q72_A840TrnCod ;
   private byte[] BC01Q72_A3108AlbDivCod ;
   private long[] BC01Q73_A30AlbProCod ;
   private String[] BC01Q73_A39AlbProPri ;
   private byte[] BC01Q73_A33AlbProEst ;
   private java.util.Date[] BC01Q73_A34AlbProfch ;
   private java.util.Date[] BC01Q73_A4023AlbFecSal ;
   private String[] BC01Q73_A3865AlbHorSal ;
   private String[] BC01Q73_A7098AlbUsu ;
   private int[] BC01Q73_A3869AlbCliDes ;
   private byte[] BC01Q73_A1259AlbDomEnv ;
   private String[] BC01Q73_A3868AlbMat ;
   private String[] BC01Q73_A2242AlbSec ;
   private byte[] BC01Q73_A5805AlbEnvFtp ;
   private String[] BC01Q73_A7101AlbLic ;
   private String[] BC01Q73_A10765AlbProAT ;
   private java.util.Date[] BC01Q73_A10019AlbHhfm ;
   private java.math.BigDecimal[] BC01Q73_A10020AlbGrossT ;
   private String[] BC01Q73_A10837AlbTrnNc ;
   private String[] BC01Q73_A10017AlbFmd ;
   private String[] BC01Q73_A10835AlbTrnNm ;
   private String[] BC01Q73_A10018ALbFmdc ;
   private String[] BC01Q73_A10836AlbTrnDm ;
   private String[] BC01Q73_A5140AlbMarca ;
   private byte[] BC01Q73_A3867AlbLocDes ;
   private byte[] BC01Q73_A3866AlbLocCar ;
   private byte[] BC01Q73_A914AlbPObsCon ;
   private String[] BC01Q73_A5141AlbIvaCod ;
   private String[] BC01Q73_A7987AlbColCa ;
   private int[] BC01Q73_A7162AlbDesp ;
   private java.math.BigDecimal[] BC01Q73_A7986AlbCambio ;
   private int[] BC01Q73_A7985AlbTipDoc ;
   private String[] BC01Q73_A7984AlbMotTr ;
   private byte[] BC01Q73_A5803AlbTipCal ;
   private String[] BC01Q73_A7988AlbObsCb ;
   private long[] BC01Q73_A7102AlbNumT ;
   private String[] BC01Q73_A7100AlbMarCo ;
   private String[] BC01Q73_A7099AlbOComp ;
   private String[] BC01Q73_A3093AlbDivTCod ;
   private byte[] BC01Q73_A1258GuiRemDom ;
   private String[] BC01Q73_A1253EmprGuiRem ;
   private int[] BC01Q73_A1243GuiRemCli ;
   private String[] BC01Q73_A396EmprCod ;
   private short[] BC01Q73_A840TrnCod ;
   private byte[] BC01Q73_A3108AlbDivCod ;
   private String[] BC01Q74_A1244GuiRemCln ;
   private String[] BC01Q74_A3145GuiRemDivT ;
   private byte[] BC01Q74_A3110GuiRemDiv ;
   private String[] BC01Q75_A407EmprNom ;
   private String[] BC01Q76_A841TrnNom ;
   private String[] BC01Q76_A3643TrnNif ;
   private String[] BC01Q77_A841TrnNom ;
   private String[] BC01Q77_A3643TrnNif ;
   private String[] BC01Q78_A3109AlbDivAbr ;
   private byte[] BC01Q79_A1260BusDomEnv ;
   private boolean[] BC01Q72_n1259AlbDomEnv ;
   private boolean[] BC01Q72_n10017AlbFmd ;
   private boolean[] BC01Q72_n3093AlbDivTCod ;
   private boolean[] BC01Q72_n1258GuiRemDom ;
   private boolean[] BC01Q72_n3108AlbDivCod ;
   private boolean[] BC01Q73_n1259AlbDomEnv ;
   private boolean[] BC01Q73_n10017AlbFmd ;
   private boolean[] BC01Q73_n3093AlbDivTCod ;
   private boolean[] BC01Q73_n1258GuiRemDom ;
   private boolean[] BC01Q73_n3108AlbDivCod ;
   private boolean[] BC01Q74_n3145GuiRemDivT ;
   private boolean[] BC01Q74_n3110GuiRemDiv ;
   private boolean[] BC01Q75_n407EmprNom ;
   private boolean[] BC01Q76_n841TrnNom ;
   private boolean[] BC01Q76_n3643TrnNif ;
   private boolean[] BC01Q77_n841TrnNom ;
   private boolean[] BC01Q77_n3643TrnNif ;
   private boolean[] BC01Q78_n3109AlbDivAbr ;
   private boolean[] BC01Q79_n1260BusDomEnv ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class calprd_trn_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01Q72", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q73", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q74", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q75", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q76", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q77", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q78", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q79", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q710", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q711", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbProPri, TM1.AlbProEst, TM1.AlbProfch, TM1.AlbFecSal, TM1.AlbHorSal, TM1.AlbUsu, T4.CliNom AS GuiRemCln, TM1.AlbCliDes, TM1.AlbDomEnv, TM1.AlbMat, TM1.AlbSec, TM1.AlbEnvFtp, TM1.AlbLic, TM1.AlbProAT, TM1.AlbHhfm, TM1.AlbGrossT, TM1.AlbTrnNc, TM1.AlbFmd, TM1.AlbTrnNm, TM1.ALbFmdc, TM1.AlbTrnDm, TM1.AlbMarca, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbPObsCon, TM1.AlbIvaCod, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbObsCb, TM1.AlbNumT, TM1.AlbMarCo, TM1.AlbOComp, TM1.AlbDivTCod, T3.DivAbr AS AlbDivAbr, TM1.GuiRemDom, T4.CliDivTra AS GuiRemDivT, T2.EmprNom, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q712", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q713", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q714", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q715", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q716", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q717", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q718", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q719", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q720", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q721", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01Q722", "INSERT INTO TXPCALPRD(AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbProEso, AlbProEnt, AlbProBon, AlbProTBo, AlbKilRea, AlbProNroF, AlbDomEv, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("BC01Q723", "UPDATE TXPCALPRD SET AlbProPri=?, AlbProEst=?, AlbProfch=?, AlbFecSal=?, AlbHorSal=?, AlbUsu=?, AlbCliDes=?, AlbDomEnv=?, AlbMat=?, AlbSec=?, AlbEnvFtp=?, AlbLic=?, AlbProAT=?, AlbHhfm=?, AlbGrossT=?, AlbTrnNc=?, AlbFmd=?, AlbTrnNm=?, ALbFmdc=?, AlbTrnDm=?, AlbMarca=?, AlbLocDes=?, AlbLocCar=?, AlbPObsCon=?, AlbIvaCod=?, AlbColCa=?, AlbDesp=?, AlbCambio=?, AlbTipDoc=?, AlbMotTr=?, AlbTipCal=?, AlbObsCb=?, AlbNumT=?, AlbMarCo=?, AlbOComp=?, AlbDivTCod=?, GuiRemDom=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("BC01Q724", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("BC01Q725", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q726", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q727", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q728", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q729", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q730", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01Q731", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01Q732", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01Q733", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01Q734", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01Q735", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbProPri, TM1.AlbProEst, TM1.AlbProfch, TM1.AlbFecSal, TM1.AlbHorSal, TM1.AlbUsu, T4.CliNom AS GuiRemCln, TM1.AlbCliDes, TM1.AlbDomEnv, TM1.AlbMat, TM1.AlbSec, TM1.AlbEnvFtp, TM1.AlbLic, TM1.AlbProAT, TM1.AlbHhfm, TM1.AlbGrossT, TM1.AlbTrnNc, TM1.AlbFmd, TM1.AlbTrnNm, TM1.ALbFmdc, TM1.AlbTrnDm, TM1.AlbMarca, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbPObsCon, TM1.AlbIvaCod, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbObsCb, TM1.AlbNumT, TM1.AlbMarCo, TM1.AlbOComp, TM1.AlbDivTCod, T3.DivAbr AS AlbDivAbr, TM1.GuiRemDom, T4.CliDivTra AS GuiRemDivT, T2.EmprNom, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q736", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q737", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 60);
               ((String[]) buf[24])[0] = rslt.getString(23, 255);
               ((String[]) buf[25])[0] = rslt.getString(24, 60);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(26);
               ((byte[]) buf[28])[0] = rslt.getByte(27);
               ((byte[]) buf[29])[0] = rslt.getByte(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 3);
               ((String[]) buf[31])[0] = rslt.getString(30, 20);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(32,4);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 25);
               ((byte[]) buf[36])[0] = rslt.getByte(35);
               ((String[]) buf[37])[0] = rslt.getString(36, 60);
               ((long[]) buf[38])[0] = rslt.getLong(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 30);
               ((String[]) buf[40])[0] = rslt.getString(39, 30);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(42);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
               ((int[]) buf[52])[0] = rslt.getInt(46);
               ((String[]) buf[53])[0] = rslt.getString(47, 3);
               ((short[]) buf[54])[0] = rslt.getShort(48);
               ((byte[]) buf[55])[0] = rslt.getByte(49);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(50);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(51);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 27 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 60);
               ((String[]) buf[24])[0] = rslt.getString(23, 255);
               ((String[]) buf[25])[0] = rslt.getString(24, 60);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(26);
               ((byte[]) buf[28])[0] = rslt.getByte(27);
               ((byte[]) buf[29])[0] = rslt.getByte(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 3);
               ((String[]) buf[31])[0] = rslt.getString(30, 20);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(32,4);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 25);
               ((byte[]) buf[36])[0] = rslt.getByte(35);
               ((String[]) buf[37])[0] = rslt.getString(36, 60);
               ((long[]) buf[38])[0] = rslt.getLong(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 30);
               ((String[]) buf[40])[0] = rslt.getString(39, 30);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(42);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
               ((int[]) buf[52])[0] = rslt.getInt(46);
               ((String[]) buf[53])[0] = rslt.getString(47, 3);
               ((short[]) buf[54])[0] = rslt.getShort(48);
               ((byte[]) buf[55])[0] = rslt.getByte(49);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(50);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(51);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[9]).byteValue());
               }
               stmt.setString(10, (String)parms[10], 20);
               stmt.setString(11, (String)parms[11], 1);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 20);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setDateTime(15, (java.util.Date)parms[15], false);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 20);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[19], 255);
               }
               stmt.setString(19, (String)parms[20], 60);
               stmt.setString(20, (String)parms[21], 255);
               stmt.setString(21, (String)parms[22], 60);
               stmt.setString(22, (String)parms[23], 1);
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setByte(25, ((Number) parms[26]).byteValue());
               stmt.setString(26, (String)parms[27], 3);
               stmt.setString(27, (String)parms[28], 20);
               stmt.setInt(28, ((Number) parms[29]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 4);
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setString(31, (String)parms[32], 25);
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setString(33, (String)parms[34], 60);
               stmt.setLong(34, ((Number) parms[35]).longValue());
               stmt.setString(35, (String)parms[36], 30);
               stmt.setString(36, (String)parms[37], 30);
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[41]).byteValue());
               }
               stmt.setString(39, (String)parms[42], 3);
               stmt.setInt(40, ((Number) parms[43]).intValue());
               stmt.setString(41, (String)parms[44], 3);
               stmt.setShort(42, ((Number) parms[45]).shortValue());
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[47]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[8]).byteValue());
               }
               stmt.setString(9, (String)parms[9], 20);
               stmt.setString(10, (String)parms[10], 1);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 20);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setDateTime(14, (java.util.Date)parms[14], false);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 20);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[18], 255);
               }
               stmt.setString(18, (String)parms[19], 60);
               stmt.setString(19, (String)parms[20], 255);
               stmt.setString(20, (String)parms[21], 60);
               stmt.setString(21, (String)parms[22], 1);
               stmt.setByte(22, ((Number) parms[23]).byteValue());
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setString(25, (String)parms[26], 3);
               stmt.setString(26, (String)parms[27], 20);
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[29], 4);
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setString(30, (String)parms[31], 25);
               stmt.setByte(31, ((Number) parms[32]).byteValue());
               stmt.setString(32, (String)parms[33], 60);
               stmt.setLong(33, ((Number) parms[34]).longValue());
               stmt.setString(34, (String)parms[35], 30);
               stmt.setString(35, (String)parms[36], 30);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[40]).byteValue());
               }
               stmt.setString(38, (String)parms[41], 3);
               stmt.setInt(39, ((Number) parms[42]).intValue());
               stmt.setShort(40, ((Number) parms[43]).shortValue());
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[45]).byteValue());
               }
               stmt.setString(42, (String)parms[46], 3);
               stmt.setLong(43, ((Number) parms[47]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

