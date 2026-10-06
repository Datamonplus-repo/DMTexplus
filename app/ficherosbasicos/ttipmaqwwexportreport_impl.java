package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipmaqwwexportreport_impl extends GXWebReport
{
   public ttipmaqwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV51Title = httpContext.getMessage( "Lista de Tipo Maquina", "") ;
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
         h80D0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV54FilterFullText)==0) )
      {
         h80D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54FilterFullText, "")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFTipMaqCod_Sel)==0) )
      {
         h80D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFTipMaqCod_Sel, "")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFTipMaqCod)==0) )
         {
            h80D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFTipMaqCod, "")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV38TFTipMaqDsc_Sel)==0) )
      {
         h80D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFTipMaqDsc_Sel, "")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFTipMaqDsc)==0) )
         {
            h80D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFTipMaqDsc, "")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFTipMaqC24)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFTipMaqC24_To)==0) ) )
      {
         h80D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Carga por 24 Horas", ""), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TFTipMaqC24, "ZZZZZZ9.99")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFTipMaqC24_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Carga por 24 Horas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h80D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFTipMaqC24_To_Description, "")), 25, Gx_line+0, 166, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFTipMaqC24_To, "ZZZZZZ9.99")), 166, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h80D0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h80D0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 30, Gx_line+10, 217, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 221, Gx_line+10, 595, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Carga por 24 Horas", ""), 599, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = AV54FilterFullText ;
      AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = AV35TFTipMaqCod ;
      AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = AV36TFTipMaqCod_Sel ;
      AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = AV37TFTipMaqDsc ;
      AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = AV38TFTipMaqDsc_Sel ;
      AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = AV39TFTipMaqC24 ;
      AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = AV40TFTipMaqC24_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                           AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                           AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                           AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                           AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                           AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                           AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           A12447TipMaqC24 ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod), 4, "%") ;
      lV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc), 30, "%") ;
      /* Using cursor P080D2 */
      pr_default.execute(0, new Object[] {lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod, AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel, lV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc, AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel, AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24, AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12447TipMaqC24 = P080D2_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P080D2_n12447TipMaqC24[0] ;
         A1012TipMaqDsc = P080D2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P080D2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P080D2_A1011TipMaqCod[0] ;
         A396EmprCod = P080D2_A396EmprCod[0] ;
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
         h80D0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1011TipMaqCod, "")), 30, Gx_line+10, 217, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1012TipMaqDsc, "")), 221, Gx_line+10, 595, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12447TipMaqC24, "ZZZZZZ9.99")), 599, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV31Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      AV10OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV35TFTipMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV36TFTipMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV37TFTipMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV38TFTipMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQC24") == 0 )
         {
            AV39TFTipMaqC24 = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFTipMaqC24_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
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

   public void h80D0( boolean bFoot ,
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
               AV48PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV44DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
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
            AV51Title = AV66Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV51Title = "" ;
      AV54FilterFullText = "" ;
      AV36TFTipMaqCod_Sel = "" ;
      AV35TFTipMaqCod = "" ;
      AV38TFTipMaqDsc_Sel = "" ;
      AV37TFTipMaqDsc = "" ;
      AV39TFTipMaqC24 = DecimalUtil.ZERO ;
      AV40TFTipMaqC24_To = DecimalUtil.ZERO ;
      AV41TFTipMaqC24_To_Description = "" ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      A12447TipMaqC24 = DecimalUtil.ZERO ;
      AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = "" ;
      AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = "" ;
      AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = DecimalUtil.ZERO ;
      AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      lV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      lV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      P080D2_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080D2_n12447TipMaqC24 = new boolean[] {false} ;
      P080D2_A1012TipMaqDsc = new String[] {""} ;
      P080D2_n1012TipMaqDsc = new boolean[] {false} ;
      P080D2_A1011TipMaqCod = new String[] {""} ;
      P080D2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48PageInfo = "" ;
      AV44DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV66Pgmdesc = "" ;
      AV60AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipmaqwwexportreport__default(),
         new Object[] {
             new Object[] {
            P080D2_A12447TipMaqC24, P080D2_n12447TipMaqC24, P080D2_A1012TipMaqDsc, P080D2_n1012TipMaqDsc, P080D2_A1011TipMaqCod, P080D2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV66Pgmdesc = httpContext.getMessage( "Listado Tipo Maquina", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV66Pgmdesc = httpContext.getMessage( "Listado Tipo Maquina", "") ;
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
   private int AV77GXV1 ;
   private java.math.BigDecimal AV39TFTipMaqC24 ;
   private java.math.BigDecimal AV40TFTipMaqC24_To ;
   private java.math.BigDecimal A12447TipMaqC24 ;
   private java.math.BigDecimal AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ;
   private java.math.BigDecimal AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV36TFTipMaqCod_Sel ;
   private String AV35TFTipMaqCod ;
   private String AV38TFTipMaqDsc_Sel ;
   private String AV37TFTipMaqDsc ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ;
   private String AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String lV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String A396EmprCod ;
   private String AV66Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n12447TipMaqC24 ;
   private boolean n1012TipMaqDsc ;
   private String AV51Title ;
   private String AV54FilterFullText ;
   private String AV41TFTipMaqC24_To_Description ;
   private String AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String lV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String AV48PageInfo ;
   private String AV44DateInfo ;
   private String AV60AppName ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P080D2_A12447TipMaqC24 ;
   private boolean[] P080D2_n12447TipMaqC24 ;
   private String[] P080D2_A1012TipMaqDsc ;
   private boolean[] P080D2_n1012TipMaqDsc ;
   private String[] P080D2_A1011TipMaqCod ;
   private String[] P080D2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class ttipmaqwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                          String AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                          String AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                          String AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                          String AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                          java.math.BigDecimal AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                          java.math.BigDecimal AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          java.math.BigDecimal A12447TipMaqC24 ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipMaqC24, TipMaqDsc, TipMaqCod, EmprCod FROM TXPTIPMAQ" ;
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_ttipmaqwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMaqCod) like '%' || UPPER(?)) or ( UPPER(TipMaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipMaqC24,'9999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqC24" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqC24 DESC" ;
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
                  return conditional_P080D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
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
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

