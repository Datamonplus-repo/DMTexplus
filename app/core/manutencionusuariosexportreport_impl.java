package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class manutencionusuariosexportreport_impl extends GXWebReport
{
   public manutencionusuariosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV34Title = httpContext.getMessage( "Lista de USUARIOS", "") ;
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
         hANB0( true, 0) ;
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
         hANB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFUsurNom_Sel)==0) )
      {
         hANB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFUsurNom_Sel, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFUsurNom)==0) )
         {
            hANB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFUsurNom, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV21TFUsuMail_Sel)==0) )
      {
         hANB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E-Mail", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFUsuMail_Sel, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFUsuMail)==0) )
         {
            hANB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "E-Mail", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFUsuMail, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFUsurPrint_Sel)==0) )
      {
         hANB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Printer", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFUsurPrint_Sel, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFUsurPrint)==0) )
         {
            hANB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Printer", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFUsurPrint, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFUsurSockt_Sel)==0) )
      {
         hANB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Sockt", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFUsurSockt_Sel, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFUsurSockt)==0) )
         {
            hANB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Sockt", ""), 25, Gx_line+0, 71, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFUsurSockt, "")), 71, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hANB0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hANB0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "UUID", ""), 30, Gx_line+10, 112, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 116, Gx_line+10, 280, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E-Mail", ""), 284, Gx_line+10, 448, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Printer", ""), 452, Gx_line+10, 617, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Sockt", ""), 621, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV44Core_manutencionusuariosds_1_filterfulltext = AV12FilterFullText ;
      AV45Core_manutencionusuariosds_2_tfusurnom = AV17TFUsurNom ;
      AV46Core_manutencionusuariosds_3_tfusurnom_sel = AV18TFUsurNom_Sel ;
      AV47Core_manutencionusuariosds_4_tfusumail = AV20TFUsuMail ;
      AV48Core_manutencionusuariosds_5_tfusumail_sel = AV21TFUsuMail_Sel ;
      AV49Core_manutencionusuariosds_6_tfusurprint = AV22TFUsurPrint ;
      AV50Core_manutencionusuariosds_7_tfusurprint_sel = AV23TFUsurPrint_Sel ;
      AV51Core_manutencionusuariosds_8_tfusursockt = AV36TFUsurSockt ;
      AV52Core_manutencionusuariosds_9_tfusursockt_sel = AV37TFUsurSockt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Core_manutencionusuariosds_1_filterfulltext ,
                                           AV46Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV45Core_manutencionusuariosds_2_tfusurnom ,
                                           AV48Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV47Core_manutencionusuariosds_4_tfusumail ,
                                           AV50Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV49Core_manutencionusuariosds_6_tfusurprint ,
                                           AV52Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV51Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV44Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV44Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV44Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV44Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV45Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV45Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV47Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV47Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV49Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV49Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV51Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV51Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0ANB2 */
      pr_default.execute(0, new Object[] {lV44Core_manutencionusuariosds_1_filterfulltext, lV44Core_manutencionusuariosds_1_filterfulltext, lV44Core_manutencionusuariosds_1_filterfulltext, lV44Core_manutencionusuariosds_1_filterfulltext, lV45Core_manutencionusuariosds_2_tfusurnom, AV46Core_manutencionusuariosds_3_tfusurnom_sel, lV47Core_manutencionusuariosds_4_tfusumail, AV48Core_manutencionusuariosds_5_tfusumail_sel, lV49Core_manutencionusuariosds_6_tfusurprint, AV50Core_manutencionusuariosds_7_tfusurprint_sel, lV51Core_manutencionusuariosds_8_tfusursockt, AV52Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14487UsurSockt = P0ANB2_A14487UsurSockt[0] ;
         n14487UsurSockt = P0ANB2_n14487UsurSockt[0] ;
         A14415UsurPrint = P0ANB2_A14415UsurPrint[0] ;
         n14415UsurPrint = P0ANB2_n14415UsurPrint[0] ;
         A10513UsuMail = P0ANB2_A10513UsuMail[0] ;
         A854UsurNom = P0ANB2_A854UsurNom[0] ;
         n854UsurNom = P0ANB2_n854UsurNom[0] ;
         A14371UsurGuid = P0ANB2_A14371UsurGuid[0] ;
         n14371UsurGuid = P0ANB2_n14371UsurGuid[0] ;
         A850UsurCod = P0ANB2_A850UsurCod[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         hANB0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(A14371UsurGuid.toString(), 30, Gx_line+10, 112, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A854UsurNom, "")), 116, Gx_line+10, 280, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10513UsuMail, "")), 284, Gx_line+10, 448, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14415UsurPrint, "")), 452, Gx_line+10, 617, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14487UsurSockt, "")), 621, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV13Session.getValue("Core.ManutencionUsuariosGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Core.ManutencionUsuariosGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("Core.ManutencionUsuariosGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM") == 0 )
         {
            AV17TFUsurNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM_SEL") == 0 )
         {
            AV18TFUsurNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL") == 0 )
         {
            AV20TFUsuMail = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL_SEL") == 0 )
         {
            AV21TFUsuMail_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT") == 0 )
         {
            AV22TFUsurPrint = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT_SEL") == 0 )
         {
            AV23TFUsurPrint_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT") == 0 )
         {
            AV36TFUsurSockt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT_SEL") == 0 )
         {
            AV37TFUsurSockt_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
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

   public void hANB0( boolean bFoot ,
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
               AV32PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV29DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV34Title = AV40Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV34Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFUsurNom_Sel = "" ;
      AV17TFUsurNom = "" ;
      AV21TFUsuMail_Sel = "" ;
      AV20TFUsuMail = "" ;
      AV23TFUsurPrint_Sel = "" ;
      AV22TFUsurPrint = "" ;
      AV37TFUsurSockt_Sel = "" ;
      AV36TFUsurSockt = "" ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A854UsurNom = "" ;
      A10513UsuMail = "" ;
      A14415UsurPrint = "" ;
      A14487UsurSockt = "" ;
      AV44Core_manutencionusuariosds_1_filterfulltext = "" ;
      AV45Core_manutencionusuariosds_2_tfusurnom = "" ;
      AV46Core_manutencionusuariosds_3_tfusurnom_sel = "" ;
      AV47Core_manutencionusuariosds_4_tfusumail = "" ;
      AV48Core_manutencionusuariosds_5_tfusumail_sel = "" ;
      AV49Core_manutencionusuariosds_6_tfusurprint = "" ;
      AV50Core_manutencionusuariosds_7_tfusurprint_sel = "" ;
      AV51Core_manutencionusuariosds_8_tfusursockt = "" ;
      AV52Core_manutencionusuariosds_9_tfusursockt_sel = "" ;
      scmdbuf = "" ;
      lV44Core_manutencionusuariosds_1_filterfulltext = "" ;
      lV45Core_manutencionusuariosds_2_tfusurnom = "" ;
      lV47Core_manutencionusuariosds_4_tfusumail = "" ;
      lV49Core_manutencionusuariosds_6_tfusurprint = "" ;
      lV51Core_manutencionusuariosds_8_tfusursockt = "" ;
      P0ANB2_A14487UsurSockt = new String[] {""} ;
      P0ANB2_n14487UsurSockt = new boolean[] {false} ;
      P0ANB2_A14415UsurPrint = new String[] {""} ;
      P0ANB2_n14415UsurPrint = new boolean[] {false} ;
      P0ANB2_A10513UsuMail = new String[] {""} ;
      P0ANB2_A854UsurNom = new String[] {""} ;
      P0ANB2_n854UsurNom = new boolean[] {false} ;
      P0ANB2_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0ANB2_n14371UsurGuid = new boolean[] {false} ;
      P0ANB2_A850UsurCod = new String[] {""} ;
      A850UsurCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32PageInfo = "" ;
      AV29DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV40Pgmdesc = "" ;
      AV27AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.manutencionusuariosexportreport__default(),
         new Object[] {
             new Object[] {
            P0ANB2_A14487UsurSockt, P0ANB2_n14487UsurSockt, P0ANB2_A14415UsurPrint, P0ANB2_n14415UsurPrint, P0ANB2_A10513UsuMail, P0ANB2_A854UsurNom, P0ANB2_n854UsurNom, P0ANB2_A14371UsurGuid, P0ANB2_n14371UsurGuid, P0ANB2_A850UsurCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV40Pgmdesc = httpContext.getMessage( "Manutencion Usuarios Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV40Pgmdesc = httpContext.getMessage( "Manutencion Usuarios Export Report", "") ;
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
   private int AV53GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFUsurNom_Sel ;
   private String AV17TFUsurNom ;
   private String AV21TFUsuMail_Sel ;
   private String AV20TFUsuMail ;
   private String A854UsurNom ;
   private String A10513UsuMail ;
   private String AV45Core_manutencionusuariosds_2_tfusurnom ;
   private String AV46Core_manutencionusuariosds_3_tfusurnom_sel ;
   private String AV47Core_manutencionusuariosds_4_tfusumail ;
   private String AV48Core_manutencionusuariosds_5_tfusumail_sel ;
   private String scmdbuf ;
   private String lV45Core_manutencionusuariosds_2_tfusurnom ;
   private String lV47Core_manutencionusuariosds_4_tfusumail ;
   private String A850UsurCod ;
   private String AV40Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n14487UsurSockt ;
   private boolean n14415UsurPrint ;
   private boolean n854UsurNom ;
   private boolean n14371UsurGuid ;
   private String AV34Title ;
   private String AV12FilterFullText ;
   private String AV23TFUsurPrint_Sel ;
   private String AV22TFUsurPrint ;
   private String AV37TFUsurSockt_Sel ;
   private String AV36TFUsurSockt ;
   private String A14415UsurPrint ;
   private String A14487UsurSockt ;
   private String AV44Core_manutencionusuariosds_1_filterfulltext ;
   private String AV49Core_manutencionusuariosds_6_tfusurprint ;
   private String AV50Core_manutencionusuariosds_7_tfusurprint_sel ;
   private String AV51Core_manutencionusuariosds_8_tfusursockt ;
   private String AV52Core_manutencionusuariosds_9_tfusursockt_sel ;
   private String lV44Core_manutencionusuariosds_1_filterfulltext ;
   private String lV49Core_manutencionusuariosds_6_tfusurprint ;
   private String lV51Core_manutencionusuariosds_8_tfusursockt ;
   private String AV32PageInfo ;
   private String AV29DateInfo ;
   private String AV27AppName ;
   private java.util.UUID A14371UsurGuid ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANB2_A14487UsurSockt ;
   private boolean[] P0ANB2_n14487UsurSockt ;
   private String[] P0ANB2_A14415UsurPrint ;
   private boolean[] P0ANB2_n14415UsurPrint ;
   private String[] P0ANB2_A10513UsuMail ;
   private String[] P0ANB2_A854UsurNom ;
   private boolean[] P0ANB2_n854UsurNom ;
   private java.util.UUID[] P0ANB2_A14371UsurGuid ;
   private boolean[] P0ANB2_n14371UsurGuid ;
   private String[] P0ANB2_A850UsurCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class manutencionusuariosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV46Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV45Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV48Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV47Core_manutencionusuariosds_4_tfusumail ,
                                          String AV50Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV49Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV52Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV51Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT UsurSockt, UsurPrint, UsuMail, UsurNom, UsurGuid, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV44Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV45Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV51Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurGuid" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurGuid DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY UsuMail" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsuMail DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurPrint" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurPrint DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurSockt" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurSockt DESC" ;
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
                  return conditional_P0ANB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[7])[0] = rslt.getGUID(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               return;
      }
   }

}

