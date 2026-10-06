package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordcowwexportreport_impl extends GXWebReport
{
   public tmordcowwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV52Title = httpContext.getMessage( "Lista de Control de Ordenes de Mantto", "") ;
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
         h8XQ0( true, 0) ;
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
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFOMCod) && (0==AV23TFOMCod_To) ) )
      {
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod de Orden de Mantto", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFOMCod), "ZZZZZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFOMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod de Orden de Mantto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFOMCod_To_Description, "")), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFOMCod_To), "ZZZZZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV24TFOMOpeCod) && (0==AV25TFOMOpeCod_To) ) )
      {
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Operario Mantenimiento", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFOMOpeCod), "ZZZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFOMOpeCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Operario Mantenimiento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFOMOpeCod_To_Description, "")), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFOMOpeCod_To), "ZZZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFOMOpeNom_Sel)==0) )
      {
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Operario", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFOMOpeNom_Sel, "")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFOMOpeNom)==0) )
         {
            h8XQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Operario", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFOMOpeNom, "")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV30TFOMMTpo_Sels.fromJSonString(AV28TFOMMTpo_SelsJson, null);
      if ( ! ( AV30TFOMMTpo_Sels.size() == 0 ) )
      {
         AV41i = 1 ;
         AV59GXV1 = 1 ;
         while ( AV59GXV1 <= AV30TFOMMTpo_Sels.size() )
         {
            AV31TFOMMTpo_Sel = (String)AV30TFOMMTpo_Sels.elementAt(-1+AV59GXV1) ;
            if ( AV41i == 1 )
            {
               AV29TFOMMTpo_SelDscs = "" ;
            }
            else
            {
               AV29TFOMMTpo_SelDscs += ", " ;
            }
            AV38FilterTFOMMTpo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV31TFOMMTpo_Sel), "R") == 0 )
            {
               AV38FilterTFOMMTpo_SelValueDescription = httpContext.getMessage( "Reserva", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV31TFOMMTpo_Sel), "C") == 0 )
            {
               AV38FilterTFOMMTpo_SelValueDescription = httpContext.getMessage( "Consumo", "") ;
            }
            AV29TFOMMTpo_SelDscs += AV38FilterTFOMMTpo_SelValueDescription ;
            AV41i = (long)(AV41i+1) ;
            AV59GXV1 = (int)(AV59GXV1+1) ;
         }
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Línea", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFOMMTpo_SelDscs, "")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFOMMCCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFOMMCCnt_To)==0) ) )
      {
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Consumo", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFOMMCCnt, "ZZ,ZZZ,ZZ9.999")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFOMMCCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Consumo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFOMMCCnt_To_Description, "")), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFOMMCCnt_To, "ZZ,ZZZ,ZZ9.999")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV34TFOMMCUlt) && (0==AV35TFOMMCUlt_To) ) )
      {
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Control", ""), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFOMMCUlt), "ZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFOMMCUlt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Control", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8XQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFOMMCUlt_To_Description, "")), 25, Gx_line+0, 192, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFOMMCUlt_To), "ZZZ9")), 192, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8XQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8XQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod de Orden de Mantto", ""), 30, Gx_line+10, 122, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario Mantenimiento", ""), 126, Gx_line+10, 218, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Operario", ""), 222, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Línea", ""), 410, Gx_line+10, 594, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Consumo", ""), 598, Gx_line+10, 690, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Control", ""), 694, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV61Tmordcowwds_1_filterfulltext = AV12FilterFullText ;
      AV62Tmordcowwds_2_tfomcod = AV22TFOMCod ;
      AV63Tmordcowwds_3_tfomcod_to = AV23TFOMCod_To ;
      AV64Tmordcowwds_4_tfomopecod = AV24TFOMOpeCod ;
      AV65Tmordcowwds_5_tfomopecod_to = AV25TFOMOpeCod_To ;
      AV66Tmordcowwds_6_tfomopenom = AV26TFOMOpeNom ;
      AV67Tmordcowwds_7_tfomopenom_sel = AV27TFOMOpeNom_Sel ;
      AV68Tmordcowwds_8_tfommtpo_sels = AV30TFOMMTpo_Sels ;
      AV69Tmordcowwds_9_tfommccnt = AV32TFOMMCCnt ;
      AV70Tmordcowwds_10_tfommccnt_to = AV33TFOMMCCnt_To ;
      AV71Tmordcowwds_11_tfommcult = AV34TFOMMCUlt ;
      AV72Tmordcowwds_12_tfommcult_to = AV35TFOMMCUlt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9458OMMTpo ,
                                           AV68Tmordcowwds_8_tfommtpo_sels ,
                                           Integer.valueOf(AV62Tmordcowwds_2_tfomcod) ,
                                           Integer.valueOf(AV63Tmordcowwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV64Tmordcowwds_4_tfomopecod) ,
                                           Integer.valueOf(AV65Tmordcowwds_5_tfomopecod_to) ,
                                           AV67Tmordcowwds_7_tfomopenom_sel ,
                                           AV66Tmordcowwds_6_tfomopenom ,
                                           Integer.valueOf(AV68Tmordcowwds_8_tfommtpo_sels.size()) ,
                                           AV69Tmordcowwds_9_tfommccnt ,
                                           AV70Tmordcowwds_10_tfommccnt_to ,
                                           Short.valueOf(AV71Tmordcowwds_11_tfommcult) ,
                                           Short.valueOf(AV72Tmordcowwds_12_tfommcult_to) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9455OMOpeCod) ,
                                           A9456OMOpeNom ,
                                           A9461OMMCCnt ,
                                           Short.valueOf(A9465OMMCUlt) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV61Tmordcowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV66Tmordcowwds_6_tfomopenom = GXutil.padr( GXutil.rtrim( AV66Tmordcowwds_6_tfomopenom), 30, "%") ;
      /* Using cursor P08XQ2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV62Tmordcowwds_2_tfomcod), Integer.valueOf(AV63Tmordcowwds_3_tfomcod_to), Integer.valueOf(AV64Tmordcowwds_4_tfomopecod), Integer.valueOf(AV65Tmordcowwds_5_tfomopecod_to), lV66Tmordcowwds_6_tfomopenom, AV67Tmordcowwds_7_tfomopenom_sel, AV69Tmordcowwds_9_tfommccnt, AV70Tmordcowwds_10_tfommccnt_to, Short.valueOf(AV71Tmordcowwds_11_tfommcult), Short.valueOf(AV72Tmordcowwds_12_tfommcult_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08XQ2_A396EmprCod[0] ;
         A9465OMMCUlt = P08XQ2_A9465OMMCUlt[0] ;
         n9465OMMCUlt = P08XQ2_n9465OMMCUlt[0] ;
         A9461OMMCCnt = P08XQ2_A9461OMMCCnt[0] ;
         A9456OMOpeNom = P08XQ2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XQ2_n9456OMOpeNom[0] ;
         A9455OMOpeCod = P08XQ2_A9455OMOpeCod[0] ;
         A9425OMCod = P08XQ2_A9425OMCod[0] ;
         A9458OMMTpo = P08XQ2_A9458OMMTpo[0] ;
         A9456OMOpeNom = P08XQ2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XQ2_n9456OMOpeNom[0] ;
         if ( (GXutil.strcmp("", AV61Tmordcowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV61Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9455OMOpeCod, 6, 0) , GXutil.padr( "%" + AV61Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9456OMOpeNom) , GXutil.padr( "%" + GXutil.upper( AV61Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "reserva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV61Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "consumo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV61Tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A9461OMMCCnt, 12, 3) , GXutil.padr( "%" + AV61Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9465OMMCUlt, 4, 0) , GXutil.padr( "%" + AV61Tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV13OMMTpoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), "R") == 0 )
            {
               AV13OMMTpoDescription = httpContext.getMessage( "Reserva", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9458OMMTpo), "C") == 0 )
            {
               AV13OMMTpoDescription = httpContext.getMessage( "Consumo", "") ;
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
            h8XQ0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 30, Gx_line+10, 122, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 126, Gx_line+10, 218, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 222, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13OMMTpoDescription, "")), 410, Gx_line+10, 594, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999")), 598, Gx_line+10, 690, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9465OMMCUlt), "ZZZ9")), 694, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("TMOrdCoWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMOrdCoWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("TMOrdCoWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV2 = 1 ;
      while ( AV73GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV22TFOMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFOMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPECOD") == 0 )
         {
            AV24TFOMOpeCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFOMOpeCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM") == 0 )
         {
            AV26TFOMOpeNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM_SEL") == 0 )
         {
            AV27TFOMOpeNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMTPO_SEL") == 0 )
         {
            AV28TFOMMTpo_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV30TFOMMTpo_Sels.fromJSonString(AV28TFOMMTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCNT") == 0 )
         {
            AV32TFOMMCCnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFOMMCCnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCULT") == 0 )
         {
            AV34TFOMMCUlt = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFOMMCUlt_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV73GXV2 = (int)(AV73GXV2+1) ;
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

   public void h8XQ0( boolean bFoot ,
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
               AV50PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV47DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV52Title = AV56Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV52Title = "" ;
      AV12FilterFullText = "" ;
      AV36TFOMCod_To_Description = "" ;
      AV37TFOMOpeCod_To_Description = "" ;
      AV27TFOMOpeNom_Sel = "" ;
      AV26TFOMOpeNom = "" ;
      AV30TFOMMTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28TFOMMTpo_SelsJson = "" ;
      AV31TFOMMTpo_Sel = "" ;
      AV29TFOMMTpo_SelDscs = "" ;
      AV38FilterTFOMMTpo_SelValueDescription = "" ;
      AV32TFOMMCCnt = DecimalUtil.ZERO ;
      AV33TFOMMCCnt_To = DecimalUtil.ZERO ;
      AV39TFOMMCCnt_To_Description = "" ;
      AV40TFOMMCUlt_To_Description = "" ;
      A9458OMMTpo = "" ;
      A9456OMOpeNom = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      AV61Tmordcowwds_1_filterfulltext = "" ;
      AV66Tmordcowwds_6_tfomopenom = "" ;
      AV67Tmordcowwds_7_tfomopenom_sel = "" ;
      AV68Tmordcowwds_8_tfommtpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69Tmordcowwds_9_tfommccnt = DecimalUtil.ZERO ;
      AV70Tmordcowwds_10_tfommccnt_to = DecimalUtil.ZERO ;
      lV61Tmordcowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV66Tmordcowwds_6_tfomopenom = "" ;
      P08XQ2_A396EmprCod = new String[] {""} ;
      P08XQ2_A9465OMMCUlt = new short[1] ;
      P08XQ2_n9465OMMCUlt = new boolean[] {false} ;
      P08XQ2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XQ2_A9456OMOpeNom = new String[] {""} ;
      P08XQ2_n9456OMOpeNom = new boolean[] {false} ;
      P08XQ2_A9455OMOpeCod = new int[1] ;
      P08XQ2_A9425OMCod = new int[1] ;
      P08XQ2_A9458OMMTpo = new String[] {""} ;
      A396EmprCod = "" ;
      AV13OMMTpoDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50PageInfo = "" ;
      AV47DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV56Pgmdesc = "" ;
      AV45AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordcowwexportreport__default(),
         new Object[] {
             new Object[] {
            P08XQ2_A396EmprCod, P08XQ2_A9465OMMCUlt, P08XQ2_n9465OMMCUlt, P08XQ2_A9461OMMCCnt, P08XQ2_A9456OMOpeNom, P08XQ2_n9456OMOpeNom, P08XQ2_A9455OMOpeCod, P08XQ2_A9425OMCod, P08XQ2_A9458OMMTpo
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "TMOrd Co WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "TMOrd Co WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV34TFOMMCUlt ;
   private short AV35TFOMMCUlt_To ;
   private short A9465OMMCUlt ;
   private short AV71Tmordcowwds_11_tfommcult ;
   private short AV72Tmordcowwds_12_tfommcult_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV22TFOMCod ;
   private int AV23TFOMCod_To ;
   private int AV24TFOMOpeCod ;
   private int AV25TFOMOpeCod_To ;
   private int AV59GXV1 ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV62Tmordcowwds_2_tfomcod ;
   private int AV63Tmordcowwds_3_tfomcod_to ;
   private int AV64Tmordcowwds_4_tfomopecod ;
   private int AV65Tmordcowwds_5_tfomopecod_to ;
   private int AV68Tmordcowwds_8_tfommtpo_sels_size ;
   private int AV73GXV2 ;
   private long AV41i ;
   private java.math.BigDecimal AV32TFOMMCCnt ;
   private java.math.BigDecimal AV33TFOMMCCnt_To ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal AV69Tmordcowwds_9_tfommccnt ;
   private java.math.BigDecimal AV70Tmordcowwds_10_tfommccnt_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV27TFOMOpeNom_Sel ;
   private String AV26TFOMOpeNom ;
   private String AV31TFOMMTpo_Sel ;
   private String A9458OMMTpo ;
   private String A9456OMOpeNom ;
   private String AV66Tmordcowwds_6_tfomopenom ;
   private String AV67Tmordcowwds_7_tfomopenom_sel ;
   private String scmdbuf ;
   private String lV66Tmordcowwds_6_tfomopenom ;
   private String A396EmprCod ;
   private String AV56Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9465OMMCUlt ;
   private boolean n9456OMOpeNom ;
   private String AV28TFOMMTpo_SelsJson ;
   private String AV52Title ;
   private String AV12FilterFullText ;
   private String AV36TFOMCod_To_Description ;
   private String AV37TFOMOpeCod_To_Description ;
   private String AV29TFOMMTpo_SelDscs ;
   private String AV38FilterTFOMMTpo_SelValueDescription ;
   private String AV39TFOMMCCnt_To_Description ;
   private String AV40TFOMMCUlt_To_Description ;
   private String AV61Tmordcowwds_1_filterfulltext ;
   private String lV61Tmordcowwds_1_filterfulltext ;
   private String AV13OMMTpoDescription ;
   private String AV50PageInfo ;
   private String AV47DateInfo ;
   private String AV45AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08XQ2_A396EmprCod ;
   private short[] P08XQ2_A9465OMMCUlt ;
   private boolean[] P08XQ2_n9465OMMCUlt ;
   private java.math.BigDecimal[] P08XQ2_A9461OMMCCnt ;
   private String[] P08XQ2_A9456OMOpeNom ;
   private boolean[] P08XQ2_n9456OMOpeNom ;
   private int[] P08XQ2_A9455OMOpeCod ;
   private int[] P08XQ2_A9425OMCod ;
   private String[] P08XQ2_A9458OMMTpo ;
   private GXSimpleCollection<String> AV30TFOMMTpo_Sels ;
   private GXSimpleCollection<String> AV68Tmordcowwds_8_tfommtpo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tmordcowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9458OMMTpo ,
                                          GXSimpleCollection<String> AV68Tmordcowwds_8_tfommtpo_sels ,
                                          int AV62Tmordcowwds_2_tfomcod ,
                                          int AV63Tmordcowwds_3_tfomcod_to ,
                                          int AV64Tmordcowwds_4_tfomopecod ,
                                          int AV65Tmordcowwds_5_tfomopecod_to ,
                                          String AV67Tmordcowwds_7_tfomopenom_sel ,
                                          String AV66Tmordcowwds_6_tfomopenom ,
                                          int AV68Tmordcowwds_8_tfommtpo_sels_size ,
                                          java.math.BigDecimal AV69Tmordcowwds_9_tfommccnt ,
                                          java.math.BigDecimal AV70Tmordcowwds_10_tfommccnt_to ,
                                          short AV71Tmordcowwds_11_tfommcult ,
                                          short AV72Tmordcowwds_12_tfommcult_to ,
                                          int A9425OMCod ,
                                          int A9455OMOpeCod ,
                                          String A9456OMOpeNom ,
                                          java.math.BigDecimal A9461OMMCCnt ,
                                          short A9465OMMCUlt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV61Tmordcowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMMCUlt, T1.OMMCCnt, T2.OpeNom AS OMOpeNom, T1.OMOpeCod AS OMOpeCod, T1.OMCod, T1.OMMTpo FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod)" ;
      if ( ! (0==AV62Tmordcowwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV63Tmordcowwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV64Tmordcowwds_4_tfomopecod) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV65Tmordcowwds_5_tfomopecod_to) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tmordcowwds_7_tfomopenom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tmordcowwds_6_tfomopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tmordcowwds_7_tfomopenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.OpeNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV68Tmordcowwds_8_tfommtpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV68Tmordcowwds_8_tfommtpo_sels, "T1.OMMTpo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Tmordcowwds_9_tfommccnt)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Tmordcowwds_10_tfommccnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmordcowwds_11_tfommcult) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmordcowwds_12_tfommcult_to) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.OpeNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.OpeNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMOpeCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMTpo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMTpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCCnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMCUlt DESC" ;
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
                  return conditional_P08XQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

