package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class crearinventario_recuento_wcexportreport_impl extends GXWebReport
{
   public crearinventario_recuento_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV33Title = httpContext.getMessage( "Lista de Tabla RECUEN", "") ;
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
         h93R0( true, 0) ;
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
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV20TFPrdNum_Sel)==0) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum_Sel, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPrdNum)==0) )
         {
            h93R0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPrdNum, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFPrdNom_Sel)==0) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrdNom_Sel, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFPrdNom)==0) )
         {
            h93R0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPrdNom, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFRecExiTeo_To)==0) ) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Existencia Teorica Almacen", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFRecExiTeo, "ZZZZZZ9.9999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFRecExiTeo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Existencia Teorica Almacen", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFRecExiTeo_To_Description, "")), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TFRecExiTeo_To, "ZZZZZZ9.9999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFRecExiRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFRecExiRea_To)==0) ) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Existencia Real Almacen", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFRecExiRea, "ZZZZZZ9.9999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFRecExiRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Existencia Real Almacen", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFRecExiRea_To_Description, "")), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFRecExiRea_To, "ZZZZZZ9.9999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFRecPreRec)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFRecPreRec_To)==0) ) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Mov Recuento", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFRecPreRec, "ZZZZ9.99999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFRecPreRec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Mov Recuento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFRecPreRec_To_Description, "")), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFRecPreRec_To, "ZZZZ9.99999")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFRecUbic_Sel)==0) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFRecUbic_Sel, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFRecUbic)==0) )
         {
            h93R0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFRecUbic, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV47TFRecLot_Sel)==0) )
      {
         h93R0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Lote Producto", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFRecLot_Sel, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFRecLot)==0) )
         {
            h93R0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote Producto", ""), 25, Gx_line+0, 207, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFRecLot, "")), 207, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h93R0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h93R0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 103, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 107, Gx_line+10, 253, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencia Teorica Almacen", ""), 257, Gx_line+10, 330, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencia Real Almacen", ""), 334, Gx_line+10, 407, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Mov Recuento", ""), 411, Gx_line+10, 484, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 488, Gx_line+10, 635, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Lote Producto", ""), 639, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV57Crearinventario_recuento_wcds_1_filterfulltext = AV12FilterFullText ;
      AV58Crearinventario_recuento_wcds_2_tfprdnum = AV19TFPrdNum ;
      AV59Crearinventario_recuento_wcds_3_tfprdnum_sel = AV20TFPrdNum_Sel ;
      AV60Crearinventario_recuento_wcds_4_tfprdnom = AV21TFPrdNom ;
      AV61Crearinventario_recuento_wcds_5_tfprdnom_sel = AV22TFPrdNom_Sel ;
      AV62Crearinventario_recuento_wcds_6_tfrecexiteo = AV38TFRecExiTeo ;
      AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV39TFRecExiTeo_To ;
      AV64Crearinventario_recuento_wcds_8_tfrecexirea = AV40TFRecExiRea ;
      AV65Crearinventario_recuento_wcds_9_tfrecexirea_to = AV41TFRecExiRea_To ;
      AV66Crearinventario_recuento_wcds_10_tfrecprerec = AV42TFRecPreRec ;
      AV67Crearinventario_recuento_wcds_11_tfrecprerec_to = AV43TFRecPreRec_To ;
      AV68Crearinventario_recuento_wcds_12_tfrecubic = AV44TFRecUbic ;
      AV69Crearinventario_recuento_wcds_13_tfrecubic_sel = AV45TFRecUbic_Sel ;
      AV70Crearinventario_recuento_wcds_14_tfreclot = AV46TFRecLot ;
      AV71Crearinventario_recuento_wcds_15_tfreclot_sel = AV47TFRecLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV59Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV58Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV61Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV60Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV62Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV64Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV65Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV66Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV67Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV69Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV68Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV71Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV70Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV35Emprcod ,
                                           AV36RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV58Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV58Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV60Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV60Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV68Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV68Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV70Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV70Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093R2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, AV36RecFec, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_1_filterfulltext, lV58Crearinventario_recuento_wcds_2_tfprdnum, AV59Crearinventario_recuento_wcds_3_tfprdnum_sel, lV60Crearinventario_recuento_wcds_4_tfprdnom, AV61Crearinventario_recuento_wcds_5_tfprdnom_sel, AV62Crearinventario_recuento_wcds_6_tfrecexiteo, AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV64Crearinventario_recuento_wcds_8_tfrecexirea, AV65Crearinventario_recuento_wcds_9_tfrecexirea_to, AV66Crearinventario_recuento_wcds_10_tfrecprerec, AV67Crearinventario_recuento_wcds_11_tfrecprerec_to, lV68Crearinventario_recuento_wcds_12_tfrecubic, AV69Crearinventario_recuento_wcds_13_tfrecubic_sel, lV70Crearinventario_recuento_wcds_14_tfreclot, AV71Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P093R2_A810RecFec[0] ;
         A396EmprCod = P093R2_A396EmprCod[0] ;
         A12285RecLot = P093R2_A12285RecLot[0] ;
         A11195RecUbic = P093R2_A11195RecUbic[0] ;
         A6573RecPreRec = P093R2_A6573RecPreRec[0] ;
         A807RecExiRea = P093R2_A807RecExiRea[0] ;
         A809RecExiTeo = P093R2_A809RecExiTeo[0] ;
         A718PrdNom = P093R2_A718PrdNom[0] ;
         A719PrdNum = P093R2_A719PrdNum[0] ;
         A718PrdNom = P093R2_A718PrdNom[0] ;
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
         h93R0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 103, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 107, Gx_line+10, 253, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")), 257, Gx_line+10, 330, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")), 334, Gx_line+10, 407, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6573RecPreRec, "ZZZZ9.99999")), 411, Gx_line+10, 484, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11195RecUbic, "")), 488, Gx_line+10, 635, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12285RecLot, "")), 639, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("CrearInventario_recuento_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CrearInventario_recuento_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("CrearInventario_recuento_WCGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV19TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV20TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV21TFPrdNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV22TFPrdNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV38TFRecExiTeo = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFRecExiTeo_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV40TFRecExiRea = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFRecExiRea_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV42TFRecPreRec = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFRecPreRec_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC") == 0 )
         {
            AV44TFRecUbic = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC_SEL") == 0 )
         {
            AV45TFRecUbic_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT") == 0 )
         {
            AV46TFRecLot = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT_SEL") == 0 )
         {
            AV47TFRecLot_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV36RecFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECHORA") == 0 )
         {
            AV37RecHora = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
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

   public void h93R0( boolean bFoot ,
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
               AV31PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV28DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV33Title = AV53Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV33Title = "" ;
      AV12FilterFullText = "" ;
      AV20TFPrdNum_Sel = "" ;
      AV19TFPrdNum = "" ;
      AV22TFPrdNom_Sel = "" ;
      AV21TFPrdNom = "" ;
      AV38TFRecExiTeo = DecimalUtil.ZERO ;
      AV39TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV48TFRecExiTeo_To_Description = "" ;
      AV40TFRecExiRea = DecimalUtil.ZERO ;
      AV41TFRecExiRea_To = DecimalUtil.ZERO ;
      AV49TFRecExiRea_To_Description = "" ;
      AV42TFRecPreRec = DecimalUtil.ZERO ;
      AV43TFRecPreRec_To = DecimalUtil.ZERO ;
      AV50TFRecPreRec_To_Description = "" ;
      AV45TFRecUbic_Sel = "" ;
      AV44TFRecUbic = "" ;
      AV47TFRecLot_Sel = "" ;
      AV46TFRecLot = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      AV57Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      AV58Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      AV59Crearinventario_recuento_wcds_3_tfprdnum_sel = "" ;
      AV60Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      AV61Crearinventario_recuento_wcds_5_tfprdnom_sel = "" ;
      AV62Crearinventario_recuento_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV64Crearinventario_recuento_wcds_8_tfrecexirea = DecimalUtil.ZERO ;
      AV65Crearinventario_recuento_wcds_9_tfrecexirea_to = DecimalUtil.ZERO ;
      AV66Crearinventario_recuento_wcds_10_tfrecprerec = DecimalUtil.ZERO ;
      AV67Crearinventario_recuento_wcds_11_tfrecprerec_to = DecimalUtil.ZERO ;
      AV68Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      AV69Crearinventario_recuento_wcds_13_tfrecubic_sel = "" ;
      AV70Crearinventario_recuento_wcds_14_tfreclot = "" ;
      AV71Crearinventario_recuento_wcds_15_tfreclot_sel = "" ;
      scmdbuf = "" ;
      lV57Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      lV58Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      lV60Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      lV68Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      lV70Crearinventario_recuento_wcds_14_tfreclot = "" ;
      AV35Emprcod = "" ;
      AV36RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      P093R2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093R2_A396EmprCod = new String[] {""} ;
      P093R2_A12285RecLot = new String[] {""} ;
      P093R2_A11195RecUbic = new String[] {""} ;
      P093R2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093R2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093R2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093R2_A718PrdNom = new String[] {""} ;
      P093R2_A719PrdNum = new String[] {""} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV31PageInfo = "" ;
      AV28DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV53Pgmdesc = "" ;
      AV26AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.crearinventario_recuento_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P093R2_A810RecFec, P093R2_A396EmprCod, P093R2_A12285RecLot, P093R2_A11195RecUbic, P093R2_A6573RecPreRec, P093R2_A807RecExiRea, P093R2_A809RecExiTeo, P093R2_A718PrdNom, P093R2_A719PrdNum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Crear Inventario_recuento_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Crear Inventario_recuento_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV72GXV1 ;
   private java.math.BigDecimal AV38TFRecExiTeo ;
   private java.math.BigDecimal AV39TFRecExiTeo_To ;
   private java.math.BigDecimal AV40TFRecExiRea ;
   private java.math.BigDecimal AV41TFRecExiRea_To ;
   private java.math.BigDecimal AV42TFRecPreRec ;
   private java.math.BigDecimal AV43TFRecPreRec_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV62Crearinventario_recuento_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV64Crearinventario_recuento_wcds_8_tfrecexirea ;
   private java.math.BigDecimal AV65Crearinventario_recuento_wcds_9_tfrecexirea_to ;
   private java.math.BigDecimal AV66Crearinventario_recuento_wcds_10_tfrecprerec ;
   private java.math.BigDecimal AV67Crearinventario_recuento_wcds_11_tfrecprerec_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV20TFPrdNum_Sel ;
   private String AV19TFPrdNum ;
   private String AV22TFPrdNom_Sel ;
   private String AV21TFPrdNom ;
   private String AV45TFRecUbic_Sel ;
   private String AV44TFRecUbic ;
   private String AV47TFRecLot_Sel ;
   private String AV46TFRecLot ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private String AV58Crearinventario_recuento_wcds_2_tfprdnum ;
   private String AV59Crearinventario_recuento_wcds_3_tfprdnum_sel ;
   private String AV60Crearinventario_recuento_wcds_4_tfprdnom ;
   private String AV61Crearinventario_recuento_wcds_5_tfprdnom_sel ;
   private String AV68Crearinventario_recuento_wcds_12_tfrecubic ;
   private String AV69Crearinventario_recuento_wcds_13_tfrecubic_sel ;
   private String AV70Crearinventario_recuento_wcds_14_tfreclot ;
   private String AV71Crearinventario_recuento_wcds_15_tfreclot_sel ;
   private String scmdbuf ;
   private String lV58Crearinventario_recuento_wcds_2_tfprdnum ;
   private String lV60Crearinventario_recuento_wcds_4_tfprdnom ;
   private String lV68Crearinventario_recuento_wcds_12_tfrecubic ;
   private String lV70Crearinventario_recuento_wcds_14_tfreclot ;
   private String AV35Emprcod ;
   private String A396EmprCod ;
   private String AV53Pgmdesc ;
   private java.util.Date AV37RecHora ;
   private java.util.Date AV36RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV33Title ;
   private String AV12FilterFullText ;
   private String AV48TFRecExiTeo_To_Description ;
   private String AV49TFRecExiRea_To_Description ;
   private String AV50TFRecPreRec_To_Description ;
   private String AV57Crearinventario_recuento_wcds_1_filterfulltext ;
   private String lV57Crearinventario_recuento_wcds_1_filterfulltext ;
   private String AV31PageInfo ;
   private String AV28DateInfo ;
   private String AV26AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P093R2_A810RecFec ;
   private String[] P093R2_A396EmprCod ;
   private String[] P093R2_A12285RecLot ;
   private String[] P093R2_A11195RecUbic ;
   private java.math.BigDecimal[] P093R2_A6573RecPreRec ;
   private java.math.BigDecimal[] P093R2_A807RecExiRea ;
   private java.math.BigDecimal[] P093R2_A809RecExiTeo ;
   private String[] P093R2_A718PrdNom ;
   private String[] P093R2_A719PrdNum ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class crearinventario_recuento_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV59Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV58Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV61Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV60Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV64Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV65Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV66Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV67Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV69Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV68Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV71Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV70Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV35Emprcod ,
                                          java.util.Date AV36RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecFec, T1.EmprCod, T1.RecLot, T1.RecUbic, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV57Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV68Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV70Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUbic" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUbic DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLot" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLot DESC" ;
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
                  return conditional_P093R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               return;
      }
   }

}

