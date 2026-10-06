package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttproducwwgetfilterdata extends GXProcedure
{
   public ttproducwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttproducwwgetfilterdata.class ), "" );
   }

   public ttproducwwgetfilterdata( int remoteHandle ,
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
      ttproducwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttproducwwgetfilterdata.this.AV52DDOName = aP0;
      ttproducwwgetfilterdata.this.AV50SearchTxt = aP1;
      ttproducwwgetfilterdata.this.AV51SearchTxtTo = aP2;
      ttproducwwgetfilterdata.this.aP3 = aP3;
      ttproducwwgetfilterdata.this.aP4 = aP4;
      ttproducwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDREC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDRECOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDGOTS") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDGOTSOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDREACH") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDREACHOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDHM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDHMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDTHELIST") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDTHELISTOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDHS") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDHSOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRDNUM2") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUM2OPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV56OptionsJson = AV55Options.toJSonString(false) ;
      AV59OptionsDescJson = AV58OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("TTproducWWGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTproducWWGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("TTproducWWGridState"), null, null);
      }
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV10TFPrdNom = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV11TFPrdNom_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV14TFPrdExiAlm = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdExiAlm_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV16TFPrdCanRes = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdCanRes_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV18TFPrdDisponible = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdDisponible_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV20TFPrdCanPen = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdCanPen_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV22TFPrdPreAct = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdPreAct_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV24TFValDsc = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV25TFValDsc_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV26TFPrdRec = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV27TFPrdRec_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV28TFPrdAox = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPrdAox_To = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV30TFPrdGots = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV31TFPrdGots_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV32TFPrdReach = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV33TFPrdReach_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV34TFPrdOkotex_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV35TFPrdOkotex_Sels.fromJSonString(AV34TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV36TFPrdHm = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV37TFPrdHm_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV38TFPrdZDHC_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV39TFPrdZDHC_Sels.fromJSonString(AV38TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV40TFPrdList_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV41TFPrdList_Sels.fromJSonString(AV40TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV42TFPrdTHELIST = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV43TFPrdTHELIST_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV44TFPrdHS = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV45TFPrdHS_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV46TFPrdFHS = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV47TFPrdFHS_To = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV48TFPrdNum2 = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV49TFPrdNum2_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNom = AV50SearchTxt ;
      AV11TFPrdNom_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU2 */
      pr_default.execute(0, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8NU2 = false ;
         A396EmprCod = P08NU2_A396EmprCod[0] ;
         A856ValCod = P08NU2_A856ValCod[0] ;
         A718PrdNom = P08NU2_A718PrdNom[0] ;
         A4693PrdNum2 = P08NU2_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU2_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU2_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU2_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU2_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU2_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU2_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU2_A5887PrdReach[0] ;
         A11363PrdGots = P08NU2_A11363PrdGots[0] ;
         A9733PrdAox = P08NU2_A9733PrdAox[0] ;
         A727PrdRec = P08NU2_A727PrdRec[0] ;
         A857ValDsc = P08NU2_A857ValDsc[0] ;
         n857ValDsc = P08NU2_n857ValDsc[0] ;
         A724PrdPreAct = P08NU2_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU2_A684PrdCanPen[0] ;
         A719PrdNum = P08NU2_A719PrdNum[0] ;
         A685PrdCanRes = P08NU2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU2_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU2_A857ValDsc[0] ;
         n857ValDsc = P08NU2_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08NU2_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8NU2 = false ;
            A396EmprCod = P08NU2_A396EmprCod[0] ;
            A719PrdNum = P08NU2_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV54Option = A718PrdNom ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU2 )
         {
            brk8NU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV50SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU3 */
      pr_default.execute(1, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8NU4 = false ;
         A396EmprCod = P08NU3_A396EmprCod[0] ;
         A856ValCod = P08NU3_A856ValCod[0] ;
         A719PrdNum = P08NU3_A719PrdNum[0] ;
         A4693PrdNum2 = P08NU3_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU3_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU3_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU3_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU3_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU3_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU3_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU3_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU3_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU3_A5887PrdReach[0] ;
         A11363PrdGots = P08NU3_A11363PrdGots[0] ;
         A9733PrdAox = P08NU3_A9733PrdAox[0] ;
         A727PrdRec = P08NU3_A727PrdRec[0] ;
         A857ValDsc = P08NU3_A857ValDsc[0] ;
         n857ValDsc = P08NU3_n857ValDsc[0] ;
         A724PrdPreAct = P08NU3_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU3_A684PrdCanPen[0] ;
         A718PrdNom = P08NU3_A718PrdNom[0] ;
         A685PrdCanRes = P08NU3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU3_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU3_A857ValDsc[0] ;
         n857ValDsc = P08NU3_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08NU3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8NU4 = false ;
            A396EmprCod = P08NU3_A396EmprCod[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV54Option = A719PrdNum ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU4 )
         {
            brk8NU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFValDsc = AV50SearchTxt ;
      AV25TFValDsc_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU4 */
      pr_default.execute(2, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8NU6 = false ;
         A856ValCod = P08NU4_A856ValCod[0] ;
         A396EmprCod = P08NU4_A396EmprCod[0] ;
         A4693PrdNum2 = P08NU4_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU4_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU4_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU4_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU4_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU4_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU4_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU4_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU4_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU4_A5887PrdReach[0] ;
         A11363PrdGots = P08NU4_A11363PrdGots[0] ;
         A9733PrdAox = P08NU4_A9733PrdAox[0] ;
         A727PrdRec = P08NU4_A727PrdRec[0] ;
         A857ValDsc = P08NU4_A857ValDsc[0] ;
         n857ValDsc = P08NU4_n857ValDsc[0] ;
         A724PrdPreAct = P08NU4_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU4_A684PrdCanPen[0] ;
         A719PrdNum = P08NU4_A719PrdNum[0] ;
         A718PrdNom = P08NU4_A718PrdNom[0] ;
         A685PrdCanRes = P08NU4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU4_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU4_A857ValDsc[0] ;
         n857ValDsc = P08NU4_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08NU4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08NU4_A856ValCod[0] == A856ValCod ) )
         {
            brk8NU6 = false ;
            A719PrdNum = P08NU4_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV54Option = A857ValDsc ;
            AV53InsertIndex = 1 ;
            while ( ( AV53InsertIndex <= AV55Options.size() ) && ( GXutil.strcmp((String)AV55Options.elementAt(-1+AV53InsertIndex), AV54Option) < 0 ) )
            {
               AV53InsertIndex = (int)(AV53InsertIndex+1) ;
            }
            AV55Options.add(AV54Option, AV53InsertIndex);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), AV53InsertIndex);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU6 )
         {
            brk8NU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDRECOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrdRec = AV50SearchTxt ;
      AV27TFPrdRec_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU5 */
      pr_default.execute(3, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8NU8 = false ;
         A396EmprCod = P08NU5_A396EmprCod[0] ;
         A856ValCod = P08NU5_A856ValCod[0] ;
         A727PrdRec = P08NU5_A727PrdRec[0] ;
         A4693PrdNum2 = P08NU5_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU5_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU5_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU5_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU5_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU5_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU5_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU5_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU5_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU5_A5887PrdReach[0] ;
         A11363PrdGots = P08NU5_A11363PrdGots[0] ;
         A9733PrdAox = P08NU5_A9733PrdAox[0] ;
         A857ValDsc = P08NU5_A857ValDsc[0] ;
         n857ValDsc = P08NU5_n857ValDsc[0] ;
         A724PrdPreAct = P08NU5_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU5_A684PrdCanPen[0] ;
         A719PrdNum = P08NU5_A719PrdNum[0] ;
         A718PrdNom = P08NU5_A718PrdNom[0] ;
         A685PrdCanRes = P08NU5_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU5_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU5_A857ValDsc[0] ;
         n857ValDsc = P08NU5_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08NU5_A727PrdRec[0], A727PrdRec) == 0 ) )
         {
            brk8NU8 = false ;
            A396EmprCod = P08NU5_A396EmprCod[0] ;
            A719PrdNum = P08NU5_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A727PrdRec)==0) )
         {
            AV54Option = A727PrdRec ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU8 )
         {
            brk8NU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRDGOTSOPTIONS' Routine */
      returnInSub = false ;
      AV30TFPrdGots = AV50SearchTxt ;
      AV31TFPrdGots_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU6 */
      pr_default.execute(4, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8NU10 = false ;
         A396EmprCod = P08NU6_A396EmprCod[0] ;
         A856ValCod = P08NU6_A856ValCod[0] ;
         A11363PrdGots = P08NU6_A11363PrdGots[0] ;
         A4693PrdNum2 = P08NU6_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU6_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU6_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU6_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU6_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU6_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU6_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU6_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU6_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU6_A5887PrdReach[0] ;
         A9733PrdAox = P08NU6_A9733PrdAox[0] ;
         A727PrdRec = P08NU6_A727PrdRec[0] ;
         A857ValDsc = P08NU6_A857ValDsc[0] ;
         n857ValDsc = P08NU6_n857ValDsc[0] ;
         A724PrdPreAct = P08NU6_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU6_A684PrdCanPen[0] ;
         A719PrdNum = P08NU6_A719PrdNum[0] ;
         A718PrdNom = P08NU6_A718PrdNom[0] ;
         A685PrdCanRes = P08NU6_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU6_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU6_A857ValDsc[0] ;
         n857ValDsc = P08NU6_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08NU6_A11363PrdGots[0], A11363PrdGots) == 0 ) )
         {
            brk8NU10 = false ;
            A396EmprCod = P08NU6_A396EmprCod[0] ;
            A719PrdNum = P08NU6_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A11363PrdGots)==0) )
         {
            AV54Option = A11363PrdGots ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU10 )
         {
            brk8NU10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRDREACHOPTIONS' Routine */
      returnInSub = false ;
      AV32TFPrdReach = AV50SearchTxt ;
      AV33TFPrdReach_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU7 */
      pr_default.execute(5, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8NU12 = false ;
         A396EmprCod = P08NU7_A396EmprCod[0] ;
         A856ValCod = P08NU7_A856ValCod[0] ;
         A5887PrdReach = P08NU7_A5887PrdReach[0] ;
         A4693PrdNum2 = P08NU7_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU7_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU7_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU7_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU7_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU7_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU7_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU7_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU7_A5888PrdOkotex[0] ;
         A11363PrdGots = P08NU7_A11363PrdGots[0] ;
         A9733PrdAox = P08NU7_A9733PrdAox[0] ;
         A727PrdRec = P08NU7_A727PrdRec[0] ;
         A857ValDsc = P08NU7_A857ValDsc[0] ;
         n857ValDsc = P08NU7_n857ValDsc[0] ;
         A724PrdPreAct = P08NU7_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU7_A684PrdCanPen[0] ;
         A719PrdNum = P08NU7_A719PrdNum[0] ;
         A718PrdNom = P08NU7_A718PrdNom[0] ;
         A685PrdCanRes = P08NU7_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU7_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU7_A857ValDsc[0] ;
         n857ValDsc = P08NU7_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08NU7_A5887PrdReach[0], A5887PrdReach) == 0 ) )
         {
            brk8NU12 = false ;
            A396EmprCod = P08NU7_A396EmprCod[0] ;
            A719PrdNum = P08NU7_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5887PrdReach)==0) )
         {
            AV54Option = A5887PrdReach ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU12 )
         {
            brk8NU12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRDHMOPTIONS' Routine */
      returnInSub = false ;
      AV36TFPrdHm = AV50SearchTxt ;
      AV37TFPrdHm_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU8 */
      pr_default.execute(6, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8NU14 = false ;
         A396EmprCod = P08NU8_A396EmprCod[0] ;
         A856ValCod = P08NU8_A856ValCod[0] ;
         A11364PrdHm = P08NU8_A11364PrdHm[0] ;
         A4693PrdNum2 = P08NU8_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU8_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU8_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU8_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU8_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU8_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU8_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08NU8_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU8_A5887PrdReach[0] ;
         A11363PrdGots = P08NU8_A11363PrdGots[0] ;
         A9733PrdAox = P08NU8_A9733PrdAox[0] ;
         A727PrdRec = P08NU8_A727PrdRec[0] ;
         A857ValDsc = P08NU8_A857ValDsc[0] ;
         n857ValDsc = P08NU8_n857ValDsc[0] ;
         A724PrdPreAct = P08NU8_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU8_A684PrdCanPen[0] ;
         A719PrdNum = P08NU8_A719PrdNum[0] ;
         A718PrdNom = P08NU8_A718PrdNom[0] ;
         A685PrdCanRes = P08NU8_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU8_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU8_A857ValDsc[0] ;
         n857ValDsc = P08NU8_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08NU8_A11364PrdHm[0], A11364PrdHm) == 0 ) )
         {
            brk8NU14 = false ;
            A396EmprCod = P08NU8_A396EmprCod[0] ;
            A719PrdNum = P08NU8_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A11364PrdHm)==0) )
         {
            AV54Option = A11364PrdHm ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU14 )
         {
            brk8NU14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADPRDTHELISTOPTIONS' Routine */
      returnInSub = false ;
      AV42TFPrdTHELIST = AV50SearchTxt ;
      AV43TFPrdTHELIST_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU9 */
      pr_default.execute(7, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8NU16 = false ;
         A396EmprCod = P08NU9_A396EmprCod[0] ;
         A856ValCod = P08NU9_A856ValCod[0] ;
         A13302PrdTHELIST = P08NU9_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU9_n13302PrdTHELIST[0] ;
         A4693PrdNum2 = P08NU9_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU9_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU9_A9741PrdHS[0] ;
         A11687PrdList = P08NU9_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU9_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU9_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU9_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU9_A5887PrdReach[0] ;
         A11363PrdGots = P08NU9_A11363PrdGots[0] ;
         A9733PrdAox = P08NU9_A9733PrdAox[0] ;
         A727PrdRec = P08NU9_A727PrdRec[0] ;
         A857ValDsc = P08NU9_A857ValDsc[0] ;
         n857ValDsc = P08NU9_n857ValDsc[0] ;
         A724PrdPreAct = P08NU9_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU9_A684PrdCanPen[0] ;
         A719PrdNum = P08NU9_A719PrdNum[0] ;
         A718PrdNom = P08NU9_A718PrdNom[0] ;
         A685PrdCanRes = P08NU9_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU9_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU9_A857ValDsc[0] ;
         n857ValDsc = P08NU9_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08NU9_A13302PrdTHELIST[0], A13302PrdTHELIST) == 0 ) )
         {
            brk8NU16 = false ;
            A396EmprCod = P08NU9_A396EmprCod[0] ;
            A719PrdNum = P08NU9_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A13302PrdTHELIST)==0) )
         {
            AV54Option = A13302PrdTHELIST ;
            AV57OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!"))) ;
            AV55Options.add(AV54Option, 0);
            AV58OptionsDesc.add(AV57OptionDesc, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU16 )
         {
            brk8NU16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPRDHSOPTIONS' Routine */
      returnInSub = false ;
      AV44TFPrdHS = AV50SearchTxt ;
      AV45TFPrdHS_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU10 */
      pr_default.execute(8, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8NU18 = false ;
         A396EmprCod = P08NU10_A396EmprCod[0] ;
         A856ValCod = P08NU10_A856ValCod[0] ;
         A9741PrdHS = P08NU10_A9741PrdHS[0] ;
         A4693PrdNum2 = P08NU10_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU10_A9742PrdFHS[0] ;
         A13302PrdTHELIST = P08NU10_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU10_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU10_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU10_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU10_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU10_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU10_A5887PrdReach[0] ;
         A11363PrdGots = P08NU10_A11363PrdGots[0] ;
         A9733PrdAox = P08NU10_A9733PrdAox[0] ;
         A727PrdRec = P08NU10_A727PrdRec[0] ;
         A857ValDsc = P08NU10_A857ValDsc[0] ;
         n857ValDsc = P08NU10_n857ValDsc[0] ;
         A724PrdPreAct = P08NU10_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU10_A684PrdCanPen[0] ;
         A719PrdNum = P08NU10_A719PrdNum[0] ;
         A718PrdNom = P08NU10_A718PrdNom[0] ;
         A685PrdCanRes = P08NU10_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU10_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU10_A857ValDsc[0] ;
         n857ValDsc = P08NU10_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08NU10_A9741PrdHS[0], A9741PrdHS) == 0 ) )
         {
            brk8NU18 = false ;
            A396EmprCod = P08NU10_A396EmprCod[0] ;
            A719PrdNum = P08NU10_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A9741PrdHS)==0) )
         {
            AV54Option = A9741PrdHS ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU18 )
         {
            brk8NU18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADPRDNUM2OPTIONS' Routine */
      returnInSub = false ;
      AV48TFPrdNum2 = AV50SearchTxt ;
      AV49TFPrdNum2_Sel = "" ;
      AV72Ttproducwwds_1_tfprdnom = AV10TFPrdNom ;
      AV73Ttproducwwds_2_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV74Ttproducwwds_3_tfprdnum = AV12TFPrdNum ;
      AV75Ttproducwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV76Ttproducwwds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV77Ttproducwwds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV78Ttproducwwds_7_tfprdcanres = AV16TFPrdCanRes ;
      AV79Ttproducwwds_8_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV80Ttproducwwds_9_tfprddisponible = AV18TFPrdDisponible ;
      AV81Ttproducwwds_10_tfprddisponible_to = AV19TFPrdDisponible_To ;
      AV82Ttproducwwds_11_tfprdcanpen = AV20TFPrdCanPen ;
      AV83Ttproducwwds_12_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV84Ttproducwwds_13_tfprdpreact = AV22TFPrdPreAct ;
      AV85Ttproducwwds_14_tfprdpreact_to = AV23TFPrdPreAct_To ;
      AV86Ttproducwwds_15_tfvaldsc = AV24TFValDsc ;
      AV87Ttproducwwds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      AV88Ttproducwwds_17_tfprdrec = AV26TFPrdRec ;
      AV89Ttproducwwds_18_tfprdrec_sel = AV27TFPrdRec_Sel ;
      AV90Ttproducwwds_19_tfprdaox = AV28TFPrdAox ;
      AV91Ttproducwwds_20_tfprdaox_to = AV29TFPrdAox_To ;
      AV92Ttproducwwds_21_tfprdgots = AV30TFPrdGots ;
      AV93Ttproducwwds_22_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV94Ttproducwwds_23_tfprdreach = AV32TFPrdReach ;
      AV95Ttproducwwds_24_tfprdreach_sel = AV33TFPrdReach_Sel ;
      AV96Ttproducwwds_25_tfprdokotex_sels = AV35TFPrdOkotex_Sels ;
      AV97Ttproducwwds_26_tfprdhm = AV36TFPrdHm ;
      AV98Ttproducwwds_27_tfprdhm_sel = AV37TFPrdHm_Sel ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = AV39TFPrdZDHC_Sels ;
      AV100Ttproducwwds_29_tfprdlist_sels = AV41TFPrdList_Sels ;
      AV101Ttproducwwds_30_tfprdthelist = AV42TFPrdTHELIST ;
      AV102Ttproducwwds_31_tfprdthelist_sel = AV43TFPrdTHELIST_Sel ;
      AV103Ttproducwwds_32_tfprdhs = AV44TFPrdHS ;
      AV104Ttproducwwds_33_tfprdhs_sel = AV45TFPrdHS_Sel ;
      AV105Ttproducwwds_34_tfprdfhs = AV46TFPrdFHS ;
      AV106Ttproducwwds_35_tfprdfhs_to = AV47TFPrdFHS_To ;
      AV107Ttproducwwds_36_tfprdnum2 = AV48TFPrdNum2 ;
      AV108Ttproducwwds_37_tfprdnum2_sel = AV49TFPrdNum2_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV100Ttproducwwds_29_tfprdlist_sels ,
                                           AV73Ttproducwwds_2_tfprdnom_sel ,
                                           AV72Ttproducwwds_1_tfprdnom ,
                                           AV75Ttproducwwds_4_tfprdnum_sel ,
                                           AV74Ttproducwwds_3_tfprdnum ,
                                           AV76Ttproducwwds_5_tfprdexialm ,
                                           AV77Ttproducwwds_6_tfprdexialm_to ,
                                           AV78Ttproducwwds_7_tfprdcanres ,
                                           AV79Ttproducwwds_8_tfprdcanres_to ,
                                           AV80Ttproducwwds_9_tfprddisponible ,
                                           AV81Ttproducwwds_10_tfprddisponible_to ,
                                           AV82Ttproducwwds_11_tfprdcanpen ,
                                           AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           AV84Ttproducwwds_13_tfprdpreact ,
                                           AV85Ttproducwwds_14_tfprdpreact_to ,
                                           AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           AV86Ttproducwwds_15_tfvaldsc ,
                                           AV89Ttproducwwds_18_tfprdrec_sel ,
                                           AV88Ttproducwwds_17_tfprdrec ,
                                           AV90Ttproducwwds_19_tfprdaox ,
                                           AV91Ttproducwwds_20_tfprdaox_to ,
                                           AV93Ttproducwwds_22_tfprdgots_sel ,
                                           AV92Ttproducwwds_21_tfprdgots ,
                                           AV95Ttproducwwds_24_tfprdreach_sel ,
                                           AV94Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV96Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV98Ttproducwwds_27_tfprdhm_sel ,
                                           AV97Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV99Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV100Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           AV101Ttproducwwds_30_tfprdthelist ,
                                           AV104Ttproducwwds_33_tfprdhs_sel ,
                                           AV103Ttproducwwds_32_tfprdhs ,
                                           AV105Ttproducwwds_34_tfprdfhs ,
                                           AV106Ttproducwwds_35_tfprdfhs_to ,
                                           AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           AV107Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV72Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV74Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV74Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV86Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV86Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV88Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV88Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV92Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV92Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV94Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV94Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV97Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV97Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV101Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV101Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV103Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV103Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV107Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV107Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor P08NU11 */
      pr_default.execute(9, new Object[] {lV72Ttproducwwds_1_tfprdnom, AV73Ttproducwwds_2_tfprdnom_sel, lV74Ttproducwwds_3_tfprdnum, AV75Ttproducwwds_4_tfprdnum_sel, AV76Ttproducwwds_5_tfprdexialm, AV77Ttproducwwds_6_tfprdexialm_to, AV78Ttproducwwds_7_tfprdcanres, AV79Ttproducwwds_8_tfprdcanres_to, AV80Ttproducwwds_9_tfprddisponible, AV81Ttproducwwds_10_tfprddisponible_to, AV82Ttproducwwds_11_tfprdcanpen, AV83Ttproducwwds_12_tfprdcanpen_to, AV84Ttproducwwds_13_tfprdpreact, AV85Ttproducwwds_14_tfprdpreact_to, lV86Ttproducwwds_15_tfvaldsc, AV87Ttproducwwds_16_tfvaldsc_sel, lV88Ttproducwwds_17_tfprdrec, AV89Ttproducwwds_18_tfprdrec_sel, AV90Ttproducwwds_19_tfprdaox, AV91Ttproducwwds_20_tfprdaox_to, lV92Ttproducwwds_21_tfprdgots, AV93Ttproducwwds_22_tfprdgots_sel, lV94Ttproducwwds_23_tfprdreach, AV95Ttproducwwds_24_tfprdreach_sel, lV97Ttproducwwds_26_tfprdhm, AV98Ttproducwwds_27_tfprdhm_sel, lV101Ttproducwwds_30_tfprdthelist, AV102Ttproducwwds_31_tfprdthelist_sel, lV103Ttproducwwds_32_tfprdhs, AV104Ttproducwwds_33_tfprdhs_sel, AV105Ttproducwwds_34_tfprdfhs, AV106Ttproducwwds_35_tfprdfhs_to, lV107Ttproducwwds_36_tfprdnum2, AV108Ttproducwwds_37_tfprdnum2_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk8NU20 = false ;
         A396EmprCod = P08NU11_A396EmprCod[0] ;
         A856ValCod = P08NU11_A856ValCod[0] ;
         A4693PrdNum2 = P08NU11_A4693PrdNum2[0] ;
         A9742PrdFHS = P08NU11_A9742PrdFHS[0] ;
         A9741PrdHS = P08NU11_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08NU11_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08NU11_n13302PrdTHELIST[0] ;
         A11687PrdList = P08NU11_A11687PrdList[0] ;
         A13301PrdZDHC = P08NU11_A13301PrdZDHC[0] ;
         A11364PrdHm = P08NU11_A11364PrdHm[0] ;
         A5888PrdOkotex = P08NU11_A5888PrdOkotex[0] ;
         A5887PrdReach = P08NU11_A5887PrdReach[0] ;
         A11363PrdGots = P08NU11_A11363PrdGots[0] ;
         A9733PrdAox = P08NU11_A9733PrdAox[0] ;
         A727PrdRec = P08NU11_A727PrdRec[0] ;
         A857ValDsc = P08NU11_A857ValDsc[0] ;
         n857ValDsc = P08NU11_n857ValDsc[0] ;
         A724PrdPreAct = P08NU11_A724PrdPreAct[0] ;
         A684PrdCanPen = P08NU11_A684PrdCanPen[0] ;
         A719PrdNum = P08NU11_A719PrdNum[0] ;
         A718PrdNom = P08NU11_A718PrdNom[0] ;
         A685PrdCanRes = P08NU11_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08NU11_A704PrdExiAlm[0] ;
         A857ValDsc = P08NU11_A857ValDsc[0] ;
         n857ValDsc = P08NU11_n857ValDsc[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P08NU11_A4693PrdNum2[0], A4693PrdNum2) == 0 ) )
         {
            brk8NU20 = false ;
            A396EmprCod = P08NU11_A396EmprCod[0] ;
            A719PrdNum = P08NU11_A719PrdNum[0] ;
            AV62count = (long)(AV62count+1) ;
            brk8NU20 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A4693PrdNum2)==0) )
         {
            AV54Option = A4693PrdNum2 ;
            AV55Options.add(AV54Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NU20 )
         {
            brk8NU20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttproducwwgetfilterdata.this.AV56OptionsJson;
      this.aP4[0] = ttproducwwgetfilterdata.this.AV59OptionsDescJson;
      this.aP5[0] = ttproducwwgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56OptionsJson = "" ;
      AV59OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFPrdNom = "" ;
      AV11TFPrdNom_Sel = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdExiAlm = DecimalUtil.ZERO ;
      AV15TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV16TFPrdCanRes = DecimalUtil.ZERO ;
      AV17TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV18TFPrdDisponible = DecimalUtil.ZERO ;
      AV19TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV20TFPrdCanPen = DecimalUtil.ZERO ;
      AV21TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV22TFPrdPreAct = DecimalUtil.ZERO ;
      AV23TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV24TFValDsc = "" ;
      AV25TFValDsc_Sel = "" ;
      AV26TFPrdRec = "" ;
      AV27TFPrdRec_Sel = "" ;
      AV28TFPrdAox = DecimalUtil.ZERO ;
      AV29TFPrdAox_To = DecimalUtil.ZERO ;
      AV30TFPrdGots = "" ;
      AV31TFPrdGots_Sel = "" ;
      AV32TFPrdReach = "" ;
      AV33TFPrdReach_Sel = "" ;
      AV34TFPrdOkotex_SelsJson = "" ;
      AV35TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36TFPrdHm = "" ;
      AV37TFPrdHm_Sel = "" ;
      AV38TFPrdZDHC_SelsJson = "" ;
      AV39TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40TFPrdList_SelsJson = "" ;
      AV41TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFPrdTHELIST = "" ;
      AV43TFPrdTHELIST_Sel = "" ;
      AV44TFPrdHS = "" ;
      AV45TFPrdHS_Sel = "" ;
      AV46TFPrdFHS = GXutil.nullDate() ;
      AV47TFPrdFHS_To = GXutil.nullDate() ;
      AV48TFPrdNum2 = "" ;
      AV49TFPrdNum2_Sel = "" ;
      A718PrdNom = "" ;
      AV72Ttproducwwds_1_tfprdnom = "" ;
      AV73Ttproducwwds_2_tfprdnom_sel = "" ;
      AV74Ttproducwwds_3_tfprdnum = "" ;
      AV75Ttproducwwds_4_tfprdnum_sel = "" ;
      AV76Ttproducwwds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV77Ttproducwwds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV78Ttproducwwds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV79Ttproducwwds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV80Ttproducwwds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV81Ttproducwwds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV82Ttproducwwds_11_tfprdcanpen = DecimalUtil.ZERO ;
      AV83Ttproducwwds_12_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV84Ttproducwwds_13_tfprdpreact = DecimalUtil.ZERO ;
      AV85Ttproducwwds_14_tfprdpreact_to = DecimalUtil.ZERO ;
      AV86Ttproducwwds_15_tfvaldsc = "" ;
      AV87Ttproducwwds_16_tfvaldsc_sel = "" ;
      AV88Ttproducwwds_17_tfprdrec = "" ;
      AV89Ttproducwwds_18_tfprdrec_sel = "" ;
      AV90Ttproducwwds_19_tfprdaox = DecimalUtil.ZERO ;
      AV91Ttproducwwds_20_tfprdaox_to = DecimalUtil.ZERO ;
      AV92Ttproducwwds_21_tfprdgots = "" ;
      AV93Ttproducwwds_22_tfprdgots_sel = "" ;
      AV94Ttproducwwds_23_tfprdreach = "" ;
      AV95Ttproducwwds_24_tfprdreach_sel = "" ;
      AV96Ttproducwwds_25_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV97Ttproducwwds_26_tfprdhm = "" ;
      AV98Ttproducwwds_27_tfprdhm_sel = "" ;
      AV99Ttproducwwds_28_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Ttproducwwds_29_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV101Ttproducwwds_30_tfprdthelist = "" ;
      AV102Ttproducwwds_31_tfprdthelist_sel = "" ;
      AV103Ttproducwwds_32_tfprdhs = "" ;
      AV104Ttproducwwds_33_tfprdhs_sel = "" ;
      AV105Ttproducwwds_34_tfprdfhs = GXutil.nullDate() ;
      AV106Ttproducwwds_35_tfprdfhs_to = GXutil.nullDate() ;
      AV107Ttproducwwds_36_tfprdnum2 = "" ;
      AV108Ttproducwwds_37_tfprdnum2_sel = "" ;
      scmdbuf = "" ;
      lV72Ttproducwwds_1_tfprdnom = "" ;
      lV74Ttproducwwds_3_tfprdnum = "" ;
      lV86Ttproducwwds_15_tfvaldsc = "" ;
      lV88Ttproducwwds_17_tfprdrec = "" ;
      lV92Ttproducwwds_21_tfprdgots = "" ;
      lV94Ttproducwwds_23_tfprdreach = "" ;
      lV97Ttproducwwds_26_tfprdhm = "" ;
      lV101Ttproducwwds_30_tfprdthelist = "" ;
      lV103Ttproducwwds_32_tfprdhs = "" ;
      lV107Ttproducwwds_36_tfprdnum2 = "" ;
      A5888PrdOkotex = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A11364PrdHm = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      P08NU2_A396EmprCod = new String[] {""} ;
      P08NU2_A856ValCod = new byte[1] ;
      P08NU2_A718PrdNom = new String[] {""} ;
      P08NU2_A4693PrdNum2 = new String[] {""} ;
      P08NU2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU2_A9741PrdHS = new String[] {""} ;
      P08NU2_A13302PrdTHELIST = new String[] {""} ;
      P08NU2_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU2_A11687PrdList = new String[] {""} ;
      P08NU2_A13301PrdZDHC = new String[] {""} ;
      P08NU2_A11364PrdHm = new String[] {""} ;
      P08NU2_A5888PrdOkotex = new String[] {""} ;
      P08NU2_A5887PrdReach = new String[] {""} ;
      P08NU2_A11363PrdGots = new String[] {""} ;
      P08NU2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU2_A727PrdRec = new String[] {""} ;
      P08NU2_A857ValDsc = new String[] {""} ;
      P08NU2_n857ValDsc = new boolean[] {false} ;
      P08NU2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU2_A719PrdNum = new String[] {""} ;
      P08NU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      AV54Option = "" ;
      P08NU3_A396EmprCod = new String[] {""} ;
      P08NU3_A856ValCod = new byte[1] ;
      P08NU3_A719PrdNum = new String[] {""} ;
      P08NU3_A4693PrdNum2 = new String[] {""} ;
      P08NU3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU3_A9741PrdHS = new String[] {""} ;
      P08NU3_A13302PrdTHELIST = new String[] {""} ;
      P08NU3_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU3_A11687PrdList = new String[] {""} ;
      P08NU3_A13301PrdZDHC = new String[] {""} ;
      P08NU3_A11364PrdHm = new String[] {""} ;
      P08NU3_A5888PrdOkotex = new String[] {""} ;
      P08NU3_A5887PrdReach = new String[] {""} ;
      P08NU3_A11363PrdGots = new String[] {""} ;
      P08NU3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU3_A727PrdRec = new String[] {""} ;
      P08NU3_A857ValDsc = new String[] {""} ;
      P08NU3_n857ValDsc = new boolean[] {false} ;
      P08NU3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU3_A718PrdNom = new String[] {""} ;
      P08NU3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU4_A856ValCod = new byte[1] ;
      P08NU4_A396EmprCod = new String[] {""} ;
      P08NU4_A4693PrdNum2 = new String[] {""} ;
      P08NU4_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU4_A9741PrdHS = new String[] {""} ;
      P08NU4_A13302PrdTHELIST = new String[] {""} ;
      P08NU4_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU4_A11687PrdList = new String[] {""} ;
      P08NU4_A13301PrdZDHC = new String[] {""} ;
      P08NU4_A11364PrdHm = new String[] {""} ;
      P08NU4_A5888PrdOkotex = new String[] {""} ;
      P08NU4_A5887PrdReach = new String[] {""} ;
      P08NU4_A11363PrdGots = new String[] {""} ;
      P08NU4_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU4_A727PrdRec = new String[] {""} ;
      P08NU4_A857ValDsc = new String[] {""} ;
      P08NU4_n857ValDsc = new boolean[] {false} ;
      P08NU4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU4_A719PrdNum = new String[] {""} ;
      P08NU4_A718PrdNom = new String[] {""} ;
      P08NU4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU5_A396EmprCod = new String[] {""} ;
      P08NU5_A856ValCod = new byte[1] ;
      P08NU5_A727PrdRec = new String[] {""} ;
      P08NU5_A4693PrdNum2 = new String[] {""} ;
      P08NU5_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU5_A9741PrdHS = new String[] {""} ;
      P08NU5_A13302PrdTHELIST = new String[] {""} ;
      P08NU5_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU5_A11687PrdList = new String[] {""} ;
      P08NU5_A13301PrdZDHC = new String[] {""} ;
      P08NU5_A11364PrdHm = new String[] {""} ;
      P08NU5_A5888PrdOkotex = new String[] {""} ;
      P08NU5_A5887PrdReach = new String[] {""} ;
      P08NU5_A11363PrdGots = new String[] {""} ;
      P08NU5_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU5_A857ValDsc = new String[] {""} ;
      P08NU5_n857ValDsc = new boolean[] {false} ;
      P08NU5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU5_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU5_A719PrdNum = new String[] {""} ;
      P08NU5_A718PrdNom = new String[] {""} ;
      P08NU5_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU6_A396EmprCod = new String[] {""} ;
      P08NU6_A856ValCod = new byte[1] ;
      P08NU6_A11363PrdGots = new String[] {""} ;
      P08NU6_A4693PrdNum2 = new String[] {""} ;
      P08NU6_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU6_A9741PrdHS = new String[] {""} ;
      P08NU6_A13302PrdTHELIST = new String[] {""} ;
      P08NU6_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU6_A11687PrdList = new String[] {""} ;
      P08NU6_A13301PrdZDHC = new String[] {""} ;
      P08NU6_A11364PrdHm = new String[] {""} ;
      P08NU6_A5888PrdOkotex = new String[] {""} ;
      P08NU6_A5887PrdReach = new String[] {""} ;
      P08NU6_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU6_A727PrdRec = new String[] {""} ;
      P08NU6_A857ValDsc = new String[] {""} ;
      P08NU6_n857ValDsc = new boolean[] {false} ;
      P08NU6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU6_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU6_A719PrdNum = new String[] {""} ;
      P08NU6_A718PrdNom = new String[] {""} ;
      P08NU6_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU6_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU7_A396EmprCod = new String[] {""} ;
      P08NU7_A856ValCod = new byte[1] ;
      P08NU7_A5887PrdReach = new String[] {""} ;
      P08NU7_A4693PrdNum2 = new String[] {""} ;
      P08NU7_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU7_A9741PrdHS = new String[] {""} ;
      P08NU7_A13302PrdTHELIST = new String[] {""} ;
      P08NU7_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU7_A11687PrdList = new String[] {""} ;
      P08NU7_A13301PrdZDHC = new String[] {""} ;
      P08NU7_A11364PrdHm = new String[] {""} ;
      P08NU7_A5888PrdOkotex = new String[] {""} ;
      P08NU7_A11363PrdGots = new String[] {""} ;
      P08NU7_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU7_A727PrdRec = new String[] {""} ;
      P08NU7_A857ValDsc = new String[] {""} ;
      P08NU7_n857ValDsc = new boolean[] {false} ;
      P08NU7_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU7_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU7_A719PrdNum = new String[] {""} ;
      P08NU7_A718PrdNom = new String[] {""} ;
      P08NU7_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU7_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU8_A396EmprCod = new String[] {""} ;
      P08NU8_A856ValCod = new byte[1] ;
      P08NU8_A11364PrdHm = new String[] {""} ;
      P08NU8_A4693PrdNum2 = new String[] {""} ;
      P08NU8_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU8_A9741PrdHS = new String[] {""} ;
      P08NU8_A13302PrdTHELIST = new String[] {""} ;
      P08NU8_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU8_A11687PrdList = new String[] {""} ;
      P08NU8_A13301PrdZDHC = new String[] {""} ;
      P08NU8_A5888PrdOkotex = new String[] {""} ;
      P08NU8_A5887PrdReach = new String[] {""} ;
      P08NU8_A11363PrdGots = new String[] {""} ;
      P08NU8_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU8_A727PrdRec = new String[] {""} ;
      P08NU8_A857ValDsc = new String[] {""} ;
      P08NU8_n857ValDsc = new boolean[] {false} ;
      P08NU8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU8_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU8_A719PrdNum = new String[] {""} ;
      P08NU8_A718PrdNom = new String[] {""} ;
      P08NU8_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU9_A396EmprCod = new String[] {""} ;
      P08NU9_A856ValCod = new byte[1] ;
      P08NU9_A13302PrdTHELIST = new String[] {""} ;
      P08NU9_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU9_A4693PrdNum2 = new String[] {""} ;
      P08NU9_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU9_A9741PrdHS = new String[] {""} ;
      P08NU9_A11687PrdList = new String[] {""} ;
      P08NU9_A13301PrdZDHC = new String[] {""} ;
      P08NU9_A11364PrdHm = new String[] {""} ;
      P08NU9_A5888PrdOkotex = new String[] {""} ;
      P08NU9_A5887PrdReach = new String[] {""} ;
      P08NU9_A11363PrdGots = new String[] {""} ;
      P08NU9_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU9_A727PrdRec = new String[] {""} ;
      P08NU9_A857ValDsc = new String[] {""} ;
      P08NU9_n857ValDsc = new boolean[] {false} ;
      P08NU9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU9_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU9_A719PrdNum = new String[] {""} ;
      P08NU9_A718PrdNom = new String[] {""} ;
      P08NU9_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV57OptionDesc = "" ;
      P08NU10_A396EmprCod = new String[] {""} ;
      P08NU10_A856ValCod = new byte[1] ;
      P08NU10_A9741PrdHS = new String[] {""} ;
      P08NU10_A4693PrdNum2 = new String[] {""} ;
      P08NU10_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU10_A13302PrdTHELIST = new String[] {""} ;
      P08NU10_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU10_A11687PrdList = new String[] {""} ;
      P08NU10_A13301PrdZDHC = new String[] {""} ;
      P08NU10_A11364PrdHm = new String[] {""} ;
      P08NU10_A5888PrdOkotex = new String[] {""} ;
      P08NU10_A5887PrdReach = new String[] {""} ;
      P08NU10_A11363PrdGots = new String[] {""} ;
      P08NU10_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU10_A727PrdRec = new String[] {""} ;
      P08NU10_A857ValDsc = new String[] {""} ;
      P08NU10_n857ValDsc = new boolean[] {false} ;
      P08NU10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU10_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU10_A719PrdNum = new String[] {""} ;
      P08NU10_A718PrdNom = new String[] {""} ;
      P08NU10_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU10_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU11_A396EmprCod = new String[] {""} ;
      P08NU11_A856ValCod = new byte[1] ;
      P08NU11_A4693PrdNum2 = new String[] {""} ;
      P08NU11_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08NU11_A9741PrdHS = new String[] {""} ;
      P08NU11_A13302PrdTHELIST = new String[] {""} ;
      P08NU11_n13302PrdTHELIST = new boolean[] {false} ;
      P08NU11_A11687PrdList = new String[] {""} ;
      P08NU11_A13301PrdZDHC = new String[] {""} ;
      P08NU11_A11364PrdHm = new String[] {""} ;
      P08NU11_A5888PrdOkotex = new String[] {""} ;
      P08NU11_A5887PrdReach = new String[] {""} ;
      P08NU11_A11363PrdGots = new String[] {""} ;
      P08NU11_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU11_A727PrdRec = new String[] {""} ;
      P08NU11_A857ValDsc = new String[] {""} ;
      P08NU11_n857ValDsc = new boolean[] {false} ;
      P08NU11_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU11_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU11_A719PrdNum = new String[] {""} ;
      P08NU11_A718PrdNom = new String[] {""} ;
      P08NU11_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NU11_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttproducwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08NU2_A396EmprCod, P08NU2_A856ValCod, P08NU2_A718PrdNom, P08NU2_A4693PrdNum2, P08NU2_A9742PrdFHS, P08NU2_A9741PrdHS, P08NU2_A13302PrdTHELIST, P08NU2_n13302PrdTHELIST, P08NU2_A11687PrdList, P08NU2_A13301PrdZDHC,
            P08NU2_A11364PrdHm, P08NU2_A5888PrdOkotex, P08NU2_A5887PrdReach, P08NU2_A11363PrdGots, P08NU2_A9733PrdAox, P08NU2_A727PrdRec, P08NU2_A857ValDsc, P08NU2_n857ValDsc, P08NU2_A724PrdPreAct, P08NU2_A684PrdCanPen,
            P08NU2_A719PrdNum, P08NU2_A685PrdCanRes, P08NU2_A704PrdExiAlm
            }
            , new Object[] {
            P08NU3_A396EmprCod, P08NU3_A856ValCod, P08NU3_A719PrdNum, P08NU3_A4693PrdNum2, P08NU3_A9742PrdFHS, P08NU3_A9741PrdHS, P08NU3_A13302PrdTHELIST, P08NU3_n13302PrdTHELIST, P08NU3_A11687PrdList, P08NU3_A13301PrdZDHC,
            P08NU3_A11364PrdHm, P08NU3_A5888PrdOkotex, P08NU3_A5887PrdReach, P08NU3_A11363PrdGots, P08NU3_A9733PrdAox, P08NU3_A727PrdRec, P08NU3_A857ValDsc, P08NU3_n857ValDsc, P08NU3_A724PrdPreAct, P08NU3_A684PrdCanPen,
            P08NU3_A718PrdNom, P08NU3_A685PrdCanRes, P08NU3_A704PrdExiAlm
            }
            , new Object[] {
            P08NU4_A856ValCod, P08NU4_A396EmprCod, P08NU4_A4693PrdNum2, P08NU4_A9742PrdFHS, P08NU4_A9741PrdHS, P08NU4_A13302PrdTHELIST, P08NU4_n13302PrdTHELIST, P08NU4_A11687PrdList, P08NU4_A13301PrdZDHC, P08NU4_A11364PrdHm,
            P08NU4_A5888PrdOkotex, P08NU4_A5887PrdReach, P08NU4_A11363PrdGots, P08NU4_A9733PrdAox, P08NU4_A727PrdRec, P08NU4_A857ValDsc, P08NU4_n857ValDsc, P08NU4_A724PrdPreAct, P08NU4_A684PrdCanPen, P08NU4_A719PrdNum,
            P08NU4_A718PrdNom, P08NU4_A685PrdCanRes, P08NU4_A704PrdExiAlm
            }
            , new Object[] {
            P08NU5_A396EmprCod, P08NU5_A856ValCod, P08NU5_A727PrdRec, P08NU5_A4693PrdNum2, P08NU5_A9742PrdFHS, P08NU5_A9741PrdHS, P08NU5_A13302PrdTHELIST, P08NU5_n13302PrdTHELIST, P08NU5_A11687PrdList, P08NU5_A13301PrdZDHC,
            P08NU5_A11364PrdHm, P08NU5_A5888PrdOkotex, P08NU5_A5887PrdReach, P08NU5_A11363PrdGots, P08NU5_A9733PrdAox, P08NU5_A857ValDsc, P08NU5_n857ValDsc, P08NU5_A724PrdPreAct, P08NU5_A684PrdCanPen, P08NU5_A719PrdNum,
            P08NU5_A718PrdNom, P08NU5_A685PrdCanRes, P08NU5_A704PrdExiAlm
            }
            , new Object[] {
            P08NU6_A396EmprCod, P08NU6_A856ValCod, P08NU6_A11363PrdGots, P08NU6_A4693PrdNum2, P08NU6_A9742PrdFHS, P08NU6_A9741PrdHS, P08NU6_A13302PrdTHELIST, P08NU6_n13302PrdTHELIST, P08NU6_A11687PrdList, P08NU6_A13301PrdZDHC,
            P08NU6_A11364PrdHm, P08NU6_A5888PrdOkotex, P08NU6_A5887PrdReach, P08NU6_A9733PrdAox, P08NU6_A727PrdRec, P08NU6_A857ValDsc, P08NU6_n857ValDsc, P08NU6_A724PrdPreAct, P08NU6_A684PrdCanPen, P08NU6_A719PrdNum,
            P08NU6_A718PrdNom, P08NU6_A685PrdCanRes, P08NU6_A704PrdExiAlm
            }
            , new Object[] {
            P08NU7_A396EmprCod, P08NU7_A856ValCod, P08NU7_A5887PrdReach, P08NU7_A4693PrdNum2, P08NU7_A9742PrdFHS, P08NU7_A9741PrdHS, P08NU7_A13302PrdTHELIST, P08NU7_n13302PrdTHELIST, P08NU7_A11687PrdList, P08NU7_A13301PrdZDHC,
            P08NU7_A11364PrdHm, P08NU7_A5888PrdOkotex, P08NU7_A11363PrdGots, P08NU7_A9733PrdAox, P08NU7_A727PrdRec, P08NU7_A857ValDsc, P08NU7_n857ValDsc, P08NU7_A724PrdPreAct, P08NU7_A684PrdCanPen, P08NU7_A719PrdNum,
            P08NU7_A718PrdNom, P08NU7_A685PrdCanRes, P08NU7_A704PrdExiAlm
            }
            , new Object[] {
            P08NU8_A396EmprCod, P08NU8_A856ValCod, P08NU8_A11364PrdHm, P08NU8_A4693PrdNum2, P08NU8_A9742PrdFHS, P08NU8_A9741PrdHS, P08NU8_A13302PrdTHELIST, P08NU8_n13302PrdTHELIST, P08NU8_A11687PrdList, P08NU8_A13301PrdZDHC,
            P08NU8_A5888PrdOkotex, P08NU8_A5887PrdReach, P08NU8_A11363PrdGots, P08NU8_A9733PrdAox, P08NU8_A727PrdRec, P08NU8_A857ValDsc, P08NU8_n857ValDsc, P08NU8_A724PrdPreAct, P08NU8_A684PrdCanPen, P08NU8_A719PrdNum,
            P08NU8_A718PrdNom, P08NU8_A685PrdCanRes, P08NU8_A704PrdExiAlm
            }
            , new Object[] {
            P08NU9_A396EmprCod, P08NU9_A856ValCod, P08NU9_A13302PrdTHELIST, P08NU9_n13302PrdTHELIST, P08NU9_A4693PrdNum2, P08NU9_A9742PrdFHS, P08NU9_A9741PrdHS, P08NU9_A11687PrdList, P08NU9_A13301PrdZDHC, P08NU9_A11364PrdHm,
            P08NU9_A5888PrdOkotex, P08NU9_A5887PrdReach, P08NU9_A11363PrdGots, P08NU9_A9733PrdAox, P08NU9_A727PrdRec, P08NU9_A857ValDsc, P08NU9_n857ValDsc, P08NU9_A724PrdPreAct, P08NU9_A684PrdCanPen, P08NU9_A719PrdNum,
            P08NU9_A718PrdNom, P08NU9_A685PrdCanRes, P08NU9_A704PrdExiAlm
            }
            , new Object[] {
            P08NU10_A396EmprCod, P08NU10_A856ValCod, P08NU10_A9741PrdHS, P08NU10_A4693PrdNum2, P08NU10_A9742PrdFHS, P08NU10_A13302PrdTHELIST, P08NU10_n13302PrdTHELIST, P08NU10_A11687PrdList, P08NU10_A13301PrdZDHC, P08NU10_A11364PrdHm,
            P08NU10_A5888PrdOkotex, P08NU10_A5887PrdReach, P08NU10_A11363PrdGots, P08NU10_A9733PrdAox, P08NU10_A727PrdRec, P08NU10_A857ValDsc, P08NU10_n857ValDsc, P08NU10_A724PrdPreAct, P08NU10_A684PrdCanPen, P08NU10_A719PrdNum,
            P08NU10_A718PrdNom, P08NU10_A685PrdCanRes, P08NU10_A704PrdExiAlm
            }
            , new Object[] {
            P08NU11_A396EmprCod, P08NU11_A856ValCod, P08NU11_A4693PrdNum2, P08NU11_A9742PrdFHS, P08NU11_A9741PrdHS, P08NU11_A13302PrdTHELIST, P08NU11_n13302PrdTHELIST, P08NU11_A11687PrdList, P08NU11_A13301PrdZDHC, P08NU11_A11364PrdHm,
            P08NU11_A5888PrdOkotex, P08NU11_A5887PrdReach, P08NU11_A11363PrdGots, P08NU11_A9733PrdAox, P08NU11_A727PrdRec, P08NU11_A857ValDsc, P08NU11_n857ValDsc, P08NU11_A724PrdPreAct, P08NU11_A684PrdCanPen, P08NU11_A719PrdNum,
            P08NU11_A718PrdNom, P08NU11_A685PrdCanRes, P08NU11_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV70GXV1 ;
   private int AV96Ttproducwwds_25_tfprdokotex_sels_size ;
   private int AV99Ttproducwwds_28_tfprdzdhc_sels_size ;
   private int AV100Ttproducwwds_29_tfprdlist_sels_size ;
   private int AV53InsertIndex ;
   private long AV62count ;
   private java.math.BigDecimal AV14TFPrdExiAlm ;
   private java.math.BigDecimal AV15TFPrdExiAlm_To ;
   private java.math.BigDecimal AV16TFPrdCanRes ;
   private java.math.BigDecimal AV17TFPrdCanRes_To ;
   private java.math.BigDecimal AV18TFPrdDisponible ;
   private java.math.BigDecimal AV19TFPrdDisponible_To ;
   private java.math.BigDecimal AV20TFPrdCanPen ;
   private java.math.BigDecimal AV21TFPrdCanPen_To ;
   private java.math.BigDecimal AV22TFPrdPreAct ;
   private java.math.BigDecimal AV23TFPrdPreAct_To ;
   private java.math.BigDecimal AV28TFPrdAox ;
   private java.math.BigDecimal AV29TFPrdAox_To ;
   private java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ;
   private java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ;
   private java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ;
   private java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ;
   private java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ;
   private java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ;
   private java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ;
   private java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ;
   private java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ;
   private java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private String AV10TFPrdNom ;
   private String AV11TFPrdNom_Sel ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV24TFValDsc ;
   private String AV25TFValDsc_Sel ;
   private String AV26TFPrdRec ;
   private String AV27TFPrdRec_Sel ;
   private String AV30TFPrdGots ;
   private String AV31TFPrdGots_Sel ;
   private String AV32TFPrdReach ;
   private String AV33TFPrdReach_Sel ;
   private String AV36TFPrdHm ;
   private String AV37TFPrdHm_Sel ;
   private String AV42TFPrdTHELIST ;
   private String AV43TFPrdTHELIST_Sel ;
   private String AV44TFPrdHS ;
   private String AV45TFPrdHS_Sel ;
   private String AV48TFPrdNum2 ;
   private String AV49TFPrdNum2_Sel ;
   private String A718PrdNom ;
   private String AV72Ttproducwwds_1_tfprdnom ;
   private String AV73Ttproducwwds_2_tfprdnom_sel ;
   private String AV74Ttproducwwds_3_tfprdnum ;
   private String AV75Ttproducwwds_4_tfprdnum_sel ;
   private String AV86Ttproducwwds_15_tfvaldsc ;
   private String AV87Ttproducwwds_16_tfvaldsc_sel ;
   private String AV88Ttproducwwds_17_tfprdrec ;
   private String AV89Ttproducwwds_18_tfprdrec_sel ;
   private String AV92Ttproducwwds_21_tfprdgots ;
   private String AV93Ttproducwwds_22_tfprdgots_sel ;
   private String AV94Ttproducwwds_23_tfprdreach ;
   private String AV95Ttproducwwds_24_tfprdreach_sel ;
   private String AV97Ttproducwwds_26_tfprdhm ;
   private String AV98Ttproducwwds_27_tfprdhm_sel ;
   private String AV101Ttproducwwds_30_tfprdthelist ;
   private String AV102Ttproducwwds_31_tfprdthelist_sel ;
   private String AV103Ttproducwwds_32_tfprdhs ;
   private String AV104Ttproducwwds_33_tfprdhs_sel ;
   private String AV107Ttproducwwds_36_tfprdnum2 ;
   private String AV108Ttproducwwds_37_tfprdnum2_sel ;
   private String scmdbuf ;
   private String lV72Ttproducwwds_1_tfprdnom ;
   private String lV74Ttproducwwds_3_tfprdnum ;
   private String lV86Ttproducwwds_15_tfvaldsc ;
   private String lV88Ttproducwwds_17_tfprdrec ;
   private String lV92Ttproducwwds_21_tfprdgots ;
   private String lV94Ttproducwwds_23_tfprdreach ;
   private String lV97Ttproducwwds_26_tfprdhm ;
   private String lV101Ttproducwwds_30_tfprdthelist ;
   private String lV103Ttproducwwds_32_tfprdhs ;
   private String lV107Ttproducwwds_36_tfprdnum2 ;
   private String A5888PrdOkotex ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A719PrdNum ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A11364PrdHm ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String A396EmprCod ;
   private java.util.Date AV46TFPrdFHS ;
   private java.util.Date AV47TFPrdFHS_To ;
   private java.util.Date AV105Ttproducwwds_34_tfprdfhs ;
   private java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ;
   private java.util.Date A9742PrdFHS ;
   private boolean returnInSub ;
   private boolean brk8NU2 ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private boolean brk8NU4 ;
   private boolean brk8NU6 ;
   private boolean brk8NU8 ;
   private boolean brk8NU10 ;
   private boolean brk8NU12 ;
   private boolean brk8NU14 ;
   private boolean brk8NU16 ;
   private boolean brk8NU18 ;
   private boolean brk8NU20 ;
   private String AV56OptionsJson ;
   private String AV59OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV34TFPrdOkotex_SelsJson ;
   private String AV38TFPrdZDHC_SelsJson ;
   private String AV40TFPrdList_SelsJson ;
   private String AV52DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV54Option ;
   private String AV57OptionDesc ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08NU2_A396EmprCod ;
   private byte[] P08NU2_A856ValCod ;
   private String[] P08NU2_A718PrdNom ;
   private String[] P08NU2_A4693PrdNum2 ;
   private java.util.Date[] P08NU2_A9742PrdFHS ;
   private String[] P08NU2_A9741PrdHS ;
   private String[] P08NU2_A13302PrdTHELIST ;
   private boolean[] P08NU2_n13302PrdTHELIST ;
   private String[] P08NU2_A11687PrdList ;
   private String[] P08NU2_A13301PrdZDHC ;
   private String[] P08NU2_A11364PrdHm ;
   private String[] P08NU2_A5888PrdOkotex ;
   private String[] P08NU2_A5887PrdReach ;
   private String[] P08NU2_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU2_A9733PrdAox ;
   private String[] P08NU2_A727PrdRec ;
   private String[] P08NU2_A857ValDsc ;
   private boolean[] P08NU2_n857ValDsc ;
   private java.math.BigDecimal[] P08NU2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU2_A684PrdCanPen ;
   private String[] P08NU2_A719PrdNum ;
   private java.math.BigDecimal[] P08NU2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU2_A704PrdExiAlm ;
   private String[] P08NU3_A396EmprCod ;
   private byte[] P08NU3_A856ValCod ;
   private String[] P08NU3_A719PrdNum ;
   private String[] P08NU3_A4693PrdNum2 ;
   private java.util.Date[] P08NU3_A9742PrdFHS ;
   private String[] P08NU3_A9741PrdHS ;
   private String[] P08NU3_A13302PrdTHELIST ;
   private boolean[] P08NU3_n13302PrdTHELIST ;
   private String[] P08NU3_A11687PrdList ;
   private String[] P08NU3_A13301PrdZDHC ;
   private String[] P08NU3_A11364PrdHm ;
   private String[] P08NU3_A5888PrdOkotex ;
   private String[] P08NU3_A5887PrdReach ;
   private String[] P08NU3_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU3_A9733PrdAox ;
   private String[] P08NU3_A727PrdRec ;
   private String[] P08NU3_A857ValDsc ;
   private boolean[] P08NU3_n857ValDsc ;
   private java.math.BigDecimal[] P08NU3_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU3_A684PrdCanPen ;
   private String[] P08NU3_A718PrdNom ;
   private java.math.BigDecimal[] P08NU3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU3_A704PrdExiAlm ;
   private byte[] P08NU4_A856ValCod ;
   private String[] P08NU4_A396EmprCod ;
   private String[] P08NU4_A4693PrdNum2 ;
   private java.util.Date[] P08NU4_A9742PrdFHS ;
   private String[] P08NU4_A9741PrdHS ;
   private String[] P08NU4_A13302PrdTHELIST ;
   private boolean[] P08NU4_n13302PrdTHELIST ;
   private String[] P08NU4_A11687PrdList ;
   private String[] P08NU4_A13301PrdZDHC ;
   private String[] P08NU4_A11364PrdHm ;
   private String[] P08NU4_A5888PrdOkotex ;
   private String[] P08NU4_A5887PrdReach ;
   private String[] P08NU4_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU4_A9733PrdAox ;
   private String[] P08NU4_A727PrdRec ;
   private String[] P08NU4_A857ValDsc ;
   private boolean[] P08NU4_n857ValDsc ;
   private java.math.BigDecimal[] P08NU4_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU4_A684PrdCanPen ;
   private String[] P08NU4_A719PrdNum ;
   private String[] P08NU4_A718PrdNom ;
   private java.math.BigDecimal[] P08NU4_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU4_A704PrdExiAlm ;
   private String[] P08NU5_A396EmprCod ;
   private byte[] P08NU5_A856ValCod ;
   private String[] P08NU5_A727PrdRec ;
   private String[] P08NU5_A4693PrdNum2 ;
   private java.util.Date[] P08NU5_A9742PrdFHS ;
   private String[] P08NU5_A9741PrdHS ;
   private String[] P08NU5_A13302PrdTHELIST ;
   private boolean[] P08NU5_n13302PrdTHELIST ;
   private String[] P08NU5_A11687PrdList ;
   private String[] P08NU5_A13301PrdZDHC ;
   private String[] P08NU5_A11364PrdHm ;
   private String[] P08NU5_A5888PrdOkotex ;
   private String[] P08NU5_A5887PrdReach ;
   private String[] P08NU5_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU5_A9733PrdAox ;
   private String[] P08NU5_A857ValDsc ;
   private boolean[] P08NU5_n857ValDsc ;
   private java.math.BigDecimal[] P08NU5_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU5_A684PrdCanPen ;
   private String[] P08NU5_A719PrdNum ;
   private String[] P08NU5_A718PrdNom ;
   private java.math.BigDecimal[] P08NU5_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU5_A704PrdExiAlm ;
   private String[] P08NU6_A396EmprCod ;
   private byte[] P08NU6_A856ValCod ;
   private String[] P08NU6_A11363PrdGots ;
   private String[] P08NU6_A4693PrdNum2 ;
   private java.util.Date[] P08NU6_A9742PrdFHS ;
   private String[] P08NU6_A9741PrdHS ;
   private String[] P08NU6_A13302PrdTHELIST ;
   private boolean[] P08NU6_n13302PrdTHELIST ;
   private String[] P08NU6_A11687PrdList ;
   private String[] P08NU6_A13301PrdZDHC ;
   private String[] P08NU6_A11364PrdHm ;
   private String[] P08NU6_A5888PrdOkotex ;
   private String[] P08NU6_A5887PrdReach ;
   private java.math.BigDecimal[] P08NU6_A9733PrdAox ;
   private String[] P08NU6_A727PrdRec ;
   private String[] P08NU6_A857ValDsc ;
   private boolean[] P08NU6_n857ValDsc ;
   private java.math.BigDecimal[] P08NU6_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU6_A684PrdCanPen ;
   private String[] P08NU6_A719PrdNum ;
   private String[] P08NU6_A718PrdNom ;
   private java.math.BigDecimal[] P08NU6_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU6_A704PrdExiAlm ;
   private String[] P08NU7_A396EmprCod ;
   private byte[] P08NU7_A856ValCod ;
   private String[] P08NU7_A5887PrdReach ;
   private String[] P08NU7_A4693PrdNum2 ;
   private java.util.Date[] P08NU7_A9742PrdFHS ;
   private String[] P08NU7_A9741PrdHS ;
   private String[] P08NU7_A13302PrdTHELIST ;
   private boolean[] P08NU7_n13302PrdTHELIST ;
   private String[] P08NU7_A11687PrdList ;
   private String[] P08NU7_A13301PrdZDHC ;
   private String[] P08NU7_A11364PrdHm ;
   private String[] P08NU7_A5888PrdOkotex ;
   private String[] P08NU7_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU7_A9733PrdAox ;
   private String[] P08NU7_A727PrdRec ;
   private String[] P08NU7_A857ValDsc ;
   private boolean[] P08NU7_n857ValDsc ;
   private java.math.BigDecimal[] P08NU7_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU7_A684PrdCanPen ;
   private String[] P08NU7_A719PrdNum ;
   private String[] P08NU7_A718PrdNom ;
   private java.math.BigDecimal[] P08NU7_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU7_A704PrdExiAlm ;
   private String[] P08NU8_A396EmprCod ;
   private byte[] P08NU8_A856ValCod ;
   private String[] P08NU8_A11364PrdHm ;
   private String[] P08NU8_A4693PrdNum2 ;
   private java.util.Date[] P08NU8_A9742PrdFHS ;
   private String[] P08NU8_A9741PrdHS ;
   private String[] P08NU8_A13302PrdTHELIST ;
   private boolean[] P08NU8_n13302PrdTHELIST ;
   private String[] P08NU8_A11687PrdList ;
   private String[] P08NU8_A13301PrdZDHC ;
   private String[] P08NU8_A5888PrdOkotex ;
   private String[] P08NU8_A5887PrdReach ;
   private String[] P08NU8_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU8_A9733PrdAox ;
   private String[] P08NU8_A727PrdRec ;
   private String[] P08NU8_A857ValDsc ;
   private boolean[] P08NU8_n857ValDsc ;
   private java.math.BigDecimal[] P08NU8_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU8_A684PrdCanPen ;
   private String[] P08NU8_A719PrdNum ;
   private String[] P08NU8_A718PrdNom ;
   private java.math.BigDecimal[] P08NU8_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU8_A704PrdExiAlm ;
   private String[] P08NU9_A396EmprCod ;
   private byte[] P08NU9_A856ValCod ;
   private String[] P08NU9_A13302PrdTHELIST ;
   private boolean[] P08NU9_n13302PrdTHELIST ;
   private String[] P08NU9_A4693PrdNum2 ;
   private java.util.Date[] P08NU9_A9742PrdFHS ;
   private String[] P08NU9_A9741PrdHS ;
   private String[] P08NU9_A11687PrdList ;
   private String[] P08NU9_A13301PrdZDHC ;
   private String[] P08NU9_A11364PrdHm ;
   private String[] P08NU9_A5888PrdOkotex ;
   private String[] P08NU9_A5887PrdReach ;
   private String[] P08NU9_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU9_A9733PrdAox ;
   private String[] P08NU9_A727PrdRec ;
   private String[] P08NU9_A857ValDsc ;
   private boolean[] P08NU9_n857ValDsc ;
   private java.math.BigDecimal[] P08NU9_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU9_A684PrdCanPen ;
   private String[] P08NU9_A719PrdNum ;
   private String[] P08NU9_A718PrdNom ;
   private java.math.BigDecimal[] P08NU9_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU9_A704PrdExiAlm ;
   private String[] P08NU10_A396EmprCod ;
   private byte[] P08NU10_A856ValCod ;
   private String[] P08NU10_A9741PrdHS ;
   private String[] P08NU10_A4693PrdNum2 ;
   private java.util.Date[] P08NU10_A9742PrdFHS ;
   private String[] P08NU10_A13302PrdTHELIST ;
   private boolean[] P08NU10_n13302PrdTHELIST ;
   private String[] P08NU10_A11687PrdList ;
   private String[] P08NU10_A13301PrdZDHC ;
   private String[] P08NU10_A11364PrdHm ;
   private String[] P08NU10_A5888PrdOkotex ;
   private String[] P08NU10_A5887PrdReach ;
   private String[] P08NU10_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU10_A9733PrdAox ;
   private String[] P08NU10_A727PrdRec ;
   private String[] P08NU10_A857ValDsc ;
   private boolean[] P08NU10_n857ValDsc ;
   private java.math.BigDecimal[] P08NU10_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU10_A684PrdCanPen ;
   private String[] P08NU10_A719PrdNum ;
   private String[] P08NU10_A718PrdNom ;
   private java.math.BigDecimal[] P08NU10_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU10_A704PrdExiAlm ;
   private String[] P08NU11_A396EmprCod ;
   private byte[] P08NU11_A856ValCod ;
   private String[] P08NU11_A4693PrdNum2 ;
   private java.util.Date[] P08NU11_A9742PrdFHS ;
   private String[] P08NU11_A9741PrdHS ;
   private String[] P08NU11_A13302PrdTHELIST ;
   private boolean[] P08NU11_n13302PrdTHELIST ;
   private String[] P08NU11_A11687PrdList ;
   private String[] P08NU11_A13301PrdZDHC ;
   private String[] P08NU11_A11364PrdHm ;
   private String[] P08NU11_A5888PrdOkotex ;
   private String[] P08NU11_A5887PrdReach ;
   private String[] P08NU11_A11363PrdGots ;
   private java.math.BigDecimal[] P08NU11_A9733PrdAox ;
   private String[] P08NU11_A727PrdRec ;
   private String[] P08NU11_A857ValDsc ;
   private boolean[] P08NU11_n857ValDsc ;
   private java.math.BigDecimal[] P08NU11_A724PrdPreAct ;
   private java.math.BigDecimal[] P08NU11_A684PrdCanPen ;
   private String[] P08NU11_A719PrdNum ;
   private String[] P08NU11_A718PrdNom ;
   private java.math.BigDecimal[] P08NU11_A685PrdCanRes ;
   private java.math.BigDecimal[] P08NU11_A704PrdExiAlm ;
   private GXSimpleCollection<String> AV35TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV39TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV41TFPrdList_Sels ;
   private GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ;
   private GXSimpleCollection<String> AV55Options ;
   private GXSimpleCollection<String> AV58OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class ttproducwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdNom, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots," ;
      scmdbuf += " T1.PrdAox, T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08NU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[34];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdNum, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots," ;
      scmdbuf += " T1.PrdAox, T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08NU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ValCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08NU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[34];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdRec, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots," ;
      scmdbuf += " T1.PrdAox, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdRec" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08NU6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[34];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdGots, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdGots" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08NU7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[34];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdReach, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdReach" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08NU8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[34];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdHm, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdHm" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08NU9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                          String AV73Ttproducwwds_2_tfprdnom_sel ,
                                          String AV72Ttproducwwds_1_tfprdnom ,
                                          String AV75Ttproducwwds_4_tfprdnum_sel ,
                                          String AV74Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                          String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV86Ttproducwwds_15_tfvaldsc ,
                                          String AV89Ttproducwwds_18_tfprdrec_sel ,
                                          String AV88Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                          String AV93Ttproducwwds_22_tfprdgots_sel ,
                                          String AV92Ttproducwwds_21_tfprdgots ,
                                          String AV95Ttproducwwds_24_tfprdreach_sel ,
                                          String AV94Ttproducwwds_23_tfprdreach ,
                                          int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV98Ttproducwwds_27_tfprdhm_sel ,
                                          String AV97Ttproducwwds_26_tfprdhm ,
                                          int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV101Ttproducwwds_30_tfprdthelist ,
                                          String AV104Ttproducwwds_33_tfprdhs_sel ,
                                          String AV103Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                          String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV107Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[34];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdTHELIST, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdTHELIST" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P08NU10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A5888PrdOkotex ,
                                           GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           String A13301PrdZDHC ,
                                           GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           String A11687PrdList ,
                                           GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                           String AV73Ttproducwwds_2_tfprdnom_sel ,
                                           String AV72Ttproducwwds_1_tfprdnom ,
                                           String AV75Ttproducwwds_4_tfprdnum_sel ,
                                           String AV74Ttproducwwds_3_tfprdnum ,
                                           java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                           java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                           java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                           java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                           java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                           java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                           java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                           java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                           java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                           String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           String AV86Ttproducwwds_15_tfvaldsc ,
                                           String AV89Ttproducwwds_18_tfprdrec_sel ,
                                           String AV88Ttproducwwds_17_tfprdrec ,
                                           java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                           java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                           String AV93Ttproducwwds_22_tfprdgots_sel ,
                                           String AV92Ttproducwwds_21_tfprdgots ,
                                           String AV95Ttproducwwds_24_tfprdreach_sel ,
                                           String AV94Ttproducwwds_23_tfprdreach ,
                                           int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                           String AV98Ttproducwwds_27_tfprdhm_sel ,
                                           String AV97Ttproducwwds_26_tfprdhm ,
                                           int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                           int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                           String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           String AV101Ttproducwwds_30_tfprdthelist ,
                                           String AV104Ttproducwwds_33_tfprdhs_sel ,
                                           String AV103Ttproducwwds_32_tfprdhs ,
                                           java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                           java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                           String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           String AV107Ttproducwwds_36_tfprdnum2 ,
                                           String A718PrdNom ,
                                           String A719PrdNum ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           java.math.BigDecimal A685PrdCanRes ,
                                           java.math.BigDecimal A684PrdCanPen ,
                                           java.math.BigDecimal A724PrdPreAct ,
                                           String A857ValDsc ,
                                           String A727PrdRec ,
                                           java.math.BigDecimal A9733PrdAox ,
                                           String A11363PrdGots ,
                                           String A5887PrdReach ,
                                           String A11364PrdHm ,
                                           String A13302PrdTHELIST ,
                                           String A9741PrdHS ,
                                           java.util.Date A9742PrdFHS ,
                                           String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[34];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdHS, T1.PrdNum2, T1.PrdFHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdHS" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P08NU11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A5888PrdOkotex ,
                                           GXSimpleCollection<String> AV96Ttproducwwds_25_tfprdokotex_sels ,
                                           String A13301PrdZDHC ,
                                           GXSimpleCollection<String> AV99Ttproducwwds_28_tfprdzdhc_sels ,
                                           String A11687PrdList ,
                                           GXSimpleCollection<String> AV100Ttproducwwds_29_tfprdlist_sels ,
                                           String AV73Ttproducwwds_2_tfprdnom_sel ,
                                           String AV72Ttproducwwds_1_tfprdnom ,
                                           String AV75Ttproducwwds_4_tfprdnum_sel ,
                                           String AV74Ttproducwwds_3_tfprdnum ,
                                           java.math.BigDecimal AV76Ttproducwwds_5_tfprdexialm ,
                                           java.math.BigDecimal AV77Ttproducwwds_6_tfprdexialm_to ,
                                           java.math.BigDecimal AV78Ttproducwwds_7_tfprdcanres ,
                                           java.math.BigDecimal AV79Ttproducwwds_8_tfprdcanres_to ,
                                           java.math.BigDecimal AV80Ttproducwwds_9_tfprddisponible ,
                                           java.math.BigDecimal AV81Ttproducwwds_10_tfprddisponible_to ,
                                           java.math.BigDecimal AV82Ttproducwwds_11_tfprdcanpen ,
                                           java.math.BigDecimal AV83Ttproducwwds_12_tfprdcanpen_to ,
                                           java.math.BigDecimal AV84Ttproducwwds_13_tfprdpreact ,
                                           java.math.BigDecimal AV85Ttproducwwds_14_tfprdpreact_to ,
                                           String AV87Ttproducwwds_16_tfvaldsc_sel ,
                                           String AV86Ttproducwwds_15_tfvaldsc ,
                                           String AV89Ttproducwwds_18_tfprdrec_sel ,
                                           String AV88Ttproducwwds_17_tfprdrec ,
                                           java.math.BigDecimal AV90Ttproducwwds_19_tfprdaox ,
                                           java.math.BigDecimal AV91Ttproducwwds_20_tfprdaox_to ,
                                           String AV93Ttproducwwds_22_tfprdgots_sel ,
                                           String AV92Ttproducwwds_21_tfprdgots ,
                                           String AV95Ttproducwwds_24_tfprdreach_sel ,
                                           String AV94Ttproducwwds_23_tfprdreach ,
                                           int AV96Ttproducwwds_25_tfprdokotex_sels_size ,
                                           String AV98Ttproducwwds_27_tfprdhm_sel ,
                                           String AV97Ttproducwwds_26_tfprdhm ,
                                           int AV99Ttproducwwds_28_tfprdzdhc_sels_size ,
                                           int AV100Ttproducwwds_29_tfprdlist_sels_size ,
                                           String AV102Ttproducwwds_31_tfprdthelist_sel ,
                                           String AV101Ttproducwwds_30_tfprdthelist ,
                                           String AV104Ttproducwwds_33_tfprdhs_sel ,
                                           String AV103Ttproducwwds_32_tfprdhs ,
                                           java.util.Date AV105Ttproducwwds_34_tfprdfhs ,
                                           java.util.Date AV106Ttproducwwds_35_tfprdfhs_to ,
                                           String AV108Ttproducwwds_37_tfprdnum2_sel ,
                                           String AV107Ttproducwwds_36_tfprdnum2 ,
                                           String A718PrdNom ,
                                           String A719PrdNum ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           java.math.BigDecimal A685PrdCanRes ,
                                           java.math.BigDecimal A684PrdCanPen ,
                                           java.math.BigDecimal A724PrdPreAct ,
                                           String A857ValDsc ,
                                           String A727PrdRec ,
                                           java.math.BigDecimal A9733PrdAox ,
                                           String A11363PrdGots ,
                                           String A5887PrdReach ,
                                           String A11364PrdHm ,
                                           String A13302PrdTHELIST ,
                                           String A9741PrdHS ,
                                           java.util.Date A9742PrdFHS ,
                                           String A4693PrdNum2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[34];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ValCod, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      scmdbuf += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod)" ;
      if ( (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV88Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV92Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV94Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( AV96Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( AV99Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV99Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV100Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV101Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV103Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum2" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_P08NU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 1 :
                  return conditional_P08NU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 2 :
                  return conditional_P08NU4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 3 :
                  return conditional_P08NU5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 4 :
                  return conditional_P08NU6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 5 :
                  return conditional_P08NU7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 6 :
                  return conditional_P08NU8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 7 :
                  return conditional_P08NU9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 8 :
                  return conditional_P08NU10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
            case 9 :
                  return conditional_P08NU11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NU11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
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
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               return;
      }
   }

}

