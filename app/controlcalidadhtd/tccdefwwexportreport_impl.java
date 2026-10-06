package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccdefwwexportreport_impl extends GXWebReport
{
   public tccdefwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV40Title = httpContext.getMessage( "Lista de Definición de Cont. de Calidad", "") ;
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
         h9OT0( true, 0) ;
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
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFEmprNom_Sel)==0) )
      {
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFEmprNom_Sel, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFEmprNom)==0) )
         {
            h9OT0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprNom, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV21TFCCTDsc_Sel)==0) )
      {
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFCCTDsc_Sel, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFCCTDsc)==0) )
         {
            h9OT0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFCCTDsc, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV24TFCCTTpoCtr_Sels.fromJSonString(AV22TFCCTTpoCtr_SelsJson, null);
      if ( ! ( AV24TFCCTTpoCtr_Sels.size() == 0 ) )
      {
         AV29i = 1 ;
         AV47GXV1 = 1 ;
         while ( AV47GXV1 <= AV24TFCCTTpoCtr_Sels.size() )
         {
            AV25TFCCTTpoCtr_Sel = (String)AV24TFCCTTpoCtr_Sels.elementAt(-1+AV47GXV1) ;
            if ( AV29i == 1 )
            {
               AV23TFCCTTpoCtr_SelDscs = "" ;
            }
            else
            {
               AV23TFCCTTpoCtr_SelDscs += ", " ;
            }
            AV28FilterTFCCTTpoCtr_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV25TFCCTTpoCtr_Sel), "E") == 0 )
            {
               AV28FilterTFCCTTpoCtr_SelValueDescription = httpContext.getMessage( "ISO (Externo)", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV25TFCCTTpoCtr_Sel), "I") == 0 )
            {
               AV28FilterTFCCTTpoCtr_SelValueDescription = httpContext.getMessage( "Interno", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV25TFCCTTpoCtr_Sel), "D") == 0 )
            {
               AV28FilterTFCCTTpoCtr_SelValueDescription = httpContext.getMessage( "Defectos", "") ;
            }
            AV23TFCCTTpoCtr_SelDscs += AV28FilterTFCCTTpoCtr_SelValueDescription ;
            AV29i = (long)(AV29i+1) ;
            AV47GXV1 = (int)(AV47GXV1+1) ;
         }
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Control", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCCTTpoCtr_SelDscs, "")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFCCTObl_Sel)==0) )
      {
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Control Obligatorio", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFCCTObl_Sel, "@!")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCCTSto_Sel)==0) )
      {
         h9OT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Control, para producción", ""), 25, Gx_line+0, 153, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFCCTSto_Sel, "@!")), 153, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9OT0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9OT0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 30, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 218, Gx_line+10, 403, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Control", ""), 407, Gx_line+10, 593, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Control Obligatorio", ""), 597, Gx_line+10, 690, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Control, para producción", ""), 694, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext = AV12FilterFullText ;
      AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom = AV18TFEmprNom ;
      AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel = AV19TFEmprNom_Sel ;
      AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc = AV20TFCCTDsc ;
      AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel = AV21TFCCTDsc_Sel ;
      AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels = AV24TFCCTTpoCtr_Sels ;
      AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel = AV26TFCCTObl_Sel ;
      AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel = AV27TFCCTSto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                           AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                           AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                           AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                           AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                           Integer.valueOf(AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels.size()) ,
                                           AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                           AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A4039CCTObl ,
                                           A4040CCTSto ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Controlcalidadhtd_tccdefwwds_2_tfemprnom = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom), 30, "%") ;
      lV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P09OT2 */
      pr_default.execute(0, new Object[] {lV50Controlcalidadhtd_tccdefwwds_2_tfemprnom, AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel, lV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc, AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel, AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel, AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09OT2_A396EmprCod[0] ;
         A4040CCTSto = P09OT2_A4040CCTSto[0] ;
         A4039CCTObl = P09OT2_A4039CCTObl[0] ;
         A4036CCTDsc = P09OT2_A4036CCTDsc[0] ;
         A407EmprNom = P09OT2_A407EmprNom[0] ;
         n407EmprNom = P09OT2_n407EmprNom[0] ;
         A4037CCTTpoCtr = P09OT2_A4037CCTTpoCtr[0] ;
         A4031CCTCod = P09OT2_A4031CCTCod[0] ;
         A407EmprNom = P09OT2_A407EmprNom[0] ;
         n407EmprNom = P09OT2_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "iso (externo)", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "defectos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) ) ) )
         {
            AV13CCTTpoCtrDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A4037CCTTpoCtr), "E") == 0 )
            {
               AV13CCTTpoCtrDescription = httpContext.getMessage( "ISO (Externo)", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A4037CCTTpoCtr), "I") == 0 )
            {
               AV13CCTTpoCtrDescription = httpContext.getMessage( "Interno", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A4037CCTTpoCtr), "D") == 0 )
            {
               AV13CCTTpoCtrDescription = httpContext.getMessage( "Defectos", "") ;
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
            h9OT0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 30, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 218, Gx_line+10, 403, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13CCTTpoCtrDescription, "")), 407, Gx_line+10, 593, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4039CCTObl, "@!")), 597, Gx_line+10, 690, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4040CCTSto, "@!")), 694, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("ControlCalidadHTD.TCCDefWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.TCCDefWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("ControlCalidadHTD.TCCDefWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV57GXV2 = 1 ;
      while ( AV57GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV18TFEmprNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV19TFEmprNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV20TFCCTDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV21TFCCTDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTTPOCTR_SEL") == 0 )
         {
            AV22TFCCTTpoCtr_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV24TFCCTTpoCtr_Sels.fromJSonString(AV22TFCCTTpoCtr_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTOBL_SEL") == 0 )
         {
            AV26TFCCTObl_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTSTO_SEL") == 0 )
         {
            AV27TFCCTSto_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV57GXV2 = (int)(AV57GXV2+1) ;
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

   public void h9OT0( boolean bFoot ,
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
               AV38PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV35DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV40Title = AV44Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV40Title = "" ;
      AV12FilterFullText = "" ;
      AV19TFEmprNom_Sel = "" ;
      AV18TFEmprNom = "" ;
      AV21TFCCTDsc_Sel = "" ;
      AV20TFCCTDsc = "" ;
      AV24TFCCTTpoCtr_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22TFCCTTpoCtr_SelsJson = "" ;
      AV25TFCCTTpoCtr_Sel = "" ;
      AV23TFCCTTpoCtr_SelDscs = "" ;
      AV28FilterTFCCTTpoCtr_SelValueDescription = "" ;
      AV26TFCCTObl_Sel = "" ;
      AV27TFCCTSto_Sel = "" ;
      A4037CCTTpoCtr = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A4039CCTObl = "" ;
      A4040CCTSto = "" ;
      AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext = "" ;
      AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom = "" ;
      AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel = "" ;
      AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc = "" ;
      AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel = "" ;
      AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel = "" ;
      AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel = "" ;
      scmdbuf = "" ;
      lV50Controlcalidadhtd_tccdefwwds_2_tfemprnom = "" ;
      lV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc = "" ;
      P09OT2_A396EmprCod = new String[] {""} ;
      P09OT2_A4040CCTSto = new String[] {""} ;
      P09OT2_A4039CCTObl = new String[] {""} ;
      P09OT2_A4036CCTDsc = new String[] {""} ;
      P09OT2_A407EmprNom = new String[] {""} ;
      P09OT2_n407EmprNom = new boolean[] {false} ;
      P09OT2_A4037CCTTpoCtr = new String[] {""} ;
      P09OT2_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      AV13CCTTpoCtrDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38PageInfo = "" ;
      AV35DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV44Pgmdesc = "" ;
      AV33AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefwwexportreport__default(),
         new Object[] {
             new Object[] {
            P09OT2_A396EmprCod, P09OT2_A4040CCTSto, P09OT2_A4039CCTObl, P09OT2_A4036CCTDsc, P09OT2_A407EmprNom, P09OT2_n407EmprNom, P09OT2_A4037CCTTpoCtr, P09OT2_A4031CCTCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV44Pgmdesc = httpContext.getMessage( "TCCDef WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV44Pgmdesc = httpContext.getMessage( "TCCDef WWExport Report", "") ;
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
   private int AV47GXV1 ;
   private int AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size ;
   private int A4031CCTCod ;
   private int AV57GXV2 ;
   private long AV29i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFEmprNom_Sel ;
   private String AV18TFEmprNom ;
   private String AV21TFCCTDsc_Sel ;
   private String AV20TFCCTDsc ;
   private String AV25TFCCTTpoCtr_Sel ;
   private String AV26TFCCTObl_Sel ;
   private String AV27TFCCTSto_Sel ;
   private String A4037CCTTpoCtr ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A4039CCTObl ;
   private String A4040CCTSto ;
   private String AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom ;
   private String AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ;
   private String AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc ;
   private String AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ;
   private String AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ;
   private String AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ;
   private String scmdbuf ;
   private String lV50Controlcalidadhtd_tccdefwwds_2_tfemprnom ;
   private String lV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc ;
   private String A396EmprCod ;
   private String AV44Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV22TFCCTTpoCtr_SelsJson ;
   private String AV40Title ;
   private String AV12FilterFullText ;
   private String AV23TFCCTTpoCtr_SelDscs ;
   private String AV28FilterTFCCTTpoCtr_SelValueDescription ;
   private String AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext ;
   private String AV13CCTTpoCtrDescription ;
   private String AV38PageInfo ;
   private String AV35DateInfo ;
   private String AV33AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09OT2_A396EmprCod ;
   private String[] P09OT2_A4040CCTSto ;
   private String[] P09OT2_A4039CCTObl ;
   private String[] P09OT2_A4036CCTDsc ;
   private String[] P09OT2_A407EmprNom ;
   private boolean[] P09OT2_n407EmprNom ;
   private String[] P09OT2_A4037CCTTpoCtr ;
   private int[] P09OT2_A4031CCTCod ;
   private GXSimpleCollection<String> AV24TFCCTTpoCtr_Sels ;
   private GXSimpleCollection<String> AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tccdefwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                          String AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                          String AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                          String AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                          String AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                          int AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size ,
                                          String AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                          String AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A4039CCTObl ,
                                          String A4040CCTSto ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV49Controlcalidadhtd_tccdefwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTSto, T1.CCTObl, T1.CCTDsc, T2.EmprNom, T1.CCTTpoCtr, T1.CCTCod FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_tccdefwwds_2_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_tccdefwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTObl = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTSto = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTTpoCtr" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTTpoCtr DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTObl" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTObl DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTSto" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTSto DESC" ;
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
                  return conditional_P09OT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setString(sIdx, (String)parms[6], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               return;
      }
   }

}

