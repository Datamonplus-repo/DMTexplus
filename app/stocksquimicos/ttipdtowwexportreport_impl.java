package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipdtowwexportreport_impl extends GXWebReport
{
   public ttipdtowwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV33Title = httpContext.getMessage( "Lista de Tipo de Descuento", "") ;
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
         h8MI0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV39FilterFullText)==0) )
      {
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39FilterFullText, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFTipDtoCod) && (0==AV17TFTipDtoCod_To) ) )
      {
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFTipDtoCod), "Z9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV22TFTipDtoCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFTipDtoCod_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFTipDtoCod_To), "Z9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFTipDtoDsc_Sel)==0) )
      {
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Descuento", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFTipDtoDsc_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFTipDtoDsc)==0) )
         {
            h8MI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Descuento", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFTipDtoDsc, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20TFTipDtoDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV21TFTipDtoDto_To)==0) ) )
      {
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TFTipDtoDto, "Z9.99")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV23TFTipDtoDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descuento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8MI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFTipDtoDto_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TFTipDtoDto_To, "Z9.99")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8MI0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8MI0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 30, Gx_line+10, 217, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Descuento", ""), 221, Gx_line+10, 595, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 599, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV51Stocksquimicos_ttipdtowwds_1_filterfulltext = AV39FilterFullText ;
      AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod = AV16TFTipDtoCod ;
      AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to = AV17TFTipDtoCod_To ;
      AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc = AV18TFTipDtoDsc ;
      AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel = AV19TFTipDtoDsc_Sel ;
      AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto = AV20TFTipDtoDto ;
      AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to = AV21TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Stocksquimicos_ttipdtowwds_1_filterfulltext ,
                                           Byte.valueOf(AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod) ,
                                           Byte.valueOf(AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to) ,
                                           AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ,
                                           AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc ,
                                           AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto ,
                                           AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ,
                                           Byte.valueOf(A835TipDtoCod) ,
                                           A836TipDtoDsc ,
                                           A837TipDtoDto ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV51Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV51Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV51Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc = GXutil.padr( GXutil.rtrim( AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc), 30, "%") ;
      /* Using cursor P08MI2 */
      pr_default.execute(0, new Object[] {lV51Stocksquimicos_ttipdtowwds_1_filterfulltext, lV51Stocksquimicos_ttipdtowwds_1_filterfulltext, lV51Stocksquimicos_ttipdtowwds_1_filterfulltext, Byte.valueOf(AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod), Byte.valueOf(AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to), lV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc, AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel, AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto, AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A837TipDtoDto = P08MI2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08MI2_n837TipDtoDto[0] ;
         A836TipDtoDsc = P08MI2_A836TipDtoDsc[0] ;
         n836TipDtoDsc = P08MI2_n836TipDtoDsc[0] ;
         A835TipDtoCod = P08MI2_A835TipDtoCod[0] ;
         A396EmprCod = P08MI2_A396EmprCod[0] ;
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
         h8MI0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9")), 30, Gx_line+10, 217, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A836TipDtoDsc, "")), 221, Gx_line+10, 595, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A837TipDtoDto, "Z9.99")), 599, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV12Session.getValue("StocksQuimicos.TTIPDTOWWGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPDTOWWGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("StocksQuimicos.TTIPDTOWWGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV39FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTOCOD") == 0 )
         {
            AV16TFTipDtoCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFTipDtoCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODSC") == 0 )
         {
            AV18TFTipDtoDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODSC_SEL") == 0 )
         {
            AV19TFTipDtoDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV20TFTipDtoDto = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFTipDtoDto_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
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

   public void h8MI0( boolean bFoot ,
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
               AV30PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV26DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV33Title = AV47Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV39FilterFullText = "" ;
      AV22TFTipDtoCod_To_Description = "" ;
      AV19TFTipDtoDsc_Sel = "" ;
      AV18TFTipDtoDsc = "" ;
      AV20TFTipDtoDto = DecimalUtil.ZERO ;
      AV21TFTipDtoDto_To = DecimalUtil.ZERO ;
      AV23TFTipDtoDto_To_Description = "" ;
      A836TipDtoDsc = "" ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      AV51Stocksquimicos_ttipdtowwds_1_filterfulltext = "" ;
      AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc = "" ;
      AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel = "" ;
      AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto = DecimalUtil.ZERO ;
      AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV51Stocksquimicos_ttipdtowwds_1_filterfulltext = "" ;
      lV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc = "" ;
      P08MI2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08MI2_n837TipDtoDto = new boolean[] {false} ;
      P08MI2_A836TipDtoDsc = new String[] {""} ;
      P08MI2_n836TipDtoDsc = new boolean[] {false} ;
      P08MI2_A835TipDtoCod = new byte[1] ;
      P08MI2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30PageInfo = "" ;
      AV26DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV47Pgmdesc = "" ;
      AV41AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdtowwexportreport__default(),
         new Object[] {
             new Object[] {
            P08MI2_A837TipDtoDto, P08MI2_n837TipDtoDto, P08MI2_A836TipDtoDsc, P08MI2_n836TipDtoDsc, P08MI2_A835TipDtoCod, P08MI2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "TTIPDTOWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "TTIPDTOWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TFTipDtoCod ;
   private byte AV17TFTipDtoCod_To ;
   private byte A835TipDtoCod ;
   private byte AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod ;
   private byte AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV58GXV1 ;
   private java.math.BigDecimal AV20TFTipDtoDto ;
   private java.math.BigDecimal AV21TFTipDtoDto_To ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto ;
   private java.math.BigDecimal AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFTipDtoDsc_Sel ;
   private String AV18TFTipDtoDsc ;
   private String A836TipDtoDsc ;
   private String AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc ;
   private String AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ;
   private String scmdbuf ;
   private String lV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc ;
   private String A396EmprCod ;
   private String AV47Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n837TipDtoDto ;
   private boolean n836TipDtoDsc ;
   private String AV33Title ;
   private String AV39FilterFullText ;
   private String AV22TFTipDtoCod_To_Description ;
   private String AV23TFTipDtoDto_To_Description ;
   private String AV51Stocksquimicos_ttipdtowwds_1_filterfulltext ;
   private String lV51Stocksquimicos_ttipdtowwds_1_filterfulltext ;
   private String AV30PageInfo ;
   private String AV26DateInfo ;
   private String AV41AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08MI2_A837TipDtoDto ;
   private boolean[] P08MI2_n837TipDtoDto ;
   private String[] P08MI2_A836TipDtoDsc ;
   private boolean[] P08MI2_n836TipDtoDsc ;
   private byte[] P08MI2_A835TipDtoCod ;
   private String[] P08MI2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class ttipdtowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Stocksquimicos_ttipdtowwds_1_filterfulltext ,
                                          byte AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod ,
                                          byte AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to ,
                                          String AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ,
                                          String AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc ,
                                          java.math.BigDecimal AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto ,
                                          java.math.BigDecimal AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ,
                                          byte A835TipDtoCod ,
                                          String A836TipDtoDsc ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipDtoDto, TipDtoDsc, TipDtoCod, EmprCod FROM TXPTIPDTO" ;
      if ( ! (GXutil.strcmp("", AV51Stocksquimicos_ttipdtowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipDtoCod,'90'), 2) like '%' || ?) or ( UPPER(TipDtoDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipDtoDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_ttipdtowwds_2_tftipdtocod) )
      {
         addWhere(sWhereString, "(TipDtoCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV53Stocksquimicos_ttipdtowwds_3_tftipdtocod_to) )
      {
         addWhere(sWhereString, "(TipDtoCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Stocksquimicos_ttipdtowwds_4_tftipdtodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDtoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDtoDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Stocksquimicos_ttipdtowwds_6_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(TipDtoDto >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Stocksquimicos_ttipdtowwds_7_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(TipDtoDto <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipDtoCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipDtoCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipDtoDsc" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipDtoDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipDtoDto" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipDtoDto DESC" ;
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
                  return conditional_P08MI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(3);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
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

