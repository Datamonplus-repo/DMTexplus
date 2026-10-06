package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprepedwwexportreport_impl extends GXWebReport
{
   public tprepedwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV62Title = httpContext.getMessage( "Lista de Realizacion Pedidos", "") ;
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
         h8RJ0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV70FilterFullText)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70FilterFullText, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFEmprCod_Sel)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFEmprCod_Sel, "@!")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFEmprCod)==0) )
         {
            h8RJ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFEmprCod, "@!")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV32TFPrePrvNum) && (0==AV33TFPrePrvNum_To) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PrePrvNum", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFPrePrvNum), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFPrePrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "PrePrvNum", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFPrePrvNum_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFPrePrvNum_To), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV72TFPrePrvDsc_Sel)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFPrePrvDsc_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFPrePrvDsc)==0) )
         {
            h8RJ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFPrePrvDsc, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrdNum_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFPrdNum)==0) )
         {
            h8RJ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFPrdNum, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV36TFPedCod) && (0==AV37TFPedCod_To) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Pedido", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFPedCod), "ZZZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFPedCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Pedido", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPedCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFPedCod_To), "ZZZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrePedUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrePedUni_To)==0) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Prepedido", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFPrePedUni, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFPrePedUni_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Prepedido", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFPrePedUni_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TFPrePedUni_To, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFPrePedCon_Sel)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Confirmado", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFPrePedCon_Sel, "@!")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFPrePedCon)==0) )
         {
            h8RJ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Confirmado", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrePedCon, "@!")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrePedPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrePedPre_To)==0) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFPrePedPre, "ZZZZZ9.999")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFPrePedPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFPrePedPre_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFPrePedPre_To, "ZZZZZ9.999")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrePedDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrePedDto_To)==0) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFPrePedDto, "Z9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV52TFPrePedDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descuento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFPrePedDto_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TFPrePedDto_To, "Z9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFPrePedPri_Sel)==0) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrePedPri_Sel, "9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFPrePedPri)==0) )
         {
            h8RJ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFPrePedPri, "9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFPrdPreAct_To)==0) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73TFPrdPreAct, "ZZZZZZZ9.999")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFPrdPreAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFPrdPreAct_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TFPrdPreAct_To, "ZZZZZZZ9.999")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFTipDtoDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFTipDtoDto_To)==0) ) )
      {
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TFTipDtoDto, "Z9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFTipDtoDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Descuento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8RJ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFTipDtoDto_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76TFTipDtoDto_To, "Z9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8RJ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8RJ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 84, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "PrePrvNum", ""), 88, Gx_line+10, 142, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 146, Gx_line+10, 256, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 260, Gx_line+10, 315, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Pedido", ""), 319, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Prepedido", ""), 378, Gx_line+10, 433, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Confirmado", ""), 437, Gx_line+10, 492, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 496, Gx_line+10, 551, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 555, Gx_line+10, 610, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 614, Gx_line+10, 669, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 673, Gx_line+10, 728, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descuento", ""), 732, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV90Tprepedwwds_1_filterfulltext = AV70FilterFullText ;
      AV91Tprepedwwds_2_tfemprcod = AV30TFEmprCod ;
      AV92Tprepedwwds_3_tfemprcod_sel = AV31TFEmprCod_Sel ;
      AV93Tprepedwwds_4_tfpreprvnum = AV32TFPrePrvNum ;
      AV94Tprepedwwds_5_tfpreprvnum_to = AV33TFPrePrvNum_To ;
      AV95Tprepedwwds_6_tfpreprvdsc = AV71TFPrePrvDsc ;
      AV96Tprepedwwds_7_tfpreprvdsc_sel = AV72TFPrePrvDsc_Sel ;
      AV97Tprepedwwds_8_tfprdnum = AV34TFPrdNum ;
      AV98Tprepedwwds_9_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV99Tprepedwwds_10_tfpedcod = AV36TFPedCod ;
      AV100Tprepedwwds_11_tfpedcod_to = AV37TFPedCod_To ;
      AV101Tprepedwwds_12_tfprepeduni = AV38TFPrePedUni ;
      AV102Tprepedwwds_13_tfprepeduni_to = AV39TFPrePedUni_To ;
      AV103Tprepedwwds_14_tfprepedcon = AV40TFPrePedCon ;
      AV104Tprepedwwds_15_tfprepedcon_sel = AV41TFPrePedCon_Sel ;
      AV105Tprepedwwds_16_tfprepedpre = AV42TFPrePedPre ;
      AV106Tprepedwwds_17_tfprepedpre_to = AV43TFPrePedPre_To ;
      AV107Tprepedwwds_18_tfprepeddto = AV44TFPrePedDto ;
      AV108Tprepedwwds_19_tfprepeddto_to = AV45TFPrePedDto_To ;
      AV109Tprepedwwds_20_tfprepedpri = AV46TFPrePedPri ;
      AV110Tprepedwwds_21_tfprepedpri_sel = AV47TFPrePedPri_Sel ;
      AV111Tprepedwwds_22_tfprdpreact = AV73TFPrdPreAct ;
      AV112Tprepedwwds_23_tfprdpreact_to = AV74TFPrdPreAct_To ;
      AV113Tprepedwwds_24_tftipdtodto = AV75TFTipDtoDto ;
      AV114Tprepedwwds_25_tftipdtodto_to = AV76TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV92Tprepedwwds_3_tfemprcod_sel ,
                                           AV91Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV93Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV94Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV98Tprepedwwds_9_tfprdnum_sel ,
                                           AV97Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV99Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV100Tprepedwwds_11_tfpedcod_to) ,
                                           AV101Tprepedwwds_12_tfprepeduni ,
                                           AV102Tprepedwwds_13_tfprepeduni_to ,
                                           AV104Tprepedwwds_15_tfprepedcon_sel ,
                                           AV103Tprepedwwds_14_tfprepedcon ,
                                           AV105Tprepedwwds_16_tfprepedpre ,
                                           AV106Tprepedwwds_17_tfprepedpre_to ,
                                           AV107Tprepedwwds_18_tfprepeddto ,
                                           AV108Tprepedwwds_19_tfprepeddto_to ,
                                           AV110Tprepedwwds_21_tfprepedpri_sel ,
                                           AV109Tprepedwwds_20_tfprepedpri ,
                                           AV111Tprepedwwds_22_tfprdpreact ,
                                           AV112Tprepedwwds_23_tfprdpreact_to ,
                                           AV113Tprepedwwds_24_tftipdtodto ,
                                           AV114Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV90Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV96Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV95Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV90Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tprepedwwds_1_filterfulltext), "%", "") ;
      lV95Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV95Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV91Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV91Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV97Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV97Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV103Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV103Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV109Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV109Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RJ2 */
      pr_default.execute(0, new Object[] {AV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, lV90Tprepedwwds_1_filterfulltext, AV96Tprepedwwds_7_tfpreprvdsc_sel, AV95Tprepedwwds_6_tfpreprvdsc, lV95Tprepedwwds_6_tfpreprvdsc, AV96Tprepedwwds_7_tfpreprvdsc_sel, AV96Tprepedwwds_7_tfpreprvdsc_sel, lV91Tprepedwwds_2_tfemprcod, AV92Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV93Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV94Tprepedwwds_5_tfpreprvnum_to), lV97Tprepedwwds_8_tfprdnum, AV98Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV99Tprepedwwds_10_tfpedcod), Integer.valueOf(AV100Tprepedwwds_11_tfpedcod_to), AV101Tprepedwwds_12_tfprepeduni, AV102Tprepedwwds_13_tfprepeduni_to, lV103Tprepedwwds_14_tfprepedcon, AV104Tprepedwwds_15_tfprepedcon_sel, AV105Tprepedwwds_16_tfprepedpre, AV106Tprepedwwds_17_tfprepedpre_to, AV107Tprepedwwds_18_tfprepeddto, AV108Tprepedwwds_19_tfprepeddto_to, lV109Tprepedwwds_20_tfprepedpri, AV110Tprepedwwds_21_tfprepedpri_sel, AV111Tprepedwwds_22_tfprdpreact, AV112Tprepedwwds_23_tfprdpreact_to, AV113Tprepedwwds_24_tftipdtodto, AV114Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A835TipDtoCod = P08RJ2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RJ2_n835TipDtoCod[0] ;
         A837TipDtoDto = P08RJ2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RJ2_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RJ2_A724PrdPreAct[0] ;
         A754PrePedPri = P08RJ2_A754PrePedPri[0] ;
         n754PrePedPri = P08RJ2_n754PrePedPri[0] ;
         A752PrePedDto = P08RJ2_A752PrePedDto[0] ;
         n752PrePedDto = P08RJ2_n752PrePedDto[0] ;
         A753PrePedPre = P08RJ2_A753PrePedPre[0] ;
         n753PrePedPre = P08RJ2_n753PrePedPre[0] ;
         A751PrePedCon = P08RJ2_A751PrePedCon[0] ;
         n751PrePedCon = P08RJ2_n751PrePedCon[0] ;
         A755PrePedUni = P08RJ2_A755PrePedUni[0] ;
         n755PrePedUni = P08RJ2_n755PrePedUni[0] ;
         A658PedCod = P08RJ2_A658PedCod[0] ;
         n658PedCod = P08RJ2_n658PedCod[0] ;
         A719PrdNum = P08RJ2_A719PrdNum[0] ;
         A756PrePrvNum = P08RJ2_A756PrePrvNum[0] ;
         A396EmprCod = P08RJ2_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RJ2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RJ2_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RJ2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RJ2_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RJ2_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RJ2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RJ2_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RJ2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RJ2_n13791PrePrvDsc[0] ;
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
         h8RJ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 84, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")), 88, Gx_line+10, 142, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13791PrePrvDsc, "")), 146, Gx_line+10, 256, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 260, Gx_line+10, 315, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 319, Gx_line+10, 374, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A755PrePedUni, "ZZZZZ9.99")), 378, Gx_line+10, 433, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A751PrePedCon, "@!")), 437, Gx_line+10, 492, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A753PrePedPre, "ZZZZZ9.999")), 496, Gx_line+10, 551, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A752PrePedDto, "Z9.99")), 555, Gx_line+10, 610, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A754PrePedPri, "9")), 614, Gx_line+10, 669, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 673, Gx_line+10, 728, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A837TipDtoDto, "Z9.99")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV26Session.getValue("TPREPEDWWGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPREPEDWWGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("TPREPEDWWGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV115GXV1 = 1 ;
      while ( AV115GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV115GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV70FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV30TFEmprCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV31TFEmprCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVNUM") == 0 )
         {
            AV32TFPrePrvNum = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFPrePrvNum_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC") == 0 )
         {
            AV71TFPrePrvDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC_SEL") == 0 )
         {
            AV72TFPrePrvDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV36TFPedCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPedCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDUNI") == 0 )
         {
            AV38TFPrePedUni = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPrePedUni_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON") == 0 )
         {
            AV40TFPrePedCon = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON_SEL") == 0 )
         {
            AV41TFPrePedCon_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRE") == 0 )
         {
            AV42TFPrePedPre = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrePedPre_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDDTO") == 0 )
         {
            AV44TFPrePedDto = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrePedDto_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI") == 0 )
         {
            AV46TFPrePedPri = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI_SEL") == 0 )
         {
            AV47TFPrePedPri_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV73TFPrdPreAct = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFPrdPreAct_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV75TFTipDtoDto = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFTipDtoDto_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV115GXV1 = (int)(AV115GXV1+1) ;
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

   public void h8RJ0( boolean bFoot ,
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
               AV59PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV55DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV62Title = AV86Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV62Title = "" ;
      AV70FilterFullText = "" ;
      AV31TFEmprCod_Sel = "" ;
      AV30TFEmprCod = "" ;
      AV48TFPrePrvNum_To_Description = "" ;
      AV72TFPrePrvDsc_Sel = "" ;
      AV71TFPrePrvDsc = "" ;
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV49TFPedCod_To_Description = "" ;
      AV38TFPrePedUni = DecimalUtil.ZERO ;
      AV39TFPrePedUni_To = DecimalUtil.ZERO ;
      AV50TFPrePedUni_To_Description = "" ;
      AV41TFPrePedCon_Sel = "" ;
      AV40TFPrePedCon = "" ;
      AV42TFPrePedPre = DecimalUtil.ZERO ;
      AV43TFPrePedPre_To = DecimalUtil.ZERO ;
      AV51TFPrePedPre_To_Description = "" ;
      AV44TFPrePedDto = DecimalUtil.ZERO ;
      AV45TFPrePedDto_To = DecimalUtil.ZERO ;
      AV52TFPrePedDto_To_Description = "" ;
      AV47TFPrePedPri_Sel = "" ;
      AV46TFPrePedPri = "" ;
      AV73TFPrdPreAct = DecimalUtil.ZERO ;
      AV74TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV77TFPrdPreAct_To_Description = "" ;
      AV75TFTipDtoDto = DecimalUtil.ZERO ;
      AV76TFTipDtoDto_To = DecimalUtil.ZERO ;
      AV78TFTipDtoDto_To_Description = "" ;
      A396EmprCod = "" ;
      A13791PrePrvDsc = "" ;
      A719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      AV90Tprepedwwds_1_filterfulltext = "" ;
      AV91Tprepedwwds_2_tfemprcod = "" ;
      AV92Tprepedwwds_3_tfemprcod_sel = "" ;
      AV95Tprepedwwds_6_tfpreprvdsc = "" ;
      AV96Tprepedwwds_7_tfpreprvdsc_sel = "" ;
      AV97Tprepedwwds_8_tfprdnum = "" ;
      AV98Tprepedwwds_9_tfprdnum_sel = "" ;
      AV101Tprepedwwds_12_tfprepeduni = DecimalUtil.ZERO ;
      AV102Tprepedwwds_13_tfprepeduni_to = DecimalUtil.ZERO ;
      AV103Tprepedwwds_14_tfprepedcon = "" ;
      AV104Tprepedwwds_15_tfprepedcon_sel = "" ;
      AV105Tprepedwwds_16_tfprepedpre = DecimalUtil.ZERO ;
      AV106Tprepedwwds_17_tfprepedpre_to = DecimalUtil.ZERO ;
      AV107Tprepedwwds_18_tfprepeddto = DecimalUtil.ZERO ;
      AV108Tprepedwwds_19_tfprepeddto_to = DecimalUtil.ZERO ;
      AV109Tprepedwwds_20_tfprepedpri = "" ;
      AV110Tprepedwwds_21_tfprepedpri_sel = "" ;
      AV111Tprepedwwds_22_tfprdpreact = DecimalUtil.ZERO ;
      AV112Tprepedwwds_23_tfprdpreact_to = DecimalUtil.ZERO ;
      AV113Tprepedwwds_24_tftipdtodto = DecimalUtil.ZERO ;
      AV114Tprepedwwds_25_tftipdtodto_to = DecimalUtil.ZERO ;
      lV90Tprepedwwds_1_filterfulltext = "" ;
      lV95Tprepedwwds_6_tfpreprvdsc = "" ;
      scmdbuf = "" ;
      lV91Tprepedwwds_2_tfemprcod = "" ;
      lV97Tprepedwwds_8_tfprdnum = "" ;
      lV103Tprepedwwds_14_tfprepedcon = "" ;
      lV109Tprepedwwds_20_tfprepedpri = "" ;
      P08RJ2_A795PrvNum = new int[1] ;
      P08RJ2_A835TipDtoCod = new byte[1] ;
      P08RJ2_n835TipDtoCod = new boolean[] {false} ;
      P08RJ2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RJ2_n837TipDtoDto = new boolean[] {false} ;
      P08RJ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RJ2_A754PrePedPri = new String[] {""} ;
      P08RJ2_n754PrePedPri = new boolean[] {false} ;
      P08RJ2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RJ2_n752PrePedDto = new boolean[] {false} ;
      P08RJ2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RJ2_n753PrePedPre = new boolean[] {false} ;
      P08RJ2_A751PrePedCon = new String[] {""} ;
      P08RJ2_n751PrePedCon = new boolean[] {false} ;
      P08RJ2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RJ2_n755PrePedUni = new boolean[] {false} ;
      P08RJ2_A658PedCod = new int[1] ;
      P08RJ2_n658PedCod = new boolean[] {false} ;
      P08RJ2_A719PrdNum = new String[] {""} ;
      P08RJ2_A756PrePrvNum = new int[1] ;
      P08RJ2_A396EmprCod = new String[] {""} ;
      P08RJ2_A13791PrePrvDsc = new String[] {""} ;
      P08RJ2_n13791PrePrvDsc = new boolean[] {false} ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59PageInfo = "" ;
      AV55DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV86Pgmdesc = "" ;
      AV80AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprepedwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08RJ2_A795PrvNum, P08RJ2_A835TipDtoCod, P08RJ2_n835TipDtoCod, P08RJ2_A837TipDtoDto, P08RJ2_n837TipDtoDto, P08RJ2_A724PrdPreAct, P08RJ2_A754PrePedPri, P08RJ2_n754PrePedPri, P08RJ2_A752PrePedDto, P08RJ2_n752PrePedDto,
            P08RJ2_A753PrePedPre, P08RJ2_n753PrePedPre, P08RJ2_A751PrePedCon, P08RJ2_n751PrePedCon, P08RJ2_A755PrePedUni, P08RJ2_n755PrePedUni, P08RJ2_A658PedCod, P08RJ2_n658PedCod, P08RJ2_A719PrdNum, P08RJ2_A756PrePrvNum,
            P08RJ2_A396EmprCod, P08RJ2_A13791PrePrvDsc, P08RJ2_n13791PrePrvDsc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV86Pgmdesc = httpContext.getMessage( "TPREPEDWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV86Pgmdesc = httpContext.getMessage( "TPREPEDWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A835TipDtoCod ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV32TFPrePrvNum ;
   private int AV33TFPrePrvNum_To ;
   private int AV36TFPedCod ;
   private int AV37TFPedCod_To ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int AV93Tprepedwwds_4_tfpreprvnum ;
   private int AV94Tprepedwwds_5_tfpreprvnum_to ;
   private int AV99Tprepedwwds_10_tfpedcod ;
   private int AV100Tprepedwwds_11_tfpedcod_to ;
   private int AV115GXV1 ;
   private java.math.BigDecimal AV38TFPrePedUni ;
   private java.math.BigDecimal AV39TFPrePedUni_To ;
   private java.math.BigDecimal AV42TFPrePedPre ;
   private java.math.BigDecimal AV43TFPrePedPre_To ;
   private java.math.BigDecimal AV44TFPrePedDto ;
   private java.math.BigDecimal AV45TFPrePedDto_To ;
   private java.math.BigDecimal AV73TFPrdPreAct ;
   private java.math.BigDecimal AV74TFPrdPreAct_To ;
   private java.math.BigDecimal AV75TFTipDtoDto ;
   private java.math.BigDecimal AV76TFTipDtoDto_To ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV101Tprepedwwds_12_tfprepeduni ;
   private java.math.BigDecimal AV102Tprepedwwds_13_tfprepeduni_to ;
   private java.math.BigDecimal AV105Tprepedwwds_16_tfprepedpre ;
   private java.math.BigDecimal AV106Tprepedwwds_17_tfprepedpre_to ;
   private java.math.BigDecimal AV107Tprepedwwds_18_tfprepeddto ;
   private java.math.BigDecimal AV108Tprepedwwds_19_tfprepeddto_to ;
   private java.math.BigDecimal AV111Tprepedwwds_22_tfprdpreact ;
   private java.math.BigDecimal AV112Tprepedwwds_23_tfprdpreact_to ;
   private java.math.BigDecimal AV113Tprepedwwds_24_tftipdtodto ;
   private java.math.BigDecimal AV114Tprepedwwds_25_tftipdtodto_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV31TFEmprCod_Sel ;
   private String AV30TFEmprCod ;
   private String AV72TFPrePrvDsc_Sel ;
   private String AV71TFPrePrvDsc ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV41TFPrePedCon_Sel ;
   private String AV40TFPrePedCon ;
   private String AV47TFPrePedPri_Sel ;
   private String AV46TFPrePedPri ;
   private String A396EmprCod ;
   private String A13791PrePrvDsc ;
   private String A719PrdNum ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String AV91Tprepedwwds_2_tfemprcod ;
   private String AV92Tprepedwwds_3_tfemprcod_sel ;
   private String AV95Tprepedwwds_6_tfpreprvdsc ;
   private String AV96Tprepedwwds_7_tfpreprvdsc_sel ;
   private String AV97Tprepedwwds_8_tfprdnum ;
   private String AV98Tprepedwwds_9_tfprdnum_sel ;
   private String AV103Tprepedwwds_14_tfprepedcon ;
   private String AV104Tprepedwwds_15_tfprepedcon_sel ;
   private String AV109Tprepedwwds_20_tfprepedpri ;
   private String AV110Tprepedwwds_21_tfprepedpri_sel ;
   private String lV95Tprepedwwds_6_tfpreprvdsc ;
   private String scmdbuf ;
   private String lV91Tprepedwwds_2_tfemprcod ;
   private String lV97Tprepedwwds_8_tfprdnum ;
   private String lV103Tprepedwwds_14_tfprepedcon ;
   private String lV109Tprepedwwds_20_tfprepedpri ;
   private String AV86Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n835TipDtoCod ;
   private boolean n837TipDtoDto ;
   private boolean n754PrePedPri ;
   private boolean n752PrePedDto ;
   private boolean n753PrePedPre ;
   private boolean n751PrePedCon ;
   private boolean n755PrePedUni ;
   private boolean n658PedCod ;
   private boolean n13791PrePrvDsc ;
   private String AV62Title ;
   private String AV70FilterFullText ;
   private String AV48TFPrePrvNum_To_Description ;
   private String AV49TFPedCod_To_Description ;
   private String AV50TFPrePedUni_To_Description ;
   private String AV51TFPrePedPre_To_Description ;
   private String AV52TFPrePedDto_To_Description ;
   private String AV77TFPrdPreAct_To_Description ;
   private String AV78TFTipDtoDto_To_Description ;
   private String AV90Tprepedwwds_1_filterfulltext ;
   private String lV90Tprepedwwds_1_filterfulltext ;
   private String AV59PageInfo ;
   private String AV55DateInfo ;
   private String AV80AppName ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08RJ2_A795PrvNum ;
   private byte[] P08RJ2_A835TipDtoCod ;
   private boolean[] P08RJ2_n835TipDtoCod ;
   private java.math.BigDecimal[] P08RJ2_A837TipDtoDto ;
   private boolean[] P08RJ2_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RJ2_A724PrdPreAct ;
   private String[] P08RJ2_A754PrePedPri ;
   private boolean[] P08RJ2_n754PrePedPri ;
   private java.math.BigDecimal[] P08RJ2_A752PrePedDto ;
   private boolean[] P08RJ2_n752PrePedDto ;
   private java.math.BigDecimal[] P08RJ2_A753PrePedPre ;
   private boolean[] P08RJ2_n753PrePedPre ;
   private String[] P08RJ2_A751PrePedCon ;
   private boolean[] P08RJ2_n751PrePedCon ;
   private java.math.BigDecimal[] P08RJ2_A755PrePedUni ;
   private boolean[] P08RJ2_n755PrePedUni ;
   private int[] P08RJ2_A658PedCod ;
   private boolean[] P08RJ2_n658PedCod ;
   private String[] P08RJ2_A719PrdNum ;
   private int[] P08RJ2_A756PrePrvNum ;
   private String[] P08RJ2_A396EmprCod ;
   private String[] P08RJ2_A13791PrePrvDsc ;
   private boolean[] P08RJ2_n13791PrePrvDsc ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class tprepedwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Tprepedwwds_3_tfemprcod_sel ,
                                          String AV91Tprepedwwds_2_tfemprcod ,
                                          int AV93Tprepedwwds_4_tfpreprvnum ,
                                          int AV94Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV98Tprepedwwds_9_tfprdnum_sel ,
                                          String AV97Tprepedwwds_8_tfprdnum ,
                                          int AV99Tprepedwwds_10_tfpedcod ,
                                          int AV100Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV101Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV102Tprepedwwds_13_tfprepeduni_to ,
                                          String AV104Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV103Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV105Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV106Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV107Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV108Tprepedwwds_19_tfprepeddto_to ,
                                          String AV110Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV109Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV111Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV112Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV113Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV114Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV90Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV96Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV95Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV92Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV94Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV99Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV100Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV109Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.PrePrvNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePrvNum DESC" ;
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
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedUni" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedCon" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedCon DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPre" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPre DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedDto" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedDto DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPri" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto DESC" ;
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
                  return conditional_P08RJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

