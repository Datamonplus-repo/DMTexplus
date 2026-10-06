package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidowwexportreport_impl extends GXWebReport
{
   public nwdpalmacentejidowwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV49Title = httpContext.getMessage( "Lista de Nw DPAlmacen Tejido", "") ;
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
         h8E40( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV55FilterFullText)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55FilterFullText, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFEmprCod_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod_Sel, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV16TFEmprCod)==0) )
         {
            h8E40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16TFEmprCod, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV18TFDisCod) && (0==AV19TFDisCod_To) ) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFDisCod), "ZZZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFDisCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Disposicion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFDisCod_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFDisCod_To), "ZZZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFDisDes_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desglose", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFDisDes_Sel, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFCliCod) && (0==AV23TFCliCod_To) ) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFCliCod_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod_To), "ZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFDisArtCod_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFDisArtCod_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFDisArtCod)==0) )
         {
            h8E40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFDisArtCod, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV26TFDisTotRec) && (0==AV27TFDisTotRec_To) ) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Recepciones", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFDisTotRec), "ZZZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFDisTotRec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Recepciones", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFDisTotRec_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFDisTotRec_To), "ZZZZZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFDisUniMed_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Medida", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFDisUniMed_Sel, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFDisUniMed)==0) )
         {
            h8E40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidades Medida", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFDisUniMed, "@!")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFDisLoc_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDisLoc_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFDisLoc)==0) )
         {
            h8E40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFDisLoc, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFDisCliNum_Sel)==0) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion Cliente", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDisCliNum_Sel, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFDisCliNum)==0) )
         {
            h8E40( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion Cliente", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFDisCliNum, "")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV34TFDisCanRec) && (0==AV35TFDisCanRec_To) ) )
      {
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclamaciones", ""), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFDisCanRec), "ZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFDisCanRec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reclamaciones", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8E40( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFDisCanRec_To_Description, "")), 25, Gx_line+0, 164, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFDisCanRec_To), "ZZZ9")), 164, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8E40( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8E40( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 95, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion", ""), 99, Gx_line+10, 164, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desglose", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 237, Gx_line+10, 302, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 306, Gx_line+10, 437, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Recepciones", ""), 441, Gx_line+10, 507, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Medida", ""), 511, Gx_line+10, 577, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 581, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion Cliente", ""), 651, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclamaciones", ""), 721, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV67Nwdpalmacentejidowwds_1_filterfulltext = AV55FilterFullText ;
      AV68Nwdpalmacentejidowwds_2_tfemprcod = AV16TFEmprCod ;
      AV69Nwdpalmacentejidowwds_3_tfemprcod_sel = AV17TFEmprCod_Sel ;
      AV70Nwdpalmacentejidowwds_4_tfdiscod = AV18TFDisCod ;
      AV71Nwdpalmacentejidowwds_5_tfdiscod_to = AV19TFDisCod_To ;
      AV72Nwdpalmacentejidowwds_6_tfdisdes_sel = AV21TFDisDes_Sel ;
      AV73Nwdpalmacentejidowwds_7_tfclicod = AV22TFCliCod ;
      AV74Nwdpalmacentejidowwds_8_tfclicod_to = AV23TFCliCod_To ;
      AV75Nwdpalmacentejidowwds_9_tfdisartcod = AV24TFDisArtCod ;
      AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV25TFDisArtCod_Sel ;
      AV77Nwdpalmacentejidowwds_11_tfdistotrec = AV26TFDisTotRec ;
      AV78Nwdpalmacentejidowwds_12_tfdistotrec_to = AV27TFDisTotRec_To ;
      AV79Nwdpalmacentejidowwds_13_tfdisunimed = AV28TFDisUniMed ;
      AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV29TFDisUniMed_Sel ;
      AV81Nwdpalmacentejidowwds_15_tfdisloc = AV30TFDisLoc ;
      AV82Nwdpalmacentejidowwds_16_tfdisloc_sel = AV31TFDisLoc_Sel ;
      AV83Nwdpalmacentejidowwds_17_tfdisclinum = AV32TFDisCliNum ;
      AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV33TFDisCliNum_Sel ;
      AV85Nwdpalmacentejidowwds_19_tfdiscanrec = AV34TFDisCanRec ;
      AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV35TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV68Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV70Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV71Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV72Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV73Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV74Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV75Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV77Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV78Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV79Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV82Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV81Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV83Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV67Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV85Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV68Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV75Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV75Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV79Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV79Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV81Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV81Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV83Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV83Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E44 */
      pr_default.execute(0, new Object[] {AV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, lV67Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV85Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV85Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV68Nwdpalmacentejidowwds_2_tfemprcod, AV69Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV70Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV71Nwdpalmacentejidowwds_5_tfdiscod_to), AV72Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV73Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV74Nwdpalmacentejidowwds_8_tfclicod_to), lV75Nwdpalmacentejidowwds_9_tfdisartcod, AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV77Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV78Nwdpalmacentejidowwds_12_tfdistotrec_to), lV79Nwdpalmacentejidowwds_13_tfdisunimed, AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV81Nwdpalmacentejidowwds_15_tfdisloc, AV82Nwdpalmacentejidowwds_16_tfdisloc_sel, lV83Nwdpalmacentejidowwds_17_tfdisclinum, AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A360DisCliNum = P08E44_A360DisCliNum[0] ;
         A1430DisLoc = P08E44_A1430DisLoc[0] ;
         A392DisUniMed = P08E44_A392DisUniMed[0] ;
         A335DisArtCod = P08E44_A335DisArtCod[0] ;
         A252CliCod = P08E44_A252CliCod[0] ;
         A365DisDes = P08E44_A365DisDes[0] ;
         A361DisCod = P08E44_A361DisCod[0] ;
         A396EmprCod = P08E44_A396EmprCod[0] ;
         A13732DisCanRec = P08E44_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E44_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E44_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E44_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E44_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E44_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E44_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E44_n13733DisTotRec[0] ;
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
         h8E40( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 95, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 99, Gx_line+10, 164, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A365DisDes, "@!")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 237, Gx_line+10, 302, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 306, Gx_line+10, 437, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13733DisTotRec), "ZZZZZZZ9")), 441, Gx_line+10, 507, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), 511, Gx_line+10, 577, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1430DisLoc, "")), 581, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 651, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9")), 721, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV12Session.getValue("NwDPAlmacenTejidoWWGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPAlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("NwDPAlmacenTejidoWWGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV16TFEmprCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV17TFEmprCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV18TFDisCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFDisCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDES_SEL") == 0 )
         {
            AV21TFDisDes_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV22TFCliCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFCliCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV24TFDisArtCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV25TFDisArtCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTOTREC") == 0 )
         {
            AV26TFDisTotRec = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFDisTotRec_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV28TFDisUniMed = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV29TFDisUniMed_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC") == 0 )
         {
            AV30TFDisLoc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC_SEL") == 0 )
         {
            AV31TFDisLoc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV32TFDisCliNum = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV33TFDisCliNum_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV34TFDisCanRec = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDisCanRec_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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

   public void h8E40( boolean bFoot ,
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
               AV46PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV42DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV49Title = AV63Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV49Title = "" ;
      AV55FilterFullText = "" ;
      AV17TFEmprCod_Sel = "" ;
      AV16TFEmprCod = "" ;
      AV36TFDisCod_To_Description = "" ;
      AV21TFDisDes_Sel = "" ;
      AV37TFCliCod_To_Description = "" ;
      AV25TFDisArtCod_Sel = "" ;
      AV24TFDisArtCod = "" ;
      AV38TFDisTotRec_To_Description = "" ;
      AV29TFDisUniMed_Sel = "" ;
      AV28TFDisUniMed = "" ;
      AV31TFDisLoc_Sel = "" ;
      AV30TFDisLoc = "" ;
      AV33TFDisCliNum_Sel = "" ;
      AV32TFDisCliNum = "" ;
      AV39TFDisCanRec_To_Description = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      AV67Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      AV68Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      AV69Nwdpalmacentejidowwds_3_tfemprcod_sel = "" ;
      AV72Nwdpalmacentejidowwds_6_tfdisdes_sel = "" ;
      AV75Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel = "" ;
      AV79Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel = "" ;
      AV81Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      AV82Nwdpalmacentejidowwds_16_tfdisloc_sel = "" ;
      AV83Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel = "" ;
      lV67Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV68Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      lV75Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      lV79Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      lV81Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      lV83Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      P08E44_A360DisCliNum = new String[] {""} ;
      P08E44_A1430DisLoc = new String[] {""} ;
      P08E44_A392DisUniMed = new String[] {""} ;
      P08E44_A335DisArtCod = new String[] {""} ;
      P08E44_A252CliCod = new int[1] ;
      P08E44_A365DisDes = new String[] {""} ;
      P08E44_A361DisCod = new int[1] ;
      P08E44_A396EmprCod = new String[] {""} ;
      P08E44_A13732DisCanRec = new short[1] ;
      P08E44_n13732DisCanRec = new boolean[] {false} ;
      P08E44_A13733DisTotRec = new int[1] ;
      P08E44_n13733DisTotRec = new boolean[] {false} ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV63Pgmdesc = "" ;
      AV57AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidowwexportreport__default(),
         new Object[] {
             new Object[] {
            P08E44_A360DisCliNum, P08E44_A1430DisLoc, P08E44_A392DisUniMed, P08E44_A335DisArtCod, P08E44_A252CliCod, P08E44_A365DisDes, P08E44_A361DisCod, P08E44_A396EmprCod, P08E44_A13732DisCanRec, P08E44_n13732DisCanRec,
            P08E44_A13733DisTotRec, P08E44_n13733DisTotRec
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV63Pgmdesc = httpContext.getMessage( "Nw DPAlmacen Tejido WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV63Pgmdesc = httpContext.getMessage( "Nw DPAlmacen Tejido WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV34TFDisCanRec ;
   private short AV35TFDisCanRec_To ;
   private short A13732DisCanRec ;
   private short AV85Nwdpalmacentejidowwds_19_tfdiscanrec ;
   private short AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFDisCod ;
   private int AV19TFDisCod_To ;
   private int AV22TFCliCod ;
   private int AV23TFCliCod_To ;
   private int AV26TFDisTotRec ;
   private int AV27TFDisTotRec_To ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A13733DisTotRec ;
   private int AV70Nwdpalmacentejidowwds_4_tfdiscod ;
   private int AV71Nwdpalmacentejidowwds_5_tfdiscod_to ;
   private int AV73Nwdpalmacentejidowwds_7_tfclicod ;
   private int AV74Nwdpalmacentejidowwds_8_tfclicod_to ;
   private int AV77Nwdpalmacentejidowwds_11_tfdistotrec ;
   private int AV78Nwdpalmacentejidowwds_12_tfdistotrec_to ;
   private int AV87GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV17TFEmprCod_Sel ;
   private String AV16TFEmprCod ;
   private String AV21TFDisDes_Sel ;
   private String AV25TFDisArtCod_Sel ;
   private String AV24TFDisArtCod ;
   private String AV29TFDisUniMed_Sel ;
   private String AV28TFDisUniMed ;
   private String AV31TFDisLoc_Sel ;
   private String AV30TFDisLoc ;
   private String AV33TFDisCliNum_Sel ;
   private String AV32TFDisCliNum ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A335DisArtCod ;
   private String A392DisUniMed ;
   private String A1430DisLoc ;
   private String A360DisCliNum ;
   private String AV68Nwdpalmacentejidowwds_2_tfemprcod ;
   private String AV69Nwdpalmacentejidowwds_3_tfemprcod_sel ;
   private String AV72Nwdpalmacentejidowwds_6_tfdisdes_sel ;
   private String AV75Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel ;
   private String AV79Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel ;
   private String AV81Nwdpalmacentejidowwds_15_tfdisloc ;
   private String AV82Nwdpalmacentejidowwds_16_tfdisloc_sel ;
   private String AV83Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel ;
   private String scmdbuf ;
   private String lV68Nwdpalmacentejidowwds_2_tfemprcod ;
   private String lV75Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String lV79Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String lV81Nwdpalmacentejidowwds_15_tfdisloc ;
   private String lV83Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV63Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n13732DisCanRec ;
   private boolean n13733DisTotRec ;
   private String AV49Title ;
   private String AV55FilterFullText ;
   private String AV36TFDisCod_To_Description ;
   private String AV37TFCliCod_To_Description ;
   private String AV38TFDisTotRec_To_Description ;
   private String AV39TFDisCanRec_To_Description ;
   private String AV67Nwdpalmacentejidowwds_1_filterfulltext ;
   private String lV67Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV46PageInfo ;
   private String AV42DateInfo ;
   private String AV57AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08E44_A360DisCliNum ;
   private String[] P08E44_A1430DisLoc ;
   private String[] P08E44_A392DisUniMed ;
   private String[] P08E44_A335DisArtCod ;
   private int[] P08E44_A252CliCod ;
   private String[] P08E44_A365DisDes ;
   private int[] P08E44_A361DisCod ;
   private String[] P08E44_A396EmprCod ;
   private short[] P08E44_A13732DisCanRec ;
   private boolean[] P08E44_n13732DisCanRec ;
   private int[] P08E44_A13733DisTotRec ;
   private boolean[] P08E44_n13733DisTotRec ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class nwdpalmacentejidowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08E44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV68Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV70Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV71Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV72Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV73Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV74Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV75Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV77Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV78Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV79Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV82Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV81Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV83Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV67Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV85Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV86Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[31];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV75Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV79Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV81Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV83Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisDes" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisDes DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisLoc" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisLoc DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
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
                  return conditional_P08E44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               return;
      }
   }

}

