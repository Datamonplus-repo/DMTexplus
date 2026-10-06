package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcpartesproducciongetfilterdata extends GXProcedure
{
   public wcpartesproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcpartesproducciongetfilterdata.class ), "" );
   }

   public wcpartesproducciongetfilterdata( int remoteHandle ,
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
      wcpartesproducciongetfilterdata.this.aP5 = new String[] {""};
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
      wcpartesproducciongetfilterdata.this.AV18DDOName = aP0;
      wcpartesproducciongetfilterdata.this.AV16SearchTxt = aP1;
      wcpartesproducciongetfilterdata.this.AV17SearchTxtTo = aP2;
      wcpartesproducciongetfilterdata.this.aP3 = aP3;
      wcpartesproducciongetfilterdata.this.aP4 = aP4;
      wcpartesproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_FASE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HISPROF") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PARCODNOM") == 0 )
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
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("WCPartesProduccionGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCPartesProduccionGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCPartesProduccionGridState"), null, null);
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV34TFMaqDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV35TFMaqDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV12TFHisProFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV14TFHisProLin = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFHisProLin_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV36TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV37TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV38TFGruOpeCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFGruOpeCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV40TFBarOrdLin = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarOrdLin_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV42TFFase = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV43TFFase_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV46TFHisProDTI = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV48TFHisProDTF = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV50TFHisProF = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV51TFHisProF_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV52TFHisProTur = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFHisProTur_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV54TFHisProKgr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFHisProKgr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV56TFHisProMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFHisProMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV58TFHisProNpzs = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFHisProNpzs_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV60TFParCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFParCod_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV62TFParCodNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV63TFParCodNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64EmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV65MaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC") == 0 )
         {
            AV66HisProFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV16SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH2 */
      pr_default.execute(0, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P08BH2_A606MaqDsc[0] ;
         n606MaqDsc = P08BH2_n606MaqDsc[0] ;
         A558HisProFec = P08BH2_A558HisProFec[0] ;
         A602MaqCod = P08BH2_A602MaqCod[0] ;
         A396EmprCod = P08BH2_A396EmprCod[0] ;
         A606MaqDsc = P08BH2_A606MaqDsc[0] ;
         n606MaqDsc = P08BH2_n606MaqDsc[0] ;
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV20Option = A602MaqCod ;
            AV21Options.add(AV20Option, 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMaqDsc = AV16SearchTxt ;
      AV35TFMaqDsc_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH3 */
      pr_default.execute(1, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8BH3 = false ;
         A396EmprCod = P08BH3_A396EmprCod[0] ;
         A602MaqCod = P08BH3_A602MaqCod[0] ;
         A558HisProFec = P08BH3_A558HisProFec[0] ;
         A606MaqDsc = P08BH3_A606MaqDsc[0] ;
         n606MaqDsc = P08BH3_n606MaqDsc[0] ;
         A606MaqDsc = P08BH3_A606MaqDsc[0] ;
         n606MaqDsc = P08BH3_n606MaqDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08BH3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08BH3_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P08BH3_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( GXutil.strcmp(P08BH3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8BH3 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8BH3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV20Option = A606MaqDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BH3 )
         {
            brk8BH3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV36TFBarNHdr = AV16SearchTxt ;
      AV37TFBarNHdr_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH4 */
      pr_default.execute(2, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A606MaqDsc = P08BH4_A606MaqDsc[0] ;
         n606MaqDsc = P08BH4_n606MaqDsc[0] ;
         A558HisProFec = P08BH4_A558HisProFec[0] ;
         A602MaqCod = P08BH4_A602MaqCod[0] ;
         A396EmprCod = P08BH4_A396EmprCod[0] ;
         A606MaqDsc = P08BH4_A606MaqDsc[0] ;
         n606MaqDsc = P08BH4_n606MaqDsc[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV20Option = A13696BarNHdr ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
            {
               AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
               AV28count = (long)(AV28count+1) ;
               AV26OptionIndexes.removeItem(AV19InsertIndex);
               AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
            }
            else
            {
               AV21Options.add(AV20Option, AV19InsertIndex);
               AV26OptionIndexes.add("1", AV19InsertIndex);
            }
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV42TFFase = AV16SearchTxt ;
      AV43TFFase_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH5 */
      pr_default.execute(3, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8BH6 = false ;
         A396EmprCod = P08BH5_A396EmprCod[0] ;
         A602MaqCod = P08BH5_A602MaqCod[0] ;
         A558HisProFec = P08BH5_A558HisProFec[0] ;
         A606MaqDsc = P08BH5_A606MaqDsc[0] ;
         n606MaqDsc = P08BH5_n606MaqDsc[0] ;
         A606MaqDsc = P08BH5_A606MaqDsc[0] ;
         n606MaqDsc = P08BH5_n606MaqDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08BH5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08BH5_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P08BH5_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) )
         {
            brk8BH6 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8BH6 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A461Fase)==0) )
         {
            AV20Option = A461Fase ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BH6 )
         {
            brk8BH6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADHISPROFOPTIONS' Routine */
      returnInSub = false ;
      AV50TFHisProF = AV16SearchTxt ;
      AV51TFHisProF_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH6 */
      pr_default.execute(4, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8BH8 = false ;
         A396EmprCod = P08BH6_A396EmprCod[0] ;
         A602MaqCod = P08BH6_A602MaqCod[0] ;
         A558HisProFec = P08BH6_A558HisProFec[0] ;
         A606MaqDsc = P08BH6_A606MaqDsc[0] ;
         n606MaqDsc = P08BH6_n606MaqDsc[0] ;
         A606MaqDsc = P08BH6_A606MaqDsc[0] ;
         n606MaqDsc = P08BH6_n606MaqDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08BH6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08BH6_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P08BH6_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) )
         {
            brk8BH8 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8BH8 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A557HisProF)==0) )
         {
            AV20Option = A557HisProF ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A557HisProF, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BH8 )
         {
            brk8BH8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV62TFParCodNom = AV16SearchTxt ;
      AV63TFParCodNom_Sel = "" ;
      AV71Wcpartesproduccionds_1_emprcod = AV64EmprCod ;
      AV72Wcpartesproduccionds_2_maqcod = AV65MaqCod ;
      AV73Wcpartesproduccionds_3_hisprofec = AV66HisProFec ;
      AV74Wcpartesproduccionds_4_tfmaqcod = AV10TFMaqCod ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = AV34TFMaqDsc ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV78Wcpartesproduccionds_8_tfhisprofec = AV12TFHisProFec ;
      AV79Wcpartesproduccionds_9_tfhisprolin = AV14TFHisProLin ;
      AV80Wcpartesproduccionds_10_tfhisprolin_to = AV15TFHisProLin_To ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = AV36TFBarNHdr ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV83Wcpartesproduccionds_13_tfgruopecod = AV38TFGruOpeCod ;
      AV84Wcpartesproduccionds_14_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV85Wcpartesproduccionds_15_tfbarordlin = AV40TFBarOrdLin ;
      AV86Wcpartesproduccionds_16_tfbarordlin_to = AV41TFBarOrdLin_To ;
      AV87Wcpartesproduccionds_17_tffase = AV42TFFase ;
      AV88Wcpartesproduccionds_18_tffase_sel = AV43TFFase_Sel ;
      AV89Wcpartesproduccionds_19_tfhisprodti = AV46TFHisProDTI ;
      AV90Wcpartesproduccionds_20_tfhisprodtf = AV48TFHisProDTF ;
      AV91Wcpartesproduccionds_21_tfhisprof = AV50TFHisProF ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = AV51TFHisProF_Sel ;
      AV93Wcpartesproduccionds_23_tfhisprotur = AV52TFHisProTur ;
      AV94Wcpartesproduccionds_24_tfhisprotur_to = AV53TFHisProTur_To ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = AV54TFHisProKgr ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = AV55TFHisProKgr_To ;
      AV97Wcpartesproduccionds_27_tfhispromtr = AV56TFHisProMtr ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = AV57TFHisProMtr_To ;
      AV99Wcpartesproduccionds_29_tfhispronpzs = AV58TFHisProNpzs ;
      AV100Wcpartesproduccionds_30_tfhispronpzs_to = AV59TFHisProNpzs_To ;
      AV101Wcpartesproduccionds_31_tfparcod = AV60TFParCod ;
      AV102Wcpartesproduccionds_32_tfparcod_to = AV61TFParCod_To ;
      AV103Wcpartesproduccionds_33_tfparcodnom = AV62TFParCodNom ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = AV63TFParCodNom_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV74Wcpartesproduccionds_4_tfmaqcod ,
                                           AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV78Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV79Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV80Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV85Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV86Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV88Wcpartesproduccionds_18_tffase_sel ,
                                           AV87Wcpartesproduccionds_17_tffase ,
                                           AV89Wcpartesproduccionds_19_tfhisprodti ,
                                           AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV91Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV93Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV94Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV97Wcpartesproduccionds_27_tfhispromtr ,
                                           AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV99Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV100Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV101Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV102Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV103Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           A461Fase ,
                                           A557HisProF ,
                                           A867ParCodNom ,
                                           AV71Wcpartesproduccionds_1_emprcod ,
                                           AV72Wcpartesproduccionds_2_maqcod ,
                                           AV73Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV74Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV74Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV76Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BH7 */
      pr_default.execute(5, new Object[] {AV71Wcpartesproduccionds_1_emprcod, AV72Wcpartesproduccionds_2_maqcod, AV73Wcpartesproduccionds_3_hisprofec, lV74Wcpartesproduccionds_4_tfmaqcod, AV75Wcpartesproduccionds_5_tfmaqcod_sel, lV76Wcpartesproduccionds_6_tfmaqdsc, AV77Wcpartesproduccionds_7_tfmaqdsc_sel, AV78Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8BH10 = false ;
         A396EmprCod = P08BH7_A396EmprCod[0] ;
         A602MaqCod = P08BH7_A602MaqCod[0] ;
         A558HisProFec = P08BH7_A558HisProFec[0] ;
         A606MaqDsc = P08BH7_A606MaqDsc[0] ;
         n606MaqDsc = P08BH7_n606MaqDsc[0] ;
         A606MaqDsc = P08BH7_A606MaqDsc[0] ;
         n606MaqDsc = P08BH7_n606MaqDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08BH7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08BH7_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P08BH7_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) )
         {
            brk8BH10 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8BH10 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
         {
            AV20Option = A867ParCodNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BH10 )
         {
            brk8BH10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcpartesproducciongetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcpartesproducciongetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcpartesproducciongetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV34TFMaqDsc = "" ;
      AV35TFMaqDsc_Sel = "" ;
      AV12TFHisProFec = GXutil.nullDate() ;
      AV36TFBarNHdr = "" ;
      AV37TFBarNHdr_Sel = "" ;
      AV42TFFase = "" ;
      AV43TFFase_Sel = "" ;
      AV46TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV48TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV50TFHisProF = "" ;
      AV51TFHisProF_Sel = "" ;
      AV54TFHisProKgr = DecimalUtil.ZERO ;
      AV55TFHisProKgr_To = DecimalUtil.ZERO ;
      AV56TFHisProMtr = DecimalUtil.ZERO ;
      AV57TFHisProMtr_To = DecimalUtil.ZERO ;
      AV62TFParCodNom = "" ;
      AV63TFParCodNom_Sel = "" ;
      AV64EmprCod = "" ;
      AV65MaqCod = "" ;
      AV66HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      AV71Wcpartesproduccionds_1_emprcod = "" ;
      AV72Wcpartesproduccionds_2_maqcod = "" ;
      AV73Wcpartesproduccionds_3_hisprofec = GXutil.nullDate() ;
      AV74Wcpartesproduccionds_4_tfmaqcod = "" ;
      AV75Wcpartesproduccionds_5_tfmaqcod_sel = "" ;
      AV76Wcpartesproduccionds_6_tfmaqdsc = "" ;
      AV77Wcpartesproduccionds_7_tfmaqdsc_sel = "" ;
      AV78Wcpartesproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV81Wcpartesproduccionds_11_tfbarnhdr = "" ;
      AV82Wcpartesproduccionds_12_tfbarnhdr_sel = "" ;
      AV87Wcpartesproduccionds_17_tffase = "" ;
      AV88Wcpartesproduccionds_18_tffase_sel = "" ;
      AV89Wcpartesproduccionds_19_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV90Wcpartesproduccionds_20_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV91Wcpartesproduccionds_21_tfhisprof = "" ;
      AV92Wcpartesproduccionds_22_tfhisprof_sel = "" ;
      AV95Wcpartesproduccionds_25_tfhisprokgr = DecimalUtil.ZERO ;
      AV96Wcpartesproduccionds_26_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV97Wcpartesproduccionds_27_tfhispromtr = DecimalUtil.ZERO ;
      AV98Wcpartesproduccionds_28_tfhispromtr_to = DecimalUtil.ZERO ;
      AV103Wcpartesproduccionds_33_tfparcodnom = "" ;
      AV104Wcpartesproduccionds_34_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV74Wcpartesproduccionds_4_tfmaqcod = "" ;
      lV76Wcpartesproduccionds_6_tfmaqdsc = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A461Fase = "" ;
      A557HisProF = "" ;
      A867ParCodNom = "" ;
      A396EmprCod = "" ;
      P08BH2_A606MaqDsc = new String[] {""} ;
      P08BH2_n606MaqDsc = new boolean[] {false} ;
      P08BH2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH2_A602MaqCod = new String[] {""} ;
      P08BH2_A396EmprCod = new String[] {""} ;
      AV20Option = "" ;
      P08BH3_A396EmprCod = new String[] {""} ;
      P08BH3_A602MaqCod = new String[] {""} ;
      P08BH3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH3_A606MaqDsc = new String[] {""} ;
      P08BH3_n606MaqDsc = new boolean[] {false} ;
      A13696BarNHdr = "" ;
      P08BH4_A606MaqDsc = new String[] {""} ;
      P08BH4_n606MaqDsc = new boolean[] {false} ;
      P08BH4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH4_A602MaqCod = new String[] {""} ;
      P08BH4_A396EmprCod = new String[] {""} ;
      P08BH5_A396EmprCod = new String[] {""} ;
      P08BH5_A602MaqCod = new String[] {""} ;
      P08BH5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH5_A606MaqDsc = new String[] {""} ;
      P08BH5_n606MaqDsc = new boolean[] {false} ;
      P08BH6_A396EmprCod = new String[] {""} ;
      P08BH6_A602MaqCod = new String[] {""} ;
      P08BH6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH6_A606MaqDsc = new String[] {""} ;
      P08BH6_n606MaqDsc = new boolean[] {false} ;
      AV23OptionDesc = "" ;
      P08BH7_A396EmprCod = new String[] {""} ;
      P08BH7_A602MaqCod = new String[] {""} ;
      P08BH7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BH7_A606MaqDsc = new String[] {""} ;
      P08BH7_n606MaqDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BH2_A606MaqDsc, P08BH2_n606MaqDsc, P08BH2_A558HisProFec, P08BH2_A602MaqCod, P08BH2_A396EmprCod
            }
            , new Object[] {
            P08BH3_A396EmprCod, P08BH3_A602MaqCod, P08BH3_A558HisProFec, P08BH3_A606MaqDsc, P08BH3_n606MaqDsc
            }
            , new Object[] {
            P08BH4_A606MaqDsc, P08BH4_n606MaqDsc, P08BH4_A558HisProFec, P08BH4_A602MaqCod, P08BH4_A396EmprCod
            }
            , new Object[] {
            P08BH5_A396EmprCod, P08BH5_A602MaqCod, P08BH5_A558HisProFec, P08BH5_A606MaqDsc, P08BH5_n606MaqDsc
            }
            , new Object[] {
            P08BH6_A396EmprCod, P08BH6_A602MaqCod, P08BH6_A558HisProFec, P08BH6_A606MaqDsc, P08BH6_n606MaqDsc
            }
            , new Object[] {
            P08BH7_A396EmprCod, P08BH7_A602MaqCod, P08BH7_A558HisProFec, P08BH7_A606MaqDsc, P08BH7_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV52TFHisProTur ;
   private byte AV53TFHisProTur_To ;
   private byte AV93Wcpartesproduccionds_23_tfhisprotur ;
   private byte AV94Wcpartesproduccionds_24_tfhisprotur_to ;
   private short AV40TFBarOrdLin ;
   private short AV41TFBarOrdLin_To ;
   private short AV58TFHisProNpzs ;
   private short AV59TFHisProNpzs_To ;
   private short AV60TFParCod ;
   private short AV61TFParCod_To ;
   private short AV85Wcpartesproduccionds_15_tfbarordlin ;
   private short AV86Wcpartesproduccionds_16_tfbarordlin_to ;
   private short AV99Wcpartesproduccionds_29_tfhispronpzs ;
   private short AV100Wcpartesproduccionds_30_tfhispronpzs_to ;
   private short AV101Wcpartesproduccionds_31_tfparcod ;
   private short AV102Wcpartesproduccionds_32_tfparcod_to ;
   private short Gx_err ;
   private int AV69GXV1 ;
   private int AV14TFHisProLin ;
   private int AV15TFHisProLin_To ;
   private int AV38TFGruOpeCod ;
   private int AV39TFGruOpeCod_To ;
   private int AV79Wcpartesproduccionds_9_tfhisprolin ;
   private int AV80Wcpartesproduccionds_10_tfhisprolin_to ;
   private int AV83Wcpartesproduccionds_13_tfgruopecod ;
   private int AV84Wcpartesproduccionds_14_tfgruopecod_to ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV54TFHisProKgr ;
   private java.math.BigDecimal AV55TFHisProKgr_To ;
   private java.math.BigDecimal AV56TFHisProMtr ;
   private java.math.BigDecimal AV57TFHisProMtr_To ;
   private java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ;
   private java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ;
   private java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ;
   private java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV34TFMaqDsc ;
   private String AV35TFMaqDsc_Sel ;
   private String AV36TFBarNHdr ;
   private String AV37TFBarNHdr_Sel ;
   private String AV42TFFase ;
   private String AV43TFFase_Sel ;
   private String AV50TFHisProF ;
   private String AV51TFHisProF_Sel ;
   private String AV62TFParCodNom ;
   private String AV63TFParCodNom_Sel ;
   private String AV64EmprCod ;
   private String AV65MaqCod ;
   private String A602MaqCod ;
   private String AV71Wcpartesproduccionds_1_emprcod ;
   private String AV72Wcpartesproduccionds_2_maqcod ;
   private String AV74Wcpartesproduccionds_4_tfmaqcod ;
   private String AV75Wcpartesproduccionds_5_tfmaqcod_sel ;
   private String AV76Wcpartesproduccionds_6_tfmaqdsc ;
   private String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ;
   private String AV81Wcpartesproduccionds_11_tfbarnhdr ;
   private String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ;
   private String AV87Wcpartesproduccionds_17_tffase ;
   private String AV88Wcpartesproduccionds_18_tffase_sel ;
   private String AV91Wcpartesproduccionds_21_tfhisprof ;
   private String AV92Wcpartesproduccionds_22_tfhisprof_sel ;
   private String AV103Wcpartesproduccionds_33_tfparcodnom ;
   private String AV104Wcpartesproduccionds_34_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV74Wcpartesproduccionds_4_tfmaqcod ;
   private String lV76Wcpartesproduccionds_6_tfmaqdsc ;
   private String A606MaqDsc ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV46TFHisProDTI ;
   private java.util.Date AV48TFHisProDTF ;
   private java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ;
   private java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ;
   private java.util.Date AV12TFHisProFec ;
   private java.util.Date AV66HisProFec ;
   private java.util.Date AV73Wcpartesproduccionds_3_hisprofec ;
   private java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean brk8BH3 ;
   private boolean brk8BH6 ;
   private boolean brk8BH8 ;
   private boolean brk8BH10 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BH2_A606MaqDsc ;
   private boolean[] P08BH2_n606MaqDsc ;
   private java.util.Date[] P08BH2_A558HisProFec ;
   private String[] P08BH2_A602MaqCod ;
   private String[] P08BH2_A396EmprCod ;
   private String[] P08BH3_A396EmprCod ;
   private String[] P08BH3_A602MaqCod ;
   private java.util.Date[] P08BH3_A558HisProFec ;
   private String[] P08BH3_A606MaqDsc ;
   private boolean[] P08BH3_n606MaqDsc ;
   private String[] P08BH4_A606MaqDsc ;
   private boolean[] P08BH4_n606MaqDsc ;
   private java.util.Date[] P08BH4_A558HisProFec ;
   private String[] P08BH4_A602MaqCod ;
   private String[] P08BH4_A396EmprCod ;
   private String[] P08BH5_A396EmprCod ;
   private String[] P08BH5_A602MaqCod ;
   private java.util.Date[] P08BH5_A558HisProFec ;
   private String[] P08BH5_A606MaqDsc ;
   private boolean[] P08BH5_n606MaqDsc ;
   private String[] P08BH6_A396EmprCod ;
   private String[] P08BH6_A602MaqCod ;
   private java.util.Date[] P08BH6_A558HisProFec ;
   private String[] P08BH6_A606MaqDsc ;
   private boolean[] P08BH6_n606MaqDsc ;
   private String[] P08BH7_A396EmprCod ;
   private String[] P08BH7_A602MaqCod ;
   private java.util.Date[] P08BH7_A558HisProFec ;
   private String[] P08BH7_A606MaqDsc ;
   private boolean[] P08BH7_n606MaqDsc ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcpartesproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MaqDsc, NULL AS HisProFec, MaqCod, NULL AS EmprCod FROM ( SELECT T2.MaqDsc, T1.HisProFec, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER" ;
      scmdbuf += " JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08BH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08BH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.MaqDsc, T1.HisProFec, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08BH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08BH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[8];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08BH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV74Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV77Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV76Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV78Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV79Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV80Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV82Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV81Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV83Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV84Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV85Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV86Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV88Wcpartesproduccionds_18_tffase_sel ,
                                          String AV87Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV89Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV90Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV92Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV91Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV93Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV94Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV95Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV96Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV97Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV98Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV99Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV100Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV101Wcpartesproduccionds_31_tfparcod ,
                                          short AV102Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV104Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV103Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          String A867ParCodNom ,
                                          String AV71Wcpartesproduccionds_1_emprcod ,
                                          String AV72Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV73Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[8];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
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
                  return conditional_P08BH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
            case 1 :
                  return conditional_P08BH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
            case 2 :
                  return conditional_P08BH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
            case 3 :
                  return conditional_P08BH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
            case 4 :
                  return conditional_P08BH6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
            case 5 :
                  return conditional_P08BH7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[40] , (String)dynConstraints[43] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08BH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08BH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
      }
   }

}

