package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tintenswwexportreport_impl extends GXWebReport
{
   public tintenswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV30Title = httpContext.getMessage( "Lista de Intensidad", "") ;
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
         h8H30( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV36FilterFullText)==0) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36FilterFullText, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFIntCod) && (0==AV17TFIntCod_To) ) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFIntCod), "Z9")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV20TFIntCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFIntCod_To_Description, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFIntCod_To), "Z9")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFIntDsc_Sel)==0) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFIntDsc_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18TFIntDsc)==0) )
         {
            h8H30( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFIntDsc, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFIntAct_Sel)==0) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Activa?", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFIntAct_Sel, "")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV44TFIntOrder) && (0==AV45TFIntOrder_To) ) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFIntOrder), "ZZZ9")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFIntOrder_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFIntOrder_To_Description, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFIntOrder_To), "ZZZ9")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFIntLava)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFIntLava_To)==0) ) )
      {
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tiempo de Lavado(hh,mm)", ""), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TFIntLava, "ZZZ9.99")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFIntLava_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tiempo de Lavado(hh,mm)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8H30( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFIntLava_To_Description, "")), 25, Gx_line+0, 202, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TFIntLava_To, "ZZZ9.99")), 202, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8H30( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8H30( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 30, Gx_line+10, 153, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 157, Gx_line+10, 403, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Activa?", ""), 407, Gx_line+10, 531, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 535, Gx_line+10, 659, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tiempo de Lavado(hh,mm)", ""), 663, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV57Formulaciontinte_tintenswwds_1_filterfulltext = AV36FilterFullText ;
      AV58Formulaciontinte_tintenswwds_2_tfintcod = AV16TFIntCod ;
      AV59Formulaciontinte_tintenswwds_3_tfintcod_to = AV17TFIntCod_To ;
      AV60Formulaciontinte_tintenswwds_4_tfintdsc = AV18TFIntDsc ;
      AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel = AV19TFIntDsc_Sel ;
      AV62Formulaciontinte_tintenswwds_6_tfintact_sel = AV50TFIntAct_Sel ;
      AV63Formulaciontinte_tintenswwds_7_tfintorder = AV44TFIntOrder ;
      AV64Formulaciontinte_tintenswwds_8_tfintorder_to = AV45TFIntOrder_To ;
      AV65Formulaciontinte_tintenswwds_9_tfintlava = AV46TFIntLava ;
      AV66Formulaciontinte_tintenswwds_10_tfintlava_to = AV47TFIntLava_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Formulaciontinte_tintenswwds_1_filterfulltext ,
                                           Byte.valueOf(AV58Formulaciontinte_tintenswwds_2_tfintcod) ,
                                           Byte.valueOf(AV59Formulaciontinte_tintenswwds_3_tfintcod_to) ,
                                           AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                           AV60Formulaciontinte_tintenswwds_4_tfintdsc ,
                                           AV62Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                           Short.valueOf(AV63Formulaciontinte_tintenswwds_7_tfintorder) ,
                                           Short.valueOf(AV64Formulaciontinte_tintenswwds_8_tfintorder_to) ,
                                           AV65Formulaciontinte_tintenswwds_9_tfintlava ,
                                           AV66Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Short.valueOf(A13296IntOrder) ,
                                           A5991IntLava ,
                                           A14255IntAct ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV57Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_tintenswwds_4_tfintdsc = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_tintenswwds_4_tfintdsc), 30, "%") ;
      /* Using cursor P08H32 */
      pr_default.execute(0, new Object[] {lV57Formulaciontinte_tintenswwds_1_filterfulltext, lV57Formulaciontinte_tintenswwds_1_filterfulltext, lV57Formulaciontinte_tintenswwds_1_filterfulltext, lV57Formulaciontinte_tintenswwds_1_filterfulltext, Byte.valueOf(AV58Formulaciontinte_tintenswwds_2_tfintcod), Byte.valueOf(AV59Formulaciontinte_tintenswwds_3_tfintcod_to), lV60Formulaciontinte_tintenswwds_4_tfintdsc, AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel, AV62Formulaciontinte_tintenswwds_6_tfintact_sel, Short.valueOf(AV63Formulaciontinte_tintenswwds_7_tfintorder), Short.valueOf(AV64Formulaciontinte_tintenswwds_8_tfintorder_to), AV65Formulaciontinte_tintenswwds_9_tfintlava, AV66Formulaciontinte_tintenswwds_10_tfintlava_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5991IntLava = P08H32_A5991IntLava[0] ;
         n5991IntLava = P08H32_n5991IntLava[0] ;
         A13296IntOrder = P08H32_A13296IntOrder[0] ;
         n13296IntOrder = P08H32_n13296IntOrder[0] ;
         A14255IntAct = P08H32_A14255IntAct[0] ;
         A584IntDsc = P08H32_A584IntDsc[0] ;
         n584IntDsc = P08H32_n584IntDsc[0] ;
         A583IntCod = P08H32_A583IntCod[0] ;
         A396EmprCod = P08H32_A396EmprCod[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8H30( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 30, Gx_line+10, 153, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 157, Gx_line+10, 403, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14255IntAct, "")), 407, Gx_line+10, 531, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13296IntOrder), "ZZZ9")), 535, Gx_line+10, 659, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5991IntLava, "ZZZ9.99")), 663, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV12Session.getValue("FormulacionTinte.TINTENSWWGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV16TFIntCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFIntCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV18TFIntDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV19TFIntDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV50TFIntAct_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTORDER") == 0 )
         {
            AV44TFIntOrder = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFIntOrder_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTLAVA") == 0 )
         {
            AV46TFIntLava = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFIntLava_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
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

   public void h8H30( boolean bFoot ,
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
               AV27PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV23DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV30Title = AV53Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV30Title = "" ;
      AV36FilterFullText = "" ;
      AV20TFIntCod_To_Description = "" ;
      AV19TFIntDsc_Sel = "" ;
      AV18TFIntDsc = "" ;
      AV50TFIntAct_Sel = "" ;
      AV48TFIntOrder_To_Description = "" ;
      AV46TFIntLava = DecimalUtil.ZERO ;
      AV47TFIntLava_To = DecimalUtil.ZERO ;
      AV49TFIntLava_To_Description = "" ;
      A584IntDsc = "" ;
      A14255IntAct = "" ;
      A5991IntLava = DecimalUtil.ZERO ;
      AV57Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      AV60Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel = "" ;
      AV62Formulaciontinte_tintenswwds_6_tfintact_sel = "" ;
      AV65Formulaciontinte_tintenswwds_9_tfintlava = DecimalUtil.ZERO ;
      AV66Formulaciontinte_tintenswwds_10_tfintlava_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      lV60Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      P08H32_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08H32_n5991IntLava = new boolean[] {false} ;
      P08H32_A13296IntOrder = new short[1] ;
      P08H32_n13296IntOrder = new boolean[] {false} ;
      P08H32_A14255IntAct = new String[] {""} ;
      P08H32_A584IntDsc = new String[] {""} ;
      P08H32_n584IntDsc = new boolean[] {false} ;
      P08H32_A583IntCod = new byte[1] ;
      P08H32_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV27PageInfo = "" ;
      AV23DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV53Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintenswwexportreport__default(),
         new Object[] {
             new Object[] {
            P08H32_A5991IntLava, P08H32_n5991IntLava, P08H32_A13296IntOrder, P08H32_n13296IntOrder, P08H32_A14255IntAct, P08H32_A584IntDsc, P08H32_n584IntDsc, P08H32_A583IntCod, P08H32_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Listado Intensidades", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Listado Intensidades", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TFIntCod ;
   private byte AV17TFIntCod_To ;
   private byte A583IntCod ;
   private byte AV58Formulaciontinte_tintenswwds_2_tfintcod ;
   private byte AV59Formulaciontinte_tintenswwds_3_tfintcod_to ;
   private short gxcookieaux ;
   private short AV44TFIntOrder ;
   private short AV45TFIntOrder_To ;
   private short A13296IntOrder ;
   private short AV63Formulaciontinte_tintenswwds_7_tfintorder ;
   private short AV64Formulaciontinte_tintenswwds_8_tfintorder_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV67GXV1 ;
   private java.math.BigDecimal AV46TFIntLava ;
   private java.math.BigDecimal AV47TFIntLava_To ;
   private java.math.BigDecimal A5991IntLava ;
   private java.math.BigDecimal AV65Formulaciontinte_tintenswwds_9_tfintlava ;
   private java.math.BigDecimal AV66Formulaciontinte_tintenswwds_10_tfintlava_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19TFIntDsc_Sel ;
   private String AV18TFIntDsc ;
   private String AV50TFIntAct_Sel ;
   private String A584IntDsc ;
   private String A14255IntAct ;
   private String AV60Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel ;
   private String AV62Formulaciontinte_tintenswwds_6_tfintact_sel ;
   private String scmdbuf ;
   private String lV60Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String A396EmprCod ;
   private String AV53Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n5991IntLava ;
   private boolean n13296IntOrder ;
   private boolean n584IntDsc ;
   private String AV30Title ;
   private String AV36FilterFullText ;
   private String AV20TFIntCod_To_Description ;
   private String AV48TFIntOrder_To_Description ;
   private String AV49TFIntLava_To_Description ;
   private String AV57Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String lV57Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String AV27PageInfo ;
   private String AV23DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08H32_A5991IntLava ;
   private boolean[] P08H32_n5991IntLava ;
   private short[] P08H32_A13296IntOrder ;
   private boolean[] P08H32_n13296IntOrder ;
   private String[] P08H32_A14255IntAct ;
   private String[] P08H32_A584IntDsc ;
   private boolean[] P08H32_n584IntDsc ;
   private byte[] P08H32_A583IntCod ;
   private String[] P08H32_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class tintenswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Formulaciontinte_tintenswwds_1_filterfulltext ,
                                          byte AV58Formulaciontinte_tintenswwds_2_tfintcod ,
                                          byte AV59Formulaciontinte_tintenswwds_3_tfintcod_to ,
                                          String AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                          String AV60Formulaciontinte_tintenswwds_4_tfintdsc ,
                                          String AV62Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                          short AV63Formulaciontinte_tintenswwds_7_tfintorder ,
                                          short AV64Formulaciontinte_tintenswwds_8_tfintorder_to ,
                                          java.math.BigDecimal AV65Formulaciontinte_tintenswwds_9_tfintlava ,
                                          java.math.BigDecimal AV66Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          short A13296IntOrder ,
                                          java.math.BigDecimal A5991IntLava ,
                                          String A14255IntAct ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT IntLava, IntOrder, IntAct, IntDsc, IntCod, EmprCod FROM TXPINTENS" ;
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_tintenswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(IntCod,'90'), 2) like '%' || ?) or ( UPPER(IntDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(IntOrder,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(IntLava,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tintenswwds_2_tfintcod) )
      {
         addWhere(sWhereString, "(IntCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_tintenswwds_3_tfintcod_to) )
      {
         addWhere(sWhereString, "(IntCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_tintenswwds_4_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(IntDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tintenswwds_6_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(IntAct = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_tintenswwds_7_tfintorder) )
      {
         addWhere(sWhereString, "(IntOrder >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_tintenswwds_8_tfintorder_to) )
      {
         addWhere(sWhereString, "(IntOrder <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Formulaciontinte_tintenswwds_9_tfintlava)==0) )
      {
         addWhere(sWhereString, "(IntLava >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_tintenswwds_10_tfintlava_to)==0) )
      {
         addWhere(sWhereString, "(IntLava <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY IntCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY IntDsc" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY IntAct" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY IntOrder" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntOrder DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY IntLava" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntLava DESC" ;
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
                  return conditional_P08H32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               return;
      }
   }

}

