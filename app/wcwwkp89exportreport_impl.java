package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwwkp89exportreport_impl extends GXWebReport
{
   public wcwwkp89exportreport_impl( com.genexus.internet.HttpContext context )
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
         AV60Title = httpContext.getMessage( "Lista de Mantenimiento Productos Quimicos", "") ;
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
         h9V00( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV16FilterFullText)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFPrdNum_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFPrdNum_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFPrdNum)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrdNum, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFPrdNom_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFPrdNom_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFPrdNom)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFPrdNom, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFTipPrdDsc_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Familia", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFTipPrdDsc_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFTipPrdDsc)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Familia", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFTipPrdDsc, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFPrdRefPrv_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Uso", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFPrdRefPrv_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFPrdRefPrv)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Uso", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFPrdRefPrv, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV36TFPrdUbicacion_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFPrdUbicacion_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFPrdUbicacion)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrdUbicacion, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdStkMinU)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdStkMinU_To)==0) ) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Stock Minimo", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TFPrdStkMinU, "ZZZZ9.99")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV47TFPrdStkMinU_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Stock Minimo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrdStkMinU_To_Description, "")), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFPrdStkMinU_To, "ZZZZ9.99")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdPreAct_To)==0) ) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TFPrdPreAct, "ZZZZZZZ9.999")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFPrdPreAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFPrdPreAct_To_Description, "")), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFPrdPreAct_To, "ZZZZZZZ9.999")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV41TFPrvNum) && (0==AV42TFPrvNum_To) ) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFPrvNum), "ZZZZZ9")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPrvNum_To_Description, "")), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFPrvNum_To), "ZZZZZ9")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFPrvNom_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFPrvNom_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFPrvNom)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFPrvNom, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV46TFPrdLote_Sel)==0) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFPrdLote_Sel, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFPrdLote)==0) )
         {
            h9V00( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFPrdLote, "")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV66TFValCod) && (0==AV67TFValCod_To) ) )
      {
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFValCod), "9")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV68TFValCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Validez", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9V00( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFValCod_To_Description, "")), 25, Gx_line+0, 187, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFValCod_To), "9")), 187, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9V00( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9V00( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 70, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 74, Gx_line+10, 114, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Familia", ""), 118, Gx_line+10, 158, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Uso", ""), 162, Gx_line+10, 202, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 206, Gx_line+10, 246, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Stock Minimo", ""), 250, Gx_line+10, 290, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Inicial", ""), 294, Gx_line+10, 335, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Piso", ""), 339, Gx_line+10, 380, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Total", ""), 384, Gx_line+10, 425, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reservas", ""), 429, Gx_line+10, 470, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Disponible", ""), 474, Gx_line+10, 515, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 519, Gx_line+10, 560, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor Stock", ""), 564, Gx_line+10, 605, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 609, Gx_line+10, 650, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 654, Gx_line+10, 696, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 700, Gx_line+10, 742, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 746, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV75Wcwwkp89ds_1_filterfulltext = AV16FilterFullText ;
      AV76Wcwwkp89ds_2_tfprdnum = AV27TFPrdNum ;
      AV77Wcwwkp89ds_3_tfprdnum_sel = AV28TFPrdNum_Sel ;
      AV78Wcwwkp89ds_4_tfprdnom = AV29TFPrdNom ;
      AV79Wcwwkp89ds_5_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV80Wcwwkp89ds_6_tftipprddsc = AV31TFTipPrdDsc ;
      AV81Wcwwkp89ds_7_tftipprddsc_sel = AV32TFTipPrdDsc_Sel ;
      AV82Wcwwkp89ds_8_tfprdrefprv = AV33TFPrdRefPrv ;
      AV83Wcwwkp89ds_9_tfprdrefprv_sel = AV34TFPrdRefPrv_Sel ;
      AV84Wcwwkp89ds_10_tfprdubicacion = AV35TFPrdUbicacion ;
      AV85Wcwwkp89ds_11_tfprdubicacion_sel = AV36TFPrdUbicacion_Sel ;
      AV86Wcwwkp89ds_12_tfprdstkminu = AV37TFPrdStkMinU ;
      AV87Wcwwkp89ds_13_tfprdstkminu_to = AV38TFPrdStkMinU_To ;
      AV88Wcwwkp89ds_14_tfprdpreact = AV39TFPrdPreAct ;
      AV89Wcwwkp89ds_15_tfprdpreact_to = AV40TFPrdPreAct_To ;
      AV90Wcwwkp89ds_16_tfprvnum = AV41TFPrvNum ;
      AV91Wcwwkp89ds_17_tfprvnum_to = AV42TFPrvNum_To ;
      AV92Wcwwkp89ds_18_tfprvnom = AV43TFPrvNom ;
      AV93Wcwwkp89ds_19_tfprvnom_sel = AV44TFPrvNom_Sel ;
      AV94Wcwwkp89ds_20_tfprdlote = AV45TFPrdLote ;
      AV95Wcwwkp89ds_21_tfprdlote_sel = AV46TFPrdLote_Sel ;
      AV96Wcwwkp89ds_22_tfvalcod = AV66TFValCod ;
      AV97Wcwwkp89ds_23_tfvalcod_to = AV67TFValCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Wcwwkp89ds_1_filterfulltext ,
                                           AV77Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV76Wcwwkp89ds_2_tfprdnum ,
                                           AV79Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV78Wcwwkp89ds_4_tfprdnom ,
                                           AV81Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV80Wcwwkp89ds_6_tftipprddsc ,
                                           AV83Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV82Wcwwkp89ds_8_tfprdrefprv ,
                                           AV85Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV84Wcwwkp89ds_10_tfprdubicacion ,
                                           AV86Wcwwkp89ds_12_tfprdstkminu ,
                                           AV87Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV88Wcwwkp89ds_14_tfprdpreact ,
                                           AV89Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV90Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV91Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV93Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV92Wcwwkp89ds_18_tfprvnom ,
                                           AV95Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV94Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV96Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV97Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV64ValCodfrom) ,
                                           Short.valueOf(AV65ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV10Emprcod ,
                                           AV11Prdnum ,
                                           A396EmprCod ,
                                           AV12Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV75Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV76Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV76Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV78Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV80Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV82Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV82Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV84Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV84Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV92Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV92Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV94Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV94Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P09V02 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11Prdnum, AV12Prdnum_to, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV75Wcwwkp89ds_1_filterfulltext, lV76Wcwwkp89ds_2_tfprdnum, AV77Wcwwkp89ds_3_tfprdnum_sel, lV78Wcwwkp89ds_4_tfprdnom, AV79Wcwwkp89ds_5_tfprdnom_sel, lV80Wcwwkp89ds_6_tftipprddsc, AV81Wcwwkp89ds_7_tftipprddsc_sel, lV82Wcwwkp89ds_8_tfprdrefprv, AV83Wcwwkp89ds_9_tfprdrefprv_sel, lV84Wcwwkp89ds_10_tfprdubicacion, AV85Wcwwkp89ds_11_tfprdubicacion_sel, AV86Wcwwkp89ds_12_tfprdstkminu, AV87Wcwwkp89ds_13_tfprdstkminu_to, AV88Wcwwkp89ds_14_tfprdpreact, AV89Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV90Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV91Wcwwkp89ds_17_tfprvnum_to), lV92Wcwwkp89ds_18_tfprvnom, AV93Wcwwkp89ds_19_tfprvnom_sel, lV94Wcwwkp89ds_20_tfprdlote, AV95Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV96Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV97Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV64ValCodfrom), Short.valueOf(AV65ValCodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6301TipPrdCod = P09V02_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09V02_n6301TipPrdCod[0] ;
         A396EmprCod = P09V02_A396EmprCod[0] ;
         A856ValCod = P09V02_A856ValCod[0] ;
         A10881PrdLote = P09V02_A10881PrdLote[0] ;
         A794PrvNom = P09V02_A794PrvNom[0] ;
         n794PrvNom = P09V02_n794PrvNom[0] ;
         A795PrvNum = P09V02_A795PrvNum[0] ;
         A724PrdPreAct = P09V02_A724PrdPreAct[0] ;
         A732PrdStkMinU = P09V02_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P09V02_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P09V02_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P09V02_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09V02_n6302TipPrdDsc[0] ;
         A718PrdNom = P09V02_A718PrdNom[0] ;
         A719PrdNum = P09V02_A719PrdNum[0] ;
         A704PrdExiAlm = P09V02_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09V02_A685PrdCanRes[0] ;
         A6302TipPrdDsc = P09V02_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09V02_n6302TipPrdDsc[0] ;
         A794PrvNom = P09V02_A794PrvNom[0] ;
         n794PrvNom = P09V02_n794PrvNom[0] ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal5[0] = AV17CantInv ;
         GXv_decimal6[0] = AV98Compras ;
         GXv_decimal7[0] = AV99Consumos ;
         GXv_decimal8[0] = AV100Compras2 ;
         GXv_decimal9[0] = AV101Consumos2 ;
         GXv_char10[0] = AV62obsp ;
         new app.pupq010(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_char10) ;
         wcwwkp89exportreport_impl.this.A396EmprCod = GXv_char2[0] ;
         wcwwkp89exportreport_impl.this.A719PrdNum = GXv_char3[0] ;
         wcwwkp89exportreport_impl.this.A719PrdNum = GXv_char4[0] ;
         wcwwkp89exportreport_impl.this.AV17CantInv = GXv_decimal5[0] ;
         wcwwkp89exportreport_impl.this.AV98Compras = GXv_decimal6[0] ;
         wcwwkp89exportreport_impl.this.AV99Consumos = GXv_decimal7[0] ;
         wcwwkp89exportreport_impl.this.AV100Compras2 = GXv_decimal8[0] ;
         wcwwkp89exportreport_impl.this.AV101Consumos2 = GXv_decimal9[0] ;
         wcwwkp89exportreport_impl.this.AV62obsp = GXv_char10[0] ;
         GXv_char10[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal9[0] = AV102Cantres ;
         GXv_decimal8[0] = AV103Cantpesada ;
         GXv_decimal7[0] = AV104Cantpdte ;
         GXv_char3[0] = AV63InciCPEDID ;
         new app.pprc175(remoteHandle, context).execute( GXv_char10, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_char3) ;
         wcwwkp89exportreport_impl.this.A396EmprCod = GXv_char10[0] ;
         wcwwkp89exportreport_impl.this.A719PrdNum = GXv_char4[0] ;
         wcwwkp89exportreport_impl.this.AV102Cantres = GXv_decimal9[0] ;
         wcwwkp89exportreport_impl.this.AV103Cantpesada = GXv_decimal8[0] ;
         wcwwkp89exportreport_impl.this.AV104Cantpdte = GXv_decimal7[0] ;
         wcwwkp89exportreport_impl.this.AV63InciCPEDID = GXv_char3[0] ;
         AV18PrdExiAlm = A704PrdExiAlm.subtract(AV103Cantpesada) ;
         AV19stockTotal = AV18PrdExiAlm.add(AV103Cantpesada) ;
         AV20PrdCanRes = A685PrdCanRes.subtract(AV103Cantpesada) ;
         AV21StockDisponible = A704PrdExiAlm.subtract(AV20PrdCanRes) ;
         AV22valor0 = (AV18PrdExiAlm.add(AV103Cantpesada)).multiply(A724PrdPreAct) ;
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
         h9V00( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 70, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 74, Gx_line+10, 114, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6302TipPrdDsc, "")), 118, Gx_line+10, 158, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), 162, Gx_line+10, 202, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13457PrdUbicaci, "")), 206, Gx_line+10, 246, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A732PrdStkMinU, "ZZZZ9.99")), 250, Gx_line+10, 290, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17CantInv, "ZZZZZZZZ9.99")), 294, Gx_line+10, 335, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18PrdExiAlm, "ZZZZZZ9.9999")), 339, Gx_line+10, 380, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19stockTotal, "ZZZZZZZZ9.99")), 384, Gx_line+10, 425, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20PrdCanRes, "ZZZZZZ9.9999")), 429, Gx_line+10, 470, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21StockDisponible, "ZZZZZZZZ9.99")), 474, Gx_line+10, 515, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 519, Gx_line+10, 560, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22valor0, "ZZZZZZ9.99")), 564, Gx_line+10, 605, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 609, Gx_line+10, 650, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 654, Gx_line+10, 696, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10881PrdLote, "")), 700, Gx_line+10, 742, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9")), 746, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV23Session.getValue("WCWWkp89GridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWWkp89GridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("WCWWkp89GridState"), null, null);
      }
      AV14OrderedBy = AV25GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV15OrderedDsc = AV25GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV27TFPrdNum = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV28TFPrdNum_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV29TFPrdNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV30TFPrdNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV31TFTipPrdDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV32TFTipPrdDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV33TFPrdRefPrv = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV34TFPrdRefPrv_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION") == 0 )
         {
            AV35TFPrdUbicacion = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION_SEL") == 0 )
         {
            AV36TFPrdUbicacion_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV37TFPrdStkMinU = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFPrdStkMinU_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV39TFPrdPreAct = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFPrdPreAct_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV41TFPrvNum = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFPrvNum_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV43TFPrvNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV44TFPrvNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE") == 0 )
         {
            AV45TFPrdLote = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE_SEL") == 0 )
         {
            AV46TFPrdLote_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV66TFValCod = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFValCod_To = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV11Prdnum = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV12Prdnum_to = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODFROM") == 0 )
         {
            AV64ValCodfrom = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODTO") == 0 )
         {
            AV65ValCodto = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SELECCION") == 0 )
         {
            AV13Seleccion = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
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

   public void h9V00( boolean bFoot ,
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
               AV58PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV55DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
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
            AV60Title = AV71Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV60Title = "" ;
      AV16FilterFullText = "" ;
      AV28TFPrdNum_Sel = "" ;
      AV27TFPrdNum = "" ;
      AV30TFPrdNom_Sel = "" ;
      AV29TFPrdNom = "" ;
      AV32TFTipPrdDsc_Sel = "" ;
      AV31TFTipPrdDsc = "" ;
      AV34TFPrdRefPrv_Sel = "" ;
      AV33TFPrdRefPrv = "" ;
      AV36TFPrdUbicacion_Sel = "" ;
      AV35TFPrdUbicacion = "" ;
      AV37TFPrdStkMinU = DecimalUtil.ZERO ;
      AV38TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV47TFPrdStkMinU_To_Description = "" ;
      AV39TFPrdPreAct = DecimalUtil.ZERO ;
      AV40TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV48TFPrdPreAct_To_Description = "" ;
      AV49TFPrvNum_To_Description = "" ;
      AV44TFPrvNom_Sel = "" ;
      AV43TFPrvNom = "" ;
      AV46TFPrdLote_Sel = "" ;
      AV45TFPrdLote = "" ;
      AV68TFValCod_To_Description = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A6302TipPrdDsc = "" ;
      A728PrdRefPrv = "" ;
      A13457PrdUbicaci = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A10881PrdLote = "" ;
      AV75Wcwwkp89ds_1_filterfulltext = "" ;
      AV76Wcwwkp89ds_2_tfprdnum = "" ;
      AV77Wcwwkp89ds_3_tfprdnum_sel = "" ;
      AV78Wcwwkp89ds_4_tfprdnom = "" ;
      AV79Wcwwkp89ds_5_tfprdnom_sel = "" ;
      AV80Wcwwkp89ds_6_tftipprddsc = "" ;
      AV81Wcwwkp89ds_7_tftipprddsc_sel = "" ;
      AV82Wcwwkp89ds_8_tfprdrefprv = "" ;
      AV83Wcwwkp89ds_9_tfprdrefprv_sel = "" ;
      AV84Wcwwkp89ds_10_tfprdubicacion = "" ;
      AV85Wcwwkp89ds_11_tfprdubicacion_sel = "" ;
      AV86Wcwwkp89ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV87Wcwwkp89ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV88Wcwwkp89ds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV89Wcwwkp89ds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV92Wcwwkp89ds_18_tfprvnom = "" ;
      AV93Wcwwkp89ds_19_tfprvnom_sel = "" ;
      AV94Wcwwkp89ds_20_tfprdlote = "" ;
      AV95Wcwwkp89ds_21_tfprdlote_sel = "" ;
      scmdbuf = "" ;
      lV75Wcwwkp89ds_1_filterfulltext = "" ;
      lV76Wcwwkp89ds_2_tfprdnum = "" ;
      lV78Wcwwkp89ds_4_tfprdnom = "" ;
      lV80Wcwwkp89ds_6_tftipprddsc = "" ;
      lV82Wcwwkp89ds_8_tfprdrefprv = "" ;
      lV84Wcwwkp89ds_10_tfprdubicacion = "" ;
      lV92Wcwwkp89ds_18_tfprvnom = "" ;
      lV94Wcwwkp89ds_20_tfprdlote = "" ;
      AV10Emprcod = "" ;
      AV11Prdnum = "" ;
      AV12Prdnum_to = "" ;
      P09V02_A6301TipPrdCod = new short[1] ;
      P09V02_n6301TipPrdCod = new boolean[] {false} ;
      P09V02_A396EmprCod = new String[] {""} ;
      P09V02_A856ValCod = new byte[1] ;
      P09V02_A10881PrdLote = new String[] {""} ;
      P09V02_A794PrvNom = new String[] {""} ;
      P09V02_n794PrvNom = new boolean[] {false} ;
      P09V02_A795PrvNum = new int[1] ;
      P09V02_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V02_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V02_A13457PrdUbicaci = new String[] {""} ;
      P09V02_A728PrdRefPrv = new String[] {""} ;
      P09V02_A6302TipPrdDsc = new String[] {""} ;
      P09V02_n6302TipPrdDsc = new boolean[] {false} ;
      P09V02_A718PrdNom = new String[] {""} ;
      P09V02_A719PrdNum = new String[] {""} ;
      P09V02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V02_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char2 = new String[1] ;
      AV17CantInv = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV98Compras = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV99Consumos = DecimalUtil.ZERO ;
      AV100Compras2 = DecimalUtil.ZERO ;
      AV101Consumos2 = DecimalUtil.ZERO ;
      AV62obsp = "" ;
      GXv_char10 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV102Cantres = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV103Cantpesada = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV104Cantpdte = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV63InciCPEDID = "" ;
      GXv_char3 = new String[1] ;
      AV18PrdExiAlm = DecimalUtil.ZERO ;
      AV19stockTotal = DecimalUtil.ZERO ;
      AV20PrdCanRes = DecimalUtil.ZERO ;
      AV21StockDisponible = DecimalUtil.ZERO ;
      AV22valor0 = DecimalUtil.ZERO ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV58PageInfo = "" ;
      AV55DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV71Pgmdesc = "" ;
      AV53AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp89exportreport__default(),
         new Object[] {
             new Object[] {
            P09V02_A6301TipPrdCod, P09V02_n6301TipPrdCod, P09V02_A396EmprCod, P09V02_A856ValCod, P09V02_A10881PrdLote, P09V02_A794PrvNom, P09V02_n794PrvNom, P09V02_A795PrvNum, P09V02_A724PrdPreAct, P09V02_A732PrdStkMinU,
            P09V02_A13457PrdUbicaci, P09V02_A728PrdRefPrv, P09V02_A6302TipPrdDsc, P09V02_n6302TipPrdDsc, P09V02_A718PrdNom, P09V02_A719PrdNum, P09V02_A704PrdExiAlm, P09V02_A685PrdCanRes
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV71Pgmdesc = httpContext.getMessage( "WCWWkp89 Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV71Pgmdesc = httpContext.getMessage( "WCWWkp89 Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV66TFValCod ;
   private byte AV67TFValCod_To ;
   private byte A856ValCod ;
   private byte AV96Wcwwkp89ds_22_tfvalcod ;
   private byte AV97Wcwwkp89ds_23_tfvalcod_to ;
   private byte AV13Seleccion ;
   private short gxcookieaux ;
   private short AV64ValCodfrom ;
   private short AV65ValCodto ;
   private short AV14OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV41TFPrvNum ;
   private int AV42TFPrvNum_To ;
   private int A795PrvNum ;
   private int AV90Wcwwkp89ds_16_tfprvnum ;
   private int AV91Wcwwkp89ds_17_tfprvnum_to ;
   private int AV105GXV1 ;
   private java.math.BigDecimal AV37TFPrdStkMinU ;
   private java.math.BigDecimal AV38TFPrdStkMinU_To ;
   private java.math.BigDecimal AV39TFPrdPreAct ;
   private java.math.BigDecimal AV40TFPrdPreAct_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV86Wcwwkp89ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV87Wcwwkp89ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV88Wcwwkp89ds_14_tfprdpreact ;
   private java.math.BigDecimal AV89Wcwwkp89ds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV17CantInv ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV98Compras ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV99Consumos ;
   private java.math.BigDecimal AV100Compras2 ;
   private java.math.BigDecimal AV101Consumos2 ;
   private java.math.BigDecimal AV102Cantres ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV103Cantpesada ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV104Cantpdte ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV18PrdExiAlm ;
   private java.math.BigDecimal AV19stockTotal ;
   private java.math.BigDecimal AV20PrdCanRes ;
   private java.math.BigDecimal AV21StockDisponible ;
   private java.math.BigDecimal AV22valor0 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV28TFPrdNum_Sel ;
   private String AV27TFPrdNum ;
   private String AV30TFPrdNom_Sel ;
   private String AV29TFPrdNom ;
   private String AV32TFTipPrdDsc_Sel ;
   private String AV31TFTipPrdDsc ;
   private String AV34TFPrdRefPrv_Sel ;
   private String AV33TFPrdRefPrv ;
   private String AV36TFPrdUbicacion_Sel ;
   private String AV35TFPrdUbicacion ;
   private String AV44TFPrvNom_Sel ;
   private String AV43TFPrvNom ;
   private String AV46TFPrdLote_Sel ;
   private String AV45TFPrdLote ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A728PrdRefPrv ;
   private String A13457PrdUbicaci ;
   private String A794PrvNom ;
   private String A10881PrdLote ;
   private String AV76Wcwwkp89ds_2_tfprdnum ;
   private String AV77Wcwwkp89ds_3_tfprdnum_sel ;
   private String AV78Wcwwkp89ds_4_tfprdnom ;
   private String AV79Wcwwkp89ds_5_tfprdnom_sel ;
   private String AV80Wcwwkp89ds_6_tftipprddsc ;
   private String AV81Wcwwkp89ds_7_tftipprddsc_sel ;
   private String AV82Wcwwkp89ds_8_tfprdrefprv ;
   private String AV83Wcwwkp89ds_9_tfprdrefprv_sel ;
   private String AV84Wcwwkp89ds_10_tfprdubicacion ;
   private String AV85Wcwwkp89ds_11_tfprdubicacion_sel ;
   private String AV92Wcwwkp89ds_18_tfprvnom ;
   private String AV93Wcwwkp89ds_19_tfprvnom_sel ;
   private String AV94Wcwwkp89ds_20_tfprdlote ;
   private String AV95Wcwwkp89ds_21_tfprdlote_sel ;
   private String scmdbuf ;
   private String lV76Wcwwkp89ds_2_tfprdnum ;
   private String lV78Wcwwkp89ds_4_tfprdnom ;
   private String lV80Wcwwkp89ds_6_tftipprddsc ;
   private String lV82Wcwwkp89ds_8_tfprdrefprv ;
   private String lV84Wcwwkp89ds_10_tfprdubicacion ;
   private String lV92Wcwwkp89ds_18_tfprvnom ;
   private String lV94Wcwwkp89ds_20_tfprdlote ;
   private String AV10Emprcod ;
   private String AV11Prdnum ;
   private String AV12Prdnum_to ;
   private String GXv_char2[] ;
   private String AV62obsp ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String AV63InciCPEDID ;
   private String GXv_char3[] ;
   private String AV71Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV15OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n6302TipPrdDsc ;
   private String AV60Title ;
   private String AV16FilterFullText ;
   private String AV47TFPrdStkMinU_To_Description ;
   private String AV48TFPrdPreAct_To_Description ;
   private String AV49TFPrvNum_To_Description ;
   private String AV68TFValCod_To_Description ;
   private String AV75Wcwwkp89ds_1_filterfulltext ;
   private String lV75Wcwwkp89ds_1_filterfulltext ;
   private String AV58PageInfo ;
   private String AV55DateInfo ;
   private String AV53AppName ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private IDataStoreProvider pr_default ;
   private short[] P09V02_A6301TipPrdCod ;
   private boolean[] P09V02_n6301TipPrdCod ;
   private String[] P09V02_A396EmprCod ;
   private byte[] P09V02_A856ValCod ;
   private String[] P09V02_A10881PrdLote ;
   private String[] P09V02_A794PrvNom ;
   private boolean[] P09V02_n794PrvNom ;
   private int[] P09V02_A795PrvNum ;
   private java.math.BigDecimal[] P09V02_A724PrdPreAct ;
   private java.math.BigDecimal[] P09V02_A732PrdStkMinU ;
   private String[] P09V02_A13457PrdUbicaci ;
   private String[] P09V02_A728PrdRefPrv ;
   private String[] P09V02_A6302TipPrdDsc ;
   private boolean[] P09V02_n6302TipPrdDsc ;
   private String[] P09V02_A718PrdNom ;
   private String[] P09V02_A719PrdNum ;
   private java.math.BigDecimal[] P09V02_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09V02_A685PrdCanRes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class wcwwkp89exportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09V02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcwwkp89ds_1_filterfulltext ,
                                          String AV77Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV76Wcwwkp89ds_2_tfprdnum ,
                                          String AV79Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV78Wcwwkp89ds_4_tfprdnom ,
                                          String AV81Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV80Wcwwkp89ds_6_tftipprddsc ,
                                          String AV83Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV82Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV85Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV84Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV86Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV87Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV88Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV89Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV90Wcwwkp89ds_16_tfprvnum ,
                                          int AV91Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV93Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV92Wcwwkp89ds_18_tfprvnom ,
                                          String AV95Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV94Wcwwkp89ds_20_tfprdlote ,
                                          byte AV96Wcwwkp89ds_22_tfvalcod ,
                                          byte AV97Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV64ValCodfrom ,
                                          short AV65ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV10Emprcod ,
                                          String AV11Prdnum ,
                                          String A396EmprCod ,
                                          String AV12Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[38];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV75Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV82Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV84Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV91Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV92Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV64ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV65ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipPrdDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUbicaci DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdStkMinU DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdLote" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdLote DESC" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ValCod" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ValCod DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09V02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
      }
   }

}

