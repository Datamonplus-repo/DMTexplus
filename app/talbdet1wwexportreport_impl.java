package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet1wwexportreport_impl extends GXWebReport
{
   public talbdet1wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV111Title = httpContext.getMessage( "Lista de Mantenimiento Almacen Entradas Tela (Header)", "") ;
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
         h86A0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV127FilterFullText)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127FilterFullText, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV41TFAlbRecCod) && (0==AV42TFAlbRecCod_To) ) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Recepcion", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFAlbRecCod), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV89TFAlbRecCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Recepcion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFAlbRecCod_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbRecCod_To), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47TFAlbRFen)) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV47TFAlbRFen, "99/99/99"), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV49TFAlbRHEn) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora de entrada", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV49TFAlbRHEn, "99/99/99 99:99"), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFCliNom_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFCliNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFCliNom)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFCliNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV56TFAlbRef_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFAlbRef_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV55TFAlbRef)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFAlbRef, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV58TFAlbRefDsc_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFAlbRefDsc_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFAlbRefDsc)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFAlbRefDsc, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV62TFProceNom_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFProceNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV61TFProceNom)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFProceNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV66TFTrnNom_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFTrnNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV65TFTrnNom)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFTrnNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV70TFTipEntNom_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFTipEntNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFTipEntNom)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFTipEntNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFAlbRDes_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFAlbRDes_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFAlbRDes)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFAlbRDes, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbRUniEnt_To)==0) ) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unds Ent", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73TFAlbRUniEnt, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV96TFAlbRUniEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unds Ent", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96TFAlbRUniEnt_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TFAlbRUniEnt_To, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV131TFAlbRUni_Sels.fromJSonString(AV129TFAlbRUni_SelsJson, null);
      if ( ! ( AV131TFAlbRUni_Sels.size() == 0 ) )
      {
         AV101i = 1 ;
         AV143GXV1 = 1 ;
         while ( AV143GXV1 <= AV131TFAlbRUni_Sels.size() )
         {
            AV76TFAlbRUni_Sel = (String)AV131TFAlbRUni_Sels.elementAt(-1+AV143GXV1) ;
            if ( AV101i == 1 )
            {
               AV130TFAlbRUni_SelDscs = "" ;
            }
            else
            {
               AV130TFAlbRUni_SelDscs += ", " ;
            }
            AV132FilterTFAlbRUni_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV76TFAlbRUni_Sel), "K") == 0 )
            {
               AV132FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV76TFAlbRUni_Sel), "M") == 0 )
            {
               AV132FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "M", "") ;
            }
            AV130TFAlbRUni_SelDscs += AV132FilterTFAlbRUni_SelValueDescription ;
            AV101i = (long)(AV101i+1) ;
            AV143GXV1 = (int)(AV143GXV1+1) ;
         }
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Und", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130TFAlbRUni_SelDscs, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV77TFAlbRPieEnt) && (0==AV78TFAlbRPieEnt_To) ) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pzs Ent", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFAlbRPieEnt), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV97TFAlbRPieEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pzs Ent", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97TFAlbRPieEnt_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TFAlbRPieEnt_To), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV80TFAlbRLoc_Sel)==0) )
      {
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFAlbRLoc_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV79TFAlbRLoc)==0) )
         {
            h86A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFAlbRLoc, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV83TFAlbRReo_Sels.fromJSonString(AV81TFAlbRReo_SelsJson, null);
      if ( ! ( AV83TFAlbRReo_Sels.size() == 0 ) )
      {
         AV101i = 1 ;
         AV144GXV2 = 1 ;
         while ( AV144GXV2 <= AV83TFAlbRReo_Sels.size() )
         {
            AV84TFAlbRReo_Sel = (String)AV83TFAlbRReo_Sels.elementAt(-1+AV144GXV2) ;
            if ( AV101i == 1 )
            {
               AV82TFAlbRReo_SelDscs = "" ;
            }
            else
            {
               AV82TFAlbRReo_SelDscs += ", " ;
            }
            AV98FilterTFAlbRReo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), "NO") == 0 )
            {
               AV98FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), "SI") == 0 )
            {
               AV98FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "SI", "") ;
            }
            AV82TFAlbRReo_SelDscs += AV98FilterTFAlbRReo_SelValueDescription ;
            AV101i = (long)(AV101i+1) ;
            AV144GXV2 = (int)(AV144GXV2+1) ;
         }
         h86A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFAlbRReo_SelDscs, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h86A0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h86A0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Recepcion", ""), 30, Gx_line+10, 76, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 80, Gx_line+10, 126, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora de entrada", ""), 130, Gx_line+10, 176, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 180, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 230, Gx_line+10, 276, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 280, Gx_line+10, 326, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 330, Gx_line+10, 376, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 380, Gx_line+10, 426, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 430, Gx_line+10, 478, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 482, Gx_line+10, 530, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unds Ent", ""), 534, Gx_line+10, 581, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Und", ""), 585, Gx_line+10, 633, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pzs Ent", ""), 637, Gx_line+10, 684, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 688, Gx_line+10, 735, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 739, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV146Talbdet1wwds_1_filterfulltext = AV127FilterFullText ;
      AV147Talbdet1wwds_2_tfalbreccod = AV41TFAlbRecCod ;
      AV148Talbdet1wwds_3_tfalbreccod_to = AV42TFAlbRecCod_To ;
      AV149Talbdet1wwds_4_tfalbrfen = AV47TFAlbRFen ;
      AV150Talbdet1wwds_5_tfalbrhen = AV49TFAlbRHEn ;
      AV151Talbdet1wwds_6_tfclinom = AV53TFCliNom ;
      AV152Talbdet1wwds_7_tfclinom_sel = AV54TFCliNom_Sel ;
      AV153Talbdet1wwds_8_tfalbref = AV55TFAlbRef ;
      AV154Talbdet1wwds_9_tfalbref_sel = AV56TFAlbRef_Sel ;
      AV155Talbdet1wwds_10_tfalbrefdsc = AV57TFAlbRefDsc ;
      AV156Talbdet1wwds_11_tfalbrefdsc_sel = AV58TFAlbRefDsc_Sel ;
      AV157Talbdet1wwds_12_tfprocenom = AV61TFProceNom ;
      AV158Talbdet1wwds_13_tfprocenom_sel = AV62TFProceNom_Sel ;
      AV159Talbdet1wwds_14_tftrnnom = AV65TFTrnNom ;
      AV160Talbdet1wwds_15_tftrnnom_sel = AV66TFTrnNom_Sel ;
      AV161Talbdet1wwds_16_tftipentnom = AV69TFTipEntNom ;
      AV162Talbdet1wwds_17_tftipentnom_sel = AV70TFTipEntNom_Sel ;
      AV163Talbdet1wwds_18_tfalbrdes = AV71TFAlbRDes ;
      AV164Talbdet1wwds_19_tfalbrdes_sel = AV72TFAlbRDes_Sel ;
      AV165Talbdet1wwds_20_tfalbrunient = AV73TFAlbRUniEnt ;
      AV166Talbdet1wwds_21_tfalbrunient_to = AV74TFAlbRUniEnt_To ;
      AV167Talbdet1wwds_22_tfalbruni_sels = AV131TFAlbRUni_Sels ;
      AV168Talbdet1wwds_23_tfalbrpieent = AV77TFAlbRPieEnt ;
      AV169Talbdet1wwds_24_tfalbrpieent_to = AV78TFAlbRPieEnt_To ;
      AV170Talbdet1wwds_25_tfalbrloc = AV79TFAlbRLoc ;
      AV171Talbdet1wwds_26_tfalbrloc_sel = AV80TFAlbRLoc_Sel ;
      AV172Talbdet1wwds_27_tfalbrreo_sels = AV83TFAlbRReo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV167Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV172Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV147Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV148Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV149Talbdet1wwds_4_tfalbrfen ,
                                           AV150Talbdet1wwds_5_tfalbrhen ,
                                           AV152Talbdet1wwds_7_tfclinom_sel ,
                                           AV151Talbdet1wwds_6_tfclinom ,
                                           AV154Talbdet1wwds_9_tfalbref_sel ,
                                           AV153Talbdet1wwds_8_tfalbref ,
                                           AV156Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV155Talbdet1wwds_10_tfalbrefdsc ,
                                           AV158Talbdet1wwds_13_tfprocenom_sel ,
                                           AV157Talbdet1wwds_12_tfprocenom ,
                                           AV160Talbdet1wwds_15_tftrnnom_sel ,
                                           AV159Talbdet1wwds_14_tftrnnom ,
                                           AV162Talbdet1wwds_17_tftipentnom_sel ,
                                           AV161Talbdet1wwds_16_tftipentnom ,
                                           AV164Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV163Talbdet1wwds_18_tfalbrdes ,
                                           AV165Talbdet1wwds_20_tfalbrunient ,
                                           AV166Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV167Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV168Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV169Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV171Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV170Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV172Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV146Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV151Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV151Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV153Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV153Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV155Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV155Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV157Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV157Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV159Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV159Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV161Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV161Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV163Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV163Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV170Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV170Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P086A2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV147Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV148Talbdet1wwds_3_tfalbreccod_to), AV149Talbdet1wwds_4_tfalbrfen, AV150Talbdet1wwds_5_tfalbrhen, lV151Talbdet1wwds_6_tfclinom, AV152Talbdet1wwds_7_tfclinom_sel, lV153Talbdet1wwds_8_tfalbref, AV154Talbdet1wwds_9_tfalbref_sel, lV155Talbdet1wwds_10_tfalbrefdsc, AV156Talbdet1wwds_11_tfalbrefdsc_sel, lV157Talbdet1wwds_12_tfprocenom, AV158Talbdet1wwds_13_tfprocenom_sel, lV159Talbdet1wwds_14_tftrnnom, AV160Talbdet1wwds_15_tftrnnom_sel, lV161Talbdet1wwds_16_tftipentnom, AV162Talbdet1wwds_17_tftipentnom_sel, lV163Talbdet1wwds_18_tfalbrdes, AV164Talbdet1wwds_19_tfalbrdes_sel, AV165Talbdet1wwds_20_tfalbrunient, AV166Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV168Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV169Talbdet1wwds_24_tfalbrpieent_to), lV170Talbdet1wwds_25_tfalbrloc, AV171Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086A2_A396EmprCod[0] ;
         A252CliCod = P086A2_A252CliCod[0] ;
         A840TrnCod = P086A2_A840TrnCod[0] ;
         n840TrnCod = P086A2_n840TrnCod[0] ;
         A970ProceCod = P086A2_A970ProceCod[0] ;
         n970ProceCod = P086A2_n970ProceCod[0] ;
         A1211TipEntCod = P086A2_A1211TipEntCod[0] ;
         n1211TipEntCod = P086A2_n1211TipEntCod[0] ;
         A50AlbRLoc = P086A2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086A2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086A2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086A2_A1291AlbRDes[0] ;
         A1212TipEntNom = P086A2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086A2_n1212TipEntNom[0] ;
         A841TrnNom = P086A2_A841TrnNom[0] ;
         n841TrnNom = P086A2_n841TrnNom[0] ;
         A971ProceNom = P086A2_A971ProceNom[0] ;
         n971ProceNom = P086A2_n971ProceNom[0] ;
         A3613AlbRefDsc = P086A2_A3613AlbRefDsc[0] ;
         A45AlbRef = P086A2_A45AlbRef[0] ;
         A279CliNom = P086A2_A279CliNom[0] ;
         A4606AlbRHEn = P086A2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086A2_n4606AlbRHEn[0] ;
         A49AlbRFen = P086A2_A49AlbRFen[0] ;
         A44AlbRecCod = P086A2_A44AlbRecCod[0] ;
         A55AlbRReo = P086A2_A55AlbRReo[0] ;
         A56AlbRUni = P086A2_A56AlbRUni[0] ;
         A279CliNom = P086A2_A279CliNom[0] ;
         A841TrnNom = P086A2_A841TrnNom[0] ;
         n841TrnNom = P086A2_n841TrnNom[0] ;
         A971ProceNom = P086A2_A971ProceNom[0] ;
         n971ProceNom = P086A2_n971ProceNom[0] ;
         A1212TipEntNom = P086A2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086A2_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV146Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV146Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV146Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV146Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV146Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV128AlbRUniDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
            {
               AV128AlbRUniDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
            {
               AV128AlbRUniDescription = httpContext.getMessage( "M", "") ;
            }
            AV12AlbRReoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "SI", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
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
            h86A0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 30, Gx_line+10, 76, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+10, 126, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), 130, Gx_line+10, 176, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 180, Gx_line+10, 226, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 230, Gx_line+10, 276, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 280, Gx_line+10, 326, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 330, Gx_line+10, 376, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 380, Gx_line+10, 426, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), 430, Gx_line+10, 478, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 482, Gx_line+10, 530, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 534, Gx_line+10, 581, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128AlbRUniDescription, "")), 585, Gx_line+10, 633, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 637, Gx_line+10, 684, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 688, Gx_line+10, 735, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AlbRReoDescription, "")), 739, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV37Session.getValue("TALBDET1WWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDET1WWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TALBDET1WWGridState"), null, null);
      }
      AV10OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV173GXV3 = 1 ;
      while ( AV173GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV173GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV127FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV41TFAlbRecCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFAlbRecCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV47TFAlbRFen = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV49TFAlbRHEn = localUtil.ctot( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV53TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV54TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV55TFAlbRef = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV56TFAlbRef_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV57TFAlbRefDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV58TFAlbRefDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV61TFProceNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV62TFProceNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV65TFTrnNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV66TFTrnNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV69TFTipEntNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV70TFTipEntNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV71TFAlbRDes = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV72TFAlbRDes_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV73TFAlbRUniEnt = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFAlbRUniEnt_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV129TFAlbRUni_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV131TFAlbRUni_Sels.fromJSonString(AV129TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV77TFAlbRPieEnt = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFAlbRPieEnt_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV79TFAlbRLoc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV80TFAlbRLoc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV81TFAlbRReo_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFAlbRReo_Sels.fromJSonString(AV81TFAlbRReo_SelsJson, null);
         }
         AV173GXV3 = (int)(AV173GXV3+1) ;
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

   public void h86A0( boolean bFoot ,
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
               AV108PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV104DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV111Title = AV140Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV111Title = "" ;
      AV127FilterFullText = "" ;
      AV89TFAlbRecCod_To_Description = "" ;
      AV47TFAlbRFen = GXutil.nullDate() ;
      AV49TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV54TFCliNom_Sel = "" ;
      AV53TFCliNom = "" ;
      AV56TFAlbRef_Sel = "" ;
      AV55TFAlbRef = "" ;
      AV58TFAlbRefDsc_Sel = "" ;
      AV57TFAlbRefDsc = "" ;
      AV62TFProceNom_Sel = "" ;
      AV61TFProceNom = "" ;
      AV66TFTrnNom_Sel = "" ;
      AV65TFTrnNom = "" ;
      AV70TFTipEntNom_Sel = "" ;
      AV69TFTipEntNom = "" ;
      AV72TFAlbRDes_Sel = "" ;
      AV71TFAlbRDes = "" ;
      AV73TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV74TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV96TFAlbRUniEnt_To_Description = "" ;
      AV131TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV129TFAlbRUni_SelsJson = "" ;
      AV76TFAlbRUni_Sel = "" ;
      AV130TFAlbRUni_SelDscs = "" ;
      AV132FilterTFAlbRUni_SelValueDescription = "" ;
      AV97TFAlbRPieEnt_To_Description = "" ;
      AV80TFAlbRLoc_Sel = "" ;
      AV79TFAlbRLoc = "" ;
      AV83TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81TFAlbRReo_SelsJson = "" ;
      AV84TFAlbRReo_Sel = "" ;
      AV82TFAlbRReo_SelDscs = "" ;
      AV98FilterTFAlbRReo_SelValueDescription = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      AV146Talbdet1wwds_1_filterfulltext = "" ;
      AV149Talbdet1wwds_4_tfalbrfen = GXutil.nullDate() ;
      AV150Talbdet1wwds_5_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV151Talbdet1wwds_6_tfclinom = "" ;
      AV152Talbdet1wwds_7_tfclinom_sel = "" ;
      AV153Talbdet1wwds_8_tfalbref = "" ;
      AV154Talbdet1wwds_9_tfalbref_sel = "" ;
      AV155Talbdet1wwds_10_tfalbrefdsc = "" ;
      AV156Talbdet1wwds_11_tfalbrefdsc_sel = "" ;
      AV157Talbdet1wwds_12_tfprocenom = "" ;
      AV158Talbdet1wwds_13_tfprocenom_sel = "" ;
      AV159Talbdet1wwds_14_tftrnnom = "" ;
      AV160Talbdet1wwds_15_tftrnnom_sel = "" ;
      AV161Talbdet1wwds_16_tftipentnom = "" ;
      AV162Talbdet1wwds_17_tftipentnom_sel = "" ;
      AV163Talbdet1wwds_18_tfalbrdes = "" ;
      AV164Talbdet1wwds_19_tfalbrdes_sel = "" ;
      AV165Talbdet1wwds_20_tfalbrunient = DecimalUtil.ZERO ;
      AV166Talbdet1wwds_21_tfalbrunient_to = DecimalUtil.ZERO ;
      AV167Talbdet1wwds_22_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV170Talbdet1wwds_25_tfalbrloc = "" ;
      AV171Talbdet1wwds_26_tfalbrloc_sel = "" ;
      AV172Talbdet1wwds_27_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV151Talbdet1wwds_6_tfclinom = "" ;
      lV153Talbdet1wwds_8_tfalbref = "" ;
      lV155Talbdet1wwds_10_tfalbrefdsc = "" ;
      lV157Talbdet1wwds_12_tfprocenom = "" ;
      lV159Talbdet1wwds_14_tftrnnom = "" ;
      lV161Talbdet1wwds_16_tftipentnom = "" ;
      lV163Talbdet1wwds_18_tfalbrdes = "" ;
      lV170Talbdet1wwds_25_tfalbrloc = "" ;
      P086A2_A396EmprCod = new String[] {""} ;
      P086A2_A252CliCod = new int[1] ;
      P086A2_A840TrnCod = new short[1] ;
      P086A2_n840TrnCod = new boolean[] {false} ;
      P086A2_A970ProceCod = new short[1] ;
      P086A2_n970ProceCod = new boolean[] {false} ;
      P086A2_A1211TipEntCod = new short[1] ;
      P086A2_n1211TipEntCod = new boolean[] {false} ;
      P086A2_A50AlbRLoc = new String[] {""} ;
      P086A2_A52AlbRPieEnt = new int[1] ;
      P086A2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086A2_A1291AlbRDes = new String[] {""} ;
      P086A2_A1212TipEntNom = new String[] {""} ;
      P086A2_n1212TipEntNom = new boolean[] {false} ;
      P086A2_A841TrnNom = new String[] {""} ;
      P086A2_n841TrnNom = new boolean[] {false} ;
      P086A2_A971ProceNom = new String[] {""} ;
      P086A2_n971ProceNom = new boolean[] {false} ;
      P086A2_A3613AlbRefDsc = new String[] {""} ;
      P086A2_A45AlbRef = new String[] {""} ;
      P086A2_A279CliNom = new String[] {""} ;
      P086A2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086A2_n4606AlbRHEn = new boolean[] {false} ;
      P086A2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086A2_A44AlbRecCod = new int[1] ;
      P086A2_A55AlbRReo = new String[] {""} ;
      P086A2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV128AlbRUniDescription = "" ;
      AV12AlbRReoDescription = "" ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV108PageInfo = "" ;
      AV104DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV140Pgmdesc = "" ;
      AV134AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet1wwexportreport__default(),
         new Object[] {
             new Object[] {
            P086A2_A396EmprCod, P086A2_A252CliCod, P086A2_A840TrnCod, P086A2_n840TrnCod, P086A2_A970ProceCod, P086A2_n970ProceCod, P086A2_A1211TipEntCod, P086A2_n1211TipEntCod, P086A2_A50AlbRLoc, P086A2_A52AlbRPieEnt,
            P086A2_A58AlbRUniEnt, P086A2_A1291AlbRDes, P086A2_A1212TipEntNom, P086A2_n1212TipEntNom, P086A2_A841TrnNom, P086A2_n841TrnNom, P086A2_A971ProceNom, P086A2_n971ProceNom, P086A2_A3613AlbRefDsc, P086A2_A45AlbRef,
            P086A2_A279CliNom, P086A2_A4606AlbRHEn, P086A2_n4606AlbRHEn, P086A2_A49AlbRFen, P086A2_A44AlbRecCod, P086A2_A55AlbRReo, P086A2_A56AlbRUni
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV140Pgmdesc = httpContext.getMessage( "TALBDET1 WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV140Pgmdesc = httpContext.getMessage( "TALBDET1 WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV41TFAlbRecCod ;
   private int AV42TFAlbRecCod_To ;
   private int AV143GXV1 ;
   private int AV77TFAlbRPieEnt ;
   private int AV78TFAlbRPieEnt_To ;
   private int AV144GXV2 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int AV147Talbdet1wwds_2_tfalbreccod ;
   private int AV148Talbdet1wwds_3_tfalbreccod_to ;
   private int AV168Talbdet1wwds_23_tfalbrpieent ;
   private int AV169Talbdet1wwds_24_tfalbrpieent_to ;
   private int AV167Talbdet1wwds_22_tfalbruni_sels_size ;
   private int AV172Talbdet1wwds_27_tfalbrreo_sels_size ;
   private int A252CliCod ;
   private int AV173GXV3 ;
   private long AV101i ;
   private java.math.BigDecimal AV73TFAlbRUniEnt ;
   private java.math.BigDecimal AV74TFAlbRUniEnt_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV165Talbdet1wwds_20_tfalbrunient ;
   private java.math.BigDecimal AV166Talbdet1wwds_21_tfalbrunient_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV54TFCliNom_Sel ;
   private String AV53TFCliNom ;
   private String AV56TFAlbRef_Sel ;
   private String AV55TFAlbRef ;
   private String AV58TFAlbRefDsc_Sel ;
   private String AV57TFAlbRefDsc ;
   private String AV62TFProceNom_Sel ;
   private String AV61TFProceNom ;
   private String AV66TFTrnNom_Sel ;
   private String AV65TFTrnNom ;
   private String AV70TFTipEntNom_Sel ;
   private String AV69TFTipEntNom ;
   private String AV72TFAlbRDes_Sel ;
   private String AV71TFAlbRDes ;
   private String AV76TFAlbRUni_Sel ;
   private String AV80TFAlbRLoc_Sel ;
   private String AV79TFAlbRLoc ;
   private String AV84TFAlbRReo_Sel ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A50AlbRLoc ;
   private String AV151Talbdet1wwds_6_tfclinom ;
   private String AV152Talbdet1wwds_7_tfclinom_sel ;
   private String AV153Talbdet1wwds_8_tfalbref ;
   private String AV154Talbdet1wwds_9_tfalbref_sel ;
   private String AV155Talbdet1wwds_10_tfalbrefdsc ;
   private String AV156Talbdet1wwds_11_tfalbrefdsc_sel ;
   private String AV157Talbdet1wwds_12_tfprocenom ;
   private String AV158Talbdet1wwds_13_tfprocenom_sel ;
   private String AV159Talbdet1wwds_14_tftrnnom ;
   private String AV160Talbdet1wwds_15_tftrnnom_sel ;
   private String AV161Talbdet1wwds_16_tftipentnom ;
   private String AV162Talbdet1wwds_17_tftipentnom_sel ;
   private String AV163Talbdet1wwds_18_tfalbrdes ;
   private String AV164Talbdet1wwds_19_tfalbrdes_sel ;
   private String AV170Talbdet1wwds_25_tfalbrloc ;
   private String AV171Talbdet1wwds_26_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV151Talbdet1wwds_6_tfclinom ;
   private String lV153Talbdet1wwds_8_tfalbref ;
   private String lV155Talbdet1wwds_10_tfalbrefdsc ;
   private String lV157Talbdet1wwds_12_tfprocenom ;
   private String lV159Talbdet1wwds_14_tftrnnom ;
   private String lV161Talbdet1wwds_16_tftipentnom ;
   private String lV163Talbdet1wwds_18_tfalbrdes ;
   private String lV170Talbdet1wwds_25_tfalbrloc ;
   private String A396EmprCod ;
   private String AV140Pgmdesc ;
   private java.util.Date AV49TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV150Talbdet1wwds_5_tfalbrhen ;
   private java.util.Date AV47TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV149Talbdet1wwds_4_tfalbrfen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n1212TipEntNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n4606AlbRHEn ;
   private String AV129TFAlbRUni_SelsJson ;
   private String AV81TFAlbRReo_SelsJson ;
   private String AV111Title ;
   private String AV127FilterFullText ;
   private String AV89TFAlbRecCod_To_Description ;
   private String AV96TFAlbRUniEnt_To_Description ;
   private String AV130TFAlbRUni_SelDscs ;
   private String AV132FilterTFAlbRUni_SelValueDescription ;
   private String AV97TFAlbRPieEnt_To_Description ;
   private String AV82TFAlbRReo_SelDscs ;
   private String AV98FilterTFAlbRReo_SelValueDescription ;
   private String AV146Talbdet1wwds_1_filterfulltext ;
   private String AV128AlbRUniDescription ;
   private String AV12AlbRReoDescription ;
   private String AV108PageInfo ;
   private String AV104DateInfo ;
   private String AV134AppName ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private IDataStoreProvider pr_default ;
   private String[] P086A2_A396EmprCod ;
   private int[] P086A2_A252CliCod ;
   private short[] P086A2_A840TrnCod ;
   private boolean[] P086A2_n840TrnCod ;
   private short[] P086A2_A970ProceCod ;
   private boolean[] P086A2_n970ProceCod ;
   private short[] P086A2_A1211TipEntCod ;
   private boolean[] P086A2_n1211TipEntCod ;
   private String[] P086A2_A50AlbRLoc ;
   private int[] P086A2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086A2_A58AlbRUniEnt ;
   private String[] P086A2_A1291AlbRDes ;
   private String[] P086A2_A1212TipEntNom ;
   private boolean[] P086A2_n1212TipEntNom ;
   private String[] P086A2_A841TrnNom ;
   private boolean[] P086A2_n841TrnNom ;
   private String[] P086A2_A971ProceNom ;
   private boolean[] P086A2_n971ProceNom ;
   private String[] P086A2_A3613AlbRefDsc ;
   private String[] P086A2_A45AlbRef ;
   private String[] P086A2_A279CliNom ;
   private java.util.Date[] P086A2_A4606AlbRHEn ;
   private boolean[] P086A2_n4606AlbRHEn ;
   private java.util.Date[] P086A2_A49AlbRFen ;
   private int[] P086A2_A44AlbRecCod ;
   private String[] P086A2_A55AlbRReo ;
   private String[] P086A2_A56AlbRUni ;
   private GXSimpleCollection<String> AV131TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV83TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV167Talbdet1wwds_22_tfalbruni_sels ;
   private GXSimpleCollection<String> AV172Talbdet1wwds_27_tfalbrreo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class talbdet1wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV167Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV172Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV147Talbdet1wwds_2_tfalbreccod ,
                                          int AV148Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV149Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV150Talbdet1wwds_5_tfalbrhen ,
                                          String AV152Talbdet1wwds_7_tfclinom_sel ,
                                          String AV151Talbdet1wwds_6_tfclinom ,
                                          String AV154Talbdet1wwds_9_tfalbref_sel ,
                                          String AV153Talbdet1wwds_8_tfalbref ,
                                          String AV156Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV155Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV158Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV157Talbdet1wwds_12_tfprocenom ,
                                          String AV160Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV159Talbdet1wwds_14_tftrnnom ,
                                          String AV162Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV161Talbdet1wwds_16_tftipentnom ,
                                          String AV164Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV163Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV165Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV166Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV167Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV168Talbdet1wwds_23_tfalbrpieent ,
                                          int AV169Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV171Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV170Talbdet1wwds_25_tfalbrloc ,
                                          int AV172Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV146Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV147Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV148Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV150Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV151Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV153Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV157Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV159Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV161Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV163Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( AV167Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV167Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV168Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV169Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV170Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( AV172Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV172Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
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
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
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
                  return conditional_P086A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
      }
   }

}

