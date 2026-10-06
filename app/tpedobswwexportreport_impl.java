package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedobswwexportreport_impl extends GXWebReport
{
   public tpedobswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV62Title = httpContext.getMessage( "Lista de OBSERVACIONES", "") ;
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
         h8PE0( true, 0) ;
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
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70FilterFullText, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFEmprCod_Sel)==0) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFEmprCod_Sel, "@!")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFEmprCod)==0) )
         {
            h8PE0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFEmprCod, "@!")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV32TFPedCod) && (0==AV33TFPedCod_To) ) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Pedido", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFPedCod), "ZZZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFPedCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Pedido", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFPedCod_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFPedCod_To), "ZZZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV34TFPedObsUL) && (0==AV35TFPedObsUL_To) ) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultima Linea Observaciones", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFPedObsUL), "Z9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFPedObsUL_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultima Linea Observaciones", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPedObsUL_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFPedObsUL_To), "Z9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFEmprNom_Sel)==0) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFEmprNom_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFEmprNom)==0) )
         {
            h8PE0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFEmprNom, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV38TFPedConLin) && (0==AV39TFPedConLin_To) ) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Contador de lineas", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFPedConLin), "Z9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFPedConLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Contador de lineas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFPedConLin_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFPedConLin_To), "Z9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFPedPerDes_Sel)==0) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Destinatario Pedido Compras", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFPedPerDes_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFPedPerDes)==0) )
         {
            h8PE0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destinatario Pedido Compras", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPedPerDes, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFPedPerPet_Sel)==0) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Peticionario Pedido Compras", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFPedPerPet_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFPedPerPet)==0) )
         {
            h8PE0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peticionario Pedido Compras", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFPedPerPet, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFPedFecEnt)) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrega Prevista", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV44TFPedFecEnt, "99/99/99"), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFPedFec)) )
      {
         h8PE0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Pedido", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV46TFPedFec, "99/99/99"), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8PE0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8PE0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Pedido", ""), 94, Gx_line+10, 154, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultima Linea Observaciones", ""), 158, Gx_line+10, 218, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 222, Gx_line+10, 342, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Contador de lineas", ""), 346, Gx_line+10, 406, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Destinatario Pedido Compras", ""), 410, Gx_line+10, 531, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Peticionario Pedido Compras", ""), 535, Gx_line+10, 657, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrega Prevista", ""), 661, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Pedido", ""), 726, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV82Tpedobswwds_1_filterfulltext = AV70FilterFullText ;
      AV83Tpedobswwds_2_tfemprcod = AV30TFEmprCod ;
      AV84Tpedobswwds_3_tfemprcod_sel = AV31TFEmprCod_Sel ;
      AV85Tpedobswwds_4_tfpedcod = AV32TFPedCod ;
      AV86Tpedobswwds_5_tfpedcod_to = AV33TFPedCod_To ;
      AV87Tpedobswwds_6_tfpedobsul = AV34TFPedObsUL ;
      AV88Tpedobswwds_7_tfpedobsul_to = AV35TFPedObsUL_To ;
      AV89Tpedobswwds_8_tfemprnom = AV36TFEmprNom ;
      AV90Tpedobswwds_9_tfemprnom_sel = AV37TFEmprNom_Sel ;
      AV91Tpedobswwds_10_tfpedconlin = AV38TFPedConLin ;
      AV92Tpedobswwds_11_tfpedconlin_to = AV39TFPedConLin_To ;
      AV93Tpedobswwds_12_tfpedperdes = AV40TFPedPerDes ;
      AV94Tpedobswwds_13_tfpedperdes_sel = AV41TFPedPerDes_Sel ;
      AV95Tpedobswwds_14_tfpedperpet = AV42TFPedPerPet ;
      AV96Tpedobswwds_15_tfpedperpet_sel = AV43TFPedPerPet_Sel ;
      AV97Tpedobswwds_16_tfpedfecent = AV44TFPedFecEnt ;
      AV98Tpedobswwds_17_tfpedfec = AV46TFPedFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Tpedobswwds_1_filterfulltext ,
                                           AV84Tpedobswwds_3_tfemprcod_sel ,
                                           AV83Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV85Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV86Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV87Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV88Tpedobswwds_7_tfpedobsul_to) ,
                                           AV90Tpedobswwds_9_tfemprnom_sel ,
                                           AV89Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV91Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV92Tpedobswwds_11_tfpedconlin_to) ,
                                           AV94Tpedobswwds_13_tfpedperdes_sel ,
                                           AV93Tpedobswwds_12_tfpedperdes ,
                                           AV96Tpedobswwds_15_tfpedperpet_sel ,
                                           AV95Tpedobswwds_14_tfpedperpet ,
                                           AV97Tpedobswwds_16_tfpedfecent ,
                                           AV98Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV82Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tpedobswwds_1_filterfulltext), "%", "") ;
      lV83Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV83Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV89Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV89Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV93Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV93Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV95Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV95Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PE3 */
      pr_default.execute(0, new Object[] {lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV82Tpedobswwds_1_filterfulltext, lV83Tpedobswwds_2_tfemprcod, AV84Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV85Tpedobswwds_4_tfpedcod), Integer.valueOf(AV86Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV87Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV88Tpedobswwds_7_tfpedobsul_to), lV89Tpedobswwds_8_tfemprnom, AV90Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV91Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV92Tpedobswwds_11_tfpedconlin_to), lV93Tpedobswwds_12_tfpedperdes, AV94Tpedobswwds_13_tfpedperdes_sel, lV95Tpedobswwds_14_tfpedperpet, AV96Tpedobswwds_15_tfpedperpet_sel, AV97Tpedobswwds_16_tfpedfecent, AV98Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A661PedFec = P08PE3_A661PedFec[0] ;
         A662PedFecEnt = P08PE3_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PE3_A8155PedPerPet[0] ;
         A8154PedPerDes = P08PE3_A8154PedPerDes[0] ;
         A407EmprNom = P08PE3_A407EmprNom[0] ;
         n407EmprNom = P08PE3_n407EmprNom[0] ;
         A2503PedObsUL = P08PE3_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PE3_n2503PedObsUL[0] ;
         A658PedCod = P08PE3_A658PedCod[0] ;
         A396EmprCod = P08PE3_A396EmprCod[0] ;
         A5049PedConLin = P08PE3_A5049PedConLin[0] ;
         n5049PedConLin = P08PE3_n5049PedConLin[0] ;
         A407EmprNom = P08PE3_A407EmprNom[0] ;
         n407EmprNom = P08PE3_n407EmprNom[0] ;
         A5049PedConLin = P08PE3_A5049PedConLin[0] ;
         n5049PedConLin = P08PE3_n5049PedConLin[0] ;
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
         h8PE0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 90, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 94, Gx_line+10, 154, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2503PedObsUL), "Z9")), 158, Gx_line+10, 218, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 222, Gx_line+10, 342, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5049PedConLin), "Z9")), 346, Gx_line+10, 406, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8154PedPerDes, "")), 410, Gx_line+10, 531, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8155PedPerPet, "")), 535, Gx_line+10, 657, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A662PedFecEnt, "99/99/99"), 661, Gx_line+10, 722, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A661PedFec, "99/99/99"), 726, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV26Session.getValue("TPEDOBSWWGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDOBSWWGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("TPEDOBSWWGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
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
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV32TFPedCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFPedCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDOBSUL") == 0 )
         {
            AV34TFPedObsUL = (byte)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPedObsUL_To = (byte)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV36TFEmprNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV37TFEmprNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCONLIN") == 0 )
         {
            AV38TFPedConLin = (byte)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPedConLin_To = (byte)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES") == 0 )
         {
            AV40TFPedPerDes = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES_SEL") == 0 )
         {
            AV41TFPedPerDes_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET") == 0 )
         {
            AV42TFPedPerPet = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET_SEL") == 0 )
         {
            AV43TFPedPerPet_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV44TFPedFecEnt = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV46TFPedFec = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
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

   public void h8PE0( boolean bFoot ,
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
            AV62Title = AV78Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV48TFPedCod_To_Description = "" ;
      AV49TFPedObsUL_To_Description = "" ;
      AV37TFEmprNom_Sel = "" ;
      AV36TFEmprNom = "" ;
      AV50TFPedConLin_To_Description = "" ;
      AV41TFPedPerDes_Sel = "" ;
      AV40TFPedPerDes = "" ;
      AV43TFPedPerPet_Sel = "" ;
      AV42TFPedPerPet = "" ;
      AV44TFPedFecEnt = GXutil.nullDate() ;
      AV46TFPedFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      AV82Tpedobswwds_1_filterfulltext = "" ;
      AV83Tpedobswwds_2_tfemprcod = "" ;
      AV84Tpedobswwds_3_tfemprcod_sel = "" ;
      AV89Tpedobswwds_8_tfemprnom = "" ;
      AV90Tpedobswwds_9_tfemprnom_sel = "" ;
      AV93Tpedobswwds_12_tfpedperdes = "" ;
      AV94Tpedobswwds_13_tfpedperdes_sel = "" ;
      AV95Tpedobswwds_14_tfpedperpet = "" ;
      AV96Tpedobswwds_15_tfpedperpet_sel = "" ;
      AV97Tpedobswwds_16_tfpedfecent = GXutil.nullDate() ;
      AV98Tpedobswwds_17_tfpedfec = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV82Tpedobswwds_1_filterfulltext = "" ;
      lV83Tpedobswwds_2_tfemprcod = "" ;
      lV89Tpedobswwds_8_tfemprnom = "" ;
      lV93Tpedobswwds_12_tfpedperdes = "" ;
      lV95Tpedobswwds_14_tfpedperpet = "" ;
      P08PE3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PE3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PE3_A8155PedPerPet = new String[] {""} ;
      P08PE3_A8154PedPerDes = new String[] {""} ;
      P08PE3_A407EmprNom = new String[] {""} ;
      P08PE3_n407EmprNom = new boolean[] {false} ;
      P08PE3_A2503PedObsUL = new byte[1] ;
      P08PE3_n2503PedObsUL = new boolean[] {false} ;
      P08PE3_A658PedCod = new int[1] ;
      P08PE3_A396EmprCod = new String[] {""} ;
      P08PE3_A5049PedConLin = new byte[1] ;
      P08PE3_n5049PedConLin = new boolean[] {false} ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59PageInfo = "" ;
      AV55DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV78Pgmdesc = "" ;
      AV72AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedobswwexportreport__default(),
         new Object[] {
             new Object[] {
            P08PE3_A661PedFec, P08PE3_A662PedFecEnt, P08PE3_A8155PedPerPet, P08PE3_A8154PedPerDes, P08PE3_A407EmprNom, P08PE3_n407EmprNom, P08PE3_A2503PedObsUL, P08PE3_n2503PedObsUL, P08PE3_A658PedCod, P08PE3_A396EmprCod,
            P08PE3_A5049PedConLin, P08PE3_n5049PedConLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV78Pgmdesc = httpContext.getMessage( "TPEDOBSWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV78Pgmdesc = httpContext.getMessage( "TPEDOBSWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV34TFPedObsUL ;
   private byte AV35TFPedObsUL_To ;
   private byte AV38TFPedConLin ;
   private byte AV39TFPedConLin_To ;
   private byte A2503PedObsUL ;
   private byte A5049PedConLin ;
   private byte AV87Tpedobswwds_6_tfpedobsul ;
   private byte AV88Tpedobswwds_7_tfpedobsul_to ;
   private byte AV91Tpedobswwds_10_tfpedconlin ;
   private byte AV92Tpedobswwds_11_tfpedconlin_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV32TFPedCod ;
   private int AV33TFPedCod_To ;
   private int A658PedCod ;
   private int AV85Tpedobswwds_4_tfpedcod ;
   private int AV86Tpedobswwds_5_tfpedcod_to ;
   private int AV99GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV31TFEmprCod_Sel ;
   private String AV30TFEmprCod ;
   private String AV37TFEmprNom_Sel ;
   private String AV36TFEmprNom ;
   private String AV41TFPedPerDes_Sel ;
   private String AV40TFPedPerDes ;
   private String AV43TFPedPerPet_Sel ;
   private String AV42TFPedPerPet ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A8154PedPerDes ;
   private String A8155PedPerPet ;
   private String AV83Tpedobswwds_2_tfemprcod ;
   private String AV84Tpedobswwds_3_tfemprcod_sel ;
   private String AV89Tpedobswwds_8_tfemprnom ;
   private String AV90Tpedobswwds_9_tfemprnom_sel ;
   private String AV93Tpedobswwds_12_tfpedperdes ;
   private String AV94Tpedobswwds_13_tfpedperdes_sel ;
   private String AV95Tpedobswwds_14_tfpedperpet ;
   private String AV96Tpedobswwds_15_tfpedperpet_sel ;
   private String scmdbuf ;
   private String lV83Tpedobswwds_2_tfemprcod ;
   private String lV89Tpedobswwds_8_tfemprnom ;
   private String lV93Tpedobswwds_12_tfpedperdes ;
   private String lV95Tpedobswwds_14_tfpedperpet ;
   private String AV78Pgmdesc ;
   private java.util.Date AV44TFPedFecEnt ;
   private java.util.Date AV46TFPedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV97Tpedobswwds_16_tfpedfecent ;
   private java.util.Date AV98Tpedobswwds_17_tfpedfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n2503PedObsUL ;
   private boolean n5049PedConLin ;
   private String AV62Title ;
   private String AV70FilterFullText ;
   private String AV48TFPedCod_To_Description ;
   private String AV49TFPedObsUL_To_Description ;
   private String AV50TFPedConLin_To_Description ;
   private String AV82Tpedobswwds_1_filterfulltext ;
   private String lV82Tpedobswwds_1_filterfulltext ;
   private String AV59PageInfo ;
   private String AV55DateInfo ;
   private String AV72AppName ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08PE3_A661PedFec ;
   private java.util.Date[] P08PE3_A662PedFecEnt ;
   private String[] P08PE3_A8155PedPerPet ;
   private String[] P08PE3_A8154PedPerDes ;
   private String[] P08PE3_A407EmprNom ;
   private boolean[] P08PE3_n407EmprNom ;
   private byte[] P08PE3_A2503PedObsUL ;
   private boolean[] P08PE3_n2503PedObsUL ;
   private int[] P08PE3_A658PedCod ;
   private String[] P08PE3_A396EmprCod ;
   private byte[] P08PE3_A5049PedConLin ;
   private boolean[] P08PE3_n5049PedConLin ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class tpedobswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Tpedobswwds_1_filterfulltext ,
                                          String AV84Tpedobswwds_3_tfemprcod_sel ,
                                          String AV83Tpedobswwds_2_tfemprcod ,
                                          int AV85Tpedobswwds_4_tfpedcod ,
                                          int AV86Tpedobswwds_5_tfpedcod_to ,
                                          byte AV87Tpedobswwds_6_tfpedobsul ,
                                          byte AV88Tpedobswwds_7_tfpedobsul_to ,
                                          String AV90Tpedobswwds_9_tfemprnom_sel ,
                                          String AV89Tpedobswwds_8_tfemprnom ,
                                          byte AV91Tpedobswwds_10_tfpedconlin ,
                                          byte AV92Tpedobswwds_11_tfpedconlin_to ,
                                          String AV94Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV93Tpedobswwds_12_tfpedperdes ,
                                          String AV96Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV95Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV97Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV98Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T1.PedPerDes, T2.EmprNom, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV82Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV84Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV85Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV86Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV88Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV91Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV92Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV93Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV95Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedObsUL" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedObsUL DESC" ;
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
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerDes" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerDes DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerPet" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerPet DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFec" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFec DESC" ;
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
                  return conditional_P08PE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

