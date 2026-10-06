package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preciocolor__cliente_wpexportreport_impl extends GXWebReport
{
   public preciocolor__cliente_wpexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV43Title = httpContext.getMessage( "Lista de Precio Color Cliente", "") ;
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
         hA2P0( true, 0) ;
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
         hA2P0( false, 20) ;
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
      hA2P0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA2P0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 30, Gx_line+10, 80, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero Color", ""), 84, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 138, Gx_line+10, 188, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 192, Gx_line+10, 242, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 246, Gx_line+10, 296, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 300, Gx_line+10, 351, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Nuevo", ""), 355, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Precio", ""), 410, Gx_line+10, 461, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "D?", ""), 465, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Color", ""), 571, Gx_line+10, 622, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Coste General", ""), 626, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Coste Total", ""), 681, Gx_line+10, 732, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Clase", ""), 736, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV11PrecioporColor_Cliente_SDT.size() )
      {
         AV10PrecioporColor_Cliente_SDTItem = (app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV11PrecioporColor_Cliente_SDT.elementAt(-1+AV53GXV1));
         AV15PrecioporColor_Cliente_SDTItem_Forser = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser() ;
         AV16PrecioporColor_Cliente_SDTItem_Forcolnum = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum() ;
         AV17PrecioporColor_Cliente_SDTItem_ForColnom = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom() ;
         AV18PrecioporColor_Cliente_SDTItem_TipColCod = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod() ;
         AV19PrecioporColor_Cliente_SDTItem_ForNomCli = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli() ;
         AV20PrecioporColor_Cliente_SDTItem_ForNumCli = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli() ;
         AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm() ;
         AV23PrecioporColor_Cliente_SDTItem_ForPrefec = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec() ;
         AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()), "N") == 0 )
         {
            AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription = httpContext.getMessage( "N", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()), "s") == 0 )
         {
            AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription = httpContext.getMessage( "S", "") ;
         }
         AV25PrecioporColor_Cliente_SDTItem_ForCosForm = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform() ;
         AV26PrecioporColor_Cliente_SDTItem_Coste_general = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general() ;
         AV27PrecioporColor_Cliente_SDTItem_Coste_total = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total() ;
         AV28PrecioporColor_Cliente_SDTItem_GrdTipARt = AV10PrecioporColor_Cliente_SDTItem.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA2P0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15PrecioporColor_Cliente_SDTItem_Forser, "")), 30, Gx_line+10, 80, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16PrecioporColor_Cliente_SDTItem_Forcolnum), "ZZZZZ9")), 84, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrecioporColor_Cliente_SDTItem_ForColnom, "")), 138, Gx_line+10, 188, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18PrecioporColor_Cliente_SDTItem_TipColCod), "Z9")), 192, Gx_line+10, 242, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19PrecioporColor_Cliente_SDTItem_ForNomCli, "")), 246, Gx_line+10, 296, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20PrecioporColor_Cliente_SDTItem_ForNumCli), "ZZZZZ9")), 300, Gx_line+10, 351, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm, "ZZZZZ9.999")), 355, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV23PrecioporColor_Cliente_SDTItem_ForPrefec, "99/99/99"), 410, Gx_line+10, 461, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription, "")), 465, Gx_line+10, 567, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25PrecioporColor_Cliente_SDTItem_ForCosForm, "ZZZZ9.99999")), 571, Gx_line+10, 622, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26PrecioporColor_Cliente_SDTItem_Coste_general, "Z9.999")), 626, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27PrecioporColor_Cliente_SDTItem_Coste_total, "Z9.999")), 681, Gx_line+10, 732, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28PrecioporColor_Cliente_SDTItem_GrdTipARt), "ZZZ9")), 736, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("Facturacion.PrecioColor__Cliente_WPGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.PrecioColor__Cliente_WPGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("Facturacion.PrecioColor__Cliente_WPGridState"), null, null);
      }
      AV54GXV2 = 1 ;
      while ( AV54GXV2 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV2));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV12Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV13Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV45CliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV2 = (int)(AV54GXV2+1) ;
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

   public void hA2P0( boolean bFoot ,
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
               AV41PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV38DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV43Title = AV50Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV43Title = "" ;
      AV14FilterFullText = "" ;
      AV11PrecioporColor_Cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV10PrecioporColor_Cliente_SDTItem = new app.facturacion.SdtPrecioporColor_Cliente_SDT_Item(remoteHandle, context);
      AV15PrecioporColor_Cliente_SDTItem_Forser = "" ;
      AV17PrecioporColor_Cliente_SDTItem_ForColnom = "" ;
      AV19PrecioporColor_Cliente_SDTItem_ForNomCli = "" ;
      AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm = DecimalUtil.ZERO ;
      AV23PrecioporColor_Cliente_SDTItem_ForPrefec = GXutil.nullDate() ;
      AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription = "" ;
      AV25PrecioporColor_Cliente_SDTItem_ForCosForm = DecimalUtil.ZERO ;
      AV26PrecioporColor_Cliente_SDTItem_Coste_general = DecimalUtil.ZERO ;
      AV27PrecioporColor_Cliente_SDTItem_Coste_total = DecimalUtil.ZERO ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12Emprcod = "" ;
      AV45CliNom = "" ;
      AV41PageInfo = "" ;
      AV38DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV50Pgmdesc = "" ;
      AV36AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Precio Color__Cliente_WPExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Precio Color__Cliente_WPExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV18PrecioporColor_Cliente_SDTItem_TipColCod ;
   private short gxcookieaux ;
   private short AV28PrecioporColor_Cliente_SDTItem_GrdTipARt ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV53GXV1 ;
   private int AV16PrecioporColor_Cliente_SDTItem_Forcolnum ;
   private int AV20PrecioporColor_Cliente_SDTItem_ForNumCli ;
   private int AV54GXV2 ;
   private int AV13Clicod ;
   private java.math.BigDecimal AV21PrecioporColor_Cliente_SDTItem_New_ForPreKgm ;
   private java.math.BigDecimal AV25PrecioporColor_Cliente_SDTItem_ForCosForm ;
   private java.math.BigDecimal AV26PrecioporColor_Cliente_SDTItem_Coste_general ;
   private java.math.BigDecimal AV27PrecioporColor_Cliente_SDTItem_Coste_total ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV15PrecioporColor_Cliente_SDTItem_Forser ;
   private String AV17PrecioporColor_Cliente_SDTItem_ForColnom ;
   private String AV19PrecioporColor_Cliente_SDTItem_ForNomCli ;
   private String AV12Emprcod ;
   private String AV45CliNom ;
   private String AV50Pgmdesc ;
   private java.util.Date AV23PrecioporColor_Cliente_SDTItem_ForPrefec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV43Title ;
   private String AV14FilterFullText ;
   private String AV46PrecioporColor_Cliente_SDTItem_ForPredefDescription ;
   private String AV41PageInfo ;
   private String AV38DateInfo ;
   private String AV36AppName ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> AV11PrecioporColor_Cliente_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtPrecioporColor_Cliente_SDT_Item AV10PrecioporColor_Cliente_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

