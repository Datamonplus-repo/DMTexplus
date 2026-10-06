package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lector__wwexportreport_impl extends GXWebReport
{
   public lector__wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV54Title = httpContext.getMessage( "Lista de Mantenimiento Tabla LECTOR", "") ;
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
         hA360( true, 0) ;
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
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLecMaqCod)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFLecMaqCod, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV19TFLecBarCod) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Hdr", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFLecBarCod), "ZZZZZZZ9")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV21TFLecBarReo) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFLecBarReo), "9")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLecBarPar)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFLecBarPar, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV25TFLecOpeCod) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFLecOpeCod), "ZZZZZ9")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFlecOpeNom)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFlecOpeNom, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFLecFasCod)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod.Fase", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFLecFasCod, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFLecFasDsc)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFLecFasDsc, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV33TFLecFasOrd) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFLecFasOrd), "ZZZ9")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV35TFLecParCod) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFLecParCod), "ZZZ9")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFLecParNom)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descrip.Paro", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFLecParNom, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFLecHor)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFLecHor, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFLecFec)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLecFec_To)) ) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV59TFLecFec, "99/99/99"), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV67TFLecFec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Fecha", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFLecFec_To_Description, "")), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV60TFLecFec_To, "99/99/99"), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV61TFLecTipEnt)==0) )
      {
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFLecTipEnt, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFLecEstado_Sel)==0) )
      {
         AV68FilterTFLecEstado_SelValueDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( AV66TFLecEstado_Sel), "P") == 0 )
         {
            AV68FilterTFLecEstado_SelValueDescription = httpContext.getMessage( "Proceso", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( AV66TFLecEstado_Sel), "F") == 0 )
         {
            AV68FilterTFLecEstado_SelValueDescription = httpContext.getMessage( "Finalizadas", "") ;
         }
         hA360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 102, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68FilterTFLecEstado_SelValueDescription, "")), 102, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA360( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA360( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 30, Gx_line+10, 76, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Hdr", ""), 80, Gx_line+10, 126, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 130, Gx_line+10, 176, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 180, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 230, Gx_line+10, 276, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 280, Gx_line+10, 326, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod.Fase", ""), 330, Gx_line+10, 376, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 380, Gx_line+10, 428, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 432, Gx_line+10, 479, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 483, Gx_line+10, 530, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descrip.Paro", ""), 534, Gx_line+10, 582, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 586, Gx_line+10, 633, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 637, Gx_line+10, 684, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 688, Gx_line+10, 735, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 739, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV78Lectoroptico_lector__wwds_1_filterfulltext = AV12FilterFullText ;
      AV79Lectoroptico_lector__wwds_2_tflecmaqcod = AV17TFLecMaqCod ;
      AV80Lectoroptico_lector__wwds_3_tflecbarcod = AV19TFLecBarCod ;
      AV81Lectoroptico_lector__wwds_4_tflecbarreo = AV21TFLecBarReo ;
      AV82Lectoroptico_lector__wwds_5_tflecbarpar = AV23TFLecBarPar ;
      AV83Lectoroptico_lector__wwds_6_tflecopecod = AV25TFLecOpeCod ;
      AV84Lectoroptico_lector__wwds_7_tflecopenom = AV27TFlecOpeNom ;
      AV85Lectoroptico_lector__wwds_8_tflecfascod = AV29TFLecFasCod ;
      AV86Lectoroptico_lector__wwds_9_tflecfasdsc = AV31TFLecFasDsc ;
      AV87Lectoroptico_lector__wwds_10_tflecfasord = AV33TFLecFasOrd ;
      AV88Lectoroptico_lector__wwds_11_tflecparcod = AV35TFLecParCod ;
      AV89Lectoroptico_lector__wwds_12_tflecparnom = AV37TFLecParNom ;
      AV90Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV91Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV92Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV93Lectoroptico_lector__wwds_16_tflectipent = AV61TFLecTipEnt ;
      AV94Lectoroptico_lector__wwds_17_tflecestado_sel = AV66TFLecEstado_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV80Lectoroptico_lector__wwds_3_tflecbarcod) ,
                                           Byte.valueOf(AV81Lectoroptico_lector__wwds_4_tflecbarreo) ,
                                           AV82Lectoroptico_lector__wwds_5_tflecbarpar ,
                                           Integer.valueOf(AV83Lectoroptico_lector__wwds_6_tflecopecod) ,
                                           AV85Lectoroptico_lector__wwds_8_tflecfascod ,
                                           Short.valueOf(AV87Lectoroptico_lector__wwds_10_tflecfasord) ,
                                           Short.valueOf(AV88Lectoroptico_lector__wwds_11_tflecparcod) ,
                                           AV90Lectoroptico_lector__wwds_13_tflechor ,
                                           AV91Lectoroptico_lector__wwds_14_tflecfec ,
                                           AV92Lectoroptico_lector__wwds_15_tflecfec_to ,
                                           AV93Lectoroptico_lector__wwds_16_tflectipent ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV78Lectoroptico_lector__wwds_1_filterfulltext ,
                                           A1166LecMaqCod ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           A13722LecEstado ,
                                           AV79Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                           AV84Lectoroptico_lector__wwds_7_tflecopenom ,
                                           AV86Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                           AV89Lectoroptico_lector__wwds_12_tflecparnom ,
                                           AV94Lectoroptico_lector__wwds_17_tflecestado_sel } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Lectoroptico_lector__wwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV79Lectoroptico_lector__wwds_2_tflecmaqcod), 6, "%") ;
      lV82Lectoroptico_lector__wwds_5_tflecbarpar = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_lector__wwds_5_tflecbarpar), 1, "%") ;
      lV85Lectoroptico_lector__wwds_8_tflecfascod = GXutil.padr( GXutil.rtrim( AV85Lectoroptico_lector__wwds_8_tflecfascod), 8, "%") ;
      lV90Lectoroptico_lector__wwds_13_tflechor = GXutil.padr( GXutil.rtrim( AV90Lectoroptico_lector__wwds_13_tflechor), 8, "%") ;
      lV93Lectoroptico_lector__wwds_16_tflectipent = GXutil.padr( GXutil.rtrim( AV93Lectoroptico_lector__wwds_16_tflectipent), 1, "%") ;
      /* Using cursor P0A362 */
      pr_default.execute(0, new Object[] {lV79Lectoroptico_lector__wwds_2_tflecmaqcod, Integer.valueOf(AV80Lectoroptico_lector__wwds_3_tflecbarcod), Byte.valueOf(AV81Lectoroptico_lector__wwds_4_tflecbarreo), lV82Lectoroptico_lector__wwds_5_tflecbarpar, Integer.valueOf(AV83Lectoroptico_lector__wwds_6_tflecopecod), lV85Lectoroptico_lector__wwds_8_tflecfascod, Short.valueOf(AV87Lectoroptico_lector__wwds_10_tflecfasord), Short.valueOf(AV88Lectoroptico_lector__wwds_11_tflecparcod), lV90Lectoroptico_lector__wwds_13_tflechor, AV91Lectoroptico_lector__wwds_14_tflecfec, AV92Lectoroptico_lector__wwds_15_tflecfec_to, lV93Lectoroptico_lector__wwds_16_tflectipent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P0A362_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P0A362_n1796LecTipEnt[0] ;
         A1173LecHor = P0A362_A1173LecHor[0] ;
         n1173LecHor = P0A362_n1173LecHor[0] ;
         A1166LecMaqCod = P0A362_A1166LecMaqCod[0] ;
         A1174LecFec = P0A362_A1174LecFec[0] ;
         n1174LecFec = P0A362_n1174LecFec[0] ;
         A1188LecFasOrd = P0A362_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A362_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A362_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A362_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A362_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A362_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A362_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A362_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A362_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A362_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A362_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A362_n1171LecFasCod[0] ;
         A1172LecParCod = P0A362_A1172LecParCod[0] ;
         n1172LecParCod = P0A362_n1172LecParCod[0] ;
         A396EmprCod = P0A362_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         lector__wwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV94Lectoroptico_lector__wwds_17_tflecestado_sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV94Lectoroptico_lector__wwds_17_tflecestado_sel) == 0 ) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            lector__wwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( (GXutil.strcmp("", AV84Lectoroptico_lector__wwds_7_tflecopenom)==0) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_lector__wwds_7_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char2 = A14260LecFasDsc ;
               GXv_char3[0] = GXt_char2 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
               lector__wwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
               A14260LecFasDsc = GXt_char2 ;
               if ( (GXutil.strcmp("", AV86Lectoroptico_lector__wwds_9_tflecfasdsc)==0) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV86Lectoroptico_lector__wwds_9_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
               {
                  GXt_char2 = A14261LecParNom ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                  lector__wwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
                  A14261LecParNom = GXt_char2 ;
                  if ( (GXutil.strcmp("", AV78Lectoroptico_lector__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1167LecBarCod, 8, 0) , GXutil.padr( "%" + AV78Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1168LecBarReo, 1, 0) , GXutil.padr( "%" + AV78Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1169LecBarPar) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV78Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV78Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV78Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                  {
                     if ( (GXutil.strcmp("", AV89Lectoroptico_lector__wwds_12_tflecparnom)==0) || ( GXutil.like( GXutil.trim( GXutil.upper( A14261LecParNom)) , GXutil.padr( "%" + GXutil.trim( GXutil.upper( AV89Lectoroptico_lector__wwds_12_tflecparnom)) , 1 , "%"),  ' ' ) ) )
                     {
                        AV56LecEstadoDescription = "" ;
                        if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "P") == 0 )
                        {
                           AV56LecEstadoDescription = httpContext.getMessage( "Proceso", "") ;
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "F") == 0 )
                        {
                           AV56LecEstadoDescription = httpContext.getMessage( "Finalizadas", "") ;
                        }
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
                        hA360( false, 36) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1166LecMaqCod, "")), 30, Gx_line+10, 76, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9")), 80, Gx_line+10, 126, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9")), 130, Gx_line+10, 176, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1169LecBarPar, "")), 180, Gx_line+10, 226, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9")), 230, Gx_line+10, 276, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14259lecOpeNom, "")), 280, Gx_line+10, 326, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1171LecFasCod, "")), 330, Gx_line+10, 376, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14260LecFasDsc, "")), 380, Gx_line+10, 428, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9")), 432, Gx_line+10, 479, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9")), 483, Gx_line+10, 530, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14261LecParNom, "")), 534, Gx_line+10, 582, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1173LecHor, "")), 586, Gx_line+10, 633, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A1174LecFec, "99/99/99"), 637, Gx_line+10, 684, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1796LecTipEnt, "")), 688, Gx_line+10, 735, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56LecEstadoDescription, "")), 739, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
                     }
                  }
               }
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
      if ( GXutil.strcmp(AV13Session.getValue("LectorOptico.Lector__WWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.Lector__WWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("LectorOptico.Lector__WWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV17TFLecMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARCOD") == 0 )
         {
            AV19TFLecBarCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARREO") == 0 )
         {
            AV21TFLecBarReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARPAR") == 0 )
         {
            AV23TFLecBarPar = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV25TFLecOpeCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV27TFlecOpeNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV29TFLecFasCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV31TFLecFasDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV33TFLecFasOrd = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV35TFLecParCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV37TFLecParNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV57TFLecHor = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV59TFLecFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV60TFLecFec_To = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV61TFLecTipEnt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV66TFLecEstado_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
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

   public void hA360( boolean bFoot ,
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
            AV54Title = AV74Pgmdesc ;
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
      AV12FilterFullText = "" ;
      AV17TFLecMaqCod = "" ;
      AV23TFLecBarPar = "" ;
      AV27TFlecOpeNom = "" ;
      AV29TFLecFasCod = "" ;
      AV31TFLecFasDsc = "" ;
      AV37TFLecParNom = "" ;
      AV57TFLecHor = "" ;
      AV59TFLecFec = GXutil.nullDate() ;
      AV60TFLecFec_To = GXutil.nullDate() ;
      AV67TFLecFec_To_Description = "" ;
      AV61TFLecTipEnt = "" ;
      AV66TFLecEstado_Sel = "" ;
      AV68FilterTFLecEstado_SelValueDescription = "" ;
      A13722LecEstado = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      AV78Lectoroptico_lector__wwds_1_filterfulltext = "" ;
      AV79Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      AV82Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      AV84Lectoroptico_lector__wwds_7_tflecopenom = "" ;
      AV85Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      AV86Lectoroptico_lector__wwds_9_tflecfasdsc = "" ;
      AV89Lectoroptico_lector__wwds_12_tflecparnom = "" ;
      AV90Lectoroptico_lector__wwds_13_tflechor = "" ;
      AV91Lectoroptico_lector__wwds_14_tflecfec = GXutil.nullDate() ;
      AV92Lectoroptico_lector__wwds_15_tflecfec_to = GXutil.nullDate() ;
      AV93Lectoroptico_lector__wwds_16_tflectipent = "" ;
      AV94Lectoroptico_lector__wwds_17_tflecestado_sel = "" ;
      scmdbuf = "" ;
      lV79Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      lV82Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      lV85Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      lV90Lectoroptico_lector__wwds_13_tflechor = "" ;
      lV93Lectoroptico_lector__wwds_16_tflectipent = "" ;
      P0A362_A1796LecTipEnt = new String[] {""} ;
      P0A362_n1796LecTipEnt = new boolean[] {false} ;
      P0A362_A1173LecHor = new String[] {""} ;
      P0A362_n1173LecHor = new boolean[] {false} ;
      P0A362_A1166LecMaqCod = new String[] {""} ;
      P0A362_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A362_n1174LecFec = new boolean[] {false} ;
      P0A362_A1188LecFasOrd = new short[1] ;
      P0A362_n1188LecFasOrd = new boolean[] {false} ;
      P0A362_A1169LecBarPar = new String[] {""} ;
      P0A362_n1169LecBarPar = new boolean[] {false} ;
      P0A362_A1168LecBarReo = new byte[1] ;
      P0A362_n1168LecBarReo = new boolean[] {false} ;
      P0A362_A1167LecBarCod = new int[1] ;
      P0A362_n1167LecBarCod = new boolean[] {false} ;
      P0A362_A1170LecOpeCod = new int[1] ;
      P0A362_n1170LecOpeCod = new boolean[] {false} ;
      P0A362_A1171LecFasCod = new String[] {""} ;
      P0A362_n1171LecFasCod = new boolean[] {false} ;
      P0A362_A1172LecParCod = new short[1] ;
      P0A362_n1172LecParCod = new boolean[] {false} ;
      P0A362_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV56LecEstadoDescription = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52PageInfo = "" ;
      AV49DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV74Pgmdesc = "" ;
      AV47AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector__wwexportreport__default(),
         new Object[] {
             new Object[] {
            P0A362_A1796LecTipEnt, P0A362_n1796LecTipEnt, P0A362_A1173LecHor, P0A362_n1173LecHor, P0A362_A1166LecMaqCod, P0A362_A1174LecFec, P0A362_n1174LecFec, P0A362_A1188LecFasOrd, P0A362_n1188LecFasOrd, P0A362_A1169LecBarPar,
            P0A362_n1169LecBarPar, P0A362_A1168LecBarReo, P0A362_n1168LecBarReo, P0A362_A1167LecBarCod, P0A362_n1167LecBarCod, P0A362_A1170LecOpeCod, P0A362_n1170LecOpeCod, P0A362_A1171LecFasCod, P0A362_n1171LecFasCod, P0A362_A1172LecParCod,
            P0A362_n1172LecParCod, P0A362_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV74Pgmdesc = httpContext.getMessage( "Lector__WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV74Pgmdesc = httpContext.getMessage( "Lector__WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV21TFLecBarReo ;
   private byte A1168LecBarReo ;
   private byte AV81Lectoroptico_lector__wwds_4_tflecbarreo ;
   private short gxcookieaux ;
   private short AV33TFLecFasOrd ;
   private short AV35TFLecParCod ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV87Lectoroptico_lector__wwds_10_tflecfasord ;
   private short AV88Lectoroptico_lector__wwds_11_tflecparcod ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV19TFLecBarCod ;
   private int AV25TFLecOpeCod ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int AV80Lectoroptico_lector__wwds_3_tflecbarcod ;
   private int AV83Lectoroptico_lector__wwds_6_tflecopecod ;
   private int AV95GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV17TFLecMaqCod ;
   private String AV23TFLecBarPar ;
   private String AV27TFlecOpeNom ;
   private String AV29TFLecFasCod ;
   private String AV31TFLecFasDsc ;
   private String AV37TFLecParNom ;
   private String AV57TFLecHor ;
   private String AV61TFLecTipEnt ;
   private String AV66TFLecEstado_Sel ;
   private String A13722LecEstado ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String AV79Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String AV82Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String AV84Lectoroptico_lector__wwds_7_tflecopenom ;
   private String AV85Lectoroptico_lector__wwds_8_tflecfascod ;
   private String AV86Lectoroptico_lector__wwds_9_tflecfasdsc ;
   private String AV89Lectoroptico_lector__wwds_12_tflecparnom ;
   private String AV90Lectoroptico_lector__wwds_13_tflechor ;
   private String AV93Lectoroptico_lector__wwds_16_tflectipent ;
   private String AV94Lectoroptico_lector__wwds_17_tflecestado_sel ;
   private String scmdbuf ;
   private String lV79Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String lV82Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String lV85Lectoroptico_lector__wwds_8_tflecfascod ;
   private String lV90Lectoroptico_lector__wwds_13_tflechor ;
   private String lV93Lectoroptico_lector__wwds_16_tflectipent ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV74Pgmdesc ;
   private java.util.Date AV59TFLecFec ;
   private java.util.Date AV60TFLecFec_To ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV91Lectoroptico_lector__wwds_14_tflecfec ;
   private java.util.Date AV92Lectoroptico_lector__wwds_15_tflecfec_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV54Title ;
   private String AV12FilterFullText ;
   private String AV67TFLecFec_To_Description ;
   private String AV68FilterTFLecEstado_SelValueDescription ;
   private String AV78Lectoroptico_lector__wwds_1_filterfulltext ;
   private String AV56LecEstadoDescription ;
   private String AV52PageInfo ;
   private String AV49DateInfo ;
   private String AV47AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0A362_A1796LecTipEnt ;
   private boolean[] P0A362_n1796LecTipEnt ;
   private String[] P0A362_A1173LecHor ;
   private boolean[] P0A362_n1173LecHor ;
   private String[] P0A362_A1166LecMaqCod ;
   private java.util.Date[] P0A362_A1174LecFec ;
   private boolean[] P0A362_n1174LecFec ;
   private short[] P0A362_A1188LecFasOrd ;
   private boolean[] P0A362_n1188LecFasOrd ;
   private String[] P0A362_A1169LecBarPar ;
   private boolean[] P0A362_n1169LecBarPar ;
   private byte[] P0A362_A1168LecBarReo ;
   private boolean[] P0A362_n1168LecBarReo ;
   private int[] P0A362_A1167LecBarCod ;
   private boolean[] P0A362_n1167LecBarCod ;
   private int[] P0A362_A1170LecOpeCod ;
   private boolean[] P0A362_n1170LecOpeCod ;
   private String[] P0A362_A1171LecFasCod ;
   private boolean[] P0A362_n1171LecFasCod ;
   private short[] P0A362_A1172LecParCod ;
   private boolean[] P0A362_n1172LecParCod ;
   private String[] P0A362_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class lector__wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A362( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV80Lectoroptico_lector__wwds_3_tflecbarcod ,
                                          byte AV81Lectoroptico_lector__wwds_4_tflecbarreo ,
                                          String AV82Lectoroptico_lector__wwds_5_tflecbarpar ,
                                          int AV83Lectoroptico_lector__wwds_6_tflecopecod ,
                                          String AV85Lectoroptico_lector__wwds_8_tflecfascod ,
                                          short AV87Lectoroptico_lector__wwds_10_tflecfasord ,
                                          short AV88Lectoroptico_lector__wwds_11_tflecparcod ,
                                          String AV90Lectoroptico_lector__wwds_13_tflechor ,
                                          java.util.Date AV91Lectoroptico_lector__wwds_14_tflecfec ,
                                          java.util.Date AV92Lectoroptico_lector__wwds_15_tflecfec_to ,
                                          String AV93Lectoroptico_lector__wwds_16_tflectipent ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV78Lectoroptico_lector__wwds_1_filterfulltext ,
                                          String A1166LecMaqCod ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String A13722LecEstado ,
                                          String AV79Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                          String AV84Lectoroptico_lector__wwds_7_tflecopenom ,
                                          String AV86Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                          String AV89Lectoroptico_lector__wwds_12_tflecparnom ,
                                          String AV94Lectoroptico_lector__wwds_17_tflecestado_sel )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecHor, LecMaqCod, LecFec, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(RTRIM(LTRIM(LOWER(LecMaqCod))) like '%' || RTRIM(LTRIM(LOWER(?))))");
      if ( ! (0==AV80Lectoroptico_lector__wwds_3_tflecbarcod) )
      {
         addWhere(sWhereString, "(LecBarCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_lector__wwds_4_tflecbarreo) )
      {
         addWhere(sWhereString, "(LecBarReo = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Lectoroptico_lector__wwds_5_tflecbarpar)==0) )
      {
         addWhere(sWhereString, "(LecBarPar like '%' || RTRIM(LTRIM(LOWER(?))))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV83Lectoroptico_lector__wwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Lectoroptico_lector__wwds_8_tflecfascod)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(UPPER(LecFasCod))) like '%' || RTRIM(LTRIM(UPPER(?))))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV87Lectoroptico_lector__wwds_10_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV88Lectoroptico_lector__wwds_11_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Lectoroptico_lector__wwds_13_tflechor)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Lectoroptico_lector__wwds_14_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Lectoroptico_lector__wwds_15_tflecfec_to)) )
      {
         addWhere(sWhereString, "(LecFec <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Lectoroptico_lector__wwds_16_tflectipent)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecMaqCod, EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarReo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarPar" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarPar DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0A362(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A362", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

