package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidocrudosindetallewwexportreport_impl extends GXWebReport
{
   public devolucionalmacentejidocrudosindetallewwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV47Title = httpContext.getMessage( "Lista de Devolucion Almacen Tejido Crudo (sin detalle)", "") ;
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
         h9060( true, 0) ;
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
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFDevCruId) && (0==AV18TFDevCruId_To) ) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFDevCruId), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFDevCruId_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Devolucion Id", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDevCruId_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFDevCruId_To), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFDevCruFec)) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV19TFDevCruFec, "99/99/99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57TFDevCruSal) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV57TFDevCruSal, "99/99/99 99:99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV21TFCliCod) && (0==AV22TFCliCod_To) ) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCliCod), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCliCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod_To), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCliNom_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCliNom)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCliNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV25TFTrnCod) && (0==AV26TFTrnCod_To) ) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFTrnCod), "ZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFTrnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Transp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFTrnCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFTrnCod_To), "ZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFTrnNom_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFTrnNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFTrnNom)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFTrnNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFDevCruMat_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFDevCruMat_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFDevCruMat)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFDevCruMat, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV65TFDevCruAtId_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ATDocCodeID", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFDevCruAtId_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV64TFDevCruAtId)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ATDocCodeID", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFDevCruAtId, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV54TFDevCruStt_Sels.fromJSonString(AV52TFDevCruStt_SelsJson, null);
      if ( ! ( AV54TFDevCruStt_Sels.size() == 0 ) )
      {
         AV56i = 1 ;
         AV71GXV1 = 1 ;
         while ( AV71GXV1 <= AV54TFDevCruStt_Sels.size() )
         {
            AV50TFDevCruStt_Sel = (String)AV54TFDevCruStt_Sels.elementAt(-1+AV71GXV1) ;
            if ( AV56i == 1 )
            {
               AV53TFDevCruStt_SelDscs = "" ;
            }
            else
            {
               AV53TFDevCruStt_SelDscs += ", " ;
            }
            AV55FilterTFDevCruStt_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV50TFDevCruStt_Sel), "") == 0 )
            {
               AV55FilterTFDevCruStt_SelValueDescription = httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV50TFDevCruStt_Sel), "A") == 0 )
            {
               AV55FilterTFDevCruStt_SelValueDescription = httpContext.getMessage( "Anulado", "") ;
            }
            AV53TFDevCruStt_SelDscs += AV55FilterTFDevCruStt_SelValueDescription ;
            AV56i = (long)(AV56i+1) ;
            AV71GXV1 = (int)(AV71GXV1+1) ;
         }
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Status", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFDevCruStt_SelDscs, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFDevCruObs_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFDevCruObs_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFDevCruObs)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDevCruObs, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV61TFDevCruHash_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFDevCruHash_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV60TFDevCruHash)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFDevCruHash, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV63TFDevCruDesc_Sel)==0) )
      {
         h9060( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFDevCruDesc_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFDevCruDesc)==0) )
         {
            h9060( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFDevCruDesc, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9060( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9060( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 204, Gx_line+10, 258, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 320, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 436, Gx_line+10, 490, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ATDocCodeID", ""), 494, Gx_line+10, 548, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Status", ""), 552, Gx_line+10, 607, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 611, Gx_line+10, 667, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 671, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV12FilterFullText ;
      AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV17TFDevCruId ;
      AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV18TFDevCruId_To ;
      AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV19TFDevCruFec ;
      AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV21TFCliCod ;
      AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV22TFCliCod_To ;
      AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV23TFCliNom ;
      AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV24TFCliNom_Sel ;
      AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV25TFTrnCod ;
      AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV26TFTrnCod_To ;
      AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV27TFTrnNom ;
      AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV28TFTrnNom_Sel ;
      AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV29TFDevCruMat ;
      AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV30TFDevCruMat_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV64TFDevCruAtId ;
      AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV65TFDevCruAtId_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV54TFDevCruStt_Sels ;
      AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV31TFDevCruObs ;
      AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV32TFDevCruObs_Sel ;
      AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV60TFDevCruHash ;
      AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV61TFDevCruHash_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV62TFDevCruDesc ;
      AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV63TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09062 */
      pr_default.execute(0, new Object[] {lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09062_A396EmprCod[0] ;
         A11675DevCruDesc = P09062_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09062_A11674DevCruHash[0] ;
         A11682DevCruObs = P09062_A11682DevCruObs[0] ;
         A11678DevCruStt = P09062_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09062_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09062_A11672DevCruMat[0] ;
         A841TrnNom = P09062_A841TrnNom[0] ;
         n841TrnNom = P09062_n841TrnNom[0] ;
         A840TrnCod = P09062_A840TrnCod[0] ;
         n840TrnCod = P09062_n840TrnCod[0] ;
         A279CliNom = P09062_A279CliNom[0] ;
         A252CliCod = P09062_A252CliCod[0] ;
         A11673DevCruSal = P09062_A11673DevCruSal[0] ;
         A11670DevCruFec = P09062_A11670DevCruFec[0] ;
         A11669DevCruId = P09062_A11669DevCruId[0] ;
         A841TrnNom = P09062_A841TrnNom[0] ;
         n841TrnNom = P09062_n841TrnNom[0] ;
         A279CliNom = P09062_A279CliNom[0] ;
         AV51DevCruSttDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), "") == 0 )
         {
            AV51DevCruSttDescription = httpContext.getMessage( "Activo", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), "A") == 0 )
         {
            AV51DevCruSttDescription = httpContext.getMessage( "Anulado", "") ;
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
         h9060( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 30, Gx_line+10, 84, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 88, Gx_line+10, 142, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A11673DevCruSal, "99/99/99 99:99"), 146, Gx_line+10, 200, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 204, Gx_line+10, 258, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 262, Gx_line+10, 316, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 320, Gx_line+10, 374, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 378, Gx_line+10, 432, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), 436, Gx_line+10, 490, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), 494, Gx_line+10, 548, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51DevCruSttDescription, "")), 552, Gx_line+10, 607, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11682DevCruObs, "")), 611, Gx_line+10, 667, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11674DevCruHash, "")), 671, Gx_line+10, 727, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11675DevCruDesc, "")), 731, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV2 = 1 ;
      while ( AV97GXV2 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV2));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV17TFDevCruId = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFDevCruId_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV19TFDevCruFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV57TFDevCruSal = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV21TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV23TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV24TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV25TFTrnCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFTrnCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV27TFTrnNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV28TFTrnNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV29TFDevCruMat = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV30TFDevCruMat_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV64TFDevCruAtId = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV65TFDevCruAtId_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV52TFDevCruStt_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFDevCruStt_Sels.fromJSonString(AV52TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV31TFDevCruObs = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV32TFDevCruObs_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV60TFDevCruHash = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV61TFDevCruHash_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV62TFDevCruDesc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV63TFDevCruDesc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV97GXV2 = (int)(AV97GXV2+1) ;
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

   public void h9060( boolean bFoot ,
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
               AV45PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV42DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV47Title = AV68Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV47Title = "" ;
      AV12FilterFullText = "" ;
      AV33TFDevCruId_To_Description = "" ;
      AV19TFDevCruFec = GXutil.nullDate() ;
      AV57TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV35TFCliCod_To_Description = "" ;
      AV24TFCliNom_Sel = "" ;
      AV23TFCliNom = "" ;
      AV36TFTrnCod_To_Description = "" ;
      AV28TFTrnNom_Sel = "" ;
      AV27TFTrnNom = "" ;
      AV30TFDevCruMat_Sel = "" ;
      AV29TFDevCruMat = "" ;
      AV65TFDevCruAtId_Sel = "" ;
      AV64TFDevCruAtId = "" ;
      AV54TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFDevCruStt_SelsJson = "" ;
      AV50TFDevCruStt_Sel = "" ;
      AV53TFDevCruStt_SelDscs = "" ;
      AV55FilterTFDevCruStt_SelValueDescription = "" ;
      AV32TFDevCruObs_Sel = "" ;
      AV31TFDevCruObs = "" ;
      AV61TFDevCruHash_Sel = "" ;
      AV60TFDevCruHash = "" ;
      AV63TFDevCruDesc_Sel = "" ;
      AV62TFDevCruDesc = "" ;
      A11678DevCruStt = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11680DevCruAtId = "" ;
      A11682DevCruObs = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = "" ;
      AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = "" ;
      AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = "" ;
      AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = "" ;
      AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = "" ;
      AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = "" ;
      AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = "" ;
      scmdbuf = "" ;
      lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      lV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      lV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      lV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      lV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      lV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      lV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      lV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      P09062_A396EmprCod = new String[] {""} ;
      P09062_A11675DevCruDesc = new String[] {""} ;
      P09062_A11674DevCruHash = new String[] {""} ;
      P09062_A11682DevCruObs = new String[] {""} ;
      P09062_A11678DevCruStt = new String[] {""} ;
      P09062_A11680DevCruAtId = new String[] {""} ;
      P09062_A11672DevCruMat = new String[] {""} ;
      P09062_A841TrnNom = new String[] {""} ;
      P09062_n841TrnNom = new boolean[] {false} ;
      P09062_A840TrnCod = new short[1] ;
      P09062_n840TrnCod = new boolean[] {false} ;
      P09062_A279CliNom = new String[] {""} ;
      P09062_A252CliCod = new int[1] ;
      P09062_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09062_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09062_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV51DevCruSttDescription = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV68Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetallewwexportreport__default(),
         new Object[] {
             new Object[] {
            P09062_A396EmprCod, P09062_A11675DevCruDesc, P09062_A11674DevCruHash, P09062_A11682DevCruObs, P09062_A11678DevCruStt, P09062_A11680DevCruAtId, P09062_A11672DevCruMat, P09062_A841TrnNom, P09062_n841TrnNom, P09062_A840TrnCod,
            P09062_n840TrnCod, P09062_A279CliNom, P09062_A252CliCod, P09062_A11673DevCruSal, P09062_A11670DevCruFec, P09062_A11669DevCruId
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV68Pgmdesc = httpContext.getMessage( "Devolucion Almacen Tejido Crudosindetalle WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV68Pgmdesc = httpContext.getMessage( "Devolucion Almacen Tejido Crudosindetalle WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV25TFTrnCod ;
   private short AV26TFTrnCod_To ;
   private short A840TrnCod ;
   private short AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ;
   private short AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV17TFDevCruId ;
   private int AV18TFDevCruId_To ;
   private int AV21TFCliCod ;
   private int AV22TFCliCod_To ;
   private int AV71GXV1 ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ;
   private int AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ;
   private int AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ;
   private int AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ;
   private int AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ;
   private int AV97GXV2 ;
   private long AV56i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFCliNom_Sel ;
   private String AV23TFCliNom ;
   private String AV28TFTrnNom_Sel ;
   private String AV27TFTrnNom ;
   private String AV30TFDevCruMat_Sel ;
   private String AV29TFDevCruMat ;
   private String AV65TFDevCruAtId_Sel ;
   private String AV64TFDevCruAtId ;
   private String AV50TFDevCruStt_Sel ;
   private String AV61TFDevCruHash_Sel ;
   private String AV60TFDevCruHash ;
   private String AV63TFDevCruDesc_Sel ;
   private String AV62TFDevCruDesc ;
   private String A11678DevCruStt ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A11680DevCruAtId ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ;
   private String AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ;
   private String AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ;
   private String AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ;
   private String AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ;
   private String AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ;
   private String scmdbuf ;
   private String lV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String lV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String lV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String lV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String lV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String lV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String A396EmprCod ;
   private String AV68Pgmdesc ;
   private java.util.Date AV57TFDevCruSal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ;
   private java.util.Date AV19TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private String AV52TFDevCruStt_SelsJson ;
   private String AV47Title ;
   private String AV12FilterFullText ;
   private String AV33TFDevCruId_To_Description ;
   private String AV35TFCliCod_To_Description ;
   private String AV36TFTrnCod_To_Description ;
   private String AV53TFDevCruStt_SelDscs ;
   private String AV55FilterTFDevCruStt_SelValueDescription ;
   private String AV32TFDevCruObs_Sel ;
   private String AV31TFDevCruObs ;
   private String A11682DevCruObs ;
   private String AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ;
   private String lV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String lV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV51DevCruSttDescription ;
   private String AV45PageInfo ;
   private String AV42DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09062_A396EmprCod ;
   private String[] P09062_A11675DevCruDesc ;
   private String[] P09062_A11674DevCruHash ;
   private String[] P09062_A11682DevCruObs ;
   private String[] P09062_A11678DevCruStt ;
   private String[] P09062_A11680DevCruAtId ;
   private String[] P09062_A11672DevCruMat ;
   private String[] P09062_A841TrnNom ;
   private boolean[] P09062_n841TrnNom ;
   private short[] P09062_A840TrnCod ;
   private boolean[] P09062_n840TrnCod ;
   private String[] P09062_A279CliNom ;
   private int[] P09062_A252CliCod ;
   private java.util.Date[] P09062_A11673DevCruSal ;
   private java.util.Date[] P09062_A11670DevCruFec ;
   private int[] P09062_A11669DevCruId ;
   private GXSimpleCollection<String> AV54TFDevCruStt_Sels ;
   private GXSimpleCollection<String> AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class devolucionalmacentejidocrudosindetallewwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09062( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV73Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV74Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV82Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV83Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV86Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV88Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV93Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV95Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruFec DESC" ;
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
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruMat" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruMat DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruStt" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruStt DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruObs" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruObs DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruHash" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruHash DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc DESC" ;
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
                  return conditional_P09062(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09062", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 300);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
               }
               return;
      }
   }

}

