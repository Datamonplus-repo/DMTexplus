package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listaprd_wcexportreport_impl extends GXWebReport
{
   public listaprd_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV338Title = httpContext.getMessage( "Lista de Mantenimiento Productos Quimicos", "") ;
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
         h9FA0( true, 0) ;
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
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFPrdNum_Sel)==0) )
      {
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFPrdNum_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFPrdNum)==0) )
         {
            h9FA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFPrdNom_Sel)==0) )
      {
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFPrdNom_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFPrdNom)==0) )
         {
            h9FA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFPrdNom, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV24TFPrvNum) && (0==AV25TFPrvNum_To) ) )
      {
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFPrvNum), "ZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV259TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV259TFPrvNum_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFPrvNum_To), "ZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFPrvNom_Sel)==0) )
      {
         h9FA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrvNom_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPrvNom)==0) )
         {
            h9FA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrvNom, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9FA0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9FA0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 45, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 49, Gx_line+10, 64, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 68, Gx_line+10, 83, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 87, Gx_line+10, 102, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencias Almacen", ""), 106, Gx_line+10, 121, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencia Cuarto Color", ""), 125, Gx_line+10, 140, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Referencia Proveedor", ""), 144, Gx_line+10, 159, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Reservada", ""), 163, Gx_line+10, 178, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unid.Medida Prod. en Formula", ""), 182, Gx_line+10, 197, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Unidad de Compra", ""), 201, Gx_line+10, 216, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Unidad Consumo", ""), 220, Gx_line+10, 235, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor de Conversion", ""), 239, Gx_line+10, 254, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 258, Gx_line+10, 273, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Producto Auxiliar", ""), 277, Gx_line+10, 292, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 296, Gx_line+10, 311, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ficha Tecnica?", ""), 315, Gx_line+10, 330, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Ficha Tecnica", ""), 334, Gx_line+10, 349, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja Seguridad?", ""), 353, Gx_line+10, 368, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Hoja Seguridad", ""), 372, Gx_line+10, 387, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 391, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "OEKO-TEX", ""), 410, Gx_line+10, 425, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 429, Gx_line+10, 444, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "H&M", ""), 448, Gx_line+10, 463, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Demanda Quimica Oxigeno", ""), 467, Gx_line+10, 482, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), 486, Gx_line+10, 501, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Index", ""), 505, Gx_line+10, 520, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Producto", ""), 524, Gx_line+10, 539, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 543, Gx_line+10, 558, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", ""), 562, Gx_line+10, 577, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", ""), 581, Gx_line+10, 596, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Formaldeido", ""), 600, Gx_line+10, 615, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Airlaminas", ""), 619, Gx_line+10, 634, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Apeo", ""), 638, Gx_line+10, 653, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "PFC", ""), 657, Gx_line+10, 672, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "List by Inditex ", ""), 676, Gx_line+10, 691, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N EINECS", ""), 695, Gx_line+10, 710, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Funcion", ""), 714, Gx_line+10, 729, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Substancia Quimica", ""), 733, Gx_line+10, 748, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Densidad Sal Muera (g/l)", ""), 752, Gx_line+10, 767, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tanque", ""), 771, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV351Listaprd_wcds_1_filterfulltext = AV12FilterFullText ;
      AV352Listaprd_wcds_2_tfprdnum = AV20TFPrdNum ;
      AV353Listaprd_wcds_3_tfprdnum_sel = AV21TFPrdNum_Sel ;
      AV354Listaprd_wcds_4_tfprdnom = AV22TFPrdNom ;
      AV355Listaprd_wcds_5_tfprdnom_sel = AV23TFPrdNom_Sel ;
      AV356Listaprd_wcds_6_tfprvnum = AV24TFPrvNum ;
      AV357Listaprd_wcds_7_tfprvnum_to = AV25TFPrvNum_To ;
      AV358Listaprd_wcds_8_tfprvnom = AV26TFPrvNom ;
      AV359Listaprd_wcds_9_tfprvnom_sel = AV27TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV353Listaprd_wcds_3_tfprdnum_sel ,
                                           AV352Listaprd_wcds_2_tfprdnum ,
                                           AV355Listaprd_wcds_5_tfprdnom_sel ,
                                           AV354Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV356Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV357Listaprd_wcds_7_tfprvnum_to) ,
                                           AV359Listaprd_wcds_9_tfprvnom_sel ,
                                           AV358Listaprd_wcds_8_tfprvnom ,
                                           AV340EmprCod ,
                                           AV341PrdNumFrom ,
                                           AV342PrdNumTo ,
                                           Integer.valueOf(AV343PrvNumFrom) ,
                                           Integer.valueOf(AV344PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV351Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE
                                           }
      });
      lV352Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV352Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV354Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV354Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV358Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV358Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FA2 */
      pr_default.execute(0, new Object[] {lV352Listaprd_wcds_2_tfprdnum, AV353Listaprd_wcds_3_tfprdnum_sel, lV354Listaprd_wcds_4_tfprdnom, AV355Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV356Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV357Listaprd_wcds_7_tfprvnum_to), lV358Listaprd_wcds_8_tfprvnom, AV359Listaprd_wcds_9_tfprvnom_sel, AV340EmprCod, AV341PrdNumFrom, AV342PrdNumTo, Integer.valueOf(AV343PrvNumFrom), Integer.valueOf(AV344PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = P09FA2_A742PrdUniCom[0] ;
         A743PrdUniCon = P09FA2_A743PrdUniCon[0] ;
         A856ValCod = P09FA2_A856ValCod[0] ;
         A396EmprCod = P09FA2_A396EmprCod[0] ;
         A3273PrdTnq = P09FA2_A3273PrdTnq[0] ;
         A5416PrdDensS = P09FA2_A5416PrdDensS[0] ;
         A11616PrdNmQu = P09FA2_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P09FA2_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P09FA2_A11614PrdEINECS[0] ;
         A11663PrdCtw4 = P09FA2_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = P09FA2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P09FA2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P09FA2_A10936PrdCtw1[0] ;
         A10935PrdRTM = P09FA2_A10935PrdRTM[0] ;
         A11196PrdNroCAS = P09FA2_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = P09FA2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FA2_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P09FA2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09FA2_n6301TipPrdCod[0] ;
         A10119PrdColIdx = P09FA2_A10119PrdColIdx[0] ;
         A9733PrdAox = P09FA2_A9733PrdAox[0] ;
         A1644PrdDqo = P09FA2_A1644PrdDqo[0] ;
         A11364PrdHm = P09FA2_A11364PrdHm[0] ;
         A11363PrdGots = P09FA2_A11363PrdGots[0] ;
         A5887PrdReach = P09FA2_A5887PrdReach[0] ;
         A9741PrdHS = P09FA2_A9741PrdHS[0] ;
         A9739PrdFT = P09FA2_A9739PrdFT[0] ;
         A724PrdPreAct = P09FA2_A724PrdPreAct[0] ;
         A4693PrdNum2 = P09FA2_A4693PrdNum2[0] ;
         A857ValDsc = P09FA2_A857ValDsc[0] ;
         n857ValDsc = P09FA2_n857ValDsc[0] ;
         A707PrdFacCon = P09FA2_A707PrdFacCon[0] ;
         A736PrdUcoDsc = P09FA2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FA2_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = P09FA2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FA2_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = P09FA2_A4338PrdUMeFo[0] ;
         A685PrdCanRes = P09FA2_A685PrdCanRes[0] ;
         A728PrdRefPrv = P09FA2_A728PrdRefPrv[0] ;
         A705PrdExiCC = P09FA2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09FA2_A704PrdExiAlm[0] ;
         A794PrvNom = P09FA2_A794PrvNom[0] ;
         n794PrvNom = P09FA2_n794PrvNom[0] ;
         A795PrvNum = P09FA2_A795PrvNum[0] ;
         A718PrdNom = P09FA2_A718PrdNom[0] ;
         A719PrdNum = P09FA2_A719PrdNum[0] ;
         A11687PrdList = P09FA2_A11687PrdList[0] ;
         A5888PrdOkotex = P09FA2_A5888PrdOkotex[0] ;
         A9742PrdFHS = P09FA2_A9742PrdFHS[0] ;
         A9740PrdFFT = P09FA2_A9740PrdFFT[0] ;
         A737PrdUcpDsc = P09FA2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FA2_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = P09FA2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FA2_n736PrdUcoDsc[0] ;
         A857ValDsc = P09FA2_A857ValDsc[0] ;
         n857ValDsc = P09FA2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09FA2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FA2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09FA2_A794PrvNom[0] ;
         n794PrvNom = P09FA2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV351Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV351Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV351Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV13PrdOkotexDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
            {
               AV13PrdOkotexDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
            {
               AV13PrdOkotexDescription = httpContext.getMessage( "S", "") ;
            }
            AV14PrdListDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
            {
               AV14PrdListDescription = httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
            {
               AV14PrdListDescription = httpContext.getMessage( "N", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            h9FA0( false, 66) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 45, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 49, Gx_line+10, 64, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 68, Gx_line+10, 83, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 87, Gx_line+10, 102, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 106, Gx_line+10, 121, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")), 125, Gx_line+10, 140, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), 144, Gx_line+10, 159, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 163, Gx_line+10, 178, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9")), 182, Gx_line+10, 197, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), 201, Gx_line+10, 216, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A736PrdUcoDsc, "")), 220, Gx_line+10, 235, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")), 239, Gx_line+10, 254, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A857ValDsc, "")), 258, Gx_line+10, 273, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), 277, Gx_line+10, 292, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 296, Gx_line+10, 311, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9739PrdFT, "")), 315, Gx_line+10, 330, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9740PrdFFT, "99/99/99"), 334, Gx_line+10, 349, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9741PrdHS, "")), 353, Gx_line+10, 368, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9742PrdFHS, "99/99/99"), 372, Gx_line+10, 387, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5887PrdReach, "")), 391, Gx_line+10, 406, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13PrdOkotexDescription, "")), 410, Gx_line+10, 425, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11363PrdGots, "")), 429, Gx_line+10, 444, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11364PrdHm, "")), 448, Gx_line+10, 463, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9")), 467, Gx_line+10, 482, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")), 486, Gx_line+10, 501, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10119PrdColIdx, "")), 505, Gx_line+10, 520, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9")), 524, Gx_line+10, 539, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6302TipPrdDsc, "")), 543, Gx_line+10, 558, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11196PrdNroCAS, "")), 562, Gx_line+10, 577, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10935PrdRTM, "")), 581, Gx_line+10, 596, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10936PrdCtw1, "")), 600, Gx_line+10, 615, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10937PrdCtw2, "")), 619, Gx_line+10, 634, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10938PrdCtw3, "")), 638, Gx_line+10, 653, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11663PrdCtw4, "")), 657, Gx_line+10, 672, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14PrdListDescription, "")), 676, Gx_line+10, 691, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11614PrdEINECS, "")), 695, Gx_line+10, 710, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11615PrdFuncion, "")), 714, Gx_line+10, 729, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11616PrdNmQu, "")), 733, Gx_line+10, 748, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5416PrdDensS, "ZZ9.999")), 752, Gx_line+10, 767, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9")), 771, Gx_line+10, 787, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+66) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV16Session.getValue("ListaPrd_WCGridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListaPrd_WCGridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV16Session.getValue("ListaPrd_WCGridState"), null, null);
      }
      AV10OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV360GXV1 = 1 ;
      while ( AV360GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV360GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV20TFPrdNum = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV21TFPrdNum_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV22TFPrdNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV23TFPrdNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV24TFPrvNum = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFPrvNum_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV26TFPrvNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV27TFPrvNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV360GXV1 = (int)(AV360GXV1+1) ;
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

   public void h9FA0( boolean bFoot ,
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
               AV336PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV333DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV336PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV333DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV338Title = AV347Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV331AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV338Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV338Title = "" ;
      AV12FilterFullText = "" ;
      AV21TFPrdNum_Sel = "" ;
      AV20TFPrdNum = "" ;
      AV23TFPrdNom_Sel = "" ;
      AV22TFPrdNom = "" ;
      AV259TFPrvNum_To_Description = "" ;
      AV27TFPrvNom_Sel = "" ;
      AV26TFPrvNom = "" ;
      A5888PrdOkotex = "" ;
      A11687PrdList = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A4693PrdNum2 = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A10119PrdColIdx = "" ;
      A6302TipPrdDsc = "" ;
      A11196PrdNroCAS = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      AV351Listaprd_wcds_1_filterfulltext = "" ;
      AV352Listaprd_wcds_2_tfprdnum = "" ;
      AV353Listaprd_wcds_3_tfprdnum_sel = "" ;
      AV354Listaprd_wcds_4_tfprdnom = "" ;
      AV355Listaprd_wcds_5_tfprdnom_sel = "" ;
      AV358Listaprd_wcds_8_tfprvnom = "" ;
      AV359Listaprd_wcds_9_tfprvnom_sel = "" ;
      lV351Listaprd_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV352Listaprd_wcds_2_tfprdnum = "" ;
      lV354Listaprd_wcds_4_tfprdnom = "" ;
      lV358Listaprd_wcds_8_tfprvnom = "" ;
      AV340EmprCod = "" ;
      AV341PrdNumFrom = "" ;
      AV342PrdNumTo = "" ;
      A396EmprCod = "" ;
      P09FA2_A742PrdUniCom = new byte[1] ;
      P09FA2_A743PrdUniCon = new byte[1] ;
      P09FA2_A856ValCod = new byte[1] ;
      P09FA2_A396EmprCod = new String[] {""} ;
      P09FA2_A3273PrdTnq = new byte[1] ;
      P09FA2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A11616PrdNmQu = new String[] {""} ;
      P09FA2_A11615PrdFuncion = new String[] {""} ;
      P09FA2_A11614PrdEINECS = new String[] {""} ;
      P09FA2_A11663PrdCtw4 = new String[] {""} ;
      P09FA2_A10938PrdCtw3 = new String[] {""} ;
      P09FA2_A10937PrdCtw2 = new String[] {""} ;
      P09FA2_A10936PrdCtw1 = new String[] {""} ;
      P09FA2_A10935PrdRTM = new String[] {""} ;
      P09FA2_A11196PrdNroCAS = new String[] {""} ;
      P09FA2_A6302TipPrdDsc = new String[] {""} ;
      P09FA2_n6302TipPrdDsc = new boolean[] {false} ;
      P09FA2_A6301TipPrdCod = new short[1] ;
      P09FA2_n6301TipPrdCod = new boolean[] {false} ;
      P09FA2_A10119PrdColIdx = new String[] {""} ;
      P09FA2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A1644PrdDqo = new short[1] ;
      P09FA2_A11364PrdHm = new String[] {""} ;
      P09FA2_A11363PrdGots = new String[] {""} ;
      P09FA2_A5887PrdReach = new String[] {""} ;
      P09FA2_A9741PrdHS = new String[] {""} ;
      P09FA2_A9739PrdFT = new String[] {""} ;
      P09FA2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A4693PrdNum2 = new String[] {""} ;
      P09FA2_A857ValDsc = new String[] {""} ;
      P09FA2_n857ValDsc = new boolean[] {false} ;
      P09FA2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A736PrdUcoDsc = new String[] {""} ;
      P09FA2_n736PrdUcoDsc = new boolean[] {false} ;
      P09FA2_A737PrdUcpDsc = new String[] {""} ;
      P09FA2_n737PrdUcpDsc = new boolean[] {false} ;
      P09FA2_A4338PrdUMeFo = new byte[1] ;
      P09FA2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A728PrdRefPrv = new String[] {""} ;
      P09FA2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FA2_A794PrvNom = new String[] {""} ;
      P09FA2_n794PrvNom = new boolean[] {false} ;
      P09FA2_A795PrvNum = new int[1] ;
      P09FA2_A718PrdNom = new String[] {""} ;
      P09FA2_A719PrdNum = new String[] {""} ;
      P09FA2_A11687PrdList = new String[] {""} ;
      P09FA2_A5888PrdOkotex = new String[] {""} ;
      P09FA2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P09FA2_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      AV13PrdOkotexDescription = "" ;
      AV14PrdListDescription = "" ;
      AV16Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV336PageInfo = "" ;
      AV333DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV347Pgmdesc = "" ;
      AV331AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listaprd_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09FA2_A742PrdUniCom, P09FA2_A743PrdUniCon, P09FA2_A856ValCod, P09FA2_A396EmprCod, P09FA2_A3273PrdTnq, P09FA2_A5416PrdDensS, P09FA2_A11616PrdNmQu, P09FA2_A11615PrdFuncion, P09FA2_A11614PrdEINECS, P09FA2_A11663PrdCtw4,
            P09FA2_A10938PrdCtw3, P09FA2_A10937PrdCtw2, P09FA2_A10936PrdCtw1, P09FA2_A10935PrdRTM, P09FA2_A11196PrdNroCAS, P09FA2_A6302TipPrdDsc, P09FA2_n6302TipPrdDsc, P09FA2_A6301TipPrdCod, P09FA2_n6301TipPrdCod, P09FA2_A10119PrdColIdx,
            P09FA2_A9733PrdAox, P09FA2_A1644PrdDqo, P09FA2_A11364PrdHm, P09FA2_A11363PrdGots, P09FA2_A5887PrdReach, P09FA2_A9741PrdHS, P09FA2_A9739PrdFT, P09FA2_A724PrdPreAct, P09FA2_A4693PrdNum2, P09FA2_A857ValDsc,
            P09FA2_n857ValDsc, P09FA2_A707PrdFacCon, P09FA2_A736PrdUcoDsc, P09FA2_n736PrdUcoDsc, P09FA2_A737PrdUcpDsc, P09FA2_n737PrdUcpDsc, P09FA2_A4338PrdUMeFo, P09FA2_A685PrdCanRes, P09FA2_A728PrdRefPrv, P09FA2_A705PrdExiCC,
            P09FA2_A704PrdExiAlm, P09FA2_A794PrvNom, P09FA2_n794PrvNom, P09FA2_A795PrvNum, P09FA2_A718PrdNom, P09FA2_A719PrdNum, P09FA2_A11687PrdList, P09FA2_A5888PrdOkotex, P09FA2_A9742PrdFHS, P09FA2_A9740PrdFFT
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV347Pgmdesc = httpContext.getMessage( "Lista Prd_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV347Pgmdesc = httpContext.getMessage( "Lista Prd_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A4338PrdUMeFo ;
   private byte A3273PrdTnq ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private short gxcookieaux ;
   private short A1644PrdDqo ;
   private short A6301TipPrdCod ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV24TFPrvNum ;
   private int AV25TFPrvNum_To ;
   private int A795PrvNum ;
   private int AV356Listaprd_wcds_6_tfprvnum ;
   private int AV357Listaprd_wcds_7_tfprvnum_to ;
   private int AV343PrvNumFrom ;
   private int AV344PrvNumTo ;
   private int AV360GXV1 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A5416PrdDensS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFPrdNum_Sel ;
   private String AV20TFPrdNum ;
   private String AV23TFPrdNom_Sel ;
   private String AV22TFPrdNom ;
   private String AV27TFPrvNom_Sel ;
   private String AV26TFPrvNom ;
   private String A5888PrdOkotex ;
   private String A11687PrdList ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A737PrdUcpDsc ;
   private String A736PrdUcoDsc ;
   private String A857ValDsc ;
   private String A4693PrdNum2 ;
   private String A9739PrdFT ;
   private String A9741PrdHS ;
   private String A5887PrdReach ;
   private String A11363PrdGots ;
   private String A11364PrdHm ;
   private String A10119PrdColIdx ;
   private String A6302TipPrdDsc ;
   private String A11196PrdNroCAS ;
   private String A10935PrdRTM ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String A11614PrdEINECS ;
   private String A11615PrdFuncion ;
   private String AV352Listaprd_wcds_2_tfprdnum ;
   private String AV353Listaprd_wcds_3_tfprdnum_sel ;
   private String AV354Listaprd_wcds_4_tfprdnom ;
   private String AV355Listaprd_wcds_5_tfprdnom_sel ;
   private String AV358Listaprd_wcds_8_tfprvnom ;
   private String AV359Listaprd_wcds_9_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV352Listaprd_wcds_2_tfprdnum ;
   private String lV354Listaprd_wcds_4_tfprdnom ;
   private String lV358Listaprd_wcds_8_tfprvnom ;
   private String AV340EmprCod ;
   private String AV341PrdNumFrom ;
   private String AV342PrdNumTo ;
   private String A396EmprCod ;
   private String AV347Pgmdesc ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n857ValDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n737PrdUcpDsc ;
   private boolean n794PrvNom ;
   private String AV338Title ;
   private String AV12FilterFullText ;
   private String AV259TFPrvNum_To_Description ;
   private String A11616PrdNmQu ;
   private String AV351Listaprd_wcds_1_filterfulltext ;
   private String lV351Listaprd_wcds_1_filterfulltext ;
   private String AV13PrdOkotexDescription ;
   private String AV14PrdListDescription ;
   private String AV336PageInfo ;
   private String AV333DateInfo ;
   private String AV331AppName ;
   private com.genexus.webpanels.WebSession AV16Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09FA2_A742PrdUniCom ;
   private byte[] P09FA2_A743PrdUniCon ;
   private byte[] P09FA2_A856ValCod ;
   private String[] P09FA2_A396EmprCod ;
   private byte[] P09FA2_A3273PrdTnq ;
   private java.math.BigDecimal[] P09FA2_A5416PrdDensS ;
   private String[] P09FA2_A11616PrdNmQu ;
   private String[] P09FA2_A11615PrdFuncion ;
   private String[] P09FA2_A11614PrdEINECS ;
   private String[] P09FA2_A11663PrdCtw4 ;
   private String[] P09FA2_A10938PrdCtw3 ;
   private String[] P09FA2_A10937PrdCtw2 ;
   private String[] P09FA2_A10936PrdCtw1 ;
   private String[] P09FA2_A10935PrdRTM ;
   private String[] P09FA2_A11196PrdNroCAS ;
   private String[] P09FA2_A6302TipPrdDsc ;
   private boolean[] P09FA2_n6302TipPrdDsc ;
   private short[] P09FA2_A6301TipPrdCod ;
   private boolean[] P09FA2_n6301TipPrdCod ;
   private String[] P09FA2_A10119PrdColIdx ;
   private java.math.BigDecimal[] P09FA2_A9733PrdAox ;
   private short[] P09FA2_A1644PrdDqo ;
   private String[] P09FA2_A11364PrdHm ;
   private String[] P09FA2_A11363PrdGots ;
   private String[] P09FA2_A5887PrdReach ;
   private String[] P09FA2_A9741PrdHS ;
   private String[] P09FA2_A9739PrdFT ;
   private java.math.BigDecimal[] P09FA2_A724PrdPreAct ;
   private String[] P09FA2_A4693PrdNum2 ;
   private String[] P09FA2_A857ValDsc ;
   private boolean[] P09FA2_n857ValDsc ;
   private java.math.BigDecimal[] P09FA2_A707PrdFacCon ;
   private String[] P09FA2_A736PrdUcoDsc ;
   private boolean[] P09FA2_n736PrdUcoDsc ;
   private String[] P09FA2_A737PrdUcpDsc ;
   private boolean[] P09FA2_n737PrdUcpDsc ;
   private byte[] P09FA2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] P09FA2_A685PrdCanRes ;
   private String[] P09FA2_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09FA2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09FA2_A704PrdExiAlm ;
   private String[] P09FA2_A794PrvNom ;
   private boolean[] P09FA2_n794PrvNom ;
   private int[] P09FA2_A795PrvNum ;
   private String[] P09FA2_A718PrdNom ;
   private String[] P09FA2_A719PrdNum ;
   private String[] P09FA2_A11687PrdList ;
   private String[] P09FA2_A5888PrdOkotex ;
   private java.util.Date[] P09FA2_A9742PrdFHS ;
   private java.util.Date[] P09FA2_A9740PrdFFT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
}

final  class listaprd_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV353Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV352Listaprd_wcds_2_tfprdnum ,
                                          String AV355Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV354Listaprd_wcds_4_tfprdnom ,
                                          int AV356Listaprd_wcds_6_tfprvnum ,
                                          int AV357Listaprd_wcds_7_tfprvnum_to ,
                                          String AV359Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV358Listaprd_wcds_8_tfprvnom ,
                                          String AV340EmprCod ,
                                          String AV341PrdNumFrom ,
                                          String AV342PrdNumTo ,
                                          int AV343PrvNumFrom ,
                                          int AV344PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV351Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.EmprCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T5.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdReach," ;
      scmdbuf += " T1.PrdHS, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T4.ValDsc, T1.PrdFacCon, T3.UniDsc AS PrdUcoDsc, T2.UniDsc AS PrdUcpDsc, T1.PrdUMeFo, T1.PrdCanRes, T1.PrdRefPrv," ;
      scmdbuf += " T1.PrdExiCC, T1.PrdExiAlm, T6.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.PrdList, T1.PrdOkotex, T1.PrdFHS, T1.PrdFFT FROM (((((TXPPRODUC T1 INNER JOIN TXPTIPUNI" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T6 ON T6.EmprCod = T1.EmprCod AND T6.PrvNum = T1.PrvNum)" ;
      if ( (GXutil.strcmp("", AV353Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV352Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV353Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV355Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV354Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV355Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV356Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV357Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV359Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV358Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV359Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.PrvNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV340EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV341PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV342PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV343PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV344PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.UniDsc" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.UniDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ValDsc" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ValDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFT" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFT DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFFT" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFFT DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHS" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHS DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFHS" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFHS DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdReach" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdReach DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV10OrderedBy == 23 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHm" ;
      }
      else if ( ( AV10OrderedBy == 23 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHm DESC" ;
      }
      else if ( ( AV10OrderedBy == 24 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDqo" ;
      }
      else if ( ( AV10OrderedBy == 24 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDqo DESC" ;
      }
      else if ( ( AV10OrderedBy == 25 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAox" ;
      }
      else if ( ( AV10OrderedBy == 25 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAox DESC" ;
      }
      else if ( ( AV10OrderedBy == 26 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx" ;
      }
      else if ( ( AV10OrderedBy == 26 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx DESC" ;
      }
      else if ( ( AV10OrderedBy == 27 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod" ;
      }
      else if ( ( AV10OrderedBy == 27 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 28 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc" ;
      }
      else if ( ( AV10OrderedBy == 28 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 29 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS" ;
      }
      else if ( ( AV10OrderedBy == 29 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS DESC" ;
      }
      else if ( ( AV10OrderedBy == 30 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRTM" ;
      }
      else if ( ( AV10OrderedBy == 30 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRTM DESC" ;
      }
      else if ( ( AV10OrderedBy == 31 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1" ;
      }
      else if ( ( AV10OrderedBy == 31 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1 DESC" ;
      }
      else if ( ( AV10OrderedBy == 32 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2" ;
      }
      else if ( ( AV10OrderedBy == 32 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 33 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3" ;
      }
      else if ( ( AV10OrderedBy == 33 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3 DESC" ;
      }
      else if ( ( AV10OrderedBy == 34 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4" ;
      }
      else if ( ( AV10OrderedBy == 34 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4 DESC" ;
      }
      else if ( ( AV10OrderedBy == 35 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdList" ;
      }
      else if ( ( AV10OrderedBy == 35 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdList DESC" ;
      }
      else if ( ( AV10OrderedBy == 36 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV10OrderedBy == 36 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV10OrderedBy == 37 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV10OrderedBy == 37 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV10OrderedBy == 38 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu" ;
      }
      else if ( ( AV10OrderedBy == 38 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu DESC" ;
      }
      else if ( ( AV10OrderedBy == 39 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDensS" ;
      }
      else if ( ( AV10OrderedBy == 39 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDensS DESC" ;
      }
      else if ( ( AV10OrderedBy == 40 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdTnq" ;
      }
      else if ( ( AV10OrderedBy == 40 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdTnq DESC" ;
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
                  return conditional_P09FA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 10);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((String[]) buf[28])[0] = rslt.getString(27, 16);
               ((String[]) buf[29])[0] = rslt.getString(28, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,4);
               ((String[]) buf[32])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(32);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,4);
               ((String[]) buf[38])[0] = rslt.getString(34, 30);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(35,4);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((String[]) buf[41])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(38);
               ((String[]) buf[44])[0] = rslt.getString(39, 26);
               ((String[]) buf[45])[0] = rslt.getString(40, 6);
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((String[]) buf[47])[0] = rslt.getString(42, 1);
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDate(43);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(44);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

