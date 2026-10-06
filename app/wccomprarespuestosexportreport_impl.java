package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccomprarespuestosexportreport_impl extends GXWebReport
{
   public wccomprarespuestosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV45Title = httpContext.getMessage( "Lista de Tabla MRep C1 (Compras, repuestos)", "") ;
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
         h8WG0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV47FilterFullText)==0) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47FilterFullText, "")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFMRNom_Sel)==0) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMRNom_Sel, "")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFMRNom)==0) )
         {
            h8WG0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMRNom, "")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV18TFMRCod) && (0==AV19TFMRCod_To) ) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFMRCod), "ZZZZZZZ9")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV30TFMRCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFMRCod_To_Description, "")), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFMRCod_To), "ZZZZZZZ9")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFMComSolCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFMComSolCnt_To)==0) ) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TFMComSolCnt, "ZZZZZ9.99")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV31TFMComSolCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFMComSolCnt_To_Description, "")), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TFMComSolCnt_To, "ZZZZZ9.99")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFMComSolPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFMComSolPre_To)==0) ) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TFMComSolPre, "ZZZZZZZ9.999")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV32TFMComSolPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFMComSolPre_To_Description, "")), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFMComSolPre_To, "ZZZZZZZ9.999")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFMComEntCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFMComEntCnt_To)==0) ) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Entrada", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFMComEntCnt, "ZZZZZ9.99")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFMComEntCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFMComEntCnt_To_Description, "")), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TFMComEntCnt_To, "ZZZZZ9.99")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFMComEntPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFMComEntPre_To)==0) ) )
      {
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio entrada", ""), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFMComEntPre, "ZZZZZZZ9.999")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFMComEntPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WG0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFMComEntPre_To_Description, "")), 25, Gx_line+0, 156, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFMComEntPre_To, "ZZZZZZZ9.999")), 156, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8WG0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8WG0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 30, Gx_line+10, 240, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 244, Gx_line+10, 349, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 353, Gx_line+10, 458, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 462, Gx_line+10, 567, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Entrada", ""), 571, Gx_line+10, 677, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio entrada", ""), 681, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV54Wccomprarespuestosds_1_emprcod = AV10EmprCod ;
      AV55Wccomprarespuestosds_2_mcomcod = AV11MComCod ;
      AV56Wccomprarespuestosds_3_filterfulltext = AV47FilterFullText ;
      AV57Wccomprarespuestosds_4_tfmrnom = AV20TFMRNom ;
      AV58Wccomprarespuestosds_5_tfmrnom_sel = AV21TFMRNom_Sel ;
      AV59Wccomprarespuestosds_6_tfmrcod = AV18TFMRCod ;
      AV60Wccomprarespuestosds_7_tfmrcod_to = AV19TFMRCod_To ;
      AV61Wccomprarespuestosds_8_tfmcomsolcnt = AV22TFMComSolCnt ;
      AV62Wccomprarespuestosds_9_tfmcomsolcnt_to = AV23TFMComSolCnt_To ;
      AV63Wccomprarespuestosds_10_tfmcomsolpre = AV24TFMComSolPre ;
      AV64Wccomprarespuestosds_11_tfmcomsolpre_to = AV25TFMComSolPre_To ;
      AV65Wccomprarespuestosds_12_tfmcomentcnt = AV26TFMComEntCnt ;
      AV66Wccomprarespuestosds_13_tfmcomentcnt_to = AV27TFMComEntCnt_To ;
      AV67Wccomprarespuestosds_14_tfmcomentpre = AV28TFMComEntPre ;
      AV68Wccomprarespuestosds_15_tfmcomentpre_to = AV29TFMComEntPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Wccomprarespuestosds_3_filterfulltext ,
                                           AV58Wccomprarespuestosds_5_tfmrnom_sel ,
                                           AV57Wccomprarespuestosds_4_tfmrnom ,
                                           Integer.valueOf(AV59Wccomprarespuestosds_6_tfmrcod) ,
                                           Integer.valueOf(AV60Wccomprarespuestosds_7_tfmrcod_to) ,
                                           AV61Wccomprarespuestosds_8_tfmcomsolcnt ,
                                           AV62Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                           AV63Wccomprarespuestosds_10_tfmcomsolpre ,
                                           AV64Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                           AV65Wccomprarespuestosds_12_tfmcomentcnt ,
                                           AV66Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                           AV67Wccomprarespuestosds_14_tfmcomentpre ,
                                           AV68Wccomprarespuestosds_15_tfmcomentpre_to ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A11051MComSolCnt ,
                                           A11052MComSolPre ,
                                           A11053MComEntCnt ,
                                           A11054MComEntPre ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV54Wccomprarespuestosds_1_emprcod ,
                                           Long.valueOf(AV55Wccomprarespuestosds_2_mcomcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A11055MComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV57Wccomprarespuestosds_4_tfmrnom = GXutil.padr( GXutil.rtrim( AV57Wccomprarespuestosds_4_tfmrnom), 100, "%") ;
      /* Using cursor P08WG2 */
      pr_default.execute(0, new Object[] {AV54Wccomprarespuestosds_1_emprcod, Long.valueOf(AV55Wccomprarespuestosds_2_mcomcod), lV56Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_3_filterfulltext, lV57Wccomprarespuestosds_4_tfmrnom, AV58Wccomprarespuestosds_5_tfmrnom_sel, Integer.valueOf(AV59Wccomprarespuestosds_6_tfmrcod), Integer.valueOf(AV60Wccomprarespuestosds_7_tfmrcod_to), AV61Wccomprarespuestosds_8_tfmcomsolcnt, AV62Wccomprarespuestosds_9_tfmcomsolcnt_to, AV63Wccomprarespuestosds_10_tfmcomsolpre, AV64Wccomprarespuestosds_11_tfmcomsolpre_to, AV65Wccomprarespuestosds_12_tfmcomentcnt, AV66Wccomprarespuestosds_13_tfmcomentcnt_to, AV67Wccomprarespuestosds_14_tfmcomentpre, AV68Wccomprarespuestosds_15_tfmcomentpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11054MComEntPre = P08WG2_A11054MComEntPre[0] ;
         A11053MComEntCnt = P08WG2_A11053MComEntCnt[0] ;
         A11052MComSolPre = P08WG2_A11052MComSolPre[0] ;
         A11051MComSolCnt = P08WG2_A11051MComSolCnt[0] ;
         A9492MRCod = P08WG2_A9492MRCod[0] ;
         A9493MRNom = P08WG2_A9493MRNom[0] ;
         n9493MRNom = P08WG2_n9493MRNom[0] ;
         A11055MComCod = P08WG2_A11055MComCod[0] ;
         A396EmprCod = P08WG2_A396EmprCod[0] ;
         A9493MRNom = P08WG2_A9493MRNom[0] ;
         n9493MRNom = P08WG2_n9493MRNom[0] ;
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
         h8WG0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 30, Gx_line+10, 240, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 244, Gx_line+10, 349, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11051MComSolCnt, "ZZZZZ9.99")), 353, Gx_line+10, 458, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999")), 462, Gx_line+10, 567, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11053MComEntCnt, "ZZZZZ9.99")), 571, Gx_line+10, 677, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999")), 681, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("WCCompraRespuestosGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCompraRespuestosGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("WCCompraRespuestosGridState"), null, null);
      }
      AV12OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV20TFMRNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV21TFMRNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV18TFMRCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMRCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLCNT") == 0 )
         {
            AV22TFMComSolCnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFMComSolCnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLPRE") == 0 )
         {
            AV24TFMComSolPre = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMComSolPre_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTCNT") == 0 )
         {
            AV26TFMComEntCnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFMComEntCnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTPRE") == 0 )
         {
            AV28TFMComEntPre = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFMComEntPre_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MCOMCOD") == 0 )
         {
            AV11MComCod = GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
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

   public void h8WG0( boolean bFoot ,
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
               AV43PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV40DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV45Title = AV50Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV45Title = "" ;
      AV47FilterFullText = "" ;
      AV21TFMRNom_Sel = "" ;
      AV20TFMRNom = "" ;
      AV30TFMRCod_To_Description = "" ;
      AV22TFMComSolCnt = DecimalUtil.ZERO ;
      AV23TFMComSolCnt_To = DecimalUtil.ZERO ;
      AV31TFMComSolCnt_To_Description = "" ;
      AV24TFMComSolPre = DecimalUtil.ZERO ;
      AV25TFMComSolPre_To = DecimalUtil.ZERO ;
      AV32TFMComSolPre_To_Description = "" ;
      AV26TFMComEntCnt = DecimalUtil.ZERO ;
      AV27TFMComEntCnt_To = DecimalUtil.ZERO ;
      AV33TFMComEntCnt_To_Description = "" ;
      AV28TFMComEntPre = DecimalUtil.ZERO ;
      AV29TFMComEntPre_To = DecimalUtil.ZERO ;
      AV34TFMComEntPre_To_Description = "" ;
      A9493MRNom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      AV54Wccomprarespuestosds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV56Wccomprarespuestosds_3_filterfulltext = "" ;
      AV57Wccomprarespuestosds_4_tfmrnom = "" ;
      AV58Wccomprarespuestosds_5_tfmrnom_sel = "" ;
      AV61Wccomprarespuestosds_8_tfmcomsolcnt = DecimalUtil.ZERO ;
      AV62Wccomprarespuestosds_9_tfmcomsolcnt_to = DecimalUtil.ZERO ;
      AV63Wccomprarespuestosds_10_tfmcomsolpre = DecimalUtil.ZERO ;
      AV64Wccomprarespuestosds_11_tfmcomsolpre_to = DecimalUtil.ZERO ;
      AV65Wccomprarespuestosds_12_tfmcomentcnt = DecimalUtil.ZERO ;
      AV66Wccomprarespuestosds_13_tfmcomentcnt_to = DecimalUtil.ZERO ;
      AV67Wccomprarespuestosds_14_tfmcomentpre = DecimalUtil.ZERO ;
      AV68Wccomprarespuestosds_15_tfmcomentpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV56Wccomprarespuestosds_3_filterfulltext = "" ;
      lV57Wccomprarespuestosds_4_tfmrnom = "" ;
      A396EmprCod = "" ;
      P08WG2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WG2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WG2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WG2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WG2_A9492MRCod = new int[1] ;
      P08WG2_A9493MRNom = new String[] {""} ;
      P08WG2_n9493MRNom = new boolean[] {false} ;
      P08WG2_A11055MComCod = new long[1] ;
      P08WG2_A396EmprCod = new String[] {""} ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43PageInfo = "" ;
      AV40DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV50Pgmdesc = "" ;
      AV38AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccomprarespuestosexportreport__default(),
         new Object[] {
             new Object[] {
            P08WG2_A11054MComEntPre, P08WG2_A11053MComEntCnt, P08WG2_A11052MComSolPre, P08WG2_A11051MComSolCnt, P08WG2_A9492MRCod, P08WG2_A9493MRNom, P08WG2_n9493MRNom, P08WG2_A11055MComCod, P08WG2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Lista Compra de Repuestos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Lista Compra de Repuestos", "") ;
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
   private int AV18TFMRCod ;
   private int AV19TFMRCod_To ;
   private int A9492MRCod ;
   private int AV59Wccomprarespuestosds_6_tfmrcod ;
   private int AV60Wccomprarespuestosds_7_tfmrcod_to ;
   private int AV69GXV1 ;
   private long AV55Wccomprarespuestosds_2_mcomcod ;
   private long AV11MComCod ;
   private long A11055MComCod ;
   private java.math.BigDecimal AV22TFMComSolCnt ;
   private java.math.BigDecimal AV23TFMComSolCnt_To ;
   private java.math.BigDecimal AV24TFMComSolPre ;
   private java.math.BigDecimal AV25TFMComSolPre_To ;
   private java.math.BigDecimal AV26TFMComEntCnt ;
   private java.math.BigDecimal AV27TFMComEntCnt_To ;
   private java.math.BigDecimal AV28TFMComEntPre ;
   private java.math.BigDecimal AV29TFMComEntPre_To ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal AV61Wccomprarespuestosds_8_tfmcomsolcnt ;
   private java.math.BigDecimal AV62Wccomprarespuestosds_9_tfmcomsolcnt_to ;
   private java.math.BigDecimal AV63Wccomprarespuestosds_10_tfmcomsolpre ;
   private java.math.BigDecimal AV64Wccomprarespuestosds_11_tfmcomsolpre_to ;
   private java.math.BigDecimal AV65Wccomprarespuestosds_12_tfmcomentcnt ;
   private java.math.BigDecimal AV66Wccomprarespuestosds_13_tfmcomentcnt_to ;
   private java.math.BigDecimal AV67Wccomprarespuestosds_14_tfmcomentpre ;
   private java.math.BigDecimal AV68Wccomprarespuestosds_15_tfmcomentpre_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFMRNom_Sel ;
   private String AV20TFMRNom ;
   private String A9493MRNom ;
   private String AV54Wccomprarespuestosds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV57Wccomprarespuestosds_4_tfmrnom ;
   private String AV58Wccomprarespuestosds_5_tfmrnom_sel ;
   private String scmdbuf ;
   private String lV57Wccomprarespuestosds_4_tfmrnom ;
   private String A396EmprCod ;
   private String AV50Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private boolean n9493MRNom ;
   private String AV45Title ;
   private String AV47FilterFullText ;
   private String AV30TFMRCod_To_Description ;
   private String AV31TFMComSolCnt_To_Description ;
   private String AV32TFMComSolPre_To_Description ;
   private String AV33TFMComEntCnt_To_Description ;
   private String AV34TFMComEntPre_To_Description ;
   private String AV56Wccomprarespuestosds_3_filterfulltext ;
   private String lV56Wccomprarespuestosds_3_filterfulltext ;
   private String AV43PageInfo ;
   private String AV40DateInfo ;
   private String AV38AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WG2_A11054MComEntPre ;
   private java.math.BigDecimal[] P08WG2_A11053MComEntCnt ;
   private java.math.BigDecimal[] P08WG2_A11052MComSolPre ;
   private java.math.BigDecimal[] P08WG2_A11051MComSolCnt ;
   private int[] P08WG2_A9492MRCod ;
   private String[] P08WG2_A9493MRNom ;
   private boolean[] P08WG2_n9493MRNom ;
   private long[] P08WG2_A11055MComCod ;
   private String[] P08WG2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class wccomprarespuestosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wccomprarespuestosds_3_filterfulltext ,
                                          String AV58Wccomprarespuestosds_5_tfmrnom_sel ,
                                          String AV57Wccomprarespuestosds_4_tfmrnom ,
                                          int AV59Wccomprarespuestosds_6_tfmrcod ,
                                          int AV60Wccomprarespuestosds_7_tfmrcod_to ,
                                          java.math.BigDecimal AV61Wccomprarespuestosds_8_tfmcomsolcnt ,
                                          java.math.BigDecimal AV62Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                          java.math.BigDecimal AV63Wccomprarespuestosds_10_tfmcomsolpre ,
                                          java.math.BigDecimal AV64Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                          java.math.BigDecimal AV65Wccomprarespuestosds_12_tfmcomentcnt ,
                                          java.math.BigDecimal AV66Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                          java.math.BigDecimal AV67Wccomprarespuestosds_14_tfmcomentpre ,
                                          java.math.BigDecimal AV68Wccomprarespuestosds_15_tfmcomentpre_to ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          java.math.BigDecimal A11051MComSolCnt ,
                                          java.math.BigDecimal A11052MComSolPre ,
                                          java.math.BigDecimal A11053MComEntCnt ,
                                          java.math.BigDecimal A11054MComEntPre ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV54Wccomprarespuestosds_1_emprcod ,
                                          long AV55Wccomprarespuestosds_2_mcomcod ,
                                          String A396EmprCod ,
                                          long A11055MComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MComEntPre, T1.MComEntCnt, T1.MComSolPre, T1.MComSolCnt, T1.MRCod, T2.MRNom, T1.MComCod, T1.EmprCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MComCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Wccomprarespuestosds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wccomprarespuestosds_5_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Wccomprarespuestosds_4_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wccomprarespuestosds_5_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Wccomprarespuestosds_6_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Wccomprarespuestosds_7_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wccomprarespuestosds_8_tfmcomsolcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wccomprarespuestosds_9_tfmcomsolcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccomprarespuestosds_10_tfmcomsolpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccomprarespuestosds_11_tfmcomsolpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccomprarespuestosds_12_tfmcomentcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccomprarespuestosds_13_tfmcomentcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wccomprarespuestosds_14_tfmcomentpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wccomprarespuestosds_15_tfmcomentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T2.MRNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T2.MRNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MRCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolCnt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComSolPre" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComSolPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntCnt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MComEntPre" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MComCod DESC, T1.MComEntPre DESC" ;
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
                  return conditional_P08WG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

