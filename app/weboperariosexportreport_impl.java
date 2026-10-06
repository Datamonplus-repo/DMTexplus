package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class weboperariosexportreport_impl extends GXWebReport
{
   public weboperariosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV48Title = httpContext.getMessage( "Lista de MANTENIMIENTO DE OPERARIOS", "") ;
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
         h8B30( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV55FilterFullText)==0) )
      {
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55FilterFullText, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV12DynamicFiltersSelector1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV12DynamicFiltersSelector1, "OPENOM") == 0 )
         {
            AV13DynamicFiltersOperator1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV14OpeNom1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            if ( ! (GXutil.strcmp("", AV14OpeNom1)==0) )
            {
               if ( AV13DynamicFiltersOperator1 == 0 )
               {
                  AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
               }
               else if ( AV13DynamicFiltersOperator1 == 1 )
               {
                  AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
               }
               AV16OpeNom = AV14OpeNom1 ;
               h8B30( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterOpeNomDescription, "")), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OpeNom, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
         }
         if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV17DynamicFiltersEnabled2 = true ;
            AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV18DynamicFiltersSelector2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV18DynamicFiltersSelector2, "OPENOM") == 0 )
            {
               AV19DynamicFiltersOperator2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV20OpeNom2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               if ( ! (GXutil.strcmp("", AV20OpeNom2)==0) )
               {
                  if ( AV19DynamicFiltersOperator2 == 0 )
                  {
                     AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
                  }
                  else if ( AV19DynamicFiltersOperator2 == 1 )
                  {
                     AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
                  }
                  AV16OpeNom = AV20OpeNom2 ;
                  h8B30( false, 20) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterOpeNomDescription, "")), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OpeNom, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
            }
            if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV21DynamicFiltersEnabled3 = true ;
               AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV22DynamicFiltersSelector3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV22DynamicFiltersSelector3, "OPENOM") == 0 )
               {
                  AV23DynamicFiltersOperator3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV24OpeNom3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  if ( ! (GXutil.strcmp("", AV24OpeNom3)==0) )
                  {
                     if ( AV23DynamicFiltersOperator3 == 0 )
                     {
                        AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
                     }
                     else if ( AV23DynamicFiltersOperator3 == 1 )
                     {
                        AV15FilterOpeNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
                     }
                     AV16OpeNom = AV24OpeNom3 ;
                     h8B30( false, 20) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterOpeNomDescription, "")), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OpeNom, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                  }
               }
            }
         }
      }
      if ( ! ( (0==AV30TFOpeCod) && (0==AV31TFOpeCod_To) ) )
      {
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFOpeCod), "ZZZZZ9")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFOpeCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Operario", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFOpeCod_To_Description, "")), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFOpeCod_To), "ZZZZZ9")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFOpeNom_Sel)==0) )
      {
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFOpeNom_Sel, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFOpeNom)==0) )
         {
            h8B30( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFOpeNom, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFOpeNom2_Sel)==0) )
      {
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre II", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFOpeNom2_Sel, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFOpeNom2)==0) )
         {
            h8B30( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre II", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFOpeNom2, "")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFOpeAct_Sel)==0) )
      {
         h8B30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "A/I", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFOpeAct_Sel, "@!")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFOpeAct)==0) )
         {
            h8B30( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A/I", ""), 25, Gx_line+0, 150, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFOpeAct, "@!")), 150, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8B30( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8B30( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("", 30, Gx_line+10, 135, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 139, Gx_line+10, 245, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 249, Gx_line+10, 461, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre II", ""), 465, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "A/I", ""), 681, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV69Weboperariosds_1_filterfulltext = AV55FilterFullText ;
      AV70Weboperariosds_2_dynamicfiltersselector1 = AV12DynamicFiltersSelector1 ;
      AV71Weboperariosds_3_dynamicfiltersoperator1 = AV13DynamicFiltersOperator1 ;
      AV72Weboperariosds_4_openom1 = AV14OpeNom1 ;
      AV73Weboperariosds_5_dynamicfiltersenabled2 = AV17DynamicFiltersEnabled2 ;
      AV74Weboperariosds_6_dynamicfiltersselector2 = AV18DynamicFiltersSelector2 ;
      AV75Weboperariosds_7_dynamicfiltersoperator2 = AV19DynamicFiltersOperator2 ;
      AV76Weboperariosds_8_openom2 = AV20OpeNom2 ;
      AV77Weboperariosds_9_dynamicfiltersenabled3 = AV21DynamicFiltersEnabled3 ;
      AV78Weboperariosds_10_dynamicfiltersselector3 = AV22DynamicFiltersSelector3 ;
      AV79Weboperariosds_11_dynamicfiltersoperator3 = AV23DynamicFiltersOperator3 ;
      AV80Weboperariosds_12_openom3 = AV24OpeNom3 ;
      AV81Weboperariosds_13_tfopecod = AV30TFOpeCod ;
      AV82Weboperariosds_14_tfopecod_to = AV31TFOpeCod_To ;
      AV83Weboperariosds_15_tfopenom = AV32TFOpeNom ;
      AV84Weboperariosds_16_tfopenom_sel = AV33TFOpeNom_Sel ;
      AV85Weboperariosds_17_tfopenom2 = AV34TFOpeNom2 ;
      AV86Weboperariosds_18_tfopenom2_sel = AV35TFOpeNom2_Sel ;
      AV87Weboperariosds_19_tfopeact = AV36TFOpeAct ;
      AV88Weboperariosds_20_tfopeact_sel = AV37TFOpeAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Weboperariosds_1_filterfulltext ,
                                           AV70Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV71Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV72Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV73Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV74Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV75Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV76Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV77Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV78Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV79Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV80Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV81Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV82Weboperariosds_14_tfopecod_to) ,
                                           AV84Weboperariosds_16_tfopenom_sel ,
                                           AV83Weboperariosds_15_tfopenom ,
                                           AV86Weboperariosds_18_tfopenom2_sel ,
                                           AV85Weboperariosds_17_tfopenom2 ,
                                           AV88Weboperariosds_20_tfopeact_sel ,
                                           AV87Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV69Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Weboperariosds_1_filterfulltext), "%", "") ;
      lV69Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Weboperariosds_1_filterfulltext), "%", "") ;
      lV69Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Weboperariosds_1_filterfulltext), "%", "") ;
      lV69Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Weboperariosds_1_filterfulltext), "%", "") ;
      lV72Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV72Weboperariosds_4_openom1), 30, "%") ;
      lV72Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV72Weboperariosds_4_openom1), 30, "%") ;
      lV76Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV76Weboperariosds_8_openom2), 30, "%") ;
      lV76Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV76Weboperariosds_8_openom2), 30, "%") ;
      lV80Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV80Weboperariosds_12_openom3), 30, "%") ;
      lV80Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV80Weboperariosds_12_openom3), 30, "%") ;
      lV83Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV83Weboperariosds_15_tfopenom), 30, "%") ;
      lV85Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV85Weboperariosds_17_tfopenom2), 30, "%") ;
      lV87Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV87Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B32 */
      pr_default.execute(0, new Object[] {lV69Weboperariosds_1_filterfulltext, lV69Weboperariosds_1_filterfulltext, lV69Weboperariosds_1_filterfulltext, lV69Weboperariosds_1_filterfulltext, lV72Weboperariosds_4_openom1, lV72Weboperariosds_4_openom1, lV76Weboperariosds_8_openom2, lV76Weboperariosds_8_openom2, lV80Weboperariosds_12_openom3, lV80Weboperariosds_12_openom3, Integer.valueOf(AV81Weboperariosds_13_tfopecod), Integer.valueOf(AV82Weboperariosds_14_tfopecod_to), lV83Weboperariosds_15_tfopenom, AV84Weboperariosds_16_tfopenom_sel, lV85Weboperariosds_17_tfopenom2, AV86Weboperariosds_18_tfopenom2_sel, lV87Weboperariosds_19_tfopeact, AV88Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P08B32_A8482OpeAct[0] ;
         n8482OpeAct = P08B32_n8482OpeAct[0] ;
         A6869OpeNom2 = P08B32_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B32_n6869OpeNom2[0] ;
         A652OpeCod = P08B32_A652OpeCod[0] ;
         A653OpeNom = P08B32_A653OpeNom[0] ;
         n653OpeNom = P08B32_n653OpeNom[0] ;
         A396EmprCod = P08B32_A396EmprCod[0] ;
         AV54Seleccion = "N" ;
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
         h8B30( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Seleccion, "")), 30, Gx_line+10, 135, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")), 139, Gx_line+10, 245, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A653OpeNom, "")), 249, Gx_line+10, 461, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6869OpeNom2, "")), 465, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8482OpeAct, "@!")), 681, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV26Session.getValue("WebOperariosGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebOperariosGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("WebOperariosGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV30TFOpeCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFOpeCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV32TFOpeNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV33TFOpeNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV34TFOpeNom2 = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV35TFOpeNom2_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV36TFOpeAct = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV37TFOpeAct_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
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

   public void h8B30( boolean bFoot ,
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
               AV45PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV41DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV48Title = AV65Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV48Title = "" ;
      AV55FilterFullText = "" ;
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV12DynamicFiltersSelector1 = "" ;
      AV14OpeNom1 = "" ;
      AV15FilterOpeNomDescription = "" ;
      AV16OpeNom = "" ;
      AV18DynamicFiltersSelector2 = "" ;
      AV20OpeNom2 = "" ;
      AV22DynamicFiltersSelector3 = "" ;
      AV24OpeNom3 = "" ;
      AV38TFOpeCod_To_Description = "" ;
      AV33TFOpeNom_Sel = "" ;
      AV32TFOpeNom = "" ;
      AV35TFOpeNom2_Sel = "" ;
      AV34TFOpeNom2 = "" ;
      AV37TFOpeAct_Sel = "" ;
      AV36TFOpeAct = "" ;
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      AV69Weboperariosds_1_filterfulltext = "" ;
      AV70Weboperariosds_2_dynamicfiltersselector1 = "" ;
      AV72Weboperariosds_4_openom1 = "" ;
      AV74Weboperariosds_6_dynamicfiltersselector2 = "" ;
      AV76Weboperariosds_8_openom2 = "" ;
      AV78Weboperariosds_10_dynamicfiltersselector3 = "" ;
      AV80Weboperariosds_12_openom3 = "" ;
      AV83Weboperariosds_15_tfopenom = "" ;
      AV84Weboperariosds_16_tfopenom_sel = "" ;
      AV85Weboperariosds_17_tfopenom2 = "" ;
      AV86Weboperariosds_18_tfopenom2_sel = "" ;
      AV87Weboperariosds_19_tfopeact = "" ;
      AV88Weboperariosds_20_tfopeact_sel = "" ;
      scmdbuf = "" ;
      lV69Weboperariosds_1_filterfulltext = "" ;
      lV72Weboperariosds_4_openom1 = "" ;
      lV76Weboperariosds_8_openom2 = "" ;
      lV80Weboperariosds_12_openom3 = "" ;
      lV83Weboperariosds_15_tfopenom = "" ;
      lV85Weboperariosds_17_tfopenom2 = "" ;
      lV87Weboperariosds_19_tfopeact = "" ;
      P08B32_A8482OpeAct = new String[] {""} ;
      P08B32_n8482OpeAct = new boolean[] {false} ;
      P08B32_A6869OpeNom2 = new String[] {""} ;
      P08B32_n6869OpeNom2 = new boolean[] {false} ;
      P08B32_A652OpeCod = new int[1] ;
      P08B32_A653OpeNom = new String[] {""} ;
      P08B32_n653OpeNom = new boolean[] {false} ;
      P08B32_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV54Seleccion = "" ;
      AV26Session = httpContext.getWebSession();
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV41DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV65Pgmdesc = "" ;
      AV59AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.weboperariosexportreport__default(),
         new Object[] {
             new Object[] {
            P08B32_A8482OpeAct, P08B32_n8482OpeAct, P08B32_A6869OpeNom2, P08B32_n6869OpeNom2, P08B32_A652OpeCod, P08B32_A653OpeNom, P08B32_n653OpeNom, P08B32_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV65Pgmdesc = httpContext.getMessage( "Web Operarios Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV65Pgmdesc = httpContext.getMessage( "Web Operarios Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV13DynamicFiltersOperator1 ;
   private short AV19DynamicFiltersOperator2 ;
   private short AV23DynamicFiltersOperator3 ;
   private short AV71Weboperariosds_3_dynamicfiltersoperator1 ;
   private short AV75Weboperariosds_7_dynamicfiltersoperator2 ;
   private short AV79Weboperariosds_11_dynamicfiltersoperator3 ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV30TFOpeCod ;
   private int AV31TFOpeCod_To ;
   private int A652OpeCod ;
   private int AV81Weboperariosds_13_tfopecod ;
   private int AV82Weboperariosds_14_tfopecod_to ;
   private int AV89GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV14OpeNom1 ;
   private String AV16OpeNom ;
   private String AV20OpeNom2 ;
   private String AV24OpeNom3 ;
   private String AV33TFOpeNom_Sel ;
   private String AV32TFOpeNom ;
   private String AV35TFOpeNom2_Sel ;
   private String AV34TFOpeNom2 ;
   private String AV37TFOpeAct_Sel ;
   private String AV36TFOpeAct ;
   private String A653OpeNom ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String AV72Weboperariosds_4_openom1 ;
   private String AV76Weboperariosds_8_openom2 ;
   private String AV80Weboperariosds_12_openom3 ;
   private String AV83Weboperariosds_15_tfopenom ;
   private String AV84Weboperariosds_16_tfopenom_sel ;
   private String AV85Weboperariosds_17_tfopenom2 ;
   private String AV86Weboperariosds_18_tfopenom2_sel ;
   private String AV87Weboperariosds_19_tfopeact ;
   private String AV88Weboperariosds_20_tfopeact_sel ;
   private String scmdbuf ;
   private String lV72Weboperariosds_4_openom1 ;
   private String lV76Weboperariosds_8_openom2 ;
   private String lV80Weboperariosds_12_openom3 ;
   private String lV83Weboperariosds_15_tfopenom ;
   private String lV85Weboperariosds_17_tfopenom2 ;
   private String lV87Weboperariosds_19_tfopeact ;
   private String A396EmprCod ;
   private String AV54Seleccion ;
   private String AV65Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17DynamicFiltersEnabled2 ;
   private boolean AV21DynamicFiltersEnabled3 ;
   private boolean AV73Weboperariosds_5_dynamicfiltersenabled2 ;
   private boolean AV77Weboperariosds_9_dynamicfiltersenabled3 ;
   private boolean AV11OrderedDsc ;
   private boolean n8482OpeAct ;
   private boolean n6869OpeNom2 ;
   private boolean n653OpeNom ;
   private String AV48Title ;
   private String AV55FilterFullText ;
   private String AV12DynamicFiltersSelector1 ;
   private String AV15FilterOpeNomDescription ;
   private String AV18DynamicFiltersSelector2 ;
   private String AV22DynamicFiltersSelector3 ;
   private String AV38TFOpeCod_To_Description ;
   private String AV69Weboperariosds_1_filterfulltext ;
   private String AV70Weboperariosds_2_dynamicfiltersselector1 ;
   private String AV74Weboperariosds_6_dynamicfiltersselector2 ;
   private String AV78Weboperariosds_10_dynamicfiltersselector3 ;
   private String lV69Weboperariosds_1_filterfulltext ;
   private String AV45PageInfo ;
   private String AV41DateInfo ;
   private String AV59AppName ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08B32_A8482OpeAct ;
   private boolean[] P08B32_n8482OpeAct ;
   private String[] P08B32_A6869OpeNom2 ;
   private boolean[] P08B32_n6869OpeNom2 ;
   private int[] P08B32_A652OpeCod ;
   private String[] P08B32_A653OpeNom ;
   private boolean[] P08B32_n653OpeNom ;
   private String[] P08B32_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV25GridStateDynamicFilter ;
}

final  class weboperariosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Weboperariosds_1_filterfulltext ,
                                          String AV70Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV71Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV72Weboperariosds_4_openom1 ,
                                          boolean AV73Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV74Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV75Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV76Weboperariosds_8_openom2 ,
                                          boolean AV77Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV78Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV79Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV80Weboperariosds_12_openom3 ,
                                          int AV81Weboperariosds_13_tfopecod ,
                                          int AV82Weboperariosds_14_tfopecod_to ,
                                          String AV84Weboperariosds_16_tfopenom_sel ,
                                          String AV83Weboperariosds_15_tfopenom ,
                                          String AV86Weboperariosds_18_tfopenom2_sel ,
                                          String AV85Weboperariosds_17_tfopenom2 ,
                                          String AV88Weboperariosds_20_tfopeact_sel ,
                                          String AV87Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeNom2, OpeCod, OpeNom, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV69Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV70Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV71Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV72Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV70Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV71Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV72Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV73Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV74Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV75Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV76Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( AV73Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV74Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV75Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV76Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV77Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV78Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV79Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV80Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV77Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV78Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV79Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV80Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV83Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV85Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV87Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom2" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeAct" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeAct DESC" ;
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
                  return conditional_P08B32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
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
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

