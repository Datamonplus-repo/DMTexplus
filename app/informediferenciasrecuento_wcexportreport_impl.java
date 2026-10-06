package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informediferenciasrecuento_wcexportreport_impl extends GXWebReport
{
   public informediferenciasrecuento_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV47Title = httpContext.getMessage( "Lista de Tabla RECUEN", "") ;
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
         h8VB0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV14FilterFullText)==0) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21TFRecFec)) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV21TFRecFec, "99/99/99"), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV23TFRechora) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV23TFRechora, "99/99/99 99:99"), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFPrdNum_Sel)==0) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrdNum_Sel, "")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFPrdNum)==0) )
         {
            h8VB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPrdNum, "")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFPrdNom_Sel)==0) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFPrdNom_Sel, "")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFPrdNom)==0) )
         {
            h8VB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrdNom, "")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFRecExiTeo_To)==0) ) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Existencia Inicial", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFRecExiTeo, "ZZZZZZ9.9999")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFRecExiTeo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Existencia Inicial", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFRecExiTeo_To_Description, "")), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFRecExiTeo_To, "ZZZZZZ9.9999")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFRecExiRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFRecExiRea_To)==0) ) )
      {
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFRecExiRea, "ZZZZZZ9.9999")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFRecExiRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFRecExiRea_To_Description, "")), 25, Gx_line+0, 152, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFRecExiRea_To, "ZZZZZZ9.9999")), 152, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VB0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VB0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 30, Gx_line+10, 111, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 115, Gx_line+10, 196, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 200, Gx_line+10, 281, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 285, Gx_line+10, 447, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencia Inicial", ""), 451, Gx_line+10, 532, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 536, Gx_line+10, 617, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 621, Gx_line+10, 702, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 706, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV83Informediferenciasrecuento_wcds_1_filterfulltext = AV14FilterFullText ;
      AV84Informediferenciasrecuento_wcds_2_tfrecfec = AV21TFRecFec ;
      AV85Informediferenciasrecuento_wcds_3_tfrechora = AV23TFRechora ;
      AV86Informediferenciasrecuento_wcds_4_tfprdnum = AV25TFPrdNum ;
      AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV88Informediferenciasrecuento_wcds_6_tfprdnom = AV27TFPrdNom ;
      AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV90Informediferenciasrecuento_wcds_8_tfrecexiteo = AV29TFRecExiTeo ;
      AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to = AV30TFRecExiTeo_To ;
      AV92Informediferenciasrecuento_wcds_10_tfrecexirea = AV31TFRecExiRea ;
      AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to = AV32TFRecExiRea_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV83Informediferenciasrecuento_wcds_1_filterfulltext ,
                                           AV84Informediferenciasrecuento_wcds_2_tfrecfec ,
                                           AV85Informediferenciasrecuento_wcds_3_tfrechora ,
                                           AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV86Informediferenciasrecuento_wcds_4_tfprdnum ,
                                           AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                           AV88Informediferenciasrecuento_wcds_6_tfprdnom ,
                                           AV90Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV92Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV10Emprcod ,
                                           AV11RecFec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV83Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV83Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV83Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV86Informediferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Informediferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV88Informediferenciasrecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV88Informediferenciasrecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P08VB2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11RecFec, lV83Informediferenciasrecuento_wcds_1_filterfulltext, lV83Informediferenciasrecuento_wcds_1_filterfulltext, lV83Informediferenciasrecuento_wcds_1_filterfulltext, lV83Informediferenciasrecuento_wcds_1_filterfulltext, AV84Informediferenciasrecuento_wcds_2_tfrecfec, AV85Informediferenciasrecuento_wcds_3_tfrechora, lV86Informediferenciasrecuento_wcds_4_tfprdnum, AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel, lV88Informediferenciasrecuento_wcds_6_tfprdnom, AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel, AV90Informediferenciasrecuento_wcds_8_tfrecexiteo, AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to, AV92Informediferenciasrecuento_wcds_10_tfrecexirea, AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08VB2_A396EmprCod[0] ;
         A807RecExiRea = P08VB2_A807RecExiRea[0] ;
         A809RecExiTeo = P08VB2_A809RecExiTeo[0] ;
         A718PrdNom = P08VB2_A718PrdNom[0] ;
         A719PrdNum = P08VB2_A719PrdNum[0] ;
         A13455Rechora = P08VB2_A13455Rechora[0] ;
         A810RecFec = P08VB2_A810RecFec[0] ;
         A6573RecPreRec = P08VB2_A6573RecPreRec[0] ;
         A718PrdNom = P08VB2_A718PrdNom[0] ;
         AV15ValorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
         AV16ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
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
         h8VB0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A810RecFec, "99/99/99"), 30, Gx_line+10, 111, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A13455Rechora, "99/99/99 99:99"), 115, Gx_line+10, 196, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 200, Gx_line+10, 281, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 285, Gx_line+10, 447, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")), 451, Gx_line+10, 532, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15ValorInicial, "ZZZZZZZ9.99")), 536, Gx_line+10, 617, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")), 621, Gx_line+10, 702, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16ValorActual, "ZZZZZZZ9.99")), 706, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV17Session.getValue("InformeDiferenciasRecuento_WCGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      AV12OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV21TFRecFec = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV23TFRechora = localUtil.ctot( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV25TFPrdNum = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV26TFPrdNum_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV27TFPrdNom = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV28TFPrdNom_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV29TFRecExiTeo = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV30TFRecExiTeo_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV31TFRecExiRea = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFRecExiRea_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV11RecFec = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV49Desvios = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
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

   public void h8VB0( boolean bFoot ,
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
               AV45PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV42DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
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
            AV47Title = AV79Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV47Title = "" ;
      AV14FilterFullText = "" ;
      AV21TFRecFec = GXutil.nullDate() ;
      AV23TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV26TFPrdNum_Sel = "" ;
      AV25TFPrdNum = "" ;
      AV28TFPrdNom_Sel = "" ;
      AV27TFPrdNom = "" ;
      AV29TFRecExiTeo = DecimalUtil.ZERO ;
      AV30TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV35TFRecExiTeo_To_Description = "" ;
      AV31TFRecExiRea = DecimalUtil.ZERO ;
      AV32TFRecExiRea_To = DecimalUtil.ZERO ;
      AV36TFRecExiRea_To_Description = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV83Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      AV84Informediferenciasrecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV85Informediferenciasrecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV86Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel = "" ;
      AV88Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel = "" ;
      AV90Informediferenciasrecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV92Informediferenciasrecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV83Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      lV86Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      lV88Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      AV10Emprcod = "" ;
      AV11RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08VB2_A396EmprCod = new String[] {""} ;
      P08VB2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VB2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VB2_A718PrdNom = new String[] {""} ;
      P08VB2_A719PrdNum = new String[] {""} ;
      P08VB2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P08VB2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08VB2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV15ValorInicial = DecimalUtil.ZERO ;
      AV16ValorActual = DecimalUtil.ZERO ;
      AV17Session = httpContext.getWebSession();
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49Desvios = "" ;
      AV45PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV79Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informediferenciasrecuento_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P08VB2_A396EmprCod, P08VB2_A807RecExiRea, P08VB2_A809RecExiTeo, P08VB2_A718PrdNom, P08VB2_A719PrdNum, P08VB2_A13455Rechora, P08VB2_A810RecFec, P08VB2_A6573RecPreRec
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV79Pgmdesc = httpContext.getMessage( "Informe Diferencias Recuento_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV79Pgmdesc = httpContext.getMessage( "Informe Diferencias Recuento_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV12OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV94GXV1 ;
   private java.math.BigDecimal AV29TFRecExiTeo ;
   private java.math.BigDecimal AV30TFRecExiTeo_To ;
   private java.math.BigDecimal AV31TFRecExiRea ;
   private java.math.BigDecimal AV32TFRecExiRea_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV90Informediferenciasrecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV92Informediferenciasrecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV15ValorInicial ;
   private java.math.BigDecimal AV16ValorActual ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFPrdNum_Sel ;
   private String AV25TFPrdNum ;
   private String AV28TFPrdNom_Sel ;
   private String AV27TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV86Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel ;
   private String AV88Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV86Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String lV88Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String AV49Desvios ;
   private String AV79Pgmdesc ;
   private java.util.Date AV23TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV85Informediferenciasrecuento_wcds_3_tfrechora ;
   private java.util.Date AV21TFRecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV84Informediferenciasrecuento_wcds_2_tfrecfec ;
   private java.util.Date AV11RecFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private String AV47Title ;
   private String AV14FilterFullText ;
   private String AV35TFRecExiTeo_To_Description ;
   private String AV36TFRecExiRea_To_Description ;
   private String AV83Informediferenciasrecuento_wcds_1_filterfulltext ;
   private String lV83Informediferenciasrecuento_wcds_1_filterfulltext ;
   private String AV45PageInfo ;
   private String AV42DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08VB2_A396EmprCod ;
   private java.math.BigDecimal[] P08VB2_A807RecExiRea ;
   private java.math.BigDecimal[] P08VB2_A809RecExiTeo ;
   private String[] P08VB2_A718PrdNom ;
   private String[] P08VB2_A719PrdNum ;
   private java.util.Date[] P08VB2_A13455Rechora ;
   private java.util.Date[] P08VB2_A810RecFec ;
   private java.math.BigDecimal[] P08VB2_A6573RecPreRec ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
}

final  class informediferenciasrecuento_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Informediferenciasrecuento_wcds_1_filterfulltext ,
                                          java.util.Date AV84Informediferenciasrecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV85Informediferenciasrecuento_wcds_3_tfrechora ,
                                          String AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV86Informediferenciasrecuento_wcds_4_tfprdnum ,
                                          String AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                          String AV88Informediferenciasrecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV90Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV92Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV10Emprcod ,
                                          java.util.Date AV11RecFec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecPreRec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV83Informediferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Informediferenciasrecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Informediferenciasrecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Informediferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Informediferenciasrecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Informediferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Informediferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Informediferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Informediferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
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
                  return conditional_P08VB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               return;
      }
   }

}

