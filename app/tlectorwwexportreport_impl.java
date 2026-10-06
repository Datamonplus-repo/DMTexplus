package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlectorwwexportreport_impl extends GXWebReport
{
   public tlectorwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV75Title = httpContext.getMessage( "Lista de Mantenimiento tabla LECTOR", "") ;
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
         h8B90( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV88FilterFullText)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88FilterFullText, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFLecMaqCod_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFLecMaqCod_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFLecMaqCod)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFLecMaqCod, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV90TFLecHdr_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90TFLecHdr_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV89TFLecHdr)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFLecHdr, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV40TFLecOpeCod) && (0==AV41TFLecOpeCod_To) ) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFLecOpeCod), "ZZZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFLecOpeCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Operario", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFLecOpeCod_To_Description, "")), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFLecOpeCod_To), "ZZZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV97TFlecOpeNom_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97TFlecOpeNom_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV96TFlecOpeNom)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96TFlecOpeNom, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV45TFLecFasCod_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFLecFasCod_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFLecFasCod)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFLecFasCod, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV99TFLecFasDsc_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99TFLecFasDsc_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV98TFLecFasDsc)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98TFLecFasDsc, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV48TFLecFasOrd) && (0==AV49TFLecFasOrd_To) ) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFLecFasOrd), "ZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV63TFLecFasOrd_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFLecFasOrd_To_Description, "")), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFLecFasOrd_To), "ZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV50TFLecParCod) && (0==AV51TFLecParCod_To) ) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFLecParCod), "ZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV64TFLecParCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Paro", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFLecParCod_To_Description, "")), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFLecParCod_To), "ZZZ9")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV101TFLecParNom_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101TFLecParNom_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV100TFLecParNom)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TFLecParNom, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV55TFLecHor_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFLecHor_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV54TFLecHor)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFLecHor, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFLecFec)) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV56TFLecFec, "99/99/99"), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFLecTipEnt_Sel)==0) )
      {
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFLecTipEnt_Sel, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFLecTipEnt)==0) )
         {
            h8B90( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFLecTipEnt, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV84TFLecEstado_Sels.fromJSonString(AV82TFLecEstado_SelsJson, null);
      if ( ! ( AV84TFLecEstado_Sels.size() == 0 ) )
      {
         AV87i = 1 ;
         AV107GXV1 = 1 ;
         while ( AV107GXV1 <= AV84TFLecEstado_Sels.size() )
         {
            AV85TFLecEstado_Sel = (String)AV84TFLecEstado_Sels.elementAt(-1+AV107GXV1) ;
            if ( AV87i == 1 )
            {
               AV83TFLecEstado_SelDscs = "" ;
            }
            else
            {
               AV83TFLecEstado_SelDscs += ", " ;
            }
            AV86FilterTFLecEstado_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV85TFLecEstado_Sel), "P") == 0 )
            {
               AV86FilterTFLecEstado_SelValueDescription = httpContext.getMessage( "Proceso", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV85TFLecEstado_Sel), "F") == 0 )
            {
               AV86FilterTFLecEstado_SelValueDescription = httpContext.getMessage( "Finalizadas", "") ;
            }
            AV83TFLecEstado_SelDscs += AV86FilterTFLecEstado_SelValueDescription ;
            AV87i = (long)(AV87i+1) ;
            AV107GXV1 = (int)(AV107GXV1+1) ;
         }
         h8B90( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 112, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFLecEstado_SelDscs, "")), 112, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8B90( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8B90( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 30, Gx_line+10, 84, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 146, Gx_line+10, 200, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 378, Gx_line+10, 432, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 436, Gx_line+10, 490, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 494, Gx_line+10, 550, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 554, Gx_line+10, 609, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 613, Gx_line+10, 668, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 672, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV109Tlectorwwds_1_filterfulltext = AV88FilterFullText ;
      AV110Tlectorwwds_2_tflecmaqcod = AV30TFLecMaqCod ;
      AV111Tlectorwwds_3_tflecmaqcod_sel = AV31TFLecMaqCod_Sel ;
      AV112Tlectorwwds_4_tflechdr = AV89TFLecHdr ;
      AV113Tlectorwwds_5_tflechdr_sel = AV90TFLecHdr_Sel ;
      AV114Tlectorwwds_6_tflecopecod = AV40TFLecOpeCod ;
      AV115Tlectorwwds_7_tflecopecod_to = AV41TFLecOpeCod_To ;
      AV116Tlectorwwds_8_tflecopenom = AV96TFlecOpeNom ;
      AV117Tlectorwwds_9_tflecopenom_sel = AV97TFlecOpeNom_Sel ;
      AV118Tlectorwwds_10_tflecfascod = AV44TFLecFasCod ;
      AV119Tlectorwwds_11_tflecfascod_sel = AV45TFLecFasCod_Sel ;
      AV120Tlectorwwds_12_tflecfasdsc = AV98TFLecFasDsc ;
      AV121Tlectorwwds_13_tflecfasdsc_sel = AV99TFLecFasDsc_Sel ;
      AV122Tlectorwwds_14_tflecfasord = AV48TFLecFasOrd ;
      AV123Tlectorwwds_15_tflecfasord_to = AV49TFLecFasOrd_To ;
      AV124Tlectorwwds_16_tflecparcod = AV50TFLecParCod ;
      AV125Tlectorwwds_17_tflecparcod_to = AV51TFLecParCod_To ;
      AV126Tlectorwwds_18_tflecparnom = AV100TFLecParNom ;
      AV127Tlectorwwds_19_tflecparnom_sel = AV101TFLecParNom_Sel ;
      AV128Tlectorwwds_20_tflechor = AV54TFLecHor ;
      AV129Tlectorwwds_21_tflechor_sel = AV55TFLecHor_Sel ;
      AV130Tlectorwwds_22_tflecfec = AV56TFLecFec ;
      AV131Tlectorwwds_23_tflectipent = AV58TFLecTipEnt ;
      AV132Tlectorwwds_24_tflectipent_sel = AV59TFLecTipEnt_Sel ;
      AV133Tlectorwwds_25_tflecestado_sels = AV84TFLecEstado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV133Tlectorwwds_25_tflecestado_sels ,
                                           AV111Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV110Tlectorwwds_2_tflecmaqcod ,
                                           AV113Tlectorwwds_5_tflechdr_sel ,
                                           AV112Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV114Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV115Tlectorwwds_7_tflecopecod_to) ,
                                           AV119Tlectorwwds_11_tflecfascod_sel ,
                                           AV118Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV122Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV123Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV124Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV125Tlectorwwds_17_tflecparcod_to) ,
                                           AV129Tlectorwwds_21_tflechor_sel ,
                                           AV128Tlectorwwds_20_tflechor ,
                                           AV130Tlectorwwds_22_tflecfec ,
                                           AV132Tlectorwwds_24_tflectipent_sel ,
                                           AV131Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
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
                                           AV109Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV117Tlectorwwds_9_tflecopenom_sel ,
                                           AV116Tlectorwwds_8_tflecopenom ,
                                           AV121Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV120Tlectorwwds_12_tflecfasdsc ,
                                           AV127Tlectorwwds_19_tflecparnom_sel ,
                                           AV126Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV133Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV110Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV110Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV112Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV112Tlectorwwds_4_tflechdr), 11, "%") ;
      lV118Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV118Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV128Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV128Tlectorwwds_20_tflechor), 8, "%") ;
      lV131Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV131Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B92 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV133Tlectorwwds_25_tflecestado_sels.size()), lV110Tlectorwwds_2_tflecmaqcod, AV111Tlectorwwds_3_tflecmaqcod_sel, lV112Tlectorwwds_4_tflechdr, AV113Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV114Tlectorwwds_6_tflecopecod), Integer.valueOf(AV115Tlectorwwds_7_tflecopecod_to), lV118Tlectorwwds_10_tflecfascod, AV119Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV122Tlectorwwds_14_tflecfasord), Short.valueOf(AV123Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV124Tlectorwwds_16_tflecparcod), Short.valueOf(AV125Tlectorwwds_17_tflecparcod_to), lV128Tlectorwwds_20_tflechor, AV129Tlectorwwds_21_tflechor_sel, AV130Tlectorwwds_22_tflecfec, lV131Tlectorwwds_23_tflectipent, AV132Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P08B92_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B92_n1796LecTipEnt[0] ;
         A1174LecFec = P08B92_A1174LecFec[0] ;
         n1174LecFec = P08B92_n1174LecFec[0] ;
         A1173LecHor = P08B92_A1173LecHor[0] ;
         n1173LecHor = P08B92_n1173LecHor[0] ;
         A13721LecHdr = P08B92_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B92_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B92_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B92_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B92_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B92_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B92_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B92_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B92_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B92_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B92_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B92_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B92_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B92_n1171LecFasCod[0] ;
         A1172LecParCod = P08B92_A1172LecParCod[0] ;
         n1172LecParCod = P08B92_n1172LecParCod[0] ;
         A396EmprCod = P08B92_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV133Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV133Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV117Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV116Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV116Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV117Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV117Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV121Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV120Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV121Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV121Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV109Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV109Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV109Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV109Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV109Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV127Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV126Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV127Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV127Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV81LecEstadoDescription = "" ;
                                 if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "P") == 0 )
                                 {
                                    AV81LecEstadoDescription = httpContext.getMessage( "Proceso", "") ;
                                 }
                                 else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "F") == 0 )
                                 {
                                    AV81LecEstadoDescription = httpContext.getMessage( "Finalizadas", "") ;
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
                                 h8B90( false, 36) ;
                                 getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1166LecMaqCod, "")), 30, Gx_line+10, 84, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13721LecHdr, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9")), 146, Gx_line+10, 200, Gx_line+25, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14259lecOpeNom, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1171LecFasCod, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14260LecFasDsc, "")), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9")), 378, Gx_line+10, 432, Gx_line+25, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9")), 436, Gx_line+10, 490, Gx_line+25, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14261LecParNom, "")), 494, Gx_line+10, 550, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1173LecHor, "")), 554, Gx_line+10, 609, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(localUtil.format( A1174LecFec, "99/99/99"), 613, Gx_line+10, 668, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1796LecTipEnt, "")), 672, Gx_line+10, 727, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81LecEstadoDescription, "")), 731, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV26Session.getValue("TLECTORWWGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TLECTORWWGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("TLECTORWWGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV134GXV2 = 1 ;
      while ( AV134GXV2 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV2));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV88FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV30TFLecMaqCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV31TFLecMaqCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV89TFLecHdr = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV90TFLecHdr_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV40TFLecOpeCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFLecOpeCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV96TFlecOpeNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV97TFlecOpeNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV44TFLecFasCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD_SEL") == 0 )
         {
            AV45TFLecFasCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV98TFLecFasDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV99TFLecFasDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV48TFLecFasOrd = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFLecFasOrd_To = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV50TFLecParCod = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFLecParCod_To = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV100TFLecParNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV101TFLecParNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV54TFLecHor = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR_SEL") == 0 )
         {
            AV55TFLecHor_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV56TFLecFec = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV58TFLecTipEnt = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT_SEL") == 0 )
         {
            AV59TFLecTipEnt_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV82TFLecEstado_SelsJson = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV84TFLecEstado_Sels.fromJSonString(AV82TFLecEstado_SelsJson, null);
         }
         AV134GXV2 = (int)(AV134GXV2+1) ;
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

   public void h8B90( boolean bFoot ,
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
               AV72PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV68DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV75Title = AV104Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV75Title = "" ;
      AV88FilterFullText = "" ;
      AV31TFLecMaqCod_Sel = "" ;
      AV30TFLecMaqCod = "" ;
      AV90TFLecHdr_Sel = "" ;
      AV89TFLecHdr = "" ;
      AV62TFLecOpeCod_To_Description = "" ;
      AV97TFlecOpeNom_Sel = "" ;
      AV96TFlecOpeNom = "" ;
      AV45TFLecFasCod_Sel = "" ;
      AV44TFLecFasCod = "" ;
      AV99TFLecFasDsc_Sel = "" ;
      AV98TFLecFasDsc = "" ;
      AV63TFLecFasOrd_To_Description = "" ;
      AV64TFLecParCod_To_Description = "" ;
      AV101TFLecParNom_Sel = "" ;
      AV100TFLecParNom = "" ;
      AV55TFLecHor_Sel = "" ;
      AV54TFLecHor = "" ;
      AV56TFLecFec = GXutil.nullDate() ;
      AV59TFLecTipEnt_Sel = "" ;
      AV58TFLecTipEnt = "" ;
      AV84TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82TFLecEstado_SelsJson = "" ;
      AV85TFLecEstado_Sel = "" ;
      AV83TFLecEstado_SelDscs = "" ;
      AV86FilterTFLecEstado_SelValueDescription = "" ;
      A13722LecEstado = "" ;
      A1166LecMaqCod = "" ;
      A13721LecHdr = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      AV109Tlectorwwds_1_filterfulltext = "" ;
      AV110Tlectorwwds_2_tflecmaqcod = "" ;
      AV111Tlectorwwds_3_tflecmaqcod_sel = "" ;
      AV112Tlectorwwds_4_tflechdr = "" ;
      AV113Tlectorwwds_5_tflechdr_sel = "" ;
      AV116Tlectorwwds_8_tflecopenom = "" ;
      AV117Tlectorwwds_9_tflecopenom_sel = "" ;
      AV118Tlectorwwds_10_tflecfascod = "" ;
      AV119Tlectorwwds_11_tflecfascod_sel = "" ;
      AV120Tlectorwwds_12_tflecfasdsc = "" ;
      AV121Tlectorwwds_13_tflecfasdsc_sel = "" ;
      AV126Tlectorwwds_18_tflecparnom = "" ;
      AV127Tlectorwwds_19_tflecparnom_sel = "" ;
      AV128Tlectorwwds_20_tflechor = "" ;
      AV129Tlectorwwds_21_tflechor_sel = "" ;
      AV130Tlectorwwds_22_tflecfec = GXutil.nullDate() ;
      AV131Tlectorwwds_23_tflectipent = "" ;
      AV132Tlectorwwds_24_tflectipent_sel = "" ;
      AV133Tlectorwwds_25_tflecestado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV110Tlectorwwds_2_tflecmaqcod = "" ;
      lV112Tlectorwwds_4_tflechdr = "" ;
      lV118Tlectorwwds_10_tflecfascod = "" ;
      lV128Tlectorwwds_20_tflechor = "" ;
      lV131Tlectorwwds_23_tflectipent = "" ;
      A1169LecBarPar = "" ;
      P08B92_A1796LecTipEnt = new String[] {""} ;
      P08B92_n1796LecTipEnt = new boolean[] {false} ;
      P08B92_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B92_n1174LecFec = new boolean[] {false} ;
      P08B92_A1173LecHor = new String[] {""} ;
      P08B92_n1173LecHor = new boolean[] {false} ;
      P08B92_A13721LecHdr = new String[] {""} ;
      P08B92_A1166LecMaqCod = new String[] {""} ;
      P08B92_A1188LecFasOrd = new short[1] ;
      P08B92_n1188LecFasOrd = new boolean[] {false} ;
      P08B92_A1169LecBarPar = new String[] {""} ;
      P08B92_n1169LecBarPar = new boolean[] {false} ;
      P08B92_A1168LecBarReo = new byte[1] ;
      P08B92_n1168LecBarReo = new boolean[] {false} ;
      P08B92_A1167LecBarCod = new int[1] ;
      P08B92_n1167LecBarCod = new boolean[] {false} ;
      P08B92_A1170LecOpeCod = new int[1] ;
      P08B92_n1170LecOpeCod = new boolean[] {false} ;
      P08B92_A1171LecFasCod = new String[] {""} ;
      P08B92_n1171LecFasCod = new boolean[] {false} ;
      P08B92_A1172LecParCod = new short[1] ;
      P08B92_n1172LecParCod = new boolean[] {false} ;
      P08B92_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV81LecEstadoDescription = "" ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72PageInfo = "" ;
      AV68DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV104Pgmdesc = "" ;
      AV92AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08B92_A1796LecTipEnt, P08B92_n1796LecTipEnt, P08B92_A1174LecFec, P08B92_n1174LecFec, P08B92_A1173LecHor, P08B92_n1173LecHor, P08B92_A13721LecHdr, P08B92_A1166LecMaqCod, P08B92_A1188LecFasOrd, P08B92_n1188LecFasOrd,
            P08B92_A1169LecBarPar, P08B92_n1169LecBarPar, P08B92_A1168LecBarReo, P08B92_n1168LecBarReo, P08B92_A1167LecBarCod, P08B92_n1167LecBarCod, P08B92_A1170LecOpeCod, P08B92_n1170LecOpeCod, P08B92_A1171LecFasCod, P08B92_n1171LecFasCod,
            P08B92_A1172LecParCod, P08B92_n1172LecParCod, P08B92_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV104Pgmdesc = httpContext.getMessage( "Listado Tabla LECTOR", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV104Pgmdesc = httpContext.getMessage( "Listado Tabla LECTOR", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private short gxcookieaux ;
   private short AV48TFLecFasOrd ;
   private short AV49TFLecFasOrd_To ;
   private short AV50TFLecParCod ;
   private short AV51TFLecParCod_To ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV122Tlectorwwds_14_tflecfasord ;
   private short AV123Tlectorwwds_15_tflecfasord_to ;
   private short AV124Tlectorwwds_16_tflecparcod ;
   private short AV125Tlectorwwds_17_tflecparcod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV40TFLecOpeCod ;
   private int AV41TFLecOpeCod_To ;
   private int AV107GXV1 ;
   private int A1170LecOpeCod ;
   private int AV114Tlectorwwds_6_tflecopecod ;
   private int AV115Tlectorwwds_7_tflecopecod_to ;
   private int AV133Tlectorwwds_25_tflecestado_sels_size ;
   private int A1167LecBarCod ;
   private int AV134GXV2 ;
   private long AV87i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV31TFLecMaqCod_Sel ;
   private String AV30TFLecMaqCod ;
   private String AV90TFLecHdr_Sel ;
   private String AV89TFLecHdr ;
   private String AV97TFlecOpeNom_Sel ;
   private String AV96TFlecOpeNom ;
   private String AV45TFLecFasCod_Sel ;
   private String AV44TFLecFasCod ;
   private String AV99TFLecFasDsc_Sel ;
   private String AV98TFLecFasDsc ;
   private String AV101TFLecParNom_Sel ;
   private String AV100TFLecParNom ;
   private String AV55TFLecHor_Sel ;
   private String AV54TFLecHor ;
   private String AV59TFLecTipEnt_Sel ;
   private String AV58TFLecTipEnt ;
   private String AV85TFLecEstado_Sel ;
   private String A13722LecEstado ;
   private String A1166LecMaqCod ;
   private String A13721LecHdr ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String AV110Tlectorwwds_2_tflecmaqcod ;
   private String AV111Tlectorwwds_3_tflecmaqcod_sel ;
   private String AV112Tlectorwwds_4_tflechdr ;
   private String AV113Tlectorwwds_5_tflechdr_sel ;
   private String AV116Tlectorwwds_8_tflecopenom ;
   private String AV117Tlectorwwds_9_tflecopenom_sel ;
   private String AV118Tlectorwwds_10_tflecfascod ;
   private String AV119Tlectorwwds_11_tflecfascod_sel ;
   private String AV120Tlectorwwds_12_tflecfasdsc ;
   private String AV121Tlectorwwds_13_tflecfasdsc_sel ;
   private String AV126Tlectorwwds_18_tflecparnom ;
   private String AV127Tlectorwwds_19_tflecparnom_sel ;
   private String AV128Tlectorwwds_20_tflechor ;
   private String AV129Tlectorwwds_21_tflechor_sel ;
   private String AV131Tlectorwwds_23_tflectipent ;
   private String AV132Tlectorwwds_24_tflectipent_sel ;
   private String scmdbuf ;
   private String lV110Tlectorwwds_2_tflecmaqcod ;
   private String lV112Tlectorwwds_4_tflechdr ;
   private String lV118Tlectorwwds_10_tflecfascod ;
   private String lV128Tlectorwwds_20_tflechor ;
   private String lV131Tlectorwwds_23_tflectipent ;
   private String A1169LecBarPar ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV104Pgmdesc ;
   private java.util.Date AV56TFLecFec ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV130Tlectorwwds_22_tflecfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV82TFLecEstado_SelsJson ;
   private String AV75Title ;
   private String AV88FilterFullText ;
   private String AV62TFLecOpeCod_To_Description ;
   private String AV63TFLecFasOrd_To_Description ;
   private String AV64TFLecParCod_To_Description ;
   private String AV83TFLecEstado_SelDscs ;
   private String AV86FilterTFLecEstado_SelValueDescription ;
   private String AV109Tlectorwwds_1_filterfulltext ;
   private String AV81LecEstadoDescription ;
   private String AV72PageInfo ;
   private String AV68DateInfo ;
   private String AV92AppName ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08B92_A1796LecTipEnt ;
   private boolean[] P08B92_n1796LecTipEnt ;
   private java.util.Date[] P08B92_A1174LecFec ;
   private boolean[] P08B92_n1174LecFec ;
   private String[] P08B92_A1173LecHor ;
   private boolean[] P08B92_n1173LecHor ;
   private String[] P08B92_A13721LecHdr ;
   private String[] P08B92_A1166LecMaqCod ;
   private short[] P08B92_A1188LecFasOrd ;
   private boolean[] P08B92_n1188LecFasOrd ;
   private String[] P08B92_A1169LecBarPar ;
   private boolean[] P08B92_n1169LecBarPar ;
   private byte[] P08B92_A1168LecBarReo ;
   private boolean[] P08B92_n1168LecBarReo ;
   private int[] P08B92_A1167LecBarCod ;
   private boolean[] P08B92_n1167LecBarCod ;
   private int[] P08B92_A1170LecOpeCod ;
   private boolean[] P08B92_n1170LecOpeCod ;
   private String[] P08B92_A1171LecFasCod ;
   private boolean[] P08B92_n1171LecFasCod ;
   private short[] P08B92_A1172LecParCod ;
   private boolean[] P08B92_n1172LecParCod ;
   private String[] P08B92_A396EmprCod ;
   private GXSimpleCollection<String> AV84TFLecEstado_Sels ;
   private GXSimpleCollection<String> AV133Tlectorwwds_25_tflecestado_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class tlectorwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV133Tlectorwwds_25_tflecestado_sels ,
                                          String AV111Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV110Tlectorwwds_2_tflecmaqcod ,
                                          String AV113Tlectorwwds_5_tflechdr_sel ,
                                          String AV112Tlectorwwds_4_tflechdr ,
                                          int AV114Tlectorwwds_6_tflecopecod ,
                                          int AV115Tlectorwwds_7_tflecopecod_to ,
                                          String AV119Tlectorwwds_11_tflecfascod_sel ,
                                          String AV118Tlectorwwds_10_tflecfascod ,
                                          short AV122Tlectorwwds_14_tflecfasord ,
                                          short AV123Tlectorwwds_15_tflecfasord_to ,
                                          short AV124Tlectorwwds_16_tflecparcod ,
                                          short AV125Tlectorwwds_17_tflecparcod_to ,
                                          String AV129Tlectorwwds_21_tflechor_sel ,
                                          String AV128Tlectorwwds_20_tflechor ,
                                          java.util.Date AV130Tlectorwwds_22_tflecfec ,
                                          String AV132Tlectorwwds_24_tflectipent_sel ,
                                          String AV131Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
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
                                          String AV109Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV117Tlectorwwds_9_tflecopenom_sel ,
                                          String AV116Tlectorwwds_8_tflecopenom ,
                                          String AV121Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV120Tlectorwwds_12_tflecfasdsc ,
                                          String AV127Tlectorwwds_19_tflecparnom_sel ,
                                          String AV126Tlectorwwds_18_tflecparnom ,
                                          int AV133Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV111Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV110Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV112Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV114Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV115Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV118Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV122Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV123Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV124Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV125Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV128Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV130Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV131Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
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
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
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
                  return conditional_P08B92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

