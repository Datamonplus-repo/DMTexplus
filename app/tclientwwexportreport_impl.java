package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclientwwexportreport_impl extends GXWebReport
{
   public tclientwwexportreport_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV124cliact = AV125WebSession.getValue("&CliAct") ;
         AV128Pgmdesc = httpContext.getMessage( "Lista de CLIENTES", "") ;
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV107Title = httpContext.getMessage( "Lista de CLIENTES -", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTDATA' */
         S131 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h82I0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV113FilterFullText)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113FilterFullText, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV55TFCliCod) && (0==AV56TFCliCod_To) ) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFCliCod), "ZZZZZ9")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV95TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95TFCliCod_To_Description, "")), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFCliCod_To), "ZZZZZ9")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFCliNom_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFCliNom_Sel, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV59TFCliNom)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFCliNom, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV58TFCliNif_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFCliNif_Sel, "@!")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFCliNif)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFCliNif, "@!")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV62TFCliDom_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio ", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFCliDom_Sel, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV61TFCliDom)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Domicilio ", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFCliDom, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV64TFCliPob_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFCliPob_Sel, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV63TFCliPob)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFCliPob, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV66TFCliCp_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFCliCp_Sel, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV65TFCliCp)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFCliCp, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV117TFCliCp2_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C. Postal(Cont)", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117TFCliCp2_Sel, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV116TFCliCp2)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C. Postal(Cont)", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116TFCliCp2, "")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV70TFPrvDsc_Sel)==0) )
      {
         h82I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFPrvDsc_Sel, "@!")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFPrvDsc)==0) )
         {
            h82I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 25, Gx_line+0, 105, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFPrvDsc, "@!")), 105, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h82I0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h82I0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 86, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 90, Gx_line+10, 202, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 206, Gx_line+10, 318, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio ", ""), 322, Gx_line+10, 434, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 438, Gx_line+10, 550, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 554, Gx_line+10, 610, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C. Postal(Cont)", ""), 614, Gx_line+10, 670, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 674, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV132Tclientwwds_1_filterfulltext = AV113FilterFullText ;
      AV133Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV134Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV135Tclientwwds_4_tfclinom = AV59TFCliNom ;
      AV136Tclientwwds_5_tfclinom_sel = AV60TFCliNom_Sel ;
      AV137Tclientwwds_6_tfclinif = AV57TFCliNif ;
      AV138Tclientwwds_7_tfclinif_sel = AV58TFCliNif_Sel ;
      AV139Tclientwwds_8_tfclidom = AV61TFCliDom ;
      AV140Tclientwwds_9_tfclidom_sel = AV62TFCliDom_Sel ;
      AV141Tclientwwds_10_tfclipob = AV63TFCliPob ;
      AV142Tclientwwds_11_tfclipob_sel = AV64TFCliPob_Sel ;
      AV143Tclientwwds_12_tfclicp = AV65TFCliCp ;
      AV144Tclientwwds_13_tfclicp_sel = AV66TFCliCp_Sel ;
      AV145Tclientwwds_14_tfclicp2 = AV116TFCliCp2 ;
      AV146Tclientwwds_15_tfclicp2_sel = AV117TFCliCp2_Sel ;
      AV147Tclientwwds_16_tfprvdsc = AV69TFPrvDsc ;
      AV148Tclientwwds_17_tfprvdsc_sel = AV70TFPrvDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV132Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV133Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV134Tclientwwds_3_tfclicod_to) ,
                                           AV136Tclientwwds_5_tfclinom_sel ,
                                           AV135Tclientwwds_4_tfclinom ,
                                           AV138Tclientwwds_7_tfclinif_sel ,
                                           AV137Tclientwwds_6_tfclinif ,
                                           AV140Tclientwwds_9_tfclidom_sel ,
                                           AV139Tclientwwds_8_tfclidom ,
                                           AV142Tclientwwds_11_tfclipob_sel ,
                                           AV141Tclientwwds_10_tfclipob ,
                                           AV144Tclientwwds_13_tfclicp_sel ,
                                           AV143Tclientwwds_12_tfclicp ,
                                           AV146Tclientwwds_15_tfclicp2_sel ,
                                           AV145Tclientwwds_14_tfclicp2 ,
                                           AV148Tclientwwds_17_tfprvdsc_sel ,
                                           AV147Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           A10045CliAct ,
                                           AV124cliact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV132Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Tclientwwds_1_filterfulltext), "%", "") ;
      lV135Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV135Tclientwwds_4_tfclinom), 30, "%") ;
      lV137Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV137Tclientwwds_6_tfclinif), 20, "%") ;
      lV139Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV139Tclientwwds_8_tfclidom), 34, "%") ;
      lV141Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV141Tclientwwds_10_tfclipob), 30, "%") ;
      lV143Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV143Tclientwwds_12_tfclicp), 6, "%") ;
      lV145Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV145Tclientwwds_14_tfclicp2), 6, "%") ;
      lV147Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV147Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor P082I2 */
      pr_default.execute(0, new Object[] {AV124cliact, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, lV132Tclientwwds_1_filterfulltext, Integer.valueOf(AV133Tclientwwds_2_tfclicod), Integer.valueOf(AV134Tclientwwds_3_tfclicod_to), lV135Tclientwwds_4_tfclinom, AV136Tclientwwds_5_tfclinom_sel, lV137Tclientwwds_6_tfclinif, AV138Tclientwwds_7_tfclinif_sel, lV139Tclientwwds_8_tfclidom, AV140Tclientwwds_9_tfclidom_sel, lV141Tclientwwds_10_tfclipob, AV142Tclientwwds_11_tfclipob_sel, lV143Tclientwwds_12_tfclicp, AV144Tclientwwds_13_tfclicp_sel, lV145Tclientwwds_14_tfclicp2, AV146Tclientwwds_15_tfclicp2_sel, lV147Tclientwwds_16_tfprvdsc, AV148Tclientwwds_17_tfprvdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P082I2_A781PrvCod[0] ;
         A10045CliAct = P082I2_A10045CliAct[0] ;
         A787PrvDsc = P082I2_A787PrvDsc[0] ;
         n787PrvDsc = P082I2_n787PrvDsc[0] ;
         A4828CliCp2 = P082I2_A4828CliCp2[0] ;
         A256CliCp = P082I2_A256CliCp[0] ;
         A295CliPob = P082I2_A295CliPob[0] ;
         A260CliDom = P082I2_A260CliDom[0] ;
         A278CliNif = P082I2_A278CliNif[0] ;
         A279CliNom = P082I2_A279CliNom[0] ;
         A252CliCod = P082I2_A252CliCod[0] ;
         A396EmprCod = P082I2_A396EmprCod[0] ;
         A787PrvDsc = P082I2_A787PrvDsc[0] ;
         n787PrvDsc = P082I2_n787PrvDsc[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h82I0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 86, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 90, Gx_line+10, 202, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 206, Gx_line+10, 318, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 322, Gx_line+10, 434, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 438, Gx_line+10, 550, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 554, Gx_line+10, 610, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4828CliCp2, "")), 614, Gx_line+10, 670, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 674, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("TCLIENTWWGridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCLIENTWWGridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("TCLIENTWWGridState"), null, null);
      }
      AV10OrderedBy = AV53GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV53GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV149GXV1 = 1 ;
      while ( AV149GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV149GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV113FilterFullText = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV55TFCliCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFCliCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV59TFCliNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV60TFCliNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF") == 0 )
         {
            AV57TFCliNif = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF_SEL") == 0 )
         {
            AV58TFCliNif_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM") == 0 )
         {
            AV61TFCliDom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM_SEL") == 0 )
         {
            AV62TFCliDom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB") == 0 )
         {
            AV63TFCliPob = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB_SEL") == 0 )
         {
            AV64TFCliPob_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP") == 0 )
         {
            AV65TFCliCp = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP_SEL") == 0 )
         {
            AV66TFCliCp_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2") == 0 )
         {
            AV116TFCliCp2 = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2_SEL") == 0 )
         {
            AV117TFCliCp2_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV69TFPrvDsc = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV70TFPrvDsc_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV149GXV1 = (int)(AV149GXV1+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h82I0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               AV104PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV100DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            AV107Title = AV128Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
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
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV124cliact = "" ;
      AV125WebSession = httpContext.getWebSession();
      AV128Pgmdesc = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV107Title = "" ;
      AV113FilterFullText = "" ;
      AV95TFCliCod_To_Description = "" ;
      AV60TFCliNom_Sel = "" ;
      AV59TFCliNom = "" ;
      AV58TFCliNif_Sel = "" ;
      AV57TFCliNif = "" ;
      AV62TFCliDom_Sel = "" ;
      AV61TFCliDom = "" ;
      AV64TFCliPob_Sel = "" ;
      AV63TFCliPob = "" ;
      AV66TFCliCp_Sel = "" ;
      AV65TFCliCp = "" ;
      AV117TFCliCp2_Sel = "" ;
      AV116TFCliCp2 = "" ;
      AV70TFPrvDsc_Sel = "" ;
      AV69TFPrvDsc = "" ;
      A279CliNom = "" ;
      A278CliNif = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      A787PrvDsc = "" ;
      AV132Tclientwwds_1_filterfulltext = "" ;
      AV135Tclientwwds_4_tfclinom = "" ;
      AV136Tclientwwds_5_tfclinom_sel = "" ;
      AV137Tclientwwds_6_tfclinif = "" ;
      AV138Tclientwwds_7_tfclinif_sel = "" ;
      AV139Tclientwwds_8_tfclidom = "" ;
      AV140Tclientwwds_9_tfclidom_sel = "" ;
      AV141Tclientwwds_10_tfclipob = "" ;
      AV142Tclientwwds_11_tfclipob_sel = "" ;
      AV143Tclientwwds_12_tfclicp = "" ;
      AV144Tclientwwds_13_tfclicp_sel = "" ;
      AV145Tclientwwds_14_tfclicp2 = "" ;
      AV146Tclientwwds_15_tfclicp2_sel = "" ;
      AV147Tclientwwds_16_tfprvdsc = "" ;
      AV148Tclientwwds_17_tfprvdsc_sel = "" ;
      scmdbuf = "" ;
      lV132Tclientwwds_1_filterfulltext = "" ;
      lV135Tclientwwds_4_tfclinom = "" ;
      lV137Tclientwwds_6_tfclinif = "" ;
      lV139Tclientwwds_8_tfclidom = "" ;
      lV141Tclientwwds_10_tfclipob = "" ;
      lV143Tclientwwds_12_tfclicp = "" ;
      lV145Tclientwwds_14_tfclicp2 = "" ;
      lV147Tclientwwds_16_tfprvdsc = "" ;
      A10045CliAct = "" ;
      P082I2_A781PrvCod = new short[1] ;
      P082I2_A10045CliAct = new String[] {""} ;
      P082I2_A787PrvDsc = new String[] {""} ;
      P082I2_n787PrvDsc = new boolean[] {false} ;
      P082I2_A4828CliCp2 = new String[] {""} ;
      P082I2_A256CliCp = new String[] {""} ;
      P082I2_A295CliPob = new String[] {""} ;
      P082I2_A260CliDom = new String[] {""} ;
      P082I2_A278CliNif = new String[] {""} ;
      P082I2_A279CliNom = new String[] {""} ;
      P082I2_A252CliCod = new int[1] ;
      P082I2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV51Session = httpContext.getWebSession();
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV104PageInfo = "" ;
      AV100DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV119AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientwwexportreport__default(),
         new Object[] {
             new Object[] {
            P082I2_A781PrvCod, P082I2_A10045CliAct, P082I2_A787PrvDsc, P082I2_n787PrvDsc, P082I2_A4828CliCp2, P082I2_A256CliCp, P082I2_A295CliPob, P082I2_A260CliDom, P082I2_A278CliNif, P082I2_A279CliNom,
            P082I2_A252CliCod, P082I2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV128Pgmdesc = httpContext.getMessage( "TCLIENTWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV128Pgmdesc = httpContext.getMessage( "TCLIENTWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV55TFCliCod ;
   private int AV56TFCliCod_To ;
   private int A252CliCod ;
   private int AV133Tclientwwds_2_tfclicod ;
   private int AV134Tclientwwds_3_tfclicod_to ;
   private int AV149GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV124cliact ;
   private String AV128Pgmdesc ;
   private String AV60TFCliNom_Sel ;
   private String AV59TFCliNom ;
   private String AV58TFCliNif_Sel ;
   private String AV57TFCliNif ;
   private String AV62TFCliDom_Sel ;
   private String AV61TFCliDom ;
   private String AV64TFCliPob_Sel ;
   private String AV63TFCliPob ;
   private String AV66TFCliCp_Sel ;
   private String AV65TFCliCp ;
   private String AV117TFCliCp2_Sel ;
   private String AV116TFCliCp2 ;
   private String AV70TFPrvDsc_Sel ;
   private String AV69TFPrvDsc ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A4828CliCp2 ;
   private String A787PrvDsc ;
   private String AV135Tclientwwds_4_tfclinom ;
   private String AV136Tclientwwds_5_tfclinom_sel ;
   private String AV137Tclientwwds_6_tfclinif ;
   private String AV138Tclientwwds_7_tfclinif_sel ;
   private String AV139Tclientwwds_8_tfclidom ;
   private String AV140Tclientwwds_9_tfclidom_sel ;
   private String AV141Tclientwwds_10_tfclipob ;
   private String AV142Tclientwwds_11_tfclipob_sel ;
   private String AV143Tclientwwds_12_tfclicp ;
   private String AV144Tclientwwds_13_tfclicp_sel ;
   private String AV145Tclientwwds_14_tfclicp2 ;
   private String AV146Tclientwwds_15_tfclicp2_sel ;
   private String AV147Tclientwwds_16_tfprvdsc ;
   private String AV148Tclientwwds_17_tfprvdsc_sel ;
   private String scmdbuf ;
   private String lV135Tclientwwds_4_tfclinom ;
   private String lV137Tclientwwds_6_tfclinif ;
   private String lV139Tclientwwds_8_tfclidom ;
   private String lV141Tclientwwds_10_tfclipob ;
   private String lV143Tclientwwds_12_tfclicp ;
   private String lV145Tclientwwds_14_tfclicp2 ;
   private String lV147Tclientwwds_16_tfprvdsc ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n787PrvDsc ;
   private String AV107Title ;
   private String AV113FilterFullText ;
   private String AV95TFCliCod_To_Description ;
   private String AV132Tclientwwds_1_filterfulltext ;
   private String lV132Tclientwwds_1_filterfulltext ;
   private String AV104PageInfo ;
   private String AV100DateInfo ;
   private String AV119AppName ;
   private com.genexus.webpanels.WebSession AV125WebSession ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private IDataStoreProvider pr_default ;
   private short[] P082I2_A781PrvCod ;
   private String[] P082I2_A10045CliAct ;
   private String[] P082I2_A787PrvDsc ;
   private boolean[] P082I2_n787PrvDsc ;
   private String[] P082I2_A4828CliCp2 ;
   private String[] P082I2_A256CliCp ;
   private String[] P082I2_A295CliPob ;
   private String[] P082I2_A260CliDom ;
   private String[] P082I2_A278CliNif ;
   private String[] P082I2_A279CliNom ;
   private int[] P082I2_A252CliCod ;
   private String[] P082I2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class tclientwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P082I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV132Tclientwwds_1_filterfulltext ,
                                          int AV133Tclientwwds_2_tfclicod ,
                                          int AV134Tclientwwds_3_tfclicod_to ,
                                          String AV136Tclientwwds_5_tfclinom_sel ,
                                          String AV135Tclientwwds_4_tfclinom ,
                                          String AV138Tclientwwds_7_tfclinif_sel ,
                                          String AV137Tclientwwds_6_tfclinif ,
                                          String AV140Tclientwwds_9_tfclidom_sel ,
                                          String AV139Tclientwwds_8_tfclidom ,
                                          String AV142Tclientwwds_11_tfclipob_sel ,
                                          String AV141Tclientwwds_10_tfclipob ,
                                          String AV144Tclientwwds_13_tfclicp_sel ,
                                          String AV143Tclientwwds_12_tfclicp ,
                                          String AV146Tclientwwds_15_tfclicp2_sel ,
                                          String AV145Tclientwwds_14_tfclicp2 ,
                                          String AV148Tclientwwds_17_tfprvdsc_sel ,
                                          String AV147Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String A10045CliAct ,
                                          String AV124cliact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod, T1.EmprCod FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN" ;
      scmdbuf += " T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV132Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV133Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV134Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV135Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV137Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV139Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV141Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV143Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV145Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliNif" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliNif DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliDom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliDom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliPob" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliPob DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCp2" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCp2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliAct" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliAct DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P082I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P082I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
      }
   }

}

