package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ccstkswwexportreport_impl extends GXWebReport
{
   public ccstkswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV92Title = httpContext.getMessage( "Lista de Tabla CCSTKS", "") ;
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
         h9LG0( true, 0) ;
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
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFEmprCod_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod_Sel, "@!")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFEmprCod)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod, "@!")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFPrdNum_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPrdNum)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPrdNum, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFCCStkLin) && (0==AV22TFCCStkLin_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Linea Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCCStkLin), "ZZZZZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV67TFCCStkLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Linea Movimiento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFCCStkLin_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCCStkLin_To), "ZZZZZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFCCStkCanE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFCCStkCanE_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Entrada", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TFCCStkCanE, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV68TFCCStkCanE_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFCCStkCanE_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TFCCStkCanE_To, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFCCStkCanS)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFCCStkCanS_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Salida", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFCCStkCanS, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV69TFCCStkCanS_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Salida", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFCCStkCanS_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFCCStkCanS_To, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFTipMovCc_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Tipo Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFTipMovCc_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFTipMovCc)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Tipo Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFTipMovCc, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFTipMovCn_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Tipo Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFTipMovCn_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFTipMovCn)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Tipo Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFTipMovCn, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFCCStkPri_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CCStkPri", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFCCStkPri_Sel, "9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFCCStkPri)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CCStkPri", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFCCStkPri, "9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFCCStkFec)) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Movimiento", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV33TFCCStkFec, "99/99/99"), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFCCStkPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFCCStkPre_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFCCStkPre, "ZZZZZZZ9.999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV71TFCCStkPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFCCStkPre_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFCCStkPre_To, "ZZZZZZZ9.999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV37TFCCStkBar) && (0==AV38TFCCStkBar_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFCCStkBar), "ZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFCCStkBar_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hoja de Ruta", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFCCStkBar_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFCCStkBar_To), "ZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV39TFCCStkReo) && (0==AV40TFCCStkReo_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reoperado", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFCCStkReo), "9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFCCStkReo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reoperado", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFCCStkReo_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFCCStkReo_To), "9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCCStkPar_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Particion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFCCStkPar_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV41TFCCStkPar)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Particion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFCCStkPar, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV43TFCCStkPed) && (0==AV44TFCCStkPed_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pedido", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43TFCCStkPed), "ZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV74TFCCStkPed_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pedido", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFCCStkPed_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFCCStkPed_To), "ZZZZZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFCCStkAlb_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFCCStkAlb_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFCCStkAlb)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFCCStkAlb, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV48TFCCStkUsu_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFCCStkUsu_Sel, "@!")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV47TFCCStkUsu)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFCCStkUsu, "@!")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFCCStkHor_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFCCStkHor_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFCCStkHor)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFCCStkHor, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV52TFCCStkDsc_Sel)==0) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFCCStkDsc_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFCCStkDsc)==0) )
         {
            h9LG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFCCStkDsc, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV53TFCCStkLen) && (0==AV54TFCCStkLen_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Linea Entrada Almacen", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFCCStkLen), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV75TFCCStkLen_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Linea Entrada Almacen", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFCCStkLen_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFCCStkLen_To), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdExiAlm_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Existencias Almacen", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TFPrdExiAlm, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV76TFPrdExiAlm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Existencias Almacen", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFPrdExiAlm_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56TFPrdExiAlm_To, "ZZZZZZ9.9999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV57TFCcoCod) && (0==AV58TFCcoCod_To) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CcoCod", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFCcoCod), "ZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFCcoCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "CcoCod", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFCcoCod_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58TFCcoCod_To), "ZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFValorE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFValorE_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor Entradas", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59TFValorE, "ZZZZZZZ9.99")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFValorE_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor Entradas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFValorE_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60TFValorE_To, "ZZZZZZZ9.99")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFValorS)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFValorS_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor salidas", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TFValorS, "ZZZZZZZZ9.99")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFValorS_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor salidas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFValorS_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62TFValorS_To, "ZZZZZZZZ9.99")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFValorEI)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFValorEI_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ValorEI", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TFValorEI, "ZZZZZZZ9.99999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFValorEI_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "ValorEI", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFValorEI_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFValorEI_To, "ZZZZZZZ9.99999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFValorSI)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFValorSI_To)==0) ) )
      {
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ValorSI", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFValorSI, "ZZZZZZZ9.99999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV81TFValorSI_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "ValorSI", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9LG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFValorSI_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66TFValorSI_To, "ZZZZZZZ9.99999")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9LG0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9LG0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 56, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 60, Gx_line+10, 86, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Linea Movimiento", ""), 90, Gx_line+10, 116, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Entrada", ""), 120, Gx_line+10, 146, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Salida", ""), 150, Gx_line+10, 176, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Tipo Movimiento", ""), 180, Gx_line+10, 206, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Tipo Movimiento", ""), 210, Gx_line+10, 236, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "CCStkPri", ""), 240, Gx_line+10, 266, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Movimiento", ""), 270, Gx_line+10, 296, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 300, Gx_line+10, 326, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 330, Gx_line+10, 356, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reoperado", ""), 360, Gx_line+10, 386, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Particion", ""), 390, Gx_line+10, 416, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pedido", ""), 420, Gx_line+10, 446, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Albaran", ""), 450, Gx_line+10, 476, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 480, Gx_line+10, 507, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 511, Gx_line+10, 538, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 542, Gx_line+10, 570, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Linea Entrada Almacen", ""), 574, Gx_line+10, 601, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencias Almacen", ""), 605, Gx_line+10, 632, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "CcoCod", ""), 636, Gx_line+10, 663, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Entradas", ""), 667, Gx_line+10, 694, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor salidas", ""), 698, Gx_line+10, 725, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ValorEI", ""), 729, Gx_line+10, 756, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ValorSI", ""), 760, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV100Ccstkswwds_1_filterfulltext = AV12FilterFullText ;
      AV101Ccstkswwds_2_tfemprcod = AV17TFEmprCod ;
      AV102Ccstkswwds_3_tfemprcod_sel = AV18TFEmprCod_Sel ;
      AV103Ccstkswwds_4_tfprdnum = AV19TFPrdNum ;
      AV104Ccstkswwds_5_tfprdnum_sel = AV20TFPrdNum_Sel ;
      AV105Ccstkswwds_6_tfccstklin = AV21TFCCStkLin ;
      AV106Ccstkswwds_7_tfccstklin_to = AV22TFCCStkLin_To ;
      AV107Ccstkswwds_8_tfccstkcane = AV23TFCCStkCanE ;
      AV108Ccstkswwds_9_tfccstkcane_to = AV24TFCCStkCanE_To ;
      AV109Ccstkswwds_10_tfccstkcans = AV25TFCCStkCanS ;
      AV110Ccstkswwds_11_tfccstkcans_to = AV26TFCCStkCanS_To ;
      AV111Ccstkswwds_12_tftipmovcc = AV27TFTipMovCc ;
      AV112Ccstkswwds_13_tftipmovcc_sel = AV28TFTipMovCc_Sel ;
      AV113Ccstkswwds_14_tftipmovcn = AV29TFTipMovCn ;
      AV114Ccstkswwds_15_tftipmovcn_sel = AV30TFTipMovCn_Sel ;
      AV115Ccstkswwds_16_tfccstkpri = AV31TFCCStkPri ;
      AV116Ccstkswwds_17_tfccstkpri_sel = AV32TFCCStkPri_Sel ;
      AV117Ccstkswwds_18_tfccstkfec = AV33TFCCStkFec ;
      AV118Ccstkswwds_19_tfccstkpre = AV35TFCCStkPre ;
      AV119Ccstkswwds_20_tfccstkpre_to = AV36TFCCStkPre_To ;
      AV120Ccstkswwds_21_tfccstkbar = AV37TFCCStkBar ;
      AV121Ccstkswwds_22_tfccstkbar_to = AV38TFCCStkBar_To ;
      AV122Ccstkswwds_23_tfccstkreo = AV39TFCCStkReo ;
      AV123Ccstkswwds_24_tfccstkreo_to = AV40TFCCStkReo_To ;
      AV124Ccstkswwds_25_tfccstkpar = AV41TFCCStkPar ;
      AV125Ccstkswwds_26_tfccstkpar_sel = AV42TFCCStkPar_Sel ;
      AV126Ccstkswwds_27_tfccstkped = AV43TFCCStkPed ;
      AV127Ccstkswwds_28_tfccstkped_to = AV44TFCCStkPed_To ;
      AV128Ccstkswwds_29_tfccstkalb = AV45TFCCStkAlb ;
      AV129Ccstkswwds_30_tfccstkalb_sel = AV46TFCCStkAlb_Sel ;
      AV130Ccstkswwds_31_tfccstkusu = AV47TFCCStkUsu ;
      AV131Ccstkswwds_32_tfccstkusu_sel = AV48TFCCStkUsu_Sel ;
      AV132Ccstkswwds_33_tfccstkhor = AV49TFCCStkHor ;
      AV133Ccstkswwds_34_tfccstkhor_sel = AV50TFCCStkHor_Sel ;
      AV134Ccstkswwds_35_tfccstkdsc = AV51TFCCStkDsc ;
      AV135Ccstkswwds_36_tfccstkdsc_sel = AV52TFCCStkDsc_Sel ;
      AV136Ccstkswwds_37_tfccstklen = AV53TFCCStkLen ;
      AV137Ccstkswwds_38_tfccstklen_to = AV54TFCCStkLen_To ;
      AV138Ccstkswwds_39_tfprdexialm = AV55TFPrdExiAlm ;
      AV139Ccstkswwds_40_tfprdexialm_to = AV56TFPrdExiAlm_To ;
      AV140Ccstkswwds_41_tfccocod = AV57TFCcoCod ;
      AV141Ccstkswwds_42_tfccocod_to = AV58TFCcoCod_To ;
      AV142Ccstkswwds_43_tfvalore = AV59TFValorE ;
      AV143Ccstkswwds_44_tfvalore_to = AV60TFValorE_To ;
      AV144Ccstkswwds_45_tfvalors = AV61TFValorS ;
      AV145Ccstkswwds_46_tfvalors_to = AV62TFValorS_To ;
      AV146Ccstkswwds_47_tfvalorei = AV63TFValorEI ;
      AV147Ccstkswwds_48_tfvalorei_to = AV64TFValorEI_To ;
      AV148Ccstkswwds_49_tfvalorsi = AV65TFValorSI ;
      AV149Ccstkswwds_50_tfvalorsi_to = AV66TFValorSI_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV102Ccstkswwds_3_tfemprcod_sel ,
                                           AV101Ccstkswwds_2_tfemprcod ,
                                           AV104Ccstkswwds_5_tfprdnum_sel ,
                                           AV103Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV105Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV106Ccstkswwds_7_tfccstklin_to) ,
                                           AV107Ccstkswwds_8_tfccstkcane ,
                                           AV108Ccstkswwds_9_tfccstkcane_to ,
                                           AV109Ccstkswwds_10_tfccstkcans ,
                                           AV110Ccstkswwds_11_tfccstkcans_to ,
                                           AV112Ccstkswwds_13_tftipmovcc_sel ,
                                           AV111Ccstkswwds_12_tftipmovcc ,
                                           AV114Ccstkswwds_15_tftipmovcn_sel ,
                                           AV113Ccstkswwds_14_tftipmovcn ,
                                           AV116Ccstkswwds_17_tfccstkpri_sel ,
                                           AV115Ccstkswwds_16_tfccstkpri ,
                                           AV117Ccstkswwds_18_tfccstkfec ,
                                           AV118Ccstkswwds_19_tfccstkpre ,
                                           AV119Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV120Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV121Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV122Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV123Ccstkswwds_24_tfccstkreo_to) ,
                                           AV125Ccstkswwds_26_tfccstkpar_sel ,
                                           AV124Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV126Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV127Ccstkswwds_28_tfccstkped_to) ,
                                           AV129Ccstkswwds_30_tfccstkalb_sel ,
                                           AV128Ccstkswwds_29_tfccstkalb ,
                                           AV131Ccstkswwds_32_tfccstkusu_sel ,
                                           AV130Ccstkswwds_31_tfccstkusu ,
                                           AV133Ccstkswwds_34_tfccstkhor_sel ,
                                           AV132Ccstkswwds_33_tfccstkhor ,
                                           AV135Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV134Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV136Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV137Ccstkswwds_38_tfccstklen_to) ,
                                           AV138Ccstkswwds_39_tfprdexialm ,
                                           AV139Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV140Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV141Ccstkswwds_42_tfccocod_to) ,
                                           AV146Ccstkswwds_47_tfvalorei ,
                                           AV147Ccstkswwds_48_tfvalorei_to ,
                                           AV148Ccstkswwds_49_tfvalorsi ,
                                           AV149Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV100Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV142Ccstkswwds_43_tfvalore ,
                                           AV143Ccstkswwds_44_tfvalore_to ,
                                           AV144Ccstkswwds_45_tfvalors ,
                                           AV145Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV100Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Ccstkswwds_1_filterfulltext), "%", "") ;
      lV101Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV101Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV103Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV103Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV111Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV113Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV115Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV124Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV124Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV128Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV128Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV130Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV130Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV132Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV132Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV134Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV134Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LG3 */
      pr_default.execute(0, new Object[] {AV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, lV100Ccstkswwds_1_filterfulltext, AV142Ccstkswwds_43_tfvalore, AV142Ccstkswwds_43_tfvalore, AV143Ccstkswwds_44_tfvalore_to, AV143Ccstkswwds_44_tfvalore_to, AV144Ccstkswwds_45_tfvalors, AV144Ccstkswwds_45_tfvalors, AV145Ccstkswwds_46_tfvalors_to, AV145Ccstkswwds_46_tfvalors_to, lV101Ccstkswwds_2_tfemprcod, AV102Ccstkswwds_3_tfemprcod_sel, lV103Ccstkswwds_4_tfprdnum, AV104Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV105Ccstkswwds_6_tfccstklin), Long.valueOf(AV106Ccstkswwds_7_tfccstklin_to), AV107Ccstkswwds_8_tfccstkcane, AV108Ccstkswwds_9_tfccstkcane_to, AV109Ccstkswwds_10_tfccstkcans, AV110Ccstkswwds_11_tfccstkcans_to, lV111Ccstkswwds_12_tftipmovcc, AV112Ccstkswwds_13_tftipmovcc_sel, lV113Ccstkswwds_14_tftipmovcn, AV114Ccstkswwds_15_tftipmovcn_sel, lV115Ccstkswwds_16_tfccstkpri, AV116Ccstkswwds_17_tfccstkpri_sel, AV117Ccstkswwds_18_tfccstkfec, AV118Ccstkswwds_19_tfccstkpre, AV119Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV120Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV121Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV122Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV123Ccstkswwds_24_tfccstkreo_to), lV124Ccstkswwds_25_tfccstkpar, AV125Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV126Ccstkswwds_27_tfccstkped), Integer.valueOf(AV127Ccstkswwds_28_tfccstkped_to), lV128Ccstkswwds_29_tfccstkalb, AV129Ccstkswwds_30_tfccstkalb_sel, lV130Ccstkswwds_31_tfccstkusu, AV131Ccstkswwds_32_tfccstkusu_sel, lV132Ccstkswwds_33_tfccstkhor, AV133Ccstkswwds_34_tfccstkhor_sel, lV134Ccstkswwds_35_tfccstkdsc, AV135Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV136Ccstkswwds_37_tfccstklen), Short.valueOf(AV137Ccstkswwds_38_tfccstklen_to), AV138Ccstkswwds_39_tfprdexialm, AV139Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV140Ccstkswwds_41_tfccocod), Short.valueOf(AV141Ccstkswwds_42_tfccocod_to), AV146Ccstkswwds_47_tfvalorei, AV147Ccstkswwds_48_tfvalorei_to, AV148Ccstkswwds_49_tfvalorsi, AV149Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3917ValorSI = P09LG3_A3917ValorSI[0] ;
         A3916ValorEI = P09LG3_A3916ValorEI[0] ;
         A3839CcoCod = P09LG3_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LG3_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LG3_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LG3_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LG3_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LG3_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LG3_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LG3_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LG3_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LG3_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LG3_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LG3_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LG3_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LG3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LG3_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LG3_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LG3_A3342CCStkLin[0] ;
         A719PrdNum = P09LG3_A719PrdNum[0] ;
         A396EmprCod = P09LG3_A396EmprCod[0] ;
         A3344CCStkCanS = P09LG3_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LG3_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LG3_A3343CCStkCanE[0] ;
         A3910ValorS = P09LG3_A3910ValorS[0] ;
         A3909ValorE = P09LG3_A3909ValorE[0] ;
         A704PrdExiAlm = P09LG3_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LG3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LG3_n3346TipMovCn[0] ;
         A3910ValorS = P09LG3_A3910ValorS[0] ;
         A3909ValorE = P09LG3_A3909ValorE[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
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
         h9LG0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 56, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 60, Gx_line+10, 86, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9")), 90, Gx_line+10, 116, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999")), 120, Gx_line+10, 146, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 150, Gx_line+10, 176, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), 180, Gx_line+10, 206, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), 210, Gx_line+10, 236, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3347CCStkPri, "9")), 240, Gx_line+10, 266, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A3348CCStkFec, "99/99/99"), 270, Gx_line+10, 296, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999")), 300, Gx_line+10, 326, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9")), 330, Gx_line+10, 356, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9")), 360, Gx_line+10, 386, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3352CCStkPar, "")), 390, Gx_line+10, 416, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9")), 420, Gx_line+10, 446, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3354CCStkAlb, "")), 450, Gx_line+10, 476, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!")), 480, Gx_line+10, 507, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3356CCStkHor, "")), 511, Gx_line+10, 538, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3357CCStkDsc, "")), 542, Gx_line+10, 570, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9")), 574, Gx_line+10, 601, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 605, Gx_line+10, 632, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9")), 636, Gx_line+10, 663, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3909ValorE, "ZZZZZZZ9.99")), 667, Gx_line+10, 694, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3910ValorS, "ZZZZZZZZ9.99")), 698, Gx_line+10, 725, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999")), 729, Gx_line+10, 756, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999")), 760, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("CCSTKSWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CCSTKSWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("CCSTKSWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV150GXV1 = 1 ;
      while ( AV150GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV150GXV1));
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
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV21TFCCStkLin = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV22TFCCStkLin_To = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANE") == 0 )
         {
            AV23TFCCStkCanE = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV24TFCCStkCanE_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV25TFCCStkCanS = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV26TFCCStkCanS_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV27TFTipMovCc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV28TFTipMovCc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV29TFTipMovCn = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV30TFTipMovCn_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI") == 0 )
         {
            AV31TFCCStkPri = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI_SEL") == 0 )
         {
            AV32TFCCStkPri_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV33TFCCStkFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV35TFCCStkPre = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFCCStkPre_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKBAR") == 0 )
         {
            AV37TFCCStkBar = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFCCStkBar_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKREO") == 0 )
         {
            AV39TFCCStkReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCCStkReo_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR") == 0 )
         {
            AV41TFCCStkPar = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR_SEL") == 0 )
         {
            AV42TFCCStkPar_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPED") == 0 )
         {
            AV43TFCCStkPed = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCCStkPed_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV45TFCCStkAlb = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV46TFCCStkAlb_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV47TFCCStkUsu = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV48TFCCStkUsu_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV49TFCCStkHor = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV50TFCCStkHor_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV51TFCCStkDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV52TFCCStkDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLEN") == 0 )
         {
            AV53TFCCStkLen = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFCCStkLen_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV55TFPrdExiAlm = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFPrdExiAlm_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCOCOD") == 0 )
         {
            AV57TFCcoCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFCcoCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORE") == 0 )
         {
            AV59TFValorE = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFValorE_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORS") == 0 )
         {
            AV61TFValorS = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFValorS_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALOREI") == 0 )
         {
            AV63TFValorEI = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFValorEI_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORSI") == 0 )
         {
            AV65TFValorSI = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFValorSI_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV150GXV1 = (int)(AV150GXV1+1) ;
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

   public void h9LG0( boolean bFoot ,
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
               AV90PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV87DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV92Title = AV96Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV92Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFEmprCod_Sel = "" ;
      AV17TFEmprCod = "" ;
      AV20TFPrdNum_Sel = "" ;
      AV19TFPrdNum = "" ;
      AV67TFCCStkLin_To_Description = "" ;
      AV23TFCCStkCanE = DecimalUtil.ZERO ;
      AV24TFCCStkCanE_To = DecimalUtil.ZERO ;
      AV68TFCCStkCanE_To_Description = "" ;
      AV25TFCCStkCanS = DecimalUtil.ZERO ;
      AV26TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV69TFCCStkCanS_To_Description = "" ;
      AV28TFTipMovCc_Sel = "" ;
      AV27TFTipMovCc = "" ;
      AV30TFTipMovCn_Sel = "" ;
      AV29TFTipMovCn = "" ;
      AV32TFCCStkPri_Sel = "" ;
      AV31TFCCStkPri = "" ;
      AV33TFCCStkFec = GXutil.nullDate() ;
      AV35TFCCStkPre = DecimalUtil.ZERO ;
      AV36TFCCStkPre_To = DecimalUtil.ZERO ;
      AV71TFCCStkPre_To_Description = "" ;
      AV72TFCCStkBar_To_Description = "" ;
      AV73TFCCStkReo_To_Description = "" ;
      AV42TFCCStkPar_Sel = "" ;
      AV41TFCCStkPar = "" ;
      AV74TFCCStkPed_To_Description = "" ;
      AV46TFCCStkAlb_Sel = "" ;
      AV45TFCCStkAlb = "" ;
      AV48TFCCStkUsu_Sel = "" ;
      AV47TFCCStkUsu = "" ;
      AV50TFCCStkHor_Sel = "" ;
      AV49TFCCStkHor = "" ;
      AV52TFCCStkDsc_Sel = "" ;
      AV51TFCCStkDsc = "" ;
      AV75TFCCStkLen_To_Description = "" ;
      AV55TFPrdExiAlm = DecimalUtil.ZERO ;
      AV56TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV76TFPrdExiAlm_To_Description = "" ;
      AV77TFCcoCod_To_Description = "" ;
      AV59TFValorE = DecimalUtil.ZERO ;
      AV60TFValorE_To = DecimalUtil.ZERO ;
      AV78TFValorE_To_Description = "" ;
      AV61TFValorS = DecimalUtil.ZERO ;
      AV62TFValorS_To = DecimalUtil.ZERO ;
      AV79TFValorS_To_Description = "" ;
      AV63TFValorEI = DecimalUtil.ZERO ;
      AV64TFValorEI_To = DecimalUtil.ZERO ;
      AV80TFValorEI_To_Description = "" ;
      AV65TFValorSI = DecimalUtil.ZERO ;
      AV66TFValorSI_To = DecimalUtil.ZERO ;
      AV81TFValorSI_To_Description = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      AV100Ccstkswwds_1_filterfulltext = "" ;
      AV101Ccstkswwds_2_tfemprcod = "" ;
      AV102Ccstkswwds_3_tfemprcod_sel = "" ;
      AV103Ccstkswwds_4_tfprdnum = "" ;
      AV104Ccstkswwds_5_tfprdnum_sel = "" ;
      AV107Ccstkswwds_8_tfccstkcane = DecimalUtil.ZERO ;
      AV108Ccstkswwds_9_tfccstkcane_to = DecimalUtil.ZERO ;
      AV109Ccstkswwds_10_tfccstkcans = DecimalUtil.ZERO ;
      AV110Ccstkswwds_11_tfccstkcans_to = DecimalUtil.ZERO ;
      AV111Ccstkswwds_12_tftipmovcc = "" ;
      AV112Ccstkswwds_13_tftipmovcc_sel = "" ;
      AV113Ccstkswwds_14_tftipmovcn = "" ;
      AV114Ccstkswwds_15_tftipmovcn_sel = "" ;
      AV115Ccstkswwds_16_tfccstkpri = "" ;
      AV116Ccstkswwds_17_tfccstkpri_sel = "" ;
      AV117Ccstkswwds_18_tfccstkfec = GXutil.nullDate() ;
      AV118Ccstkswwds_19_tfccstkpre = DecimalUtil.ZERO ;
      AV119Ccstkswwds_20_tfccstkpre_to = DecimalUtil.ZERO ;
      AV124Ccstkswwds_25_tfccstkpar = "" ;
      AV125Ccstkswwds_26_tfccstkpar_sel = "" ;
      AV128Ccstkswwds_29_tfccstkalb = "" ;
      AV129Ccstkswwds_30_tfccstkalb_sel = "" ;
      AV130Ccstkswwds_31_tfccstkusu = "" ;
      AV131Ccstkswwds_32_tfccstkusu_sel = "" ;
      AV132Ccstkswwds_33_tfccstkhor = "" ;
      AV133Ccstkswwds_34_tfccstkhor_sel = "" ;
      AV134Ccstkswwds_35_tfccstkdsc = "" ;
      AV135Ccstkswwds_36_tfccstkdsc_sel = "" ;
      AV138Ccstkswwds_39_tfprdexialm = DecimalUtil.ZERO ;
      AV139Ccstkswwds_40_tfprdexialm_to = DecimalUtil.ZERO ;
      AV142Ccstkswwds_43_tfvalore = DecimalUtil.ZERO ;
      AV143Ccstkswwds_44_tfvalore_to = DecimalUtil.ZERO ;
      AV144Ccstkswwds_45_tfvalors = DecimalUtil.ZERO ;
      AV145Ccstkswwds_46_tfvalors_to = DecimalUtil.ZERO ;
      AV146Ccstkswwds_47_tfvalorei = DecimalUtil.ZERO ;
      AV147Ccstkswwds_48_tfvalorei_to = DecimalUtil.ZERO ;
      AV148Ccstkswwds_49_tfvalorsi = DecimalUtil.ZERO ;
      AV149Ccstkswwds_50_tfvalorsi_to = DecimalUtil.ZERO ;
      lV100Ccstkswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV101Ccstkswwds_2_tfemprcod = "" ;
      lV103Ccstkswwds_4_tfprdnum = "" ;
      lV111Ccstkswwds_12_tftipmovcc = "" ;
      lV113Ccstkswwds_14_tftipmovcn = "" ;
      lV115Ccstkswwds_16_tfccstkpri = "" ;
      lV124Ccstkswwds_25_tfccstkpar = "" ;
      lV128Ccstkswwds_29_tfccstkalb = "" ;
      lV130Ccstkswwds_31_tfccstkusu = "" ;
      lV132Ccstkswwds_33_tfccstkhor = "" ;
      lV134Ccstkswwds_35_tfccstkdsc = "" ;
      P09LG3_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3839CcoCod = new short[1] ;
      P09LG3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3358CCStkLen = new short[1] ;
      P09LG3_A3357CCStkDsc = new String[] {""} ;
      P09LG3_A3356CCStkHor = new String[] {""} ;
      P09LG3_A3355CCStkUsu = new String[] {""} ;
      P09LG3_A3354CCStkAlb = new String[] {""} ;
      P09LG3_A3353CCStkPed = new int[1] ;
      P09LG3_A3352CCStkPar = new String[] {""} ;
      P09LG3_A3351CCStkReo = new byte[1] ;
      P09LG3_A3350CCStkBar = new int[1] ;
      P09LG3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LG3_A3347CCStkPri = new String[] {""} ;
      P09LG3_A3346TipMovCn = new String[] {""} ;
      P09LG3_n3346TipMovCn = new boolean[] {false} ;
      P09LG3_A3345TipMovCc = new String[] {""} ;
      P09LG3_A3342CCStkLin = new long[1] ;
      P09LG3_A719PrdNum = new String[] {""} ;
      P09LG3_A396EmprCod = new String[] {""} ;
      P09LG3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LG3_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV90PageInfo = "" ;
      AV87DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV96Pgmdesc = "" ;
      AV85AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstkswwexportreport__default(),
         new Object[] {
             new Object[] {
            P09LG3_A3917ValorSI, P09LG3_A3916ValorEI, P09LG3_A3839CcoCod, P09LG3_A704PrdExiAlm, P09LG3_A3358CCStkLen, P09LG3_A3357CCStkDsc, P09LG3_A3356CCStkHor, P09LG3_A3355CCStkUsu, P09LG3_A3354CCStkAlb, P09LG3_A3353CCStkPed,
            P09LG3_A3352CCStkPar, P09LG3_A3351CCStkReo, P09LG3_A3350CCStkBar, P09LG3_A3348CCStkFec, P09LG3_A3347CCStkPri, P09LG3_A3346TipMovCn, P09LG3_n3346TipMovCn, P09LG3_A3345TipMovCc, P09LG3_A3342CCStkLin, P09LG3_A719PrdNum,
            P09LG3_A396EmprCod, P09LG3_A3344CCStkCanS, P09LG3_A3349CCStkPre, P09LG3_A3343CCStkCanE, P09LG3_A3910ValorS, P09LG3_A3909ValorE
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV96Pgmdesc = httpContext.getMessage( "CCSTKSWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV96Pgmdesc = httpContext.getMessage( "CCSTKSWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV39TFCCStkReo ;
   private byte AV40TFCCStkReo_To ;
   private byte A3351CCStkReo ;
   private byte AV122Ccstkswwds_23_tfccstkreo ;
   private byte AV123Ccstkswwds_24_tfccstkreo_to ;
   private short gxcookieaux ;
   private short AV53TFCCStkLen ;
   private short AV54TFCCStkLen_To ;
   private short AV57TFCcoCod ;
   private short AV58TFCcoCod_To ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short AV136Ccstkswwds_37_tfccstklen ;
   private short AV137Ccstkswwds_38_tfccstklen_to ;
   private short AV140Ccstkswwds_41_tfccocod ;
   private short AV141Ccstkswwds_42_tfccocod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV37TFCCStkBar ;
   private int AV38TFCCStkBar_To ;
   private int AV43TFCCStkPed ;
   private int AV44TFCCStkPed_To ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV120Ccstkswwds_21_tfccstkbar ;
   private int AV121Ccstkswwds_22_tfccstkbar_to ;
   private int AV126Ccstkswwds_27_tfccstkped ;
   private int AV127Ccstkswwds_28_tfccstkped_to ;
   private int AV150GXV1 ;
   private long AV21TFCCStkLin ;
   private long AV22TFCCStkLin_To ;
   private long A3342CCStkLin ;
   private long AV105Ccstkswwds_6_tfccstklin ;
   private long AV106Ccstkswwds_7_tfccstklin_to ;
   private java.math.BigDecimal AV23TFCCStkCanE ;
   private java.math.BigDecimal AV24TFCCStkCanE_To ;
   private java.math.BigDecimal AV25TFCCStkCanS ;
   private java.math.BigDecimal AV26TFCCStkCanS_To ;
   private java.math.BigDecimal AV35TFCCStkPre ;
   private java.math.BigDecimal AV36TFCCStkPre_To ;
   private java.math.BigDecimal AV55TFPrdExiAlm ;
   private java.math.BigDecimal AV56TFPrdExiAlm_To ;
   private java.math.BigDecimal AV59TFValorE ;
   private java.math.BigDecimal AV60TFValorE_To ;
   private java.math.BigDecimal AV61TFValorS ;
   private java.math.BigDecimal AV62TFValorS_To ;
   private java.math.BigDecimal AV63TFValorEI ;
   private java.math.BigDecimal AV64TFValorEI_To ;
   private java.math.BigDecimal AV65TFValorSI ;
   private java.math.BigDecimal AV66TFValorSI_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal AV107Ccstkswwds_8_tfccstkcane ;
   private java.math.BigDecimal AV108Ccstkswwds_9_tfccstkcane_to ;
   private java.math.BigDecimal AV109Ccstkswwds_10_tfccstkcans ;
   private java.math.BigDecimal AV110Ccstkswwds_11_tfccstkcans_to ;
   private java.math.BigDecimal AV118Ccstkswwds_19_tfccstkpre ;
   private java.math.BigDecimal AV119Ccstkswwds_20_tfccstkpre_to ;
   private java.math.BigDecimal AV138Ccstkswwds_39_tfprdexialm ;
   private java.math.BigDecimal AV139Ccstkswwds_40_tfprdexialm_to ;
   private java.math.BigDecimal AV142Ccstkswwds_43_tfvalore ;
   private java.math.BigDecimal AV143Ccstkswwds_44_tfvalore_to ;
   private java.math.BigDecimal AV144Ccstkswwds_45_tfvalors ;
   private java.math.BigDecimal AV145Ccstkswwds_46_tfvalors_to ;
   private java.math.BigDecimal AV146Ccstkswwds_47_tfvalorei ;
   private java.math.BigDecimal AV147Ccstkswwds_48_tfvalorei_to ;
   private java.math.BigDecimal AV148Ccstkswwds_49_tfvalorsi ;
   private java.math.BigDecimal AV149Ccstkswwds_50_tfvalorsi_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFEmprCod_Sel ;
   private String AV17TFEmprCod ;
   private String AV20TFPrdNum_Sel ;
   private String AV19TFPrdNum ;
   private String AV28TFTipMovCc_Sel ;
   private String AV27TFTipMovCc ;
   private String AV30TFTipMovCn_Sel ;
   private String AV29TFTipMovCn ;
   private String AV32TFCCStkPri_Sel ;
   private String AV31TFCCStkPri ;
   private String AV42TFCCStkPar_Sel ;
   private String AV41TFCCStkPar ;
   private String AV46TFCCStkAlb_Sel ;
   private String AV45TFCCStkAlb ;
   private String AV48TFCCStkUsu_Sel ;
   private String AV47TFCCStkUsu ;
   private String AV50TFCCStkHor_Sel ;
   private String AV49TFCCStkHor ;
   private String AV52TFCCStkDsc_Sel ;
   private String AV51TFCCStkDsc ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3346TipMovCn ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A3357CCStkDsc ;
   private String AV101Ccstkswwds_2_tfemprcod ;
   private String AV102Ccstkswwds_3_tfemprcod_sel ;
   private String AV103Ccstkswwds_4_tfprdnum ;
   private String AV104Ccstkswwds_5_tfprdnum_sel ;
   private String AV111Ccstkswwds_12_tftipmovcc ;
   private String AV112Ccstkswwds_13_tftipmovcc_sel ;
   private String AV113Ccstkswwds_14_tftipmovcn ;
   private String AV114Ccstkswwds_15_tftipmovcn_sel ;
   private String AV115Ccstkswwds_16_tfccstkpri ;
   private String AV116Ccstkswwds_17_tfccstkpri_sel ;
   private String AV124Ccstkswwds_25_tfccstkpar ;
   private String AV125Ccstkswwds_26_tfccstkpar_sel ;
   private String AV128Ccstkswwds_29_tfccstkalb ;
   private String AV129Ccstkswwds_30_tfccstkalb_sel ;
   private String AV130Ccstkswwds_31_tfccstkusu ;
   private String AV131Ccstkswwds_32_tfccstkusu_sel ;
   private String AV132Ccstkswwds_33_tfccstkhor ;
   private String AV133Ccstkswwds_34_tfccstkhor_sel ;
   private String AV134Ccstkswwds_35_tfccstkdsc ;
   private String AV135Ccstkswwds_36_tfccstkdsc_sel ;
   private String scmdbuf ;
   private String lV101Ccstkswwds_2_tfemprcod ;
   private String lV103Ccstkswwds_4_tfprdnum ;
   private String lV111Ccstkswwds_12_tftipmovcc ;
   private String lV113Ccstkswwds_14_tftipmovcn ;
   private String lV115Ccstkswwds_16_tfccstkpri ;
   private String lV124Ccstkswwds_25_tfccstkpar ;
   private String lV128Ccstkswwds_29_tfccstkalb ;
   private String lV130Ccstkswwds_31_tfccstkusu ;
   private String lV132Ccstkswwds_33_tfccstkhor ;
   private String lV134Ccstkswwds_35_tfccstkdsc ;
   private String AV96Pgmdesc ;
   private java.util.Date AV33TFCCStkFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV117Ccstkswwds_18_tfccstkfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n3346TipMovCn ;
   private String AV92Title ;
   private String AV12FilterFullText ;
   private String AV67TFCCStkLin_To_Description ;
   private String AV68TFCCStkCanE_To_Description ;
   private String AV69TFCCStkCanS_To_Description ;
   private String AV71TFCCStkPre_To_Description ;
   private String AV72TFCCStkBar_To_Description ;
   private String AV73TFCCStkReo_To_Description ;
   private String AV74TFCCStkPed_To_Description ;
   private String AV75TFCCStkLen_To_Description ;
   private String AV76TFPrdExiAlm_To_Description ;
   private String AV77TFCcoCod_To_Description ;
   private String AV78TFValorE_To_Description ;
   private String AV79TFValorS_To_Description ;
   private String AV80TFValorEI_To_Description ;
   private String AV81TFValorSI_To_Description ;
   private String AV100Ccstkswwds_1_filterfulltext ;
   private String lV100Ccstkswwds_1_filterfulltext ;
   private String AV90PageInfo ;
   private String AV87DateInfo ;
   private String AV85AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09LG3_A3917ValorSI ;
   private java.math.BigDecimal[] P09LG3_A3916ValorEI ;
   private short[] P09LG3_A3839CcoCod ;
   private java.math.BigDecimal[] P09LG3_A704PrdExiAlm ;
   private short[] P09LG3_A3358CCStkLen ;
   private String[] P09LG3_A3357CCStkDsc ;
   private String[] P09LG3_A3356CCStkHor ;
   private String[] P09LG3_A3355CCStkUsu ;
   private String[] P09LG3_A3354CCStkAlb ;
   private int[] P09LG3_A3353CCStkPed ;
   private String[] P09LG3_A3352CCStkPar ;
   private byte[] P09LG3_A3351CCStkReo ;
   private int[] P09LG3_A3350CCStkBar ;
   private java.util.Date[] P09LG3_A3348CCStkFec ;
   private String[] P09LG3_A3347CCStkPri ;
   private String[] P09LG3_A3346TipMovCn ;
   private boolean[] P09LG3_n3346TipMovCn ;
   private String[] P09LG3_A3345TipMovCc ;
   private long[] P09LG3_A3342CCStkLin ;
   private String[] P09LG3_A719PrdNum ;
   private String[] P09LG3_A396EmprCod ;
   private java.math.BigDecimal[] P09LG3_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LG3_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LG3_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LG3_A3910ValorS ;
   private java.math.BigDecimal[] P09LG3_A3909ValorE ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class ccstkswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Ccstkswwds_3_tfemprcod_sel ,
                                          String AV101Ccstkswwds_2_tfemprcod ,
                                          String AV104Ccstkswwds_5_tfprdnum_sel ,
                                          String AV103Ccstkswwds_4_tfprdnum ,
                                          long AV105Ccstkswwds_6_tfccstklin ,
                                          long AV106Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV107Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV108Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV109Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV110Ccstkswwds_11_tfccstkcans_to ,
                                          String AV112Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV111Ccstkswwds_12_tftipmovcc ,
                                          String AV114Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV113Ccstkswwds_14_tftipmovcn ,
                                          String AV116Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV115Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV117Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV118Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV119Ccstkswwds_20_tfccstkpre_to ,
                                          int AV120Ccstkswwds_21_tfccstkbar ,
                                          int AV121Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV122Ccstkswwds_23_tfccstkreo ,
                                          byte AV123Ccstkswwds_24_tfccstkreo_to ,
                                          String AV125Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV124Ccstkswwds_25_tfccstkpar ,
                                          int AV126Ccstkswwds_27_tfccstkped ,
                                          int AV127Ccstkswwds_28_tfccstkped_to ,
                                          String AV129Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV128Ccstkswwds_29_tfccstkalb ,
                                          String AV131Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV130Ccstkswwds_31_tfccstkusu ,
                                          String AV133Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV132Ccstkswwds_33_tfccstkhor ,
                                          String AV135Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV134Ccstkswwds_35_tfccstkdsc ,
                                          short AV136Ccstkswwds_37_tfccstklen ,
                                          short AV137Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV138Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV139Ccstkswwds_40_tfprdexialm_to ,
                                          short AV140Ccstkswwds_41_tfccocod ,
                                          short AV141Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV146Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV147Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV148Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV149Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV100Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV142Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV143Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV144Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV145Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[78];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm, T1.CCStkLen," ;
      scmdbuf += " T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV102Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV121Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (0==AV122Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV124Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (0==AV126Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! (0==AV127Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV128Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV130Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV132Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (0==AV136Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( ! (0==AV137Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int2[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[71] = (byte)(1) ;
      }
      if ( ! (0==AV140Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int2[72] = (byte)(1) ;
      }
      if ( ! (0==AV141Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int2[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int2[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int2[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int2[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int2[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLin" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLin DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMovCc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMovCc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipMovCn" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipMovCn DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPri" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkFec" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPre" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPre DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkBar" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkBar DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkReo" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPar" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPar DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPed" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPed DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkHor" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkHor DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLen" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLen DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CcoCod" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CcoCod DESC" ;
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
                  return conditional_P09LG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
      }
   }

}

