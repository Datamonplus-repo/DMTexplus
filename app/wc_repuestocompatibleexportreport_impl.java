package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wc_repuestocompatibleexportreport_impl extends GXWebReport
{
   public wc_repuestocompatibleexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV34Title = httpContext.getMessage( "Lista de Table MRCom (Repuestos Compatibles)", "") ;
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
         h8VT0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV14FilterFullText)==0) )
      {
         h8VT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV20TFMRComNom_Sel)==0) )
      {
         h8VT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Compatible", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMRComNom_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFMRComNom)==0) )
         {
            h8VT0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Compatible", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFMRComNom, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFMRComCod) && (0==AV22TFMRComCod_To) ) )
      {
         h8VT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Compatible", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFMRComCod), "ZZZZZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV23TFMRComCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Compatible", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VT0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFMRComCod_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFMRComCod_To), "ZZZZZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VT0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VT0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Compatible", ""), 30, Gx_line+10, 532, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Compatible", ""), 536, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV43Wc_repuestocompatibleds_1_emprcod = AV10EmprCod ;
      AV44Wc_repuestocompatibleds_2_mrpricod = AV11MRPriCod ;
      AV45Wc_repuestocompatibleds_3_mrprinom = AV36MRPriNom ;
      AV46Wc_repuestocompatibleds_4_filterfulltext = AV14FilterFullText ;
      AV47Wc_repuestocompatibleds_5_tfmrcomnom = AV19TFMRComNom ;
      AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel = AV20TFMRComNom_Sel ;
      AV49Wc_repuestocompatibleds_7_tfmrcomcod = AV21TFMRComCod ;
      AV50Wc_repuestocompatibleds_8_tfmrcomcod_to = AV22TFMRComCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Wc_repuestocompatibleds_4_filterfulltext ,
                                           AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                           AV47Wc_repuestocompatibleds_5_tfmrcomnom ,
                                           Integer.valueOf(AV49Wc_repuestocompatibleds_7_tfmrcomcod) ,
                                           Integer.valueOf(AV50Wc_repuestocompatibleds_8_tfmrcomcod_to) ,
                                           A1064MRComNom ,
                                           Integer.valueOf(A1063MRComCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A1062MRPriNom ,
                                           AV45Wc_repuestocompatibleds_3_mrprinom ,
                                           AV43Wc_repuestocompatibleds_1_emprcod ,
                                           Integer.valueOf(AV44Wc_repuestocompatibleds_2_mrpricod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A1061MRPriCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV46Wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV46Wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV47Wc_repuestocompatibleds_5_tfmrcomnom = GXutil.padr( GXutil.rtrim( AV47Wc_repuestocompatibleds_5_tfmrcomnom), 100, "%") ;
      /* Using cursor P08VT2 */
      pr_default.execute(0, new Object[] {AV43Wc_repuestocompatibleds_1_emprcod, Integer.valueOf(AV44Wc_repuestocompatibleds_2_mrpricod), AV45Wc_repuestocompatibleds_3_mrprinom, lV46Wc_repuestocompatibleds_4_filterfulltext, lV46Wc_repuestocompatibleds_4_filterfulltext, lV47Wc_repuestocompatibleds_5_tfmrcomnom, AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel, Integer.valueOf(AV49Wc_repuestocompatibleds_7_tfmrcomcod), Integer.valueOf(AV50Wc_repuestocompatibleds_8_tfmrcomcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1063MRComCod = P08VT2_A1063MRComCod[0] ;
         A1064MRComNom = P08VT2_A1064MRComNom[0] ;
         n1064MRComNom = P08VT2_n1064MRComNom[0] ;
         A1062MRPriNom = P08VT2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VT2_n1062MRPriNom[0] ;
         A1061MRPriCod = P08VT2_A1061MRPriCod[0] ;
         A396EmprCod = P08VT2_A396EmprCod[0] ;
         A1062MRPriNom = P08VT2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VT2_n1062MRPriNom[0] ;
         A1064MRComNom = P08VT2_A1064MRComNom[0] ;
         n1064MRComNom = P08VT2_n1064MRComNom[0] ;
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
         h8VT0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1064MRComNom, "")), 30, Gx_line+10, 532, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1063MRComCod), "ZZZZZZZ9")), 536, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV15Session.getValue("WC_RepuestoCompatibleGridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WC_RepuestoCompatibleGridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV15Session.getValue("WC_RepuestoCompatibleGridState"), null, null);
      }
      AV12OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM") == 0 )
         {
            AV19TFMRComNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM_SEL") == 0 )
         {
            AV20TFMRComNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMCOD") == 0 )
         {
            AV21TFMRComCod = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFMRComCod_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRICOD") == 0 )
         {
            AV11MRPriCod = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRINOM") == 0 )
         {
            AV36MRPriNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
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

   public void h8VT0( boolean bFoot ,
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
            AV34Title = AV39Pgmdesc ;
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
      AV14FilterFullText = "" ;
      AV20TFMRComNom_Sel = "" ;
      AV19TFMRComNom = "" ;
      AV23TFMRComCod_To_Description = "" ;
      A1064MRComNom = "" ;
      AV43Wc_repuestocompatibleds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV45Wc_repuestocompatibleds_3_mrprinom = "" ;
      AV36MRPriNom = "" ;
      AV46Wc_repuestocompatibleds_4_filterfulltext = "" ;
      AV47Wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel = "" ;
      scmdbuf = "" ;
      lV46Wc_repuestocompatibleds_4_filterfulltext = "" ;
      lV47Wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      A1062MRPriNom = "" ;
      A396EmprCod = "" ;
      P08VT2_A1063MRComCod = new int[1] ;
      P08VT2_A1064MRComNom = new String[] {""} ;
      P08VT2_n1064MRComNom = new boolean[] {false} ;
      P08VT2_A1062MRPriNom = new String[] {""} ;
      P08VT2_n1062MRPriNom = new boolean[] {false} ;
      P08VT2_A1061MRPriCod = new int[1] ;
      P08VT2_A396EmprCod = new String[] {""} ;
      AV15Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32PageInfo = "" ;
      AV29DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV39Pgmdesc = "" ;
      AV27AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wc_repuestocompatibleexportreport__default(),
         new Object[] {
             new Object[] {
            P08VT2_A1063MRComCod, P08VT2_A1064MRComNom, P08VT2_n1064MRComNom, P08VT2_A1062MRPriNom, P08VT2_n1062MRPriNom, P08VT2_A1061MRPriCod, P08VT2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV39Pgmdesc = httpContext.getMessage( "Lista de repuestos compatibles", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV39Pgmdesc = httpContext.getMessage( "Lista de repuestos compatibles", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV12OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFMRComCod ;
   private int AV22TFMRComCod_To ;
   private int A1063MRComCod ;
   private int AV44Wc_repuestocompatibleds_2_mrpricod ;
   private int AV11MRPriCod ;
   private int AV49Wc_repuestocompatibleds_7_tfmrcomcod ;
   private int AV50Wc_repuestocompatibleds_8_tfmrcomcod_to ;
   private int A1061MRPriCod ;
   private int AV51GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV20TFMRComNom_Sel ;
   private String AV19TFMRComNom ;
   private String A1064MRComNom ;
   private String AV43Wc_repuestocompatibleds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV45Wc_repuestocompatibleds_3_mrprinom ;
   private String AV36MRPriNom ;
   private String AV47Wc_repuestocompatibleds_5_tfmrcomnom ;
   private String AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel ;
   private String scmdbuf ;
   private String lV47Wc_repuestocompatibleds_5_tfmrcomnom ;
   private String A1062MRPriNom ;
   private String A396EmprCod ;
   private String AV39Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private boolean n1064MRComNom ;
   private boolean n1062MRPriNom ;
   private String AV34Title ;
   private String AV14FilterFullText ;
   private String AV23TFMRComCod_To_Description ;
   private String AV46Wc_repuestocompatibleds_4_filterfulltext ;
   private String lV46Wc_repuestocompatibleds_4_filterfulltext ;
   private String AV32PageInfo ;
   private String AV29DateInfo ;
   private String AV27AppName ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08VT2_A1063MRComCod ;
   private String[] P08VT2_A1064MRComNom ;
   private boolean[] P08VT2_n1064MRComNom ;
   private String[] P08VT2_A1062MRPriNom ;
   private boolean[] P08VT2_n1062MRPriNom ;
   private int[] P08VT2_A1061MRPriCod ;
   private String[] P08VT2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
}

final  class wc_repuestocompatibleexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Wc_repuestocompatibleds_4_filterfulltext ,
                                          String AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                          String AV47Wc_repuestocompatibleds_5_tfmrcomnom ,
                                          int AV49Wc_repuestocompatibleds_7_tfmrcomcod ,
                                          int AV50Wc_repuestocompatibleds_8_tfmrcomcod_to ,
                                          String A1064MRComNom ,
                                          int A1063MRComCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A1062MRPriNom ,
                                          String AV45Wc_repuestocompatibleds_3_mrprinom ,
                                          String AV43Wc_repuestocompatibleds_1_emprcod ,
                                          int AV44Wc_repuestocompatibleds_2_mrpricod ,
                                          String A396EmprCod ,
                                          int A1061MRPriCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MRComCod AS MRComCod, T3.MRNom AS MRComNom, T2.MRNom AS MRPriNom, T1.MRPriCod AS MRPriCod, T1.EmprCod FROM ((TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRPriCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MRComCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRPriCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      if ( ! (GXutil.strcmp("", AV46Wc_repuestocompatibleds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRComCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) && ( ! (GXutil.strcmp("", AV47Wc_repuestocompatibleds_5_tfmrcomnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV49Wc_repuestocompatibleds_7_tfmrcomcod) )
      {
         addWhere(sWhereString, "(T1.MRComCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV50Wc_repuestocompatibleds_8_tfmrcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MRComCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T3.MRNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T1.MRComCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T1.MRComCod DESC" ;
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
                  return conditional_P08VT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

