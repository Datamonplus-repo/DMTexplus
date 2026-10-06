package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbcomwwexportreport_impl extends GXWebReport
{
   public talbcomwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV109Title = httpContext.getMessage( "Lista de Albaranes Comerciales v 01", "") ;
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
         h8G60( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV127AlbComPri)==0) )
      {
         AV126FilterAlbComPriValueDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( AV127AlbComPri), "1") == 0 )
         {
            AV126FilterAlbComPriValueDescription = httpContext.getMessage( "GR", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( AV127AlbComPri), "0") == 0 )
         {
            AV126FilterAlbComPriValueDescription = httpContext.getMessage( "GT", "") ;
         }
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126FilterAlbComPriValueDescription, "")), 25, Gx_line+0, 814, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbComFch)) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV21AlbComFch, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128AlbComFch_To)) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV128AlbComFch_To, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV130FilterFullText)==0) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130FilterFullText, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV42TFAlbComCod) && (0==AV43TFAlbComCod_To) ) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbComCod), "ZZZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV86TFAlbComCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Documento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86TFAlbComCod_To_Description, "")), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43TFAlbComCod_To), "ZZZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFAlbComFch)) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV44TFAlbComFch, "99/99/99"), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV123TFAlbComPri_Sels.fromJSonString(AV121TFAlbComPri_SelsJson, null);
      if ( ! ( AV123TFAlbComPri_Sels.size() == 0 ) )
      {
         AV99i = 1 ;
         AV141GXV1 = 1 ;
         while ( AV141GXV1 <= AV123TFAlbComPri_Sels.size() )
         {
            AV47TFAlbComPri_Sel = (String)AV123TFAlbComPri_Sels.elementAt(-1+AV141GXV1) ;
            if ( AV99i == 1 )
            {
               AV122TFAlbComPri_SelDscs = "" ;
            }
            else
            {
               AV122TFAlbComPri_SelDscs += ", " ;
            }
            AV125FilterTFAlbComPri_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV47TFAlbComPri_Sel), "1") == 0 )
            {
               AV125FilterTFAlbComPri_SelValueDescription = httpContext.getMessage( "GR", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV47TFAlbComPri_Sel), "0") == 0 )
            {
               AV125FilterTFAlbComPri_SelValueDescription = httpContext.getMessage( "GT", "") ;
            }
            AV122TFAlbComPri_SelDscs += AV125FilterTFAlbComPri_SelValueDescription ;
            AV99i = (long)(AV99i+1) ;
            AV141GXV1 = (int)(AV141GXV1+1) ;
         }
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122TFAlbComPri_SelDscs, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV48TFCliCod) && (0==AV49TFCliCod_To) ) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFCliCod), "ZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV88TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88TFCliCod_To_Description, "")), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFCliCod_To), "ZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFCliNom_Sel)==0) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFCliNom_Sel, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFCliNom)==0) )
         {
            h8G60( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFCliNom, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV83TFAlbComFd_Sel)==0) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFAlbComFd_Sel, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV82TFAlbComFd)==0) )
         {
            h8G60( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFAlbComFd, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV85TFAlbComFdD_Sel)==0) )
      {
         h8G60( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFAlbComFdD_Sel, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV84TFAlbComFdD)==0) )
         {
            h8G60( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFAlbComFdD, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8G60( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8G60( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 30, Gx_line+10, 103, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 107, Gx_line+10, 180, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("", 184, Gx_line+10, 257, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 261, Gx_line+10, 334, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 338, Gx_line+10, 484, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 488, Gx_line+10, 635, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 639, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV143Talbcomwwds_1_albcompri = AV127AlbComPri ;
      AV144Talbcomwwds_2_albcomfch = AV21AlbComFch ;
      AV145Talbcomwwds_3_albcomfch_to = AV128AlbComFch_To ;
      AV146Talbcomwwds_4_filterfulltext = AV130FilterFullText ;
      AV147Talbcomwwds_5_tfalbcomcod = AV42TFAlbComCod ;
      AV148Talbcomwwds_6_tfalbcomcod_to = AV43TFAlbComCod_To ;
      AV149Talbcomwwds_7_tfalbcomfch = AV44TFAlbComFch ;
      AV150Talbcomwwds_8_tfalbcompri_sels = AV123TFAlbComPri_Sels ;
      AV151Talbcomwwds_9_tfclicod = AV48TFCliCod ;
      AV152Talbcomwwds_10_tfclicod_to = AV49TFCliCod_To ;
      AV153Talbcomwwds_11_tfclinom = AV50TFCliNom ;
      AV154Talbcomwwds_12_tfclinom_sel = AV51TFCliNom_Sel ;
      AV155Talbcomwwds_13_tfalbcomfd = AV82TFAlbComFd ;
      AV156Talbcomwwds_14_tfalbcomfd_sel = AV83TFAlbComFd_Sel ;
      AV157Talbcomwwds_15_tfalbcomfdd = AV84TFAlbComFdD ;
      AV158Talbcomwwds_16_tfalbcomfdd_sel = AV85TFAlbComFdD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV150Talbcomwwds_8_tfalbcompri_sels ,
                                           AV144Talbcomwwds_2_albcomfch ,
                                           AV145Talbcomwwds_3_albcomfch_to ,
                                           AV146Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV147Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV148Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV149Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV150Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV151Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV152Talbcomwwds_10_tfclicod_to) ,
                                           AV154Talbcomwwds_12_tfclinom_sel ,
                                           AV153Talbcomwwds_11_tfclinom ,
                                           AV156Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV155Talbcomwwds_13_tfalbcomfd ,
                                           AV158Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV157Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV143Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV146Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV146Talbcomwwds_4_filterfulltext), "%", "") ;
      lV153Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV153Talbcomwwds_11_tfclinom), 30, "%") ;
      lV155Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV155Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV157Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV157Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G62 */
      pr_default.execute(0, new Object[] {AV143Talbcomwwds_1_albcompri, AV144Talbcomwwds_2_albcomfch, AV145Talbcomwwds_3_albcomfch_to, lV146Talbcomwwds_4_filterfulltext, lV146Talbcomwwds_4_filterfulltext, lV146Talbcomwwds_4_filterfulltext, lV146Talbcomwwds_4_filterfulltext, lV146Talbcomwwds_4_filterfulltext, lV146Talbcomwwds_4_filterfulltext, Integer.valueOf(AV147Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV148Talbcomwwds_6_tfalbcomcod_to), AV149Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV151Talbcomwwds_9_tfclicod), Integer.valueOf(AV152Talbcomwwds_10_tfclicod_to), lV153Talbcomwwds_11_tfclinom, AV154Talbcomwwds_12_tfclinom_sel, lV155Talbcomwwds_13_tfalbcomfd, AV156Talbcomwwds_14_tfalbcomfd_sel, lV157Talbcomwwds_15_tfalbcomfdd, AV158Talbcomwwds_16_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08G62_A396EmprCod[0] ;
         A10015AlbComFdD = P08G62_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G62_A10014AlbComFd[0] ;
         A279CliNom = P08G62_A279CliNom[0] ;
         A252CliCod = P08G62_A252CliCod[0] ;
         A14AlbComCod = P08G62_A14AlbComCod[0] ;
         A17AlbComFch = P08G62_A17AlbComFch[0] ;
         A22AlbComPri = P08G62_A22AlbComPri[0] ;
         A279CliNom = P08G62_A279CliNom[0] ;
         AV116AlbComPriDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "1") == 0 )
         {
            AV116AlbComPriDescription = httpContext.getMessage( "GR", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "0") == 0 )
         {
            AV116AlbComPriDescription = httpContext.getMessage( "GT", "") ;
         }
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
         h8G60( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 30, Gx_line+10, 103, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 107, Gx_line+10, 180, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116AlbComPriDescription, "")), 184, Gx_line+10, 257, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 261, Gx_line+10, 334, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 338, Gx_line+10, 484, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10014AlbComFd, "")), 488, Gx_line+10, 635, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")), 639, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+66) ;
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
      if ( GXutil.strcmp(AV38Session.getValue("TALBCOMWWGridState"), "") == 0 )
      {
         AV40GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBCOMWWGridState"), null, null);
      }
      else
      {
         AV40GridState.fromxml(AV38Session.getValue("TALBCOMWWGridState"), null, null);
      }
      AV10OrderedBy = AV40GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV40GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV159GXV2 = 1 ;
      while ( AV159GXV2 <= AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV41GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV159GXV2));
         if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV127AlbComPri = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV21AlbComFch = localUtil.ctod( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV128AlbComFch_To = localUtil.ctod( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV130FilterFullText = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV42TFAlbComCod = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFAlbComCod_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV44TFAlbComFch = localUtil.ctod( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV121TFAlbComPri_SelsJson = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV123TFAlbComPri_Sels.fromJSonString(AV121TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV48TFCliCod = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFCliCod_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV50TFCliNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV51TFCliNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV82TFAlbComFd = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV83TFAlbComFd_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV84TFAlbComFdD = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV85TFAlbComFdD_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV159GXV2 = (int)(AV159GXV2+1) ;
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

   public void h8G60( boolean bFoot ,
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
               AV106PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV102DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV109Title = AV138Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV109Title = "" ;
      AV127AlbComPri = "" ;
      AV126FilterAlbComPriValueDescription = "" ;
      AV21AlbComFch = GXutil.nullDate() ;
      AV128AlbComFch_To = GXutil.nullDate() ;
      AV130FilterFullText = "" ;
      AV86TFAlbComCod_To_Description = "" ;
      AV44TFAlbComFch = GXutil.nullDate() ;
      AV123TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV121TFAlbComPri_SelsJson = "" ;
      AV47TFAlbComPri_Sel = "" ;
      AV122TFAlbComPri_SelDscs = "" ;
      AV125FilterTFAlbComPri_SelValueDescription = "" ;
      AV88TFCliCod_To_Description = "" ;
      AV51TFCliNom_Sel = "" ;
      AV50TFCliNom = "" ;
      AV83TFAlbComFd_Sel = "" ;
      AV82TFAlbComFd = "" ;
      AV85TFAlbComFdD_Sel = "" ;
      AV84TFAlbComFdD = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV143Talbcomwwds_1_albcompri = "" ;
      AV144Talbcomwwds_2_albcomfch = GXutil.nullDate() ;
      AV145Talbcomwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV146Talbcomwwds_4_filterfulltext = "" ;
      AV149Talbcomwwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV150Talbcomwwds_8_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV153Talbcomwwds_11_tfclinom = "" ;
      AV154Talbcomwwds_12_tfclinom_sel = "" ;
      AV155Talbcomwwds_13_tfalbcomfd = "" ;
      AV156Talbcomwwds_14_tfalbcomfd_sel = "" ;
      AV157Talbcomwwds_15_tfalbcomfdd = "" ;
      AV158Talbcomwwds_16_tfalbcomfdd_sel = "" ;
      scmdbuf = "" ;
      lV146Talbcomwwds_4_filterfulltext = "" ;
      lV153Talbcomwwds_11_tfclinom = "" ;
      lV155Talbcomwwds_13_tfalbcomfd = "" ;
      lV157Talbcomwwds_15_tfalbcomfdd = "" ;
      P08G62_A396EmprCod = new String[] {""} ;
      P08G62_A10015AlbComFdD = new String[] {""} ;
      P08G62_A10014AlbComFd = new String[] {""} ;
      P08G62_A279CliNom = new String[] {""} ;
      P08G62_A252CliCod = new int[1] ;
      P08G62_A14AlbComCod = new int[1] ;
      P08G62_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G62_A22AlbComPri = new String[] {""} ;
      A396EmprCod = "" ;
      AV116AlbComPriDescription = "" ;
      AV38Session = httpContext.getWebSession();
      AV40GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV106PageInfo = "" ;
      AV102DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV138Pgmdesc = "" ;
      AV132AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbcomwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08G62_A396EmprCod, P08G62_A10015AlbComFdD, P08G62_A10014AlbComFd, P08G62_A279CliNom, P08G62_A252CliCod, P08G62_A14AlbComCod, P08G62_A17AlbComFch, P08G62_A22AlbComPri
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV138Pgmdesc = httpContext.getMessage( "TALBCOMWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV138Pgmdesc = httpContext.getMessage( "TALBCOMWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV42TFAlbComCod ;
   private int AV43TFAlbComCod_To ;
   private int AV141GXV1 ;
   private int AV48TFCliCod ;
   private int AV49TFCliCod_To ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV147Talbcomwwds_5_tfalbcomcod ;
   private int AV148Talbcomwwds_6_tfalbcomcod_to ;
   private int AV151Talbcomwwds_9_tfclicod ;
   private int AV152Talbcomwwds_10_tfclicod_to ;
   private int AV150Talbcomwwds_8_tfalbcompri_sels_size ;
   private int AV159GXV2 ;
   private long AV99i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV127AlbComPri ;
   private String AV47TFAlbComPri_Sel ;
   private String AV51TFCliNom_Sel ;
   private String AV50TFCliNom ;
   private String AV83TFAlbComFd_Sel ;
   private String AV82TFAlbComFd ;
   private String AV85TFAlbComFdD_Sel ;
   private String AV84TFAlbComFdD ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV143Talbcomwwds_1_albcompri ;
   private String AV153Talbcomwwds_11_tfclinom ;
   private String AV154Talbcomwwds_12_tfclinom_sel ;
   private String AV155Talbcomwwds_13_tfalbcomfd ;
   private String AV156Talbcomwwds_14_tfalbcomfd_sel ;
   private String AV157Talbcomwwds_15_tfalbcomfdd ;
   private String AV158Talbcomwwds_16_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV153Talbcomwwds_11_tfclinom ;
   private String lV155Talbcomwwds_13_tfalbcomfd ;
   private String lV157Talbcomwwds_15_tfalbcomfdd ;
   private String A396EmprCod ;
   private String AV138Pgmdesc ;
   private java.util.Date AV21AlbComFch ;
   private java.util.Date AV128AlbComFch_To ;
   private java.util.Date AV44TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV144Talbcomwwds_2_albcomfch ;
   private java.util.Date AV145Talbcomwwds_3_albcomfch_to ;
   private java.util.Date AV149Talbcomwwds_7_tfalbcomfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV121TFAlbComPri_SelsJson ;
   private String AV109Title ;
   private String AV126FilterAlbComPriValueDescription ;
   private String AV130FilterFullText ;
   private String AV86TFAlbComCod_To_Description ;
   private String AV122TFAlbComPri_SelDscs ;
   private String AV125FilterTFAlbComPri_SelValueDescription ;
   private String AV88TFCliCod_To_Description ;
   private String AV146Talbcomwwds_4_filterfulltext ;
   private String lV146Talbcomwwds_4_filterfulltext ;
   private String AV116AlbComPriDescription ;
   private String AV106PageInfo ;
   private String AV102DateInfo ;
   private String AV132AppName ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08G62_A396EmprCod ;
   private String[] P08G62_A10015AlbComFdD ;
   private String[] P08G62_A10014AlbComFd ;
   private String[] P08G62_A279CliNom ;
   private int[] P08G62_A252CliCod ;
   private int[] P08G62_A14AlbComCod ;
   private java.util.Date[] P08G62_A17AlbComFch ;
   private String[] P08G62_A22AlbComPri ;
   private GXSimpleCollection<String> AV123TFAlbComPri_Sels ;
   private GXSimpleCollection<String> AV150Talbcomwwds_8_tfalbcompri_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV40GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV41GridStateFilterValue ;
}

final  class talbcomwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV150Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV144Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV145Talbcomwwds_3_albcomfch_to ,
                                          String AV146Talbcomwwds_4_filterfulltext ,
                                          int AV147Talbcomwwds_5_tfalbcomcod ,
                                          int AV148Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV149Talbcomwwds_7_tfalbcomfch ,
                                          int AV150Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV151Talbcomwwds_9_tfclicod ,
                                          int AV152Talbcomwwds_10_tfclicod_to ,
                                          String AV154Talbcomwwds_12_tfclinom_sel ,
                                          String AV153Talbcomwwds_11_tfclinom ,
                                          String AV156Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV155Talbcomwwds_13_tfalbcomfd ,
                                          String AV158Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV157Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV143Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComCod, T1.AlbComFch, T1.AlbComPri FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV147Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV148Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV150Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV150Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV151Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV152Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV153Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV155Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV157Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
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
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD DESC" ;
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
                  return conditional_P08G62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
      }
   }

}

