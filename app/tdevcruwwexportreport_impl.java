package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevcruwwexportreport_impl extends GXWebReport
{
   public tdevcruwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV74Title = httpContext.getMessage( "Lista de Devolucion Entradas en Almacen", "") ;
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
         h86T0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV82FilterFullText)==0) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82FilterFullText, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV40TFDevCruId) && (0==AV41TFDevCruId_To) ) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFDevCruId), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFDevCruId_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Devolucion Id", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFDevCruId_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFDevCruId_To), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFDevCruFec)) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV42TFDevCruFec, "99/99/99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV54TFDevCruSal) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV54TFDevCruSal, "99/99/99 99:99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFCliNom_Sel)==0) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFCliNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFCliNom)==0) )
         {
            h86T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFCliNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51TFTrnNom_Sel)==0) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFTrnNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFTrnNom)==0) )
         {
            h86T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFTrnNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV53TFDevCruMat_Sel)==0) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFDevCruMat_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV52TFDevCruMat)==0) )
         {
            h86T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFDevCruMat, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV59TFDevCruObs_Sel)==0) )
      {
         h86T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFDevCruObs_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFDevCruObs)==0) )
         {
            h86T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFDevCruObs, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h86T0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h86T0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 30, Gx_line+10, 96, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 100, Gx_line+10, 166, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 170, Gx_line+10, 236, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 240, Gx_line+10, 373, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 377, Gx_line+10, 511, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 515, Gx_line+10, 649, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 653, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV94Tdevcruwwds_1_filterfulltext = AV82FilterFullText ;
      AV95Tdevcruwwds_2_tfdevcruid = AV40TFDevCruId ;
      AV96Tdevcruwwds_3_tfdevcruid_to = AV41TFDevCruId_To ;
      AV97Tdevcruwwds_4_tfdevcrufec = AV42TFDevCruFec ;
      AV98Tdevcruwwds_5_tfdevcrusal = AV54TFDevCruSal ;
      AV99Tdevcruwwds_6_tfclinom = AV46TFCliNom ;
      AV100Tdevcruwwds_7_tfclinom_sel = AV47TFCliNom_Sel ;
      AV101Tdevcruwwds_8_tftrnnom = AV50TFTrnNom ;
      AV102Tdevcruwwds_9_tftrnnom_sel = AV51TFTrnNom_Sel ;
      AV103Tdevcruwwds_10_tfdevcrumat = AV52TFDevCruMat ;
      AV104Tdevcruwwds_11_tfdevcrumat_sel = AV53TFDevCruMat_Sel ;
      AV105Tdevcruwwds_12_tfdevcruobs = AV58TFDevCruObs ;
      AV106Tdevcruwwds_13_tfdevcruobs_sel = AV59TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV94Tdevcruwwds_1_filterfulltext ,
                                           Integer.valueOf(AV95Tdevcruwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV96Tdevcruwwds_3_tfdevcruid_to) ,
                                           AV97Tdevcruwwds_4_tfdevcrufec ,
                                           AV98Tdevcruwwds_5_tfdevcrusal ,
                                           AV100Tdevcruwwds_7_tfclinom_sel ,
                                           AV99Tdevcruwwds_6_tfclinom ,
                                           AV102Tdevcruwwds_9_tftrnnom_sel ,
                                           AV101Tdevcruwwds_8_tftrnnom ,
                                           AV104Tdevcruwwds_11_tfdevcrumat_sel ,
                                           AV103Tdevcruwwds_10_tfdevcrumat ,
                                           AV106Tdevcruwwds_13_tfdevcruobs_sel ,
                                           AV105Tdevcruwwds_12_tfdevcruobs ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           A279CliNom ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV94Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV94Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV94Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV94Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV94Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV99Tdevcruwwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV99Tdevcruwwds_6_tfclinom), 30, "%") ;
      lV101Tdevcruwwds_8_tftrnnom = GXutil.padr( GXutil.rtrim( AV101Tdevcruwwds_8_tftrnnom), 30, "%") ;
      lV103Tdevcruwwds_10_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV103Tdevcruwwds_10_tfdevcrumat), 20, "%") ;
      lV105Tdevcruwwds_12_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV105Tdevcruwwds_12_tfdevcruobs), "%", "") ;
      /* Using cursor P086T2 */
      pr_default.execute(0, new Object[] {lV94Tdevcruwwds_1_filterfulltext, lV94Tdevcruwwds_1_filterfulltext, lV94Tdevcruwwds_1_filterfulltext, lV94Tdevcruwwds_1_filterfulltext, lV94Tdevcruwwds_1_filterfulltext, Integer.valueOf(AV95Tdevcruwwds_2_tfdevcruid), Integer.valueOf(AV96Tdevcruwwds_3_tfdevcruid_to), AV97Tdevcruwwds_4_tfdevcrufec, AV98Tdevcruwwds_5_tfdevcrusal, lV99Tdevcruwwds_6_tfclinom, AV100Tdevcruwwds_7_tfclinom_sel, lV101Tdevcruwwds_8_tftrnnom, AV102Tdevcruwwds_9_tftrnnom_sel, lV103Tdevcruwwds_10_tfdevcrumat, AV104Tdevcruwwds_11_tfdevcrumat_sel, lV105Tdevcruwwds_12_tfdevcruobs, AV106Tdevcruwwds_13_tfdevcruobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086T2_A396EmprCod[0] ;
         A252CliCod = P086T2_A252CliCod[0] ;
         A840TrnCod = P086T2_A840TrnCod[0] ;
         n840TrnCod = P086T2_n840TrnCod[0] ;
         A11682DevCruObs = P086T2_A11682DevCruObs[0] ;
         A11672DevCruMat = P086T2_A11672DevCruMat[0] ;
         A841TrnNom = P086T2_A841TrnNom[0] ;
         n841TrnNom = P086T2_n841TrnNom[0] ;
         A279CliNom = P086T2_A279CliNom[0] ;
         A11673DevCruSal = P086T2_A11673DevCruSal[0] ;
         A11670DevCruFec = P086T2_A11670DevCruFec[0] ;
         A11669DevCruId = P086T2_A11669DevCruId[0] ;
         A279CliNom = P086T2_A279CliNom[0] ;
         A841TrnNom = P086T2_A841TrnNom[0] ;
         n841TrnNom = P086T2_n841TrnNom[0] ;
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
         h86T0( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 30, Gx_line+10, 96, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 100, Gx_line+10, 166, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A11673DevCruSal, "99/99/99 99:99"), 170, Gx_line+10, 236, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 240, Gx_line+10, 373, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 377, Gx_line+10, 511, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), 515, Gx_line+10, 649, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11682DevCruObs, "")), 653, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+66) ;
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
      if ( GXutil.strcmp(AV36Session.getValue("TDEVCRUWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDEVCRUWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TDEVCRUWWGridState"), null, null);
      }
      AV10OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV82FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV40TFDevCruId = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFDevCruId_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV42TFDevCruFec = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV54TFDevCruSal = localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV50TFTrnNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV51TFTrnNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV52TFDevCruMat = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV53TFDevCruMat_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV58TFDevCruObs = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV59TFDevCruObs_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
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

   public void h86T0( boolean bFoot ,
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
               AV71PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV67DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV74Title = AV90Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV74Title = "" ;
      AV82FilterFullText = "" ;
      AV60TFDevCruId_To_Description = "" ;
      AV42TFDevCruFec = GXutil.nullDate() ;
      AV54TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV47TFCliNom_Sel = "" ;
      AV46TFCliNom = "" ;
      AV51TFTrnNom_Sel = "" ;
      AV50TFTrnNom = "" ;
      AV53TFDevCruMat_Sel = "" ;
      AV52TFDevCruMat = "" ;
      AV59TFDevCruObs_Sel = "" ;
      AV58TFDevCruObs = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      AV94Tdevcruwwds_1_filterfulltext = "" ;
      AV97Tdevcruwwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV98Tdevcruwwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV99Tdevcruwwds_6_tfclinom = "" ;
      AV100Tdevcruwwds_7_tfclinom_sel = "" ;
      AV101Tdevcruwwds_8_tftrnnom = "" ;
      AV102Tdevcruwwds_9_tftrnnom_sel = "" ;
      AV103Tdevcruwwds_10_tfdevcrumat = "" ;
      AV104Tdevcruwwds_11_tfdevcrumat_sel = "" ;
      AV105Tdevcruwwds_12_tfdevcruobs = "" ;
      AV106Tdevcruwwds_13_tfdevcruobs_sel = "" ;
      scmdbuf = "" ;
      lV94Tdevcruwwds_1_filterfulltext = "" ;
      lV99Tdevcruwwds_6_tfclinom = "" ;
      lV101Tdevcruwwds_8_tftrnnom = "" ;
      lV103Tdevcruwwds_10_tfdevcrumat = "" ;
      lV105Tdevcruwwds_12_tfdevcruobs = "" ;
      P086T2_A396EmprCod = new String[] {""} ;
      P086T2_A252CliCod = new int[1] ;
      P086T2_A840TrnCod = new short[1] ;
      P086T2_n840TrnCod = new boolean[] {false} ;
      P086T2_A11682DevCruObs = new String[] {""} ;
      P086T2_A11672DevCruMat = new String[] {""} ;
      P086T2_A841TrnNom = new String[] {""} ;
      P086T2_n841TrnNom = new boolean[] {false} ;
      P086T2_A279CliNom = new String[] {""} ;
      P086T2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P086T2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086T2_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV71PageInfo = "" ;
      AV67DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV90Pgmdesc = "" ;
      AV84AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevcruwwexportreport__default(),
         new Object[] {
             new Object[] {
            P086T2_A396EmprCod, P086T2_A252CliCod, P086T2_A840TrnCod, P086T2_n840TrnCod, P086T2_A11682DevCruObs, P086T2_A11672DevCruMat, P086T2_A841TrnNom, P086T2_n841TrnNom, P086T2_A279CliNom, P086T2_A11673DevCruSal,
            P086T2_A11670DevCruFec, P086T2_A11669DevCruId
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV90Pgmdesc = httpContext.getMessage( "TDEVCRUWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV90Pgmdesc = httpContext.getMessage( "TDEVCRUWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV40TFDevCruId ;
   private int AV41TFDevCruId_To ;
   private int A11669DevCruId ;
   private int AV95Tdevcruwwds_2_tfdevcruid ;
   private int AV96Tdevcruwwds_3_tfdevcruid_to ;
   private int A252CliCod ;
   private int AV107GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV47TFCliNom_Sel ;
   private String AV46TFCliNom ;
   private String AV51TFTrnNom_Sel ;
   private String AV50TFTrnNom ;
   private String AV53TFDevCruMat_Sel ;
   private String AV52TFDevCruMat ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String AV99Tdevcruwwds_6_tfclinom ;
   private String AV100Tdevcruwwds_7_tfclinom_sel ;
   private String AV101Tdevcruwwds_8_tftrnnom ;
   private String AV102Tdevcruwwds_9_tftrnnom_sel ;
   private String AV103Tdevcruwwds_10_tfdevcrumat ;
   private String AV104Tdevcruwwds_11_tfdevcrumat_sel ;
   private String scmdbuf ;
   private String lV99Tdevcruwwds_6_tfclinom ;
   private String lV101Tdevcruwwds_8_tftrnnom ;
   private String lV103Tdevcruwwds_10_tfdevcrumat ;
   private String A396EmprCod ;
   private String AV90Pgmdesc ;
   private java.util.Date AV54TFDevCruSal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV98Tdevcruwwds_5_tfdevcrusal ;
   private java.util.Date AV42TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV97Tdevcruwwds_4_tfdevcrufec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private String AV74Title ;
   private String AV82FilterFullText ;
   private String AV60TFDevCruId_To_Description ;
   private String AV59TFDevCruObs_Sel ;
   private String AV58TFDevCruObs ;
   private String A11682DevCruObs ;
   private String AV94Tdevcruwwds_1_filterfulltext ;
   private String AV105Tdevcruwwds_12_tfdevcruobs ;
   private String AV106Tdevcruwwds_13_tfdevcruobs_sel ;
   private String lV94Tdevcruwwds_1_filterfulltext ;
   private String lV105Tdevcruwwds_12_tfdevcruobs ;
   private String AV71PageInfo ;
   private String AV67DateInfo ;
   private String AV84AppName ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private IDataStoreProvider pr_default ;
   private String[] P086T2_A396EmprCod ;
   private int[] P086T2_A252CliCod ;
   private short[] P086T2_A840TrnCod ;
   private boolean[] P086T2_n840TrnCod ;
   private String[] P086T2_A11682DevCruObs ;
   private String[] P086T2_A11672DevCruMat ;
   private String[] P086T2_A841TrnNom ;
   private boolean[] P086T2_n841TrnNom ;
   private String[] P086T2_A279CliNom ;
   private java.util.Date[] P086T2_A11673DevCruSal ;
   private java.util.Date[] P086T2_A11670DevCruFec ;
   private int[] P086T2_A11669DevCruId ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tdevcruwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94Tdevcruwwds_1_filterfulltext ,
                                          int AV95Tdevcruwwds_2_tfdevcruid ,
                                          int AV96Tdevcruwwds_3_tfdevcruid_to ,
                                          java.util.Date AV97Tdevcruwwds_4_tfdevcrufec ,
                                          java.util.Date AV98Tdevcruwwds_5_tfdevcrusal ,
                                          String AV100Tdevcruwwds_7_tfclinom_sel ,
                                          String AV99Tdevcruwwds_6_tfclinom ,
                                          String AV102Tdevcruwwds_9_tftrnnom_sel ,
                                          String AV101Tdevcruwwds_8_tftrnnom ,
                                          String AV104Tdevcruwwds_11_tfdevcrumat_sel ,
                                          String AV103Tdevcruwwds_10_tfdevcrumat ,
                                          String AV106Tdevcruwwds_13_tfdevcruobs_sel ,
                                          String AV105Tdevcruwwds_12_tfdevcruobs ,
                                          int A11669DevCruId ,
                                          String A279CliNom ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.DevCruObs, T1.DevCruMat, T3.TrnNom, T2.CliNom, T1.DevCruSal, T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV94Tdevcruwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV95Tdevcruwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV96Tdevcruwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Tdevcruwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Tdevcruwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tdevcruwwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Tdevcruwwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tdevcruwwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tdevcruwwds_9_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tdevcruwwds_8_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tdevcruwwds_9_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tdevcruwwds_11_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV103Tdevcruwwds_10_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tdevcruwwds_11_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tdevcruwwds_13_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV105Tdevcruwwds_12_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tdevcruwwds_13_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruSal" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruSal DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruMat" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruMat DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruObs" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruObs DESC" ;
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
                  return conditional_P086T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
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
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

}

