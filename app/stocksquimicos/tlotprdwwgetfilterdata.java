package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tlotprdwwgetfilterdata extends GXProcedure
{
   public tlotprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlotprdwwgetfilterdata.class ), "" );
   }

   public tlotprdwwgetfilterdata( int remoteHandle ,
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
      tlotprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      tlotprdwwgetfilterdata.this.AV36DDOName = aP0;
      tlotprdwwgetfilterdata.this.AV37SearchTxt = aP1;
      tlotprdwwgetfilterdata.this.AV38SearchTxtTo = aP2;
      tlotprdwwgetfilterdata.this.aP3 = aP3;
      tlotprdwwgetfilterdata.this.aP4 = aP4;
      tlotprdwwgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTFNF") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFNFOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("StocksQuimicos.TLOTPRDWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TLOTPRDWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("StocksQuimicos.TLOTPRDWWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID") == 0 )
         {
            AV10TFLoteID = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID_SEL") == 0 )
         {
            AV11TFLoteID_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEFEC") == 0 )
         {
            AV12TFLoteFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF") == 0 )
         {
            AV20TFLoteCtfNF = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF_SEL") == 0 )
         {
            AV21TFLoteCtfNF_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM") == 0 )
         {
            AV22TFLoteCtfNm = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM_SEL") == 0 )
         {
            AV23TFLoteCtfNm_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLOTEIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLoteID = AV37SearchTxt ;
      AV11TFLoteID_Sel = "" ;
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = AV10TFLoteID ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = AV11TFLoteID_Sel ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = AV12TFLoteFec ;
      AV51Stocksquimicos_tlotprdwwds_5_tfloteped = AV14TFLotePed ;
      AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to = AV15TFLotePed_To ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = AV16TFLoteCtf ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = AV18TFLoteCon ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = AV20TFLoteCtfNF ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = AV21TFLoteCtfNF_Sel ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = AV22TFLoteCtfNm ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = AV23TFLoteCtfNm_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                           AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                           AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                           AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                           Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped) ,
                                           Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) ,
                                           AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                           AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                           AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                           AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                           AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                           AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                           AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                           AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A12352LoteCtfNF ,
                                           A11711LoteCtfNm ,
                                           A11665LoteFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_tlotprdwwds_2_tfloteid), 26, "%") ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = GXutil.padr( GXutil.rtrim( AV53Stocksquimicos_tlotprdwwds_7_tflotectf), 1, "%") ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = GXutil.padr( GXutil.rtrim( AV55Stocksquimicos_tlotprdwwds_9_tflotecon), 1, "%") ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = GXutil.padr( GXutil.rtrim( AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf), 50, "%") ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm), 50, "%") ;
      /* Using cursor P09Y92 */
      pr_default.execute(0, new Object[] {lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV48Stocksquimicos_tlotprdwwds_2_tfloteid, AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel, AV50Stocksquimicos_tlotprdwwds_4_tflotefec, Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped), Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to), lV53Stocksquimicos_tlotprdwwds_7_tflotectf, AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel, lV55Stocksquimicos_tlotprdwwds_9_tflotecon, AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel, lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf, AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel, lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm, AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9Y92 = false ;
         A11664LoteID = P09Y92_A11664LoteID[0] ;
         A11711LoteCtfNm = P09Y92_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = P09Y92_A12352LoteCtfNF[0] ;
         A11668LoteCon = P09Y92_A11668LoteCon[0] ;
         A11667LoteCtf = P09Y92_A11667LoteCtf[0] ;
         A11666LotePed = P09Y92_A11666LotePed[0] ;
         A11665LoteFec = P09Y92_A11665LoteFec[0] ;
         A396EmprCod = P09Y92_A396EmprCod[0] ;
         A719PrdNum = P09Y92_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09Y92_A11664LoteID[0], A11664LoteID) == 0 ) )
         {
            brk9Y92 = false ;
            A11665LoteFec = P09Y92_A11665LoteFec[0] ;
            A396EmprCod = P09Y92_A396EmprCod[0] ;
            A719PrdNum = P09Y92_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9Y92 = true ;
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
         if ( ! brk9Y92 )
         {
            brk9Y92 = true ;
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
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = AV10TFLoteID ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = AV11TFLoteID_Sel ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = AV12TFLoteFec ;
      AV51Stocksquimicos_tlotprdwwds_5_tfloteped = AV14TFLotePed ;
      AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to = AV15TFLotePed_To ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = AV16TFLoteCtf ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = AV18TFLoteCon ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = AV20TFLoteCtfNF ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = AV21TFLoteCtfNF_Sel ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = AV22TFLoteCtfNm ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = AV23TFLoteCtfNm_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                           AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                           AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                           AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                           Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped) ,
                                           Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) ,
                                           AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                           AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                           AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                           AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                           AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                           AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                           AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                           AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A12352LoteCtfNF ,
                                           A11711LoteCtfNm ,
                                           A11665LoteFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_tlotprdwwds_2_tfloteid), 26, "%") ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = GXutil.padr( GXutil.rtrim( AV53Stocksquimicos_tlotprdwwds_7_tflotectf), 1, "%") ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = GXutil.padr( GXutil.rtrim( AV55Stocksquimicos_tlotprdwwds_9_tflotecon), 1, "%") ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = GXutil.padr( GXutil.rtrim( AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf), 50, "%") ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm), 50, "%") ;
      /* Using cursor P09Y93 */
      pr_default.execute(1, new Object[] {lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV48Stocksquimicos_tlotprdwwds_2_tfloteid, AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel, AV50Stocksquimicos_tlotprdwwds_4_tflotefec, Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped), Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to), lV53Stocksquimicos_tlotprdwwds_7_tflotectf, AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel, lV55Stocksquimicos_tlotprdwwds_9_tflotecon, AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel, lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf, AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel, lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm, AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9Y94 = false ;
         A11667LoteCtf = P09Y93_A11667LoteCtf[0] ;
         A11711LoteCtfNm = P09Y93_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = P09Y93_A12352LoteCtfNF[0] ;
         A11668LoteCon = P09Y93_A11668LoteCon[0] ;
         A11666LotePed = P09Y93_A11666LotePed[0] ;
         A11665LoteFec = P09Y93_A11665LoteFec[0] ;
         A11664LoteID = P09Y93_A11664LoteID[0] ;
         A396EmprCod = P09Y93_A396EmprCod[0] ;
         A719PrdNum = P09Y93_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09Y93_A11667LoteCtf[0], A11667LoteCtf) == 0 ) )
         {
            brk9Y94 = false ;
            A11665LoteFec = P09Y93_A11665LoteFec[0] ;
            A11664LoteID = P09Y93_A11664LoteID[0] ;
            A396EmprCod = P09Y93_A396EmprCod[0] ;
            A719PrdNum = P09Y93_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9Y94 = true ;
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
         if ( ! brk9Y94 )
         {
            brk9Y94 = true ;
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
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = AV10TFLoteID ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = AV11TFLoteID_Sel ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = AV12TFLoteFec ;
      AV51Stocksquimicos_tlotprdwwds_5_tfloteped = AV14TFLotePed ;
      AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to = AV15TFLotePed_To ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = AV16TFLoteCtf ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = AV18TFLoteCon ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = AV20TFLoteCtfNF ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = AV21TFLoteCtfNF_Sel ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = AV22TFLoteCtfNm ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = AV23TFLoteCtfNm_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                           AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                           AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                           AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                           Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped) ,
                                           Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) ,
                                           AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                           AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                           AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                           AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                           AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                           AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                           AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                           AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A12352LoteCtfNF ,
                                           A11711LoteCtfNm ,
                                           A11665LoteFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_tlotprdwwds_2_tfloteid), 26, "%") ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = GXutil.padr( GXutil.rtrim( AV53Stocksquimicos_tlotprdwwds_7_tflotectf), 1, "%") ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = GXutil.padr( GXutil.rtrim( AV55Stocksquimicos_tlotprdwwds_9_tflotecon), 1, "%") ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = GXutil.padr( GXutil.rtrim( AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf), 50, "%") ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm), 50, "%") ;
      /* Using cursor P09Y94 */
      pr_default.execute(2, new Object[] {lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV48Stocksquimicos_tlotprdwwds_2_tfloteid, AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel, AV50Stocksquimicos_tlotprdwwds_4_tflotefec, Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped), Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to), lV53Stocksquimicos_tlotprdwwds_7_tflotectf, AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel, lV55Stocksquimicos_tlotprdwwds_9_tflotecon, AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel, lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf, AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel, lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm, AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9Y96 = false ;
         A11668LoteCon = P09Y94_A11668LoteCon[0] ;
         A11711LoteCtfNm = P09Y94_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = P09Y94_A12352LoteCtfNF[0] ;
         A11667LoteCtf = P09Y94_A11667LoteCtf[0] ;
         A11666LotePed = P09Y94_A11666LotePed[0] ;
         A11665LoteFec = P09Y94_A11665LoteFec[0] ;
         A11664LoteID = P09Y94_A11664LoteID[0] ;
         A396EmprCod = P09Y94_A396EmprCod[0] ;
         A719PrdNum = P09Y94_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09Y94_A11668LoteCon[0], A11668LoteCon) == 0 ) )
         {
            brk9Y96 = false ;
            A11665LoteFec = P09Y94_A11665LoteFec[0] ;
            A11664LoteID = P09Y94_A11664LoteID[0] ;
            A396EmprCod = P09Y94_A396EmprCod[0] ;
            A719PrdNum = P09Y94_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9Y96 = true ;
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
         if ( ! brk9Y96 )
         {
            brk9Y96 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLOTECTFNFOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLoteCtfNF = AV37SearchTxt ;
      AV21TFLoteCtfNF_Sel = "" ;
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = AV10TFLoteID ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = AV11TFLoteID_Sel ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = AV12TFLoteFec ;
      AV51Stocksquimicos_tlotprdwwds_5_tfloteped = AV14TFLotePed ;
      AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to = AV15TFLotePed_To ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = AV16TFLoteCtf ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = AV18TFLoteCon ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = AV20TFLoteCtfNF ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = AV21TFLoteCtfNF_Sel ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = AV22TFLoteCtfNm ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = AV23TFLoteCtfNm_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                           AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                           AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                           AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                           Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped) ,
                                           Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) ,
                                           AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                           AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                           AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                           AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                           AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                           AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                           AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                           AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A12352LoteCtfNF ,
                                           A11711LoteCtfNm ,
                                           A11665LoteFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_tlotprdwwds_2_tfloteid), 26, "%") ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = GXutil.padr( GXutil.rtrim( AV53Stocksquimicos_tlotprdwwds_7_tflotectf), 1, "%") ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = GXutil.padr( GXutil.rtrim( AV55Stocksquimicos_tlotprdwwds_9_tflotecon), 1, "%") ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = GXutil.padr( GXutil.rtrim( AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf), 50, "%") ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm), 50, "%") ;
      /* Using cursor P09Y95 */
      pr_default.execute(3, new Object[] {lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV48Stocksquimicos_tlotprdwwds_2_tfloteid, AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel, AV50Stocksquimicos_tlotprdwwds_4_tflotefec, Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped), Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to), lV53Stocksquimicos_tlotprdwwds_7_tflotectf, AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel, lV55Stocksquimicos_tlotprdwwds_9_tflotecon, AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel, lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf, AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel, lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm, AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9Y98 = false ;
         A12352LoteCtfNF = P09Y95_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09Y95_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09Y95_A11668LoteCon[0] ;
         A11667LoteCtf = P09Y95_A11667LoteCtf[0] ;
         A11666LotePed = P09Y95_A11666LotePed[0] ;
         A11665LoteFec = P09Y95_A11665LoteFec[0] ;
         A11664LoteID = P09Y95_A11664LoteID[0] ;
         A396EmprCod = P09Y95_A396EmprCod[0] ;
         A719PrdNum = P09Y95_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09Y95_A12352LoteCtfNF[0], A12352LoteCtfNF) == 0 ) )
         {
            brk9Y98 = false ;
            A11665LoteFec = P09Y95_A11665LoteFec[0] ;
            A11664LoteID = P09Y95_A11664LoteID[0] ;
            A396EmprCod = P09Y95_A396EmprCod[0] ;
            A719PrdNum = P09Y95_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9Y98 = true ;
            pr_default.readNext(3);
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
         if ( ! brk9Y98 )
         {
            brk9Y98 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLOTECTFNMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLoteCtfNm = AV37SearchTxt ;
      AV23TFLoteCtfNm_Sel = "" ;
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = AV10TFLoteID ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = AV11TFLoteID_Sel ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = AV12TFLoteFec ;
      AV51Stocksquimicos_tlotprdwwds_5_tfloteped = AV14TFLotePed ;
      AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to = AV15TFLotePed_To ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = AV16TFLoteCtf ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = AV17TFLoteCtf_Sel ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = AV18TFLoteCon ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = AV19TFLoteCon_Sel ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = AV20TFLoteCtfNF ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = AV21TFLoteCtfNF_Sel ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = AV22TFLoteCtfNm ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = AV23TFLoteCtfNm_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                           AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                           AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                           AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                           Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped) ,
                                           Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) ,
                                           AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                           AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                           AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                           AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                           AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                           AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                           AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                           AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A12352LoteCtfNF ,
                                           A11711LoteCtfNm ,
                                           A11665LoteFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Stocksquimicos_tlotprdwwds_1_filterfulltext), "%", "") ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = GXutil.padr( GXutil.rtrim( AV48Stocksquimicos_tlotprdwwds_2_tfloteid), 26, "%") ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = GXutil.padr( GXutil.rtrim( AV53Stocksquimicos_tlotprdwwds_7_tflotectf), 1, "%") ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = GXutil.padr( GXutil.rtrim( AV55Stocksquimicos_tlotprdwwds_9_tflotecon), 1, "%") ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = GXutil.padr( GXutil.rtrim( AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf), 50, "%") ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm), 50, "%") ;
      /* Using cursor P09Y96 */
      pr_default.execute(4, new Object[] {lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV47Stocksquimicos_tlotprdwwds_1_filterfulltext, lV48Stocksquimicos_tlotprdwwds_2_tfloteid, AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel, AV50Stocksquimicos_tlotprdwwds_4_tflotefec, Integer.valueOf(AV51Stocksquimicos_tlotprdwwds_5_tfloteped), Integer.valueOf(AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to), lV53Stocksquimicos_tlotprdwwds_7_tflotectf, AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel, lV55Stocksquimicos_tlotprdwwds_9_tflotecon, AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel, lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf, AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel, lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm, AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9Y910 = false ;
         A11711LoteCtfNm = P09Y96_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = P09Y96_A12352LoteCtfNF[0] ;
         A11668LoteCon = P09Y96_A11668LoteCon[0] ;
         A11667LoteCtf = P09Y96_A11667LoteCtf[0] ;
         A11666LotePed = P09Y96_A11666LotePed[0] ;
         A11665LoteFec = P09Y96_A11665LoteFec[0] ;
         A11664LoteID = P09Y96_A11664LoteID[0] ;
         A396EmprCod = P09Y96_A396EmprCod[0] ;
         A719PrdNum = P09Y96_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09Y96_A11711LoteCtfNm[0], A11711LoteCtfNm) == 0 ) )
         {
            brk9Y910 = false ;
            A11665LoteFec = P09Y96_A11665LoteFec[0] ;
            A11664LoteID = P09Y96_A11664LoteID[0] ;
            A396EmprCod = P09Y96_A396EmprCod[0] ;
            A719PrdNum = P09Y96_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9Y910 = true ;
            pr_default.readNext(4);
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
         if ( ! brk9Y910 )
         {
            brk9Y910 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tlotprdwwgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = tlotprdwwgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = tlotprdwwgetfilterdata.this.AV41OptionIndexesJson;
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
      AV10TFLoteID = "" ;
      AV11TFLoteID_Sel = "" ;
      AV12TFLoteFec = GXutil.nullDate() ;
      AV16TFLoteCtf = "" ;
      AV17TFLoteCtf_Sel = "" ;
      AV18TFLoteCon = "" ;
      AV19TFLoteCon_Sel = "" ;
      AV20TFLoteCtfNF = "" ;
      AV21TFLoteCtfNF_Sel = "" ;
      AV22TFLoteCtfNm = "" ;
      AV23TFLoteCtfNm_Sel = "" ;
      A11664LoteID = "" ;
      AV47Stocksquimicos_tlotprdwwds_1_filterfulltext = "" ;
      AV48Stocksquimicos_tlotprdwwds_2_tfloteid = "" ;
      AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel = "" ;
      AV50Stocksquimicos_tlotprdwwds_4_tflotefec = GXutil.nullDate() ;
      AV53Stocksquimicos_tlotprdwwds_7_tflotectf = "" ;
      AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel = "" ;
      AV55Stocksquimicos_tlotprdwwds_9_tflotecon = "" ;
      AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel = "" ;
      AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = "" ;
      AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel = "" ;
      AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = "" ;
      AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel = "" ;
      scmdbuf = "" ;
      lV47Stocksquimicos_tlotprdwwds_1_filterfulltext = "" ;
      lV48Stocksquimicos_tlotprdwwds_2_tfloteid = "" ;
      lV53Stocksquimicos_tlotprdwwds_7_tflotectf = "" ;
      lV55Stocksquimicos_tlotprdwwds_9_tflotecon = "" ;
      lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf = "" ;
      lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A12352LoteCtfNF = "" ;
      A11711LoteCtfNm = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      P09Y92_A11664LoteID = new String[] {""} ;
      P09Y92_A11711LoteCtfNm = new String[] {""} ;
      P09Y92_A12352LoteCtfNF = new String[] {""} ;
      P09Y92_A11668LoteCon = new String[] {""} ;
      P09Y92_A11667LoteCtf = new String[] {""} ;
      P09Y92_A11666LotePed = new int[1] ;
      P09Y92_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09Y92_A396EmprCod = new String[] {""} ;
      P09Y92_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV25Option = "" ;
      P09Y93_A11667LoteCtf = new String[] {""} ;
      P09Y93_A11711LoteCtfNm = new String[] {""} ;
      P09Y93_A12352LoteCtfNF = new String[] {""} ;
      P09Y93_A11668LoteCon = new String[] {""} ;
      P09Y93_A11666LotePed = new int[1] ;
      P09Y93_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09Y93_A11664LoteID = new String[] {""} ;
      P09Y93_A396EmprCod = new String[] {""} ;
      P09Y93_A719PrdNum = new String[] {""} ;
      AV27OptionDesc = "" ;
      P09Y94_A11668LoteCon = new String[] {""} ;
      P09Y94_A11711LoteCtfNm = new String[] {""} ;
      P09Y94_A12352LoteCtfNF = new String[] {""} ;
      P09Y94_A11667LoteCtf = new String[] {""} ;
      P09Y94_A11666LotePed = new int[1] ;
      P09Y94_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09Y94_A11664LoteID = new String[] {""} ;
      P09Y94_A396EmprCod = new String[] {""} ;
      P09Y94_A719PrdNum = new String[] {""} ;
      P09Y95_A12352LoteCtfNF = new String[] {""} ;
      P09Y95_A11711LoteCtfNm = new String[] {""} ;
      P09Y95_A11668LoteCon = new String[] {""} ;
      P09Y95_A11667LoteCtf = new String[] {""} ;
      P09Y95_A11666LotePed = new int[1] ;
      P09Y95_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09Y95_A11664LoteID = new String[] {""} ;
      P09Y95_A396EmprCod = new String[] {""} ;
      P09Y95_A719PrdNum = new String[] {""} ;
      P09Y96_A11711LoteCtfNm = new String[] {""} ;
      P09Y96_A12352LoteCtfNF = new String[] {""} ;
      P09Y96_A11668LoteCon = new String[] {""} ;
      P09Y96_A11667LoteCtf = new String[] {""} ;
      P09Y96_A11666LotePed = new int[1] ;
      P09Y96_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09Y96_A11664LoteID = new String[] {""} ;
      P09Y96_A396EmprCod = new String[] {""} ;
      P09Y96_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09Y92_A11664LoteID, P09Y92_A11711LoteCtfNm, P09Y92_A12352LoteCtfNF, P09Y92_A11668LoteCon, P09Y92_A11667LoteCtf, P09Y92_A11666LotePed, P09Y92_A11665LoteFec, P09Y92_A396EmprCod, P09Y92_A719PrdNum
            }
            , new Object[] {
            P09Y93_A11667LoteCtf, P09Y93_A11711LoteCtfNm, P09Y93_A12352LoteCtfNF, P09Y93_A11668LoteCon, P09Y93_A11666LotePed, P09Y93_A11665LoteFec, P09Y93_A11664LoteID, P09Y93_A396EmprCod, P09Y93_A719PrdNum
            }
            , new Object[] {
            P09Y94_A11668LoteCon, P09Y94_A11711LoteCtfNm, P09Y94_A12352LoteCtfNF, P09Y94_A11667LoteCtf, P09Y94_A11666LotePed, P09Y94_A11665LoteFec, P09Y94_A11664LoteID, P09Y94_A396EmprCod, P09Y94_A719PrdNum
            }
            , new Object[] {
            P09Y95_A12352LoteCtfNF, P09Y95_A11711LoteCtfNm, P09Y95_A11668LoteCon, P09Y95_A11667LoteCtf, P09Y95_A11666LotePed, P09Y95_A11665LoteFec, P09Y95_A11664LoteID, P09Y95_A396EmprCod, P09Y95_A719PrdNum
            }
            , new Object[] {
            P09Y96_A11711LoteCtfNm, P09Y96_A12352LoteCtfNF, P09Y96_A11668LoteCon, P09Y96_A11667LoteCtf, P09Y96_A11666LotePed, P09Y96_A11665LoteFec, P09Y96_A11664LoteID, P09Y96_A396EmprCod, P09Y96_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV14TFLotePed ;
   private int AV15TFLotePed_To ;
   private int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ;
   private int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ;
   private int A11666LotePed ;
   private long AV30count ;
   private String AV10TFLoteID ;
   private String AV11TFLoteID_Sel ;
   private String AV16TFLoteCtf ;
   private String AV17TFLoteCtf_Sel ;
   private String AV18TFLoteCon ;
   private String AV19TFLoteCon_Sel ;
   private String AV20TFLoteCtfNF ;
   private String AV21TFLoteCtfNF_Sel ;
   private String AV22TFLoteCtfNm ;
   private String AV23TFLoteCtfNm_Sel ;
   private String A11664LoteID ;
   private String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ;
   private String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ;
   private String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ;
   private String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ;
   private String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ;
   private String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ;
   private String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ;
   private String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ;
   private String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ;
   private String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ;
   private String scmdbuf ;
   private String lV48Stocksquimicos_tlotprdwwds_2_tfloteid ;
   private String lV53Stocksquimicos_tlotprdwwds_7_tflotectf ;
   private String lV55Stocksquimicos_tlotprdwwds_9_tflotecon ;
   private String lV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ;
   private String lV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
   private String A12352LoteCtfNF ;
   private String A11711LoteCtfNm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV12TFLoteFec ;
   private java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ;
   private java.util.Date A11665LoteFec ;
   private boolean returnInSub ;
   private boolean brk9Y92 ;
   private boolean brk9Y94 ;
   private boolean brk9Y96 ;
   private boolean brk9Y98 ;
   private boolean brk9Y910 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ;
   private String lV47Stocksquimicos_tlotprdwwds_1_filterfulltext ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Y92_A11664LoteID ;
   private String[] P09Y92_A11711LoteCtfNm ;
   private String[] P09Y92_A12352LoteCtfNF ;
   private String[] P09Y92_A11668LoteCon ;
   private String[] P09Y92_A11667LoteCtf ;
   private int[] P09Y92_A11666LotePed ;
   private java.util.Date[] P09Y92_A11665LoteFec ;
   private String[] P09Y92_A396EmprCod ;
   private String[] P09Y92_A719PrdNum ;
   private String[] P09Y93_A11667LoteCtf ;
   private String[] P09Y93_A11711LoteCtfNm ;
   private String[] P09Y93_A12352LoteCtfNF ;
   private String[] P09Y93_A11668LoteCon ;
   private int[] P09Y93_A11666LotePed ;
   private java.util.Date[] P09Y93_A11665LoteFec ;
   private String[] P09Y93_A11664LoteID ;
   private String[] P09Y93_A396EmprCod ;
   private String[] P09Y93_A719PrdNum ;
   private String[] P09Y94_A11668LoteCon ;
   private String[] P09Y94_A11711LoteCtfNm ;
   private String[] P09Y94_A12352LoteCtfNF ;
   private String[] P09Y94_A11667LoteCtf ;
   private int[] P09Y94_A11666LotePed ;
   private java.util.Date[] P09Y94_A11665LoteFec ;
   private String[] P09Y94_A11664LoteID ;
   private String[] P09Y94_A396EmprCod ;
   private String[] P09Y94_A719PrdNum ;
   private String[] P09Y95_A12352LoteCtfNF ;
   private String[] P09Y95_A11711LoteCtfNm ;
   private String[] P09Y95_A11668LoteCon ;
   private String[] P09Y95_A11667LoteCtf ;
   private int[] P09Y95_A11666LotePed ;
   private java.util.Date[] P09Y95_A11665LoteFec ;
   private String[] P09Y95_A11664LoteID ;
   private String[] P09Y95_A396EmprCod ;
   private String[] P09Y95_A719PrdNum ;
   private String[] P09Y96_A11711LoteCtfNm ;
   private String[] P09Y96_A12352LoteCtfNF ;
   private String[] P09Y96_A11668LoteCon ;
   private String[] P09Y96_A11667LoteCtf ;
   private int[] P09Y96_A11666LotePed ;
   private java.util.Date[] P09Y96_A11665LoteFec ;
   private String[] P09Y96_A11664LoteID ;
   private String[] P09Y96_A396EmprCod ;
   private String[] P09Y96_A719PrdNum ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tlotprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09Y92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                          String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                          String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                          java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                          int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ,
                                          int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ,
                                          String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                          String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                          String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                          String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                          String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                          String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                          String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                          String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A12352LoteCtfNF ,
                                          String A11711LoteCtfNm ,
                                          java.util.Date A11665LoteFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT LoteID, LoteCtfNm, LoteCtfNF, LoteCon, LoteCtf, LotePed, LoteFec, EmprCod, PrdNum FROM TXPLOTPRD" ;
      if ( ! (GXutil.strcmp("", AV47Stocksquimicos_tlotprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_tlotprdwwds_2_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Stocksquimicos_tlotprdwwds_4_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV51Stocksquimicos_tlotprdwwds_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV53Stocksquimicos_tlotprdwwds_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV55Stocksquimicos_tlotprdwwds_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09Y93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                          String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                          String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                          java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                          int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ,
                                          int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ,
                                          String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                          String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                          String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                          String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                          String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                          String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                          String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                          String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A12352LoteCtfNF ,
                                          String A11711LoteCtfNm ,
                                          java.util.Date A11665LoteFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[19];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LoteCtf, LoteCtfNm, LoteCtfNF, LoteCon, LotePed, LoteFec, LoteID, EmprCod, PrdNum FROM TXPLOTPRD" ;
      if ( ! (GXutil.strcmp("", AV47Stocksquimicos_tlotprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_tlotprdwwds_2_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Stocksquimicos_tlotprdwwds_4_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV51Stocksquimicos_tlotprdwwds_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV53Stocksquimicos_tlotprdwwds_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV55Stocksquimicos_tlotprdwwds_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtf" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09Y94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                          String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                          String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                          java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                          int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ,
                                          int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ,
                                          String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                          String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                          String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                          String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                          String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                          String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                          String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                          String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A12352LoteCtfNF ,
                                          String A11711LoteCtfNm ,
                                          java.util.Date A11665LoteFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT LoteCon, LoteCtfNm, LoteCtfNF, LoteCtf, LotePed, LoteFec, LoteID, EmprCod, PrdNum FROM TXPLOTPRD" ;
      if ( ! (GXutil.strcmp("", AV47Stocksquimicos_tlotprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_tlotprdwwds_2_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Stocksquimicos_tlotprdwwds_4_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV51Stocksquimicos_tlotprdwwds_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV53Stocksquimicos_tlotprdwwds_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV55Stocksquimicos_tlotprdwwds_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCon" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09Y95( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                          String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                          String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                          java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                          int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ,
                                          int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ,
                                          String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                          String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                          String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                          String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                          String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                          String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                          String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                          String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A12352LoteCtfNF ,
                                          String A11711LoteCtfNm ,
                                          java.util.Date A11665LoteFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed, LoteFec, LoteID, EmprCod, PrdNum FROM TXPLOTPRD" ;
      if ( ! (GXutil.strcmp("", AV47Stocksquimicos_tlotprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_tlotprdwwds_2_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Stocksquimicos_tlotprdwwds_4_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV51Stocksquimicos_tlotprdwwds_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV53Stocksquimicos_tlotprdwwds_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV55Stocksquimicos_tlotprdwwds_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNF" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09Y96( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Stocksquimicos_tlotprdwwds_1_filterfulltext ,
                                          String AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel ,
                                          String AV48Stocksquimicos_tlotprdwwds_2_tfloteid ,
                                          java.util.Date AV50Stocksquimicos_tlotprdwwds_4_tflotefec ,
                                          int AV51Stocksquimicos_tlotprdwwds_5_tfloteped ,
                                          int AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to ,
                                          String AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel ,
                                          String AV53Stocksquimicos_tlotprdwwds_7_tflotectf ,
                                          String AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel ,
                                          String AV55Stocksquimicos_tlotprdwwds_9_tflotecon ,
                                          String AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel ,
                                          String AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf ,
                                          String AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel ,
                                          String AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A12352LoteCtfNF ,
                                          String A11711LoteCtfNm ,
                                          java.util.Date A11665LoteFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT LoteCtfNm, LoteCtfNF, LoteCon, LoteCtf, LotePed, LoteFec, LoteID, EmprCod, PrdNum FROM TXPLOTPRD" ;
      if ( ! (GXutil.strcmp("", AV47Stocksquimicos_tlotprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV48Stocksquimicos_tlotprdwwds_2_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Stocksquimicos_tlotprdwwds_3_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Stocksquimicos_tlotprdwwds_4_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV51Stocksquimicos_tlotprdwwds_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Stocksquimicos_tlotprdwwds_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV53Stocksquimicos_tlotprdwwds_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Stocksquimicos_tlotprdwwds_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV55Stocksquimicos_tlotprdwwds_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Stocksquimicos_tlotprdwwds_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV57Stocksquimicos_tlotprdwwds_11_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Stocksquimicos_tlotprdwwds_12_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_tlotprdwwds_13_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_tlotprdwwds_14_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNm" ;
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
                  return conditional_P09Y92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
            case 1 :
                  return conditional_P09Y93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
            case 2 :
                  return conditional_P09Y94(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
            case 3 :
                  return conditional_P09Y95(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
            case 4 :
                  return conditional_P09Y96(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Y92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Y93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Y94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Y95", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Y96", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 50);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 50);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 50);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 50);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 50);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 50);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 50);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 50);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 50);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 50);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 50);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 50);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 50);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 50);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 50);
               }
               return;
      }
   }

}

