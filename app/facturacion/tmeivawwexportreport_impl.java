package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmeivawwexportreport_impl extends GXWebReport
{
   public tmeivawwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV33Title = httpContext.getMessage( "Lista de Razões para isenção de IVA", "") ;
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
         h9YY0( true, 0) ;
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
         h9YY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFMeivaId_Sel)==0) )
      {
         h9YY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFMeivaId_Sel, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFMeivaId)==0) )
         {
            h9YY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFMeivaId, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFMeivaDsc_Sel)==0) )
      {
         h9YY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMeivaDsc_Sel, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFMeivaDsc)==0) )
         {
            h9YY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFMeivaDsc, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFMeivaNorma_Sel)==0) )
      {
         h9YY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Norma aplicable", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFMeivaNorma_Sel, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFMeivaNorma)==0) )
         {
            h9YY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Norma aplicable", ""), 25, Gx_line+0, 111, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMeivaNorma, "")), 111, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9YY0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9YY0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 30, Gx_line+10, 179, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 183, Gx_line+10, 483, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Norma aplicable", ""), 487, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV41Facturacion_tmeivawwds_1_filterfulltext = AV12FilterFullText ;
      AV42Facturacion_tmeivawwds_2_tfmeivaid = AV17TFMeivaId ;
      AV43Facturacion_tmeivawwds_3_tfmeivaid_sel = AV18TFMeivaId_Sel ;
      AV44Facturacion_tmeivawwds_4_tfmeivadsc = AV19TFMeivaDsc ;
      AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel = AV20TFMeivaDsc_Sel ;
      AV46Facturacion_tmeivawwds_6_tfmeivanorma = AV21TFMeivaNorma ;
      AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel = AV22TFMeivaNorma_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Facturacion_tmeivawwds_1_filterfulltext ,
                                           AV43Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                           AV42Facturacion_tmeivawwds_2_tfmeivaid ,
                                           AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                           AV44Facturacion_tmeivawwds_4_tfmeivadsc ,
                                           AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                           AV46Facturacion_tmeivawwds_6_tfmeivanorma ,
                                           A11629MeivaId ,
                                           A11630MeivaDsc ,
                                           A11631MeivaNorma ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV41Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV41Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV41Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV42Facturacion_tmeivawwds_2_tfmeivaid = GXutil.padr( GXutil.rtrim( AV42Facturacion_tmeivawwds_2_tfmeivaid), 4, "%") ;
      lV44Facturacion_tmeivawwds_4_tfmeivadsc = GXutil.concat( GXutil.rtrim( AV44Facturacion_tmeivawwds_4_tfmeivadsc), "%", "") ;
      lV46Facturacion_tmeivawwds_6_tfmeivanorma = GXutil.concat( GXutil.rtrim( AV46Facturacion_tmeivawwds_6_tfmeivanorma), "%", "") ;
      /* Using cursor P09YY2 */
      pr_default.execute(0, new Object[] {lV41Facturacion_tmeivawwds_1_filterfulltext, lV41Facturacion_tmeivawwds_1_filterfulltext, lV41Facturacion_tmeivawwds_1_filterfulltext, lV42Facturacion_tmeivawwds_2_tfmeivaid, AV43Facturacion_tmeivawwds_3_tfmeivaid_sel, lV44Facturacion_tmeivawwds_4_tfmeivadsc, AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel, lV46Facturacion_tmeivawwds_6_tfmeivanorma, AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11631MeivaNorma = P09YY2_A11631MeivaNorma[0] ;
         n11631MeivaNorma = P09YY2_n11631MeivaNorma[0] ;
         A11630MeivaDsc = P09YY2_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09YY2_n11630MeivaDsc[0] ;
         A11629MeivaId = P09YY2_A11629MeivaId[0] ;
         A396EmprCod = P09YY2_A396EmprCod[0] ;
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
         h9YY0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11629MeivaId, "")), 30, Gx_line+10, 179, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11630MeivaDsc, "")), 183, Gx_line+10, 483, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11631MeivaNorma, "")), 487, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("Facturacion.TMEIVAWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TMEIVAWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("Facturacion.TMEIVAWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID") == 0 )
         {
            AV17TFMeivaId = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID_SEL") == 0 )
         {
            AV18TFMeivaId_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC") == 0 )
         {
            AV19TFMeivaDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC_SEL") == 0 )
         {
            AV20TFMeivaDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA") == 0 )
         {
            AV21TFMeivaNorma = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA_SEL") == 0 )
         {
            AV22TFMeivaNorma_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
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

   public void h9YY0( boolean bFoot ,
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
               AV31PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV28DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV33Title = AV37Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV33Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFMeivaId_Sel = "" ;
      AV17TFMeivaId = "" ;
      AV20TFMeivaDsc_Sel = "" ;
      AV19TFMeivaDsc = "" ;
      AV22TFMeivaNorma_Sel = "" ;
      AV21TFMeivaNorma = "" ;
      A11629MeivaId = "" ;
      A11630MeivaDsc = "" ;
      A11631MeivaNorma = "" ;
      AV41Facturacion_tmeivawwds_1_filterfulltext = "" ;
      AV42Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      AV43Facturacion_tmeivawwds_3_tfmeivaid_sel = "" ;
      AV44Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel = "" ;
      AV46Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel = "" ;
      scmdbuf = "" ;
      lV41Facturacion_tmeivawwds_1_filterfulltext = "" ;
      lV42Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      lV44Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      lV46Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      P09YY2_A11631MeivaNorma = new String[] {""} ;
      P09YY2_n11631MeivaNorma = new boolean[] {false} ;
      P09YY2_A11630MeivaDsc = new String[] {""} ;
      P09YY2_n11630MeivaDsc = new boolean[] {false} ;
      P09YY2_A11629MeivaId = new String[] {""} ;
      P09YY2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV31PageInfo = "" ;
      AV28DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV37Pgmdesc = "" ;
      AV26AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmeivawwexportreport__default(),
         new Object[] {
             new Object[] {
            P09YY2_A11631MeivaNorma, P09YY2_n11631MeivaNorma, P09YY2_A11630MeivaDsc, P09YY2_n11630MeivaDsc, P09YY2_A11629MeivaId, P09YY2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV37Pgmdesc = httpContext.getMessage( "TMEIVAWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV37Pgmdesc = httpContext.getMessage( "TMEIVAWWExport Report", "") ;
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
   private int AV48GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFMeivaId_Sel ;
   private String AV17TFMeivaId ;
   private String A11629MeivaId ;
   private String AV42Facturacion_tmeivawwds_2_tfmeivaid ;
   private String AV43Facturacion_tmeivawwds_3_tfmeivaid_sel ;
   private String scmdbuf ;
   private String lV42Facturacion_tmeivawwds_2_tfmeivaid ;
   private String A396EmprCod ;
   private String AV37Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n11631MeivaNorma ;
   private boolean n11630MeivaDsc ;
   private String AV33Title ;
   private String AV12FilterFullText ;
   private String AV20TFMeivaDsc_Sel ;
   private String AV19TFMeivaDsc ;
   private String AV22TFMeivaNorma_Sel ;
   private String AV21TFMeivaNorma ;
   private String A11630MeivaDsc ;
   private String A11631MeivaNorma ;
   private String AV41Facturacion_tmeivawwds_1_filterfulltext ;
   private String AV44Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel ;
   private String AV46Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel ;
   private String lV41Facturacion_tmeivawwds_1_filterfulltext ;
   private String lV44Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String lV46Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String AV31PageInfo ;
   private String AV28DateInfo ;
   private String AV26AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09YY2_A11631MeivaNorma ;
   private boolean[] P09YY2_n11631MeivaNorma ;
   private String[] P09YY2_A11630MeivaDsc ;
   private boolean[] P09YY2_n11630MeivaDsc ;
   private String[] P09YY2_A11629MeivaId ;
   private String[] P09YY2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class tmeivawwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Facturacion_tmeivawwds_1_filterfulltext ,
                                          String AV43Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                          String AV42Facturacion_tmeivawwds_2_tfmeivaid ,
                                          String AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                          String AV44Facturacion_tmeivawwds_4_tfmeivadsc ,
                                          String AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                          String AV46Facturacion_tmeivawwds_6_tfmeivanorma ,
                                          String A11629MeivaId ,
                                          String A11630MeivaDsc ,
                                          String A11631MeivaNorma ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MeivaNorma, MeivaDsc, MeivaId, EmprCod FROM TXPMEIVA" ;
      if ( ! (GXutil.strcmp("", AV41Facturacion_tmeivawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MeivaId) like '%' || UPPER(?)) or ( UPPER(MeivaDsc) like '%' || UPPER(?)) or ( UPPER(MeivaNorma) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tmeivawwds_2_tfmeivaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaId = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Facturacion_tmeivawwds_4_tfmeivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) && ( ! (GXutil.strcmp("", AV46Facturacion_tmeivawwds_6_tfmeivanorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaNorma = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, MeivaId" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaId" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaId DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaDsc" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaNorma" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaNorma DESC" ;
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
                  return conditional_P09YY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               return;
      }
   }

}

