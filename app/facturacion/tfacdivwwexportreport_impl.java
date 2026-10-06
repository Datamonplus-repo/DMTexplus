package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacdivwwexportreport_impl extends GXWebReport
{
   public tfacdivwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV55Title = httpContext.getMessage( "Lista de DIVISAS/REPRESENTANTES", "") ;
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
         hAVV0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFEmprCod_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFEmprCod_Sel, "@!")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFEmprCod)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod, "@!")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV20TFFacCod) && (0==AV21TFFacCod_To) ) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero Factura", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFFacCod), "ZZZZZZZ9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFFacCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero Factura", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFFacCod_To_Description, "")), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFFacCod_To), "ZZZZZZZ9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFCliCod) && (0==AV23TFCliCod_To) ) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod), "ZZZZZ9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFCliCod_To_Description, "")), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod_To), "ZZZZZ9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliNom_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFCliNom_Sel, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFCliNom)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV28TFFacDivTCod_Sels.fromJSonString(AV26TFFacDivTCod_SelsJson, null);
      if ( ! ( AV28TFFacDivTCod_Sels.size() == 0 ) )
      {
         AV44i = 1 ;
         AV62GXV1 = 1 ;
         while ( AV62GXV1 <= AV28TFFacDivTCod_Sels.size() )
         {
            AV29TFFacDivTCod_Sel = (String)AV28TFFacDivTCod_Sels.elementAt(-1+AV62GXV1) ;
            if ( AV44i == 1 )
            {
               AV27TFFacDivTCod_SelDscs = "" ;
            }
            else
            {
               AV27TFFacDivTCod_SelDscs += ", " ;
            }
            AV42FilterTFFacDivTCod_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV29TFFacDivTCod_Sel), "P") == 0 )
            {
               AV42FilterTFFacDivTCod_SelValueDescription = httpContext.getMessage( "PESETA", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV29TFFacDivTCod_Sel), "E") == 0 )
            {
               AV42FilterTFFacDivTCod_SelValueDescription = httpContext.getMessage( "EURO", "") ;
            }
            AV27TFFacDivTCod_SelDscs += AV42FilterTFFacDivTCod_SelValueDescription ;
            AV44i = (long)(AV44i+1) ;
            AV62GXV1 = (int)(AV62GXV1+1) ;
         }
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Divisa Traspaso Contable", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFFacDivTCod_SelDscs, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV30TFFacDivCod) && (0==AV31TFFacDivCod_To) ) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFFacDivCod), "Z9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFFacDivCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Divisa", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFFacDivCod_To_Description, "")), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFFacDivCod_To), "Z9")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFFacDivAbr_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Abreviatura", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFFacDivAbr_Sel, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFFacDivAbr)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Abreviatura", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFFacDivAbr, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFFacRepCod_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFFacRepCod_Sel, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFFacRepCod)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFFacRepCod, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFFacRepNom_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Representante", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFFacRepNom_Sel, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFFacRepNom)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Representante", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFFacRepNom, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFEmprNom_Sel)==0) )
      {
         hAVV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFEmprNom_Sel, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFEmprNom)==0) )
         {
            hAVV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 158, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFEmprNom, "")), 158, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hAVV0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hAVV0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 30, Gx_line+10, 81, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero Factura", ""), 85, Gx_line+10, 136, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 140, Gx_line+10, 191, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 195, Gx_line+10, 297, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Divisa Traspaso Contable", ""), 301, Gx_line+10, 403, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 407, Gx_line+10, 459, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Abreviatura", ""), 463, Gx_line+10, 515, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Representante", ""), 519, Gx_line+10, 571, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Representante", ""), 575, Gx_line+10, 679, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 683, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV64Facturacion_tfacdivwwds_1_filterfulltext = AV12FilterFullText ;
      AV65Facturacion_tfacdivwwds_2_tfemprcod = AV18TFEmprCod ;
      AV66Facturacion_tfacdivwwds_3_tfemprcod_sel = AV19TFEmprCod_Sel ;
      AV67Facturacion_tfacdivwwds_4_tffaccod = AV20TFFacCod ;
      AV68Facturacion_tfacdivwwds_5_tffaccod_to = AV21TFFacCod_To ;
      AV69Facturacion_tfacdivwwds_6_tfclicod = AV22TFCliCod ;
      AV70Facturacion_tfacdivwwds_7_tfclicod_to = AV23TFCliCod_To ;
      AV71Facturacion_tfacdivwwds_8_tfclinom = AV24TFCliNom ;
      AV72Facturacion_tfacdivwwds_9_tfclinom_sel = AV25TFCliNom_Sel ;
      AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV28TFFacDivTCod_Sels ;
      AV74Facturacion_tfacdivwwds_11_tffacdivcod = AV30TFFacDivCod ;
      AV75Facturacion_tfacdivwwds_12_tffacdivcod_to = AV31TFFacDivCod_To ;
      AV76Facturacion_tfacdivwwds_13_tffacdivabr = AV32TFFacDivAbr ;
      AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV33TFFacDivAbr_Sel ;
      AV78Facturacion_tfacdivwwds_15_tffacrepcod = AV34TFFacRepCod ;
      AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV35TFFacRepCod_Sel ;
      AV80Facturacion_tfacdivwwds_17_tffacrepnom = AV36TFFacRepNom ;
      AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV37TFFacRepNom_Sel ;
      AV82Facturacion_tfacdivwwds_19_tfemprnom = AV38TFEmprNom ;
      AV83Facturacion_tfacdivwwds_20_tfemprnom_sel = AV39TFEmprNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV66Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV65Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV67Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV68Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV69Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV70Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV72Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV71Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV74Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV75Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV76Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV78Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV80Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV83Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV82Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV64Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV65Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV71Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV76Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV76Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV78Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV78Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV80Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV80Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV82Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV82Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVV2 */
      pr_default.execute(0, new Object[] {lV65Facturacion_tfacdivwwds_2_tfemprcod, AV66Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV67Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV68Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV69Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV70Facturacion_tfacdivwwds_7_tfclicod_to), lV71Facturacion_tfacdivwwds_8_tfclinom, AV72Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV74Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV75Facturacion_tfacdivwwds_12_tffacdivcod_to), lV76Facturacion_tfacdivwwds_13_tffacdivabr, AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV78Facturacion_tfacdivwwds_15_tffacrepcod, AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV80Facturacion_tfacdivwwds_17_tffacrepnom, AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV82Facturacion_tfacdivwwds_19_tfemprnom, AV83Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0AVV2_A407EmprNom[0] ;
         n407EmprNom = P0AVV2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVV2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVV2_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVV2_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVV2_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVV2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVV2_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVV2_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVV2_n3115FacDivCod[0] ;
         A279CliNom = P0AVV2_A279CliNom[0] ;
         A252CliCod = P0AVV2_A252CliCod[0] ;
         A430FacCod = P0AVV2_A430FacCod[0] ;
         A396EmprCod = P0AVV2_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVV2_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVV2_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVV2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVV2_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVV2_A407EmprNom[0] ;
         n407EmprNom = P0AVV2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVV2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVV2_n3120FacRepNom[0] ;
         A279CliNom = P0AVV2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV64Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV64Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV64Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV64Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV64Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13FacDivTCodDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), "P") == 0 )
            {
               AV13FacDivTCodDescription = httpContext.getMessage( "PESETA", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A3096FacDivTCod), "E") == 0 )
            {
               AV13FacDivTCodDescription = httpContext.getMessage( "EURO", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            hAVV0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 81, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 85, Gx_line+10, 136, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 140, Gx_line+10, 191, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 195, Gx_line+10, 297, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13FacDivTCodDescription, "")), 301, Gx_line+10, 403, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3115FacDivCod), "Z9")), 407, Gx_line+10, 459, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3116FacDivAbr, "")), 463, Gx_line+10, 515, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3119FacRepCod, "")), 519, Gx_line+10, 571, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3120FacRepNom, "")), 575, Gx_line+10, 679, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 683, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("Facturacion.TFACDIVWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TFACDIVWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("Facturacion.TFACDIVWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV18TFEmprCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV19TFEmprCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV20TFFacCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFFacCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV22TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV24TFCliNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV25TFCliNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVTCOD_SEL") == 0 )
         {
            AV26TFFacDivTCod_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV28TFFacDivTCod_Sels.fromJSonString(AV26TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVCOD") == 0 )
         {
            AV30TFFacDivCod = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFFacDivCod_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR") == 0 )
         {
            AV32TFFacDivAbr = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR_SEL") == 0 )
         {
            AV33TFFacDivAbr_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD") == 0 )
         {
            AV34TFFacRepCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD_SEL") == 0 )
         {
            AV35TFFacRepCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM") == 0 )
         {
            AV36TFFacRepNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM_SEL") == 0 )
         {
            AV37TFFacRepNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV38TFEmprNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV39TFEmprNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV84GXV2 = (int)(AV84GXV2+1) ;
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

   public void hAVV0( boolean bFoot ,
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
               AV53PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV50DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV55Title = AV59Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Title = "" ;
      AV12FilterFullText = "" ;
      AV19TFEmprCod_Sel = "" ;
      AV18TFEmprCod = "" ;
      AV40TFFacCod_To_Description = "" ;
      AV41TFCliCod_To_Description = "" ;
      AV25TFCliNom_Sel = "" ;
      AV24TFCliNom = "" ;
      AV28TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26TFFacDivTCod_SelsJson = "" ;
      AV29TFFacDivTCod_Sel = "" ;
      AV27TFFacDivTCod_SelDscs = "" ;
      AV42FilterTFFacDivTCod_SelValueDescription = "" ;
      AV43TFFacDivCod_To_Description = "" ;
      AV33TFFacDivAbr_Sel = "" ;
      AV32TFFacDivAbr = "" ;
      AV35TFFacRepCod_Sel = "" ;
      AV34TFFacRepCod = "" ;
      AV37TFFacRepNom_Sel = "" ;
      AV36TFFacRepNom = "" ;
      AV39TFEmprNom_Sel = "" ;
      AV38TFEmprNom = "" ;
      A3096FacDivTCod = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A3116FacDivAbr = "" ;
      A3119FacRepCod = "" ;
      A3120FacRepNom = "" ;
      A407EmprNom = "" ;
      AV64Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      AV65Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      AV66Facturacion_tfacdivwwds_3_tfemprcod_sel = "" ;
      AV71Facturacion_tfacdivwwds_8_tfclinom = "" ;
      AV72Facturacion_tfacdivwwds_9_tfclinom_sel = "" ;
      AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel = "" ;
      AV78Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel = "" ;
      AV80Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel = "" ;
      AV82Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      AV83Facturacion_tfacdivwwds_20_tfemprnom_sel = "" ;
      lV64Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV65Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      lV71Facturacion_tfacdivwwds_8_tfclinom = "" ;
      lV76Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      lV78Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      lV80Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      lV82Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      P0AVV2_A407EmprNom = new String[] {""} ;
      P0AVV2_n407EmprNom = new boolean[] {false} ;
      P0AVV2_A3120FacRepNom = new String[] {""} ;
      P0AVV2_n3120FacRepNom = new boolean[] {false} ;
      P0AVV2_A3119FacRepCod = new String[] {""} ;
      P0AVV2_n3119FacRepCod = new boolean[] {false} ;
      P0AVV2_A3116FacDivAbr = new String[] {""} ;
      P0AVV2_n3116FacDivAbr = new boolean[] {false} ;
      P0AVV2_A3115FacDivCod = new byte[1] ;
      P0AVV2_n3115FacDivCod = new boolean[] {false} ;
      P0AVV2_A279CliNom = new String[] {""} ;
      P0AVV2_A252CliCod = new int[1] ;
      P0AVV2_A430FacCod = new int[1] ;
      P0AVV2_A396EmprCod = new String[] {""} ;
      P0AVV2_A3096FacDivTCod = new String[] {""} ;
      P0AVV2_n3096FacDivTCod = new boolean[] {false} ;
      AV13FacDivTCodDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53PageInfo = "" ;
      AV50DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV59Pgmdesc = "" ;
      AV48AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivwwexportreport__default(),
         new Object[] {
             new Object[] {
            P0AVV2_A407EmprNom, P0AVV2_n407EmprNom, P0AVV2_A3120FacRepNom, P0AVV2_n3120FacRepNom, P0AVV2_A3119FacRepCod, P0AVV2_n3119FacRepCod, P0AVV2_A3116FacDivAbr, P0AVV2_n3116FacDivAbr, P0AVV2_A3115FacDivCod, P0AVV2_n3115FacDivCod,
            P0AVV2_A279CliNom, P0AVV2_A252CliCod, P0AVV2_A430FacCod, P0AVV2_A396EmprCod, P0AVV2_A3096FacDivTCod, P0AVV2_n3096FacDivTCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "TFACDIVWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "TFACDIVWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV30TFFacDivCod ;
   private byte AV31TFFacDivCod_To ;
   private byte A3115FacDivCod ;
   private byte AV74Facturacion_tfacdivwwds_11_tffacdivcod ;
   private byte AV75Facturacion_tfacdivwwds_12_tffacdivcod_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV20TFFacCod ;
   private int AV21TFFacCod_To ;
   private int AV22TFCliCod ;
   private int AV23TFCliCod_To ;
   private int AV62GXV1 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV67Facturacion_tfacdivwwds_4_tffaccod ;
   private int AV68Facturacion_tfacdivwwds_5_tffaccod_to ;
   private int AV69Facturacion_tfacdivwwds_6_tfclicod ;
   private int AV70Facturacion_tfacdivwwds_7_tfclicod_to ;
   private int AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ;
   private int AV84GXV2 ;
   private long AV44i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFEmprCod_Sel ;
   private String AV18TFEmprCod ;
   private String AV25TFCliNom_Sel ;
   private String AV24TFCliNom ;
   private String AV29TFFacDivTCod_Sel ;
   private String AV33TFFacDivAbr_Sel ;
   private String AV32TFFacDivAbr ;
   private String AV35TFFacRepCod_Sel ;
   private String AV34TFFacRepCod ;
   private String AV37TFFacRepNom_Sel ;
   private String AV36TFFacRepNom ;
   private String AV39TFEmprNom_Sel ;
   private String AV38TFEmprNom ;
   private String A3096FacDivTCod ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A3116FacDivAbr ;
   private String A3119FacRepCod ;
   private String A3120FacRepNom ;
   private String A407EmprNom ;
   private String AV65Facturacion_tfacdivwwds_2_tfemprcod ;
   private String AV66Facturacion_tfacdivwwds_3_tfemprcod_sel ;
   private String AV71Facturacion_tfacdivwwds_8_tfclinom ;
   private String AV72Facturacion_tfacdivwwds_9_tfclinom_sel ;
   private String AV76Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel ;
   private String AV78Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel ;
   private String AV80Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel ;
   private String AV82Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV83Facturacion_tfacdivwwds_20_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV65Facturacion_tfacdivwwds_2_tfemprcod ;
   private String lV71Facturacion_tfacdivwwds_8_tfclinom ;
   private String lV76Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String lV78Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String lV80Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String lV82Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV59Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean n3119FacRepCod ;
   private boolean n3116FacDivAbr ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private String AV26TFFacDivTCod_SelsJson ;
   private String AV55Title ;
   private String AV12FilterFullText ;
   private String AV40TFFacCod_To_Description ;
   private String AV41TFCliCod_To_Description ;
   private String AV27TFFacDivTCod_SelDscs ;
   private String AV42FilterTFFacDivTCod_SelValueDescription ;
   private String AV43TFFacDivCod_To_Description ;
   private String AV64Facturacion_tfacdivwwds_1_filterfulltext ;
   private String lV64Facturacion_tfacdivwwds_1_filterfulltext ;
   private String AV13FacDivTCodDescription ;
   private String AV53PageInfo ;
   private String AV50DateInfo ;
   private String AV48AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVV2_A407EmprNom ;
   private boolean[] P0AVV2_n407EmprNom ;
   private String[] P0AVV2_A3120FacRepNom ;
   private boolean[] P0AVV2_n3120FacRepNom ;
   private String[] P0AVV2_A3119FacRepCod ;
   private boolean[] P0AVV2_n3119FacRepCod ;
   private String[] P0AVV2_A3116FacDivAbr ;
   private boolean[] P0AVV2_n3116FacDivAbr ;
   private byte[] P0AVV2_A3115FacDivCod ;
   private boolean[] P0AVV2_n3115FacDivCod ;
   private String[] P0AVV2_A279CliNom ;
   private int[] P0AVV2_A252CliCod ;
   private int[] P0AVV2_A430FacCod ;
   private String[] P0AVV2_A396EmprCod ;
   private String[] P0AVV2_A3096FacDivTCod ;
   private boolean[] P0AVV2_n3096FacDivTCod ;
   private GXSimpleCollection<String> AV28TFFacDivTCod_Sels ;
   private GXSimpleCollection<String> AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tfacdivwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AVV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV66Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV65Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV67Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV68Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV69Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV70Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV72Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV71Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV74Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV75Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV76Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV78Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV80Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV83Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV82Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV64Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV74Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivAbr" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivAbr DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacRepCod" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacRepCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RepNom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RepNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.EmprNom DESC" ;
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
                  return conditional_P0AVV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
      }
   }

}

