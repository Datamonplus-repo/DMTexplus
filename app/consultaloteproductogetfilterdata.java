package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaloteproductogetfilterdata extends GXProcedure
{
   public consultaloteproductogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaloteproductogetfilterdata.class ), "" );
   }

   public consultaloteproductogetfilterdata( int remoteHandle ,
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
      consultaloteproductogetfilterdata.this.aP5 = new String[] {""};
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
      consultaloteproductogetfilterdata.this.AV36DDOName = aP0;
      consultaloteproductogetfilterdata.this.AV37SearchTxt = aP1;
      consultaloteproductogetfilterdata.this.AV38SearchTxtTo = aP2;
      consultaloteproductogetfilterdata.this.aP3 = aP3;
      consultaloteproductogetfilterdata.this.aP4 = aP4;
      consultaloteproductogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTEID") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTEIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTF") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECON") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECONOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTFNM") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFNMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTFNF") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFNFOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("ConsultaLoteProductoGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaLoteProductoGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("ConsultaLoteProductoGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEFEC") == 0 )
         {
            AV10TFLoteFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID") == 0 )
         {
            AV12TFLoteID = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID_SEL") == 0 )
         {
            AV13TFLoteID_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEPED") == 0 )
         {
            AV14TFLotePed = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFLotePed_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF") == 0 )
         {
            AV16TFLoteCtf = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF_SEL") == 0 )
         {
            AV17TFLoteCtf_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON") == 0 )
         {
            AV18TFLoteCon = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON_SEL") == 0 )
         {
            AV19TFLoteCon_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM") == 0 )
         {
            AV20TFLoteCtfNm = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM_SEL") == 0 )
         {
            AV21TFLoteCtfNm_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF") == 0 )
         {
            AV22TFLoteCtfNF = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF_SEL") == 0 )
         {
            AV23TFLoteCtfNF_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV44Prdnum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV45PrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLOTEIDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLoteID = AV37SearchTxt ;
      AV13TFLoteID_Sel = "" ;
      AV50Consultaloteproductods_1_filterfulltext = AV42FilterFullText ;
      AV51Consultaloteproductods_2_tflotefec = AV10TFLoteFec ;
      AV52Consultaloteproductods_3_tfloteid = AV12TFLoteID ;
      AV53Consultaloteproductods_4_tfloteid_sel = AV13TFLoteID_Sel ;
      AV54Consultaloteproductods_5_tfloteped = AV14TFLotePed ;
      AV55Consultaloteproductods_6_tfloteped_to = AV15TFLotePed_To ;
      AV56Consultaloteproductods_7_tflotectf = AV16TFLoteCtf ;
      AV57Consultaloteproductods_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV58Consultaloteproductods_9_tflotecon = AV18TFLoteCon ;
      AV59Consultaloteproductods_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV60Consultaloteproductods_11_tflotectfnm = AV20TFLoteCtfNm ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = AV21TFLoteCtfNm_Sel ;
      AV62Consultaloteproductods_13_tflotectfnf = AV22TFLoteCtfNF ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = AV23TFLoteCtfNF_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Consultaloteproductods_1_filterfulltext ,
                                           AV51Consultaloteproductods_2_tflotefec ,
                                           AV53Consultaloteproductods_4_tfloteid_sel ,
                                           AV52Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV54Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to) ,
                                           AV57Consultaloteproductods_8_tflotectf_sel ,
                                           AV56Consultaloteproductods_7_tflotectf ,
                                           AV59Consultaloteproductods_10_tflotecon_sel ,
                                           AV58Consultaloteproductods_9_tflotecon ,
                                           AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV60Consultaloteproductods_11_tflotectfnm ,
                                           AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV62Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           AV43Emprcod ,
                                           AV44Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV52Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV52Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV56Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV58Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV58Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV60Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV62Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QS2 */
      pr_default.execute(0, new Object[] {AV43Emprcod, AV44Prdnum, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, AV51Consultaloteproductods_2_tflotefec, lV52Consultaloteproductods_3_tfloteid, AV53Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV54Consultaloteproductods_5_tfloteped), Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to), lV56Consultaloteproductods_7_tflotectf, AV57Consultaloteproductods_8_tflotectf_sel, lV58Consultaloteproductods_9_tflotecon, AV59Consultaloteproductods_10_tflotecon_sel, lV60Consultaloteproductods_11_tflotectfnm, AV61Consultaloteproductods_12_tflotectfnm_sel, lV62Consultaloteproductods_13_tflotectfnf, AV63Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9QS2 = false ;
         A719PrdNum = P09QS2_A719PrdNum[0] ;
         A396EmprCod = P09QS2_A396EmprCod[0] ;
         A11664LoteID = P09QS2_A11664LoteID[0] ;
         A12352LoteCtfNF = P09QS2_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09QS2_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09QS2_A11668LoteCon[0] ;
         A11667LoteCtf = P09QS2_A11667LoteCtf[0] ;
         A11666LotePed = P09QS2_A11666LotePed[0] ;
         A11665LoteFec = P09QS2_A11665LoteFec[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09QS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09QS2_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(P09QS2_A11664LoteID[0], A11664LoteID) == 0 ) )
         {
            brk9QS2 = false ;
            A11665LoteFec = P09QS2_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9QS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11664LoteID)==0) )
         {
            AV25Option = A11664LoteID ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QS2 )
         {
            brk9QS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLOTECTFOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLoteCtf = AV37SearchTxt ;
      AV17TFLoteCtf_Sel = "" ;
      AV50Consultaloteproductods_1_filterfulltext = AV42FilterFullText ;
      AV51Consultaloteproductods_2_tflotefec = AV10TFLoteFec ;
      AV52Consultaloteproductods_3_tfloteid = AV12TFLoteID ;
      AV53Consultaloteproductods_4_tfloteid_sel = AV13TFLoteID_Sel ;
      AV54Consultaloteproductods_5_tfloteped = AV14TFLotePed ;
      AV55Consultaloteproductods_6_tfloteped_to = AV15TFLotePed_To ;
      AV56Consultaloteproductods_7_tflotectf = AV16TFLoteCtf ;
      AV57Consultaloteproductods_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV58Consultaloteproductods_9_tflotecon = AV18TFLoteCon ;
      AV59Consultaloteproductods_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV60Consultaloteproductods_11_tflotectfnm = AV20TFLoteCtfNm ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = AV21TFLoteCtfNm_Sel ;
      AV62Consultaloteproductods_13_tflotectfnf = AV22TFLoteCtfNF ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = AV23TFLoteCtfNF_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Consultaloteproductods_1_filterfulltext ,
                                           AV51Consultaloteproductods_2_tflotefec ,
                                           AV53Consultaloteproductods_4_tfloteid_sel ,
                                           AV52Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV54Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to) ,
                                           AV57Consultaloteproductods_8_tflotectf_sel ,
                                           AV56Consultaloteproductods_7_tflotectf ,
                                           AV59Consultaloteproductods_10_tflotecon_sel ,
                                           AV58Consultaloteproductods_9_tflotecon ,
                                           AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV60Consultaloteproductods_11_tflotectfnm ,
                                           AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV62Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV52Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV52Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV56Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV58Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV58Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV60Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV62Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QS3 */
      pr_default.execute(1, new Object[] {AV43Emprcod, AV44Prdnum, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, AV51Consultaloteproductods_2_tflotefec, lV52Consultaloteproductods_3_tfloteid, AV53Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV54Consultaloteproductods_5_tfloteped), Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to), lV56Consultaloteproductods_7_tflotectf, AV57Consultaloteproductods_8_tflotectf_sel, lV58Consultaloteproductods_9_tflotecon, AV59Consultaloteproductods_10_tflotecon_sel, lV60Consultaloteproductods_11_tflotectfnm, AV61Consultaloteproductods_12_tflotectfnm_sel, lV62Consultaloteproductods_13_tflotectfnf, AV63Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9QS4 = false ;
         A396EmprCod = P09QS3_A396EmprCod[0] ;
         A719PrdNum = P09QS3_A719PrdNum[0] ;
         A11667LoteCtf = P09QS3_A11667LoteCtf[0] ;
         A12352LoteCtfNF = P09QS3_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09QS3_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09QS3_A11668LoteCon[0] ;
         A11666LotePed = P09QS3_A11666LotePed[0] ;
         A11664LoteID = P09QS3_A11664LoteID[0] ;
         A11665LoteFec = P09QS3_A11665LoteFec[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09QS3_A11667LoteCtf[0], A11667LoteCtf) == 0 ) )
         {
            brk9QS4 = false ;
            A396EmprCod = P09QS3_A396EmprCod[0] ;
            A719PrdNum = P09QS3_A719PrdNum[0] ;
            A11664LoteID = P09QS3_A11664LoteID[0] ;
            A11665LoteFec = P09QS3_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9QS4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11667LoteCtf)==0) )
         {
            AV25Option = A11667LoteCtf ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A11667LoteCtf, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QS4 )
         {
            brk9QS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLOTECONOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLoteCon = AV37SearchTxt ;
      AV19TFLoteCon_Sel = "" ;
      AV50Consultaloteproductods_1_filterfulltext = AV42FilterFullText ;
      AV51Consultaloteproductods_2_tflotefec = AV10TFLoteFec ;
      AV52Consultaloteproductods_3_tfloteid = AV12TFLoteID ;
      AV53Consultaloteproductods_4_tfloteid_sel = AV13TFLoteID_Sel ;
      AV54Consultaloteproductods_5_tfloteped = AV14TFLotePed ;
      AV55Consultaloteproductods_6_tfloteped_to = AV15TFLotePed_To ;
      AV56Consultaloteproductods_7_tflotectf = AV16TFLoteCtf ;
      AV57Consultaloteproductods_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV58Consultaloteproductods_9_tflotecon = AV18TFLoteCon ;
      AV59Consultaloteproductods_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV60Consultaloteproductods_11_tflotectfnm = AV20TFLoteCtfNm ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = AV21TFLoteCtfNm_Sel ;
      AV62Consultaloteproductods_13_tflotectfnf = AV22TFLoteCtfNF ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = AV23TFLoteCtfNF_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50Consultaloteproductods_1_filterfulltext ,
                                           AV51Consultaloteproductods_2_tflotefec ,
                                           AV53Consultaloteproductods_4_tfloteid_sel ,
                                           AV52Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV54Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to) ,
                                           AV57Consultaloteproductods_8_tflotectf_sel ,
                                           AV56Consultaloteproductods_7_tflotectf ,
                                           AV59Consultaloteproductods_10_tflotecon_sel ,
                                           AV58Consultaloteproductods_9_tflotecon ,
                                           AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV60Consultaloteproductods_11_tflotectfnm ,
                                           AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV62Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV52Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV52Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV56Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV58Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV58Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV60Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV62Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QS4 */
      pr_default.execute(2, new Object[] {AV43Emprcod, AV44Prdnum, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, AV51Consultaloteproductods_2_tflotefec, lV52Consultaloteproductods_3_tfloteid, AV53Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV54Consultaloteproductods_5_tfloteped), Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to), lV56Consultaloteproductods_7_tflotectf, AV57Consultaloteproductods_8_tflotectf_sel, lV58Consultaloteproductods_9_tflotecon, AV59Consultaloteproductods_10_tflotecon_sel, lV60Consultaloteproductods_11_tflotectfnm, AV61Consultaloteproductods_12_tflotectfnm_sel, lV62Consultaloteproductods_13_tflotectfnf, AV63Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9QS6 = false ;
         A396EmprCod = P09QS4_A396EmprCod[0] ;
         A719PrdNum = P09QS4_A719PrdNum[0] ;
         A11668LoteCon = P09QS4_A11668LoteCon[0] ;
         A12352LoteCtfNF = P09QS4_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09QS4_A11711LoteCtfNm[0] ;
         A11667LoteCtf = P09QS4_A11667LoteCtf[0] ;
         A11666LotePed = P09QS4_A11666LotePed[0] ;
         A11664LoteID = P09QS4_A11664LoteID[0] ;
         A11665LoteFec = P09QS4_A11665LoteFec[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09QS4_A11668LoteCon[0], A11668LoteCon) == 0 ) )
         {
            brk9QS6 = false ;
            A396EmprCod = P09QS4_A396EmprCod[0] ;
            A719PrdNum = P09QS4_A719PrdNum[0] ;
            A11664LoteID = P09QS4_A11664LoteID[0] ;
            A11665LoteFec = P09QS4_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9QS6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11668LoteCon)==0) )
         {
            AV25Option = A11668LoteCon ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A11668LoteCon, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QS6 )
         {
            brk9QS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLOTECTFNMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLoteCtfNm = AV37SearchTxt ;
      AV21TFLoteCtfNm_Sel = "" ;
      AV50Consultaloteproductods_1_filterfulltext = AV42FilterFullText ;
      AV51Consultaloteproductods_2_tflotefec = AV10TFLoteFec ;
      AV52Consultaloteproductods_3_tfloteid = AV12TFLoteID ;
      AV53Consultaloteproductods_4_tfloteid_sel = AV13TFLoteID_Sel ;
      AV54Consultaloteproductods_5_tfloteped = AV14TFLotePed ;
      AV55Consultaloteproductods_6_tfloteped_to = AV15TFLotePed_To ;
      AV56Consultaloteproductods_7_tflotectf = AV16TFLoteCtf ;
      AV57Consultaloteproductods_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV58Consultaloteproductods_9_tflotecon = AV18TFLoteCon ;
      AV59Consultaloteproductods_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV60Consultaloteproductods_11_tflotectfnm = AV20TFLoteCtfNm ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = AV21TFLoteCtfNm_Sel ;
      AV62Consultaloteproductods_13_tflotectfnf = AV22TFLoteCtfNF ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = AV23TFLoteCtfNF_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV50Consultaloteproductods_1_filterfulltext ,
                                           AV51Consultaloteproductods_2_tflotefec ,
                                           AV53Consultaloteproductods_4_tfloteid_sel ,
                                           AV52Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV54Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to) ,
                                           AV57Consultaloteproductods_8_tflotectf_sel ,
                                           AV56Consultaloteproductods_7_tflotectf ,
                                           AV59Consultaloteproductods_10_tflotecon_sel ,
                                           AV58Consultaloteproductods_9_tflotecon ,
                                           AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV60Consultaloteproductods_11_tflotectfnm ,
                                           AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV62Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV52Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV52Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV56Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV58Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV58Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV60Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV62Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QS5 */
      pr_default.execute(3, new Object[] {AV43Emprcod, AV44Prdnum, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, AV51Consultaloteproductods_2_tflotefec, lV52Consultaloteproductods_3_tfloteid, AV53Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV54Consultaloteproductods_5_tfloteped), Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to), lV56Consultaloteproductods_7_tflotectf, AV57Consultaloteproductods_8_tflotectf_sel, lV58Consultaloteproductods_9_tflotecon, AV59Consultaloteproductods_10_tflotecon_sel, lV60Consultaloteproductods_11_tflotectfnm, AV61Consultaloteproductods_12_tflotectfnm_sel, lV62Consultaloteproductods_13_tflotectfnf, AV63Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9QS8 = false ;
         A396EmprCod = P09QS5_A396EmprCod[0] ;
         A719PrdNum = P09QS5_A719PrdNum[0] ;
         A11711LoteCtfNm = P09QS5_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = P09QS5_A12352LoteCtfNF[0] ;
         A11668LoteCon = P09QS5_A11668LoteCon[0] ;
         A11667LoteCtf = P09QS5_A11667LoteCtf[0] ;
         A11666LotePed = P09QS5_A11666LotePed[0] ;
         A11664LoteID = P09QS5_A11664LoteID[0] ;
         A11665LoteFec = P09QS5_A11665LoteFec[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09QS5_A11711LoteCtfNm[0], A11711LoteCtfNm) == 0 ) )
         {
            brk9QS8 = false ;
            A396EmprCod = P09QS5_A396EmprCod[0] ;
            A719PrdNum = P09QS5_A719PrdNum[0] ;
            A11664LoteID = P09QS5_A11664LoteID[0] ;
            A11665LoteFec = P09QS5_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9QS8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11711LoteCtfNm)==0) )
         {
            AV25Option = A11711LoteCtfNm ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QS8 )
         {
            brk9QS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLOTECTFNFOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLoteCtfNF = AV37SearchTxt ;
      AV23TFLoteCtfNF_Sel = "" ;
      AV50Consultaloteproductods_1_filterfulltext = AV42FilterFullText ;
      AV51Consultaloteproductods_2_tflotefec = AV10TFLoteFec ;
      AV52Consultaloteproductods_3_tfloteid = AV12TFLoteID ;
      AV53Consultaloteproductods_4_tfloteid_sel = AV13TFLoteID_Sel ;
      AV54Consultaloteproductods_5_tfloteped = AV14TFLotePed ;
      AV55Consultaloteproductods_6_tfloteped_to = AV15TFLotePed_To ;
      AV56Consultaloteproductods_7_tflotectf = AV16TFLoteCtf ;
      AV57Consultaloteproductods_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV58Consultaloteproductods_9_tflotecon = AV18TFLoteCon ;
      AV59Consultaloteproductods_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV60Consultaloteproductods_11_tflotectfnm = AV20TFLoteCtfNm ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = AV21TFLoteCtfNm_Sel ;
      AV62Consultaloteproductods_13_tflotectfnf = AV22TFLoteCtfNF ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = AV23TFLoteCtfNF_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV50Consultaloteproductods_1_filterfulltext ,
                                           AV51Consultaloteproductods_2_tflotefec ,
                                           AV53Consultaloteproductods_4_tfloteid_sel ,
                                           AV52Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV54Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to) ,
                                           AV57Consultaloteproductods_8_tflotectf_sel ,
                                           AV56Consultaloteproductods_7_tflotectf ,
                                           AV59Consultaloteproductods_10_tflotecon_sel ,
                                           AV58Consultaloteproductods_9_tflotecon ,
                                           AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV60Consultaloteproductods_11_tflotectfnm ,
                                           AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV62Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV50Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV52Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV52Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV56Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV58Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV58Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV60Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV62Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QS6 */
      pr_default.execute(4, new Object[] {AV43Emprcod, AV44Prdnum, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, lV50Consultaloteproductods_1_filterfulltext, AV51Consultaloteproductods_2_tflotefec, lV52Consultaloteproductods_3_tfloteid, AV53Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV54Consultaloteproductods_5_tfloteped), Integer.valueOf(AV55Consultaloteproductods_6_tfloteped_to), lV56Consultaloteproductods_7_tflotectf, AV57Consultaloteproductods_8_tflotectf_sel, lV58Consultaloteproductods_9_tflotecon, AV59Consultaloteproductods_10_tflotecon_sel, lV60Consultaloteproductods_11_tflotectfnm, AV61Consultaloteproductods_12_tflotectfnm_sel, lV62Consultaloteproductods_13_tflotectfnf, AV63Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9QS10 = false ;
         A396EmprCod = P09QS6_A396EmprCod[0] ;
         A719PrdNum = P09QS6_A719PrdNum[0] ;
         A12352LoteCtfNF = P09QS6_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09QS6_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09QS6_A11668LoteCon[0] ;
         A11667LoteCtf = P09QS6_A11667LoteCtf[0] ;
         A11666LotePed = P09QS6_A11666LotePed[0] ;
         A11664LoteID = P09QS6_A11664LoteID[0] ;
         A11665LoteFec = P09QS6_A11665LoteFec[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09QS6_A12352LoteCtfNF[0], A12352LoteCtfNF) == 0 ) )
         {
            brk9QS10 = false ;
            A396EmprCod = P09QS6_A396EmprCod[0] ;
            A719PrdNum = P09QS6_A719PrdNum[0] ;
            A11664LoteID = P09QS6_A11664LoteID[0] ;
            A11665LoteFec = P09QS6_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9QS10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A12352LoteCtfNF)==0) )
         {
            AV25Option = A12352LoteCtfNF ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QS10 )
         {
            brk9QS10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultaloteproductogetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = consultaloteproductogetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = consultaloteproductogetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFLoteFec = GXutil.nullDate() ;
      AV12TFLoteID = "" ;
      AV13TFLoteID_Sel = "" ;
      AV16TFLoteCtf = "" ;
      AV17TFLoteCtf_Sel = "" ;
      AV18TFLoteCon = "" ;
      AV19TFLoteCon_Sel = "" ;
      AV20TFLoteCtfNm = "" ;
      AV21TFLoteCtfNm_Sel = "" ;
      AV22TFLoteCtfNF = "" ;
      AV23TFLoteCtfNF_Sel = "" ;
      AV43Emprcod = "" ;
      AV44Prdnum = "" ;
      AV45PrdNom = "" ;
      A11664LoteID = "" ;
      AV50Consultaloteproductods_1_filterfulltext = "" ;
      AV51Consultaloteproductods_2_tflotefec = GXutil.nullDate() ;
      AV52Consultaloteproductods_3_tfloteid = "" ;
      AV53Consultaloteproductods_4_tfloteid_sel = "" ;
      AV56Consultaloteproductods_7_tflotectf = "" ;
      AV57Consultaloteproductods_8_tflotectf_sel = "" ;
      AV58Consultaloteproductods_9_tflotecon = "" ;
      AV59Consultaloteproductods_10_tflotecon_sel = "" ;
      AV60Consultaloteproductods_11_tflotectfnm = "" ;
      AV61Consultaloteproductods_12_tflotectfnm_sel = "" ;
      AV62Consultaloteproductods_13_tflotectfnf = "" ;
      AV63Consultaloteproductods_14_tflotectfnf_sel = "" ;
      scmdbuf = "" ;
      lV50Consultaloteproductods_1_filterfulltext = "" ;
      lV52Consultaloteproductods_3_tfloteid = "" ;
      lV56Consultaloteproductods_7_tflotectf = "" ;
      lV58Consultaloteproductods_9_tflotecon = "" ;
      lV60Consultaloteproductods_11_tflotectfnm = "" ;
      lV62Consultaloteproductods_13_tflotectfnf = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09QS2_A719PrdNum = new String[] {""} ;
      P09QS2_A396EmprCod = new String[] {""} ;
      P09QS2_A11664LoteID = new String[] {""} ;
      P09QS2_A12352LoteCtfNF = new String[] {""} ;
      P09QS2_A11711LoteCtfNm = new String[] {""} ;
      P09QS2_A11668LoteCon = new String[] {""} ;
      P09QS2_A11667LoteCtf = new String[] {""} ;
      P09QS2_A11666LotePed = new int[1] ;
      P09QS2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      AV25Option = "" ;
      P09QS3_A396EmprCod = new String[] {""} ;
      P09QS3_A719PrdNum = new String[] {""} ;
      P09QS3_A11667LoteCtf = new String[] {""} ;
      P09QS3_A12352LoteCtfNF = new String[] {""} ;
      P09QS3_A11711LoteCtfNm = new String[] {""} ;
      P09QS3_A11668LoteCon = new String[] {""} ;
      P09QS3_A11666LotePed = new int[1] ;
      P09QS3_A11664LoteID = new String[] {""} ;
      P09QS3_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      AV27OptionDesc = "" ;
      P09QS4_A396EmprCod = new String[] {""} ;
      P09QS4_A719PrdNum = new String[] {""} ;
      P09QS4_A11668LoteCon = new String[] {""} ;
      P09QS4_A12352LoteCtfNF = new String[] {""} ;
      P09QS4_A11711LoteCtfNm = new String[] {""} ;
      P09QS4_A11667LoteCtf = new String[] {""} ;
      P09QS4_A11666LotePed = new int[1] ;
      P09QS4_A11664LoteID = new String[] {""} ;
      P09QS4_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09QS5_A396EmprCod = new String[] {""} ;
      P09QS5_A719PrdNum = new String[] {""} ;
      P09QS5_A11711LoteCtfNm = new String[] {""} ;
      P09QS5_A12352LoteCtfNF = new String[] {""} ;
      P09QS5_A11668LoteCon = new String[] {""} ;
      P09QS5_A11667LoteCtf = new String[] {""} ;
      P09QS5_A11666LotePed = new int[1] ;
      P09QS5_A11664LoteID = new String[] {""} ;
      P09QS5_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09QS6_A396EmprCod = new String[] {""} ;
      P09QS6_A719PrdNum = new String[] {""} ;
      P09QS6_A12352LoteCtfNF = new String[] {""} ;
      P09QS6_A11711LoteCtfNm = new String[] {""} ;
      P09QS6_A11668LoteCon = new String[] {""} ;
      P09QS6_A11667LoteCtf = new String[] {""} ;
      P09QS6_A11666LotePed = new int[1] ;
      P09QS6_A11664LoteID = new String[] {""} ;
      P09QS6_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultaloteproductogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09QS2_A719PrdNum, P09QS2_A396EmprCod, P09QS2_A11664LoteID, P09QS2_A12352LoteCtfNF, P09QS2_A11711LoteCtfNm, P09QS2_A11668LoteCon, P09QS2_A11667LoteCtf, P09QS2_A11666LotePed, P09QS2_A11665LoteFec
            }
            , new Object[] {
            P09QS3_A396EmprCod, P09QS3_A719PrdNum, P09QS3_A11667LoteCtf, P09QS3_A12352LoteCtfNF, P09QS3_A11711LoteCtfNm, P09QS3_A11668LoteCon, P09QS3_A11666LotePed, P09QS3_A11664LoteID, P09QS3_A11665LoteFec
            }
            , new Object[] {
            P09QS4_A396EmprCod, P09QS4_A719PrdNum, P09QS4_A11668LoteCon, P09QS4_A12352LoteCtfNF, P09QS4_A11711LoteCtfNm, P09QS4_A11667LoteCtf, P09QS4_A11666LotePed, P09QS4_A11664LoteID, P09QS4_A11665LoteFec
            }
            , new Object[] {
            P09QS5_A396EmprCod, P09QS5_A719PrdNum, P09QS5_A11711LoteCtfNm, P09QS5_A12352LoteCtfNF, P09QS5_A11668LoteCon, P09QS5_A11667LoteCtf, P09QS5_A11666LotePed, P09QS5_A11664LoteID, P09QS5_A11665LoteFec
            }
            , new Object[] {
            P09QS6_A396EmprCod, P09QS6_A719PrdNum, P09QS6_A12352LoteCtfNF, P09QS6_A11711LoteCtfNm, P09QS6_A11668LoteCon, P09QS6_A11667LoteCtf, P09QS6_A11666LotePed, P09QS6_A11664LoteID, P09QS6_A11665LoteFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV14TFLotePed ;
   private int AV15TFLotePed_To ;
   private int AV54Consultaloteproductods_5_tfloteped ;
   private int AV55Consultaloteproductods_6_tfloteped_to ;
   private int A11666LotePed ;
   private long AV30count ;
   private String AV12TFLoteID ;
   private String AV13TFLoteID_Sel ;
   private String AV16TFLoteCtf ;
   private String AV17TFLoteCtf_Sel ;
   private String AV18TFLoteCon ;
   private String AV19TFLoteCon_Sel ;
   private String AV20TFLoteCtfNm ;
   private String AV21TFLoteCtfNm_Sel ;
   private String AV22TFLoteCtfNF ;
   private String AV23TFLoteCtfNF_Sel ;
   private String AV43Emprcod ;
   private String AV44Prdnum ;
   private String AV45PrdNom ;
   private String A11664LoteID ;
   private String AV52Consultaloteproductods_3_tfloteid ;
   private String AV53Consultaloteproductods_4_tfloteid_sel ;
   private String AV56Consultaloteproductods_7_tflotectf ;
   private String AV57Consultaloteproductods_8_tflotectf_sel ;
   private String AV58Consultaloteproductods_9_tflotecon ;
   private String AV59Consultaloteproductods_10_tflotecon_sel ;
   private String AV60Consultaloteproductods_11_tflotectfnm ;
   private String AV61Consultaloteproductods_12_tflotectfnm_sel ;
   private String AV62Consultaloteproductods_13_tflotectfnf ;
   private String AV63Consultaloteproductods_14_tflotectfnf_sel ;
   private String scmdbuf ;
   private String lV52Consultaloteproductods_3_tfloteid ;
   private String lV56Consultaloteproductods_7_tflotectf ;
   private String lV58Consultaloteproductods_9_tflotecon ;
   private String lV60Consultaloteproductods_11_tflotectfnm ;
   private String lV62Consultaloteproductods_13_tflotectfnf ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
   private String A11711LoteCtfNm ;
   private String A12352LoteCtfNF ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV10TFLoteFec ;
   private java.util.Date AV51Consultaloteproductods_2_tflotefec ;
   private java.util.Date A11665LoteFec ;
   private boolean returnInSub ;
   private boolean brk9QS2 ;
   private boolean brk9QS4 ;
   private boolean brk9QS6 ;
   private boolean brk9QS8 ;
   private boolean brk9QS10 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV50Consultaloteproductods_1_filterfulltext ;
   private String lV50Consultaloteproductods_1_filterfulltext ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09QS2_A719PrdNum ;
   private String[] P09QS2_A396EmprCod ;
   private String[] P09QS2_A11664LoteID ;
   private String[] P09QS2_A12352LoteCtfNF ;
   private String[] P09QS2_A11711LoteCtfNm ;
   private String[] P09QS2_A11668LoteCon ;
   private String[] P09QS2_A11667LoteCtf ;
   private int[] P09QS2_A11666LotePed ;
   private java.util.Date[] P09QS2_A11665LoteFec ;
   private String[] P09QS3_A396EmprCod ;
   private String[] P09QS3_A719PrdNum ;
   private String[] P09QS3_A11667LoteCtf ;
   private String[] P09QS3_A12352LoteCtfNF ;
   private String[] P09QS3_A11711LoteCtfNm ;
   private String[] P09QS3_A11668LoteCon ;
   private int[] P09QS3_A11666LotePed ;
   private String[] P09QS3_A11664LoteID ;
   private java.util.Date[] P09QS3_A11665LoteFec ;
   private String[] P09QS4_A396EmprCod ;
   private String[] P09QS4_A719PrdNum ;
   private String[] P09QS4_A11668LoteCon ;
   private String[] P09QS4_A12352LoteCtfNF ;
   private String[] P09QS4_A11711LoteCtfNm ;
   private String[] P09QS4_A11667LoteCtf ;
   private int[] P09QS4_A11666LotePed ;
   private String[] P09QS4_A11664LoteID ;
   private java.util.Date[] P09QS4_A11665LoteFec ;
   private String[] P09QS5_A396EmprCod ;
   private String[] P09QS5_A719PrdNum ;
   private String[] P09QS5_A11711LoteCtfNm ;
   private String[] P09QS5_A12352LoteCtfNF ;
   private String[] P09QS5_A11668LoteCon ;
   private String[] P09QS5_A11667LoteCtf ;
   private int[] P09QS5_A11666LotePed ;
   private String[] P09QS5_A11664LoteID ;
   private java.util.Date[] P09QS5_A11665LoteFec ;
   private String[] P09QS6_A396EmprCod ;
   private String[] P09QS6_A719PrdNum ;
   private String[] P09QS6_A12352LoteCtfNF ;
   private String[] P09QS6_A11711LoteCtfNm ;
   private String[] P09QS6_A11668LoteCon ;
   private String[] P09QS6_A11667LoteCtf ;
   private int[] P09QS6_A11666LotePed ;
   private String[] P09QS6_A11664LoteID ;
   private java.util.Date[] P09QS6_A11665LoteFec ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class consultaloteproductogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV51Consultaloteproductods_2_tflotefec ,
                                          String AV53Consultaloteproductods_4_tfloteid_sel ,
                                          String AV52Consultaloteproductods_3_tfloteid ,
                                          int AV54Consultaloteproductods_5_tfloteped ,
                                          int AV55Consultaloteproductods_6_tfloteped_to ,
                                          String AV57Consultaloteproductods_8_tflotectf_sel ,
                                          String AV56Consultaloteproductods_7_tflotectf ,
                                          String AV59Consultaloteproductods_10_tflotecon_sel ,
                                          String AV58Consultaloteproductods_9_tflotecon ,
                                          String AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV60Consultaloteproductods_11_tflotectfnm ,
                                          String AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV62Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String AV43Emprcod ,
                                          String AV44Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, LoteID, LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV52Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV58Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum, LoteID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09QS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV51Consultaloteproductods_2_tflotefec ,
                                          String AV53Consultaloteproductods_4_tfloteid_sel ,
                                          String AV52Consultaloteproductods_3_tfloteid ,
                                          int AV54Consultaloteproductods_5_tfloteped ,
                                          int AV55Consultaloteproductods_6_tfloteped_to ,
                                          String AV57Consultaloteproductods_8_tflotectf_sel ,
                                          String AV56Consultaloteproductods_7_tflotectf ,
                                          String AV59Consultaloteproductods_10_tflotecon_sel ,
                                          String AV58Consultaloteproductods_9_tflotecon ,
                                          String AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV60Consultaloteproductods_11_tflotectfnm ,
                                          String AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV62Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCtf, LoteCtfNF, LoteCtfNm, LoteCon, LotePed, LoteID, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV52Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV58Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtf" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09QS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV51Consultaloteproductods_2_tflotefec ,
                                          String AV53Consultaloteproductods_4_tfloteid_sel ,
                                          String AV52Consultaloteproductods_3_tfloteid ,
                                          int AV54Consultaloteproductods_5_tfloteped ,
                                          int AV55Consultaloteproductods_6_tfloteped_to ,
                                          String AV57Consultaloteproductods_8_tflotectf_sel ,
                                          String AV56Consultaloteproductods_7_tflotectf ,
                                          String AV59Consultaloteproductods_10_tflotecon_sel ,
                                          String AV58Consultaloteproductods_9_tflotecon ,
                                          String AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV60Consultaloteproductods_11_tflotectfnm ,
                                          String AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV62Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCon, LoteCtfNF, LoteCtfNm, LoteCtf, LotePed, LoteID, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV52Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV58Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCon" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09QS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV51Consultaloteproductods_2_tflotefec ,
                                          String AV53Consultaloteproductods_4_tfloteid_sel ,
                                          String AV52Consultaloteproductods_3_tfloteid ,
                                          int AV54Consultaloteproductods_5_tfloteped ,
                                          int AV55Consultaloteproductods_6_tfloteped_to ,
                                          String AV57Consultaloteproductods_8_tflotectf_sel ,
                                          String AV56Consultaloteproductods_7_tflotectf ,
                                          String AV59Consultaloteproductods_10_tflotecon_sel ,
                                          String AV58Consultaloteproductods_9_tflotecon ,
                                          String AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV60Consultaloteproductods_11_tflotectfnm ,
                                          String AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV62Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCtfNm, LoteCtfNF, LoteCon, LoteCtf, LotePed, LoteID, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV52Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV58Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNm" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09QS6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV51Consultaloteproductods_2_tflotefec ,
                                          String AV53Consultaloteproductods_4_tfloteid_sel ,
                                          String AV52Consultaloteproductods_3_tfloteid ,
                                          int AV54Consultaloteproductods_5_tfloteped ,
                                          int AV55Consultaloteproductods_6_tfloteped_to ,
                                          String AV57Consultaloteproductods_8_tflotectf_sel ,
                                          String AV56Consultaloteproductods_7_tflotectf ,
                                          String AV59Consultaloteproductods_10_tflotecon_sel ,
                                          String AV58Consultaloteproductods_9_tflotecon ,
                                          String AV61Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV60Consultaloteproductods_11_tflotectfnm ,
                                          String AV63Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV62Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[21];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed, LoteID, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV50Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV52Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV58Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNF" ;
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
                  return conditional_P09QS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09QS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P09QS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P09QS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P09QS6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QS6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 50);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 50);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 50);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
      }
   }

}

