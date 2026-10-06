package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesexportreport_impl extends GXWebReport
{
   public wcconsultadocumentoscomercialesexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV49Title = httpContext.getMessage( "Lista de Documento Comercial (v01)", "") ;
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
         h9Z40( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV18FilterFullText)==0) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFAlbComFch)) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV29TFAlbComFch, "99/99/99"), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFCliCod) && (0==AV24TFCliCod_To) ) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod), "ZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCliCod_To_Description, "")), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFCliCod_To), "ZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFCliNom_Sel)==0) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFCliNom_Sel, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFCliNom)==0) )
         {
            h9Z40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFCliNom, "")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV27TFAlbComCod) && (0==AV28TFAlbComCod_To) ) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFAlbComCod), "ZZZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFAlbComCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Documento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFAlbComCod_To_Description, "")), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFAlbComCod_To), "ZZZZZZZ9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFAlbComPri_Sel)==0) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFAlbComPri_Sel, "9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFAlbComPri)==0) )
         {
            h9Z40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFAlbComPri, "9")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFAlbComImp)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFAlbComImp_To)==0) ) )
      {
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFAlbComImp, "ZZZZZZZZZ9.99")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFAlbComImp_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9Z40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFAlbComImp_To_Description, "")), 25, Gx_line+0, 143, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFAlbComImp_To, "ZZZZZZZZZ9.99")), 143, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9Z40( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9Z40( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 30, Gx_line+10, 135, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 139, Gx_line+10, 244, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 248, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 462, Gx_line+10, 567, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 571, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 681, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV58Wcconsultadocumentoscomercialesds_1_filterfulltext = AV18FilterFullText ;
      AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch = AV29TFAlbComFch ;
      AV60Wcconsultadocumentoscomercialesds_3_tfclicod = AV23TFCliCod ;
      AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to = AV24TFCliCod_To ;
      AV62Wcconsultadocumentoscomercialesds_5_tfclinom = AV25TFCliNom ;
      AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel = AV26TFCliNom_Sel ;
      AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod = AV27TFAlbComCod ;
      AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to = AV28TFAlbComCod_To ;
      AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri = AV31TFAlbComPri ;
      AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel = AV32TFAlbComPri_Sel ;
      AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp = AV33TFAlbComImp ;
      AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to = AV34TFAlbComImp_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                           AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                           Integer.valueOf(AV60Wcconsultadocumentoscomercialesds_3_tfclicod) ,
                                           Integer.valueOf(AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to) ,
                                           AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                           AV62Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                           Integer.valueOf(AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod) ,
                                           Integer.valueOf(AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) ,
                                           AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                           AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                           AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                           AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           A18AlbComImp ,
                                           A17AlbComFch ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Integer.valueOf(AV11Clicod) ,
                                           Integer.valueOf(AV12Clicod_to) ,
                                           AV13AlbComFch ,
                                           AV14AlbComFch_to ,
                                           AV51Prioridad ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcconsultadocumentoscomercialesds_1_filterfulltext), "%", "") ;
      lV62Wcconsultadocumentoscomercialesds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV62Wcconsultadocumentoscomercialesds_5_tfclinom), 30, "%") ;
      lV66Wcconsultadocumentoscomercialesds_9_tfalbcompri = GXutil.padr( GXutil.rtrim( AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri), 1, "%") ;
      /* Using cursor P09Z43 */
      pr_default.execute(0, new Object[] {AV10Emprcod, Integer.valueOf(AV11Clicod), Integer.valueOf(AV12Clicod_to), AV13AlbComFch, AV14AlbComFch_to, AV51Prioridad, AV51Prioridad, lV58Wcconsultadocumentoscomercialesds_1_filterfulltext, lV58Wcconsultadocumentoscomercialesds_1_filterfulltext, lV58Wcconsultadocumentoscomercialesds_1_filterfulltext, lV58Wcconsultadocumentoscomercialesds_1_filterfulltext, lV58Wcconsultadocumentoscomercialesds_1_filterfulltext, AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch, Integer.valueOf(AV60Wcconsultadocumentoscomercialesds_3_tfclicod), Integer.valueOf(AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to), lV62Wcconsultadocumentoscomercialesds_5_tfclinom, AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel, Integer.valueOf(AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod), Integer.valueOf(AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to), lV66Wcconsultadocumentoscomercialesds_9_tfalbcompri, AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel, AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp, AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09Z43_A396EmprCod[0] ;
         A22AlbComPri = P09Z43_A22AlbComPri[0] ;
         A14AlbComCod = P09Z43_A14AlbComCod[0] ;
         A279CliNom = P09Z43_A279CliNom[0] ;
         A252CliCod = P09Z43_A252CliCod[0] ;
         A17AlbComFch = P09Z43_A17AlbComFch[0] ;
         A18AlbComImp = P09Z43_A18AlbComImp[0] ;
         n18AlbComImp = P09Z43_n18AlbComImp[0] ;
         A18AlbComImp = P09Z43_A18AlbComImp[0] ;
         n18AlbComImp = P09Z43_n18AlbComImp[0] ;
         A279CliNom = P09Z43_A279CliNom[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
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
         h9Z40( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 30, Gx_line+10, 135, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 139, Gx_line+10, 244, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 248, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 462, Gx_line+10, 567, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A22AlbComPri, "9")), 571, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99")), 681, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDocumentosComercialesGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCConsultaDocumentosComercialesGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV29TFAlbComFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV23TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV25TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV26TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV27TFAlbComCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFAlbComCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI") == 0 )
         {
            AV31TFAlbComPri = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV32TFAlbComPri_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMIMP") == 0 )
         {
            AV33TFAlbComImp = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFAlbComImp_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV11Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV12Clicod_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH") == 0 )
         {
            AV13AlbComFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH_TO") == 0 )
         {
            AV14AlbComFch_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIORIDAD") == 0 )
         {
            AV51Prioridad = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
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

   public void h9Z40( boolean bFoot ,
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
               AV47PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV44DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV49Title = AV54Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV49Title = "" ;
      AV18FilterFullText = "" ;
      AV29TFAlbComFch = GXutil.nullDate() ;
      AV35TFCliCod_To_Description = "" ;
      AV26TFCliNom_Sel = "" ;
      AV25TFCliNom = "" ;
      AV36TFAlbComCod_To_Description = "" ;
      AV32TFAlbComPri_Sel = "" ;
      AV31TFAlbComPri = "" ;
      AV33TFAlbComImp = DecimalUtil.ZERO ;
      AV34TFAlbComImp_To = DecimalUtil.ZERO ;
      AV38TFAlbComImp_To_Description = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A22AlbComPri = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      AV58Wcconsultadocumentoscomercialesds_1_filterfulltext = "" ;
      AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch = GXutil.nullDate() ;
      AV62Wcconsultadocumentoscomercialesds_5_tfclinom = "" ;
      AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel = "" ;
      AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri = "" ;
      AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel = "" ;
      AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp = DecimalUtil.ZERO ;
      AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV58Wcconsultadocumentoscomercialesds_1_filterfulltext = "" ;
      lV62Wcconsultadocumentoscomercialesds_5_tfclinom = "" ;
      lV66Wcconsultadocumentoscomercialesds_9_tfalbcompri = "" ;
      AV13AlbComFch = GXutil.nullDate() ;
      AV14AlbComFch_to = GXutil.nullDate() ;
      AV51Prioridad = "" ;
      AV10Emprcod = "" ;
      A396EmprCod = "" ;
      P09Z43_A396EmprCod = new String[] {""} ;
      P09Z43_A22AlbComPri = new String[] {""} ;
      P09Z43_A14AlbComCod = new int[1] ;
      P09Z43_A279CliNom = new String[] {""} ;
      P09Z43_A252CliCod = new int[1] ;
      P09Z43_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09Z43_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09Z43_n18AlbComImp = new boolean[] {false} ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47PageInfo = "" ;
      AV44DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV54Pgmdesc = "" ;
      AV42AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesexportreport__default(),
         new Object[] {
             new Object[] {
            P09Z43_A396EmprCod, P09Z43_A22AlbComPri, P09Z43_A14AlbComCod, P09Z43_A279CliNom, P09Z43_A252CliCod, P09Z43_A17AlbComFch, P09Z43_A18AlbComImp, P09Z43_n18AlbComImp
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Listado Documentos Comerciales", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Listado Documentos Comerciales", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV23TFCliCod ;
   private int AV24TFCliCod_To ;
   private int AV27TFAlbComCod ;
   private int AV28TFAlbComCod_To ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private int AV60Wcconsultadocumentoscomercialesds_3_tfclicod ;
   private int AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to ;
   private int AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod ;
   private int AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to ;
   private int AV11Clicod ;
   private int AV12Clicod_to ;
   private int AV70GXV1 ;
   private java.math.BigDecimal AV33TFAlbComImp ;
   private java.math.BigDecimal AV34TFAlbComImp_To ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp ;
   private java.math.BigDecimal AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFCliNom_Sel ;
   private String AV25TFCliNom ;
   private String AV32TFAlbComPri_Sel ;
   private String AV31TFAlbComPri ;
   private String A279CliNom ;
   private String A22AlbComPri ;
   private String AV62Wcconsultadocumentoscomercialesds_5_tfclinom ;
   private String AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel ;
   private String AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri ;
   private String AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ;
   private String scmdbuf ;
   private String lV62Wcconsultadocumentoscomercialesds_5_tfclinom ;
   private String lV66Wcconsultadocumentoscomercialesds_9_tfalbcompri ;
   private String AV51Prioridad ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String AV54Pgmdesc ;
   private java.util.Date AV29TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch ;
   private java.util.Date AV13AlbComFch ;
   private java.util.Date AV14AlbComFch_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n18AlbComImp ;
   private String AV49Title ;
   private String AV18FilterFullText ;
   private String AV35TFCliCod_To_Description ;
   private String AV36TFAlbComCod_To_Description ;
   private String AV38TFAlbComImp_To_Description ;
   private String AV58Wcconsultadocumentoscomercialesds_1_filterfulltext ;
   private String lV58Wcconsultadocumentoscomercialesds_1_filterfulltext ;
   private String AV47PageInfo ;
   private String AV44DateInfo ;
   private String AV42AppName ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09Z43_A396EmprCod ;
   private String[] P09Z43_A22AlbComPri ;
   private int[] P09Z43_A14AlbComCod ;
   private String[] P09Z43_A279CliNom ;
   private int[] P09Z43_A252CliCod ;
   private java.util.Date[] P09Z43_A17AlbComFch ;
   private java.math.BigDecimal[] P09Z43_A18AlbComImp ;
   private boolean[] P09Z43_n18AlbComImp ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wcconsultadocumentoscomercialesexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09Z43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Wcconsultadocumentoscomercialesds_1_filterfulltext ,
                                          java.util.Date AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch ,
                                          int AV60Wcconsultadocumentoscomercialesds_3_tfclicod ,
                                          int AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to ,
                                          String AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel ,
                                          String AV62Wcconsultadocumentoscomercialesds_5_tfclinom ,
                                          int AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod ,
                                          int AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to ,
                                          String AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel ,
                                          String AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri ,
                                          java.math.BigDecimal AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp ,
                                          java.math.BigDecimal AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          java.math.BigDecimal A18AlbComImp ,
                                          java.util.Date A17AlbComFch ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          int AV11Clicod ,
                                          int AV12Clicod_to ,
                                          java.util.Date AV13AlbComFch ,
                                          java.util.Date AV14AlbComFch_to ,
                                          String AV51Prioridad ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComCod, T3.CliNom, T1.CliCod, T1.AlbComFch, COALESCE( T2.AlbComImp, 0) AS AlbComImp FROM ((TXPCALCOM T1 LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ? or ? = '2')");
      if ( ! (GXutil.strcmp("", AV58Wcconsultadocumentoscomercialesds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.AlbComImp, 0),'9999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Wcconsultadocumentoscomercialesds_2_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Wcconsultadocumentoscomercialesds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcconsultadocumentoscomercialesds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultadocumentoscomercialesds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultadocumentoscomercialesds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcconsultadocumentoscomercialesds_7_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadocumentoscomercialesds_8_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultadocumentoscomercialesds_9_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultadocumentoscomercialesds_10_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wcconsultadocumentoscomercialesds_11_tfalbcomimp)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wcconsultadocumentoscomercialesds_12_tfalbcomimp_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.AlbComImp, 0) <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
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
                  return conditional_P09Z43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Z43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               return;
      }
   }

}

