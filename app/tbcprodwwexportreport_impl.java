package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbcprodwwexportreport_impl extends GXWebReport
{
   public tbcprodwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV74Title = httpContext.getMessage( "Lista de Productos", "") ;
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
         h7ZL0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV85FilterFullText)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85FilterFullText, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBCProducto_Sel)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFBCProducto_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFBCProducto)==0) )
         {
            h7ZL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFBCProducto, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFBCDescripcion_Sel)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFBCDescripcion_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFBCDescripcion)==0) )
         {
            h7ZL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFBCDescripcion, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBCPrecio)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBCPrecio_To)==0) ) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFBCPrecio, "ZZZZZZ9.99999")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV58TFBCPrecio_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFBCPrecio_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFBCPrecio_To, "ZZZZZZ9.99999")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV44TFBCUndComp_Sels.fromJSonString(AV42TFBCUndComp_SelsJson, null);
      if ( ! ( AV44TFBCUndComp_Sels.size() == 0 ) )
      {
         AV63i = 1 ;
         AV91GXV1 = 1 ;
         while ( AV91GXV1 <= AV44TFBCUndComp_Sels.size() )
         {
            AV45TFBCUndComp_Sel = ((Number) AV44TFBCUndComp_Sels.elementAt(-1+AV91GXV1)).shortValue() ;
            if ( AV63i == 1 )
            {
               AV43TFBCUndComp_SelDscs = "" ;
            }
            else
            {
               AV43TFBCUndComp_SelDscs += ", " ;
            }
            AV59FilterTFBCUndComp_SelValueDescription = "" ;
            if ( AV45TFBCUndComp_Sel == 1 )
            {
               AV59FilterTFBCUndComp_SelValueDescription = httpContext.getMessage( "Kilos", "") ;
            }
            else if ( AV45TFBCUndComp_Sel == 2 )
            {
               AV59FilterTFBCUndComp_SelValueDescription = httpContext.getMessage( "Litros", "") ;
            }
            AV43TFBCUndComp_SelDscs += AV59FilterTFBCUndComp_SelValueDescription ;
            AV63i = (long)(AV63i+1) ;
            AV91GXV1 = (int)(AV91GXV1+1) ;
         }
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad Compra", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFBCUndComp_SelDscs, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBCProveedor_Sel)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFBCProveedor_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFBCProveedor)==0) )
         {
            h7ZL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFBCProveedor, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV48TFBCProcesado) && (0==AV49TFBCProcesado_To) ) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Procesado", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFBCProcesado), "ZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFBCProcesado_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Procesado", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFBCProcesado_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFBCProcesado_To), "ZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV50TFBCError) && (0==AV51TFBCError_To) ) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFBCError), "ZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFBCError_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Error", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFBCError_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFBCError_To), "ZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBCDescError_Sel)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFBCDescError_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV52TFBCDescError)==0) )
         {
            h7ZL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFBCDescError, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV54TFBCFechError) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha y hora error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV54TFBCFechError, "99/99/99 99:99"), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFBCPilaError_Sel)==0) )
      {
         h7ZL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pila error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFBCPilaError_Sel, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV56TFBCPilaError)==0) )
         {
            h7ZL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pila error", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFBCPilaError, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h7ZL0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h7ZL0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 102, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 106, Gx_line+10, 178, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 182, Gx_line+10, 254, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad Compra", ""), 258, Gx_line+10, 330, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 334, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Procesado", ""), 410, Gx_line+10, 482, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Error", ""), 486, Gx_line+10, 558, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción error", ""), 562, Gx_line+10, 634, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha y hora error", ""), 638, Gx_line+10, 710, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pila error", ""), 714, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV93Tbcprodwwds_1_filterfulltext = AV85FilterFullText ;
      AV94Tbcprodwwds_2_tfbcproducto = AV36TFBCProducto ;
      AV95Tbcprodwwds_3_tfbcproducto_sel = AV37TFBCProducto_Sel ;
      AV96Tbcprodwwds_4_tfbcdescripcion = AV38TFBCDescripcion ;
      AV97Tbcprodwwds_5_tfbcdescripcion_sel = AV39TFBCDescripcion_Sel ;
      AV98Tbcprodwwds_6_tfbcprecio = AV40TFBCPrecio ;
      AV99Tbcprodwwds_7_tfbcprecio_to = AV41TFBCPrecio_To ;
      AV100Tbcprodwwds_8_tfbcundcomp_sels = AV44TFBCUndComp_Sels ;
      AV101Tbcprodwwds_9_tfbcproveedor = AV46TFBCProveedor ;
      AV102Tbcprodwwds_10_tfbcproveedor_sel = AV47TFBCProveedor_Sel ;
      AV103Tbcprodwwds_11_tfbcprocesado = AV48TFBCProcesado ;
      AV104Tbcprodwwds_12_tfbcprocesado_to = AV49TFBCProcesado_To ;
      AV105Tbcprodwwds_13_tfbcerror = AV50TFBCError ;
      AV106Tbcprodwwds_14_tfbcerror_to = AV51TFBCError_To ;
      AV107Tbcprodwwds_15_tfbcdescerror = AV52TFBCDescError ;
      AV108Tbcprodwwds_16_tfbcdescerror_sel = AV53TFBCDescError_Sel ;
      AV109Tbcprodwwds_17_tfbcfecherror = AV54TFBCFechError ;
      AV110Tbcprodwwds_18_tfbcpilaerror = AV56TFBCPilaError ;
      AV111Tbcprodwwds_19_tfbcpilaerror_sel = AV57TFBCPilaError_Sel ;
      pr_ekamat.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV100Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV95Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV94Tbcprodwwds_2_tfbcproducto ,
                                           AV97Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV96Tbcprodwwds_4_tfbcdescripcion ,
                                           AV98Tbcprodwwds_6_tfbcprecio ,
                                           AV99Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV100Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV102Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV101Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV103Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV104Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV105Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV106Tbcprodwwds_14_tfbcerror_to) ,
                                           AV108Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV107Tbcprodwwds_15_tfbcdescerror ,
                                           AV109Tbcprodwwds_17_tfbcfecherror ,
                                           AV111Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV110Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV93Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV94Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV94Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV96Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV96Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV101Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV101Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV107Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV107Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV110Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV110Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZL2 */
      pr_ekamat.execute(0, new Object[] {lV94Tbcprodwwds_2_tfbcproducto, AV95Tbcprodwwds_3_tfbcproducto_sel, lV96Tbcprodwwds_4_tfbcdescripcion, AV97Tbcprodwwds_5_tfbcdescripcion_sel, AV98Tbcprodwwds_6_tfbcprecio, AV99Tbcprodwwds_7_tfbcprecio_to, lV101Tbcprodwwds_9_tfbcproveedor, AV102Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV103Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV104Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV105Tbcprodwwds_13_tfbcerror), Short.valueOf(AV106Tbcprodwwds_14_tfbcerror_to), lV107Tbcprodwwds_15_tfbcdescerror, AV108Tbcprodwwds_16_tfbcdescerror_sel, AV109Tbcprodwwds_17_tfbcfecherror, lV110Tbcprodwwds_18_tfbcpilaerror, AV111Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(0) != 101) )
      {
         A13487BCPilaErro = P07ZL2_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZL2_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZL2_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZL2_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZL2_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZL2_n13485BCDescErro[0] ;
         A13484BCError = P07ZL2_A13484BCError[0] ;
         n13484BCError = P07ZL2_n13484BCError[0] ;
         A13483BCProcesad = P07ZL2_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZL2_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZL2_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZL2_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZL2_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZL2_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZL2_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZL2_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZL2_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZL2_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZL2_n13481BCUndComp[0] ;
         A396EmprCod = P07ZL2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV93Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV93Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV93Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV93Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV93Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV12BCUndCompDescription = "" ;
            if ( A13481BCUndComp == 1 )
            {
               AV12BCUndCompDescription = httpContext.getMessage( "Kilos", "") ;
            }
            else if ( A13481BCUndComp == 2 )
            {
               AV12BCUndCompDescription = httpContext.getMessage( "Litros", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            h7ZL0( false, 66) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13478BCProducto, "")), 30, Gx_line+10, 102, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13479BCDescripc, "")), 106, Gx_line+10, 178, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13480BCPrecio, "ZZZZZZ9.99999")), 182, Gx_line+10, 254, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12BCUndCompDescription, "")), 258, Gx_line+10, 330, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13482BCProveedo, "")), 334, Gx_line+10, 406, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13483BCProcesad), "ZZZ9")), 410, Gx_line+10, 482, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13484BCError), "ZZZ9")), 486, Gx_line+10, 558, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13485BCDescErro, "")), 562, Gx_line+10, 634, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A13486BCFechErro, "99/99/99 99:99"), 638, Gx_line+10, 710, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13487BCPilaErro, "")), 714, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+66) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         pr_ekamat.readNext(0);
      }
      pr_ekamat.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("TBCPRODWWGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TBCPRODWWGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("TBCPRODWWGridState"), null, null);
      }
      AV10OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV112GXV2 = 1 ;
      while ( AV112GXV2 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV112GXV2));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV85FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO") == 0 )
         {
            AV36TFBCProducto = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO_SEL") == 0 )
         {
            AV37TFBCProducto_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION") == 0 )
         {
            AV38TFBCDescripcion = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION_SEL") == 0 )
         {
            AV39TFBCDescripcion_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRECIO") == 0 )
         {
            AV40TFBCPrecio = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFBCPrecio_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCUNDCOMP_SEL") == 0 )
         {
            AV42TFBCUndComp_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV44TFBCUndComp_Sels.fromJSonString(AV42TFBCUndComp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR") == 0 )
         {
            AV46TFBCProveedor = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR_SEL") == 0 )
         {
            AV47TFBCProveedor_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROCESADO") == 0 )
         {
            AV48TFBCProcesado = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBCProcesado_To = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCERROR") == 0 )
         {
            AV50TFBCError = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFBCError_To = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR") == 0 )
         {
            AV52TFBCDescError = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR_SEL") == 0 )
         {
            AV53TFBCDescError_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCFECHERROR") == 0 )
         {
            AV54TFBCFechError = localUtil.ctot( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR") == 0 )
         {
            AV56TFBCPilaError = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR_SEL") == 0 )
         {
            AV57TFBCPilaError_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV112GXV2 = (int)(AV112GXV2+1) ;
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

   public void h7ZL0( boolean bFoot ,
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
               AV69DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV74Title = AV88Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV74Title = "" ;
      AV85FilterFullText = "" ;
      AV37TFBCProducto_Sel = "" ;
      AV36TFBCProducto = "" ;
      AV39TFBCDescripcion_Sel = "" ;
      AV38TFBCDescripcion = "" ;
      AV40TFBCPrecio = DecimalUtil.ZERO ;
      AV41TFBCPrecio_To = DecimalUtil.ZERO ;
      AV58TFBCPrecio_To_Description = "" ;
      AV44TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV42TFBCUndComp_SelsJson = "" ;
      AV43TFBCUndComp_SelDscs = "" ;
      AV59FilterTFBCUndComp_SelValueDescription = "" ;
      AV47TFBCProveedor_Sel = "" ;
      AV46TFBCProveedor = "" ;
      AV60TFBCProcesado_To_Description = "" ;
      AV61TFBCError_To_Description = "" ;
      AV53TFBCDescError_Sel = "" ;
      AV52TFBCDescError = "" ;
      AV54TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      AV57TFBCPilaError_Sel = "" ;
      AV56TFBCPilaError = "" ;
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      AV93Tbcprodwwds_1_filterfulltext = "" ;
      AV94Tbcprodwwds_2_tfbcproducto = "" ;
      AV95Tbcprodwwds_3_tfbcproducto_sel = "" ;
      AV96Tbcprodwwds_4_tfbcdescripcion = "" ;
      AV97Tbcprodwwds_5_tfbcdescripcion_sel = "" ;
      AV98Tbcprodwwds_6_tfbcprecio = DecimalUtil.ZERO ;
      AV99Tbcprodwwds_7_tfbcprecio_to = DecimalUtil.ZERO ;
      AV100Tbcprodwwds_8_tfbcundcomp_sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV101Tbcprodwwds_9_tfbcproveedor = "" ;
      AV102Tbcprodwwds_10_tfbcproveedor_sel = "" ;
      AV107Tbcprodwwds_15_tfbcdescerror = "" ;
      AV108Tbcprodwwds_16_tfbcdescerror_sel = "" ;
      AV109Tbcprodwwds_17_tfbcfecherror = GXutil.resetTime( GXutil.nullDate() );
      AV110Tbcprodwwds_18_tfbcpilaerror = "" ;
      AV111Tbcprodwwds_19_tfbcpilaerror_sel = "" ;
      lV93Tbcprodwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV94Tbcprodwwds_2_tfbcproducto = "" ;
      lV96Tbcprodwwds_4_tfbcdescripcion = "" ;
      lV101Tbcprodwwds_9_tfbcproveedor = "" ;
      lV107Tbcprodwwds_15_tfbcdescerror = "" ;
      lV110Tbcprodwwds_18_tfbcpilaerror = "" ;
      P07ZL2_A13487BCPilaErro = new String[] {""} ;
      P07ZL2_n13487BCPilaErro = new boolean[] {false} ;
      P07ZL2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZL2_n13486BCFechErro = new boolean[] {false} ;
      P07ZL2_A13485BCDescErro = new String[] {""} ;
      P07ZL2_n13485BCDescErro = new boolean[] {false} ;
      P07ZL2_A13484BCError = new short[1] ;
      P07ZL2_n13484BCError = new boolean[] {false} ;
      P07ZL2_A13483BCProcesad = new short[1] ;
      P07ZL2_n13483BCProcesad = new boolean[] {false} ;
      P07ZL2_A13482BCProveedo = new String[] {""} ;
      P07ZL2_n13482BCProveedo = new boolean[] {false} ;
      P07ZL2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZL2_n13480BCPrecio = new boolean[] {false} ;
      P07ZL2_A13479BCDescripc = new String[] {""} ;
      P07ZL2_n13479BCDescripc = new boolean[] {false} ;
      P07ZL2_A13478BCProducto = new String[] {""} ;
      P07ZL2_A13481BCUndComp = new short[1] ;
      P07ZL2_n13481BCUndComp = new boolean[] {false} ;
      P07ZL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV12BCUndCompDescription = "" ;
      AV32Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72PageInfo = "" ;
      AV69DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV88Pgmdesc = "" ;
      AV67AppName = "" ;
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprodwwexportreport__ekamat(),
         new Object[] {
             new Object[] {
            P07ZL2_A13487BCPilaErro, P07ZL2_n13487BCPilaErro, P07ZL2_A13486BCFechErro, P07ZL2_n13486BCFechErro, P07ZL2_A13485BCDescErro, P07ZL2_n13485BCDescErro, P07ZL2_A13484BCError, P07ZL2_n13484BCError, P07ZL2_A13483BCProcesad, P07ZL2_n13483BCProcesad,
            P07ZL2_A13482BCProveedo, P07ZL2_n13482BCProveedo, P07ZL2_A13480BCPrecio, P07ZL2_n13480BCPrecio, P07ZL2_A13479BCDescripc, P07ZL2_n13479BCDescripc, P07ZL2_A13478BCProducto, P07ZL2_A13481BCUndComp, P07ZL2_n13481BCUndComp, P07ZL2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV88Pgmdesc = httpContext.getMessage( "TBCPRODWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV88Pgmdesc = httpContext.getMessage( "TBCPRODWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV45TFBCUndComp_Sel ;
   private short AV48TFBCProcesado ;
   private short AV49TFBCProcesado_To ;
   private short AV50TFBCError ;
   private short AV51TFBCError_To ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short AV103Tbcprodwwds_11_tfbcprocesado ;
   private short AV104Tbcprodwwds_12_tfbcprocesado_to ;
   private short AV105Tbcprodwwds_13_tfbcerror ;
   private short AV106Tbcprodwwds_14_tfbcerror_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV91GXV1 ;
   private int AV100Tbcprodwwds_8_tfbcundcomp_sels_size ;
   private int AV112GXV2 ;
   private long AV63i ;
   private java.math.BigDecimal AV40TFBCPrecio ;
   private java.math.BigDecimal AV41TFBCPrecio_To ;
   private java.math.BigDecimal A13480BCPrecio ;
   private java.math.BigDecimal AV98Tbcprodwwds_6_tfbcprecio ;
   private java.math.BigDecimal AV99Tbcprodwwds_7_tfbcprecio_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV37TFBCProducto_Sel ;
   private String AV36TFBCProducto ;
   private String AV39TFBCDescripcion_Sel ;
   private String AV38TFBCDescripcion ;
   private String AV47TFBCProveedor_Sel ;
   private String AV46TFBCProveedor ;
   private String A13478BCProducto ;
   private String A13479BCDescripc ;
   private String A13482BCProveedo ;
   private String AV94Tbcprodwwds_2_tfbcproducto ;
   private String AV95Tbcprodwwds_3_tfbcproducto_sel ;
   private String AV96Tbcprodwwds_4_tfbcdescripcion ;
   private String AV97Tbcprodwwds_5_tfbcdescripcion_sel ;
   private String AV101Tbcprodwwds_9_tfbcproveedor ;
   private String AV102Tbcprodwwds_10_tfbcproveedor_sel ;
   private String scmdbuf ;
   private String lV94Tbcprodwwds_2_tfbcproducto ;
   private String lV96Tbcprodwwds_4_tfbcdescripcion ;
   private String lV101Tbcprodwwds_9_tfbcproveedor ;
   private String A396EmprCod ;
   private String AV88Pgmdesc ;
   private java.util.Date AV54TFBCFechError ;
   private java.util.Date A13486BCFechErro ;
   private java.util.Date AV109Tbcprodwwds_17_tfbcfecherror ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n13487BCPilaErro ;
   private boolean n13486BCFechErro ;
   private boolean n13485BCDescErro ;
   private boolean n13484BCError ;
   private boolean n13483BCProcesad ;
   private boolean n13482BCProveedo ;
   private boolean n13480BCPrecio ;
   private boolean n13479BCDescripc ;
   private boolean n13481BCUndComp ;
   private String AV42TFBCUndComp_SelsJson ;
   private String AV74Title ;
   private String AV85FilterFullText ;
   private String AV58TFBCPrecio_To_Description ;
   private String AV43TFBCUndComp_SelDscs ;
   private String AV59FilterTFBCUndComp_SelValueDescription ;
   private String AV60TFBCProcesado_To_Description ;
   private String AV61TFBCError_To_Description ;
   private String AV53TFBCDescError_Sel ;
   private String AV52TFBCDescError ;
   private String AV57TFBCPilaError_Sel ;
   private String AV56TFBCPilaError ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String AV93Tbcprodwwds_1_filterfulltext ;
   private String AV107Tbcprodwwds_15_tfbcdescerror ;
   private String AV108Tbcprodwwds_16_tfbcdescerror_sel ;
   private String AV110Tbcprodwwds_18_tfbcpilaerror ;
   private String AV111Tbcprodwwds_19_tfbcpilaerror_sel ;
   private String lV93Tbcprodwwds_1_filterfulltext ;
   private String lV107Tbcprodwwds_15_tfbcdescerror ;
   private String lV110Tbcprodwwds_18_tfbcpilaerror ;
   private String AV12BCUndCompDescription ;
   private String AV72PageInfo ;
   private String AV69DateInfo ;
   private String AV67AppName ;
   private GXSimpleCollection<Short> AV44TFBCUndComp_Sels ;
   private GXSimpleCollection<Short> AV100Tbcprodwwds_8_tfbcundcomp_sels ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private IDataStoreProvider pr_ekamat ;
   private String[] P07ZL2_A13487BCPilaErro ;
   private boolean[] P07ZL2_n13487BCPilaErro ;
   private java.util.Date[] P07ZL2_A13486BCFechErro ;
   private boolean[] P07ZL2_n13486BCFechErro ;
   private String[] P07ZL2_A13485BCDescErro ;
   private boolean[] P07ZL2_n13485BCDescErro ;
   private short[] P07ZL2_A13484BCError ;
   private boolean[] P07ZL2_n13484BCError ;
   private short[] P07ZL2_A13483BCProcesad ;
   private boolean[] P07ZL2_n13483BCProcesad ;
   private String[] P07ZL2_A13482BCProveedo ;
   private boolean[] P07ZL2_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZL2_A13480BCPrecio ;
   private boolean[] P07ZL2_n13480BCPrecio ;
   private String[] P07ZL2_A13479BCDescripc ;
   private boolean[] P07ZL2_n13479BCDescripc ;
   private String[] P07ZL2_A13478BCProducto ;
   private short[] P07ZL2_A13481BCUndComp ;
   private boolean[] P07ZL2_n13481BCUndComp ;
   private String[] P07ZL2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class tbcprodwwexportreport__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV100Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV95Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV94Tbcprodwwds_2_tfbcproducto ,
                                          String AV97Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV96Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV98Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV99Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV100Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV102Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV101Tbcprodwwds_9_tfbcproveedor ,
                                          short AV103Tbcprodwwds_11_tfbcprocesado ,
                                          short AV104Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV105Tbcprodwwds_13_tfbcerror ,
                                          short AV106Tbcprodwwds_14_tfbcerror_to ,
                                          String AV108Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV107Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV109Tbcprodwwds_17_tfbcfecherror ,
                                          String AV111Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV110Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV93Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV95Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV94Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV96Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV100Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV100Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV101Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV103Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV104Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV105Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV106Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV107Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV109Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV110Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción]" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción] DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Producto]" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Producto] DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Precio]" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Precio] DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Unidad Compra]" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Unidad Compra] DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Proveedor]" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Proveedor] DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Procesado]" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Procesado] DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Error]" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Error] DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción error]" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción error] DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Fecha y hora error]" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Fecha y hora error] DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY [Pila error]" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Pila error] DESC" ;
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
                  return conditional_P07ZL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

