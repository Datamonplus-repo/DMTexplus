package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testcolwwexportreport_impl extends GXWebReport
{
   public testcolwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53Title = httpContext.getMessage( "Lista de Colores p/estampación", "") ;
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
         h8WU0( true, 0) ;
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
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFCliCod) && (0==AV23TFCliCod_To) ) )
      {
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod), "ZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFCliCod_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod_To), "ZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliNom_Sel)==0) )
      {
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFCliNom_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFCliNom)==0) )
         {
            h8WU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFEstCol_Sel)==0) )
      {
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFEstCol_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFEstCol)==0) )
         {
            h8WU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFEstCol, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFEstColDsc_Sel)==0) )
      {
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color Estampación", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFEstColDsc_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFEstColDsc)==0) )
         {
            h8WU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color Estampación", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFEstColDsc, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV34TFEstColBck_Sels.fromJSonString(AV32TFEstColBck_SelsJson, null);
      if ( ! ( AV34TFEstColBck_Sels.size() == 0 ) )
      {
         AV42i = 1 ;
         AV60GXV1 = 1 ;
         while ( AV60GXV1 <= AV34TFEstColBck_Sels.size() )
         {
            AV35TFEstColBck_Sel = (String)AV34TFEstColBck_Sels.elementAt(-1+AV60GXV1) ;
            if ( AV42i == 1 )
            {
               AV33TFEstColBck_SelDscs = "" ;
            }
            else
            {
               AV33TFEstColBck_SelDscs += ", " ;
            }
            AV40FilterTFEstColBck_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "WHT") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Blanco", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "RED") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Rojo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "GRN") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Verde", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "BLU") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Azul", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "YLW") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Amarillo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV35TFEstColBck_Sel), "BLK") == 0 )
            {
               AV40FilterTFEstColBck_SelValueDescription = httpContext.getMessage( "Negro", "") ;
            }
            AV33TFEstColBck_SelDscs += AV40FilterTFEstColBck_SelValueDescription ;
            AV42i = (long)(AV42i+1) ;
            AV60GXV1 = (int)(AV60GXV1+1) ;
         }
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Resaltado", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFEstColBck_SelDscs, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV36TFEstColRGB) && (0==AV37TFEstColRGB_To) ) )
      {
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "RGB", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFEstColRGB), "ZZZZZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFEstColRGB_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "RGB", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFEstColRGB_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFEstColRGB_To), "ZZZZZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8WU0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8WU0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 103, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 107, Gx_line+10, 253, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 257, Gx_line+10, 405, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Estampación", ""), 409, Gx_line+10, 557, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Resaltado", ""), 561, Gx_line+10, 709, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "RGB", ""), 713, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV62Testcolwwds_1_filterfulltext = AV12FilterFullText ;
      AV63Testcolwwds_2_tfclicod = AV22TFCliCod ;
      AV64Testcolwwds_3_tfclicod_to = AV23TFCliCod_To ;
      AV65Testcolwwds_4_tfclinom = AV24TFCliNom ;
      AV66Testcolwwds_5_tfclinom_sel = AV25TFCliNom_Sel ;
      AV67Testcolwwds_6_tfestcol = AV26TFEstCol ;
      AV68Testcolwwds_7_tfestcol_sel = AV27TFEstCol_Sel ;
      AV69Testcolwwds_8_tfestcoldsc = AV28TFEstColDsc ;
      AV70Testcolwwds_9_tfestcoldsc_sel = AV29TFEstColDsc_Sel ;
      AV71Testcolwwds_10_tfestcolbck_sels = AV34TFEstColBck_Sels ;
      AV72Testcolwwds_11_tfestcolrgb = AV36TFEstColRGB ;
      AV73Testcolwwds_12_tfestcolrgb_to = AV37TFEstColRGB_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11685EstColBck ,
                                           AV71Testcolwwds_10_tfestcolbck_sels ,
                                           Integer.valueOf(AV63Testcolwwds_2_tfclicod) ,
                                           Integer.valueOf(AV64Testcolwwds_3_tfclicod_to) ,
                                           AV66Testcolwwds_5_tfclinom_sel ,
                                           AV65Testcolwwds_4_tfclinom ,
                                           AV68Testcolwwds_7_tfestcol_sel ,
                                           AV67Testcolwwds_6_tfestcol ,
                                           AV70Testcolwwds_9_tfestcoldsc_sel ,
                                           AV69Testcolwwds_8_tfestcoldsc ,
                                           Integer.valueOf(AV71Testcolwwds_10_tfestcolbck_sels.size()) ,
                                           Long.valueOf(AV72Testcolwwds_11_tfestcolrgb) ,
                                           Long.valueOf(AV73Testcolwwds_12_tfestcolrgb_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4415EstCol ,
                                           A6848EstColDsc ,
                                           Long.valueOf(A12712EstColRGB) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV62Testcolwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV65Testcolwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV65Testcolwwds_4_tfclinom), 30, "%") ;
      lV67Testcolwwds_6_tfestcol = GXutil.padr( GXutil.rtrim( AV67Testcolwwds_6_tfestcol), 20, "%") ;
      lV69Testcolwwds_8_tfestcoldsc = GXutil.padr( GXutil.rtrim( AV69Testcolwwds_8_tfestcoldsc), 30, "%") ;
      /* Using cursor P08WU2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV63Testcolwwds_2_tfclicod), Integer.valueOf(AV64Testcolwwds_3_tfclicod_to), lV65Testcolwwds_4_tfclinom, AV66Testcolwwds_5_tfclinom_sel, lV67Testcolwwds_6_tfestcol, AV68Testcolwwds_7_tfestcol_sel, lV69Testcolwwds_8_tfestcoldsc, AV70Testcolwwds_9_tfestcoldsc_sel, Long.valueOf(AV72Testcolwwds_11_tfestcolrgb), Long.valueOf(AV73Testcolwwds_12_tfestcolrgb_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08WU2_A396EmprCod[0] ;
         A12712EstColRGB = P08WU2_A12712EstColRGB[0] ;
         n12712EstColRGB = P08WU2_n12712EstColRGB[0] ;
         A6848EstColDsc = P08WU2_A6848EstColDsc[0] ;
         n6848EstColDsc = P08WU2_n6848EstColDsc[0] ;
         A4415EstCol = P08WU2_A4415EstCol[0] ;
         A279CliNom = P08WU2_A279CliNom[0] ;
         A252CliCod = P08WU2_A252CliCod[0] ;
         A11685EstColBck = P08WU2_A11685EstColBck[0] ;
         n11685EstColBck = P08WU2_n11685EstColBck[0] ;
         A279CliNom = P08WU2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV62Testcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV62Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4415EstCol) , GXutil.padr( "%" + GXutil.upper( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6848EstColDsc) , GXutil.padr( "%" + GXutil.upper( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "blanco", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "WHT", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "rojo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "RED", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "verde", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "GRN", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "azul", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLU", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "amarillo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "YLW", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "negro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLK", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A12712EstColRGB, 10, 0) , GXutil.padr( "%" + AV62Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV13EstColBckDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "WHT") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Blanco", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "RED") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Rojo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "GRN") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Verde", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "BLU") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Azul", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "YLW") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Amarillo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "BLK") == 0 )
            {
               AV13EstColBckDescription = httpContext.getMessage( "Negro", "") ;
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
            h8WU0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 103, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 107, Gx_line+10, 253, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4415EstCol, "")), 257, Gx_line+10, 405, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6848EstColDsc, "")), 409, Gx_line+10, 557, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13EstColBckDescription, "")), 561, Gx_line+10, 709, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12712EstColRGB), "ZZZZZZZZZ9")), 713, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("TEstColWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEstColWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("TEstColWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV2 = 1 ;
      while ( AV74GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV22TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV24TFCliNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV25TFCliNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL") == 0 )
         {
            AV26TFEstCol = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL_SEL") == 0 )
         {
            AV27TFEstCol_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC") == 0 )
         {
            AV28TFEstColDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC_SEL") == 0 )
         {
            AV29TFEstColDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLBCK_SEL") == 0 )
         {
            AV32TFEstColBck_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV34TFEstColBck_Sels.fromJSonString(AV32TFEstColBck_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLRGB") == 0 )
         {
            AV36TFEstColRGB = GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV37TFEstColRGB_To = GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         AV74GXV2 = (int)(AV74GXV2+1) ;
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

   public void h8WU0( boolean bFoot ,
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
               AV51PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV48DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV53Title = AV57Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV53Title = "" ;
      AV12FilterFullText = "" ;
      AV38TFCliCod_To_Description = "" ;
      AV25TFCliNom_Sel = "" ;
      AV24TFCliNom = "" ;
      AV27TFEstCol_Sel = "" ;
      AV26TFEstCol = "" ;
      AV29TFEstColDsc_Sel = "" ;
      AV28TFEstColDsc = "" ;
      AV34TFEstColBck_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32TFEstColBck_SelsJson = "" ;
      AV35TFEstColBck_Sel = "" ;
      AV33TFEstColBck_SelDscs = "" ;
      AV40FilterTFEstColBck_SelValueDescription = "" ;
      AV41TFEstColRGB_To_Description = "" ;
      A11685EstColBck = "" ;
      A279CliNom = "" ;
      A4415EstCol = "" ;
      A6848EstColDsc = "" ;
      AV62Testcolwwds_1_filterfulltext = "" ;
      AV65Testcolwwds_4_tfclinom = "" ;
      AV66Testcolwwds_5_tfclinom_sel = "" ;
      AV67Testcolwwds_6_tfestcol = "" ;
      AV68Testcolwwds_7_tfestcol_sel = "" ;
      AV69Testcolwwds_8_tfestcoldsc = "" ;
      AV70Testcolwwds_9_tfestcoldsc_sel = "" ;
      AV71Testcolwwds_10_tfestcolbck_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV62Testcolwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV65Testcolwwds_4_tfclinom = "" ;
      lV67Testcolwwds_6_tfestcol = "" ;
      lV69Testcolwwds_8_tfestcoldsc = "" ;
      P08WU2_A396EmprCod = new String[] {""} ;
      P08WU2_A12712EstColRGB = new long[1] ;
      P08WU2_n12712EstColRGB = new boolean[] {false} ;
      P08WU2_A6848EstColDsc = new String[] {""} ;
      P08WU2_n6848EstColDsc = new boolean[] {false} ;
      P08WU2_A4415EstCol = new String[] {""} ;
      P08WU2_A279CliNom = new String[] {""} ;
      P08WU2_A252CliCod = new int[1] ;
      P08WU2_A11685EstColBck = new String[] {""} ;
      P08WU2_n11685EstColBck = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV13EstColBckDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51PageInfo = "" ;
      AV48DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV57Pgmdesc = "" ;
      AV46AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcolwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08WU2_A396EmprCod, P08WU2_A12712EstColRGB, P08WU2_n12712EstColRGB, P08WU2_A6848EstColDsc, P08WU2_n6848EstColDsc, P08WU2_A4415EstCol, P08WU2_A279CliNom, P08WU2_A252CliCod, P08WU2_A11685EstColBck, P08WU2_n11685EstColBck
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "TEst Col WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "TEst Col WWExport Report", "") ;
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
   private int AV22TFCliCod ;
   private int AV23TFCliCod_To ;
   private int AV60GXV1 ;
   private int A252CliCod ;
   private int AV63Testcolwwds_2_tfclicod ;
   private int AV64Testcolwwds_3_tfclicod_to ;
   private int AV71Testcolwwds_10_tfestcolbck_sels_size ;
   private int AV74GXV2 ;
   private long AV42i ;
   private long AV36TFEstColRGB ;
   private long AV37TFEstColRGB_To ;
   private long A12712EstColRGB ;
   private long AV72Testcolwwds_11_tfestcolrgb ;
   private long AV73Testcolwwds_12_tfestcolrgb_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25TFCliNom_Sel ;
   private String AV24TFCliNom ;
   private String AV27TFEstCol_Sel ;
   private String AV26TFEstCol ;
   private String AV29TFEstColDsc_Sel ;
   private String AV28TFEstColDsc ;
   private String AV35TFEstColBck_Sel ;
   private String A11685EstColBck ;
   private String A279CliNom ;
   private String A4415EstCol ;
   private String A6848EstColDsc ;
   private String AV65Testcolwwds_4_tfclinom ;
   private String AV66Testcolwwds_5_tfclinom_sel ;
   private String AV67Testcolwwds_6_tfestcol ;
   private String AV68Testcolwwds_7_tfestcol_sel ;
   private String AV69Testcolwwds_8_tfestcoldsc ;
   private String AV70Testcolwwds_9_tfestcoldsc_sel ;
   private String scmdbuf ;
   private String lV65Testcolwwds_4_tfclinom ;
   private String lV67Testcolwwds_6_tfestcol ;
   private String lV69Testcolwwds_8_tfestcoldsc ;
   private String A396EmprCod ;
   private String AV57Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n12712EstColRGB ;
   private boolean n6848EstColDsc ;
   private boolean n11685EstColBck ;
   private String AV32TFEstColBck_SelsJson ;
   private String AV53Title ;
   private String AV12FilterFullText ;
   private String AV38TFCliCod_To_Description ;
   private String AV33TFEstColBck_SelDscs ;
   private String AV40FilterTFEstColBck_SelValueDescription ;
   private String AV41TFEstColRGB_To_Description ;
   private String AV62Testcolwwds_1_filterfulltext ;
   private String lV62Testcolwwds_1_filterfulltext ;
   private String AV13EstColBckDescription ;
   private String AV51PageInfo ;
   private String AV48DateInfo ;
   private String AV46AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08WU2_A396EmprCod ;
   private long[] P08WU2_A12712EstColRGB ;
   private boolean[] P08WU2_n12712EstColRGB ;
   private String[] P08WU2_A6848EstColDsc ;
   private boolean[] P08WU2_n6848EstColDsc ;
   private String[] P08WU2_A4415EstCol ;
   private String[] P08WU2_A279CliNom ;
   private int[] P08WU2_A252CliCod ;
   private String[] P08WU2_A11685EstColBck ;
   private boolean[] P08WU2_n11685EstColBck ;
   private GXSimpleCollection<String> AV34TFEstColBck_Sels ;
   private GXSimpleCollection<String> AV71Testcolwwds_10_tfestcolbck_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class testcolwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11685EstColBck ,
                                          GXSimpleCollection<String> AV71Testcolwwds_10_tfestcolbck_sels ,
                                          int AV63Testcolwwds_2_tfclicod ,
                                          int AV64Testcolwwds_3_tfclicod_to ,
                                          String AV66Testcolwwds_5_tfclinom_sel ,
                                          String AV65Testcolwwds_4_tfclinom ,
                                          String AV68Testcolwwds_7_tfestcol_sel ,
                                          String AV67Testcolwwds_6_tfestcol ,
                                          String AV70Testcolwwds_9_tfestcoldsc_sel ,
                                          String AV69Testcolwwds_8_tfestcoldsc ,
                                          int AV71Testcolwwds_10_tfestcolbck_sels_size ,
                                          long AV72Testcolwwds_11_tfestcolrgb ,
                                          long AV73Testcolwwds_12_tfestcolrgb_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4415EstCol ,
                                          String A6848EstColDsc ,
                                          long A12712EstColRGB ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV62Testcolwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EstColRGB, T1.EstColDsc, T1.EstCol, T2.CliNom, T1.CliCod, T1.EstColBck FROM (TXPCEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV63Testcolwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcolwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Testcolwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Testcolwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Testcolwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Testcolwwds_7_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV67Testcolwwds_6_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Testcolwwds_7_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCol = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Testcolwwds_9_tfestcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Testcolwwds_8_tfestcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Testcolwwds_9_tfestcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstColDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV71Testcolwwds_10_tfestcolbck_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Testcolwwds_10_tfestcolbck_sels, "T1.EstColBck IN (", ")")+")");
      }
      if ( ! (0==AV72Testcolwwds_11_tfestcolrgb) )
      {
         addWhere(sWhereString, "(T1.EstColRGB >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Testcolwwds_12_tfestcolrgb_to) )
      {
         addWhere(sWhereString, "(T1.EstColRGB <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCol" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCol DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColBck" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColBck DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColRGB" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColRGB DESC" ;
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
                  return conditional_P08WU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               return;
      }
   }

}

