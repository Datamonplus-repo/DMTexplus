package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeprocedenciastejido_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeprocedenciastejido_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProcedenciasTejido_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nif", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Población", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Provincia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Postal (PT)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Teléfono", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Teléfono", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Persona Contacto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Email", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV60Emprcod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV30FilterFullText ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV34TFProceCod ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV35TFProceCod_To ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV36TFProceNom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV37TFProceNom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV38TFProceNif ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV39TFProceNif_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV40TFProceDom ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV41TFProceDom_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV42TFProcePob ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV43TFProcePob_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV44TFPrvCod ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV45TFPrvCod_To ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV46TFPrvDsc ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV47TFPrvDsc_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV48TFPoceCp ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV49TFPoceCp_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV63TFPoceCp2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV64TFPoceCp2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV50TFProceTel1 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV51TFProceTel1_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV52TFProceTel2 ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV53TFProceTel2_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV54TFProceTelex ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV55TFProceTelex_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV56TFProPers ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV57TFProPers_Sel ;
      AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV58TFProEmail ;
      AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV59TFProEmail_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV61Procecodfrom) ,
                                           Short.valueOf(AV62Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HF2 */
      pr_default.execute(0, new Object[] {AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV61Procecodfrom), Short.valueOf(AV62Procecodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10391ProEmail = P09HF2_A10391ProEmail[0] ;
         n10391ProEmail = P09HF2_n10391ProEmail[0] ;
         A10390ProPers = P09HF2_A10390ProPers[0] ;
         n10390ProPers = P09HF2_n10390ProPers[0] ;
         A992ProceTelex = P09HF2_A992ProceTelex[0] ;
         n992ProceTelex = P09HF2_n992ProceTelex[0] ;
         A991ProceTel2 = P09HF2_A991ProceTel2[0] ;
         n991ProceTel2 = P09HF2_n991ProceTel2[0] ;
         A990ProceTel1 = P09HF2_A990ProceTel1[0] ;
         n990ProceTel1 = P09HF2_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HF2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HF2_n14029PoceCp2[0] ;
         A989PoceCp = P09HF2_A989PoceCp[0] ;
         n989PoceCp = P09HF2_n989PoceCp[0] ;
         A787PrvDsc = P09HF2_A787PrvDsc[0] ;
         n787PrvDsc = P09HF2_n787PrvDsc[0] ;
         A781PrvCod = P09HF2_A781PrvCod[0] ;
         n781PrvCod = P09HF2_n781PrvCod[0] ;
         A988ProcePob = P09HF2_A988ProcePob[0] ;
         n988ProcePob = P09HF2_n988ProcePob[0] ;
         A994ProceDom = P09HF2_A994ProceDom[0] ;
         n994ProceDom = P09HF2_n994ProceDom[0] ;
         A993ProceNif = P09HF2_A993ProceNif[0] ;
         n993ProceNif = P09HF2_n993ProceNif[0] ;
         A971ProceNom = P09HF2_A971ProceNom[0] ;
         n971ProceNom = P09HF2_n971ProceNom[0] ;
         A970ProceCod = P09HF2_A970ProceCod[0] ;
         A396EmprCod = P09HF2_A396EmprCod[0] ;
         A787PrvDsc = P09HF2_A787PrvDsc[0] ;
         n787PrvDsc = P09HF2_n787PrvDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A970ProceCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A993ProceNif, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A994ProceDom, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A988ProcePob, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A781PrvCod, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A787PrvDsc, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A989PoceCp, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14029PoceCp2, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A990ProceTel1, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A991ProceTel2, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A992ProceTelex, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10390ProPers, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10391ProEmail, ";", ","), GXv_char3) ;
            listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeProcedenciasTejido_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNif", "", "Nif", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceDom", "", "Domicilio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProcePob", "", "Población", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDsc", "", "Provincia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PoceCp", "", "Código Postal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PoceCp2", "", "Postal (PT)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTel1", "", "Teléfono", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTel2", "", "Teléfono", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceTelex", "", "Telex", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProPers", "", "Persona Contacto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProEmail", "", "Email", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector", GXv_char3) ;
      listadodeprocedenciastejido_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV34TFProceCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFProceCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV36TFProceNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV37TFProceNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV38TFProceNif = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV39TFProceNif_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV40TFProceDom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV41TFProceDom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV42TFProcePob = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV43TFProcePob_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV44TFPrvCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV46TFPrvDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV47TFPrvDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV48TFPoceCp = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV49TFPoceCp_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV63TFPoceCp2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV64TFPoceCp2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV50TFProceTel1 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV51TFProceTel1_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV52TFProceTel2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV53TFProceTel2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV54TFProceTelex = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV55TFProceTelex_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV56TFProPers = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV57TFProPers_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV58TFProEmail = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV59TFProEmail_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV60Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODFROM") == 0 )
         {
            AV61Procecodfrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODTO") == 0 )
         {
            AV62Procecodto = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
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
      A971ProceNom = "" ;
      A993ProceNif = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A14029PoceCp2 = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = "" ;
      AV60Emprcod = "" ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      AV36TFProceNom = "" ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = "" ;
      AV37TFProceNom_Sel = "" ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      AV38TFProceNif = "" ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = "" ;
      AV39TFProceNif_Sel = "" ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      AV40TFProceDom = "" ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = "" ;
      AV41TFProceDom_Sel = "" ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      AV42TFProcePob = "" ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = "" ;
      AV43TFProcePob_Sel = "" ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      AV46TFPrvDsc = "" ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = "" ;
      AV47TFPrvDsc_Sel = "" ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      AV48TFPoceCp = "" ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = "" ;
      AV49TFPoceCp_Sel = "" ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      AV63TFPoceCp2 = "" ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = "" ;
      AV64TFPoceCp2_Sel = "" ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      AV50TFProceTel1 = "" ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = "" ;
      AV51TFProceTel1_Sel = "" ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      AV52TFProceTel2 = "" ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = "" ;
      AV53TFProceTel2_Sel = "" ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      AV54TFProceTelex = "" ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = "" ;
      AV55TFProceTelex_Sel = "" ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      AV56TFProPers = "" ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = "" ;
      AV57TFProPers_Sel = "" ;
      AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      AV58TFProEmail = "" ;
      AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = "" ;
      AV59TFProEmail_Sel = "" ;
      scmdbuf = "" ;
      lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      lV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      A396EmprCod = "" ;
      P09HF2_A10391ProEmail = new String[] {""} ;
      P09HF2_n10391ProEmail = new boolean[] {false} ;
      P09HF2_A10390ProPers = new String[] {""} ;
      P09HF2_n10390ProPers = new boolean[] {false} ;
      P09HF2_A992ProceTelex = new String[] {""} ;
      P09HF2_n992ProceTelex = new boolean[] {false} ;
      P09HF2_A991ProceTel2 = new String[] {""} ;
      P09HF2_n991ProceTel2 = new boolean[] {false} ;
      P09HF2_A990ProceTel1 = new String[] {""} ;
      P09HF2_n990ProceTel1 = new boolean[] {false} ;
      P09HF2_A14029PoceCp2 = new String[] {""} ;
      P09HF2_n14029PoceCp2 = new boolean[] {false} ;
      P09HF2_A989PoceCp = new String[] {""} ;
      P09HF2_n989PoceCp = new boolean[] {false} ;
      P09HF2_A787PrvDsc = new String[] {""} ;
      P09HF2_n787PrvDsc = new boolean[] {false} ;
      P09HF2_A781PrvCod = new short[1] ;
      P09HF2_n781PrvCod = new boolean[] {false} ;
      P09HF2_A988ProcePob = new String[] {""} ;
      P09HF2_n988ProcePob = new boolean[] {false} ;
      P09HF2_A994ProceDom = new String[] {""} ;
      P09HF2_n994ProceDom = new boolean[] {false} ;
      P09HF2_A993ProceNif = new String[] {""} ;
      P09HF2_n993ProceNif = new boolean[] {false} ;
      P09HF2_A971ProceNom = new String[] {""} ;
      P09HF2_n971ProceNom = new boolean[] {false} ;
      P09HF2_A970ProceCod = new short[1] ;
      P09HF2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.listadodeprocedenciastejido_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09HF2_A10391ProEmail, P09HF2_n10391ProEmail, P09HF2_A10390ProPers, P09HF2_n10390ProPers, P09HF2_A992ProceTelex, P09HF2_n992ProceTelex, P09HF2_A991ProceTel2, P09HF2_n991ProceTel2, P09HF2_A990ProceTel1, P09HF2_n990ProceTel1,
            P09HF2_A14029PoceCp2, P09HF2_n14029PoceCp2, P09HF2_A989PoceCp, P09HF2_n989PoceCp, P09HF2_A787PrvDsc, P09HF2_n787PrvDsc, P09HF2_A781PrvCod, P09HF2_n781PrvCod, P09HF2_A988ProcePob, P09HF2_n988ProcePob,
            P09HF2_A994ProceDom, P09HF2_n994ProceDom, P09HF2_A993ProceNif, P09HF2_n993ProceNif, P09HF2_A971ProceNom, P09HF2_n971ProceNom, P09HF2_A970ProceCod, P09HF2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ;
   private short AV34TFProceCod ;
   private short AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ;
   private short AV35TFProceCod_To ;
   private short AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ;
   private short AV44TFPrvCod ;
   private short AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ;
   private short AV45TFPrvCod_To ;
   private short AV61Procecodfrom ;
   private short AV62Procecodto ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV98GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A971ProceNom ;
   private String A993ProceNif ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A14029PoceCp2 ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ;
   private String AV60Emprcod ;
   private String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String AV36TFProceNom ;
   private String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ;
   private String AV37TFProceNom_Sel ;
   private String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String AV38TFProceNif ;
   private String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ;
   private String AV39TFProceNif_Sel ;
   private String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String AV40TFProceDom ;
   private String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ;
   private String AV41TFProceDom_Sel ;
   private String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String AV42TFProcePob ;
   private String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ;
   private String AV43TFProcePob_Sel ;
   private String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String AV46TFPrvDsc ;
   private String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ;
   private String AV47TFPrvDsc_Sel ;
   private String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String AV48TFPoceCp ;
   private String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ;
   private String AV49TFPoceCp_Sel ;
   private String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String AV63TFPoceCp2 ;
   private String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ;
   private String AV64TFPoceCp2_Sel ;
   private String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String AV50TFProceTel1 ;
   private String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ;
   private String AV51TFProceTel1_Sel ;
   private String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String AV52TFProceTel2 ;
   private String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ;
   private String AV53TFProceTel2_Sel ;
   private String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String AV54TFProceTelex ;
   private String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ;
   private String AV55TFProceTelex_Sel ;
   private String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String AV56TFProPers ;
   private String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ;
   private String AV57TFProPers_Sel ;
   private String AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String AV58TFProEmail ;
   private String AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ;
   private String AV59TFProEmail_Sel ;
   private String scmdbuf ;
   private String lV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String lV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String lV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String lV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String lV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String lV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String lV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String lV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String lV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String lV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String lV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String lV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n14029PoceCp2 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean n993ProceNif ;
   private boolean n971ProceNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09HF2_A10391ProEmail ;
   private boolean[] P09HF2_n10391ProEmail ;
   private String[] P09HF2_A10390ProPers ;
   private boolean[] P09HF2_n10390ProPers ;
   private String[] P09HF2_A992ProceTelex ;
   private boolean[] P09HF2_n992ProceTelex ;
   private String[] P09HF2_A991ProceTel2 ;
   private boolean[] P09HF2_n991ProceTel2 ;
   private String[] P09HF2_A990ProceTel1 ;
   private boolean[] P09HF2_n990ProceTel1 ;
   private String[] P09HF2_A14029PoceCp2 ;
   private boolean[] P09HF2_n14029PoceCp2 ;
   private String[] P09HF2_A989PoceCp ;
   private boolean[] P09HF2_n989PoceCp ;
   private String[] P09HF2_A787PrvDsc ;
   private boolean[] P09HF2_n787PrvDsc ;
   private short[] P09HF2_A781PrvCod ;
   private boolean[] P09HF2_n781PrvCod ;
   private String[] P09HF2_A988ProcePob ;
   private boolean[] P09HF2_n988ProcePob ;
   private String[] P09HF2_A994ProceDom ;
   private boolean[] P09HF2_n994ProceDom ;
   private String[] P09HF2_A993ProceNif ;
   private boolean[] P09HF2_n993ProceNif ;
   private String[] P09HF2_A971ProceNom ;
   private boolean[] P09HF2_n971ProceNom ;
   private short[] P09HF2_A970ProceCod ;
   private String[] P09HF2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class listadodeprocedenciastejido_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV61Procecodfrom ,
                                          short AV62Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[45];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif, T1.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV70Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV80Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV94Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV96Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV61Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV62Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNif" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceNif DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceDom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceDom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProcePob" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProcePob DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PrvCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PrvCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.PrvDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T2.PrvDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PoceCp DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp2" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.PoceCp2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel1" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTel1 DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel2" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTel2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTelex" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProceTelex DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProPers" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProPers DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ProEmail" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.ProEmail DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09HF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 14);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 34);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
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
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
      }
   }

}

