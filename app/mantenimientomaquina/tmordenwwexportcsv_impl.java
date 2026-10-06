package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordenwwexportcsv_impl extends GXWebProcedure
{
   public tmordenwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMOrdenWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMOrdenWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "# Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Preventivo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Creación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Prevista", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext = AV30FilterFullText ;
      AV88Mantenimientomaquina_tmordenwwds_2_tfomcod = AV39TFOMCod ;
      AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to = AV40TFOMCod_To ;
      AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod = AV51TFPMCod ;
      AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to = AV52TFPMCod_To ;
      AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc = AV82TFPMDsc ;
      AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = AV83TFPMDsc_Sel ;
      AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod = AV41TFOMMaqCod ;
      AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = AV42TFOMMaqCod_Sel ;
      AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = AV45TFOMMaqDsc ;
      AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = AV46TFOMMaqDsc_Sel ;
      AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = AV43TFOMMaqCodFor ;
      AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = AV44TFOMMaqCodFor_Sel ;
      AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = AV47TFOMDscMqPla ;
      AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = AV48TFOMDscMqPla_Sel ;
      AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod = AV49TFSMCod ;
      AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to = AV50TFSMCod_To ;
      AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels = AV76TFOMEst_Sels ;
      AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre = AV63TFOMUsuCre ;
      AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = AV64TFOMUsuCre_Sel ;
      AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre = AV59TFOMFchCre ;
      AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt = AV53TFOMTxt ;
      AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = AV54TFOMTxt_Sel ;
      AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre = AV55TFOMFchPre ;
      AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer = AV57TFOMFchCer ;
      AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion = AV61TFOMDuracion ;
      AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = AV62TFOMDuracion_Sel ;
      AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea = AV65TFOMCosRea ;
      AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = AV66TFOMCosRea_To ;
      AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost = AV67TFOMRRCosT ;
      AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = AV68TFOMRRCosT_To ;
      AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost = AV69TFOMRCCosT ;
      AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = AV70TFOMRCCosT_To ;
      AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost = AV71TFOMMRCosT ;
      AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = AV72TFOMMRCosT_To ;
      AV122Mantenimientomaquina_tmordenwwds_36_tfommccost = AV73TFOMMCCosT ;
      AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to = AV74TFOMMCCosT_To ;
      AV124Mantenimientomaquina_tmordenwwds_38_tfomnot = AV77TFOMNot ;
      AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = AV78TFOMNot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV88Mantenimientomaquina_tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) ,
                                           AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                           AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                           AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                           AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                           AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                           AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels.size()) ,
                                           AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                           AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                           AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                           AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                           AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                           AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                           AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                           AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                           AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                           AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                           AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                           AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                           AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                           AV122Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                           AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                           AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                           AV124Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                           AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                           AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                           AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                           AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                           AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV105Mantenimientomaquina_tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre), 8, "%") ;
      lV108Mantenimientomaquina_tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt), "%", "") ;
      lV124Mantenimientomaquina_tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV124Mantenimientomaquina_tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08Q37 */
      pr_default.execute(0, new Object[] {AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, lV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, lV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV88Mantenimientomaquina_tmordenwwds_2_tfomcod), Integer.valueOf(AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to), Integer.valueOf(AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod), Integer.valueOf(AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to), lV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc, AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel, lV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod, AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel, lV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc, AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod), Integer.valueOf(AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to), lV105Mantenimientomaquina_tmordenwwds_19_tfomusucre, AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel, AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre, lV108Mantenimientomaquina_tmordenwwds_22_tfomtxt, AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel, AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre, AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer, AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost, AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to, AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost, AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to, AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost, AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to, AV122Mantenimientomaquina_tmordenwwds_36_tfommccost, AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to, lV124Mantenimientomaquina_tmordenwwds_38_tfomnot, AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08Q37_A396EmprCod[0] ;
         A9464OMNot = P08Q37_A9464OMNot[0] ;
         A9439OMFchCer = P08Q37_A9439OMFchCer[0] ;
         A9438OMFchPre = P08Q37_A9438OMFchPre[0] ;
         A9433OMTxt = P08Q37_A9433OMTxt[0] ;
         A9436OMFchCre = P08Q37_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08Q37_A9437OMUsuCre[0] ;
         A9428SMCod = P08Q37_A9428SMCod[0] ;
         n9428SMCod = P08Q37_n9428SMCod[0] ;
         A9427OMMaqDsc = P08Q37_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q37_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08Q37_A9426OMMaqCod[0] ;
         A9473PMDsc = P08Q37_A9473PMDsc[0] ;
         n9473PMDsc = P08Q37_n9473PMDsc[0] ;
         A9429PMCod = P08Q37_A9429PMCod[0] ;
         n9429PMCod = P08Q37_n9429PMCod[0] ;
         A9425OMCod = P08Q37_A9425OMCod[0] ;
         A13678OMDscMqPla = P08Q37_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q37_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q37_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q37_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08Q37_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08Q37_A9443OMRCCosT[0] ;
         A9445OMEst = P08Q37_A9445OMEst[0] ;
         A9442OMMRCosT = P08Q37_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08Q37_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08Q37_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q37_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08Q37_A9473PMDsc[0] ;
         n9473PMDsc = P08Q37_n9473PMDsc[0] ;
         A9441OMMCCosT = P08Q37_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08Q37_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08Q37_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08Q37_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08Q37_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q37_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q37_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q37_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV14TextFileLine = "" ;
                        /* Execute user subroutine: 'BEFOREWRITELINE' */
                        S162 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           returnInSub = true;
                           if (true) return;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A9425OMCod, 8, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A9429PMCod, 8, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9473PMDsc, ";", ","), GXv_char3) ;
                           tmordenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9426OMMaqCod, ";", ","), GXv_char3) ;
                           tmordenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9427OMMaqDsc, ";", ","), GXv_char3) ;
                           tmordenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "P") == 0 )
                           {
                              AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
                           }
                           else if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "R") == 0 )
                           {
                              AV14TextFileLine += httpContext.getMessage( "Realizada", "") ;
                           }
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9437OMUsuCre, ";", ","), GXv_char3) ;
                           tmordenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.dtoc( A9438OMFchPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        }
                        /* Execute user subroutine: 'AFTERWRITELINE' */
                        S172 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
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
                     }
                  }
               }
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMOrdenWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Sel", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMCod", "", "# Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PMCod", "", "Preventivo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PMDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMaqCod", "", "Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMaqDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMaqCodFor", "", "Cod For", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMDscMqPla", "", "Mq Planificar", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMCod", "", "Solicitud", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMUsuCre", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMFchCre", "", "Fecha Creación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMTxt", "", "Descripcion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMFchPre", "", "Fecha Prevista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMFchCer", "", "Cerrada", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMDuracion", "", "Duracion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMCosRea", "", "Costo Real", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMRRCosT", "", "Costo Total Reserva Repuesto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMRCCosT", "", "Costo Total Consumo Repuesto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMRCosT", "", "Costo Total Reserva Mano Obra", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMMCCosT", "", "Costo Total Consumo Mano Obra", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "OMNot", "", "Nota", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMOrdenWWColumnsSelector", GXv_char3) ;
      tmordenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV39TFOMCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFOMCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV51TFPMCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFPMCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV82TFPMDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV83TFPMDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV41TFOMMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV42TFOMMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV45TFOMMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV46TFOMMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR") == 0 )
         {
            AV43TFOMMaqCodFor = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR_SEL") == 0 )
         {
            AV44TFOMMaqCodFor_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA") == 0 )
         {
            AV47TFOMDscMqPla = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA_SEL") == 0 )
         {
            AV48TFOMDscMqPla_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV49TFSMCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFSMCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV75TFOMEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFOMEst_Sels.fromJSonString(AV75TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV63TFOMUsuCre = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV64TFOMUsuCre_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV59TFOMFchCre = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV53TFOMTxt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV54TFOMTxt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV55TFOMFchPre = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV57TFOMFchCer = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION") == 0 )
         {
            AV61TFOMDuracion = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION_SEL") == 0 )
         {
            AV62TFOMDuracion_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOSREA") == 0 )
         {
            AV65TFOMCosRea = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFOMCosRea_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRRCOST") == 0 )
         {
            AV67TFOMRRCosT = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFOMRRCosT_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRCCOST") == 0 )
         {
            AV69TFOMRCCosT = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFOMRCCosT_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV71TFOMMRCosT = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV72TFOMMRCosT_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCOST") == 0 )
         {
            AV73TFOMMCCosT = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFOMMCCosT_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV77TFOMNot = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV78TFOMNot_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
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
      A9473PMDsc = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9445OMEst = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      AV82TFPMDsc = "" ;
      AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = "" ;
      AV83TFPMDsc_Sel = "" ;
      AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      AV41TFOMMaqCod = "" ;
      AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = "" ;
      AV42TFOMMaqCod_Sel = "" ;
      AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      AV45TFOMMaqDsc = "" ;
      AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = "" ;
      AV46TFOMMaqDsc_Sel = "" ;
      AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      AV43TFOMMaqCodFor = "" ;
      AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = "" ;
      AV44TFOMMaqCodFor_Sel = "" ;
      AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      AV47TFOMDscMqPla = "" ;
      AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = "" ;
      AV48TFOMDscMqPla_Sel = "" ;
      AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      AV63TFOMUsuCre = "" ;
      AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = "" ;
      AV64TFOMUsuCre_Sel = "" ;
      AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV59TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      AV53TFOMTxt = "" ;
      AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = "" ;
      AV54TFOMTxt_Sel = "" ;
      AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre = GXutil.nullDate() ;
      AV55TFOMFchPre = GXutil.nullDate() ;
      AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV57TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion = "" ;
      AV61TFOMDuracion = "" ;
      AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = "" ;
      AV62TFOMDuracion_Sel = "" ;
      AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea = DecimalUtil.ZERO ;
      AV65TFOMCosRea = DecimalUtil.ZERO ;
      AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = DecimalUtil.ZERO ;
      AV66TFOMCosRea_To = DecimalUtil.ZERO ;
      AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost = DecimalUtil.ZERO ;
      AV67TFOMRRCosT = DecimalUtil.ZERO ;
      AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = DecimalUtil.ZERO ;
      AV68TFOMRRCosT_To = DecimalUtil.ZERO ;
      AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost = DecimalUtil.ZERO ;
      AV69TFOMRCCosT = DecimalUtil.ZERO ;
      AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = DecimalUtil.ZERO ;
      AV70TFOMRCCosT_To = DecimalUtil.ZERO ;
      AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost = DecimalUtil.ZERO ;
      AV71TFOMMRCosT = DecimalUtil.ZERO ;
      AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = DecimalUtil.ZERO ;
      AV72TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV122Mantenimientomaquina_tmordenwwds_36_tfommccost = DecimalUtil.ZERO ;
      AV73TFOMMCCosT = DecimalUtil.ZERO ;
      AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to = DecimalUtil.ZERO ;
      AV74TFOMMCCosT_To = DecimalUtil.ZERO ;
      AV124Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      AV77TFOMNot = "" ;
      AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = "" ;
      AV78TFOMNot_Sel = "" ;
      lV87Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      lV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      lV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      lV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      lV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      lV105Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      lV108Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      lV124Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      A9433OMTxt = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9464OMNot = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      P08Q37_A396EmprCod = new String[] {""} ;
      P08Q37_A9464OMNot = new String[] {""} ;
      P08Q37_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q37_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q37_A9433OMTxt = new String[] {""} ;
      P08Q37_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q37_A9437OMUsuCre = new String[] {""} ;
      P08Q37_A9428SMCod = new int[1] ;
      P08Q37_n9428SMCod = new boolean[] {false} ;
      P08Q37_A9427OMMaqDsc = new String[] {""} ;
      P08Q37_n9427OMMaqDsc = new boolean[] {false} ;
      P08Q37_A9426OMMaqCod = new String[] {""} ;
      P08Q37_A9473PMDsc = new String[] {""} ;
      P08Q37_n9473PMDsc = new boolean[] {false} ;
      P08Q37_A9429PMCod = new int[1] ;
      P08Q37_n9429PMCod = new boolean[] {false} ;
      P08Q37_A9425OMCod = new int[1] ;
      P08Q37_A13678OMDscMqPla = new String[] {""} ;
      P08Q37_n13678OMDscMqPla = new boolean[] {false} ;
      P08Q37_A13679OMMaqCodFo = new String[] {""} ;
      P08Q37_n13679OMMaqCodFo = new boolean[] {false} ;
      P08Q37_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q37_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q37_A9445OMEst = new String[] {""} ;
      P08Q37_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q37_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75TFOMEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08Q37_A396EmprCod, P08Q37_A9464OMNot, P08Q37_A9439OMFchCer, P08Q37_A9438OMFchPre, P08Q37_A9433OMTxt, P08Q37_A9436OMFchCre, P08Q37_A9437OMUsuCre, P08Q37_A9428SMCod, P08Q37_n9428SMCod, P08Q37_A9427OMMaqDsc,
            P08Q37_n9427OMMaqDsc, P08Q37_A9426OMMaqCod, P08Q37_A9473PMDsc, P08Q37_n9473PMDsc, P08Q37_A9429PMCod, P08Q37_n9429PMCod, P08Q37_A9425OMCod, P08Q37_A13678OMDscMqPla, P08Q37_n13678OMDscMqPla, P08Q37_A13679OMMaqCodFo,
            P08Q37_n13679OMMaqCodFo, P08Q37_A9441OMMCCosT, P08Q37_A9443OMRCCosT, P08Q37_A9445OMEst, P08Q37_A9442OMMRCosT, P08Q37_A9444OMRRCosT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int AV88Mantenimientomaquina_tmordenwwds_2_tfomcod ;
   private int AV39TFOMCod ;
   private int AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to ;
   private int AV40TFOMCod_To ;
   private int AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod ;
   private int AV51TFPMCod ;
   private int AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ;
   private int AV52TFPMCod_To ;
   private int AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod ;
   private int AV49TFSMCod ;
   private int AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ;
   private int AV50TFSMCod_To ;
   private int AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ;
   private int A9428SMCod ;
   private int AV126GXV1 ;
   private java.math.BigDecimal AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea ;
   private java.math.BigDecimal AV65TFOMCosRea ;
   private java.math.BigDecimal AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to ;
   private java.math.BigDecimal AV66TFOMCosRea_To ;
   private java.math.BigDecimal AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost ;
   private java.math.BigDecimal AV67TFOMRRCosT ;
   private java.math.BigDecimal AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ;
   private java.math.BigDecimal AV68TFOMRRCosT_To ;
   private java.math.BigDecimal AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost ;
   private java.math.BigDecimal AV69TFOMRCCosT ;
   private java.math.BigDecimal AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ;
   private java.math.BigDecimal AV70TFOMRCCosT_To ;
   private java.math.BigDecimal AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost ;
   private java.math.BigDecimal AV71TFOMMRCosT ;
   private java.math.BigDecimal AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ;
   private java.math.BigDecimal AV72TFOMMRCosT_To ;
   private java.math.BigDecimal AV122Mantenimientomaquina_tmordenwwds_36_tfommccost ;
   private java.math.BigDecimal AV73TFOMMCCosT ;
   private java.math.BigDecimal AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to ;
   private java.math.BigDecimal AV74TFOMMCCosT_To ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9440OMCosRea ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9473PMDsc ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String A9445OMEst ;
   private String A9437OMUsuCre ;
   private String AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String AV82TFPMDsc ;
   private String AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ;
   private String AV83TFPMDsc_Sel ;
   private String AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String AV41TFOMMaqCod ;
   private String AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ;
   private String AV42TFOMMaqCod_Sel ;
   private String AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String AV45TFOMMaqDsc ;
   private String AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ;
   private String AV46TFOMMaqDsc_Sel ;
   private String AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String AV43TFOMMaqCodFor ;
   private String AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ;
   private String AV44TFOMMaqCodFor_Sel ;
   private String AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String AV47TFOMDscMqPla ;
   private String AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ;
   private String AV48TFOMDscMqPla_Sel ;
   private String AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String AV63TFOMUsuCre ;
   private String AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ;
   private String AV64TFOMUsuCre_Sel ;
   private String scmdbuf ;
   private String lV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String lV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String lV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String lV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String lV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String lV105Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String A13679OMMaqCodFo ;
   private String A13678OMDscMqPla ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre ;
   private java.util.Date AV59TFOMFchCre ;
   private java.util.Date AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer ;
   private java.util.Date AV57TFOMFchCer ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre ;
   private java.util.Date AV55TFOMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9473PMDsc ;
   private boolean n9429PMCod ;
   private boolean n13678OMDscMqPla ;
   private boolean n13679OMMaqCodFo ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV75TFOMEst_SelsJson ;
   private String AV11Filename ;
   private String AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String AV53TFOMTxt ;
   private String AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ;
   private String AV54TFOMTxt_Sel ;
   private String AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion ;
   private String AV61TFOMDuracion ;
   private String AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ;
   private String AV62TFOMDuracion_Sel ;
   private String AV124Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String AV77TFOMNot ;
   private String AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ;
   private String AV78TFOMNot_Sel ;
   private String lV87Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String lV108Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String lV124Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q37_A396EmprCod ;
   private String[] P08Q37_A9464OMNot ;
   private java.util.Date[] P08Q37_A9439OMFchCer ;
   private java.util.Date[] P08Q37_A9438OMFchPre ;
   private String[] P08Q37_A9433OMTxt ;
   private java.util.Date[] P08Q37_A9436OMFchCre ;
   private String[] P08Q37_A9437OMUsuCre ;
   private int[] P08Q37_A9428SMCod ;
   private boolean[] P08Q37_n9428SMCod ;
   private String[] P08Q37_A9427OMMaqDsc ;
   private boolean[] P08Q37_n9427OMMaqDsc ;
   private String[] P08Q37_A9426OMMaqCod ;
   private String[] P08Q37_A9473PMDsc ;
   private boolean[] P08Q37_n9473PMDsc ;
   private int[] P08Q37_A9429PMCod ;
   private boolean[] P08Q37_n9429PMCod ;
   private int[] P08Q37_A9425OMCod ;
   private String[] P08Q37_A13678OMDscMqPla ;
   private boolean[] P08Q37_n13678OMDscMqPla ;
   private String[] P08Q37_A13679OMMaqCodFo ;
   private boolean[] P08Q37_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08Q37_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08Q37_A9443OMRCCosT ;
   private String[] P08Q37_A9445OMEst ;
   private java.math.BigDecimal[] P08Q37_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08Q37_A9444OMRRCosT ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels ;
   private GXSimpleCollection<String> AV76TFOMEst_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tmordenwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q37( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                          int AV88Mantenimientomaquina_tmordenwwds_2_tfomcod ,
                                          int AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to ,
                                          int AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod ,
                                          int AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ,
                                          String AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                          String AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                          String AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                          String AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                          String AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                          String AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                          int AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod ,
                                          int AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ,
                                          int AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ,
                                          String AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                          String AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                          java.util.Date AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                          String AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                          String AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                          java.util.Date AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                          java.util.Date AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                          java.math.BigDecimal AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                          java.math.BigDecimal AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                          java.math.BigDecimal AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                          java.math.BigDecimal AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                          java.math.BigDecimal AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                          java.math.BigDecimal AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                          java.math.BigDecimal AV122Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                          java.math.BigDecimal AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                          String AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                          String AV124Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                          int A9425OMCod ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          int A9428SMCod ,
                                          String A9437OMUsuCre ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9433OMTxt ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT ,
                                          String A9464OMNot ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV87Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                          String A13679OMMaqCodFo ,
                                          String A13678OMDscMqPla ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          String AV99Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                          String AV98Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                          String AV101Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                          String AV100Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                          String AV113Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                          String AV112Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                          java.math.BigDecimal AV114Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                          java.math.BigDecimal AV115Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV88Mantenimientomaquina_tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV89Mantenimientomaquina_tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Mantenimientomaquina_tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV92Mantenimientomaquina_tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV102Mantenimientomaquina_tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV103Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Mantenimientomaquina_tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV105Mantenimientomaquina_tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV107Mantenimientomaquina_tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Mantenimientomaquina_tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111Mantenimientomaquina_tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Mantenimientomaquina_tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Mantenimientomaquina_tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Mantenimientomaquina_tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Mantenimientomaquina_tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Mantenimientomaquina_tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Mantenimientomaquina_tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Mantenimientomaquina_tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV124Mantenimientomaquina_tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PMDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PMDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
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
                  return conditional_P08Q37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
      }
   }

}

