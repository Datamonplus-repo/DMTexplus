package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_detallerecetasadiciones_wcexportreport_impl extends GXWebReport
{
   public upq_cuentacorriente_detallerecetasadiciones_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV30Title = httpContext.getMessage( "Lista de HISTORICO RECETAS AÑAD.BALANZ.", "") ;
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
         h9HU0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV11FilterFullText)==0) )
      {
         h9HU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11FilterFullText, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFHrePrdCFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFHrePrdCFin_To)==0) ) )
      {
         h9HU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17TFHrePrdCFin, "ZZZZZZ9.999")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV19TFHrePrdCFin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9HU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFHrePrdCFin_To_Description, "")), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18TFHrePrdCFin_To, "ZZZZZZ9.999")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9HU0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9HU0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 30, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 410, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext = AV11FilterFullText ;
      AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin = AV17TFHrePrdCFin ;
      AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to = AV18TFHrePrdCFin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext ,
                                           AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin ,
                                           AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to ,
                                           A4511HrePrdCFin ,
                                           Boolean.valueOf(AV10OrderedDsc) ,
                                           A719PrdNum ,
                                           AV36HrePrdnum ,
                                           AV32Emprcod ,
                                           Integer.valueOf(AV33HreBarCod) ,
                                           Byte.valueOf(AV34HreBarReo) ,
                                           AV35HreBarPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext), "%", "") ;
      /* Using cursor P09HU2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, Integer.valueOf(AV33HreBarCod), Byte.valueOf(AV34HreBarReo), AV35HreBarPar, AV36HrePrdnum, lV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext, AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin, AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09HU2_A719PrdNum[0] ;
         A4494HreBarPar = P09HU2_A4494HreBarPar[0] ;
         A4493HreBarReo = P09HU2_A4493HreBarReo[0] ;
         A4492HreBarCod = P09HU2_A4492HreBarCod[0] ;
         A396EmprCod = P09HU2_A396EmprCod[0] ;
         A4511HrePrdCFin = P09HU2_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P09HU2_n4511HrePrdCFin[0] ;
         A4495HreNumCie = P09HU2_A4495HreNumCie[0] ;
         A4508HreLinMAL = P09HU2_A4508HreLinMAL[0] ;
         A4509HreNumAny = P09HU2_A4509HreNumAny[0] ;
         AV12BarNHdr = GXutil.trim( GXutil.str( A4492HreBarCod, 8, 0)) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
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
         h9HU0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12BarNHdr, "")), 30, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999")), 410, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetasAdiciones_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetasAdiciones_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetasAdiciones_WCGridState"), null, null);
      }
      AV10OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV11FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCFIN") == 0 )
         {
            AV17TFHrePrdCFin = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV18TFHrePrdCFin_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV32Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV33HreBarCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV34HreBarReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV35HreBarPar = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREPRDNUM") == 0 )
         {
            AV36HrePrdnum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
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

   public void h9HU0( boolean bFoot ,
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
               AV28PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV25DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV30Title = AV39Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV30Title = "" ;
      AV11FilterFullText = "" ;
      AV17TFHrePrdCFin = DecimalUtil.ZERO ;
      AV18TFHrePrdCFin_To = DecimalUtil.ZERO ;
      AV19TFHrePrdCFin_To_Description = "" ;
      A4494HreBarPar = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext = "" ;
      AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin = DecimalUtil.ZERO ;
      AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext = "" ;
      A719PrdNum = "" ;
      AV36HrePrdnum = "" ;
      AV32Emprcod = "" ;
      AV35HreBarPar = "" ;
      A396EmprCod = "" ;
      P09HU2_A719PrdNum = new String[] {""} ;
      P09HU2_A4494HreBarPar = new String[] {""} ;
      P09HU2_A4493HreBarReo = new byte[1] ;
      P09HU2_A4492HreBarCod = new int[1] ;
      P09HU2_A396EmprCod = new String[] {""} ;
      P09HU2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HU2_n4511HrePrdCFin = new boolean[] {false} ;
      P09HU2_A4495HreNumCie = new byte[1] ;
      P09HU2_A4508HreLinMAL = new short[1] ;
      P09HU2_A4509HreNumAny = new byte[1] ;
      AV12BarNHdr = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV28PageInfo = "" ;
      AV25DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV39Pgmdesc = "" ;
      AV23AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_detallerecetasadiciones_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09HU2_A719PrdNum, P09HU2_A4494HreBarPar, P09HU2_A4493HreBarReo, P09HU2_A4492HreBarCod, P09HU2_A396EmprCod, P09HU2_A4511HrePrdCFin, P09HU2_n4511HrePrdCFin, P09HU2_A4495HreNumCie, P09HU2_A4508HreLinMAL, P09HU2_A4509HreNumAny
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV39Pgmdesc = httpContext.getMessage( "UPQ_Cuenta Corriente_Detalle Recetas Adiciones_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV39Pgmdesc = httpContext.getMessage( "UPQ_Cuenta Corriente_Detalle Recetas Adiciones_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte AV34HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short gxcookieaux ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A4492HreBarCod ;
   private int AV33HreBarCod ;
   private int AV46GXV1 ;
   private java.math.BigDecimal AV17TFHrePrdCFin ;
   private java.math.BigDecimal AV18TFHrePrdCFin_To ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin ;
   private java.math.BigDecimal AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4494HreBarPar ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV36HrePrdnum ;
   private String AV32Emprcod ;
   private String AV35HreBarPar ;
   private String A396EmprCod ;
   private String AV12BarNHdr ;
   private String AV39Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV10OrderedDsc ;
   private boolean n4511HrePrdCFin ;
   private String AV30Title ;
   private String AV11FilterFullText ;
   private String AV19TFHrePrdCFin_To_Description ;
   private String AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext ;
   private String lV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext ;
   private String AV28PageInfo ;
   private String AV25DateInfo ;
   private String AV23AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09HU2_A719PrdNum ;
   private String[] P09HU2_A4494HreBarPar ;
   private byte[] P09HU2_A4493HreBarReo ;
   private int[] P09HU2_A4492HreBarCod ;
   private String[] P09HU2_A396EmprCod ;
   private java.math.BigDecimal[] P09HU2_A4511HrePrdCFin ;
   private boolean[] P09HU2_n4511HrePrdCFin ;
   private byte[] P09HU2_A4495HreNumCie ;
   private short[] P09HU2_A4508HreLinMAL ;
   private byte[] P09HU2_A4509HreNumAny ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class upq_cuentacorriente_detallerecetasadiciones_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext ,
                                          java.math.BigDecimal AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin ,
                                          java.math.BigDecimal AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          boolean AV10OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV36HrePrdnum ,
                                          String AV32Emprcod ,
                                          int AV33HreBarCod ,
                                          byte AV34HreBarReo ,
                                          String AV35HreBarPar ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNum, HreBarPar, HreBarReo, HreBarCod, EmprCod, HrePrdCFin, HreNumCie, HreLinMAL, HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV43Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HrePrdCFin,'9999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_2_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Stocksquimicos_upq_cuentacorriente_detallerecetasadiciones_wcds_3_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ! AV10OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCFin" ;
      }
      else if ( AV10OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCFin DESC" ;
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
                  return conditional_P09HU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 3);
               }
               return;
      }
   }

}

