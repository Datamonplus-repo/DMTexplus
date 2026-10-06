package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tterpeswwexportreport_impl extends GXWebReport
{
   public tterpeswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV42Title = httpContext.getMessage( "Lista de TERMINALES DE PESAJE", "") ;
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
         h97Q0( true, 0) ;
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
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFTermCod_Sel)==0) )
      {
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código del Terminal", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFTermCod_Sel, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFTermCod)==0) )
         {
            h97Q0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código del Terminal", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFTermCod, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV21TFTermDsc_Sel)==0) )
      {
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFTermDsc_Sel, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFTermDsc)==0) )
         {
            h97Q0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFTermDsc, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV28TFTermPesTpo_Sels.fromJSonString(AV26TFTermPesTpo_SelsJson, null);
      if ( ! ( AV28TFTermPesTpo_Sels.size() == 0 ) )
      {
         AV31i = 1 ;
         AV57GXV1 = 1 ;
         while ( AV57GXV1 <= AV28TFTermPesTpo_Sels.size() )
         {
            AV29TFTermPesTpo_Sel = (String)AV28TFTermPesTpo_Sels.elementAt(-1+AV57GXV1) ;
            if ( AV31i == 1 )
            {
               AV27TFTermPesTpo_SelDscs = "" ;
            }
            else
            {
               AV27TFTermPesTpo_SelDscs += ", " ;
            }
            AV30FilterTFTermPesTpo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV29TFTermPesTpo_Sel), "C") == 0 )
            {
               AV30FilterTFTermPesTpo_SelValueDescription = httpContext.getMessage( "Colorantes", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV29TFTermPesTpo_Sel), "A") == 0 )
            {
               AV30FilterTFTermPesTpo_SelValueDescription = httpContext.getMessage( "Auxiliares", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV29TFTermPesTpo_Sel), "T") == 0 )
            {
               AV30FilterTFTermPesTpo_SelValueDescription = httpContext.getMessage( "Todos", "") ;
            }
            AV27TFTermPesTpo_SelDscs += AV30FilterTFTermPesTpo_SelValueDescription ;
            AV31i = (long)(AV31i+1) ;
            AV57GXV1 = (int)(AV57GXV1+1) ;
         }
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Bascula", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFTermPesTpo_SelDscs, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV46TFTermPesUlt) && (0==AV47TFTermPesUlt_To) ) )
      {
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Rango", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFTermPesUlt), "ZZZZZZZZZ9")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFTermPesUlt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultimo Rango", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFTermPesUlt_To_Description, "")), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFTermPesUlt_To), "ZZZZZZZZZ9")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFTermPesPro_Sel)==0) )
      {
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Protocolo", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFTermPesPro_Sel, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFTermPesPro)==0) )
         {
            h97Q0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Protocolo", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFTermPesPro, "")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (0==AV50TFTermPes_Sel) )
      {
         h97Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pesaje Colorantes?", ""), 25, Gx_line+0, 137, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFTermPes_Sel), "9")), 137, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h97Q0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h97Q0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código del Terminal", ""), 30, Gx_line+10, 111, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 115, Gx_line+10, 279, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Bascula", ""), 283, Gx_line+10, 447, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Rango", ""), 451, Gx_line+10, 533, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Protocolo", ""), 537, Gx_line+10, 701, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pesaje Colorantes?", ""), 705, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV59Tterpeswwds_1_filterfulltext = AV12FilterFullText ;
      AV60Tterpeswwds_2_tftermcod = AV18TFTermCod ;
      AV61Tterpeswwds_3_tftermcod_sel = AV19TFTermCod_Sel ;
      AV62Tterpeswwds_4_tftermdsc = AV20TFTermDsc ;
      AV63Tterpeswwds_5_tftermdsc_sel = AV21TFTermDsc_Sel ;
      AV64Tterpeswwds_6_tftermpestpo_sels = AV28TFTermPesTpo_Sels ;
      AV65Tterpeswwds_7_tftermpesult = AV46TFTermPesUlt ;
      AV66Tterpeswwds_8_tftermpesult_to = AV47TFTermPesUlt_To ;
      AV67Tterpeswwds_9_tftermpespro = AV48TFTermPesPro ;
      AV68Tterpeswwds_10_tftermpespro_sel = AV49TFTermPesPro_Sel ;
      AV69Tterpeswwds_11_tftermpes_sel = AV50TFTermPes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A10177TermPesTpo ,
                                           AV64Tterpeswwds_6_tftermpestpo_sels ,
                                           AV61Tterpeswwds_3_tftermcod_sel ,
                                           AV60Tterpeswwds_2_tftermcod ,
                                           AV63Tterpeswwds_5_tftermdsc_sel ,
                                           AV62Tterpeswwds_4_tftermdsc ,
                                           Integer.valueOf(AV64Tterpeswwds_6_tftermpestpo_sels.size()) ,
                                           Long.valueOf(AV65Tterpeswwds_7_tftermpesult) ,
                                           Long.valueOf(AV66Tterpeswwds_8_tftermpesult_to) ,
                                           AV68Tterpeswwds_10_tftermpespro_sel ,
                                           AV67Tterpeswwds_9_tftermpespro ,
                                           Byte.valueOf(AV69Tterpeswwds_11_tftermpes_sel) ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           Long.valueOf(A8901TermPesUlt) ,
                                           A8900TermPesPro ,
                                           Byte.valueOf(A8899TermPes) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV59Tterpeswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV60Tterpeswwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV60Tterpeswwds_2_tftermcod), 10, "%") ;
      lV62Tterpeswwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV62Tterpeswwds_4_tftermdsc), 30, "%") ;
      lV67Tterpeswwds_9_tftermpespro = GXutil.padr( GXutil.rtrim( AV67Tterpeswwds_9_tftermpespro), 20, "%") ;
      /* Using cursor P097Q2 */
      pr_default.execute(0, new Object[] {lV60Tterpeswwds_2_tftermcod, AV61Tterpeswwds_3_tftermcod_sel, lV62Tterpeswwds_4_tftermdsc, AV63Tterpeswwds_5_tftermdsc_sel, Long.valueOf(AV65Tterpeswwds_7_tftermpesult), Long.valueOf(AV66Tterpeswwds_8_tftermpesult_to), lV67Tterpeswwds_9_tftermpespro, AV68Tterpeswwds_10_tftermpespro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8899TermPes = P097Q2_A8899TermPes[0] ;
         n8899TermPes = P097Q2_n8899TermPes[0] ;
         A8900TermPesPro = P097Q2_A8900TermPesPro[0] ;
         A8901TermPesUlt = P097Q2_A8901TermPesUlt[0] ;
         n8901TermPesUlt = P097Q2_n8901TermPesUlt[0] ;
         A8898TermDsc = P097Q2_A8898TermDsc[0] ;
         n8898TermDsc = P097Q2_n8898TermDsc[0] ;
         A942TermCod = P097Q2_A942TermCod[0] ;
         A10177TermPesTpo = P097Q2_A10177TermPesTpo[0] ;
         n10177TermPesTpo = P097Q2_n10177TermPesTpo[0] ;
         A8899TermPes = P097Q2_A8899TermPes[0] ;
         n8899TermPes = P097Q2_n8899TermPes[0] ;
         A8898TermDsc = P097Q2_A8898TermDsc[0] ;
         n8898TermDsc = P097Q2_n8898TermDsc[0] ;
         if ( (GXutil.strcmp("", AV59Tterpeswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A942TermCod) , GXutil.padr( "%" + GXutil.upper( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8898TermDsc) , GXutil.padr( "%" + GXutil.upper( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "colorantes", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "auxiliares", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "todos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A8901TermPesUlt, 10, 0) , GXutil.padr( "%" + AV59Tterpeswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8900TermPesPro) , GXutil.padr( "%" + GXutil.upper( AV59Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13TermPesTpoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "C") == 0 )
            {
               AV13TermPesTpoDescription = httpContext.getMessage( "Colorantes", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "A") == 0 )
            {
               AV13TermPesTpoDescription = httpContext.getMessage( "Auxiliares", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A10177TermPesTpo), "T") == 0 )
            {
               AV13TermPesTpoDescription = httpContext.getMessage( "Todos", "") ;
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
            h97Q0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A942TermCod, "")), 30, Gx_line+10, 111, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8898TermDsc, "")), 115, Gx_line+10, 279, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13TermPesTpoDescription, "")), 283, Gx_line+10, 447, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8901TermPesUlt), "ZZZZZZZZZ9")), 451, Gx_line+10, 533, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8900TermPesPro, "")), 537, Gx_line+10, 701, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8899TermPes), "9")), 705, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("TTERPESWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTERPESWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("TTERPESWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV2 = 1 ;
      while ( AV70GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD") == 0 )
         {
            AV18TFTermCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD_SEL") == 0 )
         {
            AV19TFTermCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC") == 0 )
         {
            AV20TFTermDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC_SEL") == 0 )
         {
            AV21TFTermDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESTPO_SEL") == 0 )
         {
            AV26TFTermPesTpo_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV28TFTermPesTpo_Sels.fromJSonString(AV26TFTermPesTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESULT") == 0 )
         {
            AV46TFTermPesUlt = GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV47TFTermPesUlt_To = GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO") == 0 )
         {
            AV48TFTermPesPro = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO_SEL") == 0 )
         {
            AV49TFTermPesPro_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPES_SEL") == 0 )
         {
            AV50TFTermPes_Sel = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV70GXV2 = (int)(AV70GXV2+1) ;
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

   public void h97Q0( boolean bFoot ,
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
               AV40PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV37DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV42Title = AV54Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV42Title = "" ;
      AV12FilterFullText = "" ;
      AV19TFTermCod_Sel = "" ;
      AV18TFTermCod = "" ;
      AV21TFTermDsc_Sel = "" ;
      AV20TFTermDsc = "" ;
      AV28TFTermPesTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26TFTermPesTpo_SelsJson = "" ;
      AV29TFTermPesTpo_Sel = "" ;
      AV27TFTermPesTpo_SelDscs = "" ;
      AV30FilterTFTermPesTpo_SelValueDescription = "" ;
      AV51TFTermPesUlt_To_Description = "" ;
      AV49TFTermPesPro_Sel = "" ;
      AV48TFTermPesPro = "" ;
      A10177TermPesTpo = "" ;
      A942TermCod = "" ;
      A8898TermDsc = "" ;
      A8900TermPesPro = "" ;
      AV59Tterpeswwds_1_filterfulltext = "" ;
      AV60Tterpeswwds_2_tftermcod = "" ;
      AV61Tterpeswwds_3_tftermcod_sel = "" ;
      AV62Tterpeswwds_4_tftermdsc = "" ;
      AV63Tterpeswwds_5_tftermdsc_sel = "" ;
      AV64Tterpeswwds_6_tftermpestpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67Tterpeswwds_9_tftermpespro = "" ;
      AV68Tterpeswwds_10_tftermpespro_sel = "" ;
      lV59Tterpeswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV60Tterpeswwds_2_tftermcod = "" ;
      lV62Tterpeswwds_4_tftermdsc = "" ;
      lV67Tterpeswwds_9_tftermpespro = "" ;
      P097Q2_A8899TermPes = new byte[1] ;
      P097Q2_n8899TermPes = new boolean[] {false} ;
      P097Q2_A8900TermPesPro = new String[] {""} ;
      P097Q2_A8901TermPesUlt = new long[1] ;
      P097Q2_n8901TermPesUlt = new boolean[] {false} ;
      P097Q2_A8898TermDsc = new String[] {""} ;
      P097Q2_n8898TermDsc = new boolean[] {false} ;
      P097Q2_A942TermCod = new String[] {""} ;
      P097Q2_A10177TermPesTpo = new String[] {""} ;
      P097Q2_n10177TermPesTpo = new boolean[] {false} ;
      AV13TermPesTpoDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40PageInfo = "" ;
      AV37DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV54Pgmdesc = "" ;
      AV35AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterpeswwexportreport__default(),
         new Object[] {
             new Object[] {
            P097Q2_A8899TermPes, P097Q2_n8899TermPes, P097Q2_A8900TermPesPro, P097Q2_A8901TermPesUlt, P097Q2_n8901TermPesUlt, P097Q2_A8898TermDsc, P097Q2_n8898TermDsc, P097Q2_A942TermCod, P097Q2_A10177TermPesTpo, P097Q2_n10177TermPesTpo
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "TTERPESWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "TTERPESWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV50TFTermPes_Sel ;
   private byte A8899TermPes ;
   private byte AV69Tterpeswwds_11_tftermpes_sel ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV57GXV1 ;
   private int AV64Tterpeswwds_6_tftermpestpo_sels_size ;
   private int AV70GXV2 ;
   private long AV31i ;
   private long AV46TFTermPesUlt ;
   private long AV47TFTermPesUlt_To ;
   private long A8901TermPesUlt ;
   private long AV65Tterpeswwds_7_tftermpesult ;
   private long AV66Tterpeswwds_8_tftermpesult_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFTermCod_Sel ;
   private String AV18TFTermCod ;
   private String AV21TFTermDsc_Sel ;
   private String AV20TFTermDsc ;
   private String AV29TFTermPesTpo_Sel ;
   private String AV49TFTermPesPro_Sel ;
   private String AV48TFTermPesPro ;
   private String A10177TermPesTpo ;
   private String A942TermCod ;
   private String A8898TermDsc ;
   private String A8900TermPesPro ;
   private String AV60Tterpeswwds_2_tftermcod ;
   private String AV61Tterpeswwds_3_tftermcod_sel ;
   private String AV62Tterpeswwds_4_tftermdsc ;
   private String AV63Tterpeswwds_5_tftermdsc_sel ;
   private String AV67Tterpeswwds_9_tftermpespro ;
   private String AV68Tterpeswwds_10_tftermpespro_sel ;
   private String scmdbuf ;
   private String lV60Tterpeswwds_2_tftermcod ;
   private String lV62Tterpeswwds_4_tftermdsc ;
   private String lV67Tterpeswwds_9_tftermpespro ;
   private String AV54Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n8899TermPes ;
   private boolean n8901TermPesUlt ;
   private boolean n8898TermDsc ;
   private boolean n10177TermPesTpo ;
   private String AV26TFTermPesTpo_SelsJson ;
   private String AV42Title ;
   private String AV12FilterFullText ;
   private String AV27TFTermPesTpo_SelDscs ;
   private String AV30FilterTFTermPesTpo_SelValueDescription ;
   private String AV51TFTermPesUlt_To_Description ;
   private String AV59Tterpeswwds_1_filterfulltext ;
   private String lV59Tterpeswwds_1_filterfulltext ;
   private String AV13TermPesTpoDescription ;
   private String AV40PageInfo ;
   private String AV37DateInfo ;
   private String AV35AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P097Q2_A8899TermPes ;
   private boolean[] P097Q2_n8899TermPes ;
   private String[] P097Q2_A8900TermPesPro ;
   private long[] P097Q2_A8901TermPesUlt ;
   private boolean[] P097Q2_n8901TermPesUlt ;
   private String[] P097Q2_A8898TermDsc ;
   private boolean[] P097Q2_n8898TermDsc ;
   private String[] P097Q2_A942TermCod ;
   private String[] P097Q2_A10177TermPesTpo ;
   private boolean[] P097Q2_n10177TermPesTpo ;
   private GXSimpleCollection<String> AV28TFTermPesTpo_Sels ;
   private GXSimpleCollection<String> AV64Tterpeswwds_6_tftermpestpo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tterpeswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A10177TermPesTpo ,
                                          GXSimpleCollection<String> AV64Tterpeswwds_6_tftermpestpo_sels ,
                                          String AV61Tterpeswwds_3_tftermcod_sel ,
                                          String AV60Tterpeswwds_2_tftermcod ,
                                          String AV63Tterpeswwds_5_tftermdsc_sel ,
                                          String AV62Tterpeswwds_4_tftermdsc ,
                                          int AV64Tterpeswwds_6_tftermpestpo_sels_size ,
                                          long AV65Tterpeswwds_7_tftermpesult ,
                                          long AV66Tterpeswwds_8_tftermpesult_to ,
                                          String AV68Tterpeswwds_10_tftermpespro_sel ,
                                          String AV67Tterpeswwds_9_tftermpespro ,
                                          byte AV69Tterpeswwds_11_tftermpes_sel ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          long A8901TermPesUlt ,
                                          String A8900TermPesPro ,
                                          byte A8899TermPes ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV59Tterpeswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T2.TermPes, T1.TermPesPro, T1.TermPesUlt, T2.TermDsc, T1.TermCod, T1.TermPesTpo FROM (TXPTERMI1 T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod)" ;
      if ( (GXutil.strcmp("", AV61Tterpeswwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tterpeswwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tterpeswwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tterpeswwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tterpeswwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tterpeswwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TermDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV64Tterpeswwds_6_tftermpestpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV64Tterpeswwds_6_tftermpestpo_sels, "T1.TermPesTpo IN (", ")")+")");
      }
      if ( ! (0==AV65Tterpeswwds_7_tftermpesult) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV66Tterpeswwds_8_tftermpesult_to) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tterpeswwds_10_tftermpespro_sel)==0) && ( ! (GXutil.strcmp("", AV67Tterpeswwds_9_tftermpespro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermPesPro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tterpeswwds_10_tftermpespro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermPesPro = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV69Tterpeswwds_11_tftermpes_sel == 1 )
      {
         addWhere(sWhereString, "(T2.TermPes = 1)");
      }
      if ( AV69Tterpeswwds_11_tftermpes_sel == 2 )
      {
         addWhere(sWhereString, "(T2.TermPes = 0)");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesUlt" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesUlt DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TermDsc" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TermDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesTpo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesTpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TermPesPro" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TermPesPro DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TermPes" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TermPes DESC" ;
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
                  return conditional_P097Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
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
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
      }
   }

}

