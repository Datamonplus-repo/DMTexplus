package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta___wwexportreport_impl extends GXWebReport
{
   public hojaderuta___wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV44Title = httpContext.getMessage( "Lista de Mantenimiento Hoja de Ruta", "") ;
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
         hARV0( true, 0) ;
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
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFCliNom_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFCliNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFCliNom)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFCliNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFPedidoCliente_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pedido Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPedidoCliente_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPedidoCliente)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pedido Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPedidoCliente, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFBarSer_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFBarSer_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFBarSer)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFBarSer, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV24TFBarSerDsc_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFBarSerDsc_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFBarSerDsc)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFBarSerDsc, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFBarColNom_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFBarColNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFBarColNom)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFBarColNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV27TFBarColNum) && (0==AV28TFBarColNum_To) ) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFBarColNum), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFBarColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFBarColNum_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFBarColNum_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFBarMaqCod_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFBarMaqCod_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFBarMaqCod)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFBarMaqCod, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFBarAgrEst_Sel)==0) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFBarAgrEst_Sel, "@!")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFBarAgrEst)==0) )
         {
            hARV0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFBarAgrEst, "@!")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV55TFBarAlbUltimo) && (0==AV56TFBarAlbUltimo_To) ) )
      {
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFBarAlbUltimo), "ZZZZZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV57TFBarAlbUltimo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Albaran", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hARV0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFBarAlbUltimo_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFBarAlbUltimo_To), "ZZZZZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hARV0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hARV0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pedido Cliente", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N° Hdr", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Creacion", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 378, Gx_line+10, 433, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 437, Gx_line+10, 492, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 496, Gx_line+10, 551, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "St", ""), 555, Gx_line+10, 610, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 614, Gx_line+10, 669, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 673, Gx_line+10, 728, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 732, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV12FilterFullText ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV17TFCliNom ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV18TFCliNom_Sel ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV19TFPedidoCliente ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV20TFPedidoCliente_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV21TFBarSer ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV22TFBarSer_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV23TFBarSerDsc ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV24TFBarSerDsc_Sel ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV25TFBarColNom ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV26TFBarColNom_Sel ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV27TFBarColNum ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV28TFBarColNum_To ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV29TFBarMaqCod ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV30TFBarMaqCod_Sel ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV31TFBarAgrEst ;
      AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV32TFBarAgrEst_Sel ;
      AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo = AV55TFBarAlbUltimo ;
      AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to = AV56TFBarAlbUltimo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV47CliCod) ,
                                           AV48BarFecGenfrom ,
                                           AV49BarFecGento ,
                                           Byte.valueOf(AV50BarSitfrom) ,
                                           Byte.valueOf(AV51BarSitto) ,
                                           Integer.valueOf(AV52BarCod) ,
                                           Byte.valueOf(AV53BarCodreo) ,
                                           AV54BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           Long.valueOf(AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo) ,
                                           Long.valueOf(AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to) ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0ARV2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV47CliCod), AV48BarFecGenfrom, AV49BarFecGento, Byte.valueOf(AV50BarSitfrom), Byte.valueOf(AV51BarSitto), Integer.valueOf(AV52BarCod), Byte.valueOf(AV53BarCodreo), AV54BarCodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P0ARV2_A159BarFecGen[0] ;
         A213BarSit = P0ARV2_A213BarSit[0] ;
         A13696BarNHdr = P0ARV2_A13696BarNHdr[0] ;
         A252CliCod = P0ARV2_A252CliCod[0] ;
         n252CliCod = P0ARV2_n252CliCod[0] ;
         A120BarAgrEst = P0ARV2_A120BarAgrEst[0] ;
         A180BarMaqCod = P0ARV2_A180BarMaqCod[0] ;
         A136BarColNum = P0ARV2_A136BarColNum[0] ;
         A135BarColNom = P0ARV2_A135BarColNom[0] ;
         A1652BarSerDsc = P0ARV2_A1652BarSerDsc[0] ;
         A212BarSer = P0ARV2_A212BarSer[0] ;
         A279CliNom = P0ARV2_A279CliNom[0] ;
         A143BarDisNum = P0ARV2_A143BarDisNum[0] ;
         A4812BarEncCli = P0ARV2_A4812BarEncCli[0] ;
         A130BarCodPar = P0ARV2_A130BarCodPar[0] ;
         A132BarCodReo = P0ARV2_A132BarCodReo[0] ;
         A129BarCod = P0ARV2_A129BarCod[0] ;
         A396EmprCod = P0ARV2_A396EmprCod[0] ;
         A279CliNom = P0ARV2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta___wwexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta___wwexportreport_impl.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta___wwexportreport_impl.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta___wwexportreport_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta___wwexportreport_impl.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo ) ) )
                  {
                     if ( (0==AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to ) ) )
                     {
                        /* Execute user subroutine: 'BEFOREPRINTLINE' */
                        S144 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           getPrinter().GxEndPage() ;
                           /* Close printer file */
                           getPrinter().GxEndDocument() ;
                           endPrinter();
                           returnInSub = true;
                           if (true) return;
                        }
                        hARV0( false, 36) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 378, Gx_line+10, 433, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 437, Gx_line+10, 492, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 496, Gx_line+10, 551, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 555, Gx_line+10, 610, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), 614, Gx_line+10, 669, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), 673, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+36) ;
                        /* Execute user subroutine: 'AFTERPRINTLINE' */
                        S161 ();
                        if ( returnInSub )
                        {
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
      if ( GXutil.strcmp(AV13Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV17TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV18TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV19TFPedidoCliente = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV20TFPedidoCliente_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV21TFBarSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV22TFBarSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV23TFBarSerDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV24TFBarSerDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV25TFBarColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV26TFBarColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV27TFBarColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFBarColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV29TFBarMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV30TFBarMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV31TFBarAgrEst = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV32TFBarAgrEst_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV55TFBarAlbUltimo = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV56TFBarAlbUltimo_To = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
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

   public void hARV0( boolean bFoot ,
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
               AV42PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV39DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV44Title = AV60Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV44Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFCliNom_Sel = "" ;
      AV17TFCliNom = "" ;
      AV20TFPedidoCliente_Sel = "" ;
      AV19TFPedidoCliente = "" ;
      AV22TFBarSer_Sel = "" ;
      AV21TFBarSer = "" ;
      AV24TFBarSerDsc_Sel = "" ;
      AV23TFBarSerDsc = "" ;
      AV26TFBarColNom_Sel = "" ;
      AV25TFBarColNom = "" ;
      AV33TFBarColNum_To_Description = "" ;
      AV30TFBarMaqCod_Sel = "" ;
      AV29TFBarMaqCod = "" ;
      AV32TFBarAgrEst_Sel = "" ;
      AV31TFBarAgrEst = "" ;
      AV57TFBarAlbUltimo_To_Description = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = "" ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = "" ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = "" ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = "" ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = "" ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = "" ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = "" ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = "" ;
      scmdbuf = "" ;
      lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV48BarFecGenfrom = GXutil.nullDate() ;
      AV49BarFecGento = GXutil.nullDate() ;
      AV54BarCodpar = "" ;
      A130BarCodPar = "" ;
      AV46Emprcod = "" ;
      A396EmprCod = "" ;
      P0ARV2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ARV2_A213BarSit = new byte[1] ;
      P0ARV2_A13696BarNHdr = new String[] {""} ;
      P0ARV2_A252CliCod = new int[1] ;
      P0ARV2_n252CliCod = new boolean[] {false} ;
      P0ARV2_A120BarAgrEst = new String[] {""} ;
      P0ARV2_A180BarMaqCod = new String[] {""} ;
      P0ARV2_A136BarColNum = new int[1] ;
      P0ARV2_A135BarColNom = new String[] {""} ;
      P0ARV2_A1652BarSerDsc = new String[] {""} ;
      P0ARV2_A212BarSer = new String[] {""} ;
      P0ARV2_A279CliNom = new String[] {""} ;
      P0ARV2_A143BarDisNum = new String[] {""} ;
      P0ARV2_A4812BarEncCli = new String[] {""} ;
      P0ARV2_A130BarCodPar = new String[] {""} ;
      P0ARV2_A132BarCodReo = new byte[1] ;
      P0ARV2_A129BarCod = new int[1] ;
      P0ARV2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new long[1] ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42PageInfo = "" ;
      AV39DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV60Pgmdesc = "" ;
      AV37AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___wwexportreport__default(),
         new Object[] {
             new Object[] {
            P0ARV2_A159BarFecGen, P0ARV2_A213BarSit, P0ARV2_A13696BarNHdr, P0ARV2_A252CliCod, P0ARV2_n252CliCod, P0ARV2_A120BarAgrEst, P0ARV2_A180BarMaqCod, P0ARV2_A136BarColNum, P0ARV2_A135BarColNom, P0ARV2_A1652BarSerDsc,
            P0ARV2_A212BarSer, P0ARV2_A279CliNom, P0ARV2_A143BarDisNum, P0ARV2_A4812BarEncCli, P0ARV2_A130BarCodPar, P0ARV2_A132BarCodReo, P0ARV2_A129BarCod, P0ARV2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV60Pgmdesc = httpContext.getMessage( "Hojade Ruta___WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV60Pgmdesc = httpContext.getMessage( "Hojade Ruta___WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte AV50BarSitfrom ;
   private byte AV51BarSitto ;
   private byte AV53BarCodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV27TFBarColNum ;
   private int AV28TFBarColNum_To ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ;
   private int AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ;
   private int AV47CliCod ;
   private int AV52BarCod ;
   private int A129BarCod ;
   private int AV83GXV1 ;
   private long AV55TFBarAlbUltimo ;
   private long AV56TFBarAlbUltimo_To ;
   private long A13930BarAlbUlti ;
   private long AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo ;
   private long AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFCliNom_Sel ;
   private String AV17TFCliNom ;
   private String AV20TFPedidoCliente_Sel ;
   private String AV19TFPedidoCliente ;
   private String AV22TFBarSer_Sel ;
   private String AV21TFBarSer ;
   private String AV24TFBarSerDsc_Sel ;
   private String AV23TFBarSerDsc ;
   private String AV26TFBarColNom_Sel ;
   private String AV25TFBarColNom ;
   private String AV30TFBarMaqCod_Sel ;
   private String AV29TFBarMaqCod ;
   private String AV32TFBarAgrEst_Sel ;
   private String AV31TFBarAgrEst ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ;
   private String AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ;
   private String AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ;
   private String AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ;
   private String AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ;
   private String AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ;
   private String AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ;
   private String AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ;
   private String scmdbuf ;
   private String lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV54BarCodpar ;
   private String A130BarCodPar ;
   private String AV46Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV60Pgmdesc ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV48BarFecGenfrom ;
   private java.util.Date AV49BarFecGento ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n252CliCod ;
   private String AV44Title ;
   private String AV12FilterFullText ;
   private String AV33TFBarColNum_To_Description ;
   private String AV57TFBarAlbUltimo_To_Description ;
   private String AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String AV42PageInfo ;
   private String AV39DateInfo ;
   private String AV37AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0ARV2_A159BarFecGen ;
   private byte[] P0ARV2_A213BarSit ;
   private String[] P0ARV2_A13696BarNHdr ;
   private int[] P0ARV2_A252CliCod ;
   private boolean[] P0ARV2_n252CliCod ;
   private String[] P0ARV2_A120BarAgrEst ;
   private String[] P0ARV2_A180BarMaqCod ;
   private int[] P0ARV2_A136BarColNum ;
   private String[] P0ARV2_A135BarColNom ;
   private String[] P0ARV2_A1652BarSerDsc ;
   private String[] P0ARV2_A212BarSer ;
   private String[] P0ARV2_A279CliNom ;
   private String[] P0ARV2_A143BarDisNum ;
   private String[] P0ARV2_A4812BarEncCli ;
   private String[] P0ARV2_A130BarCodPar ;
   private byte[] P0ARV2_A132BarCodReo ;
   private int[] P0ARV2_A129BarCod ;
   private String[] P0ARV2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class hojaderuta___wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ARV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV47CliCod ,
                                          java.util.Date AV48BarFecGenfrom ,
                                          java.util.Date AV49BarFecGento ,
                                          byte AV50BarSitfrom ,
                                          byte AV51BarSitto ,
                                          int AV52BarCod ,
                                          byte AV53BarCodreo ,
                                          String AV54BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          long A13930BarAlbUlti ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          long AV81Pedidosclientesindetalle_hojaderuta___wwds_18_tfbaralbultimo ,
                                          long AV82Pedidosclientesindetalle_hojaderuta___wwds_19_tfbaralbultimo_to ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[23];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV47CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV51BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV53BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P0ARV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).longValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).longValue() , ((Number) dynConstraints[44]).longValue() , (String)dynConstraints[45] , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 11);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
      }
   }

}

