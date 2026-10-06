package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport_impl extends GXWebReport
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport_impl( com.genexus.internet.HttpContext context )
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
         h9090( true, 0) ;
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
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFDevCruId) && (0==AV18TFDevCruId_To) ) )
      {
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFDevCruId), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFDevCruId_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Devolucion Id", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDevCruId_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFDevCruId_To), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFDevCruFec)) )
      {
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Devolucion", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV19TFDevCruFec, "99/99/99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV21TFCliCod) && (0==AV22TFCliCod_To) ) )
      {
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCliCod), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCliCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod_To), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCliNom_Sel)==0) )
      {
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCliNom)==0) )
         {
            h9090( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCliNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV25TFTrnCod) && (0==AV26TFTrnCod_To) ) )
      {
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFTrnCod), "ZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFTrnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Transp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9090( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFTrnCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFTrnCod_To), "ZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFTrnNom_Sel)==0) )
      {
         h9090( false, 20) ;
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
            h9090( false, 20) ;
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
         h9090( false, 20) ;
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
            h9090( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFDevCruMat, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFDevCruObs_Sel)==0) )
      {
         h9090( false, 20) ;
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
            h9090( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDevCruObs, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9090( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9090( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Devolucion Id", ""), 30, Gx_line+10, 81, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Devolucion", ""), 85, Gx_line+10, 136, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 140, Gx_line+10, 191, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 195, Gx_line+10, 297, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 301, Gx_line+10, 352, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 356, Gx_line+10, 459, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 463, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 571, Gx_line+10, 675, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 679, Gx_line+10, 731, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 735, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV12FilterFullText ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV17TFDevCruId ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV18TFDevCruId_To ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV19TFDevCruFec ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV21TFCliCod ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV22TFCliCod_To ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV23TFCliNom ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV24TFCliNom_Sel ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV25TFTrnCod ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV26TFTrnCod_To ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV27TFTrnNom ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV28TFTrnNom_Sel ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV29TFDevCruMat ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV30TFDevCruMat_Sel ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV31TFDevCruObs ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV32TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV52CliCod) ,
                                           Integer.valueOf(AV53CliCod_to) ,
                                           AV50DevCruFec ,
                                           AV51DevCruFec_to ,
                                           Integer.valueOf(AV58AlbRecCod) ,
                                           AV56AlbRef ,
                                           AV57AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV56AlbRef = GXutil.padr( GXutil.rtrim( AV56AlbRef), 16, "%") ;
      lV57AlbREnt = GXutil.padr( GXutil.rtrim( AV57AlbREnt), 8, "%") ;
      /* Using cursor P09093 */
      pr_default.execute(0, new Object[] {AV49Emprcod, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV52CliCod), Integer.valueOf(AV53CliCod_to), AV50DevCruFec, AV51DevCruFec_to, Integer.valueOf(AV58AlbRecCod), lV56AlbRef, lV57AlbREnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46AlbREnt = P09093_A46AlbREnt[0] ;
         A45AlbRef = P09093_A45AlbRef[0] ;
         A44AlbRecCod = P09093_A44AlbRecCod[0] ;
         A396EmprCod = P09093_A396EmprCod[0] ;
         A11682DevCruObs = P09093_A11682DevCruObs[0] ;
         A11672DevCruMat = P09093_A11672DevCruMat[0] ;
         A841TrnNom = P09093_A841TrnNom[0] ;
         n841TrnNom = P09093_n841TrnNom[0] ;
         A840TrnCod = P09093_A840TrnCod[0] ;
         n840TrnCod = P09093_n840TrnCod[0] ;
         A279CliNom = P09093_A279CliNom[0] ;
         A252CliCod = P09093_A252CliCod[0] ;
         A11670DevCruFec = P09093_A11670DevCruFec[0] ;
         A11669DevCruId = P09093_A11669DevCruId[0] ;
         A40000GXC1 = P09093_A40000GXC1[0] ;
         n40000GXC1 = P09093_n40000GXC1[0] ;
         A40001GXC2 = P09093_A40001GXC2[0] ;
         n40001GXC2 = P09093_n40001GXC2[0] ;
         A46AlbREnt = P09093_A46AlbREnt[0] ;
         A45AlbRef = P09093_A45AlbRef[0] ;
         A840TrnCod = P09093_A840TrnCod[0] ;
         n840TrnCod = P09093_n840TrnCod[0] ;
         A252CliCod = P09093_A252CliCod[0] ;
         A279CliNom = P09093_A279CliNom[0] ;
         A841TrnNom = P09093_A841TrnNom[0] ;
         n841TrnNom = P09093_n841TrnNom[0] ;
         A11682DevCruObs = P09093_A11682DevCruObs[0] ;
         A11672DevCruMat = P09093_A11672DevCruMat[0] ;
         A11670DevCruFec = P09093_A11670DevCruFec[0] ;
         A40000GXC1 = P09093_A40000GXC1[0] ;
         n40000GXC1 = P09093_n40000GXC1[0] ;
         A40001GXC2 = P09093_A40001GXC2[0] ;
         n40001GXC2 = P09093_n40001GXC2[0] ;
         AV54DevCruUnd = A40000GXC1 ;
         AV55DevCruPzs = A40001GXC2 ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
         h9090( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 30, Gx_line+10, 81, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 85, Gx_line+10, 136, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 140, Gx_line+10, 191, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 195, Gx_line+10, 297, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 301, Gx_line+10, 352, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 356, Gx_line+10, 459, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), 463, Gx_line+10, 567, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11682DevCruObs, "")), 571, Gx_line+10, 675, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54DevCruUnd, "ZZZZZ9.99")), 679, Gx_line+10, 731, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55DevCruPzs), "ZZZZZ9")), 735, Gx_line+10, 787, Gx_line+55, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
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
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV31TFDevCruObs = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV32TFDevCruObs_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC") == 0 )
         {
            AV50DevCruFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC_TO") == 0 )
         {
            AV51DevCruFec_to = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV52CliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV53CliCod_to = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV56AlbRef = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENT") == 0 )
         {
            AV57AlbREnt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV58AlbRecCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
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

   public void h9090( boolean bFoot ,
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
            AV47Title = AV61Pgmdesc ;
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
      AV35TFCliCod_To_Description = "" ;
      AV24TFCliNom_Sel = "" ;
      AV23TFCliNom = "" ;
      AV36TFTrnCod_To_Description = "" ;
      AV28TFTrnNom_Sel = "" ;
      AV27TFTrnNom = "" ;
      AV30TFDevCruMat_Sel = "" ;
      AV29TFDevCruMat = "" ;
      AV32TFDevCruObs_Sel = "" ;
      AV31TFDevCruObs = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      A11670DevCruFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = GXutil.nullDate() ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = "" ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = "" ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = "" ;
      scmdbuf = "" ;
      lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      lV56AlbRef = "" ;
      lV57AlbREnt = "" ;
      AV50DevCruFec = GXutil.nullDate() ;
      AV51DevCruFec_to = GXutil.nullDate() ;
      AV56AlbRef = "" ;
      AV57AlbREnt = "" ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      AV49Emprcod = "" ;
      A396EmprCod = "" ;
      P09093_A46AlbREnt = new String[] {""} ;
      P09093_A45AlbRef = new String[] {""} ;
      P09093_A44AlbRecCod = new int[1] ;
      P09093_A396EmprCod = new String[] {""} ;
      P09093_A11682DevCruObs = new String[] {""} ;
      P09093_A11672DevCruMat = new String[] {""} ;
      P09093_A841TrnNom = new String[] {""} ;
      P09093_n841TrnNom = new boolean[] {false} ;
      P09093_A840TrnCod = new short[1] ;
      P09093_n840TrnCod = new boolean[] {false} ;
      P09093_A279CliNom = new String[] {""} ;
      P09093_A252CliCod = new int[1] ;
      P09093_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09093_A11669DevCruId = new int[1] ;
      P09093_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09093_n40000GXC1 = new boolean[] {false} ;
      P09093_A40001GXC2 = new int[1] ;
      P09093_n40001GXC2 = new boolean[] {false} ;
      AV54DevCruUnd = DecimalUtil.ZERO ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV61Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport__default(),
         new Object[] {
             new Object[] {
            P09093_A46AlbREnt, P09093_A45AlbRef, P09093_A44AlbRecCod, P09093_A396EmprCod, P09093_A11682DevCruObs, P09093_A11672DevCruMat, P09093_A841TrnNom, P09093_n841TrnNom, P09093_A840TrnCod, P09093_n840TrnCod,
            P09093_A279CliNom, P09093_A252CliCod, P09093_A11670DevCruFec, P09093_A11669DevCruId, P09093_A40000GXC1, P09093_n40000GXC1, P09093_A40001GXC2, P09093_n40001GXC2
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV61Pgmdesc = httpContext.getMessage( "WCConsulta Devoluciones Almacen Tejidoencrudosindetalle Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV61Pgmdesc = httpContext.getMessage( "WCConsulta Devoluciones Almacen Tejidoencrudosindetalle Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV25TFTrnCod ;
   private short AV26TFTrnCod_To ;
   private short A840TrnCod ;
   private short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ;
   private short AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ;
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
   private int A40001GXC2 ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ;
   private int AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ;
   private int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ;
   private int AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ;
   private int AV52CliCod ;
   private int AV53CliCod_to ;
   private int AV58AlbRecCod ;
   private int A44AlbRecCod ;
   private int AV55DevCruPzs ;
   private int AV81GXV1 ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal AV54DevCruUnd ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFCliNom_Sel ;
   private String AV23TFCliNom ;
   private String AV28TFTrnNom_Sel ;
   private String AV27TFTrnNom ;
   private String AV30TFDevCruMat_Sel ;
   private String AV29TFDevCruMat ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ;
   private String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ;
   private String scmdbuf ;
   private String lV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String lV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String lV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String lV56AlbRef ;
   private String lV57AlbREnt ;
   private String AV56AlbRef ;
   private String AV57AlbREnt ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String AV49Emprcod ;
   private String A396EmprCod ;
   private String AV61Pgmdesc ;
   private java.util.Date AV19TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ;
   private java.util.Date AV50DevCruFec ;
   private java.util.Date AV51DevCruFec_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private String AV47Title ;
   private String AV12FilterFullText ;
   private String AV33TFDevCruId_To_Description ;
   private String AV35TFCliCod_To_Description ;
   private String AV36TFTrnCod_To_Description ;
   private String AV32TFDevCruObs_Sel ;
   private String AV31TFDevCruObs ;
   private String A11682DevCruObs ;
   private String AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ;
   private String lV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String lV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV45PageInfo ;
   private String AV42DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09093_A46AlbREnt ;
   private String[] P09093_A45AlbRef ;
   private int[] P09093_A44AlbRecCod ;
   private String[] P09093_A396EmprCod ;
   private String[] P09093_A11682DevCruObs ;
   private String[] P09093_A11672DevCruMat ;
   private String[] P09093_A841TrnNom ;
   private boolean[] P09093_n841TrnNom ;
   private short[] P09093_A840TrnCod ;
   private boolean[] P09093_n840TrnCod ;
   private String[] P09093_A279CliNom ;
   private int[] P09093_A252CliCod ;
   private java.util.Date[] P09093_A11670DevCruFec ;
   private int[] P09093_A11669DevCruId ;
   private java.math.BigDecimal[] P09093_A40000GXC1 ;
   private boolean[] P09093_n40000GXC1 ;
   private int[] P09093_A40001GXC2 ;
   private boolean[] P09093_n40001GXC2 ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetalleexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09093( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV52CliCod ,
                                          int AV53CliCod_to ,
                                          java.util.Date AV50DevCruFec ,
                                          java.util.Date AV51DevCruFec_to ,
                                          int AV58AlbRecCod ,
                                          String AV56AlbRef ,
                                          String AV57AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS AlbREnt, NULL AS AlbRef, NULL AS AlbRecCod, NULL AS EmprCod, DevCruObs, DevCruMat, TrnNom, TrnCod, CliNom, CliCod, DevCruFec, DevCruId, GXC1," ;
      scmdbuf += " GXC2 FROM ( SELECT T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T1.EmprCod, T5.DevCruObs, T5.DevCruMat, T4.TrnNom, T2.TrnCod, T3.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId," ;
      scmdbuf += " COALESCE( T6.GXC1, 0) AS GXC1, COALESCE( T6.GXC2, 0) AS GXC2 FROM (((((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T2.TrnCod) INNER" ;
      scmdbuf += " JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId = T1.DevCruId) LEFT JOIN (SELECT SUM(T7.DevCruUnd) AS GXC1, T7.DevCruId, SUM(T7.DevCruPzs) AS GXC2" ;
      scmdbuf += " FROM ((((TXPDEVCR1 T7 INNER JOIN TXPALBREC T8 ON T8.EmprCod = T7.EmprCod AND T8.AlbRecCod = T7.AlbRecCod) LEFT JOIN TXPCLIENT T9 ON T9.EmprCod = T7.EmprCod AND" ;
      scmdbuf += " T9.CliCod = T8.CliCod) LEFT JOIN TXPTRANSP T10 ON T10.EmprCod = T7.EmprCod AND T10.TrnCod = T8.TrnCod) INNER JOIN TXPDEVCRU T11 ON T11.EmprCod = T7.EmprCod AND" ;
      scmdbuf += " T11.DevCruId = T7.DevCruId) GROUP BY T7.DevCruId ) T6 ON T6.DevCruId = T1.DevCruId)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV52CliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV53CliCod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV58AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruFec DESC" ;
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
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruMat" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruMat DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.DevCruObs" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.DevCruObs DESC" ;
      }
      scmdbuf += ") DistinctT" ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruId" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruId DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY CliNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruMat" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruMat DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY DevCruObs" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY DevCruObs DESC" ;
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
                  return conditional_P09093(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09093", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

