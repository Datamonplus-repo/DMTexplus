package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmanufawwexportreport_impl extends GXWebReport
{
   public tmanufawwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV51Title = httpContext.getMessage( "Lista de Manufacturadores", "") ;
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
         hAFN0( true, 0) ;
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
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFManCod) && (0==AV18TFManCod_To) ) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFManCod), "ZZZ9")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFManCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Manufacturador", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFManCod_To_Description, "")), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFManCod_To), "ZZZ9")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFManNif_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFManNif_Sel, "@!")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFManNif)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFManNif, "@!")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFManNom_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFManNom_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFManNom)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFManNom, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFManDom_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFManDom_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFManDom)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFManDom, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV24TFManPob_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFManPob_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFManPob)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFManPob, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFManCpo_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFManCpo_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFManCpo)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFManCpo, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFManCp2_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C. Postal (cont)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFManCp2_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFManCp2)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C. Postal (cont)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFManCp2, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV29TFPrvCod) && (0==AV30TFPrvCod_To) ) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFPrvCod), "ZZ9")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFPrvCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Provincia", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrvCod_To_Description, "")), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFPrvCod_To), "ZZ9")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFPrvDsc_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFPrvDsc_Sel, "@!")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFPrvDsc)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrvDsc, "@!")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFManTel1_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telefono (1)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFManTel1_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFManTel1)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telefono (1)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFManTel1, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV36TFManTel2_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telefono (2)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFManTel2_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFManTel2)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telefono (2)", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFManTel2, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV38TFManFax_Sel)==0) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFManFax_Sel, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFManFax)==0) )
         {
            hAFN0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFManFax, "")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFManDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFManDto_To)==0) ) )
      {
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dto.", ""), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TFManDto, "Z9.99")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV57TFManDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dto.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAFN0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFManDto_To_Description, "")), 25, Gx_line+0, 149, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56TFManDto_To, "Z9.99")), 149, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hAFN0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hAFN0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Poblacion", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C. Postal", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C. Postal (cont)", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 495, Gx_line+10, 551, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telefono (1)", ""), 555, Gx_line+10, 610, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telefono (2)", ""), 614, Gx_line+10, 669, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 673, Gx_line+10, 728, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dto.", ""), 732, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV12FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV17TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV18TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV53TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV54TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV19TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV20TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV21TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV22TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV23TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV24TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV25TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV26TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV27TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV28TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV29TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV30TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV31TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV32TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV33TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV34TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV35TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV36TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV37TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV38TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV55TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV56TFManDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV67Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV69Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV71Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV71Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV73Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV75Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV77Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV81Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV81Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV83Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV85Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV85Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV87Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV87Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor P0AFN2 */
      pr_default.execute(0, new Object[] {lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to), lV67Trabajosexternos_tmanufawwds_4_tfmannif, AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV69Trabajosexternos_tmanufawwds_6_tfmannom, AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV71Trabajosexternos_tmanufawwds_8_tfmandom, AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV73Trabajosexternos_tmanufawwds_10_tfmanpob, AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV75Trabajosexternos_tmanufawwds_12_tfmancpo, AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV77Trabajosexternos_tmanufawwds_14_tfmancp2, AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV81Trabajosexternos_tmanufawwds_18_tfprvdsc, AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV83Trabajosexternos_tmanufawwds_20_tfmantel1, AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV85Trabajosexternos_tmanufawwds_22_tfmantel2, AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV87Trabajosexternos_tmanufawwds_24_tfmanfax, AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV89Trabajosexternos_tmanufawwds_26_tfmandto, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3409ManDto = P0AFN2_A3409ManDto[0] ;
         n3409ManDto = P0AFN2_n3409ManDto[0] ;
         A3301ManFax = P0AFN2_A3301ManFax[0] ;
         n3301ManFax = P0AFN2_n3301ManFax[0] ;
         A3300ManTel2 = P0AFN2_A3300ManTel2[0] ;
         n3300ManTel2 = P0AFN2_n3300ManTel2[0] ;
         A3299ManTel1 = P0AFN2_A3299ManTel1[0] ;
         n3299ManTel1 = P0AFN2_n3299ManTel1[0] ;
         A787PrvDsc = P0AFN2_A787PrvDsc[0] ;
         n787PrvDsc = P0AFN2_n787PrvDsc[0] ;
         A781PrvCod = P0AFN2_A781PrvCod[0] ;
         n781PrvCod = P0AFN2_n781PrvCod[0] ;
         A10743ManCp2 = P0AFN2_A10743ManCp2[0] ;
         n10743ManCp2 = P0AFN2_n10743ManCp2[0] ;
         A2252ManCpo = P0AFN2_A2252ManCpo[0] ;
         n2252ManCpo = P0AFN2_n2252ManCpo[0] ;
         A2251ManPob = P0AFN2_A2251ManPob[0] ;
         n2251ManPob = P0AFN2_n2251ManPob[0] ;
         A2250ManDom = P0AFN2_A2250ManDom[0] ;
         n2250ManDom = P0AFN2_n2250ManDom[0] ;
         A2249ManNom = P0AFN2_A2249ManNom[0] ;
         n2249ManNom = P0AFN2_n2249ManNom[0] ;
         A3302ManNif = P0AFN2_A3302ManNif[0] ;
         n3302ManNif = P0AFN2_n3302ManNif[0] ;
         A2248ManCod = P0AFN2_A2248ManCod[0] ;
         A396EmprCod = P0AFN2_A396EmprCod[0] ;
         A787PrvDsc = P0AFN2_A787PrvDsc[0] ;
         n787PrvDsc = P0AFN2_n787PrvDsc[0] ;
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
         hAFN0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3302ManNif, "@!")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2250ManDom, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2251ManPob, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2252ManCpo, "")), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10743ManCp2, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 495, Gx_line+10, 551, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3299ManTel1, "")), 555, Gx_line+10, 610, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3300ManTel2, "")), 614, Gx_line+10, 669, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3301ManFax, "")), 673, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3409ManDto, "Z9.99")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("TrabajosExternos.TMANUFAWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("TrabajosExternos.TMANUFAWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV17TFManCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFManCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF") == 0 )
         {
            AV53TFManNif = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF_SEL") == 0 )
         {
            AV54TFManNif_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV19TFManNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV20TFManNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM") == 0 )
         {
            AV21TFManDom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM_SEL") == 0 )
         {
            AV22TFManDom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB") == 0 )
         {
            AV23TFManPob = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB_SEL") == 0 )
         {
            AV24TFManPob_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO") == 0 )
         {
            AV25TFManCpo = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO_SEL") == 0 )
         {
            AV26TFManCpo_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2") == 0 )
         {
            AV27TFManCp2 = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2_SEL") == 0 )
         {
            AV28TFManCp2_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV29TFPrvCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFPrvCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV31TFPrvDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV32TFPrvDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1") == 0 )
         {
            AV33TFManTel1 = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1_SEL") == 0 )
         {
            AV34TFManTel1_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2") == 0 )
         {
            AV35TFManTel2 = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2_SEL") == 0 )
         {
            AV36TFManTel2_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX") == 0 )
         {
            AV37TFManFax = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX_SEL") == 0 )
         {
            AV38TFManFax_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDTO") == 0 )
         {
            AV55TFManDto = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFManDto_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
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

   public void hAFN0( boolean bFoot ,
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
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
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
            AV51Title = AV60Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV12FilterFullText = "" ;
      AV39TFManCod_To_Description = "" ;
      AV54TFManNif_Sel = "" ;
      AV53TFManNif = "" ;
      AV20TFManNom_Sel = "" ;
      AV19TFManNom = "" ;
      AV22TFManDom_Sel = "" ;
      AV21TFManDom = "" ;
      AV24TFManPob_Sel = "" ;
      AV23TFManPob = "" ;
      AV26TFManCpo_Sel = "" ;
      AV25TFManCpo = "" ;
      AV28TFManCp2_Sel = "" ;
      AV27TFManCp2 = "" ;
      AV40TFPrvCod_To_Description = "" ;
      AV32TFPrvDsc_Sel = "" ;
      AV31TFPrvDsc = "" ;
      AV34TFManTel1_Sel = "" ;
      AV33TFManTel1 = "" ;
      AV36TFManTel2_Sel = "" ;
      AV35TFManTel2 = "" ;
      AV38TFManFax_Sel = "" ;
      AV37TFManFax = "" ;
      AV55TFManDto = DecimalUtil.ZERO ;
      AV56TFManDto_To = DecimalUtil.ZERO ;
      AV57TFManDto_To_Description = "" ;
      A3302ManNif = "" ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A2252ManCpo = "" ;
      A10743ManCp2 = "" ;
      A787PrvDsc = "" ;
      A3299ManTel1 = "" ;
      A3300ManTel2 = "" ;
      A3301ManFax = "" ;
      A3409ManDto = DecimalUtil.ZERO ;
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = "" ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = "" ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = "" ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = "" ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = "" ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = "" ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = "" ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = "" ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = "" ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = "" ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = DecimalUtil.ZERO ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      lV67Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      lV69Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      lV71Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      lV73Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      lV75Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      lV77Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      lV81Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      lV83Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      lV85Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      lV87Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      P0AFN2_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFN2_n3409ManDto = new boolean[] {false} ;
      P0AFN2_A3301ManFax = new String[] {""} ;
      P0AFN2_n3301ManFax = new boolean[] {false} ;
      P0AFN2_A3300ManTel2 = new String[] {""} ;
      P0AFN2_n3300ManTel2 = new boolean[] {false} ;
      P0AFN2_A3299ManTel1 = new String[] {""} ;
      P0AFN2_n3299ManTel1 = new boolean[] {false} ;
      P0AFN2_A787PrvDsc = new String[] {""} ;
      P0AFN2_n787PrvDsc = new boolean[] {false} ;
      P0AFN2_A781PrvCod = new short[1] ;
      P0AFN2_n781PrvCod = new boolean[] {false} ;
      P0AFN2_A10743ManCp2 = new String[] {""} ;
      P0AFN2_n10743ManCp2 = new boolean[] {false} ;
      P0AFN2_A2252ManCpo = new String[] {""} ;
      P0AFN2_n2252ManCpo = new boolean[] {false} ;
      P0AFN2_A2251ManPob = new String[] {""} ;
      P0AFN2_n2251ManPob = new boolean[] {false} ;
      P0AFN2_A2250ManDom = new String[] {""} ;
      P0AFN2_n2250ManDom = new boolean[] {false} ;
      P0AFN2_A2249ManNom = new String[] {""} ;
      P0AFN2_n2249ManNom = new boolean[] {false} ;
      P0AFN2_A3302ManNif = new String[] {""} ;
      P0AFN2_n3302ManNif = new boolean[] {false} ;
      P0AFN2_A2248ManCod = new short[1] ;
      P0AFN2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49PageInfo = "" ;
      AV46DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV60Pgmdesc = "" ;
      AV44AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufawwexportreport__default(),
         new Object[] {
             new Object[] {
            P0AFN2_A3409ManDto, P0AFN2_n3409ManDto, P0AFN2_A3301ManFax, P0AFN2_n3301ManFax, P0AFN2_A3300ManTel2, P0AFN2_n3300ManTel2, P0AFN2_A3299ManTel1, P0AFN2_n3299ManTel1, P0AFN2_A787PrvDsc, P0AFN2_n787PrvDsc,
            P0AFN2_A781PrvCod, P0AFN2_n781PrvCod, P0AFN2_A10743ManCp2, P0AFN2_n10743ManCp2, P0AFN2_A2252ManCpo, P0AFN2_n2252ManCpo, P0AFN2_A2251ManPob, P0AFN2_n2251ManPob, P0AFN2_A2250ManDom, P0AFN2_n2250ManDom,
            P0AFN2_A2249ManNom, P0AFN2_n2249ManNom, P0AFN2_A3302ManNif, P0AFN2_n3302ManNif, P0AFN2_A2248ManCod, P0AFN2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV60Pgmdesc = httpContext.getMessage( "TMANUFAWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV60Pgmdesc = httpContext.getMessage( "TMANUFAWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV17TFManCod ;
   private short AV18TFManCod_To ;
   private short AV29TFPrvCod ;
   private short AV30TFPrvCod_To ;
   private short A2248ManCod ;
   private short A781PrvCod ;
   private short AV65Trabajosexternos_tmanufawwds_2_tfmancod ;
   private short AV66Trabajosexternos_tmanufawwds_3_tfmancod_to ;
   private short AV79Trabajosexternos_tmanufawwds_16_tfprvcod ;
   private short AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV91GXV1 ;
   private java.math.BigDecimal AV55TFManDto ;
   private java.math.BigDecimal AV56TFManDto_To ;
   private java.math.BigDecimal A3409ManDto ;
   private java.math.BigDecimal AV89Trabajosexternos_tmanufawwds_26_tfmandto ;
   private java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV54TFManNif_Sel ;
   private String AV53TFManNif ;
   private String AV20TFManNom_Sel ;
   private String AV19TFManNom ;
   private String AV22TFManDom_Sel ;
   private String AV21TFManDom ;
   private String AV24TFManPob_Sel ;
   private String AV23TFManPob ;
   private String AV26TFManCpo_Sel ;
   private String AV25TFManCpo ;
   private String AV28TFManCp2_Sel ;
   private String AV27TFManCp2 ;
   private String AV32TFPrvDsc_Sel ;
   private String AV31TFPrvDsc ;
   private String AV34TFManTel1_Sel ;
   private String AV33TFManTel1 ;
   private String AV36TFManTel2_Sel ;
   private String AV35TFManTel2 ;
   private String AV38TFManFax_Sel ;
   private String AV37TFManFax ;
   private String A3302ManNif ;
   private String A2249ManNom ;
   private String A2250ManDom ;
   private String A2251ManPob ;
   private String A2252ManCpo ;
   private String A10743ManCp2 ;
   private String A787PrvDsc ;
   private String A3299ManTel1 ;
   private String A3300ManTel2 ;
   private String A3301ManFax ;
   private String AV67Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ;
   private String AV69Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ;
   private String AV71Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ;
   private String AV73Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ;
   private String AV75Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ;
   private String AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ;
   private String AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ;
   private String AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ;
   private String AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ;
   private String AV87Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ;
   private String scmdbuf ;
   private String lV67Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String lV69Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String lV71Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String lV73Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String lV75Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String lV77Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String lV81Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String lV83Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String lV85Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String lV87Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String A396EmprCod ;
   private String AV60Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n3409ManDto ;
   private boolean n3301ManFax ;
   private boolean n3300ManTel2 ;
   private boolean n3299ManTel1 ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean n3302ManNif ;
   private String AV51Title ;
   private String AV12FilterFullText ;
   private String AV39TFManCod_To_Description ;
   private String AV40TFPrvCod_To_Description ;
   private String AV57TFManDto_To_Description ;
   private String AV64Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String lV64Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String AV49PageInfo ;
   private String AV46DateInfo ;
   private String AV44AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AFN2_A3409ManDto ;
   private boolean[] P0AFN2_n3409ManDto ;
   private String[] P0AFN2_A3301ManFax ;
   private boolean[] P0AFN2_n3301ManFax ;
   private String[] P0AFN2_A3300ManTel2 ;
   private boolean[] P0AFN2_n3300ManTel2 ;
   private String[] P0AFN2_A3299ManTel1 ;
   private boolean[] P0AFN2_n3299ManTel1 ;
   private String[] P0AFN2_A787PrvDsc ;
   private boolean[] P0AFN2_n787PrvDsc ;
   private short[] P0AFN2_A781PrvCod ;
   private boolean[] P0AFN2_n781PrvCod ;
   private String[] P0AFN2_A10743ManCp2 ;
   private boolean[] P0AFN2_n10743ManCp2 ;
   private String[] P0AFN2_A2252ManCpo ;
   private boolean[] P0AFN2_n2252ManCpo ;
   private String[] P0AFN2_A2251ManPob ;
   private boolean[] P0AFN2_n2251ManPob ;
   private String[] P0AFN2_A2250ManDom ;
   private boolean[] P0AFN2_n2250ManDom ;
   private String[] P0AFN2_A2249ManNom ;
   private boolean[] P0AFN2_n2249ManNom ;
   private String[] P0AFN2_A3302ManNif ;
   private boolean[] P0AFN2_n3302ManNif ;
   private short[] P0AFN2_A2248ManCod ;
   private String[] P0AFN2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class tmanufawwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AFN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV65Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV66Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV79Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod, T1.EmprCod" ;
      scmdbuf += " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV79Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManNif" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManNif DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManDom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManDom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManPob" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManPob DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCpo" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCp2" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCp2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManTel1" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManTel1 DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManTel2" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManTel2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManFax" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManFax DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManDto" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManDto DESC" ;
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
                  return conditional_P0AFN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 34);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

