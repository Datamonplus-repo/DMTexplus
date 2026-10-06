package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consumoscolorservice_wcgetfilterdata extends GXProcedure
{
   public consumoscolorservice_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoscolorservice_wcgetfilterdata.class ), "" );
   }

   public consumoscolorservice_wcgetfilterdata( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      consumoscolorservice_wcgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      consumoscolorservice_wcgetfilterdata.this.AV40DDOName = aP0;
      consumoscolorservice_wcgetfilterdata.this.AV38SearchTxt = aP1;
      consumoscolorservice_wcgetfilterdata.this.AV39SearchTxtTo = aP2;
      consumoscolorservice_wcgetfilterdata.this.aP3 = aP3;
      consumoscolorservice_wcgetfilterdata.this.aP4 = aP4;
      consumoscolorservice_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV43Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_WP_BATCHCODE") == 0 )
      {
         /* Execute user subroutine: 'LOADWP_BATCHCODEOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_WP_MACHINECODE") == 0 )
      {
         /* Execute user subroutine: 'LOADWP_MACHINECODEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_WP_PRODUCTCSV") == 0 )
      {
         /* Execute user subroutine: 'LOADWP_PRODUCTCSVOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_WP_PRODBATCHCODE") == 0 )
      {
         /* Execute user subroutine: 'LOADWP_PRODBATCHCODEOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV44OptionsJson = AV43Options.toJSonString(false) ;
      AV47OptionsDescJson = AV46OptionsDesc.toJSonString(false) ;
      AV49OptionIndexesJson = AV48OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("FormulacionTinte.ConsumosColorService_WCGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_ID") == 0 )
         {
            AV10TFWP_ID = GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFWP_ID_To = GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_START") == 0 )
         {
            AV12TFWP_Start = localUtil.ctot( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DATE") == 0 )
         {
            AV14TFWP_Date = localUtil.ctot( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE") == 0 )
         {
            AV16TFWP_BatchCode = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE_SEL") == 0 )
         {
            AV17TFWP_BatchCode_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_CALLOFFCSV") == 0 )
         {
            AV18TFWP_CallOffCSv = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFWP_CallOffCSv_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_REDYECSV") == 0 )
         {
            AV20TFWP_ReDyeCSv = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFWP_ReDyeCSv_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE") == 0 )
         {
            AV22TFWP_MachineCode = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE_SEL") == 0 )
         {
            AV23TFWP_MachineCode_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TANKCODE") == 0 )
         {
            AV24TFWP_TankCode = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFWP_TankCode_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV") == 0 )
         {
            AV26TFWP_ProductCSv = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV_SEL") == 0 )
         {
            AV27TFWP_ProductCSv_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TODOSE") == 0 )
         {
            AV28TFWP_ToDose = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFWP_ToDose_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSED") == 0 )
         {
            AV30TFWP_Dosed = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFWP_Dosed_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE") == 0 )
         {
            AV32TFWP_ProdBatchCode = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE_SEL") == 0 )
         {
            AV33TFWP_ProdBatchCode_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSINGORIGIN") == 0 )
         {
            AV34TFWP_DosingOrigin = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFWP_DosingOrigin_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_STATUSCSV") == 0 )
         {
            AV36TFWP_StatusCSv = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFWP_StatusCSv_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&WP_BATCHCODE") == 0 )
         {
            AV57WP_Batchcode = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV58emprcod = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV59barcod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV60barcodreo = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV61barcodpar = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV62reclinmaq = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADWP_BATCHCODEOPTIONS' Routine */
      returnInSub = false ;
      AV16TFWP_BatchCode = AV38SearchTxt ;
      AV17TFWP_BatchCode_Sel = "" ;
      AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV57WP_Batchcode ;
      AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV56FilterFullText ;
      AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV10TFWP_ID ;
      AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV11TFWP_ID_To ;
      AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV12TFWP_Start ;
      AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV14TFWP_Date ;
      AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV16TFWP_BatchCode ;
      AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV17TFWP_BatchCode_Sel ;
      AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV18TFWP_CallOffCSv ;
      AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV19TFWP_CallOffCSv_To ;
      AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV20TFWP_ReDyeCSv ;
      AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV21TFWP_ReDyeCSv_To ;
      AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV22TFWP_MachineCode ;
      AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV23TFWP_MachineCode_Sel ;
      AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV24TFWP_TankCode ;
      AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV25TFWP_TankCode_To ;
      AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV26TFWP_ProductCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV27TFWP_ProductCSv_Sel ;
      AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV28TFWP_ToDose ;
      AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV29TFWP_ToDose_To ;
      AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV30TFWP_Dosed ;
      AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV31TFWP_Dosed_To ;
      AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV32TFWP_ProdBatchCode ;
      AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV33TFWP_ProdBatchCode_Sel ;
      AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV34TFWP_DosingOrigin ;
      AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV35TFWP_DosingOrigin_To ;
      AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV36TFWP_StatusCSv ;
      AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV37TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(0, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
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
                                           Integer.valueOf(AV63colorserviceID) ,
                                           AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09ER2 */
      pr_colorservice.execute(0, new Object[] {AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, Integer.valueOf(AV63colorserviceID), lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         brk9ER2 = false ;
         A13951WP_BatchCo = P09ER2_A13951WP_BatchCo[0] ;
         A13961WP_StatusC = P09ER2_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09ER2_A13960WP_DosingO[0] ;
         A13959WP_ProdBat = P09ER2_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09ER2_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09ER2_A13957WP_ToDose[0] ;
         A13956WP_Product = P09ER2_A13956WP_Product[0] ;
         A13955WP_TankCod = P09ER2_A13955WP_TankCod[0] ;
         A13954WP_Machine = P09ER2_A13954WP_Machine[0] ;
         A13953WP_ReDyeCS = P09ER2_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09ER2_A13952WP_CallOff[0] ;
         A13950WP_Date = P09ER2_A13950WP_Date[0] ;
         A13949WP_Start = P09ER2_A13949WP_Start[0] ;
         A13948WP_ID = P09ER2_A13948WP_ID[0] ;
         AV50count = 0 ;
         while ( (pr_colorservice.getStatus(0) != 101) && ( GXutil.strcmp(P09ER2_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) )
         {
            brk9ER2 = false ;
            A13948WP_ID = P09ER2_A13948WP_ID[0] ;
            AV50count = (long)(AV50count+1) ;
            brk9ER2 = true ;
            pr_colorservice.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13951WP_BatchCo)==0) )
         {
            AV42Option = A13951WP_BatchCo ;
            AV43Options.add(AV42Option, 0);
            AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV43Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ER2 )
         {
            brk9ER2 = true ;
            pr_colorservice.readNext(0);
         }
      }
      pr_colorservice.close(0);
   }

   public void S131( )
   {
      /* 'LOADWP_MACHINECODEOPTIONS' Routine */
      returnInSub = false ;
      AV22TFWP_MachineCode = AV38SearchTxt ;
      AV23TFWP_MachineCode_Sel = "" ;
      AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV57WP_Batchcode ;
      AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV56FilterFullText ;
      AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV10TFWP_ID ;
      AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV11TFWP_ID_To ;
      AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV12TFWP_Start ;
      AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV14TFWP_Date ;
      AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV16TFWP_BatchCode ;
      AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV17TFWP_BatchCode_Sel ;
      AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV18TFWP_CallOffCSv ;
      AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV19TFWP_CallOffCSv_To ;
      AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV20TFWP_ReDyeCSv ;
      AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV21TFWP_ReDyeCSv_To ;
      AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV22TFWP_MachineCode ;
      AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV23TFWP_MachineCode_Sel ;
      AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV24TFWP_TankCode ;
      AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV25TFWP_TankCode_To ;
      AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV26TFWP_ProductCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV27TFWP_ProductCSv_Sel ;
      AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV28TFWP_ToDose ;
      AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV29TFWP_ToDose_To ;
      AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV30TFWP_Dosed ;
      AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV31TFWP_Dosed_To ;
      AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV32TFWP_ProdBatchCode ;
      AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV33TFWP_ProdBatchCode_Sel ;
      AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV34TFWP_DosingOrigin ;
      AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV35TFWP_DosingOrigin_To ;
      AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV36TFWP_StatusCSv ;
      AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV37TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(1, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
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
                                           Integer.valueOf(AV63colorserviceID) ,
                                           AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09ER3 */
      pr_colorservice.execute(1, new Object[] {AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, Integer.valueOf(AV63colorserviceID), lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(1) != 101) )
      {
         brk9ER4 = false ;
         A13951WP_BatchCo = P09ER3_A13951WP_BatchCo[0] ;
         A13954WP_Machine = P09ER3_A13954WP_Machine[0] ;
         A13961WP_StatusC = P09ER3_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09ER3_A13960WP_DosingO[0] ;
         A13959WP_ProdBat = P09ER3_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09ER3_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09ER3_A13957WP_ToDose[0] ;
         A13956WP_Product = P09ER3_A13956WP_Product[0] ;
         A13955WP_TankCod = P09ER3_A13955WP_TankCod[0] ;
         A13953WP_ReDyeCS = P09ER3_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09ER3_A13952WP_CallOff[0] ;
         A13950WP_Date = P09ER3_A13950WP_Date[0] ;
         A13949WP_Start = P09ER3_A13949WP_Start[0] ;
         A13948WP_ID = P09ER3_A13948WP_ID[0] ;
         AV50count = 0 ;
         while ( (pr_colorservice.getStatus(1) != 101) && ( GXutil.strcmp(P09ER3_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) && ( GXutil.strcmp(P09ER3_A13954WP_Machine[0], A13954WP_Machine) == 0 ) )
         {
            brk9ER4 = false ;
            A13948WP_ID = P09ER3_A13948WP_ID[0] ;
            AV50count = (long)(AV50count+1) ;
            brk9ER4 = true ;
            pr_colorservice.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13954WP_Machine)==0) )
         {
            AV42Option = A13954WP_Machine ;
            AV43Options.add(AV42Option, 0);
            AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV43Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ER4 )
         {
            brk9ER4 = true ;
            pr_colorservice.readNext(1);
         }
      }
      pr_colorservice.close(1);
   }

   public void S141( )
   {
      /* 'LOADWP_PRODUCTCSVOPTIONS' Routine */
      returnInSub = false ;
      AV26TFWP_ProductCSv = AV38SearchTxt ;
      AV27TFWP_ProductCSv_Sel = "" ;
      AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV57WP_Batchcode ;
      AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV56FilterFullText ;
      AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV10TFWP_ID ;
      AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV11TFWP_ID_To ;
      AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV12TFWP_Start ;
      AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV14TFWP_Date ;
      AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV16TFWP_BatchCode ;
      AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV17TFWP_BatchCode_Sel ;
      AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV18TFWP_CallOffCSv ;
      AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV19TFWP_CallOffCSv_To ;
      AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV20TFWP_ReDyeCSv ;
      AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV21TFWP_ReDyeCSv_To ;
      AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV22TFWP_MachineCode ;
      AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV23TFWP_MachineCode_Sel ;
      AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV24TFWP_TankCode ;
      AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV25TFWP_TankCode_To ;
      AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV26TFWP_ProductCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV27TFWP_ProductCSv_Sel ;
      AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV28TFWP_ToDose ;
      AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV29TFWP_ToDose_To ;
      AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV30TFWP_Dosed ;
      AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV31TFWP_Dosed_To ;
      AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV32TFWP_ProdBatchCode ;
      AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV33TFWP_ProdBatchCode_Sel ;
      AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV34TFWP_DosingOrigin ;
      AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV35TFWP_DosingOrigin_To ;
      AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV36TFWP_StatusCSv ;
      AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV37TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(2, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
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
                                           Integer.valueOf(AV63colorserviceID) ,
                                           AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09ER4 */
      pr_colorservice.execute(2, new Object[] {AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, Integer.valueOf(AV63colorserviceID), lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(2) != 101) )
      {
         brk9ER6 = false ;
         A13951WP_BatchCo = P09ER4_A13951WP_BatchCo[0] ;
         A13956WP_Product = P09ER4_A13956WP_Product[0] ;
         A13961WP_StatusC = P09ER4_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09ER4_A13960WP_DosingO[0] ;
         A13959WP_ProdBat = P09ER4_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09ER4_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09ER4_A13957WP_ToDose[0] ;
         A13955WP_TankCod = P09ER4_A13955WP_TankCod[0] ;
         A13954WP_Machine = P09ER4_A13954WP_Machine[0] ;
         A13953WP_ReDyeCS = P09ER4_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09ER4_A13952WP_CallOff[0] ;
         A13950WP_Date = P09ER4_A13950WP_Date[0] ;
         A13949WP_Start = P09ER4_A13949WP_Start[0] ;
         A13948WP_ID = P09ER4_A13948WP_ID[0] ;
         AV50count = 0 ;
         while ( (pr_colorservice.getStatus(2) != 101) && ( GXutil.strcmp(P09ER4_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) && ( GXutil.strcmp(P09ER4_A13956WP_Product[0], A13956WP_Product) == 0 ) )
         {
            brk9ER6 = false ;
            A13948WP_ID = P09ER4_A13948WP_ID[0] ;
            AV50count = (long)(AV50count+1) ;
            brk9ER6 = true ;
            pr_colorservice.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A13956WP_Product)==0) )
         {
            AV42Option = A13956WP_Product ;
            AV43Options.add(AV42Option, 0);
            AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV43Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ER6 )
         {
            brk9ER6 = true ;
            pr_colorservice.readNext(2);
         }
      }
      pr_colorservice.close(2);
   }

   public void S151( )
   {
      /* 'LOADWP_PRODBATCHCODEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFWP_ProdBatchCode = AV38SearchTxt ;
      AV33TFWP_ProdBatchCode_Sel = "" ;
      AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV57WP_Batchcode ;
      AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV56FilterFullText ;
      AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV10TFWP_ID ;
      AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV11TFWP_ID_To ;
      AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV12TFWP_Start ;
      AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV14TFWP_Date ;
      AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV16TFWP_BatchCode ;
      AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV17TFWP_BatchCode_Sel ;
      AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV18TFWP_CallOffCSv ;
      AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV19TFWP_CallOffCSv_To ;
      AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV20TFWP_ReDyeCSv ;
      AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV21TFWP_ReDyeCSv_To ;
      AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV22TFWP_MachineCode ;
      AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV23TFWP_MachineCode_Sel ;
      AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV24TFWP_TankCode ;
      AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV25TFWP_TankCode_To ;
      AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV26TFWP_ProductCSv ;
      AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV27TFWP_ProductCSv_Sel ;
      AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV28TFWP_ToDose ;
      AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV29TFWP_ToDose_To ;
      AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV30TFWP_Dosed ;
      AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV31TFWP_Dosed_To ;
      AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV32TFWP_ProdBatchCode ;
      AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV33TFWP_ProdBatchCode_Sel ;
      AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV34TFWP_DosingOrigin ;
      AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV35TFWP_DosingOrigin_To ;
      AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV36TFWP_StatusCSv ;
      AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV37TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(3, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
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
                                           Integer.valueOf(AV63colorserviceID) ,
                                           AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor P09ER5 */
      pr_colorservice.execute(3, new Object[] {AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, Integer.valueOf(AV63colorserviceID), lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      while ( (pr_colorservice.getStatus(3) != 101) )
      {
         brk9ER8 = false ;
         A13951WP_BatchCo = P09ER5_A13951WP_BatchCo[0] ;
         A13959WP_ProdBat = P09ER5_A13959WP_ProdBat[0] ;
         A13961WP_StatusC = P09ER5_A13961WP_StatusC[0] ;
         A13960WP_DosingO = P09ER5_A13960WP_DosingO[0] ;
         A13958WP_Dosed = P09ER5_A13958WP_Dosed[0] ;
         A13957WP_ToDose = P09ER5_A13957WP_ToDose[0] ;
         A13956WP_Product = P09ER5_A13956WP_Product[0] ;
         A13955WP_TankCod = P09ER5_A13955WP_TankCod[0] ;
         A13954WP_Machine = P09ER5_A13954WP_Machine[0] ;
         A13953WP_ReDyeCS = P09ER5_A13953WP_ReDyeCS[0] ;
         A13952WP_CallOff = P09ER5_A13952WP_CallOff[0] ;
         A13950WP_Date = P09ER5_A13950WP_Date[0] ;
         A13949WP_Start = P09ER5_A13949WP_Start[0] ;
         A13948WP_ID = P09ER5_A13948WP_ID[0] ;
         AV50count = 0 ;
         while ( (pr_colorservice.getStatus(3) != 101) && ( GXutil.strcmp(P09ER5_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) && ( GXutil.strcmp(P09ER5_A13959WP_ProdBat[0], A13959WP_ProdBat) == 0 ) )
         {
            brk9ER8 = false ;
            A13948WP_ID = P09ER5_A13948WP_ID[0] ;
            AV50count = (long)(AV50count+1) ;
            brk9ER8 = true ;
            pr_colorservice.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A13959WP_ProdBat)==0) )
         {
            AV42Option = A13959WP_ProdBat ;
            AV43Options.add(AV42Option, 0);
            AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV43Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ER8 )
         {
            brk9ER8 = true ;
            pr_colorservice.readNext(3);
         }
      }
      pr_colorservice.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consumoscolorservice_wcgetfilterdata.this.AV44OptionsJson;
      this.aP4[0] = consumoscolorservice_wcgetfilterdata.this.AV47OptionsDescJson;
      this.aP5[0] = consumoscolorservice_wcgetfilterdata.this.AV49OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV47OptionsDescJson = "" ;
      AV49OptionIndexesJson = "" ;
      AV43Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV51Session = httpContext.getWebSession();
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56FilterFullText = "" ;
      AV12TFWP_Start = GXutil.resetTime( GXutil.nullDate() );
      AV14TFWP_Date = GXutil.resetTime( GXutil.nullDate() );
      AV16TFWP_BatchCode = "" ;
      AV17TFWP_BatchCode_Sel = "" ;
      AV22TFWP_MachineCode = "" ;
      AV23TFWP_MachineCode_Sel = "" ;
      AV26TFWP_ProductCSv = "" ;
      AV27TFWP_ProductCSv_Sel = "" ;
      AV28TFWP_ToDose = DecimalUtil.ZERO ;
      AV29TFWP_ToDose_To = DecimalUtil.ZERO ;
      AV30TFWP_Dosed = DecimalUtil.ZERO ;
      AV31TFWP_Dosed_To = DecimalUtil.ZERO ;
      AV32TFWP_ProdBatchCode = "" ;
      AV33TFWP_ProdBatchCode_Sel = "" ;
      AV57WP_Batchcode = "" ;
      AV58emprcod = "" ;
      AV61barcodpar = "" ;
      A13951WP_BatchCo = "" ;
      AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = "" ;
      AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = GXutil.resetTime( GXutil.nullDate() );
      AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = GXutil.resetTime( GXutil.nullDate() );
      AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = "" ;
      AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = "" ;
      AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = "" ;
      AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = DecimalUtil.ZERO ;
      AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = DecimalUtil.ZERO ;
      AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = DecimalUtil.ZERO ;
      AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = DecimalUtil.ZERO ;
      AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = "" ;
      scmdbuf = "" ;
      lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      A13954WP_Machine = "" ;
      A13956WP_Product = "" ;
      A13957WP_ToDose = DecimalUtil.ZERO ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13959WP_ProdBat = "" ;
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      P09ER2_A13951WP_BatchCo = new String[] {""} ;
      P09ER2_A13961WP_StatusC = new int[1] ;
      P09ER2_A13960WP_DosingO = new int[1] ;
      P09ER2_A13959WP_ProdBat = new String[] {""} ;
      P09ER2_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER2_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER2_A13956WP_Product = new String[] {""} ;
      P09ER2_A13955WP_TankCod = new int[1] ;
      P09ER2_A13954WP_Machine = new String[] {""} ;
      P09ER2_A13953WP_ReDyeCS = new int[1] ;
      P09ER2_A13952WP_CallOff = new int[1] ;
      P09ER2_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER2_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER2_A13948WP_ID = new long[1] ;
      AV42Option = "" ;
      P09ER3_A13951WP_BatchCo = new String[] {""} ;
      P09ER3_A13954WP_Machine = new String[] {""} ;
      P09ER3_A13961WP_StatusC = new int[1] ;
      P09ER3_A13960WP_DosingO = new int[1] ;
      P09ER3_A13959WP_ProdBat = new String[] {""} ;
      P09ER3_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER3_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER3_A13956WP_Product = new String[] {""} ;
      P09ER3_A13955WP_TankCod = new int[1] ;
      P09ER3_A13953WP_ReDyeCS = new int[1] ;
      P09ER3_A13952WP_CallOff = new int[1] ;
      P09ER3_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER3_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER3_A13948WP_ID = new long[1] ;
      P09ER4_A13951WP_BatchCo = new String[] {""} ;
      P09ER4_A13956WP_Product = new String[] {""} ;
      P09ER4_A13961WP_StatusC = new int[1] ;
      P09ER4_A13960WP_DosingO = new int[1] ;
      P09ER4_A13959WP_ProdBat = new String[] {""} ;
      P09ER4_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER4_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER4_A13955WP_TankCod = new int[1] ;
      P09ER4_A13954WP_Machine = new String[] {""} ;
      P09ER4_A13953WP_ReDyeCS = new int[1] ;
      P09ER4_A13952WP_CallOff = new int[1] ;
      P09ER4_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER4_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER4_A13948WP_ID = new long[1] ;
      P09ER5_A13951WP_BatchCo = new String[] {""} ;
      P09ER5_A13959WP_ProdBat = new String[] {""} ;
      P09ER5_A13961WP_StatusC = new int[1] ;
      P09ER5_A13960WP_DosingO = new int[1] ;
      P09ER5_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER5_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ER5_A13956WP_Product = new String[] {""} ;
      P09ER5_A13955WP_TankCod = new int[1] ;
      P09ER5_A13954WP_Machine = new String[] {""} ;
      P09ER5_A13953WP_ReDyeCS = new int[1] ;
      P09ER5_A13952WP_CallOff = new int[1] ;
      P09ER5_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER5_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      P09ER5_A13948WP_ID = new long[1] ;
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wcgetfilterdata__colorservice(),
         new Object[] {
             new Object[] {
            P09ER2_A13951WP_BatchCo, P09ER2_A13961WP_StatusC, P09ER2_A13960WP_DosingO, P09ER2_A13959WP_ProdBat, P09ER2_A13958WP_Dosed, P09ER2_A13957WP_ToDose, P09ER2_A13956WP_Product, P09ER2_A13955WP_TankCod, P09ER2_A13954WP_Machine, P09ER2_A13953WP_ReDyeCS,
            P09ER2_A13952WP_CallOff, P09ER2_A13950WP_Date, P09ER2_A13949WP_Start, P09ER2_A13948WP_ID
            }
            , new Object[] {
            P09ER3_A13951WP_BatchCo, P09ER3_A13954WP_Machine, P09ER3_A13961WP_StatusC, P09ER3_A13960WP_DosingO, P09ER3_A13959WP_ProdBat, P09ER3_A13958WP_Dosed, P09ER3_A13957WP_ToDose, P09ER3_A13956WP_Product, P09ER3_A13955WP_TankCod, P09ER3_A13953WP_ReDyeCS,
            P09ER3_A13952WP_CallOff, P09ER3_A13950WP_Date, P09ER3_A13949WP_Start, P09ER3_A13948WP_ID
            }
            , new Object[] {
            P09ER4_A13951WP_BatchCo, P09ER4_A13956WP_Product, P09ER4_A13961WP_StatusC, P09ER4_A13960WP_DosingO, P09ER4_A13959WP_ProdBat, P09ER4_A13958WP_Dosed, P09ER4_A13957WP_ToDose, P09ER4_A13955WP_TankCod, P09ER4_A13954WP_Machine, P09ER4_A13953WP_ReDyeCS,
            P09ER4_A13952WP_CallOff, P09ER4_A13950WP_Date, P09ER4_A13949WP_Start, P09ER4_A13948WP_ID
            }
            , new Object[] {
            P09ER5_A13951WP_BatchCo, P09ER5_A13959WP_ProdBat, P09ER5_A13961WP_StatusC, P09ER5_A13960WP_DosingO, P09ER5_A13958WP_Dosed, P09ER5_A13957WP_ToDose, P09ER5_A13956WP_Product, P09ER5_A13955WP_TankCod, P09ER5_A13954WP_Machine, P09ER5_A13953WP_ReDyeCS,
            P09ER5_A13952WP_CallOff, P09ER5_A13950WP_Date, P09ER5_A13949WP_Start, P09ER5_A13948WP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60barcodreo ;
   private short AV62reclinmaq ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV18TFWP_CallOffCSv ;
   private int AV19TFWP_CallOffCSv_To ;
   private int AV20TFWP_ReDyeCSv ;
   private int AV21TFWP_ReDyeCSv_To ;
   private int AV24TFWP_TankCode ;
   private int AV25TFWP_TankCode_To ;
   private int AV34TFWP_DosingOrigin ;
   private int AV35TFWP_DosingOrigin_To ;
   private int AV36TFWP_StatusCSv ;
   private int AV37TFWP_StatusCSv_To ;
   private int AV59barcod ;
   private int AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ;
   private int AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ;
   private int AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ;
   private int AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ;
   private int AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ;
   private int AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ;
   private int AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ;
   private int AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ;
   private int AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ;
   private int AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ;
   private int A13952WP_CallOff ;
   private int A13953WP_ReDyeCS ;
   private int A13955WP_TankCod ;
   private int A13960WP_DosingO ;
   private int A13961WP_StatusC ;
   private int AV63colorserviceID ;
   private long AV10TFWP_ID ;
   private long AV11TFWP_ID_To ;
   private long AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ;
   private long AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ;
   private long A13948WP_ID ;
   private long AV50count ;
   private java.math.BigDecimal AV28TFWP_ToDose ;
   private java.math.BigDecimal AV29TFWP_ToDose_To ;
   private java.math.BigDecimal AV30TFWP_Dosed ;
   private java.math.BigDecimal AV31TFWP_Dosed_To ;
   private java.math.BigDecimal AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ;
   private java.math.BigDecimal AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ;
   private java.math.BigDecimal AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ;
   private java.math.BigDecimal AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ;
   private java.math.BigDecimal A13957WP_ToDose ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private String AV58emprcod ;
   private String AV61barcodpar ;
   private String scmdbuf ;
   private java.util.Date AV12TFWP_Start ;
   private java.util.Date AV14TFWP_Date ;
   private java.util.Date AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ;
   private java.util.Date AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ;
   private java.util.Date A13949WP_Start ;
   private java.util.Date A13950WP_Date ;
   private boolean returnInSub ;
   private boolean brk9ER2 ;
   private boolean brk9ER4 ;
   private boolean brk9ER6 ;
   private boolean brk9ER8 ;
   private String AV44OptionsJson ;
   private String AV47OptionsDescJson ;
   private String AV49OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV38SearchTxt ;
   private String AV39SearchTxtTo ;
   private String AV56FilterFullText ;
   private String AV16TFWP_BatchCode ;
   private String AV17TFWP_BatchCode_Sel ;
   private String AV22TFWP_MachineCode ;
   private String AV23TFWP_MachineCode_Sel ;
   private String AV26TFWP_ProductCSv ;
   private String AV27TFWP_ProductCSv_Sel ;
   private String AV32TFWP_ProdBatchCode ;
   private String AV33TFWP_ProdBatchCode_Sel ;
   private String AV57WP_Batchcode ;
   private String A13951WP_BatchCo ;
   private String AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ;
   private String AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ;
   private String AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ;
   private String AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ;
   private String AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ;
   private String lV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String lV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String lV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String lV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String lV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String A13954WP_Machine ;
   private String A13956WP_Product ;
   private String A13959WP_ProdBat ;
   private String AV42Option ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_colorservice ;
   private String[] P09ER2_A13951WP_BatchCo ;
   private int[] P09ER2_A13961WP_StatusC ;
   private int[] P09ER2_A13960WP_DosingO ;
   private String[] P09ER2_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09ER2_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09ER2_A13957WP_ToDose ;
   private String[] P09ER2_A13956WP_Product ;
   private int[] P09ER2_A13955WP_TankCod ;
   private String[] P09ER2_A13954WP_Machine ;
   private int[] P09ER2_A13953WP_ReDyeCS ;
   private int[] P09ER2_A13952WP_CallOff ;
   private java.util.Date[] P09ER2_A13950WP_Date ;
   private java.util.Date[] P09ER2_A13949WP_Start ;
   private long[] P09ER2_A13948WP_ID ;
   private String[] P09ER3_A13951WP_BatchCo ;
   private String[] P09ER3_A13954WP_Machine ;
   private int[] P09ER3_A13961WP_StatusC ;
   private int[] P09ER3_A13960WP_DosingO ;
   private String[] P09ER3_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09ER3_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09ER3_A13957WP_ToDose ;
   private String[] P09ER3_A13956WP_Product ;
   private int[] P09ER3_A13955WP_TankCod ;
   private int[] P09ER3_A13953WP_ReDyeCS ;
   private int[] P09ER3_A13952WP_CallOff ;
   private java.util.Date[] P09ER3_A13950WP_Date ;
   private java.util.Date[] P09ER3_A13949WP_Start ;
   private long[] P09ER3_A13948WP_ID ;
   private String[] P09ER4_A13951WP_BatchCo ;
   private String[] P09ER4_A13956WP_Product ;
   private int[] P09ER4_A13961WP_StatusC ;
   private int[] P09ER4_A13960WP_DosingO ;
   private String[] P09ER4_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09ER4_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09ER4_A13957WP_ToDose ;
   private int[] P09ER4_A13955WP_TankCod ;
   private String[] P09ER4_A13954WP_Machine ;
   private int[] P09ER4_A13953WP_ReDyeCS ;
   private int[] P09ER4_A13952WP_CallOff ;
   private java.util.Date[] P09ER4_A13950WP_Date ;
   private java.util.Date[] P09ER4_A13949WP_Start ;
   private long[] P09ER4_A13948WP_ID ;
   private String[] P09ER5_A13951WP_BatchCo ;
   private String[] P09ER5_A13959WP_ProdBat ;
   private int[] P09ER5_A13961WP_StatusC ;
   private int[] P09ER5_A13960WP_DosingO ;
   private java.math.BigDecimal[] P09ER5_A13958WP_Dosed ;
   private java.math.BigDecimal[] P09ER5_A13957WP_ToDose ;
   private String[] P09ER5_A13956WP_Product ;
   private int[] P09ER5_A13955WP_TankCod ;
   private String[] P09ER5_A13954WP_Machine ;
   private int[] P09ER5_A13953WP_ReDyeCS ;
   private int[] P09ER5_A13952WP_CallOff ;
   private java.util.Date[] P09ER5_A13950WP_Date ;
   private java.util.Date[] P09ER5_A13949WP_Start ;
   private long[] P09ER5_A13948WP_ID ;
   private GXSimpleCollection<String> AV43Options ;
   private GXSimpleCollection<String> AV46OptionsDesc ;
   private GXSimpleCollection<String> AV48OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class consumoscolorservice_wcgetfilterdata__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ER2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
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
                                          int AV63colorserviceID ,
                                          String AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT [BatchCode], [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [ProductCode], [TankCode], [MachineCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([BatchCode] = ?)");
      addWhere(sWhereString, "([id] > ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [BatchCode]" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09ER3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
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
                                          int AV63colorserviceID ,
                                          String AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[40];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT [BatchCode], [MachineCode], [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [ProductCode], [TankCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([BatchCode] = ?)");
      addWhere(sWhereString, "([id] > ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [BatchCode], [MachineCode]" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09ER4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
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
                                          int AV63colorserviceID ,
                                          String AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT [BatchCode], [ProductCode], [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [TankCode], [MachineCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([BatchCode] = ?)");
      addWhere(sWhereString, "([id] > ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
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
      if ( ! (0==AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [BatchCode], [ProductCode]" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09ER5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
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
                                          int AV63colorserviceID ,
                                          String AV68Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT [BatchCode], [ProductBatchCode], [Status], [DosingOrigin], [Dosed], [ToDose], [ProductCode], [TankCode], [MachineCode], [ReDye], [CallOff], [DateTime], [DateTimeStart]," ;
      scmdbuf += " [id] FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([BatchCode] = ?)");
      addWhere(sWhereString, "([id] > ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV95Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [BatchCode], [ProductBatchCode]" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09ER2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] );
            case 1 :
                  return conditional_P09ER3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P09ER4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] );
            case 3 :
                  return conditional_P09ER5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ER2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ER3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ER4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ER5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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

