package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcomproexportreport_impl extends GXWebReport
{
   public wcwcomproexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53Title = httpContext.getMessage( "Lista de Tabla ENTALM", "") ;
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
         h8PH0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV68FilterFullText)==0) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68FilterFullText, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFEntPrvNum) && (0==AV19TFEntPrvNum_To) ) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFEntPrvNum), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFEntPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFEntPrvNum_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFEntPrvNum_To), "ZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20TFEntFecEnt)) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV20TFEntFecEnt, "99/99/99"), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFPrdNum_Sel)==0) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrdNum_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFPrdNum)==0) )
         {
            h8PH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrdNum, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFPrdNom_Sel)==0) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPrdNom_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFPrdNom)==0) )
         {
            h8PH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPrdNom, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV26TFPedCod) && (0==AV27TFPedCod_To) ) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Pedido", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFPedCod), "ZZZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFPedCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Pedido", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPedCod_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFPedCod_To), "ZZZZZZZ9")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFEntUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFEntUniEnt_To)==0) ) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFEntUniEnt, "ZZZZZ9.99")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFEntUniEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFEntUniEnt_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFEntUniEnt_To, "ZZZZZ9.99")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFEntPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFEntPre_To)==0) ) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFEntPre, "ZZZZZZZ9.999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFEntPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFEntPre_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFEntPre_To, "ZZZZZZZ9.999")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPedValFormula)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFPedValFormula_To)==0) ) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFPedValFormula, "ZZZZZZZZ9.99")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFPedValFormula_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Valor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFPedValFormula_To_Description, "")), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFPedValFormula_To, "ZZZZZZZZ9.99")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFEntLotN_Sel)==0) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFEntLotN_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFEntLotN)==0) )
         {
            h8PH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFEntLotN, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFEntRemNro_Sel)==0) )
      {
         h8PH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Doc Int", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFEntRemNro_Sel, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFEntRemNro)==0) )
         {
            h8PH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Doc Int", ""), 25, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFEntRemNro, "")), 122, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8PH0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8PH0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Pedido", ""), 320, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Doc", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 436, Gx_line+10, 490, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 494, Gx_line+10, 549, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 553, Gx_line+10, 608, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 612, Gx_line+10, 668, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Doc Int", ""), 672, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV135Wcwcomprods_1_filterfulltext = AV68FilterFullText ;
      AV136Wcwcomprods_2_tfentprvnum = AV18TFEntPrvNum ;
      AV137Wcwcomprods_3_tfentprvnum_to = AV19TFEntPrvNum_To ;
      AV138Wcwcomprods_4_tfentfecent = AV20TFEntFecEnt ;
      AV139Wcwcomprods_5_tfprdnum = AV22TFPrdNum ;
      AV140Wcwcomprods_6_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV141Wcwcomprods_7_tfprdnom = AV24TFPrdNom ;
      AV142Wcwcomprods_8_tfprdnom_sel = AV25TFPrdNom_Sel ;
      AV143Wcwcomprods_9_tfpedcod = AV26TFPedCod ;
      AV144Wcwcomprods_10_tfpedcod_to = AV27TFPedCod_To ;
      AV145Wcwcomprods_11_tfentunient = AV28TFEntUniEnt ;
      AV146Wcwcomprods_12_tfentunient_to = AV29TFEntUniEnt_To ;
      AV147Wcwcomprods_13_tfentpre = AV30TFEntPre ;
      AV148Wcwcomprods_14_tfentpre_to = AV31TFEntPre_To ;
      AV149Wcwcomprods_15_tfpedvalformula = AV32TFPedValFormula ;
      AV150Wcwcomprods_16_tfpedvalformula_to = AV33TFPedValFormula_To ;
      AV151Wcwcomprods_17_tfentlotn = AV34TFEntLotN ;
      AV152Wcwcomprods_18_tfentlotn_sel = AV35TFEntLotN_Sel ;
      AV153Wcwcomprods_19_tfentremnro = AV36TFEntRemNro ;
      AV154Wcwcomprods_20_tfentremnro_sel = AV37TFEntRemNro_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV135Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV136Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV137Wcwcomprods_3_tfentprvnum_to) ,
                                           AV138Wcwcomprods_4_tfentfecent ,
                                           AV140Wcwcomprods_6_tfprdnum_sel ,
                                           AV139Wcwcomprods_5_tfprdnum ,
                                           AV142Wcwcomprods_8_tfprdnom_sel ,
                                           AV141Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV143Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV144Wcwcomprods_10_tfpedcod_to) ,
                                           AV145Wcwcomprods_11_tfentunient ,
                                           AV146Wcwcomprods_12_tfentunient_to ,
                                           AV147Wcwcomprods_13_tfentpre ,
                                           AV148Wcwcomprods_14_tfentpre_to ,
                                           AV149Wcwcomprods_15_tfpedvalformula ,
                                           AV150Wcwcomprods_16_tfpedvalformula_to ,
                                           AV152Wcwcomprods_18_tfentlotn_sel ,
                                           AV151Wcwcomprods_17_tfentlotn ,
                                           AV154Wcwcomprods_20_tfentremnro_sel ,
                                           AV153Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV61EntFecEnt ,
                                           AV62EntFecEnt_to ,
                                           Integer.valueOf(AV63PrvNum) ,
                                           Integer.valueOf(AV64PrvNum_to) ,
                                           A11Albaran ,
                                           AV56Emprcod ,
                                           AV65Prdnum ,
                                           A396EmprCod ,
                                           AV66Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV135Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Wcwcomprods_1_filterfulltext), "%", "") ;
      lV139Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV139Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV141Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV141Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV151Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV151Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV153Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV153Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PH2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, AV65Prdnum, AV61EntFecEnt, AV62EntFecEnt_to, Integer.valueOf(AV63PrvNum), Integer.valueOf(AV64PrvNum_to), AV66Prdnum_to, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, lV135Wcwcomprods_1_filterfulltext, Integer.valueOf(AV136Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV137Wcwcomprods_3_tfentprvnum_to), AV138Wcwcomprods_4_tfentfecent, lV139Wcwcomprods_5_tfprdnum, AV140Wcwcomprods_6_tfprdnum_sel, lV141Wcwcomprods_7_tfprdnom, AV142Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV143Wcwcomprods_9_tfpedcod), Integer.valueOf(AV144Wcwcomprods_10_tfpedcod_to), AV145Wcwcomprods_11_tfentunient, AV146Wcwcomprods_12_tfentunient_to, AV147Wcwcomprods_13_tfentpre, AV148Wcwcomprods_14_tfentpre_to, AV149Wcwcomprods_15_tfpedvalformula, AV150Wcwcomprods_16_tfpedvalformula_to, lV151Wcwcomprods_17_tfentlotn, AV152Wcwcomprods_18_tfentlotn_sel, lV153Wcwcomprods_19_tfentremnro, AV154Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P08PH2_A658PedCod[0] ;
         n658PedCod = P08PH2_n658PedCod[0] ;
         A396EmprCod = P08PH2_A396EmprCod[0] ;
         A11Albaran = P08PH2_A11Albaran[0] ;
         A10187EntRemNro = P08PH2_A10187EntRemNro[0] ;
         A5686EntLotN = P08PH2_A5686EntLotN[0] ;
         A417EntPre = P08PH2_A417EntPre[0] ;
         A418EntUniEnt = P08PH2_A418EntUniEnt[0] ;
         A718PrdNom = P08PH2_A718PrdNom[0] ;
         A719PrdNum = P08PH2_A719PrdNum[0] ;
         A415EntFecEnt = P08PH2_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PH2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PH2_n6156EntPrvNum[0] ;
         A12857EntNAlbar = P08PH2_A12857EntNAlbar[0] ;
         A660PedDto = P08PH2_A660PedDto[0] ;
         A665PedPre = P08PH2_A665PedPre[0] ;
         A669PedUni = P08PH2_A669PedUni[0] ;
         A597LinEnt = P08PH2_A597LinEnt[0] ;
         A718PrdNom = P08PH2_A718PrdNom[0] ;
         A660PedDto = P08PH2_A660PedDto[0] ;
         A665PedPre = P08PH2_A665PedPre[0] ;
         A669PedUni = P08PH2_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         GXt_char2 = AV67PrvNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A6156EntPrvNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         wcwcomproexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         wcwcomproexportreport_impl.this.A6156EntPrvNum = GXv_int4[0] ;
         wcwcomproexportreport_impl.this.GXt_char2 = GXv_char5[0] ;
         AV67PrvNom = GXt_char2 ;
         AV12EntNAlbar = ((GXutil.strcmp("", A12857EntNAlbar)==0) ? A11Albaran : A12857EntNAlbar) ;
         AV13Observaciones = "" ;
         /* Using cursor P08PH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2502PedObsTxt = P08PH3_A2502PedObsTxt[0] ;
            A2501PedObsLin = P08PH3_A2501PedObsLin[0] ;
            if ( GXutil.strcmp(AV13Observaciones, "") == 0 )
            {
               AV13Observaciones = A2502PedObsTxt + GXutil.newLine( ) ;
            }
            else
            {
               AV13Observaciones += A2502PedObsTxt + GXutil.newLine( ) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
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
         h8PH0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67PrvNom, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A415EntFecEnt, "99/99/99"), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 320, Gx_line+10, 374, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EntNAlbar, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")), 436, Gx_line+10, 490, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")), 494, Gx_line+10, 549, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99")), 553, Gx_line+10, 608, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5686EntLotN, "")), 612, Gx_line+10, 668, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10187EntRemNro, "")), 672, Gx_line+10, 727, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Observaciones, "")), 731, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("WCWcomproGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcomproGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("WCWcomproGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV156GXV1 = 1 ;
      while ( AV156GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV156GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV68FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV18TFEntPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFEntPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV20TFEntFecEnt = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV22TFPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV23TFPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV24TFPrdNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV25TFPrdNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV26TFPedCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFPedCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV28TFEntUniEnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFEntUniEnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV30TFEntPre = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFEntPre_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDVALFORMULA") == 0 )
         {
            AV32TFPedValFormula = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFPedValFormula_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV34TFEntLotN = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV35TFEntLotN_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO") == 0 )
         {
            AV36TFEntRemNro = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO_SEL") == 0 )
         {
            AV37TFEntRemNro_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT") == 0 )
         {
            AV61EntFecEnt = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT_TO") == 0 )
         {
            AV62EntFecEnt_to = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV63PrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV64PrvNum_to = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV65Prdnum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV66Prdnum_to = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV156GXV1 = (int)(AV156GXV1+1) ;
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

   public void h8PH0( boolean bFoot ,
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
               AV46DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV53Title = AV131Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV53Title = "" ;
      AV68FilterFullText = "" ;
      AV38TFEntPrvNum_To_Description = "" ;
      AV20TFEntFecEnt = GXutil.nullDate() ;
      AV23TFPrdNum_Sel = "" ;
      AV22TFPrdNum = "" ;
      AV25TFPrdNom_Sel = "" ;
      AV24TFPrdNom = "" ;
      AV40TFPedCod_To_Description = "" ;
      AV28TFEntUniEnt = DecimalUtil.ZERO ;
      AV29TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV41TFEntUniEnt_To_Description = "" ;
      AV30TFEntPre = DecimalUtil.ZERO ;
      AV31TFEntPre_To = DecimalUtil.ZERO ;
      AV42TFEntPre_To_Description = "" ;
      AV32TFPedValFormula = DecimalUtil.ZERO ;
      AV33TFPedValFormula_To = DecimalUtil.ZERO ;
      AV43TFPedValFormula_To_Description = "" ;
      AV35TFEntLotN_Sel = "" ;
      AV34TFEntLotN = "" ;
      AV37TFEntRemNro_Sel = "" ;
      AV36TFEntRemNro = "" ;
      A396EmprCod = "" ;
      A12857EntNAlbar = "" ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A13787PedValForm = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A10187EntRemNro = "" ;
      AV135Wcwcomprods_1_filterfulltext = "" ;
      AV138Wcwcomprods_4_tfentfecent = GXutil.nullDate() ;
      AV139Wcwcomprods_5_tfprdnum = "" ;
      AV140Wcwcomprods_6_tfprdnum_sel = "" ;
      AV141Wcwcomprods_7_tfprdnom = "" ;
      AV142Wcwcomprods_8_tfprdnom_sel = "" ;
      AV145Wcwcomprods_11_tfentunient = DecimalUtil.ZERO ;
      AV146Wcwcomprods_12_tfentunient_to = DecimalUtil.ZERO ;
      AV147Wcwcomprods_13_tfentpre = DecimalUtil.ZERO ;
      AV148Wcwcomprods_14_tfentpre_to = DecimalUtil.ZERO ;
      AV149Wcwcomprods_15_tfpedvalformula = DecimalUtil.ZERO ;
      AV150Wcwcomprods_16_tfpedvalformula_to = DecimalUtil.ZERO ;
      AV151Wcwcomprods_17_tfentlotn = "" ;
      AV152Wcwcomprods_18_tfentlotn_sel = "" ;
      AV153Wcwcomprods_19_tfentremnro = "" ;
      AV154Wcwcomprods_20_tfentremnro_sel = "" ;
      scmdbuf = "" ;
      lV135Wcwcomprods_1_filterfulltext = "" ;
      lV139Wcwcomprods_5_tfprdnum = "" ;
      lV141Wcwcomprods_7_tfprdnom = "" ;
      lV151Wcwcomprods_17_tfentlotn = "" ;
      lV153Wcwcomprods_19_tfentremnro = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      AV61EntFecEnt = GXutil.nullDate() ;
      AV62EntFecEnt_to = GXutil.nullDate() ;
      AV56Emprcod = "" ;
      AV65Prdnum = "" ;
      AV66Prdnum_to = "" ;
      P08PH2_A658PedCod = new int[1] ;
      P08PH2_n658PedCod = new boolean[] {false} ;
      P08PH2_A396EmprCod = new String[] {""} ;
      P08PH2_A11Albaran = new String[] {""} ;
      P08PH2_A10187EntRemNro = new String[] {""} ;
      P08PH2_A5686EntLotN = new String[] {""} ;
      P08PH2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PH2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PH2_A718PrdNom = new String[] {""} ;
      P08PH2_A719PrdNum = new String[] {""} ;
      P08PH2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PH2_A6156EntPrvNum = new int[1] ;
      P08PH2_n6156EntPrvNum = new boolean[] {false} ;
      P08PH2_A12857EntNAlbar = new String[] {""} ;
      P08PH2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PH2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PH2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PH2_A597LinEnt = new short[1] ;
      AV67PrvNom = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      AV12EntNAlbar = "" ;
      AV13Observaciones = "" ;
      P08PH3_A396EmprCod = new String[] {""} ;
      P08PH3_A658PedCod = new int[1] ;
      P08PH3_n658PedCod = new boolean[] {false} ;
      P08PH3_A2502PedObsTxt = new String[] {""} ;
      P08PH3_A2501PedObsLin = new byte[1] ;
      A2502PedObsTxt = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50PageInfo = "" ;
      AV46DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV131Pgmdesc = "" ;
      AV70AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcomproexportreport__default(),
         new Object[] {
             new Object[] {
            P08PH2_A658PedCod, P08PH2_n658PedCod, P08PH2_A396EmprCod, P08PH2_A11Albaran, P08PH2_A10187EntRemNro, P08PH2_A5686EntLotN, P08PH2_A417EntPre, P08PH2_A418EntUniEnt, P08PH2_A718PrdNom, P08PH2_A719PrdNum,
            P08PH2_A415EntFecEnt, P08PH2_A6156EntPrvNum, P08PH2_n6156EntPrvNum, P08PH2_A12857EntNAlbar, P08PH2_A660PedDto, P08PH2_A665PedPre, P08PH2_A669PedUni, P08PH2_A597LinEnt
            }
            , new Object[] {
            P08PH3_A396EmprCod, P08PH3_A658PedCod, P08PH3_A2502PedObsTxt, P08PH3_A2501PedObsLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV131Pgmdesc = httpContext.getMessage( "WCWcompro Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV131Pgmdesc = httpContext.getMessage( "WCWcompro Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A2501PedObsLin ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFEntPrvNum ;
   private int AV19TFEntPrvNum_To ;
   private int AV26TFPedCod ;
   private int AV27TFPedCod_To ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int AV136Wcwcomprods_2_tfentprvnum ;
   private int AV137Wcwcomprods_3_tfentprvnum_to ;
   private int AV143Wcwcomprods_9_tfpedcod ;
   private int AV144Wcwcomprods_10_tfpedcod_to ;
   private int AV63PrvNum ;
   private int AV64PrvNum_to ;
   private int GXv_int4[] ;
   private int AV156GXV1 ;
   private java.math.BigDecimal AV28TFEntUniEnt ;
   private java.math.BigDecimal AV29TFEntUniEnt_To ;
   private java.math.BigDecimal AV30TFEntPre ;
   private java.math.BigDecimal AV31TFEntPre_To ;
   private java.math.BigDecimal AV32TFPedValFormula ;
   private java.math.BigDecimal AV33TFPedValFormula_To ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A13787PedValForm ;
   private java.math.BigDecimal AV145Wcwcomprods_11_tfentunient ;
   private java.math.BigDecimal AV146Wcwcomprods_12_tfentunient_to ;
   private java.math.BigDecimal AV147Wcwcomprods_13_tfentpre ;
   private java.math.BigDecimal AV148Wcwcomprods_14_tfentpre_to ;
   private java.math.BigDecimal AV149Wcwcomprods_15_tfpedvalformula ;
   private java.math.BigDecimal AV150Wcwcomprods_16_tfpedvalformula_to ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV23TFPrdNum_Sel ;
   private String AV22TFPrdNum ;
   private String AV25TFPrdNom_Sel ;
   private String AV24TFPrdNom ;
   private String AV35TFEntLotN_Sel ;
   private String AV34TFEntLotN ;
   private String AV37TFEntRemNro_Sel ;
   private String AV36TFEntRemNro ;
   private String A396EmprCod ;
   private String A12857EntNAlbar ;
   private String A11Albaran ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A5686EntLotN ;
   private String A10187EntRemNro ;
   private String AV139Wcwcomprods_5_tfprdnum ;
   private String AV140Wcwcomprods_6_tfprdnum_sel ;
   private String AV141Wcwcomprods_7_tfprdnom ;
   private String AV142Wcwcomprods_8_tfprdnom_sel ;
   private String AV151Wcwcomprods_17_tfentlotn ;
   private String AV152Wcwcomprods_18_tfentlotn_sel ;
   private String AV153Wcwcomprods_19_tfentremnro ;
   private String AV154Wcwcomprods_20_tfentremnro_sel ;
   private String scmdbuf ;
   private String lV139Wcwcomprods_5_tfprdnum ;
   private String lV141Wcwcomprods_7_tfprdnom ;
   private String lV151Wcwcomprods_17_tfentlotn ;
   private String lV153Wcwcomprods_19_tfentremnro ;
   private String AV56Emprcod ;
   private String AV65Prdnum ;
   private String AV66Prdnum_to ;
   private String AV67PrvNom ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV12EntNAlbar ;
   private String AV13Observaciones ;
   private String A2502PedObsTxt ;
   private String AV131Pgmdesc ;
   private java.util.Date AV20TFEntFecEnt ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV138Wcwcomprods_4_tfentfecent ;
   private java.util.Date AV61EntFecEnt ;
   private java.util.Date AV62EntFecEnt_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private String AV53Title ;
   private String AV68FilterFullText ;
   private String AV38TFEntPrvNum_To_Description ;
   private String AV40TFPedCod_To_Description ;
   private String AV41TFEntUniEnt_To_Description ;
   private String AV42TFEntPre_To_Description ;
   private String AV43TFPedValFormula_To_Description ;
   private String AV135Wcwcomprods_1_filterfulltext ;
   private String lV135Wcwcomprods_1_filterfulltext ;
   private String AV50PageInfo ;
   private String AV46DateInfo ;
   private String AV70AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08PH2_A658PedCod ;
   private boolean[] P08PH2_n658PedCod ;
   private String[] P08PH2_A396EmprCod ;
   private String[] P08PH2_A11Albaran ;
   private String[] P08PH2_A10187EntRemNro ;
   private String[] P08PH2_A5686EntLotN ;
   private java.math.BigDecimal[] P08PH2_A417EntPre ;
   private java.math.BigDecimal[] P08PH2_A418EntUniEnt ;
   private String[] P08PH2_A718PrdNom ;
   private String[] P08PH2_A719PrdNum ;
   private java.util.Date[] P08PH2_A415EntFecEnt ;
   private int[] P08PH2_A6156EntPrvNum ;
   private boolean[] P08PH2_n6156EntPrvNum ;
   private String[] P08PH2_A12857EntNAlbar ;
   private java.math.BigDecimal[] P08PH2_A660PedDto ;
   private java.math.BigDecimal[] P08PH2_A665PedPre ;
   private java.math.BigDecimal[] P08PH2_A669PedUni ;
   private short[] P08PH2_A597LinEnt ;
   private String[] P08PH3_A396EmprCod ;
   private int[] P08PH3_A658PedCod ;
   private boolean[] P08PH3_n658PedCod ;
   private String[] P08PH3_A2502PedObsTxt ;
   private byte[] P08PH3_A2501PedObsLin ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class wcwcomproexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV135Wcwcomprods_1_filterfulltext ,
                                          int AV136Wcwcomprods_2_tfentprvnum ,
                                          int AV137Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV138Wcwcomprods_4_tfentfecent ,
                                          String AV140Wcwcomprods_6_tfprdnum_sel ,
                                          String AV139Wcwcomprods_5_tfprdnum ,
                                          String AV142Wcwcomprods_8_tfprdnom_sel ,
                                          String AV141Wcwcomprods_7_tfprdnom ,
                                          int AV143Wcwcomprods_9_tfpedcod ,
                                          int AV144Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV145Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV146Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV147Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV148Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV149Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV150Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV152Wcwcomprods_18_tfentlotn_sel ,
                                          String AV151Wcwcomprods_17_tfentlotn ,
                                          String AV154Wcwcomprods_20_tfentremnro_sel ,
                                          String AV153Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          java.util.Date AV61EntFecEnt ,
                                          java.util.Date AV62EntFecEnt_to ,
                                          int AV63PrvNum ,
                                          int AV64PrvNum_to ,
                                          String A11Albaran ,
                                          String AV56Emprcod ,
                                          String AV65Prdnum ,
                                          String A396EmprCod ,
                                          String AV66Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[35];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.Albaran, T1.EntRemNro, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum, T1.EntNAlbar, T3.PedDto," ;
      scmdbuf += " T3.PedPre, T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV135Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV136Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV137Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV139Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV141Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV143Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV144Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV151Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV153Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt DESC" ;
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
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPre" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPre DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntLotN" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntLotN DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntRemNro" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntRemNro DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08PH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PH3", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

