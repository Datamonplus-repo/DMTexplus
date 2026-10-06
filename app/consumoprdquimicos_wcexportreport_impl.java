package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumoprdquimicos_wcexportreport_impl extends GXWebReport
{
   public consumoprdquimicos_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV52Title = httpContext.getMessage( "Lista de ESTADISTICA DE PRODUCTOS", "") ;
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
         h9GA0( true, 0) ;
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
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFEmprCod_Sel)==0) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod_Sel, "@!")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFEmprCod)==0) )
         {
            h9GA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod, "@!")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFPrdNum_Sel)==0) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum_Sel, "")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPrdNum)==0) )
         {
            h9GA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPrdNum, "")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFPrdAny) && (0==AV22TFPrdAny_To) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Año estadistica Productos", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFPrdAny), "ZZZ9")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFPrdAny_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Año estadistica Productos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrdAny_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFPrdAny_To), "ZZZ9")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFPrdNumMes) && (0==AV24TFPrdNumMes_To) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mes de la Estadistica de Prod.", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFPrdNumMes), "Z9")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFPrdNumMes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Mes de la Estadistica de Prod.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrdNumMes_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFPrdNumMes_To), "Z9")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPrdAcuCprA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPrdAcuCprA_To)==0) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acumulado Unidades Compra Año", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFPrdAcuCprA, "ZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFPrdAcuCprA_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Acumulado Unidades Compra Año", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFPrdAcuCprA_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFPrdAcuCprA_To, "ZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPrdAcuConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPrdAcuConA_To)==0) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acumulado Unidades Consumo Año", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TFPrdAcuConA, "ZZZZZZ9.9999")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFPrdAcuConA_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Acumulado Unidades Consumo Año", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrdAcuConA_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFPrdAcuConA_To, "ZZZZZZ9.9999")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPrdValCprA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPrdValCprA_To)==0) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor Compra Productos Año", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFPrdValCprA, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFPrdValCprA_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor Compra Productos Año", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrdValCprA_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFPrdValCprA_To, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPrdValConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdValConA_To)==0) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor Consumo Productos Año", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFPrdValConA, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFPrdValConA_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor Consumo Productos Año", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrdValConA_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFPrdValConA_To, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFDifValConA)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFDifValConA_To)==0) ) )
      {
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "orden ascendente val. con. año", ""), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFDifValConA, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFDifValConA_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "orden ascendente val. con. año", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9GA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFDifValConA_To_Description, "")), 25, Gx_line+0, 248, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFDifValConA_To, "ZZZZZZZZ9.99")), 248, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9GA0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9GA0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 110, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 114, Gx_line+10, 194, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Año estadistica Productos", ""), 198, Gx_line+10, 278, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mes de la Estadistica de Prod.", ""), 282, Gx_line+10, 362, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Acumulado Unidades Compra Año", ""), 366, Gx_line+10, 447, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Acumulado Unidades Consumo Año", ""), 451, Gx_line+10, 532, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Compra Productos Año", ""), 536, Gx_line+10, 617, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Consumo Productos Año", ""), 621, Gx_line+10, 702, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "orden ascendente val. con. año", ""), 706, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV68Consumoprdquimicos_wcds_1_filterfulltext = AV12FilterFullText ;
      AV69Consumoprdquimicos_wcds_2_tfemprcod = AV17TFEmprCod ;
      AV70Consumoprdquimicos_wcds_3_tfemprcod_sel = AV18TFEmprCod_Sel ;
      AV71Consumoprdquimicos_wcds_4_tfprdnum = AV19TFPrdNum ;
      AV72Consumoprdquimicos_wcds_5_tfprdnum_sel = AV20TFPrdNum_Sel ;
      AV73Consumoprdquimicos_wcds_6_tfprdany = AV21TFPrdAny ;
      AV74Consumoprdquimicos_wcds_7_tfprdany_to = AV22TFPrdAny_To ;
      AV75Consumoprdquimicos_wcds_8_tfprdnummes = AV23TFPrdNumMes ;
      AV76Consumoprdquimicos_wcds_9_tfprdnummes_to = AV24TFPrdNumMes_To ;
      AV77Consumoprdquimicos_wcds_10_tfprdacucpra = AV25TFPrdAcuCprA ;
      AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV26TFPrdAcuCprA_To ;
      AV79Consumoprdquimicos_wcds_12_tfprdacucona = AV27TFPrdAcuConA ;
      AV80Consumoprdquimicos_wcds_13_tfprdacucona_to = AV28TFPrdAcuConA_To ;
      AV81Consumoprdquimicos_wcds_14_tfprdvalcpra = AV29TFPrdValCprA ;
      AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV30TFPrdValCprA_To ;
      AV83Consumoprdquimicos_wcds_16_tfprdvalcona = AV31TFPrdValConA ;
      AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV32TFPrdValConA_To ;
      AV85Consumoprdquimicos_wcds_18_tfdifvalcona = AV33TFDifValConA ;
      AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV34TFDifValConA_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV68Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV70Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV69Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV72Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV71Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV73Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV74Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV75Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV76Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV77Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV79Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV80Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV81Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV83Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV85Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Short.valueOf(AV54Anyo) ,
                                           Byte.valueOf(AV55MesI) ,
                                           Byte.valueOf(AV56MesF) ,
                                           Byte.valueOf(AV61Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV59PrdNumFrom ,
                                           AV60PrdNumTo ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV69Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV71Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV71Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor P09GA3 */
      pr_default.execute(0, new Object[] {lV69Consumoprdquimicos_wcds_2_tfemprcod, AV70Consumoprdquimicos_wcds_3_tfemprcod_sel, lV71Consumoprdquimicos_wcds_4_tfprdnum, AV72Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV73Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV74Consumoprdquimicos_wcds_7_tfprdany_to), AV77Consumoprdquimicos_wcds_10_tfprdacucpra, AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV79Consumoprdquimicos_wcds_12_tfprdacucona, AV80Consumoprdquimicos_wcds_13_tfprdacucona_to, AV81Consumoprdquimicos_wcds_14_tfprdvalcpra, AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV83Consumoprdquimicos_wcds_16_tfprdvalcona, AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV85Consumoprdquimicos_wcds_18_tfdifvalcona, AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV59PrdNumFrom, AV60PrdNumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A331DifValConA = P09GA3_A331DifValConA[0] ;
         n331DifValConA = P09GA3_n331DifValConA[0] ;
         A676PrdAcuConA = P09GA3_A676PrdAcuConA[0] ;
         A681PrdAny = P09GA3_A681PrdAny[0] ;
         A719PrdNum = P09GA3_A719PrdNum[0] ;
         A396EmprCod = P09GA3_A396EmprCod[0] ;
         A746PrdValConA = P09GA3_A746PrdValConA[0] ;
         A748PrdValCprA = P09GA3_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09GA3_A677PrdAcuCprA[0] ;
         A746PrdValConA = P09GA3_A746PrdValConA[0] ;
         A748PrdValCprA = P09GA3_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09GA3_A677PrdAcuCprA[0] ;
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
         h9GA0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 110, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 114, Gx_line+10, 194, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9")), 198, Gx_line+10, 278, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A720PrdNumMes), "Z9")), 282, Gx_line+10, 362, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A677PrdAcuCprA, "ZZZZZZ9.99")), 366, Gx_line+10, 447, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A676PrdAcuConA, "ZZZZZZ9.9999")), 451, Gx_line+10, 532, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A748PrdValCprA, "ZZZZZZZZ9.99")), 536, Gx_line+10, 617, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A746PrdValConA, "ZZZZZZZZ9.99")), 621, Gx_line+10, 702, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A331DifValConA, "ZZZZZZZZ9.99")), 706, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("ConsumoPrdQuimicos_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV17TFEmprCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV18TFEmprCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV19TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV20TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDANY") == 0 )
         {
            AV21TFPrdAny = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFPrdAny_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV23TFPrdNumMes = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFPrdNumMes_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCPRA") == 0 )
         {
            AV25TFPrdAcuCprA = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV26TFPrdAcuCprA_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCONA") == 0 )
         {
            AV27TFPrdAcuConA = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV28TFPrdAcuConA_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRA") == 0 )
         {
            AV29TFPrdValCprA = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV30TFPrdValCprA_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCONA") == 0 )
         {
            AV31TFPrdValConA = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFPrdValConA_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFVALCONA") == 0 )
         {
            AV33TFDifValConA = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFDifValConA_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
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

   public void h9GA0( boolean bFoot ,
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
               AV50PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV47DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV52Title = AV64Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV52Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFEmprCod_Sel = "" ;
      AV17TFEmprCod = "" ;
      AV20TFPrdNum_Sel = "" ;
      AV19TFPrdNum = "" ;
      AV35TFPrdAny_To_Description = "" ;
      AV36TFPrdNumMes_To_Description = "" ;
      AV25TFPrdAcuCprA = DecimalUtil.ZERO ;
      AV26TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      AV37TFPrdAcuCprA_To_Description = "" ;
      AV27TFPrdAcuConA = DecimalUtil.ZERO ;
      AV28TFPrdAcuConA_To = DecimalUtil.ZERO ;
      AV38TFPrdAcuConA_To_Description = "" ;
      AV29TFPrdValCprA = DecimalUtil.ZERO ;
      AV30TFPrdValCprA_To = DecimalUtil.ZERO ;
      AV39TFPrdValCprA_To_Description = "" ;
      AV31TFPrdValConA = DecimalUtil.ZERO ;
      AV32TFPrdValConA_To = DecimalUtil.ZERO ;
      AV40TFPrdValConA_To_Description = "" ;
      AV33TFDifValConA = DecimalUtil.ZERO ;
      AV34TFDifValConA_To = DecimalUtil.ZERO ;
      AV41TFDifValConA_To_Description = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      AV68Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      AV69Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      AV70Consumoprdquimicos_wcds_3_tfemprcod_sel = "" ;
      AV71Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV72Consumoprdquimicos_wcds_5_tfprdnum_sel = "" ;
      AV77Consumoprdquimicos_wcds_10_tfprdacucpra = DecimalUtil.ZERO ;
      AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to = DecimalUtil.ZERO ;
      AV79Consumoprdquimicos_wcds_12_tfprdacucona = DecimalUtil.ZERO ;
      AV80Consumoprdquimicos_wcds_13_tfprdacucona_to = DecimalUtil.ZERO ;
      AV81Consumoprdquimicos_wcds_14_tfprdvalcpra = DecimalUtil.ZERO ;
      AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to = DecimalUtil.ZERO ;
      AV83Consumoprdquimicos_wcds_16_tfprdvalcona = DecimalUtil.ZERO ;
      AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to = DecimalUtil.ZERO ;
      AV85Consumoprdquimicos_wcds_18_tfdifvalcona = DecimalUtil.ZERO ;
      AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV68Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      lV69Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      lV71Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV59PrdNumFrom = "" ;
      AV60PrdNumTo = "" ;
      P09GA3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GA3_n331DifValConA = new boolean[] {false} ;
      P09GA3_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GA3_A681PrdAny = new short[1] ;
      P09GA3_A719PrdNum = new String[] {""} ;
      P09GA3_A396EmprCod = new String[] {""} ;
      P09GA3_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GA3_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GA3_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50PageInfo = "" ;
      AV47DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV64Pgmdesc = "" ;
      AV45AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consumoprdquimicos_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09GA3_A331DifValConA, P09GA3_n331DifValConA, P09GA3_A676PrdAcuConA, P09GA3_A681PrdAny, P09GA3_A719PrdNum, P09GA3_A396EmprCod, P09GA3_A746PrdValConA, P09GA3_A748PrdValCprA, P09GA3_A677PrdAcuCprA
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "Consumo Prd Quimicos_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "Consumo Prd Quimicos_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV23TFPrdNumMes ;
   private byte AV24TFPrdNumMes_To ;
   private byte A720PrdNumMes ;
   private byte AV75Consumoprdquimicos_wcds_8_tfprdnummes ;
   private byte AV76Consumoprdquimicos_wcds_9_tfprdnummes_to ;
   private byte AV55MesI ;
   private byte AV56MesF ;
   private byte AV61Opcion ;
   private short gxcookieaux ;
   private short AV21TFPrdAny ;
   private short AV22TFPrdAny_To ;
   private short A681PrdAny ;
   private short AV73Consumoprdquimicos_wcds_6_tfprdany ;
   private short AV74Consumoprdquimicos_wcds_7_tfprdany_to ;
   private short AV54Anyo ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV87GXV1 ;
   private java.math.BigDecimal AV25TFPrdAcuCprA ;
   private java.math.BigDecimal AV26TFPrdAcuCprA_To ;
   private java.math.BigDecimal AV27TFPrdAcuConA ;
   private java.math.BigDecimal AV28TFPrdAcuConA_To ;
   private java.math.BigDecimal AV29TFPrdValCprA ;
   private java.math.BigDecimal AV30TFPrdValCprA_To ;
   private java.math.BigDecimal AV31TFPrdValConA ;
   private java.math.BigDecimal AV32TFPrdValConA_To ;
   private java.math.BigDecimal AV33TFDifValConA ;
   private java.math.BigDecimal AV34TFDifValConA_To ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal AV77Consumoprdquimicos_wcds_10_tfprdacucpra ;
   private java.math.BigDecimal AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to ;
   private java.math.BigDecimal AV79Consumoprdquimicos_wcds_12_tfprdacucona ;
   private java.math.BigDecimal AV80Consumoprdquimicos_wcds_13_tfprdacucona_to ;
   private java.math.BigDecimal AV81Consumoprdquimicos_wcds_14_tfprdvalcpra ;
   private java.math.BigDecimal AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to ;
   private java.math.BigDecimal AV83Consumoprdquimicos_wcds_16_tfprdvalcona ;
   private java.math.BigDecimal AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to ;
   private java.math.BigDecimal AV85Consumoprdquimicos_wcds_18_tfdifvalcona ;
   private java.math.BigDecimal AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFEmprCod_Sel ;
   private String AV17TFEmprCod ;
   private String AV20TFPrdNum_Sel ;
   private String AV19TFPrdNum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV69Consumoprdquimicos_wcds_2_tfemprcod ;
   private String AV70Consumoprdquimicos_wcds_3_tfemprcod_sel ;
   private String AV71Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV72Consumoprdquimicos_wcds_5_tfprdnum_sel ;
   private String scmdbuf ;
   private String lV69Consumoprdquimicos_wcds_2_tfemprcod ;
   private String lV71Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV59PrdNumFrom ;
   private String AV60PrdNumTo ;
   private String AV64Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n331DifValConA ;
   private String AV52Title ;
   private String AV12FilterFullText ;
   private String AV35TFPrdAny_To_Description ;
   private String AV36TFPrdNumMes_To_Description ;
   private String AV37TFPrdAcuCprA_To_Description ;
   private String AV38TFPrdAcuConA_To_Description ;
   private String AV39TFPrdValCprA_To_Description ;
   private String AV40TFPrdValConA_To_Description ;
   private String AV41TFDifValConA_To_Description ;
   private String AV68Consumoprdquimicos_wcds_1_filterfulltext ;
   private String lV68Consumoprdquimicos_wcds_1_filterfulltext ;
   private String AV50PageInfo ;
   private String AV47DateInfo ;
   private String AV45AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09GA3_A331DifValConA ;
   private boolean[] P09GA3_n331DifValConA ;
   private java.math.BigDecimal[] P09GA3_A676PrdAcuConA ;
   private short[] P09GA3_A681PrdAny ;
   private String[] P09GA3_A719PrdNum ;
   private String[] P09GA3_A396EmprCod ;
   private java.math.BigDecimal[] P09GA3_A746PrdValConA ;
   private java.math.BigDecimal[] P09GA3_A748PrdValCprA ;
   private java.math.BigDecimal[] P09GA3_A677PrdAcuCprA ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class consumoprdquimicos_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV70Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV69Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV72Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV71Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV73Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV74Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV75Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV76Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV77Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV79Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV80Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV81Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV83Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV85Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          short AV54Anyo ,
                                          byte AV55MesI ,
                                          byte AV56MesF ,
                                          byte AV61Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV59PrdNumFrom ,
                                          String AV60PrdNumTo ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.PrdNum, T1.EmprCod, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS PrdValCprA, COALESCE(" ;
      scmdbuf += " T2.PrdAcuCprA, 0) AS PrdAcuCprA FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM)" ;
      scmdbuf += " AS PrdAcuCprA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV70Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV73Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV74Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV61Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAny" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAny DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAcuConA DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DifValConA" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DifValConA DESC" ;
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
                  return conditional_P09GA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,4);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

