package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class bcprodexportreport_impl extends GXWebReport
{
   public bcprodexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV51Title = httpContext.getMessage( "Lista de Mantenimiento de Productos Quimicos", "") ;
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
         h7ZO0( true, 0) ;
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
      if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV12DynamicFiltersSelector1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV12DynamicFiltersSelector1, "PRDNOM") == 0 )
         {
            AV13DynamicFiltersOperator1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV14PrdNom1 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            if ( ! (GXutil.strcmp("", AV14PrdNom1)==0) )
            {
               if ( AV13DynamicFiltersOperator1 == 0 )
               {
                  AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
               }
               else if ( AV13DynamicFiltersOperator1 == 1 )
               {
                  AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
               }
               AV16PrdNom = AV14PrdNom1 ;
               h7ZO0( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterPrdNomDescription, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdNom, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
         }
         if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV17DynamicFiltersEnabled2 = true ;
            AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV18DynamicFiltersSelector2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV18DynamicFiltersSelector2, "PRDNOM") == 0 )
            {
               AV19DynamicFiltersOperator2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV20PrdNom2 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               if ( ! (GXutil.strcmp("", AV20PrdNom2)==0) )
               {
                  if ( AV19DynamicFiltersOperator2 == 0 )
                  {
                     AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
                  }
                  else if ( AV19DynamicFiltersOperator2 == 1 )
                  {
                     AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
                  }
                  AV16PrdNom = AV20PrdNom2 ;
                  h7ZO0( false, 20) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterPrdNomDescription, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdNom, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
            }
            if ( AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV21DynamicFiltersEnabled3 = true ;
               AV25GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV28GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV22DynamicFiltersSelector3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV22DynamicFiltersSelector3, "PRDNOM") == 0 )
               {
                  AV23DynamicFiltersOperator3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV24PrdNom3 = AV25GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  if ( ! (GXutil.strcmp("", AV24PrdNom3)==0) )
                  {
                     if ( AV23DynamicFiltersOperator3 == 0 )
                     {
                        AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") ;
                     }
                     else if ( AV23DynamicFiltersOperator3 == 1 )
                     {
                        AV15FilterPrdNomDescription = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descripcion", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") ;
                     }
                     AV16PrdNom = AV24PrdNom3 ;
                     h7ZO0( false, 20) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterPrdNomDescription, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdNom, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                  }
               }
            }
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFPrdNum_Sel)==0) )
      {
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ProductoID", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrdNum_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFPrdNum)==0) )
         {
            h7ZO0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ProductoID", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFPrdNum, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFPrdNom_Sel)==0) )
      {
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFPrdNom_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFPrdNom)==0) )
         {
            h7ZO0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFPrdNom, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFPrdPreAct_To)==0) ) )
      {
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFPrdPreAct, "ZZZZZZZ9.999")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFPrdPreAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrdPreAct_To_Description, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFPrdPreAct_To, "ZZZZZZZ9.999")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFPrdUcpDsc_Sel)==0) )
      {
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFPrdUcpDsc_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFPrdUcpDsc)==0) )
         {
            h7ZO0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrdUcpDsc, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFPrvNif_Sel)==0) )
      {
         h7ZO0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrvNif_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFPrvNif)==0) )
         {
            h7ZO0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrvNif, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h7ZO0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 140, 43, 44, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h7ZO0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 140, 43, 44, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ProductoID", ""), 30, Gx_line+10, 135, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 139, Gx_line+10, 351, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 355, Gx_line+10, 461, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 465, Gx_line+10, 571, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.", ""), 575, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV59Core_bcprodds_1_dynamicfiltersselector1 = AV12DynamicFiltersSelector1 ;
      AV60Core_bcprodds_2_dynamicfiltersoperator1 = AV13DynamicFiltersOperator1 ;
      AV61Core_bcprodds_3_prdnom1 = AV14PrdNom1 ;
      AV62Core_bcprodds_4_dynamicfiltersenabled2 = AV17DynamicFiltersEnabled2 ;
      AV63Core_bcprodds_5_dynamicfiltersselector2 = AV18DynamicFiltersSelector2 ;
      AV64Core_bcprodds_6_dynamicfiltersoperator2 = AV19DynamicFiltersOperator2 ;
      AV65Core_bcprodds_7_prdnom2 = AV20PrdNom2 ;
      AV66Core_bcprodds_8_dynamicfiltersenabled3 = AV21DynamicFiltersEnabled3 ;
      AV67Core_bcprodds_9_dynamicfiltersselector3 = AV22DynamicFiltersSelector3 ;
      AV68Core_bcprodds_10_dynamicfiltersoperator3 = AV23DynamicFiltersOperator3 ;
      AV69Core_bcprodds_11_prdnom3 = AV24PrdNom3 ;
      AV70Core_bcprodds_12_tfprdnum = AV30TFPrdNum ;
      AV71Core_bcprodds_13_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV72Core_bcprodds_14_tfprdnom = AV32TFPrdNom ;
      AV73Core_bcprodds_15_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV74Core_bcprodds_16_tfprdpreact = AV34TFPrdPreAct ;
      AV75Core_bcprodds_17_tfprdpreact_to = AV35TFPrdPreAct_To ;
      AV76Core_bcprodds_18_tfprducpdsc = AV36TFPrdUcpDsc ;
      AV77Core_bcprodds_19_tfprducpdsc_sel = AV37TFPrdUcpDsc_Sel ;
      AV78Core_bcprodds_20_tfprvnif = AV38TFPrvNif ;
      AV79Core_bcprodds_21_tfprvnif_sel = AV39TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Core_bcprodds_1_dynamicfiltersselector1 ,
                                           Short.valueOf(AV60Core_bcprodds_2_dynamicfiltersoperator1) ,
                                           AV61Core_bcprodds_3_prdnom1 ,
                                           Boolean.valueOf(AV62Core_bcprodds_4_dynamicfiltersenabled2) ,
                                           AV63Core_bcprodds_5_dynamicfiltersselector2 ,
                                           Short.valueOf(AV64Core_bcprodds_6_dynamicfiltersoperator2) ,
                                           AV65Core_bcprodds_7_prdnom2 ,
                                           Boolean.valueOf(AV66Core_bcprodds_8_dynamicfiltersenabled3) ,
                                           AV67Core_bcprodds_9_dynamicfiltersselector3 ,
                                           Short.valueOf(AV68Core_bcprodds_10_dynamicfiltersoperator3) ,
                                           AV69Core_bcprodds_11_prdnom3 ,
                                           AV71Core_bcprodds_13_tfprdnum_sel ,
                                           AV70Core_bcprodds_12_tfprdnum ,
                                           AV73Core_bcprodds_15_tfprdnom_sel ,
                                           AV72Core_bcprodds_14_tfprdnom ,
                                           AV74Core_bcprodds_16_tfprdpreact ,
                                           AV75Core_bcprodds_17_tfprdpreact_to ,
                                           AV77Core_bcprodds_19_tfprducpdsc_sel ,
                                           AV76Core_bcprodds_18_tfprducpdsc ,
                                           AV79Core_bcprodds_21_tfprvnif_sel ,
                                           AV78Core_bcprodds_20_tfprvnif ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A724PrdPreAct ,
                                           A737PrdUcpDsc ,
                                           A793PrvNif ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           A3936PrdEqLP ,
                                           AV53EmprCod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV61Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV61Core_bcprodds_3_prdnom1), 26, "%") ;
      lV61Core_bcprodds_3_prdnom1 = GXutil.padr( GXutil.rtrim( AV61Core_bcprodds_3_prdnom1), 26, "%") ;
      lV65Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_7_prdnom2), 26, "%") ;
      lV65Core_bcprodds_7_prdnom2 = GXutil.padr( GXutil.rtrim( AV65Core_bcprodds_7_prdnom2), 26, "%") ;
      lV69Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV69Core_bcprodds_11_prdnom3), 26, "%") ;
      lV69Core_bcprodds_11_prdnom3 = GXutil.padr( GXutil.rtrim( AV69Core_bcprodds_11_prdnom3), 26, "%") ;
      lV70Core_bcprodds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Core_bcprodds_12_tfprdnum), 6, "%") ;
      lV72Core_bcprodds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Core_bcprodds_14_tfprdnom), 26, "%") ;
      lV76Core_bcprodds_18_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV76Core_bcprodds_18_tfprducpdsc), 8, "%") ;
      lV78Core_bcprodds_20_tfprvnif = GXutil.padr( GXutil.rtrim( AV78Core_bcprodds_20_tfprvnif), 20, "%") ;
      /* Using cursor P07ZO2 */
      pr_default.execute(0, new Object[] {AV53EmprCod, lV61Core_bcprodds_3_prdnom1, lV61Core_bcprodds_3_prdnom1, lV65Core_bcprodds_7_prdnom2, lV65Core_bcprodds_7_prdnom2, lV69Core_bcprodds_11_prdnom3, lV69Core_bcprodds_11_prdnom3, lV70Core_bcprodds_12_tfprdnum, AV71Core_bcprodds_13_tfprdnum_sel, lV72Core_bcprodds_14_tfprdnom, AV73Core_bcprodds_15_tfprdnom_sel, AV74Core_bcprodds_16_tfprdpreact, AV75Core_bcprodds_17_tfprdpreact_to, lV76Core_bcprodds_18_tfprducpdsc, AV77Core_bcprodds_19_tfprducpdsc_sel, lV78Core_bcprodds_20_tfprvnif, AV79Core_bcprodds_21_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P07ZO2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZO2_A742PrdUniCom[0] ;
         A3936PrdEqLP = P07ZO2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZO2_A856ValCod[0] ;
         A396EmprCod = P07ZO2_A396EmprCod[0] ;
         A793PrvNif = P07ZO2_A793PrvNif[0] ;
         n793PrvNif = P07ZO2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZO2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZO2_n737PrdUcpDsc[0] ;
         A724PrdPreAct = P07ZO2_A724PrdPreAct[0] ;
         A719PrdNum = P07ZO2_A719PrdNum[0] ;
         A718PrdNom = P07ZO2_A718PrdNom[0] ;
         A793PrvNif = P07ZO2_A793PrvNif[0] ;
         n793PrvNif = P07ZO2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZO2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZO2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
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
            h7ZO0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 135, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 139, Gx_line+10, 351, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 355, Gx_line+10, 461, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), 465, Gx_line+10, 571, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 575, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue("BCPRODGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "BCPRODGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("BCPRODGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV30TFPrdNum = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV31TFPrdNum_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV32TFPrdNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV33TFPrdNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV34TFPrdPreAct = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFPrdPreAct_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV36TFPrdUcpDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV37TFPrdUcpDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV38TFPrvNif = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV39TFPrvNif_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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

   public void h7ZO0( boolean bFoot ,
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
               AV49PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV46DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 140, 43, 44, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV44AppName = httpContext.getMessage( "DVelop Software Solutions", "") ;
            AV50Phone = "+1 550 8923" ;
            AV48Mail = "info@mail.com" ;
            AV52Website = "http://www.web.com" ;
            AV41AddressLine1 = "French Boulevard 2859" ;
            AV42AddressLine2 = "Downtown" ;
            AV43AddressLine3 = "Paris, France" ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 140, 43, 44, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44AppName, "")), 30, Gx_line+30, 283, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Title, "")), 30, Gx_line+45, 283, Gx_line+78, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Phone, "")), 283, Gx_line+30, 536, Gx_line+46, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Mail, "")), 283, Gx_line+46, 536, Gx_line+62, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Website, "")), 283, Gx_line+62, 536, Gx_line+78, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AddressLine1, "")), 536, Gx_line+30, 789, Gx_line+46, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42AddressLine2, "")), 536, Gx_line+46, 789, Gx_line+62, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43AddressLine3, "")), 536, Gx_line+62, 789, Gx_line+78, 2, 0, 0, 0) ;
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
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV12DynamicFiltersSelector1 = "" ;
      AV14PrdNom1 = "" ;
      AV15FilterPrdNomDescription = "" ;
      AV16PrdNom = "" ;
      AV18DynamicFiltersSelector2 = "" ;
      AV20PrdNom2 = "" ;
      AV22DynamicFiltersSelector3 = "" ;
      AV24PrdNom3 = "" ;
      AV31TFPrdNum_Sel = "" ;
      AV30TFPrdNum = "" ;
      AV33TFPrdNom_Sel = "" ;
      AV32TFPrdNom = "" ;
      AV34TFPrdPreAct = DecimalUtil.ZERO ;
      AV35TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV40TFPrdPreAct_To_Description = "" ;
      AV37TFPrdUcpDsc_Sel = "" ;
      AV36TFPrdUcpDsc = "" ;
      AV39TFPrvNif_Sel = "" ;
      AV38TFPrvNif = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A793PrvNif = "" ;
      AV59Core_bcprodds_1_dynamicfiltersselector1 = "" ;
      AV61Core_bcprodds_3_prdnom1 = "" ;
      AV63Core_bcprodds_5_dynamicfiltersselector2 = "" ;
      AV65Core_bcprodds_7_prdnom2 = "" ;
      AV67Core_bcprodds_9_dynamicfiltersselector3 = "" ;
      AV69Core_bcprodds_11_prdnom3 = "" ;
      AV70Core_bcprodds_12_tfprdnum = "" ;
      AV71Core_bcprodds_13_tfprdnum_sel = "" ;
      AV72Core_bcprodds_14_tfprdnom = "" ;
      AV73Core_bcprodds_15_tfprdnom_sel = "" ;
      AV74Core_bcprodds_16_tfprdpreact = DecimalUtil.ZERO ;
      AV75Core_bcprodds_17_tfprdpreact_to = DecimalUtil.ZERO ;
      AV76Core_bcprodds_18_tfprducpdsc = "" ;
      AV77Core_bcprodds_19_tfprducpdsc_sel = "" ;
      AV78Core_bcprodds_20_tfprvnif = "" ;
      AV79Core_bcprodds_21_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV61Core_bcprodds_3_prdnom1 = "" ;
      lV65Core_bcprodds_7_prdnom2 = "" ;
      lV69Core_bcprodds_11_prdnom3 = "" ;
      lV70Core_bcprodds_12_tfprdnum = "" ;
      lV72Core_bcprodds_14_tfprdnom = "" ;
      lV76Core_bcprodds_18_tfprducpdsc = "" ;
      lV78Core_bcprodds_20_tfprvnif = "" ;
      A3936PrdEqLP = "" ;
      AV53EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZO2_A795PrvNum = new int[1] ;
      P07ZO2_A742PrdUniCom = new byte[1] ;
      P07ZO2_A3936PrdEqLP = new String[] {""} ;
      P07ZO2_A856ValCod = new byte[1] ;
      P07ZO2_A396EmprCod = new String[] {""} ;
      P07ZO2_A793PrvNif = new String[] {""} ;
      P07ZO2_n793PrvNif = new boolean[] {false} ;
      P07ZO2_A737PrdUcpDsc = new String[] {""} ;
      P07ZO2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZO2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZO2_A719PrdNum = new String[] {""} ;
      P07ZO2_A718PrdNom = new String[] {""} ;
      AV26Session = httpContext.getWebSession();
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49PageInfo = "" ;
      AV46DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV44AppName = "" ;
      AV50Phone = "" ;
      AV48Mail = "" ;
      AV52Website = "" ;
      AV41AddressLine1 = "" ;
      AV42AddressLine2 = "" ;
      AV43AddressLine3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.bcprodexportreport__default(),
         new Object[] {
             new Object[] {
            P07ZO2_A795PrvNum, P07ZO2_A742PrdUniCom, P07ZO2_A3936PrdEqLP, P07ZO2_A856ValCod, P07ZO2_A396EmprCod, P07ZO2_A793PrvNif, P07ZO2_n793PrvNif, P07ZO2_A737PrdUcpDsc, P07ZO2_n737PrdUcpDsc, P07ZO2_A724PrdPreAct,
            P07ZO2_A719PrdNum, P07ZO2_A718PrdNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short gxcookieaux ;
   private short AV13DynamicFiltersOperator1 ;
   private short AV19DynamicFiltersOperator2 ;
   private short AV23DynamicFiltersOperator3 ;
   private short AV60Core_bcprodds_2_dynamicfiltersoperator1 ;
   private short AV64Core_bcprodds_6_dynamicfiltersoperator2 ;
   private short AV68Core_bcprodds_10_dynamicfiltersoperator3 ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A795PrvNum ;
   private int AV80GXV1 ;
   private java.math.BigDecimal AV34TFPrdPreAct ;
   private java.math.BigDecimal AV35TFPrdPreAct_To ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV74Core_bcprodds_16_tfprdpreact ;
   private java.math.BigDecimal AV75Core_bcprodds_17_tfprdpreact_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV14PrdNom1 ;
   private String AV16PrdNom ;
   private String AV20PrdNom2 ;
   private String AV24PrdNom3 ;
   private String AV31TFPrdNum_Sel ;
   private String AV30TFPrdNum ;
   private String AV33TFPrdNom_Sel ;
   private String AV32TFPrdNom ;
   private String AV37TFPrdUcpDsc_Sel ;
   private String AV36TFPrdUcpDsc ;
   private String AV39TFPrvNif_Sel ;
   private String AV38TFPrvNif ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String AV61Core_bcprodds_3_prdnom1 ;
   private String AV65Core_bcprodds_7_prdnom2 ;
   private String AV69Core_bcprodds_11_prdnom3 ;
   private String AV70Core_bcprodds_12_tfprdnum ;
   private String AV71Core_bcprodds_13_tfprdnum_sel ;
   private String AV72Core_bcprodds_14_tfprdnom ;
   private String AV73Core_bcprodds_15_tfprdnom_sel ;
   private String AV76Core_bcprodds_18_tfprducpdsc ;
   private String AV77Core_bcprodds_19_tfprducpdsc_sel ;
   private String AV78Core_bcprodds_20_tfprvnif ;
   private String AV79Core_bcprodds_21_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV61Core_bcprodds_3_prdnom1 ;
   private String lV65Core_bcprodds_7_prdnom2 ;
   private String lV69Core_bcprodds_11_prdnom3 ;
   private String lV70Core_bcprodds_12_tfprdnum ;
   private String lV72Core_bcprodds_14_tfprdnom ;
   private String lV76Core_bcprodds_18_tfprducpdsc ;
   private String lV78Core_bcprodds_20_tfprvnif ;
   private String A3936PrdEqLP ;
   private String AV53EmprCod ;
   private String A396EmprCod ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17DynamicFiltersEnabled2 ;
   private boolean AV21DynamicFiltersEnabled3 ;
   private boolean AV62Core_bcprodds_4_dynamicfiltersenabled2 ;
   private boolean AV66Core_bcprodds_8_dynamicfiltersenabled3 ;
   private boolean AV11OrderedDsc ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private String AV51Title ;
   private String AV12DynamicFiltersSelector1 ;
   private String AV15FilterPrdNomDescription ;
   private String AV18DynamicFiltersSelector2 ;
   private String AV22DynamicFiltersSelector3 ;
   private String AV40TFPrdPreAct_To_Description ;
   private String AV59Core_bcprodds_1_dynamicfiltersselector1 ;
   private String AV63Core_bcprodds_5_dynamicfiltersselector2 ;
   private String AV67Core_bcprodds_9_dynamicfiltersselector3 ;
   private String AV49PageInfo ;
   private String AV46DateInfo ;
   private String AV44AppName ;
   private String AV50Phone ;
   private String AV48Mail ;
   private String AV52Website ;
   private String AV41AddressLine1 ;
   private String AV42AddressLine2 ;
   private String AV43AddressLine3 ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZO2_A795PrvNum ;
   private byte[] P07ZO2_A742PrdUniCom ;
   private String[] P07ZO2_A3936PrdEqLP ;
   private byte[] P07ZO2_A856ValCod ;
   private String[] P07ZO2_A396EmprCod ;
   private String[] P07ZO2_A793PrvNif ;
   private boolean[] P07ZO2_n793PrvNif ;
   private String[] P07ZO2_A737PrdUcpDsc ;
   private boolean[] P07ZO2_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P07ZO2_A724PrdPreAct ;
   private String[] P07ZO2_A719PrdNum ;
   private String[] P07ZO2_A718PrdNom ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV25GridStateDynamicFilter ;
}

final  class bcprodexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Core_bcprodds_1_dynamicfiltersselector1 ,
                                          short AV60Core_bcprodds_2_dynamicfiltersoperator1 ,
                                          String AV61Core_bcprodds_3_prdnom1 ,
                                          boolean AV62Core_bcprodds_4_dynamicfiltersenabled2 ,
                                          String AV63Core_bcprodds_5_dynamicfiltersselector2 ,
                                          short AV64Core_bcprodds_6_dynamicfiltersoperator2 ,
                                          String AV65Core_bcprodds_7_prdnom2 ,
                                          boolean AV66Core_bcprodds_8_dynamicfiltersenabled3 ,
                                          String AV67Core_bcprodds_9_dynamicfiltersselector3 ,
                                          short AV68Core_bcprodds_10_dynamicfiltersoperator3 ,
                                          String AV69Core_bcprodds_11_prdnom3 ,
                                          String AV71Core_bcprodds_13_tfprdnum_sel ,
                                          String AV70Core_bcprodds_12_tfprdnum ,
                                          String AV73Core_bcprodds_15_tfprdnom_sel ,
                                          String AV72Core_bcprodds_14_tfprdnom ,
                                          java.math.BigDecimal AV74Core_bcprodds_16_tfprdpreact ,
                                          java.math.BigDecimal AV75Core_bcprodds_17_tfprdpreact_to ,
                                          String AV77Core_bcprodds_19_tfprducpdsc_sel ,
                                          String AV76Core_bcprodds_18_tfprducpdsc ,
                                          String AV79Core_bcprodds_21_tfprvnif_sel ,
                                          String AV78Core_bcprodds_20_tfprvnif ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A737PrdUcpDsc ,
                                          String A793PrvNif ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String A3936PrdEqLP ,
                                          String AV53EmprCod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.PrdEqLP, T1.ValCod, T1.EmprCod, T2.PrvNif, T3.UniDsc AS PrdUcpDsc, T1.PrdPreAct, T1.PrdNum, T1.PrdNom FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod = 1)");
      if ( ( GXutil.strcmp(AV59Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV60Core_bcprodds_2_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV61Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV59Core_bcprodds_1_dynamicfiltersselector1, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV60Core_bcprodds_2_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV61Core_bcprodds_3_prdnom1)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( AV62Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV63Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV64Core_bcprodds_6_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV62Core_bcprodds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV63Core_bcprodds_5_dynamicfiltersselector2, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV64Core_bcprodds_6_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV65Core_bcprodds_7_prdnom2)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV66Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV67Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV68Core_bcprodds_10_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV69Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV66Core_bcprodds_8_dynamicfiltersenabled3 && ( GXutil.strcmp(AV67Core_bcprodds_9_dynamicfiltersselector3, httpContext.getMessage( "PRDNOM", "")) == 0 ) && ( AV68Core_bcprodds_10_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV69Core_bcprodds_11_prdnom3)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Core_bcprodds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Core_bcprodds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Core_bcprodds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Core_bcprodds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Core_bcprodds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNom like ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Core_bcprodds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Core_bcprodds_16_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Core_bcprodds_17_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Core_bcprodds_19_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Core_bcprodds_18_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(T3.UniDsc like ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Core_bcprodds_19_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Core_bcprodds_21_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV78Core_bcprodds_20_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrvNif like ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Core_bcprodds_21_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
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
                  return conditional_P07ZO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Boolean) dynConstraints[3]).booleanValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
      }
   }

}

