package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanualexportreport_impl extends GXWebReport
{
   public cierrerecetastinte_adicionesmanualexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV47Title = httpContext.getMessage( "Lista de LINEAS AÑADIDAS (BALANZAS)", "") ;
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
         h94T0( true, 0) ;
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
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFRecLinMAL) && (0==AV18TFRecLinMAL_To) ) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("#", 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFRecLinMAL), "ZZZ9")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFRecLinMAL_To_Description = GXutil.format( "%1 (%2)", "#", httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFRecLinMAL_To_Description, "")), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFRecLinMAL_To), "ZZZ9")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFRecNumAny) && (0==AV20TFRecNumAny_To) ) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("##", 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFRecNumAny), "Z9")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFRecNumAny_To_Description = GXutil.format( "%1 (%2)", "##", httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFRecNumAny_To_Description, "")), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFRecNumAny_To), "Z9")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFPrdNum_Sel)==0) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrdNum_Sel, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFPrdNum)==0) )
         {
            h94T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPrdNum, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV24TFPrdNom_Sel)==0) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPrdNom_Sel, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFPrdNom)==0) )
         {
            h94T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrdNom, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPrdCFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPrdCFin_To)==0) ) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFPrdCFin, "ZZZZZZ9.999")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFPrdCFin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFPrdCFin_To_Description, "")), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFPrdCFin_To, "ZZZZZZ9.999")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFLanyUsr_Sel)==0) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFLanyUsr_Sel, "@!")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFLanyUsr)==0) )
         {
            h94T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFLanyUsr, "@!")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV29TFLanyFec) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Hora", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV29TFLanyFec, "99/99/99 99:99:99"), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFLanyLote_Sel)==0) )
      {
         h94T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFLanyLote_Sel, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFLanyLote)==0) )
         {
            h94T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 25, Gx_line+0, 114, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFLanyLote, "")), 114, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h94T0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h94T0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("#", 30, Gx_line+10, 102, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText("##", 106, Gx_line+10, 179, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 183, Gx_line+10, 256, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 260, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 410, Gx_line+10, 483, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 487, Gx_line+10, 560, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Hora", ""), 564, Gx_line+10, 637, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 641, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV12FilterFullText ;
      AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV17TFRecLinMAL ;
      AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV18TFRecLinMAL_To ;
      AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV19TFRecNumAny ;
      AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV20TFRecNumAny_To ;
      AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV21TFPrdNum ;
      AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV22TFPrdNum_Sel ;
      AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV23TFPrdNom ;
      AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV24TFPrdNom_Sel ;
      AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV25TFPrdCFin ;
      AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV26TFPrdCFin_To ;
      AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV27TFLanyUsr ;
      AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV28TFLanyUsr_Sel ;
      AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV29TFLanyFec ;
      AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV31TFLanyLote ;
      AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV32TFLanyLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV49Emprcod ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           AV52Barcodpar ,
                                           Short.valueOf(AV53RecLinMAL) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV74Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094T2 */
      pr_default.execute(0, new Object[] {AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar, Short.valueOf(AV53RecLinMAL), lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV74Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P094T2_A130BarCodPar[0] ;
         A132BarCodReo = P094T2_A132BarCodReo[0] ;
         A129BarCod = P094T2_A129BarCod[0] ;
         A396EmprCod = P094T2_A396EmprCod[0] ;
         A5807LanyLote = P094T2_A5807LanyLote[0] ;
         n5807LanyLote = P094T2_n5807LanyLote[0] ;
         A4579LanyFec = P094T2_A4579LanyFec[0] ;
         n4579LanyFec = P094T2_n4579LanyFec[0] ;
         A4578LanyUsr = P094T2_A4578LanyUsr[0] ;
         n4578LanyUsr = P094T2_n4578LanyUsr[0] ;
         A1378PrdCFin = P094T2_A1378PrdCFin[0] ;
         n1378PrdCFin = P094T2_n1378PrdCFin[0] ;
         A718PrdNom = P094T2_A718PrdNom[0] ;
         A719PrdNum = P094T2_A719PrdNum[0] ;
         A1377RecNumAny = P094T2_A1377RecNumAny[0] ;
         A2808RecLinMAL = P094T2_A2808RecLinMAL[0] ;
         A718PrdNom = P094T2_A718PrdNom[0] ;
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
         h94T0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2808RecLinMAL), "ZZZ9")), 30, Gx_line+10, 102, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1377RecNumAny), "Z9")), 106, Gx_line+10, 179, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 183, Gx_line+10, 256, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 260, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1378PrdCFin, "ZZZZZZ9.999")), 410, Gx_line+10, 483, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4578LanyUsr, "@!")), 487, Gx_line+10, 560, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4579LanyFec, "99/99/99 99:99:99"), 564, Gx_line+10, 637, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5807LanyLote, "")), 641, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAL") == 0 )
         {
            AV17TFRecLinMAL = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFRecLinMAL_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV19TFRecNumAny = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFRecNumAny_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV21TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV22TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV23TFPrdNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV24TFPrdNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV25TFPrdCFin = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV26TFPrdCFin_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR") == 0 )
         {
            AV27TFLanyUsr = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR_SEL") == 0 )
         {
            AV28TFLanyUsr_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYFEC") == 0 )
         {
            AV29TFLanyFec = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV31TFLanyLote = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV32TFLanyLote_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
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

   public void h94T0( boolean bFoot ,
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
            AV47Title = AV56Pgmdesc ;
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
      AV12FilterFullText = "" ;
      AV33TFRecLinMAL_To_Description = "" ;
      AV34TFRecNumAny_To_Description = "" ;
      AV22TFPrdNum_Sel = "" ;
      AV21TFPrdNum = "" ;
      AV24TFPrdNom_Sel = "" ;
      AV23TFPrdNom = "" ;
      AV25TFPrdCFin = DecimalUtil.ZERO ;
      AV26TFPrdCFin_To = DecimalUtil.ZERO ;
      AV35TFPrdCFin_To_Description = "" ;
      AV28TFLanyUsr_Sel = "" ;
      AV27TFLanyUsr = "" ;
      AV29TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV32TFLanyLote_Sel = "" ;
      AV31TFLanyLote = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = "" ;
      AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = "" ;
      AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = DecimalUtil.ZERO ;
      AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = DecimalUtil.ZERO ;
      AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = "" ;
      AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = "" ;
      scmdbuf = "" ;
      lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      lV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      lV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      lV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      lV74Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV49Emprcod = "" ;
      AV52Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P094T2_A130BarCodPar = new String[] {""} ;
      P094T2_A132BarCodReo = new byte[1] ;
      P094T2_A129BarCod = new int[1] ;
      P094T2_A396EmprCod = new String[] {""} ;
      P094T2_A5807LanyLote = new String[] {""} ;
      P094T2_n5807LanyLote = new boolean[] {false} ;
      P094T2_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094T2_n4579LanyFec = new boolean[] {false} ;
      P094T2_A4578LanyUsr = new String[] {""} ;
      P094T2_n4578LanyUsr = new boolean[] {false} ;
      P094T2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094T2_n1378PrdCFin = new boolean[] {false} ;
      P094T2_A718PrdNom = new String[] {""} ;
      P094T2_A719PrdNum = new String[] {""} ;
      P094T2_A1377RecNumAny = new byte[1] ;
      P094T2_A2808RecLinMAL = new short[1] ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV42DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV56Pgmdesc = "" ;
      AV40AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanualexportreport__default(),
         new Object[] {
             new Object[] {
            P094T2_A130BarCodPar, P094T2_A132BarCodReo, P094T2_A129BarCod, P094T2_A396EmprCod, P094T2_A5807LanyLote, P094T2_n5807LanyLote, P094T2_A4579LanyFec, P094T2_n4579LanyFec, P094T2_A4578LanyUsr, P094T2_n4578LanyUsr,
            P094T2_A1378PrdCFin, P094T2_n1378PrdCFin, P094T2_A718PrdNom, P094T2_A719PrdNum, P094T2_A1377RecNumAny, P094T2_A2808RecLinMAL
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Cierre Recetas Tinte_Adiciones Manual Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Cierre Recetas Tinte_Adiciones Manual Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV19TFRecNumAny ;
   private byte AV20TFRecNumAny_To ;
   private byte A1377RecNumAny ;
   private byte AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ;
   private byte AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ;
   private byte AV51Barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV17TFRecLinMAL ;
   private short AV18TFRecLinMAL_To ;
   private short A2808RecLinMAL ;
   private short AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ;
   private short AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ;
   private short AV10OrderedBy ;
   private short AV53RecLinMAL ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV50Barcod ;
   private int A129BarCod ;
   private int AV76GXV1 ;
   private java.math.BigDecimal AV25TFPrdCFin ;
   private java.math.BigDecimal AV26TFPrdCFin_To ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ;
   private java.math.BigDecimal AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22TFPrdNum_Sel ;
   private String AV21TFPrdNum ;
   private String AV24TFPrdNom_Sel ;
   private String AV23TFPrdNom ;
   private String AV28TFLanyUsr_Sel ;
   private String AV27TFLanyUsr ;
   private String AV32TFLanyLote_Sel ;
   private String AV31TFLanyLote ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ;
   private String AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ;
   private String AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ;
   private String AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ;
   private String scmdbuf ;
   private String lV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String lV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String lV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String lV74Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV49Emprcod ;
   private String AV52Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV56Pgmdesc ;
   private java.util.Date AV29TFLanyFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n5807LanyLote ;
   private boolean n4579LanyFec ;
   private boolean n4578LanyUsr ;
   private boolean n1378PrdCFin ;
   private String AV47Title ;
   private String AV12FilterFullText ;
   private String AV33TFRecLinMAL_To_Description ;
   private String AV34TFRecNumAny_To_Description ;
   private String AV35TFPrdCFin_To_Description ;
   private String AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String lV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String AV45PageInfo ;
   private String AV42DateInfo ;
   private String AV40AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P094T2_A130BarCodPar ;
   private byte[] P094T2_A132BarCodReo ;
   private int[] P094T2_A129BarCod ;
   private String[] P094T2_A396EmprCod ;
   private String[] P094T2_A5807LanyLote ;
   private boolean[] P094T2_n5807LanyLote ;
   private java.util.Date[] P094T2_A4579LanyFec ;
   private boolean[] P094T2_n4579LanyFec ;
   private String[] P094T2_A4578LanyUsr ;
   private boolean[] P094T2_n4578LanyUsr ;
   private java.math.BigDecimal[] P094T2_A1378PrdCFin ;
   private boolean[] P094T2_n1378PrdCFin ;
   private String[] P094T2_A718PrdNom ;
   private String[] P094T2_A719PrdNum ;
   private byte[] P094T2_A1377RecNumAny ;
   private short[] P094T2_A2808RecLinMAL ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class cierrerecetastinte_adicionesmanualexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV49Emprcod ,
                                          int AV50Barcod ,
                                          byte AV51Barcodreo ,
                                          String AV52Barcodpar ,
                                          short AV53RecLinMAL ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny, T1.RecLinMAL FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV60Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecNumAny" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecNumAny DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCFin" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCFin DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyUsr" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyUsr DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyFec" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyLote" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyLote DESC" ;
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
                  return conditional_P094T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
      }
   }

}

