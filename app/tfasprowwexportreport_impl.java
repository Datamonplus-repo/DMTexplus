package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasprowwexportreport_impl extends GXWebReport
{
   public tfasprowwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV94Title = httpContext.getMessage( "Lista de FASES", "") ;
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
         h81X0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV102FilterFullText)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102FilterFullText, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFFasActiva_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Activa?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111TFFasActiva_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFFasCod_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFFasCod_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFFasCod)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFFasCod, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFFasDsc_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFFasDsc_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFFasDsc)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFFasDsc, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV45TFFasSigla_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Siglas", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFFasSigla_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFFasSigla)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Siglas", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFFasSigla, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV47TFMaqCod_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFMaqCod_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFMaqCod)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFMaqCod, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV49TFMaqDsc_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFMaqDsc_Sel, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFMaqDsc)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFMaqDsc, "")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFFasDec)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFasDec_To)==0) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Decalage ", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50TFFasDec, "ZZ9.9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFFasDec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Decalage ", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFFasDec_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51TFFasDec_To, "ZZ9.9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFasDec2)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFFasDec2_To)==0) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Decalage 2", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52TFFasDec2, "ZZZ9.99")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFFasDec2_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Decalage 2", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFFasDec2_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53TFFasDec2_To, "ZZZ9.99")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV54TFFasPreSal) && (0==AV55TFFasPreSal_To) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "T prepysal", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFFasPreSal), "ZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFFasPreSal_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "T prepysal", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFFasPreSal_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFFasPreSal_To), "ZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV56TFFasPrePie) && (0==AV57TFFasPrePie_To) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "T prepppza", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFFasPrePie), "ZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV81TFFasPrePie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "T prepppza", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFFasPrePie_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFFasPrePie_To), "ZZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFFasVelPro)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFFasVelPro_To)==0) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Vel (mts/m)", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58TFFasVelPro, "ZZ9.9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV82TFFasVelPro_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Vel (mts/m)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFFasVelPro_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59TFFasVelPro_To, "ZZ9.9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV60TFFasNumPas) && (0==AV61TFFasNumPas_To) ) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N pases", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60TFFasNumPas), "ZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV83TFFasNumPas_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N pases", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFFasNumPas_To_Description, "")), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61TFFasNumPas_To), "ZZ9")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFFasActTin_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "T?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFFasActTin_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFFasActTin)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "T?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFFasActTin, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV65TFFasCon_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "C?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFFasCon_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV64TFFasCon)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFFasCon, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV67TFFasAcab_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFFasAcab_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV66TFFasAcab)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFFasAcab, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV69TFFasForMul_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "F?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFFasForMul_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV68TFFasForMul)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "F?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFFasForMul, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV71TFFasConPla_Sel)==0) )
      {
         h81X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFFasConPla_Sel, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV70TFFasConPla)==0) )
         {
            h81X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P?", ""), 25, Gx_line+0, 128, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFFasConPla, "@!")), 128, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h81X0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h81X0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Activa?", ""), 30, Gx_line+10, 70, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 74, Gx_line+10, 114, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 118, Gx_line+10, 158, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Siglas", ""), 162, Gx_line+10, 202, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 206, Gx_line+10, 246, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 250, Gx_line+10, 292, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Decalage ", ""), 296, Gx_line+10, 337, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Decalage 2", ""), 341, Gx_line+10, 382, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "T prepysal", ""), 386, Gx_line+10, 427, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "T prepppza", ""), 431, Gx_line+10, 472, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Vel (mts/m)", ""), 476, Gx_line+10, 517, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N pases", ""), 521, Gx_line+10, 562, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "T?", ""), 566, Gx_line+10, 607, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C?", ""), 611, Gx_line+10, 652, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 656, Gx_line+10, 697, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "F?", ""), 701, Gx_line+10, 742, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P?", ""), 746, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV118Tfasprowwds_1_filterfulltext = AV102FilterFullText ;
      AV119Tfasprowwds_2_tffasactiva_sel = AV111TFFasActiva_Sel ;
      AV120Tfasprowwds_3_tffascod = AV40TFFasCod ;
      AV121Tfasprowwds_4_tffascod_sel = AV41TFFasCod_Sel ;
      AV122Tfasprowwds_5_tffasdsc = AV42TFFasDsc ;
      AV123Tfasprowwds_6_tffasdsc_sel = AV43TFFasDsc_Sel ;
      AV124Tfasprowwds_7_tffassigla = AV44TFFasSigla ;
      AV125Tfasprowwds_8_tffassigla_sel = AV45TFFasSigla_Sel ;
      AV126Tfasprowwds_9_tfmaqcod = AV46TFMaqCod ;
      AV127Tfasprowwds_10_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV128Tfasprowwds_11_tfmaqdsc = AV48TFMaqDsc ;
      AV129Tfasprowwds_12_tfmaqdsc_sel = AV49TFMaqDsc_Sel ;
      AV130Tfasprowwds_13_tffasdec = AV50TFFasDec ;
      AV131Tfasprowwds_14_tffasdec_to = AV51TFFasDec_To ;
      AV132Tfasprowwds_15_tffasdec2 = AV52TFFasDec2 ;
      AV133Tfasprowwds_16_tffasdec2_to = AV53TFFasDec2_To ;
      AV134Tfasprowwds_17_tffaspresal = AV54TFFasPreSal ;
      AV135Tfasprowwds_18_tffaspresal_to = AV55TFFasPreSal_To ;
      AV136Tfasprowwds_19_tffasprepie = AV56TFFasPrePie ;
      AV137Tfasprowwds_20_tffasprepie_to = AV57TFFasPrePie_To ;
      AV138Tfasprowwds_21_tffasvelpro = AV58TFFasVelPro ;
      AV139Tfasprowwds_22_tffasvelpro_to = AV59TFFasVelPro_To ;
      AV140Tfasprowwds_23_tffasnumpas = AV60TFFasNumPas ;
      AV141Tfasprowwds_24_tffasnumpas_to = AV61TFFasNumPas_To ;
      AV142Tfasprowwds_25_tffasacttin = AV62TFFasActTin ;
      AV143Tfasprowwds_26_tffasacttin_sel = AV63TFFasActTin_Sel ;
      AV144Tfasprowwds_27_tffascon = AV64TFFasCon ;
      AV145Tfasprowwds_28_tffascon_sel = AV65TFFasCon_Sel ;
      AV146Tfasprowwds_29_tffasacab = AV66TFFasAcab ;
      AV147Tfasprowwds_30_tffasacab_sel = AV67TFFasAcab_Sel ;
      AV148Tfasprowwds_31_tffasformul = AV68TFFasForMul ;
      AV149Tfasprowwds_32_tffasformul_sel = AV69TFFasForMul_Sel ;
      AV150Tfasprowwds_33_tffasconpla = AV70TFFasConPla ;
      AV151Tfasprowwds_34_tffasconpla_sel = AV71TFFasConPla_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV118Tfasprowwds_1_filterfulltext ,
                                           AV119Tfasprowwds_2_tffasactiva_sel ,
                                           AV121Tfasprowwds_4_tffascod_sel ,
                                           AV120Tfasprowwds_3_tffascod ,
                                           AV123Tfasprowwds_6_tffasdsc_sel ,
                                           AV122Tfasprowwds_5_tffasdsc ,
                                           AV125Tfasprowwds_8_tffassigla_sel ,
                                           AV124Tfasprowwds_7_tffassigla ,
                                           AV127Tfasprowwds_10_tfmaqcod_sel ,
                                           AV126Tfasprowwds_9_tfmaqcod ,
                                           AV129Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV128Tfasprowwds_11_tfmaqdsc ,
                                           AV130Tfasprowwds_13_tffasdec ,
                                           AV131Tfasprowwds_14_tffasdec_to ,
                                           AV132Tfasprowwds_15_tffasdec2 ,
                                           AV133Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV134Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV135Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV136Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV137Tfasprowwds_20_tffasprepie_to) ,
                                           AV138Tfasprowwds_21_tffasvelpro ,
                                           AV139Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV140Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV141Tfasprowwds_24_tffasnumpas_to) ,
                                           AV143Tfasprowwds_26_tffasacttin_sel ,
                                           AV142Tfasprowwds_25_tffasacttin ,
                                           AV145Tfasprowwds_28_tffascon_sel ,
                                           AV144Tfasprowwds_27_tffascon ,
                                           AV147Tfasprowwds_30_tffasacab_sel ,
                                           AV146Tfasprowwds_29_tffasacab ,
                                           AV149Tfasprowwds_32_tffasformul_sel ,
                                           AV148Tfasprowwds_31_tffasformul ,
                                           AV151Tfasprowwds_34_tffasconpla_sel ,
                                           AV150Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV118Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tfasprowwds_1_filterfulltext), "%", "") ;
      lV120Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV120Tfasprowwds_3_tffascod), 8, "%") ;
      lV122Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV122Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV124Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV124Tfasprowwds_7_tffassigla), 4, "%") ;
      lV126Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV126Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV128Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV128Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV142Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV142Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV144Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV144Tfasprowwds_27_tffascon), 1, "%") ;
      lV146Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV146Tfasprowwds_29_tffasacab), 1, "%") ;
      lV148Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV148Tfasprowwds_31_tffasformul), 1, "%") ;
      lV150Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV150Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor P081X2 */
      pr_default.execute(0, new Object[] {lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, lV118Tfasprowwds_1_filterfulltext, AV119Tfasprowwds_2_tffasactiva_sel, lV120Tfasprowwds_3_tffascod, AV121Tfasprowwds_4_tffascod_sel, lV122Tfasprowwds_5_tffasdsc, AV123Tfasprowwds_6_tffasdsc_sel, lV124Tfasprowwds_7_tffassigla, AV125Tfasprowwds_8_tffassigla_sel, lV126Tfasprowwds_9_tfmaqcod, AV127Tfasprowwds_10_tfmaqcod_sel, lV128Tfasprowwds_11_tfmaqdsc, AV129Tfasprowwds_12_tfmaqdsc_sel, AV130Tfasprowwds_13_tffasdec, AV131Tfasprowwds_14_tffasdec_to, AV132Tfasprowwds_15_tffasdec2, AV133Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV134Tfasprowwds_17_tffaspresal), Short.valueOf(AV135Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV136Tfasprowwds_19_tffasprepie), Short.valueOf(AV137Tfasprowwds_20_tffasprepie_to), AV138Tfasprowwds_21_tffasvelpro, AV139Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV140Tfasprowwds_23_tffasnumpas), Short.valueOf(AV141Tfasprowwds_24_tffasnumpas_to), lV142Tfasprowwds_25_tffasacttin, AV143Tfasprowwds_26_tffasacttin_sel, lV144Tfasprowwds_27_tffascon, AV145Tfasprowwds_28_tffascon_sel, lV146Tfasprowwds_29_tffasacab, AV147Tfasprowwds_30_tffasacab_sel, lV148Tfasprowwds_31_tffasformul, AV149Tfasprowwds_32_tffasformul_sel, lV150Tfasprowwds_33_tffasconpla, AV151Tfasprowwds_34_tffasconpla_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P081X2_A396EmprCod[0] ;
         A4299FasConPla = P081X2_A4299FasConPla[0] ;
         n4299FasConPla = P081X2_n4299FasConPla[0] ;
         A4286FasForMul = P081X2_A4286FasForMul[0] ;
         n4286FasForMul = P081X2_n4286FasForMul[0] ;
         A4903FasAcab = P081X2_A4903FasAcab[0] ;
         n4903FasAcab = P081X2_n4903FasAcab[0] ;
         A458FasCon = P081X2_A458FasCon[0] ;
         n458FasCon = P081X2_n458FasCon[0] ;
         A456FasActTin = P081X2_A456FasActTin[0] ;
         n456FasActTin = P081X2_n456FasActTin[0] ;
         A464FasNumPas = P081X2_A464FasNumPas[0] ;
         n464FasNumPas = P081X2_n464FasNumPas[0] ;
         A472FasVelPro = P081X2_A472FasVelPro[0] ;
         n472FasVelPro = P081X2_n472FasVelPro[0] ;
         A468FasPrePie = P081X2_A468FasPrePie[0] ;
         n468FasPrePie = P081X2_n468FasPrePie[0] ;
         A469FasPreSal = P081X2_A469FasPreSal[0] ;
         n469FasPreSal = P081X2_n469FasPreSal[0] ;
         A5990FasDec2 = P081X2_A5990FasDec2[0] ;
         n5990FasDec2 = P081X2_n5990FasDec2[0] ;
         A459FasDec = P081X2_A459FasDec[0] ;
         n459FasDec = P081X2_n459FasDec[0] ;
         A606MaqDsc = P081X2_A606MaqDsc[0] ;
         n606MaqDsc = P081X2_n606MaqDsc[0] ;
         A602MaqCod = P081X2_A602MaqCod[0] ;
         n602MaqCod = P081X2_n602MaqCod[0] ;
         A7070FasSigla = P081X2_A7070FasSigla[0] ;
         n7070FasSigla = P081X2_n7070FasSigla[0] ;
         A460FasDsc = P081X2_A460FasDsc[0] ;
         A457FasCod = P081X2_A457FasCod[0] ;
         A14042FasActiva = P081X2_A14042FasActiva[0] ;
         A606MaqDsc = P081X2_A606MaqDsc[0] ;
         n606MaqDsc = P081X2_n606MaqDsc[0] ;
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
         h81X0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14042FasActiva, "")), 30, Gx_line+10, 70, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 74, Gx_line+10, 114, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 118, Gx_line+10, 158, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7070FasSigla, "")), 162, Gx_line+10, 202, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 206, Gx_line+10, 246, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 250, Gx_line+10, 292, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A459FasDec, "ZZ9.9")), 296, Gx_line+10, 337, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5990FasDec2, "ZZZ9.99")), 341, Gx_line+10, 382, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")), 386, Gx_line+10, 427, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")), 431, Gx_line+10, 472, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A472FasVelPro, "ZZ9.9")), 476, Gx_line+10, 517, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")), 521, Gx_line+10, 562, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A456FasActTin, "@!")), 566, Gx_line+10, 607, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A458FasCon, "@!")), 611, Gx_line+10, 652, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")), 656, Gx_line+10, 697, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")), 701, Gx_line+10, 742, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")), 746, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV36Session.getValue("TFASPROWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASPROWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TFASPROWWGridState"), null, null);
      }
      AV10OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV152GXV1 = 1 ;
      while ( AV152GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV152GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV102FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTIVA_SEL") == 0 )
         {
            AV111TFFasActiva_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV40TFFasCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV41TFFasCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV42TFFasDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV43TFFasDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA") == 0 )
         {
            AV44TFFasSigla = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA_SEL") == 0 )
         {
            AV45TFFasSigla_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV46TFMaqCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV47TFMaqCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV48TFMaqDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV49TFMaqDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV50TFFasDec = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFFasDec_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC2") == 0 )
         {
            AV52TFFasDec2 = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFFasDec2_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV54TFFasPreSal = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFFasPreSal_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV56TFFasPrePie = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFFasPrePie_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV58TFFasVelPro = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFFasVelPro_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV60TFFasNumPas = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFFasNumPas_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV62TFFasActTin = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV63TFFasActTin_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV64TFFasCon = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV65TFFasCon_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV66TFFasAcab = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV67TFFasAcab_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV68TFFasForMul = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV69TFFasForMul_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV70TFFasConPla = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV71TFFasConPla_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV152GXV1 = (int)(AV152GXV1+1) ;
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

   public void h81X0( boolean bFoot ,
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
               AV91PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV87DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
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
            AV94Title = AV114Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV94Title = "" ;
      AV102FilterFullText = "" ;
      AV111TFFasActiva_Sel = "" ;
      AV41TFFasCod_Sel = "" ;
      AV40TFFasCod = "" ;
      AV43TFFasDsc_Sel = "" ;
      AV42TFFasDsc = "" ;
      AV45TFFasSigla_Sel = "" ;
      AV44TFFasSigla = "" ;
      AV47TFMaqCod_Sel = "" ;
      AV46TFMaqCod = "" ;
      AV49TFMaqDsc_Sel = "" ;
      AV48TFMaqDsc = "" ;
      AV50TFFasDec = DecimalUtil.ZERO ;
      AV51TFFasDec_To = DecimalUtil.ZERO ;
      AV78TFFasDec_To_Description = "" ;
      AV52TFFasDec2 = DecimalUtil.ZERO ;
      AV53TFFasDec2_To = DecimalUtil.ZERO ;
      AV79TFFasDec2_To_Description = "" ;
      AV80TFFasPreSal_To_Description = "" ;
      AV81TFFasPrePie_To_Description = "" ;
      AV58TFFasVelPro = DecimalUtil.ZERO ;
      AV59TFFasVelPro_To = DecimalUtil.ZERO ;
      AV82TFFasVelPro_To_Description = "" ;
      AV83TFFasNumPas_To_Description = "" ;
      AV63TFFasActTin_Sel = "" ;
      AV62TFFasActTin = "" ;
      AV65TFFasCon_Sel = "" ;
      AV64TFFasCon = "" ;
      AV67TFFasAcab_Sel = "" ;
      AV66TFFasAcab = "" ;
      AV69TFFasForMul_Sel = "" ;
      AV68TFFasForMul = "" ;
      AV71TFFasConPla_Sel = "" ;
      AV70TFFasConPla = "" ;
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A7070FasSigla = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      AV118Tfasprowwds_1_filterfulltext = "" ;
      AV119Tfasprowwds_2_tffasactiva_sel = "" ;
      AV120Tfasprowwds_3_tffascod = "" ;
      AV121Tfasprowwds_4_tffascod_sel = "" ;
      AV122Tfasprowwds_5_tffasdsc = "" ;
      AV123Tfasprowwds_6_tffasdsc_sel = "" ;
      AV124Tfasprowwds_7_tffassigla = "" ;
      AV125Tfasprowwds_8_tffassigla_sel = "" ;
      AV126Tfasprowwds_9_tfmaqcod = "" ;
      AV127Tfasprowwds_10_tfmaqcod_sel = "" ;
      AV128Tfasprowwds_11_tfmaqdsc = "" ;
      AV129Tfasprowwds_12_tfmaqdsc_sel = "" ;
      AV130Tfasprowwds_13_tffasdec = DecimalUtil.ZERO ;
      AV131Tfasprowwds_14_tffasdec_to = DecimalUtil.ZERO ;
      AV132Tfasprowwds_15_tffasdec2 = DecimalUtil.ZERO ;
      AV133Tfasprowwds_16_tffasdec2_to = DecimalUtil.ZERO ;
      AV138Tfasprowwds_21_tffasvelpro = DecimalUtil.ZERO ;
      AV139Tfasprowwds_22_tffasvelpro_to = DecimalUtil.ZERO ;
      AV142Tfasprowwds_25_tffasacttin = "" ;
      AV143Tfasprowwds_26_tffasacttin_sel = "" ;
      AV144Tfasprowwds_27_tffascon = "" ;
      AV145Tfasprowwds_28_tffascon_sel = "" ;
      AV146Tfasprowwds_29_tffasacab = "" ;
      AV147Tfasprowwds_30_tffasacab_sel = "" ;
      AV148Tfasprowwds_31_tffasformul = "" ;
      AV149Tfasprowwds_32_tffasformul_sel = "" ;
      AV150Tfasprowwds_33_tffasconpla = "" ;
      AV151Tfasprowwds_34_tffasconpla_sel = "" ;
      scmdbuf = "" ;
      lV118Tfasprowwds_1_filterfulltext = "" ;
      lV120Tfasprowwds_3_tffascod = "" ;
      lV122Tfasprowwds_5_tffasdsc = "" ;
      lV124Tfasprowwds_7_tffassigla = "" ;
      lV126Tfasprowwds_9_tfmaqcod = "" ;
      lV128Tfasprowwds_11_tfmaqdsc = "" ;
      lV142Tfasprowwds_25_tffasacttin = "" ;
      lV144Tfasprowwds_27_tffascon = "" ;
      lV146Tfasprowwds_29_tffasacab = "" ;
      lV148Tfasprowwds_31_tffasformul = "" ;
      lV150Tfasprowwds_33_tffasconpla = "" ;
      P081X2_A396EmprCod = new String[] {""} ;
      P081X2_A4299FasConPla = new String[] {""} ;
      P081X2_n4299FasConPla = new boolean[] {false} ;
      P081X2_A4286FasForMul = new String[] {""} ;
      P081X2_n4286FasForMul = new boolean[] {false} ;
      P081X2_A4903FasAcab = new String[] {""} ;
      P081X2_n4903FasAcab = new boolean[] {false} ;
      P081X2_A458FasCon = new String[] {""} ;
      P081X2_n458FasCon = new boolean[] {false} ;
      P081X2_A456FasActTin = new String[] {""} ;
      P081X2_n456FasActTin = new boolean[] {false} ;
      P081X2_A464FasNumPas = new short[1] ;
      P081X2_n464FasNumPas = new boolean[] {false} ;
      P081X2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081X2_n472FasVelPro = new boolean[] {false} ;
      P081X2_A468FasPrePie = new short[1] ;
      P081X2_n468FasPrePie = new boolean[] {false} ;
      P081X2_A469FasPreSal = new short[1] ;
      P081X2_n469FasPreSal = new boolean[] {false} ;
      P081X2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081X2_n5990FasDec2 = new boolean[] {false} ;
      P081X2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P081X2_n459FasDec = new boolean[] {false} ;
      P081X2_A606MaqDsc = new String[] {""} ;
      P081X2_n606MaqDsc = new boolean[] {false} ;
      P081X2_A602MaqCod = new String[] {""} ;
      P081X2_n602MaqCod = new boolean[] {false} ;
      P081X2_A7070FasSigla = new String[] {""} ;
      P081X2_n7070FasSigla = new boolean[] {false} ;
      P081X2_A460FasDsc = new String[] {""} ;
      P081X2_A457FasCod = new String[] {""} ;
      P081X2_A14042FasActiva = new String[] {""} ;
      A396EmprCod = "" ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV91PageInfo = "" ;
      AV87DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV114Pgmdesc = "" ;
      AV106AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasprowwexportreport__default(),
         new Object[] {
             new Object[] {
            P081X2_A396EmprCod, P081X2_A4299FasConPla, P081X2_n4299FasConPla, P081X2_A4286FasForMul, P081X2_n4286FasForMul, P081X2_A4903FasAcab, P081X2_n4903FasAcab, P081X2_A458FasCon, P081X2_n458FasCon, P081X2_A456FasActTin,
            P081X2_n456FasActTin, P081X2_A464FasNumPas, P081X2_n464FasNumPas, P081X2_A472FasVelPro, P081X2_n472FasVelPro, P081X2_A468FasPrePie, P081X2_n468FasPrePie, P081X2_A469FasPreSal, P081X2_n469FasPreSal, P081X2_A5990FasDec2,
            P081X2_n5990FasDec2, P081X2_A459FasDec, P081X2_n459FasDec, P081X2_A606MaqDsc, P081X2_n606MaqDsc, P081X2_A602MaqCod, P081X2_n602MaqCod, P081X2_A7070FasSigla, P081X2_n7070FasSigla, P081X2_A460FasDsc,
            P081X2_A457FasCod, P081X2_A14042FasActiva
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV114Pgmdesc = httpContext.getMessage( "TFASPROWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV114Pgmdesc = httpContext.getMessage( "TFASPROWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV54TFFasPreSal ;
   private short AV55TFFasPreSal_To ;
   private short AV56TFFasPrePie ;
   private short AV57TFFasPrePie_To ;
   private short AV60TFFasNumPas ;
   private short AV61TFFasNumPas_To ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short AV134Tfasprowwds_17_tffaspresal ;
   private short AV135Tfasprowwds_18_tffaspresal_to ;
   private short AV136Tfasprowwds_19_tffasprepie ;
   private short AV137Tfasprowwds_20_tffasprepie_to ;
   private short AV140Tfasprowwds_23_tffasnumpas ;
   private short AV141Tfasprowwds_24_tffasnumpas_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV152GXV1 ;
   private java.math.BigDecimal AV50TFFasDec ;
   private java.math.BigDecimal AV51TFFasDec_To ;
   private java.math.BigDecimal AV52TFFasDec2 ;
   private java.math.BigDecimal AV53TFFasDec2_To ;
   private java.math.BigDecimal AV58TFFasVelPro ;
   private java.math.BigDecimal AV59TFFasVelPro_To ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV130Tfasprowwds_13_tffasdec ;
   private java.math.BigDecimal AV131Tfasprowwds_14_tffasdec_to ;
   private java.math.BigDecimal AV132Tfasprowwds_15_tffasdec2 ;
   private java.math.BigDecimal AV133Tfasprowwds_16_tffasdec2_to ;
   private java.math.BigDecimal AV138Tfasprowwds_21_tffasvelpro ;
   private java.math.BigDecimal AV139Tfasprowwds_22_tffasvelpro_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV111TFFasActiva_Sel ;
   private String AV41TFFasCod_Sel ;
   private String AV40TFFasCod ;
   private String AV43TFFasDsc_Sel ;
   private String AV42TFFasDsc ;
   private String AV45TFFasSigla_Sel ;
   private String AV44TFFasSigla ;
   private String AV47TFMaqCod_Sel ;
   private String AV46TFMaqCod ;
   private String AV49TFMaqDsc_Sel ;
   private String AV48TFMaqDsc ;
   private String AV63TFFasActTin_Sel ;
   private String AV62TFFasActTin ;
   private String AV65TFFasCon_Sel ;
   private String AV64TFFasCon ;
   private String AV67TFFasAcab_Sel ;
   private String AV66TFFasAcab ;
   private String AV69TFFasForMul_Sel ;
   private String AV68TFFasForMul ;
   private String AV71TFFasConPla_Sel ;
   private String AV70TFFasConPla ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A7070FasSigla ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String AV119Tfasprowwds_2_tffasactiva_sel ;
   private String AV120Tfasprowwds_3_tffascod ;
   private String AV121Tfasprowwds_4_tffascod_sel ;
   private String AV122Tfasprowwds_5_tffasdsc ;
   private String AV123Tfasprowwds_6_tffasdsc_sel ;
   private String AV124Tfasprowwds_7_tffassigla ;
   private String AV125Tfasprowwds_8_tffassigla_sel ;
   private String AV126Tfasprowwds_9_tfmaqcod ;
   private String AV127Tfasprowwds_10_tfmaqcod_sel ;
   private String AV128Tfasprowwds_11_tfmaqdsc ;
   private String AV129Tfasprowwds_12_tfmaqdsc_sel ;
   private String AV142Tfasprowwds_25_tffasacttin ;
   private String AV143Tfasprowwds_26_tffasacttin_sel ;
   private String AV144Tfasprowwds_27_tffascon ;
   private String AV145Tfasprowwds_28_tffascon_sel ;
   private String AV146Tfasprowwds_29_tffasacab ;
   private String AV147Tfasprowwds_30_tffasacab_sel ;
   private String AV148Tfasprowwds_31_tffasformul ;
   private String AV149Tfasprowwds_32_tffasformul_sel ;
   private String AV150Tfasprowwds_33_tffasconpla ;
   private String AV151Tfasprowwds_34_tffasconpla_sel ;
   private String scmdbuf ;
   private String lV120Tfasprowwds_3_tffascod ;
   private String lV122Tfasprowwds_5_tffasdsc ;
   private String lV124Tfasprowwds_7_tffassigla ;
   private String lV126Tfasprowwds_9_tfmaqcod ;
   private String lV128Tfasprowwds_11_tfmaqdsc ;
   private String lV142Tfasprowwds_25_tffasacttin ;
   private String lV144Tfasprowwds_27_tffascon ;
   private String lV146Tfasprowwds_29_tffasacab ;
   private String lV148Tfasprowwds_31_tffasformul ;
   private String lV150Tfasprowwds_33_tffasconpla ;
   private String A396EmprCod ;
   private String AV114Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n4299FasConPla ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n456FasActTin ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n7070FasSigla ;
   private String AV94Title ;
   private String AV102FilterFullText ;
   private String AV78TFFasDec_To_Description ;
   private String AV79TFFasDec2_To_Description ;
   private String AV80TFFasPreSal_To_Description ;
   private String AV81TFFasPrePie_To_Description ;
   private String AV82TFFasVelPro_To_Description ;
   private String AV83TFFasNumPas_To_Description ;
   private String AV118Tfasprowwds_1_filterfulltext ;
   private String lV118Tfasprowwds_1_filterfulltext ;
   private String AV91PageInfo ;
   private String AV87DateInfo ;
   private String AV106AppName ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private IDataStoreProvider pr_default ;
   private String[] P081X2_A396EmprCod ;
   private String[] P081X2_A4299FasConPla ;
   private boolean[] P081X2_n4299FasConPla ;
   private String[] P081X2_A4286FasForMul ;
   private boolean[] P081X2_n4286FasForMul ;
   private String[] P081X2_A4903FasAcab ;
   private boolean[] P081X2_n4903FasAcab ;
   private String[] P081X2_A458FasCon ;
   private boolean[] P081X2_n458FasCon ;
   private String[] P081X2_A456FasActTin ;
   private boolean[] P081X2_n456FasActTin ;
   private short[] P081X2_A464FasNumPas ;
   private boolean[] P081X2_n464FasNumPas ;
   private java.math.BigDecimal[] P081X2_A472FasVelPro ;
   private boolean[] P081X2_n472FasVelPro ;
   private short[] P081X2_A468FasPrePie ;
   private boolean[] P081X2_n468FasPrePie ;
   private short[] P081X2_A469FasPreSal ;
   private boolean[] P081X2_n469FasPreSal ;
   private java.math.BigDecimal[] P081X2_A5990FasDec2 ;
   private boolean[] P081X2_n5990FasDec2 ;
   private java.math.BigDecimal[] P081X2_A459FasDec ;
   private boolean[] P081X2_n459FasDec ;
   private String[] P081X2_A606MaqDsc ;
   private boolean[] P081X2_n606MaqDsc ;
   private String[] P081X2_A602MaqCod ;
   private boolean[] P081X2_n602MaqCod ;
   private String[] P081X2_A7070FasSigla ;
   private boolean[] P081X2_n7070FasSigla ;
   private String[] P081X2_A460FasDsc ;
   private String[] P081X2_A457FasCod ;
   private String[] P081X2_A14042FasActiva ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tfasprowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tfasprowwds_1_filterfulltext ,
                                          String AV119Tfasprowwds_2_tffasactiva_sel ,
                                          String AV121Tfasprowwds_4_tffascod_sel ,
                                          String AV120Tfasprowwds_3_tffascod ,
                                          String AV123Tfasprowwds_6_tffasdsc_sel ,
                                          String AV122Tfasprowwds_5_tffasdsc ,
                                          String AV125Tfasprowwds_8_tffassigla_sel ,
                                          String AV124Tfasprowwds_7_tffassigla ,
                                          String AV127Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV126Tfasprowwds_9_tfmaqcod ,
                                          String AV129Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV128Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV130Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV131Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV132Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV133Tfasprowwds_16_tffasdec2_to ,
                                          short AV134Tfasprowwds_17_tffaspresal ,
                                          short AV135Tfasprowwds_18_tffaspresal_to ,
                                          short AV136Tfasprowwds_19_tffasprepie ,
                                          short AV137Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV138Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV139Tfasprowwds_22_tffasvelpro_to ,
                                          short AV140Tfasprowwds_23_tffasnumpas ,
                                          short AV141Tfasprowwds_24_tffasnumpas_to ,
                                          String AV143Tfasprowwds_26_tffasacttin_sel ,
                                          String AV142Tfasprowwds_25_tffasacttin ,
                                          String AV145Tfasprowwds_28_tffascon_sel ,
                                          String AV144Tfasprowwds_27_tffascon ,
                                          String AV147Tfasprowwds_30_tffasacab_sel ,
                                          String AV146Tfasprowwds_29_tffasacab ,
                                          String AV149Tfasprowwds_32_tffasformul_sel ,
                                          String AV148Tfasprowwds_31_tffasformul ,
                                          String AV151Tfasprowwds_34_tffasconpla_sel ,
                                          String AV150Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[49];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro, T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV118Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV120Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV124Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV126Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV134Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV135Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV136Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV137Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV140Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV141Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV142Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV144Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV146Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV148Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV150Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActiva" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActiva DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasSigla" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasSigla DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasDec2" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasDec2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPreSal" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPreSal DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasPrePie" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasPrePie DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasVelPro" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasVelPro DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasNumPas" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasNumPas DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasActTin" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasActTin DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCon" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCon DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasAcab" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasAcab DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasForMul" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasForMul DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasConPla" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasConPla DESC" ;
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
                  return conditional_P081X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 28);
               ((String[]) buf[30])[0] = rslt.getString(17, 8);
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
      }
   }

}

