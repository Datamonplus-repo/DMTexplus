package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrmwwexportreport_impl extends GXWebReport
{
   public ttrmwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV48Title = httpContext.getMessage( "Lista de TRM", "") ;
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
         h9QL0( true, 0) ;
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
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFTRMDivID) && (0==AV19TFTRMDivID_To) ) )
      {
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFTRMDivID), "Z9")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV32TFTRMDivID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Divisa", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFTRMDivID_To_Description, "")), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFTRMDivID_To), "Z9")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFTRMDivNom_Sel)==0) )
      {
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFTRMDivNom_Sel, "")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFTRMDivNom)==0) )
         {
            h9QL0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFTRMDivNom, "")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV22TFTRMFecha) )
      {
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV22TFTRMFecha, "99/99/99 99:99"), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFTRMCompra)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFTRMCompra_To)==0) ) )
      {
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "$ compra", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TFTRMCompra, "ZZZZZZZ9.99")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFTRMCompra_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "$ compra", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFTRMCompra_To_Description, "")), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFTRMCompra_To, "ZZZZZZZ9.99")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFTRMVenta)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFTRMVenta_To)==0) ) )
      {
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "$ venta", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFTRMVenta, "ZZZZZZZ9.99")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFTRMVenta_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "$ venta", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFTRMVenta_To_Description, "")), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TFTRMVenta_To, "ZZZZZZZ9.99")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV30TFTRMAutMan_Sels.fromJSonString(AV28TFTRMAutMan_SelsJson, null);
      if ( ! ( AV30TFTRMAutMan_Sels.size() == 0 ) )
      {
         AV37i = 1 ;
         AV55GXV1 = 1 ;
         while ( AV55GXV1 <= AV30TFTRMAutMan_Sels.size() )
         {
            AV31TFTRMAutMan_Sel = (String)AV30TFTRMAutMan_Sels.elementAt(-1+AV55GXV1) ;
            if ( AV37i == 1 )
            {
               AV29TFTRMAutMan_SelDscs = "" ;
            }
            else
            {
               AV29TFTRMAutMan_SelDscs += ", " ;
            }
            AV36FilterTFTRMAutMan_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV31TFTRMAutMan_Sel), "A") == 0 )
            {
               AV36FilterTFTRMAutMan_SelValueDescription = httpContext.getMessage( "Automática", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV31TFTRMAutMan_Sel), "M") == 0 )
            {
               AV36FilterTFTRMAutMan_SelValueDescription = httpContext.getMessage( "Manual", "") ;
            }
            AV29TFTRMAutMan_SelDscs += AV36FilterTFTRMAutMan_SelValueDescription ;
            AV37i = (long)(AV37i+1) ;
            AV55GXV1 = (int)(AV55GXV1+1) ;
         }
         h9QL0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Registración", ""), 25, Gx_line+0, 116, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFTRMAutMan_SelDscs, "")), 116, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9QL0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9QL0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Divisa", ""), 30, Gx_line+10, 122, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 126, Gx_line+10, 310, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 314, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "$ compra", ""), 410, Gx_line+10, 502, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "$ venta", ""), 506, Gx_line+10, 598, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Registración", ""), 602, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV57Ficherosbasicos_ttrmwwds_1_filterfulltext = AV12FilterFullText ;
      AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid = AV18TFTRMDivID ;
      AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to = AV19TFTRMDivID_To ;
      AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom = AV20TFTRMDivNom ;
      AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = AV21TFTRMDivNom_Sel ;
      AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha = AV22TFTRMFecha ;
      AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra = AV24TFTRMCompra ;
      AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = AV25TFTRMCompra_To ;
      AV65Ficherosbasicos_ttrmwwds_9_tftrmventa = AV26TFTRMVenta ;
      AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to = AV27TFTRMVenta_To ;
      AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = AV30TFTRMAutMan_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14110TRMAutMan ,
                                           AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                           Byte.valueOf(AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid) ,
                                           Byte.valueOf(AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) ,
                                           AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                           AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                           AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                           AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                           AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                           AV65Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                           AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                           Integer.valueOf(AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels.size()) ,
                                           Byte.valueOf(A14105TRMDivID) ,
                                           A14107TRMDivNom ,
                                           A14106TRMFecha ,
                                           A14108TRMCompra ,
                                           A14109TRMVenta ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV57Ficherosbasicos_ttrmwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom = GXutil.padr( GXutil.rtrim( AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom), 30, "%") ;
      /* Using cursor P09QL2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid), Byte.valueOf(AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to), lV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom, AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel, AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha, AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra, AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to, AV65Ficherosbasicos_ttrmwwds_9_tftrmventa, AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14109TRMVenta = P09QL2_A14109TRMVenta[0] ;
         A14108TRMCompra = P09QL2_A14108TRMCompra[0] ;
         A14106TRMFecha = P09QL2_A14106TRMFecha[0] ;
         A14107TRMDivNom = P09QL2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QL2_n14107TRMDivNom[0] ;
         A14105TRMDivID = P09QL2_A14105TRMDivID[0] ;
         A14110TRMAutMan = P09QL2_A14110TRMAutMan[0] ;
         A396EmprCod = P09QL2_A396EmprCod[0] ;
         A14107TRMDivNom = P09QL2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QL2_n14107TRMDivNom[0] ;
         if ( (GXutil.strcmp("", AV57Ficherosbasicos_ttrmwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A14105TRMDivID, 2, 0) , GXutil.padr( "%" + AV57Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14107TRMDivNom) , GXutil.padr( "%" + GXutil.upper( AV57Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14108TRMCompra, 11, 2) , GXutil.padr( "%" + AV57Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14109TRMVenta, 11, 2) , GXutil.padr( "%" + AV57Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automática", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "M", "")) == 0 ) ) ) )
         {
            AV13TRMAutManDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), "A") == 0 )
            {
               AV13TRMAutManDescription = httpContext.getMessage( "Automática", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A14110TRMAutMan), "M") == 0 )
            {
               AV13TRMAutManDescription = httpContext.getMessage( "Manual", "") ;
            }
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
            h9QL0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14105TRMDivID), "Z9")), 30, Gx_line+10, 122, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14107TRMDivNom, "")), 126, Gx_line+10, 310, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A14106TRMFecha, "99/99/99 99:99"), 314, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A14108TRMCompra, "ZZZZZZZ9.99")), 410, Gx_line+10, 502, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A14109TRMVenta, "ZZZZZZZ9.99")), 506, Gx_line+10, 598, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13TRMAutManDescription, "")), 602, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("FicherosBasicos.TTRMWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTRMWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("FicherosBasicos.TTRMWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV68GXV2 = 1 ;
      while ( AV68GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVID") == 0 )
         {
            AV18TFTRMDivID = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFTRMDivID_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM") == 0 )
         {
            AV20TFTRMDivNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM_SEL") == 0 )
         {
            AV21TFTRMDivNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMFECHA") == 0 )
         {
            AV22TFTRMFecha = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMCOMPRA") == 0 )
         {
            AV24TFTRMCompra = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFTRMCompra_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMVENTA") == 0 )
         {
            AV26TFTRMVenta = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFTRMVenta_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMAUTMAN_SEL") == 0 )
         {
            AV28TFTRMAutMan_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV30TFTRMAutMan_Sels.fromJSonString(AV28TFTRMAutMan_SelsJson, null);
         }
         AV68GXV2 = (int)(AV68GXV2+1) ;
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

   public void h9QL0( boolean bFoot ,
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
               AV43DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV48Title = AV52Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV48Title = "" ;
      AV12FilterFullText = "" ;
      AV32TFTRMDivID_To_Description = "" ;
      AV21TFTRMDivNom_Sel = "" ;
      AV20TFTRMDivNom = "" ;
      AV22TFTRMFecha = GXutil.resetTime( GXutil.nullDate() );
      AV24TFTRMCompra = DecimalUtil.ZERO ;
      AV25TFTRMCompra_To = DecimalUtil.ZERO ;
      AV34TFTRMCompra_To_Description = "" ;
      AV26TFTRMVenta = DecimalUtil.ZERO ;
      AV27TFTRMVenta_To = DecimalUtil.ZERO ;
      AV35TFTRMVenta_To_Description = "" ;
      AV30TFTRMAutMan_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28TFTRMAutMan_SelsJson = "" ;
      AV31TFTRMAutMan_Sel = "" ;
      AV29TFTRMAutMan_SelDscs = "" ;
      AV36FilterTFTRMAutMan_SelValueDescription = "" ;
      A14110TRMAutMan = "" ;
      A14107TRMDivNom = "" ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      AV57Ficherosbasicos_ttrmwwds_1_filterfulltext = "" ;
      AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = "" ;
      AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha = GXutil.resetTime( GXutil.nullDate() );
      AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra = DecimalUtil.ZERO ;
      AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = DecimalUtil.ZERO ;
      AV65Ficherosbasicos_ttrmwwds_9_tftrmventa = DecimalUtil.ZERO ;
      AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to = DecimalUtil.ZERO ;
      AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      P09QL2_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QL2_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QL2_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QL2_A14107TRMDivNom = new String[] {""} ;
      P09QL2_n14107TRMDivNom = new boolean[] {false} ;
      P09QL2_A14105TRMDivID = new byte[1] ;
      P09QL2_A14110TRMAutMan = new String[] {""} ;
      P09QL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13TRMAutManDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46PageInfo = "" ;
      AV43DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV52Pgmdesc = "" ;
      AV41AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrmwwexportreport__default(),
         new Object[] {
             new Object[] {
            P09QL2_A14109TRMVenta, P09QL2_A14108TRMCompra, P09QL2_A14106TRMFecha, P09QL2_A14107TRMDivNom, P09QL2_n14107TRMDivNom, P09QL2_A14105TRMDivID, P09QL2_A14110TRMAutMan, P09QL2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "TTRMWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "TTRMWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV18TFTRMDivID ;
   private byte AV19TFTRMDivID_To ;
   private byte A14105TRMDivID ;
   private byte AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid ;
   private byte AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV55GXV1 ;
   private int AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ;
   private int AV68GXV2 ;
   private long AV37i ;
   private java.math.BigDecimal AV24TFTRMCompra ;
   private java.math.BigDecimal AV25TFTRMCompra_To ;
   private java.math.BigDecimal AV26TFTRMVenta ;
   private java.math.BigDecimal AV27TFTRMVenta_To ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private java.math.BigDecimal AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra ;
   private java.math.BigDecimal AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ;
   private java.math.BigDecimal AV65Ficherosbasicos_ttrmwwds_9_tftrmventa ;
   private java.math.BigDecimal AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFTRMDivNom_Sel ;
   private String AV20TFTRMDivNom ;
   private String AV31TFTRMAutMan_Sel ;
   private String A14110TRMAutMan ;
   private String A14107TRMDivNom ;
   private String AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ;
   private String scmdbuf ;
   private String lV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String A396EmprCod ;
   private String AV52Pgmdesc ;
   private java.util.Date AV22TFTRMFecha ;
   private java.util.Date A14106TRMFecha ;
   private java.util.Date AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n14107TRMDivNom ;
   private String AV28TFTRMAutMan_SelsJson ;
   private String AV48Title ;
   private String AV12FilterFullText ;
   private String AV32TFTRMDivID_To_Description ;
   private String AV34TFTRMCompra_To_Description ;
   private String AV35TFTRMVenta_To_Description ;
   private String AV29TFTRMAutMan_SelDscs ;
   private String AV36FilterTFTRMAutMan_SelValueDescription ;
   private String AV57Ficherosbasicos_ttrmwwds_1_filterfulltext ;
   private String AV13TRMAutManDescription ;
   private String AV46PageInfo ;
   private String AV43DateInfo ;
   private String AV41AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09QL2_A14109TRMVenta ;
   private java.math.BigDecimal[] P09QL2_A14108TRMCompra ;
   private java.util.Date[] P09QL2_A14106TRMFecha ;
   private String[] P09QL2_A14107TRMDivNom ;
   private boolean[] P09QL2_n14107TRMDivNom ;
   private byte[] P09QL2_A14105TRMDivID ;
   private String[] P09QL2_A14110TRMAutMan ;
   private String[] P09QL2_A396EmprCod ;
   private GXSimpleCollection<String> AV30TFTRMAutMan_Sels ;
   private GXSimpleCollection<String> AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class ttrmwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14110TRMAutMan ,
                                          GXSimpleCollection<String> AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                          byte AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid ,
                                          byte AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ,
                                          String AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                          String AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                          java.util.Date AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                          java.math.BigDecimal AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                          java.math.BigDecimal AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                          java.math.BigDecimal AV65Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                          java.math.BigDecimal AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                          int AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ,
                                          byte A14105TRMDivID ,
                                          String A14107TRMDivNom ,
                                          java.util.Date A14106TRMFecha ,
                                          java.math.BigDecimal A14108TRMCompra ,
                                          java.math.BigDecimal A14109TRMVenta ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV57Ficherosbasicos_ttrmwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.TRMVenta, T1.TRMCompra, T1.TRMFecha, T2.DivNom AS TRMDivNom, T1.TRMDivID AS TRMDivID, T1.TRMAutMan, T1.EmprCod FROM (TXPTRM T1 INNER JOIN TXPDIVISA T2" ;
      scmdbuf += " ON T2.DivCod = T1.TRMDivID)" ;
      if ( ! (0==AV58Ficherosbasicos_ttrmwwds_2_tftrmdivid) )
      {
         addWhere(sWhereString, "(T1.TRMDivID >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV59Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) )
      {
         addWhere(sWhereString, "(T1.TRMDivID <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Ficherosbasicos_ttrmwwds_4_tftrmdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Ficherosbasicos_ttrmwwds_6_tftrmfecha) )
      {
         addWhere(sWhereString, "(T1.TRMFecha >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Ficherosbasicos_ttrmwwds_7_tftrmcompra)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Ficherosbasicos_ttrmwwds_8_tftrmcompra_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Ficherosbasicos_ttrmwwds_9_tftrmventa)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Ficherosbasicos_ttrmwwds_10_tftrmventa_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Ficherosbasicos_ttrmwwds_11_tftrmautman_sels, "T1.TRMAutMan IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMFecha" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMFecha DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMDivID" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMDivID DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMCompra" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMCompra DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMVenta" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMVenta DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TRMAutMan DESC" ;
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
                  return conditional_P09QL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

