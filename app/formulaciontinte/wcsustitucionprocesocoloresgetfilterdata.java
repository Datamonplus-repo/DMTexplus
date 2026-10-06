package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsustitucionprocesocoloresgetfilterdata extends GXProcedure
{
   public wcsustitucionprocesocoloresgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsustitucionprocesocoloresgetfilterdata.class ), "" );
   }

   public wcsustitucionprocesocoloresgetfilterdata( int remoteHandle ,
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
      wcsustitucionprocesocoloresgetfilterdata.this.aP5 = new String[] {""};
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
      wcsustitucionprocesocoloresgetfilterdata.this.AV28DDOName = aP0;
      wcsustitucionprocesocoloresgetfilterdata.this.AV26SearchTxt = aP1;
      wcsustitucionprocesocoloresgetfilterdata.this.AV27SearchTxtTo = aP2;
      wcsustitucionprocesocoloresgetfilterdata.this.aP3 = aP3;
      wcsustitucionprocesocoloresgetfilterdata.this.aP4 = aP4;
      wcsustitucionprocesocoloresgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSustitucionProcesoColoresGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("FormulacionTinte.WCSustitucionProcesoColoresGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV20TFForColNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFForColNum_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV24TFTipColDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV25TFTipColDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV45Clicod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV46Clicod_to = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV47ForColNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV48ForColNom_to = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV49ForColNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV50ForColNum_to = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV51ForSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV52ForSer_to = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD") == 0 )
         {
            AV53IntCod = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD_TO") == 0 )
         {
            AV54IntCod_to = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD") == 0 )
         {
            AV55MatCod = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MATCOD_TO") == 0 )
         {
            AV56MatCod_to = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV57TipColCod = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV58TipColCod_to = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV59ProForCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODDESTINO") == 0 )
         {
            AV60ProForCodDestino = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC") == 0 )
         {
            AV62ProforDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV26SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV61FilterFullText ;
      AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV10TFCliCod ;
      AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV11TFCliCod_To ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV12TFCliNom ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV14TFForSer ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV16TFForSerDsc ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV18TFForColNom ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV20TFForColNum ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV22TFTipColCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV45Clicod) ,
                                           Integer.valueOf(AV46Clicod_to) ,
                                           AV47ForColNom ,
                                           AV48ForColNom_to ,
                                           Integer.valueOf(AV49ForColNum) ,
                                           Integer.valueOf(AV50ForColNum_to) ,
                                           AV51ForSer ,
                                           AV52ForSer_to ,
                                           Byte.valueOf(AV53IntCod) ,
                                           Byte.valueOf(AV54IntCod_to) ,
                                           Short.valueOf(AV55MatCod) ,
                                           Short.valueOf(AV56MatCod_to) ,
                                           Byte.valueOf(AV57TipColCod) ,
                                           Byte.valueOf(AV58TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           AV59ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08J02 */
      pr_default.execute(0, new Object[] {AV44Emprcod, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV45Clicod), Integer.valueOf(AV46Clicod_to), AV47ForColNom, AV48ForColNom_to, Integer.valueOf(AV49ForColNum), Integer.valueOf(AV50ForColNum_to), AV51ForSer, AV52ForSer_to, Byte.valueOf(AV53IntCod), Byte.valueOf(AV54IntCod_to), Short.valueOf(AV55MatCod), Short.valueOf(AV56MatCod_to), Byte.valueOf(AV57TipColCod), Byte.valueOf(AV58TipColCod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8J02 = false ;
         A396EmprCod = P08J02_A396EmprCod[0] ;
         A279CliNom = P08J02_A279CliNom[0] ;
         A626MatCod = P08J02_A626MatCod[0] ;
         A583IntCod = P08J02_A583IntCod[0] ;
         A832TipColDsc = P08J02_A832TipColDsc[0] ;
         n832TipColDsc = P08J02_n832TipColDsc[0] ;
         A831TipColCod = P08J02_A831TipColCod[0] ;
         A483ForColNum = P08J02_A483ForColNum[0] ;
         A482ForColNom = P08J02_A482ForColNom[0] ;
         A5742ForSerDsc = P08J02_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08J02_n5742ForSerDsc[0] ;
         A494ForSer = P08J02_A494ForSer[0] ;
         A252CliCod = P08J02_A252CliCod[0] ;
         A832TipColDsc = P08J02_A832TipColDsc[0] ;
         n832TipColDsc = P08J02_n832TipColDsc[0] ;
         A279CliNom = P08J02_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08J02_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8J02 = false ;
            A396EmprCod = P08J02_A396EmprCod[0] ;
            A831TipColCod = P08J02_A831TipColCod[0] ;
            A483ForColNum = P08J02_A483ForColNum[0] ;
            A482ForColNom = P08J02_A482ForColNom[0] ;
            A494ForSer = P08J02_A494ForSer[0] ;
            A252CliCod = P08J02_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8J02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J02 )
         {
            brk8J02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV26SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV61FilterFullText ;
      AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV10TFCliCod ;
      AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV11TFCliCod_To ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV12TFCliNom ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV14TFForSer ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV16TFForSerDsc ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV18TFForColNom ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV20TFForColNum ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV22TFTipColCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV45Clicod) ,
                                           Integer.valueOf(AV46Clicod_to) ,
                                           AV47ForColNom ,
                                           AV48ForColNom_to ,
                                           Integer.valueOf(AV49ForColNum) ,
                                           Integer.valueOf(AV50ForColNum_to) ,
                                           AV51ForSer ,
                                           AV52ForSer_to ,
                                           Byte.valueOf(AV53IntCod) ,
                                           Byte.valueOf(AV54IntCod_to) ,
                                           Short.valueOf(AV55MatCod) ,
                                           Short.valueOf(AV56MatCod_to) ,
                                           Byte.valueOf(AV57TipColCod) ,
                                           Byte.valueOf(AV58TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           AV59ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08J03 */
      pr_default.execute(1, new Object[] {AV44Emprcod, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV45Clicod), Integer.valueOf(AV46Clicod_to), AV47ForColNom, AV48ForColNom_to, Integer.valueOf(AV49ForColNum), Integer.valueOf(AV50ForColNum_to), AV51ForSer, AV52ForSer_to, Byte.valueOf(AV53IntCod), Byte.valueOf(AV54IntCod_to), Short.valueOf(AV55MatCod), Short.valueOf(AV56MatCod_to), Byte.valueOf(AV57TipColCod), Byte.valueOf(AV58TipColCod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8J04 = false ;
         A396EmprCod = P08J03_A396EmprCod[0] ;
         A494ForSer = P08J03_A494ForSer[0] ;
         A626MatCod = P08J03_A626MatCod[0] ;
         A583IntCod = P08J03_A583IntCod[0] ;
         A832TipColDsc = P08J03_A832TipColDsc[0] ;
         n832TipColDsc = P08J03_n832TipColDsc[0] ;
         A831TipColCod = P08J03_A831TipColCod[0] ;
         A483ForColNum = P08J03_A483ForColNum[0] ;
         A482ForColNom = P08J03_A482ForColNom[0] ;
         A5742ForSerDsc = P08J03_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08J03_n5742ForSerDsc[0] ;
         A279CliNom = P08J03_A279CliNom[0] ;
         A252CliCod = P08J03_A252CliCod[0] ;
         A832TipColDsc = P08J03_A832TipColDsc[0] ;
         n832TipColDsc = P08J03_n832TipColDsc[0] ;
         A279CliNom = P08J03_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08J03_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk8J04 = false ;
            A396EmprCod = P08J03_A396EmprCod[0] ;
            A831TipColCod = P08J03_A831TipColCod[0] ;
            A483ForColNum = P08J03_A483ForColNum[0] ;
            A482ForColNom = P08J03_A482ForColNom[0] ;
            A252CliCod = P08J03_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8J04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV30Option = A494ForSer ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J04 )
         {
            brk8J04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV26SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV61FilterFullText ;
      AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV10TFCliCod ;
      AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV11TFCliCod_To ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV12TFCliNom ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV14TFForSer ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV16TFForSerDsc ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV18TFForColNom ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV20TFForColNum ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV22TFTipColCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV45Clicod) ,
                                           Integer.valueOf(AV46Clicod_to) ,
                                           AV47ForColNom ,
                                           AV48ForColNom_to ,
                                           Integer.valueOf(AV49ForColNum) ,
                                           Integer.valueOf(AV50ForColNum_to) ,
                                           AV51ForSer ,
                                           AV52ForSer_to ,
                                           Byte.valueOf(AV53IntCod) ,
                                           Byte.valueOf(AV54IntCod_to) ,
                                           Short.valueOf(AV55MatCod) ,
                                           Short.valueOf(AV56MatCod_to) ,
                                           Byte.valueOf(AV57TipColCod) ,
                                           Byte.valueOf(AV58TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           AV59ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08J04 */
      pr_default.execute(2, new Object[] {AV44Emprcod, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV45Clicod), Integer.valueOf(AV46Clicod_to), AV47ForColNom, AV48ForColNom_to, Integer.valueOf(AV49ForColNum), Integer.valueOf(AV50ForColNum_to), AV51ForSer, AV52ForSer_to, Byte.valueOf(AV53IntCod), Byte.valueOf(AV54IntCod_to), Short.valueOf(AV55MatCod), Short.valueOf(AV56MatCod_to), Byte.valueOf(AV57TipColCod), Byte.valueOf(AV58TipColCod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8J06 = false ;
         A396EmprCod = P08J04_A396EmprCod[0] ;
         A5742ForSerDsc = P08J04_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08J04_n5742ForSerDsc[0] ;
         A626MatCod = P08J04_A626MatCod[0] ;
         A583IntCod = P08J04_A583IntCod[0] ;
         A832TipColDsc = P08J04_A832TipColDsc[0] ;
         n832TipColDsc = P08J04_n832TipColDsc[0] ;
         A831TipColCod = P08J04_A831TipColCod[0] ;
         A483ForColNum = P08J04_A483ForColNum[0] ;
         A482ForColNom = P08J04_A482ForColNom[0] ;
         A494ForSer = P08J04_A494ForSer[0] ;
         A279CliNom = P08J04_A279CliNom[0] ;
         A252CliCod = P08J04_A252CliCod[0] ;
         A832TipColDsc = P08J04_A832TipColDsc[0] ;
         n832TipColDsc = P08J04_n832TipColDsc[0] ;
         A279CliNom = P08J04_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08J04_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk8J06 = false ;
            A396EmprCod = P08J04_A396EmprCod[0] ;
            A831TipColCod = P08J04_A831TipColCod[0] ;
            A483ForColNum = P08J04_A483ForColNum[0] ;
            A482ForColNom = P08J04_A482ForColNom[0] ;
            A494ForSer = P08J04_A494ForSer[0] ;
            A252CliCod = P08J04_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8J06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV30Option = A5742ForSerDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J06 )
         {
            brk8J06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV26SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV61FilterFullText ;
      AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV10TFCliCod ;
      AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV11TFCliCod_To ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV12TFCliNom ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV14TFForSer ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV16TFForSerDsc ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV18TFForColNom ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV20TFForColNum ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV22TFTipColCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV45Clicod) ,
                                           Integer.valueOf(AV46Clicod_to) ,
                                           AV47ForColNom ,
                                           AV48ForColNom_to ,
                                           Integer.valueOf(AV49ForColNum) ,
                                           Integer.valueOf(AV50ForColNum_to) ,
                                           AV51ForSer ,
                                           AV52ForSer_to ,
                                           Byte.valueOf(AV53IntCod) ,
                                           Byte.valueOf(AV54IntCod_to) ,
                                           Short.valueOf(AV55MatCod) ,
                                           Short.valueOf(AV56MatCod_to) ,
                                           Byte.valueOf(AV57TipColCod) ,
                                           Byte.valueOf(AV58TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           AV59ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08J05 */
      pr_default.execute(3, new Object[] {AV44Emprcod, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV45Clicod), Integer.valueOf(AV46Clicod_to), AV47ForColNom, AV48ForColNom_to, Integer.valueOf(AV49ForColNum), Integer.valueOf(AV50ForColNum_to), AV51ForSer, AV52ForSer_to, Byte.valueOf(AV53IntCod), Byte.valueOf(AV54IntCod_to), Short.valueOf(AV55MatCod), Short.valueOf(AV56MatCod_to), Byte.valueOf(AV57TipColCod), Byte.valueOf(AV58TipColCod_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8J08 = false ;
         A396EmprCod = P08J05_A396EmprCod[0] ;
         A482ForColNom = P08J05_A482ForColNom[0] ;
         A626MatCod = P08J05_A626MatCod[0] ;
         A583IntCod = P08J05_A583IntCod[0] ;
         A832TipColDsc = P08J05_A832TipColDsc[0] ;
         n832TipColDsc = P08J05_n832TipColDsc[0] ;
         A831TipColCod = P08J05_A831TipColCod[0] ;
         A483ForColNum = P08J05_A483ForColNum[0] ;
         A5742ForSerDsc = P08J05_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08J05_n5742ForSerDsc[0] ;
         A494ForSer = P08J05_A494ForSer[0] ;
         A279CliNom = P08J05_A279CliNom[0] ;
         A252CliCod = P08J05_A252CliCod[0] ;
         A832TipColDsc = P08J05_A832TipColDsc[0] ;
         n832TipColDsc = P08J05_n832TipColDsc[0] ;
         A279CliNom = P08J05_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08J05_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8J08 = false ;
            A396EmprCod = P08J05_A396EmprCod[0] ;
            A831TipColCod = P08J05_A831TipColCod[0] ;
            A483ForColNum = P08J05_A483ForColNum[0] ;
            A494ForSer = P08J05_A494ForSer[0] ;
            A252CliCod = P08J05_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8J08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV30Option = A482ForColNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J08 )
         {
            brk8J08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFTipColDsc = AV26SearchTxt ;
      AV25TFTipColDsc_Sel = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = AV61FilterFullText ;
      AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod = AV10TFCliCod ;
      AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to = AV11TFCliCod_To ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = AV12TFCliNom ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = AV14TFForSer ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = AV16TFForSerDsc ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = AV18TFForColNom ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum = AV20TFForColNum ;
      AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod = AV22TFTipColCod ;
      AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                           Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) ,
                                           AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                           AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                           AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                           AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                           AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                           AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                           AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                           AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) ,
                                           Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) ,
                                           Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) ,
                                           AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                           Integer.valueOf(AV45Clicod) ,
                                           Integer.valueOf(AV46Clicod_to) ,
                                           AV47ForColNom ,
                                           AV48ForColNom_to ,
                                           Integer.valueOf(AV49ForColNum) ,
                                           Integer.valueOf(AV50ForColNum_to) ,
                                           AV51ForSer ,
                                           AV52ForSer_to ,
                                           Byte.valueOf(AV53IntCod) ,
                                           Byte.valueOf(AV54IntCod_to) ,
                                           Short.valueOf(AV55MatCod) ,
                                           Short.valueOf(AV56MatCod_to) ,
                                           Byte.valueOf(AV57TipColCod) ,
                                           Byte.valueOf(AV58TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           Short.valueOf(A626MatCod) ,
                                           AV59ProForCod ,
                                           AV44Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom), 30, "%") ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser), 16, "%") ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc), 26, "%") ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom), 13, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08J06 */
      pr_default.execute(4, new Object[] {AV44Emprcod, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext, Integer.valueOf(AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod), Integer.valueOf(AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to), lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom, AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel, lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser, AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel, lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc, AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel, lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom, AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel, Integer.valueOf(AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum), Integer.valueOf(AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to), Byte.valueOf(AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod), Byte.valueOf(AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to), lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc, AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel, Integer.valueOf(AV45Clicod), Integer.valueOf(AV46Clicod_to), AV47ForColNom, AV48ForColNom_to, Integer.valueOf(AV49ForColNum), Integer.valueOf(AV50ForColNum_to), AV51ForSer, AV52ForSer_to, Byte.valueOf(AV53IntCod), Byte.valueOf(AV54IntCod_to), Short.valueOf(AV55MatCod), Short.valueOf(AV56MatCod_to), Byte.valueOf(AV57TipColCod), Byte.valueOf(AV58TipColCod_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8J010 = false ;
         A831TipColCod = P08J06_A831TipColCod[0] ;
         A396EmprCod = P08J06_A396EmprCod[0] ;
         A626MatCod = P08J06_A626MatCod[0] ;
         A583IntCod = P08J06_A583IntCod[0] ;
         A832TipColDsc = P08J06_A832TipColDsc[0] ;
         n832TipColDsc = P08J06_n832TipColDsc[0] ;
         A483ForColNum = P08J06_A483ForColNum[0] ;
         A482ForColNom = P08J06_A482ForColNom[0] ;
         A5742ForSerDsc = P08J06_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08J06_n5742ForSerDsc[0] ;
         A494ForSer = P08J06_A494ForSer[0] ;
         A279CliNom = P08J06_A279CliNom[0] ;
         A252CliCod = P08J06_A252CliCod[0] ;
         A832TipColDsc = P08J06_A832TipColDsc[0] ;
         n832TipColDsc = P08J06_n832TipColDsc[0] ;
         A279CliNom = P08J06_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08J06_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08J06_A831TipColCod[0] == A831TipColCod ) )
         {
            brk8J010 = false ;
            A483ForColNum = P08J06_A483ForColNum[0] ;
            A482ForColNom = P08J06_A482ForColNom[0] ;
            A494ForSer = P08J06_A494ForSer[0] ;
            A252CliCod = P08J06_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8J010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV30Option = A832TipColDsc ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J010 )
         {
            brk8J010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcsustitucionprocesocoloresgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wcsustitucionprocesocoloresgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wcsustitucionprocesocoloresgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForSerDsc = "" ;
      AV17TFForSerDsc_Sel = "" ;
      AV18TFForColNom = "" ;
      AV19TFForColNom_Sel = "" ;
      AV24TFTipColDsc = "" ;
      AV25TFTipColDsc_Sel = "" ;
      AV44Emprcod = "" ;
      AV47ForColNom = "" ;
      AV48ForColNom_to = "" ;
      AV51ForSer = "" ;
      AV52ForSer_to = "" ;
      AV59ProForCod = "" ;
      AV60ProForCodDestino = "" ;
      AV62ProforDsc = "" ;
      A279CliNom = "" ;
      AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel = "" ;
      AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel = "" ;
      AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel = "" ;
      AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel = "" ;
      AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext = "" ;
      lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom = "" ;
      lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser = "" ;
      lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc = "" ;
      lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom = "" ;
      lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A396EmprCod = "" ;
      P08J02_A396EmprCod = new String[] {""} ;
      P08J02_A279CliNom = new String[] {""} ;
      P08J02_A626MatCod = new short[1] ;
      P08J02_A583IntCod = new byte[1] ;
      P08J02_A832TipColDsc = new String[] {""} ;
      P08J02_n832TipColDsc = new boolean[] {false} ;
      P08J02_A831TipColCod = new byte[1] ;
      P08J02_A483ForColNum = new int[1] ;
      P08J02_A482ForColNom = new String[] {""} ;
      P08J02_A5742ForSerDsc = new String[] {""} ;
      P08J02_n5742ForSerDsc = new boolean[] {false} ;
      P08J02_A494ForSer = new String[] {""} ;
      P08J02_A252CliCod = new int[1] ;
      AV30Option = "" ;
      P08J03_A396EmprCod = new String[] {""} ;
      P08J03_A494ForSer = new String[] {""} ;
      P08J03_A626MatCod = new short[1] ;
      P08J03_A583IntCod = new byte[1] ;
      P08J03_A832TipColDsc = new String[] {""} ;
      P08J03_n832TipColDsc = new boolean[] {false} ;
      P08J03_A831TipColCod = new byte[1] ;
      P08J03_A483ForColNum = new int[1] ;
      P08J03_A482ForColNom = new String[] {""} ;
      P08J03_A5742ForSerDsc = new String[] {""} ;
      P08J03_n5742ForSerDsc = new boolean[] {false} ;
      P08J03_A279CliNom = new String[] {""} ;
      P08J03_A252CliCod = new int[1] ;
      P08J04_A396EmprCod = new String[] {""} ;
      P08J04_A5742ForSerDsc = new String[] {""} ;
      P08J04_n5742ForSerDsc = new boolean[] {false} ;
      P08J04_A626MatCod = new short[1] ;
      P08J04_A583IntCod = new byte[1] ;
      P08J04_A832TipColDsc = new String[] {""} ;
      P08J04_n832TipColDsc = new boolean[] {false} ;
      P08J04_A831TipColCod = new byte[1] ;
      P08J04_A483ForColNum = new int[1] ;
      P08J04_A482ForColNom = new String[] {""} ;
      P08J04_A494ForSer = new String[] {""} ;
      P08J04_A279CliNom = new String[] {""} ;
      P08J04_A252CliCod = new int[1] ;
      P08J05_A396EmprCod = new String[] {""} ;
      P08J05_A482ForColNom = new String[] {""} ;
      P08J05_A626MatCod = new short[1] ;
      P08J05_A583IntCod = new byte[1] ;
      P08J05_A832TipColDsc = new String[] {""} ;
      P08J05_n832TipColDsc = new boolean[] {false} ;
      P08J05_A831TipColCod = new byte[1] ;
      P08J05_A483ForColNum = new int[1] ;
      P08J05_A5742ForSerDsc = new String[] {""} ;
      P08J05_n5742ForSerDsc = new boolean[] {false} ;
      P08J05_A494ForSer = new String[] {""} ;
      P08J05_A279CliNom = new String[] {""} ;
      P08J05_A252CliCod = new int[1] ;
      P08J06_A831TipColCod = new byte[1] ;
      P08J06_A396EmprCod = new String[] {""} ;
      P08J06_A626MatCod = new short[1] ;
      P08J06_A583IntCod = new byte[1] ;
      P08J06_A832TipColDsc = new String[] {""} ;
      P08J06_n832TipColDsc = new boolean[] {false} ;
      P08J06_A483ForColNum = new int[1] ;
      P08J06_A482ForColNom = new String[] {""} ;
      P08J06_A5742ForSerDsc = new String[] {""} ;
      P08J06_n5742ForSerDsc = new boolean[] {false} ;
      P08J06_A494ForSer = new String[] {""} ;
      P08J06_A279CliNom = new String[] {""} ;
      P08J06_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsustitucionprocesocoloresgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08J02_A396EmprCod, P08J02_A279CliNom, P08J02_A626MatCod, P08J02_A583IntCod, P08J02_A832TipColDsc, P08J02_n832TipColDsc, P08J02_A831TipColCod, P08J02_A483ForColNum, P08J02_A482ForColNom, P08J02_A5742ForSerDsc,
            P08J02_n5742ForSerDsc, P08J02_A494ForSer, P08J02_A252CliCod
            }
            , new Object[] {
            P08J03_A396EmprCod, P08J03_A494ForSer, P08J03_A626MatCod, P08J03_A583IntCod, P08J03_A832TipColDsc, P08J03_n832TipColDsc, P08J03_A831TipColCod, P08J03_A483ForColNum, P08J03_A482ForColNom, P08J03_A5742ForSerDsc,
            P08J03_n5742ForSerDsc, P08J03_A279CliNom, P08J03_A252CliCod
            }
            , new Object[] {
            P08J04_A396EmprCod, P08J04_A5742ForSerDsc, P08J04_n5742ForSerDsc, P08J04_A626MatCod, P08J04_A583IntCod, P08J04_A832TipColDsc, P08J04_n832TipColDsc, P08J04_A831TipColCod, P08J04_A483ForColNum, P08J04_A482ForColNom,
            P08J04_A494ForSer, P08J04_A279CliNom, P08J04_A252CliCod
            }
            , new Object[] {
            P08J05_A396EmprCod, P08J05_A482ForColNom, P08J05_A626MatCod, P08J05_A583IntCod, P08J05_A832TipColDsc, P08J05_n832TipColDsc, P08J05_A831TipColCod, P08J05_A483ForColNum, P08J05_A5742ForSerDsc, P08J05_n5742ForSerDsc,
            P08J05_A494ForSer, P08J05_A279CliNom, P08J05_A252CliCod
            }
            , new Object[] {
            P08J06_A831TipColCod, P08J06_A396EmprCod, P08J06_A626MatCod, P08J06_A583IntCod, P08J06_A832TipColDsc, P08J06_n832TipColDsc, P08J06_A483ForColNum, P08J06_A482ForColNom, P08J06_A5742ForSerDsc, P08J06_n5742ForSerDsc,
            P08J06_A494ForSer, P08J06_A279CliNom, P08J06_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte AV53IntCod ;
   private byte AV54IntCod_to ;
   private byte AV57TipColCod ;
   private byte AV58TipColCod_to ;
   private byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ;
   private byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short AV55MatCod ;
   private short AV56MatCod_to ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFForColNum ;
   private int AV21TFForColNum_To ;
   private int AV45Clicod ;
   private int AV46Clicod_to ;
   private int AV49ForColNum ;
   private int AV50ForColNum_to ;
   private int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ;
   private int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ;
   private int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ;
   private int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForSerDsc ;
   private String AV17TFForSerDsc_Sel ;
   private String AV18TFForColNom ;
   private String AV19TFForColNom_Sel ;
   private String AV24TFTipColDsc ;
   private String AV25TFTipColDsc_Sel ;
   private String AV44Emprcod ;
   private String AV47ForColNom ;
   private String AV48ForColNom_to ;
   private String AV51ForSer ;
   private String AV52ForSer_to ;
   private String AV59ProForCod ;
   private String AV60ProForCodDestino ;
   private String AV62ProforDsc ;
   private String A279CliNom ;
   private String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ;
   private String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ;
   private String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ;
   private String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ;
   private String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ;
   private String lV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ;
   private String lV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ;
   private String lV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ;
   private String lV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8J02 ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private boolean brk8J04 ;
   private boolean brk8J06 ;
   private boolean brk8J08 ;
   private boolean brk8J010 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV61FilterFullText ;
   private String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String lV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08J02_A396EmprCod ;
   private String[] P08J02_A279CliNom ;
   private short[] P08J02_A626MatCod ;
   private byte[] P08J02_A583IntCod ;
   private String[] P08J02_A832TipColDsc ;
   private boolean[] P08J02_n832TipColDsc ;
   private byte[] P08J02_A831TipColCod ;
   private int[] P08J02_A483ForColNum ;
   private String[] P08J02_A482ForColNom ;
   private String[] P08J02_A5742ForSerDsc ;
   private boolean[] P08J02_n5742ForSerDsc ;
   private String[] P08J02_A494ForSer ;
   private int[] P08J02_A252CliCod ;
   private String[] P08J03_A396EmprCod ;
   private String[] P08J03_A494ForSer ;
   private short[] P08J03_A626MatCod ;
   private byte[] P08J03_A583IntCod ;
   private String[] P08J03_A832TipColDsc ;
   private boolean[] P08J03_n832TipColDsc ;
   private byte[] P08J03_A831TipColCod ;
   private int[] P08J03_A483ForColNum ;
   private String[] P08J03_A482ForColNom ;
   private String[] P08J03_A5742ForSerDsc ;
   private boolean[] P08J03_n5742ForSerDsc ;
   private String[] P08J03_A279CliNom ;
   private int[] P08J03_A252CliCod ;
   private String[] P08J04_A396EmprCod ;
   private String[] P08J04_A5742ForSerDsc ;
   private boolean[] P08J04_n5742ForSerDsc ;
   private short[] P08J04_A626MatCod ;
   private byte[] P08J04_A583IntCod ;
   private String[] P08J04_A832TipColDsc ;
   private boolean[] P08J04_n832TipColDsc ;
   private byte[] P08J04_A831TipColCod ;
   private int[] P08J04_A483ForColNum ;
   private String[] P08J04_A482ForColNom ;
   private String[] P08J04_A494ForSer ;
   private String[] P08J04_A279CliNom ;
   private int[] P08J04_A252CliCod ;
   private String[] P08J05_A396EmprCod ;
   private String[] P08J05_A482ForColNom ;
   private short[] P08J05_A626MatCod ;
   private byte[] P08J05_A583IntCod ;
   private String[] P08J05_A832TipColDsc ;
   private boolean[] P08J05_n832TipColDsc ;
   private byte[] P08J05_A831TipColCod ;
   private int[] P08J05_A483ForColNum ;
   private String[] P08J05_A5742ForSerDsc ;
   private boolean[] P08J05_n5742ForSerDsc ;
   private String[] P08J05_A494ForSer ;
   private String[] P08J05_A279CliNom ;
   private int[] P08J05_A252CliCod ;
   private byte[] P08J06_A831TipColCod ;
   private String[] P08J06_A396EmprCod ;
   private short[] P08J06_A626MatCod ;
   private byte[] P08J06_A583IntCod ;
   private String[] P08J06_A832TipColDsc ;
   private boolean[] P08J06_n832TipColDsc ;
   private int[] P08J06_A483ForColNum ;
   private String[] P08J06_A482ForColNom ;
   private String[] P08J06_A5742ForSerDsc ;
   private boolean[] P08J06_n5742ForSerDsc ;
   private String[] P08J06_A494ForSer ;
   private String[] P08J06_A279CliNom ;
   private int[] P08J06_A252CliCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wcsustitucionprocesocoloresgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08J02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV45Clicod ,
                                          int AV46Clicod_to ,
                                          String AV47ForColNom ,
                                          String AV48ForColNom_to ,
                                          int AV49ForColNum ,
                                          int AV50ForColNum_to ,
                                          String AV51ForSer ,
                                          String AV52ForSer_to ,
                                          byte AV53IntCod ,
                                          byte AV54IntCod_to ,
                                          short AV55MatCod ,
                                          short AV56MatCod_to ,
                                          byte AV57TipColCod ,
                                          byte AV58TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String AV59ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.MatCod, T1.IntCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV45Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV46Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV49ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV50ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV53IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV54IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV55MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV56MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV57TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV58TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08J03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV45Clicod ,
                                          int AV46Clicod_to ,
                                          String AV47ForColNom ,
                                          String AV48ForColNom_to ,
                                          int AV49ForColNum ,
                                          int AV50ForColNum_to ,
                                          String AV51ForSer ,
                                          String AV52ForSer_to ,
                                          byte AV53IntCod ,
                                          byte AV54IntCod_to ,
                                          short AV55MatCod ,
                                          short AV56MatCod_to ,
                                          byte AV57TipColCod ,
                                          byte AV58TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String AV59ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[39];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSer, T1.MatCod, T1.IntCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV45Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV46Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV49ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV50ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV53IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV54IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV55MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV56MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV57TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV58TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08J04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV45Clicod ,
                                          int AV46Clicod_to ,
                                          String AV47ForColNom ,
                                          String AV48ForColNom_to ,
                                          int AV49ForColNum ,
                                          int AV50ForColNum_to ,
                                          String AV51ForSer ,
                                          String AV52ForSer_to ,
                                          byte AV53IntCod ,
                                          byte AV54IntCod_to ,
                                          short AV55MatCod ,
                                          short AV56MatCod_to ,
                                          byte AV57TipColCod ,
                                          byte AV58TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String AV59ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSerDsc, T1.MatCod, T1.IntCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV45Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV46Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV49ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV50ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV53IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV54IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV55MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV56MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV57TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV58TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08J05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV45Clicod ,
                                          int AV46Clicod_to ,
                                          String AV47ForColNom ,
                                          String AV48ForColNom_to ,
                                          int AV49ForColNum ,
                                          int AV50ForColNum_to ,
                                          String AV51ForSer ,
                                          String AV52ForSer_to ,
                                          byte AV53IntCod ,
                                          byte AV54IntCod_to ,
                                          short AV55MatCod ,
                                          short AV56MatCod_to ,
                                          byte AV57TipColCod ,
                                          byte AV58TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          String AV59ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNom, T1.MatCod, T1.IntCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV45Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV46Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV49ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV50ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV53IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV54IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV55MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV56MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV57TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV58TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08J06( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext ,
                                          int AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod ,
                                          int AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to ,
                                          String AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel ,
                                          String AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom ,
                                          String AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel ,
                                          String AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser ,
                                          String AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel ,
                                          String AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc ,
                                          String AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel ,
                                          String AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom ,
                                          int AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum ,
                                          int AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to ,
                                          byte AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod ,
                                          byte AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to ,
                                          String AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc ,
                                          int AV45Clicod ,
                                          int AV46Clicod_to ,
                                          String AV47ForColNom ,
                                          String AV48ForColNom_to ,
                                          int AV49ForColNum ,
                                          int AV50ForColNum_to ,
                                          String AV51ForSer ,
                                          String AV52ForSer_to ,
                                          byte AV53IntCod ,
                                          byte AV54IntCod_to ,
                                          short AV55MatCod ,
                                          short AV56MatCod_to ,
                                          byte AV57TipColCod ,
                                          byte AV58TipColCod_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          short A626MatCod ,
                                          String AV59ProForCod ,
                                          String AV44Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[39];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.MatCod, T1.IntCod, T2.TipColDsc, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU T1" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsustitucionprocesocoloresds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wcsustitucionprocesocoloresds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsustitucionprocesocoloresds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsustitucionprocesocoloresds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsustitucionprocesocoloresds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsustitucionprocesocoloresds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsustitucionprocesocoloresds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsustitucionprocesocoloresds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsustitucionprocesocoloresds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsustitucionprocesocoloresds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsustitucionprocesocoloresds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcsustitucionprocesocoloresds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcsustitucionprocesocoloresds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcsustitucionprocesocoloresds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsustitucionprocesocoloresds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesocoloresds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesocoloresds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV45Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV46Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48ForColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV49ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV50ForColNum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51ForSer)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52ForSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV53IntCod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV54IntCod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV55MatCod) )
      {
         addWhere(sWhereString, "(T1.MatCod >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (0==AV56MatCod_to) )
      {
         addWhere(sWhereString, "(T1.MatCod <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV57TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV58TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08J02(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[44] );
            case 1 :
                  return conditional_P08J03(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[44] );
            case 2 :
                  return conditional_P08J04(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[44] );
            case 3 :
                  return conditional_P08J05(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[44] );
            case 4 :
                  return conditional_P08J06(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08J02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J06", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               return;
      }
   }

}

