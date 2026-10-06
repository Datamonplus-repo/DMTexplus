package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class diariodefacturacion_lineas_wcexportreport_impl extends GXWebReport
{
   public diariodefacturacion_lineas_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV43DiariodeFacturacion_lineas_json_GET = AV44Websession.getValue(httpContext.getMessage( "&DiariodeFacturacion_lineas_json", "")) ;
         AV11DiariodeFacturacion_lineas_SDT.fromJSonString(AV43DiariodeFacturacion_lineas_json_GET, null);
         AV44Websession.remove(httpContext.getMessage( "&DiariodeFacturacion_lineas_json", ""));
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
         AV41Title = httpContext.getMessage( "Lista de Diario de Facturacion (lineas)", "") ;
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
         hA6Q0( true, 0) ;
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
         hA6Q0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 55, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 55, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA6Q0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA6Q0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 30, Gx_line+10, 80, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 84, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 138, Gx_line+10, 188, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 192, Gx_line+10, 242, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 246, Gx_line+10, 296, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Documento", ""), 300, Gx_line+10, 350, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 354, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 408, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 462, Gx_line+10, 512, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 516, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 571, Gx_line+10, 622, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 626, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 681, Gx_line+10, 732, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. Linea", ""), 736, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV11DiariodeFacturacion_lineas_SDT.size() )
      {
         AV10DiariodeFacturacion_lineas_SDTItem = (app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV11DiariodeFacturacion_lineas_SDT.elementAt(-1+AV50GXV1));
         AV13DiariodeFacturacion_lineas_SDTItem_Facfch = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch() ;
         AV14DiariodeFacturacion_lineas_SDTItem_Faccod = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod() ;
         AV15DiariodeFacturacion_lineas_SDTItem_Clicod = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod() ;
         AV16DiariodeFacturacion_lineas_SDTItem_CliNom = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom() ;
         AV17DiariodeFacturacion_lineas_SDTItem_Facalbcod = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod() ;
         AV18DiariodeFacturacion_lineas_SDTItem_AlbProfch = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch() ;
         AV19DiariodeFacturacion_lineas_SDTItem_FacSer = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser() ;
         AV20DiariodeFacturacion_lineas_SDTItem_Color = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color() ;
         AV21DiariodeFacturacion_lineas_SDTItem_FacKgs = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs() ;
         AV22DiariodeFacturacion_lineas_SDTItem_FacPreKgs = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs() ;
         AV23DiariodeFacturacion_lineas_SDTItem_FacMts = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts() ;
         AV24DiariodeFacturacion_lineas_SDTItem_FacPremts = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts() ;
         AV25DiariodeFacturacion_lineas_SDTItem_BarAlbPie = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie() ;
         AV26DiariodeFacturacion_lineas_SDTItem_FacImp = AV10DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA6Q0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV13DiariodeFacturacion_lineas_SDTItem_Facfch, "99/99/99"), 30, Gx_line+10, 80, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14DiariodeFacturacion_lineas_SDTItem_Faccod), "ZZZZZZZ9")), 84, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15DiariodeFacturacion_lineas_SDTItem_Clicod), "ZZZZZ9")), 138, Gx_line+10, 188, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DiariodeFacturacion_lineas_SDTItem_CliNom, "")), 192, Gx_line+10, 242, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17DiariodeFacturacion_lineas_SDTItem_Facalbcod), "ZZZZZZZZZ9")), 246, Gx_line+10, 296, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV18DiariodeFacturacion_lineas_SDTItem_AlbProfch, "99/99/99"), 300, Gx_line+10, 350, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DiariodeFacturacion_lineas_SDTItem_FacSer, "")), 354, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20DiariodeFacturacion_lineas_SDTItem_Color, "")), 408, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21DiariodeFacturacion_lineas_SDTItem_FacKgs, "ZZZZZ9.99")), 462, Gx_line+10, 512, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22DiariodeFacturacion_lineas_SDTItem_FacPreKgs, "ZZZZZZ9.999")), 516, Gx_line+10, 567, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23DiariodeFacturacion_lineas_SDTItem_FacMts, "ZZZZZ9.99")), 571, Gx_line+10, 622, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24DiariodeFacturacion_lineas_SDTItem_FacPremts, "ZZZZZZ9.999")), 626, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25DiariodeFacturacion_lineas_SDTItem_BarAlbPie), "ZZZZZ9")), 681, Gx_line+10, 732, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26DiariodeFacturacion_lineas_SDTItem_FacImp, "ZZZZZZZZZZ9.99")), 736, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("Facturacion.DiariodeFacturacion_lineas_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.DiariodeFacturacion_lineas_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("Facturacion.DiariodeFacturacion_lineas_WCGridState"), null, null);
      }
      AV51GXV2 = 1 ;
      while ( AV51GXV2 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV2));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV2 = (int)(AV51GXV2+1) ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
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

   public void hA6Q0( boolean bFoot ,
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
               AV39PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV36DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV41Title = AV47Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV43DiariodeFacturacion_lineas_json_GET = "" ;
      AV44Websession = httpContext.getWebSession();
      AV11DiariodeFacturacion_lineas_SDT = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Title = "" ;
      AV12FilterFullText = "" ;
      AV10DiariodeFacturacion_lineas_SDTItem = new app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item(remoteHandle, context);
      AV13DiariodeFacturacion_lineas_SDTItem_Facfch = GXutil.nullDate() ;
      AV16DiariodeFacturacion_lineas_SDTItem_CliNom = "" ;
      AV18DiariodeFacturacion_lineas_SDTItem_AlbProfch = GXutil.nullDate() ;
      AV19DiariodeFacturacion_lineas_SDTItem_FacSer = "" ;
      AV20DiariodeFacturacion_lineas_SDTItem_Color = "" ;
      AV21DiariodeFacturacion_lineas_SDTItem_FacKgs = DecimalUtil.ZERO ;
      AV22DiariodeFacturacion_lineas_SDTItem_FacPreKgs = DecimalUtil.ZERO ;
      AV23DiariodeFacturacion_lineas_SDTItem_FacMts = DecimalUtil.ZERO ;
      AV24DiariodeFacturacion_lineas_SDTItem_FacPremts = DecimalUtil.ZERO ;
      AV26DiariodeFacturacion_lineas_SDTItem_FacImp = DecimalUtil.ZERO ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV39PageInfo = "" ;
      AV36DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV47Pgmdesc = "" ;
      AV34AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "Diariode Facturacion_lineas_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "Diariode Facturacion_lineas_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV50GXV1 ;
   private int AV14DiariodeFacturacion_lineas_SDTItem_Faccod ;
   private int AV15DiariodeFacturacion_lineas_SDTItem_Clicod ;
   private int AV25DiariodeFacturacion_lineas_SDTItem_BarAlbPie ;
   private int AV51GXV2 ;
   private long AV17DiariodeFacturacion_lineas_SDTItem_Facalbcod ;
   private java.math.BigDecimal AV21DiariodeFacturacion_lineas_SDTItem_FacKgs ;
   private java.math.BigDecimal AV22DiariodeFacturacion_lineas_SDTItem_FacPreKgs ;
   private java.math.BigDecimal AV23DiariodeFacturacion_lineas_SDTItem_FacMts ;
   private java.math.BigDecimal AV24DiariodeFacturacion_lineas_SDTItem_FacPremts ;
   private java.math.BigDecimal AV26DiariodeFacturacion_lineas_SDTItem_FacImp ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV16DiariodeFacturacion_lineas_SDTItem_CliNom ;
   private String AV19DiariodeFacturacion_lineas_SDTItem_FacSer ;
   private String AV20DiariodeFacturacion_lineas_SDTItem_Color ;
   private String AV47Pgmdesc ;
   private java.util.Date AV13DiariodeFacturacion_lineas_SDTItem_Facfch ;
   private java.util.Date AV18DiariodeFacturacion_lineas_SDTItem_AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV43DiariodeFacturacion_lineas_json_GET ;
   private String AV41Title ;
   private String AV12FilterFullText ;
   private String AV39PageInfo ;
   private String AV36DateInfo ;
   private String AV34AppName ;
   private com.genexus.webpanels.WebSession AV44Websession ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> AV11DiariodeFacturacion_lineas_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item AV10DiariodeFacturacion_lineas_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

