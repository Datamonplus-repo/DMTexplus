package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ccstkswwexportcsv_impl extends GXWebProcedure
{
   public ccstkswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "CCSTKSWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CCSTKSWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("CCSTKSWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Tipo Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Tipo Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "CCStkPri", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Movimiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hoja de Ruta", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reoperado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Particion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea Entrada Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "CcoCod", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor Entradas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor salidas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ValorEI", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ValorSI", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV87Ccstkswwds_1_filterfulltext = AV30FilterFullText ;
      AV88Ccstkswwds_2_tfemprcod = AV34TFEmprCod ;
      AV89Ccstkswwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV90Ccstkswwds_4_tfprdnum = AV36TFPrdNum ;
      AV91Ccstkswwds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV92Ccstkswwds_6_tfccstklin = AV38TFCCStkLin ;
      AV93Ccstkswwds_7_tfccstklin_to = AV39TFCCStkLin_To ;
      AV94Ccstkswwds_8_tfccstkcane = AV40TFCCStkCanE ;
      AV95Ccstkswwds_9_tfccstkcane_to = AV41TFCCStkCanE_To ;
      AV96Ccstkswwds_10_tfccstkcans = AV42TFCCStkCanS ;
      AV97Ccstkswwds_11_tfccstkcans_to = AV43TFCCStkCanS_To ;
      AV98Ccstkswwds_12_tftipmovcc = AV44TFTipMovCc ;
      AV99Ccstkswwds_13_tftipmovcc_sel = AV45TFTipMovCc_Sel ;
      AV100Ccstkswwds_14_tftipmovcn = AV46TFTipMovCn ;
      AV101Ccstkswwds_15_tftipmovcn_sel = AV47TFTipMovCn_Sel ;
      AV102Ccstkswwds_16_tfccstkpri = AV48TFCCStkPri ;
      AV103Ccstkswwds_17_tfccstkpri_sel = AV49TFCCStkPri_Sel ;
      AV104Ccstkswwds_18_tfccstkfec = AV50TFCCStkFec ;
      AV105Ccstkswwds_19_tfccstkpre = AV52TFCCStkPre ;
      AV106Ccstkswwds_20_tfccstkpre_to = AV53TFCCStkPre_To ;
      AV107Ccstkswwds_21_tfccstkbar = AV54TFCCStkBar ;
      AV108Ccstkswwds_22_tfccstkbar_to = AV55TFCCStkBar_To ;
      AV109Ccstkswwds_23_tfccstkreo = AV56TFCCStkReo ;
      AV110Ccstkswwds_24_tfccstkreo_to = AV57TFCCStkReo_To ;
      AV111Ccstkswwds_25_tfccstkpar = AV58TFCCStkPar ;
      AV112Ccstkswwds_26_tfccstkpar_sel = AV59TFCCStkPar_Sel ;
      AV113Ccstkswwds_27_tfccstkped = AV60TFCCStkPed ;
      AV114Ccstkswwds_28_tfccstkped_to = AV61TFCCStkPed_To ;
      AV115Ccstkswwds_29_tfccstkalb = AV62TFCCStkAlb ;
      AV116Ccstkswwds_30_tfccstkalb_sel = AV63TFCCStkAlb_Sel ;
      AV117Ccstkswwds_31_tfccstkusu = AV64TFCCStkUsu ;
      AV118Ccstkswwds_32_tfccstkusu_sel = AV65TFCCStkUsu_Sel ;
      AV119Ccstkswwds_33_tfccstkhor = AV66TFCCStkHor ;
      AV120Ccstkswwds_34_tfccstkhor_sel = AV67TFCCStkHor_Sel ;
      AV121Ccstkswwds_35_tfccstkdsc = AV68TFCCStkDsc ;
      AV122Ccstkswwds_36_tfccstkdsc_sel = AV69TFCCStkDsc_Sel ;
      AV123Ccstkswwds_37_tfccstklen = AV70TFCCStkLen ;
      AV124Ccstkswwds_38_tfccstklen_to = AV71TFCCStkLen_To ;
      AV125Ccstkswwds_39_tfprdexialm = AV72TFPrdExiAlm ;
      AV126Ccstkswwds_40_tfprdexialm_to = AV73TFPrdExiAlm_To ;
      AV127Ccstkswwds_41_tfccocod = AV74TFCcoCod ;
      AV128Ccstkswwds_42_tfccocod_to = AV75TFCcoCod_To ;
      AV129Ccstkswwds_43_tfvalore = AV76TFValorE ;
      AV130Ccstkswwds_44_tfvalore_to = AV77TFValorE_To ;
      AV131Ccstkswwds_45_tfvalors = AV78TFValorS ;
      AV132Ccstkswwds_46_tfvalors_to = AV79TFValorS_To ;
      AV133Ccstkswwds_47_tfvalorei = AV80TFValorEI ;
      AV134Ccstkswwds_48_tfvalorei_to = AV81TFValorEI_To ;
      AV135Ccstkswwds_49_tfvalorsi = AV82TFValorSI ;
      AV136Ccstkswwds_50_tfvalorsi_to = AV83TFValorSI_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV89Ccstkswwds_3_tfemprcod_sel ,
                                           AV88Ccstkswwds_2_tfemprcod ,
                                           AV91Ccstkswwds_5_tfprdnum_sel ,
                                           AV90Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV92Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV93Ccstkswwds_7_tfccstklin_to) ,
                                           AV94Ccstkswwds_8_tfccstkcane ,
                                           AV95Ccstkswwds_9_tfccstkcane_to ,
                                           AV96Ccstkswwds_10_tfccstkcans ,
                                           AV97Ccstkswwds_11_tfccstkcans_to ,
                                           AV99Ccstkswwds_13_tftipmovcc_sel ,
                                           AV98Ccstkswwds_12_tftipmovcc ,
                                           AV101Ccstkswwds_15_tftipmovcn_sel ,
                                           AV100Ccstkswwds_14_tftipmovcn ,
                                           AV103Ccstkswwds_17_tfccstkpri_sel ,
                                           AV102Ccstkswwds_16_tfccstkpri ,
                                           AV104Ccstkswwds_18_tfccstkfec ,
                                           AV105Ccstkswwds_19_tfccstkpre ,
                                           AV106Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV107Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV108Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV109Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV110Ccstkswwds_24_tfccstkreo_to) ,
                                           AV112Ccstkswwds_26_tfccstkpar_sel ,
                                           AV111Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV113Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV114Ccstkswwds_28_tfccstkped_to) ,
                                           AV116Ccstkswwds_30_tfccstkalb_sel ,
                                           AV115Ccstkswwds_29_tfccstkalb ,
                                           AV118Ccstkswwds_32_tfccstkusu_sel ,
                                           AV117Ccstkswwds_31_tfccstkusu ,
                                           AV120Ccstkswwds_34_tfccstkhor_sel ,
                                           AV119Ccstkswwds_33_tfccstkhor ,
                                           AV122Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV121Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV123Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV124Ccstkswwds_38_tfccstklen_to) ,
                                           AV125Ccstkswwds_39_tfprdexialm ,
                                           AV126Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV127Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV128Ccstkswwds_42_tfccocod_to) ,
                                           AV133Ccstkswwds_47_tfvalorei ,
                                           AV134Ccstkswwds_48_tfvalorei_to ,
                                           AV135Ccstkswwds_49_tfvalorsi ,
                                           AV136Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV87Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV129Ccstkswwds_43_tfvalore ,
                                           AV130Ccstkswwds_44_tfvalore_to ,
                                           AV131Ccstkswwds_45_tfvalors ,
                                           AV132Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV87Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Ccstkswwds_1_filterfulltext), "%", "") ;
      lV88Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV88Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV90Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV90Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV98Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV100Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV100Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV102Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV102Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV111Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV115Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV117Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV119Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV119Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV121Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV121Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LH3 */
      pr_default.execute(0, new Object[] {AV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, lV87Ccstkswwds_1_filterfulltext, AV129Ccstkswwds_43_tfvalore, AV129Ccstkswwds_43_tfvalore, AV130Ccstkswwds_44_tfvalore_to, AV130Ccstkswwds_44_tfvalore_to, AV131Ccstkswwds_45_tfvalors, AV131Ccstkswwds_45_tfvalors, AV132Ccstkswwds_46_tfvalors_to, AV132Ccstkswwds_46_tfvalors_to, lV88Ccstkswwds_2_tfemprcod, AV89Ccstkswwds_3_tfemprcod_sel, lV90Ccstkswwds_4_tfprdnum, AV91Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV92Ccstkswwds_6_tfccstklin), Long.valueOf(AV93Ccstkswwds_7_tfccstklin_to), AV94Ccstkswwds_8_tfccstkcane, AV95Ccstkswwds_9_tfccstkcane_to, AV96Ccstkswwds_10_tfccstkcans, AV97Ccstkswwds_11_tfccstkcans_to, lV98Ccstkswwds_12_tftipmovcc, AV99Ccstkswwds_13_tftipmovcc_sel, lV100Ccstkswwds_14_tftipmovcn, AV101Ccstkswwds_15_tftipmovcn_sel, lV102Ccstkswwds_16_tfccstkpri, AV103Ccstkswwds_17_tfccstkpri_sel, AV104Ccstkswwds_18_tfccstkfec, AV105Ccstkswwds_19_tfccstkpre, AV106Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV107Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV108Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV109Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV110Ccstkswwds_24_tfccstkreo_to), lV111Ccstkswwds_25_tfccstkpar, AV112Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV113Ccstkswwds_27_tfccstkped), Integer.valueOf(AV114Ccstkswwds_28_tfccstkped_to), lV115Ccstkswwds_29_tfccstkalb, AV116Ccstkswwds_30_tfccstkalb_sel, lV117Ccstkswwds_31_tfccstkusu, AV118Ccstkswwds_32_tfccstkusu_sel, lV119Ccstkswwds_33_tfccstkhor, AV120Ccstkswwds_34_tfccstkhor_sel, lV121Ccstkswwds_35_tfccstkdsc, AV122Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV123Ccstkswwds_37_tfccstklen), Short.valueOf(AV124Ccstkswwds_38_tfccstklen_to), AV125Ccstkswwds_39_tfprdexialm, AV126Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV127Ccstkswwds_41_tfccocod), Short.valueOf(AV128Ccstkswwds_42_tfccocod_to), AV133Ccstkswwds_47_tfvalorei, AV134Ccstkswwds_48_tfvalorei_to, AV135Ccstkswwds_49_tfvalorsi, AV136Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3917ValorSI = P09LH3_A3917ValorSI[0] ;
         A3916ValorEI = P09LH3_A3916ValorEI[0] ;
         A3839CcoCod = P09LH3_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LH3_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LH3_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LH3_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LH3_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LH3_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LH3_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LH3_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LH3_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LH3_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LH3_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LH3_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LH3_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LH3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LH3_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LH3_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LH3_A3342CCStkLin[0] ;
         A719PrdNum = P09LH3_A719PrdNum[0] ;
         A396EmprCod = P09LH3_A396EmprCod[0] ;
         A3344CCStkCanS = P09LH3_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LH3_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LH3_A3343CCStkCanE[0] ;
         A3910ValorS = P09LH3_A3910ValorS[0] ;
         A3909ValorE = P09LH3_A3909ValorE[0] ;
         A704PrdExiAlm = P09LH3_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LH3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LH3_n3346TipMovCn[0] ;
         A3910ValorS = P09LH3_A3910ValorS[0] ;
         A3909ValorE = P09LH3_A3909ValorE[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3342CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3343CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3344CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3345TipMovCc, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3346TipMovCn, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3347CCStkPri, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3349CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3350CCStkBar, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3351CCStkReo, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3352CCStkPar, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3353CCStkPed, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3354CCStkAlb, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3355CCStkUsu, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3356CCStkHor, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3357CCStkDsc, ";", ","), GXv_char3) ;
            ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3358CCStkLen, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3839CcoCod, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3909ValorE, 11, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3910ValorS, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3916ValorEI, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3917ValorSI, 14, 5) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CCSTKSWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkLin", "", "Linea Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkCanE", "", "Cantidad Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkCanS", "", "Cantidad Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMovCc", "", "Codigo Tipo Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMovCn", "", "Descripcion Tipo Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkPri", "", "CCStkPri", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkFec", "", "Fecha Movimiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkBar", "", "Hoja de Ruta", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkReo", "", "Reoperado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkPar", "", "Particion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkPed", "", "Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkAlb", "", "Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkUsu", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkLen", "", "Linea Entrada Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CcoCod", "", "CcoCod", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValorE", "", "Valor Entradas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValorS", "", "Valor salidas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValorEI", "", "ValorEI", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValorSI", "", "ValorSI", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CCSTKSWWColumnsSelector", GXv_char3) ;
      ccstkswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CCSTKSWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CCSTKSWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("CCSTKSWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV137GXV1 = 1 ;
      while ( AV137GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV137GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV38TFCCStkLin = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV39TFCCStkLin_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANE") == 0 )
         {
            AV40TFCCStkCanE = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFCCStkCanE_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV42TFCCStkCanS = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFCCStkCanS_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV44TFTipMovCc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV45TFTipMovCc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV46TFTipMovCn = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV47TFTipMovCn_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI") == 0 )
         {
            AV48TFCCStkPri = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI_SEL") == 0 )
         {
            AV49TFCCStkPri_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV50TFCCStkFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV52TFCCStkPre = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFCCStkPre_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKBAR") == 0 )
         {
            AV54TFCCStkBar = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFCCStkBar_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKREO") == 0 )
         {
            AV56TFCCStkReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFCCStkReo_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR") == 0 )
         {
            AV58TFCCStkPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR_SEL") == 0 )
         {
            AV59TFCCStkPar_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPED") == 0 )
         {
            AV60TFCCStkPed = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCCStkPed_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV62TFCCStkAlb = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV63TFCCStkAlb_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV64TFCCStkUsu = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV65TFCCStkUsu_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV66TFCCStkHor = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV67TFCCStkHor_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV68TFCCStkDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV69TFCCStkDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLEN") == 0 )
         {
            AV70TFCCStkLen = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFCCStkLen_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV72TFPrdExiAlm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFPrdExiAlm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCOCOD") == 0 )
         {
            AV74TFCcoCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFCcoCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORE") == 0 )
         {
            AV76TFValorE = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFValorE_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORS") == 0 )
         {
            AV78TFValorS = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFValorS_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALOREI") == 0 )
         {
            AV80TFValorEI = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV81TFValorEI_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORSI") == 0 )
         {
            AV82TFValorSI = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV83TFValorSI_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV137GXV1 = (int)(AV137GXV1+1) ;
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
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      AV87Ccstkswwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV88Ccstkswwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV89Ccstkswwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV90Ccstkswwds_4_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV91Ccstkswwds_5_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV94Ccstkswwds_8_tfccstkcane = DecimalUtil.ZERO ;
      AV40TFCCStkCanE = DecimalUtil.ZERO ;
      AV95Ccstkswwds_9_tfccstkcane_to = DecimalUtil.ZERO ;
      AV41TFCCStkCanE_To = DecimalUtil.ZERO ;
      AV96Ccstkswwds_10_tfccstkcans = DecimalUtil.ZERO ;
      AV42TFCCStkCanS = DecimalUtil.ZERO ;
      AV97Ccstkswwds_11_tfccstkcans_to = DecimalUtil.ZERO ;
      AV43TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV98Ccstkswwds_12_tftipmovcc = "" ;
      AV44TFTipMovCc = "" ;
      AV99Ccstkswwds_13_tftipmovcc_sel = "" ;
      AV45TFTipMovCc_Sel = "" ;
      AV100Ccstkswwds_14_tftipmovcn = "" ;
      AV46TFTipMovCn = "" ;
      AV101Ccstkswwds_15_tftipmovcn_sel = "" ;
      AV47TFTipMovCn_Sel = "" ;
      AV102Ccstkswwds_16_tfccstkpri = "" ;
      AV48TFCCStkPri = "" ;
      AV103Ccstkswwds_17_tfccstkpri_sel = "" ;
      AV49TFCCStkPri_Sel = "" ;
      AV104Ccstkswwds_18_tfccstkfec = GXutil.nullDate() ;
      AV50TFCCStkFec = GXutil.nullDate() ;
      AV105Ccstkswwds_19_tfccstkpre = DecimalUtil.ZERO ;
      AV52TFCCStkPre = DecimalUtil.ZERO ;
      AV106Ccstkswwds_20_tfccstkpre_to = DecimalUtil.ZERO ;
      AV53TFCCStkPre_To = DecimalUtil.ZERO ;
      AV111Ccstkswwds_25_tfccstkpar = "" ;
      AV58TFCCStkPar = "" ;
      AV112Ccstkswwds_26_tfccstkpar_sel = "" ;
      AV59TFCCStkPar_Sel = "" ;
      AV115Ccstkswwds_29_tfccstkalb = "" ;
      AV62TFCCStkAlb = "" ;
      AV116Ccstkswwds_30_tfccstkalb_sel = "" ;
      AV63TFCCStkAlb_Sel = "" ;
      AV117Ccstkswwds_31_tfccstkusu = "" ;
      AV64TFCCStkUsu = "" ;
      AV118Ccstkswwds_32_tfccstkusu_sel = "" ;
      AV65TFCCStkUsu_Sel = "" ;
      AV119Ccstkswwds_33_tfccstkhor = "" ;
      AV66TFCCStkHor = "" ;
      AV120Ccstkswwds_34_tfccstkhor_sel = "" ;
      AV67TFCCStkHor_Sel = "" ;
      AV121Ccstkswwds_35_tfccstkdsc = "" ;
      AV68TFCCStkDsc = "" ;
      AV122Ccstkswwds_36_tfccstkdsc_sel = "" ;
      AV69TFCCStkDsc_Sel = "" ;
      AV125Ccstkswwds_39_tfprdexialm = DecimalUtil.ZERO ;
      AV72TFPrdExiAlm = DecimalUtil.ZERO ;
      AV126Ccstkswwds_40_tfprdexialm_to = DecimalUtil.ZERO ;
      AV73TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV129Ccstkswwds_43_tfvalore = DecimalUtil.ZERO ;
      AV76TFValorE = DecimalUtil.ZERO ;
      AV130Ccstkswwds_44_tfvalore_to = DecimalUtil.ZERO ;
      AV77TFValorE_To = DecimalUtil.ZERO ;
      AV131Ccstkswwds_45_tfvalors = DecimalUtil.ZERO ;
      AV78TFValorS = DecimalUtil.ZERO ;
      AV132Ccstkswwds_46_tfvalors_to = DecimalUtil.ZERO ;
      AV79TFValorS_To = DecimalUtil.ZERO ;
      AV133Ccstkswwds_47_tfvalorei = DecimalUtil.ZERO ;
      AV80TFValorEI = DecimalUtil.ZERO ;
      AV134Ccstkswwds_48_tfvalorei_to = DecimalUtil.ZERO ;
      AV81TFValorEI_To = DecimalUtil.ZERO ;
      AV135Ccstkswwds_49_tfvalorsi = DecimalUtil.ZERO ;
      AV82TFValorSI = DecimalUtil.ZERO ;
      AV136Ccstkswwds_50_tfvalorsi_to = DecimalUtil.ZERO ;
      AV83TFValorSI_To = DecimalUtil.ZERO ;
      lV87Ccstkswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV88Ccstkswwds_2_tfemprcod = "" ;
      lV90Ccstkswwds_4_tfprdnum = "" ;
      lV98Ccstkswwds_12_tftipmovcc = "" ;
      lV100Ccstkswwds_14_tftipmovcn = "" ;
      lV102Ccstkswwds_16_tfccstkpri = "" ;
      lV111Ccstkswwds_25_tfccstkpar = "" ;
      lV115Ccstkswwds_29_tfccstkalb = "" ;
      lV117Ccstkswwds_31_tfccstkusu = "" ;
      lV119Ccstkswwds_33_tfccstkhor = "" ;
      lV121Ccstkswwds_35_tfccstkdsc = "" ;
      P09LH3_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3839CcoCod = new short[1] ;
      P09LH3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3358CCStkLen = new short[1] ;
      P09LH3_A3357CCStkDsc = new String[] {""} ;
      P09LH3_A3356CCStkHor = new String[] {""} ;
      P09LH3_A3355CCStkUsu = new String[] {""} ;
      P09LH3_A3354CCStkAlb = new String[] {""} ;
      P09LH3_A3353CCStkPed = new int[1] ;
      P09LH3_A3352CCStkPar = new String[] {""} ;
      P09LH3_A3351CCStkReo = new byte[1] ;
      P09LH3_A3350CCStkBar = new int[1] ;
      P09LH3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LH3_A3347CCStkPri = new String[] {""} ;
      P09LH3_A3346TipMovCn = new String[] {""} ;
      P09LH3_n3346TipMovCn = new boolean[] {false} ;
      P09LH3_A3345TipMovCc = new String[] {""} ;
      P09LH3_A3342CCStkLin = new long[1] ;
      P09LH3_A719PrdNum = new String[] {""} ;
      P09LH3_A396EmprCod = new String[] {""} ;
      P09LH3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LH3_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstkswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09LH3_A3917ValorSI, P09LH3_A3916ValorEI, P09LH3_A3839CcoCod, P09LH3_A704PrdExiAlm, P09LH3_A3358CCStkLen, P09LH3_A3357CCStkDsc, P09LH3_A3356CCStkHor, P09LH3_A3355CCStkUsu, P09LH3_A3354CCStkAlb, P09LH3_A3353CCStkPed,
            P09LH3_A3352CCStkPar, P09LH3_A3351CCStkReo, P09LH3_A3350CCStkBar, P09LH3_A3348CCStkFec, P09LH3_A3347CCStkPri, P09LH3_A3346TipMovCn, P09LH3_n3346TipMovCn, P09LH3_A3345TipMovCc, P09LH3_A3342CCStkLin, P09LH3_A719PrdNum,
            P09LH3_A396EmprCod, P09LH3_A3344CCStkCanS, P09LH3_A3349CCStkPre, P09LH3_A3343CCStkCanE, P09LH3_A3910ValorS, P09LH3_A3909ValorE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private byte AV109Ccstkswwds_23_tfccstkreo ;
   private byte AV56TFCCStkReo ;
   private byte AV110Ccstkswwds_24_tfccstkreo_to ;
   private byte AV57TFCCStkReo_To ;
   private short gxcookieaux ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short AV123Ccstkswwds_37_tfccstklen ;
   private short AV70TFCCStkLen ;
   private short AV124Ccstkswwds_38_tfccstklen_to ;
   private short AV71TFCCStkLen_To ;
   private short AV127Ccstkswwds_41_tfccocod ;
   private short AV74TFCcoCod ;
   private short AV128Ccstkswwds_42_tfccocod_to ;
   private short AV75TFCcoCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV107Ccstkswwds_21_tfccstkbar ;
   private int AV54TFCCStkBar ;
   private int AV108Ccstkswwds_22_tfccstkbar_to ;
   private int AV55TFCCStkBar_To ;
   private int AV113Ccstkswwds_27_tfccstkped ;
   private int AV60TFCCStkPed ;
   private int AV114Ccstkswwds_28_tfccstkped_to ;
   private int AV61TFCCStkPed_To ;
   private int AV137GXV1 ;
   private long A3342CCStkLin ;
   private long AV92Ccstkswwds_6_tfccstklin ;
   private long AV38TFCCStkLin ;
   private long AV93Ccstkswwds_7_tfccstklin_to ;
   private long AV39TFCCStkLin_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal AV94Ccstkswwds_8_tfccstkcane ;
   private java.math.BigDecimal AV40TFCCStkCanE ;
   private java.math.BigDecimal AV95Ccstkswwds_9_tfccstkcane_to ;
   private java.math.BigDecimal AV41TFCCStkCanE_To ;
   private java.math.BigDecimal AV96Ccstkswwds_10_tfccstkcans ;
   private java.math.BigDecimal AV42TFCCStkCanS ;
   private java.math.BigDecimal AV97Ccstkswwds_11_tfccstkcans_to ;
   private java.math.BigDecimal AV43TFCCStkCanS_To ;
   private java.math.BigDecimal AV105Ccstkswwds_19_tfccstkpre ;
   private java.math.BigDecimal AV52TFCCStkPre ;
   private java.math.BigDecimal AV106Ccstkswwds_20_tfccstkpre_to ;
   private java.math.BigDecimal AV53TFCCStkPre_To ;
   private java.math.BigDecimal AV125Ccstkswwds_39_tfprdexialm ;
   private java.math.BigDecimal AV72TFPrdExiAlm ;
   private java.math.BigDecimal AV126Ccstkswwds_40_tfprdexialm_to ;
   private java.math.BigDecimal AV73TFPrdExiAlm_To ;
   private java.math.BigDecimal AV129Ccstkswwds_43_tfvalore ;
   private java.math.BigDecimal AV76TFValorE ;
   private java.math.BigDecimal AV130Ccstkswwds_44_tfvalore_to ;
   private java.math.BigDecimal AV77TFValorE_To ;
   private java.math.BigDecimal AV131Ccstkswwds_45_tfvalors ;
   private java.math.BigDecimal AV78TFValorS ;
   private java.math.BigDecimal AV132Ccstkswwds_46_tfvalors_to ;
   private java.math.BigDecimal AV79TFValorS_To ;
   private java.math.BigDecimal AV133Ccstkswwds_47_tfvalorei ;
   private java.math.BigDecimal AV80TFValorEI ;
   private java.math.BigDecimal AV134Ccstkswwds_48_tfvalorei_to ;
   private java.math.BigDecimal AV81TFValorEI_To ;
   private java.math.BigDecimal AV135Ccstkswwds_49_tfvalorsi ;
   private java.math.BigDecimal AV82TFValorSI ;
   private java.math.BigDecimal AV136Ccstkswwds_50_tfvalorsi_to ;
   private java.math.BigDecimal AV83TFValorSI_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3346TipMovCn ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A3357CCStkDsc ;
   private String AV88Ccstkswwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV89Ccstkswwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV90Ccstkswwds_4_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV91Ccstkswwds_5_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String AV98Ccstkswwds_12_tftipmovcc ;
   private String AV44TFTipMovCc ;
   private String AV99Ccstkswwds_13_tftipmovcc_sel ;
   private String AV45TFTipMovCc_Sel ;
   private String AV100Ccstkswwds_14_tftipmovcn ;
   private String AV46TFTipMovCn ;
   private String AV101Ccstkswwds_15_tftipmovcn_sel ;
   private String AV47TFTipMovCn_Sel ;
   private String AV102Ccstkswwds_16_tfccstkpri ;
   private String AV48TFCCStkPri ;
   private String AV103Ccstkswwds_17_tfccstkpri_sel ;
   private String AV49TFCCStkPri_Sel ;
   private String AV111Ccstkswwds_25_tfccstkpar ;
   private String AV58TFCCStkPar ;
   private String AV112Ccstkswwds_26_tfccstkpar_sel ;
   private String AV59TFCCStkPar_Sel ;
   private String AV115Ccstkswwds_29_tfccstkalb ;
   private String AV62TFCCStkAlb ;
   private String AV116Ccstkswwds_30_tfccstkalb_sel ;
   private String AV63TFCCStkAlb_Sel ;
   private String AV117Ccstkswwds_31_tfccstkusu ;
   private String AV64TFCCStkUsu ;
   private String AV118Ccstkswwds_32_tfccstkusu_sel ;
   private String AV65TFCCStkUsu_Sel ;
   private String AV119Ccstkswwds_33_tfccstkhor ;
   private String AV66TFCCStkHor ;
   private String AV120Ccstkswwds_34_tfccstkhor_sel ;
   private String AV67TFCCStkHor_Sel ;
   private String AV121Ccstkswwds_35_tfccstkdsc ;
   private String AV68TFCCStkDsc ;
   private String AV122Ccstkswwds_36_tfccstkdsc_sel ;
   private String AV69TFCCStkDsc_Sel ;
   private String scmdbuf ;
   private String lV88Ccstkswwds_2_tfemprcod ;
   private String lV90Ccstkswwds_4_tfprdnum ;
   private String lV98Ccstkswwds_12_tftipmovcc ;
   private String lV100Ccstkswwds_14_tftipmovcn ;
   private String lV102Ccstkswwds_16_tfccstkpri ;
   private String lV111Ccstkswwds_25_tfccstkpar ;
   private String lV115Ccstkswwds_29_tfccstkalb ;
   private String lV117Ccstkswwds_31_tfccstkusu ;
   private String lV119Ccstkswwds_33_tfccstkhor ;
   private String lV121Ccstkswwds_35_tfccstkdsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV104Ccstkswwds_18_tfccstkfec ;
   private java.util.Date AV50TFCCStkFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n3346TipMovCn ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV87Ccstkswwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV87Ccstkswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09LH3_A3917ValorSI ;
   private java.math.BigDecimal[] P09LH3_A3916ValorEI ;
   private short[] P09LH3_A3839CcoCod ;
   private java.math.BigDecimal[] P09LH3_A704PrdExiAlm ;
   private short[] P09LH3_A3358CCStkLen ;
   private String[] P09LH3_A3357CCStkDsc ;
   private String[] P09LH3_A3356CCStkHor ;
   private String[] P09LH3_A3355CCStkUsu ;
   private String[] P09LH3_A3354CCStkAlb ;
   private int[] P09LH3_A3353CCStkPed ;
   private String[] P09LH3_A3352CCStkPar ;
   private byte[] P09LH3_A3351CCStkReo ;
   private int[] P09LH3_A3350CCStkBar ;
   private java.util.Date[] P09LH3_A3348CCStkFec ;
   private String[] P09LH3_A3347CCStkPri ;
   private String[] P09LH3_A3346TipMovCn ;
   private boolean[] P09LH3_n3346TipMovCn ;
   private String[] P09LH3_A3345TipMovCc ;
   private long[] P09LH3_A3342CCStkLin ;
   private String[] P09LH3_A719PrdNum ;
   private String[] P09LH3_A396EmprCod ;
   private java.math.BigDecimal[] P09LH3_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LH3_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LH3_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LH3_A3910ValorS ;
   private java.math.BigDecimal[] P09LH3_A3909ValorE ;
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

final  class ccstkswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Ccstkswwds_3_tfemprcod_sel ,
                                          String AV88Ccstkswwds_2_tfemprcod ,
                                          String AV91Ccstkswwds_5_tfprdnum_sel ,
                                          String AV90Ccstkswwds_4_tfprdnum ,
                                          long AV92Ccstkswwds_6_tfccstklin ,
                                          long AV93Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV94Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV95Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV96Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV97Ccstkswwds_11_tfccstkcans_to ,
                                          String AV99Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV98Ccstkswwds_12_tftipmovcc ,
                                          String AV101Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV100Ccstkswwds_14_tftipmovcn ,
                                          String AV103Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV102Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV104Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV105Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV106Ccstkswwds_20_tfccstkpre_to ,
                                          int AV107Ccstkswwds_21_tfccstkbar ,
                                          int AV108Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV109Ccstkswwds_23_tfccstkreo ,
                                          byte AV110Ccstkswwds_24_tfccstkreo_to ,
                                          String AV112Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV111Ccstkswwds_25_tfccstkpar ,
                                          int AV113Ccstkswwds_27_tfccstkped ,
                                          int AV114Ccstkswwds_28_tfccstkped_to ,
                                          String AV116Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV115Ccstkswwds_29_tfccstkalb ,
                                          String AV118Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV117Ccstkswwds_31_tfccstkusu ,
                                          String AV120Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV119Ccstkswwds_33_tfccstkhor ,
                                          String AV122Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV121Ccstkswwds_35_tfccstkdsc ,
                                          short AV123Ccstkswwds_37_tfccstklen ,
                                          short AV124Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV125Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV126Ccstkswwds_40_tfprdexialm_to ,
                                          short AV127Ccstkswwds_41_tfccocod ,
                                          short AV128Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV133Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV134Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV135Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV136Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV87Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV129Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV130Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV131Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV132Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[78];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm, T1.CCStkLen," ;
      scmdbuf += " T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV89Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV90Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV92Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV93Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV100Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV102Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV107Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV108Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (0==AV113Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (0==AV114Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV119Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (0==AV127Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (0==AV128Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanE DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLin" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkCanS DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMovCc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMovCc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipMovCn" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipMovCn DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPri" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkFec" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPre" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkBar" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkBar DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkReo" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPar" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPar DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkPed" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkPed DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkAlb DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkUsu DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkHor" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCStkLen" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCStkLen DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CcoCod" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CcoCod DESC" ;
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
                  return conditional_P09LH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
      }
   }

}

