package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwwkp89getfilterdata extends GXProcedure
{
   public wcwwkp89getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwwkp89getfilterdata.class ), "" );
   }

   public wcwwkp89getfilterdata( int remoteHandle ,
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
      wcwwkp89getfilterdata.this.aP5 = new String[] {""};
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
      wcwwkp89getfilterdata.this.AV24DDOName = aP0;
      wcwwkp89getfilterdata.this.AV22SearchTxt = aP1;
      wcwwkp89getfilterdata.this.AV23SearchTxtTo = aP2;
      wcwwkp89getfilterdata.this.aP3 = aP3;
      wcwwkp89getfilterdata.this.aP4 = aP4;
      wcwwkp89getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_TIPPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDREFPRV") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDREFPRVOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDUBICACION") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDUBICACIONOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDLOTEOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("WCWWkp89GridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWWkp89GridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("WCWWkp89GridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV14TFTipPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV15TFTipPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV16TFPrdRefPrv = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV17TFPrdRefPrv_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION") == 0 )
         {
            AV18TFPrdUbicacion = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUBICACION_SEL") == 0 )
         {
            AV19TFPrdUbicacion_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV20TFPrdStkMinU = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdStkMinU_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV44TFPrdPreAct = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdPreAct_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV46TFPrvNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPrvNum_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV48TFPrvNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV49TFPrvNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE") == 0 )
         {
            AV51TFPrdLote = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLOTE_SEL") == 0 )
         {
            AV52TFPrdLote_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV55TFValCod = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFValCod_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV42Prdnum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV43Prdnum_to = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODFROM") == 0 )
         {
            AV53ValCodfrom = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCODTO") == 0 )
         {
            AV54ValCodto = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SELECCION") == 0 )
         {
            AV50Seleccion = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV22SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV41Emprcod ,
                                           AV42Prdnum ,
                                           A396EmprCod ,
                                           AV43Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB2 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV42Prdnum, AV43Prdnum_to, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8WB2 = false ;
         A6301TipPrdCod = P08WB2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB2_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB2_A396EmprCod[0] ;
         A719PrdNum = P08WB2_A719PrdNum[0] ;
         A856ValCod = P08WB2_A856ValCod[0] ;
         A10881PrdLote = P08WB2_A10881PrdLote[0] ;
         A794PrvNom = P08WB2_A794PrvNom[0] ;
         n794PrvNom = P08WB2_n794PrvNom[0] ;
         A795PrvNum = P08WB2_A795PrvNum[0] ;
         A724PrdPreAct = P08WB2_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB2_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB2_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WB2_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB2_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB2_A718PrdNom[0] ;
         A6302TipPrdDsc = P08WB2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB2_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB2_A794PrvNom[0] ;
         n794PrvNom = P08WB2_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08WB2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08WB2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8WB2 = false ;
            AV34count = (long)(AV34count+1) ;
            brk8WB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV26Option = A719PrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB2 )
         {
            brk8WB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV22SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB3 */
      pr_default.execute(1, new Object[] {AV41Emprcod, AV42Prdnum, AV43Prdnum_to, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8WB4 = false ;
         A6301TipPrdCod = P08WB3_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB3_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB3_A396EmprCod[0] ;
         A718PrdNom = P08WB3_A718PrdNom[0] ;
         A856ValCod = P08WB3_A856ValCod[0] ;
         A10881PrdLote = P08WB3_A10881PrdLote[0] ;
         A794PrvNom = P08WB3_A794PrvNom[0] ;
         n794PrvNom = P08WB3_n794PrvNom[0] ;
         A795PrvNum = P08WB3_A795PrvNum[0] ;
         A724PrdPreAct = P08WB3_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB3_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB3_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WB3_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB3_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB3_n6302TipPrdDsc[0] ;
         A719PrdNum = P08WB3_A719PrdNum[0] ;
         A6302TipPrdDsc = P08WB3_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB3_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB3_A794PrvNom[0] ;
         n794PrvNom = P08WB3_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08WB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08WB3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8WB4 = false ;
            A719PrdNum = P08WB3_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV26Option = A718PrdNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB4 )
         {
            brk8WB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADTIPPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFTipPrdDsc = AV22SearchTxt ;
      AV15TFTipPrdDsc_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB4 */
      pr_default.execute(2, new Object[] {AV41Emprcod, AV42Prdnum, AV43Prdnum_to, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8WB6 = false ;
         A6301TipPrdCod = P08WB4_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB4_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB4_A396EmprCod[0] ;
         A856ValCod = P08WB4_A856ValCod[0] ;
         A10881PrdLote = P08WB4_A10881PrdLote[0] ;
         A794PrvNom = P08WB4_A794PrvNom[0] ;
         n794PrvNom = P08WB4_n794PrvNom[0] ;
         A795PrvNum = P08WB4_A795PrvNum[0] ;
         A724PrdPreAct = P08WB4_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB4_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB4_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WB4_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB4_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB4_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB4_A718PrdNom[0] ;
         A719PrdNum = P08WB4_A719PrdNum[0] ;
         A6302TipPrdDsc = P08WB4_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB4_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB4_A794PrvNom[0] ;
         n794PrvNom = P08WB4_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08WB4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WB4_A6301TipPrdCod[0] == A6301TipPrdCod ) )
         {
            brk8WB6 = false ;
            A719PrdNum = P08WB4_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6302TipPrdDsc)==0) )
         {
            AV26Option = A6302TipPrdDsc ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB6 )
         {
            brk8WB6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDREFPRVOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdRefPrv = AV22SearchTxt ;
      AV17TFPrdRefPrv_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           A396EmprCod ,
                                           AV41Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB5 */
      pr_default.execute(3, new Object[] {AV42Prdnum, AV43Prdnum_to, AV41Emprcod, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8WB8 = false ;
         A6301TipPrdCod = P08WB5_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB5_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB5_A396EmprCod[0] ;
         A728PrdRefPrv = P08WB5_A728PrdRefPrv[0] ;
         A856ValCod = P08WB5_A856ValCod[0] ;
         A10881PrdLote = P08WB5_A10881PrdLote[0] ;
         A794PrvNom = P08WB5_A794PrvNom[0] ;
         n794PrvNom = P08WB5_n794PrvNom[0] ;
         A795PrvNum = P08WB5_A795PrvNum[0] ;
         A724PrdPreAct = P08WB5_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB5_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB5_A13457PrdUbicaci[0] ;
         A6302TipPrdDsc = P08WB5_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB5_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB5_A718PrdNom[0] ;
         A719PrdNum = P08WB5_A719PrdNum[0] ;
         A6302TipPrdDsc = P08WB5_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB5_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB5_A794PrvNom[0] ;
         n794PrvNom = P08WB5_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08WB5_A728PrdRefPrv[0], A728PrdRefPrv) == 0 ) )
         {
            brk8WB8 = false ;
            A396EmprCod = P08WB5_A396EmprCod[0] ;
            A719PrdNum = P08WB5_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A728PrdRefPrv)==0) )
         {
            AV26Option = A728PrdRefPrv ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB8 )
         {
            brk8WB8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRDUBICACIONOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrdUbicacion = AV22SearchTxt ;
      AV19TFPrdUbicacion_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           A396EmprCod ,
                                           AV41Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB6 */
      pr_default.execute(4, new Object[] {AV42Prdnum, AV43Prdnum_to, AV41Emprcod, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8WB10 = false ;
         A6301TipPrdCod = P08WB6_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB6_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB6_A396EmprCod[0] ;
         A13457PrdUbicaci = P08WB6_A13457PrdUbicaci[0] ;
         A856ValCod = P08WB6_A856ValCod[0] ;
         A10881PrdLote = P08WB6_A10881PrdLote[0] ;
         A794PrvNom = P08WB6_A794PrvNom[0] ;
         n794PrvNom = P08WB6_n794PrvNom[0] ;
         A795PrvNum = P08WB6_A795PrvNum[0] ;
         A724PrdPreAct = P08WB6_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB6_A732PrdStkMinU[0] ;
         A728PrdRefPrv = P08WB6_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB6_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB6_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB6_A718PrdNom[0] ;
         A719PrdNum = P08WB6_A719PrdNum[0] ;
         A6302TipPrdDsc = P08WB6_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB6_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB6_A794PrvNom[0] ;
         n794PrvNom = P08WB6_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08WB6_A13457PrdUbicaci[0], A13457PrdUbicaci) == 0 ) )
         {
            brk8WB10 = false ;
            A396EmprCod = P08WB6_A396EmprCod[0] ;
            A719PrdNum = P08WB6_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A13457PrdUbicaci)==0) )
         {
            AV26Option = A13457PrdUbicaci ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB10 )
         {
            brk8WB10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV48TFPrvNom = AV22SearchTxt ;
      AV49TFPrvNom_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB7 */
      pr_default.execute(5, new Object[] {AV41Emprcod, AV42Prdnum, AV43Prdnum_to, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8WB12 = false ;
         A6301TipPrdCod = P08WB7_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB7_n6301TipPrdCod[0] ;
         A795PrvNum = P08WB7_A795PrvNum[0] ;
         A396EmprCod = P08WB7_A396EmprCod[0] ;
         A856ValCod = P08WB7_A856ValCod[0] ;
         A10881PrdLote = P08WB7_A10881PrdLote[0] ;
         A794PrvNom = P08WB7_A794PrvNom[0] ;
         n794PrvNom = P08WB7_n794PrvNom[0] ;
         A724PrdPreAct = P08WB7_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB7_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB7_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WB7_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB7_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB7_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB7_A718PrdNom[0] ;
         A719PrdNum = P08WB7_A719PrdNum[0] ;
         A794PrvNom = P08WB7_A794PrvNom[0] ;
         n794PrvNom = P08WB7_n794PrvNom[0] ;
         A6302TipPrdDsc = P08WB7_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB7_n6302TipPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08WB7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WB7_A795PrvNum[0] == A795PrvNum ) )
         {
            brk8WB12 = false ;
            A719PrdNum = P08WB7_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV26Option = A794PrvNom ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB12 )
         {
            brk8WB12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRDLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV51TFPrdLote = AV22SearchTxt ;
      AV52TFPrdLote_Sel = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = AV40FilterFullText ;
      AV62Wcwwkp89ds_2_tfprdnum = AV10TFPrdNum ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV64Wcwwkp89ds_4_tfprdnom = AV12TFPrdNom ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV66Wcwwkp89ds_6_tftipprddsc = AV14TFTipPrdDsc ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = AV15TFTipPrdDsc_Sel ;
      AV68Wcwwkp89ds_8_tfprdrefprv = AV16TFPrdRefPrv ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = AV17TFPrdRefPrv_Sel ;
      AV70Wcwwkp89ds_10_tfprdubicacion = AV18TFPrdUbicacion ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = AV19TFPrdUbicacion_Sel ;
      AV72Wcwwkp89ds_12_tfprdstkminu = AV20TFPrdStkMinU ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = AV21TFPrdStkMinU_To ;
      AV74Wcwwkp89ds_14_tfprdpreact = AV44TFPrdPreAct ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = AV45TFPrdPreAct_To ;
      AV76Wcwwkp89ds_16_tfprvnum = AV46TFPrvNum ;
      AV77Wcwwkp89ds_17_tfprvnum_to = AV47TFPrvNum_To ;
      AV78Wcwwkp89ds_18_tfprvnom = AV48TFPrvNom ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = AV49TFPrvNom_Sel ;
      AV80Wcwwkp89ds_20_tfprdlote = AV51TFPrdLote ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = AV52TFPrdLote_Sel ;
      AV82Wcwwkp89ds_22_tfvalcod = AV55TFValCod ;
      AV83Wcwwkp89ds_23_tfvalcod_to = AV56TFValCod_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV61Wcwwkp89ds_1_filterfulltext ,
                                           AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                           AV62Wcwwkp89ds_2_tfprdnum ,
                                           AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                           AV64Wcwwkp89ds_4_tfprdnom ,
                                           AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                           AV66Wcwwkp89ds_6_tftipprddsc ,
                                           AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                           AV68Wcwwkp89ds_8_tfprdrefprv ,
                                           AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                           AV70Wcwwkp89ds_10_tfprdubicacion ,
                                           AV72Wcwwkp89ds_12_tfprdstkminu ,
                                           AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                           AV74Wcwwkp89ds_14_tfprdpreact ,
                                           AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                           Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum) ,
                                           Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to) ,
                                           AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                           AV78Wcwwkp89ds_18_tfprvnom ,
                                           AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                           AV80Wcwwkp89ds_20_tfprdlote ,
                                           Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod) ,
                                           Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to) ,
                                           Short.valueOf(AV53ValCodfrom) ,
                                           Short.valueOf(AV54ValCodto) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A6302TipPrdDsc ,
                                           A728PrdRefPrv ,
                                           A13457PrdUbicaci ,
                                           A732PrdStkMinU ,
                                           A724PrdPreAct ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A10881PrdLote ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Prdnum ,
                                           AV43Prdnum_to ,
                                           A396EmprCod ,
                                           AV41Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV61Wcwwkp89ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcwwkp89ds_1_filterfulltext), "%", "") ;
      lV62Wcwwkp89ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Wcwwkp89ds_2_tfprdnum), 6, "%") ;
      lV64Wcwwkp89ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Wcwwkp89ds_4_tfprdnom), 26, "%") ;
      lV66Wcwwkp89ds_6_tftipprddsc = GXutil.padr( GXutil.rtrim( AV66Wcwwkp89ds_6_tftipprddsc), 40, "%") ;
      lV68Wcwwkp89ds_8_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV68Wcwwkp89ds_8_tfprdrefprv), 30, "%") ;
      lV70Wcwwkp89ds_10_tfprdubicacion = GXutil.padr( GXutil.rtrim( AV70Wcwwkp89ds_10_tfprdubicacion), 20, "%") ;
      lV78Wcwwkp89ds_18_tfprvnom = GXutil.padr( GXutil.rtrim( AV78Wcwwkp89ds_18_tfprvnom), 30, "%") ;
      lV80Wcwwkp89ds_20_tfprdlote = GXutil.padr( GXutil.rtrim( AV80Wcwwkp89ds_20_tfprdlote), 26, "%") ;
      /* Using cursor P08WB8 */
      pr_default.execute(6, new Object[] {AV42Prdnum, AV43Prdnum_to, AV41Emprcod, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV61Wcwwkp89ds_1_filterfulltext, lV62Wcwwkp89ds_2_tfprdnum, AV63Wcwwkp89ds_3_tfprdnum_sel, lV64Wcwwkp89ds_4_tfprdnom, AV65Wcwwkp89ds_5_tfprdnom_sel, lV66Wcwwkp89ds_6_tftipprddsc, AV67Wcwwkp89ds_7_tftipprddsc_sel, lV68Wcwwkp89ds_8_tfprdrefprv, AV69Wcwwkp89ds_9_tfprdrefprv_sel, lV70Wcwwkp89ds_10_tfprdubicacion, AV71Wcwwkp89ds_11_tfprdubicacion_sel, AV72Wcwwkp89ds_12_tfprdstkminu, AV73Wcwwkp89ds_13_tfprdstkminu_to, AV74Wcwwkp89ds_14_tfprdpreact, AV75Wcwwkp89ds_15_tfprdpreact_to, Integer.valueOf(AV76Wcwwkp89ds_16_tfprvnum), Integer.valueOf(AV77Wcwwkp89ds_17_tfprvnum_to), lV78Wcwwkp89ds_18_tfprvnom, AV79Wcwwkp89ds_19_tfprvnom_sel, lV80Wcwwkp89ds_20_tfprdlote, AV81Wcwwkp89ds_21_tfprdlote_sel, Byte.valueOf(AV82Wcwwkp89ds_22_tfvalcod), Byte.valueOf(AV83Wcwwkp89ds_23_tfvalcod_to), Short.valueOf(AV53ValCodfrom), Short.valueOf(AV54ValCodto)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8WB14 = false ;
         A6301TipPrdCod = P08WB8_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P08WB8_n6301TipPrdCod[0] ;
         A396EmprCod = P08WB8_A396EmprCod[0] ;
         A10881PrdLote = P08WB8_A10881PrdLote[0] ;
         A856ValCod = P08WB8_A856ValCod[0] ;
         A794PrvNom = P08WB8_A794PrvNom[0] ;
         n794PrvNom = P08WB8_n794PrvNom[0] ;
         A795PrvNum = P08WB8_A795PrvNum[0] ;
         A724PrdPreAct = P08WB8_A724PrdPreAct[0] ;
         A732PrdStkMinU = P08WB8_A732PrdStkMinU[0] ;
         A13457PrdUbicaci = P08WB8_A13457PrdUbicaci[0] ;
         A728PrdRefPrv = P08WB8_A728PrdRefPrv[0] ;
         A6302TipPrdDsc = P08WB8_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB8_n6302TipPrdDsc[0] ;
         A718PrdNom = P08WB8_A718PrdNom[0] ;
         A719PrdNum = P08WB8_A719PrdNum[0] ;
         A6302TipPrdDsc = P08WB8_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08WB8_n6302TipPrdDsc[0] ;
         A794PrvNom = P08WB8_A794PrvNom[0] ;
         n794PrvNom = P08WB8_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08WB8_A10881PrdLote[0], A10881PrdLote) == 0 ) )
         {
            brk8WB14 = false ;
            A396EmprCod = P08WB8_A396EmprCod[0] ;
            A719PrdNum = P08WB8_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8WB14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A10881PrdLote)==0) )
         {
            AV26Option = A10881PrdLote ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WB14 )
         {
            brk8WB14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwwkp89getfilterdata.this.AV28OptionsJson;
      this.aP4[0] = wcwwkp89getfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = wcwwkp89getfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFTipPrdDsc = "" ;
      AV15TFTipPrdDsc_Sel = "" ;
      AV16TFPrdRefPrv = "" ;
      AV17TFPrdRefPrv_Sel = "" ;
      AV18TFPrdUbicacion = "" ;
      AV19TFPrdUbicacion_Sel = "" ;
      AV20TFPrdStkMinU = DecimalUtil.ZERO ;
      AV21TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV44TFPrdPreAct = DecimalUtil.ZERO ;
      AV45TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV48TFPrvNom = "" ;
      AV49TFPrvNom_Sel = "" ;
      AV51TFPrdLote = "" ;
      AV52TFPrdLote_Sel = "" ;
      AV41Emprcod = "" ;
      AV42Prdnum = "" ;
      AV43Prdnum_to = "" ;
      A719PrdNum = "" ;
      AV61Wcwwkp89ds_1_filterfulltext = "" ;
      AV62Wcwwkp89ds_2_tfprdnum = "" ;
      AV63Wcwwkp89ds_3_tfprdnum_sel = "" ;
      AV64Wcwwkp89ds_4_tfprdnom = "" ;
      AV65Wcwwkp89ds_5_tfprdnom_sel = "" ;
      AV66Wcwwkp89ds_6_tftipprddsc = "" ;
      AV67Wcwwkp89ds_7_tftipprddsc_sel = "" ;
      AV68Wcwwkp89ds_8_tfprdrefprv = "" ;
      AV69Wcwwkp89ds_9_tfprdrefprv_sel = "" ;
      AV70Wcwwkp89ds_10_tfprdubicacion = "" ;
      AV71Wcwwkp89ds_11_tfprdubicacion_sel = "" ;
      AV72Wcwwkp89ds_12_tfprdstkminu = DecimalUtil.ZERO ;
      AV73Wcwwkp89ds_13_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV74Wcwwkp89ds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV75Wcwwkp89ds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV78Wcwwkp89ds_18_tfprvnom = "" ;
      AV79Wcwwkp89ds_19_tfprvnom_sel = "" ;
      AV80Wcwwkp89ds_20_tfprdlote = "" ;
      AV81Wcwwkp89ds_21_tfprdlote_sel = "" ;
      scmdbuf = "" ;
      lV61Wcwwkp89ds_1_filterfulltext = "" ;
      lV62Wcwwkp89ds_2_tfprdnum = "" ;
      lV64Wcwwkp89ds_4_tfprdnom = "" ;
      lV66Wcwwkp89ds_6_tftipprddsc = "" ;
      lV68Wcwwkp89ds_8_tfprdrefprv = "" ;
      lV70Wcwwkp89ds_10_tfprdubicacion = "" ;
      lV78Wcwwkp89ds_18_tfprvnom = "" ;
      lV80Wcwwkp89ds_20_tfprdlote = "" ;
      A718PrdNom = "" ;
      A6302TipPrdDsc = "" ;
      A728PrdRefPrv = "" ;
      A13457PrdUbicaci = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A10881PrdLote = "" ;
      A396EmprCod = "" ;
      P08WB2_A6301TipPrdCod = new short[1] ;
      P08WB2_n6301TipPrdCod = new boolean[] {false} ;
      P08WB2_A396EmprCod = new String[] {""} ;
      P08WB2_A719PrdNum = new String[] {""} ;
      P08WB2_A856ValCod = new byte[1] ;
      P08WB2_A10881PrdLote = new String[] {""} ;
      P08WB2_A794PrvNom = new String[] {""} ;
      P08WB2_n794PrvNom = new boolean[] {false} ;
      P08WB2_A795PrvNum = new int[1] ;
      P08WB2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB2_A13457PrdUbicaci = new String[] {""} ;
      P08WB2_A728PrdRefPrv = new String[] {""} ;
      P08WB2_A6302TipPrdDsc = new String[] {""} ;
      P08WB2_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB2_A718PrdNom = new String[] {""} ;
      AV26Option = "" ;
      P08WB3_A6301TipPrdCod = new short[1] ;
      P08WB3_n6301TipPrdCod = new boolean[] {false} ;
      P08WB3_A396EmprCod = new String[] {""} ;
      P08WB3_A718PrdNom = new String[] {""} ;
      P08WB3_A856ValCod = new byte[1] ;
      P08WB3_A10881PrdLote = new String[] {""} ;
      P08WB3_A794PrvNom = new String[] {""} ;
      P08WB3_n794PrvNom = new boolean[] {false} ;
      P08WB3_A795PrvNum = new int[1] ;
      P08WB3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB3_A13457PrdUbicaci = new String[] {""} ;
      P08WB3_A728PrdRefPrv = new String[] {""} ;
      P08WB3_A6302TipPrdDsc = new String[] {""} ;
      P08WB3_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB3_A719PrdNum = new String[] {""} ;
      P08WB4_A6301TipPrdCod = new short[1] ;
      P08WB4_n6301TipPrdCod = new boolean[] {false} ;
      P08WB4_A396EmprCod = new String[] {""} ;
      P08WB4_A856ValCod = new byte[1] ;
      P08WB4_A10881PrdLote = new String[] {""} ;
      P08WB4_A794PrvNom = new String[] {""} ;
      P08WB4_n794PrvNom = new boolean[] {false} ;
      P08WB4_A795PrvNum = new int[1] ;
      P08WB4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB4_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB4_A13457PrdUbicaci = new String[] {""} ;
      P08WB4_A728PrdRefPrv = new String[] {""} ;
      P08WB4_A6302TipPrdDsc = new String[] {""} ;
      P08WB4_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB4_A718PrdNom = new String[] {""} ;
      P08WB4_A719PrdNum = new String[] {""} ;
      P08WB5_A6301TipPrdCod = new short[1] ;
      P08WB5_n6301TipPrdCod = new boolean[] {false} ;
      P08WB5_A396EmprCod = new String[] {""} ;
      P08WB5_A728PrdRefPrv = new String[] {""} ;
      P08WB5_A856ValCod = new byte[1] ;
      P08WB5_A10881PrdLote = new String[] {""} ;
      P08WB5_A794PrvNom = new String[] {""} ;
      P08WB5_n794PrvNom = new boolean[] {false} ;
      P08WB5_A795PrvNum = new int[1] ;
      P08WB5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB5_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB5_A13457PrdUbicaci = new String[] {""} ;
      P08WB5_A6302TipPrdDsc = new String[] {""} ;
      P08WB5_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB5_A718PrdNom = new String[] {""} ;
      P08WB5_A719PrdNum = new String[] {""} ;
      P08WB6_A6301TipPrdCod = new short[1] ;
      P08WB6_n6301TipPrdCod = new boolean[] {false} ;
      P08WB6_A396EmprCod = new String[] {""} ;
      P08WB6_A13457PrdUbicaci = new String[] {""} ;
      P08WB6_A856ValCod = new byte[1] ;
      P08WB6_A10881PrdLote = new String[] {""} ;
      P08WB6_A794PrvNom = new String[] {""} ;
      P08WB6_n794PrvNom = new boolean[] {false} ;
      P08WB6_A795PrvNum = new int[1] ;
      P08WB6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB6_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB6_A728PrdRefPrv = new String[] {""} ;
      P08WB6_A6302TipPrdDsc = new String[] {""} ;
      P08WB6_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB6_A718PrdNom = new String[] {""} ;
      P08WB6_A719PrdNum = new String[] {""} ;
      P08WB7_A6301TipPrdCod = new short[1] ;
      P08WB7_n6301TipPrdCod = new boolean[] {false} ;
      P08WB7_A795PrvNum = new int[1] ;
      P08WB7_A396EmprCod = new String[] {""} ;
      P08WB7_A856ValCod = new byte[1] ;
      P08WB7_A10881PrdLote = new String[] {""} ;
      P08WB7_A794PrvNom = new String[] {""} ;
      P08WB7_n794PrvNom = new boolean[] {false} ;
      P08WB7_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB7_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB7_A13457PrdUbicaci = new String[] {""} ;
      P08WB7_A728PrdRefPrv = new String[] {""} ;
      P08WB7_A6302TipPrdDsc = new String[] {""} ;
      P08WB7_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB7_A718PrdNom = new String[] {""} ;
      P08WB7_A719PrdNum = new String[] {""} ;
      P08WB8_A6301TipPrdCod = new short[1] ;
      P08WB8_n6301TipPrdCod = new boolean[] {false} ;
      P08WB8_A396EmprCod = new String[] {""} ;
      P08WB8_A10881PrdLote = new String[] {""} ;
      P08WB8_A856ValCod = new byte[1] ;
      P08WB8_A794PrvNom = new String[] {""} ;
      P08WB8_n794PrvNom = new boolean[] {false} ;
      P08WB8_A795PrvNum = new int[1] ;
      P08WB8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB8_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WB8_A13457PrdUbicaci = new String[] {""} ;
      P08WB8_A728PrdRefPrv = new String[] {""} ;
      P08WB8_A6302TipPrdDsc = new String[] {""} ;
      P08WB8_n6302TipPrdDsc = new boolean[] {false} ;
      P08WB8_A718PrdNom = new String[] {""} ;
      P08WB8_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp89getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WB2_A6301TipPrdCod, P08WB2_n6301TipPrdCod, P08WB2_A396EmprCod, P08WB2_A719PrdNum, P08WB2_A856ValCod, P08WB2_A10881PrdLote, P08WB2_A794PrvNom, P08WB2_n794PrvNom, P08WB2_A795PrvNum, P08WB2_A724PrdPreAct,
            P08WB2_A732PrdStkMinU, P08WB2_A13457PrdUbicaci, P08WB2_A728PrdRefPrv, P08WB2_A6302TipPrdDsc, P08WB2_n6302TipPrdDsc, P08WB2_A718PrdNom
            }
            , new Object[] {
            P08WB3_A6301TipPrdCod, P08WB3_n6301TipPrdCod, P08WB3_A396EmprCod, P08WB3_A718PrdNom, P08WB3_A856ValCod, P08WB3_A10881PrdLote, P08WB3_A794PrvNom, P08WB3_n794PrvNom, P08WB3_A795PrvNum, P08WB3_A724PrdPreAct,
            P08WB3_A732PrdStkMinU, P08WB3_A13457PrdUbicaci, P08WB3_A728PrdRefPrv, P08WB3_A6302TipPrdDsc, P08WB3_n6302TipPrdDsc, P08WB3_A719PrdNum
            }
            , new Object[] {
            P08WB4_A6301TipPrdCod, P08WB4_n6301TipPrdCod, P08WB4_A396EmprCod, P08WB4_A856ValCod, P08WB4_A10881PrdLote, P08WB4_A794PrvNom, P08WB4_n794PrvNom, P08WB4_A795PrvNum, P08WB4_A724PrdPreAct, P08WB4_A732PrdStkMinU,
            P08WB4_A13457PrdUbicaci, P08WB4_A728PrdRefPrv, P08WB4_A6302TipPrdDsc, P08WB4_n6302TipPrdDsc, P08WB4_A718PrdNom, P08WB4_A719PrdNum
            }
            , new Object[] {
            P08WB5_A6301TipPrdCod, P08WB5_n6301TipPrdCod, P08WB5_A396EmprCod, P08WB5_A728PrdRefPrv, P08WB5_A856ValCod, P08WB5_A10881PrdLote, P08WB5_A794PrvNom, P08WB5_n794PrvNom, P08WB5_A795PrvNum, P08WB5_A724PrdPreAct,
            P08WB5_A732PrdStkMinU, P08WB5_A13457PrdUbicaci, P08WB5_A6302TipPrdDsc, P08WB5_n6302TipPrdDsc, P08WB5_A718PrdNom, P08WB5_A719PrdNum
            }
            , new Object[] {
            P08WB6_A6301TipPrdCod, P08WB6_n6301TipPrdCod, P08WB6_A396EmprCod, P08WB6_A13457PrdUbicaci, P08WB6_A856ValCod, P08WB6_A10881PrdLote, P08WB6_A794PrvNom, P08WB6_n794PrvNom, P08WB6_A795PrvNum, P08WB6_A724PrdPreAct,
            P08WB6_A732PrdStkMinU, P08WB6_A728PrdRefPrv, P08WB6_A6302TipPrdDsc, P08WB6_n6302TipPrdDsc, P08WB6_A718PrdNom, P08WB6_A719PrdNum
            }
            , new Object[] {
            P08WB7_A6301TipPrdCod, P08WB7_n6301TipPrdCod, P08WB7_A795PrvNum, P08WB7_A396EmprCod, P08WB7_A856ValCod, P08WB7_A10881PrdLote, P08WB7_A794PrvNom, P08WB7_n794PrvNom, P08WB7_A724PrdPreAct, P08WB7_A732PrdStkMinU,
            P08WB7_A13457PrdUbicaci, P08WB7_A728PrdRefPrv, P08WB7_A6302TipPrdDsc, P08WB7_n6302TipPrdDsc, P08WB7_A718PrdNom, P08WB7_A719PrdNum
            }
            , new Object[] {
            P08WB8_A6301TipPrdCod, P08WB8_n6301TipPrdCod, P08WB8_A396EmprCod, P08WB8_A10881PrdLote, P08WB8_A856ValCod, P08WB8_A794PrvNom, P08WB8_n794PrvNom, P08WB8_A795PrvNum, P08WB8_A724PrdPreAct, P08WB8_A732PrdStkMinU,
            P08WB8_A13457PrdUbicaci, P08WB8_A728PrdRefPrv, P08WB8_A6302TipPrdDsc, P08WB8_n6302TipPrdDsc, P08WB8_A718PrdNom, P08WB8_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55TFValCod ;
   private byte AV56TFValCod_To ;
   private byte AV50Seleccion ;
   private byte AV82Wcwwkp89ds_22_tfvalcod ;
   private byte AV83Wcwwkp89ds_23_tfvalcod_to ;
   private byte A856ValCod ;
   private short AV53ValCodfrom ;
   private short AV54ValCodto ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV46TFPrvNum ;
   private int AV47TFPrvNum_To ;
   private int AV76Wcwwkp89ds_16_tfprvnum ;
   private int AV77Wcwwkp89ds_17_tfprvnum_to ;
   private int A795PrvNum ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV20TFPrdStkMinU ;
   private java.math.BigDecimal AV21TFPrdStkMinU_To ;
   private java.math.BigDecimal AV44TFPrdPreAct ;
   private java.math.BigDecimal AV45TFPrdPreAct_To ;
   private java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ;
   private java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ;
   private java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ;
   private java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV14TFTipPrdDsc ;
   private String AV15TFTipPrdDsc_Sel ;
   private String AV16TFPrdRefPrv ;
   private String AV17TFPrdRefPrv_Sel ;
   private String AV18TFPrdUbicacion ;
   private String AV19TFPrdUbicacion_Sel ;
   private String AV48TFPrvNom ;
   private String AV49TFPrvNom_Sel ;
   private String AV51TFPrdLote ;
   private String AV52TFPrdLote_Sel ;
   private String AV41Emprcod ;
   private String AV42Prdnum ;
   private String AV43Prdnum_to ;
   private String A719PrdNum ;
   private String AV62Wcwwkp89ds_2_tfprdnum ;
   private String AV63Wcwwkp89ds_3_tfprdnum_sel ;
   private String AV64Wcwwkp89ds_4_tfprdnom ;
   private String AV65Wcwwkp89ds_5_tfprdnom_sel ;
   private String AV66Wcwwkp89ds_6_tftipprddsc ;
   private String AV67Wcwwkp89ds_7_tftipprddsc_sel ;
   private String AV68Wcwwkp89ds_8_tfprdrefprv ;
   private String AV69Wcwwkp89ds_9_tfprdrefprv_sel ;
   private String AV70Wcwwkp89ds_10_tfprdubicacion ;
   private String AV71Wcwwkp89ds_11_tfprdubicacion_sel ;
   private String AV78Wcwwkp89ds_18_tfprvnom ;
   private String AV79Wcwwkp89ds_19_tfprvnom_sel ;
   private String AV80Wcwwkp89ds_20_tfprdlote ;
   private String AV81Wcwwkp89ds_21_tfprdlote_sel ;
   private String scmdbuf ;
   private String lV62Wcwwkp89ds_2_tfprdnum ;
   private String lV64Wcwwkp89ds_4_tfprdnom ;
   private String lV66Wcwwkp89ds_6_tftipprddsc ;
   private String lV68Wcwwkp89ds_8_tfprdrefprv ;
   private String lV70Wcwwkp89ds_10_tfprdubicacion ;
   private String lV78Wcwwkp89ds_18_tfprvnom ;
   private String lV80Wcwwkp89ds_20_tfprdlote ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A728PrdRefPrv ;
   private String A13457PrdUbicaci ;
   private String A794PrvNom ;
   private String A10881PrdLote ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8WB2 ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n6302TipPrdDsc ;
   private boolean brk8WB4 ;
   private boolean brk8WB6 ;
   private boolean brk8WB8 ;
   private boolean brk8WB10 ;
   private boolean brk8WB12 ;
   private boolean brk8WB14 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV61Wcwwkp89ds_1_filterfulltext ;
   private String lV61Wcwwkp89ds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P08WB2_A6301TipPrdCod ;
   private boolean[] P08WB2_n6301TipPrdCod ;
   private String[] P08WB2_A396EmprCod ;
   private String[] P08WB2_A719PrdNum ;
   private byte[] P08WB2_A856ValCod ;
   private String[] P08WB2_A10881PrdLote ;
   private String[] P08WB2_A794PrvNom ;
   private boolean[] P08WB2_n794PrvNom ;
   private int[] P08WB2_A795PrvNum ;
   private java.math.BigDecimal[] P08WB2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB2_A732PrdStkMinU ;
   private String[] P08WB2_A13457PrdUbicaci ;
   private String[] P08WB2_A728PrdRefPrv ;
   private String[] P08WB2_A6302TipPrdDsc ;
   private boolean[] P08WB2_n6302TipPrdDsc ;
   private String[] P08WB2_A718PrdNom ;
   private short[] P08WB3_A6301TipPrdCod ;
   private boolean[] P08WB3_n6301TipPrdCod ;
   private String[] P08WB3_A396EmprCod ;
   private String[] P08WB3_A718PrdNom ;
   private byte[] P08WB3_A856ValCod ;
   private String[] P08WB3_A10881PrdLote ;
   private String[] P08WB3_A794PrvNom ;
   private boolean[] P08WB3_n794PrvNom ;
   private int[] P08WB3_A795PrvNum ;
   private java.math.BigDecimal[] P08WB3_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB3_A732PrdStkMinU ;
   private String[] P08WB3_A13457PrdUbicaci ;
   private String[] P08WB3_A728PrdRefPrv ;
   private String[] P08WB3_A6302TipPrdDsc ;
   private boolean[] P08WB3_n6302TipPrdDsc ;
   private String[] P08WB3_A719PrdNum ;
   private short[] P08WB4_A6301TipPrdCod ;
   private boolean[] P08WB4_n6301TipPrdCod ;
   private String[] P08WB4_A396EmprCod ;
   private byte[] P08WB4_A856ValCod ;
   private String[] P08WB4_A10881PrdLote ;
   private String[] P08WB4_A794PrvNom ;
   private boolean[] P08WB4_n794PrvNom ;
   private int[] P08WB4_A795PrvNum ;
   private java.math.BigDecimal[] P08WB4_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB4_A732PrdStkMinU ;
   private String[] P08WB4_A13457PrdUbicaci ;
   private String[] P08WB4_A728PrdRefPrv ;
   private String[] P08WB4_A6302TipPrdDsc ;
   private boolean[] P08WB4_n6302TipPrdDsc ;
   private String[] P08WB4_A718PrdNom ;
   private String[] P08WB4_A719PrdNum ;
   private short[] P08WB5_A6301TipPrdCod ;
   private boolean[] P08WB5_n6301TipPrdCod ;
   private String[] P08WB5_A396EmprCod ;
   private String[] P08WB5_A728PrdRefPrv ;
   private byte[] P08WB5_A856ValCod ;
   private String[] P08WB5_A10881PrdLote ;
   private String[] P08WB5_A794PrvNom ;
   private boolean[] P08WB5_n794PrvNom ;
   private int[] P08WB5_A795PrvNum ;
   private java.math.BigDecimal[] P08WB5_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB5_A732PrdStkMinU ;
   private String[] P08WB5_A13457PrdUbicaci ;
   private String[] P08WB5_A6302TipPrdDsc ;
   private boolean[] P08WB5_n6302TipPrdDsc ;
   private String[] P08WB5_A718PrdNom ;
   private String[] P08WB5_A719PrdNum ;
   private short[] P08WB6_A6301TipPrdCod ;
   private boolean[] P08WB6_n6301TipPrdCod ;
   private String[] P08WB6_A396EmprCod ;
   private String[] P08WB6_A13457PrdUbicaci ;
   private byte[] P08WB6_A856ValCod ;
   private String[] P08WB6_A10881PrdLote ;
   private String[] P08WB6_A794PrvNom ;
   private boolean[] P08WB6_n794PrvNom ;
   private int[] P08WB6_A795PrvNum ;
   private java.math.BigDecimal[] P08WB6_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB6_A732PrdStkMinU ;
   private String[] P08WB6_A728PrdRefPrv ;
   private String[] P08WB6_A6302TipPrdDsc ;
   private boolean[] P08WB6_n6302TipPrdDsc ;
   private String[] P08WB6_A718PrdNom ;
   private String[] P08WB6_A719PrdNum ;
   private short[] P08WB7_A6301TipPrdCod ;
   private boolean[] P08WB7_n6301TipPrdCod ;
   private int[] P08WB7_A795PrvNum ;
   private String[] P08WB7_A396EmprCod ;
   private byte[] P08WB7_A856ValCod ;
   private String[] P08WB7_A10881PrdLote ;
   private String[] P08WB7_A794PrvNom ;
   private boolean[] P08WB7_n794PrvNom ;
   private java.math.BigDecimal[] P08WB7_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB7_A732PrdStkMinU ;
   private String[] P08WB7_A13457PrdUbicaci ;
   private String[] P08WB7_A728PrdRefPrv ;
   private String[] P08WB7_A6302TipPrdDsc ;
   private boolean[] P08WB7_n6302TipPrdDsc ;
   private String[] P08WB7_A718PrdNom ;
   private String[] P08WB7_A719PrdNum ;
   private short[] P08WB8_A6301TipPrdCod ;
   private boolean[] P08WB8_n6301TipPrdCod ;
   private String[] P08WB8_A396EmprCod ;
   private String[] P08WB8_A10881PrdLote ;
   private byte[] P08WB8_A856ValCod ;
   private String[] P08WB8_A794PrvNom ;
   private boolean[] P08WB8_n794PrvNom ;
   private int[] P08WB8_A795PrvNum ;
   private java.math.BigDecimal[] P08WB8_A724PrdPreAct ;
   private java.math.BigDecimal[] P08WB8_A732PrdStkMinU ;
   private String[] P08WB8_A13457PrdUbicaci ;
   private String[] P08WB8_A728PrdRefPrv ;
   private String[] P08WB8_A6302TipPrdDsc ;
   private boolean[] P08WB8_n6302TipPrdDsc ;
   private String[] P08WB8_A718PrdNom ;
   private String[] P08WB8_A719PrdNum ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcwwkp89getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV41Emprcod ,
                                          String AV42Prdnum ,
                                          String A396EmprCod ,
                                          String AV43Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[38];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdNum, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc," ;
      scmdbuf += " T1.PrdNom FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08WB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[38];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdNom, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08WB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[38];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipPrdCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08WB5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String A396EmprCod ,
                                          String AV41Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[38];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdRefPrv, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08WB6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String A396EmprCod ,
                                          String AV41Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[38];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdUbicaci, T1.ValCod, T1.PrdLote, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdUbicaci" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08WB7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[38];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.PrvNum, T1.EmprCod, T1.ValCod, T1.PrdLote, T2.PrvNom, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T3.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.TipPrdCod = T1.TipPrdCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T3.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08WB8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcwwkp89ds_1_filterfulltext ,
                                          String AV63Wcwwkp89ds_3_tfprdnum_sel ,
                                          String AV62Wcwwkp89ds_2_tfprdnum ,
                                          String AV65Wcwwkp89ds_5_tfprdnom_sel ,
                                          String AV64Wcwwkp89ds_4_tfprdnom ,
                                          String AV67Wcwwkp89ds_7_tftipprddsc_sel ,
                                          String AV66Wcwwkp89ds_6_tftipprddsc ,
                                          String AV69Wcwwkp89ds_9_tfprdrefprv_sel ,
                                          String AV68Wcwwkp89ds_8_tfprdrefprv ,
                                          String AV71Wcwwkp89ds_11_tfprdubicacion_sel ,
                                          String AV70Wcwwkp89ds_10_tfprdubicacion ,
                                          java.math.BigDecimal AV72Wcwwkp89ds_12_tfprdstkminu ,
                                          java.math.BigDecimal AV73Wcwwkp89ds_13_tfprdstkminu_to ,
                                          java.math.BigDecimal AV74Wcwwkp89ds_14_tfprdpreact ,
                                          java.math.BigDecimal AV75Wcwwkp89ds_15_tfprdpreact_to ,
                                          int AV76Wcwwkp89ds_16_tfprvnum ,
                                          int AV77Wcwwkp89ds_17_tfprvnum_to ,
                                          String AV79Wcwwkp89ds_19_tfprvnom_sel ,
                                          String AV78Wcwwkp89ds_18_tfprvnom ,
                                          String AV81Wcwwkp89ds_21_tfprdlote_sel ,
                                          String AV80Wcwwkp89ds_20_tfprdlote ,
                                          byte AV82Wcwwkp89ds_22_tfvalcod ,
                                          byte AV83Wcwwkp89ds_23_tfvalcod_to ,
                                          short AV53ValCodfrom ,
                                          short AV54ValCodto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A6302TipPrdDsc ,
                                          String A728PrdRefPrv ,
                                          String A13457PrdUbicaci ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A10881PrdLote ,
                                          byte A856ValCod ,
                                          String AV42Prdnum ,
                                          String AV43Prdnum_to ,
                                          String A396EmprCod ,
                                          String AV41Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[38];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdLote, T1.ValCod, T3.PrvNom, T1.PrvNum, T1.PrdPreAct, T1.PrdStkMinU, T1.PrdUbicaci, T1.PrdRefPrv, T2.TipPrdDsc, T1.PrdNom," ;
      scmdbuf += " T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Wcwwkp89ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.TipPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( UPPER(T1.PrdUbicaci) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdStkMinU,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcwwkp89ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcwwkp89ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcwwkp89ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcwwkp89ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwwkp89ds_6_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwwkp89ds_7_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcwwkp89ds_8_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcwwkp89ds_9_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwwkp89ds_10_tfprdubicacion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdUbicaci) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwwkp89ds_11_tfprdubicacion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUbicaci = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcwwkp89ds_12_tfprdstkminu)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcwwkp89ds_13_tfprdstkminu_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdStkMinU <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcwwkp89ds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcwwkp89ds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcwwkp89ds_16_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcwwkp89ds_17_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcwwkp89ds_18_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcwwkp89ds_19_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcwwkp89ds_20_tfprdlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcwwkp89ds_21_tfprdlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdLote = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcwwkp89ds_22_tfvalcod) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcwwkp89ds_23_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV53ValCodfrom) )
      {
         addWhere(sWhereString, "(T1.ValCod >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV54ValCodto) )
      {
         addWhere(sWhereString, "(T1.ValCod <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdLote" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P08WB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_P08WB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 2 :
                  return conditional_P08WB4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 3 :
                  return conditional_P08WB5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 4 :
                  return conditional_P08WB6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 5 :
                  return conditional_P08WB7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 6 :
                  return conditional_P08WB8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WB8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((String[]) buf[13])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 26);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((String[]) buf[13])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 5);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
      }
   }

}

