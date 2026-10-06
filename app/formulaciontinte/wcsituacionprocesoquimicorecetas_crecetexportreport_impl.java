package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetas_crecetexportreport_impl extends GXWebReport
{
   public wcsituacionprocesoquimicorecetas_crecetexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV54Title = httpContext.getMessage( "Lista de Mantenimiento Procesos Quimicos", "") ;
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
         h9CL0( true, 0) ;
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
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarNHdr_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFBarNHdr_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFBarNHdr)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFBarNHdr, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV22TFCliCod) && (0==AV23TFCliCod_To) ) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFCliCod_To_Description, "")), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod_To), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFCliNom_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFCliNom_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFCliNom)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFBarSer_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFBarSer_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFBarSer)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFBarSer, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFBarSerDsc_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFBarSerDsc_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFBarSerDsc)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFBarSerDsc, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFBarColNom_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFBarColNom_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFBarColNom)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFBarColNom, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV32TFBarColNum) && (0==AV33TFBarColNum_To) ) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero del Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFBarColNum), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFBarColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero del Color", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFBarColNum_To_Description, "")), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFBarColNum_To), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFBarNomCli_Sel)==0) )
      {
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFBarNomCli_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFBarNomCli)==0) )
         {
            h9CL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFBarNomCli, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV38TFRecAcab_Sels.fromJSonString(AV36TFRecAcab_SelsJson, null);
      if ( ! ( AV38TFRecAcab_Sels.size() == 0 ) )
      {
         AV43i = 1 ;
         AV61GXV1 = 1 ;
         while ( AV61GXV1 <= AV38TFRecAcab_Sels.size() )
         {
            AV39TFRecAcab_Sel = (String)AV38TFRecAcab_Sels.elementAt(-1+AV61GXV1) ;
            if ( AV43i == 1 )
            {
               AV37TFRecAcab_SelDscs = "" ;
            }
            else
            {
               AV37TFRecAcab_SelDscs += ", " ;
            }
            AV42FilterTFRecAcab_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV39TFRecAcab_Sel), "N") == 0 )
            {
               AV42FilterTFRecAcab_SelValueDescription = httpContext.getMessage( "Receta Tinte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV39TFRecAcab_Sel), "S") == 0 )
            {
               AV42FilterTFRecAcab_SelValueDescription = httpContext.getMessage( "Receta acabado", "") ;
            }
            AV37TFRecAcab_SelDscs += AV42FilterTFRecAcab_SelValueDescription ;
            AV43i = (long)(AV43i+1) ;
            AV61GXV1 = (int)(AV61GXV1+1) ;
         }
         h9CL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFRecAcab_SelDscs, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9CL0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9CL0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 30, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 94, Gx_line+10, 154, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 158, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 282, Gx_line+10, 402, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 406, Gx_line+10, 527, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 531, Gx_line+10, 592, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero del Color", ""), 596, Gx_line+10, 657, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 661, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("", 726, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV14FilterFullText ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV20TFBarNHdr ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV22TFCliCod ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV23TFCliCod_To ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV24TFCliNom ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV25TFCliNom_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV26TFBarSer ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV27TFBarSer_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV28TFBarSerDsc ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV29TFBarSerDsc_Sel ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV30TFBarColNom ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV31TFBarColNom_Sel ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV32TFBarColNum ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV33TFBarColNum_To ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV34TFBarNomCli ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV35TFBarNomCli_Sel ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV38TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV10Emprcod ,
                                           AV11Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CL2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11Proforcod, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09CL2_A2804RecLinMaq[0] ;
         A764ProForCod = P09CL2_A764ProForCod[0] ;
         A396EmprCod = P09CL2_A396EmprCod[0] ;
         A6039RecAcab = P09CL2_A6039RecAcab[0] ;
         n6039RecAcab = P09CL2_n6039RecAcab[0] ;
         A1234BarNomCli = P09CL2_A1234BarNomCli[0] ;
         A136BarColNum = P09CL2_A136BarColNum[0] ;
         A135BarColNom = P09CL2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CL2_A1652BarSerDsc[0] ;
         A212BarSer = P09CL2_A212BarSer[0] ;
         A279CliNom = P09CL2_A279CliNom[0] ;
         A252CliCod = P09CL2_A252CliCod[0] ;
         n252CliCod = P09CL2_n252CliCod[0] ;
         A130BarCodPar = P09CL2_A130BarCodPar[0] ;
         A132BarCodReo = P09CL2_A132BarCodReo[0] ;
         A129BarCod = P09CL2_A129BarCod[0] ;
         A1273RecLinPro = P09CL2_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CL2_A1234BarNomCli[0] ;
         A136BarColNum = P09CL2_A136BarColNum[0] ;
         A135BarColNom = P09CL2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CL2_A1652BarSerDsc[0] ;
         A212BarSer = P09CL2_A212BarSer[0] ;
         A252CliCod = P09CL2_A252CliCod[0] ;
         n252CliCod = P09CL2_n252CliCod[0] ;
         A279CliNom = P09CL2_A279CliNom[0] ;
         A6039RecAcab = P09CL2_A6039RecAcab[0] ;
         n6039RecAcab = P09CL2_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV15RecAcabDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "N") == 0 )
         {
            AV15RecAcabDescription = httpContext.getMessage( "Receta Tinte", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "S") == 0 )
         {
            AV15RecAcabDescription = httpContext.getMessage( "Receta acabado", "") ;
         }
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
         h9CL0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 30, Gx_line+10, 90, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 94, Gx_line+10, 154, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 158, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 282, Gx_line+10, 402, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 406, Gx_line+10, 527, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 531, Gx_line+10, 592, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 596, Gx_line+10, 657, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 661, Gx_line+10, 722, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15RecAcabDescription, "")), 726, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV16Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV16Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      AV12OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV2 = 1 ;
      while ( AV81GXV2 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV2));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV20TFBarNHdr = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV21TFBarNHdr_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV22TFCliCod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFCliCod_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV24TFCliNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV25TFCliNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV26TFBarSer = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV27TFBarSer_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV28TFBarSerDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV29TFBarSerDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV30TFBarColNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV31TFBarColNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV32TFBarColNum = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarColNum_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV34TFBarNomCli = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV35TFBarNomCli_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV36TFRecAcab_SelsJson = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV38TFRecAcab_Sels.fromJSonString(AV36TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV11Proforcod = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV2 = (int)(AV81GXV2+1) ;
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

   public void h9CL0( boolean bFoot ,
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
               AV52PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV49DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV54Title = AV58Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV54Title = "" ;
      AV14FilterFullText = "" ;
      AV21TFBarNHdr_Sel = "" ;
      AV20TFBarNHdr = "" ;
      AV40TFCliCod_To_Description = "" ;
      AV25TFCliNom_Sel = "" ;
      AV24TFCliNom = "" ;
      AV27TFBarSer_Sel = "" ;
      AV26TFBarSer = "" ;
      AV29TFBarSerDsc_Sel = "" ;
      AV28TFBarSerDsc = "" ;
      AV31TFBarColNom_Sel = "" ;
      AV30TFBarColNom = "" ;
      AV41TFBarColNum_To_Description = "" ;
      AV35TFBarNomCli_Sel = "" ;
      AV34TFBarNomCli = "" ;
      AV38TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36TFRecAcab_SelsJson = "" ;
      AV39TFRecAcab_Sel = "" ;
      AV37TFRecAcab_SelDscs = "" ;
      AV42FilterTFRecAcab_SelValueDescription = "" ;
      A6039RecAcab = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = "" ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = "" ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      lV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      lV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      AV10Emprcod = "" ;
      AV11Proforcod = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09CL2_A2804RecLinMaq = new short[1] ;
      P09CL2_A764ProForCod = new String[] {""} ;
      P09CL2_A396EmprCod = new String[] {""} ;
      P09CL2_A6039RecAcab = new String[] {""} ;
      P09CL2_n6039RecAcab = new boolean[] {false} ;
      P09CL2_A1234BarNomCli = new String[] {""} ;
      P09CL2_A136BarColNum = new int[1] ;
      P09CL2_A135BarColNom = new String[] {""} ;
      P09CL2_A1652BarSerDsc = new String[] {""} ;
      P09CL2_A212BarSer = new String[] {""} ;
      P09CL2_A279CliNom = new String[] {""} ;
      P09CL2_A252CliCod = new int[1] ;
      P09CL2_n252CliCod = new boolean[] {false} ;
      P09CL2_A130BarCodPar = new String[] {""} ;
      P09CL2_A132BarCodReo = new byte[1] ;
      P09CL2_A129BarCod = new int[1] ;
      P09CL2_A1273RecLinPro = new byte[1] ;
      AV15RecAcabDescription = "" ;
      AV16Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52PageInfo = "" ;
      AV49DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV58Pgmdesc = "" ;
      AV47AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecetexportreport__default(),
         new Object[] {
             new Object[] {
            P09CL2_A2804RecLinMaq, P09CL2_A764ProForCod, P09CL2_A396EmprCod, P09CL2_A6039RecAcab, P09CL2_n6039RecAcab, P09CL2_A1234BarNomCli, P09CL2_A136BarColNum, P09CL2_A135BarColNom, P09CL2_A1652BarSerDsc, P09CL2_A212BarSer,
            P09CL2_A279CliNom, P09CL2_A252CliCod, P09CL2_n252CliCod, P09CL2_A130BarCodPar, P09CL2_A132BarCodReo, P09CL2_A129BarCod, P09CL2_A1273RecLinPro
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV58Pgmdesc = httpContext.getMessage( "WCSituacion Proceso Quimico Recetas_CRECETExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV58Pgmdesc = httpContext.getMessage( "WCSituacion Proceso Quimico Recetas_CRECETExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short gxcookieaux ;
   private short AV12OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV22TFCliCod ;
   private int AV23TFCliCod_To ;
   private int AV32TFBarColNum ;
   private int AV33TFBarColNum_To ;
   private int AV61GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ;
   private int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ;
   private int AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ;
   private int AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ;
   private int AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV81GXV2 ;
   private long AV43i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFBarNHdr_Sel ;
   private String AV20TFBarNHdr ;
   private String AV25TFCliNom_Sel ;
   private String AV24TFCliNom ;
   private String AV27TFBarSer_Sel ;
   private String AV26TFBarSer ;
   private String AV29TFBarSerDsc_Sel ;
   private String AV28TFBarSerDsc ;
   private String AV31TFBarColNom_Sel ;
   private String AV30TFBarColNom ;
   private String AV35TFBarNomCli_Sel ;
   private String AV34TFBarNomCli ;
   private String AV39TFRecAcab_Sel ;
   private String A6039RecAcab ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ;
   private String AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ;
   private String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ;
   private String AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ;
   private String AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ;
   private String scmdbuf ;
   private String lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String lV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String lV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String A130BarCodPar ;
   private String AV10Emprcod ;
   private String AV11Proforcod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV58Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n252CliCod ;
   private String AV36TFRecAcab_SelsJson ;
   private String AV54Title ;
   private String AV14FilterFullText ;
   private String AV40TFCliCod_To_Description ;
   private String AV41TFBarColNum_To_Description ;
   private String AV37TFRecAcab_SelDscs ;
   private String AV42FilterTFRecAcab_SelValueDescription ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String lV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String AV15RecAcabDescription ;
   private String AV52PageInfo ;
   private String AV49DateInfo ;
   private String AV47AppName ;
   private com.genexus.webpanels.WebSession AV16Session ;
   private IDataStoreProvider pr_default ;
   private short[] P09CL2_A2804RecLinMaq ;
   private String[] P09CL2_A764ProForCod ;
   private String[] P09CL2_A396EmprCod ;
   private String[] P09CL2_A6039RecAcab ;
   private boolean[] P09CL2_n6039RecAcab ;
   private String[] P09CL2_A1234BarNomCli ;
   private int[] P09CL2_A136BarColNum ;
   private String[] P09CL2_A135BarColNom ;
   private String[] P09CL2_A1652BarSerDsc ;
   private String[] P09CL2_A212BarSer ;
   private String[] P09CL2_A279CliNom ;
   private int[] P09CL2_A252CliCod ;
   private boolean[] P09CL2_n252CliCod ;
   private String[] P09CL2_A130BarCodPar ;
   private byte[] P09CL2_A132BarCodReo ;
   private int[] P09CL2_A129BarCod ;
   private byte[] P09CL2_A1273RecLinPro ;
   private GXSimpleCollection<String> AV38TFRecAcab_Sels ;
   private GXSimpleCollection<String> AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetas_crecetexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV10Emprcod ,
                                          String AV11Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.ProForCod, T1.EmprCod, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RecAcab" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RecAcab DESC" ;
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
                  return conditional_P09CL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
      }
   }

}

