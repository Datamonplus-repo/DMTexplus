package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webpartesproducciongetfilterdata extends GXProcedure
{
   public webpartesproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpartesproducciongetfilterdata.class ), "" );
   }

   public webpartesproducciongetfilterdata( int remoteHandle ,
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
      webpartesproducciongetfilterdata.this.aP5 = new String[] {""};
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
      webpartesproducciongetfilterdata.this.AV26DDOName = aP0;
      webpartesproducciongetfilterdata.this.AV24SearchTxt = aP1;
      webpartesproducciongetfilterdata.this.AV25SearchTxtTo = aP2;
      webpartesproducciongetfilterdata.this.aP3 = aP3;
      webpartesproducciongetfilterdata.this.aP4 = aP4;
      webpartesproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_FASE") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_HISPROF") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROFOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WebPartesProduccionGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebPartesProduccionGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WebPartesProduccionGridState"), null, null);
      }
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV96FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV12TFMaqCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV13TFMaqCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV92TFMaqDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV93TFMaqDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV14TFHisProFec = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV53TFHisProLin = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFHisProLin_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV55TFBarNHdr = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV56TFBarNHdr_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV57TFGruOpeCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFGruOpeCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV59TFBarOrdLin = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFBarOrdLin_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV61TFFase = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV62TFFase_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV65TFHisProDTI = localUtil.ctot( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV67TFHisProDTF = localUtil.ctot( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV69TFHisProF = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV70TFHisProF_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV71TFHisProTur = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFHisProTur_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV73TFHisProKgr = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFHisProKgr_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV75TFHisProMtr = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFHisProMtr_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV77TFHisProNpzs = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFHisProNpzs_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV81TFParCodNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV82TFParCodNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqCod = AV24SearchTxt ;
      AV13TFMaqCod_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE2 */
      pr_default.execute(0, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BE2 = false ;
         A396EmprCod = P08BE2_A396EmprCod[0] ;
         A656ParCod = P08BE2_A656ParCod[0] ;
         n656ParCod = P08BE2_n656ParCod[0] ;
         A602MaqCod = P08BE2_A602MaqCod[0] ;
         A867ParCodNom = P08BE2_A867ParCodNom[0] ;
         n867ParCodNom = P08BE2_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE2_A1525HisProKgr[0] ;
         A566HisProTur = P08BE2_A566HisProTur[0] ;
         A557HisProF = P08BE2_A557HisProF[0] ;
         A4441HisProDTF = P08BE2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE2_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE2_n4440HisProDTI[0] ;
         A461Fase = P08BE2_A461Fase[0] ;
         A194BarOrdLin = P08BE2_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE2_A503GruOpeCod[0] ;
         A561HisProLin = P08BE2_A561HisProLin[0] ;
         A558HisProFec = P08BE2_A558HisProFec[0] ;
         A606MaqDsc = P08BE2_A606MaqDsc[0] ;
         n606MaqDsc = P08BE2_n606MaqDsc[0] ;
         A130BarCodPar = P08BE2_A130BarCodPar[0] ;
         A132BarCodReo = P08BE2_A132BarCodReo[0] ;
         A129BarCod = P08BE2_A129BarCod[0] ;
         A867ParCodNom = P08BE2_A867ParCodNom[0] ;
         n867ParCodNom = P08BE2_n867ParCodNom[0] ;
         A606MaqDsc = P08BE2_A606MaqDsc[0] ;
         n606MaqDsc = P08BE2_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08BE2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8BE2 = false ;
            A396EmprCod = P08BE2_A396EmprCod[0] ;
            A561HisProLin = P08BE2_A561HisProLin[0] ;
            A558HisProFec = P08BE2_A558HisProFec[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV28Option = A602MaqCod ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BE2 )
         {
            brk8BE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV92TFMaqDsc = AV24SearchTxt ;
      AV93TFMaqDsc_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE3 */
      pr_default.execute(1, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8BE4 = false ;
         A396EmprCod = P08BE3_A396EmprCod[0] ;
         A656ParCod = P08BE3_A656ParCod[0] ;
         n656ParCod = P08BE3_n656ParCod[0] ;
         A606MaqDsc = P08BE3_A606MaqDsc[0] ;
         n606MaqDsc = P08BE3_n606MaqDsc[0] ;
         A867ParCodNom = P08BE3_A867ParCodNom[0] ;
         n867ParCodNom = P08BE3_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE3_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE3_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE3_A1525HisProKgr[0] ;
         A566HisProTur = P08BE3_A566HisProTur[0] ;
         A557HisProF = P08BE3_A557HisProF[0] ;
         A4441HisProDTF = P08BE3_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE3_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE3_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE3_n4440HisProDTI[0] ;
         A461Fase = P08BE3_A461Fase[0] ;
         A194BarOrdLin = P08BE3_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE3_A503GruOpeCod[0] ;
         A561HisProLin = P08BE3_A561HisProLin[0] ;
         A558HisProFec = P08BE3_A558HisProFec[0] ;
         A602MaqCod = P08BE3_A602MaqCod[0] ;
         A130BarCodPar = P08BE3_A130BarCodPar[0] ;
         A132BarCodReo = P08BE3_A132BarCodReo[0] ;
         A129BarCod = P08BE3_A129BarCod[0] ;
         A867ParCodNom = P08BE3_A867ParCodNom[0] ;
         n867ParCodNom = P08BE3_n867ParCodNom[0] ;
         A606MaqDsc = P08BE3_A606MaqDsc[0] ;
         n606MaqDsc = P08BE3_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08BE3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8BE4 = false ;
            A396EmprCod = P08BE3_A396EmprCod[0] ;
            A561HisProLin = P08BE3_A561HisProLin[0] ;
            A558HisProFec = P08BE3_A558HisProFec[0] ;
            A602MaqCod = P08BE3_A602MaqCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV28Option = A606MaqDsc ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BE4 )
         {
            brk8BE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV55TFBarNHdr = AV24SearchTxt ;
      AV56TFBarNHdr_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE4 */
      pr_default.execute(2, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P08BE4_A396EmprCod[0] ;
         A656ParCod = P08BE4_A656ParCod[0] ;
         n656ParCod = P08BE4_n656ParCod[0] ;
         A867ParCodNom = P08BE4_A867ParCodNom[0] ;
         n867ParCodNom = P08BE4_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE4_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE4_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE4_A1525HisProKgr[0] ;
         A566HisProTur = P08BE4_A566HisProTur[0] ;
         A557HisProF = P08BE4_A557HisProF[0] ;
         A4441HisProDTF = P08BE4_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE4_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE4_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE4_n4440HisProDTI[0] ;
         A461Fase = P08BE4_A461Fase[0] ;
         A194BarOrdLin = P08BE4_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE4_A503GruOpeCod[0] ;
         A561HisProLin = P08BE4_A561HisProLin[0] ;
         A558HisProFec = P08BE4_A558HisProFec[0] ;
         A606MaqDsc = P08BE4_A606MaqDsc[0] ;
         n606MaqDsc = P08BE4_n606MaqDsc[0] ;
         A602MaqCod = P08BE4_A602MaqCod[0] ;
         A130BarCodPar = P08BE4_A130BarCodPar[0] ;
         A132BarCodReo = P08BE4_A132BarCodReo[0] ;
         A129BarCod = P08BE4_A129BarCod[0] ;
         A867ParCodNom = P08BE4_A867ParCodNom[0] ;
         n867ParCodNom = P08BE4_n867ParCodNom[0] ;
         A606MaqDsc = P08BE4_A606MaqDsc[0] ;
         n606MaqDsc = P08BE4_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV28Option = A13696BarNHdr ;
            AV27InsertIndex = 1 ;
            while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
            {
               AV27InsertIndex = (int)(AV27InsertIndex+1) ;
            }
            if ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) == 0 ) )
            {
               AV36count = GXutil.lval( (String)AV34OptionIndexes.elementAt(-1+AV27InsertIndex)) ;
               AV36count = (long)(AV36count+1) ;
               AV34OptionIndexes.removeItem(AV27InsertIndex);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
            }
            else
            {
               AV29Options.add(AV28Option, AV27InsertIndex);
               AV34OptionIndexes.add("1", AV27InsertIndex);
            }
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV61TFFase = AV24SearchTxt ;
      AV62TFFase_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE5 */
      pr_default.execute(3, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8BE7 = false ;
         A396EmprCod = P08BE5_A396EmprCod[0] ;
         A656ParCod = P08BE5_A656ParCod[0] ;
         n656ParCod = P08BE5_n656ParCod[0] ;
         A461Fase = P08BE5_A461Fase[0] ;
         A867ParCodNom = P08BE5_A867ParCodNom[0] ;
         n867ParCodNom = P08BE5_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE5_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE5_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE5_A1525HisProKgr[0] ;
         A566HisProTur = P08BE5_A566HisProTur[0] ;
         A557HisProF = P08BE5_A557HisProF[0] ;
         A4441HisProDTF = P08BE5_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE5_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE5_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE5_n4440HisProDTI[0] ;
         A194BarOrdLin = P08BE5_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE5_A503GruOpeCod[0] ;
         A561HisProLin = P08BE5_A561HisProLin[0] ;
         A558HisProFec = P08BE5_A558HisProFec[0] ;
         A606MaqDsc = P08BE5_A606MaqDsc[0] ;
         n606MaqDsc = P08BE5_n606MaqDsc[0] ;
         A602MaqCod = P08BE5_A602MaqCod[0] ;
         A130BarCodPar = P08BE5_A130BarCodPar[0] ;
         A132BarCodReo = P08BE5_A132BarCodReo[0] ;
         A129BarCod = P08BE5_A129BarCod[0] ;
         A867ParCodNom = P08BE5_A867ParCodNom[0] ;
         n867ParCodNom = P08BE5_n867ParCodNom[0] ;
         A606MaqDsc = P08BE5_A606MaqDsc[0] ;
         n606MaqDsc = P08BE5_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08BE5_A461Fase[0], A461Fase) == 0 ) )
         {
            brk8BE7 = false ;
            A396EmprCod = P08BE5_A396EmprCod[0] ;
            A561HisProLin = P08BE5_A561HisProLin[0] ;
            A558HisProFec = P08BE5_A558HisProFec[0] ;
            A602MaqCod = P08BE5_A602MaqCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BE7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A461Fase)==0) )
         {
            AV28Option = A461Fase ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BE7 )
         {
            brk8BE7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADHISPROFOPTIONS' Routine */
      returnInSub = false ;
      AV69TFHisProF = AV24SearchTxt ;
      AV70TFHisProF_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE6 */
      pr_default.execute(4, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8BE9 = false ;
         A396EmprCod = P08BE6_A396EmprCod[0] ;
         A656ParCod = P08BE6_A656ParCod[0] ;
         n656ParCod = P08BE6_n656ParCod[0] ;
         A557HisProF = P08BE6_A557HisProF[0] ;
         A867ParCodNom = P08BE6_A867ParCodNom[0] ;
         n867ParCodNom = P08BE6_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE6_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE6_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE6_A1525HisProKgr[0] ;
         A566HisProTur = P08BE6_A566HisProTur[0] ;
         A4441HisProDTF = P08BE6_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE6_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE6_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE6_n4440HisProDTI[0] ;
         A461Fase = P08BE6_A461Fase[0] ;
         A194BarOrdLin = P08BE6_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE6_A503GruOpeCod[0] ;
         A561HisProLin = P08BE6_A561HisProLin[0] ;
         A558HisProFec = P08BE6_A558HisProFec[0] ;
         A606MaqDsc = P08BE6_A606MaqDsc[0] ;
         n606MaqDsc = P08BE6_n606MaqDsc[0] ;
         A602MaqCod = P08BE6_A602MaqCod[0] ;
         A130BarCodPar = P08BE6_A130BarCodPar[0] ;
         A132BarCodReo = P08BE6_A132BarCodReo[0] ;
         A129BarCod = P08BE6_A129BarCod[0] ;
         A867ParCodNom = P08BE6_A867ParCodNom[0] ;
         n867ParCodNom = P08BE6_n867ParCodNom[0] ;
         A606MaqDsc = P08BE6_A606MaqDsc[0] ;
         n606MaqDsc = P08BE6_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08BE6_A557HisProF[0], A557HisProF) == 0 ) )
         {
            brk8BE9 = false ;
            A396EmprCod = P08BE6_A396EmprCod[0] ;
            A561HisProLin = P08BE6_A561HisProLin[0] ;
            A558HisProFec = P08BE6_A558HisProFec[0] ;
            A602MaqCod = P08BE6_A602MaqCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BE9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A557HisProF)==0) )
         {
            AV28Option = A557HisProF ;
            AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A557HisProF, "@!"))) ;
            AV29Options.add(AV28Option, 0);
            AV32OptionsDesc.add(AV31OptionDesc, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BE9 )
         {
            brk8BE9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV81TFParCodNom = AV24SearchTxt ;
      AV82TFParCodNom_Sel = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = AV96FilterFullText ;
      AV102Webpartesproduccionds_2_tfmaqcod = AV12TFMaqCod ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = AV13TFMaqCod_Sel ;
      AV104Webpartesproduccionds_4_tfmaqdsc = AV92TFMaqDsc ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = AV93TFMaqDsc_Sel ;
      AV106Webpartesproduccionds_6_tfhisprofec = AV14TFHisProFec ;
      AV107Webpartesproduccionds_7_tfhisprolin = AV53TFHisProLin ;
      AV108Webpartesproduccionds_8_tfhisprolin_to = AV54TFHisProLin_To ;
      AV109Webpartesproduccionds_9_tfbarnhdr = AV55TFBarNHdr ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = AV56TFBarNHdr_Sel ;
      AV111Webpartesproduccionds_11_tfgruopecod = AV57TFGruOpeCod ;
      AV112Webpartesproduccionds_12_tfgruopecod_to = AV58TFGruOpeCod_To ;
      AV113Webpartesproduccionds_13_tfbarordlin = AV59TFBarOrdLin ;
      AV114Webpartesproduccionds_14_tfbarordlin_to = AV60TFBarOrdLin_To ;
      AV115Webpartesproduccionds_15_tffase = AV61TFFase ;
      AV116Webpartesproduccionds_16_tffase_sel = AV62TFFase_Sel ;
      AV117Webpartesproduccionds_17_tfhisprodti = AV65TFHisProDTI ;
      AV118Webpartesproduccionds_18_tfhisprodtf = AV67TFHisProDTF ;
      AV119Webpartesproduccionds_19_tfhisprof = AV69TFHisProF ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = AV70TFHisProF_Sel ;
      AV121Webpartesproduccionds_21_tfhisprotur = AV71TFHisProTur ;
      AV122Webpartesproduccionds_22_tfhisprotur_to = AV72TFHisProTur_To ;
      AV123Webpartesproduccionds_23_tfhisprokgr = AV73TFHisProKgr ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = AV74TFHisProKgr_To ;
      AV125Webpartesproduccionds_25_tfhispromtr = AV75TFHisProMtr ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = AV76TFHisProMtr_To ;
      AV127Webpartesproduccionds_27_tfhispronpzs = AV77TFHisProNpzs ;
      AV128Webpartesproduccionds_28_tfhispronpzs_to = AV78TFHisProNpzs_To ;
      AV129Webpartesproduccionds_29_tfparcodnom = AV81TFParCodNom ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = AV82TFParCodNom_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV101Webpartesproduccionds_1_filterfulltext ,
                                           AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV102Webpartesproduccionds_2_tfmaqcod ,
                                           AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV104Webpartesproduccionds_4_tfmaqdsc ,
                                           AV106Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV109Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV116Webpartesproduccionds_16_tffase_sel ,
                                           AV115Webpartesproduccionds_15_tffase ,
                                           AV117Webpartesproduccionds_17_tfhisprodti ,
                                           AV118Webpartesproduccionds_18_tfhisprodtf ,
                                           AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV119Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV123Webpartesproduccionds_23_tfhisprokgr ,
                                           AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV125Webpartesproduccionds_25_tfhispromtr ,
                                           AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV129Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV101Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV102Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV104Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV115Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV115Webpartesproduccionds_15_tffase), 8, "%") ;
      lV119Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV119Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV129Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BE7 */
      pr_default.execute(5, new Object[] {lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV101Webpartesproduccionds_1_filterfulltext, lV102Webpartesproduccionds_2_tfmaqcod, AV103Webpartesproduccionds_3_tfmaqcod_sel, lV104Webpartesproduccionds_4_tfmaqdsc, AV105Webpartesproduccionds_5_tfmaqdsc_sel, AV106Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV107Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV108Webpartesproduccionds_8_tfhisprolin_to), lV109Webpartesproduccionds_9_tfbarnhdr, AV110Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV111Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV112Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV113Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV114Webpartesproduccionds_14_tfbarordlin_to), lV115Webpartesproduccionds_15_tffase, AV116Webpartesproduccionds_16_tffase_sel, AV117Webpartesproduccionds_17_tfhisprodti, AV118Webpartesproduccionds_18_tfhisprodtf, lV119Webpartesproduccionds_19_tfhisprof, AV120Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV121Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV122Webpartesproduccionds_22_tfhisprotur_to), AV123Webpartesproduccionds_23_tfhisprokgr, AV124Webpartesproduccionds_24_tfhisprokgr_to, AV125Webpartesproduccionds_25_tfhispromtr, AV126Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV127Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV128Webpartesproduccionds_28_tfhispronpzs_to), lV129Webpartesproduccionds_29_tfparcodnom, AV130Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8BE11 = false ;
         A396EmprCod = P08BE7_A396EmprCod[0] ;
         A656ParCod = P08BE7_A656ParCod[0] ;
         n656ParCod = P08BE7_n656ParCod[0] ;
         A867ParCodNom = P08BE7_A867ParCodNom[0] ;
         n867ParCodNom = P08BE7_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BE7_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BE7_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BE7_A1525HisProKgr[0] ;
         A566HisProTur = P08BE7_A566HisProTur[0] ;
         A557HisProF = P08BE7_A557HisProF[0] ;
         A4441HisProDTF = P08BE7_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BE7_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BE7_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BE7_n4440HisProDTI[0] ;
         A461Fase = P08BE7_A461Fase[0] ;
         A194BarOrdLin = P08BE7_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BE7_A503GruOpeCod[0] ;
         A561HisProLin = P08BE7_A561HisProLin[0] ;
         A558HisProFec = P08BE7_A558HisProFec[0] ;
         A606MaqDsc = P08BE7_A606MaqDsc[0] ;
         n606MaqDsc = P08BE7_n606MaqDsc[0] ;
         A602MaqCod = P08BE7_A602MaqCod[0] ;
         A130BarCodPar = P08BE7_A130BarCodPar[0] ;
         A132BarCodReo = P08BE7_A132BarCodReo[0] ;
         A129BarCod = P08BE7_A129BarCod[0] ;
         A867ParCodNom = P08BE7_A867ParCodNom[0] ;
         n867ParCodNom = P08BE7_n867ParCodNom[0] ;
         A606MaqDsc = P08BE7_A606MaqDsc[0] ;
         n606MaqDsc = P08BE7_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08BE7_A867ParCodNom[0], A867ParCodNom) == 0 ) )
         {
            brk8BE11 = false ;
            A396EmprCod = P08BE7_A396EmprCod[0] ;
            A656ParCod = P08BE7_A656ParCod[0] ;
            n656ParCod = P08BE7_n656ParCod[0] ;
            A561HisProLin = P08BE7_A561HisProLin[0] ;
            A558HisProFec = P08BE7_A558HisProFec[0] ;
            A602MaqCod = P08BE7_A602MaqCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BE11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
         {
            AV28Option = A867ParCodNom ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BE11 )
         {
            brk8BE11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webpartesproducciongetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = webpartesproducciongetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = webpartesproducciongetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV96FilterFullText = "" ;
      AV12TFMaqCod = "" ;
      AV13TFMaqCod_Sel = "" ;
      AV92TFMaqDsc = "" ;
      AV93TFMaqDsc_Sel = "" ;
      AV14TFHisProFec = GXutil.nullDate() ;
      AV55TFBarNHdr = "" ;
      AV56TFBarNHdr_Sel = "" ;
      AV61TFFase = "" ;
      AV62TFFase_Sel = "" ;
      AV65TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV67TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV69TFHisProF = "" ;
      AV70TFHisProF_Sel = "" ;
      AV73TFHisProKgr = DecimalUtil.ZERO ;
      AV74TFHisProKgr_To = DecimalUtil.ZERO ;
      AV75TFHisProMtr = DecimalUtil.ZERO ;
      AV76TFHisProMtr_To = DecimalUtil.ZERO ;
      AV81TFParCodNom = "" ;
      AV82TFParCodNom_Sel = "" ;
      A602MaqCod = "" ;
      AV101Webpartesproduccionds_1_filterfulltext = "" ;
      AV102Webpartesproduccionds_2_tfmaqcod = "" ;
      AV103Webpartesproduccionds_3_tfmaqcod_sel = "" ;
      AV104Webpartesproduccionds_4_tfmaqdsc = "" ;
      AV105Webpartesproduccionds_5_tfmaqdsc_sel = "" ;
      AV106Webpartesproduccionds_6_tfhisprofec = GXutil.nullDate() ;
      AV109Webpartesproduccionds_9_tfbarnhdr = "" ;
      AV110Webpartesproduccionds_10_tfbarnhdr_sel = "" ;
      AV115Webpartesproduccionds_15_tffase = "" ;
      AV116Webpartesproduccionds_16_tffase_sel = "" ;
      AV117Webpartesproduccionds_17_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV118Webpartesproduccionds_18_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV119Webpartesproduccionds_19_tfhisprof = "" ;
      AV120Webpartesproduccionds_20_tfhisprof_sel = "" ;
      AV123Webpartesproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV124Webpartesproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV125Webpartesproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV126Webpartesproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV129Webpartesproduccionds_29_tfparcodnom = "" ;
      AV130Webpartesproduccionds_30_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV101Webpartesproduccionds_1_filterfulltext = "" ;
      lV102Webpartesproduccionds_2_tfmaqcod = "" ;
      lV104Webpartesproduccionds_4_tfmaqdsc = "" ;
      lV109Webpartesproduccionds_9_tfbarnhdr = "" ;
      lV115Webpartesproduccionds_15_tffase = "" ;
      lV119Webpartesproduccionds_19_tfhisprof = "" ;
      lV129Webpartesproduccionds_29_tfparcodnom = "" ;
      A606MaqDsc = "" ;
      A130BarCodPar = "" ;
      A461Fase = "" ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      P08BE2_A396EmprCod = new String[] {""} ;
      P08BE2_A656ParCod = new short[1] ;
      P08BE2_n656ParCod = new boolean[] {false} ;
      P08BE2_A602MaqCod = new String[] {""} ;
      P08BE2_A867ParCodNom = new String[] {""} ;
      P08BE2_n867ParCodNom = new boolean[] {false} ;
      P08BE2_A4714HisProNpzs = new short[1] ;
      P08BE2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE2_A566HisProTur = new byte[1] ;
      P08BE2_A557HisProF = new String[] {""} ;
      P08BE2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE2_n4441HisProDTF = new boolean[] {false} ;
      P08BE2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE2_n4440HisProDTI = new boolean[] {false} ;
      P08BE2_A461Fase = new String[] {""} ;
      P08BE2_A194BarOrdLin = new short[1] ;
      P08BE2_A503GruOpeCod = new int[1] ;
      P08BE2_A561HisProLin = new int[1] ;
      P08BE2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE2_A606MaqDsc = new String[] {""} ;
      P08BE2_n606MaqDsc = new boolean[] {false} ;
      P08BE2_A130BarCodPar = new String[] {""} ;
      P08BE2_A132BarCodReo = new byte[1] ;
      P08BE2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A13696BarNHdr = "" ;
      AV28Option = "" ;
      P08BE3_A396EmprCod = new String[] {""} ;
      P08BE3_A656ParCod = new short[1] ;
      P08BE3_n656ParCod = new boolean[] {false} ;
      P08BE3_A606MaqDsc = new String[] {""} ;
      P08BE3_n606MaqDsc = new boolean[] {false} ;
      P08BE3_A867ParCodNom = new String[] {""} ;
      P08BE3_n867ParCodNom = new boolean[] {false} ;
      P08BE3_A4714HisProNpzs = new short[1] ;
      P08BE3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE3_A566HisProTur = new byte[1] ;
      P08BE3_A557HisProF = new String[] {""} ;
      P08BE3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE3_n4441HisProDTF = new boolean[] {false} ;
      P08BE3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE3_n4440HisProDTI = new boolean[] {false} ;
      P08BE3_A461Fase = new String[] {""} ;
      P08BE3_A194BarOrdLin = new short[1] ;
      P08BE3_A503GruOpeCod = new int[1] ;
      P08BE3_A561HisProLin = new int[1] ;
      P08BE3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE3_A602MaqCod = new String[] {""} ;
      P08BE3_A130BarCodPar = new String[] {""} ;
      P08BE3_A132BarCodReo = new byte[1] ;
      P08BE3_A129BarCod = new int[1] ;
      P08BE4_A396EmprCod = new String[] {""} ;
      P08BE4_A656ParCod = new short[1] ;
      P08BE4_n656ParCod = new boolean[] {false} ;
      P08BE4_A867ParCodNom = new String[] {""} ;
      P08BE4_n867ParCodNom = new boolean[] {false} ;
      P08BE4_A4714HisProNpzs = new short[1] ;
      P08BE4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE4_A566HisProTur = new byte[1] ;
      P08BE4_A557HisProF = new String[] {""} ;
      P08BE4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE4_n4441HisProDTF = new boolean[] {false} ;
      P08BE4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE4_n4440HisProDTI = new boolean[] {false} ;
      P08BE4_A461Fase = new String[] {""} ;
      P08BE4_A194BarOrdLin = new short[1] ;
      P08BE4_A503GruOpeCod = new int[1] ;
      P08BE4_A561HisProLin = new int[1] ;
      P08BE4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE4_A606MaqDsc = new String[] {""} ;
      P08BE4_n606MaqDsc = new boolean[] {false} ;
      P08BE4_A602MaqCod = new String[] {""} ;
      P08BE4_A130BarCodPar = new String[] {""} ;
      P08BE4_A132BarCodReo = new byte[1] ;
      P08BE4_A129BarCod = new int[1] ;
      P08BE5_A396EmprCod = new String[] {""} ;
      P08BE5_A656ParCod = new short[1] ;
      P08BE5_n656ParCod = new boolean[] {false} ;
      P08BE5_A461Fase = new String[] {""} ;
      P08BE5_A867ParCodNom = new String[] {""} ;
      P08BE5_n867ParCodNom = new boolean[] {false} ;
      P08BE5_A4714HisProNpzs = new short[1] ;
      P08BE5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE5_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE5_A566HisProTur = new byte[1] ;
      P08BE5_A557HisProF = new String[] {""} ;
      P08BE5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE5_n4441HisProDTF = new boolean[] {false} ;
      P08BE5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE5_n4440HisProDTI = new boolean[] {false} ;
      P08BE5_A194BarOrdLin = new short[1] ;
      P08BE5_A503GruOpeCod = new int[1] ;
      P08BE5_A561HisProLin = new int[1] ;
      P08BE5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE5_A606MaqDsc = new String[] {""} ;
      P08BE5_n606MaqDsc = new boolean[] {false} ;
      P08BE5_A602MaqCod = new String[] {""} ;
      P08BE5_A130BarCodPar = new String[] {""} ;
      P08BE5_A132BarCodReo = new byte[1] ;
      P08BE5_A129BarCod = new int[1] ;
      P08BE6_A396EmprCod = new String[] {""} ;
      P08BE6_A656ParCod = new short[1] ;
      P08BE6_n656ParCod = new boolean[] {false} ;
      P08BE6_A557HisProF = new String[] {""} ;
      P08BE6_A867ParCodNom = new String[] {""} ;
      P08BE6_n867ParCodNom = new boolean[] {false} ;
      P08BE6_A4714HisProNpzs = new short[1] ;
      P08BE6_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE6_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE6_A566HisProTur = new byte[1] ;
      P08BE6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE6_n4441HisProDTF = new boolean[] {false} ;
      P08BE6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE6_n4440HisProDTI = new boolean[] {false} ;
      P08BE6_A461Fase = new String[] {""} ;
      P08BE6_A194BarOrdLin = new short[1] ;
      P08BE6_A503GruOpeCod = new int[1] ;
      P08BE6_A561HisProLin = new int[1] ;
      P08BE6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE6_A606MaqDsc = new String[] {""} ;
      P08BE6_n606MaqDsc = new boolean[] {false} ;
      P08BE6_A602MaqCod = new String[] {""} ;
      P08BE6_A130BarCodPar = new String[] {""} ;
      P08BE6_A132BarCodReo = new byte[1] ;
      P08BE6_A129BarCod = new int[1] ;
      AV31OptionDesc = "" ;
      P08BE7_A396EmprCod = new String[] {""} ;
      P08BE7_A656ParCod = new short[1] ;
      P08BE7_n656ParCod = new boolean[] {false} ;
      P08BE7_A867ParCodNom = new String[] {""} ;
      P08BE7_n867ParCodNom = new boolean[] {false} ;
      P08BE7_A4714HisProNpzs = new short[1] ;
      P08BE7_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE7_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BE7_A566HisProTur = new byte[1] ;
      P08BE7_A557HisProF = new String[] {""} ;
      P08BE7_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE7_n4441HisProDTF = new boolean[] {false} ;
      P08BE7_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE7_n4440HisProDTI = new boolean[] {false} ;
      P08BE7_A461Fase = new String[] {""} ;
      P08BE7_A194BarOrdLin = new short[1] ;
      P08BE7_A503GruOpeCod = new int[1] ;
      P08BE7_A561HisProLin = new int[1] ;
      P08BE7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BE7_A606MaqDsc = new String[] {""} ;
      P08BE7_n606MaqDsc = new boolean[] {false} ;
      P08BE7_A602MaqCod = new String[] {""} ;
      P08BE7_A130BarCodPar = new String[] {""} ;
      P08BE7_A132BarCodReo = new byte[1] ;
      P08BE7_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BE2_A396EmprCod, P08BE2_A656ParCod, P08BE2_n656ParCod, P08BE2_A602MaqCod, P08BE2_A867ParCodNom, P08BE2_n867ParCodNom, P08BE2_A4714HisProNpzs, P08BE2_A1526HisProMtr, P08BE2_A1525HisProKgr, P08BE2_A566HisProTur,
            P08BE2_A557HisProF, P08BE2_A4441HisProDTF, P08BE2_n4441HisProDTF, P08BE2_A4440HisProDTI, P08BE2_n4440HisProDTI, P08BE2_A461Fase, P08BE2_A194BarOrdLin, P08BE2_A503GruOpeCod, P08BE2_A561HisProLin, P08BE2_A558HisProFec,
            P08BE2_A606MaqDsc, P08BE2_n606MaqDsc, P08BE2_A130BarCodPar, P08BE2_A132BarCodReo, P08BE2_A129BarCod
            }
            , new Object[] {
            P08BE3_A396EmprCod, P08BE3_A656ParCod, P08BE3_n656ParCod, P08BE3_A606MaqDsc, P08BE3_n606MaqDsc, P08BE3_A867ParCodNom, P08BE3_n867ParCodNom, P08BE3_A4714HisProNpzs, P08BE3_A1526HisProMtr, P08BE3_A1525HisProKgr,
            P08BE3_A566HisProTur, P08BE3_A557HisProF, P08BE3_A4441HisProDTF, P08BE3_n4441HisProDTF, P08BE3_A4440HisProDTI, P08BE3_n4440HisProDTI, P08BE3_A461Fase, P08BE3_A194BarOrdLin, P08BE3_A503GruOpeCod, P08BE3_A561HisProLin,
            P08BE3_A558HisProFec, P08BE3_A602MaqCod, P08BE3_A130BarCodPar, P08BE3_A132BarCodReo, P08BE3_A129BarCod
            }
            , new Object[] {
            P08BE4_A396EmprCod, P08BE4_A656ParCod, P08BE4_n656ParCod, P08BE4_A867ParCodNom, P08BE4_n867ParCodNom, P08BE4_A4714HisProNpzs, P08BE4_A1526HisProMtr, P08BE4_A1525HisProKgr, P08BE4_A566HisProTur, P08BE4_A557HisProF,
            P08BE4_A4441HisProDTF, P08BE4_n4441HisProDTF, P08BE4_A4440HisProDTI, P08BE4_n4440HisProDTI, P08BE4_A461Fase, P08BE4_A194BarOrdLin, P08BE4_A503GruOpeCod, P08BE4_A561HisProLin, P08BE4_A558HisProFec, P08BE4_A606MaqDsc,
            P08BE4_n606MaqDsc, P08BE4_A602MaqCod, P08BE4_A130BarCodPar, P08BE4_A132BarCodReo, P08BE4_A129BarCod
            }
            , new Object[] {
            P08BE5_A396EmprCod, P08BE5_A656ParCod, P08BE5_n656ParCod, P08BE5_A461Fase, P08BE5_A867ParCodNom, P08BE5_n867ParCodNom, P08BE5_A4714HisProNpzs, P08BE5_A1526HisProMtr, P08BE5_A1525HisProKgr, P08BE5_A566HisProTur,
            P08BE5_A557HisProF, P08BE5_A4441HisProDTF, P08BE5_n4441HisProDTF, P08BE5_A4440HisProDTI, P08BE5_n4440HisProDTI, P08BE5_A194BarOrdLin, P08BE5_A503GruOpeCod, P08BE5_A561HisProLin, P08BE5_A558HisProFec, P08BE5_A606MaqDsc,
            P08BE5_n606MaqDsc, P08BE5_A602MaqCod, P08BE5_A130BarCodPar, P08BE5_A132BarCodReo, P08BE5_A129BarCod
            }
            , new Object[] {
            P08BE6_A396EmprCod, P08BE6_A656ParCod, P08BE6_n656ParCod, P08BE6_A557HisProF, P08BE6_A867ParCodNom, P08BE6_n867ParCodNom, P08BE6_A4714HisProNpzs, P08BE6_A1526HisProMtr, P08BE6_A1525HisProKgr, P08BE6_A566HisProTur,
            P08BE6_A4441HisProDTF, P08BE6_n4441HisProDTF, P08BE6_A4440HisProDTI, P08BE6_n4440HisProDTI, P08BE6_A461Fase, P08BE6_A194BarOrdLin, P08BE6_A503GruOpeCod, P08BE6_A561HisProLin, P08BE6_A558HisProFec, P08BE6_A606MaqDsc,
            P08BE6_n606MaqDsc, P08BE6_A602MaqCod, P08BE6_A130BarCodPar, P08BE6_A132BarCodReo, P08BE6_A129BarCod
            }
            , new Object[] {
            P08BE7_A396EmprCod, P08BE7_A656ParCod, P08BE7_n656ParCod, P08BE7_A867ParCodNom, P08BE7_n867ParCodNom, P08BE7_A4714HisProNpzs, P08BE7_A1526HisProMtr, P08BE7_A1525HisProKgr, P08BE7_A566HisProTur, P08BE7_A557HisProF,
            P08BE7_A4441HisProDTF, P08BE7_n4441HisProDTF, P08BE7_A4440HisProDTI, P08BE7_n4440HisProDTI, P08BE7_A461Fase, P08BE7_A194BarOrdLin, P08BE7_A503GruOpeCod, P08BE7_A561HisProLin, P08BE7_A558HisProFec, P08BE7_A606MaqDsc,
            P08BE7_n606MaqDsc, P08BE7_A602MaqCod, P08BE7_A130BarCodPar, P08BE7_A132BarCodReo, P08BE7_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV71TFHisProTur ;
   private byte AV72TFHisProTur_To ;
   private byte AV121Webpartesproduccionds_21_tfhisprotur ;
   private byte AV122Webpartesproduccionds_22_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private short AV59TFBarOrdLin ;
   private short AV60TFBarOrdLin_To ;
   private short AV77TFHisProNpzs ;
   private short AV78TFHisProNpzs_To ;
   private short AV113Webpartesproduccionds_13_tfbarordlin ;
   private short AV114Webpartesproduccionds_14_tfbarordlin_to ;
   private short AV127Webpartesproduccionds_27_tfhispronpzs ;
   private short AV128Webpartesproduccionds_28_tfhispronpzs_to ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV99GXV1 ;
   private int AV53TFHisProLin ;
   private int AV54TFHisProLin_To ;
   private int AV57TFGruOpeCod ;
   private int AV58TFGruOpeCod_To ;
   private int AV107Webpartesproduccionds_7_tfhisprolin ;
   private int AV108Webpartesproduccionds_8_tfhisprolin_to ;
   private int AV111Webpartesproduccionds_11_tfgruopecod ;
   private int AV112Webpartesproduccionds_12_tfgruopecod_to ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private java.math.BigDecimal AV73TFHisProKgr ;
   private java.math.BigDecimal AV74TFHisProKgr_To ;
   private java.math.BigDecimal AV75TFHisProMtr ;
   private java.math.BigDecimal AV76TFHisProMtr_To ;
   private java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV12TFMaqCod ;
   private String AV13TFMaqCod_Sel ;
   private String AV92TFMaqDsc ;
   private String AV93TFMaqDsc_Sel ;
   private String AV55TFBarNHdr ;
   private String AV56TFBarNHdr_Sel ;
   private String AV61TFFase ;
   private String AV62TFFase_Sel ;
   private String AV69TFHisProF ;
   private String AV70TFHisProF_Sel ;
   private String AV81TFParCodNom ;
   private String AV82TFParCodNom_Sel ;
   private String A602MaqCod ;
   private String AV102Webpartesproduccionds_2_tfmaqcod ;
   private String AV103Webpartesproduccionds_3_tfmaqcod_sel ;
   private String AV104Webpartesproduccionds_4_tfmaqdsc ;
   private String AV105Webpartesproduccionds_5_tfmaqdsc_sel ;
   private String AV109Webpartesproduccionds_9_tfbarnhdr ;
   private String AV110Webpartesproduccionds_10_tfbarnhdr_sel ;
   private String AV115Webpartesproduccionds_15_tffase ;
   private String AV116Webpartesproduccionds_16_tffase_sel ;
   private String AV119Webpartesproduccionds_19_tfhisprof ;
   private String AV120Webpartesproduccionds_20_tfhisprof_sel ;
   private String AV129Webpartesproduccionds_29_tfparcodnom ;
   private String AV130Webpartesproduccionds_30_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV102Webpartesproduccionds_2_tfmaqcod ;
   private String lV104Webpartesproduccionds_4_tfmaqdsc ;
   private String lV109Webpartesproduccionds_9_tfbarnhdr ;
   private String lV115Webpartesproduccionds_15_tffase ;
   private String lV119Webpartesproduccionds_19_tfhisprof ;
   private String lV129Webpartesproduccionds_29_tfparcodnom ;
   private String A606MaqDsc ;
   private String A130BarCodPar ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV65TFHisProDTI ;
   private java.util.Date AV67TFHisProDTF ;
   private java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ;
   private java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV14TFHisProFec ;
   private java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8BE2 ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private boolean brk8BE4 ;
   private boolean brk8BE7 ;
   private boolean brk8BE9 ;
   private boolean brk8BE11 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV96FilterFullText ;
   private String AV101Webpartesproduccionds_1_filterfulltext ;
   private String lV101Webpartesproduccionds_1_filterfulltext ;
   private String AV28Option ;
   private String AV31OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BE2_A396EmprCod ;
   private short[] P08BE2_A656ParCod ;
   private boolean[] P08BE2_n656ParCod ;
   private String[] P08BE2_A602MaqCod ;
   private String[] P08BE2_A867ParCodNom ;
   private boolean[] P08BE2_n867ParCodNom ;
   private short[] P08BE2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE2_A1525HisProKgr ;
   private byte[] P08BE2_A566HisProTur ;
   private String[] P08BE2_A557HisProF ;
   private java.util.Date[] P08BE2_A4441HisProDTF ;
   private boolean[] P08BE2_n4441HisProDTF ;
   private java.util.Date[] P08BE2_A4440HisProDTI ;
   private boolean[] P08BE2_n4440HisProDTI ;
   private String[] P08BE2_A461Fase ;
   private short[] P08BE2_A194BarOrdLin ;
   private int[] P08BE2_A503GruOpeCod ;
   private int[] P08BE2_A561HisProLin ;
   private java.util.Date[] P08BE2_A558HisProFec ;
   private String[] P08BE2_A606MaqDsc ;
   private boolean[] P08BE2_n606MaqDsc ;
   private String[] P08BE2_A130BarCodPar ;
   private byte[] P08BE2_A132BarCodReo ;
   private int[] P08BE2_A129BarCod ;
   private String[] P08BE3_A396EmprCod ;
   private short[] P08BE3_A656ParCod ;
   private boolean[] P08BE3_n656ParCod ;
   private String[] P08BE3_A606MaqDsc ;
   private boolean[] P08BE3_n606MaqDsc ;
   private String[] P08BE3_A867ParCodNom ;
   private boolean[] P08BE3_n867ParCodNom ;
   private short[] P08BE3_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE3_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE3_A1525HisProKgr ;
   private byte[] P08BE3_A566HisProTur ;
   private String[] P08BE3_A557HisProF ;
   private java.util.Date[] P08BE3_A4441HisProDTF ;
   private boolean[] P08BE3_n4441HisProDTF ;
   private java.util.Date[] P08BE3_A4440HisProDTI ;
   private boolean[] P08BE3_n4440HisProDTI ;
   private String[] P08BE3_A461Fase ;
   private short[] P08BE3_A194BarOrdLin ;
   private int[] P08BE3_A503GruOpeCod ;
   private int[] P08BE3_A561HisProLin ;
   private java.util.Date[] P08BE3_A558HisProFec ;
   private String[] P08BE3_A602MaqCod ;
   private String[] P08BE3_A130BarCodPar ;
   private byte[] P08BE3_A132BarCodReo ;
   private int[] P08BE3_A129BarCod ;
   private String[] P08BE4_A396EmprCod ;
   private short[] P08BE4_A656ParCod ;
   private boolean[] P08BE4_n656ParCod ;
   private String[] P08BE4_A867ParCodNom ;
   private boolean[] P08BE4_n867ParCodNom ;
   private short[] P08BE4_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE4_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE4_A1525HisProKgr ;
   private byte[] P08BE4_A566HisProTur ;
   private String[] P08BE4_A557HisProF ;
   private java.util.Date[] P08BE4_A4441HisProDTF ;
   private boolean[] P08BE4_n4441HisProDTF ;
   private java.util.Date[] P08BE4_A4440HisProDTI ;
   private boolean[] P08BE4_n4440HisProDTI ;
   private String[] P08BE4_A461Fase ;
   private short[] P08BE4_A194BarOrdLin ;
   private int[] P08BE4_A503GruOpeCod ;
   private int[] P08BE4_A561HisProLin ;
   private java.util.Date[] P08BE4_A558HisProFec ;
   private String[] P08BE4_A606MaqDsc ;
   private boolean[] P08BE4_n606MaqDsc ;
   private String[] P08BE4_A602MaqCod ;
   private String[] P08BE4_A130BarCodPar ;
   private byte[] P08BE4_A132BarCodReo ;
   private int[] P08BE4_A129BarCod ;
   private String[] P08BE5_A396EmprCod ;
   private short[] P08BE5_A656ParCod ;
   private boolean[] P08BE5_n656ParCod ;
   private String[] P08BE5_A461Fase ;
   private String[] P08BE5_A867ParCodNom ;
   private boolean[] P08BE5_n867ParCodNom ;
   private short[] P08BE5_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE5_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE5_A1525HisProKgr ;
   private byte[] P08BE5_A566HisProTur ;
   private String[] P08BE5_A557HisProF ;
   private java.util.Date[] P08BE5_A4441HisProDTF ;
   private boolean[] P08BE5_n4441HisProDTF ;
   private java.util.Date[] P08BE5_A4440HisProDTI ;
   private boolean[] P08BE5_n4440HisProDTI ;
   private short[] P08BE5_A194BarOrdLin ;
   private int[] P08BE5_A503GruOpeCod ;
   private int[] P08BE5_A561HisProLin ;
   private java.util.Date[] P08BE5_A558HisProFec ;
   private String[] P08BE5_A606MaqDsc ;
   private boolean[] P08BE5_n606MaqDsc ;
   private String[] P08BE5_A602MaqCod ;
   private String[] P08BE5_A130BarCodPar ;
   private byte[] P08BE5_A132BarCodReo ;
   private int[] P08BE5_A129BarCod ;
   private String[] P08BE6_A396EmprCod ;
   private short[] P08BE6_A656ParCod ;
   private boolean[] P08BE6_n656ParCod ;
   private String[] P08BE6_A557HisProF ;
   private String[] P08BE6_A867ParCodNom ;
   private boolean[] P08BE6_n867ParCodNom ;
   private short[] P08BE6_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE6_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE6_A1525HisProKgr ;
   private byte[] P08BE6_A566HisProTur ;
   private java.util.Date[] P08BE6_A4441HisProDTF ;
   private boolean[] P08BE6_n4441HisProDTF ;
   private java.util.Date[] P08BE6_A4440HisProDTI ;
   private boolean[] P08BE6_n4440HisProDTI ;
   private String[] P08BE6_A461Fase ;
   private short[] P08BE6_A194BarOrdLin ;
   private int[] P08BE6_A503GruOpeCod ;
   private int[] P08BE6_A561HisProLin ;
   private java.util.Date[] P08BE6_A558HisProFec ;
   private String[] P08BE6_A606MaqDsc ;
   private boolean[] P08BE6_n606MaqDsc ;
   private String[] P08BE6_A602MaqCod ;
   private String[] P08BE6_A130BarCodPar ;
   private byte[] P08BE6_A132BarCodReo ;
   private int[] P08BE6_A129BarCod ;
   private String[] P08BE7_A396EmprCod ;
   private short[] P08BE7_A656ParCod ;
   private boolean[] P08BE7_n656ParCod ;
   private String[] P08BE7_A867ParCodNom ;
   private boolean[] P08BE7_n867ParCodNom ;
   private short[] P08BE7_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BE7_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BE7_A1525HisProKgr ;
   private byte[] P08BE7_A566HisProTur ;
   private String[] P08BE7_A557HisProF ;
   private java.util.Date[] P08BE7_A4441HisProDTF ;
   private boolean[] P08BE7_n4441HisProDTF ;
   private java.util.Date[] P08BE7_A4440HisProDTI ;
   private boolean[] P08BE7_n4440HisProDTI ;
   private String[] P08BE7_A461Fase ;
   private short[] P08BE7_A194BarOrdLin ;
   private int[] P08BE7_A503GruOpeCod ;
   private int[] P08BE7_A561HisProLin ;
   private java.util.Date[] P08BE7_A558HisProFec ;
   private String[] P08BE7_A606MaqDsc ;
   private boolean[] P08BE7_n606MaqDsc ;
   private String[] P08BE7_A602MaqCod ;
   private String[] P08BE7_A130BarCodPar ;
   private byte[] P08BE7_A132BarCodReo ;
   private int[] P08BE7_A129BarCod ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class webpartesproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[42];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T1.MaqCod, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase," ;
      scmdbuf += " T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08BE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[42];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T3.MaqDsc, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase," ;
      scmdbuf += " T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08BE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08BE5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[42];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T1.Fase, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Fase" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08BE6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[42];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T1.HisProF, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProDTF, T1.HisProDTI, T1.Fase, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProF" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08BE7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Webpartesproduccionds_1_filterfulltext ,
                                          String AV103Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV102Webpartesproduccionds_2_tfmaqcod ,
                                          String AV105Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV104Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV106Webpartesproduccionds_6_tfhisprofec ,
                                          int AV107Webpartesproduccionds_7_tfhisprolin ,
                                          int AV108Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV110Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV109Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV111Webpartesproduccionds_11_tfgruopecod ,
                                          int AV112Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV113Webpartesproduccionds_13_tfbarordlin ,
                                          short AV114Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV116Webpartesproduccionds_16_tffase_sel ,
                                          String AV115Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV117Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV118Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV120Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV119Webpartesproduccionds_19_tfhisprof ,
                                          byte AV121Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV122Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV124Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV126Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV127Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV128Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV130Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV129Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[42];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV101Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
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
      }
      if ( (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV107Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV114Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV118Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV119Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV122Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV128Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.ParCodNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P08BE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
            case 1 :
                  return conditional_P08BE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
            case 2 :
                  return conditional_P08BE4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
            case 3 :
                  return conditional_P08BE5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
            case 4 :
                  return conditional_P08BE6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
            case 5 :
                  return conditional_P08BE7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BE5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BE6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BE7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
      }
   }

}

