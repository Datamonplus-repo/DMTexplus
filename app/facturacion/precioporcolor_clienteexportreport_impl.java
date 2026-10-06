package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporcolor_clienteexportreport_impl extends GXWebReport
{
   public precioporcolor_clienteexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV42Title = httpContext.getMessage( "Lista de Precio por Color (Cliente)", "") ;
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
         hA2L0( true, 0) ;
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
         hA2L0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 55, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), 55, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA2L0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA2L0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 30, Gx_line+10, 80, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero Color", ""), 84, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 138, Gx_line+10, 188, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 192, Gx_line+10, 242, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 246, Gx_line+10, 296, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 300, Gx_line+10, 350, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Nuevo", ""), 354, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Precio Actual", ""), 408, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "D?", ""), 462, Gx_line+10, 512, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Color(K)", ""), 516, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Coste General", ""), 571, Gx_line+10, 622, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Coste Total", ""), 626, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Clase", ""), 681, Gx_line+10, 732, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Kg. Old", ""), 736, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV11PrecioporColor_Cliente_SDT.size() )
      {
         AV10PrecioporColor_Cliente_SDTItem = (app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV11PrecioporColor_Cliente_SDT.elementAt(-1+AV51GXV1));
         AV15PrecioporColor_Cliente_SDTItem_Forser = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser() ;
         AV16PrecioporColor_Cliente_SDTItem_Forcolnum = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum() ;
         AV17PrecioporColor_Cliente_SDTItem_ForColnom = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom() ;
         AV18PrecioporColor_Cliente_SDTItem_TipColCod = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod() ;
         AV19PrecioporColor_Cliente_SDTItem_ForNomCli = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli() ;
         AV20PrecioporColor_Cliente_SDTItem_ForNumCli = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli() ;
         AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm() ;
         AV22PrecioporColor_Cliente_SDTItem_ForPrefec = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec() ;
         AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()), "N") == 0 )
         {
            AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription = httpContext.getMessage( "N", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()), "S") == 0 )
         {
            AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription = httpContext.getMessage( "S", "") ;
         }
         AV24PrecioporColor_Cliente_SDTItem_ForCosForm = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform() ;
         AV25PrecioporColor_Cliente_SDTItem_Coste_general = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general() ;
         AV45PrecioporColor_Cliente_SDTItem_Coste_total = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total() ;
         AV26PrecioporColor_Cliente_SDTItem_GrdTipARt = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart() ;
         AV27PrecioporColor_Cliente_SDTItem_ForPreKgm = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA2L0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15PrecioporColor_Cliente_SDTItem_Forser, "")), 30, Gx_line+10, 80, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16PrecioporColor_Cliente_SDTItem_Forcolnum), "ZZZZZ9")), 84, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrecioporColor_Cliente_SDTItem_ForColnom, "")), 138, Gx_line+10, 188, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18PrecioporColor_Cliente_SDTItem_TipColCod), "Z9")), 192, Gx_line+10, 242, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19PrecioporColor_Cliente_SDTItem_ForNomCli, "")), 246, Gx_line+10, 296, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20PrecioporColor_Cliente_SDTItem_ForNumCli), "ZZZZZ9")), 300, Gx_line+10, 350, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm, "ZZZZZ9.999")), 354, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV22PrecioporColor_Cliente_SDTItem_ForPrefec, "99/99/99"), 408, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription, "")), 462, Gx_line+10, 512, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24PrecioporColor_Cliente_SDTItem_ForCosForm, "ZZZZ9.99999")), 516, Gx_line+10, 567, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25PrecioporColor_Cliente_SDTItem_Coste_general, "Z9.999")), 571, Gx_line+10, 622, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioporColor_Cliente_SDTItem_Coste_total, "Z9.999")), 626, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26PrecioporColor_Cliente_SDTItem_GrdTipARt), "ZZZ9")), 681, Gx_line+10, 732, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27PrecioporColor_Cliente_SDTItem_ForPreKgm, "ZZZZZ9.999")), 736, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("Facturacion.PrecioporColor_ClienteGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.PrecioporColor_ClienteGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("Facturacion.PrecioporColor_ClienteGridState"), null, null);
      }
      AV52GXV2 = 1 ;
      while ( AV52GXV2 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV2));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV12Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV13Clicod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV52GXV2 = (int)(AV52GXV2+1) ;
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

   public void hA2L0( boolean bFoot ,
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
            AV42Title = AV48Pgmdesc ;
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
      AV14FilterFullText = "" ;
      AV11PrecioporColor_Cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV10PrecioporColor_Cliente_SDTItem = new app.facturacion.SdtPrecioporColor_Cliente_SDT_Item(remoteHandle, context);
      AV15PrecioporColor_Cliente_SDTItem_Forser = "" ;
      AV17PrecioporColor_Cliente_SDTItem_ForColnom = "" ;
      AV19PrecioporColor_Cliente_SDTItem_ForNomCli = "" ;
      AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm = DecimalUtil.ZERO ;
      AV22PrecioporColor_Cliente_SDTItem_ForPrefec = GXutil.nullDate() ;
      AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription = "" ;
      AV24PrecioporColor_Cliente_SDTItem_ForCosForm = DecimalUtil.ZERO ;
      AV25PrecioporColor_Cliente_SDTItem_Coste_general = DecimalUtil.ZERO ;
      AV45PrecioporColor_Cliente_SDTItem_Coste_total = DecimalUtil.ZERO ;
      AV27PrecioporColor_Cliente_SDTItem_ForPreKgm = DecimalUtil.ZERO ;
      AV28Session = httpContext.getWebSession();
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12Emprcod = "" ;
      AV40PageInfo = "" ;
      AV37DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV48Pgmdesc = "" ;
      AV35AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV48Pgmdesc = httpContext.getMessage( "Preciopor Color_Cliente Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV48Pgmdesc = httpContext.getMessage( "Preciopor Color_Cliente Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV18PrecioporColor_Cliente_SDTItem_TipColCod ;
   private short gxcookieaux ;
   private short AV26PrecioporColor_Cliente_SDTItem_GrdTipARt ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV51GXV1 ;
   private int AV16PrecioporColor_Cliente_SDTItem_Forcolnum ;
   private int AV20PrecioporColor_Cliente_SDTItem_ForNumCli ;
   private int AV52GXV2 ;
   private int AV13Clicod ;
   private java.math.BigDecimal AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm ;
   private java.math.BigDecimal AV24PrecioporColor_Cliente_SDTItem_ForCosForm ;
   private java.math.BigDecimal AV25PrecioporColor_Cliente_SDTItem_Coste_general ;
   private java.math.BigDecimal AV45PrecioporColor_Cliente_SDTItem_Coste_total ;
   private java.math.BigDecimal AV27PrecioporColor_Cliente_SDTItem_ForPreKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV15PrecioporColor_Cliente_SDTItem_Forser ;
   private String AV17PrecioporColor_Cliente_SDTItem_ForColnom ;
   private String AV19PrecioporColor_Cliente_SDTItem_ForNomCli ;
   private String AV12Emprcod ;
   private String AV48Pgmdesc ;
   private java.util.Date AV22PrecioporColor_Cliente_SDTItem_ForPrefec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV42Title ;
   private String AV14FilterFullText ;
   private String AV44PrecioporColor_Cliente_SDTItem_ForPredefDescription ;
   private String AV40PageInfo ;
   private String AV37DateInfo ;
   private String AV35AppName ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> AV11PrecioporColor_Cliente_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtPrecioporColor_Cliente_SDT_Item AV10PrecioporColor_Cliente_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

