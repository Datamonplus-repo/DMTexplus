package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class bc_albrec_bc extends GXWebPanel implements IGxSilentTrn
{
   public bc_albrec_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public bc_albrec_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( bc_albrec_bc.class ));
   }

   public bc_albrec_bc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1VZ7( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1VZ7( ) ;
      standaloneModal( ) ;
      addRow1VZ7( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z44AlbRecCod = A44AlbRecCod ;
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

   public void confirm_1VZ0( )
   {
      beforeValidate1VZ7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VZ7( ) ;
         }
         else
         {
            checkExtendedTable1VZ7( ) ;
            if ( AnyError == 0 )
            {
               zm1VZ7( 92) ;
               zm1VZ7( 93) ;
               zm1VZ7( 94) ;
               zm1VZ7( 95) ;
               zm1VZ7( 96) ;
               zm1VZ7( 97) ;
               zm1VZ7( 98) ;
               zm1VZ7( 99) ;
            }
            closeExtendedTableCursors1VZ7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_1VZ191( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
      }
   }

   public void confirm_1VZ191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      nGXsfl_191_idx = 0 ;
      while ( nGXsfl_191_idx < bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().size() )
      {
         readRow1VZ191( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound191 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_191 != 0 ) )
         {
            getKey1VZ191( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound191 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1VZ191( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1VZ191( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1VZ191( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                     O1301AlbRUlin = A1301AlbRUlin ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound191 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1VZ191( ) ;
                     load1VZ191( ) ;
                     beforeValidate1VZ191( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1VZ191( ) ;
                        O1301AlbRUlin = A1301AlbRUlin ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_191 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1VZ191( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1VZ191( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1VZ191( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                           O1301AlbRUlin = A1301AlbRUlin ;
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow191( ((app.SdtBC_ALBREC_Level1Item)bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().elementAt(-1+nGXsfl_191_idx))) ;
         }
      }
      O1301AlbRUlin = s1301AlbRUlin ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e111VZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      bc_albrec_bc.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      GXv_char2[0] = AV175EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      bc_albrec_bc.this.AV175EmprCod = GXv_char2[0] ;
      bc_albrec_bc.this.AV7EmprNom = GXv_char3[0] ;
      bc_albrec_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_int5 = AV164Enc20 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV164Enc20 = GXt_int5 ;
      GXt_int5 = AV103Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV103Moda21 = GXt_int5 ;
      GXt_int5 = AV104Cli350 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV104Cli350 = GXt_int5 ;
      GXt_int7 = AV105ContVal ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int8) ;
      bc_albrec_bc.this.GXt_int7 = GXv_int8[0] ;
      AV105ContVal = GXt_int7 ;
      AV64EncCli_20 = (byte)(((AV137Enc20c==1) ? 1 : 0)) ;
      GXt_int5 = AV42FlagKgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV42FlagKgs = GXt_int5 ;
      GXt_int5 = AV43FlagMts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV43FlagMts = GXt_int5 ;
      GXt_int5 = AV165okotex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "TEXOKO", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV165okotex = GXt_int5 ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV190Normas)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV190Normas = DecimalUtil.doubleToDec(GXt_int5) ;
      GXt_int5 = AV150CtrlArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "ARTEXI", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV150CtrlArt = GXt_int5 ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV191Sicrudo)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "SICRU0", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV191Sicrudo = DecimalUtil.doubleToDec(GXt_int5) ;
      GXt_int5 = AV164Enc20 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV164Enc20 = GXt_int5 ;
      GXt_int5 = AV103Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV103Moda21 = GXt_int5 ;
      GXt_int5 = AV104Cli350 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV104Cli350 = GXt_int5 ;
      GXt_int7 = AV105ContVal ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int8) ;
      bc_albrec_bc.this.GXt_int7 = GXv_int8[0] ;
      AV105ContVal = GXt_int7 ;
      AV64EncCli_20 = (byte)(((AV137Enc20c==1) ? 1 : 0)) ;
      GXt_int5 = AV42FlagKgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV42FlagKgs = GXt_int5 ;
      GXt_int5 = AV43FlagMts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV43FlagMts = GXt_int5 ;
      GXt_int5 = AV165okotex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "TEXOKO", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV165okotex = GXt_int5 ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV190Normas)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV190Normas = DecimalUtil.doubleToDec(GXt_int5) ;
      GXt_int5 = AV150CtrlArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "ARTEXI", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV150CtrlArt = GXt_int5 ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV191Sicrudo)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV175EmprCod, httpContext.getMessage( "SICRU0", ""), GXv_int6) ;
      bc_albrec_bc.this.GXt_int5 = GXv_int6[0] ;
      AV191Sicrudo = DecimalUtil.doubleToDec(GXt_int5) ;
   }

   public void zm1VZ7( int GX_JID )
   {
      if ( ( GX_JID == 91 ) || ( GX_JID == 0 ) )
      {
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z317AlbStLot = A317AlbStLot ;
         Z12879AlbOEKOTEX = A12879AlbOEKOTEX ;
         Z45AlbRef = A45AlbRef ;
         Z46AlbREnt = A46AlbREnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z4601AlbRTam = A4601AlbRTam ;
         Z9749Emp_Item1 = A9749Emp_Item1 ;
         Z55AlbRReo = A55AlbRReo ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z5743AlbRPre = A5743AlbRPre ;
         Z5744AlbRAju = A5744AlbRAju ;
         Z5745AlbRRep = A5745AlbRRep ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z6178AlbrUsu = A6178AlbrUsu ;
         Z6179AlbrHor = A6179AlbrHor ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z6183AlbrFeNf = A6183AlbrFeNf ;
         Z6184AlbrCfop = A6184AlbrCfop ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z3360AlbRImp = A3360AlbRImp ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z14525AlbRLot2 = A14525AlbRLot2 ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z6470AlbRTara = A6470AlbRTara ;
         Z6471AlbRUniB = A6471AlbRUniB ;
         Z6488AlbDocPrv = A6488AlbDocPrv ;
         Z6523AlbRUdas = A6523AlbRUdas ;
         Z8023AlbColor = A8023AlbColor ;
         Z8024AlbOpsT = A8024AlbOpsT ;
         Z8025AlbOpsC = A8025AlbOpsC ;
         Z8026AlbOC = A8026AlbOC ;
         Z8027AlbHdri = A8027AlbHdri ;
         Z8028AlbNumB = A8028AlbNumB ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z8030AlbAncC = A8030AlbAncC ;
         Z8031AlbDndC = A8031AlbDndC ;
         Z8032AlbAncCr = A8032AlbAncCr ;
         Z8033AlbDndCr = A8033AlbDndCr ;
         Z8034AlbGalga = A8034AlbGalga ;
         Z8035AlbMaqTej = A8035AlbMaqTej ;
         Z8036AlbDmt = A8036AlbDmt ;
         Z9793AlbPdaC = A9793AlbPdaC ;
         Z9794AlbOStj = A9794AlbOStj ;
         Z10358AlbTurno = A10358AlbTurno ;
         Z252CliCod = A252CliCod ;
         Z6263AlbRTartC = A6263AlbRTartC ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z4792AlmCod = A4792AlmCod ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 92 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 93 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z8723CliEst = A8723CliEst ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 94 ) || ( GX_JID == 0 ) )
      {
         Z6264AlbRTartD = A6264AlbRTartD ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 95 ) || ( GX_JID == 0 ) )
      {
         Z841TrnNom = A841TrnNom ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 96 ) || ( GX_JID == 0 ) )
      {
         Z971ProceNom = A971ProceNom ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 97 ) || ( GX_JID == 0 ) )
      {
         Z1212TipEntNom = A1212TipEntNom ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 98 ) || ( GX_JID == 0 ) )
      {
         Z4793AlmNom = A4793AlmNom ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( ( GX_JID == 99 ) || ( GX_JID == 0 ) )
      {
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z4291AlbPzaEst = A4291AlbPzaEst ;
         Z14210AlbREnt_3 = A14210AlbREnt_3 ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
      }
      if ( GX_JID == -91 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z317AlbStLot = A317AlbStLot ;
         Z12879AlbOEKOTEX = A12879AlbOEKOTEX ;
         Z45AlbRef = A45AlbRef ;
         Z46AlbREnt = A46AlbREnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z4601AlbRTam = A4601AlbRTam ;
         Z9749Emp_Item1 = A9749Emp_Item1 ;
         Z55AlbRReo = A55AlbRReo ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z5743AlbRPre = A5743AlbRPre ;
         Z5744AlbRAju = A5744AlbRAju ;
         Z5745AlbRRep = A5745AlbRRep ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z6178AlbrUsu = A6178AlbrUsu ;
         Z6179AlbrHor = A6179AlbrHor ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z6183AlbrFeNf = A6183AlbrFeNf ;
         Z6184AlbrCfop = A6184AlbrCfop ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z3360AlbRImp = A3360AlbRImp ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z14525AlbRLot2 = A14525AlbRLot2 ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z6470AlbRTara = A6470AlbRTara ;
         Z6471AlbRUniB = A6471AlbRUniB ;
         Z6488AlbDocPrv = A6488AlbDocPrv ;
         Z6523AlbRUdas = A6523AlbRUdas ;
         Z8023AlbColor = A8023AlbColor ;
         Z8024AlbOpsT = A8024AlbOpsT ;
         Z8025AlbOpsC = A8025AlbOpsC ;
         Z8026AlbOC = A8026AlbOC ;
         Z8027AlbHdri = A8027AlbHdri ;
         Z8028AlbNumB = A8028AlbNumB ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z8030AlbAncC = A8030AlbAncC ;
         Z8031AlbDndC = A8031AlbDndC ;
         Z8032AlbAncCr = A8032AlbAncCr ;
         Z8033AlbDndCr = A8033AlbDndCr ;
         Z8034AlbGalga = A8034AlbGalga ;
         Z8035AlbMaqTej = A8035AlbMaqTej ;
         Z8036AlbDmt = A8036AlbDmt ;
         Z9793AlbPdaC = A9793AlbPdaC ;
         Z9794AlbOStj = A9794AlbOStj ;
         Z10358AlbTurno = A10358AlbTurno ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z6263AlbRTartC = A6263AlbRTartC ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z4792AlmCod = A4792AlmCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8723CliEst = A8723CliEst ;
         Z13982AlbRArtLu = A13982AlbRArtLu ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z971ProceNom = A971ProceNom ;
         Z6264AlbRTartD = A6264AlbRTartD ;
         Z4793AlmNom = A4793AlmNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV189Pgmname = "BC_ALBREC_BC" ;
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV35Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV35Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV35Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
            }
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6183AlbrFeNf)) && ( Gx_BScreen == 0 ) )
      {
         A6183AlbrFeNf = GXutil.today( ) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6182AlbrNF)==0) && ( Gx_BScreen == 0 ) )
      {
         A6182AlbrNF = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A6179AlbrHor) && ( Gx_BScreen == 0 ) )
      {
         A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6178AlbrUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6178AlbrUsu = AV8UsurCod ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3360AlbRImp)==0) && ( Gx_BScreen == 0 ) )
      {
         A3360AlbRImp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A4602AlbRMdlCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A4602AlbRMdlCod = " " ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6463AlbRLote)==0) && ( Gx_BScreen == 0 ) )
      {
         A6463AlbRLote = " " ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6464AlbRTelar)==0) && ( Gx_BScreen == 0 ) )
      {
         A6464AlbRTelar = " " ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6470AlbRTara)==0) && ( Gx_BScreen == 0 ) )
      {
         A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6471AlbRUniB)==0) && ( Gx_BScreen == 0 ) )
      {
         A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6523AlbRUdas)==0) && ( Gx_BScreen == 0 ) )
      {
         A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      }
      AV76Albrfenf = A6183AlbrFeNf ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
         }
         AV87albrfen = A49AlbRFen ;
         AV83albrreo = A55AlbRReo ;
         AV155OldAlbRreo = O55AlbRReo ;
         AV84albrnf = A6182AlbrNF ;
         AV156AlbRMdlCod = O4602AlbRMdlCod ;
         AV157ALbrlote = O6463AlbRLote ;
         AV159AlbRTelar = O6464AlbRTelar ;
         AV158AlbRLu = O6465AlbRLu ;
      }
   }

   public void load1VZ7( )
   {
      /* Using cursor BC01VZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A56AlbRUni = BC01VZ14_A56AlbRUni[0] ;
         A47AlbREst = BC01VZ14_A47AlbREst[0] ;
         A317AlbStLot = BC01VZ14_A317AlbStLot[0] ;
         A12879AlbOEKOTEX = BC01VZ14_A12879AlbOEKOTEX[0] ;
         A407EmprNom = BC01VZ14_A407EmprNom[0] ;
         n407EmprNom = BC01VZ14_n407EmprNom[0] ;
         A279CliNom = BC01VZ14_A279CliNom[0] ;
         A45AlbRef = BC01VZ14_A45AlbRef[0] ;
         A841TrnNom = BC01VZ14_A841TrnNom[0] ;
         n841TrnNom = BC01VZ14_n841TrnNom[0] ;
         A46AlbREnt = BC01VZ14_A46AlbREnt[0] ;
         A52AlbRPieEnt = BC01VZ14_A52AlbRPieEnt[0] ;
         A50AlbRLoc = BC01VZ14_A50AlbRLoc[0] ;
         A49AlbRFen = BC01VZ14_A49AlbRFen[0] ;
         A58AlbRUniEnt = BC01VZ14_A58AlbRUniEnt[0] ;
         A4601AlbRTam = BC01VZ14_A4601AlbRTam[0] ;
         A9749Emp_Item1 = BC01VZ14_A9749Emp_Item1[0] ;
         A55AlbRReo = BC01VZ14_A55AlbRReo[0] ;
         A54AlbRPieUti = BC01VZ14_A54AlbRPieUti[0] ;
         A53AlbRPieReb = BC01VZ14_A53AlbRPieReb[0] ;
         A60AlbRUniUti = BC01VZ14_A60AlbRUniUti[0] ;
         A59AlbRUniReb = BC01VZ14_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = BC01VZ14_A48AlbRFecUlt[0] ;
         A1212TipEntNom = BC01VZ14_A1212TipEntNom[0] ;
         n1212TipEntNom = BC01VZ14_n1212TipEntNom[0] ;
         A1222AlbNumEti = BC01VZ14_A1222AlbNumEti[0] ;
         A1291AlbRDes = BC01VZ14_A1291AlbRDes[0] ;
         A971ProceNom = BC01VZ14_A971ProceNom[0] ;
         n971ProceNom = BC01VZ14_n971ProceNom[0] ;
         A1301AlbRUlin = BC01VZ14_A1301AlbRUlin[0] ;
         A3613AlbRefDsc = BC01VZ14_A3613AlbRefDsc[0] ;
         A4290AlbPmPPza = BC01VZ14_A4290AlbPmPPza[0] ;
         A4920AlbRGrm2 = BC01VZ14_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = BC01VZ14_A4921AlbRAnc[0] ;
         A4922AlbPml = BC01VZ14_A4922AlbPml[0] ;
         A5743AlbRPre = BC01VZ14_A5743AlbRPre[0] ;
         A5744AlbRAju = BC01VZ14_A5744AlbRAju[0] ;
         A5745AlbRRep = BC01VZ14_A5745AlbRRep[0] ;
         A5806AlbREnt2 = BC01VZ14_A5806AlbREnt2[0] ;
         A6178AlbrUsu = BC01VZ14_A6178AlbrUsu[0] ;
         A6179AlbrHor = BC01VZ14_A6179AlbrHor[0] ;
         A6180AlbrUniC = BC01VZ14_A6180AlbrUniC[0] ;
         A6181AlbrPieC = BC01VZ14_A6181AlbrPieC[0] ;
         A6182AlbrNF = BC01VZ14_A6182AlbrNF[0] ;
         A6183AlbrFeNf = BC01VZ14_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = BC01VZ14_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = BC01VZ14_A3359AlbRDisCli[0] ;
         A6264AlbRTartD = BC01VZ14_A6264AlbRTartD[0] ;
         n6264AlbRTartD = BC01VZ14_n6264AlbRTartD[0] ;
         A3360AlbRImp = BC01VZ14_A3360AlbRImp[0] ;
         A6463AlbRLote = BC01VZ14_A6463AlbRLote[0] ;
         A6464AlbRTelar = BC01VZ14_A6464AlbRTelar[0] ;
         A14525AlbRLot2 = BC01VZ14_A14525AlbRLot2[0] ;
         A6465AlbRLu = BC01VZ14_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = BC01VZ14_A4602AlbRMdlCod[0] ;
         A6470AlbRTara = BC01VZ14_A6470AlbRTara[0] ;
         A6471AlbRUniB = BC01VZ14_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = BC01VZ14_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = BC01VZ14_A6523AlbRUdas[0] ;
         A4793AlmNom = BC01VZ14_A4793AlmNom[0] ;
         n4793AlmNom = BC01VZ14_n4793AlmNom[0] ;
         A8023AlbColor = BC01VZ14_A8023AlbColor[0] ;
         A8024AlbOpsT = BC01VZ14_A8024AlbOpsT[0] ;
         A8025AlbOpsC = BC01VZ14_A8025AlbOpsC[0] ;
         A8026AlbOC = BC01VZ14_A8026AlbOC[0] ;
         A8027AlbHdri = BC01VZ14_A8027AlbHdri[0] ;
         A8028AlbNumB = BC01VZ14_A8028AlbNumB[0] ;
         A8029AlbNumM = BC01VZ14_A8029AlbNumM[0] ;
         A8030AlbAncC = BC01VZ14_A8030AlbAncC[0] ;
         A8031AlbDndC = BC01VZ14_A8031AlbDndC[0] ;
         A8032AlbAncCr = BC01VZ14_A8032AlbAncCr[0] ;
         A8033AlbDndCr = BC01VZ14_A8033AlbDndCr[0] ;
         A8034AlbGalga = BC01VZ14_A8034AlbGalga[0] ;
         A8035AlbMaqTej = BC01VZ14_A8035AlbMaqTej[0] ;
         A8036AlbDmt = BC01VZ14_A8036AlbDmt[0] ;
         A9793AlbPdaC = BC01VZ14_A9793AlbPdaC[0] ;
         A9794AlbOStj = BC01VZ14_A9794AlbOStj[0] ;
         A10358AlbTurno = BC01VZ14_A10358AlbTurno[0] ;
         A8723CliEst = BC01VZ14_A8723CliEst[0] ;
         A252CliCod = BC01VZ14_A252CliCod[0] ;
         A6263AlbRTartC = BC01VZ14_A6263AlbRTartC[0] ;
         n6263AlbRTartC = BC01VZ14_n6263AlbRTartC[0] ;
         A840TrnCod = BC01VZ14_A840TrnCod[0] ;
         n840TrnCod = BC01VZ14_n840TrnCod[0] ;
         A970ProceCod = BC01VZ14_A970ProceCod[0] ;
         n970ProceCod = BC01VZ14_n970ProceCod[0] ;
         A1211TipEntCod = BC01VZ14_A1211TipEntCod[0] ;
         n1211TipEntCod = BC01VZ14_n1211TipEntCod[0] ;
         A4792AlmCod = BC01VZ14_A4792AlmCod[0] ;
         n4792AlmCod = BC01VZ14_n4792AlmCod[0] ;
         A13982AlbRArtLu = BC01VZ14_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = BC01VZ14_n13982AlbRArtLu[0] ;
         zm1VZ7( -91) ;
      }
      pr_default.close(12);
      onLoadActions1VZ7( ) ;
   }

   public void onLoadActions1VZ7( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
      }
      if ( isIns( )  && ( AV42FlagKgs == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
      {
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
      }
      else
      {
         if ( isIns( )  && ( AV43FlagMts == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
         {
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A12879AlbOEKOTEX)==0) && ( AV165okotex == 0 ) )
      {
         A12879AlbOEKOTEX = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      AV74AlbReccod = A44AlbRecCod ;
      AV88Doc_6 = A44AlbRecCod ;
      if ( true )
      {
         AV75Documento = GXutil.str( AV88Doc_6, 6, 0) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV75Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
         }
      }
      AV77CliCod = A252CliCod ;
      if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         A279CliNom_Visible = 0 ;
      }
      AV79AlbRef = GXutil.substring( A45AlbRef, 1, 6) ;
      if ( GXutil.strcmp(A5806AlbREnt2, " ") != 0 )
      {
         A14210AlbREnt_3 = A5806AlbREnt2 ;
      }
      else
      {
         A14210AlbREnt_3 = A46AlbREnt ;
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      AV80Albrpieent = A52AlbRPieEnt ;
      AV132PieEntold = O52AlbRPieEnt ;
      AV147oldpiee = O52AlbRPieEnt ;
      AV87albrfen = A49AlbRFen ;
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
      }
      else
      {
         A4291AlbPzaEst = 0 ;
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      AV60ALbRunient = A58AlbRUniEnt ;
      AV133UniENtold = O58AlbRUniEnt ;
      AV145Oldunie = O58AlbRUniEnt ;
      AV83albrreo = A55AlbRReo ;
      AV155OldAlbRreo = O55AlbRReo ;
      AV148oldpieu = O54AlbRPieUti ;
      AV146olduniu = O60AlbRUniUti ;
      AV86TipEntCod = A1211TipEntCod ;
      AV78Procecod = A970ProceCod ;
      AV81Albrpre = A5743AlbRPre ;
      AV84albrnf = A6182AlbrNF ;
      AV82albrcfop = A6184AlbrCfop ;
      AV157ALbrlote = O6463AlbRLote ;
      AV159AlbRTelar = O6464AlbRTelar ;
      if ( isIns( )  && true /* Level */ )
      {
         A317AlbStLot = AV140AlbStLot ;
      }
      AV158AlbRLu = O6465AlbRLu ;
      AV156AlbRMdlCod = O4602AlbRMdlCod ;
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
            }
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         A6180AlbrUniC = A58AlbRUniEnt ;
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         A6181AlbrPieC = A52AlbRPieEnt ;
      }
      if ( A47AlbREst == 1 )
      {
         AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      AV85AlbRunic = A6180AlbrUniC ;
   }

   public void checkExtendedTable1VZ7( )
   {
      nIsDirty_7 = (short)(0) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
      }
      if ( isIns( )  && ( AV42FlagKgs == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
      }
      else
      {
         if ( isIns( )  && ( AV43FlagMts == 1 ) && (GXutil.strcmp("", A56AlbRUni)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A12879AlbOEKOTEX)==0) && ( AV165okotex == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A12879AlbOEKOTEX = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( ( AV165okotex == 1 ) && ( ( GXutil.strcmp(A12879AlbOEKOTEX, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(A12879AlbOEKOTEX, httpContext.getMessage( "N", "")) != 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro Valor incorreto Deve ser S ou N.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC01VZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01VZ15_A407EmprNom[0] ;
      n407EmprNom = BC01VZ15_n407EmprNom[0] ;
      pr_default.close(13);
      /* Using cursor BC01VZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC01VZ16_A279CliNom[0] ;
      A8723CliEst = BC01VZ16_A8723CliEst[0] ;
      pr_default.close(14);
      /* Using cursor BC01VZ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
         }
      }
      A6264AlbRTartD = BC01VZ17_A6264AlbRTartD[0] ;
      n6264AlbRTartD = BC01VZ17_n6264AlbRTartD[0] ;
      pr_default.close(15);
      /* Using cursor BC01VZ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = BC01VZ18_A841TrnNom[0] ;
      n841TrnNom = BC01VZ18_n841TrnNom[0] ;
      pr_default.close(16);
      /* Using cursor BC01VZ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
         }
      }
      A971ProceNom = BC01VZ19_A971ProceNom[0] ;
      n971ProceNom = BC01VZ19_n971ProceNom[0] ;
      pr_default.close(17);
      /* Using cursor BC01VZ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
         }
      }
      A1212TipEntNom = BC01VZ20_A1212TipEntNom[0] ;
      n1212TipEntNom = BC01VZ20_n1212TipEntNom[0] ;
      pr_default.close(18);
      /* Using cursor BC01VZ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
         }
      }
      A4793AlmNom = BC01VZ21_A4793AlmNom[0] ;
      n4793AlmNom = BC01VZ21_n4793AlmNom[0] ;
      pr_default.close(19);
      /* Using cursor BC01VZ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A13982AlbRArtLu = BC01VZ22_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = BC01VZ22_n13982AlbRArtLu[0] ;
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
         n13982AlbRArtLu = false ;
      }
      pr_default.close(20);
      AV74AlbReccod = A44AlbRecCod ;
      AV88Doc_6 = A44AlbRecCod ;
      if ( true )
      {
         AV75Documento = GXutil.str( AV88Doc_6, 6, 0) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV75Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
         }
      }
      AV77CliCod = A252CliCod ;
      if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         A279CliNom_Visible = 0 ;
      }
      if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INEXISTENTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV79AlbRef = GXutil.substring( A45AlbRef, 1, 6) ;
      if ( ( AV150CtrlArt == 1 ) && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && true /* Level */ )
      {
         GXv_int9[0] = AV41FlagArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int9) ;
         bc_albrec_bc.this.AV41FlagArt = (byte)((byte)(GXv_int9[0])) ;
      }
      if ( ( AV150CtrlArt == 1 ) && ( AV41FlagArt == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.El ARTICULO entrado NO existe ¡¡¡", ""), 0, "");
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = A3613AlbRefDsc ;
         GXv_int6[0] = AV54Flag_artc ;
         new app.pbusard(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int6) ;
         bc_albrec_bc.this.A396EmprCod = GXv_char4[0] ;
         bc_albrec_bc.this.A252CliCod = GXv_int8[0] ;
         bc_albrec_bc.this.A45AlbRef = GXv_char3[0] ;
         bc_albrec_bc.this.A3613AlbRefDsc = GXv_char2[0] ;
         bc_albrec_bc.this.AV54Flag_artc = GXv_int6[0] ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV103Moda21 == 0 ) && ( AV46FlagSam == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = A6264AlbRTartD ;
         GXv_char10[0] = AV65Compos ;
         GXv_int9[0] = A6263AlbRTartC ;
         GXv_decimal11[0] = A6465AlbRLu ;
         new app.pbusar4(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char10, GXv_int9, GXv_decimal11) ;
         bc_albrec_bc.this.A396EmprCod = GXv_char4[0] ;
         bc_albrec_bc.this.A252CliCod = GXv_int8[0] ;
         bc_albrec_bc.this.A45AlbRef = GXv_char3[0] ;
         bc_albrec_bc.this.A6264AlbRTartD = GXv_char2[0] ;
         bc_albrec_bc.this.AV65Compos = GXv_char10[0] ;
         bc_albrec_bc.this.A6263AlbRTartC = GXv_int9[0] ;
         bc_albrec_bc.this.A6465AlbRLu = GXv_decimal11[0] ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV103Moda21 == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char3[0] = A6264AlbRTartD ;
         GXv_char2[0] = AV65Compos ;
         GXv_int9[0] = A6263AlbRTartC ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         new app.pbusar4(remoteHandle, context).execute( GXv_char10, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int9, GXv_decimal11) ;
         bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
         bc_albrec_bc.this.A252CliCod = GXv_int8[0] ;
         bc_albrec_bc.this.A45AlbRef = GXv_char4[0] ;
         bc_albrec_bc.this.A6264AlbRTartD = GXv_char3[0] ;
         bc_albrec_bc.this.AV65Compos = GXv_char2[0] ;
         bc_albrec_bc.this.A6263AlbRTartC = GXv_int9[0] ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV68Kohler == 0 ) && isIns( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_int9[0] = A4920AlbRGrm2 ;
         GXv_int12[0] = A4921AlbRAnc ;
         new app.pbusar5(remoteHandle, context).execute( GXv_char10, GXv_int8, GXv_char4, GXv_int9, GXv_int12) ;
         bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
         bc_albrec_bc.this.A252CliCod = GXv_int8[0] ;
         bc_albrec_bc.this.A45AlbRef = GXv_char4[0] ;
         bc_albrec_bc.this.A4920AlbRGrm2 = GXv_int9[0] ;
         bc_albrec_bc.this.A4921AlbRAnc = GXv_int12[0] ;
      }
      if ( GXutil.strcmp(A5806AlbREnt2, " ") != 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A14210AlbREnt_3 = A5806AlbREnt2 ;
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A14210AlbREnt_3 = A46AlbREnt ;
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      AV80Albrpieent = A52AlbRPieEnt ;
      AV132PieEntold = O52AlbRPieEnt ;
      AV147oldpiee = O52AlbRPieEnt ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A58AlbRUniEnt)==0) || (0==A52AlbRPieEnt) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tiene que entrar Unidades o Piezas", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV87albrfen = A49AlbRFen ;
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = 0 ;
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      AV60ALbRunient = A58AlbRUniEnt ;
      AV133UniENtold = O58AlbRUniEnt ;
      AV145Oldunie = O58AlbRUniEnt ;
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV83albrreo = A55AlbRReo ;
      AV155OldAlbRreo = O55AlbRReo ;
      AV148oldpieu = O54AlbRPieUti ;
      AV146olduniu = O60AlbRUniUti ;
      AV86TipEntCod = A1211TipEntCod ;
      AV78Procecod = A970ProceCod ;
      AV81Albrpre = A5743AlbRPre ;
      AV84albrnf = A6182AlbrNF ;
      AV82albrcfop = A6184AlbrCfop ;
      if ( ! ( ( GXutil.strcmp(A3360AlbRImp, "S") == 0 ) || ( GXutil.strcmp(A3360AlbRImp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Albaran Impreso ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV157ALbrlote = O6463AlbRLote ;
      AV159AlbRTelar = O6464AlbRTelar ;
      if ( ( AV94Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_char4[0] = A6463AlbRLote ;
         GXv_char3[0] = A4602AlbRMdlCod ;
         GXv_char2[0] = A6464AlbRTelar ;
         GXv_int6[0] = AV140AlbStLot ;
         new app.pctrlote(remoteHandle, context).execute( GXv_char10, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
         bc_albrec_bc.this.A6463AlbRLote = GXv_char4[0] ;
         bc_albrec_bc.this.A4602AlbRMdlCod = GXv_char3[0] ;
         bc_albrec_bc.this.A6464AlbRTelar = GXv_char2[0] ;
         bc_albrec_bc.this.AV140AlbStLot = GXv_int6[0] ;
      }
      if ( isIns( )  && true /* Level */ )
      {
         nIsDirty_7 = (short)(1) ;
         A317AlbStLot = AV140AlbStLot ;
      }
      AV158AlbRLu = O6465AlbRLu ;
      AV156AlbRMdlCod = O4602AlbRMdlCod ;
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(0) ;
            }
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6180AlbrUniC = A58AlbRUniEnt ;
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6181AlbrPieC = A52AlbRPieEnt ;
      }
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( A47AlbREst == 1 )
      {
         AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      AV85AlbRunic = A6180AlbrUniC ;
   }

   public void closeExtendedTableCursors1VZ7( )
   {
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
   }

   public void enableDisable( )
   {
   }

   public void getKey1VZ7( )
   {
      /* Using cursor BC01VZ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01VZ24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         zm1VZ7( 91) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = BC01VZ24_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01VZ24_n44AlbRecCod[0] ;
         A56AlbRUni = BC01VZ24_A56AlbRUni[0] ;
         A47AlbREst = BC01VZ24_A47AlbREst[0] ;
         A317AlbStLot = BC01VZ24_A317AlbStLot[0] ;
         A12879AlbOEKOTEX = BC01VZ24_A12879AlbOEKOTEX[0] ;
         A45AlbRef = BC01VZ24_A45AlbRef[0] ;
         A46AlbREnt = BC01VZ24_A46AlbREnt[0] ;
         A52AlbRPieEnt = BC01VZ24_A52AlbRPieEnt[0] ;
         A50AlbRLoc = BC01VZ24_A50AlbRLoc[0] ;
         A49AlbRFen = BC01VZ24_A49AlbRFen[0] ;
         A58AlbRUniEnt = BC01VZ24_A58AlbRUniEnt[0] ;
         A4601AlbRTam = BC01VZ24_A4601AlbRTam[0] ;
         A9749Emp_Item1 = BC01VZ24_A9749Emp_Item1[0] ;
         A55AlbRReo = BC01VZ24_A55AlbRReo[0] ;
         A54AlbRPieUti = BC01VZ24_A54AlbRPieUti[0] ;
         A53AlbRPieReb = BC01VZ24_A53AlbRPieReb[0] ;
         A60AlbRUniUti = BC01VZ24_A60AlbRUniUti[0] ;
         A59AlbRUniReb = BC01VZ24_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = BC01VZ24_A48AlbRFecUlt[0] ;
         A1222AlbNumEti = BC01VZ24_A1222AlbNumEti[0] ;
         A1291AlbRDes = BC01VZ24_A1291AlbRDes[0] ;
         A1301AlbRUlin = BC01VZ24_A1301AlbRUlin[0] ;
         A3613AlbRefDsc = BC01VZ24_A3613AlbRefDsc[0] ;
         A4290AlbPmPPza = BC01VZ24_A4290AlbPmPPza[0] ;
         A4920AlbRGrm2 = BC01VZ24_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = BC01VZ24_A4921AlbRAnc[0] ;
         A4922AlbPml = BC01VZ24_A4922AlbPml[0] ;
         A5743AlbRPre = BC01VZ24_A5743AlbRPre[0] ;
         A5744AlbRAju = BC01VZ24_A5744AlbRAju[0] ;
         A5745AlbRRep = BC01VZ24_A5745AlbRRep[0] ;
         A5806AlbREnt2 = BC01VZ24_A5806AlbREnt2[0] ;
         A6178AlbrUsu = BC01VZ24_A6178AlbrUsu[0] ;
         A6179AlbrHor = BC01VZ24_A6179AlbrHor[0] ;
         A6180AlbrUniC = BC01VZ24_A6180AlbrUniC[0] ;
         A6181AlbrPieC = BC01VZ24_A6181AlbrPieC[0] ;
         A6182AlbrNF = BC01VZ24_A6182AlbrNF[0] ;
         A6183AlbrFeNf = BC01VZ24_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = BC01VZ24_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = BC01VZ24_A3359AlbRDisCli[0] ;
         A3360AlbRImp = BC01VZ24_A3360AlbRImp[0] ;
         A6463AlbRLote = BC01VZ24_A6463AlbRLote[0] ;
         A6464AlbRTelar = BC01VZ24_A6464AlbRTelar[0] ;
         A14525AlbRLot2 = BC01VZ24_A14525AlbRLot2[0] ;
         A6465AlbRLu = BC01VZ24_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = BC01VZ24_A4602AlbRMdlCod[0] ;
         A6470AlbRTara = BC01VZ24_A6470AlbRTara[0] ;
         A6471AlbRUniB = BC01VZ24_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = BC01VZ24_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = BC01VZ24_A6523AlbRUdas[0] ;
         A8023AlbColor = BC01VZ24_A8023AlbColor[0] ;
         A8024AlbOpsT = BC01VZ24_A8024AlbOpsT[0] ;
         A8025AlbOpsC = BC01VZ24_A8025AlbOpsC[0] ;
         A8026AlbOC = BC01VZ24_A8026AlbOC[0] ;
         A8027AlbHdri = BC01VZ24_A8027AlbHdri[0] ;
         A8028AlbNumB = BC01VZ24_A8028AlbNumB[0] ;
         A8029AlbNumM = BC01VZ24_A8029AlbNumM[0] ;
         A8030AlbAncC = BC01VZ24_A8030AlbAncC[0] ;
         A8031AlbDndC = BC01VZ24_A8031AlbDndC[0] ;
         A8032AlbAncCr = BC01VZ24_A8032AlbAncCr[0] ;
         A8033AlbDndCr = BC01VZ24_A8033AlbDndCr[0] ;
         A8034AlbGalga = BC01VZ24_A8034AlbGalga[0] ;
         A8035AlbMaqTej = BC01VZ24_A8035AlbMaqTej[0] ;
         A8036AlbDmt = BC01VZ24_A8036AlbDmt[0] ;
         A9793AlbPdaC = BC01VZ24_A9793AlbPdaC[0] ;
         A9794AlbOStj = BC01VZ24_A9794AlbOStj[0] ;
         A10358AlbTurno = BC01VZ24_A10358AlbTurno[0] ;
         A396EmprCod = BC01VZ24_A396EmprCod[0] ;
         A252CliCod = BC01VZ24_A252CliCod[0] ;
         A6263AlbRTartC = BC01VZ24_A6263AlbRTartC[0] ;
         n6263AlbRTartC = BC01VZ24_n6263AlbRTartC[0] ;
         A840TrnCod = BC01VZ24_A840TrnCod[0] ;
         n840TrnCod = BC01VZ24_n840TrnCod[0] ;
         A970ProceCod = BC01VZ24_A970ProceCod[0] ;
         n970ProceCod = BC01VZ24_n970ProceCod[0] ;
         A1211TipEntCod = BC01VZ24_A1211TipEntCod[0] ;
         n1211TipEntCod = BC01VZ24_n1211TipEntCod[0] ;
         A4792AlmCod = BC01VZ24_A4792AlmCod[0] ;
         n4792AlmCod = BC01VZ24_n4792AlmCod[0] ;
         O1301AlbRUlin = A1301AlbRUlin ;
         O55AlbRReo = A55AlbRReo ;
         O6464AlbRTelar = A6464AlbRTelar ;
         O6465AlbRLu = A6465AlbRLu ;
         O6463AlbRLote = A6463AlbRLote ;
         O4602AlbRMdlCod = A4602AlbRMdlCod ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         O52AlbRPieEnt = A52AlbRPieEnt ;
         O58AlbRUniEnt = A58AlbRUniEnt ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1VZ7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1VZ7( ) ;
         }
         Gx_mode = sMode7 ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1VZ7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
      }
      pr_default.close(22);
   }

   public void getEqualNoModal( )
   {
      getKey1VZ7( ) ;
      if ( RcdFound7 == 0 )
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
      confirm_1VZ0( ) ;
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

   public void checkOptimisticConcurrency1VZ7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01VZ25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(23) == 101) || ( GXutil.strcmp(Z56AlbRUni, BC01VZ25_A56AlbRUni[0]) != 0 ) || ( Z47AlbREst != BC01VZ25_A47AlbREst[0] ) || ( Z317AlbStLot != BC01VZ25_A317AlbStLot[0] ) || ( GXutil.strcmp(Z12879AlbOEKOTEX, BC01VZ25_A12879AlbOEKOTEX[0]) != 0 ) || ( GXutil.strcmp(Z45AlbRef, BC01VZ25_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z46AlbREnt, BC01VZ25_A46AlbREnt[0]) != 0 ) || ( Z52AlbRPieEnt != BC01VZ25_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z50AlbRLoc, BC01VZ25_A50AlbRLoc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(BC01VZ25_A49AlbRFen[0])) ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, BC01VZ25_A58AlbRUniEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4601AlbRTam, BC01VZ25_A4601AlbRTam[0]) != 0 ) || ( GXutil.strcmp(Z9749Emp_Item1, BC01VZ25_A9749Emp_Item1[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, BC01VZ25_A55AlbRReo[0]) != 0 ) || ( Z54AlbRPieUti != BC01VZ25_A54AlbRPieUti[0] ) || ( Z53AlbRPieReb != BC01VZ25_A53AlbRPieReb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z60AlbRUniUti, BC01VZ25_A60AlbRUniUti[0]) != 0 ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, BC01VZ25_A59AlbRUniReb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(BC01VZ25_A48AlbRFecUlt[0])) ) || ( Z1222AlbNumEti != BC01VZ25_A1222AlbNumEti[0] ) || ( GXutil.strcmp(Z1291AlbRDes, BC01VZ25_A1291AlbRDes[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1301AlbRUlin != BC01VZ25_A1301AlbRUlin[0] ) || ( GXutil.strcmp(Z3613AlbRefDsc, BC01VZ25_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4290AlbPmPPza, BC01VZ25_A4290AlbPmPPza[0]) != 0 ) || ( Z4920AlbRGrm2 != BC01VZ25_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != BC01VZ25_A4921AlbRAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4922AlbPml != BC01VZ25_A4922AlbPml[0] ) || ( DecimalUtil.compareTo(Z5743AlbRPre, BC01VZ25_A5743AlbRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z5744AlbRAju, BC01VZ25_A5744AlbRAju[0]) != 0 ) || ( Z5745AlbRRep != BC01VZ25_A5745AlbRRep[0] ) || ( GXutil.strcmp(Z5806AlbREnt2, BC01VZ25_A5806AlbREnt2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6178AlbrUsu, BC01VZ25_A6178AlbrUsu[0]) != 0 ) || !( GXutil.dateCompare(Z6179AlbrHor, BC01VZ25_A6179AlbrHor[0]) ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, BC01VZ25_A6180AlbrUniC[0]) != 0 ) || ( Z6181AlbrPieC != BC01VZ25_A6181AlbrPieC[0] ) || ( GXutil.strcmp(Z6182AlbrNF, BC01VZ25_A6182AlbrNF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(BC01VZ25_A6183AlbrFeNf[0])) ) || ( GXutil.strcmp(Z6184AlbrCfop, BC01VZ25_A6184AlbrCfop[0]) != 0 ) || ( GXutil.strcmp(Z3359AlbRDisCli, BC01VZ25_A3359AlbRDisCli[0]) != 0 ) || ( GXutil.strcmp(Z3360AlbRImp, BC01VZ25_A3360AlbRImp[0]) != 0 ) || ( GXutil.strcmp(Z6463AlbRLote, BC01VZ25_A6463AlbRLote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6464AlbRTelar, BC01VZ25_A6464AlbRTelar[0]) != 0 ) || ( GXutil.strcmp(Z14525AlbRLot2, BC01VZ25_A14525AlbRLot2[0]) != 0 ) || ( DecimalUtil.compareTo(Z6465AlbRLu, BC01VZ25_A6465AlbRLu[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, BC01VZ25_A4602AlbRMdlCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z6470AlbRTara, BC01VZ25_A6470AlbRTara[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6471AlbRUniB, BC01VZ25_A6471AlbRUniB[0]) != 0 ) || ( GXutil.strcmp(Z6488AlbDocPrv, BC01VZ25_A6488AlbDocPrv[0]) != 0 ) || ( DecimalUtil.compareTo(Z6523AlbRUdas, BC01VZ25_A6523AlbRUdas[0]) != 0 ) || ( GXutil.strcmp(Z8023AlbColor, BC01VZ25_A8023AlbColor[0]) != 0 ) || ( GXutil.strcmp(Z8024AlbOpsT, BC01VZ25_A8024AlbOpsT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8025AlbOpsC, BC01VZ25_A8025AlbOpsC[0]) != 0 ) || ( GXutil.strcmp(Z8026AlbOC, BC01VZ25_A8026AlbOC[0]) != 0 ) || ( GXutil.strcmp(Z8027AlbHdri, BC01VZ25_A8027AlbHdri[0]) != 0 ) || ( GXutil.strcmp(Z8028AlbNumB, BC01VZ25_A8028AlbNumB[0]) != 0 ) || ( GXutil.strcmp(Z8029AlbNumM, BC01VZ25_A8029AlbNumM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8030AlbAncC, BC01VZ25_A8030AlbAncC[0]) != 0 ) || ( Z8031AlbDndC != BC01VZ25_A8031AlbDndC[0] ) || ( DecimalUtil.compareTo(Z8032AlbAncCr, BC01VZ25_A8032AlbAncCr[0]) != 0 ) || ( Z8033AlbDndCr != BC01VZ25_A8033AlbDndCr[0] ) || ( Z8034AlbGalga != BC01VZ25_A8034AlbGalga[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8035AlbMaqTej, BC01VZ25_A8035AlbMaqTej[0]) != 0 ) || ( Z8036AlbDmt != BC01VZ25_A8036AlbDmt[0] ) || ( GXutil.strcmp(Z9793AlbPdaC, BC01VZ25_A9793AlbPdaC[0]) != 0 ) || ( GXutil.strcmp(Z9794AlbOStj, BC01VZ25_A9794AlbOStj[0]) != 0 ) || ( Z10358AlbTurno != BC01VZ25_A10358AlbTurno[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != BC01VZ25_A252CliCod[0] ) || ( Z6263AlbRTartC != BC01VZ25_A6263AlbRTartC[0] ) || ( Z840TrnCod != BC01VZ25_A840TrnCod[0] ) || ( Z970ProceCod != BC01VZ25_A970ProceCod[0] ) || ( Z1211TipEntCod != BC01VZ25_A1211TipEntCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4792AlmCod != BC01VZ25_A4792AlmCod[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VZ7( )
   {
      beforeValidate1VZ7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VZ7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VZ7( 0) ;
         checkOptimisticConcurrency1VZ7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VZ7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VZ7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VZ26 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A56AlbRUni, Byte.valueOf(A47AlbREst), Byte.valueOf(A317AlbStLot), A12879AlbOEKOTEX, A45AlbRef, A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A4601AlbRTam, A9749Emp_Item1, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A14525AlbRLot2, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A10358AlbTurno), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(24) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        AV144Texto_ii = httpContext.getMessage( httpContext.getMessage( "TALBREC-Alta Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Entradas =", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Entradas =", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + GXutil.newLine( ) ;
                     }
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV189Pgmname, AV8UsurCod, AV29Station, AV144Texto_ii, A44AlbRecCod, (byte)(0), "@") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1VZ7( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                        }
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
            load1VZ7( ) ;
         }
         endLevel1VZ7( ) ;
      }
      closeExtendedTableCursors1VZ7( ) ;
   }

   public void update1VZ7( )
   {
      beforeValidate1VZ7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VZ7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VZ7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VZ7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VZ7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VZ27 */
                  pr_default.execute(25, new Object[] {A56AlbRUni, Byte.valueOf(A47AlbREst), Byte.valueOf(A317AlbStLot), A12879AlbOEKOTEX, A45AlbRef, A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A4601AlbRTam, A9749Emp_Item1, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A14525AlbRLot2, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A10358AlbTurno), Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VZ7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char10[0] = A396EmprCod ;
                     GXv_int8[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int8) ;
                     bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
                     bc_albrec_bc.this.A44AlbRecCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1VZ7( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
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
         }
         endLevel1VZ7( ) ;
      }
      closeExtendedTableCursors1VZ7( ) ;
   }

   public void deferredUpdate1VZ7( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1VZ7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VZ7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VZ7( ) ;
         afterConfirm1VZ7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VZ7( ) ;
            if ( AnyError == 0 )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               scanKeyStart1VZ191( ) ;
               while ( RcdFound191 != 0 )
               {
                  getByPrimaryKey1VZ191( ) ;
                  delete1VZ191( ) ;
                  scanKeyNext1VZ191( ) ;
                  O1301AlbRUlin = A1301AlbRUlin ;
               }
               scanKeyEnd1VZ191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VZ28 */
                  pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        AV144Texto_ii = httpContext.getMessage( httpContext.getMessage( "TALBREC-Eliminacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Entradas(old) =", ""), "") + GXutil.str( AV145Oldunie, 9, 2) + " " + A56AlbRUni + httpContext.getMessage( httpContext.getMessage( " Unidades Entradas(new) =", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Entradas(old) =", ""), "") + GXutil.str( AV147oldpiee, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   Entradas(new) =", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Utilizadas(old) =", ""), "") + GXutil.str( AV146olduniu, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Unidades Utilizadas(new) =", ""), "") + GXutil.str( A60AlbRUniUti, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Utilizadas(old) =", ""), "") + GXutil.str( AV148oldpieu, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   utilizadas(new) =", ""), "") + GXutil.str( A54AlbRPieUti, 6, 0) + GXutil.newLine( ) ;
                     }
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV189Pgmname, AV8UsurCod, AV29Station, AV144Texto_ii, A44AlbRecCod, (byte)(0), "@") ;
                     }
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
      }
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1VZ7( ) ;
      Gx_mode = sMode7 ;
   }

   public void onDeleteControls1VZ7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV68Kohler == 0 ) && isIns( )  )
         {
            GXv_char10[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_char4[0] = A45AlbRef ;
            GXv_int12[0] = A4920AlbRGrm2 ;
            GXv_int9[0] = A4921AlbRAnc ;
            new app.pbusar5(remoteHandle, context).execute( GXv_char10, GXv_int8, GXv_char4, GXv_int12, GXv_int9) ;
            bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
            bc_albrec_bc.this.A252CliCod = GXv_int8[0] ;
            bc_albrec_bc.this.A45AlbRef = GXv_char4[0] ;
            bc_albrec_bc.this.A4920AlbRGrm2 = GXv_int12[0] ;
            bc_albrec_bc.this.A4921AlbRAnc = GXv_int9[0] ;
         }
         if ( ( AV94Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
         {
            GXv_char10[0] = A396EmprCod ;
            GXv_char4[0] = A6463AlbRLote ;
            GXv_char3[0] = A4602AlbRMdlCod ;
            GXv_char2[0] = A6464AlbRTelar ;
            GXv_int6[0] = AV140AlbStLot ;
            new app.pctrlote(remoteHandle, context).execute( GXv_char10, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
            bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
            bc_albrec_bc.this.A6463AlbRLote = GXv_char4[0] ;
            bc_albrec_bc.this.A4602AlbRMdlCod = GXv_char3[0] ;
            bc_albrec_bc.this.A6464AlbRTelar = GXv_char2[0] ;
            bc_albrec_bc.this.AV140AlbStLot = GXv_int6[0] ;
         }
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
         }
         /* Using cursor BC01VZ29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         A407EmprNom = BC01VZ29_A407EmprNom[0] ;
         n407EmprNom = BC01VZ29_n407EmprNom[0] ;
         pr_default.close(27);
         AV74AlbReccod = A44AlbRecCod ;
         AV88Doc_6 = A44AlbRecCod ;
         /* Using cursor BC01VZ30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = BC01VZ30_A279CliNom[0] ;
         A8723CliEst = BC01VZ30_A8723CliEst[0] ;
         pr_default.close(28);
         AV77CliCod = A252CliCod ;
         if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
         {
            A279CliNom_Visible = 0 ;
         }
         /* Using cursor BC01VZ31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A13982AlbRArtLu = BC01VZ31_A13982AlbRArtLu[0] ;
            n13982AlbRArtLu = BC01VZ31_n13982AlbRArtLu[0] ;
         }
         else
         {
            A13982AlbRArtLu = DecimalUtil.doubleToDec(0) ;
            n13982AlbRArtLu = false ;
         }
         pr_default.close(29);
         AV79AlbRef = GXutil.substring( A45AlbRef, 1, 6) ;
         /* Using cursor BC01VZ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = BC01VZ32_A841TrnNom[0] ;
         n841TrnNom = BC01VZ32_n841TrnNom[0] ;
         pr_default.close(30);
         if ( true )
         {
            AV75Documento = GXutil.str( AV88Doc_6, 6, 0) ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
            {
               AV75Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
            }
         }
         AV80Albrpieent = A52AlbRPieEnt ;
         AV132PieEntold = O52AlbRPieEnt ;
         AV147oldpiee = O52AlbRPieEnt ;
         AV87albrfen = A49AlbRFen ;
         AV60ALbRunient = A58AlbRUniEnt ;
         AV133UniENtold = O58AlbRUniEnt ;
         AV145Oldunie = O58AlbRUniEnt ;
         AV83albrreo = A55AlbRReo ;
         AV155OldAlbRreo = O55AlbRReo ;
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV148oldpieu = O54AlbRPieUti ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV146olduniu = O60AlbRUniUti ;
         if ( A47AlbREst == 1 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            }
         }
         /* Using cursor BC01VZ33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = BC01VZ33_A1212TipEntNom[0] ;
         n1212TipEntNom = BC01VZ33_n1212TipEntNom[0] ;
         pr_default.close(31);
         AV86TipEntCod = A1211TipEntCod ;
         /* Using cursor BC01VZ34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = BC01VZ34_A971ProceNom[0] ;
         n971ProceNom = BC01VZ34_n971ProceNom[0] ;
         pr_default.close(32);
         AV78Procecod = A970ProceCod ;
         if ( A4290AlbPmPPza.doubleValue() > 0 )
         {
            A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         }
         else
         {
            A4291AlbPzaEst = 0 ;
         }
         AV81Albrpre = A5743AlbRPre ;
         if ( GXutil.strcmp(A5806AlbREnt2, " ") != 0 )
         {
            A14210AlbREnt_3 = A5806AlbREnt2 ;
         }
         else
         {
            A14210AlbREnt_3 = A46AlbREnt ;
         }
         AV85AlbRunic = A6180AlbrUniC ;
         AV84albrnf = A6182AlbrNF ;
         AV82albrcfop = A6184AlbrCfop ;
         /* Using cursor BC01VZ35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
         A6264AlbRTartD = BC01VZ35_A6264AlbRTartD[0] ;
         n6264AlbRTartD = BC01VZ35_n6264AlbRTartD[0] ;
         pr_default.close(33);
         AV157ALbrlote = O6463AlbRLote ;
         AV159AlbRTelar = O6464AlbRTelar ;
         AV158AlbRLu = O6465AlbRLu ;
         AV156AlbRMdlCod = O4602AlbRMdlCod ;
         /* Using cursor BC01VZ36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
         A4793AlmNom = BC01VZ36_A4793AlmNom[0] ;
         n4793AlmNom = BC01VZ36_n4793AlmNom[0] ;
         pr_default.close(34);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01VZ37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor BC01VZ38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor BC01VZ39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor BC01VZ40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor BC01VZ41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor BC01VZ42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor BC01VZ43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor BC01VZ44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor BC01VZ45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor BC01VZ46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor BC01VZ47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor BC01VZ48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor BC01VZ49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor BC01VZ50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
      }
   }

   public void processNestedLevel1VZ191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      nGXsfl_191_idx = 0 ;
      while ( nGXsfl_191_idx < bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().size() )
      {
         readRow1VZ191( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound191 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_191 != 0 ) )
         {
            standaloneNotModal1VZ191( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1VZ191( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1VZ191( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1VZ191( ) ;
               }
            }
            O1301AlbRUlin = A1301AlbRUlin ;
         }
         KeyVarsToRow191( ((app.SdtBC_ALBREC_Level1Item)bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().elementAt(-1+nGXsfl_191_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_191_idx = 0 ;
         while ( nGXsfl_191_idx < bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().size() )
         {
            readRow1VZ191( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound191 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().removeElement(nGXsfl_191_idx);
               nGXsfl_191_idx = (int)(nGXsfl_191_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1VZ191( ) ;
               VarsToRow191( ((app.SdtBC_ALBREC_Level1Item)bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().elementAt(-1+nGXsfl_191_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1VZ191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
      }
      nRcdExists_191 = (short)(0) ;
      nIsMod_191 = (short)(0) ;
      Gxremove191 = (byte)(0) ;
   }

   public void processLevel1VZ7( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel1VZ191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      /* ' Update level parameters */
      /* Using cursor BC01VZ51 */
      pr_default.execute(49, new Object[] {Byte.valueOf(A1301AlbRUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1VZ7( )
   {
      pr_default.close(23);
      if ( AnyError == 0 )
      {
         beforeComplete1VZ7( ) ;
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

   public void scanKeyStart1VZ7( )
   {
      /* Scan By routine */
      /* Using cursor BC01VZ52 */
      pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = BC01VZ52_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01VZ52_n44AlbRecCod[0] ;
         A56AlbRUni = BC01VZ52_A56AlbRUni[0] ;
         A47AlbREst = BC01VZ52_A47AlbREst[0] ;
         A317AlbStLot = BC01VZ52_A317AlbStLot[0] ;
         A12879AlbOEKOTEX = BC01VZ52_A12879AlbOEKOTEX[0] ;
         A407EmprNom = BC01VZ52_A407EmprNom[0] ;
         n407EmprNom = BC01VZ52_n407EmprNom[0] ;
         A279CliNom = BC01VZ52_A279CliNom[0] ;
         A45AlbRef = BC01VZ52_A45AlbRef[0] ;
         A841TrnNom = BC01VZ52_A841TrnNom[0] ;
         n841TrnNom = BC01VZ52_n841TrnNom[0] ;
         A46AlbREnt = BC01VZ52_A46AlbREnt[0] ;
         A52AlbRPieEnt = BC01VZ52_A52AlbRPieEnt[0] ;
         A50AlbRLoc = BC01VZ52_A50AlbRLoc[0] ;
         A49AlbRFen = BC01VZ52_A49AlbRFen[0] ;
         A58AlbRUniEnt = BC01VZ52_A58AlbRUniEnt[0] ;
         A4601AlbRTam = BC01VZ52_A4601AlbRTam[0] ;
         A9749Emp_Item1 = BC01VZ52_A9749Emp_Item1[0] ;
         A55AlbRReo = BC01VZ52_A55AlbRReo[0] ;
         A54AlbRPieUti = BC01VZ52_A54AlbRPieUti[0] ;
         A53AlbRPieReb = BC01VZ52_A53AlbRPieReb[0] ;
         A60AlbRUniUti = BC01VZ52_A60AlbRUniUti[0] ;
         A59AlbRUniReb = BC01VZ52_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = BC01VZ52_A48AlbRFecUlt[0] ;
         A1212TipEntNom = BC01VZ52_A1212TipEntNom[0] ;
         n1212TipEntNom = BC01VZ52_n1212TipEntNom[0] ;
         A1222AlbNumEti = BC01VZ52_A1222AlbNumEti[0] ;
         A1291AlbRDes = BC01VZ52_A1291AlbRDes[0] ;
         A971ProceNom = BC01VZ52_A971ProceNom[0] ;
         n971ProceNom = BC01VZ52_n971ProceNom[0] ;
         A1301AlbRUlin = BC01VZ52_A1301AlbRUlin[0] ;
         A3613AlbRefDsc = BC01VZ52_A3613AlbRefDsc[0] ;
         A4290AlbPmPPza = BC01VZ52_A4290AlbPmPPza[0] ;
         A4920AlbRGrm2 = BC01VZ52_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = BC01VZ52_A4921AlbRAnc[0] ;
         A4922AlbPml = BC01VZ52_A4922AlbPml[0] ;
         A5743AlbRPre = BC01VZ52_A5743AlbRPre[0] ;
         A5744AlbRAju = BC01VZ52_A5744AlbRAju[0] ;
         A5745AlbRRep = BC01VZ52_A5745AlbRRep[0] ;
         A5806AlbREnt2 = BC01VZ52_A5806AlbREnt2[0] ;
         A6178AlbrUsu = BC01VZ52_A6178AlbrUsu[0] ;
         A6179AlbrHor = BC01VZ52_A6179AlbrHor[0] ;
         A6180AlbrUniC = BC01VZ52_A6180AlbrUniC[0] ;
         A6181AlbrPieC = BC01VZ52_A6181AlbrPieC[0] ;
         A6182AlbrNF = BC01VZ52_A6182AlbrNF[0] ;
         A6183AlbrFeNf = BC01VZ52_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = BC01VZ52_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = BC01VZ52_A3359AlbRDisCli[0] ;
         A6264AlbRTartD = BC01VZ52_A6264AlbRTartD[0] ;
         n6264AlbRTartD = BC01VZ52_n6264AlbRTartD[0] ;
         A3360AlbRImp = BC01VZ52_A3360AlbRImp[0] ;
         A6463AlbRLote = BC01VZ52_A6463AlbRLote[0] ;
         A6464AlbRTelar = BC01VZ52_A6464AlbRTelar[0] ;
         A14525AlbRLot2 = BC01VZ52_A14525AlbRLot2[0] ;
         A6465AlbRLu = BC01VZ52_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = BC01VZ52_A4602AlbRMdlCod[0] ;
         A6470AlbRTara = BC01VZ52_A6470AlbRTara[0] ;
         A6471AlbRUniB = BC01VZ52_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = BC01VZ52_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = BC01VZ52_A6523AlbRUdas[0] ;
         A4793AlmNom = BC01VZ52_A4793AlmNom[0] ;
         n4793AlmNom = BC01VZ52_n4793AlmNom[0] ;
         A8023AlbColor = BC01VZ52_A8023AlbColor[0] ;
         A8024AlbOpsT = BC01VZ52_A8024AlbOpsT[0] ;
         A8025AlbOpsC = BC01VZ52_A8025AlbOpsC[0] ;
         A8026AlbOC = BC01VZ52_A8026AlbOC[0] ;
         A8027AlbHdri = BC01VZ52_A8027AlbHdri[0] ;
         A8028AlbNumB = BC01VZ52_A8028AlbNumB[0] ;
         A8029AlbNumM = BC01VZ52_A8029AlbNumM[0] ;
         A8030AlbAncC = BC01VZ52_A8030AlbAncC[0] ;
         A8031AlbDndC = BC01VZ52_A8031AlbDndC[0] ;
         A8032AlbAncCr = BC01VZ52_A8032AlbAncCr[0] ;
         A8033AlbDndCr = BC01VZ52_A8033AlbDndCr[0] ;
         A8034AlbGalga = BC01VZ52_A8034AlbGalga[0] ;
         A8035AlbMaqTej = BC01VZ52_A8035AlbMaqTej[0] ;
         A8036AlbDmt = BC01VZ52_A8036AlbDmt[0] ;
         A9793AlbPdaC = BC01VZ52_A9793AlbPdaC[0] ;
         A9794AlbOStj = BC01VZ52_A9794AlbOStj[0] ;
         A10358AlbTurno = BC01VZ52_A10358AlbTurno[0] ;
         A8723CliEst = BC01VZ52_A8723CliEst[0] ;
         A396EmprCod = BC01VZ52_A396EmprCod[0] ;
         A252CliCod = BC01VZ52_A252CliCod[0] ;
         A6263AlbRTartC = BC01VZ52_A6263AlbRTartC[0] ;
         n6263AlbRTartC = BC01VZ52_n6263AlbRTartC[0] ;
         A840TrnCod = BC01VZ52_A840TrnCod[0] ;
         n840TrnCod = BC01VZ52_n840TrnCod[0] ;
         A970ProceCod = BC01VZ52_A970ProceCod[0] ;
         n970ProceCod = BC01VZ52_n970ProceCod[0] ;
         A1211TipEntCod = BC01VZ52_A1211TipEntCod[0] ;
         n1211TipEntCod = BC01VZ52_n1211TipEntCod[0] ;
         A4792AlmCod = BC01VZ52_A4792AlmCod[0] ;
         n4792AlmCod = BC01VZ52_n4792AlmCod[0] ;
         A13982AlbRArtLu = BC01VZ52_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = BC01VZ52_n13982AlbRArtLu[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1VZ7( )
   {
      /* Scan next routine */
      pr_default.readNext(50);
      RcdFound7 = (short)(0) ;
      scanKeyLoad1VZ7( ) ;
   }

   public void scanKeyLoad1VZ7( )
   {
      sMode7 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = BC01VZ52_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01VZ52_n44AlbRecCod[0] ;
         A56AlbRUni = BC01VZ52_A56AlbRUni[0] ;
         A47AlbREst = BC01VZ52_A47AlbREst[0] ;
         A317AlbStLot = BC01VZ52_A317AlbStLot[0] ;
         A12879AlbOEKOTEX = BC01VZ52_A12879AlbOEKOTEX[0] ;
         A407EmprNom = BC01VZ52_A407EmprNom[0] ;
         n407EmprNom = BC01VZ52_n407EmprNom[0] ;
         A279CliNom = BC01VZ52_A279CliNom[0] ;
         A45AlbRef = BC01VZ52_A45AlbRef[0] ;
         A841TrnNom = BC01VZ52_A841TrnNom[0] ;
         n841TrnNom = BC01VZ52_n841TrnNom[0] ;
         A46AlbREnt = BC01VZ52_A46AlbREnt[0] ;
         A52AlbRPieEnt = BC01VZ52_A52AlbRPieEnt[0] ;
         A50AlbRLoc = BC01VZ52_A50AlbRLoc[0] ;
         A49AlbRFen = BC01VZ52_A49AlbRFen[0] ;
         A58AlbRUniEnt = BC01VZ52_A58AlbRUniEnt[0] ;
         A4601AlbRTam = BC01VZ52_A4601AlbRTam[0] ;
         A9749Emp_Item1 = BC01VZ52_A9749Emp_Item1[0] ;
         A55AlbRReo = BC01VZ52_A55AlbRReo[0] ;
         A54AlbRPieUti = BC01VZ52_A54AlbRPieUti[0] ;
         A53AlbRPieReb = BC01VZ52_A53AlbRPieReb[0] ;
         A60AlbRUniUti = BC01VZ52_A60AlbRUniUti[0] ;
         A59AlbRUniReb = BC01VZ52_A59AlbRUniReb[0] ;
         A48AlbRFecUlt = BC01VZ52_A48AlbRFecUlt[0] ;
         A1212TipEntNom = BC01VZ52_A1212TipEntNom[0] ;
         n1212TipEntNom = BC01VZ52_n1212TipEntNom[0] ;
         A1222AlbNumEti = BC01VZ52_A1222AlbNumEti[0] ;
         A1291AlbRDes = BC01VZ52_A1291AlbRDes[0] ;
         A971ProceNom = BC01VZ52_A971ProceNom[0] ;
         n971ProceNom = BC01VZ52_n971ProceNom[0] ;
         A1301AlbRUlin = BC01VZ52_A1301AlbRUlin[0] ;
         A3613AlbRefDsc = BC01VZ52_A3613AlbRefDsc[0] ;
         A4290AlbPmPPza = BC01VZ52_A4290AlbPmPPza[0] ;
         A4920AlbRGrm2 = BC01VZ52_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = BC01VZ52_A4921AlbRAnc[0] ;
         A4922AlbPml = BC01VZ52_A4922AlbPml[0] ;
         A5743AlbRPre = BC01VZ52_A5743AlbRPre[0] ;
         A5744AlbRAju = BC01VZ52_A5744AlbRAju[0] ;
         A5745AlbRRep = BC01VZ52_A5745AlbRRep[0] ;
         A5806AlbREnt2 = BC01VZ52_A5806AlbREnt2[0] ;
         A6178AlbrUsu = BC01VZ52_A6178AlbrUsu[0] ;
         A6179AlbrHor = BC01VZ52_A6179AlbrHor[0] ;
         A6180AlbrUniC = BC01VZ52_A6180AlbrUniC[0] ;
         A6181AlbrPieC = BC01VZ52_A6181AlbrPieC[0] ;
         A6182AlbrNF = BC01VZ52_A6182AlbrNF[0] ;
         A6183AlbrFeNf = BC01VZ52_A6183AlbrFeNf[0] ;
         A6184AlbrCfop = BC01VZ52_A6184AlbrCfop[0] ;
         A3359AlbRDisCli = BC01VZ52_A3359AlbRDisCli[0] ;
         A6264AlbRTartD = BC01VZ52_A6264AlbRTartD[0] ;
         n6264AlbRTartD = BC01VZ52_n6264AlbRTartD[0] ;
         A3360AlbRImp = BC01VZ52_A3360AlbRImp[0] ;
         A6463AlbRLote = BC01VZ52_A6463AlbRLote[0] ;
         A6464AlbRTelar = BC01VZ52_A6464AlbRTelar[0] ;
         A14525AlbRLot2 = BC01VZ52_A14525AlbRLot2[0] ;
         A6465AlbRLu = BC01VZ52_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = BC01VZ52_A4602AlbRMdlCod[0] ;
         A6470AlbRTara = BC01VZ52_A6470AlbRTara[0] ;
         A6471AlbRUniB = BC01VZ52_A6471AlbRUniB[0] ;
         A6488AlbDocPrv = BC01VZ52_A6488AlbDocPrv[0] ;
         A6523AlbRUdas = BC01VZ52_A6523AlbRUdas[0] ;
         A4793AlmNom = BC01VZ52_A4793AlmNom[0] ;
         n4793AlmNom = BC01VZ52_n4793AlmNom[0] ;
         A8023AlbColor = BC01VZ52_A8023AlbColor[0] ;
         A8024AlbOpsT = BC01VZ52_A8024AlbOpsT[0] ;
         A8025AlbOpsC = BC01VZ52_A8025AlbOpsC[0] ;
         A8026AlbOC = BC01VZ52_A8026AlbOC[0] ;
         A8027AlbHdri = BC01VZ52_A8027AlbHdri[0] ;
         A8028AlbNumB = BC01VZ52_A8028AlbNumB[0] ;
         A8029AlbNumM = BC01VZ52_A8029AlbNumM[0] ;
         A8030AlbAncC = BC01VZ52_A8030AlbAncC[0] ;
         A8031AlbDndC = BC01VZ52_A8031AlbDndC[0] ;
         A8032AlbAncCr = BC01VZ52_A8032AlbAncCr[0] ;
         A8033AlbDndCr = BC01VZ52_A8033AlbDndCr[0] ;
         A8034AlbGalga = BC01VZ52_A8034AlbGalga[0] ;
         A8035AlbMaqTej = BC01VZ52_A8035AlbMaqTej[0] ;
         A8036AlbDmt = BC01VZ52_A8036AlbDmt[0] ;
         A9793AlbPdaC = BC01VZ52_A9793AlbPdaC[0] ;
         A9794AlbOStj = BC01VZ52_A9794AlbOStj[0] ;
         A10358AlbTurno = BC01VZ52_A10358AlbTurno[0] ;
         A8723CliEst = BC01VZ52_A8723CliEst[0] ;
         A396EmprCod = BC01VZ52_A396EmprCod[0] ;
         A252CliCod = BC01VZ52_A252CliCod[0] ;
         A6263AlbRTartC = BC01VZ52_A6263AlbRTartC[0] ;
         n6263AlbRTartC = BC01VZ52_n6263AlbRTartC[0] ;
         A840TrnCod = BC01VZ52_A840TrnCod[0] ;
         n840TrnCod = BC01VZ52_n840TrnCod[0] ;
         A970ProceCod = BC01VZ52_A970ProceCod[0] ;
         n970ProceCod = BC01VZ52_n970ProceCod[0] ;
         A1211TipEntCod = BC01VZ52_A1211TipEntCod[0] ;
         n1211TipEntCod = BC01VZ52_n1211TipEntCod[0] ;
         A4792AlmCod = BC01VZ52_A4792AlmCod[0] ;
         n4792AlmCod = BC01VZ52_n4792AlmCod[0] ;
         A13982AlbRArtLu = BC01VZ52_A13982AlbRArtLu[0] ;
         n13982AlbRArtLu = BC01VZ52_n13982AlbRArtLu[0] ;
      }
      Gx_mode = sMode7 ;
   }

   public void scanKeyEnd1VZ7( )
   {
      pr_default.close(50);
   }

   public void afterConfirm1VZ7( )
   {
      /* After Confirm Rules */
      if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         A279CliNom_Visible = 0 ;
      }
      if ( ( AV103Moda21 == 1 ) && ( AV104Cli350 == 1 ) && ( AV105ContVal == 1 ) && true /* After */ && ( A252CliCod == 350 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INEXISTENTE ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ( AV103Moda21 == 1 ) && true /* After */ && ( GXutil.strcmp(A8723CliEst, httpContext.getMessage( "S", "")) == 0 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") == 0 ) || ( GXutil.strcmp(A4602AlbRMdlCod, " ") == 0 ) || ( GXutil.strcmp(A6464AlbRTelar, " ") == 0 ) || ( A6465AlbRLu.doubleValue() == 0 ) || ( GXutil.strcmp(A8035AlbMaqTej, " ") == 0 ) || ( A6470AlbRTara.doubleValue() == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Obrigatorio campos: Lote,Jogo,Fio,Polegadas,Maq,LFA ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( isIns( )  && (0==A44AlbRecCod) && ( AV44FlagFerro == 0 ) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int8) ;
         bc_albrec_bc.this.A44AlbRecCod = GXv_int8[0] ;
      }
   }

   public void beforeInsert1VZ7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VZ7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VZ7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VZ7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VZ7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VZ7( )
   {
   }

   public void zm1VZ191( int GX_JID )
   {
      if ( ( GX_JID == 100 ) || ( GX_JID == 0 ) )
      {
         Z1300AlbRObs = A1300AlbRObs ;
      }
      if ( GX_JID == -100 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         Z1300AlbRObs = A1300AlbRObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1VZ191( )
   {
   }

   public void standaloneModal1VZ191( )
   {
      if ( isIns( )  )
      {
         A1301AlbRUlin = (byte)(O1301AlbRUlin+1) ;
      }
      if ( isIns( )  )
      {
         A1299AlbRLin = A1301AlbRUlin ;
      }
   }

   public void load1VZ191( )
   {
      /* Using cursor BC01VZ53 */
      pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1300AlbRObs = BC01VZ53_A1300AlbRObs[0] ;
         zm1VZ191( -100) ;
      }
      pr_default.close(51);
      onLoadActions1VZ191( ) ;
   }

   public void onLoadActions1VZ191( )
   {
   }

   public void checkExtendedTable1VZ191( )
   {
      nIsDirty_191 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1VZ191( ) ;
      Gx_BScreen = (byte)(0) ;
   }

   public void closeExtendedTableCursors1VZ191( )
   {
   }

   public void enableDisable1VZ191( )
   {
   }

   public void getKey1VZ191( )
   {
      /* Using cursor BC01VZ54 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound191 = (short)(1) ;
      }
      else
      {
         RcdFound191 = (short)(0) ;
      }
      pr_default.close(52);
   }

   public void getByPrimaryKey1VZ191( )
   {
      /* Using cursor BC01VZ55 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         zm1VZ191( 100) ;
         RcdFound191 = (short)(1) ;
         initializeNonKey1VZ191( ) ;
         A1299AlbRLin = BC01VZ55_A1299AlbRLin[0] ;
         A1300AlbRObs = BC01VZ55_A1300AlbRObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1VZ191( ) ;
         load1VZ191( ) ;
         Gx_mode = sMode191 ;
      }
      else
      {
         RcdFound191 = (short)(0) ;
         initializeNonKey1VZ191( ) ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1VZ191( ) ;
         Gx_mode = sMode191 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1VZ191( ) ;
      }
      pr_default.close(53);
   }

   public void checkOptimisticConcurrency1VZ191( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01VZ56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
         if ( (pr_default.getStatus(54) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(54) == 101) || ( GXutil.strcmp(Z1300AlbRObs, BC01VZ56_A1300AlbRObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBROB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VZ191( )
   {
      beforeValidate1VZ191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VZ191( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VZ191( 0) ;
         checkOptimisticConcurrency1VZ191( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VZ191( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VZ191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VZ57 */
                  pr_default.execute(55, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin), A1300AlbRObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                  if ( (pr_default.getStatus(55) == 1) )
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
            load1VZ191( ) ;
         }
         endLevel1VZ191( ) ;
      }
      closeExtendedTableCursors1VZ191( ) ;
   }

   public void update1VZ191( )
   {
      beforeValidate1VZ191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VZ191( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VZ191( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VZ191( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VZ191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VZ58 */
                  pr_default.execute(56, new Object[] {A1300AlbRObs, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                  if ( (pr_default.getStatus(56) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VZ191( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char10[0] = A396EmprCod ;
                     GXv_int8[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int8) ;
                     bc_albrec_bc.this.A396EmprCod = GXv_char10[0] ;
                     bc_albrec_bc.this.A44AlbRecCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1VZ191( ) ;
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
         endLevel1VZ191( ) ;
      }
      closeExtendedTableCursors1VZ191( ) ;
   }

   public void deferredUpdate1VZ191( )
   {
   }

   public void delete1VZ191( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1VZ191( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VZ191( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VZ191( ) ;
         afterConfirm1VZ191( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VZ191( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01VZ59 */
               pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode191 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1VZ191( ) ;
      Gx_mode = sMode191 ;
   }

   public void onDeleteControls1VZ191( )
   {
      standaloneModal1VZ191( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1VZ191( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(54);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1VZ191( )
   {
      /* Scan By routine */
      /* Using cursor BC01VZ60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound191 = (short)(0) ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = BC01VZ60_A1299AlbRLin[0] ;
         A1300AlbRObs = BC01VZ60_A1300AlbRObs[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1VZ191( )
   {
      /* Scan next routine */
      pr_default.readNext(58);
      RcdFound191 = (short)(0) ;
      scanKeyLoad1VZ191( ) ;
   }

   public void scanKeyLoad1VZ191( )
   {
      sMode191 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = BC01VZ60_A1299AlbRLin[0] ;
         A1300AlbRObs = BC01VZ60_A1300AlbRObs[0] ;
      }
      Gx_mode = sMode191 ;
   }

   public void scanKeyEnd1VZ191( )
   {
      pr_default.close(58);
   }

   public void afterConfirm1VZ191( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VZ191( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VZ191( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VZ191( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VZ191( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VZ191( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VZ191( )
   {
   }

   public void send_integrity_lvl_hashes1VZ191( )
   {
   }

   public void send_integrity_lvl_hashes1VZ7( )
   {
   }

   public void addRow1VZ7( )
   {
      VarsToRow7( bcBC_ALBREC) ;
   }

   public void readRow1VZ7( )
   {
      RowToVars7( bcBC_ALBREC, 1) ;
   }

   public void addRow1VZ191( )
   {
      app.SdtBC_ALBREC_Level1Item obj191;
      obj191 = new app.SdtBC_ALBREC_Level1Item(remoteHandle);
      VarsToRow191( obj191) ;
      bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().add(obj191, 0);
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Mode( "UPD" );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Modified( (short)(0) );
   }

   public void readRow1VZ191( )
   {
      nGXsfl_191_idx = (int)(nGXsfl_191_idx+1) ;
      RowToVars191( ((app.SdtBC_ALBREC_Level1Item)bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().elementAt(-1+nGXsfl_191_idx)), 1) ;
   }

   public void initializeNonKey1VZ7( )
   {
      A56AlbRUni = "" ;
      AV35Modo = "" ;
      AV9AlbCum = "" ;
      AV41FlagArt = (byte)(0) ;
      AV54Flag_artc = (byte)(0) ;
      AV65Compos = "" ;
      AV74AlbReccod = 0 ;
      AV88Doc_6 = 0 ;
      AV75Documento = "" ;
      AV76Albrfenf = GXutil.nullDate() ;
      AV77CliCod = 0 ;
      AV78Procecod = (short)(0) ;
      AV79AlbRef = "" ;
      AV60ALbRunient = DecimalUtil.ZERO ;
      AV85AlbRunic = DecimalUtil.ZERO ;
      AV80Albrpieent = 0 ;
      AV81Albrpre = DecimalUtil.ZERO ;
      AV87albrfen = GXutil.nullDate() ;
      AV82albrcfop = "" ;
      AV83albrreo = "" ;
      AV84albrnf = "" ;
      AV86TipEntCod = (short)(0) ;
      AV132PieEntold = 0 ;
      AV133UniENtold = DecimalUtil.ZERO ;
      AV140AlbStLot = (byte)(0) ;
      A317AlbStLot = (byte)(0) ;
      AV145Oldunie = DecimalUtil.ZERO ;
      AV147oldpiee = 0 ;
      AV146olduniu = DecimalUtil.ZERO ;
      AV148oldpieu = 0 ;
      AV156AlbRMdlCod = "" ;
      AV157ALbrlote = "" ;
      AV158AlbRLu = DecimalUtil.ZERO ;
      AV159AlbRTelar = "" ;
      AV144Texto_ii = "" ;
      AV155OldAlbRreo = "" ;
      A12879AlbOEKOTEX = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A4291AlbPzaEst = 0 ;
      A51AlbRPieDis = 0 ;
      A14210AlbREnt_3 = "" ;
      A13982AlbRArtLu = DecimalUtil.ZERO ;
      n13982AlbRArtLu = false ;
      AV44FlagFerro = (byte)(0) ;
      AV46FlagSam = (byte)(0) ;
      AV68Kohler = (byte)(0) ;
      AV94Erfoc = (byte)(0) ;
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A252CliCod = 0 ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      A841TrnNom = "" ;
      n841TrnNom = false ;
      A46AlbREnt = "" ;
      A52AlbRPieEnt = 0 ;
      A50AlbRLoc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A4601AlbRTam = "" ;
      A9749Emp_Item1 = "" ;
      A54AlbRPieUti = 0 ;
      A53AlbRPieReb = 0 ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      A1222AlbNumEti = (short)(0) ;
      A1291AlbRDes = "" ;
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      A971ProceNom = "" ;
      n971ProceNom = false ;
      A1301AlbRUlin = (byte)(0) ;
      A3613AlbRefDsc = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A4920AlbRGrm2 = (short)(0) ;
      A4921AlbRAnc = (short)(0) ;
      A4922AlbPml = (short)(0) ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      A5745AlbRRep = (byte)(0) ;
      A5806AlbREnt2 = "" ;
      A6184AlbrCfop = "" ;
      A3359AlbRDisCli = "" ;
      A6263AlbRTartC = (short)(0) ;
      n6263AlbRTartC = false ;
      A6264AlbRTartD = "" ;
      n6264AlbRTartD = false ;
      A14525AlbRLot2 = "" ;
      A6488AlbDocPrv = "" ;
      A4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      A4793AlmNom = "" ;
      n4793AlmNom = false ;
      A8023AlbColor = "" ;
      A8024AlbOpsT = "" ;
      A8025AlbOpsC = "" ;
      A8026AlbOC = "" ;
      A8027AlbHdri = "" ;
      A8028AlbNumB = "" ;
      A8029AlbNumM = "" ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      A8031AlbDndC = (short)(0) ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      A8033AlbDndCr = (short)(0) ;
      A8034AlbGalga = (short)(0) ;
      A8035AlbMaqTej = "" ;
      A8036AlbDmt = (short)(0) ;
      A9793AlbPdaC = "" ;
      A9794AlbOStj = "" ;
      A10358AlbTurno = (byte)(0) ;
      A8723CliEst = "" ;
      A47AlbREst = (byte)(0) ;
      A49AlbRFen = GXutil.today( ) ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      A48AlbRFecUlt = GXutil.today( ) ;
      A6178AlbrUsu = AV8UsurCod ;
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A6181AlbrPieC = 0 ;
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      A6183AlbrFeNf = GXutil.today( ) ;
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      A6463AlbRLote = " " ;
      A6464AlbRTelar = " " ;
      A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      A4602AlbRMdlCod = " " ;
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      O1301AlbRUlin = A1301AlbRUlin ;
      O55AlbRReo = A55AlbRReo ;
      O6464AlbRTelar = A6464AlbRTelar ;
      O6465AlbRLu = A6465AlbRLu ;
      O6463AlbRLote = A6463AlbRLote ;
      O4602AlbRMdlCod = A4602AlbRMdlCod ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O52AlbRPieEnt = A52AlbRPieEnt ;
      O58AlbRUniEnt = A58AlbRUniEnt ;
      Z56AlbRUni = "" ;
      Z47AlbREst = (byte)(0) ;
      Z317AlbStLot = (byte)(0) ;
      Z12879AlbOEKOTEX = "" ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z52AlbRPieEnt = 0 ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z4601AlbRTam = "" ;
      Z9749Emp_Item1 = "" ;
      Z55AlbRReo = "" ;
      Z54AlbRPieUti = 0 ;
      Z53AlbRPieReb = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z1301AlbRUlin = (byte)(0) ;
      Z3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5745AlbRRep = (byte)(0) ;
      Z5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z14525AlbRLot2 = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8031AlbDndC = (short)(0) ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8033AlbDndCr = (short)(0) ;
      Z8034AlbGalga = (short)(0) ;
      Z8035AlbMaqTej = "" ;
      Z8036AlbDmt = (short)(0) ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      Z10358AlbTurno = (byte)(0) ;
      Z252CliCod = 0 ;
      Z6263AlbRTartC = (short)(0) ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
      Z4792AlmCod = (byte)(0) ;
   }

   public void initAll1VZ7( )
   {
      A396EmprCod = "" ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      initializeNonKey1VZ7( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV35Modo = iV35Modo ;
      A49AlbRFen = i49AlbRFen ;
      A6183AlbrFeNf = i6183AlbrFeNf ;
      A55AlbRReo = i55AlbRReo ;
      A48AlbRFecUlt = i48AlbRFecUlt ;
      A6182AlbrNF = i6182AlbrNF ;
      A6179AlbrHor = i6179AlbrHor ;
      A6178AlbrUsu = i6178AlbrUsu ;
      A3360AlbRImp = i3360AlbRImp ;
      A4602AlbRMdlCod = i4602AlbRMdlCod ;
      A6463AlbRLote = i6463AlbRLote ;
      A6464AlbRTelar = i6464AlbRTelar ;
      A6465AlbRLu = i6465AlbRLu ;
      A6470AlbRTara = i6470AlbRTara ;
      A6471AlbRUniB = i6471AlbRUniB ;
      A6523AlbRUdas = i6523AlbRUdas ;
   }

   public void initializeNonKey1VZ191( )
   {
      A1300AlbRObs = "" ;
      Z1300AlbRObs = "" ;
   }

   public void initAll1VZ191( )
   {
      A1299AlbRLin = (byte)(0) ;
      initializeNonKey1VZ191( ) ;
   }

   public void standaloneModalInsert1VZ191( )
   {
      A1301AlbRUlin = i1301AlbRUlin ;
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

   public void VarsToRow7( app.SdtBC_ALBREC obj7 )
   {
      obj7.setgxTv_SdtBC_ALBREC_Mode( Gx_mode );
      obj7.setgxTv_SdtBC_ALBREC_Albruni( A56AlbRUni );
      obj7.setgxTv_SdtBC_ALBREC_Albstlot( A317AlbStLot );
      obj7.setgxTv_SdtBC_ALBREC_Alboekotex( A12879AlbOEKOTEX );
      obj7.setgxTv_SdtBC_ALBREC_Albrunidis( A57AlbRUniDis );
      obj7.setgxTv_SdtBC_ALBREC_Albpzaest( A4291AlbPzaEst );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiedis( A51AlbRPieDis );
      obj7.setgxTv_SdtBC_ALBREC_Albrent_3( A14210AlbREnt_3 );
      obj7.setgxTv_SdtBC_ALBREC_Albrartlu( A13982AlbRArtLu );
      obj7.setgxTv_SdtBC_ALBREC_Emprnom( A407EmprNom );
      obj7.setgxTv_SdtBC_ALBREC_Clicod( A252CliCod );
      obj7.setgxTv_SdtBC_ALBREC_Clinom( A279CliNom );
      obj7.setgxTv_SdtBC_ALBREC_Albref( A45AlbRef );
      obj7.setgxTv_SdtBC_ALBREC_Trncod( A840TrnCod );
      obj7.setgxTv_SdtBC_ALBREC_Trnnom( A841TrnNom );
      obj7.setgxTv_SdtBC_ALBREC_Albrent( A46AlbREnt );
      obj7.setgxTv_SdtBC_ALBREC_Albrpieent( A52AlbRPieEnt );
      obj7.setgxTv_SdtBC_ALBREC_Albrloc( A50AlbRLoc );
      obj7.setgxTv_SdtBC_ALBREC_Albrunient( A58AlbRUniEnt );
      obj7.setgxTv_SdtBC_ALBREC_Albrtam( A4601AlbRTam );
      obj7.setgxTv_SdtBC_ALBREC_Emp_item1( A9749Emp_Item1 );
      obj7.setgxTv_SdtBC_ALBREC_Albrpieuti( A54AlbRPieUti );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiereb( A53AlbRPieReb );
      obj7.setgxTv_SdtBC_ALBREC_Albruniuti( A60AlbRUniUti );
      obj7.setgxTv_SdtBC_ALBREC_Albrunireb( A59AlbRUniReb );
      obj7.setgxTv_SdtBC_ALBREC_Tipentcod( A1211TipEntCod );
      obj7.setgxTv_SdtBC_ALBREC_Tipentnom( A1212TipEntNom );
      obj7.setgxTv_SdtBC_ALBREC_Albnumeti( A1222AlbNumEti );
      obj7.setgxTv_SdtBC_ALBREC_Albrdes( A1291AlbRDes );
      obj7.setgxTv_SdtBC_ALBREC_Procecod( A970ProceCod );
      obj7.setgxTv_SdtBC_ALBREC_Procenom( A971ProceNom );
      obj7.setgxTv_SdtBC_ALBREC_Albrulin( A1301AlbRUlin );
      obj7.setgxTv_SdtBC_ALBREC_Albrefdsc( A3613AlbRefDsc );
      obj7.setgxTv_SdtBC_ALBREC_Albpmppza( A4290AlbPmPPza );
      obj7.setgxTv_SdtBC_ALBREC_Albrgrm2( A4920AlbRGrm2 );
      obj7.setgxTv_SdtBC_ALBREC_Albranc( A4921AlbRAnc );
      obj7.setgxTv_SdtBC_ALBREC_Albpml( A4922AlbPml );
      obj7.setgxTv_SdtBC_ALBREC_Albrpre( A5743AlbRPre );
      obj7.setgxTv_SdtBC_ALBREC_Albraju( A5744AlbRAju );
      obj7.setgxTv_SdtBC_ALBREC_Albrrep( A5745AlbRRep );
      obj7.setgxTv_SdtBC_ALBREC_Albrent2( A5806AlbREnt2 );
      obj7.setgxTv_SdtBC_ALBREC_Albrcfop( A6184AlbrCfop );
      obj7.setgxTv_SdtBC_ALBREC_Albrdiscli( A3359AlbRDisCli );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartc( A6263AlbRTartC );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartd( A6264AlbRTartD );
      obj7.setgxTv_SdtBC_ALBREC_Albrlot2( A14525AlbRLot2 );
      obj7.setgxTv_SdtBC_ALBREC_Albdocprv( A6488AlbDocPrv );
      obj7.setgxTv_SdtBC_ALBREC_Almcod( A4792AlmCod );
      obj7.setgxTv_SdtBC_ALBREC_Almnom( A4793AlmNom );
      obj7.setgxTv_SdtBC_ALBREC_Albcolor( A8023AlbColor );
      obj7.setgxTv_SdtBC_ALBREC_Albopst( A8024AlbOpsT );
      obj7.setgxTv_SdtBC_ALBREC_Albopsc( A8025AlbOpsC );
      obj7.setgxTv_SdtBC_ALBREC_Alboc( A8026AlbOC );
      obj7.setgxTv_SdtBC_ALBREC_Albhdri( A8027AlbHdri );
      obj7.setgxTv_SdtBC_ALBREC_Albnumb( A8028AlbNumB );
      obj7.setgxTv_SdtBC_ALBREC_Albnumm( A8029AlbNumM );
      obj7.setgxTv_SdtBC_ALBREC_Albancc( A8030AlbAncC );
      obj7.setgxTv_SdtBC_ALBREC_Albdndc( A8031AlbDndC );
      obj7.setgxTv_SdtBC_ALBREC_Albanccr( A8032AlbAncCr );
      obj7.setgxTv_SdtBC_ALBREC_Albdndcr( A8033AlbDndCr );
      obj7.setgxTv_SdtBC_ALBREC_Albgalga( A8034AlbGalga );
      obj7.setgxTv_SdtBC_ALBREC_Albmaqtej( A8035AlbMaqTej );
      obj7.setgxTv_SdtBC_ALBREC_Albdmt( A8036AlbDmt );
      obj7.setgxTv_SdtBC_ALBREC_Albpdac( A9793AlbPdaC );
      obj7.setgxTv_SdtBC_ALBREC_Albostj( A9794AlbOStj );
      obj7.setgxTv_SdtBC_ALBREC_Albturno( A10358AlbTurno );
      obj7.setgxTv_SdtBC_ALBREC_Cliest( A8723CliEst );
      obj7.setgxTv_SdtBC_ALBREC_Albrest( A47AlbREst );
      obj7.setgxTv_SdtBC_ALBREC_Albrfen( A49AlbRFen );
      obj7.setgxTv_SdtBC_ALBREC_Albrreo( A55AlbRReo );
      obj7.setgxTv_SdtBC_ALBREC_Albrfecult( A48AlbRFecUlt );
      obj7.setgxTv_SdtBC_ALBREC_Albrusu( A6178AlbrUsu );
      obj7.setgxTv_SdtBC_ALBREC_Albrhor( A6179AlbrHor );
      obj7.setgxTv_SdtBC_ALBREC_Albrunic( A6180AlbrUniC );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiec( A6181AlbrPieC );
      obj7.setgxTv_SdtBC_ALBREC_Albrnf( A6182AlbrNF );
      obj7.setgxTv_SdtBC_ALBREC_Albrfenf( A6183AlbrFeNf );
      obj7.setgxTv_SdtBC_ALBREC_Albrimp( A3360AlbRImp );
      obj7.setgxTv_SdtBC_ALBREC_Albrlote( A6463AlbRLote );
      obj7.setgxTv_SdtBC_ALBREC_Albrtelar( A6464AlbRTelar );
      obj7.setgxTv_SdtBC_ALBREC_Albrlu( A6465AlbRLu );
      obj7.setgxTv_SdtBC_ALBREC_Albrmdlcod( A4602AlbRMdlCod );
      obj7.setgxTv_SdtBC_ALBREC_Albrtara( A6470AlbRTara );
      obj7.setgxTv_SdtBC_ALBREC_Albrunib( A6471AlbRUniB );
      obj7.setgxTv_SdtBC_ALBREC_Albrudas( A6523AlbRUdas );
      obj7.setgxTv_SdtBC_ALBREC_Emprcod( A396EmprCod );
      obj7.setgxTv_SdtBC_ALBREC_Albreccod( A44AlbRecCod );
      obj7.setgxTv_SdtBC_ALBREC_Emprcod_Z( Z396EmprCod );
      obj7.setgxTv_SdtBC_ALBREC_Albreccod_Z( Z44AlbRecCod );
      obj7.setgxTv_SdtBC_ALBREC_Emprnom_Z( Z407EmprNom );
      obj7.setgxTv_SdtBC_ALBREC_Clicod_Z( Z252CliCod );
      obj7.setgxTv_SdtBC_ALBREC_Clinom_Z( Z279CliNom );
      obj7.setgxTv_SdtBC_ALBREC_Albref_Z( Z45AlbRef );
      obj7.setgxTv_SdtBC_ALBREC_Trncod_Z( Z840TrnCod );
      obj7.setgxTv_SdtBC_ALBREC_Trnnom_Z( Z841TrnNom );
      obj7.setgxTv_SdtBC_ALBREC_Albrent_Z( Z46AlbREnt );
      obj7.setgxTv_SdtBC_ALBREC_Albrpieent_Z( Z52AlbRPieEnt );
      obj7.setgxTv_SdtBC_ALBREC_Albruni_Z( Z56AlbRUni );
      obj7.setgxTv_SdtBC_ALBREC_Albrloc_Z( Z50AlbRLoc );
      obj7.setgxTv_SdtBC_ALBREC_Albrfen_Z( Z49AlbRFen );
      obj7.setgxTv_SdtBC_ALBREC_Albrunient_Z( Z58AlbRUniEnt );
      obj7.setgxTv_SdtBC_ALBREC_Albrtam_Z( Z4601AlbRTam );
      obj7.setgxTv_SdtBC_ALBREC_Emp_item1_Z( Z9749Emp_Item1 );
      obj7.setgxTv_SdtBC_ALBREC_Albrreo_Z( Z55AlbRReo );
      obj7.setgxTv_SdtBC_ALBREC_Albrpieuti_Z( Z54AlbRPieUti );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiereb_Z( Z53AlbRPieReb );
      obj7.setgxTv_SdtBC_ALBREC_Albruniuti_Z( Z60AlbRUniUti );
      obj7.setgxTv_SdtBC_ALBREC_Albrunireb_Z( Z59AlbRUniReb );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiedis_Z( Z51AlbRPieDis );
      obj7.setgxTv_SdtBC_ALBREC_Albrunidis_Z( Z57AlbRUniDis );
      obj7.setgxTv_SdtBC_ALBREC_Albrfecult_Z( Z48AlbRFecUlt );
      obj7.setgxTv_SdtBC_ALBREC_Albrest_Z( Z47AlbREst );
      obj7.setgxTv_SdtBC_ALBREC_Tipentcod_Z( Z1211TipEntCod );
      obj7.setgxTv_SdtBC_ALBREC_Tipentnom_Z( Z1212TipEntNom );
      obj7.setgxTv_SdtBC_ALBREC_Albnumeti_Z( Z1222AlbNumEti );
      obj7.setgxTv_SdtBC_ALBREC_Albrdes_Z( Z1291AlbRDes );
      obj7.setgxTv_SdtBC_ALBREC_Procecod_Z( Z970ProceCod );
      obj7.setgxTv_SdtBC_ALBREC_Procenom_Z( Z971ProceNom );
      obj7.setgxTv_SdtBC_ALBREC_Albrulin_Z( Z1301AlbRUlin );
      obj7.setgxTv_SdtBC_ALBREC_Albrefdsc_Z( Z3613AlbRefDsc );
      obj7.setgxTv_SdtBC_ALBREC_Albpmppza_Z( Z4290AlbPmPPza );
      obj7.setgxTv_SdtBC_ALBREC_Albpzaest_Z( Z4291AlbPzaEst );
      obj7.setgxTv_SdtBC_ALBREC_Albrgrm2_Z( Z4920AlbRGrm2 );
      obj7.setgxTv_SdtBC_ALBREC_Albranc_Z( Z4921AlbRAnc );
      obj7.setgxTv_SdtBC_ALBREC_Albpml_Z( Z4922AlbPml );
      obj7.setgxTv_SdtBC_ALBREC_Albrpre_Z( Z5743AlbRPre );
      obj7.setgxTv_SdtBC_ALBREC_Albraju_Z( Z5744AlbRAju );
      obj7.setgxTv_SdtBC_ALBREC_Albrrep_Z( Z5745AlbRRep );
      obj7.setgxTv_SdtBC_ALBREC_Albrent2_Z( Z5806AlbREnt2 );
      obj7.setgxTv_SdtBC_ALBREC_Albrusu_Z( Z6178AlbrUsu );
      obj7.setgxTv_SdtBC_ALBREC_Albrhor_Z( Z6179AlbrHor );
      obj7.setgxTv_SdtBC_ALBREC_Albrunic_Z( Z6180AlbrUniC );
      obj7.setgxTv_SdtBC_ALBREC_Albrpiec_Z( Z6181AlbrPieC );
      obj7.setgxTv_SdtBC_ALBREC_Albrnf_Z( Z6182AlbrNF );
      obj7.setgxTv_SdtBC_ALBREC_Albrfenf_Z( Z6183AlbrFeNf );
      obj7.setgxTv_SdtBC_ALBREC_Albrcfop_Z( Z6184AlbrCfop );
      obj7.setgxTv_SdtBC_ALBREC_Albrdiscli_Z( Z3359AlbRDisCli );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartc_Z( Z6263AlbRTartC );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartd_Z( Z6264AlbRTartD );
      obj7.setgxTv_SdtBC_ALBREC_Albrimp_Z( Z3360AlbRImp );
      obj7.setgxTv_SdtBC_ALBREC_Albrlote_Z( Z6463AlbRLote );
      obj7.setgxTv_SdtBC_ALBREC_Albrtelar_Z( Z6464AlbRTelar );
      obj7.setgxTv_SdtBC_ALBREC_Albrlot2_Z( Z14525AlbRLot2 );
      obj7.setgxTv_SdtBC_ALBREC_Albrlu_Z( Z6465AlbRLu );
      obj7.setgxTv_SdtBC_ALBREC_Albrmdlcod_Z( Z4602AlbRMdlCod );
      obj7.setgxTv_SdtBC_ALBREC_Albrtara_Z( Z6470AlbRTara );
      obj7.setgxTv_SdtBC_ALBREC_Albrunib_Z( Z6471AlbRUniB );
      obj7.setgxTv_SdtBC_ALBREC_Albdocprv_Z( Z6488AlbDocPrv );
      obj7.setgxTv_SdtBC_ALBREC_Albrudas_Z( Z6523AlbRUdas );
      obj7.setgxTv_SdtBC_ALBREC_Almcod_Z( Z4792AlmCod );
      obj7.setgxTv_SdtBC_ALBREC_Almnom_Z( Z4793AlmNom );
      obj7.setgxTv_SdtBC_ALBREC_Albcolor_Z( Z8023AlbColor );
      obj7.setgxTv_SdtBC_ALBREC_Albopst_Z( Z8024AlbOpsT );
      obj7.setgxTv_SdtBC_ALBREC_Albopsc_Z( Z8025AlbOpsC );
      obj7.setgxTv_SdtBC_ALBREC_Alboc_Z( Z8026AlbOC );
      obj7.setgxTv_SdtBC_ALBREC_Albhdri_Z( Z8027AlbHdri );
      obj7.setgxTv_SdtBC_ALBREC_Albnumb_Z( Z8028AlbNumB );
      obj7.setgxTv_SdtBC_ALBREC_Albnumm_Z( Z8029AlbNumM );
      obj7.setgxTv_SdtBC_ALBREC_Albancc_Z( Z8030AlbAncC );
      obj7.setgxTv_SdtBC_ALBREC_Albdndc_Z( Z8031AlbDndC );
      obj7.setgxTv_SdtBC_ALBREC_Albanccr_Z( Z8032AlbAncCr );
      obj7.setgxTv_SdtBC_ALBREC_Albdndcr_Z( Z8033AlbDndCr );
      obj7.setgxTv_SdtBC_ALBREC_Albgalga_Z( Z8034AlbGalga );
      obj7.setgxTv_SdtBC_ALBREC_Albmaqtej_Z( Z8035AlbMaqTej );
      obj7.setgxTv_SdtBC_ALBREC_Albdmt_Z( Z8036AlbDmt );
      obj7.setgxTv_SdtBC_ALBREC_Albpdac_Z( Z9793AlbPdaC );
      obj7.setgxTv_SdtBC_ALBREC_Albostj_Z( Z9794AlbOStj );
      obj7.setgxTv_SdtBC_ALBREC_Albstlot_Z( Z317AlbStLot );
      obj7.setgxTv_SdtBC_ALBREC_Albturno_Z( Z10358AlbTurno );
      obj7.setgxTv_SdtBC_ALBREC_Cliest_Z( Z8723CliEst );
      obj7.setgxTv_SdtBC_ALBREC_Alboekotex_Z( Z12879AlbOEKOTEX );
      obj7.setgxTv_SdtBC_ALBREC_Albrent_3_Z( Z14210AlbREnt_3 );
      obj7.setgxTv_SdtBC_ALBREC_Albrartlu_Z( Z13982AlbRArtLu );
      obj7.setgxTv_SdtBC_ALBREC_Albreccod_N( (byte)((byte)((n44AlbRecCod)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Trncod_N( (byte)((byte)((n840TrnCod)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Trnnom_N( (byte)((byte)((n841TrnNom)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Tipentcod_N( (byte)((byte)((n1211TipEntCod)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Tipentnom_N( (byte)((byte)((n1212TipEntNom)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Procecod_N( (byte)((byte)((n970ProceCod)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Procenom_N( (byte)((byte)((n971ProceNom)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartc_N( (byte)((byte)((n6263AlbRTartC)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Albrtartd_N( (byte)((byte)((n6264AlbRTartD)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Almcod_N( (byte)((byte)((n4792AlmCod)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Almnom_N( (byte)((byte)((n4793AlmNom)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Albrartlu_N( (byte)((byte)((n13982AlbRArtLu)?1:0)) );
      obj7.setgxTv_SdtBC_ALBREC_Mode( Gx_mode );
   }

   public void KeyVarsToRow7( app.SdtBC_ALBREC obj7 )
   {
      obj7.setgxTv_SdtBC_ALBREC_Emprcod( A396EmprCod );
      obj7.setgxTv_SdtBC_ALBREC_Albreccod( A44AlbRecCod );
   }

   public void RowToVars7( app.SdtBC_ALBREC obj7 ,
                           int forceLoad )
   {
      Gx_mode = obj7.getgxTv_SdtBC_ALBREC_Mode() ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A56AlbRUni = obj7.getgxTv_SdtBC_ALBREC_Albruni() ;
      }
      A317AlbStLot = obj7.getgxTv_SdtBC_ALBREC_Albstlot() ;
      A12879AlbOEKOTEX = obj7.getgxTv_SdtBC_ALBREC_Alboekotex() ;
      A57AlbRUniDis = obj7.getgxTv_SdtBC_ALBREC_Albrunidis() ;
      A4291AlbPzaEst = obj7.getgxTv_SdtBC_ALBREC_Albpzaest() ;
      A51AlbRPieDis = obj7.getgxTv_SdtBC_ALBREC_Albrpiedis() ;
      A14210AlbREnt_3 = obj7.getgxTv_SdtBC_ALBREC_Albrent_3() ;
      A13982AlbRArtLu = obj7.getgxTv_SdtBC_ALBREC_Albrartlu() ;
      n13982AlbRArtLu = false ;
      A407EmprNom = obj7.getgxTv_SdtBC_ALBREC_Emprnom() ;
      n407EmprNom = false ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A252CliCod = obj7.getgxTv_SdtBC_ALBREC_Clicod() ;
      }
      A279CliNom = obj7.getgxTv_SdtBC_ALBREC_Clinom() ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A45AlbRef = obj7.getgxTv_SdtBC_ALBREC_Albref() ;
      }
      A840TrnCod = obj7.getgxTv_SdtBC_ALBREC_Trncod() ;
      n840TrnCod = false ;
      A841TrnNom = obj7.getgxTv_SdtBC_ALBREC_Trnnom() ;
      n841TrnNom = false ;
      A46AlbREnt = obj7.getgxTv_SdtBC_ALBREC_Albrent() ;
      A52AlbRPieEnt = obj7.getgxTv_SdtBC_ALBREC_Albrpieent() ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A50AlbRLoc = obj7.getgxTv_SdtBC_ALBREC_Albrloc() ;
      }
      A58AlbRUniEnt = obj7.getgxTv_SdtBC_ALBREC_Albrunient() ;
      A4601AlbRTam = obj7.getgxTv_SdtBC_ALBREC_Albrtam() ;
      A9749Emp_Item1 = obj7.getgxTv_SdtBC_ALBREC_Emp_item1() ;
      if ( ! ( isIns( )  ) || ( forceLoad == 1 ) )
      {
         A54AlbRPieUti = obj7.getgxTv_SdtBC_ALBREC_Albrpieuti() ;
      }
      A53AlbRPieReb = obj7.getgxTv_SdtBC_ALBREC_Albrpiereb() ;
      if ( ! ( isIns( )  ) || ( forceLoad == 1 ) )
      {
         A60AlbRUniUti = obj7.getgxTv_SdtBC_ALBREC_Albruniuti() ;
      }
      A59AlbRUniReb = obj7.getgxTv_SdtBC_ALBREC_Albrunireb() ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A1211TipEntCod = obj7.getgxTv_SdtBC_ALBREC_Tipentcod() ;
         n1211TipEntCod = false ;
      }
      A1212TipEntNom = obj7.getgxTv_SdtBC_ALBREC_Tipentnom() ;
      n1212TipEntNom = false ;
      A1222AlbNumEti = obj7.getgxTv_SdtBC_ALBREC_Albnumeti() ;
      A1291AlbRDes = obj7.getgxTv_SdtBC_ALBREC_Albrdes() ;
      A970ProceCod = obj7.getgxTv_SdtBC_ALBREC_Procecod() ;
      n970ProceCod = false ;
      A971ProceNom = obj7.getgxTv_SdtBC_ALBREC_Procenom() ;
      n971ProceNom = false ;
      if ( forceLoad == 1 )
      {
         A1301AlbRUlin = obj7.getgxTv_SdtBC_ALBREC_Albrulin() ;
      }
      A3613AlbRefDsc = obj7.getgxTv_SdtBC_ALBREC_Albrefdsc() ;
      A4290AlbPmPPza = obj7.getgxTv_SdtBC_ALBREC_Albpmppza() ;
      A4920AlbRGrm2 = obj7.getgxTv_SdtBC_ALBREC_Albrgrm2() ;
      A4921AlbRAnc = obj7.getgxTv_SdtBC_ALBREC_Albranc() ;
      A4922AlbPml = obj7.getgxTv_SdtBC_ALBREC_Albpml() ;
      A5743AlbRPre = obj7.getgxTv_SdtBC_ALBREC_Albrpre() ;
      A5744AlbRAju = obj7.getgxTv_SdtBC_ALBREC_Albraju() ;
      A5745AlbRRep = obj7.getgxTv_SdtBC_ALBREC_Albrrep() ;
      A5806AlbREnt2 = obj7.getgxTv_SdtBC_ALBREC_Albrent2() ;
      A6184AlbrCfop = obj7.getgxTv_SdtBC_ALBREC_Albrcfop() ;
      A3359AlbRDisCli = obj7.getgxTv_SdtBC_ALBREC_Albrdiscli() ;
      A6263AlbRTartC = obj7.getgxTv_SdtBC_ALBREC_Albrtartc() ;
      n6263AlbRTartC = false ;
      A6264AlbRTartD = obj7.getgxTv_SdtBC_ALBREC_Albrtartd() ;
      n6264AlbRTartD = false ;
      A14525AlbRLot2 = obj7.getgxTv_SdtBC_ALBREC_Albrlot2() ;
      A6488AlbDocPrv = obj7.getgxTv_SdtBC_ALBREC_Albdocprv() ;
      A4792AlmCod = obj7.getgxTv_SdtBC_ALBREC_Almcod() ;
      n4792AlmCod = false ;
      A4793AlmNom = obj7.getgxTv_SdtBC_ALBREC_Almnom() ;
      n4793AlmNom = false ;
      A8023AlbColor = obj7.getgxTv_SdtBC_ALBREC_Albcolor() ;
      A8024AlbOpsT = obj7.getgxTv_SdtBC_ALBREC_Albopst() ;
      A8025AlbOpsC = obj7.getgxTv_SdtBC_ALBREC_Albopsc() ;
      A8026AlbOC = obj7.getgxTv_SdtBC_ALBREC_Alboc() ;
      A8027AlbHdri = obj7.getgxTv_SdtBC_ALBREC_Albhdri() ;
      A8028AlbNumB = obj7.getgxTv_SdtBC_ALBREC_Albnumb() ;
      A8029AlbNumM = obj7.getgxTv_SdtBC_ALBREC_Albnumm() ;
      A8030AlbAncC = obj7.getgxTv_SdtBC_ALBREC_Albancc() ;
      A8031AlbDndC = obj7.getgxTv_SdtBC_ALBREC_Albdndc() ;
      A8032AlbAncCr = obj7.getgxTv_SdtBC_ALBREC_Albanccr() ;
      A8033AlbDndCr = obj7.getgxTv_SdtBC_ALBREC_Albdndcr() ;
      A8034AlbGalga = obj7.getgxTv_SdtBC_ALBREC_Albgalga() ;
      A8035AlbMaqTej = obj7.getgxTv_SdtBC_ALBREC_Albmaqtej() ;
      A8036AlbDmt = obj7.getgxTv_SdtBC_ALBREC_Albdmt() ;
      A9793AlbPdaC = obj7.getgxTv_SdtBC_ALBREC_Albpdac() ;
      A9794AlbOStj = obj7.getgxTv_SdtBC_ALBREC_Albostj() ;
      A10358AlbTurno = obj7.getgxTv_SdtBC_ALBREC_Albturno() ;
      A8723CliEst = obj7.getgxTv_SdtBC_ALBREC_Cliest() ;
      A47AlbREst = obj7.getgxTv_SdtBC_ALBREC_Albrest() ;
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A49AlbRFen = obj7.getgxTv_SdtBC_ALBREC_Albrfen() ;
      }
      if ( ! ( ( obj7.getgxTv_SdtBC_ALBREC_Tipentcod() == 9999 ) && true /* Level */ ) || ( forceLoad == 1 ) )
      {
         A55AlbRReo = obj7.getgxTv_SdtBC_ALBREC_Albrreo() ;
      }
      if ( forceLoad == 1 )
      {
         A48AlbRFecUlt = obj7.getgxTv_SdtBC_ALBREC_Albrfecult() ;
      }
      A6178AlbrUsu = obj7.getgxTv_SdtBC_ALBREC_Albrusu() ;
      A6179AlbrHor = obj7.getgxTv_SdtBC_ALBREC_Albrhor() ;
      A6180AlbrUniC = obj7.getgxTv_SdtBC_ALBREC_Albrunic() ;
      A6181AlbrPieC = obj7.getgxTv_SdtBC_ALBREC_Albrpiec() ;
      A6182AlbrNF = obj7.getgxTv_SdtBC_ALBREC_Albrnf() ;
      if ( forceLoad == 1 )
      {
         A6183AlbrFeNf = obj7.getgxTv_SdtBC_ALBREC_Albrfenf() ;
      }
      A3360AlbRImp = obj7.getgxTv_SdtBC_ALBREC_Albrimp() ;
      A6463AlbRLote = obj7.getgxTv_SdtBC_ALBREC_Albrlote() ;
      A6464AlbRTelar = obj7.getgxTv_SdtBC_ALBREC_Albrtelar() ;
      A6465AlbRLu = obj7.getgxTv_SdtBC_ALBREC_Albrlu() ;
      A4602AlbRMdlCod = obj7.getgxTv_SdtBC_ALBREC_Albrmdlcod() ;
      A6470AlbRTara = obj7.getgxTv_SdtBC_ALBREC_Albrtara() ;
      A6471AlbRUniB = obj7.getgxTv_SdtBC_ALBREC_Albrunib() ;
      A6523AlbRUdas = obj7.getgxTv_SdtBC_ALBREC_Albrudas() ;
      if ( forceLoad == 1 )
      {
         A396EmprCod = obj7.getgxTv_SdtBC_ALBREC_Emprcod() ;
      }
      A44AlbRecCod = obj7.getgxTv_SdtBC_ALBREC_Albreccod() ;
      n44AlbRecCod = false ;
      Z396EmprCod = obj7.getgxTv_SdtBC_ALBREC_Emprcod_Z() ;
      Z44AlbRecCod = obj7.getgxTv_SdtBC_ALBREC_Albreccod_Z() ;
      Z407EmprNom = obj7.getgxTv_SdtBC_ALBREC_Emprnom_Z() ;
      Z252CliCod = obj7.getgxTv_SdtBC_ALBREC_Clicod_Z() ;
      Z279CliNom = obj7.getgxTv_SdtBC_ALBREC_Clinom_Z() ;
      Z45AlbRef = obj7.getgxTv_SdtBC_ALBREC_Albref_Z() ;
      Z840TrnCod = obj7.getgxTv_SdtBC_ALBREC_Trncod_Z() ;
      Z841TrnNom = obj7.getgxTv_SdtBC_ALBREC_Trnnom_Z() ;
      Z46AlbREnt = obj7.getgxTv_SdtBC_ALBREC_Albrent_Z() ;
      Z52AlbRPieEnt = obj7.getgxTv_SdtBC_ALBREC_Albrpieent_Z() ;
      O52AlbRPieEnt = obj7.getgxTv_SdtBC_ALBREC_Albrpieent_Z() ;
      Z56AlbRUni = obj7.getgxTv_SdtBC_ALBREC_Albruni_Z() ;
      Z50AlbRLoc = obj7.getgxTv_SdtBC_ALBREC_Albrloc_Z() ;
      Z49AlbRFen = obj7.getgxTv_SdtBC_ALBREC_Albrfen_Z() ;
      Z58AlbRUniEnt = obj7.getgxTv_SdtBC_ALBREC_Albrunient_Z() ;
      O58AlbRUniEnt = obj7.getgxTv_SdtBC_ALBREC_Albrunient_Z() ;
      Z4601AlbRTam = obj7.getgxTv_SdtBC_ALBREC_Albrtam_Z() ;
      Z9749Emp_Item1 = obj7.getgxTv_SdtBC_ALBREC_Emp_item1_Z() ;
      Z55AlbRReo = obj7.getgxTv_SdtBC_ALBREC_Albrreo_Z() ;
      O55AlbRReo = obj7.getgxTv_SdtBC_ALBREC_Albrreo_Z() ;
      Z54AlbRPieUti = obj7.getgxTv_SdtBC_ALBREC_Albrpieuti_Z() ;
      O54AlbRPieUti = obj7.getgxTv_SdtBC_ALBREC_Albrpieuti_Z() ;
      Z53AlbRPieReb = obj7.getgxTv_SdtBC_ALBREC_Albrpiereb_Z() ;
      Z60AlbRUniUti = obj7.getgxTv_SdtBC_ALBREC_Albruniuti_Z() ;
      O60AlbRUniUti = obj7.getgxTv_SdtBC_ALBREC_Albruniuti_Z() ;
      Z59AlbRUniReb = obj7.getgxTv_SdtBC_ALBREC_Albrunireb_Z() ;
      Z51AlbRPieDis = obj7.getgxTv_SdtBC_ALBREC_Albrpiedis_Z() ;
      Z57AlbRUniDis = obj7.getgxTv_SdtBC_ALBREC_Albrunidis_Z() ;
      Z48AlbRFecUlt = obj7.getgxTv_SdtBC_ALBREC_Albrfecult_Z() ;
      Z47AlbREst = obj7.getgxTv_SdtBC_ALBREC_Albrest_Z() ;
      Z1211TipEntCod = obj7.getgxTv_SdtBC_ALBREC_Tipentcod_Z() ;
      Z1212TipEntNom = obj7.getgxTv_SdtBC_ALBREC_Tipentnom_Z() ;
      Z1222AlbNumEti = obj7.getgxTv_SdtBC_ALBREC_Albnumeti_Z() ;
      Z1291AlbRDes = obj7.getgxTv_SdtBC_ALBREC_Albrdes_Z() ;
      Z970ProceCod = obj7.getgxTv_SdtBC_ALBREC_Procecod_Z() ;
      Z971ProceNom = obj7.getgxTv_SdtBC_ALBREC_Procenom_Z() ;
      Z1301AlbRUlin = obj7.getgxTv_SdtBC_ALBREC_Albrulin_Z() ;
      O1301AlbRUlin = obj7.getgxTv_SdtBC_ALBREC_Albrulin_Z() ;
      Z3613AlbRefDsc = obj7.getgxTv_SdtBC_ALBREC_Albrefdsc_Z() ;
      Z4290AlbPmPPza = obj7.getgxTv_SdtBC_ALBREC_Albpmppza_Z() ;
      Z4291AlbPzaEst = obj7.getgxTv_SdtBC_ALBREC_Albpzaest_Z() ;
      Z4920AlbRGrm2 = obj7.getgxTv_SdtBC_ALBREC_Albrgrm2_Z() ;
      Z4921AlbRAnc = obj7.getgxTv_SdtBC_ALBREC_Albranc_Z() ;
      Z4922AlbPml = obj7.getgxTv_SdtBC_ALBREC_Albpml_Z() ;
      Z5743AlbRPre = obj7.getgxTv_SdtBC_ALBREC_Albrpre_Z() ;
      Z5744AlbRAju = obj7.getgxTv_SdtBC_ALBREC_Albraju_Z() ;
      Z5745AlbRRep = obj7.getgxTv_SdtBC_ALBREC_Albrrep_Z() ;
      Z5806AlbREnt2 = obj7.getgxTv_SdtBC_ALBREC_Albrent2_Z() ;
      Z6178AlbrUsu = obj7.getgxTv_SdtBC_ALBREC_Albrusu_Z() ;
      Z6179AlbrHor = obj7.getgxTv_SdtBC_ALBREC_Albrhor_Z() ;
      Z6180AlbrUniC = obj7.getgxTv_SdtBC_ALBREC_Albrunic_Z() ;
      Z6181AlbrPieC = obj7.getgxTv_SdtBC_ALBREC_Albrpiec_Z() ;
      Z6182AlbrNF = obj7.getgxTv_SdtBC_ALBREC_Albrnf_Z() ;
      Z6183AlbrFeNf = obj7.getgxTv_SdtBC_ALBREC_Albrfenf_Z() ;
      Z6184AlbrCfop = obj7.getgxTv_SdtBC_ALBREC_Albrcfop_Z() ;
      Z3359AlbRDisCli = obj7.getgxTv_SdtBC_ALBREC_Albrdiscli_Z() ;
      Z6263AlbRTartC = obj7.getgxTv_SdtBC_ALBREC_Albrtartc_Z() ;
      Z6264AlbRTartD = obj7.getgxTv_SdtBC_ALBREC_Albrtartd_Z() ;
      Z3360AlbRImp = obj7.getgxTv_SdtBC_ALBREC_Albrimp_Z() ;
      Z6463AlbRLote = obj7.getgxTv_SdtBC_ALBREC_Albrlote_Z() ;
      O6463AlbRLote = obj7.getgxTv_SdtBC_ALBREC_Albrlote_Z() ;
      Z6464AlbRTelar = obj7.getgxTv_SdtBC_ALBREC_Albrtelar_Z() ;
      O6464AlbRTelar = obj7.getgxTv_SdtBC_ALBREC_Albrtelar_Z() ;
      Z14525AlbRLot2 = obj7.getgxTv_SdtBC_ALBREC_Albrlot2_Z() ;
      Z6465AlbRLu = obj7.getgxTv_SdtBC_ALBREC_Albrlu_Z() ;
      O6465AlbRLu = obj7.getgxTv_SdtBC_ALBREC_Albrlu_Z() ;
      Z4602AlbRMdlCod = obj7.getgxTv_SdtBC_ALBREC_Albrmdlcod_Z() ;
      O4602AlbRMdlCod = obj7.getgxTv_SdtBC_ALBREC_Albrmdlcod_Z() ;
      Z6470AlbRTara = obj7.getgxTv_SdtBC_ALBREC_Albrtara_Z() ;
      Z6471AlbRUniB = obj7.getgxTv_SdtBC_ALBREC_Albrunib_Z() ;
      Z6488AlbDocPrv = obj7.getgxTv_SdtBC_ALBREC_Albdocprv_Z() ;
      Z6523AlbRUdas = obj7.getgxTv_SdtBC_ALBREC_Albrudas_Z() ;
      Z4792AlmCod = obj7.getgxTv_SdtBC_ALBREC_Almcod_Z() ;
      Z4793AlmNom = obj7.getgxTv_SdtBC_ALBREC_Almnom_Z() ;
      Z8023AlbColor = obj7.getgxTv_SdtBC_ALBREC_Albcolor_Z() ;
      Z8024AlbOpsT = obj7.getgxTv_SdtBC_ALBREC_Albopst_Z() ;
      Z8025AlbOpsC = obj7.getgxTv_SdtBC_ALBREC_Albopsc_Z() ;
      Z8026AlbOC = obj7.getgxTv_SdtBC_ALBREC_Alboc_Z() ;
      Z8027AlbHdri = obj7.getgxTv_SdtBC_ALBREC_Albhdri_Z() ;
      Z8028AlbNumB = obj7.getgxTv_SdtBC_ALBREC_Albnumb_Z() ;
      Z8029AlbNumM = obj7.getgxTv_SdtBC_ALBREC_Albnumm_Z() ;
      Z8030AlbAncC = obj7.getgxTv_SdtBC_ALBREC_Albancc_Z() ;
      Z8031AlbDndC = obj7.getgxTv_SdtBC_ALBREC_Albdndc_Z() ;
      Z8032AlbAncCr = obj7.getgxTv_SdtBC_ALBREC_Albanccr_Z() ;
      Z8033AlbDndCr = obj7.getgxTv_SdtBC_ALBREC_Albdndcr_Z() ;
      Z8034AlbGalga = obj7.getgxTv_SdtBC_ALBREC_Albgalga_Z() ;
      Z8035AlbMaqTej = obj7.getgxTv_SdtBC_ALBREC_Albmaqtej_Z() ;
      Z8036AlbDmt = obj7.getgxTv_SdtBC_ALBREC_Albdmt_Z() ;
      Z9793AlbPdaC = obj7.getgxTv_SdtBC_ALBREC_Albpdac_Z() ;
      Z9794AlbOStj = obj7.getgxTv_SdtBC_ALBREC_Albostj_Z() ;
      Z317AlbStLot = obj7.getgxTv_SdtBC_ALBREC_Albstlot_Z() ;
      Z10358AlbTurno = obj7.getgxTv_SdtBC_ALBREC_Albturno_Z() ;
      Z8723CliEst = obj7.getgxTv_SdtBC_ALBREC_Cliest_Z() ;
      Z12879AlbOEKOTEX = obj7.getgxTv_SdtBC_ALBREC_Alboekotex_Z() ;
      Z14210AlbREnt_3 = obj7.getgxTv_SdtBC_ALBREC_Albrent_3_Z() ;
      Z13982AlbRArtLu = obj7.getgxTv_SdtBC_ALBREC_Albrartlu_Z() ;
      n44AlbRecCod = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Albreccod_N()==0)?false:true) ;
      n407EmprNom = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Emprnom_N()==0)?false:true) ;
      n840TrnCod = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Trncod_N()==0)?false:true) ;
      n841TrnNom = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Trnnom_N()==0)?false:true) ;
      n1211TipEntCod = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Tipentcod_N()==0)?false:true) ;
      n1212TipEntNom = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Tipentnom_N()==0)?false:true) ;
      n970ProceCod = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Procecod_N()==0)?false:true) ;
      n971ProceNom = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Procenom_N()==0)?false:true) ;
      n6263AlbRTartC = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Albrtartc_N()==0)?false:true) ;
      n6264AlbRTartD = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Albrtartd_N()==0)?false:true) ;
      n4792AlmCod = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Almcod_N()==0)?false:true) ;
      n4793AlmNom = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Almnom_N()==0)?false:true) ;
      n13982AlbRArtLu = (boolean)((obj7.getgxTv_SdtBC_ALBREC_Albrartlu_N()==0)?false:true) ;
      Gx_mode = obj7.getgxTv_SdtBC_ALBREC_Mode() ;
   }

   public void VarsToRow191( app.SdtBC_ALBREC_Level1Item obj191 )
   {
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Mode( Gx_mode );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Albrobs( A1300AlbRObs );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Albrlin( A1299AlbRLin );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z( Z1299AlbRLin );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z( Z1300AlbRObs );
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Modified( nIsMod_191 );
   }

   public void KeyVarsToRow191( app.SdtBC_ALBREC_Level1Item obj191 )
   {
      obj191.setgxTv_SdtBC_ALBREC_Level1Item_Albrlin( A1299AlbRLin );
   }

   public void RowToVars191( app.SdtBC_ALBREC_Level1Item obj191 ,
                             int forceLoad )
   {
      Gx_mode = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Mode() ;
      A1300AlbRObs = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Albrobs() ;
      A1299AlbRLin = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Albrlin() ;
      Z1299AlbRLin = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z() ;
      Z1300AlbRObs = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z() ;
      nIsMod_191 = obj191.getgxTv_SdtBC_ALBREC_Level1Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A44AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      n44AlbRecCod = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1VZ7( ) ;
      scanKeyStart1VZ7( ) ;
      if ( RcdFound7 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01VZ61 */
         pr_default.execute(59, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(59) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01VZ61_A407EmprNom[0] ;
         n407EmprNom = BC01VZ61_n407EmprNom[0] ;
         pr_default.close(59);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         O1301AlbRUlin = A1301AlbRUlin ;
         O55AlbRReo = A55AlbRReo ;
         O6464AlbRTelar = A6464AlbRTelar ;
         O6465AlbRLu = A6465AlbRLu ;
         O6463AlbRLote = A6463AlbRLote ;
         O4602AlbRMdlCod = A4602AlbRMdlCod ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         O52AlbRPieEnt = A52AlbRPieEnt ;
         O58AlbRUniEnt = A58AlbRUniEnt ;
      }
      zm1VZ7( -91) ;
      onLoadActions1VZ7( ) ;
      addRow1VZ7( ) ;
      bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().clearCollection();
      if ( RcdFound7 == 1 )
      {
         scanKeyStart1VZ191( ) ;
         nGXsfl_191_idx = 1 ;
         while ( RcdFound191 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z1299AlbRLin = A1299AlbRLin ;
            zm1VZ191( -100) ;
            onLoadActions1VZ191( ) ;
            nRcdExists_191 = (short)(1) ;
            nIsMod_191 = (short)(0) ;
            addRow1VZ191( ) ;
            nGXsfl_191_idx = (int)(nGXsfl_191_idx+1) ;
            scanKeyNext1VZ191( ) ;
         }
         scanKeyEnd1VZ191( ) ;
      }
      scanKeyEnd1VZ7( ) ;
      if ( RcdFound7 == 0 )
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
      RowToVars7( bcBC_ALBREC, 0) ;
      scanKeyStart1VZ7( ) ;
      if ( RcdFound7 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01VZ62 */
         pr_default.execute(60, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(60) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01VZ62_A407EmprNom[0] ;
         n407EmprNom = BC01VZ62_n407EmprNom[0] ;
         pr_default.close(60);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         O1301AlbRUlin = A1301AlbRUlin ;
         O55AlbRReo = A55AlbRReo ;
         O6464AlbRTelar = A6464AlbRTelar ;
         O6465AlbRLu = A6465AlbRLu ;
         O6463AlbRLote = A6463AlbRLote ;
         O4602AlbRMdlCod = A4602AlbRMdlCod ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         O52AlbRPieEnt = A52AlbRPieEnt ;
         O58AlbRUniEnt = A58AlbRUniEnt ;
      }
      zm1VZ7( -91) ;
      onLoadActions1VZ7( ) ;
      addRow1VZ7( ) ;
      bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Level1().clearCollection();
      if ( RcdFound7 == 1 )
      {
         scanKeyStart1VZ191( ) ;
         nGXsfl_191_idx = 1 ;
         while ( RcdFound191 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z1299AlbRLin = A1299AlbRLin ;
            zm1VZ191( -100) ;
            onLoadActions1VZ191( ) ;
            nRcdExists_191 = (short)(1) ;
            nIsMod_191 = (short)(0) ;
            addRow1VZ191( ) ;
            nGXsfl_191_idx = (int)(nGXsfl_191_idx+1) ;
            scanKeyNext1VZ191( ) ;
         }
         scanKeyEnd1VZ191( ) ;
      }
      scanKeyEnd1VZ7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VZ7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1301AlbRUlin = O1301AlbRUlin ;
         insert1VZ7( ) ;
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               A1301AlbRUlin = O1301AlbRUlin ;
               update1VZ7( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
                     A1301AlbRUlin = O1301AlbRUlin ;
                     insert1VZ7( ) ;
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
                     A1301AlbRUlin = O1301AlbRUlin ;
                     insert1VZ7( ) ;
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
      RowToVars7( bcBC_ALBREC, 1) ;
      saveImpl( ) ;
      VarsToRow7( bcBC_ALBREC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars7( bcBC_ALBREC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      A1301AlbRUlin = O1301AlbRUlin ;
      insert1VZ7( ) ;
      afterTrn( ) ;
      VarsToRow7( bcBC_ALBREC) ;
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
         app.SdtBC_ALBREC auxBC = new app.SdtBC_ALBREC( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A44AlbRecCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcBC_ALBREC);
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
      RowToVars7( bcBC_ALBREC, 1) ;
      updateImpl( ) ;
      VarsToRow7( bcBC_ALBREC) ;
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
      RowToVars7( bcBC_ALBREC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VZ7( ) ;
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
      VarsToRow7( bcBC_ALBREC) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars7( bcBC_ALBREC, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1VZ7( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            A44AlbRecCod = Z44AlbRecCod ;
            n44AlbRecCod = false ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "bc_albrec_bc");
      VarsToRow7( bcBC_ALBREC) ;
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
      Gx_mode = bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcBC_ALBREC.setgxTv_SdtBC_ALBREC_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtBC_ALBREC sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcBC_ALBREC )
      {
         bcBC_ALBREC = sdt ;
         if ( GXutil.strcmp(bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Mode(), "") == 0 )
         {
            bcBC_ALBREC.setgxTv_SdtBC_ALBREC_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow7( bcBC_ALBREC) ;
         }
         else
         {
            RowToVars7( bcBC_ALBREC, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcBC_ALBREC.getgxTv_SdtBC_ALBREC_Mode(), "") == 0 )
         {
            bcBC_ALBREC.setgxTv_SdtBC_ALBREC_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars7( bcBC_ALBREC, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtBC_ALBREC getBC_ALBREC_BC( )
   {
      return bcBC_ALBREC ;
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
      sMode7 = "" ;
      AV29Station = "" ;
      GXt_char1 = "" ;
      AV175EmprCod = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      AV190Normas = DecimalUtil.ZERO ;
      AV191Sicrudo = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      A56AlbRUni = "" ;
      Z12879AlbOEKOTEX = "" ;
      A12879AlbOEKOTEX = "" ;
      Z45AlbRef = "" ;
      A45AlbRef = "" ;
      Z46AlbREnt = "" ;
      A46AlbREnt = "" ;
      Z50AlbRLoc = "" ;
      A50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      A49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      Z4601AlbRTam = "" ;
      A4601AlbRTam = "" ;
      Z9749Emp_Item1 = "" ;
      A9749Emp_Item1 = "" ;
      Z55AlbRReo = "" ;
      A55AlbRReo = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      A1291AlbRDes = "" ;
      Z3613AlbRefDsc = "" ;
      A3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      Z5806AlbREnt2 = "" ;
      A5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      A6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      Z6182AlbrNF = "" ;
      A6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      A6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      A3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      A3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      A6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      A6464AlbRTelar = "" ;
      Z14525AlbRLot2 = "" ;
      A14525AlbRLot2 = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      A4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      A6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      A6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      A6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      A8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      A8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      A8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      A8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      A8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      A8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      A8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      Z8035AlbMaqTej = "" ;
      A8035AlbMaqTej = "" ;
      Z9793AlbPdaC = "" ;
      A9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      A9794AlbOStj = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Z14210AlbREnt_3 = "" ;
      A14210AlbREnt_3 = "" ;
      Z13982AlbRArtLu = DecimalUtil.ZERO ;
      A13982AlbRArtLu = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z279CliNom = "" ;
      A279CliNom = "" ;
      Z8723CliEst = "" ;
      A8723CliEst = "" ;
      Z6264AlbRTartD = "" ;
      A6264AlbRTartD = "" ;
      Z841TrnNom = "" ;
      A841TrnNom = "" ;
      Z971ProceNom = "" ;
      A971ProceNom = "" ;
      Z1212TipEntNom = "" ;
      A1212TipEntNom = "" ;
      Z4793AlmNom = "" ;
      A4793AlmNom = "" ;
      AV189Pgmname = "" ;
      AV35Modo = "" ;
      AV76Albrfenf = GXutil.nullDate() ;
      AV87albrfen = GXutil.nullDate() ;
      AV83albrreo = "" ;
      AV155OldAlbRreo = "" ;
      O55AlbRReo = "" ;
      AV84albrnf = "" ;
      AV156AlbRMdlCod = "" ;
      O4602AlbRMdlCod = "" ;
      AV157ALbrlote = "" ;
      O6463AlbRLote = "" ;
      AV159AlbRTelar = "" ;
      O6464AlbRTelar = "" ;
      AV158AlbRLu = DecimalUtil.ZERO ;
      O6465AlbRLu = DecimalUtil.ZERO ;
      BC01VZ14_A65ArtCod = new String[] {""} ;
      BC01VZ14_A44AlbRecCod = new int[1] ;
      BC01VZ14_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ14_A56AlbRUni = new String[] {""} ;
      BC01VZ14_A47AlbREst = new byte[1] ;
      BC01VZ14_A317AlbStLot = new byte[1] ;
      BC01VZ14_A12879AlbOEKOTEX = new String[] {""} ;
      BC01VZ14_A407EmprNom = new String[] {""} ;
      BC01VZ14_n407EmprNom = new boolean[] {false} ;
      BC01VZ14_A279CliNom = new String[] {""} ;
      BC01VZ14_A45AlbRef = new String[] {""} ;
      BC01VZ14_A841TrnNom = new String[] {""} ;
      BC01VZ14_n841TrnNom = new boolean[] {false} ;
      BC01VZ14_A46AlbREnt = new String[] {""} ;
      BC01VZ14_A52AlbRPieEnt = new int[1] ;
      BC01VZ14_A50AlbRLoc = new String[] {""} ;
      BC01VZ14_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ14_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A4601AlbRTam = new String[] {""} ;
      BC01VZ14_A9749Emp_Item1 = new String[] {""} ;
      BC01VZ14_A55AlbRReo = new String[] {""} ;
      BC01VZ14_A54AlbRPieUti = new int[1] ;
      BC01VZ14_A53AlbRPieReb = new int[1] ;
      BC01VZ14_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ14_A1212TipEntNom = new String[] {""} ;
      BC01VZ14_n1212TipEntNom = new boolean[] {false} ;
      BC01VZ14_A1222AlbNumEti = new short[1] ;
      BC01VZ14_A1291AlbRDes = new String[] {""} ;
      BC01VZ14_A971ProceNom = new String[] {""} ;
      BC01VZ14_n971ProceNom = new boolean[] {false} ;
      BC01VZ14_A1301AlbRUlin = new byte[1] ;
      BC01VZ14_A3613AlbRefDsc = new String[] {""} ;
      BC01VZ14_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A4920AlbRGrm2 = new short[1] ;
      BC01VZ14_A4921AlbRAnc = new short[1] ;
      BC01VZ14_A4922AlbPml = new short[1] ;
      BC01VZ14_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A5745AlbRRep = new byte[1] ;
      BC01VZ14_A5806AlbREnt2 = new String[] {""} ;
      BC01VZ14_A6178AlbrUsu = new String[] {""} ;
      BC01VZ14_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ14_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A6181AlbrPieC = new int[1] ;
      BC01VZ14_A6182AlbrNF = new String[] {""} ;
      BC01VZ14_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ14_A6184AlbrCfop = new String[] {""} ;
      BC01VZ14_A3359AlbRDisCli = new String[] {""} ;
      BC01VZ14_A6264AlbRTartD = new String[] {""} ;
      BC01VZ14_n6264AlbRTartD = new boolean[] {false} ;
      BC01VZ14_A3360AlbRImp = new String[] {""} ;
      BC01VZ14_A6463AlbRLote = new String[] {""} ;
      BC01VZ14_A6464AlbRTelar = new String[] {""} ;
      BC01VZ14_A14525AlbRLot2 = new String[] {""} ;
      BC01VZ14_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A4602AlbRMdlCod = new String[] {""} ;
      BC01VZ14_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A6488AlbDocPrv = new String[] {""} ;
      BC01VZ14_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A4793AlmNom = new String[] {""} ;
      BC01VZ14_n4793AlmNom = new boolean[] {false} ;
      BC01VZ14_A8023AlbColor = new String[] {""} ;
      BC01VZ14_A8024AlbOpsT = new String[] {""} ;
      BC01VZ14_A8025AlbOpsC = new String[] {""} ;
      BC01VZ14_A8026AlbOC = new String[] {""} ;
      BC01VZ14_A8027AlbHdri = new String[] {""} ;
      BC01VZ14_A8028AlbNumB = new String[] {""} ;
      BC01VZ14_A8029AlbNumM = new String[] {""} ;
      BC01VZ14_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A8031AlbDndC = new short[1] ;
      BC01VZ14_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_A8033AlbDndCr = new short[1] ;
      BC01VZ14_A8034AlbGalga = new short[1] ;
      BC01VZ14_A8035AlbMaqTej = new String[] {""} ;
      BC01VZ14_A8036AlbDmt = new short[1] ;
      BC01VZ14_A9793AlbPdaC = new String[] {""} ;
      BC01VZ14_A9794AlbOStj = new String[] {""} ;
      BC01VZ14_A10358AlbTurno = new byte[1] ;
      BC01VZ14_A8723CliEst = new String[] {""} ;
      BC01VZ14_A396EmprCod = new String[] {""} ;
      BC01VZ14_A252CliCod = new int[1] ;
      BC01VZ14_A6263AlbRTartC = new short[1] ;
      BC01VZ14_n6263AlbRTartC = new boolean[] {false} ;
      BC01VZ14_A840TrnCod = new short[1] ;
      BC01VZ14_n840TrnCod = new boolean[] {false} ;
      BC01VZ14_A970ProceCod = new short[1] ;
      BC01VZ14_n970ProceCod = new boolean[] {false} ;
      BC01VZ14_A1211TipEntCod = new short[1] ;
      BC01VZ14_n1211TipEntCod = new boolean[] {false} ;
      BC01VZ14_A4792AlmCod = new byte[1] ;
      BC01VZ14_n4792AlmCod = new boolean[] {false} ;
      BC01VZ14_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ14_n13982AlbRArtLu = new boolean[] {false} ;
      AV75Documento = "" ;
      AV79AlbRef = "" ;
      AV60ALbRunient = DecimalUtil.ZERO ;
      AV133UniENtold = DecimalUtil.ZERO ;
      O58AlbRUniEnt = DecimalUtil.ZERO ;
      AV145Oldunie = DecimalUtil.ZERO ;
      AV146olduniu = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      AV81Albrpre = DecimalUtil.ZERO ;
      AV82albrcfop = "" ;
      AV9AlbCum = "" ;
      AV85AlbRunic = DecimalUtil.ZERO ;
      BC01VZ15_A407EmprNom = new String[] {""} ;
      BC01VZ15_n407EmprNom = new boolean[] {false} ;
      BC01VZ16_A279CliNom = new String[] {""} ;
      BC01VZ16_A8723CliEst = new String[] {""} ;
      BC01VZ17_A6264AlbRTartD = new String[] {""} ;
      BC01VZ17_n6264AlbRTartD = new boolean[] {false} ;
      BC01VZ18_A841TrnNom = new String[] {""} ;
      BC01VZ18_n841TrnNom = new boolean[] {false} ;
      BC01VZ19_A971ProceNom = new String[] {""} ;
      BC01VZ19_n971ProceNom = new boolean[] {false} ;
      BC01VZ20_A1212TipEntNom = new String[] {""} ;
      BC01VZ20_n1212TipEntNom = new boolean[] {false} ;
      BC01VZ21_A4793AlmNom = new String[] {""} ;
      BC01VZ21_n4793AlmNom = new boolean[] {false} ;
      BC01VZ22_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ22_n13982AlbRArtLu = new boolean[] {false} ;
      AV65Compos = "" ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      BC01VZ23_A396EmprCod = new String[] {""} ;
      BC01VZ23_A44AlbRecCod = new int[1] ;
      BC01VZ23_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ24_A44AlbRecCod = new int[1] ;
      BC01VZ24_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ24_A56AlbRUni = new String[] {""} ;
      BC01VZ24_A47AlbREst = new byte[1] ;
      BC01VZ24_A317AlbStLot = new byte[1] ;
      BC01VZ24_A12879AlbOEKOTEX = new String[] {""} ;
      BC01VZ24_A45AlbRef = new String[] {""} ;
      BC01VZ24_A46AlbREnt = new String[] {""} ;
      BC01VZ24_A52AlbRPieEnt = new int[1] ;
      BC01VZ24_A50AlbRLoc = new String[] {""} ;
      BC01VZ24_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ24_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A4601AlbRTam = new String[] {""} ;
      BC01VZ24_A9749Emp_Item1 = new String[] {""} ;
      BC01VZ24_A55AlbRReo = new String[] {""} ;
      BC01VZ24_A54AlbRPieUti = new int[1] ;
      BC01VZ24_A53AlbRPieReb = new int[1] ;
      BC01VZ24_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ24_A1222AlbNumEti = new short[1] ;
      BC01VZ24_A1291AlbRDes = new String[] {""} ;
      BC01VZ24_A1301AlbRUlin = new byte[1] ;
      BC01VZ24_A3613AlbRefDsc = new String[] {""} ;
      BC01VZ24_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A4920AlbRGrm2 = new short[1] ;
      BC01VZ24_A4921AlbRAnc = new short[1] ;
      BC01VZ24_A4922AlbPml = new short[1] ;
      BC01VZ24_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A5745AlbRRep = new byte[1] ;
      BC01VZ24_A5806AlbREnt2 = new String[] {""} ;
      BC01VZ24_A6178AlbrUsu = new String[] {""} ;
      BC01VZ24_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ24_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A6181AlbrPieC = new int[1] ;
      BC01VZ24_A6182AlbrNF = new String[] {""} ;
      BC01VZ24_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ24_A6184AlbrCfop = new String[] {""} ;
      BC01VZ24_A3359AlbRDisCli = new String[] {""} ;
      BC01VZ24_A3360AlbRImp = new String[] {""} ;
      BC01VZ24_A6463AlbRLote = new String[] {""} ;
      BC01VZ24_A6464AlbRTelar = new String[] {""} ;
      BC01VZ24_A14525AlbRLot2 = new String[] {""} ;
      BC01VZ24_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A4602AlbRMdlCod = new String[] {""} ;
      BC01VZ24_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A6488AlbDocPrv = new String[] {""} ;
      BC01VZ24_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A8023AlbColor = new String[] {""} ;
      BC01VZ24_A8024AlbOpsT = new String[] {""} ;
      BC01VZ24_A8025AlbOpsC = new String[] {""} ;
      BC01VZ24_A8026AlbOC = new String[] {""} ;
      BC01VZ24_A8027AlbHdri = new String[] {""} ;
      BC01VZ24_A8028AlbNumB = new String[] {""} ;
      BC01VZ24_A8029AlbNumM = new String[] {""} ;
      BC01VZ24_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A8031AlbDndC = new short[1] ;
      BC01VZ24_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ24_A8033AlbDndCr = new short[1] ;
      BC01VZ24_A8034AlbGalga = new short[1] ;
      BC01VZ24_A8035AlbMaqTej = new String[] {""} ;
      BC01VZ24_A8036AlbDmt = new short[1] ;
      BC01VZ24_A9793AlbPdaC = new String[] {""} ;
      BC01VZ24_A9794AlbOStj = new String[] {""} ;
      BC01VZ24_A10358AlbTurno = new byte[1] ;
      BC01VZ24_A396EmprCod = new String[] {""} ;
      BC01VZ24_A252CliCod = new int[1] ;
      BC01VZ24_A6263AlbRTartC = new short[1] ;
      BC01VZ24_n6263AlbRTartC = new boolean[] {false} ;
      BC01VZ24_A840TrnCod = new short[1] ;
      BC01VZ24_n840TrnCod = new boolean[] {false} ;
      BC01VZ24_A970ProceCod = new short[1] ;
      BC01VZ24_n970ProceCod = new boolean[] {false} ;
      BC01VZ24_A1211TipEntCod = new short[1] ;
      BC01VZ24_n1211TipEntCod = new boolean[] {false} ;
      BC01VZ24_A4792AlmCod = new byte[1] ;
      BC01VZ24_n4792AlmCod = new boolean[] {false} ;
      BC01VZ25_A44AlbRecCod = new int[1] ;
      BC01VZ25_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ25_A56AlbRUni = new String[] {""} ;
      BC01VZ25_A47AlbREst = new byte[1] ;
      BC01VZ25_A317AlbStLot = new byte[1] ;
      BC01VZ25_A12879AlbOEKOTEX = new String[] {""} ;
      BC01VZ25_A45AlbRef = new String[] {""} ;
      BC01VZ25_A46AlbREnt = new String[] {""} ;
      BC01VZ25_A52AlbRPieEnt = new int[1] ;
      BC01VZ25_A50AlbRLoc = new String[] {""} ;
      BC01VZ25_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ25_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A4601AlbRTam = new String[] {""} ;
      BC01VZ25_A9749Emp_Item1 = new String[] {""} ;
      BC01VZ25_A55AlbRReo = new String[] {""} ;
      BC01VZ25_A54AlbRPieUti = new int[1] ;
      BC01VZ25_A53AlbRPieReb = new int[1] ;
      BC01VZ25_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ25_A1222AlbNumEti = new short[1] ;
      BC01VZ25_A1291AlbRDes = new String[] {""} ;
      BC01VZ25_A1301AlbRUlin = new byte[1] ;
      BC01VZ25_A3613AlbRefDsc = new String[] {""} ;
      BC01VZ25_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A4920AlbRGrm2 = new short[1] ;
      BC01VZ25_A4921AlbRAnc = new short[1] ;
      BC01VZ25_A4922AlbPml = new short[1] ;
      BC01VZ25_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A5745AlbRRep = new byte[1] ;
      BC01VZ25_A5806AlbREnt2 = new String[] {""} ;
      BC01VZ25_A6178AlbrUsu = new String[] {""} ;
      BC01VZ25_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ25_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A6181AlbrPieC = new int[1] ;
      BC01VZ25_A6182AlbrNF = new String[] {""} ;
      BC01VZ25_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ25_A6184AlbrCfop = new String[] {""} ;
      BC01VZ25_A3359AlbRDisCli = new String[] {""} ;
      BC01VZ25_A3360AlbRImp = new String[] {""} ;
      BC01VZ25_A6463AlbRLote = new String[] {""} ;
      BC01VZ25_A6464AlbRTelar = new String[] {""} ;
      BC01VZ25_A14525AlbRLot2 = new String[] {""} ;
      BC01VZ25_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A4602AlbRMdlCod = new String[] {""} ;
      BC01VZ25_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A6488AlbDocPrv = new String[] {""} ;
      BC01VZ25_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A8023AlbColor = new String[] {""} ;
      BC01VZ25_A8024AlbOpsT = new String[] {""} ;
      BC01VZ25_A8025AlbOpsC = new String[] {""} ;
      BC01VZ25_A8026AlbOC = new String[] {""} ;
      BC01VZ25_A8027AlbHdri = new String[] {""} ;
      BC01VZ25_A8028AlbNumB = new String[] {""} ;
      BC01VZ25_A8029AlbNumM = new String[] {""} ;
      BC01VZ25_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A8031AlbDndC = new short[1] ;
      BC01VZ25_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ25_A8033AlbDndCr = new short[1] ;
      BC01VZ25_A8034AlbGalga = new short[1] ;
      BC01VZ25_A8035AlbMaqTej = new String[] {""} ;
      BC01VZ25_A8036AlbDmt = new short[1] ;
      BC01VZ25_A9793AlbPdaC = new String[] {""} ;
      BC01VZ25_A9794AlbOStj = new String[] {""} ;
      BC01VZ25_A10358AlbTurno = new byte[1] ;
      BC01VZ25_A396EmprCod = new String[] {""} ;
      BC01VZ25_A252CliCod = new int[1] ;
      BC01VZ25_A6263AlbRTartC = new short[1] ;
      BC01VZ25_n6263AlbRTartC = new boolean[] {false} ;
      BC01VZ25_A840TrnCod = new short[1] ;
      BC01VZ25_n840TrnCod = new boolean[] {false} ;
      BC01VZ25_A970ProceCod = new short[1] ;
      BC01VZ25_n970ProceCod = new boolean[] {false} ;
      BC01VZ25_A1211TipEntCod = new short[1] ;
      BC01VZ25_n1211TipEntCod = new boolean[] {false} ;
      BC01VZ25_A4792AlmCod = new byte[1] ;
      BC01VZ25_n4792AlmCod = new boolean[] {false} ;
      AV144Texto_ii = "" ;
      GXv_int12 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      BC01VZ29_A407EmprNom = new String[] {""} ;
      BC01VZ29_n407EmprNom = new boolean[] {false} ;
      BC01VZ30_A279CliNom = new String[] {""} ;
      BC01VZ30_A8723CliEst = new String[] {""} ;
      BC01VZ31_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ31_n13982AlbRArtLu = new boolean[] {false} ;
      BC01VZ32_A841TrnNom = new String[] {""} ;
      BC01VZ32_n841TrnNom = new boolean[] {false} ;
      BC01VZ33_A1212TipEntNom = new String[] {""} ;
      BC01VZ33_n1212TipEntNom = new boolean[] {false} ;
      BC01VZ34_A971ProceNom = new String[] {""} ;
      BC01VZ34_n971ProceNom = new boolean[] {false} ;
      BC01VZ35_A6264AlbRTartD = new String[] {""} ;
      BC01VZ35_n6264AlbRTartD = new boolean[] {false} ;
      BC01VZ36_A4793AlmNom = new String[] {""} ;
      BC01VZ36_n4793AlmNom = new boolean[] {false} ;
      BC01VZ37_A396EmprCod = new String[] {""} ;
      BC01VZ37_A13026PedDGId = new int[1] ;
      BC01VZ37_A44AlbRecCod = new int[1] ;
      BC01VZ37_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ38_A396EmprCod = new String[] {""} ;
      BC01VZ38_A11669DevCruId = new int[1] ;
      BC01VZ38_A44AlbRecCod = new int[1] ;
      BC01VZ38_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ39_A396EmprCod = new String[] {""} ;
      BC01VZ39_A44AlbRecCod = new int[1] ;
      BC01VZ39_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ39_A9743Emp_CUb = new String[] {""} ;
      BC01VZ39_A5860Emp_Anp = new short[1] ;
      BC01VZ40_A396EmprCod = new String[] {""} ;
      BC01VZ40_A44AlbRecCod = new int[1] ;
      BC01VZ40_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ40_A7130MatC_Pz = new String[] {""} ;
      BC01VZ41_A396EmprCod = new String[] {""} ;
      BC01VZ41_A44AlbRecCod = new int[1] ;
      BC01VZ41_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ41_A7132MatC_Talla = new String[] {""} ;
      BC01VZ42_A396EmprCod = new String[] {""} ;
      BC01VZ42_A44AlbRecCod = new int[1] ;
      BC01VZ42_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ42_A7115MatC_Lin = new short[1] ;
      BC01VZ43_A396EmprCod = new String[] {""} ;
      BC01VZ43_A30AlbProCod = new long[1] ;
      BC01VZ43_A129BarCod = new int[1] ;
      BC01VZ43_A132BarCodReo = new byte[1] ;
      BC01VZ43_A130BarCodPar = new String[] {""} ;
      BC01VZ43_A6622AlbHdRLn = new short[1] ;
      BC01VZ44_A396EmprCod = new String[] {""} ;
      BC01VZ44_A6235DevEmpCod = new int[1] ;
      BC01VZ44_A6243DevNumLin = new byte[1] ;
      BC01VZ45_A396EmprCod = new String[] {""} ;
      BC01VZ45_A44AlbRecCod = new int[1] ;
      BC01VZ45_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ45_A4596AlbRDefCod = new short[1] ;
      BC01VZ46_A396EmprCod = new String[] {""} ;
      BC01VZ46_A44AlbRecCod = new int[1] ;
      BC01VZ46_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ46_A2159AlbRecPie = new String[] {""} ;
      BC01VZ47_A396EmprCod = new String[] {""} ;
      BC01VZ47_A44AlbRecCod = new int[1] ;
      BC01VZ47_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ47_A2165HisEmpLin = new short[1] ;
      BC01VZ48_A396EmprCod = new String[] {""} ;
      BC01VZ48_A361DisCod = new int[1] ;
      BC01VZ48_A44AlbRecCod = new int[1] ;
      BC01VZ48_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ49_A396EmprCod = new String[] {""} ;
      BC01VZ49_A323DevGenCod = new int[1] ;
      BC01VZ50_A396EmprCod = new String[] {""} ;
      BC01VZ50_A129BarCod = new int[1] ;
      BC01VZ50_A132BarCodReo = new byte[1] ;
      BC01VZ50_A130BarCodPar = new String[] {""} ;
      BC01VZ50_A200BarPieCod = new String[] {""} ;
      BC01VZ52_A65ArtCod = new String[] {""} ;
      BC01VZ52_A44AlbRecCod = new int[1] ;
      BC01VZ52_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ52_A56AlbRUni = new String[] {""} ;
      BC01VZ52_A47AlbREst = new byte[1] ;
      BC01VZ52_A317AlbStLot = new byte[1] ;
      BC01VZ52_A12879AlbOEKOTEX = new String[] {""} ;
      BC01VZ52_A407EmprNom = new String[] {""} ;
      BC01VZ52_n407EmprNom = new boolean[] {false} ;
      BC01VZ52_A279CliNom = new String[] {""} ;
      BC01VZ52_A45AlbRef = new String[] {""} ;
      BC01VZ52_A841TrnNom = new String[] {""} ;
      BC01VZ52_n841TrnNom = new boolean[] {false} ;
      BC01VZ52_A46AlbREnt = new String[] {""} ;
      BC01VZ52_A52AlbRPieEnt = new int[1] ;
      BC01VZ52_A50AlbRLoc = new String[] {""} ;
      BC01VZ52_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ52_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A4601AlbRTam = new String[] {""} ;
      BC01VZ52_A9749Emp_Item1 = new String[] {""} ;
      BC01VZ52_A55AlbRReo = new String[] {""} ;
      BC01VZ52_A54AlbRPieUti = new int[1] ;
      BC01VZ52_A53AlbRPieReb = new int[1] ;
      BC01VZ52_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ52_A1212TipEntNom = new String[] {""} ;
      BC01VZ52_n1212TipEntNom = new boolean[] {false} ;
      BC01VZ52_A1222AlbNumEti = new short[1] ;
      BC01VZ52_A1291AlbRDes = new String[] {""} ;
      BC01VZ52_A971ProceNom = new String[] {""} ;
      BC01VZ52_n971ProceNom = new boolean[] {false} ;
      BC01VZ52_A1301AlbRUlin = new byte[1] ;
      BC01VZ52_A3613AlbRefDsc = new String[] {""} ;
      BC01VZ52_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A4920AlbRGrm2 = new short[1] ;
      BC01VZ52_A4921AlbRAnc = new short[1] ;
      BC01VZ52_A4922AlbPml = new short[1] ;
      BC01VZ52_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A5745AlbRRep = new byte[1] ;
      BC01VZ52_A5806AlbREnt2 = new String[] {""} ;
      BC01VZ52_A6178AlbrUsu = new String[] {""} ;
      BC01VZ52_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ52_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A6181AlbrPieC = new int[1] ;
      BC01VZ52_A6182AlbrNF = new String[] {""} ;
      BC01VZ52_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VZ52_A6184AlbrCfop = new String[] {""} ;
      BC01VZ52_A3359AlbRDisCli = new String[] {""} ;
      BC01VZ52_A6264AlbRTartD = new String[] {""} ;
      BC01VZ52_n6264AlbRTartD = new boolean[] {false} ;
      BC01VZ52_A3360AlbRImp = new String[] {""} ;
      BC01VZ52_A6463AlbRLote = new String[] {""} ;
      BC01VZ52_A6464AlbRTelar = new String[] {""} ;
      BC01VZ52_A14525AlbRLot2 = new String[] {""} ;
      BC01VZ52_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A4602AlbRMdlCod = new String[] {""} ;
      BC01VZ52_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A6488AlbDocPrv = new String[] {""} ;
      BC01VZ52_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A4793AlmNom = new String[] {""} ;
      BC01VZ52_n4793AlmNom = new boolean[] {false} ;
      BC01VZ52_A8023AlbColor = new String[] {""} ;
      BC01VZ52_A8024AlbOpsT = new String[] {""} ;
      BC01VZ52_A8025AlbOpsC = new String[] {""} ;
      BC01VZ52_A8026AlbOC = new String[] {""} ;
      BC01VZ52_A8027AlbHdri = new String[] {""} ;
      BC01VZ52_A8028AlbNumB = new String[] {""} ;
      BC01VZ52_A8029AlbNumM = new String[] {""} ;
      BC01VZ52_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A8031AlbDndC = new short[1] ;
      BC01VZ52_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_A8033AlbDndCr = new short[1] ;
      BC01VZ52_A8034AlbGalga = new short[1] ;
      BC01VZ52_A8035AlbMaqTej = new String[] {""} ;
      BC01VZ52_A8036AlbDmt = new short[1] ;
      BC01VZ52_A9793AlbPdaC = new String[] {""} ;
      BC01VZ52_A9794AlbOStj = new String[] {""} ;
      BC01VZ52_A10358AlbTurno = new byte[1] ;
      BC01VZ52_A8723CliEst = new String[] {""} ;
      BC01VZ52_A396EmprCod = new String[] {""} ;
      BC01VZ52_A252CliCod = new int[1] ;
      BC01VZ52_A6263AlbRTartC = new short[1] ;
      BC01VZ52_n6263AlbRTartC = new boolean[] {false} ;
      BC01VZ52_A840TrnCod = new short[1] ;
      BC01VZ52_n840TrnCod = new boolean[] {false} ;
      BC01VZ52_A970ProceCod = new short[1] ;
      BC01VZ52_n970ProceCod = new boolean[] {false} ;
      BC01VZ52_A1211TipEntCod = new short[1] ;
      BC01VZ52_n1211TipEntCod = new boolean[] {false} ;
      BC01VZ52_A4792AlmCod = new byte[1] ;
      BC01VZ52_n4792AlmCod = new boolean[] {false} ;
      BC01VZ52_A13982AlbRArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VZ52_n13982AlbRArtLu = new boolean[] {false} ;
      Z1300AlbRObs = "" ;
      A1300AlbRObs = "" ;
      BC01VZ53_A44AlbRecCod = new int[1] ;
      BC01VZ53_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ53_A1299AlbRLin = new byte[1] ;
      BC01VZ53_A1300AlbRObs = new String[] {""} ;
      BC01VZ53_A396EmprCod = new String[] {""} ;
      BC01VZ54_A396EmprCod = new String[] {""} ;
      BC01VZ54_A44AlbRecCod = new int[1] ;
      BC01VZ54_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ54_A1299AlbRLin = new byte[1] ;
      BC01VZ55_A44AlbRecCod = new int[1] ;
      BC01VZ55_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ55_A1299AlbRLin = new byte[1] ;
      BC01VZ55_A1300AlbRObs = new String[] {""} ;
      BC01VZ55_A396EmprCod = new String[] {""} ;
      sMode191 = "" ;
      BC01VZ56_A44AlbRecCod = new int[1] ;
      BC01VZ56_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ56_A1299AlbRLin = new byte[1] ;
      BC01VZ56_A1300AlbRObs = new String[] {""} ;
      BC01VZ56_A396EmprCod = new String[] {""} ;
      GXv_char10 = new String[1] ;
      GXv_int8 = new int[1] ;
      BC01VZ60_A44AlbRecCod = new int[1] ;
      BC01VZ60_n44AlbRecCod = new boolean[] {false} ;
      BC01VZ60_A1299AlbRLin = new byte[1] ;
      BC01VZ60_A1300AlbRObs = new String[] {""} ;
      BC01VZ60_A396EmprCod = new String[] {""} ;
      N50AlbRLoc = "" ;
      N45AlbRef = "" ;
      N49AlbRFen = GXutil.nullDate() ;
      N56AlbRUni = "" ;
      N55AlbRReo = "" ;
      iV35Modo = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i6183AlbrFeNf = GXutil.nullDate() ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i6182AlbrNF = "" ;
      i6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      i6178AlbrUsu = "" ;
      i3360AlbRImp = "" ;
      i4602AlbRMdlCod = "" ;
      i6463AlbRLote = "" ;
      i6464AlbRTelar = "" ;
      i6465AlbRLu = DecimalUtil.ZERO ;
      i6470AlbRTara = DecimalUtil.ZERO ;
      i6471AlbRUniB = DecimalUtil.ZERO ;
      i6523AlbRUdas = DecimalUtil.ZERO ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01VZ61_A407EmprNom = new String[] {""} ;
      BC01VZ61_n407EmprNom = new boolean[] {false} ;
      BC01VZ62_A407EmprNom = new String[] {""} ;
      BC01VZ62_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.bc_albrec_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.bc_albrec_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.bc_albrec_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.bc_albrec_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.bc_albrec_bc__default(),
         new Object[] {
             new Object[] {
            BC01VZ2_A44AlbRecCod, BC01VZ2_A1299AlbRLin, BC01VZ2_A1300AlbRObs, BC01VZ2_A396EmprCod
            }
            , new Object[] {
            BC01VZ3_A44AlbRecCod, BC01VZ3_A1299AlbRLin, BC01VZ3_A1300AlbRObs, BC01VZ3_A396EmprCod
            }
            , new Object[] {
            BC01VZ4_A44AlbRecCod, BC01VZ4_A56AlbRUni, BC01VZ4_A47AlbREst, BC01VZ4_A317AlbStLot, BC01VZ4_A12879AlbOEKOTEX, BC01VZ4_A45AlbRef, BC01VZ4_A46AlbREnt, BC01VZ4_A52AlbRPieEnt, BC01VZ4_A50AlbRLoc, BC01VZ4_A49AlbRFen,
            BC01VZ4_A58AlbRUniEnt, BC01VZ4_A4601AlbRTam, BC01VZ4_A9749Emp_Item1, BC01VZ4_A55AlbRReo, BC01VZ4_A54AlbRPieUti, BC01VZ4_A53AlbRPieReb, BC01VZ4_A60AlbRUniUti, BC01VZ4_A59AlbRUniReb, BC01VZ4_A48AlbRFecUlt, BC01VZ4_A1222AlbNumEti,
            BC01VZ4_A1291AlbRDes, BC01VZ4_A1301AlbRUlin, BC01VZ4_A3613AlbRefDsc, BC01VZ4_A4290AlbPmPPza, BC01VZ4_A4920AlbRGrm2, BC01VZ4_A4921AlbRAnc, BC01VZ4_A4922AlbPml, BC01VZ4_A5743AlbRPre, BC01VZ4_A5744AlbRAju, BC01VZ4_A5745AlbRRep,
            BC01VZ4_A5806AlbREnt2, BC01VZ4_A6178AlbrUsu, BC01VZ4_A6179AlbrHor, BC01VZ4_A6180AlbrUniC, BC01VZ4_A6181AlbrPieC, BC01VZ4_A6182AlbrNF, BC01VZ4_A6183AlbrFeNf, BC01VZ4_A6184AlbrCfop, BC01VZ4_A3359AlbRDisCli, BC01VZ4_A3360AlbRImp,
            BC01VZ4_A6463AlbRLote, BC01VZ4_A6464AlbRTelar, BC01VZ4_A14525AlbRLot2, BC01VZ4_A6465AlbRLu, BC01VZ4_A4602AlbRMdlCod, BC01VZ4_A6470AlbRTara, BC01VZ4_A6471AlbRUniB, BC01VZ4_A6488AlbDocPrv, BC01VZ4_A6523AlbRUdas, BC01VZ4_A8023AlbColor,
            BC01VZ4_A8024AlbOpsT, BC01VZ4_A8025AlbOpsC, BC01VZ4_A8026AlbOC, BC01VZ4_A8027AlbHdri, BC01VZ4_A8028AlbNumB, BC01VZ4_A8029AlbNumM, BC01VZ4_A8030AlbAncC, BC01VZ4_A8031AlbDndC, BC01VZ4_A8032AlbAncCr, BC01VZ4_A8033AlbDndCr,
            BC01VZ4_A8034AlbGalga, BC01VZ4_A8035AlbMaqTej, BC01VZ4_A8036AlbDmt, BC01VZ4_A9793AlbPdaC, BC01VZ4_A9794AlbOStj, BC01VZ4_A10358AlbTurno, BC01VZ4_A396EmprCod, BC01VZ4_A252CliCod, BC01VZ4_A6263AlbRTartC, BC01VZ4_n6263AlbRTartC,
            BC01VZ4_A840TrnCod, BC01VZ4_n840TrnCod, BC01VZ4_A970ProceCod, BC01VZ4_n970ProceCod, BC01VZ4_A1211TipEntCod, BC01VZ4_n1211TipEntCod, BC01VZ4_A4792AlmCod, BC01VZ4_n4792AlmCod
            }
            , new Object[] {
            BC01VZ5_A44AlbRecCod, BC01VZ5_A56AlbRUni, BC01VZ5_A47AlbREst, BC01VZ5_A317AlbStLot, BC01VZ5_A12879AlbOEKOTEX, BC01VZ5_A45AlbRef, BC01VZ5_A46AlbREnt, BC01VZ5_A52AlbRPieEnt, BC01VZ5_A50AlbRLoc, BC01VZ5_A49AlbRFen,
            BC01VZ5_A58AlbRUniEnt, BC01VZ5_A4601AlbRTam, BC01VZ5_A9749Emp_Item1, BC01VZ5_A55AlbRReo, BC01VZ5_A54AlbRPieUti, BC01VZ5_A53AlbRPieReb, BC01VZ5_A60AlbRUniUti, BC01VZ5_A59AlbRUniReb, BC01VZ5_A48AlbRFecUlt, BC01VZ5_A1222AlbNumEti,
            BC01VZ5_A1291AlbRDes, BC01VZ5_A1301AlbRUlin, BC01VZ5_A3613AlbRefDsc, BC01VZ5_A4290AlbPmPPza, BC01VZ5_A4920AlbRGrm2, BC01VZ5_A4921AlbRAnc, BC01VZ5_A4922AlbPml, BC01VZ5_A5743AlbRPre, BC01VZ5_A5744AlbRAju, BC01VZ5_A5745AlbRRep,
            BC01VZ5_A5806AlbREnt2, BC01VZ5_A6178AlbrUsu, BC01VZ5_A6179AlbrHor, BC01VZ5_A6180AlbrUniC, BC01VZ5_A6181AlbrPieC, BC01VZ5_A6182AlbrNF, BC01VZ5_A6183AlbrFeNf, BC01VZ5_A6184AlbrCfop, BC01VZ5_A3359AlbRDisCli, BC01VZ5_A3360AlbRImp,
            BC01VZ5_A6463AlbRLote, BC01VZ5_A6464AlbRTelar, BC01VZ5_A14525AlbRLot2, BC01VZ5_A6465AlbRLu, BC01VZ5_A4602AlbRMdlCod, BC01VZ5_A6470AlbRTara, BC01VZ5_A6471AlbRUniB, BC01VZ5_A6488AlbDocPrv, BC01VZ5_A6523AlbRUdas, BC01VZ5_A8023AlbColor,
            BC01VZ5_A8024AlbOpsT, BC01VZ5_A8025AlbOpsC, BC01VZ5_A8026AlbOC, BC01VZ5_A8027AlbHdri, BC01VZ5_A8028AlbNumB, BC01VZ5_A8029AlbNumM, BC01VZ5_A8030AlbAncC, BC01VZ5_A8031AlbDndC, BC01VZ5_A8032AlbAncCr, BC01VZ5_A8033AlbDndCr,
            BC01VZ5_A8034AlbGalga, BC01VZ5_A8035AlbMaqTej, BC01VZ5_A8036AlbDmt, BC01VZ5_A9793AlbPdaC, BC01VZ5_A9794AlbOStj, BC01VZ5_A10358AlbTurno, BC01VZ5_A396EmprCod, BC01VZ5_A252CliCod, BC01VZ5_A6263AlbRTartC, BC01VZ5_n6263AlbRTartC,
            BC01VZ5_A840TrnCod, BC01VZ5_n840TrnCod, BC01VZ5_A970ProceCod, BC01VZ5_n970ProceCod, BC01VZ5_A1211TipEntCod, BC01VZ5_n1211TipEntCod, BC01VZ5_A4792AlmCod, BC01VZ5_n4792AlmCod
            }
            , new Object[] {
            BC01VZ6_A407EmprNom, BC01VZ6_n407EmprNom
            }
            , new Object[] {
            BC01VZ7_A279CliNom, BC01VZ7_A8723CliEst
            }
            , new Object[] {
            BC01VZ8_A6264AlbRTartD, BC01VZ8_n6264AlbRTartD
            }
            , new Object[] {
            BC01VZ9_A841TrnNom, BC01VZ9_n841TrnNom
            }
            , new Object[] {
            BC01VZ10_A971ProceNom, BC01VZ10_n971ProceNom
            }
            , new Object[] {
            BC01VZ11_A1212TipEntNom, BC01VZ11_n1212TipEntNom
            }
            , new Object[] {
            BC01VZ12_A4793AlmNom, BC01VZ12_n4793AlmNom
            }
            , new Object[] {
            BC01VZ13_A13982AlbRArtLu, BC01VZ13_n13982AlbRArtLu
            }
            , new Object[] {
            BC01VZ14_A65ArtCod, BC01VZ14_A44AlbRecCod, BC01VZ14_A56AlbRUni, BC01VZ14_A47AlbREst, BC01VZ14_A317AlbStLot, BC01VZ14_A12879AlbOEKOTEX, BC01VZ14_A407EmprNom, BC01VZ14_n407EmprNom, BC01VZ14_A279CliNom, BC01VZ14_A45AlbRef,
            BC01VZ14_A841TrnNom, BC01VZ14_n841TrnNom, BC01VZ14_A46AlbREnt, BC01VZ14_A52AlbRPieEnt, BC01VZ14_A50AlbRLoc, BC01VZ14_A49AlbRFen, BC01VZ14_A58AlbRUniEnt, BC01VZ14_A4601AlbRTam, BC01VZ14_A9749Emp_Item1, BC01VZ14_A55AlbRReo,
            BC01VZ14_A54AlbRPieUti, BC01VZ14_A53AlbRPieReb, BC01VZ14_A60AlbRUniUti, BC01VZ14_A59AlbRUniReb, BC01VZ14_A48AlbRFecUlt, BC01VZ14_A1212TipEntNom, BC01VZ14_n1212TipEntNom, BC01VZ14_A1222AlbNumEti, BC01VZ14_A1291AlbRDes, BC01VZ14_A971ProceNom,
            BC01VZ14_n971ProceNom, BC01VZ14_A1301AlbRUlin, BC01VZ14_A3613AlbRefDsc, BC01VZ14_A4290AlbPmPPza, BC01VZ14_A4920AlbRGrm2, BC01VZ14_A4921AlbRAnc, BC01VZ14_A4922AlbPml, BC01VZ14_A5743AlbRPre, BC01VZ14_A5744AlbRAju, BC01VZ14_A5745AlbRRep,
            BC01VZ14_A5806AlbREnt2, BC01VZ14_A6178AlbrUsu, BC01VZ14_A6179AlbrHor, BC01VZ14_A6180AlbrUniC, BC01VZ14_A6181AlbrPieC, BC01VZ14_A6182AlbrNF, BC01VZ14_A6183AlbrFeNf, BC01VZ14_A6184AlbrCfop, BC01VZ14_A3359AlbRDisCli, BC01VZ14_A6264AlbRTartD,
            BC01VZ14_n6264AlbRTartD, BC01VZ14_A3360AlbRImp, BC01VZ14_A6463AlbRLote, BC01VZ14_A6464AlbRTelar, BC01VZ14_A14525AlbRLot2, BC01VZ14_A6465AlbRLu, BC01VZ14_A4602AlbRMdlCod, BC01VZ14_A6470AlbRTara, BC01VZ14_A6471AlbRUniB, BC01VZ14_A6488AlbDocPrv,
            BC01VZ14_A6523AlbRUdas, BC01VZ14_A4793AlmNom, BC01VZ14_n4793AlmNom, BC01VZ14_A8023AlbColor, BC01VZ14_A8024AlbOpsT, BC01VZ14_A8025AlbOpsC, BC01VZ14_A8026AlbOC, BC01VZ14_A8027AlbHdri, BC01VZ14_A8028AlbNumB, BC01VZ14_A8029AlbNumM,
            BC01VZ14_A8030AlbAncC, BC01VZ14_A8031AlbDndC, BC01VZ14_A8032AlbAncCr, BC01VZ14_A8033AlbDndCr, BC01VZ14_A8034AlbGalga, BC01VZ14_A8035AlbMaqTej, BC01VZ14_A8036AlbDmt, BC01VZ14_A9793AlbPdaC, BC01VZ14_A9794AlbOStj, BC01VZ14_A10358AlbTurno,
            BC01VZ14_A8723CliEst, BC01VZ14_A396EmprCod, BC01VZ14_A252CliCod, BC01VZ14_A6263AlbRTartC, BC01VZ14_n6263AlbRTartC, BC01VZ14_A840TrnCod, BC01VZ14_n840TrnCod, BC01VZ14_A970ProceCod, BC01VZ14_n970ProceCod, BC01VZ14_A1211TipEntCod,
            BC01VZ14_n1211TipEntCod, BC01VZ14_A4792AlmCod, BC01VZ14_n4792AlmCod, BC01VZ14_A13982AlbRArtLu, BC01VZ14_n13982AlbRArtLu
            }
            , new Object[] {
            BC01VZ15_A407EmprNom, BC01VZ15_n407EmprNom
            }
            , new Object[] {
            BC01VZ16_A279CliNom, BC01VZ16_A8723CliEst
            }
            , new Object[] {
            BC01VZ17_A6264AlbRTartD, BC01VZ17_n6264AlbRTartD
            }
            , new Object[] {
            BC01VZ18_A841TrnNom, BC01VZ18_n841TrnNom
            }
            , new Object[] {
            BC01VZ19_A971ProceNom, BC01VZ19_n971ProceNom
            }
            , new Object[] {
            BC01VZ20_A1212TipEntNom, BC01VZ20_n1212TipEntNom
            }
            , new Object[] {
            BC01VZ21_A4793AlmNom, BC01VZ21_n4793AlmNom
            }
            , new Object[] {
            BC01VZ22_A13982AlbRArtLu, BC01VZ22_n13982AlbRArtLu
            }
            , new Object[] {
            BC01VZ23_A396EmprCod, BC01VZ23_A44AlbRecCod
            }
            , new Object[] {
            BC01VZ24_A44AlbRecCod, BC01VZ24_A56AlbRUni, BC01VZ24_A47AlbREst, BC01VZ24_A317AlbStLot, BC01VZ24_A12879AlbOEKOTEX, BC01VZ24_A45AlbRef, BC01VZ24_A46AlbREnt, BC01VZ24_A52AlbRPieEnt, BC01VZ24_A50AlbRLoc, BC01VZ24_A49AlbRFen,
            BC01VZ24_A58AlbRUniEnt, BC01VZ24_A4601AlbRTam, BC01VZ24_A9749Emp_Item1, BC01VZ24_A55AlbRReo, BC01VZ24_A54AlbRPieUti, BC01VZ24_A53AlbRPieReb, BC01VZ24_A60AlbRUniUti, BC01VZ24_A59AlbRUniReb, BC01VZ24_A48AlbRFecUlt, BC01VZ24_A1222AlbNumEti,
            BC01VZ24_A1291AlbRDes, BC01VZ24_A1301AlbRUlin, BC01VZ24_A3613AlbRefDsc, BC01VZ24_A4290AlbPmPPza, BC01VZ24_A4920AlbRGrm2, BC01VZ24_A4921AlbRAnc, BC01VZ24_A4922AlbPml, BC01VZ24_A5743AlbRPre, BC01VZ24_A5744AlbRAju, BC01VZ24_A5745AlbRRep,
            BC01VZ24_A5806AlbREnt2, BC01VZ24_A6178AlbrUsu, BC01VZ24_A6179AlbrHor, BC01VZ24_A6180AlbrUniC, BC01VZ24_A6181AlbrPieC, BC01VZ24_A6182AlbrNF, BC01VZ24_A6183AlbrFeNf, BC01VZ24_A6184AlbrCfop, BC01VZ24_A3359AlbRDisCli, BC01VZ24_A3360AlbRImp,
            BC01VZ24_A6463AlbRLote, BC01VZ24_A6464AlbRTelar, BC01VZ24_A14525AlbRLot2, BC01VZ24_A6465AlbRLu, BC01VZ24_A4602AlbRMdlCod, BC01VZ24_A6470AlbRTara, BC01VZ24_A6471AlbRUniB, BC01VZ24_A6488AlbDocPrv, BC01VZ24_A6523AlbRUdas, BC01VZ24_A8023AlbColor,
            BC01VZ24_A8024AlbOpsT, BC01VZ24_A8025AlbOpsC, BC01VZ24_A8026AlbOC, BC01VZ24_A8027AlbHdri, BC01VZ24_A8028AlbNumB, BC01VZ24_A8029AlbNumM, BC01VZ24_A8030AlbAncC, BC01VZ24_A8031AlbDndC, BC01VZ24_A8032AlbAncCr, BC01VZ24_A8033AlbDndCr,
            BC01VZ24_A8034AlbGalga, BC01VZ24_A8035AlbMaqTej, BC01VZ24_A8036AlbDmt, BC01VZ24_A9793AlbPdaC, BC01VZ24_A9794AlbOStj, BC01VZ24_A10358AlbTurno, BC01VZ24_A396EmprCod, BC01VZ24_A252CliCod, BC01VZ24_A6263AlbRTartC, BC01VZ24_n6263AlbRTartC,
            BC01VZ24_A840TrnCod, BC01VZ24_n840TrnCod, BC01VZ24_A970ProceCod, BC01VZ24_n970ProceCod, BC01VZ24_A1211TipEntCod, BC01VZ24_n1211TipEntCod, BC01VZ24_A4792AlmCod, BC01VZ24_n4792AlmCod
            }
            , new Object[] {
            BC01VZ25_A44AlbRecCod, BC01VZ25_A56AlbRUni, BC01VZ25_A47AlbREst, BC01VZ25_A317AlbStLot, BC01VZ25_A12879AlbOEKOTEX, BC01VZ25_A45AlbRef, BC01VZ25_A46AlbREnt, BC01VZ25_A52AlbRPieEnt, BC01VZ25_A50AlbRLoc, BC01VZ25_A49AlbRFen,
            BC01VZ25_A58AlbRUniEnt, BC01VZ25_A4601AlbRTam, BC01VZ25_A9749Emp_Item1, BC01VZ25_A55AlbRReo, BC01VZ25_A54AlbRPieUti, BC01VZ25_A53AlbRPieReb, BC01VZ25_A60AlbRUniUti, BC01VZ25_A59AlbRUniReb, BC01VZ25_A48AlbRFecUlt, BC01VZ25_A1222AlbNumEti,
            BC01VZ25_A1291AlbRDes, BC01VZ25_A1301AlbRUlin, BC01VZ25_A3613AlbRefDsc, BC01VZ25_A4290AlbPmPPza, BC01VZ25_A4920AlbRGrm2, BC01VZ25_A4921AlbRAnc, BC01VZ25_A4922AlbPml, BC01VZ25_A5743AlbRPre, BC01VZ25_A5744AlbRAju, BC01VZ25_A5745AlbRRep,
            BC01VZ25_A5806AlbREnt2, BC01VZ25_A6178AlbrUsu, BC01VZ25_A6179AlbrHor, BC01VZ25_A6180AlbrUniC, BC01VZ25_A6181AlbrPieC, BC01VZ25_A6182AlbrNF, BC01VZ25_A6183AlbrFeNf, BC01VZ25_A6184AlbrCfop, BC01VZ25_A3359AlbRDisCli, BC01VZ25_A3360AlbRImp,
            BC01VZ25_A6463AlbRLote, BC01VZ25_A6464AlbRTelar, BC01VZ25_A14525AlbRLot2, BC01VZ25_A6465AlbRLu, BC01VZ25_A4602AlbRMdlCod, BC01VZ25_A6470AlbRTara, BC01VZ25_A6471AlbRUniB, BC01VZ25_A6488AlbDocPrv, BC01VZ25_A6523AlbRUdas, BC01VZ25_A8023AlbColor,
            BC01VZ25_A8024AlbOpsT, BC01VZ25_A8025AlbOpsC, BC01VZ25_A8026AlbOC, BC01VZ25_A8027AlbHdri, BC01VZ25_A8028AlbNumB, BC01VZ25_A8029AlbNumM, BC01VZ25_A8030AlbAncC, BC01VZ25_A8031AlbDndC, BC01VZ25_A8032AlbAncCr, BC01VZ25_A8033AlbDndCr,
            BC01VZ25_A8034AlbGalga, BC01VZ25_A8035AlbMaqTej, BC01VZ25_A8036AlbDmt, BC01VZ25_A9793AlbPdaC, BC01VZ25_A9794AlbOStj, BC01VZ25_A10358AlbTurno, BC01VZ25_A396EmprCod, BC01VZ25_A252CliCod, BC01VZ25_A6263AlbRTartC, BC01VZ25_n6263AlbRTartC,
            BC01VZ25_A840TrnCod, BC01VZ25_n840TrnCod, BC01VZ25_A970ProceCod, BC01VZ25_n970ProceCod, BC01VZ25_A1211TipEntCod, BC01VZ25_n1211TipEntCod, BC01VZ25_A4792AlmCod, BC01VZ25_n4792AlmCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VZ29_A407EmprNom, BC01VZ29_n407EmprNom
            }
            , new Object[] {
            BC01VZ30_A279CliNom, BC01VZ30_A8723CliEst
            }
            , new Object[] {
            BC01VZ31_A13982AlbRArtLu, BC01VZ31_n13982AlbRArtLu
            }
            , new Object[] {
            BC01VZ32_A841TrnNom, BC01VZ32_n841TrnNom
            }
            , new Object[] {
            BC01VZ33_A1212TipEntNom, BC01VZ33_n1212TipEntNom
            }
            , new Object[] {
            BC01VZ34_A971ProceNom, BC01VZ34_n971ProceNom
            }
            , new Object[] {
            BC01VZ35_A6264AlbRTartD, BC01VZ35_n6264AlbRTartD
            }
            , new Object[] {
            BC01VZ36_A4793AlmNom, BC01VZ36_n4793AlmNom
            }
            , new Object[] {
            BC01VZ37_A396EmprCod, BC01VZ37_A13026PedDGId, BC01VZ37_A44AlbRecCod
            }
            , new Object[] {
            BC01VZ38_A396EmprCod, BC01VZ38_A11669DevCruId, BC01VZ38_A44AlbRecCod
            }
            , new Object[] {
            BC01VZ39_A396EmprCod, BC01VZ39_A44AlbRecCod, BC01VZ39_A9743Emp_CUb, BC01VZ39_A5860Emp_Anp
            }
            , new Object[] {
            BC01VZ40_A396EmprCod, BC01VZ40_A44AlbRecCod, BC01VZ40_A7130MatC_Pz
            }
            , new Object[] {
            BC01VZ41_A396EmprCod, BC01VZ41_A44AlbRecCod, BC01VZ41_A7132MatC_Talla
            }
            , new Object[] {
            BC01VZ42_A396EmprCod, BC01VZ42_A44AlbRecCod, BC01VZ42_A7115MatC_Lin
            }
            , new Object[] {
            BC01VZ43_A396EmprCod, BC01VZ43_A30AlbProCod, BC01VZ43_A129BarCod, BC01VZ43_A132BarCodReo, BC01VZ43_A130BarCodPar, BC01VZ43_A6622AlbHdRLn
            }
            , new Object[] {
            BC01VZ44_A396EmprCod, BC01VZ44_A6235DevEmpCod, BC01VZ44_A6243DevNumLin
            }
            , new Object[] {
            BC01VZ45_A396EmprCod, BC01VZ45_A44AlbRecCod, BC01VZ45_A4596AlbRDefCod
            }
            , new Object[] {
            BC01VZ46_A396EmprCod, BC01VZ46_A44AlbRecCod, BC01VZ46_A2159AlbRecPie
            }
            , new Object[] {
            BC01VZ47_A396EmprCod, BC01VZ47_A44AlbRecCod, BC01VZ47_A2165HisEmpLin
            }
            , new Object[] {
            BC01VZ48_A396EmprCod, BC01VZ48_A361DisCod, BC01VZ48_A44AlbRecCod
            }
            , new Object[] {
            BC01VZ49_A396EmprCod, BC01VZ49_A323DevGenCod
            }
            , new Object[] {
            BC01VZ50_A396EmprCod, BC01VZ50_A129BarCod, BC01VZ50_A132BarCodReo, BC01VZ50_A130BarCodPar, BC01VZ50_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VZ52_A65ArtCod, BC01VZ52_A44AlbRecCod, BC01VZ52_A56AlbRUni, BC01VZ52_A47AlbREst, BC01VZ52_A317AlbStLot, BC01VZ52_A12879AlbOEKOTEX, BC01VZ52_A407EmprNom, BC01VZ52_n407EmprNom, BC01VZ52_A279CliNom, BC01VZ52_A45AlbRef,
            BC01VZ52_A841TrnNom, BC01VZ52_n841TrnNom, BC01VZ52_A46AlbREnt, BC01VZ52_A52AlbRPieEnt, BC01VZ52_A50AlbRLoc, BC01VZ52_A49AlbRFen, BC01VZ52_A58AlbRUniEnt, BC01VZ52_A4601AlbRTam, BC01VZ52_A9749Emp_Item1, BC01VZ52_A55AlbRReo,
            BC01VZ52_A54AlbRPieUti, BC01VZ52_A53AlbRPieReb, BC01VZ52_A60AlbRUniUti, BC01VZ52_A59AlbRUniReb, BC01VZ52_A48AlbRFecUlt, BC01VZ52_A1212TipEntNom, BC01VZ52_n1212TipEntNom, BC01VZ52_A1222AlbNumEti, BC01VZ52_A1291AlbRDes, BC01VZ52_A971ProceNom,
            BC01VZ52_n971ProceNom, BC01VZ52_A1301AlbRUlin, BC01VZ52_A3613AlbRefDsc, BC01VZ52_A4290AlbPmPPza, BC01VZ52_A4920AlbRGrm2, BC01VZ52_A4921AlbRAnc, BC01VZ52_A4922AlbPml, BC01VZ52_A5743AlbRPre, BC01VZ52_A5744AlbRAju, BC01VZ52_A5745AlbRRep,
            BC01VZ52_A5806AlbREnt2, BC01VZ52_A6178AlbrUsu, BC01VZ52_A6179AlbrHor, BC01VZ52_A6180AlbrUniC, BC01VZ52_A6181AlbrPieC, BC01VZ52_A6182AlbrNF, BC01VZ52_A6183AlbrFeNf, BC01VZ52_A6184AlbrCfop, BC01VZ52_A3359AlbRDisCli, BC01VZ52_A6264AlbRTartD,
            BC01VZ52_n6264AlbRTartD, BC01VZ52_A3360AlbRImp, BC01VZ52_A6463AlbRLote, BC01VZ52_A6464AlbRTelar, BC01VZ52_A14525AlbRLot2, BC01VZ52_A6465AlbRLu, BC01VZ52_A4602AlbRMdlCod, BC01VZ52_A6470AlbRTara, BC01VZ52_A6471AlbRUniB, BC01VZ52_A6488AlbDocPrv,
            BC01VZ52_A6523AlbRUdas, BC01VZ52_A4793AlmNom, BC01VZ52_n4793AlmNom, BC01VZ52_A8023AlbColor, BC01VZ52_A8024AlbOpsT, BC01VZ52_A8025AlbOpsC, BC01VZ52_A8026AlbOC, BC01VZ52_A8027AlbHdri, BC01VZ52_A8028AlbNumB, BC01VZ52_A8029AlbNumM,
            BC01VZ52_A8030AlbAncC, BC01VZ52_A8031AlbDndC, BC01VZ52_A8032AlbAncCr, BC01VZ52_A8033AlbDndCr, BC01VZ52_A8034AlbGalga, BC01VZ52_A8035AlbMaqTej, BC01VZ52_A8036AlbDmt, BC01VZ52_A9793AlbPdaC, BC01VZ52_A9794AlbOStj, BC01VZ52_A10358AlbTurno,
            BC01VZ52_A8723CliEst, BC01VZ52_A396EmprCod, BC01VZ52_A252CliCod, BC01VZ52_A6263AlbRTartC, BC01VZ52_n6263AlbRTartC, BC01VZ52_A840TrnCod, BC01VZ52_n840TrnCod, BC01VZ52_A970ProceCod, BC01VZ52_n970ProceCod, BC01VZ52_A1211TipEntCod,
            BC01VZ52_n1211TipEntCod, BC01VZ52_A4792AlmCod, BC01VZ52_n4792AlmCod, BC01VZ52_A13982AlbRArtLu, BC01VZ52_n13982AlbRArtLu
            }
            , new Object[] {
            BC01VZ53_A44AlbRecCod, BC01VZ53_A1299AlbRLin, BC01VZ53_A1300AlbRObs, BC01VZ53_A396EmprCod
            }
            , new Object[] {
            BC01VZ54_A396EmprCod, BC01VZ54_A44AlbRecCod, BC01VZ54_A1299AlbRLin
            }
            , new Object[] {
            BC01VZ55_A44AlbRecCod, BC01VZ55_A1299AlbRLin, BC01VZ55_A1300AlbRObs, BC01VZ55_A396EmprCod
            }
            , new Object[] {
            BC01VZ56_A44AlbRecCod, BC01VZ56_A1299AlbRLin, BC01VZ56_A1300AlbRObs, BC01VZ56_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VZ60_A44AlbRecCod, BC01VZ60_A1299AlbRLin, BC01VZ60_A1300AlbRObs, BC01VZ60_A396EmprCod
            }
            , new Object[] {
            BC01VZ61_A407EmprNom, BC01VZ61_n407EmprNom
            }
            , new Object[] {
            BC01VZ62_A407EmprNom, BC01VZ62_n407EmprNom
            }
         }
      );
      AV189Pgmname = "BC_ALBREC_BC" ;
      Z6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      i6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      Z6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      i6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      Z6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      i6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      Z6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      O6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      i6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      Z6464AlbRTelar = " " ;
      A6464AlbRTelar = " " ;
      O6464AlbRTelar = " " ;
      i6464AlbRTelar = " " ;
      Z6463AlbRLote = " " ;
      A6463AlbRLote = " " ;
      O6463AlbRLote = " " ;
      i6463AlbRLote = " " ;
      Z4602AlbRMdlCod = " " ;
      A4602AlbRMdlCod = " " ;
      O4602AlbRMdlCod = " " ;
      i4602AlbRMdlCod = " " ;
      Z3360AlbRImp = httpContext.getMessage( "N", "") ;
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      i3360AlbRImp = httpContext.getMessage( "N", "") ;
      Z6178AlbrUsu = "" ;
      A6178AlbrUsu = "" ;
      i6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      i6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      Z6182AlbrNF = httpContext.getMessage( "N", "") ;
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      i6182AlbrNF = httpContext.getMessage( "N", "") ;
      Z6181AlbrPieC = 0 ;
      A6181AlbrPieC = 0 ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      O55AlbRReo = httpContext.getMessage( "NO", "") ;
      N55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z6183AlbrFeNf = GXutil.today( ) ;
      A6183AlbrFeNf = GXutil.today( ) ;
      i6183AlbrFeNf = GXutil.today( ) ;
      Z49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      N49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e111VZ2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte s1301AlbRUlin ;
   private byte O1301AlbRUlin ;
   private byte A1301AlbRUlin ;
   private byte AV164Enc20 ;
   private byte AV103Moda21 ;
   private byte AV104Cli350 ;
   private byte AV64EncCli_20 ;
   private byte AV137Enc20c ;
   private byte AV42FlagKgs ;
   private byte AV43FlagMts ;
   private byte AV165okotex ;
   private byte AV150CtrlArt ;
   private byte GXt_int5 ;
   private byte Z47AlbREst ;
   private byte A47AlbREst ;
   private byte Z317AlbStLot ;
   private byte A317AlbStLot ;
   private byte Z1301AlbRUlin ;
   private byte Z5745AlbRRep ;
   private byte A5745AlbRRep ;
   private byte Z10358AlbTurno ;
   private byte A10358AlbTurno ;
   private byte Z4792AlmCod ;
   private byte A4792AlmCod ;
   private byte Gx_BScreen ;
   private byte AV140AlbStLot ;
   private byte AV41FlagArt ;
   private byte AV54Flag_artc ;
   private byte AV46FlagSam ;
   private byte AV68Kohler ;
   private byte AV94Erfoc ;
   private byte GXv_int6[] ;
   private byte Gxremove191 ;
   private byte AV44FlagFerro ;
   private byte Z1299AlbRLin ;
   private byte A1299AlbRLin ;
   private byte i1301AlbRUlin ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_191 ;
   private short RcdFound191 ;
   private short Z1222AlbNumEti ;
   private short A1222AlbNumEti ;
   private short Z4920AlbRGrm2 ;
   private short A4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short A4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short A4922AlbPml ;
   private short Z8031AlbDndC ;
   private short A8031AlbDndC ;
   private short Z8033AlbDndCr ;
   private short A8033AlbDndCr ;
   private short Z8034AlbGalga ;
   private short A8034AlbGalga ;
   private short Z8036AlbDmt ;
   private short A8036AlbDmt ;
   private short Z6263AlbRTartC ;
   private short A6263AlbRTartC ;
   private short Z840TrnCod ;
   private short A840TrnCod ;
   private short Z970ProceCod ;
   private short A970ProceCod ;
   private short Z1211TipEntCod ;
   private short A1211TipEntCod ;
   private short RcdFound7 ;
   private short AV86TipEntCod ;
   private short AV78Procecod ;
   private short nIsDirty_7 ;
   private short GXv_int12[] ;
   private short GXv_int9[] ;
   private short nRcdExists_191 ;
   private short nIsDirty_191 ;
   private short N1211TipEntCod ;
   private int trnEnded ;
   private int Z44AlbRecCod ;
   private int A44AlbRecCod ;
   private int nGXsfl_191_idx=1 ;
   private int AV105ContVal ;
   private int GXt_int7 ;
   private int GX_JID ;
   private int Z52AlbRPieEnt ;
   private int A52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int A53AlbRPieReb ;
   private int Z6181AlbrPieC ;
   private int A6181AlbrPieC ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int Z51AlbRPieDis ;
   private int A51AlbRPieDis ;
   private int Z4291AlbPzaEst ;
   private int A4291AlbPzaEst ;
   private int AV74AlbReccod ;
   private int AV88Doc_6 ;
   private int AV77CliCod ;
   private int A279CliNom_Visible ;
   private int AV80Albrpieent ;
   private int AV132PieEntold ;
   private int O52AlbRPieEnt ;
   private int AV147oldpiee ;
   private int AV148oldpieu ;
   private int O54AlbRPieUti ;
   private int GXv_int8[] ;
   private int N252CliCod ;
   private java.math.BigDecimal AV190Normas ;
   private java.math.BigDecimal AV191Sicrudo ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal Z4290AlbPmPPza ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal Z5743AlbRPre ;
   private java.math.BigDecimal A5743AlbRPre ;
   private java.math.BigDecimal Z5744AlbRAju ;
   private java.math.BigDecimal A5744AlbRAju ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal Z6465AlbRLu ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal Z6470AlbRTara ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal Z6471AlbRUniB ;
   private java.math.BigDecimal A6471AlbRUniB ;
   private java.math.BigDecimal Z6523AlbRUdas ;
   private java.math.BigDecimal A6523AlbRUdas ;
   private java.math.BigDecimal Z8030AlbAncC ;
   private java.math.BigDecimal A8030AlbAncC ;
   private java.math.BigDecimal Z8032AlbAncCr ;
   private java.math.BigDecimal A8032AlbAncCr ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal Z13982AlbRArtLu ;
   private java.math.BigDecimal A13982AlbRArtLu ;
   private java.math.BigDecimal AV158AlbRLu ;
   private java.math.BigDecimal O6465AlbRLu ;
   private java.math.BigDecimal AV60ALbRunient ;
   private java.math.BigDecimal AV133UniENtold ;
   private java.math.BigDecimal O58AlbRUniEnt ;
   private java.math.BigDecimal AV145Oldunie ;
   private java.math.BigDecimal AV146olduniu ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal AV81Albrpre ;
   private java.math.BigDecimal AV85AlbRunic ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal i6465AlbRLu ;
   private java.math.BigDecimal i6470AlbRTara ;
   private java.math.BigDecimal i6471AlbRUniB ;
   private java.math.BigDecimal i6523AlbRUdas ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String sMode7 ;
   private String AV29Station ;
   private String GXt_char1 ;
   private String AV175EmprCod ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String Z56AlbRUni ;
   private String A56AlbRUni ;
   private String Z12879AlbOEKOTEX ;
   private String A12879AlbOEKOTEX ;
   private String Z45AlbRef ;
   private String A45AlbRef ;
   private String Z46AlbREnt ;
   private String A46AlbREnt ;
   private String Z50AlbRLoc ;
   private String A50AlbRLoc ;
   private String Z4601AlbRTam ;
   private String A4601AlbRTam ;
   private String Z9749Emp_Item1 ;
   private String A9749Emp_Item1 ;
   private String Z55AlbRReo ;
   private String A55AlbRReo ;
   private String Z1291AlbRDes ;
   private String A1291AlbRDes ;
   private String Z3613AlbRefDsc ;
   private String A3613AlbRefDsc ;
   private String Z5806AlbREnt2 ;
   private String A5806AlbREnt2 ;
   private String Z6178AlbrUsu ;
   private String A6178AlbrUsu ;
   private String Z6182AlbrNF ;
   private String A6182AlbrNF ;
   private String Z6184AlbrCfop ;
   private String A6184AlbrCfop ;
   private String Z3359AlbRDisCli ;
   private String A3359AlbRDisCli ;
   private String Z3360AlbRImp ;
   private String A3360AlbRImp ;
   private String Z6463AlbRLote ;
   private String A6463AlbRLote ;
   private String Z6464AlbRTelar ;
   private String A6464AlbRTelar ;
   private String Z4602AlbRMdlCod ;
   private String A4602AlbRMdlCod ;
   private String Z6488AlbDocPrv ;
   private String A6488AlbDocPrv ;
   private String Z8023AlbColor ;
   private String A8023AlbColor ;
   private String Z8024AlbOpsT ;
   private String A8024AlbOpsT ;
   private String Z8025AlbOpsC ;
   private String A8025AlbOpsC ;
   private String Z8026AlbOC ;
   private String A8026AlbOC ;
   private String Z8027AlbHdri ;
   private String A8027AlbHdri ;
   private String Z8028AlbNumB ;
   private String A8028AlbNumB ;
   private String Z8029AlbNumM ;
   private String A8029AlbNumM ;
   private String Z8035AlbMaqTej ;
   private String A8035AlbMaqTej ;
   private String Z9793AlbPdaC ;
   private String A9793AlbPdaC ;
   private String Z9794AlbOStj ;
   private String A9794AlbOStj ;
   private String Z14210AlbREnt_3 ;
   private String A14210AlbREnt_3 ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z279CliNom ;
   private String A279CliNom ;
   private String Z8723CliEst ;
   private String A8723CliEst ;
   private String Z6264AlbRTartD ;
   private String A6264AlbRTartD ;
   private String Z841TrnNom ;
   private String A841TrnNom ;
   private String Z971ProceNom ;
   private String A971ProceNom ;
   private String Z1212TipEntNom ;
   private String A1212TipEntNom ;
   private String Z4793AlmNom ;
   private String A4793AlmNom ;
   private String AV189Pgmname ;
   private String AV35Modo ;
   private String AV83albrreo ;
   private String AV155OldAlbRreo ;
   private String O55AlbRReo ;
   private String AV84albrnf ;
   private String AV156AlbRMdlCod ;
   private String O4602AlbRMdlCod ;
   private String AV157ALbrlote ;
   private String O6463AlbRLote ;
   private String AV159AlbRTelar ;
   private String O6464AlbRTelar ;
   private String AV75Documento ;
   private String AV79AlbRef ;
   private String AV82albrcfop ;
   private String AV9AlbCum ;
   private String AV65Compos ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z1300AlbRObs ;
   private String A1300AlbRObs ;
   private String sMode191 ;
   private String GXv_char10[] ;
   private String N50AlbRLoc ;
   private String N45AlbRef ;
   private String N56AlbRUni ;
   private String N55AlbRReo ;
   private String iV35Modo ;
   private String i55AlbRReo ;
   private String i6182AlbrNF ;
   private String i6178AlbrUsu ;
   private String i3360AlbRImp ;
   private String i4602AlbRMdlCod ;
   private String i6463AlbRLote ;
   private String i6464AlbRTelar ;
   private java.util.Date Z6179AlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date i6179AlbrHor ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Z6183AlbrFeNf ;
   private java.util.Date A6183AlbrFeNf ;
   private java.util.Date AV76Albrfenf ;
   private java.util.Date AV87albrfen ;
   private java.util.Date N49AlbRFen ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i6183AlbrFeNf ;
   private java.util.Date i48AlbRFecUlt ;
   private boolean returnInSub ;
   private boolean n44AlbRecCod ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n6264AlbRTartD ;
   private boolean n4793AlmNom ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n4792AlmCod ;
   private boolean n13982AlbRArtLu ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String AV144Texto_ii ;
   private String Z14525AlbRLot2 ;
   private String A14525AlbRLot2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.SdtBC_ALBREC bcBC_ALBREC ;
   private IDataStoreProvider pr_default ;
   private String[] BC01VZ14_A65ArtCod ;
   private int[] BC01VZ14_A44AlbRecCod ;
   private boolean[] BC01VZ14_n44AlbRecCod ;
   private String[] BC01VZ14_A56AlbRUni ;
   private byte[] BC01VZ14_A47AlbREst ;
   private byte[] BC01VZ14_A317AlbStLot ;
   private String[] BC01VZ14_A12879AlbOEKOTEX ;
   private String[] BC01VZ14_A407EmprNom ;
   private boolean[] BC01VZ14_n407EmprNom ;
   private String[] BC01VZ14_A279CliNom ;
   private String[] BC01VZ14_A45AlbRef ;
   private String[] BC01VZ14_A841TrnNom ;
   private boolean[] BC01VZ14_n841TrnNom ;
   private String[] BC01VZ14_A46AlbREnt ;
   private int[] BC01VZ14_A52AlbRPieEnt ;
   private String[] BC01VZ14_A50AlbRLoc ;
   private java.util.Date[] BC01VZ14_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ14_A58AlbRUniEnt ;
   private String[] BC01VZ14_A4601AlbRTam ;
   private String[] BC01VZ14_A9749Emp_Item1 ;
   private String[] BC01VZ14_A55AlbRReo ;
   private int[] BC01VZ14_A54AlbRPieUti ;
   private int[] BC01VZ14_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ14_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ14_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ14_A48AlbRFecUlt ;
   private String[] BC01VZ14_A1212TipEntNom ;
   private boolean[] BC01VZ14_n1212TipEntNom ;
   private short[] BC01VZ14_A1222AlbNumEti ;
   private String[] BC01VZ14_A1291AlbRDes ;
   private String[] BC01VZ14_A971ProceNom ;
   private boolean[] BC01VZ14_n971ProceNom ;
   private byte[] BC01VZ14_A1301AlbRUlin ;
   private String[] BC01VZ14_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ14_A4290AlbPmPPza ;
   private short[] BC01VZ14_A4920AlbRGrm2 ;
   private short[] BC01VZ14_A4921AlbRAnc ;
   private short[] BC01VZ14_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ14_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ14_A5744AlbRAju ;
   private byte[] BC01VZ14_A5745AlbRRep ;
   private String[] BC01VZ14_A5806AlbREnt2 ;
   private String[] BC01VZ14_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ14_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ14_A6180AlbrUniC ;
   private int[] BC01VZ14_A6181AlbrPieC ;
   private String[] BC01VZ14_A6182AlbrNF ;
   private java.util.Date[] BC01VZ14_A6183AlbrFeNf ;
   private String[] BC01VZ14_A6184AlbrCfop ;
   private String[] BC01VZ14_A3359AlbRDisCli ;
   private String[] BC01VZ14_A6264AlbRTartD ;
   private boolean[] BC01VZ14_n6264AlbRTartD ;
   private String[] BC01VZ14_A3360AlbRImp ;
   private String[] BC01VZ14_A6463AlbRLote ;
   private String[] BC01VZ14_A6464AlbRTelar ;
   private String[] BC01VZ14_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ14_A6465AlbRLu ;
   private String[] BC01VZ14_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ14_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ14_A6471AlbRUniB ;
   private String[] BC01VZ14_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ14_A6523AlbRUdas ;
   private String[] BC01VZ14_A4793AlmNom ;
   private boolean[] BC01VZ14_n4793AlmNom ;
   private String[] BC01VZ14_A8023AlbColor ;
   private String[] BC01VZ14_A8024AlbOpsT ;
   private String[] BC01VZ14_A8025AlbOpsC ;
   private String[] BC01VZ14_A8026AlbOC ;
   private String[] BC01VZ14_A8027AlbHdri ;
   private String[] BC01VZ14_A8028AlbNumB ;
   private String[] BC01VZ14_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ14_A8030AlbAncC ;
   private short[] BC01VZ14_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ14_A8032AlbAncCr ;
   private short[] BC01VZ14_A8033AlbDndCr ;
   private short[] BC01VZ14_A8034AlbGalga ;
   private String[] BC01VZ14_A8035AlbMaqTej ;
   private short[] BC01VZ14_A8036AlbDmt ;
   private String[] BC01VZ14_A9793AlbPdaC ;
   private String[] BC01VZ14_A9794AlbOStj ;
   private byte[] BC01VZ14_A10358AlbTurno ;
   private String[] BC01VZ14_A8723CliEst ;
   private String[] BC01VZ14_A396EmprCod ;
   private int[] BC01VZ14_A252CliCod ;
   private short[] BC01VZ14_A6263AlbRTartC ;
   private boolean[] BC01VZ14_n6263AlbRTartC ;
   private short[] BC01VZ14_A840TrnCod ;
   private boolean[] BC01VZ14_n840TrnCod ;
   private short[] BC01VZ14_A970ProceCod ;
   private boolean[] BC01VZ14_n970ProceCod ;
   private short[] BC01VZ14_A1211TipEntCod ;
   private boolean[] BC01VZ14_n1211TipEntCod ;
   private byte[] BC01VZ14_A4792AlmCod ;
   private boolean[] BC01VZ14_n4792AlmCod ;
   private java.math.BigDecimal[] BC01VZ14_A13982AlbRArtLu ;
   private boolean[] BC01VZ14_n13982AlbRArtLu ;
   private String[] BC01VZ15_A407EmprNom ;
   private boolean[] BC01VZ15_n407EmprNom ;
   private String[] BC01VZ16_A279CliNom ;
   private String[] BC01VZ16_A8723CliEst ;
   private String[] BC01VZ17_A6264AlbRTartD ;
   private boolean[] BC01VZ17_n6264AlbRTartD ;
   private String[] BC01VZ18_A841TrnNom ;
   private boolean[] BC01VZ18_n841TrnNom ;
   private String[] BC01VZ19_A971ProceNom ;
   private boolean[] BC01VZ19_n971ProceNom ;
   private String[] BC01VZ20_A1212TipEntNom ;
   private boolean[] BC01VZ20_n1212TipEntNom ;
   private String[] BC01VZ21_A4793AlmNom ;
   private boolean[] BC01VZ21_n4793AlmNom ;
   private java.math.BigDecimal[] BC01VZ22_A13982AlbRArtLu ;
   private boolean[] BC01VZ22_n13982AlbRArtLu ;
   private String[] BC01VZ23_A396EmprCod ;
   private int[] BC01VZ23_A44AlbRecCod ;
   private boolean[] BC01VZ23_n44AlbRecCod ;
   private int[] BC01VZ24_A44AlbRecCod ;
   private boolean[] BC01VZ24_n44AlbRecCod ;
   private String[] BC01VZ24_A56AlbRUni ;
   private byte[] BC01VZ24_A47AlbREst ;
   private byte[] BC01VZ24_A317AlbStLot ;
   private String[] BC01VZ24_A12879AlbOEKOTEX ;
   private String[] BC01VZ24_A45AlbRef ;
   private String[] BC01VZ24_A46AlbREnt ;
   private int[] BC01VZ24_A52AlbRPieEnt ;
   private String[] BC01VZ24_A50AlbRLoc ;
   private java.util.Date[] BC01VZ24_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ24_A58AlbRUniEnt ;
   private String[] BC01VZ24_A4601AlbRTam ;
   private String[] BC01VZ24_A9749Emp_Item1 ;
   private String[] BC01VZ24_A55AlbRReo ;
   private int[] BC01VZ24_A54AlbRPieUti ;
   private int[] BC01VZ24_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ24_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ24_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ24_A48AlbRFecUlt ;
   private short[] BC01VZ24_A1222AlbNumEti ;
   private String[] BC01VZ24_A1291AlbRDes ;
   private byte[] BC01VZ24_A1301AlbRUlin ;
   private String[] BC01VZ24_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ24_A4290AlbPmPPza ;
   private short[] BC01VZ24_A4920AlbRGrm2 ;
   private short[] BC01VZ24_A4921AlbRAnc ;
   private short[] BC01VZ24_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ24_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ24_A5744AlbRAju ;
   private byte[] BC01VZ24_A5745AlbRRep ;
   private String[] BC01VZ24_A5806AlbREnt2 ;
   private String[] BC01VZ24_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ24_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ24_A6180AlbrUniC ;
   private int[] BC01VZ24_A6181AlbrPieC ;
   private String[] BC01VZ24_A6182AlbrNF ;
   private java.util.Date[] BC01VZ24_A6183AlbrFeNf ;
   private String[] BC01VZ24_A6184AlbrCfop ;
   private String[] BC01VZ24_A3359AlbRDisCli ;
   private String[] BC01VZ24_A3360AlbRImp ;
   private String[] BC01VZ24_A6463AlbRLote ;
   private String[] BC01VZ24_A6464AlbRTelar ;
   private String[] BC01VZ24_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ24_A6465AlbRLu ;
   private String[] BC01VZ24_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ24_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ24_A6471AlbRUniB ;
   private String[] BC01VZ24_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ24_A6523AlbRUdas ;
   private String[] BC01VZ24_A8023AlbColor ;
   private String[] BC01VZ24_A8024AlbOpsT ;
   private String[] BC01VZ24_A8025AlbOpsC ;
   private String[] BC01VZ24_A8026AlbOC ;
   private String[] BC01VZ24_A8027AlbHdri ;
   private String[] BC01VZ24_A8028AlbNumB ;
   private String[] BC01VZ24_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ24_A8030AlbAncC ;
   private short[] BC01VZ24_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ24_A8032AlbAncCr ;
   private short[] BC01VZ24_A8033AlbDndCr ;
   private short[] BC01VZ24_A8034AlbGalga ;
   private String[] BC01VZ24_A8035AlbMaqTej ;
   private short[] BC01VZ24_A8036AlbDmt ;
   private String[] BC01VZ24_A9793AlbPdaC ;
   private String[] BC01VZ24_A9794AlbOStj ;
   private byte[] BC01VZ24_A10358AlbTurno ;
   private String[] BC01VZ24_A396EmprCod ;
   private int[] BC01VZ24_A252CliCod ;
   private short[] BC01VZ24_A6263AlbRTartC ;
   private boolean[] BC01VZ24_n6263AlbRTartC ;
   private short[] BC01VZ24_A840TrnCod ;
   private boolean[] BC01VZ24_n840TrnCod ;
   private short[] BC01VZ24_A970ProceCod ;
   private boolean[] BC01VZ24_n970ProceCod ;
   private short[] BC01VZ24_A1211TipEntCod ;
   private boolean[] BC01VZ24_n1211TipEntCod ;
   private byte[] BC01VZ24_A4792AlmCod ;
   private boolean[] BC01VZ24_n4792AlmCod ;
   private int[] BC01VZ25_A44AlbRecCod ;
   private boolean[] BC01VZ25_n44AlbRecCod ;
   private String[] BC01VZ25_A56AlbRUni ;
   private byte[] BC01VZ25_A47AlbREst ;
   private byte[] BC01VZ25_A317AlbStLot ;
   private String[] BC01VZ25_A12879AlbOEKOTEX ;
   private String[] BC01VZ25_A45AlbRef ;
   private String[] BC01VZ25_A46AlbREnt ;
   private int[] BC01VZ25_A52AlbRPieEnt ;
   private String[] BC01VZ25_A50AlbRLoc ;
   private java.util.Date[] BC01VZ25_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ25_A58AlbRUniEnt ;
   private String[] BC01VZ25_A4601AlbRTam ;
   private String[] BC01VZ25_A9749Emp_Item1 ;
   private String[] BC01VZ25_A55AlbRReo ;
   private int[] BC01VZ25_A54AlbRPieUti ;
   private int[] BC01VZ25_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ25_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ25_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ25_A48AlbRFecUlt ;
   private short[] BC01VZ25_A1222AlbNumEti ;
   private String[] BC01VZ25_A1291AlbRDes ;
   private byte[] BC01VZ25_A1301AlbRUlin ;
   private String[] BC01VZ25_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ25_A4290AlbPmPPza ;
   private short[] BC01VZ25_A4920AlbRGrm2 ;
   private short[] BC01VZ25_A4921AlbRAnc ;
   private short[] BC01VZ25_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ25_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ25_A5744AlbRAju ;
   private byte[] BC01VZ25_A5745AlbRRep ;
   private String[] BC01VZ25_A5806AlbREnt2 ;
   private String[] BC01VZ25_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ25_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ25_A6180AlbrUniC ;
   private int[] BC01VZ25_A6181AlbrPieC ;
   private String[] BC01VZ25_A6182AlbrNF ;
   private java.util.Date[] BC01VZ25_A6183AlbrFeNf ;
   private String[] BC01VZ25_A6184AlbrCfop ;
   private String[] BC01VZ25_A3359AlbRDisCli ;
   private String[] BC01VZ25_A3360AlbRImp ;
   private String[] BC01VZ25_A6463AlbRLote ;
   private String[] BC01VZ25_A6464AlbRTelar ;
   private String[] BC01VZ25_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ25_A6465AlbRLu ;
   private String[] BC01VZ25_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ25_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ25_A6471AlbRUniB ;
   private String[] BC01VZ25_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ25_A6523AlbRUdas ;
   private String[] BC01VZ25_A8023AlbColor ;
   private String[] BC01VZ25_A8024AlbOpsT ;
   private String[] BC01VZ25_A8025AlbOpsC ;
   private String[] BC01VZ25_A8026AlbOC ;
   private String[] BC01VZ25_A8027AlbHdri ;
   private String[] BC01VZ25_A8028AlbNumB ;
   private String[] BC01VZ25_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ25_A8030AlbAncC ;
   private short[] BC01VZ25_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ25_A8032AlbAncCr ;
   private short[] BC01VZ25_A8033AlbDndCr ;
   private short[] BC01VZ25_A8034AlbGalga ;
   private String[] BC01VZ25_A8035AlbMaqTej ;
   private short[] BC01VZ25_A8036AlbDmt ;
   private String[] BC01VZ25_A9793AlbPdaC ;
   private String[] BC01VZ25_A9794AlbOStj ;
   private byte[] BC01VZ25_A10358AlbTurno ;
   private String[] BC01VZ25_A396EmprCod ;
   private int[] BC01VZ25_A252CliCod ;
   private short[] BC01VZ25_A6263AlbRTartC ;
   private boolean[] BC01VZ25_n6263AlbRTartC ;
   private short[] BC01VZ25_A840TrnCod ;
   private boolean[] BC01VZ25_n840TrnCod ;
   private short[] BC01VZ25_A970ProceCod ;
   private boolean[] BC01VZ25_n970ProceCod ;
   private short[] BC01VZ25_A1211TipEntCod ;
   private boolean[] BC01VZ25_n1211TipEntCod ;
   private byte[] BC01VZ25_A4792AlmCod ;
   private boolean[] BC01VZ25_n4792AlmCod ;
   private String[] BC01VZ29_A407EmprNom ;
   private boolean[] BC01VZ29_n407EmprNom ;
   private String[] BC01VZ30_A279CliNom ;
   private String[] BC01VZ30_A8723CliEst ;
   private java.math.BigDecimal[] BC01VZ31_A13982AlbRArtLu ;
   private boolean[] BC01VZ31_n13982AlbRArtLu ;
   private String[] BC01VZ32_A841TrnNom ;
   private boolean[] BC01VZ32_n841TrnNom ;
   private String[] BC01VZ33_A1212TipEntNom ;
   private boolean[] BC01VZ33_n1212TipEntNom ;
   private String[] BC01VZ34_A971ProceNom ;
   private boolean[] BC01VZ34_n971ProceNom ;
   private String[] BC01VZ35_A6264AlbRTartD ;
   private boolean[] BC01VZ35_n6264AlbRTartD ;
   private String[] BC01VZ36_A4793AlmNom ;
   private boolean[] BC01VZ36_n4793AlmNom ;
   private String[] BC01VZ37_A396EmprCod ;
   private int[] BC01VZ37_A13026PedDGId ;
   private int[] BC01VZ37_A44AlbRecCod ;
   private boolean[] BC01VZ37_n44AlbRecCod ;
   private String[] BC01VZ38_A396EmprCod ;
   private int[] BC01VZ38_A11669DevCruId ;
   private int[] BC01VZ38_A44AlbRecCod ;
   private boolean[] BC01VZ38_n44AlbRecCod ;
   private String[] BC01VZ39_A396EmprCod ;
   private int[] BC01VZ39_A44AlbRecCod ;
   private boolean[] BC01VZ39_n44AlbRecCod ;
   private String[] BC01VZ39_A9743Emp_CUb ;
   private short[] BC01VZ39_A5860Emp_Anp ;
   private String[] BC01VZ40_A396EmprCod ;
   private int[] BC01VZ40_A44AlbRecCod ;
   private boolean[] BC01VZ40_n44AlbRecCod ;
   private String[] BC01VZ40_A7130MatC_Pz ;
   private String[] BC01VZ41_A396EmprCod ;
   private int[] BC01VZ41_A44AlbRecCod ;
   private boolean[] BC01VZ41_n44AlbRecCod ;
   private String[] BC01VZ41_A7132MatC_Talla ;
   private String[] BC01VZ42_A396EmprCod ;
   private int[] BC01VZ42_A44AlbRecCod ;
   private boolean[] BC01VZ42_n44AlbRecCod ;
   private short[] BC01VZ42_A7115MatC_Lin ;
   private String[] BC01VZ43_A396EmprCod ;
   private long[] BC01VZ43_A30AlbProCod ;
   private int[] BC01VZ43_A129BarCod ;
   private byte[] BC01VZ43_A132BarCodReo ;
   private String[] BC01VZ43_A130BarCodPar ;
   private short[] BC01VZ43_A6622AlbHdRLn ;
   private String[] BC01VZ44_A396EmprCod ;
   private int[] BC01VZ44_A6235DevEmpCod ;
   private byte[] BC01VZ44_A6243DevNumLin ;
   private String[] BC01VZ45_A396EmprCod ;
   private int[] BC01VZ45_A44AlbRecCod ;
   private boolean[] BC01VZ45_n44AlbRecCod ;
   private short[] BC01VZ45_A4596AlbRDefCod ;
   private String[] BC01VZ46_A396EmprCod ;
   private int[] BC01VZ46_A44AlbRecCod ;
   private boolean[] BC01VZ46_n44AlbRecCod ;
   private String[] BC01VZ46_A2159AlbRecPie ;
   private String[] BC01VZ47_A396EmprCod ;
   private int[] BC01VZ47_A44AlbRecCod ;
   private boolean[] BC01VZ47_n44AlbRecCod ;
   private short[] BC01VZ47_A2165HisEmpLin ;
   private String[] BC01VZ48_A396EmprCod ;
   private int[] BC01VZ48_A361DisCod ;
   private int[] BC01VZ48_A44AlbRecCod ;
   private boolean[] BC01VZ48_n44AlbRecCod ;
   private String[] BC01VZ49_A396EmprCod ;
   private int[] BC01VZ49_A323DevGenCod ;
   private String[] BC01VZ50_A396EmprCod ;
   private int[] BC01VZ50_A129BarCod ;
   private byte[] BC01VZ50_A132BarCodReo ;
   private String[] BC01VZ50_A130BarCodPar ;
   private String[] BC01VZ50_A200BarPieCod ;
   private String[] BC01VZ52_A65ArtCod ;
   private int[] BC01VZ52_A44AlbRecCod ;
   private boolean[] BC01VZ52_n44AlbRecCod ;
   private String[] BC01VZ52_A56AlbRUni ;
   private byte[] BC01VZ52_A47AlbREst ;
   private byte[] BC01VZ52_A317AlbStLot ;
   private String[] BC01VZ52_A12879AlbOEKOTEX ;
   private String[] BC01VZ52_A407EmprNom ;
   private boolean[] BC01VZ52_n407EmprNom ;
   private String[] BC01VZ52_A279CliNom ;
   private String[] BC01VZ52_A45AlbRef ;
   private String[] BC01VZ52_A841TrnNom ;
   private boolean[] BC01VZ52_n841TrnNom ;
   private String[] BC01VZ52_A46AlbREnt ;
   private int[] BC01VZ52_A52AlbRPieEnt ;
   private String[] BC01VZ52_A50AlbRLoc ;
   private java.util.Date[] BC01VZ52_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ52_A58AlbRUniEnt ;
   private String[] BC01VZ52_A4601AlbRTam ;
   private String[] BC01VZ52_A9749Emp_Item1 ;
   private String[] BC01VZ52_A55AlbRReo ;
   private int[] BC01VZ52_A54AlbRPieUti ;
   private int[] BC01VZ52_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ52_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ52_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ52_A48AlbRFecUlt ;
   private String[] BC01VZ52_A1212TipEntNom ;
   private boolean[] BC01VZ52_n1212TipEntNom ;
   private short[] BC01VZ52_A1222AlbNumEti ;
   private String[] BC01VZ52_A1291AlbRDes ;
   private String[] BC01VZ52_A971ProceNom ;
   private boolean[] BC01VZ52_n971ProceNom ;
   private byte[] BC01VZ52_A1301AlbRUlin ;
   private String[] BC01VZ52_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ52_A4290AlbPmPPza ;
   private short[] BC01VZ52_A4920AlbRGrm2 ;
   private short[] BC01VZ52_A4921AlbRAnc ;
   private short[] BC01VZ52_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ52_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ52_A5744AlbRAju ;
   private byte[] BC01VZ52_A5745AlbRRep ;
   private String[] BC01VZ52_A5806AlbREnt2 ;
   private String[] BC01VZ52_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ52_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ52_A6180AlbrUniC ;
   private int[] BC01VZ52_A6181AlbrPieC ;
   private String[] BC01VZ52_A6182AlbrNF ;
   private java.util.Date[] BC01VZ52_A6183AlbrFeNf ;
   private String[] BC01VZ52_A6184AlbrCfop ;
   private String[] BC01VZ52_A3359AlbRDisCli ;
   private String[] BC01VZ52_A6264AlbRTartD ;
   private boolean[] BC01VZ52_n6264AlbRTartD ;
   private String[] BC01VZ52_A3360AlbRImp ;
   private String[] BC01VZ52_A6463AlbRLote ;
   private String[] BC01VZ52_A6464AlbRTelar ;
   private String[] BC01VZ52_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ52_A6465AlbRLu ;
   private String[] BC01VZ52_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ52_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ52_A6471AlbRUniB ;
   private String[] BC01VZ52_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ52_A6523AlbRUdas ;
   private String[] BC01VZ52_A4793AlmNom ;
   private boolean[] BC01VZ52_n4793AlmNom ;
   private String[] BC01VZ52_A8023AlbColor ;
   private String[] BC01VZ52_A8024AlbOpsT ;
   private String[] BC01VZ52_A8025AlbOpsC ;
   private String[] BC01VZ52_A8026AlbOC ;
   private String[] BC01VZ52_A8027AlbHdri ;
   private String[] BC01VZ52_A8028AlbNumB ;
   private String[] BC01VZ52_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ52_A8030AlbAncC ;
   private short[] BC01VZ52_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ52_A8032AlbAncCr ;
   private short[] BC01VZ52_A8033AlbDndCr ;
   private short[] BC01VZ52_A8034AlbGalga ;
   private String[] BC01VZ52_A8035AlbMaqTej ;
   private short[] BC01VZ52_A8036AlbDmt ;
   private String[] BC01VZ52_A9793AlbPdaC ;
   private String[] BC01VZ52_A9794AlbOStj ;
   private byte[] BC01VZ52_A10358AlbTurno ;
   private String[] BC01VZ52_A8723CliEst ;
   private String[] BC01VZ52_A396EmprCod ;
   private int[] BC01VZ52_A252CliCod ;
   private short[] BC01VZ52_A6263AlbRTartC ;
   private boolean[] BC01VZ52_n6263AlbRTartC ;
   private short[] BC01VZ52_A840TrnCod ;
   private boolean[] BC01VZ52_n840TrnCod ;
   private short[] BC01VZ52_A970ProceCod ;
   private boolean[] BC01VZ52_n970ProceCod ;
   private short[] BC01VZ52_A1211TipEntCod ;
   private boolean[] BC01VZ52_n1211TipEntCod ;
   private byte[] BC01VZ52_A4792AlmCod ;
   private boolean[] BC01VZ52_n4792AlmCod ;
   private java.math.BigDecimal[] BC01VZ52_A13982AlbRArtLu ;
   private boolean[] BC01VZ52_n13982AlbRArtLu ;
   private int[] BC01VZ53_A44AlbRecCod ;
   private boolean[] BC01VZ53_n44AlbRecCod ;
   private byte[] BC01VZ53_A1299AlbRLin ;
   private String[] BC01VZ53_A1300AlbRObs ;
   private String[] BC01VZ53_A396EmprCod ;
   private String[] BC01VZ54_A396EmprCod ;
   private int[] BC01VZ54_A44AlbRecCod ;
   private boolean[] BC01VZ54_n44AlbRecCod ;
   private byte[] BC01VZ54_A1299AlbRLin ;
   private int[] BC01VZ55_A44AlbRecCod ;
   private boolean[] BC01VZ55_n44AlbRecCod ;
   private byte[] BC01VZ55_A1299AlbRLin ;
   private String[] BC01VZ55_A1300AlbRObs ;
   private String[] BC01VZ55_A396EmprCod ;
   private int[] BC01VZ56_A44AlbRecCod ;
   private boolean[] BC01VZ56_n44AlbRecCod ;
   private byte[] BC01VZ56_A1299AlbRLin ;
   private String[] BC01VZ56_A1300AlbRObs ;
   private String[] BC01VZ56_A396EmprCod ;
   private int[] BC01VZ60_A44AlbRecCod ;
   private boolean[] BC01VZ60_n44AlbRecCod ;
   private byte[] BC01VZ60_A1299AlbRLin ;
   private String[] BC01VZ60_A1300AlbRObs ;
   private String[] BC01VZ60_A396EmprCod ;
   private String[] BC01VZ61_A407EmprNom ;
   private boolean[] BC01VZ61_n407EmprNom ;
   private String[] BC01VZ62_A407EmprNom ;
   private boolean[] BC01VZ62_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01VZ2_A44AlbRecCod ;
   private byte[] BC01VZ2_A1299AlbRLin ;
   private String[] BC01VZ2_A1300AlbRObs ;
   private String[] BC01VZ2_A396EmprCod ;
   private int[] BC01VZ3_A44AlbRecCod ;
   private byte[] BC01VZ3_A1299AlbRLin ;
   private String[] BC01VZ3_A1300AlbRObs ;
   private String[] BC01VZ3_A396EmprCod ;
   private int[] BC01VZ4_A44AlbRecCod ;
   private String[] BC01VZ4_A56AlbRUni ;
   private byte[] BC01VZ4_A47AlbREst ;
   private byte[] BC01VZ4_A317AlbStLot ;
   private String[] BC01VZ4_A12879AlbOEKOTEX ;
   private String[] BC01VZ4_A45AlbRef ;
   private String[] BC01VZ4_A46AlbREnt ;
   private int[] BC01VZ4_A52AlbRPieEnt ;
   private String[] BC01VZ4_A50AlbRLoc ;
   private java.util.Date[] BC01VZ4_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ4_A58AlbRUniEnt ;
   private String[] BC01VZ4_A4601AlbRTam ;
   private String[] BC01VZ4_A9749Emp_Item1 ;
   private String[] BC01VZ4_A55AlbRReo ;
   private int[] BC01VZ4_A54AlbRPieUti ;
   private int[] BC01VZ4_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ4_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ4_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ4_A48AlbRFecUlt ;
   private short[] BC01VZ4_A1222AlbNumEti ;
   private String[] BC01VZ4_A1291AlbRDes ;
   private byte[] BC01VZ4_A1301AlbRUlin ;
   private String[] BC01VZ4_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ4_A4290AlbPmPPza ;
   private short[] BC01VZ4_A4920AlbRGrm2 ;
   private short[] BC01VZ4_A4921AlbRAnc ;
   private short[] BC01VZ4_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ4_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ4_A5744AlbRAju ;
   private byte[] BC01VZ4_A5745AlbRRep ;
   private String[] BC01VZ4_A5806AlbREnt2 ;
   private String[] BC01VZ4_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ4_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ4_A6180AlbrUniC ;
   private int[] BC01VZ4_A6181AlbrPieC ;
   private String[] BC01VZ4_A6182AlbrNF ;
   private java.util.Date[] BC01VZ4_A6183AlbrFeNf ;
   private String[] BC01VZ4_A6184AlbrCfop ;
   private String[] BC01VZ4_A3359AlbRDisCli ;
   private String[] BC01VZ4_A3360AlbRImp ;
   private String[] BC01VZ4_A6463AlbRLote ;
   private String[] BC01VZ4_A6464AlbRTelar ;
   private String[] BC01VZ4_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ4_A6465AlbRLu ;
   private String[] BC01VZ4_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ4_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ4_A6471AlbRUniB ;
   private String[] BC01VZ4_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ4_A6523AlbRUdas ;
   private String[] BC01VZ4_A8023AlbColor ;
   private String[] BC01VZ4_A8024AlbOpsT ;
   private String[] BC01VZ4_A8025AlbOpsC ;
   private String[] BC01VZ4_A8026AlbOC ;
   private String[] BC01VZ4_A8027AlbHdri ;
   private String[] BC01VZ4_A8028AlbNumB ;
   private String[] BC01VZ4_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ4_A8030AlbAncC ;
   private short[] BC01VZ4_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ4_A8032AlbAncCr ;
   private short[] BC01VZ4_A8033AlbDndCr ;
   private short[] BC01VZ4_A8034AlbGalga ;
   private String[] BC01VZ4_A8035AlbMaqTej ;
   private short[] BC01VZ4_A8036AlbDmt ;
   private String[] BC01VZ4_A9793AlbPdaC ;
   private String[] BC01VZ4_A9794AlbOStj ;
   private byte[] BC01VZ4_A10358AlbTurno ;
   private String[] BC01VZ4_A396EmprCod ;
   private int[] BC01VZ4_A252CliCod ;
   private short[] BC01VZ4_A6263AlbRTartC ;
   private short[] BC01VZ4_A840TrnCod ;
   private short[] BC01VZ4_A970ProceCod ;
   private short[] BC01VZ4_A1211TipEntCod ;
   private byte[] BC01VZ4_A4792AlmCod ;
   private int[] BC01VZ5_A44AlbRecCod ;
   private String[] BC01VZ5_A56AlbRUni ;
   private byte[] BC01VZ5_A47AlbREst ;
   private byte[] BC01VZ5_A317AlbStLot ;
   private String[] BC01VZ5_A12879AlbOEKOTEX ;
   private String[] BC01VZ5_A45AlbRef ;
   private String[] BC01VZ5_A46AlbREnt ;
   private int[] BC01VZ5_A52AlbRPieEnt ;
   private String[] BC01VZ5_A50AlbRLoc ;
   private java.util.Date[] BC01VZ5_A49AlbRFen ;
   private java.math.BigDecimal[] BC01VZ5_A58AlbRUniEnt ;
   private String[] BC01VZ5_A4601AlbRTam ;
   private String[] BC01VZ5_A9749Emp_Item1 ;
   private String[] BC01VZ5_A55AlbRReo ;
   private int[] BC01VZ5_A54AlbRPieUti ;
   private int[] BC01VZ5_A53AlbRPieReb ;
   private java.math.BigDecimal[] BC01VZ5_A60AlbRUniUti ;
   private java.math.BigDecimal[] BC01VZ5_A59AlbRUniReb ;
   private java.util.Date[] BC01VZ5_A48AlbRFecUlt ;
   private short[] BC01VZ5_A1222AlbNumEti ;
   private String[] BC01VZ5_A1291AlbRDes ;
   private byte[] BC01VZ5_A1301AlbRUlin ;
   private String[] BC01VZ5_A3613AlbRefDsc ;
   private java.math.BigDecimal[] BC01VZ5_A4290AlbPmPPza ;
   private short[] BC01VZ5_A4920AlbRGrm2 ;
   private short[] BC01VZ5_A4921AlbRAnc ;
   private short[] BC01VZ5_A4922AlbPml ;
   private java.math.BigDecimal[] BC01VZ5_A5743AlbRPre ;
   private java.math.BigDecimal[] BC01VZ5_A5744AlbRAju ;
   private byte[] BC01VZ5_A5745AlbRRep ;
   private String[] BC01VZ5_A5806AlbREnt2 ;
   private String[] BC01VZ5_A6178AlbrUsu ;
   private java.util.Date[] BC01VZ5_A6179AlbrHor ;
   private java.math.BigDecimal[] BC01VZ5_A6180AlbrUniC ;
   private int[] BC01VZ5_A6181AlbrPieC ;
   private String[] BC01VZ5_A6182AlbrNF ;
   private java.util.Date[] BC01VZ5_A6183AlbrFeNf ;
   private String[] BC01VZ5_A6184AlbrCfop ;
   private String[] BC01VZ5_A3359AlbRDisCli ;
   private String[] BC01VZ5_A3360AlbRImp ;
   private String[] BC01VZ5_A6463AlbRLote ;
   private String[] BC01VZ5_A6464AlbRTelar ;
   private String[] BC01VZ5_A14525AlbRLot2 ;
   private java.math.BigDecimal[] BC01VZ5_A6465AlbRLu ;
   private String[] BC01VZ5_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] BC01VZ5_A6470AlbRTara ;
   private java.math.BigDecimal[] BC01VZ5_A6471AlbRUniB ;
   private String[] BC01VZ5_A6488AlbDocPrv ;
   private java.math.BigDecimal[] BC01VZ5_A6523AlbRUdas ;
   private String[] BC01VZ5_A8023AlbColor ;
   private String[] BC01VZ5_A8024AlbOpsT ;
   private String[] BC01VZ5_A8025AlbOpsC ;
   private String[] BC01VZ5_A8026AlbOC ;
   private String[] BC01VZ5_A8027AlbHdri ;
   private String[] BC01VZ5_A8028AlbNumB ;
   private String[] BC01VZ5_A8029AlbNumM ;
   private java.math.BigDecimal[] BC01VZ5_A8030AlbAncC ;
   private short[] BC01VZ5_A8031AlbDndC ;
   private java.math.BigDecimal[] BC01VZ5_A8032AlbAncCr ;
   private short[] BC01VZ5_A8033AlbDndCr ;
   private short[] BC01VZ5_A8034AlbGalga ;
   private String[] BC01VZ5_A8035AlbMaqTej ;
   private short[] BC01VZ5_A8036AlbDmt ;
   private String[] BC01VZ5_A9793AlbPdaC ;
   private String[] BC01VZ5_A9794AlbOStj ;
   private byte[] BC01VZ5_A10358AlbTurno ;
   private String[] BC01VZ5_A396EmprCod ;
   private int[] BC01VZ5_A252CliCod ;
   private short[] BC01VZ5_A6263AlbRTartC ;
   private short[] BC01VZ5_A840TrnCod ;
   private short[] BC01VZ5_A970ProceCod ;
   private short[] BC01VZ5_A1211TipEntCod ;
   private byte[] BC01VZ5_A4792AlmCod ;
   private String[] BC01VZ6_A407EmprNom ;
   private String[] BC01VZ7_A279CliNom ;
   private String[] BC01VZ7_A8723CliEst ;
   private String[] BC01VZ8_A6264AlbRTartD ;
   private String[] BC01VZ9_A841TrnNom ;
   private String[] BC01VZ10_A971ProceNom ;
   private String[] BC01VZ11_A1212TipEntNom ;
   private String[] BC01VZ12_A4793AlmNom ;
   private java.math.BigDecimal[] BC01VZ13_A13982AlbRArtLu ;
   private boolean[] BC01VZ4_n6263AlbRTartC ;
   private boolean[] BC01VZ4_n840TrnCod ;
   private boolean[] BC01VZ4_n970ProceCod ;
   private boolean[] BC01VZ4_n1211TipEntCod ;
   private boolean[] BC01VZ4_n4792AlmCod ;
   private boolean[] BC01VZ5_n6263AlbRTartC ;
   private boolean[] BC01VZ5_n840TrnCod ;
   private boolean[] BC01VZ5_n970ProceCod ;
   private boolean[] BC01VZ5_n1211TipEntCod ;
   private boolean[] BC01VZ5_n4792AlmCod ;
   private boolean[] BC01VZ6_n407EmprNom ;
   private boolean[] BC01VZ8_n6264AlbRTartD ;
   private boolean[] BC01VZ9_n841TrnNom ;
   private boolean[] BC01VZ10_n971ProceNom ;
   private boolean[] BC01VZ11_n1212TipEntNom ;
   private boolean[] BC01VZ12_n4793AlmNom ;
   private boolean[] BC01VZ13_n13982AlbRArtLu ;
}

final  class bc_albrec_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class bc_albrec_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class bc_albrec_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class bc_albrec_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class bc_albrec_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01VZ2", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?  FOR UPDATE OF AlbRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ3", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ4", "SELECT AlbRecCod, AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ5", "SELECT AlbRecCod, AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ7", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ8", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ10", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ11", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ12", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ13", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ14", "SELECT /*+ FIRST_ROWS(100) */ T4.ArtCod, TM1.AlbRecCod, TM1.AlbRUni, TM1.AlbREst, TM1.AlbStLot, TM1.AlbOEKOTEX, T2.EmprNom, T3.CliNom, TM1.AlbRef, T5.TrnNom, TM1.AlbREnt, TM1.AlbRPieEnt, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRUniEnt, TM1.AlbRTam, TM1.Emp_Item1, TM1.AlbRReo, TM1.AlbRPieUti, TM1.AlbRPieReb, TM1.AlbRUniUti, TM1.AlbRUniReb, TM1.AlbRFecUlt, T6.TipEntNom, TM1.AlbNumEti, TM1.AlbRDes, T7.ProceNom, TM1.AlbRUlin, TM1.AlbRefDsc, TM1.AlbPmPPza, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRPre, TM1.AlbRAju, TM1.AlbRRep, TM1.AlbREnt2, TM1.AlbrUsu, TM1.AlbrHor, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbrNF, TM1.AlbrFeNf, TM1.AlbrCfop, TM1.AlbRDisCli, T8.TipArtDsc AS AlbRTartD, TM1.AlbRImp, TM1.AlbRLote, TM1.AlbRTelar, TM1.AlbRLot2, TM1.AlbRLu, TM1.AlbRMdlCod, TM1.AlbRTara, TM1.AlbRUniB, TM1.AlbDocPrv, TM1.AlbRUdas, T9.AlmNom, TM1.AlbColor, TM1.AlbOpsT, TM1.AlbOpsC, TM1.AlbOC, TM1.AlbHdri, TM1.AlbNumB, TM1.AlbNumM, TM1.AlbAncC, TM1.AlbDndC, TM1.AlbAncCr, TM1.AlbDndCr, TM1.AlbGalga, TM1.AlbMaqTej, TM1.AlbDmt, TM1.AlbPdaC, TM1.AlbOStj, TM1.AlbTurno, T3.CliEst, TM1.EmprCod, TM1.CliCod, TM1.AlbRTartC AS AlbRTartC, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, TM1.AlmCod, COALESCE( T4.ArtLu, 0) AS AlbRArtLu FROM ((((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.AlbRef) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPPROCED T7 ON T7.EmprCod = TM1.EmprCod AND T7.ProceCod = TM1.ProceCod) LEFT JOIN TXPTIPART T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipArtCod = TM1.AlbRTartC) LEFT JOIN TXPAlmace T9 ON T9.EmprCod = TM1.EmprCod AND T9.AlmCod = TM1.AlmCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ16", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ17", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ18", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ19", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ20", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ21", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ22", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ23", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ24", "SELECT AlbRecCod, AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ25", "SELECT AlbRecCod, AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01VZ26", "INSERT INTO TXPALBREC(AlbRecCod, AlbRUni, AlbREst, AlbStLot, AlbOEKOTEX, AlbRef, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRTam, Emp_Item1, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLot2, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod, HisEmpULin, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, MatC_ULin, AlbRecSec, Bod_UltPz, AlbUltP, Cod_mta, AlbRPh, AlbRRLong, AlbRRTrans) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("BC01VZ27", "UPDATE TXPALBREC SET AlbRUni=?, AlbREst=?, AlbStLot=?, AlbOEKOTEX=?, AlbRef=?, AlbREnt=?, AlbRPieEnt=?, AlbRLoc=?, AlbRFen=?, AlbRUniEnt=?, AlbRTam=?, Emp_Item1=?, AlbRReo=?, AlbRPieUti=?, AlbRPieReb=?, AlbRUniUti=?, AlbRUniReb=?, AlbRFecUlt=?, AlbNumEti=?, AlbRDes=?, AlbRUlin=?, AlbRefDsc=?, AlbPmPPza=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRPre=?, AlbRAju=?, AlbRRep=?, AlbREnt2=?, AlbrUsu=?, AlbrHor=?, AlbrUniC=?, AlbrPieC=?, AlbrNF=?, AlbrFeNf=?, AlbrCfop=?, AlbRDisCli=?, AlbRImp=?, AlbRLote=?, AlbRTelar=?, AlbRLot2=?, AlbRLu=?, AlbRMdlCod=?, AlbRTara=?, AlbRUniB=?, AlbDocPrv=?, AlbRUdas=?, AlbColor=?, AlbOpsT=?, AlbOpsC=?, AlbOC=?, AlbHdri=?, AlbNumB=?, AlbNumM=?, AlbAncC=?, AlbDndC=?, AlbAncCr=?, AlbDndCr=?, AlbGalga=?, AlbMaqTej=?, AlbDmt=?, AlbPdaC=?, AlbOStj=?, AlbTurno=?, CliCod=?, AlbRTartC=?, TrnCod=?, ProceCod=?, TipEntCod=?, AlmCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("BC01VZ28", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("BC01VZ29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ30", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ31", "SELECT COALESCE( ArtLu, 0) AS AlbRArtLu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ32", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ33", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ34", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ35", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ36", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ37", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ38", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ39", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ40", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ41", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ42", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ43", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ44", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ45", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ46", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ47", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ48", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ49", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VZ50", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("BC01VZ51", "UPDATE TXPALBREC SET AlbRUlin=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("BC01VZ52", "SELECT /*+ FIRST_ROWS(100) */ T4.ArtCod, TM1.AlbRecCod, TM1.AlbRUni, TM1.AlbREst, TM1.AlbStLot, TM1.AlbOEKOTEX, T2.EmprNom, T3.CliNom, TM1.AlbRef, T5.TrnNom, TM1.AlbREnt, TM1.AlbRPieEnt, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRUniEnt, TM1.AlbRTam, TM1.Emp_Item1, TM1.AlbRReo, TM1.AlbRPieUti, TM1.AlbRPieReb, TM1.AlbRUniUti, TM1.AlbRUniReb, TM1.AlbRFecUlt, T6.TipEntNom, TM1.AlbNumEti, TM1.AlbRDes, T7.ProceNom, TM1.AlbRUlin, TM1.AlbRefDsc, TM1.AlbPmPPza, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRPre, TM1.AlbRAju, TM1.AlbRRep, TM1.AlbREnt2, TM1.AlbrUsu, TM1.AlbrHor, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbrNF, TM1.AlbrFeNf, TM1.AlbrCfop, TM1.AlbRDisCli, T8.TipArtDsc AS AlbRTartD, TM1.AlbRImp, TM1.AlbRLote, TM1.AlbRTelar, TM1.AlbRLot2, TM1.AlbRLu, TM1.AlbRMdlCod, TM1.AlbRTara, TM1.AlbRUniB, TM1.AlbDocPrv, TM1.AlbRUdas, T9.AlmNom, TM1.AlbColor, TM1.AlbOpsT, TM1.AlbOpsC, TM1.AlbOC, TM1.AlbHdri, TM1.AlbNumB, TM1.AlbNumM, TM1.AlbAncC, TM1.AlbDndC, TM1.AlbAncCr, TM1.AlbDndCr, TM1.AlbGalga, TM1.AlbMaqTej, TM1.AlbDmt, TM1.AlbPdaC, TM1.AlbOStj, TM1.AlbTurno, T3.CliEst, TM1.EmprCod, TM1.CliCod, TM1.AlbRTartC AS AlbRTartC, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, TM1.AlmCod, COALESCE( T4.ArtLu, 0) AS AlbRArtLu FROM ((((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.AlbRef) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPPROCED T7 ON T7.EmprCod = TM1.EmprCod AND T7.ProceCod = TM1.ProceCod) LEFT JOIN TXPTIPART T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipArtCod = TM1.AlbRTartC) LEFT JOIN TXPAlmace T9 ON T9.EmprCod = TM1.EmprCod AND T9.AlmCod = TM1.AlmCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ53", "SELECT /*+ FIRST_ROWS(11) */ AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? and AlbRLin = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ54", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ55", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ56", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?  FOR UPDATE OF AlbRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01VZ57", "INSERT INTO TXPALBROB(AlbRecCod, AlbRLin, AlbRObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("BC01VZ58", "UPDATE TXPALBROB SET AlbRObs=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("BC01VZ59", "DELETE FROM TXPALBROB  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new ForEachCursor("BC01VZ60", "SELECT /*+ FIRST_ROWS(11) */ AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ61", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VZ62", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 20);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 26);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 20);
               ((String[]) buf[31])[0] = rslt.getString(32, 10);
               ((java.util.Date[]) buf[32])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((int[]) buf[34])[0] = rslt.getInt(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(37);
               ((String[]) buf[37])[0] = rslt.getString(38, 5);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 1);
               ((String[]) buf[40])[0] = rslt.getString(41, 20);
               ((String[]) buf[41])[0] = rslt.getString(42, 20);
               ((String[]) buf[42])[0] = rslt.getVarchar(43);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 13);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[47])[0] = rslt.getString(48, 10);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((String[]) buf[49])[0] = rslt.getString(50, 40);
               ((String[]) buf[50])[0] = rslt.getString(51, 30);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 12);
               ((String[]) buf[53])[0] = rslt.getString(54, 20);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((String[]) buf[61])[0] = rslt.getString(62, 12);
               ((short[]) buf[62])[0] = rslt.getShort(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((String[]) buf[64])[0] = rslt.getString(65, 20);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 20);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 26);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 20);
               ((String[]) buf[31])[0] = rslt.getString(32, 10);
               ((java.util.Date[]) buf[32])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((int[]) buf[34])[0] = rslt.getInt(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(37);
               ((String[]) buf[37])[0] = rslt.getString(38, 5);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 1);
               ((String[]) buf[40])[0] = rslt.getString(41, 20);
               ((String[]) buf[41])[0] = rslt.getString(42, 20);
               ((String[]) buf[42])[0] = rslt.getVarchar(43);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 13);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[47])[0] = rslt.getString(48, 10);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((String[]) buf[49])[0] = rslt.getString(50, 40);
               ((String[]) buf[50])[0] = rslt.getString(51, 30);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 12);
               ((String[]) buf[53])[0] = rslt.getString(54, 20);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((String[]) buf[61])[0] = rslt.getString(62, 12);
               ((short[]) buf[62])[0] = rslt.getShort(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((String[]) buf[64])[0] = rslt.getString(65, 20);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 4);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 2);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 25);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 26);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(30,3);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 20);
               ((String[]) buf[41])[0] = rslt.getString(38, 10);
               ((java.util.Date[]) buf[42])[0] = GXutil.resetDate(rslt.getGXDateTime(39));
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(40,2);
               ((int[]) buf[44])[0] = rslt.getInt(41);
               ((String[]) buf[45])[0] = rslt.getString(42, 1);
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(43);
               ((String[]) buf[47])[0] = rslt.getString(44, 5);
               ((String[]) buf[48])[0] = rslt.getString(45, 20);
               ((String[]) buf[49])[0] = rslt.getString(46, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(47, 1);
               ((String[]) buf[52])[0] = rslt.getString(48, 20);
               ((String[]) buf[53])[0] = rslt.getString(49, 20);
               ((String[]) buf[54])[0] = rslt.getVarchar(50);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(51,2);
               ((String[]) buf[56])[0] = rslt.getString(52, 13);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(54,2);
               ((String[]) buf[59])[0] = rslt.getString(55, 10);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(56,2);
               ((String[]) buf[61])[0] = rslt.getString(57, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(58, 40);
               ((String[]) buf[64])[0] = rslt.getString(59, 30);
               ((String[]) buf[65])[0] = rslt.getString(60, 30);
               ((String[]) buf[66])[0] = rslt.getString(61, 12);
               ((String[]) buf[67])[0] = rslt.getString(62, 20);
               ((String[]) buf[68])[0] = rslt.getString(63, 20);
               ((String[]) buf[69])[0] = rslt.getString(64, 10);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(65,2);
               ((short[]) buf[71])[0] = rslt.getShort(66);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(67,2);
               ((short[]) buf[73])[0] = rslt.getShort(68);
               ((short[]) buf[74])[0] = rslt.getShort(69);
               ((String[]) buf[75])[0] = rslt.getString(70, 12);
               ((short[]) buf[76])[0] = rslt.getShort(71);
               ((String[]) buf[77])[0] = rslt.getString(72, 20);
               ((String[]) buf[78])[0] = rslt.getString(73, 20);
               ((byte[]) buf[79])[0] = rslt.getByte(74);
               ((String[]) buf[80])[0] = rslt.getString(75, 1);
               ((String[]) buf[81])[0] = rslt.getString(76, 3);
               ((int[]) buf[82])[0] = rslt.getInt(77);
               ((short[]) buf[83])[0] = rslt.getShort(78);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(79);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(81);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((byte[]) buf[91])[0] = rslt.getByte(82);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 20);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 26);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 20);
               ((String[]) buf[31])[0] = rslt.getString(32, 10);
               ((java.util.Date[]) buf[32])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((int[]) buf[34])[0] = rslt.getInt(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(37);
               ((String[]) buf[37])[0] = rslt.getString(38, 5);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 1);
               ((String[]) buf[40])[0] = rslt.getString(41, 20);
               ((String[]) buf[41])[0] = rslt.getString(42, 20);
               ((String[]) buf[42])[0] = rslt.getVarchar(43);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 13);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[47])[0] = rslt.getString(48, 10);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((String[]) buf[49])[0] = rslt.getString(50, 40);
               ((String[]) buf[50])[0] = rslt.getString(51, 30);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 12);
               ((String[]) buf[53])[0] = rslt.getString(54, 20);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((String[]) buf[61])[0] = rslt.getString(62, 12);
               ((short[]) buf[62])[0] = rslt.getShort(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((String[]) buf[64])[0] = rslt.getString(65, 20);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 20);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 26);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 20);
               ((String[]) buf[31])[0] = rslt.getString(32, 10);
               ((java.util.Date[]) buf[32])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((int[]) buf[34])[0] = rslt.getInt(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(37);
               ((String[]) buf[37])[0] = rslt.getString(38, 5);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 1);
               ((String[]) buf[40])[0] = rslt.getString(41, 20);
               ((String[]) buf[41])[0] = rslt.getString(42, 20);
               ((String[]) buf[42])[0] = rslt.getVarchar(43);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 13);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[47])[0] = rslt.getString(48, 10);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((String[]) buf[49])[0] = rslt.getString(50, 40);
               ((String[]) buf[50])[0] = rslt.getString(51, 30);
               ((String[]) buf[51])[0] = rslt.getString(52, 30);
               ((String[]) buf[52])[0] = rslt.getString(53, 12);
               ((String[]) buf[53])[0] = rslt.getString(54, 20);
               ((String[]) buf[54])[0] = rslt.getString(55, 20);
               ((String[]) buf[55])[0] = rslt.getString(56, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(57,2);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((short[]) buf[60])[0] = rslt.getShort(61);
               ((String[]) buf[61])[0] = rslt.getString(62, 12);
               ((short[]) buf[62])[0] = rslt.getShort(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 20);
               ((String[]) buf[64])[0] = rslt.getString(65, 20);
               ((byte[]) buf[65])[0] = rslt.getByte(66);
               ((String[]) buf[66])[0] = rslt.getString(67, 3);
               ((int[]) buf[67])[0] = rslt.getInt(68);
               ((short[]) buf[68])[0] = rslt.getShort(69);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(70);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(72);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(73);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 29 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 4);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 2);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 25);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 26);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(30,3);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 20);
               ((String[]) buf[41])[0] = rslt.getString(38, 10);
               ((java.util.Date[]) buf[42])[0] = GXutil.resetDate(rslt.getGXDateTime(39));
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(40,2);
               ((int[]) buf[44])[0] = rslt.getInt(41);
               ((String[]) buf[45])[0] = rslt.getString(42, 1);
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(43);
               ((String[]) buf[47])[0] = rslt.getString(44, 5);
               ((String[]) buf[48])[0] = rslt.getString(45, 20);
               ((String[]) buf[49])[0] = rslt.getString(46, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(47, 1);
               ((String[]) buf[52])[0] = rslt.getString(48, 20);
               ((String[]) buf[53])[0] = rslt.getString(49, 20);
               ((String[]) buf[54])[0] = rslt.getVarchar(50);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(51,2);
               ((String[]) buf[56])[0] = rslt.getString(52, 13);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(54,2);
               ((String[]) buf[59])[0] = rslt.getString(55, 10);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(56,2);
               ((String[]) buf[61])[0] = rslt.getString(57, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(58, 40);
               ((String[]) buf[64])[0] = rslt.getString(59, 30);
               ((String[]) buf[65])[0] = rslt.getString(60, 30);
               ((String[]) buf[66])[0] = rslt.getString(61, 12);
               ((String[]) buf[67])[0] = rslt.getString(62, 20);
               ((String[]) buf[68])[0] = rslt.getString(63, 20);
               ((String[]) buf[69])[0] = rslt.getString(64, 10);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(65,2);
               ((short[]) buf[71])[0] = rslt.getShort(66);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(67,2);
               ((short[]) buf[73])[0] = rslt.getShort(68);
               ((short[]) buf[74])[0] = rslt.getShort(69);
               ((String[]) buf[75])[0] = rslt.getString(70, 12);
               ((short[]) buf[76])[0] = rslt.getShort(71);
               ((String[]) buf[77])[0] = rslt.getString(72, 20);
               ((String[]) buf[78])[0] = rslt.getString(73, 20);
               ((byte[]) buf[79])[0] = rslt.getByte(74);
               ((String[]) buf[80])[0] = rslt.getString(75, 1);
               ((String[]) buf[81])[0] = rslt.getString(76, 3);
               ((int[]) buf[82])[0] = rslt.getInt(77);
               ((short[]) buf[83])[0] = rslt.getShort(78);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(79);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(81);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((byte[]) buf[91])[0] = rslt.getByte(82);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               return;
            case 51 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 53 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 54 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 58 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
               return;
            case 22 :
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
            case 23 :
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
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setString(9, (String)parms[9], 10);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(12, (String)parms[12], 4);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 2);
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setString(21, (String)parms[21], 20);
               stmt.setByte(22, ((Number) parms[22]).byteValue());
               stmt.setString(23, (String)parms[23], 26);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 3);
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setShort(26, ((Number) parms[26]).shortValue());
               stmt.setShort(27, ((Number) parms[27]).shortValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[28], 5);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[29], 2);
               stmt.setByte(30, ((Number) parms[30]).byteValue());
               stmt.setString(31, (String)parms[31], 20);
               stmt.setString(32, (String)parms[32], 10);
               stmt.setDateTime(33, (java.util.Date)parms[33], true);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setInt(35, ((Number) parms[35]).intValue());
               stmt.setString(36, (String)parms[36], 1);
               stmt.setDate(37, (java.util.Date)parms[37]);
               stmt.setString(38, (String)parms[38], 5);
               stmt.setString(39, (String)parms[39], 20);
               stmt.setString(40, (String)parms[40], 1);
               stmt.setString(41, (String)parms[41], 20);
               stmt.setString(42, (String)parms[42], 20);
               stmt.setVarchar(43, (String)parms[43], 60, false);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[44], 2);
               stmt.setString(45, (String)parms[45], 13);
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[46], 2);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[47], 2);
               stmt.setString(48, (String)parms[48], 10);
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[49], 2);
               stmt.setString(50, (String)parms[50], 40);
               stmt.setString(51, (String)parms[51], 30);
               stmt.setString(52, (String)parms[52], 30);
               stmt.setString(53, (String)parms[53], 12);
               stmt.setString(54, (String)parms[54], 20);
               stmt.setString(55, (String)parms[55], 20);
               stmt.setString(56, (String)parms[56], 10);
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[57], 2);
               stmt.setShort(58, ((Number) parms[58]).shortValue());
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[59], 2);
               stmt.setShort(60, ((Number) parms[60]).shortValue());
               stmt.setShort(61, ((Number) parms[61]).shortValue());
               stmt.setString(62, (String)parms[62], 12);
               stmt.setShort(63, ((Number) parms[63]).shortValue());
               stmt.setString(64, (String)parms[64], 20);
               stmt.setString(65, (String)parms[65], 20);
               stmt.setByte(66, ((Number) parms[66]).byteValue());
               stmt.setString(67, (String)parms[67], 3);
               stmt.setInt(68, ((Number) parms[68]).intValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[74]).shortValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[76]).shortValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(73, ((Number) parms[78]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 2);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setString(20, (String)parms[19], 20);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setString(22, (String)parms[21], 26);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 3);
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 5);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 2);
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setString(30, (String)parms[29], 20);
               stmt.setString(31, (String)parms[30], 10);
               stmt.setDateTime(32, (java.util.Date)parms[31], true);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 2);
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setString(35, (String)parms[34], 1);
               stmt.setDate(36, (java.util.Date)parms[35]);
               stmt.setString(37, (String)parms[36], 5);
               stmt.setString(38, (String)parms[37], 20);
               stmt.setString(39, (String)parms[38], 1);
               stmt.setString(40, (String)parms[39], 20);
               stmt.setString(41, (String)parms[40], 20);
               stmt.setVarchar(42, (String)parms[41], 60, false);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 2);
               stmt.setString(44, (String)parms[43], 13);
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[44], 2);
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[45], 2);
               stmt.setString(47, (String)parms[46], 10);
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[47], 2);
               stmt.setString(49, (String)parms[48], 40);
               stmt.setString(50, (String)parms[49], 30);
               stmt.setString(51, (String)parms[50], 30);
               stmt.setString(52, (String)parms[51], 12);
               stmt.setString(53, (String)parms[52], 20);
               stmt.setString(54, (String)parms[53], 20);
               stmt.setString(55, (String)parms[54], 10);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[55], 2);
               stmt.setShort(57, ((Number) parms[56]).shortValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[57], 2);
               stmt.setShort(59, ((Number) parms[58]).shortValue());
               stmt.setShort(60, ((Number) parms[59]).shortValue());
               stmt.setString(61, (String)parms[60], 12);
               stmt.setShort(62, ((Number) parms[61]).shortValue());
               stmt.setString(63, (String)parms[62], 20);
               stmt.setString(64, (String)parms[63], 20);
               stmt.setByte(65, ((Number) parms[64]).byteValue());
               stmt.setInt(66, ((Number) parms[65]).intValue());
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[73]).shortValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(71, ((Number) parms[75]).byteValue());
               }
               stmt.setString(72, (String)parms[76], 3);
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(73, ((Number) parms[78]).intValue());
               }
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
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               return;
            case 49 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 60);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
      }
   }

}

