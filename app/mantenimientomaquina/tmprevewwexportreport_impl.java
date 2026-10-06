package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmprevewwexportreport_impl extends GXWebReport
{
   public tmprevewwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV76Title = httpContext.getMessage( "Lista de Mantenimiento Preventivo", "") ;
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
         h8JW0( true, 0) ;
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
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFPMCod) && (0==AV19TFPMCod_To) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "# Ord. Prev.", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFPMCod), "ZZZZZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV54TFPMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "# Ord. Prev.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFPMCod_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFPMCod_To), "ZZZZZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFPMDsc_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPMDsc_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFPMDsc)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPMDsc, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFPMMaqCod_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPMMaqCod_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPMMaqCod)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPMMaqCod, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFPMMaqDsc_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFPMMaqDsc_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFPMMaqDsc)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFPMMaqDsc, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV32TFPMEst_Sels.fromJSonString(AV30TFPMEst_SelsJson, null);
      if ( ! ( AV32TFPMEst_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV104GXV1 = 1 ;
         while ( AV104GXV1 <= AV32TFPMEst_Sels.size() )
         {
            AV33TFPMEst_Sel = (String)AV32TFPMEst_Sels.elementAt(-1+AV104GXV1) ;
            if ( AV65i == 1 )
            {
               AV31TFPMEst_SelDscs = "" ;
            }
            else
            {
               AV31TFPMEst_SelDscs += ", " ;
            }
            AV56FilterTFPMEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV33TFPMEst_Sel), "A") == 0 )
            {
               AV56FilterTFPMEst_SelValueDescription = httpContext.getMessage( "Activa", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV33TFPMEst_Sel), "I") == 0 )
            {
               AV56FilterTFPMEst_SelValueDescription = httpContext.getMessage( "Inactiva", "") ;
            }
            AV31TFPMEst_SelDscs += AV56FilterTFPMEst_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV104GXV1 = (int)(AV104GXV1+1) ;
         }
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPMEst_SelDscs, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22TFPMFchCre)) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Creación", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV22TFPMFchCre, "99/99/99"), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFPMIni)) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV36TFPMIni, "99/99/99"), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFPMUlt)) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Última", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV40TFPMUlt, "99/99/99"), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFPMFin)) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV38TFPMFin, "99/99/99"), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFPMUsuCre_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea el Preventivo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPMUsuCre_Sel, "@!")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFPMUsuCre)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea el Preventivo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPMUsuCre, "@!")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV44TFPMDias) && (0==AV45TFPMDias_To) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Días", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFPMDias), "ZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFPMDias_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Días", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFPMDias_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFPMDias_To), "ZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV89TFPMDiasPaviso) && (0==AV90TFPMDiasPaviso_To) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Días pre-aviso", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89TFPMDiasPaviso), "ZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV91TFPMDiasPaviso_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Días pre-aviso", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91TFPMDiasPaviso_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV90TFPMDiasPaviso_To), "ZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPMUso)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPMUso_To)==0) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Uso Equipo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFPMUso, "ZZZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFPMUso_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Uso Equipo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFPMUso_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFPMUso_To, "ZZZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPMUsoMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPMUsoMts_To)==0) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Uso Mts.", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52TFPMUsoMts, "ZZZZZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV64TFPMUsoMts_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Uso Mts.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFPMUsoMts_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53TFPMUsoMts_To, "ZZZZZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV93TFPMTipoDsc_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TFPMTipoDsc_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV92TFPMTipoDsc)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92TFPMTipoDsc, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV46TFPMOrd) && (0==AV47TFPMOrd_To) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden Actual", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFPMOrd), "ZZZZZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFPMOrd_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFPMOrd_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFPMOrd_To), "ZZZZZZZ9")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPMTie)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPMTie_To)==0) ) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TFPMTie, "ZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV63TFPMTie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tiempo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFPMTie_To_Description, "")), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49TFPMTie_To, "ZZ9.99")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFPMPla_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Planificar", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFPMPla_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFPMPla)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Planificar", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFPMPla, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFPMTxt_Sel)==0) )
      {
         h8JW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Texto del Preventivo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPMTxt_Sel, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFPMTxt)==0) )
         {
            h8JW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Texto del Preventivo", ""), 25, Gx_line+0, 184, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFPMTxt, "")), 184, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8JW0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8JW0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Ord. Prev.", ""), 30, Gx_line+10, 66, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 70, Gx_line+10, 106, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 110, Gx_line+10, 146, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 150, Gx_line+10, 186, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 190, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Creación", ""), 230, Gx_line+10, 266, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 270, Gx_line+10, 306, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Última", ""), 310, Gx_line+10, 346, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 350, Gx_line+10, 386, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea el Preventivo", ""), 390, Gx_line+10, 426, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Días", ""), 430, Gx_line+10, 466, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Días pre-aviso", ""), 470, Gx_line+10, 506, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Uso Equipo", ""), 510, Gx_line+10, 546, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Uso Mts.", ""), 550, Gx_line+10, 586, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 590, Gx_line+10, 626, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden Actual", ""), 630, Gx_line+10, 666, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 670, Gx_line+10, 706, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Planificar", ""), 710, Gx_line+10, 746, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Texto del Preventivo", ""), 750, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV12FilterFullText ;
      AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV18TFPMCod ;
      AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV19TFPMCod_To ;
      AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV20TFPMDsc ;
      AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV21TFPMDsc_Sel ;
      AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV26TFPMMaqCod ;
      AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV27TFPMMaqCod_Sel ;
      AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV28TFPMMaqDsc ;
      AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV29TFPMMaqDsc_Sel ;
      AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV32TFPMEst_Sels ;
      AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV22TFPMFchCre ;
      AV117Mantenimientomaquina_tmprevewwds_12_tfpmini = AV36TFPMIni ;
      AV118Mantenimientomaquina_tmprevewwds_13_tfpmult = AV40TFPMUlt ;
      AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV38TFPMFin ;
      AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV24TFPMUsuCre ;
      AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV25TFPMUsuCre_Sel ;
      AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV44TFPMDias ;
      AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV45TFPMDias_To ;
      AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV89TFPMDiasPaviso ;
      AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV90TFPMDiasPaviso_To ;
      AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV42TFPMUso ;
      AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV43TFPMUso_To ;
      AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV52TFPMUsoMts ;
      AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV53TFPMUsoMts_To ;
      AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV92TFPMTipoDsc ;
      AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV93TFPMTipoDsc_Sel ;
      AV132Mantenimientomaquina_tmprevewwds_27_tfpmord = AV46TFPMOrd ;
      AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV47TFPMOrd_To ;
      AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV48TFPMTie ;
      AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV49TFPMTie_To ;
      AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV50TFPMPla ;
      AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV51TFPMPla_Sel ;
      AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV34TFPMTxt ;
      AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV35TFPMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) ,
                                           AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                           AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                           AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                           AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                           AV117Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                           AV118Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                           AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                           AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                           AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                           AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                           AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                           AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                           AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                           AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                           Integer.valueOf(AV132Mantenimientomaquina_tmprevewwds_27_tfpmord) ,
                                           Integer.valueOf(AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to) ,
                                           AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                           AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                           AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                           AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                           AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                           AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           A14272PMTipoDsc ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc), 30, "%") ;
      lV136Mantenimientomaquina_tmprevewwds_31_tfpmpla = GXutil.padr( GXutil.rtrim( AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla), 1, "%") ;
      lV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt = GXutil.concat( GXutil.rtrim( AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt), "%", "") ;
      /* Using cursor P08JW2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod), Integer.valueOf(AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to), lV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc, AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel, lV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod, AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel, lV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc, AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel, AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre, AV117Mantenimientomaquina_tmprevewwds_12_tfpmini, AV118Mantenimientomaquina_tmprevewwds_13_tfpmult, AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin, lV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre, AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias), Short.valueOf(AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to), Short.valueOf(AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to), AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso, AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to, AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts, AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to, lV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc, AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel, Integer.valueOf(AV132Mantenimientomaquina_tmprevewwds_27_tfpmord), Integer.valueOf(AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to), AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie, AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to, lV136Mantenimientomaquina_tmprevewwds_31_tfpmpla, AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel, lV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt, AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08JW2_A396EmprCod[0] ;
         A14271PMTipoID = P08JW2_A14271PMTipoID[0] ;
         A9483PMTxt = P08JW2_A9483PMTxt[0] ;
         n9483PMTxt = P08JW2_n9483PMTxt[0] ;
         A11456PMPla = P08JW2_A11456PMPla[0] ;
         A11455PMTie = P08JW2_A11455PMTie[0] ;
         A9488PMOrd = P08JW2_A9488PMOrd[0] ;
         n9488PMOrd = P08JW2_n9488PMOrd[0] ;
         A14272PMTipoDsc = P08JW2_A14272PMTipoDsc[0] ;
         A13013PMUsoMts = P08JW2_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JW2_n13013PMUsoMts[0] ;
         A11454PMUso = P08JW2_A11454PMUso[0] ;
         n11454PMUso = P08JW2_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JW2_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JW2_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JW2_A9487PMDias[0] ;
         n9487PMDias = P08JW2_n9487PMDias[0] ;
         A9475PMUsuCre = P08JW2_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JW2_n9475PMUsuCre[0] ;
         A9485PMFin = P08JW2_A9485PMFin[0] ;
         n9485PMFin = P08JW2_n9485PMFin[0] ;
         A9486PMUlt = P08JW2_A9486PMUlt[0] ;
         n9486PMUlt = P08JW2_n9486PMUlt[0] ;
         A9484PMIni = P08JW2_A9484PMIni[0] ;
         n9484PMIni = P08JW2_n9484PMIni[0] ;
         A9474PMFchCre = P08JW2_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JW2_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JW2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JW2_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JW2_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JW2_n9476PMMaqCod[0] ;
         A9473PMDsc = P08JW2_A9473PMDsc[0] ;
         n9473PMDsc = P08JW2_n9473PMDsc[0] ;
         A9429PMCod = P08JW2_A9429PMCod[0] ;
         A9478PMEst = P08JW2_A9478PMEst[0] ;
         n9478PMEst = P08JW2_n9478PMEst[0] ;
         A14272PMTipoDsc = P08JW2_A14272PMTipoDsc[0] ;
         A9477PMMaqDsc = P08JW2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JW2_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14272PMTipoDsc) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13PMEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9478PMEst), "A") == 0 )
            {
               AV13PMEstDescription = httpContext.getMessage( "Activa", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9478PMEst), "I") == 0 )
            {
               AV13PMEstDescription = httpContext.getMessage( "Inactiva", "") ;
            }
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
            h8JW0( false, 66) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 30, Gx_line+10, 66, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9473PMDsc, "")), 70, Gx_line+10, 106, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9476PMMaqCod, "")), 110, Gx_line+10, 146, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9477PMMaqDsc, "")), 150, Gx_line+10, 186, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13PMEstDescription, "")), 190, Gx_line+10, 226, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9474PMFchCre, "99/99/99"), 230, Gx_line+10, 266, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9484PMIni, "99/99/99"), 270, Gx_line+10, 306, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9486PMUlt, "99/99/99"), 310, Gx_line+10, 346, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9485PMFin, "99/99/99"), 350, Gx_line+10, 386, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")), 390, Gx_line+10, 426, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9")), 430, Gx_line+10, 466, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14275PMDiasPavi), "ZZZ9")), 470, Gx_line+10, 506, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11454PMUso, "ZZZZ9.99")), 510, Gx_line+10, 546, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99")), 550, Gx_line+10, 586, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14272PMTipoDsc, "")), 590, Gx_line+10, 626, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9")), 630, Gx_line+10, 666, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11455PMTie, "ZZ9.99")), 670, Gx_line+10, 706, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11456PMPla, "")), 710, Gx_line+10, 746, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9483PMTxt, "")), 750, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("MantenimientoMaquina.TMPreveWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMPreveWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("MantenimientoMaquina.TMPreveWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV140GXV2 = 1 ;
      while ( AV140GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV140GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV18TFPMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV20TFPMDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV21TFPMDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD") == 0 )
         {
            AV26TFPMMaqCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD_SEL") == 0 )
         {
            AV27TFPMMaqCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC") == 0 )
         {
            AV28TFPMMaqDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC_SEL") == 0 )
         {
            AV29TFPMMaqDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMEST_SEL") == 0 )
         {
            AV30TFPMEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV32TFPMEst_Sels.fromJSonString(AV30TFPMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFCHCRE") == 0 )
         {
            AV22TFPMFchCre = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMINI") == 0 )
         {
            AV36TFPMIni = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMULT") == 0 )
         {
            AV40TFPMUlt = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFIN") == 0 )
         {
            AV38TFPMFin = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE") == 0 )
         {
            AV24TFPMUsuCre = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE_SEL") == 0 )
         {
            AV25TFPMUsuCre_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIAS") == 0 )
         {
            AV44TFPMDias = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPMDias_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIASPAVISO") == 0 )
         {
            AV89TFPMDiasPaviso = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV90TFPMDiasPaviso_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSO") == 0 )
         {
            AV42TFPMUso = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPMUso_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSOMTS") == 0 )
         {
            AV52TFPMUsoMts = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFPMUsoMts_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC") == 0 )
         {
            AV92TFPMTipoDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC_SEL") == 0 )
         {
            AV93TFPMTipoDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMORD") == 0 )
         {
            AV46TFPMOrd = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPMOrd_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIE") == 0 )
         {
            AV48TFPMTie = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPMTie_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA") == 0 )
         {
            AV50TFPMPla = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA_SEL") == 0 )
         {
            AV51TFPMPla_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT") == 0 )
         {
            AV34TFPMTxt = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT_SEL") == 0 )
         {
            AV35TFPMTxt_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV140GXV2 = (int)(AV140GXV2+1) ;
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

   public void h8JW0( boolean bFoot ,
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
               AV74PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV71DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV76Title = AV101Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV76Title = "" ;
      AV12FilterFullText = "" ;
      AV54TFPMCod_To_Description = "" ;
      AV21TFPMDsc_Sel = "" ;
      AV20TFPMDsc = "" ;
      AV27TFPMMaqCod_Sel = "" ;
      AV26TFPMMaqCod = "" ;
      AV29TFPMMaqDsc_Sel = "" ;
      AV28TFPMMaqDsc = "" ;
      AV32TFPMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFPMEst_SelsJson = "" ;
      AV33TFPMEst_Sel = "" ;
      AV31TFPMEst_SelDscs = "" ;
      AV56FilterTFPMEst_SelValueDescription = "" ;
      AV22TFPMFchCre = GXutil.nullDate() ;
      AV36TFPMIni = GXutil.nullDate() ;
      AV40TFPMUlt = GXutil.nullDate() ;
      AV38TFPMFin = GXutil.nullDate() ;
      AV25TFPMUsuCre_Sel = "" ;
      AV24TFPMUsuCre = "" ;
      AV61TFPMDias_To_Description = "" ;
      AV91TFPMDiasPaviso_To_Description = "" ;
      AV42TFPMUso = DecimalUtil.ZERO ;
      AV43TFPMUso_To = DecimalUtil.ZERO ;
      AV60TFPMUso_To_Description = "" ;
      AV52TFPMUsoMts = DecimalUtil.ZERO ;
      AV53TFPMUsoMts_To = DecimalUtil.ZERO ;
      AV64TFPMUsoMts_To_Description = "" ;
      AV93TFPMTipoDsc_Sel = "" ;
      AV92TFPMTipoDsc = "" ;
      AV62TFPMOrd_To_Description = "" ;
      AV48TFPMTie = DecimalUtil.ZERO ;
      AV49TFPMTie_To = DecimalUtil.ZERO ;
      AV63TFPMTie_To_Description = "" ;
      AV51TFPMPla_Sel = "" ;
      AV50TFPMPla = "" ;
      AV35TFPMTxt_Sel = "" ;
      AV34TFPMTxt = "" ;
      A9478PMEst = "" ;
      A9473PMDsc = "" ;
      A9476PMMaqCod = "" ;
      A9477PMMaqDsc = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9486PMUlt = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      A14272PMTipoDsc = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      A11456PMPla = "" ;
      A9483PMTxt = "" ;
      AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = "" ;
      AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = "" ;
      AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = "" ;
      AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = GXutil.nullDate() ;
      AV117Mantenimientomaquina_tmprevewwds_12_tfpmini = GXutil.nullDate() ;
      AV118Mantenimientomaquina_tmprevewwds_13_tfpmult = GXutil.nullDate() ;
      AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin = GXutil.nullDate() ;
      AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = "" ;
      AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso = DecimalUtil.ZERO ;
      AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = DecimalUtil.ZERO ;
      AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts = DecimalUtil.ZERO ;
      AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = DecimalUtil.ZERO ;
      AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = "" ;
      AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie = DecimalUtil.ZERO ;
      AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = DecimalUtil.ZERO ;
      AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = "" ;
      AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = "" ;
      lV106Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      lV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      lV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      lV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      lV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      lV136Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      lV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      P08JW2_A396EmprCod = new String[] {""} ;
      P08JW2_A14271PMTipoID = new short[1] ;
      P08JW2_A9483PMTxt = new String[] {""} ;
      P08JW2_n9483PMTxt = new boolean[] {false} ;
      P08JW2_A11456PMPla = new String[] {""} ;
      P08JW2_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JW2_A9488PMOrd = new int[1] ;
      P08JW2_n9488PMOrd = new boolean[] {false} ;
      P08JW2_A14272PMTipoDsc = new String[] {""} ;
      P08JW2_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JW2_n13013PMUsoMts = new boolean[] {false} ;
      P08JW2_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JW2_n11454PMUso = new boolean[] {false} ;
      P08JW2_A14275PMDiasPavi = new short[1] ;
      P08JW2_n14275PMDiasPavi = new boolean[] {false} ;
      P08JW2_A9487PMDias = new short[1] ;
      P08JW2_n9487PMDias = new boolean[] {false} ;
      P08JW2_A9475PMUsuCre = new String[] {""} ;
      P08JW2_n9475PMUsuCre = new boolean[] {false} ;
      P08JW2_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JW2_n9485PMFin = new boolean[] {false} ;
      P08JW2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JW2_n9486PMUlt = new boolean[] {false} ;
      P08JW2_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JW2_n9484PMIni = new boolean[] {false} ;
      P08JW2_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JW2_n9474PMFchCre = new boolean[] {false} ;
      P08JW2_A9477PMMaqDsc = new String[] {""} ;
      P08JW2_n9477PMMaqDsc = new boolean[] {false} ;
      P08JW2_A9476PMMaqCod = new String[] {""} ;
      P08JW2_n9476PMMaqCod = new boolean[] {false} ;
      P08JW2_A9473PMDsc = new String[] {""} ;
      P08JW2_n9473PMDsc = new boolean[] {false} ;
      P08JW2_A9429PMCod = new int[1] ;
      P08JW2_A9478PMEst = new String[] {""} ;
      P08JW2_n9478PMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV13PMEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74PageInfo = "" ;
      AV71DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV101Pgmdesc = "" ;
      AV69AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmprevewwexportreport__default(),
         new Object[] {
             new Object[] {
            P08JW2_A396EmprCod, P08JW2_A14271PMTipoID, P08JW2_A9483PMTxt, P08JW2_n9483PMTxt, P08JW2_A11456PMPla, P08JW2_A11455PMTie, P08JW2_A9488PMOrd, P08JW2_n9488PMOrd, P08JW2_A14272PMTipoDsc, P08JW2_A13013PMUsoMts,
            P08JW2_n13013PMUsoMts, P08JW2_A11454PMUso, P08JW2_n11454PMUso, P08JW2_A14275PMDiasPavi, P08JW2_n14275PMDiasPavi, P08JW2_A9487PMDias, P08JW2_n9487PMDias, P08JW2_A9475PMUsuCre, P08JW2_n9475PMUsuCre, P08JW2_A9485PMFin,
            P08JW2_n9485PMFin, P08JW2_A9486PMUlt, P08JW2_n9486PMUlt, P08JW2_A9484PMIni, P08JW2_n9484PMIni, P08JW2_A9474PMFchCre, P08JW2_n9474PMFchCre, P08JW2_A9477PMMaqDsc, P08JW2_n9477PMMaqDsc, P08JW2_A9476PMMaqCod,
            P08JW2_n9476PMMaqCod, P08JW2_A9473PMDsc, P08JW2_n9473PMDsc, P08JW2_A9429PMCod, P08JW2_A9478PMEst, P08JW2_n9478PMEst
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV101Pgmdesc = httpContext.getMessage( "Mantenimiento Preventivo", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV101Pgmdesc = httpContext.getMessage( "Mantenimiento Preventivo", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV44TFPMDias ;
   private short AV45TFPMDias_To ;
   private short AV89TFPMDiasPaviso ;
   private short AV90TFPMDiasPaviso_To ;
   private short A9487PMDias ;
   private short A14275PMDiasPavi ;
   private short AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias ;
   private short AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ;
   private short AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ;
   private short AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ;
   private short AV10OrderedBy ;
   private short A14271PMTipoID ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFPMCod ;
   private int AV19TFPMCod_To ;
   private int AV104GXV1 ;
   private int AV46TFPMOrd ;
   private int AV47TFPMOrd_To ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod ;
   private int AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ;
   private int AV132Mantenimientomaquina_tmprevewwds_27_tfpmord ;
   private int AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to ;
   private int AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ;
   private int AV140GXV2 ;
   private long AV65i ;
   private java.math.BigDecimal AV42TFPMUso ;
   private java.math.BigDecimal AV43TFPMUso_To ;
   private java.math.BigDecimal AV52TFPMUsoMts ;
   private java.math.BigDecimal AV53TFPMUsoMts_To ;
   private java.math.BigDecimal AV48TFPMTie ;
   private java.math.BigDecimal AV49TFPMTie_To ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private java.math.BigDecimal AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso ;
   private java.math.BigDecimal AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ;
   private java.math.BigDecimal AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts ;
   private java.math.BigDecimal AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ;
   private java.math.BigDecimal AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie ;
   private java.math.BigDecimal AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFPMDsc_Sel ;
   private String AV20TFPMDsc ;
   private String AV27TFPMMaqCod_Sel ;
   private String AV26TFPMMaqCod ;
   private String AV29TFPMMaqDsc_Sel ;
   private String AV28TFPMMaqDsc ;
   private String AV33TFPMEst_Sel ;
   private String AV25TFPMUsuCre_Sel ;
   private String AV24TFPMUsuCre ;
   private String AV93TFPMTipoDsc_Sel ;
   private String AV92TFPMTipoDsc ;
   private String AV51TFPMPla_Sel ;
   private String AV50TFPMPla ;
   private String A9478PMEst ;
   private String A9473PMDsc ;
   private String A9476PMMaqCod ;
   private String A9477PMMaqDsc ;
   private String A9475PMUsuCre ;
   private String A14272PMTipoDsc ;
   private String A11456PMPla ;
   private String AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ;
   private String AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ;
   private String AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ;
   private String AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ;
   private String AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ;
   private String AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ;
   private String scmdbuf ;
   private String lV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String lV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String lV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String lV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String lV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String lV136Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String A396EmprCod ;
   private String AV101Pgmdesc ;
   private java.util.Date AV22TFPMFchCre ;
   private java.util.Date AV36TFPMIni ;
   private java.util.Date AV40TFPMUlt ;
   private java.util.Date AV38TFPMFin ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9485PMFin ;
   private java.util.Date AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ;
   private java.util.Date AV117Mantenimientomaquina_tmprevewwds_12_tfpmini ;
   private java.util.Date AV118Mantenimientomaquina_tmprevewwds_13_tfpmult ;
   private java.util.Date AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9483PMTxt ;
   private boolean n9488PMOrd ;
   private boolean n13013PMUsoMts ;
   private boolean n11454PMUso ;
   private boolean n14275PMDiasPavi ;
   private boolean n9487PMDias ;
   private boolean n9475PMUsuCre ;
   private boolean n9485PMFin ;
   private boolean n9486PMUlt ;
   private boolean n9484PMIni ;
   private boolean n9474PMFchCre ;
   private boolean n9477PMMaqDsc ;
   private boolean n9476PMMaqCod ;
   private boolean n9473PMDsc ;
   private boolean n9478PMEst ;
   private String AV30TFPMEst_SelsJson ;
   private String AV76Title ;
   private String AV12FilterFullText ;
   private String AV54TFPMCod_To_Description ;
   private String AV31TFPMEst_SelDscs ;
   private String AV56FilterTFPMEst_SelValueDescription ;
   private String AV61TFPMDias_To_Description ;
   private String AV91TFPMDiasPaviso_To_Description ;
   private String AV60TFPMUso_To_Description ;
   private String AV64TFPMUsoMts_To_Description ;
   private String AV62TFPMOrd_To_Description ;
   private String AV63TFPMTie_To_Description ;
   private String AV35TFPMTxt_Sel ;
   private String AV34TFPMTxt ;
   private String A9483PMTxt ;
   private String AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private String AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ;
   private String lV106Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String lV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private String AV13PMEstDescription ;
   private String AV74PageInfo ;
   private String AV71DateInfo ;
   private String AV69AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08JW2_A396EmprCod ;
   private short[] P08JW2_A14271PMTipoID ;
   private String[] P08JW2_A9483PMTxt ;
   private boolean[] P08JW2_n9483PMTxt ;
   private String[] P08JW2_A11456PMPla ;
   private java.math.BigDecimal[] P08JW2_A11455PMTie ;
   private int[] P08JW2_A9488PMOrd ;
   private boolean[] P08JW2_n9488PMOrd ;
   private String[] P08JW2_A14272PMTipoDsc ;
   private java.math.BigDecimal[] P08JW2_A13013PMUsoMts ;
   private boolean[] P08JW2_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JW2_A11454PMUso ;
   private boolean[] P08JW2_n11454PMUso ;
   private short[] P08JW2_A14275PMDiasPavi ;
   private boolean[] P08JW2_n14275PMDiasPavi ;
   private short[] P08JW2_A9487PMDias ;
   private boolean[] P08JW2_n9487PMDias ;
   private String[] P08JW2_A9475PMUsuCre ;
   private boolean[] P08JW2_n9475PMUsuCre ;
   private java.util.Date[] P08JW2_A9485PMFin ;
   private boolean[] P08JW2_n9485PMFin ;
   private java.util.Date[] P08JW2_A9486PMUlt ;
   private boolean[] P08JW2_n9486PMUlt ;
   private java.util.Date[] P08JW2_A9484PMIni ;
   private boolean[] P08JW2_n9484PMIni ;
   private java.util.Date[] P08JW2_A9474PMFchCre ;
   private boolean[] P08JW2_n9474PMFchCre ;
   private String[] P08JW2_A9477PMMaqDsc ;
   private boolean[] P08JW2_n9477PMMaqDsc ;
   private String[] P08JW2_A9476PMMaqCod ;
   private boolean[] P08JW2_n9476PMMaqCod ;
   private String[] P08JW2_A9473PMDsc ;
   private boolean[] P08JW2_n9473PMDsc ;
   private int[] P08JW2_A9429PMCod ;
   private String[] P08JW2_A9478PMEst ;
   private boolean[] P08JW2_n9478PMEst ;
   private GXSimpleCollection<String> AV32TFPMEst_Sels ;
   private GXSimpleCollection<String> AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tmprevewwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                          int AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod ,
                                          int AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ,
                                          String AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                          String AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                          String AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                          String AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                          int AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV117Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                          java.util.Date AV118Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                          java.util.Date AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                          String AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                          String AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                          short AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias ,
                                          short AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ,
                                          short AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                          String AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                          String AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                          int AV132Mantenimientomaquina_tmprevewwds_27_tfpmord ,
                                          int AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to ,
                                          java.math.BigDecimal AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                          java.math.BigDecimal AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                          String AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                          String AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                          String AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                          String AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          String A14272PMTipoDsc ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV106Mantenimientomaquina_tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMTipoID, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T2.PMTipoDsc, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt," ;
      scmdbuf += " T1.PMIni, T1.PMFchCre, T3.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst FROM ((TXPMPREVE T1 INNER JOIN TXPTIPPRV T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.PMTipoID = T1.PMTipoID) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.PMMaqCod)" ;
      if ( ! (0==AV107Mantenimientomaquina_tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV108Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Mantenimientomaquina_tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Mantenimientomaquina_tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Mantenimientomaquina_tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118Mantenimientomaquina_tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Mantenimientomaquina_tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV120Mantenimientomaquina_tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV122Mantenimientomaquina_tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV123Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV124Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV125Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Mantenimientomaquina_tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Mantenimientomaquina_tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Mantenimientomaquina_tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV130Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMTipoDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Mantenimientomaquina_tmprevewwds_27_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Mantenimientomaquina_tmprevewwds_28_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Mantenimientomaquina_tmprevewwds_29_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Mantenimientomaquina_tmprevewwds_30_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV136Mantenimientomaquina_tmprevewwds_31_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV138Mantenimientomaquina_tmprevewwds_33_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDsc" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMEst" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFchCre" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFchCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMIni" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMIni DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUlt" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUlt DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFin" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFin DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDias" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDias DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUso" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUso DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PMTipoDsc" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PMTipoDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMOrd" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMOrd DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTie" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTie DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMPla" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMPla DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTxt" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTxt DESC" ;
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
                  return conditional_P08JW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(20);
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 2000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 2000);
               }
               return;
      }
   }

}

