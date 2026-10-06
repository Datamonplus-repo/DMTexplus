package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcborradoformulasgetfilterdata extends GXProcedure
{
   public wcborradoformulasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcborradoformulasgetfilterdata.class ), "" );
   }

   public wcborradoformulasgetfilterdata( int remoteHandle ,
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
      wcborradoformulasgetfilterdata.this.aP5 = new String[] {""};
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
      wcborradoformulasgetfilterdata.this.AV32DDOName = aP0;
      wcborradoformulasgetfilterdata.this.AV30SearchTxt = aP1;
      wcborradoformulasgetfilterdata.this.AV31SearchTxtTo = aP2;
      wcborradoformulasgetfilterdata.this.aP3 = aP3;
      wcborradoformulasgetfilterdata.this.aP4 = aP4;
      wcborradoformulasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_TIPCOLDSC") == 0 )
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
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV20TFForColNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFForColNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV24TFTipColDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV25TFTipColDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV26TFForNumCol = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFForNumCol_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV28TFForUltUti = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV58Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV48Clicod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV49Clicod_to = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV50Forser = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV51Forser_to = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV52Forcolnom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV53Forcolnom_to = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV54Forcolnum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV55Forcolnum_to = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV56TipColCod = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV57TipColCod_to = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV59ForUltUti = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV30SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV60FilterFullText ;
      AV66Formulaciontinte_wcborradoformulasds_2_tfclicod = AV10TFCliCod ;
      AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = AV12TFCliNom ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = AV14TFForSer ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV26TFForNumCol ;
      AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV27TFForNumCol_To ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV28TFForUltUti ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Integer.valueOf(AV48Clicod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV50Forser ,
                                           AV51Forser_to ,
                                           AV52Forcolnom ,
                                           AV53Forcolnom_to ,
                                           Integer.valueOf(AV54Forcolnum) ,
                                           Integer.valueOf(AV55Forcolnum_to) ,
                                           Byte.valueOf(AV56TipColCod) ,
                                           Byte.valueOf(AV57TipColCod_to) ,
                                           AV59ForUltUti ,
                                           A396EmprCod ,
                                           AV58Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KZ2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV48Clicod), Integer.valueOf(AV49Clicod_to), AV50Forser, AV51Forser_to, AV52Forcolnom, AV53Forcolnom_to, Integer.valueOf(AV54Forcolnum), Integer.valueOf(AV55Forcolnum_to), Byte.valueOf(AV56TipColCod), Byte.valueOf(AV57TipColCod_to), AV59ForUltUti, AV59ForUltUti, AV58Emprcod, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV68Formulaciontinte_wcborradoformulasds_4_tfclinom, AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV70Formulaciontinte_wcborradoformulasds_6_tfforser, AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8KZ2 = false ;
         A396EmprCod = P08KZ2_A396EmprCod[0] ;
         A279CliNom = P08KZ2_A279CliNom[0] ;
         A496ForUltUti = P08KZ2_A496ForUltUti[0] ;
         n496ForUltUti = P08KZ2_n496ForUltUti[0] ;
         A486ForNumCol = P08KZ2_A486ForNumCol[0] ;
         A832TipColDsc = P08KZ2_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ2_n832TipColDsc[0] ;
         A831TipColCod = P08KZ2_A831TipColCod[0] ;
         A483ForColNum = P08KZ2_A483ForColNum[0] ;
         A482ForColNom = P08KZ2_A482ForColNom[0] ;
         A5742ForSerDsc = P08KZ2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KZ2_n5742ForSerDsc[0] ;
         A494ForSer = P08KZ2_A494ForSer[0] ;
         A252CliCod = P08KZ2_A252CliCod[0] ;
         A832TipColDsc = P08KZ2_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ2_n832TipColDsc[0] ;
         A279CliNom = P08KZ2_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08KZ2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8KZ2 = false ;
            A396EmprCod = P08KZ2_A396EmprCod[0] ;
            A831TipColCod = P08KZ2_A831TipColCod[0] ;
            A483ForColNum = P08KZ2_A483ForColNum[0] ;
            A482ForColNom = P08KZ2_A482ForColNom[0] ;
            A494ForSer = P08KZ2_A494ForSer[0] ;
            A252CliCod = P08KZ2_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8KZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV34Option = A279CliNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KZ2 )
         {
            brk8KZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV30SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV60FilterFullText ;
      AV66Formulaciontinte_wcborradoformulasds_2_tfclicod = AV10TFCliCod ;
      AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = AV12TFCliNom ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = AV14TFForSer ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV26TFForNumCol ;
      AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV27TFForNumCol_To ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV28TFForUltUti ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Integer.valueOf(AV48Clicod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV52Forcolnom ,
                                           AV53Forcolnom_to ,
                                           Integer.valueOf(AV54Forcolnum) ,
                                           Integer.valueOf(AV55Forcolnum_to) ,
                                           Byte.valueOf(AV56TipColCod) ,
                                           Byte.valueOf(AV57TipColCod_to) ,
                                           AV59ForUltUti ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           AV50Forser ,
                                           AV51Forser_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KZ3 */
      pr_default.execute(1, new Object[] {AV50Forser, Integer.valueOf(AV48Clicod), Integer.valueOf(AV49Clicod_to), AV52Forcolnom, AV53Forcolnom_to, Integer.valueOf(AV54Forcolnum), Integer.valueOf(AV55Forcolnum_to), Byte.valueOf(AV56TipColCod), Byte.valueOf(AV57TipColCod_to), AV59ForUltUti, AV59ForUltUti, AV58Emprcod, AV51Forser_to, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV68Formulaciontinte_wcborradoformulasds_4_tfclinom, AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV70Formulaciontinte_wcborradoformulasds_6_tfforser, AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8KZ4 = false ;
         A396EmprCod = P08KZ3_A396EmprCod[0] ;
         A494ForSer = P08KZ3_A494ForSer[0] ;
         A496ForUltUti = P08KZ3_A496ForUltUti[0] ;
         n496ForUltUti = P08KZ3_n496ForUltUti[0] ;
         A486ForNumCol = P08KZ3_A486ForNumCol[0] ;
         A832TipColDsc = P08KZ3_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ3_n832TipColDsc[0] ;
         A831TipColCod = P08KZ3_A831TipColCod[0] ;
         A483ForColNum = P08KZ3_A483ForColNum[0] ;
         A482ForColNom = P08KZ3_A482ForColNom[0] ;
         A5742ForSerDsc = P08KZ3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KZ3_n5742ForSerDsc[0] ;
         A279CliNom = P08KZ3_A279CliNom[0] ;
         A252CliCod = P08KZ3_A252CliCod[0] ;
         A832TipColDsc = P08KZ3_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ3_n832TipColDsc[0] ;
         A279CliNom = P08KZ3_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08KZ3_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk8KZ4 = false ;
            A396EmprCod = P08KZ3_A396EmprCod[0] ;
            A831TipColCod = P08KZ3_A831TipColCod[0] ;
            A483ForColNum = P08KZ3_A483ForColNum[0] ;
            A482ForColNom = P08KZ3_A482ForColNom[0] ;
            A252CliCod = P08KZ3_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8KZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV34Option = A494ForSer ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KZ4 )
         {
            brk8KZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV30SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV60FilterFullText ;
      AV66Formulaciontinte_wcborradoformulasds_2_tfclicod = AV10TFCliCod ;
      AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = AV12TFCliNom ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = AV14TFForSer ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV26TFForNumCol ;
      AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV27TFForNumCol_To ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV28TFForUltUti ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Integer.valueOf(AV48Clicod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV50Forser ,
                                           AV51Forser_to ,
                                           AV52Forcolnom ,
                                           AV53Forcolnom_to ,
                                           Integer.valueOf(AV54Forcolnum) ,
                                           Integer.valueOf(AV55Forcolnum_to) ,
                                           Byte.valueOf(AV56TipColCod) ,
                                           Byte.valueOf(AV57TipColCod_to) ,
                                           AV59ForUltUti ,
                                           A396EmprCod ,
                                           AV58Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KZ4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV48Clicod), Integer.valueOf(AV49Clicod_to), AV50Forser, AV51Forser_to, AV52Forcolnom, AV53Forcolnom_to, Integer.valueOf(AV54Forcolnum), Integer.valueOf(AV55Forcolnum_to), Byte.valueOf(AV56TipColCod), Byte.valueOf(AV57TipColCod_to), AV59ForUltUti, AV59ForUltUti, AV58Emprcod, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV68Formulaciontinte_wcborradoformulasds_4_tfclinom, AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV70Formulaciontinte_wcborradoformulasds_6_tfforser, AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8KZ6 = false ;
         A396EmprCod = P08KZ4_A396EmprCod[0] ;
         A5742ForSerDsc = P08KZ4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KZ4_n5742ForSerDsc[0] ;
         A496ForUltUti = P08KZ4_A496ForUltUti[0] ;
         n496ForUltUti = P08KZ4_n496ForUltUti[0] ;
         A486ForNumCol = P08KZ4_A486ForNumCol[0] ;
         A832TipColDsc = P08KZ4_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ4_n832TipColDsc[0] ;
         A831TipColCod = P08KZ4_A831TipColCod[0] ;
         A483ForColNum = P08KZ4_A483ForColNum[0] ;
         A482ForColNom = P08KZ4_A482ForColNom[0] ;
         A494ForSer = P08KZ4_A494ForSer[0] ;
         A279CliNom = P08KZ4_A279CliNom[0] ;
         A252CliCod = P08KZ4_A252CliCod[0] ;
         A832TipColDsc = P08KZ4_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ4_n832TipColDsc[0] ;
         A279CliNom = P08KZ4_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08KZ4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk8KZ6 = false ;
            A396EmprCod = P08KZ4_A396EmprCod[0] ;
            A831TipColCod = P08KZ4_A831TipColCod[0] ;
            A483ForColNum = P08KZ4_A483ForColNum[0] ;
            A482ForColNom = P08KZ4_A482ForColNom[0] ;
            A494ForSer = P08KZ4_A494ForSer[0] ;
            A252CliCod = P08KZ4_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8KZ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV34Option = A5742ForSerDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KZ6 )
         {
            brk8KZ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV30SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV60FilterFullText ;
      AV66Formulaciontinte_wcborradoformulasds_2_tfclicod = AV10TFCliCod ;
      AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = AV12TFCliNom ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = AV14TFForSer ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV26TFForNumCol ;
      AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV27TFForNumCol_To ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV28TFForUltUti ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Integer.valueOf(AV48Clicod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV50Forser ,
                                           AV51Forser_to ,
                                           Integer.valueOf(AV54Forcolnum) ,
                                           Integer.valueOf(AV55Forcolnum_to) ,
                                           Byte.valueOf(AV56TipColCod) ,
                                           Byte.valueOf(AV57TipColCod_to) ,
                                           AV59ForUltUti ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           AV52Forcolnom ,
                                           AV53Forcolnom_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KZ5 */
      pr_default.execute(3, new Object[] {AV52Forcolnom, Integer.valueOf(AV48Clicod), Integer.valueOf(AV49Clicod_to), AV50Forser, AV51Forser_to, Integer.valueOf(AV54Forcolnum), Integer.valueOf(AV55Forcolnum_to), Byte.valueOf(AV56TipColCod), Byte.valueOf(AV57TipColCod_to), AV59ForUltUti, AV59ForUltUti, AV58Emprcod, AV53Forcolnom_to, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV68Formulaciontinte_wcborradoformulasds_4_tfclinom, AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV70Formulaciontinte_wcborradoformulasds_6_tfforser, AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8KZ8 = false ;
         A396EmprCod = P08KZ5_A396EmprCod[0] ;
         A482ForColNom = P08KZ5_A482ForColNom[0] ;
         A496ForUltUti = P08KZ5_A496ForUltUti[0] ;
         n496ForUltUti = P08KZ5_n496ForUltUti[0] ;
         A486ForNumCol = P08KZ5_A486ForNumCol[0] ;
         A832TipColDsc = P08KZ5_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ5_n832TipColDsc[0] ;
         A831TipColCod = P08KZ5_A831TipColCod[0] ;
         A483ForColNum = P08KZ5_A483ForColNum[0] ;
         A5742ForSerDsc = P08KZ5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KZ5_n5742ForSerDsc[0] ;
         A494ForSer = P08KZ5_A494ForSer[0] ;
         A279CliNom = P08KZ5_A279CliNom[0] ;
         A252CliCod = P08KZ5_A252CliCod[0] ;
         A832TipColDsc = P08KZ5_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ5_n832TipColDsc[0] ;
         A279CliNom = P08KZ5_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08KZ5_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8KZ8 = false ;
            A396EmprCod = P08KZ5_A396EmprCod[0] ;
            A831TipColCod = P08KZ5_A831TipColCod[0] ;
            A483ForColNum = P08KZ5_A483ForColNum[0] ;
            A494ForSer = P08KZ5_A494ForSer[0] ;
            A252CliCod = P08KZ5_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8KZ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV34Option = A482ForColNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KZ8 )
         {
            brk8KZ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFTipColDsc = AV30SearchTxt ;
      AV25TFTipColDsc_Sel = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV60FilterFullText ;
      AV66Formulaciontinte_wcborradoformulasds_2_tfclicod = AV10TFCliCod ;
      AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV11TFCliCod_To ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = AV12TFCliNom ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = AV14TFForSer ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV15TFForSer_Sel ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV16TFForSerDsc ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV18TFForColNom ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV20TFForColNum ;
      AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV21TFForColNum_To ;
      AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV22TFTipColCod ;
      AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV23TFTipColCod_To ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV24TFTipColDsc ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV26TFForNumCol ;
      AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV27TFForNumCol_To ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV28TFForUltUti ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Integer.valueOf(AV48Clicod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV50Forser ,
                                           AV51Forser_to ,
                                           AV52Forcolnom ,
                                           AV53Forcolnom_to ,
                                           Integer.valueOf(AV54Forcolnum) ,
                                           Integer.valueOf(AV55Forcolnum_to) ,
                                           AV59ForUltUti ,
                                           AV58Emprcod ,
                                           Byte.valueOf(AV56TipColCod) ,
                                           A396EmprCod ,
                                           Byte.valueOf(AV57TipColCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KZ6 */
      pr_default.execute(4, new Object[] {AV58Emprcod, Byte.valueOf(AV56TipColCod), Integer.valueOf(AV48Clicod), Integer.valueOf(AV49Clicod_to), AV50Forser, AV51Forser_to, AV52Forcolnom, AV53Forcolnom_to, Integer.valueOf(AV54Forcolnum), Integer.valueOf(AV55Forcolnum_to), AV59ForUltUti, AV59ForUltUti, Byte.valueOf(AV57TipColCod_to), lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV66Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV68Formulaciontinte_wcborradoformulasds_4_tfclinom, AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV70Formulaciontinte_wcborradoformulasds_6_tfforser, AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8KZ10 = false ;
         A831TipColCod = P08KZ6_A831TipColCod[0] ;
         A396EmprCod = P08KZ6_A396EmprCod[0] ;
         A496ForUltUti = P08KZ6_A496ForUltUti[0] ;
         n496ForUltUti = P08KZ6_n496ForUltUti[0] ;
         A486ForNumCol = P08KZ6_A486ForNumCol[0] ;
         A832TipColDsc = P08KZ6_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ6_n832TipColDsc[0] ;
         A483ForColNum = P08KZ6_A483ForColNum[0] ;
         A482ForColNom = P08KZ6_A482ForColNom[0] ;
         A5742ForSerDsc = P08KZ6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KZ6_n5742ForSerDsc[0] ;
         A494ForSer = P08KZ6_A494ForSer[0] ;
         A279CliNom = P08KZ6_A279CliNom[0] ;
         A252CliCod = P08KZ6_A252CliCod[0] ;
         A832TipColDsc = P08KZ6_A832TipColDsc[0] ;
         n832TipColDsc = P08KZ6_n832TipColDsc[0] ;
         A279CliNom = P08KZ6_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08KZ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08KZ6_A831TipColCod[0] == A831TipColCod ) )
         {
            brk8KZ10 = false ;
            A483ForColNum = P08KZ6_A483ForColNum[0] ;
            A482ForColNom = P08KZ6_A482ForColNom[0] ;
            A494ForSer = P08KZ6_A494ForSer[0] ;
            A252CliCod = P08KZ6_A252CliCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8KZ10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV34Option = A832TipColDsc ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            AV35Options.add(AV34Option, AV33InsertIndex);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8KZ10 )
         {
            brk8KZ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcborradoformulasgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = wcborradoformulasgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = wcborradoformulasgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60FilterFullText = "" ;
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
      AV28TFForUltUti = GXutil.nullDate() ;
      AV58Emprcod = "" ;
      AV50Forser = "" ;
      AV51Forser_to = "" ;
      AV52Forcolnom = "" ;
      AV53Forcolnom_to = "" ;
      AV59ForUltUti = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      AV68Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = "" ;
      AV70Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel = "" ;
      AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = "" ;
      AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = "" ;
      AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = "" ;
      AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      lV68Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      lV70Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08KZ2_A396EmprCod = new String[] {""} ;
      P08KZ2_A279CliNom = new String[] {""} ;
      P08KZ2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KZ2_n496ForUltUti = new boolean[] {false} ;
      P08KZ2_A486ForNumCol = new int[1] ;
      P08KZ2_A832TipColDsc = new String[] {""} ;
      P08KZ2_n832TipColDsc = new boolean[] {false} ;
      P08KZ2_A831TipColCod = new byte[1] ;
      P08KZ2_A483ForColNum = new int[1] ;
      P08KZ2_A482ForColNom = new String[] {""} ;
      P08KZ2_A5742ForSerDsc = new String[] {""} ;
      P08KZ2_n5742ForSerDsc = new boolean[] {false} ;
      P08KZ2_A494ForSer = new String[] {""} ;
      P08KZ2_A252CliCod = new int[1] ;
      AV34Option = "" ;
      P08KZ3_A396EmprCod = new String[] {""} ;
      P08KZ3_A494ForSer = new String[] {""} ;
      P08KZ3_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KZ3_n496ForUltUti = new boolean[] {false} ;
      P08KZ3_A486ForNumCol = new int[1] ;
      P08KZ3_A832TipColDsc = new String[] {""} ;
      P08KZ3_n832TipColDsc = new boolean[] {false} ;
      P08KZ3_A831TipColCod = new byte[1] ;
      P08KZ3_A483ForColNum = new int[1] ;
      P08KZ3_A482ForColNom = new String[] {""} ;
      P08KZ3_A5742ForSerDsc = new String[] {""} ;
      P08KZ3_n5742ForSerDsc = new boolean[] {false} ;
      P08KZ3_A279CliNom = new String[] {""} ;
      P08KZ3_A252CliCod = new int[1] ;
      P08KZ4_A396EmprCod = new String[] {""} ;
      P08KZ4_A5742ForSerDsc = new String[] {""} ;
      P08KZ4_n5742ForSerDsc = new boolean[] {false} ;
      P08KZ4_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KZ4_n496ForUltUti = new boolean[] {false} ;
      P08KZ4_A486ForNumCol = new int[1] ;
      P08KZ4_A832TipColDsc = new String[] {""} ;
      P08KZ4_n832TipColDsc = new boolean[] {false} ;
      P08KZ4_A831TipColCod = new byte[1] ;
      P08KZ4_A483ForColNum = new int[1] ;
      P08KZ4_A482ForColNom = new String[] {""} ;
      P08KZ4_A494ForSer = new String[] {""} ;
      P08KZ4_A279CliNom = new String[] {""} ;
      P08KZ4_A252CliCod = new int[1] ;
      P08KZ5_A396EmprCod = new String[] {""} ;
      P08KZ5_A482ForColNom = new String[] {""} ;
      P08KZ5_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KZ5_n496ForUltUti = new boolean[] {false} ;
      P08KZ5_A486ForNumCol = new int[1] ;
      P08KZ5_A832TipColDsc = new String[] {""} ;
      P08KZ5_n832TipColDsc = new boolean[] {false} ;
      P08KZ5_A831TipColCod = new byte[1] ;
      P08KZ5_A483ForColNum = new int[1] ;
      P08KZ5_A5742ForSerDsc = new String[] {""} ;
      P08KZ5_n5742ForSerDsc = new boolean[] {false} ;
      P08KZ5_A494ForSer = new String[] {""} ;
      P08KZ5_A279CliNom = new String[] {""} ;
      P08KZ5_A252CliCod = new int[1] ;
      P08KZ6_A831TipColCod = new byte[1] ;
      P08KZ6_A396EmprCod = new String[] {""} ;
      P08KZ6_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KZ6_n496ForUltUti = new boolean[] {false} ;
      P08KZ6_A486ForNumCol = new int[1] ;
      P08KZ6_A832TipColDsc = new String[] {""} ;
      P08KZ6_n832TipColDsc = new boolean[] {false} ;
      P08KZ6_A483ForColNum = new int[1] ;
      P08KZ6_A482ForColNom = new String[] {""} ;
      P08KZ6_A5742ForSerDsc = new String[] {""} ;
      P08KZ6_n5742ForSerDsc = new boolean[] {false} ;
      P08KZ6_A494ForSer = new String[] {""} ;
      P08KZ6_A279CliNom = new String[] {""} ;
      P08KZ6_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcborradoformulasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08KZ2_A396EmprCod, P08KZ2_A279CliNom, P08KZ2_A496ForUltUti, P08KZ2_n496ForUltUti, P08KZ2_A486ForNumCol, P08KZ2_A832TipColDsc, P08KZ2_n832TipColDsc, P08KZ2_A831TipColCod, P08KZ2_A483ForColNum, P08KZ2_A482ForColNom,
            P08KZ2_A5742ForSerDsc, P08KZ2_n5742ForSerDsc, P08KZ2_A494ForSer, P08KZ2_A252CliCod
            }
            , new Object[] {
            P08KZ3_A396EmprCod, P08KZ3_A494ForSer, P08KZ3_A496ForUltUti, P08KZ3_n496ForUltUti, P08KZ3_A486ForNumCol, P08KZ3_A832TipColDsc, P08KZ3_n832TipColDsc, P08KZ3_A831TipColCod, P08KZ3_A483ForColNum, P08KZ3_A482ForColNom,
            P08KZ3_A5742ForSerDsc, P08KZ3_n5742ForSerDsc, P08KZ3_A279CliNom, P08KZ3_A252CliCod
            }
            , new Object[] {
            P08KZ4_A396EmprCod, P08KZ4_A5742ForSerDsc, P08KZ4_n5742ForSerDsc, P08KZ4_A496ForUltUti, P08KZ4_n496ForUltUti, P08KZ4_A486ForNumCol, P08KZ4_A832TipColDsc, P08KZ4_n832TipColDsc, P08KZ4_A831TipColCod, P08KZ4_A483ForColNum,
            P08KZ4_A482ForColNom, P08KZ4_A494ForSer, P08KZ4_A279CliNom, P08KZ4_A252CliCod
            }
            , new Object[] {
            P08KZ5_A396EmprCod, P08KZ5_A482ForColNom, P08KZ5_A496ForUltUti, P08KZ5_n496ForUltUti, P08KZ5_A486ForNumCol, P08KZ5_A832TipColDsc, P08KZ5_n832TipColDsc, P08KZ5_A831TipColCod, P08KZ5_A483ForColNum, P08KZ5_A5742ForSerDsc,
            P08KZ5_n5742ForSerDsc, P08KZ5_A494ForSer, P08KZ5_A279CliNom, P08KZ5_A252CliCod
            }
            , new Object[] {
            P08KZ6_A831TipColCod, P08KZ6_A396EmprCod, P08KZ6_A496ForUltUti, P08KZ6_n496ForUltUti, P08KZ6_A486ForNumCol, P08KZ6_A832TipColDsc, P08KZ6_n832TipColDsc, P08KZ6_A483ForColNum, P08KZ6_A482ForColNom, P08KZ6_A5742ForSerDsc,
            P08KZ6_n5742ForSerDsc, P08KZ6_A494ForSer, P08KZ6_A279CliNom, P08KZ6_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte AV56TipColCod ;
   private byte AV57TipColCod_to ;
   private byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ;
   private byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV63GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFForColNum ;
   private int AV21TFForColNum_To ;
   private int AV26TFForNumCol ;
   private int AV27TFForNumCol_To ;
   private int AV48Clicod ;
   private int AV49Clicod_to ;
   private int AV54Forcolnum ;
   private int AV55Forcolnum_to ;
   private int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ;
   private int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ;
   private int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ;
   private int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ;
   private int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ;
   private int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV33InsertIndex ;
   private long AV42count ;
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
   private String AV58Emprcod ;
   private String AV50Forser ;
   private String AV51Forser_to ;
   private String AV52Forcolnom ;
   private String AV53Forcolnom_to ;
   private String A279CliNom ;
   private String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ;
   private String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ;
   private String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ;
   private String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ;
   private String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV68Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String lV70Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String lV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String lV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String lV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A396EmprCod ;
   private java.util.Date AV28TFForUltUti ;
   private java.util.Date AV59ForUltUti ;
   private java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ;
   private java.util.Date A496ForUltUti ;
   private boolean returnInSub ;
   private boolean brk8KZ2 ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private boolean brk8KZ4 ;
   private boolean brk8KZ6 ;
   private boolean brk8KZ8 ;
   private boolean brk8KZ10 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV60FilterFullText ;
   private String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String lV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08KZ2_A396EmprCod ;
   private String[] P08KZ2_A279CliNom ;
   private java.util.Date[] P08KZ2_A496ForUltUti ;
   private boolean[] P08KZ2_n496ForUltUti ;
   private int[] P08KZ2_A486ForNumCol ;
   private String[] P08KZ2_A832TipColDsc ;
   private boolean[] P08KZ2_n832TipColDsc ;
   private byte[] P08KZ2_A831TipColCod ;
   private int[] P08KZ2_A483ForColNum ;
   private String[] P08KZ2_A482ForColNom ;
   private String[] P08KZ2_A5742ForSerDsc ;
   private boolean[] P08KZ2_n5742ForSerDsc ;
   private String[] P08KZ2_A494ForSer ;
   private int[] P08KZ2_A252CliCod ;
   private String[] P08KZ3_A396EmprCod ;
   private String[] P08KZ3_A494ForSer ;
   private java.util.Date[] P08KZ3_A496ForUltUti ;
   private boolean[] P08KZ3_n496ForUltUti ;
   private int[] P08KZ3_A486ForNumCol ;
   private String[] P08KZ3_A832TipColDsc ;
   private boolean[] P08KZ3_n832TipColDsc ;
   private byte[] P08KZ3_A831TipColCod ;
   private int[] P08KZ3_A483ForColNum ;
   private String[] P08KZ3_A482ForColNom ;
   private String[] P08KZ3_A5742ForSerDsc ;
   private boolean[] P08KZ3_n5742ForSerDsc ;
   private String[] P08KZ3_A279CliNom ;
   private int[] P08KZ3_A252CliCod ;
   private String[] P08KZ4_A396EmprCod ;
   private String[] P08KZ4_A5742ForSerDsc ;
   private boolean[] P08KZ4_n5742ForSerDsc ;
   private java.util.Date[] P08KZ4_A496ForUltUti ;
   private boolean[] P08KZ4_n496ForUltUti ;
   private int[] P08KZ4_A486ForNumCol ;
   private String[] P08KZ4_A832TipColDsc ;
   private boolean[] P08KZ4_n832TipColDsc ;
   private byte[] P08KZ4_A831TipColCod ;
   private int[] P08KZ4_A483ForColNum ;
   private String[] P08KZ4_A482ForColNom ;
   private String[] P08KZ4_A494ForSer ;
   private String[] P08KZ4_A279CliNom ;
   private int[] P08KZ4_A252CliCod ;
   private String[] P08KZ5_A396EmprCod ;
   private String[] P08KZ5_A482ForColNom ;
   private java.util.Date[] P08KZ5_A496ForUltUti ;
   private boolean[] P08KZ5_n496ForUltUti ;
   private int[] P08KZ5_A486ForNumCol ;
   private String[] P08KZ5_A832TipColDsc ;
   private boolean[] P08KZ5_n832TipColDsc ;
   private byte[] P08KZ5_A831TipColCod ;
   private int[] P08KZ5_A483ForColNum ;
   private String[] P08KZ5_A5742ForSerDsc ;
   private boolean[] P08KZ5_n5742ForSerDsc ;
   private String[] P08KZ5_A494ForSer ;
   private String[] P08KZ5_A279CliNom ;
   private int[] P08KZ5_A252CliCod ;
   private byte[] P08KZ6_A831TipColCod ;
   private String[] P08KZ6_A396EmprCod ;
   private java.util.Date[] P08KZ6_A496ForUltUti ;
   private boolean[] P08KZ6_n496ForUltUti ;
   private int[] P08KZ6_A486ForNumCol ;
   private String[] P08KZ6_A832TipColDsc ;
   private boolean[] P08KZ6_n832TipColDsc ;
   private int[] P08KZ6_A483ForColNum ;
   private String[] P08KZ6_A482ForColNom ;
   private String[] P08KZ6_A5742ForSerDsc ;
   private boolean[] P08KZ6_n5742ForSerDsc ;
   private String[] P08KZ6_A494ForSer ;
   private String[] P08KZ6_A279CliNom ;
   private int[] P08KZ6_A252CliCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class wcborradoformulasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          int AV48Clicod ,
                                          int AV49Clicod_to ,
                                          String AV50Forser ,
                                          String AV51Forser_to ,
                                          String AV52Forcolnom ,
                                          String AV53Forcolnom_to ,
                                          int AV54Forcolnum ,
                                          int AV55Forcolnum_to ,
                                          byte AV56TipColCod ,
                                          byte AV57TipColCod_to ,
                                          java.util.Date AV59ForUltUti ,
                                          String A396EmprCod ,
                                          String AV58Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ForSer >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom >= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum >= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
         GXv_int2[20] = (byte)(1) ;
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08KZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          int AV48Clicod ,
                                          int AV49Clicod_to ,
                                          String AV52Forcolnom ,
                                          String AV53Forcolnom_to ,
                                          int AV54Forcolnum ,
                                          int AV55Forcolnum_to ,
                                          byte AV56TipColCod ,
                                          byte AV57TipColCod_to ,
                                          java.util.Date AV59ForUltUti ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          String AV50Forser ,
                                          String AV51Forser_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[41];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSer, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.ForSer >= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ForColNom >= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum >= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
         GXv_int4[18] = (byte)(1) ;
         GXv_int4[19] = (byte)(1) ;
         GXv_int4[20] = (byte)(1) ;
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08KZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          int AV48Clicod ,
                                          int AV49Clicod_to ,
                                          String AV50Forser ,
                                          String AV51Forser_to ,
                                          String AV52Forcolnom ,
                                          String AV53Forcolnom_to ,
                                          int AV54Forcolnum ,
                                          int AV55Forcolnum_to ,
                                          byte AV56TipColCod ,
                                          byte AV57TipColCod_to ,
                                          java.util.Date AV59ForUltUti ,
                                          String A396EmprCod ,
                                          String AV58Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSerDsc, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ForSer >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom >= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum >= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
         GXv_int6[20] = (byte)(1) ;
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08KZ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          int AV48Clicod ,
                                          int AV49Clicod_to ,
                                          String AV50Forser ,
                                          String AV51Forser_to ,
                                          int AV54Forcolnum ,
                                          int AV55Forcolnum_to ,
                                          byte AV56TipColCod ,
                                          byte AV57TipColCod_to ,
                                          java.util.Date AV59ForUltUti ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          String AV52Forcolnom ,
                                          String AV53Forcolnom_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNom, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.ForColNom >= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ForSer >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNum >= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
         GXv_int8[20] = (byte)(1) ;
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08KZ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV66Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV68Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV70Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          int AV48Clicod ,
                                          int AV49Clicod_to ,
                                          String AV50Forser ,
                                          String AV51Forser_to ,
                                          String AV52Forcolnom ,
                                          String AV53Forcolnom_to ,
                                          int AV54Forcolnum ,
                                          int AV55Forcolnum_to ,
                                          java.util.Date AV59ForUltUti ,
                                          String AV58Emprcod ,
                                          byte AV56TipColCod ,
                                          String A396EmprCod ,
                                          byte AV57TipColCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[41];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ForSer >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom >= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum >= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
         GXv_int10[15] = (byte)(1) ;
         GXv_int10[16] = (byte)(1) ;
         GXv_int10[17] = (byte)(1) ;
         GXv_int10[18] = (byte)(1) ;
         GXv_int10[19] = (byte)(1) ;
         GXv_int10[20] = (byte)(1) ;
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
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
                  return conditional_P08KZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 1 :
                  return conditional_P08KZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P08KZ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 3 :
                  return conditional_P08KZ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 4 :
                  return conditional_P08KZ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KZ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08KZ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
      }
   }

}

