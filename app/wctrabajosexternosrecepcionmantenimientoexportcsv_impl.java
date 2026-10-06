package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctrabajosexternosrecepcionmantenimientoexportcsv_impl extends GXWebProcedure
{
   public wctrabajosexternosrecepcionmantenimientoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "WCTrabajosExternosRecepcionMantenimientoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cerrar Fase?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inf Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV30FilterFullText ;
      AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV42TFRpExHdLi ;
      AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV43TFRpExHdLi_To ;
      AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV40TFRpExHdFe ;
      AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV38TFRpExHdAlb ;
      AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV39TFRpExHdAlb_To ;
      AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV44TFCliCod ;
      AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV45TFCliCod_To ;
      AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV46TFCliNom ;
      AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV47TFCliNom_Sel ;
      AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV48TFBarSer ;
      AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV54EmprCod ,
                                           Short.valueOf(AV55Mancod) ,
                                           AV56RpExHdFe ,
                                           A396EmprCod ,
                                           Short.valueOf(A2248ManCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor P091H2 */
      pr_default.execute(0, new Object[] {AV54EmprCod, Short.valueOf(AV55Mancod), AV56RpExHdFe, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2248ManCod = P091H2_A2248ManCod[0] ;
         A396EmprCod = P091H2_A396EmprCod[0] ;
         A1652BarSerDsc = P091H2_A1652BarSerDsc[0] ;
         A212BarSer = P091H2_A212BarSer[0] ;
         A279CliNom = P091H2_A279CliNom[0] ;
         A252CliCod = P091H2_A252CliCod[0] ;
         n252CliCod = P091H2_n252CliCod[0] ;
         A2714RpExHdAlb = P091H2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091H2_n2714RpExHdAlb[0] ;
         A2711RpExHdFe = P091H2_A2711RpExHdFe[0] ;
         A2713RpExHdLi = P091H2_A2713RpExHdLi[0] ;
         A2716RpExHdCns = P091H2_A2716RpExHdCns[0] ;
         n2716RpExHdCns = P091H2_n2716RpExHdCns[0] ;
         A6262RpExSalLn = P091H2_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P091H2_n6262RpExSalLn[0] ;
         A130BarCodPar = P091H2_A130BarCodPar[0] ;
         A132BarCodReo = P091H2_A132BarCodReo[0] ;
         A129BarCod = P091H2_A129BarCod[0] ;
         A2715RpExHdKgs = P091H2_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = P091H2_n2715RpExHdKgs[0] ;
         A2847RpExHdMts = P091H2_A2847RpExHdMts[0] ;
         n2847RpExHdMts = P091H2_n2847RpExHdMts[0] ;
         A2717RpExHdTip = P091H2_A2717RpExHdTip[0] ;
         n2717RpExHdTip = P091H2_n2717RpExHdTip[0] ;
         A1652BarSerDsc = P091H2_A1652BarSerDsc[0] ;
         A212BarSer = P091H2_A212BarSer[0] ;
         A252CliCod = P091H2_A252CliCod[0] ;
         n252CliCod = P091H2_n252CliCod[0] ;
         A279CliNom = P091H2_A279CliNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2713RpExHdLi, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A2711RpExHdFe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2714RpExHdAlb, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV31RpExHdCns = A2716RpExHdCns ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31RpExHdCns, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int4 = AV81Pzs ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int5[0] = A2714RpExHdAlb ;
            GXv_int6[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char8[0] = A130BarCodPar ;
            GXv_int9[0] = A2248ManCod ;
            GXv_int10[0] = A6262RpExSalLn ;
            GXv_int11[0] = (byte)(AV89FlagLin) ;
            GXv_int12[0] = GXt_int4 ;
            new app.piezaspendientesexhdpz(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_int9, GXv_int10, GXv_int11, GXv_int12) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2714RpExHdAlb = GXv_int5[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A129BarCod = GXv_int6[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A132BarCodReo = GXv_int7[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A130BarCodPar = GXv_char8[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2248ManCod = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A6262RpExSalLn = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.AV89FlagLin = GXv_int11[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_int4 = GXv_int12[0] ;
            AV81Pzs = (short)(GXt_int4) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV81Pzs, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32RpExHdKgs = A2715RpExHdKgs ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32RpExHdKgs, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_decimal13 = AV82Kgs ;
            GXv_char8[0] = A396EmprCod ;
            GXv_int12[0] = A2714RpExHdAlb ;
            GXv_int6[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_int10[0] = A2248ManCod ;
            GXv_int9[0] = A6262RpExSalLn ;
            GXv_int7[0] = (byte)(AV89FlagLin) ;
            GXv_decimal14[0] = GXt_decimal13 ;
            new app.kilospendientesexhdpz(remoteHandle, context).execute( GXv_char8, GXv_int12, GXv_int6, GXv_int11, GXv_char3, GXv_int10, GXv_int9, GXv_int7, GXv_decimal14) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A396EmprCod = GXv_char8[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2714RpExHdAlb = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A129BarCod = GXv_int6[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A132BarCodReo = GXv_int11[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A130BarCodPar = GXv_char3[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2248ManCod = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A6262RpExSalLn = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.AV89FlagLin = GXv_int7[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
            AV82Kgs = GXt_decimal13 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV82Kgs, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV33RpExHdMts = A2847RpExHdMts ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV33RpExHdMts, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_decimal13 = AV83Mts ;
            GXv_char8[0] = A396EmprCod ;
            GXv_int12[0] = A2714RpExHdAlb ;
            GXv_int6[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_int10[0] = A2248ManCod ;
            GXv_int9[0] = A6262RpExSalLn ;
            GXv_int7[0] = (byte)(AV89FlagLin) ;
            GXv_decimal14[0] = GXt_decimal13 ;
            new app.metrospendientesexhdpz(remoteHandle, context).execute( GXv_char8, GXv_int12, GXv_int6, GXv_int11, GXv_char3, GXv_int10, GXv_int9, GXv_int7, GXv_decimal14) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A396EmprCod = GXv_char8[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2714RpExHdAlb = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A129BarCod = GXv_int6[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A132BarCodReo = GXv_int11[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A130BarCodPar = GXv_char3[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A2248ManCod = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.A6262RpExSalLn = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.AV89FlagLin = GXv_int7[0] ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
            AV83Mts = GXt_decimal13 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV83Mts, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34RpExHdTip = A2717RpExHdTip ;
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( AV34RpExHdTip), "P") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Parcial", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV34RpExHdTip), "T") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Total", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV87Flag = ((GXutil.strcmp(AV34RpExHdTip, "T")==0) ? "S" : "N") ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char8[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV87Flag, ";", ","), GXv_char8) ;
            wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_char2 = GXv_char8[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV88Informacion, 1, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCTrabajosExternosRecepcionMantenimientoExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "RpExHdLi", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "RpExHdFe", "", "Fecha Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "RpExHdAlb", "", "Nº Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&RpExHdCns", "Recepcion", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Pzs", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&RpExHdKgs", "Recepcion", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Kgs", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&RpExHdMts", "Recepcion", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Mts", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&RpExHdTip", "", "Tipo Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Flag", "", "Cerrar Fase?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Informacion", "", "Inf Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char8[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoColumnsSelector", GXv_char8) ;
      wctrabajosexternosrecepcionmantenimientoexportcsv_impl.this.GXt_char2 = GXv_char8[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      AV28OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDLI") == 0 )
         {
            AV42TFRpExHdLi = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFRpExHdLi_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDFE") == 0 )
         {
            AV40TFRpExHdFe = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDALB") == 0 )
         {
            AV38TFRpExHdAlb = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFRpExHdAlb_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV44TFCliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
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
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A2711RpExHdFe = GXutil.nullDate() ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = GXutil.nullDate() ;
      AV40TFRpExHdFe = GXutil.nullDate() ;
      AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      AV46TFCliNom = "" ;
      AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = "" ;
      AV47TFCliNom_Sel = "" ;
      AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      AV48TFBarSer = "" ;
      AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = "" ;
      AV49TFBarSer_Sel = "" ;
      AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV50TFBarSerDsc = "" ;
      AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      scmdbuf = "" ;
      lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      lV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      lV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      lV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV54EmprCod = "" ;
      AV56RpExHdFe = GXutil.nullDate() ;
      P091H2_A2248ManCod = new short[1] ;
      P091H2_A396EmprCod = new String[] {""} ;
      P091H2_A1652BarSerDsc = new String[] {""} ;
      P091H2_A212BarSer = new String[] {""} ;
      P091H2_A279CliNom = new String[] {""} ;
      P091H2_A252CliCod = new int[1] ;
      P091H2_n252CliCod = new boolean[] {false} ;
      P091H2_A2714RpExHdAlb = new int[1] ;
      P091H2_n2714RpExHdAlb = new boolean[] {false} ;
      P091H2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091H2_A2713RpExHdLi = new short[1] ;
      P091H2_A2716RpExHdCns = new short[1] ;
      P091H2_n2716RpExHdCns = new boolean[] {false} ;
      P091H2_A6262RpExSalLn = new short[1] ;
      P091H2_n6262RpExSalLn = new boolean[] {false} ;
      P091H2_A130BarCodPar = new String[] {""} ;
      P091H2_A132BarCodReo = new byte[1] ;
      P091H2_A129BarCod = new int[1] ;
      P091H2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091H2_n2715RpExHdKgs = new boolean[] {false} ;
      P091H2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091H2_n2847RpExHdMts = new boolean[] {false} ;
      P091H2_A2717RpExHdTip = new String[] {""} ;
      P091H2_n2717RpExHdTip = new boolean[] {false} ;
      GXv_int5 = new int[1] ;
      AV32RpExHdKgs = DecimalUtil.ZERO ;
      AV82Kgs = DecimalUtil.ZERO ;
      AV33RpExHdMts = DecimalUtil.ZERO ;
      AV83Mts = DecimalUtil.ZERO ;
      GXt_decimal13 = DecimalUtil.ZERO ;
      GXv_int12 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      AV34RpExHdTip = "" ;
      AV87Flag = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char8 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctrabajosexternosrecepcionmantenimientoexportcsv__default(),
         new Object[] {
             new Object[] {
            P091H2_A2248ManCod, P091H2_A396EmprCod, P091H2_A1652BarSerDsc, P091H2_A212BarSer, P091H2_A279CliNom, P091H2_A252CliCod, P091H2_n252CliCod, P091H2_A2714RpExHdAlb, P091H2_n2714RpExHdAlb, P091H2_A2711RpExHdFe,
            P091H2_A2713RpExHdLi, P091H2_A2716RpExHdCns, P091H2_n2716RpExHdCns, P091H2_A6262RpExSalLn, P091H2_n6262RpExSalLn, P091H2_A130BarCodPar, P091H2_A132BarCodReo, P091H2_A129BarCod, P091H2_A2715RpExHdKgs, P091H2_n2715RpExHdKgs,
            P091H2_A2847RpExHdMts, P091H2_n2847RpExHdMts, P091H2_A2717RpExHdTip, P091H2_n2717RpExHdTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int11[] ;
   private byte GXv_int7[] ;
   private byte AV88Informacion ;
   private short gxcookieaux ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A2248ManCod ;
   private short A6262RpExSalLn ;
   private short AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ;
   private short AV42TFRpExHdLi ;
   private short AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ;
   private short AV43TFRpExHdLi_To ;
   private short AV28OrderedBy ;
   private short AV55Mancod ;
   private short AV31RpExHdCns ;
   private short AV81Pzs ;
   private short AV89FlagLin ;
   private short GXv_int10[] ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2714RpExHdAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ;
   private int AV38TFRpExHdAlb ;
   private int AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ;
   private int AV39TFRpExHdAlb_To ;
   private int AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ;
   private int AV44TFCliCod ;
   private int AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ;
   private int AV45TFCliCod_To ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int GXv_int12[] ;
   private int GXv_int6[] ;
   private int AV107GXV1 ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal AV32RpExHdKgs ;
   private java.math.BigDecimal AV82Kgs ;
   private java.math.BigDecimal AV33RpExHdMts ;
   private java.math.BigDecimal AV83Mts ;
   private java.math.BigDecimal GXt_decimal13 ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2717RpExHdTip ;
   private String AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String AV46TFCliNom ;
   private String AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ;
   private String AV47TFCliNom_Sel ;
   private String AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String AV48TFBarSer ;
   private String AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ;
   private String AV49TFBarSer_Sel ;
   private String AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV50TFBarSerDsc ;
   private String AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ;
   private String AV51TFBarSerDsc_Sel ;
   private String scmdbuf ;
   private String lV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String lV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String lV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV54EmprCod ;
   private String GXv_char3[] ;
   private String AV34RpExHdTip ;
   private String AV87Flag ;
   private String GXt_char2 ;
   private String GXv_char8[] ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ;
   private java.util.Date AV40TFRpExHdFe ;
   private java.util.Date AV56RpExHdFe ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n2714RpExHdAlb ;
   private boolean n2716RpExHdCns ;
   private boolean n6262RpExSalLn ;
   private boolean n2715RpExHdKgs ;
   private boolean n2847RpExHdMts ;
   private boolean n2717RpExHdTip ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P091H2_A2248ManCod ;
   private String[] P091H2_A396EmprCod ;
   private String[] P091H2_A1652BarSerDsc ;
   private String[] P091H2_A212BarSer ;
   private String[] P091H2_A279CliNom ;
   private int[] P091H2_A252CliCod ;
   private boolean[] P091H2_n252CliCod ;
   private int[] P091H2_A2714RpExHdAlb ;
   private boolean[] P091H2_n2714RpExHdAlb ;
   private java.util.Date[] P091H2_A2711RpExHdFe ;
   private short[] P091H2_A2713RpExHdLi ;
   private short[] P091H2_A2716RpExHdCns ;
   private boolean[] P091H2_n2716RpExHdCns ;
   private short[] P091H2_A6262RpExSalLn ;
   private boolean[] P091H2_n6262RpExSalLn ;
   private String[] P091H2_A130BarCodPar ;
   private byte[] P091H2_A132BarCodReo ;
   private int[] P091H2_A129BarCod ;
   private java.math.BigDecimal[] P091H2_A2715RpExHdKgs ;
   private boolean[] P091H2_n2715RpExHdKgs ;
   private java.math.BigDecimal[] P091H2_A2847RpExHdMts ;
   private boolean[] P091H2_n2847RpExHdMts ;
   private String[] P091H2_A2717RpExHdTip ;
   private boolean[] P091H2_n2717RpExHdTip ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wctrabajosexternosrecepcionmantenimientoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV54EmprCod ,
                                          short AV55Mancod ,
                                          java.util.Date AV56RpExHdFe ,
                                          String A396EmprCod ,
                                          short A2248ManCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[22];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.ManCod, T1.EmprCod, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.RpExHdAlb, T1.RpExHdFe, T1.RpExHdLi, T1.RpExHdCns, T1.RpExSalLn, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.RpExHdKgs, T1.RpExHdMts, T1.RpExHdTip FROM ((TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV93Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV94Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV95Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV97Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV98Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV99Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV100Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV103Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdLi" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdLi DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdFe" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdFe DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdAlb" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdAlb DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P091H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
      }
   }

}

