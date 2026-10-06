package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet1_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_1OY7( Gx_mode, A396EmprCod, A44AlbRecCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_1OY7( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV137Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV137Pgmname", AV137Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV29Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
         AV84Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Inc_obs", AV84Inc_obs);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A5806AlbREnt2 = httpContext.GetPar( "AlbREnt2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         AV83OldAlb2 = httpContext.GetPar( "OldAlb2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_1OY7( A396EmprCod, AV137Pgmname, AV8UsurCod, AV29Station, AV84Inc_obs, A44AlbRecCod, A5806AlbREnt2, AV83OldAlb2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         AV69SiArt = (byte)(GXutil.lval( httpContext.GetPar( "SiArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69SiArt", GXutil.str( AV69SiArt, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_1OY7( A396EmprCod, A252CliCod, A45AlbRef, AV69SiArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1OY7( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A279CliNom = httpContext.GetPar( "CliNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1OY0( A396EmprCod, A279CliNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBREF") == 0 )
      {
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbref1OY0( A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROCECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A971ProceNom = httpContext.GetPar( "ProceNom") ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprocecod1OY0( A396EmprCod, A971ProceNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A841TrnNom = httpContext.GetPar( "TrnNom") ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1OY0( A396EmprCod, A841TrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPENTCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1212TipEntNom = httpContext.GetPar( "TipEntNom") ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipentcod1OY0( A396EmprCod, A1212TipEntNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A279CliNom = httpContext.GetPar( "CliNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1OY0( A396EmprCod, A279CliNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h252CliCod = httpContext.GetPar( "h252CliCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaclicod1OY7( A396EmprCod, h252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROCECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A971ProceNom = httpContext.GetPar( "ProceNom") ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprocecod1OY0( A396EmprCod, A971ProceNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PROCECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h970ProceCod = httpContext.GetPar( "h970ProceCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprocecod1OY7( A396EmprCod, h970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A841TrnNom = httpContext.GetPar( "TrnNom") ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1OY0( A396EmprCod, A841TrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1OY7( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPENTCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1212TipEntNom = httpContext.GetPar( "TipEntNom") ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipentcod1OY0( A396EmprCod, A1212TipEntNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPENTCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h1211TipEntCod = httpContext.GetPar( "h1211TipEntCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatipentcod1OY7( A396EmprCod, h1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"") == 0 )
      {
         AV79Enc20c = (byte)(GXutil.lval( httpContext.GetPar( "Enc20c"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Enc20c", GXutil.str( AV79Enc20c, 1, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa461OY7( AV79Enc20c, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel25"+"_"+"") == 0 )
      {
         AV79Enc20c = (byte)(GXutil.lval( httpContext.GetPar( "Enc20c"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Enc20c", GXutil.str( AV79Enc20c, 1, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa58061OY7( AV79Enc20c, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"vERRP") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx35asaerrp1OY7( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_70( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_71( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_72( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_73") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_73( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV123EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123EmprCod", AV123EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123EmprCod, "@!"))));
            AV124AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV124AlbRecCod), "ZZZZZZZ9")));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public talbdet1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdet1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet1_impl.class ));
   }

   public talbdet1_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrent_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrent_Internalname, httpContext.getMessage( "N Albaran", ""), "", "", lblTextblockalbrent_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrent2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrent2_Internalname, httpContext.getMessage( "N Albaran", ""), "", "", lblTextblockalbrent2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrfen_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrfen_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblockalbrfen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrhen_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrhen_Internalname, httpContext.getMessage( "Hora", ""), "", "", lblTextblockalbrhen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRHEn_Internalname, httpContext.getMessage( "Hora de entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRHEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRHEn_Internalname, localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRHEn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRHEn_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRHEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRHEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable2_Internalname, tblTablemergedunnamedtable2_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.rtrim( h252CliCod), GXutil.rtrim( localUtil.format( h252CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbref_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbref_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "", "", lblTextblockalbref_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrefdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrefdsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "", "", lblTextblockalbrefdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
      ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
      ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
      ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
      ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
      ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
      ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
      ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
      ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
      ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
      ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprocecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocecod_Internalname, httpContext.getMessage( "Procedencia", ""), "", "", lblTextblockprocecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceCod_Internalname, httpContext.getMessage( "Codigo Procedencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.rtrim( h970ProceCod), GXutil.rtrim( localUtil.format( h970ProceCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.rtrim( h840TrnCod), GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable4_Internalname, tblTablemergedunnamedtable4_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunient_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunient_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblockalbrunient_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruni_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockalbruni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "", true, (byte)(0), "HLP_TALBDET1.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpieent_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpieent_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblockalbrpieent_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunic_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunic_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "", "", lblTextblockalbrunic_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiec_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiec_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "", "", lblTextblockalbrpiec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumM_Internalname, httpContext.getMessage( "Nº Marcado", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
      ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
      ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
      ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
      ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
      ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
      ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
      ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
      ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
      ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
      ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruniuti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruniuti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblockalbruniuti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunidis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunidis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblockalbrunidis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpieuti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpieuti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblockalbrpieuti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiedis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiedis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblockalbrpiedis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrfecult_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrfecult_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "", "", lblTextblockalbrfecult_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrest_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrest_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblockalbrest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDET1.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable6_Internalname, tblTablemergedunnamedtable6_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
      ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
      ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
      ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
      ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
      ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
      ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
      ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
      ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
      ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
      ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletipentcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipentcod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "", "", lblTextblocktipentcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipEntCod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 248,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.rtrim( h1211TipEntCod), GXutil.rtrim( localUtil.format( h1211TipEntCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,248);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipEntCod_Enabled, 1, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrdes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrdes_Internalname, httpContext.getMessage( "Destino", ""), "", "", lblTextblockalbrdes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrlote_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrlote_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblockalbrlote_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
      ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
      ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
      ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
      ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
      ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
      ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
      ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
      ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
      ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
      ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable7_Internalname, tblUnnamedtable7_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrloc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrloc_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblockalbrloc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrreo_Internalname, httpContext.getMessage( "Reclamacion?", ""), "", "", lblTextblockalbrreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 287,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,287);\"", "", true, (byte)(0), "HLP_TALBDET1.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable8_Internalname, tblTablemergedunnamedtable8_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable8.setProperty("Width", Dvpanel_unnamedtable8_Width);
      ucDvpanel_unnamedtable8.setProperty("AutoWidth", Dvpanel_unnamedtable8_Autowidth);
      ucDvpanel_unnamedtable8.setProperty("AutoHeight", Dvpanel_unnamedtable8_Autoheight);
      ucDvpanel_unnamedtable8.setProperty("Cls", Dvpanel_unnamedtable8_Cls);
      ucDvpanel_unnamedtable8.setProperty("Title", Dvpanel_unnamedtable8_Title);
      ucDvpanel_unnamedtable8.setProperty("Collapsible", Dvpanel_unnamedtable8_Collapsible);
      ucDvpanel_unnamedtable8.setProperty("Collapsed", Dvpanel_unnamedtable8_Collapsed);
      ucDvpanel_unnamedtable8.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable8_Showcollapseicon);
      ucDvpanel_unnamedtable8.setProperty("IconPosition", Dvpanel_unnamedtable8_Iconposition);
      ucDvpanel_unnamedtable8.setProperty("AutoScroll", Dvpanel_unnamedtable8_Autoscroll);
      ucDvpanel_unnamedtable8.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable8_Internalname, "DVPANEL_UNNAMEDTABLE8Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE8Container"+"UnnamedTable8"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable8_Internalname, tblUnnamedtable8_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrgrm2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrgrm2_Internalname, httpContext.getMessage( "Grm2", ""), "", "", lblTextblockalbrgrm2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbranc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbranc_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblockalbranc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbpml_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbpml_Internalname, httpContext.getMessage( "Pml", ""), "", "", lblTextblockalbpml_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 322,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,322);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
      ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
      ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
      ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
      ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
      ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
      ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
      ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
      ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
      ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
      ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable9_Internalname, tblUnnamedtable9_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrph_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrph_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "", "", lblTextblockalbrph_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPh_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 337,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPh_Internalname, GXutil.ltrim( localUtil.ntoc( A13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPh_Enabled!=0) ? localUtil.format( A13241AlbRPh, "ZZ9.99") : localUtil.format( A13241AlbRPh, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,337);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrrlong_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrrlong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "", "", lblTextblockalbrrlong_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRLong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 345,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRLong_Enabled!=0) ? localUtil.format( A13242AlbRRLong, "ZZ9.99") : localUtil.format( A13242AlbRRLong, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,345);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRLong_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRLong_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrrtrans_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrrtrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "", "", lblTextblockalbrrtrans_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRTrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 353,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRTrans_Internalname, GXutil.ltrim( localUtil.ntoc( A13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRTrans_Enabled!=0) ? localUtil.format( A13243AlbRRTrans, "ZZ9.99") : localUtil.format( A13243AlbRRTrans, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,353);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRTrans_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRTrans_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 358,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 360,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 362,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111OY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
            Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
            Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
            Z4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "Z4606AlbRHEn"), 0) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
            Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
            Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z13241AlbRPh = localUtil.ctond( httpContext.cgiGet( "Z13241AlbRPh")) ;
            Z13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( "Z13242AlbRRLong")) ;
            Z13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( "Z13243AlbRRTrans")) ;
            Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
            Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            Z10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10761AlbUltP = false ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7501AlbRecSec = false ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5806AlbREnt2 = httpContext.cgiGet( "O5806AlbREnt2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "N970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Modo = httpContext.cgiGet( "MODO") ;
            AV123EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV124AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV109Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV110Insert_ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCPROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV111Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV112Insert_TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV79Enc20c = (byte)(localUtil.ctol( httpContext.cgiGet( "vENC20C"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Modo = httpContext.cgiGet( "vMODO") ;
            AV90Termilenio = (byte)(localUtil.ctol( httpContext.cgiGet( "vTERMILENIO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbCum = httpContext.cgiGet( "vALBCUM") ;
            AV41FlagKgs = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42FlagMts = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGMTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV83OldAlb2 = httpContext.cgiGet( "vOLDALB2") ;
            AV67ErrP = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV84Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV51FlagArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV49Rdto = localUtil.ctond( httpContext.cgiGet( "vRDTO")) ;
            AV50Pesoml = (short)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV100Anc = (short)(localUtil.ctol( httpContext.cgiGet( "vANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV101grm2 = (short)(localUtil.ctol( httpContext.cgiGet( "vGRM2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV137Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV29Station = httpContext.cgiGet( "vSTATION") ;
            AV68ErrArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV89artblo = httpContext.cgiGet( "vARTBLO") ;
            AV72Flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66Tintatex = (byte)(localUtil.ctol( httpContext.cgiGet( "vTINTATEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV69SiArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vSIART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80Velluts = (byte)(localUtil.ctol( httpContext.cgiGet( "vVELLUTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEREB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "ALBRUNIREB")) ;
            A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "ALBULTP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRECSEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "ALBNUMETI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            Dvpanel_unnamedtable3_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Objectcall") ;
            Dvpanel_unnamedtable3_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Class") ;
            Dvpanel_unnamedtable3_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Enabled")) ;
            Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
            Dvpanel_unnamedtable3_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Height") ;
            Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
            Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
            Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
            Dvpanel_unnamedtable3_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showheader")) ;
            Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
            Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
            Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
            Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
            Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
            Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
            Dvpanel_unnamedtable3_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Visible")) ;
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
            Dvpanel_unnamedtable5_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Objectcall") ;
            Dvpanel_unnamedtable5_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Class") ;
            Dvpanel_unnamedtable5_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Enabled")) ;
            Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
            Dvpanel_unnamedtable5_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Height") ;
            Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
            Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
            Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
            Dvpanel_unnamedtable5_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showheader")) ;
            Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
            Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
            Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
            Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
            Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
            Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
            Dvpanel_unnamedtable5_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Visible")) ;
            Dvpanel_unnamedtable6_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Objectcall") ;
            Dvpanel_unnamedtable6_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Class") ;
            Dvpanel_unnamedtable6_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Enabled")) ;
            Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
            Dvpanel_unnamedtable6_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Height") ;
            Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
            Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
            Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
            Dvpanel_unnamedtable6_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showheader")) ;
            Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
            Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
            Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
            Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
            Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
            Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
            Dvpanel_unnamedtable6_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Visible")) ;
            Dvpanel_unnamedtable7_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Objectcall") ;
            Dvpanel_unnamedtable7_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Class") ;
            Dvpanel_unnamedtable7_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Enabled")) ;
            Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
            Dvpanel_unnamedtable7_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Height") ;
            Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
            Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
            Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
            Dvpanel_unnamedtable7_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showheader")) ;
            Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
            Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
            Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
            Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
            Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
            Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
            Dvpanel_unnamedtable7_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Visible")) ;
            Dvpanel_unnamedtable8_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Objectcall") ;
            Dvpanel_unnamedtable8_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Class") ;
            Dvpanel_unnamedtable8_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Enabled")) ;
            Dvpanel_unnamedtable8_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Width") ;
            Dvpanel_unnamedtable8_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Height") ;
            Dvpanel_unnamedtable8_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autowidth")) ;
            Dvpanel_unnamedtable8_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoheight")) ;
            Dvpanel_unnamedtable8_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Cls") ;
            Dvpanel_unnamedtable8_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showheader")) ;
            Dvpanel_unnamedtable8_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Title") ;
            Dvpanel_unnamedtable8_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsible")) ;
            Dvpanel_unnamedtable8_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsed")) ;
            Dvpanel_unnamedtable8_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showcollapseicon")) ;
            Dvpanel_unnamedtable8_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Iconposition") ;
            Dvpanel_unnamedtable8_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoscroll")) ;
            Dvpanel_unnamedtable8_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Visible")) ;
            Dvpanel_unnamedtable9_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Objectcall") ;
            Dvpanel_unnamedtable9_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Class") ;
            Dvpanel_unnamedtable9_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Enabled")) ;
            Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
            Dvpanel_unnamedtable9_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Height") ;
            Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
            Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
            Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
            Dvpanel_unnamedtable9_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showheader")) ;
            Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
            Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
            Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
            Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
            Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
            Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
            Dvpanel_unnamedtable9_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Visible")) ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRFen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A49AlbRFen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            else
            {
               A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbRHEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBRHEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRHEn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
               n4606AlbRHEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname)) ;
               n4606AlbRHEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            h970ProceCod = httpContext.cgiGet( edtProceCod_Internalname) ;
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrUniC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6180AlbrUniC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            else
            {
               A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrPieC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6181AlbrPieC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            else
            {
               A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            h1211TipEntCod = httpContext.cgiGet( edtTipEntCod_Internalname) ;
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4920AlbRGrm2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            else
            {
               A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4921AlbRAnc = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            else
            {
               A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPML");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPml_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4922AlbPml = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            else
            {
               A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13241AlbRPh = DecimalUtil.ZERO ;
               n13241AlbRPh = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            }
            else
            {
               A13241AlbRPh = localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)) ;
               n13241AlbRPh = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRRLONG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRRLong_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13242AlbRRLong = DecimalUtil.ZERO ;
               n13242AlbRRLong = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            }
            else
            {
               A13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)) ;
               n13242AlbRRLong = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRRTRANS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRRTrans_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13243AlbRRTrans = DecimalUtil.ZERO ;
               n13243AlbRRTrans = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            }
            else
            {
               A13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)) ;
               n13243AlbRRTrans = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET1");
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            forbiddenHiddens.add("AlbRUniUti", localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV37Modo, "")));
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            forbiddenHiddens.add("AlbRUniEnt", localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"));
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            forbiddenHiddens.add("AlbRPieEnt", localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"));
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            forbiddenHiddens.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
            forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbUltP", localUtil.format( DecimalUtil.doubleToDec(A10761AlbUltP), "ZZZ9"));
            forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
            forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            forbiddenHiddens.add("AlbREst", localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("talbdet1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode7 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode7 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound7 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1OY0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBRECCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111OY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121OY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
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
         e121OY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1OY7( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
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

   public void disable_std_buttons( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1OY7( ) ;
      }
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_1OY0( )
   {
      beforeValidate1OY7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OY7( ) ;
         }
         else
         {
            checkExtendedTable1OY7( ) ;
            closeExtendedTableCursors1OY7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1OY0( )
   {
   }

   public void e111OY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdet1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdet1_impl.this.A396EmprCod = GXv_char2[0] ;
      talbdet1_impl.this.AV7EmprNom = GXv_char3[0] ;
      talbdet1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV41FlagKgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41FlagKgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagKgs", GXutil.str( AV41FlagKgs, 1, 0));
      GXt_int5 = AV42FlagMts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42FlagMts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42FlagMts", GXutil.str( AV42FlagMts, 1, 0));
      GXt_int5 = AV44FlagGraf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRAFIC", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44FlagGraf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44FlagGraf", GXutil.str( AV44FlagGraf, 1, 0));
      GXt_int5 = AV48SumPza ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUMPZA", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48SumPza = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48SumPza", GXutil.str( AV48SumPza, 1, 0));
      GXt_int5 = AV52CalMKT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALMKT", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV52CalMKT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52CalMKT", GXutil.str( AV52CalMKT, 1, 0));
      GXt_int5 = AV57Artextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57Artextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Artextil", GXutil.str( AV57Artextil, 1, 0));
      GXt_int5 = (byte)(AV59f_NOTREC) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV59f_NOTREC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59f_NOTREC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59f_NOTREC), 10, 0));
      GXt_int5 = AV61NoPzaR ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPZRP", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV61NoPzaR = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61NoPzaR", GXutil.str( AV61NoPzaR, 1, 0));
      GXt_int5 = AV66Tintatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV66Tintatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Tintatex", GXutil.str( AV66Tintatex, 1, 0));
      GXt_int5 = AV69SiArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIART", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV69SiArt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69SiArt", GXutil.str( AV69SiArt, 1, 0));
      GXt_int5 = AV73Noctrlpz ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCTRLP", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73Noctrlpz = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Noctrlpz", GXutil.str( AV73Noctrlpz, 1, 0));
      GXt_int5 = AV74VerItm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITM000", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV74VerItm = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74VerItm", GXutil.str( AV74VerItm, 1, 0));
      GXt_int5 = AV79Enc20c ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV79Enc20c = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Enc20c", GXutil.str( AV79Enc20c, 1, 0));
      GXt_int5 = AV80Velluts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV80Velluts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Velluts", GXutil.str( AV80Velluts, 1, 0));
      GXt_int5 = AV85Colorsol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV85Colorsol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Colorsol", GXutil.str( AV85Colorsol, 1, 0));
      GXt_int5 = AV88PesSim ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PESSIM", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV88PesSim = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88PesSim", GXutil.str( AV88PesSim, 1, 0));
      GXt_int5 = AV90Termilenio ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV90Termilenio = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Termilenio", GXutil.str( AV90Termilenio, 1, 0));
      GXt_int5 = AV91stamperia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV91stamperia = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91stamperia", GXutil.str( AV91stamperia, 1, 0));
      GXt_int5 = AV94Piolera ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV94Piolera = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Piolera", GXutil.str( AV94Piolera, 1, 0));
      GXt_int5 = AV95tintoriente ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORIENT", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95tintoriente = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95tintoriente", GXutil.str( AV95tintoriente, 1, 0));
      GXt_int5 = AV98Estampamos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV98Estampamos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Estampamos", GXutil.str( AV98Estampamos, 1, 0));
      GXt_int5 = AV103biarprint ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV103biarprint = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103biarprint", GXutil.str( AV103biarprint, 1, 0));
      GXt_int5 = AV96UbicaL ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV96UbicaL = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96UbicaL", GXutil.str( AV96UbicaL, 1, 0));
      GXt_int7 = AV99ValorUbica ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int8) ;
      talbdet1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV99ValorUbica = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99ValorUbica", GXutil.str( AV99ValorUbica, 1, 0));
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      talbdet1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV123EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      talbdet1_impl.this.AV123EmprCod = GXv_char4[0] ;
      talbdet1_impl.this.AV7EmprNom = GXv_char3[0] ;
      talbdet1_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123EmprCod", AV123EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext9[0] = AV106WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV106WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV107TrnContext.fromxml(AV108WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV107TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV137Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV138GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138GXV1), 8, 0));
         while ( AV138GXV1 <= AV107TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV113TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV107TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV138GXV1));
            if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV109Insert_CliCod = (int)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProceCod") == 0 )
            {
               AV110Insert_ProceCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV110Insert_ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110Insert_ProceCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV111Insert_TrnCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV111Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipEntCod") == 0 )
            {
               AV112Insert_TipEntCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV112Insert_TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112Insert_TipEntCod), 4, 0));
            }
            AV138GXV1 = (int)(AV138GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138GXV1), 8, 0));
         }
      }
   }

   public void e121OY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      new app.pprueba5(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      talbdet1_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet1_impl.this.A44AlbRecCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV107TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.talbdet1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbrent_cell_Class = "DataContentCell DscTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      divAlbrent2_cell_Class = "DataContentCell DscTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
   }

   public void zm1OY7( int GX_JID )
   {
      if ( ( GX_JID == 68 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5806AlbREnt2 = T01OY3_A5806AlbREnt2[0] ;
            Z46AlbREnt = T01OY3_A46AlbREnt[0] ;
            Z56AlbRUni = T01OY3_A56AlbRUni[0] ;
            Z3613AlbRefDsc = T01OY3_A3613AlbRefDsc[0] ;
            Z49AlbRFen = T01OY3_A49AlbRFen[0] ;
            Z4606AlbRHEn = T01OY3_A4606AlbRHEn[0] ;
            Z45AlbRef = T01OY3_A45AlbRef[0] ;
            Z1291AlbRDes = T01OY3_A1291AlbRDes[0] ;
            Z58AlbRUniEnt = T01OY3_A58AlbRUniEnt[0] ;
            Z52AlbRPieEnt = T01OY3_A52AlbRPieEnt[0] ;
            Z50AlbRLoc = T01OY3_A50AlbRLoc[0] ;
            Z55AlbRReo = T01OY3_A55AlbRReo[0] ;
            Z54AlbRPieUti = T01OY3_A54AlbRPieUti[0] ;
            Z60AlbRUniUti = T01OY3_A60AlbRUniUti[0] ;
            Z48AlbRFecUlt = T01OY3_A48AlbRFecUlt[0] ;
            Z6180AlbrUniC = T01OY3_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T01OY3_A6181AlbrPieC[0] ;
            Z4920AlbRGrm2 = T01OY3_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T01OY3_A4921AlbRAnc[0] ;
            Z4922AlbPml = T01OY3_A4922AlbPml[0] ;
            Z6463AlbRLote = T01OY3_A6463AlbRLote[0] ;
            Z13241AlbRPh = T01OY3_A13241AlbRPh[0] ;
            Z13242AlbRRLong = T01OY3_A13242AlbRRLong[0] ;
            Z13243AlbRRTrans = T01OY3_A13243AlbRRTrans[0] ;
            Z8029AlbNumM = T01OY3_A8029AlbNumM[0] ;
            Z53AlbRPieReb = T01OY3_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T01OY3_A59AlbRUniReb[0] ;
            Z10761AlbUltP = T01OY3_A10761AlbUltP[0] ;
            Z7501AlbRecSec = T01OY3_A7501AlbRecSec[0] ;
            Z1222AlbNumEti = T01OY3_A1222AlbNumEti[0] ;
            Z47AlbREst = T01OY3_A47AlbREst[0] ;
            Z252CliCod = T01OY3_A252CliCod[0] ;
            Z840TrnCod = T01OY3_A840TrnCod[0] ;
            Z970ProceCod = T01OY3_A970ProceCod[0] ;
            Z1211TipEntCod = T01OY3_A1211TipEntCod[0] ;
         }
         else
         {
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z46AlbREnt = A46AlbREnt ;
            Z56AlbRUni = A56AlbRUni ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z49AlbRFen = A49AlbRFen ;
            Z4606AlbRHEn = A4606AlbRHEn ;
            Z45AlbRef = A45AlbRef ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z55AlbRReo = A55AlbRReo ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z13241AlbRPh = A13241AlbRPh ;
            Z13242AlbRRLong = A13242AlbRRLong ;
            Z13243AlbRRTrans = A13243AlbRRTrans ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z10761AlbUltP = A10761AlbUltP ;
            Z7501AlbRecSec = A7501AlbRecSec ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z47AlbREst = A47AlbREst ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
         }
      }
      if ( GX_JID == -68 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z46AlbREnt = A46AlbREnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z49AlbRFen = A49AlbRFen ;
         Z4606AlbRHEn = A4606AlbRHEn ;
         Z45AlbRef = A45AlbRef ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z55AlbRReo = A55AlbRReo ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z13241AlbRPh = A13241AlbRPh ;
         Z13242AlbRRLong = A13242AlbRRLong ;
         Z13243AlbRRTrans = A13243AlbRRTrans ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z10761AlbUltP = A10761AlbUltP ;
         Z7501AlbRecSec = A7501AlbRecSec ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z47AlbREst = A47AlbREst ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z971ProceNom = A971ProceNom ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      AV137Pgmname = "TALBDET1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137Pgmname", AV137Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV123EmprCod)==0) )
      {
         A396EmprCod = AV123EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01OY4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OY4_A407EmprNom[0] ;
      n407EmprNom = T01OY4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 0 ) ) )
      {
         divAlbrent_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 0 )
         {
            divAlbrent_cell_Class = httpContext.getMessage( "DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbrent2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbrent2_cell_Class = httpContext.getMessage( "DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
         }
      }
      if ( ! (0==AV124AlbRecCod) )
      {
         A44AlbRecCod = AV124AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV124AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV124AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt_Visible = ((AV79Enc20c==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt2_Visible = AV79Enc20c ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV109Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV110Insert_ProceCod) )
      {
         edtProceCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProceCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV111Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV112Insert_TipEntCod) )
      {
         edtTipEntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipEntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV37Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV37Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV37Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV112Insert_TipEntCod) )
      {
         A1211TipEntCod = AV112Insert_TipEntCod ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         /* Using cursor T01OY9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         h1211TipEntCod = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            h1211TipEntCod = T01OY9_A1212TipEntNom[0] ;
            n1212TipEntNom = T01OY9_n1212TipEntNom[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV111Insert_TrnCod) )
      {
         A840TrnCod = AV111Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01OY10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(8) != 101) )
         {
            h840TrnCod = T01OY10_A841TrnNom[0] ;
            n841TrnNom = T01OY10_n841TrnNom[0] ;
            if (true) break;
         }
         pr_default.close(8);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV110Insert_ProceCod) )
      {
         A970ProceCod = AV110Insert_ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         /* Using cursor T01OY11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         h970ProceCod = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h970ProceCod = T01OY11_A971ProceNom[0] ;
            n971ProceNom = T01OY11_n971ProceNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV109Insert_CliCod) )
      {
         A252CliCod = AV109Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         /* Using cursor T01OY12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         h252CliCod = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h252CliCod = T01OY12_A279CliNom[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      }
      if ( AV79Enc20c == 0 )
      {
         A5806AlbREnt2 = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      }
      if ( isIns( )  && ( AV41FlagKgs == 1 ) )
      {
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      else
      {
         if ( isIns( )  && ( AV42FlagMts == 1 ) )
         {
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         }
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4606AlbRHEn) && ( Gx_BScreen == 0 ) )
      {
         A4606AlbRHEn = GXutil.now( ) ;
         n4606AlbRHEn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01OY8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01OY8_A1212TipEntNom[0] ;
         n1212TipEntNom = T01OY8_n1212TipEntNom[0] ;
         pr_default.close(6);
         /* Using cursor T01OY6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01OY6_A841TrnNom[0] ;
         n841TrnNom = T01OY6_n841TrnNom[0] ;
         pr_default.close(4);
         /* Using cursor T01OY7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01OY7_A971ProceNom[0] ;
         n971ProceNom = T01OY7_n971ProceNom[0] ;
         pr_default.close(5);
         if ( ( AV66Tintatex == 1 ) && true /* After */ )
         {
            GXt_int5 = AV67ErrP ;
            GXv_char4[0] = " " ;
            GXv_int6[0] = GXt_int5 ;
            new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char4, GXv_int6) ;
            talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
            AV67ErrP = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
         }
         /* Using cursor T01OY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01OY5_A279CliNom[0] ;
         pr_default.close(3);
         AV83OldAlb2 = O5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
         if ( A47AlbREst == 1 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
            }
         }
         if ( ( AV79Enc20c == 1 ) && ( AV90Termilenio == 0 ) )
         {
            A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         }
      }
   }

   public void load1OY7( )
   {
      /* Using cursor T01OY13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A5806AlbREnt2 = T01OY13_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A46AlbREnt = T01OY13_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A56AlbRUni = T01OY13_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A3613AlbRefDsc = T01OY13_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A407EmprNom = T01OY13_A407EmprNom[0] ;
         n407EmprNom = T01OY13_n407EmprNom[0] ;
         A49AlbRFen = T01OY13_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T01OY13_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T01OY13_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A279CliNom = T01OY13_A279CliNom[0] ;
         A45AlbRef = T01OY13_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A971ProceNom = T01OY13_A971ProceNom[0] ;
         n971ProceNom = T01OY13_n971ProceNom[0] ;
         A841TrnNom = T01OY13_A841TrnNom[0] ;
         n841TrnNom = T01OY13_n841TrnNom[0] ;
         A1212TipEntNom = T01OY13_A1212TipEntNom[0] ;
         n1212TipEntNom = T01OY13_n1212TipEntNom[0] ;
         A1291AlbRDes = T01OY13_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A58AlbRUniEnt = T01OY13_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01OY13_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A50AlbRLoc = T01OY13_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01OY13_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01OY13_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = T01OY13_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A48AlbRFecUlt = T01OY13_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T01OY13_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01OY13_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T01OY13_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01OY13_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01OY13_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T01OY13_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T01OY13_A13241AlbRPh[0] ;
         n13241AlbRPh = T01OY13_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T01OY13_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T01OY13_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T01OY13_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T01OY13_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T01OY13_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T01OY13_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01OY13_A59AlbRUniReb[0] ;
         A10761AlbUltP = T01OY13_A10761AlbUltP[0] ;
         n10761AlbUltP = T01OY13_n10761AlbUltP[0] ;
         A7501AlbRecSec = T01OY13_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T01OY13_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T01OY13_A1222AlbNumEti[0] ;
         A47AlbREst = T01OY13_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A252CliCod = T01OY13_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01OY13_A840TrnCod[0] ;
         n840TrnCod = T01OY13_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01OY13_A970ProceCod[0] ;
         n970ProceCod = T01OY13_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01OY13_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY13_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         zm1OY7( -68) ;
      }
      pr_default.close(11);
      onLoadActions1OY7( ) ;
   }

   public void onLoadActions1OY7( )
   {
      if ( ( AV79Enc20c == 1 ) && ( AV90Termilenio == 0 ) )
      {
         A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      AV83OldAlb2 = O5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
      if ( ( AV66Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV67ErrP ;
         GXv_char4[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char4, GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         AV67ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( A47AlbREst == 1 )
      {
         AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
         }
      }
      h252CliCod = A279CliNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      h970ProceCod = A971ProceNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
      h840TrnCod = A841TrnNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      h1211TipEntCod = A1212TipEntNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
   }

   public void checkExtendedTable1OY7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A279CliNom = h252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         /* Using cursor T01OY14 */
         pr_default.execute(12, new Object[] {A279CliNom, A396EmprCod});
         A396EmprCod = T01OY14_A396EmprCod[0] ;
         A252CliCod = T01OY14_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01OY14_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h970ProceCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A971ProceNom = h970ProceCod ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         /* Using cursor T01OY15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n971ProceNom), A971ProceNom, A396EmprCod});
         A396EmprCod = T01OY15_A396EmprCod[0] ;
         A970ProceCod = T01OY15_A970ProceCod[0] ;
         n970ProceCod = T01OY15_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A970ProceCod = T01OY15_A970ProceCod[0] ;
         n970ProceCod = T01OY15_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         /* Using cursor T01OY16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A396EmprCod = T01OY16_A396EmprCod[0] ;
         A840TrnCod = T01OY16_A840TrnCod[0] ;
         n840TrnCod = T01OY16_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01OY16_A840TrnCod[0] ;
         n840TrnCod = T01OY16_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A1211TipEntCod = (short)(0) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A1212TipEntNom = h1211TipEntCod ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         /* Using cursor T01OY17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n1212TipEntNom), A1212TipEntNom, A396EmprCod});
         A396EmprCod = T01OY17_A396EmprCod[0] ;
         A1211TipEntCod = T01OY17_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY17_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A1211TipEntCod = T01OY17_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY17_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "TIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
      if ( ( AV79Enc20c == 1 ) && ( AV90Termilenio == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV83OldAlb2 = O5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Referencia es requerido.", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_int6[0] = AV51FlagArt ;
         GXv_decimal10[0] = AV49Rdto ;
         GXv_int11[0] = AV50Pesoml ;
         GXv_int12[0] = AV100Anc ;
         GXv_int13[0] = AV101grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6, GXv_decimal10, GXv_int11, GXv_int12, GXv_int13) ;
         talbdet1_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet1_impl.this.A252CliCod = GXv_int8[0] ;
         talbdet1_impl.this.A45AlbRef = GXv_char3[0] ;
         talbdet1_impl.this.AV51FlagArt = GXv_int6[0] ;
         talbdet1_impl.this.AV49Rdto = GXv_decimal10[0] ;
         talbdet1_impl.this.AV50Pesoml = GXv_int11[0] ;
         talbdet1_impl.this.AV100Anc = GXv_int12[0] ;
         talbdet1_impl.this.AV101grm2 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.str( AV51FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      }
      if ( ( AV69SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV68ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         talbdet1_impl.this.AV68ErrArt = (byte)((byte)(GXv_int13[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68ErrArt", GXutil.str( AV68ErrArt, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = A3613AlbRefDsc ;
         GXv_char14[0] = AV89artblo ;
         GXv_int6[0] = AV72Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char14, GXv_int6) ;
         talbdet1_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet1_impl.this.A252CliCod = GXv_int8[0] ;
         talbdet1_impl.this.A45AlbRef = GXv_char3[0] ;
         talbdet1_impl.this.A3613AlbRefDsc = GXv_char2[0] ;
         talbdet1_impl.this.AV89artblo = GXv_char14[0] ;
         talbdet1_impl.this.AV72Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV89artblo", AV89artblo);
         httpContext.ajax_rsp_assign_attri("", false, "AV72Flag", GXutil.str( AV72Flag, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( GXutil.strcmp(AV89artblo, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo BLOQUEADO. Consultar", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV69SiArt == 1 ) && true /* After */ && ( AV68ErrArt == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe ARTICULO ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A45AlbRef, " ") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo Incorrecto ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV66Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV67ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         AV67ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
      }
      if ( ( AV66Tintatex == 1 ) && true /* After */ && ( AV67ErrP == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Procedencia ¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV66Tintatex == 1 ) && true /* After */ && ( A970ProceCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No es posible Procedencia=0¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Localizacion¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( A47AlbREst == 1 )
      {
         AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
         }
      }
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A279CliNom = h252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         /* Using cursor T01OY18 */
         pr_default.execute(16, new Object[] {A279CliNom, A396EmprCod});
         A252CliCod = T01OY18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01OY18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h970ProceCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A971ProceNom = h970ProceCod ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         /* Using cursor T01OY19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n971ProceNom), A971ProceNom, A396EmprCod});
         A970ProceCod = T01OY19_A970ProceCod[0] ;
         n970ProceCod = T01OY19_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A970ProceCod = T01OY19_A970ProceCod[0] ;
         n970ProceCod = T01OY19_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         /* Using cursor T01OY20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A840TrnCod = T01OY20_A840TrnCod[0] ;
         n840TrnCod = T01OY20_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01OY20_A840TrnCod[0] ;
         n840TrnCod = T01OY20_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A1211TipEntCod = (short)(0) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A1212TipEntNom = h1211TipEntCod ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         /* Using cursor T01OY21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n1212TipEntNom), A1212TipEntNom, A396EmprCod});
         A1211TipEntCod = T01OY21_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY21_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A1211TipEntCod = T01OY21_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY21_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "TIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
      /* Using cursor T01OY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01OY5_A279CliNom[0] ;
      pr_default.close(3);
      /* Using cursor T01OY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01OY6_A841TrnNom[0] ;
      n841TrnNom = T01OY6_n841TrnNom[0] ;
      pr_default.close(4);
      /* Using cursor T01OY7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (0==A970ProceCod) && (GXutil.strcmp("", A971ProceNom)==0) || (0==A970ProceCod) && n970ProceCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01OY7_A971ProceNom[0] ;
      n971ProceNom = T01OY7_n971ProceNom[0] ;
      pr_default.close(5);
      /* Using cursor T01OY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A1211TipEntCod) && (GXutil.strcmp("", A1212TipEntNom)==0) || (0==A1211TipEntCod) && n1211TipEntCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01OY8_A1212TipEntNom[0] ;
      n1212TipEntNom = T01OY8_n1212TipEntNom[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1OY7( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_70( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01OY22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01OY22_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_71( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01OY23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01OY23_A841TrnNom[0] ;
      n841TrnNom = T01OY23_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_72( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T01OY24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (0==A970ProceCod) && (GXutil.strcmp("", A971ProceNom)==0) || (0==A970ProceCod) && n970ProceCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01OY24_A971ProceNom[0] ;
      n971ProceNom = T01OY24_n971ProceNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_73( String A396EmprCod ,
                          short A1211TipEntCod )
   {
      /* Using cursor T01OY25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (0==A1211TipEntCod) && (GXutil.strcmp("", A1212TipEntNom)==0) || (0==A1211TipEntCod) && n1211TipEntCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01OY25_A1212TipEntNom[0] ;
      n1212TipEntNom = T01OY25_n1212TipEntNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1OY7( )
   {
      /* Using cursor T01OY26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OY7( 68) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01OY3_A44AlbRecCod[0] ;
         n44AlbRecCod = T01OY3_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A5806AlbREnt2 = T01OY3_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A46AlbREnt = T01OY3_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A56AlbRUni = T01OY3_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A3613AlbRefDsc = T01OY3_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A49AlbRFen = T01OY3_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T01OY3_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T01OY3_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A45AlbRef = T01OY3_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A1291AlbRDes = T01OY3_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A58AlbRUniEnt = T01OY3_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01OY3_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A50AlbRLoc = T01OY3_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01OY3_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01OY3_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = T01OY3_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A48AlbRFecUlt = T01OY3_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T01OY3_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01OY3_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T01OY3_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01OY3_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01OY3_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T01OY3_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T01OY3_A13241AlbRPh[0] ;
         n13241AlbRPh = T01OY3_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T01OY3_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T01OY3_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T01OY3_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T01OY3_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T01OY3_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T01OY3_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01OY3_A59AlbRUniReb[0] ;
         A10761AlbUltP = T01OY3_A10761AlbUltP[0] ;
         n10761AlbUltP = T01OY3_n10761AlbUltP[0] ;
         A7501AlbRecSec = T01OY3_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T01OY3_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T01OY3_A1222AlbNumEti[0] ;
         A47AlbREst = T01OY3_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A252CliCod = T01OY3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01OY3_A840TrnCod[0] ;
         n840TrnCod = T01OY3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01OY3_A970ProceCod[0] ;
         n970ProceCod = T01OY3_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01OY3_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY3_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         O5806AlbREnt2 = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OY7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1OY7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1OY7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OY7( ) ;
      if ( RcdFound7 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01OY27 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01OY27_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01OY27_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01OY27_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01OY27_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01OY27_A44AlbRecCod[0] ;
            n44AlbRecCod = T01OY27_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01OY28 */
      pr_default.execute(26, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         while ( (pr_default.getStatus(26) != 101) && ( ( T01OY28_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01OY28_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(26);
         }
         if ( (pr_default.getStatus(26) != 101) && ( ( T01OY28_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01OY28_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01OY28_A44AlbRecCod[0] ;
            n44AlbRecCod = T01OY28_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(26);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OY7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OY7( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1OY7( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OY7( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBRECCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OY7( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1OY7( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A279CliNom = h252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            /* Using cursor T01OY29 */
            pr_default.execute(27, new Object[] {A279CliNom, A396EmprCod});
            A396EmprCod = T01OY29_A396EmprCod[0] ;
            A252CliCod = T01OY29_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = T01OY29_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               pr_default.readNext(27);
               if ( ! ( (pr_default.getStatus(27) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(27);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
         if ( (GXutil.strcmp("", h970ProceCod)==0) )
         {
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A971ProceNom = h970ProceCod ;
            n971ProceNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
            /* Using cursor T01OY30 */
            pr_default.execute(28, new Object[] {Boolean.valueOf(n971ProceNom), A971ProceNom, A396EmprCod});
            A396EmprCod = T01OY30_A396EmprCod[0] ;
            A970ProceCod = T01OY30_A970ProceCod[0] ;
            n970ProceCod = T01OY30_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            A970ProceCod = T01OY30_A970ProceCod[0] ;
            n970ProceCod = T01OY30_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               pr_default.readNext(28);
               if ( ! ( (pr_default.getStatus(28) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "PROCECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProceCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(28);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A841TrnNom = h840TrnCod ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            /* Using cursor T01OY31 */
            pr_default.execute(29, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
            A396EmprCod = T01OY31_A396EmprCod[0] ;
            A840TrnCod = T01OY31_A840TrnCod[0] ;
            n840TrnCod = T01OY31_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01OY31_A840TrnCod[0] ;
            n840TrnCod = T01OY31_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(29) == 101) ) )
            {
               pr_default.readNext(29);
               if ( ! ( (pr_default.getStatus(29) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(29);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
         if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
         {
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A1212TipEntNom = h1211TipEntCod ;
            n1212TipEntNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
            /* Using cursor T01OY32 */
            pr_default.execute(30, new Object[] {Boolean.valueOf(n1212TipEntNom), A1212TipEntNom, A396EmprCod});
            A396EmprCod = T01OY32_A396EmprCod[0] ;
            A1211TipEntCod = T01OY32_A1211TipEntCod[0] ;
            n1211TipEntCod = T01OY32_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A1211TipEntCod = T01OY32_A1211TipEntCod[0] ;
            n1211TipEntCod = T01OY32_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            if ( ! ( (pr_default.getStatus(30) == 101) ) )
            {
               pr_default.readNext(30);
               if ( ! ( (pr_default.getStatus(30) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "TIPENTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipEntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(30);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01OY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5806AlbREnt2, T01OY2_A5806AlbREnt2[0]) != 0 ) || ( GXutil.strcmp(Z46AlbREnt, T01OY2_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01OY2_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01OY2_A3613AlbRefDsc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01OY2_A49AlbRFen[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4606AlbRHEn, T01OY2_A4606AlbRHEn[0]) ) || ( GXutil.strcmp(Z45AlbRef, T01OY2_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z1291AlbRDes, T01OY2_A1291AlbRDes[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01OY2_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01OY2_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z50AlbRLoc, T01OY2_A50AlbRLoc[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01OY2_A55AlbRReo[0]) != 0 ) || ( Z54AlbRPieUti != T01OY2_A54AlbRPieUti[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01OY2_A60AlbRUniUti[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01OY2_A48AlbRFecUlt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6180AlbrUniC, T01OY2_A6180AlbrUniC[0]) != 0 ) || ( Z6181AlbrPieC != T01OY2_A6181AlbrPieC[0] ) || ( Z4920AlbRGrm2 != T01OY2_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01OY2_A4921AlbRAnc[0] ) || ( Z4922AlbPml != T01OY2_A4922AlbPml[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6463AlbRLote, T01OY2_A6463AlbRLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z13241AlbRPh, T01OY2_A13241AlbRPh[0]) != 0 ) || ( DecimalUtil.compareTo(Z13242AlbRRLong, T01OY2_A13242AlbRRLong[0]) != 0 ) || ( DecimalUtil.compareTo(Z13243AlbRRTrans, T01OY2_A13243AlbRRTrans[0]) != 0 ) || ( GXutil.strcmp(Z8029AlbNumM, T01OY2_A8029AlbNumM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z53AlbRPieReb != T01OY2_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T01OY2_A59AlbRUniReb[0]) != 0 ) || ( Z10761AlbUltP != T01OY2_A10761AlbUltP[0] ) || ( Z7501AlbRecSec != T01OY2_A7501AlbRecSec[0] ) || ( Z1222AlbNumEti != T01OY2_A1222AlbNumEti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z47AlbREst != T01OY2_A47AlbREst[0] ) || ( Z252CliCod != T01OY2_A252CliCod[0] ) || ( Z840TrnCod != T01OY2_A840TrnCod[0] ) || ( Z970ProceCod != T01OY2_A970ProceCod[0] ) || ( Z1211TipEntCod != T01OY2_A1211TipEntCod[0] ) )
         {
            if ( GXutil.strcmp(Z5806AlbREnt2, T01OY2_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T01OY2_A5806AlbREnt2[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T01OY2_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T01OY2_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01OY2_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01OY2_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01OY2_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01OY2_A3613AlbRefDsc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01OY2_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T01OY2_A49AlbRFen[0]);
            }
            if ( !( GXutil.dateCompare(Z4606AlbRHEn, T01OY2_A4606AlbRHEn[0]) ) )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRHEn");
               GXutil.writeLogRaw("Old: ",Z4606AlbRHEn);
               GXutil.writeLogRaw("Current: ",T01OY2_A4606AlbRHEn[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01OY2_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01OY2_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T01OY2_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T01OY2_A1291AlbRDes[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01OY2_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01OY2_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01OY2_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01OY2_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T01OY2_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T01OY2_A50AlbRLoc[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01OY2_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01OY2_A55AlbRReo[0]);
            }
            if ( Z54AlbRPieUti != T01OY2_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01OY2_A54AlbRPieUti[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01OY2_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01OY2_A60AlbRUniUti[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01OY2_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T01OY2_A48AlbRFecUlt[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T01OY2_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T01OY2_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T01OY2_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T01OY2_A6181AlbrPieC[0]);
            }
            if ( Z4920AlbRGrm2 != T01OY2_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01OY2_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01OY2_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01OY2_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T01OY2_A4922AlbPml[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T01OY2_A4922AlbPml[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01OY2_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01OY2_A6463AlbRLote[0]);
            }
            if ( DecimalUtil.compareTo(Z13241AlbRPh, T01OY2_A13241AlbRPh[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRPh");
               GXutil.writeLogRaw("Old: ",Z13241AlbRPh);
               GXutil.writeLogRaw("Current: ",T01OY2_A13241AlbRPh[0]);
            }
            if ( DecimalUtil.compareTo(Z13242AlbRRLong, T01OY2_A13242AlbRRLong[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRRLong");
               GXutil.writeLogRaw("Old: ",Z13242AlbRRLong);
               GXutil.writeLogRaw("Current: ",T01OY2_A13242AlbRRLong[0]);
            }
            if ( DecimalUtil.compareTo(Z13243AlbRRTrans, T01OY2_A13243AlbRRTrans[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRRTrans");
               GXutil.writeLogRaw("Old: ",Z13243AlbRRTrans);
               GXutil.writeLogRaw("Current: ",T01OY2_A13243AlbRRTrans[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T01OY2_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T01OY2_A8029AlbNumM[0]);
            }
            if ( Z53AlbRPieReb != T01OY2_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T01OY2_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T01OY2_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T01OY2_A59AlbRUniReb[0]);
            }
            if ( Z10761AlbUltP != T01OY2_A10761AlbUltP[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbUltP");
               GXutil.writeLogRaw("Old: ",Z10761AlbUltP);
               GXutil.writeLogRaw("Current: ",T01OY2_A10761AlbUltP[0]);
            }
            if ( Z7501AlbRecSec != T01OY2_A7501AlbRecSec[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbRecSec");
               GXutil.writeLogRaw("Old: ",Z7501AlbRecSec);
               GXutil.writeLogRaw("Current: ",T01OY2_A7501AlbRecSec[0]);
            }
            if ( Z1222AlbNumEti != T01OY2_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T01OY2_A1222AlbNumEti[0]);
            }
            if ( Z47AlbREst != T01OY2_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01OY2_A47AlbREst[0]);
            }
            if ( Z252CliCod != T01OY2_A252CliCod[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01OY2_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01OY2_A840TrnCod[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01OY2_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01OY2_A970ProceCod[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01OY2_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T01OY2_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbdet1:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T01OY2_A1211TipEntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OY7( )
   {
      beforeValidate1OY7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OY7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OY7( 0) ;
         checkOptimisticConcurrency1OY7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OY7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OY7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OY33 */
                  pr_default.execute(31, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A5806AlbREnt2, A46AlbREnt, A56AlbRUni, A3613AlbRefDsc, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A1291AlbRDes, A58AlbRUniEnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(31) == 1) )
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
                        resetCaption1OY0( ) ;
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
            load1OY7( ) ;
         }
         endLevel1OY7( ) ;
      }
      closeExtendedTableCursors1OY7( ) ;
   }

   public void update1OY7( )
   {
      beforeValidate1OY7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OY7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OY7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OY7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OY7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OY34 */
                  pr_default.execute(32, new Object[] {A5806AlbREnt2, A46AlbREnt, A56AlbRUni, A3613AlbRefDsc, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A1291AlbRDes, A58AlbRUniEnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), Byte.valueOf(A47AlbREst), Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(32) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OY7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char14[0] = A396EmprCod ;
                     GXv_int8[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char14, GXv_int8) ;
                     talbdet1_impl.this.A396EmprCod = GXv_char14[0] ;
                     talbdet1_impl.this.A44AlbRecCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV83OldAlb2) != 0 ) )
                     {
                        AV84Inc_obs = httpContext.getMessage( httpContext.getMessage( "TALBDET-Modificacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Guia (old) =", ""), "") + AV83OldAlb2 + httpContext.getMessage( httpContext.getMessage( " Guia (new) =", ""), "") + A5806AlbREnt2 + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV84Inc_obs", AV84Inc_obs);
                     }
                     if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV83OldAlb2) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV8UsurCod, AV29Station, AV84Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
         endLevel1OY7( ) ;
      }
      closeExtendedTableCursors1OY7( ) ;
   }

   public void deferredUpdate1OY7( )
   {
   }

   public void delete( )
   {
      beforeValidate1OY7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OY7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OY7( ) ;
         afterConfirm1OY7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OY7( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OY35 */
               pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
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
      }
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OY7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OY7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         AV83OldAlb2 = O5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
         if ( ( AV66Tintatex == 1 ) && true /* After */ )
         {
            GXt_int5 = AV67ErrP ;
            GXv_char14[0] = " " ;
            GXv_int6[0] = GXt_int5 ;
            new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
            talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
            AV67ErrP = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( A47AlbREst == 1 )
         {
            AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV9AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
            }
         }
         /* Using cursor T01OY36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01OY36_A279CliNom[0] ;
         pr_default.close(34);
         /* Using cursor T01OY37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01OY37_A841TrnNom[0] ;
         n841TrnNom = T01OY37_n841TrnNom[0] ;
         pr_default.close(35);
         /* Using cursor T01OY38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01OY38_A971ProceNom[0] ;
         n971ProceNom = T01OY38_n971ProceNom[0] ;
         pr_default.close(36);
         /* Using cursor T01OY39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01OY39_A1212TipEntNom[0] ;
         n1212TipEntNom = T01OY39_n1212TipEntNom[0] ;
         pr_default.close(37);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01OY40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01OY41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01OY42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01OY43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01OY44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01OY45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01OY46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01OY47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01OY48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01OY49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01OY50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01OY51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01OY52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01OY53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01OY54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
      }
   }

   public void endLevel1OY7( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OY7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbdet1");
         if ( AnyError == 0 )
         {
            confirmValues1OY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbdet1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OY7( )
   {
      /* Scan By routine */
      /* Using cursor T01OY55 */
      pr_default.execute(53, new Object[] {A396EmprCod});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01OY55_A44AlbRecCod[0] ;
         n44AlbRecCod = T01OY55_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OY7( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01OY55_A44AlbRecCod[0] ;
         n44AlbRecCod = T01OY55_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1OY7( )
   {
      pr_default.close(53);
   }

   public void afterConfirm1OY7( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int8) ;
         talbdet1_impl.this.A44AlbRecCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void beforeInsert1OY7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OY7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OY7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OY7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OY7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OY7( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRPh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPh_Enabled), 5, 0), true);
      edtAlbRRLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRLong_Enabled), 5, 0), true);
      edtAlbRRTrans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRTrans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRTrans_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OY7( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OY0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdet1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV123EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV124AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET1");
      forbiddenHiddens.add("AlbRUniUti", localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV37Modo, "")));
      forbiddenHiddens.add("AlbRUniEnt", localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbRPieEnt", localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"));
      forbiddenHiddens.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
      forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbUltP", localUtil.format( DecimalUtil.doubleToDec(A10761AlbUltP), "ZZZ9"));
      forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
      forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
      forbiddenHiddens.add("AlbREst", localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbdet1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13241AlbRPh", GXutil.ltrim( localUtil.ntoc( Z13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13242AlbRRLong", GXutil.ltrim( localUtil.ntoc( Z13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13243AlbRRTrans", GXutil.ltrim( localUtil.ntoc( Z13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10761AlbUltP", GXutil.ltrim( localUtil.ntoc( Z10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7501AlbRecSec", GXutil.ltrim( localUtil.ntoc( Z7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5806AlbREnt2", GXutil.rtrim( O5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV107TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV107TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV107TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV37Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV123EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV124AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV124AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV109Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROCECOD", GXutil.ltrim( localUtil.ntoc( AV110Insert_ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPROCECOD", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV111Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV112Insert_TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTIPENTCOD", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENC20C", GXutil.ltrim( localUtil.ntoc( AV79Enc20c, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV37Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMILENIO", GXutil.ltrim( localUtil.ntoc( AV90Termilenio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV9AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGKGS", GXutil.ltrim( localUtil.ntoc( AV41FlagKgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMTS", GXutil.ltrim( localUtil.ntoc( AV42FlagMts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDALB2", GXutil.rtrim( AV83OldAlb2));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRP", GXutil.ltrim( localUtil.ntoc( AV67ErrP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV84Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGART", GXutil.ltrim( localUtil.ntoc( AV51FlagArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRDTO", GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANC", GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV137Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV29Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRART", GXutil.ltrim( localUtil.ntoc( AV68ErrArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTBLO", GXutil.rtrim( AV89artblo));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV72Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTATEX", GXutil.ltrim( localUtil.ntoc( AV66Tintatex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIART", GXutil.ltrim( localUtil.ntoc( AV69SiArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVELLUTS", GXutil.ltrim( localUtil.ntoc( AV80Velluts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEREB", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIREB", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBULTP", GXutil.ltrim( localUtil.ntoc( A10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECSEC", GXutil.ltrim( localUtil.ntoc( A7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMETI", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCENOM", GXutil.rtrim( A971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPENTNOM", GXutil.rtrim( A1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Enabled", GXutil.booltostr( Dvpanel_unnamedtable3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable5_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Enabled", GXutil.booltostr( Dvpanel_unnamedtable5_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable6_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Enabled", GXutil.booltostr( Dvpanel_unnamedtable6_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable7_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Enabled", GXutil.booltostr( Dvpanel_unnamedtable7_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable8_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Enabled", GXutil.booltostr( Dvpanel_unnamedtable8_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Width", GXutil.rtrim( Dvpanel_unnamedtable8_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable8_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable8_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Cls", GXutil.rtrim( Dvpanel_unnamedtable8_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Title", GXutil.rtrim( Dvpanel_unnamedtable8_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable8_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable8_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable8_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable9_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Enabled", GXutil.booltostr( Dvpanel_unnamedtable9_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.talbdet1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV123EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV124AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBDET1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Header)", "") ;
   }

   public void initializeNonKey1OY7( )
   {
      h252CliCod = "" ;
      h970ProceCod = "" ;
      h840TrnCod = "" ;
      h1211TipEntCod = "" ;
      AV37Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      AV51FlagArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.str( AV51FlagArt, 1, 0));
      AV49Rdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
      AV50Pesoml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
      AV100Anc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
      AV101grm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      AV9AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", AV9AlbCum);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      AV83OldAlb2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", AV83OldAlb2);
      AV68ErrArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ErrArt", GXutil.str( AV68ErrArt, 1, 0));
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      AV89artblo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89artblo", AV89artblo);
      AV72Flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Flag", GXutil.str( AV72Flag, 1, 0));
      AV67ErrP = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A13241AlbRPh = DecimalUtil.ZERO ;
      n13241AlbRPh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
      A13242AlbRRLong = DecimalUtil.ZERO ;
      n13242AlbRRLong = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      n13243AlbRRTrans = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A10761AlbUltP = (short)(0) ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      A7501AlbRecSec = (short)(0) ;
      n7501AlbRecSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7501AlbRecSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7501AlbRecSec), 3, 0));
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      AV84Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Inc_obs", AV84Inc_obs);
      A49AlbRFen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      O5806AlbREnt2 = A5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      Z5806AlbREnt2 = "" ;
      Z46AlbREnt = "" ;
      Z56AlbRUni = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z1291AlbRDes = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z54AlbRPieUti = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z10761AlbUltP = (short)(0) ;
      Z7501AlbRecSec = (short)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
   }

   public void initAll1OY7( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1OY7( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV37Modo = iV37Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Modo", AV37Modo);
      A56AlbRUni = i56AlbRUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A49AlbRFen = i49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A55AlbRReo = i55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A47AlbREst = i47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A4606AlbRHEn = i4606AlbRHEn ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211675819", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("talbdet1.js", "?20268211675820", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblTextblockalbrent_Internalname = "TEXTBLOCKALBRENT" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      divUnnamedtablealbrent_Internalname = "UNNAMEDTABLEALBRENT" ;
      divAlbrent_cell_Internalname = "ALBRENT_CELL" ;
      lblTextblockalbrent2_Internalname = "TEXTBLOCKALBRENT2" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      divUnnamedtablealbrent2_Internalname = "UNNAMEDTABLEALBRENT2" ;
      divAlbrent2_cell_Internalname = "ALBRENT2_CELL" ;
      lblTextblockalbrfen_Internalname = "TEXTBLOCKALBRFEN" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      divUnnamedtablealbrfen_Internalname = "UNNAMEDTABLEALBRFEN" ;
      lblTextblockalbrhen_Internalname = "TEXTBLOCKALBRHEN" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      divUnnamedtablealbrhen_Internalname = "UNNAMEDTABLEALBRHEN" ;
      divUnnamedtable18_Internalname = "UNNAMEDTABLE18" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockalbref_Internalname = "TEXTBLOCKALBREF" ;
      edtAlbRef_Internalname = "ALBREF" ;
      divUnnamedtablealbref_Internalname = "UNNAMEDTABLEALBREF" ;
      lblTextblockalbrefdsc_Internalname = "TEXTBLOCKALBREFDSC" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      divUnnamedtablealbrefdsc_Internalname = "UNNAMEDTABLEALBREFDSC" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblockprocecod_Internalname = "TEXTBLOCKPROCECOD" ;
      edtProceCod_Internalname = "PROCECOD" ;
      divUnnamedtableprocecod_Internalname = "UNNAMEDTABLEPROCECOD" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divUnnamedtabletrncod_Internalname = "UNNAMEDTABLETRNCOD" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      tblTablemergedunnamedtable2_Internalname = "TABLEMERGEDUNNAMEDTABLE2" ;
      lblTextblockalbrunient_Internalname = "TEXTBLOCKALBRUNIENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      divUnnamedtablealbrunient_Internalname = "UNNAMEDTABLEALBRUNIENT" ;
      lblTextblockalbruni_Internalname = "TEXTBLOCKALBRUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      divUnnamedtablealbruni_Internalname = "UNNAMEDTABLEALBRUNI" ;
      lblTextblockalbrpieent_Internalname = "TEXTBLOCKALBRPIEENT" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      divUnnamedtablealbrpieent_Internalname = "UNNAMEDTABLEALBRPIEENT" ;
      lblTextblockalbrunic_Internalname = "TEXTBLOCKALBRUNIC" ;
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      divUnnamedtablealbrunic_Internalname = "UNNAMEDTABLEALBRUNIC" ;
      lblTextblockalbrpiec_Internalname = "TEXTBLOCKALBRPIEC" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      divUnnamedtablealbrpiec_Internalname = "UNNAMEDTABLEALBRPIEC" ;
      edtAlbNumM_Internalname = "ALBNUMM" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      lblTextblockalbruniuti_Internalname = "TEXTBLOCKALBRUNIUTI" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      divUnnamedtablealbruniuti_Internalname = "UNNAMEDTABLEALBRUNIUTI" ;
      lblTextblockalbrunidis_Internalname = "TEXTBLOCKALBRUNIDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      divUnnamedtablealbrunidis_Internalname = "UNNAMEDTABLEALBRUNIDIS" ;
      lblTextblockalbrpieuti_Internalname = "TEXTBLOCKALBRPIEUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      divUnnamedtablealbrpieuti_Internalname = "UNNAMEDTABLEALBRPIEUTI" ;
      lblTextblockalbrpiedis_Internalname = "TEXTBLOCKALBRPIEDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtablealbrpiedis_Internalname = "UNNAMEDTABLEALBRPIEDIS" ;
      lblTextblockalbrfecult_Internalname = "TEXTBLOCKALBRFECULT" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      divUnnamedtablealbrfecult_Internalname = "UNNAMEDTABLEALBRFECULT" ;
      lblTextblockalbrest_Internalname = "TEXTBLOCKALBREST" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divUnnamedtablealbrest_Internalname = "UNNAMEDTABLEALBREST" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      tblTablemergedunnamedtable4_Internalname = "TABLEMERGEDUNNAMEDTABLE4" ;
      lblTextblocktipentcod_Internalname = "TEXTBLOCKTIPENTCOD" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      divUnnamedtabletipentcod_Internalname = "UNNAMEDTABLETIPENTCOD" ;
      lblTextblockalbrdes_Internalname = "TEXTBLOCKALBRDES" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      divUnnamedtablealbrdes_Internalname = "UNNAMEDTABLEALBRDES" ;
      lblTextblockalbrlote_Internalname = "TEXTBLOCKALBRLOTE" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      divUnnamedtablealbrlote_Internalname = "UNNAMEDTABLEALBRLOTE" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      lblTextblockalbrloc_Internalname = "TEXTBLOCKALBRLOC" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      divUnnamedtablealbrloc_Internalname = "UNNAMEDTABLEALBRLOC" ;
      lblTextblockalbrreo_Internalname = "TEXTBLOCKALBRREO" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      divUnnamedtablealbrreo_Internalname = "UNNAMEDTABLEALBRREO" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      tblUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      tblTablemergedunnamedtable6_Internalname = "TABLEMERGEDUNNAMEDTABLE6" ;
      lblTextblockalbrgrm2_Internalname = "TEXTBLOCKALBRGRM2" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      divUnnamedtablealbrgrm2_Internalname = "UNNAMEDTABLEALBRGRM2" ;
      lblTextblockalbranc_Internalname = "TEXTBLOCKALBRANC" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      divUnnamedtablealbranc_Internalname = "UNNAMEDTABLEALBRANC" ;
      lblTextblockalbpml_Internalname = "TEXTBLOCKALBPML" ;
      edtAlbPml_Internalname = "ALBPML" ;
      divUnnamedtablealbpml_Internalname = "UNNAMEDTABLEALBPML" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      tblUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = "DVPANEL_UNNAMEDTABLE8" ;
      lblTextblockalbrph_Internalname = "TEXTBLOCKALBRPH" ;
      edtAlbRPh_Internalname = "ALBRPH" ;
      divUnnamedtablealbrph_Internalname = "UNNAMEDTABLEALBRPH" ;
      lblTextblockalbrrlong_Internalname = "TEXTBLOCKALBRRLONG" ;
      edtAlbRRLong_Internalname = "ALBRRLONG" ;
      divUnnamedtablealbrrlong_Internalname = "UNNAMEDTABLEALBRRLONG" ;
      lblTextblockalbrrtrans_Internalname = "TEXTBLOCKALBRRTRANS" ;
      edtAlbRRTrans_Internalname = "ALBRRTRANS" ;
      divUnnamedtablealbrrtrans_Internalname = "UNNAMEDTABLEALBRRTRANS" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      tblTablemergedunnamedtable8_Internalname = "TABLEMERGEDUNNAMEDTABLE8" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Header)", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbRRTrans_Jsonclick = "" ;
      edtAlbRRTrans_Enabled = 1 ;
      edtAlbRRLong_Jsonclick = "" ;
      edtAlbRRLong_Enabled = 1 ;
      edtAlbRPh_Jsonclick = "" ;
      edtAlbRPh_Enabled = 1 ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = "" ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 1 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 1 ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = "" ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 1 ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = "" ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 1 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 1 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Enabled = 1 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Enabled = 1 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 1 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 1 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = "" ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Enabled = 1 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRHEn_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 1 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 1 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgaclicod1OY0( String A396EmprCod ,
                                String A279CliNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1OY0( A396EmprCod, A279CliNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaclicod_data1OY0( String A396EmprCod ,
                                        String A279CliNom )
   {
      l279CliNom = GXutil.padr( GXutil.rtrim( A279CliNom), 30, "%") ;
      /* Using cursor T01OY56 */
      pr_default.execute(54, new Object[] {A396EmprCod, l279CliNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(54) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01OY56_A279CliNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OY56_A279CliNom[0]));
         pr_default.readNext(54);
      }
      pr_default.close(54);
   }

   public void gxsgaalbref1OY0( String A45AlbRef )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbref_data1OY0( A45AlbRef) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaalbref_data1OY0( String A45AlbRef )
   {
      l45AlbRef = GXutil.padr( GXutil.rtrim( A45AlbRef), 16, "%") ;
      /* Using cursor T01OY57 */
      pr_default.execute(55, new Object[] {l45AlbRef});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(55) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01OY57_A45AlbRef[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OY57_A45AlbRef[0]));
         pr_default.readNext(55);
      }
      pr_default.close(55);
   }

   public void gxsgaprocecod1OY0( String A396EmprCod ,
                                  String A971ProceNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprocecod_data1OY0( A396EmprCod, A971ProceNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaprocecod_data1OY0( String A396EmprCod ,
                                          String A971ProceNom )
   {
      l971ProceNom = GXutil.padr( GXutil.rtrim( A971ProceNom), 30, "%") ;
      n971ProceNom = false ;
      /* Using cursor T01OY58 */
      pr_default.execute(56, new Object[] {A396EmprCod, l971ProceNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(56) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01OY58_A971ProceNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OY58_A971ProceNom[0]));
         pr_default.readNext(56);
      }
      pr_default.close(56);
   }

   public void gxsgatrncod1OY0( String A396EmprCod ,
                                String A841TrnNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1OY0( A396EmprCod, A841TrnNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatrncod_data1OY0( String A396EmprCod ,
                                        String A841TrnNom )
   {
      l841TrnNom = GXutil.padr( GXutil.rtrim( A841TrnNom), 30, "%") ;
      n841TrnNom = false ;
      /* Using cursor T01OY59 */
      pr_default.execute(57, new Object[] {A396EmprCod, l841TrnNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(57) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01OY59_A841TrnNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OY59_A841TrnNom[0]));
         pr_default.readNext(57);
      }
      pr_default.close(57);
   }

   public void gxsgatipentcod1OY0( String A396EmprCod ,
                                   String A1212TipEntNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipentcod_data1OY0( A396EmprCod, A1212TipEntNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatipentcod_data1OY0( String A396EmprCod ,
                                           String A1212TipEntNom )
   {
      l1212TipEntNom = GXutil.padr( GXutil.rtrim( A1212TipEntNom), 25, "%") ;
      n1212TipEntNom = false ;
      /* Using cursor T01OY60 */
      pr_default.execute(58, new Object[] {A396EmprCod, l1212TipEntNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(58) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01OY60_A1212TipEntNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OY60_A1212TipEntNom[0]));
         pr_default.readNext(58);
      }
      pr_default.close(58);
   }

   public void gxhcaclicod1OY7( String A396EmprCod ,
                                String A279CliNom )
   {
      /* Using cursor T01OY61 */
      pr_default.execute(59, new Object[] {A279CliNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(59) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A279CliNom = T01OY61_A279CliNom[0] ;
         A396EmprCod = T01OY61_A396EmprCod[0] ;
         A252CliCod = T01OY61_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(59);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(59);
   }

   public void gxhcaprocecod1OY7( String A396EmprCod ,
                                  String A971ProceNom )
   {
      /* Using cursor T01OY62 */
      pr_default.execute(60, new Object[] {Boolean.valueOf(n971ProceNom), A971ProceNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(60) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A971ProceNom = T01OY62_A971ProceNom[0] ;
         n971ProceNom = T01OY62_n971ProceNom[0] ;
         A396EmprCod = T01OY62_A396EmprCod[0] ;
         A970ProceCod = T01OY62_A970ProceCod[0] ;
         n970ProceCod = T01OY62_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         pr_default.readNext(60);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(60);
   }

   public void gxhcatrncod1OY7( String A396EmprCod ,
                                String A841TrnNom )
   {
      /* Using cursor T01OY63 */
      pr_default.execute(61, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(61) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A841TrnNom = T01OY63_A841TrnNom[0] ;
         n841TrnNom = T01OY63_n841TrnNom[0] ;
         A396EmprCod = T01OY63_A396EmprCod[0] ;
         A840TrnCod = T01OY63_A840TrnCod[0] ;
         n840TrnCod = T01OY63_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(61);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(61);
   }

   public void gxhcatipentcod1OY7( String A396EmprCod ,
                                   String A1212TipEntNom )
   {
      /* Using cursor T01OY64 */
      pr_default.execute(62, new Object[] {Boolean.valueOf(n1212TipEntNom), A1212TipEntNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(62) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A1212TipEntNom = T01OY64_A1212TipEntNom[0] ;
         n1212TipEntNom = T01OY64_n1212TipEntNom[0] ;
         A396EmprCod = T01OY64_A396EmprCod[0] ;
         A1211TipEntCod = T01OY64_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY64_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         pr_default.readNext(62);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(62);
   }

   public void gxasa461OY7( byte AV79Enc20c ,
                            String A396EmprCod )
   {
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt_Visible = ((AV79Enc20c==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa58061OY7( byte AV79Enc20c ,
                              String A396EmprCod )
   {
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt2_Visible = AV79Enc20c ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx35asaerrp1OY7( String A396EmprCod ,
                                short A970ProceCod )
   {
      if ( ( AV66Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV67ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         AV67ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.str( AV67ErrP, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV67ErrP, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_53_1OY7( String Gx_mode ,
                           String A396EmprCod ,
                           int A44AlbRecCod ,
                           String A45AlbRef )
   {
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int8) ;
         A44AlbRecCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_54_1OY7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_int6[0] = AV51FlagArt ;
         GXv_decimal10[0] = AV49Rdto ;
         GXv_int13[0] = AV50Pesoml ;
         GXv_int12[0] = AV100Anc ;
         GXv_int11[0] = AV101grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6, GXv_decimal10, GXv_int13, GXv_int12, GXv_int11) ;
         A396EmprCod = GXv_char14[0] ;
         A252CliCod = GXv_int8[0] ;
         A45AlbRef = GXv_char4[0] ;
         AV51FlagArt = GXv_int6[0] ;
         AV49Rdto = GXv_decimal10[0] ;
         AV50Pesoml = GXv_int13[0] ;
         AV100Anc = GXv_int12[0] ;
         AV101grm2 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.str( AV51FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51FlagArt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_55_1OY7( String A396EmprCod ,
                           String AV137Pgmname ,
                           String AV8UsurCod ,
                           String AV29Station ,
                           String AV84Inc_obs ,
                           int A44AlbRecCod ,
                           String A5806AlbREnt2 ,
                           String AV83OldAlb2 )
   {
      if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV83OldAlb2) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV137Pgmname, AV8UsurCod, AV29Station, AV84Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_56_1OY7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef ,
                           byte AV69SiArt )
   {
      if ( ( AV69SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV68ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         AV68ErrArt = (byte)((byte)(GXv_int13[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68ErrArt", GXutil.str( AV68ErrArt, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV68ErrArt, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_57_1OY7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char3[0] = A3613AlbRefDsc ;
         GXv_char2[0] = AV89artblo ;
         GXv_int6[0] = AV72Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         A396EmprCod = GXv_char14[0] ;
         A252CliCod = GXv_int8[0] ;
         A45AlbRef = GXv_char4[0] ;
         A3613AlbRefDsc = GXv_char3[0] ;
         AV89artblo = GXv_char2[0] ;
         AV72Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV89artblo", AV89artblo);
         httpContext.ajax_rsp_assign_attri("", false, "AV72Flag", GXutil.str( AV72Flag, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV89artblo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV72Flag, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         }
      }
      /* End function init_web_controls */
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

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albrent2( )
   {
      if ( ( AV79Enc20c == 1 ) && ( AV90Termilenio == 0 ) )
      {
         A46AlbREnt = GXutil.substring( A5806AlbREnt2, 1, 8) ;
      }
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
      }
      AV83OldAlb2 = O5806AlbREnt2 ;
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "AV83OldAlb2", GXutil.rtrim( AV83OldAlb2));
   }

   public void valid_Clicod( )
   {
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
      }
      else
      {
         A279CliNom = h252CliCod ;
         /* Using cursor T01OY65 */
         pr_default.execute(63, new Object[] {A279CliNom, A396EmprCod});
         A252CliCod = T01OY65_A252CliCod[0] ;
         A252CliCod = T01OY65_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(63) == 101) ) )
         {
            pr_default.readNext(63);
            if ( ! ( (pr_default.getStatus(63) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(63);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01OY66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(64) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01OY66_A279CliNom[0] ;
      pr_default.close(64);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", GXutil.rtrim( h252CliCod));
   }

   public void valid_Albref( )
   {
      if ( (GXutil.strcmp("", A45AlbRef)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Referencia es requerido.", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_int6[0] = AV51FlagArt ;
         GXv_decimal10[0] = AV49Rdto ;
         GXv_int13[0] = AV50Pesoml ;
         GXv_int12[0] = AV100Anc ;
         GXv_int11[0] = AV101grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6, GXv_decimal10, GXv_int13, GXv_int12, GXv_int11) ;
         talbdet1_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet1_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         talbdet1_impl.this.A45AlbRef = GXv_char4[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbdet1_impl.this.AV51FlagArt = GXv_int6[0] ;
         AV51FlagArt = this.AV51FlagArt ;
         talbdet1_impl.this.AV49Rdto = GXv_decimal10[0] ;
         AV49Rdto = this.AV49Rdto ;
         talbdet1_impl.this.AV50Pesoml = GXv_int13[0] ;
         AV50Pesoml = this.AV50Pesoml ;
         talbdet1_impl.this.AV100Anc = GXv_int12[0] ;
         AV100Anc = this.AV100Anc ;
         talbdet1_impl.this.AV101grm2 = GXv_int11[0] ;
         AV101grm2 = this.AV101grm2 ;
      }
      if ( ( AV69SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV68ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         talbdet1_impl.this.AV68ErrArt = (byte)((byte)(GXv_int13[0])) ;
         AV68ErrArt = this.AV68ErrArt ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char3[0] = A3613AlbRefDsc ;
         GXv_char2[0] = AV89artblo ;
         GXv_int6[0] = AV72Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         talbdet1_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet1_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         talbdet1_impl.this.A45AlbRef = GXv_char4[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbdet1_impl.this.A3613AlbRefDsc = GXv_char3[0] ;
         A3613AlbRefDsc = this.A3613AlbRefDsc ;
         talbdet1_impl.this.AV89artblo = GXv_char2[0] ;
         AV89artblo = this.AV89artblo ;
         talbdet1_impl.this.AV72Flag = GXv_int6[0] ;
         AV72Flag = this.AV72Flag ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( GXutil.strcmp(AV89artblo, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo BLOQUEADO. Consultar", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
      }
      if ( ( AV69SiArt == 1 ) && true /* After */ && ( AV68ErrArt == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe ARTICULO ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A45AlbRef, " ") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo Incorrecto ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRef_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.ltrim( localUtil.ntoc( AV51FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV68ErrArt", GXutil.ltrim( localUtil.ntoc( AV68ErrArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV89artblo", GXutil.rtrim( AV89artblo));
      httpContext.ajax_rsp_assign_attri("", false, "AV72Flag", GXutil.ltrim( localUtil.ntoc( AV72Flag, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", GXutil.rtrim( h252CliCod));
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      if ( (GXutil.strcmp("", h970ProceCod)==0) )
      {
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
      }
      else
      {
         A971ProceNom = h970ProceCod ;
         n971ProceNom = false ;
         /* Using cursor T01OY67 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n971ProceNom), A971ProceNom, A396EmprCod});
         A970ProceCod = T01OY67_A970ProceCod[0] ;
         n970ProceCod = T01OY67_n970ProceCod[0] ;
         A970ProceCod = T01OY67_A970ProceCod[0] ;
         n970ProceCod = T01OY67_n970ProceCod[0] ;
         if ( ! ( (pr_default.getStatus(65) == 101) ) )
         {
            pr_default.readNext(65);
            if ( ! ( (pr_default.getStatus(65) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(65);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", h970ProceCod);
      /* Using cursor T01OY68 */
      pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(66) == 101) )
      {
         if ( ! ( (0==A970ProceCod) && (GXutil.strcmp("", A971ProceNom)==0) || (0==A970ProceCod) && n970ProceCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
         }
      }
      A971ProceNom = T01OY68_A971ProceNom[0] ;
      n971ProceNom = T01OY68_n971ProceNom[0] ;
      pr_default.close(66);
      if ( ( AV66Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV67ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet1_impl.this.GXt_int5 = GXv_int6[0] ;
         AV67ErrP = GXt_int5 ;
      }
      if ( ( AV66Tintatex == 1 ) && true /* After */ && ( AV67ErrP == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Procedencia ¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
      }
      if ( ( AV66Tintatex == 1 ) && true /* After */ && ( A970ProceCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No es posible Procedencia=0¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
      }
      if ( ( AV80Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV67ErrP", GXutil.ltrim( localUtil.ntoc( AV67ErrP, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h970ProceCod", GXutil.rtrim( h970ProceCod));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
      }
      else
      {
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         /* Using cursor T01OY69 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A840TrnCod = T01OY69_A840TrnCod[0] ;
         n840TrnCod = T01OY69_n840TrnCod[0] ;
         A840TrnCod = T01OY69_A840TrnCod[0] ;
         n840TrnCod = T01OY69_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(67) == 101) ) )
         {
            pr_default.readNext(67);
            if ( ! ( (pr_default.getStatus(67) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(67);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01OY70 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(68) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01OY70_A841TrnNom[0] ;
      n841TrnNom = T01OY70_n841TrnNom[0] ;
      pr_default.close(68);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", GXutil.rtrim( h840TrnCod));
   }

   public void valid_Albrest( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
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
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbCum", GXutil.rtrim( AV9AlbCum));
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
      {
         A1211TipEntCod = (short)(0) ;
         n1211TipEntCod = false ;
      }
      else
      {
         A1212TipEntNom = h1211TipEntCod ;
         n1212TipEntNom = false ;
         /* Using cursor T01OY71 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n1212TipEntNom), A1212TipEntNom, A396EmprCod});
         A1211TipEntCod = T01OY71_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY71_n1211TipEntCod[0] ;
         A1211TipEntCod = T01OY71_A1211TipEntCod[0] ;
         n1211TipEntCod = T01OY71_n1211TipEntCod[0] ;
         if ( ! ( (pr_default.getStatus(69) == 101) ) )
         {
            pr_default.readNext(69);
            if ( ! ( (pr_default.getStatus(69) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "TIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipEntCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(69);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", h1211TipEntCod);
      /* Using cursor T01OY72 */
      pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(70) == 101) )
      {
         if ( ! ( (0==A1211TipEntCod) && (GXutil.strcmp("", A1212TipEntNom)==0) || (0==A1211TipEntCod) && n1211TipEntCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
         }
      }
      A1212TipEntNom = T01OY72_A1212TipEntNom[0] ;
      n1212TipEntNom = T01OY72_n1212TipEntNom[0] ;
      pr_default.close(70);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "h1211TipEntCod", GXutil.rtrim( h1211TipEntCod));
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public String ajaxOnSessionTimeout( )
   {
      httpContext.setAjaxOnSessionTimeout("Warn");
      return "Warn" ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV123EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV124AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV107TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV123EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV124AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV37Modo',fld:'vMODO',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A10761AlbUltP',fld:'ALBULTP',pic:'ZZZ9'},{av:'A7501AlbRecSec',fld:'ALBRECSEC',pic:'ZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121OY2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV107TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRENT","{handler:'valid_Albrent',iparms:[]");
      setEventMetadata("VALID_ALBRENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRENT2","{handler:'valid_Albrent2',iparms:[{av:'O5806AlbREnt2'},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'AV79Enc20c',fld:'vENC20C',pic:'9'},{av:'AV90Termilenio',fld:'vTERMILENIO',pic:'9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV83OldAlb2',fld:'vOLDALB2',pic:''}]");
      setEventMetadata("VALID_ALBRENT2",",oparms:[{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV83OldAlb2',fld:'vOLDALB2',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[{av:'h252CliCod'},{av:'AV69SiArt',fld:'vSIART',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV51FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV49Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV50Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV100Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV101grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV68ErrArt',fld:'vERRART',pic:'9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV89artblo',fld:'vARTBLO',pic:'@!'},{av:'AV72Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VALID_ALBREF",",oparms:[{av:'AV51FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV49Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV50Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV100Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV101grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV68ErrArt',fld:'vERRART',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV89artblo',fld:'vARTBLO',pic:'@!'},{av:'AV72Flag',fld:'vFLAG',pic:'9'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'h970ProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV67ErrP',fld:'vERRP',pic:'9'}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV67ErrP',fld:'vERRP',pic:'9'},{av:'h970ProceCod'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV9AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'AV9AlbCum',fld:'vALBCUM',pic:''}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'h1211TipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'h1211TipEntCod'}]}");
      setEventMetadata("VALID_ALBRLOC","{handler:'valid_Albrloc',iparms:[]");
      setEventMetadata("VALID_ALBRLOC",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(64);
      pr_default.close(34);
      pr_default.close(68);
      pr_default.close(35);
      pr_default.close(66);
      pr_default.close(36);
      pr_default.close(70);
      pr_default.close(37);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV123EmprCod = "" ;
      Z396EmprCod = "" ;
      Z5806AlbREnt2 = "" ;
      Z46AlbREnt = "" ;
      Z56AlbRUni = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z1291AlbRDes = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      O5806AlbREnt2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      AV137Pgmname = "" ;
      AV8UsurCod = "" ;
      AV29Station = "" ;
      AV84Inc_obs = "" ;
      A5806AlbREnt2 = "" ;
      AV83OldAlb2 = "" ;
      A279CliNom = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      h252CliCod = "" ;
      h970ProceCod = "" ;
      h840TrnCod = "" ;
      h1211TipEntCod = "" ;
      AV123EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockalbrent_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblockalbrent2_Jsonclick = "" ;
      lblTextblockalbrfen_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      lblTextblockalbrhen_Jsonclick = "" ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockalbref_Jsonclick = "" ;
      lblTextblockalbrefdsc_Jsonclick = "" ;
      A3613AlbRefDsc = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockprocecod_Jsonclick = "" ;
      lblTextblocktrncod_Jsonclick = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrunient_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblockalbruni_Jsonclick = "" ;
      lblTextblockalbrpieent_Jsonclick = "" ;
      lblTextblockalbrunic_Jsonclick = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      lblTextblockalbrpiec_Jsonclick = "" ;
      A8029AlbNumM = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbruniuti_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblockalbrunidis_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblockalbrpieuti_Jsonclick = "" ;
      lblTextblockalbrpiedis_Jsonclick = "" ;
      lblTextblockalbrfecult_Jsonclick = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblockalbrest_Jsonclick = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      lblTextblocktipentcod_Jsonclick = "" ;
      lblTextblockalbrdes_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblockalbrlote_Jsonclick = "" ;
      A6463AlbRLote = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrloc_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblockalbrreo_Jsonclick = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrgrm2_Jsonclick = "" ;
      lblTextblockalbranc_Jsonclick = "" ;
      lblTextblockalbpml_Jsonclick = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrph_Jsonclick = "" ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      lblTextblockalbrrlong_Jsonclick = "" ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      lblTextblockalbrrtrans_Jsonclick = "" ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      AV37Modo = "" ;
      AV9AlbCum = "" ;
      AV49Rdto = DecimalUtil.ZERO ;
      AV89artblo = "" ;
      A407EmprNom = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_unnamedtable7_Objectcall = "" ;
      Dvpanel_unnamedtable7_Class = "" ;
      Dvpanel_unnamedtable7_Height = "" ;
      Dvpanel_unnamedtable8_Objectcall = "" ;
      Dvpanel_unnamedtable8_Class = "" ;
      Dvpanel_unnamedtable8_Height = "" ;
      Dvpanel_unnamedtable9_Objectcall = "" ;
      Dvpanel_unnamedtable9_Class = "" ;
      Dvpanel_unnamedtable9_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7EmprNom = "" ;
      GXt_char1 = "" ;
      AV106WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV107TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV108WebSession = httpContext.getWebSession();
      AV113TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z971ProceNom = "" ;
      Z841TrnNom = "" ;
      Z1212TipEntNom = "" ;
      T01OY4_A407EmprNom = new String[] {""} ;
      T01OY4_n407EmprNom = new boolean[] {false} ;
      T01OY9_A1212TipEntNom = new String[] {""} ;
      T01OY9_n1212TipEntNom = new boolean[] {false} ;
      T01OY9_A396EmprCod = new String[] {""} ;
      T01OY9_A1211TipEntCod = new short[1] ;
      T01OY9_n1211TipEntCod = new boolean[] {false} ;
      T01OY10_A841TrnNom = new String[] {""} ;
      T01OY10_n841TrnNom = new boolean[] {false} ;
      T01OY10_A396EmprCod = new String[] {""} ;
      T01OY10_A840TrnCod = new short[1] ;
      T01OY10_n840TrnCod = new boolean[] {false} ;
      T01OY11_A971ProceNom = new String[] {""} ;
      T01OY11_n971ProceNom = new boolean[] {false} ;
      T01OY11_A396EmprCod = new String[] {""} ;
      T01OY11_A970ProceCod = new short[1] ;
      T01OY11_n970ProceCod = new boolean[] {false} ;
      T01OY12_A279CliNom = new String[] {""} ;
      T01OY12_A396EmprCod = new String[] {""} ;
      T01OY12_A252CliCod = new int[1] ;
      T01OY8_A1212TipEntNom = new String[] {""} ;
      T01OY8_n1212TipEntNom = new boolean[] {false} ;
      T01OY6_A841TrnNom = new String[] {""} ;
      T01OY6_n841TrnNom = new boolean[] {false} ;
      T01OY7_A971ProceNom = new String[] {""} ;
      T01OY7_n971ProceNom = new boolean[] {false} ;
      T01OY5_A279CliNom = new String[] {""} ;
      T01OY13_A44AlbRecCod = new int[1] ;
      T01OY13_n44AlbRecCod = new boolean[] {false} ;
      T01OY13_A5806AlbREnt2 = new String[] {""} ;
      T01OY13_A46AlbREnt = new String[] {""} ;
      T01OY13_A56AlbRUni = new String[] {""} ;
      T01OY13_A3613AlbRefDsc = new String[] {""} ;
      T01OY13_A407EmprNom = new String[] {""} ;
      T01OY13_n407EmprNom = new boolean[] {false} ;
      T01OY13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY13_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY13_n4606AlbRHEn = new boolean[] {false} ;
      T01OY13_A279CliNom = new String[] {""} ;
      T01OY13_A45AlbRef = new String[] {""} ;
      T01OY13_A971ProceNom = new String[] {""} ;
      T01OY13_n971ProceNom = new boolean[] {false} ;
      T01OY13_A841TrnNom = new String[] {""} ;
      T01OY13_n841TrnNom = new boolean[] {false} ;
      T01OY13_A1212TipEntNom = new String[] {""} ;
      T01OY13_n1212TipEntNom = new boolean[] {false} ;
      T01OY13_A1291AlbRDes = new String[] {""} ;
      T01OY13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_A52AlbRPieEnt = new int[1] ;
      T01OY13_A50AlbRLoc = new String[] {""} ;
      T01OY13_A55AlbRReo = new String[] {""} ;
      T01OY13_A54AlbRPieUti = new int[1] ;
      T01OY13_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY13_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_A6181AlbrPieC = new int[1] ;
      T01OY13_A4920AlbRGrm2 = new short[1] ;
      T01OY13_A4921AlbRAnc = new short[1] ;
      T01OY13_A4922AlbPml = new short[1] ;
      T01OY13_A6463AlbRLote = new String[] {""} ;
      T01OY13_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_n13241AlbRPh = new boolean[] {false} ;
      T01OY13_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_n13242AlbRRLong = new boolean[] {false} ;
      T01OY13_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_n13243AlbRRTrans = new boolean[] {false} ;
      T01OY13_A8029AlbNumM = new String[] {""} ;
      T01OY13_A53AlbRPieReb = new int[1] ;
      T01OY13_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY13_A10761AlbUltP = new short[1] ;
      T01OY13_n10761AlbUltP = new boolean[] {false} ;
      T01OY13_A7501AlbRecSec = new short[1] ;
      T01OY13_n7501AlbRecSec = new boolean[] {false} ;
      T01OY13_A1222AlbNumEti = new short[1] ;
      T01OY13_A47AlbREst = new byte[1] ;
      T01OY13_A396EmprCod = new String[] {""} ;
      T01OY13_A252CliCod = new int[1] ;
      T01OY13_A840TrnCod = new short[1] ;
      T01OY13_n840TrnCod = new boolean[] {false} ;
      T01OY13_A970ProceCod = new short[1] ;
      T01OY13_n970ProceCod = new boolean[] {false} ;
      T01OY13_A1211TipEntCod = new short[1] ;
      T01OY13_n1211TipEntCod = new boolean[] {false} ;
      T01OY14_A279CliNom = new String[] {""} ;
      T01OY14_A396EmprCod = new String[] {""} ;
      T01OY14_A252CliCod = new int[1] ;
      T01OY15_A971ProceNom = new String[] {""} ;
      T01OY15_n971ProceNom = new boolean[] {false} ;
      T01OY15_A396EmprCod = new String[] {""} ;
      T01OY15_A970ProceCod = new short[1] ;
      T01OY15_n970ProceCod = new boolean[] {false} ;
      T01OY16_A841TrnNom = new String[] {""} ;
      T01OY16_n841TrnNom = new boolean[] {false} ;
      T01OY16_A396EmprCod = new String[] {""} ;
      T01OY16_A840TrnCod = new short[1] ;
      T01OY16_n840TrnCod = new boolean[] {false} ;
      T01OY17_A1212TipEntNom = new String[] {""} ;
      T01OY17_n1212TipEntNom = new boolean[] {false} ;
      T01OY17_A396EmprCod = new String[] {""} ;
      T01OY17_A1211TipEntCod = new short[1] ;
      T01OY17_n1211TipEntCod = new boolean[] {false} ;
      T01OY18_A279CliNom = new String[] {""} ;
      T01OY18_A396EmprCod = new String[] {""} ;
      T01OY18_A252CliCod = new int[1] ;
      T01OY19_A971ProceNom = new String[] {""} ;
      T01OY19_n971ProceNom = new boolean[] {false} ;
      T01OY19_A396EmprCod = new String[] {""} ;
      T01OY19_A970ProceCod = new short[1] ;
      T01OY19_n970ProceCod = new boolean[] {false} ;
      T01OY20_A841TrnNom = new String[] {""} ;
      T01OY20_n841TrnNom = new boolean[] {false} ;
      T01OY20_A396EmprCod = new String[] {""} ;
      T01OY20_A840TrnCod = new short[1] ;
      T01OY20_n840TrnCod = new boolean[] {false} ;
      T01OY21_A1212TipEntNom = new String[] {""} ;
      T01OY21_n1212TipEntNom = new boolean[] {false} ;
      T01OY21_A396EmprCod = new String[] {""} ;
      T01OY21_A1211TipEntCod = new short[1] ;
      T01OY21_n1211TipEntCod = new boolean[] {false} ;
      T01OY22_A279CliNom = new String[] {""} ;
      T01OY23_A841TrnNom = new String[] {""} ;
      T01OY23_n841TrnNom = new boolean[] {false} ;
      T01OY24_A971ProceNom = new String[] {""} ;
      T01OY24_n971ProceNom = new boolean[] {false} ;
      T01OY25_A1212TipEntNom = new String[] {""} ;
      T01OY25_n1212TipEntNom = new boolean[] {false} ;
      T01OY26_A396EmprCod = new String[] {""} ;
      T01OY26_A44AlbRecCod = new int[1] ;
      T01OY26_n44AlbRecCod = new boolean[] {false} ;
      T01OY3_A44AlbRecCod = new int[1] ;
      T01OY3_n44AlbRecCod = new boolean[] {false} ;
      T01OY3_A5806AlbREnt2 = new String[] {""} ;
      T01OY3_A46AlbREnt = new String[] {""} ;
      T01OY3_A56AlbRUni = new String[] {""} ;
      T01OY3_A3613AlbRefDsc = new String[] {""} ;
      T01OY3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY3_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY3_n4606AlbRHEn = new boolean[] {false} ;
      T01OY3_A45AlbRef = new String[] {""} ;
      T01OY3_A1291AlbRDes = new String[] {""} ;
      T01OY3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_A52AlbRPieEnt = new int[1] ;
      T01OY3_A50AlbRLoc = new String[] {""} ;
      T01OY3_A55AlbRReo = new String[] {""} ;
      T01OY3_A54AlbRPieUti = new int[1] ;
      T01OY3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY3_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_A6181AlbrPieC = new int[1] ;
      T01OY3_A4920AlbRGrm2 = new short[1] ;
      T01OY3_A4921AlbRAnc = new short[1] ;
      T01OY3_A4922AlbPml = new short[1] ;
      T01OY3_A6463AlbRLote = new String[] {""} ;
      T01OY3_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_n13241AlbRPh = new boolean[] {false} ;
      T01OY3_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_n13242AlbRRLong = new boolean[] {false} ;
      T01OY3_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_n13243AlbRRTrans = new boolean[] {false} ;
      T01OY3_A8029AlbNumM = new String[] {""} ;
      T01OY3_A53AlbRPieReb = new int[1] ;
      T01OY3_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY3_A10761AlbUltP = new short[1] ;
      T01OY3_n10761AlbUltP = new boolean[] {false} ;
      T01OY3_A7501AlbRecSec = new short[1] ;
      T01OY3_n7501AlbRecSec = new boolean[] {false} ;
      T01OY3_A1222AlbNumEti = new short[1] ;
      T01OY3_A47AlbREst = new byte[1] ;
      T01OY3_A396EmprCod = new String[] {""} ;
      T01OY3_A252CliCod = new int[1] ;
      T01OY3_A840TrnCod = new short[1] ;
      T01OY3_n840TrnCod = new boolean[] {false} ;
      T01OY3_A970ProceCod = new short[1] ;
      T01OY3_n970ProceCod = new boolean[] {false} ;
      T01OY3_A1211TipEntCod = new short[1] ;
      T01OY3_n1211TipEntCod = new boolean[] {false} ;
      T01OY27_A396EmprCod = new String[] {""} ;
      T01OY27_A44AlbRecCod = new int[1] ;
      T01OY27_n44AlbRecCod = new boolean[] {false} ;
      T01OY28_A396EmprCod = new String[] {""} ;
      T01OY28_A44AlbRecCod = new int[1] ;
      T01OY28_n44AlbRecCod = new boolean[] {false} ;
      T01OY29_A279CliNom = new String[] {""} ;
      T01OY29_A396EmprCod = new String[] {""} ;
      T01OY29_A252CliCod = new int[1] ;
      T01OY30_A971ProceNom = new String[] {""} ;
      T01OY30_n971ProceNom = new boolean[] {false} ;
      T01OY30_A396EmprCod = new String[] {""} ;
      T01OY30_A970ProceCod = new short[1] ;
      T01OY30_n970ProceCod = new boolean[] {false} ;
      T01OY31_A841TrnNom = new String[] {""} ;
      T01OY31_n841TrnNom = new boolean[] {false} ;
      T01OY31_A396EmprCod = new String[] {""} ;
      T01OY31_A840TrnCod = new short[1] ;
      T01OY31_n840TrnCod = new boolean[] {false} ;
      T01OY32_A1212TipEntNom = new String[] {""} ;
      T01OY32_n1212TipEntNom = new boolean[] {false} ;
      T01OY32_A396EmprCod = new String[] {""} ;
      T01OY32_A1211TipEntCod = new short[1] ;
      T01OY32_n1211TipEntCod = new boolean[] {false} ;
      T01OY2_A44AlbRecCod = new int[1] ;
      T01OY2_n44AlbRecCod = new boolean[] {false} ;
      T01OY2_A5806AlbREnt2 = new String[] {""} ;
      T01OY2_A46AlbREnt = new String[] {""} ;
      T01OY2_A56AlbRUni = new String[] {""} ;
      T01OY2_A3613AlbRefDsc = new String[] {""} ;
      T01OY2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY2_n4606AlbRHEn = new boolean[] {false} ;
      T01OY2_A45AlbRef = new String[] {""} ;
      T01OY2_A1291AlbRDes = new String[] {""} ;
      T01OY2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_A52AlbRPieEnt = new int[1] ;
      T01OY2_A50AlbRLoc = new String[] {""} ;
      T01OY2_A55AlbRReo = new String[] {""} ;
      T01OY2_A54AlbRPieUti = new int[1] ;
      T01OY2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01OY2_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_A6181AlbrPieC = new int[1] ;
      T01OY2_A4920AlbRGrm2 = new short[1] ;
      T01OY2_A4921AlbRAnc = new short[1] ;
      T01OY2_A4922AlbPml = new short[1] ;
      T01OY2_A6463AlbRLote = new String[] {""} ;
      T01OY2_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_n13241AlbRPh = new boolean[] {false} ;
      T01OY2_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_n13242AlbRRLong = new boolean[] {false} ;
      T01OY2_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_n13243AlbRRTrans = new boolean[] {false} ;
      T01OY2_A8029AlbNumM = new String[] {""} ;
      T01OY2_A53AlbRPieReb = new int[1] ;
      T01OY2_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OY2_A10761AlbUltP = new short[1] ;
      T01OY2_n10761AlbUltP = new boolean[] {false} ;
      T01OY2_A7501AlbRecSec = new short[1] ;
      T01OY2_n7501AlbRecSec = new boolean[] {false} ;
      T01OY2_A1222AlbNumEti = new short[1] ;
      T01OY2_A47AlbREst = new byte[1] ;
      T01OY2_A396EmprCod = new String[] {""} ;
      T01OY2_A252CliCod = new int[1] ;
      T01OY2_A840TrnCod = new short[1] ;
      T01OY2_n840TrnCod = new boolean[] {false} ;
      T01OY2_A970ProceCod = new short[1] ;
      T01OY2_n970ProceCod = new boolean[] {false} ;
      T01OY2_A1211TipEntCod = new short[1] ;
      T01OY2_n1211TipEntCod = new boolean[] {false} ;
      T01OY36_A279CliNom = new String[] {""} ;
      T01OY37_A841TrnNom = new String[] {""} ;
      T01OY37_n841TrnNom = new boolean[] {false} ;
      T01OY38_A971ProceNom = new String[] {""} ;
      T01OY38_n971ProceNom = new boolean[] {false} ;
      T01OY39_A1212TipEntNom = new String[] {""} ;
      T01OY39_n1212TipEntNom = new boolean[] {false} ;
      T01OY40_A396EmprCod = new String[] {""} ;
      T01OY40_A13026PedDGId = new int[1] ;
      T01OY40_A44AlbRecCod = new int[1] ;
      T01OY40_n44AlbRecCod = new boolean[] {false} ;
      T01OY41_A396EmprCod = new String[] {""} ;
      T01OY41_A11669DevCruId = new int[1] ;
      T01OY41_A44AlbRecCod = new int[1] ;
      T01OY41_n44AlbRecCod = new boolean[] {false} ;
      T01OY42_A396EmprCod = new String[] {""} ;
      T01OY42_A44AlbRecCod = new int[1] ;
      T01OY42_n44AlbRecCod = new boolean[] {false} ;
      T01OY42_A9743Emp_CUb = new String[] {""} ;
      T01OY42_A5860Emp_Anp = new short[1] ;
      T01OY43_A396EmprCod = new String[] {""} ;
      T01OY43_A44AlbRecCod = new int[1] ;
      T01OY43_n44AlbRecCod = new boolean[] {false} ;
      T01OY43_A7130MatC_Pz = new String[] {""} ;
      T01OY44_A396EmprCod = new String[] {""} ;
      T01OY44_A44AlbRecCod = new int[1] ;
      T01OY44_n44AlbRecCod = new boolean[] {false} ;
      T01OY44_A7132MatC_Talla = new String[] {""} ;
      T01OY45_A396EmprCod = new String[] {""} ;
      T01OY45_A44AlbRecCod = new int[1] ;
      T01OY45_n44AlbRecCod = new boolean[] {false} ;
      T01OY45_A7115MatC_Lin = new short[1] ;
      T01OY46_A396EmprCod = new String[] {""} ;
      T01OY46_A30AlbProCod = new long[1] ;
      T01OY46_A129BarCod = new int[1] ;
      T01OY46_A132BarCodReo = new byte[1] ;
      T01OY46_A130BarCodPar = new String[] {""} ;
      T01OY46_A6622AlbHdRLn = new short[1] ;
      T01OY47_A396EmprCod = new String[] {""} ;
      T01OY47_A6235DevEmpCod = new int[1] ;
      T01OY47_A6243DevNumLin = new byte[1] ;
      T01OY48_A396EmprCod = new String[] {""} ;
      T01OY48_A44AlbRecCod = new int[1] ;
      T01OY48_n44AlbRecCod = new boolean[] {false} ;
      T01OY48_A4596AlbRDefCod = new short[1] ;
      T01OY49_A396EmprCod = new String[] {""} ;
      T01OY49_A44AlbRecCod = new int[1] ;
      T01OY49_n44AlbRecCod = new boolean[] {false} ;
      T01OY49_A2159AlbRecPie = new String[] {""} ;
      T01OY50_A396EmprCod = new String[] {""} ;
      T01OY50_A44AlbRecCod = new int[1] ;
      T01OY50_n44AlbRecCod = new boolean[] {false} ;
      T01OY50_A2165HisEmpLin = new short[1] ;
      T01OY51_A396EmprCod = new String[] {""} ;
      T01OY51_A44AlbRecCod = new int[1] ;
      T01OY51_n44AlbRecCod = new boolean[] {false} ;
      T01OY51_A1299AlbRLin = new byte[1] ;
      T01OY52_A396EmprCod = new String[] {""} ;
      T01OY52_A361DisCod = new int[1] ;
      T01OY52_A44AlbRecCod = new int[1] ;
      T01OY52_n44AlbRecCod = new boolean[] {false} ;
      T01OY53_A396EmprCod = new String[] {""} ;
      T01OY53_A323DevGenCod = new int[1] ;
      T01OY54_A396EmprCod = new String[] {""} ;
      T01OY54_A129BarCod = new int[1] ;
      T01OY54_A132BarCodReo = new byte[1] ;
      T01OY54_A130BarCodPar = new String[] {""} ;
      T01OY54_A200BarPieCod = new String[] {""} ;
      T01OY55_A396EmprCod = new String[] {""} ;
      T01OY55_A44AlbRecCod = new int[1] ;
      T01OY55_n44AlbRecCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV37Modo = "" ;
      i56AlbRUni = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l279CliNom = "" ;
      T01OY56_A279CliNom = new String[] {""} ;
      l45AlbRef = "" ;
      T01OY57_A45AlbRef = new String[] {""} ;
      l971ProceNom = "" ;
      T01OY58_A971ProceNom = new String[] {""} ;
      T01OY58_n971ProceNom = new boolean[] {false} ;
      l841TrnNom = "" ;
      T01OY59_A841TrnNom = new String[] {""} ;
      T01OY59_n841TrnNom = new boolean[] {false} ;
      l1212TipEntNom = "" ;
      T01OY60_A1212TipEntNom = new String[] {""} ;
      T01OY60_n1212TipEntNom = new boolean[] {false} ;
      T01OY61_A279CliNom = new String[] {""} ;
      T01OY61_A396EmprCod = new String[] {""} ;
      T01OY61_A252CliCod = new int[1] ;
      T01OY62_A971ProceNom = new String[] {""} ;
      T01OY62_n971ProceNom = new boolean[] {false} ;
      T01OY62_A396EmprCod = new String[] {""} ;
      T01OY62_A970ProceCod = new short[1] ;
      T01OY62_n970ProceCod = new boolean[] {false} ;
      T01OY63_A841TrnNom = new String[] {""} ;
      T01OY63_n841TrnNom = new boolean[] {false} ;
      T01OY63_A396EmprCod = new String[] {""} ;
      T01OY63_A840TrnCod = new short[1] ;
      T01OY63_n840TrnCod = new boolean[] {false} ;
      T01OY64_A1212TipEntNom = new String[] {""} ;
      T01OY64_n1212TipEntNom = new boolean[] {false} ;
      T01OY64_A396EmprCod = new String[] {""} ;
      T01OY64_A1211TipEntCod = new short[1] ;
      T01OY64_n1211TipEntCod = new boolean[] {false} ;
      ZV83OldAlb2 = "" ;
      T01OY65_A279CliNom = new String[] {""} ;
      T01OY65_A396EmprCod = new String[] {""} ;
      T01OY65_A252CliCod = new int[1] ;
      T01OY66_A279CliNom = new String[] {""} ;
      Zh252CliCod = "" ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV49Rdto = DecimalUtil.ZERO ;
      ZV89artblo = "" ;
      T01OY67_A971ProceNom = new String[] {""} ;
      T01OY67_n971ProceNom = new boolean[] {false} ;
      T01OY67_A396EmprCod = new String[] {""} ;
      T01OY67_A970ProceCod = new short[1] ;
      T01OY67_n970ProceCod = new boolean[] {false} ;
      T01OY68_A971ProceNom = new String[] {""} ;
      T01OY68_n971ProceNom = new boolean[] {false} ;
      GXv_char14 = new String[1] ;
      GXv_int6 = new byte[1] ;
      Zh970ProceCod = "" ;
      T01OY69_A841TrnNom = new String[] {""} ;
      T01OY69_n841TrnNom = new boolean[] {false} ;
      T01OY69_A396EmprCod = new String[] {""} ;
      T01OY69_A840TrnCod = new short[1] ;
      T01OY69_n840TrnCod = new boolean[] {false} ;
      T01OY70_A841TrnNom = new String[] {""} ;
      T01OY70_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      ZV9AlbCum = "" ;
      T01OY71_A1212TipEntNom = new String[] {""} ;
      T01OY71_n1212TipEntNom = new boolean[] {false} ;
      T01OY71_A396EmprCod = new String[] {""} ;
      T01OY71_A1211TipEntCod = new short[1] ;
      T01OY71_n1211TipEntCod = new boolean[] {false} ;
      T01OY72_A1212TipEntNom = new String[] {""} ;
      T01OY72_n1212TipEntNom = new boolean[] {false} ;
      Zh1211TipEntCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbdet1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbdet1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbdet1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbdet1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet1__default(),
         new Object[] {
             new Object[] {
            T01OY2_A44AlbRecCod, T01OY2_A5806AlbREnt2, T01OY2_A46AlbREnt, T01OY2_A56AlbRUni, T01OY2_A3613AlbRefDsc, T01OY2_A49AlbRFen, T01OY2_A4606AlbRHEn, T01OY2_n4606AlbRHEn, T01OY2_A45AlbRef, T01OY2_A1291AlbRDes,
            T01OY2_A58AlbRUniEnt, T01OY2_A52AlbRPieEnt, T01OY2_A50AlbRLoc, T01OY2_A55AlbRReo, T01OY2_A54AlbRPieUti, T01OY2_A60AlbRUniUti, T01OY2_A48AlbRFecUlt, T01OY2_A6180AlbrUniC, T01OY2_A6181AlbrPieC, T01OY2_A4920AlbRGrm2,
            T01OY2_A4921AlbRAnc, T01OY2_A4922AlbPml, T01OY2_A6463AlbRLote, T01OY2_A13241AlbRPh, T01OY2_n13241AlbRPh, T01OY2_A13242AlbRRLong, T01OY2_n13242AlbRRLong, T01OY2_A13243AlbRRTrans, T01OY2_n13243AlbRRTrans, T01OY2_A8029AlbNumM,
            T01OY2_A53AlbRPieReb, T01OY2_A59AlbRUniReb, T01OY2_A10761AlbUltP, T01OY2_n10761AlbUltP, T01OY2_A7501AlbRecSec, T01OY2_n7501AlbRecSec, T01OY2_A1222AlbNumEti, T01OY2_A47AlbREst, T01OY2_A396EmprCod, T01OY2_A252CliCod,
            T01OY2_A840TrnCod, T01OY2_n840TrnCod, T01OY2_A970ProceCod, T01OY2_n970ProceCod, T01OY2_A1211TipEntCod, T01OY2_n1211TipEntCod
            }
            , new Object[] {
            T01OY3_A44AlbRecCod, T01OY3_A5806AlbREnt2, T01OY3_A46AlbREnt, T01OY3_A56AlbRUni, T01OY3_A3613AlbRefDsc, T01OY3_A49AlbRFen, T01OY3_A4606AlbRHEn, T01OY3_n4606AlbRHEn, T01OY3_A45AlbRef, T01OY3_A1291AlbRDes,
            T01OY3_A58AlbRUniEnt, T01OY3_A52AlbRPieEnt, T01OY3_A50AlbRLoc, T01OY3_A55AlbRReo, T01OY3_A54AlbRPieUti, T01OY3_A60AlbRUniUti, T01OY3_A48AlbRFecUlt, T01OY3_A6180AlbrUniC, T01OY3_A6181AlbrPieC, T01OY3_A4920AlbRGrm2,
            T01OY3_A4921AlbRAnc, T01OY3_A4922AlbPml, T01OY3_A6463AlbRLote, T01OY3_A13241AlbRPh, T01OY3_n13241AlbRPh, T01OY3_A13242AlbRRLong, T01OY3_n13242AlbRRLong, T01OY3_A13243AlbRRTrans, T01OY3_n13243AlbRRTrans, T01OY3_A8029AlbNumM,
            T01OY3_A53AlbRPieReb, T01OY3_A59AlbRUniReb, T01OY3_A10761AlbUltP, T01OY3_n10761AlbUltP, T01OY3_A7501AlbRecSec, T01OY3_n7501AlbRecSec, T01OY3_A1222AlbNumEti, T01OY3_A47AlbREst, T01OY3_A396EmprCod, T01OY3_A252CliCod,
            T01OY3_A840TrnCod, T01OY3_n840TrnCod, T01OY3_A970ProceCod, T01OY3_n970ProceCod, T01OY3_A1211TipEntCod, T01OY3_n1211TipEntCod
            }
            , new Object[] {
            T01OY4_A407EmprNom, T01OY4_n407EmprNom
            }
            , new Object[] {
            T01OY5_A279CliNom
            }
            , new Object[] {
            T01OY6_A841TrnNom, T01OY6_n841TrnNom
            }
            , new Object[] {
            T01OY7_A971ProceNom, T01OY7_n971ProceNom
            }
            , new Object[] {
            T01OY8_A1212TipEntNom, T01OY8_n1212TipEntNom
            }
            , new Object[] {
            T01OY9_A1212TipEntNom, T01OY9_n1212TipEntNom, T01OY9_A396EmprCod, T01OY9_A1211TipEntCod
            }
            , new Object[] {
            T01OY10_A841TrnNom, T01OY10_n841TrnNom, T01OY10_A396EmprCod, T01OY10_A840TrnCod
            }
            , new Object[] {
            T01OY11_A971ProceNom, T01OY11_n971ProceNom, T01OY11_A396EmprCod, T01OY11_A970ProceCod
            }
            , new Object[] {
            T01OY12_A279CliNom, T01OY12_A396EmprCod, T01OY12_A252CliCod
            }
            , new Object[] {
            T01OY13_A44AlbRecCod, T01OY13_A5806AlbREnt2, T01OY13_A46AlbREnt, T01OY13_A56AlbRUni, T01OY13_A3613AlbRefDsc, T01OY13_A407EmprNom, T01OY13_n407EmprNom, T01OY13_A49AlbRFen, T01OY13_A4606AlbRHEn, T01OY13_n4606AlbRHEn,
            T01OY13_A279CliNom, T01OY13_A45AlbRef, T01OY13_A971ProceNom, T01OY13_n971ProceNom, T01OY13_A841TrnNom, T01OY13_n841TrnNom, T01OY13_A1212TipEntNom, T01OY13_n1212TipEntNom, T01OY13_A1291AlbRDes, T01OY13_A58AlbRUniEnt,
            T01OY13_A52AlbRPieEnt, T01OY13_A50AlbRLoc, T01OY13_A55AlbRReo, T01OY13_A54AlbRPieUti, T01OY13_A60AlbRUniUti, T01OY13_A48AlbRFecUlt, T01OY13_A6180AlbrUniC, T01OY13_A6181AlbrPieC, T01OY13_A4920AlbRGrm2, T01OY13_A4921AlbRAnc,
            T01OY13_A4922AlbPml, T01OY13_A6463AlbRLote, T01OY13_A13241AlbRPh, T01OY13_n13241AlbRPh, T01OY13_A13242AlbRRLong, T01OY13_n13242AlbRRLong, T01OY13_A13243AlbRRTrans, T01OY13_n13243AlbRRTrans, T01OY13_A8029AlbNumM, T01OY13_A53AlbRPieReb,
            T01OY13_A59AlbRUniReb, T01OY13_A10761AlbUltP, T01OY13_n10761AlbUltP, T01OY13_A7501AlbRecSec, T01OY13_n7501AlbRecSec, T01OY13_A1222AlbNumEti, T01OY13_A47AlbREst, T01OY13_A396EmprCod, T01OY13_A252CliCod, T01OY13_A840TrnCod,
            T01OY13_n840TrnCod, T01OY13_A970ProceCod, T01OY13_n970ProceCod, T01OY13_A1211TipEntCod, T01OY13_n1211TipEntCod
            }
            , new Object[] {
            T01OY14_A279CliNom, T01OY14_A396EmprCod, T01OY14_A252CliCod
            }
            , new Object[] {
            T01OY15_A971ProceNom, T01OY15_n971ProceNom, T01OY15_A396EmprCod, T01OY15_A970ProceCod
            }
            , new Object[] {
            T01OY16_A841TrnNom, T01OY16_n841TrnNom, T01OY16_A396EmprCod, T01OY16_A840TrnCod
            }
            , new Object[] {
            T01OY17_A1212TipEntNom, T01OY17_n1212TipEntNom, T01OY17_A396EmprCod, T01OY17_A1211TipEntCod
            }
            , new Object[] {
            T01OY18_A279CliNom, T01OY18_A396EmprCod, T01OY18_A252CliCod
            }
            , new Object[] {
            T01OY19_A971ProceNom, T01OY19_n971ProceNom, T01OY19_A396EmprCod, T01OY19_A970ProceCod
            }
            , new Object[] {
            T01OY20_A841TrnNom, T01OY20_n841TrnNom, T01OY20_A396EmprCod, T01OY20_A840TrnCod
            }
            , new Object[] {
            T01OY21_A1212TipEntNom, T01OY21_n1212TipEntNom, T01OY21_A396EmprCod, T01OY21_A1211TipEntCod
            }
            , new Object[] {
            T01OY22_A279CliNom
            }
            , new Object[] {
            T01OY23_A841TrnNom, T01OY23_n841TrnNom
            }
            , new Object[] {
            T01OY24_A971ProceNom, T01OY24_n971ProceNom
            }
            , new Object[] {
            T01OY25_A1212TipEntNom, T01OY25_n1212TipEntNom
            }
            , new Object[] {
            T01OY26_A396EmprCod, T01OY26_A44AlbRecCod
            }
            , new Object[] {
            T01OY27_A396EmprCod, T01OY27_A44AlbRecCod
            }
            , new Object[] {
            T01OY28_A396EmprCod, T01OY28_A44AlbRecCod
            }
            , new Object[] {
            T01OY29_A279CliNom, T01OY29_A396EmprCod, T01OY29_A252CliCod
            }
            , new Object[] {
            T01OY30_A971ProceNom, T01OY30_n971ProceNom, T01OY30_A396EmprCod, T01OY30_A970ProceCod
            }
            , new Object[] {
            T01OY31_A841TrnNom, T01OY31_n841TrnNom, T01OY31_A396EmprCod, T01OY31_A840TrnCod
            }
            , new Object[] {
            T01OY32_A1212TipEntNom, T01OY32_n1212TipEntNom, T01OY32_A396EmprCod, T01OY32_A1211TipEntCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OY36_A279CliNom
            }
            , new Object[] {
            T01OY37_A841TrnNom, T01OY37_n841TrnNom
            }
            , new Object[] {
            T01OY38_A971ProceNom, T01OY38_n971ProceNom
            }
            , new Object[] {
            T01OY39_A1212TipEntNom, T01OY39_n1212TipEntNom
            }
            , new Object[] {
            T01OY40_A396EmprCod, T01OY40_A13026PedDGId, T01OY40_A44AlbRecCod
            }
            , new Object[] {
            T01OY41_A396EmprCod, T01OY41_A11669DevCruId, T01OY41_A44AlbRecCod
            }
            , new Object[] {
            T01OY42_A396EmprCod, T01OY42_A44AlbRecCod, T01OY42_A9743Emp_CUb, T01OY42_A5860Emp_Anp
            }
            , new Object[] {
            T01OY43_A396EmprCod, T01OY43_A44AlbRecCod, T01OY43_A7130MatC_Pz
            }
            , new Object[] {
            T01OY44_A396EmprCod, T01OY44_A44AlbRecCod, T01OY44_A7132MatC_Talla
            }
            , new Object[] {
            T01OY45_A396EmprCod, T01OY45_A44AlbRecCod, T01OY45_A7115MatC_Lin
            }
            , new Object[] {
            T01OY46_A396EmprCod, T01OY46_A30AlbProCod, T01OY46_A129BarCod, T01OY46_A132BarCodReo, T01OY46_A130BarCodPar, T01OY46_A6622AlbHdRLn
            }
            , new Object[] {
            T01OY47_A396EmprCod, T01OY47_A6235DevEmpCod, T01OY47_A6243DevNumLin
            }
            , new Object[] {
            T01OY48_A396EmprCod, T01OY48_A44AlbRecCod, T01OY48_A4596AlbRDefCod
            }
            , new Object[] {
            T01OY49_A396EmprCod, T01OY49_A44AlbRecCod, T01OY49_A2159AlbRecPie
            }
            , new Object[] {
            T01OY50_A396EmprCod, T01OY50_A44AlbRecCod, T01OY50_A2165HisEmpLin
            }
            , new Object[] {
            T01OY51_A396EmprCod, T01OY51_A44AlbRecCod, T01OY51_A1299AlbRLin
            }
            , new Object[] {
            T01OY52_A396EmprCod, T01OY52_A361DisCod, T01OY52_A44AlbRecCod
            }
            , new Object[] {
            T01OY53_A396EmprCod, T01OY53_A323DevGenCod
            }
            , new Object[] {
            T01OY54_A396EmprCod, T01OY54_A129BarCod, T01OY54_A132BarCodReo, T01OY54_A130BarCodPar, T01OY54_A200BarPieCod
            }
            , new Object[] {
            T01OY55_A396EmprCod, T01OY55_A44AlbRecCod
            }
            , new Object[] {
            T01OY56_A279CliNom
            }
            , new Object[] {
            T01OY57_A45AlbRef
            }
            , new Object[] {
            T01OY58_A971ProceNom, T01OY58_n971ProceNom
            }
            , new Object[] {
            T01OY59_A841TrnNom, T01OY59_n841TrnNom
            }
            , new Object[] {
            T01OY60_A1212TipEntNom, T01OY60_n1212TipEntNom
            }
            , new Object[] {
            T01OY61_A279CliNom, T01OY61_A396EmprCod, T01OY61_A252CliCod
            }
            , new Object[] {
            T01OY62_A971ProceNom, T01OY62_n971ProceNom, T01OY62_A396EmprCod, T01OY62_A970ProceCod
            }
            , new Object[] {
            T01OY63_A841TrnNom, T01OY63_n841TrnNom, T01OY63_A396EmprCod, T01OY63_A840TrnCod
            }
            , new Object[] {
            T01OY64_A1212TipEntNom, T01OY64_n1212TipEntNom, T01OY64_A396EmprCod, T01OY64_A1211TipEntCod
            }
            , new Object[] {
            T01OY65_A279CliNom, T01OY65_A396EmprCod, T01OY65_A252CliCod
            }
            , new Object[] {
            T01OY66_A279CliNom
            }
            , new Object[] {
            T01OY67_A971ProceNom, T01OY67_n971ProceNom, T01OY67_A396EmprCod, T01OY67_A970ProceCod
            }
            , new Object[] {
            T01OY68_A971ProceNom, T01OY68_n971ProceNom
            }
            , new Object[] {
            T01OY69_A841TrnNom, T01OY69_n841TrnNom, T01OY69_A396EmprCod, T01OY69_A840TrnCod
            }
            , new Object[] {
            T01OY70_A841TrnNom, T01OY70_n841TrnNom
            }
            , new Object[] {
            T01OY71_A1212TipEntNom, T01OY71_n1212TipEntNom, T01OY71_A396EmprCod, T01OY71_A1211TipEntCod
            }
            , new Object[] {
            T01OY72_A1212TipEntNom, T01OY72_n1212TipEntNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV137Pgmname = "TALBDET1" ;
      Z4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      i4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      i47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte AV69SiArt ;
   private byte AV79Enc20c ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte AV90Termilenio ;
   private byte AV41FlagKgs ;
   private byte AV42FlagMts ;
   private byte AV67ErrP ;
   private byte Gx_BScreen ;
   private byte AV51FlagArt ;
   private byte AV68ErrArt ;
   private byte AV72Flag ;
   private byte AV66Tintatex ;
   private byte AV80Velluts ;
   private byte AV44FlagGraf ;
   private byte AV48SumPza ;
   private byte AV52CalMKT ;
   private byte AV57Artextil ;
   private byte AV61NoPzaR ;
   private byte AV73Noctrlpz ;
   private byte AV74VerItm ;
   private byte AV85Colorsol ;
   private byte AV88PesSim ;
   private byte AV91stamperia ;
   private byte AV94Piolera ;
   private byte AV95tintoriente ;
   private byte AV98Estampamos ;
   private byte AV103biarprint ;
   private byte AV96UbicaL ;
   private byte AV99ValorUbica ;
   private byte gxajaxcallmode ;
   private byte i47AlbREst ;
   private byte ZV51FlagArt ;
   private byte ZV68ErrArt ;
   private byte ZV72Flag ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte ZV67ErrP ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z10761AlbUltP ;
   private short Z7501AlbRecSec ;
   private short Z1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short N970ProceCod ;
   private short N840TrnCod ;
   private short N1211TipEntCod ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short A10761AlbUltP ;
   private short A7501AlbRecSec ;
   private short A1222AlbNumEti ;
   private short AV110Insert_ProceCod ;
   private short AV111Insert_TrnCod ;
   private short AV112Insert_TipEntCod ;
   private short AV50Pesoml ;
   private short AV100Anc ;
   private short AV101grm2 ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short gxhchits ;
   private short GXv_int12[] ;
   private short GXv_int11[] ;
   private short GXv_int13[] ;
   private short ZV50Pesoml ;
   private short ZV100Anc ;
   private short ZV101grm2 ;
   private int wcpOAV124AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z6181AlbrPieC ;
   private int Z53AlbRPieReb ;
   private int Z252CliCod ;
   private int N252CliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV124AlbRecCod ;
   private int trnEnded ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRHEn_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPh_Enabled ;
   private int edtAlbRRLong_Enabled ;
   private int edtAlbRRTrans_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int A53AlbRPieReb ;
   private int AV109Insert_CliCod ;
   private int GXt_int7 ;
   private int AV138GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int GXv_int8[] ;
   private long AV59f_NOTREC ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z13241AlbRPh ;
   private java.math.BigDecimal Z13242AlbRRLong ;
   private java.math.BigDecimal Z13243AlbRRTrans ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A13241AlbRPh ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal AV49Rdto ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZV49Rdto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV123EmprCod ;
   private String Z396EmprCod ;
   private String Z5806AlbREnt2 ;
   private String Z46AlbREnt ;
   private String Z56AlbRUni ;
   private String Z3613AlbRefDsc ;
   private String Z45AlbRef ;
   private String Z1291AlbRDes ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z6463AlbRLote ;
   private String Z8029AlbNumM ;
   private String O5806AlbREnt2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String AV137Pgmname ;
   private String AV8UsurCod ;
   private String AV29Station ;
   private String A5806AlbREnt2 ;
   private String AV83OldAlb2 ;
   private String A279CliNom ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String h252CliCod ;
   private String h970ProceCod ;
   private String h840TrnCod ;
   private String h1211TipEntCod ;
   private String AV123EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable18_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String divUnnamedtablealbrent_Internalname ;
   private String lblTextblockalbrent_Internalname ;
   private String lblTextblockalbrent_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String divUnnamedtablealbrent2_Internalname ;
   private String lblTextblockalbrent2_Internalname ;
   private String lblTextblockalbrent2_Jsonclick ;
   private String edtAlbREnt2_Internalname ;
   private String edtAlbREnt2_Jsonclick ;
   private String divUnnamedtablealbrfen_Internalname ;
   private String lblTextblockalbrfen_Internalname ;
   private String lblTextblockalbrfen_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String divUnnamedtablealbrhen_Internalname ;
   private String lblTextblockalbrhen_Internalname ;
   private String lblTextblockalbrhen_Jsonclick ;
   private String edtAlbRHEn_Internalname ;
   private String edtAlbRHEn_Jsonclick ;
   private String tblTablemergedunnamedtable2_Internalname ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtablealbref_Internalname ;
   private String lblTextblockalbref_Internalname ;
   private String lblTextblockalbref_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRef_Jsonclick ;
   private String divUnnamedtablealbrefdsc_Internalname ;
   private String lblTextblockalbrefdsc_Internalname ;
   private String lblTextblockalbrefdsc_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String divUnnamedtableprocecod_Internalname ;
   private String lblTextblockprocecod_Internalname ;
   private String lblTextblockprocecod_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String divUnnamedtabletrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String tblTablemergedunnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String tblUnnamedtable4_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String divUnnamedtablealbrunient_Internalname ;
   private String lblTextblockalbrunient_Internalname ;
   private String lblTextblockalbrunient_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String divUnnamedtablealbruni_Internalname ;
   private String lblTextblockalbruni_Internalname ;
   private String lblTextblockalbruni_Jsonclick ;
   private String divUnnamedtablealbrpieent_Internalname ;
   private String lblTextblockalbrpieent_Internalname ;
   private String lblTextblockalbrpieent_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String divUnnamedtablealbrunic_Internalname ;
   private String lblTextblockalbrunic_Internalname ;
   private String lblTextblockalbrunic_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String divUnnamedtablealbrpiec_Internalname ;
   private String lblTextblockalbrpiec_Internalname ;
   private String lblTextblockalbrpiec_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String edtAlbNumM_Internalname ;
   private String A8029AlbNumM ;
   private String edtAlbNumM_Jsonclick ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String tblUnnamedtable5_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divUnnamedtablealbruniuti_Internalname ;
   private String lblTextblockalbruniuti_Internalname ;
   private String lblTextblockalbruniuti_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String divUnnamedtablealbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtablealbrpieuti_Internalname ;
   private String lblTextblockalbrpieuti_Internalname ;
   private String lblTextblockalbrpieuti_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String divUnnamedtablealbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String divUnnamedtablealbrfecult_Internalname ;
   private String lblTextblockalbrfecult_Internalname ;
   private String lblTextblockalbrfecult_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String divUnnamedtablealbrest_Internalname ;
   private String lblTextblockalbrest_Internalname ;
   private String lblTextblockalbrest_Jsonclick ;
   private String tblTablemergedunnamedtable6_Internalname ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String tblUnnamedtable6_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtabletipentcod_Internalname ;
   private String lblTextblocktipentcod_Internalname ;
   private String lblTextblocktipentcod_Jsonclick ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String divUnnamedtablealbrdes_Internalname ;
   private String lblTextblockalbrdes_Internalname ;
   private String lblTextblockalbrdes_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String divUnnamedtablealbrlote_Internalname ;
   private String lblTextblockalbrlote_Internalname ;
   private String lblTextblockalbrlote_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String tblUnnamedtable7_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String divUnnamedtablealbrloc_Internalname ;
   private String lblTextblockalbrloc_Internalname ;
   private String lblTextblockalbrloc_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String divUnnamedtablealbrreo_Internalname ;
   private String lblTextblockalbrreo_Internalname ;
   private String lblTextblockalbrreo_Jsonclick ;
   private String tblTablemergedunnamedtable8_Internalname ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String tblUnnamedtable8_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtablealbrgrm2_Internalname ;
   private String lblTextblockalbrgrm2_Internalname ;
   private String lblTextblockalbrgrm2_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String divUnnamedtablealbranc_Internalname ;
   private String lblTextblockalbranc_Internalname ;
   private String lblTextblockalbranc_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String divUnnamedtablealbpml_Internalname ;
   private String lblTextblockalbpml_Internalname ;
   private String lblTextblockalbpml_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String tblUnnamedtable9_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtablealbrph_Internalname ;
   private String lblTextblockalbrph_Internalname ;
   private String lblTextblockalbrph_Jsonclick ;
   private String edtAlbRPh_Internalname ;
   private String edtAlbRPh_Jsonclick ;
   private String divUnnamedtablealbrrlong_Internalname ;
   private String lblTextblockalbrrlong_Internalname ;
   private String lblTextblockalbrrlong_Jsonclick ;
   private String edtAlbRRLong_Internalname ;
   private String edtAlbRRLong_Jsonclick ;
   private String divUnnamedtablealbrrtrans_Internalname ;
   private String lblTextblockalbrrtrans_Internalname ;
   private String lblTextblockalbrrtrans_Jsonclick ;
   private String edtAlbRRTrans_Internalname ;
   private String edtAlbRRTrans_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String AV37Modo ;
   private String AV9AlbCum ;
   private String AV89artblo ;
   private String A407EmprNom ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_unnamedtable7_Objectcall ;
   private String Dvpanel_unnamedtable7_Class ;
   private String Dvpanel_unnamedtable7_Height ;
   private String Dvpanel_unnamedtable8_Objectcall ;
   private String Dvpanel_unnamedtable8_Class ;
   private String Dvpanel_unnamedtable8_Height ;
   private String Dvpanel_unnamedtable9_Objectcall ;
   private String Dvpanel_unnamedtable9_Class ;
   private String Dvpanel_unnamedtable9_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z971ProceNom ;
   private String Z841TrnNom ;
   private String Z1212TipEntNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV37Modo ;
   private String i56AlbRUni ;
   private String i55AlbRReo ;
   private String gxwrpcisep ;
   private String l279CliNom ;
   private String l45AlbRef ;
   private String l971ProceNom ;
   private String l841TrnNom ;
   private String l1212TipEntNom ;
   private String ZV83OldAlb2 ;
   private String Zh252CliCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV89artblo ;
   private String GXv_char14[] ;
   private String Zh970ProceCod ;
   private String Zh840TrnCod ;
   private String ZV9AlbCum ;
   private String Zh1211TipEntCod ;
   private java.util.Date Z4606AlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date i4606AlbRHEn ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n970ProceCod ;
   private boolean n840TrnCod ;
   private boolean n1211TipEntCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_unnamedtable8_Autowidth ;
   private boolean Dvpanel_unnamedtable8_Autoheight ;
   private boolean Dvpanel_unnamedtable8_Collapsible ;
   private boolean Dvpanel_unnamedtable8_Collapsed ;
   private boolean Dvpanel_unnamedtable8_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable8_Autoscroll ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean n10761AlbUltP ;
   private boolean n7501AlbRecSec ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_unnamedtable7_Enabled ;
   private boolean Dvpanel_unnamedtable7_Showheader ;
   private boolean Dvpanel_unnamedtable7_Visible ;
   private boolean Dvpanel_unnamedtable8_Enabled ;
   private boolean Dvpanel_unnamedtable8_Showheader ;
   private boolean Dvpanel_unnamedtable8_Visible ;
   private boolean Dvpanel_unnamedtable9_Enabled ;
   private boolean Dvpanel_unnamedtable9_Showheader ;
   private boolean Dvpanel_unnamedtable9_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n4606AlbRHEn ;
   private boolean n13241AlbRPh ;
   private boolean n13242AlbRRLong ;
   private boolean n13243AlbRRTrans ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV84Inc_obs ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV108WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private String[] T01OY4_A407EmprNom ;
   private boolean[] T01OY4_n407EmprNom ;
   private String[] T01OY9_A1212TipEntNom ;
   private boolean[] T01OY9_n1212TipEntNom ;
   private String[] T01OY9_A396EmprCod ;
   private short[] T01OY9_A1211TipEntCod ;
   private boolean[] T01OY9_n1211TipEntCod ;
   private String[] T01OY10_A841TrnNom ;
   private boolean[] T01OY10_n841TrnNom ;
   private String[] T01OY10_A396EmprCod ;
   private short[] T01OY10_A840TrnCod ;
   private boolean[] T01OY10_n840TrnCod ;
   private String[] T01OY11_A971ProceNom ;
   private boolean[] T01OY11_n971ProceNom ;
   private String[] T01OY11_A396EmprCod ;
   private short[] T01OY11_A970ProceCod ;
   private boolean[] T01OY11_n970ProceCod ;
   private String[] T01OY12_A279CliNom ;
   private String[] T01OY12_A396EmprCod ;
   private int[] T01OY12_A252CliCod ;
   private String[] T01OY8_A1212TipEntNom ;
   private boolean[] T01OY8_n1212TipEntNom ;
   private String[] T01OY6_A841TrnNom ;
   private boolean[] T01OY6_n841TrnNom ;
   private String[] T01OY7_A971ProceNom ;
   private boolean[] T01OY7_n971ProceNom ;
   private String[] T01OY5_A279CliNom ;
   private int[] T01OY13_A44AlbRecCod ;
   private boolean[] T01OY13_n44AlbRecCod ;
   private String[] T01OY13_A5806AlbREnt2 ;
   private String[] T01OY13_A46AlbREnt ;
   private String[] T01OY13_A56AlbRUni ;
   private String[] T01OY13_A3613AlbRefDsc ;
   private String[] T01OY13_A407EmprNom ;
   private boolean[] T01OY13_n407EmprNom ;
   private java.util.Date[] T01OY13_A49AlbRFen ;
   private java.util.Date[] T01OY13_A4606AlbRHEn ;
   private boolean[] T01OY13_n4606AlbRHEn ;
   private String[] T01OY13_A279CliNom ;
   private String[] T01OY13_A45AlbRef ;
   private String[] T01OY13_A971ProceNom ;
   private boolean[] T01OY13_n971ProceNom ;
   private String[] T01OY13_A841TrnNom ;
   private boolean[] T01OY13_n841TrnNom ;
   private String[] T01OY13_A1212TipEntNom ;
   private boolean[] T01OY13_n1212TipEntNom ;
   private String[] T01OY13_A1291AlbRDes ;
   private java.math.BigDecimal[] T01OY13_A58AlbRUniEnt ;
   private int[] T01OY13_A52AlbRPieEnt ;
   private String[] T01OY13_A50AlbRLoc ;
   private String[] T01OY13_A55AlbRReo ;
   private int[] T01OY13_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01OY13_A60AlbRUniUti ;
   private java.util.Date[] T01OY13_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01OY13_A6180AlbrUniC ;
   private int[] T01OY13_A6181AlbrPieC ;
   private short[] T01OY13_A4920AlbRGrm2 ;
   private short[] T01OY13_A4921AlbRAnc ;
   private short[] T01OY13_A4922AlbPml ;
   private String[] T01OY13_A6463AlbRLote ;
   private java.math.BigDecimal[] T01OY13_A13241AlbRPh ;
   private boolean[] T01OY13_n13241AlbRPh ;
   private java.math.BigDecimal[] T01OY13_A13242AlbRRLong ;
   private boolean[] T01OY13_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01OY13_A13243AlbRRTrans ;
   private boolean[] T01OY13_n13243AlbRRTrans ;
   private String[] T01OY13_A8029AlbNumM ;
   private int[] T01OY13_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01OY13_A59AlbRUniReb ;
   private short[] T01OY13_A10761AlbUltP ;
   private boolean[] T01OY13_n10761AlbUltP ;
   private short[] T01OY13_A7501AlbRecSec ;
   private boolean[] T01OY13_n7501AlbRecSec ;
   private short[] T01OY13_A1222AlbNumEti ;
   private byte[] T01OY13_A47AlbREst ;
   private String[] T01OY13_A396EmprCod ;
   private int[] T01OY13_A252CliCod ;
   private short[] T01OY13_A840TrnCod ;
   private boolean[] T01OY13_n840TrnCod ;
   private short[] T01OY13_A970ProceCod ;
   private boolean[] T01OY13_n970ProceCod ;
   private short[] T01OY13_A1211TipEntCod ;
   private boolean[] T01OY13_n1211TipEntCod ;
   private String[] T01OY14_A279CliNom ;
   private String[] T01OY14_A396EmprCod ;
   private int[] T01OY14_A252CliCod ;
   private String[] T01OY15_A971ProceNom ;
   private boolean[] T01OY15_n971ProceNom ;
   private String[] T01OY15_A396EmprCod ;
   private short[] T01OY15_A970ProceCod ;
   private boolean[] T01OY15_n970ProceCod ;
   private String[] T01OY16_A841TrnNom ;
   private boolean[] T01OY16_n841TrnNom ;
   private String[] T01OY16_A396EmprCod ;
   private short[] T01OY16_A840TrnCod ;
   private boolean[] T01OY16_n840TrnCod ;
   private String[] T01OY17_A1212TipEntNom ;
   private boolean[] T01OY17_n1212TipEntNom ;
   private String[] T01OY17_A396EmprCod ;
   private short[] T01OY17_A1211TipEntCod ;
   private boolean[] T01OY17_n1211TipEntCod ;
   private String[] T01OY18_A279CliNom ;
   private String[] T01OY18_A396EmprCod ;
   private int[] T01OY18_A252CliCod ;
   private String[] T01OY19_A971ProceNom ;
   private boolean[] T01OY19_n971ProceNom ;
   private String[] T01OY19_A396EmprCod ;
   private short[] T01OY19_A970ProceCod ;
   private boolean[] T01OY19_n970ProceCod ;
   private String[] T01OY20_A841TrnNom ;
   private boolean[] T01OY20_n841TrnNom ;
   private String[] T01OY20_A396EmprCod ;
   private short[] T01OY20_A840TrnCod ;
   private boolean[] T01OY20_n840TrnCod ;
   private String[] T01OY21_A1212TipEntNom ;
   private boolean[] T01OY21_n1212TipEntNom ;
   private String[] T01OY21_A396EmprCod ;
   private short[] T01OY21_A1211TipEntCod ;
   private boolean[] T01OY21_n1211TipEntCod ;
   private String[] T01OY22_A279CliNom ;
   private String[] T01OY23_A841TrnNom ;
   private boolean[] T01OY23_n841TrnNom ;
   private String[] T01OY24_A971ProceNom ;
   private boolean[] T01OY24_n971ProceNom ;
   private String[] T01OY25_A1212TipEntNom ;
   private boolean[] T01OY25_n1212TipEntNom ;
   private String[] T01OY26_A396EmprCod ;
   private int[] T01OY26_A44AlbRecCod ;
   private boolean[] T01OY26_n44AlbRecCod ;
   private int[] T01OY3_A44AlbRecCod ;
   private boolean[] T01OY3_n44AlbRecCod ;
   private String[] T01OY3_A5806AlbREnt2 ;
   private String[] T01OY3_A46AlbREnt ;
   private String[] T01OY3_A56AlbRUni ;
   private String[] T01OY3_A3613AlbRefDsc ;
   private java.util.Date[] T01OY3_A49AlbRFen ;
   private java.util.Date[] T01OY3_A4606AlbRHEn ;
   private boolean[] T01OY3_n4606AlbRHEn ;
   private String[] T01OY3_A45AlbRef ;
   private String[] T01OY3_A1291AlbRDes ;
   private java.math.BigDecimal[] T01OY3_A58AlbRUniEnt ;
   private int[] T01OY3_A52AlbRPieEnt ;
   private String[] T01OY3_A50AlbRLoc ;
   private String[] T01OY3_A55AlbRReo ;
   private int[] T01OY3_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01OY3_A60AlbRUniUti ;
   private java.util.Date[] T01OY3_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01OY3_A6180AlbrUniC ;
   private int[] T01OY3_A6181AlbrPieC ;
   private short[] T01OY3_A4920AlbRGrm2 ;
   private short[] T01OY3_A4921AlbRAnc ;
   private short[] T01OY3_A4922AlbPml ;
   private String[] T01OY3_A6463AlbRLote ;
   private java.math.BigDecimal[] T01OY3_A13241AlbRPh ;
   private boolean[] T01OY3_n13241AlbRPh ;
   private java.math.BigDecimal[] T01OY3_A13242AlbRRLong ;
   private boolean[] T01OY3_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01OY3_A13243AlbRRTrans ;
   private boolean[] T01OY3_n13243AlbRRTrans ;
   private String[] T01OY3_A8029AlbNumM ;
   private int[] T01OY3_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01OY3_A59AlbRUniReb ;
   private short[] T01OY3_A10761AlbUltP ;
   private boolean[] T01OY3_n10761AlbUltP ;
   private short[] T01OY3_A7501AlbRecSec ;
   private boolean[] T01OY3_n7501AlbRecSec ;
   private short[] T01OY3_A1222AlbNumEti ;
   private byte[] T01OY3_A47AlbREst ;
   private String[] T01OY3_A396EmprCod ;
   private int[] T01OY3_A252CliCod ;
   private short[] T01OY3_A840TrnCod ;
   private boolean[] T01OY3_n840TrnCod ;
   private short[] T01OY3_A970ProceCod ;
   private boolean[] T01OY3_n970ProceCod ;
   private short[] T01OY3_A1211TipEntCod ;
   private boolean[] T01OY3_n1211TipEntCod ;
   private String[] T01OY27_A396EmprCod ;
   private int[] T01OY27_A44AlbRecCod ;
   private boolean[] T01OY27_n44AlbRecCod ;
   private String[] T01OY28_A396EmprCod ;
   private int[] T01OY28_A44AlbRecCod ;
   private boolean[] T01OY28_n44AlbRecCod ;
   private String[] T01OY29_A279CliNom ;
   private String[] T01OY29_A396EmprCod ;
   private int[] T01OY29_A252CliCod ;
   private String[] T01OY30_A971ProceNom ;
   private boolean[] T01OY30_n971ProceNom ;
   private String[] T01OY30_A396EmprCod ;
   private short[] T01OY30_A970ProceCod ;
   private boolean[] T01OY30_n970ProceCod ;
   private String[] T01OY31_A841TrnNom ;
   private boolean[] T01OY31_n841TrnNom ;
   private String[] T01OY31_A396EmprCod ;
   private short[] T01OY31_A840TrnCod ;
   private boolean[] T01OY31_n840TrnCod ;
   private String[] T01OY32_A1212TipEntNom ;
   private boolean[] T01OY32_n1212TipEntNom ;
   private String[] T01OY32_A396EmprCod ;
   private short[] T01OY32_A1211TipEntCod ;
   private boolean[] T01OY32_n1211TipEntCod ;
   private int[] T01OY2_A44AlbRecCod ;
   private boolean[] T01OY2_n44AlbRecCod ;
   private String[] T01OY2_A5806AlbREnt2 ;
   private String[] T01OY2_A46AlbREnt ;
   private String[] T01OY2_A56AlbRUni ;
   private String[] T01OY2_A3613AlbRefDsc ;
   private java.util.Date[] T01OY2_A49AlbRFen ;
   private java.util.Date[] T01OY2_A4606AlbRHEn ;
   private boolean[] T01OY2_n4606AlbRHEn ;
   private String[] T01OY2_A45AlbRef ;
   private String[] T01OY2_A1291AlbRDes ;
   private java.math.BigDecimal[] T01OY2_A58AlbRUniEnt ;
   private int[] T01OY2_A52AlbRPieEnt ;
   private String[] T01OY2_A50AlbRLoc ;
   private String[] T01OY2_A55AlbRReo ;
   private int[] T01OY2_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01OY2_A60AlbRUniUti ;
   private java.util.Date[] T01OY2_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01OY2_A6180AlbrUniC ;
   private int[] T01OY2_A6181AlbrPieC ;
   private short[] T01OY2_A4920AlbRGrm2 ;
   private short[] T01OY2_A4921AlbRAnc ;
   private short[] T01OY2_A4922AlbPml ;
   private String[] T01OY2_A6463AlbRLote ;
   private java.math.BigDecimal[] T01OY2_A13241AlbRPh ;
   private boolean[] T01OY2_n13241AlbRPh ;
   private java.math.BigDecimal[] T01OY2_A13242AlbRRLong ;
   private boolean[] T01OY2_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01OY2_A13243AlbRRTrans ;
   private boolean[] T01OY2_n13243AlbRRTrans ;
   private String[] T01OY2_A8029AlbNumM ;
   private int[] T01OY2_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01OY2_A59AlbRUniReb ;
   private short[] T01OY2_A10761AlbUltP ;
   private boolean[] T01OY2_n10761AlbUltP ;
   private short[] T01OY2_A7501AlbRecSec ;
   private boolean[] T01OY2_n7501AlbRecSec ;
   private short[] T01OY2_A1222AlbNumEti ;
   private byte[] T01OY2_A47AlbREst ;
   private String[] T01OY2_A396EmprCod ;
   private int[] T01OY2_A252CliCod ;
   private short[] T01OY2_A840TrnCod ;
   private boolean[] T01OY2_n840TrnCod ;
   private short[] T01OY2_A970ProceCod ;
   private boolean[] T01OY2_n970ProceCod ;
   private short[] T01OY2_A1211TipEntCod ;
   private boolean[] T01OY2_n1211TipEntCod ;
   private String[] T01OY36_A279CliNom ;
   private String[] T01OY37_A841TrnNom ;
   private boolean[] T01OY37_n841TrnNom ;
   private String[] T01OY38_A971ProceNom ;
   private boolean[] T01OY38_n971ProceNom ;
   private String[] T01OY39_A1212TipEntNom ;
   private boolean[] T01OY39_n1212TipEntNom ;
   private String[] T01OY40_A396EmprCod ;
   private int[] T01OY40_A13026PedDGId ;
   private int[] T01OY40_A44AlbRecCod ;
   private boolean[] T01OY40_n44AlbRecCod ;
   private String[] T01OY41_A396EmprCod ;
   private int[] T01OY41_A11669DevCruId ;
   private int[] T01OY41_A44AlbRecCod ;
   private boolean[] T01OY41_n44AlbRecCod ;
   private String[] T01OY42_A396EmprCod ;
   private int[] T01OY42_A44AlbRecCod ;
   private boolean[] T01OY42_n44AlbRecCod ;
   private String[] T01OY42_A9743Emp_CUb ;
   private short[] T01OY42_A5860Emp_Anp ;
   private String[] T01OY43_A396EmprCod ;
   private int[] T01OY43_A44AlbRecCod ;
   private boolean[] T01OY43_n44AlbRecCod ;
   private String[] T01OY43_A7130MatC_Pz ;
   private String[] T01OY44_A396EmprCod ;
   private int[] T01OY44_A44AlbRecCod ;
   private boolean[] T01OY44_n44AlbRecCod ;
   private String[] T01OY44_A7132MatC_Talla ;
   private String[] T01OY45_A396EmprCod ;
   private int[] T01OY45_A44AlbRecCod ;
   private boolean[] T01OY45_n44AlbRecCod ;
   private short[] T01OY45_A7115MatC_Lin ;
   private String[] T01OY46_A396EmprCod ;
   private long[] T01OY46_A30AlbProCod ;
   private int[] T01OY46_A129BarCod ;
   private byte[] T01OY46_A132BarCodReo ;
   private String[] T01OY46_A130BarCodPar ;
   private short[] T01OY46_A6622AlbHdRLn ;
   private String[] T01OY47_A396EmprCod ;
   private int[] T01OY47_A6235DevEmpCod ;
   private byte[] T01OY47_A6243DevNumLin ;
   private String[] T01OY48_A396EmprCod ;
   private int[] T01OY48_A44AlbRecCod ;
   private boolean[] T01OY48_n44AlbRecCod ;
   private short[] T01OY48_A4596AlbRDefCod ;
   private String[] T01OY49_A396EmprCod ;
   private int[] T01OY49_A44AlbRecCod ;
   private boolean[] T01OY49_n44AlbRecCod ;
   private String[] T01OY49_A2159AlbRecPie ;
   private String[] T01OY50_A396EmprCod ;
   private int[] T01OY50_A44AlbRecCod ;
   private boolean[] T01OY50_n44AlbRecCod ;
   private short[] T01OY50_A2165HisEmpLin ;
   private String[] T01OY51_A396EmprCod ;
   private int[] T01OY51_A44AlbRecCod ;
   private boolean[] T01OY51_n44AlbRecCod ;
   private byte[] T01OY51_A1299AlbRLin ;
   private String[] T01OY52_A396EmprCod ;
   private int[] T01OY52_A361DisCod ;
   private int[] T01OY52_A44AlbRecCod ;
   private boolean[] T01OY52_n44AlbRecCod ;
   private String[] T01OY53_A396EmprCod ;
   private int[] T01OY53_A323DevGenCod ;
   private String[] T01OY54_A396EmprCod ;
   private int[] T01OY54_A129BarCod ;
   private byte[] T01OY54_A132BarCodReo ;
   private String[] T01OY54_A130BarCodPar ;
   private String[] T01OY54_A200BarPieCod ;
   private String[] T01OY55_A396EmprCod ;
   private int[] T01OY55_A44AlbRecCod ;
   private boolean[] T01OY55_n44AlbRecCod ;
   private String[] T01OY56_A279CliNom ;
   private String[] T01OY57_A45AlbRef ;
   private String[] T01OY58_A971ProceNom ;
   private boolean[] T01OY58_n971ProceNom ;
   private String[] T01OY59_A841TrnNom ;
   private boolean[] T01OY59_n841TrnNom ;
   private String[] T01OY60_A1212TipEntNom ;
   private boolean[] T01OY60_n1212TipEntNom ;
   private String[] T01OY61_A279CliNom ;
   private String[] T01OY61_A396EmprCod ;
   private int[] T01OY61_A252CliCod ;
   private String[] T01OY62_A971ProceNom ;
   private boolean[] T01OY62_n971ProceNom ;
   private String[] T01OY62_A396EmprCod ;
   private short[] T01OY62_A970ProceCod ;
   private boolean[] T01OY62_n970ProceCod ;
   private String[] T01OY63_A841TrnNom ;
   private boolean[] T01OY63_n841TrnNom ;
   private String[] T01OY63_A396EmprCod ;
   private short[] T01OY63_A840TrnCod ;
   private boolean[] T01OY63_n840TrnCod ;
   private String[] T01OY64_A1212TipEntNom ;
   private boolean[] T01OY64_n1212TipEntNom ;
   private String[] T01OY64_A396EmprCod ;
   private short[] T01OY64_A1211TipEntCod ;
   private boolean[] T01OY64_n1211TipEntCod ;
   private String[] T01OY65_A279CliNom ;
   private String[] T01OY65_A396EmprCod ;
   private int[] T01OY65_A252CliCod ;
   private String[] T01OY66_A279CliNom ;
   private String[] T01OY67_A971ProceNom ;
   private boolean[] T01OY67_n971ProceNom ;
   private String[] T01OY67_A396EmprCod ;
   private short[] T01OY67_A970ProceCod ;
   private boolean[] T01OY67_n970ProceCod ;
   private String[] T01OY68_A971ProceNom ;
   private boolean[] T01OY68_n971ProceNom ;
   private String[] T01OY69_A841TrnNom ;
   private boolean[] T01OY69_n841TrnNom ;
   private String[] T01OY69_A396EmprCod ;
   private short[] T01OY69_A840TrnCod ;
   private boolean[] T01OY69_n840TrnCod ;
   private String[] T01OY70_A841TrnNom ;
   private boolean[] T01OY70_n841TrnNom ;
   private String[] T01OY71_A1212TipEntNom ;
   private boolean[] T01OY71_n1212TipEntNom ;
   private String[] T01OY71_A396EmprCod ;
   private short[] T01OY71_A1211TipEntCod ;
   private boolean[] T01OY71_n1211TipEntCod ;
   private String[] T01OY72_A1212TipEntNom ;
   private boolean[] T01OY72_n1212TipEntNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV106WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV107TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV113TrnContextAtt ;
}

final  class talbdet1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OY2", "SELECT AlbRecCod, AlbREnt2, AlbREnt, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRUniEnt, AlbRPieEnt, AlbRLoc, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, AlbREst, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREnt2, AlbREnt, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRUniEnt, AlbRPieEnt, AlbRLoc, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, AlbREst, CliCod, TrnCod, ProceCod, TipEntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY3", "SELECT AlbRecCod, AlbREnt2, AlbREnt, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRUniEnt, AlbRPieEnt, AlbRLoc, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, AlbREst, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY6", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY7", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY8", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY9", "SELECT TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (EmprCod = ?) AND (TipEntCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY10", "SELECT TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY11", "SELECT ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (EmprCod = ?) AND (ProceCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY12", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY13", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, TM1.AlbREnt2, TM1.AlbREnt, TM1.AlbRUni, TM1.AlbRefDsc, T2.EmprNom, TM1.AlbRFen, TM1.AlbRHEn, T3.CliNom, TM1.AlbRef, T4.ProceNom, T5.TrnNom, T6.TipEntNom, TM1.AlbRDes, TM1.AlbRUniEnt, TM1.AlbRPieEnt, TM1.AlbRLoc, TM1.AlbRReo, TM1.AlbRPieUti, TM1.AlbRUniUti, TM1.AlbRFecUlt, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRLote, TM1.AlbRPh, TM1.AlbRRLong, TM1.AlbRRTrans, TM1.AlbNumM, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbUltP, TM1.AlbRecSec, TM1.AlbNumEti, TM1.AlbREst, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod FROM (((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProceCod = TM1.ProceCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY14", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY15", "SELECT /*+ FIRST_ROWS */ ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (ProceNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY16", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY17", "SELECT /*+ FIRST_ROWS */ TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (TipEntNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY18", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY19", "SELECT /*+ FIRST_ROWS */ ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (ProceNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY20", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY21", "SELECT /*+ FIRST_ROWS */ TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (TipEntNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY23", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY24", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY25", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY26", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY28", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY29", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY30", "SELECT /*+ FIRST_ROWS */ ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (ProceNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY31", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY32", "SELECT /*+ FIRST_ROWS */ TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (TipEntNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OY33", "INSERT INTO TXPALBREC(AlbRecCod, AlbREnt2, AlbREnt, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRUniEnt, AlbRPieEnt, AlbRLoc, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, AlbREst, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, ClasCod, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrHor, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, Cod_mta, AlbOEKOTEX, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01OY34", "UPDATE TXPALBREC SET AlbREnt2=?, AlbREnt=?, AlbRUni=?, AlbRefDsc=?, AlbRFen=?, AlbRHEn=?, AlbRef=?, AlbRDes=?, AlbRUniEnt=?, AlbRPieEnt=?, AlbRLoc=?, AlbRReo=?, AlbRPieUti=?, AlbRUniUti=?, AlbRFecUlt=?, AlbrUniC=?, AlbrPieC=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRLote=?, AlbRPh=?, AlbRRLong=?, AlbRRTrans=?, AlbNumM=?, AlbRPieReb=?, AlbRUniReb=?, AlbUltP=?, AlbRecSec=?, AlbNumEti=?, AlbREst=?, CliCod=?, TrnCod=?, ProceCod=?, TipEntCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01OY35", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01OY36", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY37", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY38", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY39", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY40", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY41", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY42", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY43", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY44", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY45", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY46", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY47", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY48", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY49", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY50", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY51", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY52", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY53", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY54", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OY55", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY56", "SELECT * FROM (SELECT DISTINCT CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(CliNom) like '%' || UPPER(?)) ORDER BY CliNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY57", "SELECT * FROM (SELECT DISTINCT AlbRef FROM TXPALBREC WHERE UPPER(AlbRef) like '%' || UPPER(?) ORDER BY AlbRef) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY58", "SELECT * FROM (SELECT DISTINCT ProceNom FROM TXPPROCED WHERE (EmprCod = ?) AND (UPPER(ProceNom) like '%' || UPPER(?)) ORDER BY ProceNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY59", "SELECT * FROM (SELECT DISTINCT TrnNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(TrnNom) like '%' || UPPER(?)) ORDER BY TrnNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY60", "SELECT * FROM (SELECT DISTINCT TipEntNom FROM TXPENTRAD WHERE (EmprCod = ?) AND (UPPER(TipEntNom) like '%' || UPPER(?)) ORDER BY TipEntNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY61", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY62", "SELECT ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (ProceNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY63", "SELECT TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY64", "SELECT TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (TipEntNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY65", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY66", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY67", "SELECT /*+ FIRST_ROWS */ ProceNom, EmprCod, ProceCod FROM TXPPROCED WHERE (ProceNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY68", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY69", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY70", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY71", "SELECT /*+ FIRST_ROWS */ TipEntNom, EmprCod, TipEntCod FROM TXPENTRAD WHERE (TipEntNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OY72", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 10);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((byte[]) buf[37])[0] = rslt.getByte(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 10);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((byte[]) buf[37])[0] = rslt.getByte(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 25);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 20);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 10);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[27])[0] = rslt.getInt(23);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 20);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(31, 10);
               ((int[]) buf[39])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,2);
               ((short[]) buf[41])[0] = rslt.getShort(34);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(35);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(36);
               ((byte[]) buf[46])[0] = rslt.getByte(37);
               ((String[]) buf[47])[0] = rslt.getString(38, 3);
               ((int[]) buf[48])[0] = rslt.getInt(39);
               ((short[]) buf[49])[0] = rslt.getShort(40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(41);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(42);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
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
            case 22 :
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
            case 23 :
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
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 20);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setDate(6, (java.util.Date)parms[6]);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], false);
               }
               stmt.setString(8, (String)parms[9], 16);
               stmt.setString(9, (String)parms[10], 20);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               stmt.setInt(11, ((Number) parms[12]).intValue());
               stmt.setString(12, (String)parms[13], 10);
               stmt.setString(13, (String)parms[14], 2);
               stmt.setInt(14, ((Number) parms[15]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(16, (java.util.Date)parms[17]);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[18], 2);
               stmt.setInt(18, ((Number) parms[19]).intValue());
               stmt.setShort(19, ((Number) parms[20]).shortValue());
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setString(22, (String)parms[23], 20);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[29], 2);
               }
               stmt.setString(26, (String)parms[30], 10);
               stmt.setInt(27, ((Number) parms[31]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[32], 2);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[36]).shortValue());
               }
               stmt.setShort(31, ((Number) parms[37]).shortValue());
               stmt.setByte(32, ((Number) parms[38]).byteValue());
               stmt.setString(33, (String)parms[39], 3);
               stmt.setInt(34, ((Number) parms[40]).intValue());
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[46]).shortValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setDate(5, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 20);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 10);
               stmt.setString(12, (String)parms[12], 2);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 2);
               stmt.setDate(15, (java.util.Date)parms[15]);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setString(21, (String)parms[21], 20);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[27], 2);
               }
               stmt.setString(25, (String)parms[28], 10);
               stmt.setInt(26, ((Number) parms[29]).intValue());
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[30], 2);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[34]).shortValue());
               }
               stmt.setShort(30, ((Number) parms[35]).shortValue());
               stmt.setByte(31, ((Number) parms[36]).byteValue());
               stmt.setInt(32, ((Number) parms[37]).intValue());
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[43]).shortValue());
               }
               stmt.setString(36, (String)parms[44], 3);
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[46]).intValue());
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
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
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
            case 36 :
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
            case 37 :
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
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 25);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 66 :
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
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 68 :
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
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 70 :
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
   }

}

