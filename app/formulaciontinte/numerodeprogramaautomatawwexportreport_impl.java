package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class numerodeprogramaautomatawwexportreport_impl extends GXWebReport
{
   public numerodeprogramaautomatawwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV36Title = httpContext.getMessage( "Lista de Numero de Programa Automata", "") ;
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
         h9UP0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV18TFMacProCod_Sel)==0) )
      {
         h9UP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº de Programa", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFMacProCod_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFMacProCod)==0) )
         {
            h9UP0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº de Programa", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFMacProCod, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFMacProDsc_Sel)==0) )
      {
         h9UP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMacProDsc_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFMacProDsc)==0) )
         {
            h9UP0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFMacProDsc, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFMacProDsc2_Sel)==0) )
      {
         h9UP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (mayor)", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFMacProDsc2_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFMacProDsc2)==0) )
         {
            h9UP0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (mayor)", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMacProDsc2, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV23TFMacNumPrg) && (0==AV24TFMacNumPrg_To) ) )
      {
         h9UP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Programa Cent.", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMacNumPrg), "ZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV25TFMacNumPrg_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Programa Cent.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFMacNumPrg_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMacNumPrg_To), "ZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9UP0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9UP0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº de Programa", ""), 30, Gx_line+10, 135, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 139, Gx_line+10, 351, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion (mayor)", ""), 355, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Programa Cent.", ""), 571, Gx_line+10, 677, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº de Formulas", ""), 681, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV17TFMacProCod ;
      AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV18TFMacProCod_Sel ;
      AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV19TFMacProDsc ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV20TFMacProDsc_Sel ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV21TFMacProDsc2 ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV22TFMacProDsc2_Sel ;
      AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV23TFMacNumPrg ;
      AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV24TFMacNumPrg_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09UP2 */
      pr_default.execute(0, new Object[] {lV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6096MacNumPrg = P09UP2_A6096MacNumPrg[0] ;
         A6231MacProDsc2 = P09UP2_A6231MacProDsc2[0] ;
         A1515MacProDsc = P09UP2_A1515MacProDsc[0] ;
         A1514MacProCod = P09UP2_A1514MacProCod[0] ;
         A396EmprCod = P09UP2_A396EmprCod[0] ;
         GXt_int2 = AV12NumerodeFormulas ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A1514MacProCod ;
         GXv_int5[0] = (byte)(2) ;
         GXv_int6[0] = GXt_int2 ;
         new app.pmacpro(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5, GXv_int6) ;
         numerodeprogramaautomatawwexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
         numerodeprogramaautomatawwexportreport_impl.this.A1514MacProCod = GXv_char4[0] ;
         numerodeprogramaautomatawwexportreport_impl.this.GXt_int2 = GXv_int6[0] ;
         AV12NumerodeFormulas = (short)(GXt_int2) ;
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
         h9UP0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1514MacProCod, "")), 30, Gx_line+10, 135, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), 139, Gx_line+10, 351, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6231MacProDsc2, "")), 355, Gx_line+10, 567, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9")), 571, Gx_line+10, 677, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12NumerodeFormulas), "ZZZ9")), 681, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD") == 0 )
         {
            AV17TFMacProCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD_SEL") == 0 )
         {
            AV18TFMacProCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC") == 0 )
         {
            AV19TFMacProDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC_SEL") == 0 )
         {
            AV20TFMacProDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2") == 0 )
         {
            AV21TFMacProDsc2 = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2_SEL") == 0 )
         {
            AV22TFMacProDsc2_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACNUMPRG") == 0 )
         {
            AV23TFMacNumPrg = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFMacNumPrg_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
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

   public void h9UP0( boolean bFoot ,
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
               AV34PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV31DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV36Title = AV40Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV36Title = "" ;
      AV18TFMacProCod_Sel = "" ;
      AV17TFMacProCod = "" ;
      AV20TFMacProDsc_Sel = "" ;
      AV19TFMacProDsc = "" ;
      AV22TFMacProDsc2_Sel = "" ;
      AV21TFMacProDsc2 = "" ;
      AV25TFMacNumPrg_To_Description = "" ;
      A396EmprCod = "" ;
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = "" ;
      AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = "" ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = "" ;
      scmdbuf = "" ;
      lV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      lV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      lV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      P09UP2_A6096MacNumPrg = new int[1] ;
      P09UP2_A6231MacProDsc2 = new String[] {""} ;
      P09UP2_A1515MacProDsc = new String[] {""} ;
      P09UP2_A1514MacProCod = new String[] {""} ;
      P09UP2_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new int[1] ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34PageInfo = "" ;
      AV31DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV40Pgmdesc = "" ;
      AV29AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomatawwexportreport__default(),
         new Object[] {
             new Object[] {
            P09UP2_A6096MacNumPrg, P09UP2_A6231MacProDsc2, P09UP2_A1515MacProDsc, P09UP2_A1514MacProCod, P09UP2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV40Pgmdesc = httpContext.getMessage( "Informe de Programas", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV40Pgmdesc = httpContext.getMessage( "Informe de Programas", "") ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short AV12NumerodeFormulas ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV23TFMacNumPrg ;
   private int AV24TFMacNumPrg_To ;
   private int A6096MacNumPrg ;
   private int AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ;
   private int AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ;
   private int GXt_int2 ;
   private int GXv_int6[] ;
   private int AV52GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFMacProCod_Sel ;
   private String AV17TFMacProCod ;
   private String AV20TFMacProDsc_Sel ;
   private String AV19TFMacProDsc ;
   private String AV22TFMacProDsc2_Sel ;
   private String AV21TFMacProDsc2 ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A6231MacProDsc2 ;
   private String AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ;
   private String AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ;
   private String AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ;
   private String scmdbuf ;
   private String lV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String lV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String lV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV40Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV36Title ;
   private String AV25TFMacNumPrg_To_Description ;
   private String AV34PageInfo ;
   private String AV31DateInfo ;
   private String AV29AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private int[] P09UP2_A6096MacNumPrg ;
   private String[] P09UP2_A6231MacProDsc2 ;
   private String[] P09UP2_A1515MacProDsc ;
   private String[] P09UP2_A1514MacProCod ;
   private String[] P09UP2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class numerodeprogramaautomatawwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[8];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT MacNumPrg, MacProDsc2, MacProDsc, MacProCod, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc2" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MacNumPrg" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacNumPrg DESC" ;
      }
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P09UP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
      }
   }

}

