package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_verproductospesadosexportreport_impl extends GXWebReport
{
   public cierrerecetastinte_verproductospesadosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53Title = httpContext.getMessage( "Lista de Tabla LRECET", "") ;
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
         h94V0( true, 0) ;
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
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFRecLinPro) && (0==AV18TFRecLinPro_To) ) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("#", 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFRecLinPro), "Z9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFRecLinPro_To_Description = GXutil.format( "%1 (%2)", "#", httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFRecLinPro_To_Description, "")), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFRecLinPro_To), "Z9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFRecLin) && (0==AV20TFRecLin_To) ) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("##", 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFRecLin), "ZZZ9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFRecLin_To_Description = GXutil.format( "%1 (%2)", "##", httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFRecLin_To_Description, "")), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFRecLin_To), "ZZZ9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFRecPrdNum_Sel)==0) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Producto", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFRecPrdNum_Sel, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFRecPrdNum)==0) )
         {
            h94V0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Producto", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFRecPrdNum, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV24TFRecPrdDsc_Sel)==0) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFRecPrdDsc_Sel, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFRecPrdDsc)==0) )
         {
            h94V0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFRecPrdDsc, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV25TFForPrdUMe) && (0==AV26TFForPrdUMe_To) ) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad Medida", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFForPrdUMe), "9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFForPrdUMe_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidad Medida", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFForPrdUMe_To_Description, "")), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFForPrdUMe_To), "9")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFForPrdDsc_Sel)==0) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Unidades Medida", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFForPrdDsc_Sel, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFForPrdDsc)==0) )
         {
            h94V0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Unidades Medida", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFForPrdDsc, "")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPrdCant_To)==0) ) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFPrdCant, "ZZZZZZ9.999")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFPrdCant_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrdCant_To_Description, "")), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFPrdCant_To, "ZZZZZZ9.999")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPrdCanFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdCanFin_To)==0) ) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Teorica", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFPrdCanFin, "ZZZZZZ9.999")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFPrdCanFin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Teorica", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFPrdCanFin_To_Description, "")), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFPrdCanFin_To, "ZZZZZZ9.999")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV34TFRecLinUsr_Sel)==0) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFRecLinUsr_Sel, "@!")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFRecLinUsr)==0) )
         {
            h94V0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFRecLinUsr, "@!")), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV35TFRecPesFec) )
      {
         h94V0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 180, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV35TFRecPesFec, "99/99/99 99:99"), 180, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h94V0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h94V0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("#", 30, Gx_line+10, 95, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText("##", 99, Gx_line+10, 164, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Producto", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 237, Gx_line+10, 367, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad Medida", ""), 371, Gx_line+10, 437, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Unidades Medida", ""), 441, Gx_line+10, 507, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 511, Gx_line+10, 577, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Teorica", ""), 581, Gx_line+10, 647, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 651, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 721, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV12FilterFullText ;
      AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV17TFRecLinPro ;
      AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV18TFRecLinPro_To ;
      AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV19TFRecLin ;
      AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV20TFRecLin_To ;
      AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV21TFRecPrdNum ;
      AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV22TFRecPrdNum_Sel ;
      AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV23TFRecPrdDsc ;
      AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV24TFRecPrdDsc_Sel ;
      AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV25TFForPrdUMe ;
      AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV26TFForPrdUMe_To ;
      AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV27TFForPrdDsc ;
      AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV28TFForPrdDsc_Sel ;
      AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV29TFPrdCant ;
      AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV30TFPrdCant_To ;
      AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV31TFPrdCanFin ;
      AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV32TFPrdCanFin_To ;
      AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV33TFRecLinUsr ;
      AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV34TFRecLinUsr_Sel ;
      AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV35TFRecPesFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094V2 */
      pr_default.execute(0, new Object[] {lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094V2_A396EmprCod[0] ;
         A4577RecPesFec = P094V2_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094V2_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094V2_A683PrdCanFin[0] ;
         A686PrdCant = P094V2_A686PrdCant[0] ;
         A488ForPrdDsc = P094V2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094V2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094V2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094V2_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P094V2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P094V2_A872RecPrdNum[0] ;
         A811RecLin = P094V2_A811RecLin[0] ;
         A1273RecLinPro = P094V2_A1273RecLinPro[0] ;
         A129BarCod = P094V2_A129BarCod[0] ;
         A132BarCodReo = P094V2_A132BarCodReo[0] ;
         A130BarCodPar = P094V2_A130BarCodPar[0] ;
         A2804RecLinMaq = P094V2_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094V2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094V2_n488ForPrdDsc[0] ;
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
         h94V0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")), 30, Gx_line+10, 95, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")), 99, Gx_line+10, 164, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 237, Gx_line+10, 367, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")), 371, Gx_line+10, 437, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 441, Gx_line+10, 507, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")), 511, Gx_line+10, 577, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A683PrdCanFin, "ZZZZZZ9.999")), 581, Gx_line+10, 647, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")), 651, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4577RecPesFec, "99/99/99 99:99"), 721, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV17TFRecLinPro = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFRecLinPro_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV19TFRecLin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFRecLin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV21TFRecPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV22TFRecPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV23TFRecPrdDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV24TFRecPrdDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV25TFForPrdUMe = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFForPrdUMe_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV27TFForPrdDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV28TFForPrdDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV29TFPrdCant = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV30TFPrdCant_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV31TFPrdCanFin = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFPrdCanFin_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV33TFRecLinUsr = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV34TFRecLinUsr_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV35TFRecPesFec = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
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

   public void h94V0( boolean bFoot ,
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
               AV51PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV48DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV53Title = AV57Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV12FilterFullText = "" ;
      AV37TFRecLinPro_To_Description = "" ;
      AV38TFRecLin_To_Description = "" ;
      AV22TFRecPrdNum_Sel = "" ;
      AV21TFRecPrdNum = "" ;
      AV24TFRecPrdDsc_Sel = "" ;
      AV23TFRecPrdDsc = "" ;
      AV39TFForPrdUMe_To_Description = "" ;
      AV28TFForPrdDsc_Sel = "" ;
      AV27TFForPrdDsc = "" ;
      AV29TFPrdCant = DecimalUtil.ZERO ;
      AV30TFPrdCant_To = DecimalUtil.ZERO ;
      AV40TFPrdCant_To_Description = "" ;
      AV31TFPrdCanFin = DecimalUtil.ZERO ;
      AV32TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV41TFPrdCanFin_To_Description = "" ;
      AV34TFRecLinUsr_Sel = "" ;
      AV33TFRecLinUsr = "" ;
      AV35TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = "" ;
      AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = "" ;
      AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = "" ;
      AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant = DecimalUtil.ZERO ;
      AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = "" ;
      AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      lV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      lV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      lV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      lV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      P094V2_A396EmprCod = new String[] {""} ;
      P094V2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094V2_A4576RecLinUsr = new String[] {""} ;
      P094V2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094V2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094V2_A488ForPrdDsc = new String[] {""} ;
      P094V2_n488ForPrdDsc = new boolean[] {false} ;
      P094V2_A490ForPrdUMe = new byte[1] ;
      P094V2_n490ForPrdUMe = new boolean[] {false} ;
      P094V2_A875RecPrdDsc = new String[] {""} ;
      P094V2_A872RecPrdNum = new String[] {""} ;
      P094V2_A811RecLin = new short[1] ;
      P094V2_A1273RecLinPro = new byte[1] ;
      P094V2_A129BarCod = new int[1] ;
      P094V2_A132BarCodReo = new byte[1] ;
      P094V2_A130BarCodPar = new String[] {""} ;
      P094V2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51PageInfo = "" ;
      AV48DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV57Pgmdesc = "" ;
      AV46AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_verproductospesadosexportreport__default(),
         new Object[] {
             new Object[] {
            P094V2_A396EmprCod, P094V2_A4577RecPesFec, P094V2_A4576RecLinUsr, P094V2_A683PrdCanFin, P094V2_A686PrdCant, P094V2_A488ForPrdDsc, P094V2_n488ForPrdDsc, P094V2_A490ForPrdUMe, P094V2_n490ForPrdUMe, P094V2_A875RecPrdDsc,
            P094V2_A872RecPrdNum, P094V2_A811RecLin, P094V2_A1273RecLinPro, P094V2_A129BarCod, P094V2_A132BarCodReo, P094V2_A130BarCodPar, P094V2_A2804RecLinMaq
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "Cierre Recetas Tinte_Ver Productos Pesados Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "Cierre Recetas Tinte_Ver Productos Pesados Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV17TFRecLinPro ;
   private byte AV18TFRecLinPro_To ;
   private byte AV25TFForPrdUMe ;
   private byte AV26TFForPrdUMe_To ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ;
   private byte AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ;
   private byte AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume ;
   private byte AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV19TFRecLin ;
   private short AV20TFRecLin_To ;
   private short A811RecLin ;
   private short AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin ;
   private short AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ;
   private short AV10OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int AV81GXV1 ;
   private java.math.BigDecimal AV29TFPrdCant ;
   private java.math.BigDecimal AV30TFPrdCant_To ;
   private java.math.BigDecimal AV31TFPrdCanFin ;
   private java.math.BigDecimal AV32TFPrdCanFin_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant ;
   private java.math.BigDecimal AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ;
   private java.math.BigDecimal AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ;
   private java.math.BigDecimal AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22TFRecPrdNum_Sel ;
   private String AV21TFRecPrdNum ;
   private String AV24TFRecPrdDsc_Sel ;
   private String AV23TFRecPrdDsc ;
   private String AV28TFForPrdDsc_Sel ;
   private String AV27TFForPrdDsc ;
   private String AV34TFRecLinUsr_Sel ;
   private String AV33TFRecLinUsr ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A4576RecLinUsr ;
   private String AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ;
   private String AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ;
   private String AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ;
   private String AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String lV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String lV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String lV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV57Pgmdesc ;
   private java.util.Date AV35TFRecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private String AV53Title ;
   private String AV12FilterFullText ;
   private String AV37TFRecLinPro_To_Description ;
   private String AV38TFRecLin_To_Description ;
   private String AV39TFForPrdUMe_To_Description ;
   private String AV40TFPrdCant_To_Description ;
   private String AV41TFPrdCanFin_To_Description ;
   private String AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String lV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String AV51PageInfo ;
   private String AV48DateInfo ;
   private String AV46AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P094V2_A396EmprCod ;
   private java.util.Date[] P094V2_A4577RecPesFec ;
   private String[] P094V2_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094V2_A683PrdCanFin ;
   private java.math.BigDecimal[] P094V2_A686PrdCant ;
   private String[] P094V2_A488ForPrdDsc ;
   private boolean[] P094V2_n488ForPrdDsc ;
   private byte[] P094V2_A490ForPrdUMe ;
   private boolean[] P094V2_n490ForPrdUMe ;
   private String[] P094V2_A875RecPrdDsc ;
   private String[] P094V2_A872RecPrdNum ;
   private short[] P094V2_A811RecLin ;
   private byte[] P094V2_A1273RecLinPro ;
   private int[] P094V2_A129BarCod ;
   private byte[] P094V2_A132BarCodReo ;
   private String[] P094V2_A130BarCodPar ;
   private short[] P094V2_A2804RecLinMaq ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class cierrerecetastinte_verproductospesadosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV64Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV70Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV78Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV80Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanFin DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinUsr DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPesFec" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPesFec DESC" ;
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
                  return conditional_P094V2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
      }
   }

}

