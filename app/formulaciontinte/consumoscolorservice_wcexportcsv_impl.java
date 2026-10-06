package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumoscolorservice_wcexportcsv_impl extends GXWebProcedure
{
   public consumoscolorservice_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsumosColorService_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Date Time Start", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Date Time", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Batch Code", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Call Off", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Re Dye", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Machine", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tank", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Product", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "To Dose", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dosed", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Batch", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dosing Origin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Status", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Txp", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV62WP_Batchcode ;
      AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV30FilterFullText ;
      AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV34TFWP_ID ;
      AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV35TFWP_ID_To ;
      AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV36TFWP_Start ;
      AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV38TFWP_Date ;
      AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV40TFWP_BatchCode ;
      AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV41TFWP_BatchCode_Sel ;
      AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV42TFWP_CallOffCSv ;
      AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV43TFWP_CallOffCSv_To ;
      AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV44TFWP_ReDyeCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV45TFWP_ReDyeCSv_To ;
      AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV46TFWP_MachineCode ;
      AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV47TFWP_MachineCode_Sel ;
      AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV48TFWP_TankCode ;
      AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV49TFWP_TankCode_To ;
      AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV50TFWP_ProductCSv ;
      AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV51TFWP_ProductCSv_Sel ;
      AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV52TFWP_ToDose ;
      AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV53TFWP_ToDose_To ;
      AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV54TFWP_Dosed ;
      AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV55TFWP_Dosed_To ;
      AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV56TFWP_ProdBatchCode ;
      AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV57TFWP_ProdBatchCode_Sel ;
      AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV58TFWP_DosingOrigin ;
      AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV59TFWP_DosingOrigin_To ;
      AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV60TFWP_StatusCSv ;
      AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV61TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(0, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
                                           Long.valueOf(A13948WP_ID) ,
                                           A13951WP_BatchCo ,
                                           Integer.valueOf(A13952WP_CallOff) ,
                                           Integer.valueOf(A13953WP_ReDyeCS) ,
                                           A13954WP_Machine ,
                                           Integer.valueOf(A13955WP_TankCod) ,
                                           A13956WP_Product ,
                                           A13957WP_ToDose ,
                                           A13958WP_Dosed ,
                                           A13959WP_ProdBat ,
                                           Integer.valueOf(A13960WP_DosingO) ,
                                           Integer.valueOf(A13961WP_StatusC) ,
                                           A13949WP_Start ,
                                           A13950WP_Date ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                           Integer.valueOf(AV68colorserviceID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09EQ2 */
      pr_colorservice.execute(0, new Object[] {Integer.valueOf(AV68colorserviceID), AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         A13961WP_StatusC = P09EQ2_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09EQ2_A13960WP_DosingO[0] ;
         A13959WP_ProdBat = P09EQ2_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09EQ2_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09EQ2_A13957WP_ToDose[0] ;
         A13956WP_Product = P09EQ2_A13956WP_Product[0] ;
         A13955WP_TankCod = P09EQ2_A13955WP_TankCod[0] ;
         A13954WP_Machine = P09EQ2_A13954WP_Machine[0] ;
         A13953WP_ReDyeCS = P09EQ2_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09EQ2_A13952WP_CallOff[0] ;
         A13950WP_Date = P09EQ2_A13950WP_Date[0] ;
         A13949WP_Start = P09EQ2_A13949WP_Start[0] ;
         A13948WP_ID = P09EQ2_A13948WP_ID[0] ;
         A13951WP_BatchCo = P09EQ2_A13951WP_BatchCo[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_colorservice.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13948WP_ID, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13951WP_BatchCo, ";", ","), GXv_char3) ;
            consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13952WP_CallOff, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13953WP_ReDyeCS, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13954WP_Machine, ";", ","), GXv_char3) ;
            consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13955WP_TankCod, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13956WP_Product, ";", ","), GXv_char3) ;
            consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13957WP_ToDose, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13958WP_Dosed, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13959WP_ProdBat, ";", ","), GXv_char3) ;
            consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13960WP_DosingO, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV69comentario = ((0==A13960WP_DosingO) ? httpContext.getMessage( "Acerto", "") : "") ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV69comentario, ";", ","), GXv_char3) ;
            consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13961WP_StatusC, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV102Recfornro = (byte)(A13952WP_CallOff) ;
            AV103Productcode = A13956WP_Product ;
            AV70RecLin = (short)(0) ;
            /* Using cursor P09EQ3 */
            pr_default.execute(0, new Object[] {AV63emprcod, Integer.valueOf(AV64barcod), Byte.valueOf(AV65barcodreo), AV66barcodpar, Short.valueOf(AV67reclinmaq)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A2804RecLinMaq = P09EQ3_A2804RecLinMaq[0] ;
               A130BarCodPar = P09EQ3_A130BarCodPar[0] ;
               A132BarCodReo = P09EQ3_A132BarCodReo[0] ;
               A129BarCod = P09EQ3_A129BarCod[0] ;
               A396EmprCod = P09EQ3_A396EmprCod[0] ;
               A872RecPrdNum = P09EQ3_A872RecPrdNum[0] ;
               A2394RecForNro = P09EQ3_A2394RecForNro[0] ;
               A811RecLin = P09EQ3_A811RecLin[0] ;
               A1273RecLinPro = P09EQ3_A1273RecLinPro[0] ;
               if ( ( AV102Recfornro == A2394RecForNro ) && ( GXutil.strcmp(A872RecPrdNum, GXutil.trim( AV103Productcode)) == 0 ) )
               {
                  AV70RecLin = A811RecLin ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV70RecLin, 4, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_colorservice.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_colorservice.readNext(0);
      }
      pr_colorservice.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsumosColorService_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_ID", "", "ID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_Start", "", "Date Time Start", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_Date", "", "Date Time", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_BatchCode", "", "Batch Code", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_CallOffCSv", "", "Call Off", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_ReDyeCSv", "", "Re Dye", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_MachineCode", "", "Machine", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_TankCode", "", "Tank", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_ProductCSv", "", "Product", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_ToDose", "", "To Dose", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_Dosed", "", "Dosed", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_ProdBatchCode", "", "Batch", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_DosingOrigin", "", "Dosing Origin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&comentario", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "WP_StatusCSv", "", "Status", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&RecLin", "", "Txp", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCColumnsSelector", GXv_char3) ;
      consumoscolorservice_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_ID") == 0 )
         {
            AV34TFWP_ID = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV35TFWP_ID_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_START") == 0 )
         {
            AV36TFWP_Start = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DATE") == 0 )
         {
            AV38TFWP_Date = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE") == 0 )
         {
            AV40TFWP_BatchCode = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE_SEL") == 0 )
         {
            AV41TFWP_BatchCode_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_CALLOFFCSV") == 0 )
         {
            AV42TFWP_CallOffCSv = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFWP_CallOffCSv_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_REDYECSV") == 0 )
         {
            AV44TFWP_ReDyeCSv = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFWP_ReDyeCSv_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE") == 0 )
         {
            AV46TFWP_MachineCode = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE_SEL") == 0 )
         {
            AV47TFWP_MachineCode_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TANKCODE") == 0 )
         {
            AV48TFWP_TankCode = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFWP_TankCode_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV") == 0 )
         {
            AV50TFWP_ProductCSv = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV_SEL") == 0 )
         {
            AV51TFWP_ProductCSv_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TODOSE") == 0 )
         {
            AV52TFWP_ToDose = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFWP_ToDose_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSED") == 0 )
         {
            AV54TFWP_Dosed = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFWP_Dosed_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE") == 0 )
         {
            AV56TFWP_ProdBatchCode = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE_SEL") == 0 )
         {
            AV57TFWP_ProdBatchCode_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSINGORIGIN") == 0 )
         {
            AV58TFWP_DosingOrigin = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFWP_DosingOrigin_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_STATUSCSV") == 0 )
         {
            AV60TFWP_StatusCSv = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFWP_StatusCSv_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&WP_BATCHCODE") == 0 )
         {
            AV62WP_Batchcode = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV64barcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV65barcodreo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV66barcodpar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV67reclinmaq = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
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
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      A13951WP_BatchCo = "" ;
      A13954WP_Machine = "" ;
      A13956WP_Product = "" ;
      A13957WP_ToDose = DecimalUtil.ZERO ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13959WP_ProdBat = "" ;
      AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = "" ;
      AV62WP_Batchcode = "" ;
      AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = GXutil.resetTime( GXutil.nullDate() );
      AV36TFWP_Start = GXutil.resetTime( GXutil.nullDate() );
      AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = GXutil.resetTime( GXutil.nullDate() );
      AV38TFWP_Date = GXutil.resetTime( GXutil.nullDate() );
      AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      AV40TFWP_BatchCode = "" ;
      AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = "" ;
      AV41TFWP_BatchCode_Sel = "" ;
      AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      AV46TFWP_MachineCode = "" ;
      AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = "" ;
      AV47TFWP_MachineCode_Sel = "" ;
      AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      AV50TFWP_ProductCSv = "" ;
      AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = "" ;
      AV51TFWP_ProductCSv_Sel = "" ;
      AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = DecimalUtil.ZERO ;
      AV52TFWP_ToDose = DecimalUtil.ZERO ;
      AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = DecimalUtil.ZERO ;
      AV53TFWP_ToDose_To = DecimalUtil.ZERO ;
      AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = DecimalUtil.ZERO ;
      AV54TFWP_Dosed = DecimalUtil.ZERO ;
      AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = DecimalUtil.ZERO ;
      AV55TFWP_Dosed_To = DecimalUtil.ZERO ;
      AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      AV56TFWP_ProdBatchCode = "" ;
      AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = "" ;
      AV57TFWP_ProdBatchCode_Sel = "" ;
      scmdbuf = "" ;
      lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      lV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      lV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      lV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      lV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      P09EQ2_A13961WP_StatusC = new int[1] ;
      P09EQ2_A13960WP_DosingO = new int[1] ;
      P09EQ2_A13959WP_ProdBat = new String[] {""} ;
      P09EQ2_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EQ2_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EQ2_A13956WP_Product = new String[] {""} ;
      P09EQ2_A13955WP_TankCod = new int[1] ;
      P09EQ2_A13954WP_Machine = new String[] {""} ;
      P09EQ2_A13953WP_ReDyeCS = new int[1] ;
      P09EQ2_A13952WP_CallOff = new int[1] ;
      P09EQ2_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09EQ2_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09EQ2_A13948WP_ID = new long[1] ;
      P09EQ2_A13951WP_BatchCo = new String[] {""} ;
      AV69comentario = "" ;
      AV103Productcode = "" ;
      AV63emprcod = "" ;
      AV66barcodpar = "" ;
      P09EQ3_A2804RecLinMaq = new short[1] ;
      P09EQ3_A130BarCodPar = new String[] {""} ;
      P09EQ3_A132BarCodReo = new byte[1] ;
      P09EQ3_A129BarCod = new int[1] ;
      P09EQ3_A396EmprCod = new String[] {""} ;
      P09EQ3_A872RecPrdNum = new String[] {""} ;
      P09EQ3_A2394RecForNro = new byte[1] ;
      P09EQ3_A811RecLin = new short[1] ;
      P09EQ3_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09EQ3_A2804RecLinMaq, P09EQ3_A130BarCodPar, P09EQ3_A132BarCodReo, P09EQ3_A129BarCod, P09EQ3_A396EmprCod, P09EQ3_A872RecPrdNum, P09EQ3_A2394RecForNro, P09EQ3_A811RecLin, P09EQ3_A1273RecLinPro
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wcexportcsv__colorservice(),
         new Object[] {
             new Object[] {
            P09EQ2_A13961WP_StatusC, P09EQ2_A13960WP_DosingO, P09EQ2_A13959WP_ProdBat, P09EQ2_A13958WP_Dosed, P09EQ2_A13957WP_ToDose, P09EQ2_A13956WP_Product, P09EQ2_A13955WP_TankCod, P09EQ2_A13954WP_Machine, P09EQ2_A13953WP_ReDyeCS, P09EQ2_A13952WP_CallOff,
            P09EQ2_A13950WP_Date, P09EQ2_A13949WP_Start, P09EQ2_A13948WP_ID, P09EQ2_A13951WP_BatchCo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV102Recfornro ;
   private byte AV65barcodreo ;
   private byte A132BarCodReo ;
   private byte A2394RecForNro ;
   private byte A1273RecLinPro ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV70RecLin ;
   private short AV67reclinmaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV13Random ;
   private int A13952WP_CallOff ;
   private int A13953WP_ReDyeCS ;
   private int A13955WP_TankCod ;
   private int A13960WP_DosingO ;
   private int A13961WP_StatusC ;
   private int AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ;
   private int AV42TFWP_CallOffCSv ;
   private int AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ;
   private int AV43TFWP_CallOffCSv_To ;
   private int AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ;
   private int AV44TFWP_ReDyeCSv ;
   private int AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ;
   private int AV45TFWP_ReDyeCSv_To ;
   private int AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ;
   private int AV48TFWP_TankCode ;
   private int AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ;
   private int AV49TFWP_TankCode_To ;
   private int AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ;
   private int AV58TFWP_DosingOrigin ;
   private int AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ;
   private int AV59TFWP_DosingOrigin_To ;
   private int AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ;
   private int AV60TFWP_StatusCSv ;
   private int AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ;
   private int AV61TFWP_StatusCSv_To ;
   private int AV68colorserviceID ;
   private int AV64barcod ;
   private int A129BarCod ;
   private int AV105GXV1 ;
   private long A13948WP_ID ;
   private long AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ;
   private long AV34TFWP_ID ;
   private long AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ;
   private long AV35TFWP_ID_To ;
   private java.math.BigDecimal A13957WP_ToDose ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private java.math.BigDecimal AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ;
   private java.math.BigDecimal AV52TFWP_ToDose ;
   private java.math.BigDecimal AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ;
   private java.math.BigDecimal AV53TFWP_ToDose_To ;
   private java.math.BigDecimal AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ;
   private java.math.BigDecimal AV54TFWP_Dosed ;
   private java.math.BigDecimal AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ;
   private java.math.BigDecimal AV55TFWP_Dosed_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String AV69comentario ;
   private String AV63emprcod ;
   private String AV66barcodpar ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A13949WP_Start ;
   private java.util.Date A13950WP_Date ;
   private java.util.Date AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ;
   private java.util.Date AV36TFWP_Start ;
   private java.util.Date AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ;
   private java.util.Date AV38TFWP_Date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A13951WP_BatchCo ;
   private String A13954WP_Machine ;
   private String A13956WP_Product ;
   private String A13959WP_ProdBat ;
   private String AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ;
   private String AV62WP_Batchcode ;
   private String AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String AV40TFWP_BatchCode ;
   private String AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ;
   private String AV41TFWP_BatchCode_Sel ;
   private String AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String AV46TFWP_MachineCode ;
   private String AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ;
   private String AV47TFWP_MachineCode_Sel ;
   private String AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String AV50TFWP_ProductCSv ;
   private String AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ;
   private String AV51TFWP_ProductCSv_Sel ;
   private String AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV56TFWP_ProdBatchCode ;
   private String AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ;
   private String AV57TFWP_ProdBatchCode_Sel ;
   private String lV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String lV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String lV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String lV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String lV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV103Productcode ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_colorservice ;
   private int[] P09EQ2_A13961WP_StatusC ;
   private int[] P09EQ2_A13960WP_DosingO ;
   private String[] P09EQ2_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09EQ2_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09EQ2_A13957WP_ToDose ;
   private String[] P09EQ2_A13956WP_Product ;
   private int[] P09EQ2_A13955WP_TankCod ;
   private String[] P09EQ2_A13954WP_Machine ;
   private int[] P09EQ2_A13953WP_ReDyeCS ;
   private int[] P09EQ2_A13952WP_CallOff ;
   private java.util.Date[] P09EQ2_A13950WP_Date ;
   private java.util.Date[] P09EQ2_A13949WP_Start ;
   private long[] P09EQ2_A13948WP_ID ;
   private String[] P09EQ2_A13951WP_BatchCo ;
   private IDataStoreProvider pr_default ;
   private short[] P09EQ3_A2804RecLinMaq ;
   private String[] P09EQ3_A130BarCodPar ;
   private byte[] P09EQ3_A132BarCodReo ;
   private int[] P09EQ3_A129BarCod ;
   private String[] P09EQ3_A396EmprCod ;
   private String[] P09EQ3_A872RecPrdNum ;
   private byte[] P09EQ3_A2394RecForNro ;
   private short[] P09EQ3_A811RecLin ;
   private byte[] P09EQ3_A1273RecLinPro ;
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

final  class consumoscolorservice_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EQ3", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecPrdNum, RecForNro, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

final  class consumoscolorservice_wcexportcsv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
                                          long A13948WP_ID ,
                                          String A13951WP_BatchCo ,
                                          int A13952WP_CallOff ,
                                          int A13953WP_ReDyeCS ,
                                          String A13954WP_Machine ,
                                          int A13955WP_TankCod ,
                                          String A13956WP_Product ,
                                          java.math.BigDecimal A13957WP_ToDose ,
                                          java.math.BigDecimal A13958WP_Dosed ,
                                          String A13959WP_ProdBat ,
                                          int A13960WP_DosingO ,
                                          int A13961WP_StatusC ,
                                          java.util.Date A13949WP_Start ,
                                          java.util.Date A13950WP_Date ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV74Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                          int AV68colorserviceID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [ProductCode], [TankCode], [MachineCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id], [BatchCode] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([id] > ?)");
      addWhere(sWhereString, "([BatchCode] = ?)");
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV76Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode]" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [CallOff]" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [CallOff] DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [id]" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [id] DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DateTimeStart]" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DateTimeStart] DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DateTime]" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DateTime] DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ReDye]" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ReDye] DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [MachineCode]" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [MachineCode] DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [TankCode]" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [TankCode] DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ProductCode]" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ProductCode] DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ToDose]" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ToDose] DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [Dosed]" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [Dosed] DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [ProductBatchCode]" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [ProductBatchCode] DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [DosingOrigin]" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [DosingOrigin] DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [BatchCode], [Status]" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [BatchCode] DESC, [Status] DESC" ;
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
                  return conditional_P09EQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[54]).longValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[55]).longValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

