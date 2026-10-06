package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ccstkswwgetfilterdata extends GXProcedure
{
   public ccstkswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ccstkswwgetfilterdata.class ), "" );
   }

   public ccstkswwgetfilterdata( int remoteHandle ,
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
      ccstkswwgetfilterdata.this.aP5 = new String[] {""};
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
      ccstkswwgetfilterdata.this.AV62DDOName = aP0;
      ccstkswwgetfilterdata.this.AV60SearchTxt = aP1;
      ccstkswwgetfilterdata.this.AV61SearchTxtTo = aP2;
      ccstkswwgetfilterdata.this.aP3 = aP3;
      ccstkswwgetfilterdata.this.aP4 = aP4;
      ccstkswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_TIPMOVCC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMOVCCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_TIPMOVCN") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMOVCNOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKPRIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKPAROPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKALB") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKALBOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKUSU") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKUSUOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKHOR") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKHOROPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_CCSTKDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKDSCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV66OptionsJson = AV65Options.toJSonString(false) ;
      AV69OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV71OptionIndexesJson = AV70OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV73Session.getValue("CCSTKSWWGridState"), "") == 0 )
      {
         AV75GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CCSTKSWWGridState"), null, null);
      }
      else
      {
         AV75GridState.fromxml(AV73Session.getValue("CCSTKSWWGridState"), null, null);
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV76GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV14TFCCStkLin = GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV15TFCCStkLin_To = GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANE") == 0 )
         {
            AV16TFCCStkCanE = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFCCStkCanE_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV18TFCCStkCanS = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFCCStkCanS_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV20TFTipMovCc = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV21TFTipMovCc_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV22TFTipMovCn = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV23TFTipMovCn_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI") == 0 )
         {
            AV24TFCCStkPri = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI_SEL") == 0 )
         {
            AV25TFCCStkPri_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV26TFCCStkFec = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV28TFCCStkPre = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFCCStkPre_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKBAR") == 0 )
         {
            AV30TFCCStkBar = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFCCStkBar_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKREO") == 0 )
         {
            AV32TFCCStkReo = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFCCStkReo_To = (byte)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR") == 0 )
         {
            AV34TFCCStkPar = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR_SEL") == 0 )
         {
            AV35TFCCStkPar_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPED") == 0 )
         {
            AV36TFCCStkPed = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCCStkPed_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV38TFCCStkAlb = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV39TFCCStkAlb_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV40TFCCStkUsu = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV41TFCCStkUsu_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV42TFCCStkHor = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV43TFCCStkHor_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV44TFCCStkDsc = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV45TFCCStkDsc_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLEN") == 0 )
         {
            AV46TFCCStkLen = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFCCStkLen_To = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV48TFPrdExiAlm = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdExiAlm_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCOCOD") == 0 )
         {
            AV50TFCcoCod = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFCcoCod_To = (short)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORE") == 0 )
         {
            AV52TFValorE = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFValorE_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORS") == 0 )
         {
            AV54TFValorS = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFValorS_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALOREI") == 0 )
         {
            AV56TFValorEI = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFValorEI_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORSI") == 0 )
         {
            AV58TFValorSI = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFValorSI_To = CommonUtil.decimalVal( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV60SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE3 */
      pr_default.execute(0, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LE2 = false ;
         A396EmprCod = P09LE3_A396EmprCod[0] ;
         A3917ValorSI = P09LE3_A3917ValorSI[0] ;
         A3916ValorEI = P09LE3_A3916ValorEI[0] ;
         A3839CcoCod = P09LE3_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE3_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE3_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE3_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE3_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE3_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE3_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE3_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE3_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE3_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE3_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE3_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE3_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE3_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE3_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE3_A3342CCStkLin[0] ;
         A719PrdNum = P09LE3_A719PrdNum[0] ;
         A3344CCStkCanS = P09LE3_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE3_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE3_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE3_A3910ValorS[0] ;
         A3909ValorE = P09LE3_A3909ValorE[0] ;
         A3346TipMovCn = P09LE3_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE3_n3346TipMovCn[0] ;
         A704PrdExiAlm = P09LE3_A704PrdExiAlm[0] ;
         A3910ValorS = P09LE3_A3910ValorS[0] ;
         A3909ValorE = P09LE3_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LE3_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9LE2 = false ;
            A3342CCStkLin = P09LE3_A3342CCStkLin[0] ;
            A719PrdNum = P09LE3_A719PrdNum[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV64Option = A396EmprCod ;
            AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV65Options.add(AV64Option, 0);
            AV68OptionsDesc.add(AV67OptionDesc, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE2 )
         {
            brk9LE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV60SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE5 */
      pr_default.execute(1, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LE4 = false ;
         A719PrdNum = P09LE5_A719PrdNum[0] ;
         A3917ValorSI = P09LE5_A3917ValorSI[0] ;
         A3916ValorEI = P09LE5_A3916ValorEI[0] ;
         A3839CcoCod = P09LE5_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE5_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE5_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE5_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE5_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE5_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE5_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE5_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE5_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE5_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE5_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE5_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE5_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE5_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE5_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE5_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE5_A3342CCStkLin[0] ;
         A396EmprCod = P09LE5_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE5_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE5_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE5_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE5_A3910ValorS[0] ;
         A3909ValorE = P09LE5_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE5_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE5_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE5_n3346TipMovCn[0] ;
         A3910ValorS = P09LE5_A3910ValorS[0] ;
         A3909ValorE = P09LE5_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LE5_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9LE4 = false ;
            A3342CCStkLin = P09LE5_A3342CCStkLin[0] ;
            A396EmprCod = P09LE5_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV64Option = A719PrdNum ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE4 )
         {
            brk9LE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADTIPMOVCCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFTipMovCc = AV60SearchTxt ;
      AV21TFTipMovCc_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE7 */
      pr_default.execute(2, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9LE6 = false ;
         A3345TipMovCc = P09LE7_A3345TipMovCc[0] ;
         A3917ValorSI = P09LE7_A3917ValorSI[0] ;
         A3916ValorEI = P09LE7_A3916ValorEI[0] ;
         A3839CcoCod = P09LE7_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE7_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE7_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE7_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE7_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE7_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE7_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE7_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE7_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE7_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE7_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE7_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE7_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE7_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE7_n3346TipMovCn[0] ;
         A3342CCStkLin = P09LE7_A3342CCStkLin[0] ;
         A719PrdNum = P09LE7_A719PrdNum[0] ;
         A396EmprCod = P09LE7_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE7_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE7_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE7_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE7_A3910ValorS[0] ;
         A3909ValorE = P09LE7_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE7_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE7_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE7_n3346TipMovCn[0] ;
         A3910ValorS = P09LE7_A3910ValorS[0] ;
         A3909ValorE = P09LE7_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09LE7_A3345TipMovCc[0], A3345TipMovCc) == 0 ) )
         {
            brk9LE6 = false ;
            A3342CCStkLin = P09LE7_A3342CCStkLin[0] ;
            A719PrdNum = P09LE7_A719PrdNum[0] ;
            A396EmprCod = P09LE7_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3345TipMovCc)==0) )
         {
            AV64Option = A3345TipMovCc ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE6 )
         {
            brk9LE6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTIPMOVCNOPTIONS' Routine */
      returnInSub = false ;
      AV22TFTipMovCn = AV60SearchTxt ;
      AV23TFTipMovCn_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE9 */
      pr_default.execute(3, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9LE8 = false ;
         A3345TipMovCc = P09LE9_A3345TipMovCc[0] ;
         A396EmprCod = P09LE9_A396EmprCod[0] ;
         A3917ValorSI = P09LE9_A3917ValorSI[0] ;
         A3916ValorEI = P09LE9_A3916ValorEI[0] ;
         A3839CcoCod = P09LE9_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE9_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE9_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE9_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE9_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE9_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE9_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE9_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE9_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE9_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE9_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE9_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE9_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE9_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE9_n3346TipMovCn[0] ;
         A3342CCStkLin = P09LE9_A3342CCStkLin[0] ;
         A719PrdNum = P09LE9_A719PrdNum[0] ;
         A3344CCStkCanS = P09LE9_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE9_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE9_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE9_A3910ValorS[0] ;
         A3909ValorE = P09LE9_A3909ValorE[0] ;
         A3346TipMovCn = P09LE9_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE9_n3346TipMovCn[0] ;
         A704PrdExiAlm = P09LE9_A704PrdExiAlm[0] ;
         A3910ValorS = P09LE9_A3910ValorS[0] ;
         A3909ValorE = P09LE9_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09LE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09LE9_A3345TipMovCc[0], A3345TipMovCc) == 0 ) )
         {
            brk9LE8 = false ;
            A3342CCStkLin = P09LE9_A3342CCStkLin[0] ;
            A719PrdNum = P09LE9_A719PrdNum[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A3346TipMovCn)==0) )
         {
            AV64Option = A3346TipMovCn ;
            AV63InsertIndex = 1 ;
            while ( ( AV63InsertIndex <= AV65Options.size() ) && ( GXutil.strcmp((String)AV65Options.elementAt(-1+AV63InsertIndex), AV64Option) < 0 ) )
            {
               AV63InsertIndex = (int)(AV63InsertIndex+1) ;
            }
            AV65Options.add(AV64Option, AV63InsertIndex);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), AV63InsertIndex);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE8 )
         {
            brk9LE8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCSTKPRIOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCCStkPri = AV60SearchTxt ;
      AV25TFCCStkPri_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE11 */
      pr_default.execute(4, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9LE10 = false ;
         A3347CCStkPri = P09LE11_A3347CCStkPri[0] ;
         A3917ValorSI = P09LE11_A3917ValorSI[0] ;
         A3916ValorEI = P09LE11_A3916ValorEI[0] ;
         A3839CcoCod = P09LE11_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE11_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE11_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE11_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE11_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE11_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE11_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE11_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE11_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE11_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE11_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE11_A3348CCStkFec[0] ;
         A3346TipMovCn = P09LE11_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE11_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE11_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE11_A3342CCStkLin[0] ;
         A719PrdNum = P09LE11_A719PrdNum[0] ;
         A396EmprCod = P09LE11_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE11_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE11_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE11_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE11_A3910ValorS[0] ;
         A3909ValorE = P09LE11_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE11_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE11_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE11_n3346TipMovCn[0] ;
         A3910ValorS = P09LE11_A3910ValorS[0] ;
         A3909ValorE = P09LE11_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09LE11_A3347CCStkPri[0], A3347CCStkPri) == 0 ) )
         {
            brk9LE10 = false ;
            A3342CCStkLin = P09LE11_A3342CCStkLin[0] ;
            A719PrdNum = P09LE11_A719PrdNum[0] ;
            A396EmprCod = P09LE11_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A3347CCStkPri)==0) )
         {
            AV64Option = A3347CCStkPri ;
            AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3347CCStkPri, "9"))) ;
            AV65Options.add(AV64Option, 0);
            AV68OptionsDesc.add(AV67OptionDesc, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE10 )
         {
            brk9LE10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADCCSTKPAROPTIONS' Routine */
      returnInSub = false ;
      AV34TFCCStkPar = AV60SearchTxt ;
      AV35TFCCStkPar_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE13 */
      pr_default.execute(5, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9LE12 = false ;
         A3352CCStkPar = P09LE13_A3352CCStkPar[0] ;
         A3917ValorSI = P09LE13_A3917ValorSI[0] ;
         A3916ValorEI = P09LE13_A3916ValorEI[0] ;
         A3839CcoCod = P09LE13_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE13_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE13_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE13_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE13_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE13_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE13_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE13_A3353CCStkPed[0] ;
         A3351CCStkReo = P09LE13_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE13_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE13_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE13_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE13_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE13_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE13_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE13_A3342CCStkLin[0] ;
         A719PrdNum = P09LE13_A719PrdNum[0] ;
         A396EmprCod = P09LE13_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE13_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE13_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE13_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE13_A3910ValorS[0] ;
         A3909ValorE = P09LE13_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE13_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE13_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE13_n3346TipMovCn[0] ;
         A3910ValorS = P09LE13_A3910ValorS[0] ;
         A3909ValorE = P09LE13_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09LE13_A3352CCStkPar[0], A3352CCStkPar) == 0 ) )
         {
            brk9LE12 = false ;
            A3342CCStkLin = P09LE13_A3342CCStkLin[0] ;
            A719PrdNum = P09LE13_A719PrdNum[0] ;
            A396EmprCod = P09LE13_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A3352CCStkPar)==0) )
         {
            AV64Option = A3352CCStkPar ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE12 )
         {
            brk9LE12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADCCSTKALBOPTIONS' Routine */
      returnInSub = false ;
      AV38TFCCStkAlb = AV60SearchTxt ;
      AV39TFCCStkAlb_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE15 */
      pr_default.execute(6, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9LE14 = false ;
         A3354CCStkAlb = P09LE15_A3354CCStkAlb[0] ;
         A3917ValorSI = P09LE15_A3917ValorSI[0] ;
         A3916ValorEI = P09LE15_A3916ValorEI[0] ;
         A3839CcoCod = P09LE15_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE15_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE15_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE15_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE15_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE15_A3355CCStkUsu[0] ;
         A3353CCStkPed = P09LE15_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE15_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE15_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE15_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE15_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE15_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE15_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE15_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE15_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE15_A3342CCStkLin[0] ;
         A719PrdNum = P09LE15_A719PrdNum[0] ;
         A396EmprCod = P09LE15_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE15_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE15_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE15_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE15_A3910ValorS[0] ;
         A3909ValorE = P09LE15_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE15_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE15_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE15_n3346TipMovCn[0] ;
         A3910ValorS = P09LE15_A3910ValorS[0] ;
         A3909ValorE = P09LE15_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09LE15_A3354CCStkAlb[0], A3354CCStkAlb) == 0 ) )
         {
            brk9LE14 = false ;
            A3342CCStkLin = P09LE15_A3342CCStkLin[0] ;
            A719PrdNum = P09LE15_A719PrdNum[0] ;
            A396EmprCod = P09LE15_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A3354CCStkAlb)==0) )
         {
            AV64Option = A3354CCStkAlb ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE14 )
         {
            brk9LE14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADCCSTKUSUOPTIONS' Routine */
      returnInSub = false ;
      AV40TFCCStkUsu = AV60SearchTxt ;
      AV41TFCCStkUsu_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE17 */
      pr_default.execute(7, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9LE16 = false ;
         A3355CCStkUsu = P09LE17_A3355CCStkUsu[0] ;
         A3917ValorSI = P09LE17_A3917ValorSI[0] ;
         A3916ValorEI = P09LE17_A3916ValorEI[0] ;
         A3839CcoCod = P09LE17_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE17_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE17_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE17_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09LE17_A3356CCStkHor[0] ;
         A3354CCStkAlb = P09LE17_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE17_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE17_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE17_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE17_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE17_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE17_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE17_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE17_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE17_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE17_A3342CCStkLin[0] ;
         A719PrdNum = P09LE17_A719PrdNum[0] ;
         A396EmprCod = P09LE17_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE17_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE17_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE17_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE17_A3910ValorS[0] ;
         A3909ValorE = P09LE17_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE17_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE17_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE17_n3346TipMovCn[0] ;
         A3910ValorS = P09LE17_A3910ValorS[0] ;
         A3909ValorE = P09LE17_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09LE17_A3355CCStkUsu[0], A3355CCStkUsu) == 0 ) )
         {
            brk9LE16 = false ;
            A3342CCStkLin = P09LE17_A3342CCStkLin[0] ;
            A719PrdNum = P09LE17_A719PrdNum[0] ;
            A396EmprCod = P09LE17_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A3355CCStkUsu)==0) )
         {
            AV64Option = A3355CCStkUsu ;
            AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!"))) ;
            AV65Options.add(AV64Option, 0);
            AV68OptionsDesc.add(AV67OptionDesc, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE16 )
         {
            brk9LE16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADCCSTKHOROPTIONS' Routine */
      returnInSub = false ;
      AV42TFCCStkHor = AV60SearchTxt ;
      AV43TFCCStkHor_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE19 */
      pr_default.execute(8, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk9LE18 = false ;
         A3356CCStkHor = P09LE19_A3356CCStkHor[0] ;
         A3917ValorSI = P09LE19_A3917ValorSI[0] ;
         A3916ValorEI = P09LE19_A3916ValorEI[0] ;
         A3839CcoCod = P09LE19_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE19_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE19_A3358CCStkLen[0] ;
         A3357CCStkDsc = P09LE19_A3357CCStkDsc[0] ;
         A3355CCStkUsu = P09LE19_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE19_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE19_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE19_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE19_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE19_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE19_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE19_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE19_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE19_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE19_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE19_A3342CCStkLin[0] ;
         A719PrdNum = P09LE19_A719PrdNum[0] ;
         A396EmprCod = P09LE19_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE19_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE19_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE19_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE19_A3910ValorS[0] ;
         A3909ValorE = P09LE19_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE19_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE19_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE19_n3346TipMovCn[0] ;
         A3910ValorS = P09LE19_A3910ValorS[0] ;
         A3909ValorE = P09LE19_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P09LE19_A3356CCStkHor[0], A3356CCStkHor) == 0 ) )
         {
            brk9LE18 = false ;
            A3342CCStkLin = P09LE19_A3342CCStkLin[0] ;
            A719PrdNum = P09LE19_A719PrdNum[0] ;
            A396EmprCod = P09LE19_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A3356CCStkHor)==0) )
         {
            AV64Option = A3356CCStkHor ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE18 )
         {
            brk9LE18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADCCSTKDSCOPTIONS' Routine */
      returnInSub = false ;
      AV44TFCCStkDsc = AV60SearchTxt ;
      AV45TFCCStkDsc_Sel = "" ;
      AV83Ccstkswwds_1_filterfulltext = AV78FilterFullText ;
      AV84Ccstkswwds_2_tfemprcod = AV10TFEmprCod ;
      AV85Ccstkswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV86Ccstkswwds_4_tfprdnum = AV12TFPrdNum ;
      AV87Ccstkswwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV88Ccstkswwds_6_tfccstklin = AV14TFCCStkLin ;
      AV89Ccstkswwds_7_tfccstklin_to = AV15TFCCStkLin_To ;
      AV90Ccstkswwds_8_tfccstkcane = AV16TFCCStkCanE ;
      AV91Ccstkswwds_9_tfccstkcane_to = AV17TFCCStkCanE_To ;
      AV92Ccstkswwds_10_tfccstkcans = AV18TFCCStkCanS ;
      AV93Ccstkswwds_11_tfccstkcans_to = AV19TFCCStkCanS_To ;
      AV94Ccstkswwds_12_tftipmovcc = AV20TFTipMovCc ;
      AV95Ccstkswwds_13_tftipmovcc_sel = AV21TFTipMovCc_Sel ;
      AV96Ccstkswwds_14_tftipmovcn = AV22TFTipMovCn ;
      AV97Ccstkswwds_15_tftipmovcn_sel = AV23TFTipMovCn_Sel ;
      AV98Ccstkswwds_16_tfccstkpri = AV24TFCCStkPri ;
      AV99Ccstkswwds_17_tfccstkpri_sel = AV25TFCCStkPri_Sel ;
      AV100Ccstkswwds_18_tfccstkfec = AV26TFCCStkFec ;
      AV101Ccstkswwds_19_tfccstkpre = AV28TFCCStkPre ;
      AV102Ccstkswwds_20_tfccstkpre_to = AV29TFCCStkPre_To ;
      AV103Ccstkswwds_21_tfccstkbar = AV30TFCCStkBar ;
      AV104Ccstkswwds_22_tfccstkbar_to = AV31TFCCStkBar_To ;
      AV105Ccstkswwds_23_tfccstkreo = AV32TFCCStkReo ;
      AV106Ccstkswwds_24_tfccstkreo_to = AV33TFCCStkReo_To ;
      AV107Ccstkswwds_25_tfccstkpar = AV34TFCCStkPar ;
      AV108Ccstkswwds_26_tfccstkpar_sel = AV35TFCCStkPar_Sel ;
      AV109Ccstkswwds_27_tfccstkped = AV36TFCCStkPed ;
      AV110Ccstkswwds_28_tfccstkped_to = AV37TFCCStkPed_To ;
      AV111Ccstkswwds_29_tfccstkalb = AV38TFCCStkAlb ;
      AV112Ccstkswwds_30_tfccstkalb_sel = AV39TFCCStkAlb_Sel ;
      AV113Ccstkswwds_31_tfccstkusu = AV40TFCCStkUsu ;
      AV114Ccstkswwds_32_tfccstkusu_sel = AV41TFCCStkUsu_Sel ;
      AV115Ccstkswwds_33_tfccstkhor = AV42TFCCStkHor ;
      AV116Ccstkswwds_34_tfccstkhor_sel = AV43TFCCStkHor_Sel ;
      AV117Ccstkswwds_35_tfccstkdsc = AV44TFCCStkDsc ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = AV45TFCCStkDsc_Sel ;
      AV119Ccstkswwds_37_tfccstklen = AV46TFCCStkLen ;
      AV120Ccstkswwds_38_tfccstklen_to = AV47TFCCStkLen_To ;
      AV121Ccstkswwds_39_tfprdexialm = AV48TFPrdExiAlm ;
      AV122Ccstkswwds_40_tfprdexialm_to = AV49TFPrdExiAlm_To ;
      AV123Ccstkswwds_41_tfccocod = AV50TFCcoCod ;
      AV124Ccstkswwds_42_tfccocod_to = AV51TFCcoCod_To ;
      AV125Ccstkswwds_43_tfvalore = AV52TFValorE ;
      AV126Ccstkswwds_44_tfvalore_to = AV53TFValorE_To ;
      AV127Ccstkswwds_45_tfvalors = AV54TFValorS ;
      AV128Ccstkswwds_46_tfvalors_to = AV55TFValorS_To ;
      AV129Ccstkswwds_47_tfvalorei = AV56TFValorEI ;
      AV130Ccstkswwds_48_tfvalorei_to = AV57TFValorEI_To ;
      AV131Ccstkswwds_49_tfvalorsi = AV58TFValorSI ;
      AV132Ccstkswwds_50_tfvalorsi_to = AV59TFValorSI_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV85Ccstkswwds_3_tfemprcod_sel ,
                                           AV84Ccstkswwds_2_tfemprcod ,
                                           AV87Ccstkswwds_5_tfprdnum_sel ,
                                           AV86Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV88Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to) ,
                                           AV90Ccstkswwds_8_tfccstkcane ,
                                           AV91Ccstkswwds_9_tfccstkcane_to ,
                                           AV92Ccstkswwds_10_tfccstkcans ,
                                           AV93Ccstkswwds_11_tfccstkcans_to ,
                                           AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           AV94Ccstkswwds_12_tftipmovcc ,
                                           AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           AV96Ccstkswwds_14_tftipmovcn ,
                                           AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           AV98Ccstkswwds_16_tfccstkpri ,
                                           AV100Ccstkswwds_18_tfccstkfec ,
                                           AV101Ccstkswwds_19_tfccstkpre ,
                                           AV102Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to) ,
                                           AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           AV107Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV109Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to) ,
                                           AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           AV111Ccstkswwds_29_tfccstkalb ,
                                           AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           AV113Ccstkswwds_31_tfccstkusu ,
                                           AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           AV115Ccstkswwds_33_tfccstkhor ,
                                           AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV117Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV119Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to) ,
                                           AV121Ccstkswwds_39_tfprdexialm ,
                                           AV122Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV123Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV124Ccstkswwds_42_tfccocod_to) ,
                                           AV129Ccstkswwds_47_tfvalorei ,
                                           AV130Ccstkswwds_48_tfvalorei_to ,
                                           AV131Ccstkswwds_49_tfvalorsi ,
                                           AV132Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           AV83Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV125Ccstkswwds_43_tfvalore ,
                                           AV126Ccstkswwds_44_tfvalore_to ,
                                           AV127Ccstkswwds_45_tfvalors ,
                                           AV128Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV83Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Ccstkswwds_1_filterfulltext), "%", "") ;
      lV84Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV84Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV86Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV94Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV94Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV96Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV96Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV98Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV98Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV107Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV107Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV111Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV111Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV113Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV113Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV115Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV115Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV117Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV117Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor P09LE21 */
      pr_default.execute(9, new Object[] {AV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, lV83Ccstkswwds_1_filterfulltext, AV125Ccstkswwds_43_tfvalore, AV125Ccstkswwds_43_tfvalore, AV126Ccstkswwds_44_tfvalore_to, AV126Ccstkswwds_44_tfvalore_to, AV127Ccstkswwds_45_tfvalors, AV127Ccstkswwds_45_tfvalors, AV128Ccstkswwds_46_tfvalors_to, AV128Ccstkswwds_46_tfvalors_to, lV84Ccstkswwds_2_tfemprcod, AV85Ccstkswwds_3_tfemprcod_sel, lV86Ccstkswwds_4_tfprdnum, AV87Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV88Ccstkswwds_6_tfccstklin), Long.valueOf(AV89Ccstkswwds_7_tfccstklin_to), AV90Ccstkswwds_8_tfccstkcane, AV91Ccstkswwds_9_tfccstkcane_to, AV92Ccstkswwds_10_tfccstkcans, AV93Ccstkswwds_11_tfccstkcans_to, lV94Ccstkswwds_12_tftipmovcc, AV95Ccstkswwds_13_tftipmovcc_sel, lV96Ccstkswwds_14_tftipmovcn, AV97Ccstkswwds_15_tftipmovcn_sel, lV98Ccstkswwds_16_tfccstkpri, AV99Ccstkswwds_17_tfccstkpri_sel, AV100Ccstkswwds_18_tfccstkfec, AV101Ccstkswwds_19_tfccstkpre, AV102Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV103Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV104Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV105Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV106Ccstkswwds_24_tfccstkreo_to), lV107Ccstkswwds_25_tfccstkpar, AV108Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV109Ccstkswwds_27_tfccstkped), Integer.valueOf(AV110Ccstkswwds_28_tfccstkped_to), lV111Ccstkswwds_29_tfccstkalb, AV112Ccstkswwds_30_tfccstkalb_sel, lV113Ccstkswwds_31_tfccstkusu, AV114Ccstkswwds_32_tfccstkusu_sel, lV115Ccstkswwds_33_tfccstkhor, AV116Ccstkswwds_34_tfccstkhor_sel, lV117Ccstkswwds_35_tfccstkdsc, AV118Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV119Ccstkswwds_37_tfccstklen), Short.valueOf(AV120Ccstkswwds_38_tfccstklen_to), AV121Ccstkswwds_39_tfprdexialm, AV122Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV123Ccstkswwds_41_tfccocod), Short.valueOf(AV124Ccstkswwds_42_tfccocod_to), AV129Ccstkswwds_47_tfvalorei, AV130Ccstkswwds_48_tfvalorei_to, AV131Ccstkswwds_49_tfvalorsi, AV132Ccstkswwds_50_tfvalorsi_to});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9LE20 = false ;
         A3357CCStkDsc = P09LE21_A3357CCStkDsc[0] ;
         A3917ValorSI = P09LE21_A3917ValorSI[0] ;
         A3916ValorEI = P09LE21_A3916ValorEI[0] ;
         A3839CcoCod = P09LE21_A3839CcoCod[0] ;
         A704PrdExiAlm = P09LE21_A704PrdExiAlm[0] ;
         A3358CCStkLen = P09LE21_A3358CCStkLen[0] ;
         A3356CCStkHor = P09LE21_A3356CCStkHor[0] ;
         A3355CCStkUsu = P09LE21_A3355CCStkUsu[0] ;
         A3354CCStkAlb = P09LE21_A3354CCStkAlb[0] ;
         A3353CCStkPed = P09LE21_A3353CCStkPed[0] ;
         A3352CCStkPar = P09LE21_A3352CCStkPar[0] ;
         A3351CCStkReo = P09LE21_A3351CCStkReo[0] ;
         A3350CCStkBar = P09LE21_A3350CCStkBar[0] ;
         A3348CCStkFec = P09LE21_A3348CCStkFec[0] ;
         A3347CCStkPri = P09LE21_A3347CCStkPri[0] ;
         A3346TipMovCn = P09LE21_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE21_n3346TipMovCn[0] ;
         A3345TipMovCc = P09LE21_A3345TipMovCc[0] ;
         A3342CCStkLin = P09LE21_A3342CCStkLin[0] ;
         A719PrdNum = P09LE21_A719PrdNum[0] ;
         A396EmprCod = P09LE21_A396EmprCod[0] ;
         A3344CCStkCanS = P09LE21_A3344CCStkCanS[0] ;
         A3349CCStkPre = P09LE21_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09LE21_A3343CCStkCanE[0] ;
         A3910ValorS = P09LE21_A3910ValorS[0] ;
         A3909ValorE = P09LE21_A3909ValorE[0] ;
         A704PrdExiAlm = P09LE21_A704PrdExiAlm[0] ;
         A3346TipMovCn = P09LE21_A3346TipMovCn[0] ;
         n3346TipMovCn = P09LE21_n3346TipMovCn[0] ;
         A3910ValorS = P09LE21_A3910ValorS[0] ;
         A3909ValorE = P09LE21_A3909ValorE[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09LE21_A3357CCStkDsc[0], A3357CCStkDsc) == 0 ) )
         {
            brk9LE20 = false ;
            A3342CCStkLin = P09LE21_A3342CCStkLin[0] ;
            A719PrdNum = P09LE21_A719PrdNum[0] ;
            A396EmprCod = P09LE21_A396EmprCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk9LE20 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A3357CCStkDsc)==0) )
         {
            AV64Option = A3357CCStkDsc ;
            AV65Options.add(AV64Option, 0);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LE20 )
         {
            brk9LE20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ccstkswwgetfilterdata.this.AV66OptionsJson;
      this.aP4[0] = ccstkswwgetfilterdata.this.AV69OptionsDescJson;
      this.aP5[0] = ccstkswwgetfilterdata.this.AV71OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66OptionsJson = "" ;
      AV69OptionsDescJson = "" ;
      AV71OptionIndexesJson = "" ;
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV73Session = httpContext.getWebSession();
      AV75GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV16TFCCStkCanE = DecimalUtil.ZERO ;
      AV17TFCCStkCanE_To = DecimalUtil.ZERO ;
      AV18TFCCStkCanS = DecimalUtil.ZERO ;
      AV19TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV20TFTipMovCc = "" ;
      AV21TFTipMovCc_Sel = "" ;
      AV22TFTipMovCn = "" ;
      AV23TFTipMovCn_Sel = "" ;
      AV24TFCCStkPri = "" ;
      AV25TFCCStkPri_Sel = "" ;
      AV26TFCCStkFec = GXutil.nullDate() ;
      AV28TFCCStkPre = DecimalUtil.ZERO ;
      AV29TFCCStkPre_To = DecimalUtil.ZERO ;
      AV34TFCCStkPar = "" ;
      AV35TFCCStkPar_Sel = "" ;
      AV38TFCCStkAlb = "" ;
      AV39TFCCStkAlb_Sel = "" ;
      AV40TFCCStkUsu = "" ;
      AV41TFCCStkUsu_Sel = "" ;
      AV42TFCCStkHor = "" ;
      AV43TFCCStkHor_Sel = "" ;
      AV44TFCCStkDsc = "" ;
      AV45TFCCStkDsc_Sel = "" ;
      AV48TFPrdExiAlm = DecimalUtil.ZERO ;
      AV49TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV52TFValorE = DecimalUtil.ZERO ;
      AV53TFValorE_To = DecimalUtil.ZERO ;
      AV54TFValorS = DecimalUtil.ZERO ;
      AV55TFValorS_To = DecimalUtil.ZERO ;
      AV56TFValorEI = DecimalUtil.ZERO ;
      AV57TFValorEI_To = DecimalUtil.ZERO ;
      AV58TFValorSI = DecimalUtil.ZERO ;
      AV59TFValorSI_To = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV83Ccstkswwds_1_filterfulltext = "" ;
      AV84Ccstkswwds_2_tfemprcod = "" ;
      AV85Ccstkswwds_3_tfemprcod_sel = "" ;
      AV86Ccstkswwds_4_tfprdnum = "" ;
      AV87Ccstkswwds_5_tfprdnum_sel = "" ;
      AV90Ccstkswwds_8_tfccstkcane = DecimalUtil.ZERO ;
      AV91Ccstkswwds_9_tfccstkcane_to = DecimalUtil.ZERO ;
      AV92Ccstkswwds_10_tfccstkcans = DecimalUtil.ZERO ;
      AV93Ccstkswwds_11_tfccstkcans_to = DecimalUtil.ZERO ;
      AV94Ccstkswwds_12_tftipmovcc = "" ;
      AV95Ccstkswwds_13_tftipmovcc_sel = "" ;
      AV96Ccstkswwds_14_tftipmovcn = "" ;
      AV97Ccstkswwds_15_tftipmovcn_sel = "" ;
      AV98Ccstkswwds_16_tfccstkpri = "" ;
      AV99Ccstkswwds_17_tfccstkpri_sel = "" ;
      AV100Ccstkswwds_18_tfccstkfec = GXutil.nullDate() ;
      AV101Ccstkswwds_19_tfccstkpre = DecimalUtil.ZERO ;
      AV102Ccstkswwds_20_tfccstkpre_to = DecimalUtil.ZERO ;
      AV107Ccstkswwds_25_tfccstkpar = "" ;
      AV108Ccstkswwds_26_tfccstkpar_sel = "" ;
      AV111Ccstkswwds_29_tfccstkalb = "" ;
      AV112Ccstkswwds_30_tfccstkalb_sel = "" ;
      AV113Ccstkswwds_31_tfccstkusu = "" ;
      AV114Ccstkswwds_32_tfccstkusu_sel = "" ;
      AV115Ccstkswwds_33_tfccstkhor = "" ;
      AV116Ccstkswwds_34_tfccstkhor_sel = "" ;
      AV117Ccstkswwds_35_tfccstkdsc = "" ;
      AV118Ccstkswwds_36_tfccstkdsc_sel = "" ;
      AV121Ccstkswwds_39_tfprdexialm = DecimalUtil.ZERO ;
      AV122Ccstkswwds_40_tfprdexialm_to = DecimalUtil.ZERO ;
      AV125Ccstkswwds_43_tfvalore = DecimalUtil.ZERO ;
      AV126Ccstkswwds_44_tfvalore_to = DecimalUtil.ZERO ;
      AV127Ccstkswwds_45_tfvalors = DecimalUtil.ZERO ;
      AV128Ccstkswwds_46_tfvalors_to = DecimalUtil.ZERO ;
      AV129Ccstkswwds_47_tfvalorei = DecimalUtil.ZERO ;
      AV130Ccstkswwds_48_tfvalorei_to = DecimalUtil.ZERO ;
      AV131Ccstkswwds_49_tfvalorsi = DecimalUtil.ZERO ;
      AV132Ccstkswwds_50_tfvalorsi_to = DecimalUtil.ZERO ;
      lV83Ccstkswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV84Ccstkswwds_2_tfemprcod = "" ;
      lV86Ccstkswwds_4_tfprdnum = "" ;
      lV94Ccstkswwds_12_tftipmovcc = "" ;
      lV96Ccstkswwds_14_tftipmovcn = "" ;
      lV98Ccstkswwds_16_tfccstkpri = "" ;
      lV107Ccstkswwds_25_tfccstkpar = "" ;
      lV111Ccstkswwds_29_tfccstkalb = "" ;
      lV113Ccstkswwds_31_tfccstkusu = "" ;
      lV115Ccstkswwds_33_tfccstkhor = "" ;
      lV117Ccstkswwds_35_tfccstkdsc = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      P09LE3_A396EmprCod = new String[] {""} ;
      P09LE3_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3839CcoCod = new short[1] ;
      P09LE3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3358CCStkLen = new short[1] ;
      P09LE3_A3357CCStkDsc = new String[] {""} ;
      P09LE3_A3356CCStkHor = new String[] {""} ;
      P09LE3_A3355CCStkUsu = new String[] {""} ;
      P09LE3_A3354CCStkAlb = new String[] {""} ;
      P09LE3_A3353CCStkPed = new int[1] ;
      P09LE3_A3352CCStkPar = new String[] {""} ;
      P09LE3_A3351CCStkReo = new byte[1] ;
      P09LE3_A3350CCStkBar = new int[1] ;
      P09LE3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE3_A3347CCStkPri = new String[] {""} ;
      P09LE3_A3346TipMovCn = new String[] {""} ;
      P09LE3_n3346TipMovCn = new boolean[] {false} ;
      P09LE3_A3345TipMovCc = new String[] {""} ;
      P09LE3_A3342CCStkLin = new long[1] ;
      P09LE3_A719PrdNum = new String[] {""} ;
      P09LE3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE3_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV64Option = "" ;
      AV67OptionDesc = "" ;
      P09LE5_A719PrdNum = new String[] {""} ;
      P09LE5_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3839CcoCod = new short[1] ;
      P09LE5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3358CCStkLen = new short[1] ;
      P09LE5_A3357CCStkDsc = new String[] {""} ;
      P09LE5_A3356CCStkHor = new String[] {""} ;
      P09LE5_A3355CCStkUsu = new String[] {""} ;
      P09LE5_A3354CCStkAlb = new String[] {""} ;
      P09LE5_A3353CCStkPed = new int[1] ;
      P09LE5_A3352CCStkPar = new String[] {""} ;
      P09LE5_A3351CCStkReo = new byte[1] ;
      P09LE5_A3350CCStkBar = new int[1] ;
      P09LE5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE5_A3347CCStkPri = new String[] {""} ;
      P09LE5_A3346TipMovCn = new String[] {""} ;
      P09LE5_n3346TipMovCn = new boolean[] {false} ;
      P09LE5_A3345TipMovCc = new String[] {""} ;
      P09LE5_A3342CCStkLin = new long[1] ;
      P09LE5_A396EmprCod = new String[] {""} ;
      P09LE5_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE5_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3345TipMovCc = new String[] {""} ;
      P09LE7_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3839CcoCod = new short[1] ;
      P09LE7_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3358CCStkLen = new short[1] ;
      P09LE7_A3357CCStkDsc = new String[] {""} ;
      P09LE7_A3356CCStkHor = new String[] {""} ;
      P09LE7_A3355CCStkUsu = new String[] {""} ;
      P09LE7_A3354CCStkAlb = new String[] {""} ;
      P09LE7_A3353CCStkPed = new int[1] ;
      P09LE7_A3352CCStkPar = new String[] {""} ;
      P09LE7_A3351CCStkReo = new byte[1] ;
      P09LE7_A3350CCStkBar = new int[1] ;
      P09LE7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE7_A3347CCStkPri = new String[] {""} ;
      P09LE7_A3346TipMovCn = new String[] {""} ;
      P09LE7_n3346TipMovCn = new boolean[] {false} ;
      P09LE7_A3342CCStkLin = new long[1] ;
      P09LE7_A719PrdNum = new String[] {""} ;
      P09LE7_A396EmprCod = new String[] {""} ;
      P09LE7_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE7_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3345TipMovCc = new String[] {""} ;
      P09LE9_A396EmprCod = new String[] {""} ;
      P09LE9_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3839CcoCod = new short[1] ;
      P09LE9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3358CCStkLen = new short[1] ;
      P09LE9_A3357CCStkDsc = new String[] {""} ;
      P09LE9_A3356CCStkHor = new String[] {""} ;
      P09LE9_A3355CCStkUsu = new String[] {""} ;
      P09LE9_A3354CCStkAlb = new String[] {""} ;
      P09LE9_A3353CCStkPed = new int[1] ;
      P09LE9_A3352CCStkPar = new String[] {""} ;
      P09LE9_A3351CCStkReo = new byte[1] ;
      P09LE9_A3350CCStkBar = new int[1] ;
      P09LE9_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE9_A3347CCStkPri = new String[] {""} ;
      P09LE9_A3346TipMovCn = new String[] {""} ;
      P09LE9_n3346TipMovCn = new boolean[] {false} ;
      P09LE9_A3342CCStkLin = new long[1] ;
      P09LE9_A719PrdNum = new String[] {""} ;
      P09LE9_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE9_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3347CCStkPri = new String[] {""} ;
      P09LE11_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3839CcoCod = new short[1] ;
      P09LE11_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3358CCStkLen = new short[1] ;
      P09LE11_A3357CCStkDsc = new String[] {""} ;
      P09LE11_A3356CCStkHor = new String[] {""} ;
      P09LE11_A3355CCStkUsu = new String[] {""} ;
      P09LE11_A3354CCStkAlb = new String[] {""} ;
      P09LE11_A3353CCStkPed = new int[1] ;
      P09LE11_A3352CCStkPar = new String[] {""} ;
      P09LE11_A3351CCStkReo = new byte[1] ;
      P09LE11_A3350CCStkBar = new int[1] ;
      P09LE11_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE11_A3346TipMovCn = new String[] {""} ;
      P09LE11_n3346TipMovCn = new boolean[] {false} ;
      P09LE11_A3345TipMovCc = new String[] {""} ;
      P09LE11_A3342CCStkLin = new long[1] ;
      P09LE11_A719PrdNum = new String[] {""} ;
      P09LE11_A396EmprCod = new String[] {""} ;
      P09LE11_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE11_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3352CCStkPar = new String[] {""} ;
      P09LE13_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3839CcoCod = new short[1] ;
      P09LE13_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3358CCStkLen = new short[1] ;
      P09LE13_A3357CCStkDsc = new String[] {""} ;
      P09LE13_A3356CCStkHor = new String[] {""} ;
      P09LE13_A3355CCStkUsu = new String[] {""} ;
      P09LE13_A3354CCStkAlb = new String[] {""} ;
      P09LE13_A3353CCStkPed = new int[1] ;
      P09LE13_A3351CCStkReo = new byte[1] ;
      P09LE13_A3350CCStkBar = new int[1] ;
      P09LE13_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE13_A3347CCStkPri = new String[] {""} ;
      P09LE13_A3346TipMovCn = new String[] {""} ;
      P09LE13_n3346TipMovCn = new boolean[] {false} ;
      P09LE13_A3345TipMovCc = new String[] {""} ;
      P09LE13_A3342CCStkLin = new long[1] ;
      P09LE13_A719PrdNum = new String[] {""} ;
      P09LE13_A396EmprCod = new String[] {""} ;
      P09LE13_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE13_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3354CCStkAlb = new String[] {""} ;
      P09LE15_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3839CcoCod = new short[1] ;
      P09LE15_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3358CCStkLen = new short[1] ;
      P09LE15_A3357CCStkDsc = new String[] {""} ;
      P09LE15_A3356CCStkHor = new String[] {""} ;
      P09LE15_A3355CCStkUsu = new String[] {""} ;
      P09LE15_A3353CCStkPed = new int[1] ;
      P09LE15_A3352CCStkPar = new String[] {""} ;
      P09LE15_A3351CCStkReo = new byte[1] ;
      P09LE15_A3350CCStkBar = new int[1] ;
      P09LE15_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE15_A3347CCStkPri = new String[] {""} ;
      P09LE15_A3346TipMovCn = new String[] {""} ;
      P09LE15_n3346TipMovCn = new boolean[] {false} ;
      P09LE15_A3345TipMovCc = new String[] {""} ;
      P09LE15_A3342CCStkLin = new long[1] ;
      P09LE15_A719PrdNum = new String[] {""} ;
      P09LE15_A396EmprCod = new String[] {""} ;
      P09LE15_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE15_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3355CCStkUsu = new String[] {""} ;
      P09LE17_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3839CcoCod = new short[1] ;
      P09LE17_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3358CCStkLen = new short[1] ;
      P09LE17_A3357CCStkDsc = new String[] {""} ;
      P09LE17_A3356CCStkHor = new String[] {""} ;
      P09LE17_A3354CCStkAlb = new String[] {""} ;
      P09LE17_A3353CCStkPed = new int[1] ;
      P09LE17_A3352CCStkPar = new String[] {""} ;
      P09LE17_A3351CCStkReo = new byte[1] ;
      P09LE17_A3350CCStkBar = new int[1] ;
      P09LE17_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE17_A3347CCStkPri = new String[] {""} ;
      P09LE17_A3346TipMovCn = new String[] {""} ;
      P09LE17_n3346TipMovCn = new boolean[] {false} ;
      P09LE17_A3345TipMovCc = new String[] {""} ;
      P09LE17_A3342CCStkLin = new long[1] ;
      P09LE17_A719PrdNum = new String[] {""} ;
      P09LE17_A396EmprCod = new String[] {""} ;
      P09LE17_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE17_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3356CCStkHor = new String[] {""} ;
      P09LE19_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3839CcoCod = new short[1] ;
      P09LE19_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3358CCStkLen = new short[1] ;
      P09LE19_A3357CCStkDsc = new String[] {""} ;
      P09LE19_A3355CCStkUsu = new String[] {""} ;
      P09LE19_A3354CCStkAlb = new String[] {""} ;
      P09LE19_A3353CCStkPed = new int[1] ;
      P09LE19_A3352CCStkPar = new String[] {""} ;
      P09LE19_A3351CCStkReo = new byte[1] ;
      P09LE19_A3350CCStkBar = new int[1] ;
      P09LE19_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE19_A3347CCStkPri = new String[] {""} ;
      P09LE19_A3346TipMovCn = new String[] {""} ;
      P09LE19_n3346TipMovCn = new boolean[] {false} ;
      P09LE19_A3345TipMovCc = new String[] {""} ;
      P09LE19_A3342CCStkLin = new long[1] ;
      P09LE19_A719PrdNum = new String[] {""} ;
      P09LE19_A396EmprCod = new String[] {""} ;
      P09LE19_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE19_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3357CCStkDsc = new String[] {""} ;
      P09LE21_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3839CcoCod = new short[1] ;
      P09LE21_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3358CCStkLen = new short[1] ;
      P09LE21_A3356CCStkHor = new String[] {""} ;
      P09LE21_A3355CCStkUsu = new String[] {""} ;
      P09LE21_A3354CCStkAlb = new String[] {""} ;
      P09LE21_A3353CCStkPed = new int[1] ;
      P09LE21_A3352CCStkPar = new String[] {""} ;
      P09LE21_A3351CCStkReo = new byte[1] ;
      P09LE21_A3350CCStkBar = new int[1] ;
      P09LE21_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LE21_A3347CCStkPri = new String[] {""} ;
      P09LE21_A3346TipMovCn = new String[] {""} ;
      P09LE21_n3346TipMovCn = new boolean[] {false} ;
      P09LE21_A3345TipMovCc = new String[] {""} ;
      P09LE21_A3342CCStkLin = new long[1] ;
      P09LE21_A719PrdNum = new String[] {""} ;
      P09LE21_A396EmprCod = new String[] {""} ;
      P09LE21_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LE21_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstkswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LE3_A396EmprCod, P09LE3_A3917ValorSI, P09LE3_A3916ValorEI, P09LE3_A3839CcoCod, P09LE3_A704PrdExiAlm, P09LE3_A3358CCStkLen, P09LE3_A3357CCStkDsc, P09LE3_A3356CCStkHor, P09LE3_A3355CCStkUsu, P09LE3_A3354CCStkAlb,
            P09LE3_A3353CCStkPed, P09LE3_A3352CCStkPar, P09LE3_A3351CCStkReo, P09LE3_A3350CCStkBar, P09LE3_A3348CCStkFec, P09LE3_A3347CCStkPri, P09LE3_A3346TipMovCn, P09LE3_n3346TipMovCn, P09LE3_A3345TipMovCc, P09LE3_A3342CCStkLin,
            P09LE3_A719PrdNum, P09LE3_A3344CCStkCanS, P09LE3_A3349CCStkPre, P09LE3_A3343CCStkCanE, P09LE3_A3910ValorS, P09LE3_A3909ValorE
            }
            , new Object[] {
            P09LE5_A719PrdNum, P09LE5_A3917ValorSI, P09LE5_A3916ValorEI, P09LE5_A3839CcoCod, P09LE5_A704PrdExiAlm, P09LE5_A3358CCStkLen, P09LE5_A3357CCStkDsc, P09LE5_A3356CCStkHor, P09LE5_A3355CCStkUsu, P09LE5_A3354CCStkAlb,
            P09LE5_A3353CCStkPed, P09LE5_A3352CCStkPar, P09LE5_A3351CCStkReo, P09LE5_A3350CCStkBar, P09LE5_A3348CCStkFec, P09LE5_A3347CCStkPri, P09LE5_A3346TipMovCn, P09LE5_n3346TipMovCn, P09LE5_A3345TipMovCc, P09LE5_A3342CCStkLin,
            P09LE5_A396EmprCod, P09LE5_A3344CCStkCanS, P09LE5_A3349CCStkPre, P09LE5_A3343CCStkCanE, P09LE5_A3910ValorS, P09LE5_A3909ValorE
            }
            , new Object[] {
            P09LE7_A3345TipMovCc, P09LE7_A3917ValorSI, P09LE7_A3916ValorEI, P09LE7_A3839CcoCod, P09LE7_A704PrdExiAlm, P09LE7_A3358CCStkLen, P09LE7_A3357CCStkDsc, P09LE7_A3356CCStkHor, P09LE7_A3355CCStkUsu, P09LE7_A3354CCStkAlb,
            P09LE7_A3353CCStkPed, P09LE7_A3352CCStkPar, P09LE7_A3351CCStkReo, P09LE7_A3350CCStkBar, P09LE7_A3348CCStkFec, P09LE7_A3347CCStkPri, P09LE7_A3346TipMovCn, P09LE7_n3346TipMovCn, P09LE7_A3342CCStkLin, P09LE7_A719PrdNum,
            P09LE7_A396EmprCod, P09LE7_A3344CCStkCanS, P09LE7_A3349CCStkPre, P09LE7_A3343CCStkCanE, P09LE7_A3910ValorS, P09LE7_A3909ValorE
            }
            , new Object[] {
            P09LE9_A3345TipMovCc, P09LE9_A396EmprCod, P09LE9_A3917ValorSI, P09LE9_A3916ValorEI, P09LE9_A3839CcoCod, P09LE9_A704PrdExiAlm, P09LE9_A3358CCStkLen, P09LE9_A3357CCStkDsc, P09LE9_A3356CCStkHor, P09LE9_A3355CCStkUsu,
            P09LE9_A3354CCStkAlb, P09LE9_A3353CCStkPed, P09LE9_A3352CCStkPar, P09LE9_A3351CCStkReo, P09LE9_A3350CCStkBar, P09LE9_A3348CCStkFec, P09LE9_A3347CCStkPri, P09LE9_A3346TipMovCn, P09LE9_n3346TipMovCn, P09LE9_A3342CCStkLin,
            P09LE9_A719PrdNum, P09LE9_A3344CCStkCanS, P09LE9_A3349CCStkPre, P09LE9_A3343CCStkCanE, P09LE9_A3910ValorS, P09LE9_A3909ValorE
            }
            , new Object[] {
            P09LE11_A3347CCStkPri, P09LE11_A3917ValorSI, P09LE11_A3916ValorEI, P09LE11_A3839CcoCod, P09LE11_A704PrdExiAlm, P09LE11_A3358CCStkLen, P09LE11_A3357CCStkDsc, P09LE11_A3356CCStkHor, P09LE11_A3355CCStkUsu, P09LE11_A3354CCStkAlb,
            P09LE11_A3353CCStkPed, P09LE11_A3352CCStkPar, P09LE11_A3351CCStkReo, P09LE11_A3350CCStkBar, P09LE11_A3348CCStkFec, P09LE11_A3346TipMovCn, P09LE11_n3346TipMovCn, P09LE11_A3345TipMovCc, P09LE11_A3342CCStkLin, P09LE11_A719PrdNum,
            P09LE11_A396EmprCod, P09LE11_A3344CCStkCanS, P09LE11_A3349CCStkPre, P09LE11_A3343CCStkCanE, P09LE11_A3910ValorS, P09LE11_A3909ValorE
            }
            , new Object[] {
            P09LE13_A3352CCStkPar, P09LE13_A3917ValorSI, P09LE13_A3916ValorEI, P09LE13_A3839CcoCod, P09LE13_A704PrdExiAlm, P09LE13_A3358CCStkLen, P09LE13_A3357CCStkDsc, P09LE13_A3356CCStkHor, P09LE13_A3355CCStkUsu, P09LE13_A3354CCStkAlb,
            P09LE13_A3353CCStkPed, P09LE13_A3351CCStkReo, P09LE13_A3350CCStkBar, P09LE13_A3348CCStkFec, P09LE13_A3347CCStkPri, P09LE13_A3346TipMovCn, P09LE13_n3346TipMovCn, P09LE13_A3345TipMovCc, P09LE13_A3342CCStkLin, P09LE13_A719PrdNum,
            P09LE13_A396EmprCod, P09LE13_A3344CCStkCanS, P09LE13_A3349CCStkPre, P09LE13_A3343CCStkCanE, P09LE13_A3910ValorS, P09LE13_A3909ValorE
            }
            , new Object[] {
            P09LE15_A3354CCStkAlb, P09LE15_A3917ValorSI, P09LE15_A3916ValorEI, P09LE15_A3839CcoCod, P09LE15_A704PrdExiAlm, P09LE15_A3358CCStkLen, P09LE15_A3357CCStkDsc, P09LE15_A3356CCStkHor, P09LE15_A3355CCStkUsu, P09LE15_A3353CCStkPed,
            P09LE15_A3352CCStkPar, P09LE15_A3351CCStkReo, P09LE15_A3350CCStkBar, P09LE15_A3348CCStkFec, P09LE15_A3347CCStkPri, P09LE15_A3346TipMovCn, P09LE15_n3346TipMovCn, P09LE15_A3345TipMovCc, P09LE15_A3342CCStkLin, P09LE15_A719PrdNum,
            P09LE15_A396EmprCod, P09LE15_A3344CCStkCanS, P09LE15_A3349CCStkPre, P09LE15_A3343CCStkCanE, P09LE15_A3910ValorS, P09LE15_A3909ValorE
            }
            , new Object[] {
            P09LE17_A3355CCStkUsu, P09LE17_A3917ValorSI, P09LE17_A3916ValorEI, P09LE17_A3839CcoCod, P09LE17_A704PrdExiAlm, P09LE17_A3358CCStkLen, P09LE17_A3357CCStkDsc, P09LE17_A3356CCStkHor, P09LE17_A3354CCStkAlb, P09LE17_A3353CCStkPed,
            P09LE17_A3352CCStkPar, P09LE17_A3351CCStkReo, P09LE17_A3350CCStkBar, P09LE17_A3348CCStkFec, P09LE17_A3347CCStkPri, P09LE17_A3346TipMovCn, P09LE17_n3346TipMovCn, P09LE17_A3345TipMovCc, P09LE17_A3342CCStkLin, P09LE17_A719PrdNum,
            P09LE17_A396EmprCod, P09LE17_A3344CCStkCanS, P09LE17_A3349CCStkPre, P09LE17_A3343CCStkCanE, P09LE17_A3910ValorS, P09LE17_A3909ValorE
            }
            , new Object[] {
            P09LE19_A3356CCStkHor, P09LE19_A3917ValorSI, P09LE19_A3916ValorEI, P09LE19_A3839CcoCod, P09LE19_A704PrdExiAlm, P09LE19_A3358CCStkLen, P09LE19_A3357CCStkDsc, P09LE19_A3355CCStkUsu, P09LE19_A3354CCStkAlb, P09LE19_A3353CCStkPed,
            P09LE19_A3352CCStkPar, P09LE19_A3351CCStkReo, P09LE19_A3350CCStkBar, P09LE19_A3348CCStkFec, P09LE19_A3347CCStkPri, P09LE19_A3346TipMovCn, P09LE19_n3346TipMovCn, P09LE19_A3345TipMovCc, P09LE19_A3342CCStkLin, P09LE19_A719PrdNum,
            P09LE19_A396EmprCod, P09LE19_A3344CCStkCanS, P09LE19_A3349CCStkPre, P09LE19_A3343CCStkCanE, P09LE19_A3910ValorS, P09LE19_A3909ValorE
            }
            , new Object[] {
            P09LE21_A3357CCStkDsc, P09LE21_A3917ValorSI, P09LE21_A3916ValorEI, P09LE21_A3839CcoCod, P09LE21_A704PrdExiAlm, P09LE21_A3358CCStkLen, P09LE21_A3356CCStkHor, P09LE21_A3355CCStkUsu, P09LE21_A3354CCStkAlb, P09LE21_A3353CCStkPed,
            P09LE21_A3352CCStkPar, P09LE21_A3351CCStkReo, P09LE21_A3350CCStkBar, P09LE21_A3348CCStkFec, P09LE21_A3347CCStkPri, P09LE21_A3346TipMovCn, P09LE21_n3346TipMovCn, P09LE21_A3345TipMovCc, P09LE21_A3342CCStkLin, P09LE21_A719PrdNum,
            P09LE21_A396EmprCod, P09LE21_A3344CCStkCanS, P09LE21_A3349CCStkPre, P09LE21_A3343CCStkCanE, P09LE21_A3910ValorS, P09LE21_A3909ValorE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TFCCStkReo ;
   private byte AV33TFCCStkReo_To ;
   private byte AV105Ccstkswwds_23_tfccstkreo ;
   private byte AV106Ccstkswwds_24_tfccstkreo_to ;
   private byte A3351CCStkReo ;
   private short AV46TFCCStkLen ;
   private short AV47TFCCStkLen_To ;
   private short AV50TFCcoCod ;
   private short AV51TFCcoCod_To ;
   private short AV119Ccstkswwds_37_tfccstklen ;
   private short AV120Ccstkswwds_38_tfccstklen_to ;
   private short AV123Ccstkswwds_41_tfccocod ;
   private short AV124Ccstkswwds_42_tfccocod_to ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV81GXV1 ;
   private int AV30TFCCStkBar ;
   private int AV31TFCCStkBar_To ;
   private int AV36TFCCStkPed ;
   private int AV37TFCCStkPed_To ;
   private int AV103Ccstkswwds_21_tfccstkbar ;
   private int AV104Ccstkswwds_22_tfccstkbar_to ;
   private int AV109Ccstkswwds_27_tfccstkped ;
   private int AV110Ccstkswwds_28_tfccstkped_to ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV63InsertIndex ;
   private long AV14TFCCStkLin ;
   private long AV15TFCCStkLin_To ;
   private long AV88Ccstkswwds_6_tfccstklin ;
   private long AV89Ccstkswwds_7_tfccstklin_to ;
   private long A3342CCStkLin ;
   private long AV72count ;
   private java.math.BigDecimal AV16TFCCStkCanE ;
   private java.math.BigDecimal AV17TFCCStkCanE_To ;
   private java.math.BigDecimal AV18TFCCStkCanS ;
   private java.math.BigDecimal AV19TFCCStkCanS_To ;
   private java.math.BigDecimal AV28TFCCStkPre ;
   private java.math.BigDecimal AV29TFCCStkPre_To ;
   private java.math.BigDecimal AV48TFPrdExiAlm ;
   private java.math.BigDecimal AV49TFPrdExiAlm_To ;
   private java.math.BigDecimal AV52TFValorE ;
   private java.math.BigDecimal AV53TFValorE_To ;
   private java.math.BigDecimal AV54TFValorS ;
   private java.math.BigDecimal AV55TFValorS_To ;
   private java.math.BigDecimal AV56TFValorEI ;
   private java.math.BigDecimal AV57TFValorEI_To ;
   private java.math.BigDecimal AV58TFValorSI ;
   private java.math.BigDecimal AV59TFValorSI_To ;
   private java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ;
   private java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ;
   private java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ;
   private java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ;
   private java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ;
   private java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ;
   private java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ;
   private java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ;
   private java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ;
   private java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ;
   private java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ;
   private java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to ;
   private java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ;
   private java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ;
   private java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ;
   private java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV20TFTipMovCc ;
   private String AV21TFTipMovCc_Sel ;
   private String AV22TFTipMovCn ;
   private String AV23TFTipMovCn_Sel ;
   private String AV24TFCCStkPri ;
   private String AV25TFCCStkPri_Sel ;
   private String AV34TFCCStkPar ;
   private String AV35TFCCStkPar_Sel ;
   private String AV38TFCCStkAlb ;
   private String AV39TFCCStkAlb_Sel ;
   private String AV40TFCCStkUsu ;
   private String AV41TFCCStkUsu_Sel ;
   private String AV42TFCCStkHor ;
   private String AV43TFCCStkHor_Sel ;
   private String AV44TFCCStkDsc ;
   private String AV45TFCCStkDsc_Sel ;
   private String A396EmprCod ;
   private String AV84Ccstkswwds_2_tfemprcod ;
   private String AV85Ccstkswwds_3_tfemprcod_sel ;
   private String AV86Ccstkswwds_4_tfprdnum ;
   private String AV87Ccstkswwds_5_tfprdnum_sel ;
   private String AV94Ccstkswwds_12_tftipmovcc ;
   private String AV95Ccstkswwds_13_tftipmovcc_sel ;
   private String AV96Ccstkswwds_14_tftipmovcn ;
   private String AV97Ccstkswwds_15_tftipmovcn_sel ;
   private String AV98Ccstkswwds_16_tfccstkpri ;
   private String AV99Ccstkswwds_17_tfccstkpri_sel ;
   private String AV107Ccstkswwds_25_tfccstkpar ;
   private String AV108Ccstkswwds_26_tfccstkpar_sel ;
   private String AV111Ccstkswwds_29_tfccstkalb ;
   private String AV112Ccstkswwds_30_tfccstkalb_sel ;
   private String AV113Ccstkswwds_31_tfccstkusu ;
   private String AV114Ccstkswwds_32_tfccstkusu_sel ;
   private String AV115Ccstkswwds_33_tfccstkhor ;
   private String AV116Ccstkswwds_34_tfccstkhor_sel ;
   private String AV117Ccstkswwds_35_tfccstkdsc ;
   private String AV118Ccstkswwds_36_tfccstkdsc_sel ;
   private String scmdbuf ;
   private String lV84Ccstkswwds_2_tfemprcod ;
   private String lV86Ccstkswwds_4_tfprdnum ;
   private String lV94Ccstkswwds_12_tftipmovcc ;
   private String lV96Ccstkswwds_14_tftipmovcn ;
   private String lV98Ccstkswwds_16_tfccstkpri ;
   private String lV107Ccstkswwds_25_tfccstkpar ;
   private String lV111Ccstkswwds_29_tfccstkalb ;
   private String lV113Ccstkswwds_31_tfccstkusu ;
   private String lV115Ccstkswwds_33_tfccstkhor ;
   private String lV117Ccstkswwds_35_tfccstkdsc ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3346TipMovCn ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A3357CCStkDsc ;
   private java.util.Date AV26TFCCStkFec ;
   private java.util.Date AV100Ccstkswwds_18_tfccstkfec ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private boolean brk9LE2 ;
   private boolean n3346TipMovCn ;
   private boolean brk9LE4 ;
   private boolean brk9LE6 ;
   private boolean brk9LE8 ;
   private boolean brk9LE10 ;
   private boolean brk9LE12 ;
   private boolean brk9LE14 ;
   private boolean brk9LE16 ;
   private boolean brk9LE18 ;
   private boolean brk9LE20 ;
   private String AV66OptionsJson ;
   private String AV69OptionsDescJson ;
   private String AV71OptionIndexesJson ;
   private String AV62DDOName ;
   private String AV60SearchTxt ;
   private String AV61SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV83Ccstkswwds_1_filterfulltext ;
   private String lV83Ccstkswwds_1_filterfulltext ;
   private String AV64Option ;
   private String AV67OptionDesc ;
   private com.genexus.webpanels.WebSession AV73Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LE3_A396EmprCod ;
   private java.math.BigDecimal[] P09LE3_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE3_A3916ValorEI ;
   private short[] P09LE3_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE3_A704PrdExiAlm ;
   private short[] P09LE3_A3358CCStkLen ;
   private String[] P09LE3_A3357CCStkDsc ;
   private String[] P09LE3_A3356CCStkHor ;
   private String[] P09LE3_A3355CCStkUsu ;
   private String[] P09LE3_A3354CCStkAlb ;
   private int[] P09LE3_A3353CCStkPed ;
   private String[] P09LE3_A3352CCStkPar ;
   private byte[] P09LE3_A3351CCStkReo ;
   private int[] P09LE3_A3350CCStkBar ;
   private java.util.Date[] P09LE3_A3348CCStkFec ;
   private String[] P09LE3_A3347CCStkPri ;
   private String[] P09LE3_A3346TipMovCn ;
   private boolean[] P09LE3_n3346TipMovCn ;
   private String[] P09LE3_A3345TipMovCc ;
   private long[] P09LE3_A3342CCStkLin ;
   private String[] P09LE3_A719PrdNum ;
   private java.math.BigDecimal[] P09LE3_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE3_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE3_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE3_A3910ValorS ;
   private java.math.BigDecimal[] P09LE3_A3909ValorE ;
   private String[] P09LE5_A719PrdNum ;
   private java.math.BigDecimal[] P09LE5_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE5_A3916ValorEI ;
   private short[] P09LE5_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE5_A704PrdExiAlm ;
   private short[] P09LE5_A3358CCStkLen ;
   private String[] P09LE5_A3357CCStkDsc ;
   private String[] P09LE5_A3356CCStkHor ;
   private String[] P09LE5_A3355CCStkUsu ;
   private String[] P09LE5_A3354CCStkAlb ;
   private int[] P09LE5_A3353CCStkPed ;
   private String[] P09LE5_A3352CCStkPar ;
   private byte[] P09LE5_A3351CCStkReo ;
   private int[] P09LE5_A3350CCStkBar ;
   private java.util.Date[] P09LE5_A3348CCStkFec ;
   private String[] P09LE5_A3347CCStkPri ;
   private String[] P09LE5_A3346TipMovCn ;
   private boolean[] P09LE5_n3346TipMovCn ;
   private String[] P09LE5_A3345TipMovCc ;
   private long[] P09LE5_A3342CCStkLin ;
   private String[] P09LE5_A396EmprCod ;
   private java.math.BigDecimal[] P09LE5_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE5_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE5_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE5_A3910ValorS ;
   private java.math.BigDecimal[] P09LE5_A3909ValorE ;
   private String[] P09LE7_A3345TipMovCc ;
   private java.math.BigDecimal[] P09LE7_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE7_A3916ValorEI ;
   private short[] P09LE7_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE7_A704PrdExiAlm ;
   private short[] P09LE7_A3358CCStkLen ;
   private String[] P09LE7_A3357CCStkDsc ;
   private String[] P09LE7_A3356CCStkHor ;
   private String[] P09LE7_A3355CCStkUsu ;
   private String[] P09LE7_A3354CCStkAlb ;
   private int[] P09LE7_A3353CCStkPed ;
   private String[] P09LE7_A3352CCStkPar ;
   private byte[] P09LE7_A3351CCStkReo ;
   private int[] P09LE7_A3350CCStkBar ;
   private java.util.Date[] P09LE7_A3348CCStkFec ;
   private String[] P09LE7_A3347CCStkPri ;
   private String[] P09LE7_A3346TipMovCn ;
   private boolean[] P09LE7_n3346TipMovCn ;
   private long[] P09LE7_A3342CCStkLin ;
   private String[] P09LE7_A719PrdNum ;
   private String[] P09LE7_A396EmprCod ;
   private java.math.BigDecimal[] P09LE7_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE7_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE7_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE7_A3910ValorS ;
   private java.math.BigDecimal[] P09LE7_A3909ValorE ;
   private String[] P09LE9_A3345TipMovCc ;
   private String[] P09LE9_A396EmprCod ;
   private java.math.BigDecimal[] P09LE9_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE9_A3916ValorEI ;
   private short[] P09LE9_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE9_A704PrdExiAlm ;
   private short[] P09LE9_A3358CCStkLen ;
   private String[] P09LE9_A3357CCStkDsc ;
   private String[] P09LE9_A3356CCStkHor ;
   private String[] P09LE9_A3355CCStkUsu ;
   private String[] P09LE9_A3354CCStkAlb ;
   private int[] P09LE9_A3353CCStkPed ;
   private String[] P09LE9_A3352CCStkPar ;
   private byte[] P09LE9_A3351CCStkReo ;
   private int[] P09LE9_A3350CCStkBar ;
   private java.util.Date[] P09LE9_A3348CCStkFec ;
   private String[] P09LE9_A3347CCStkPri ;
   private String[] P09LE9_A3346TipMovCn ;
   private boolean[] P09LE9_n3346TipMovCn ;
   private long[] P09LE9_A3342CCStkLin ;
   private String[] P09LE9_A719PrdNum ;
   private java.math.BigDecimal[] P09LE9_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE9_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE9_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE9_A3910ValorS ;
   private java.math.BigDecimal[] P09LE9_A3909ValorE ;
   private String[] P09LE11_A3347CCStkPri ;
   private java.math.BigDecimal[] P09LE11_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE11_A3916ValorEI ;
   private short[] P09LE11_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE11_A704PrdExiAlm ;
   private short[] P09LE11_A3358CCStkLen ;
   private String[] P09LE11_A3357CCStkDsc ;
   private String[] P09LE11_A3356CCStkHor ;
   private String[] P09LE11_A3355CCStkUsu ;
   private String[] P09LE11_A3354CCStkAlb ;
   private int[] P09LE11_A3353CCStkPed ;
   private String[] P09LE11_A3352CCStkPar ;
   private byte[] P09LE11_A3351CCStkReo ;
   private int[] P09LE11_A3350CCStkBar ;
   private java.util.Date[] P09LE11_A3348CCStkFec ;
   private String[] P09LE11_A3346TipMovCn ;
   private boolean[] P09LE11_n3346TipMovCn ;
   private String[] P09LE11_A3345TipMovCc ;
   private long[] P09LE11_A3342CCStkLin ;
   private String[] P09LE11_A719PrdNum ;
   private String[] P09LE11_A396EmprCod ;
   private java.math.BigDecimal[] P09LE11_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE11_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE11_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE11_A3910ValorS ;
   private java.math.BigDecimal[] P09LE11_A3909ValorE ;
   private String[] P09LE13_A3352CCStkPar ;
   private java.math.BigDecimal[] P09LE13_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE13_A3916ValorEI ;
   private short[] P09LE13_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE13_A704PrdExiAlm ;
   private short[] P09LE13_A3358CCStkLen ;
   private String[] P09LE13_A3357CCStkDsc ;
   private String[] P09LE13_A3356CCStkHor ;
   private String[] P09LE13_A3355CCStkUsu ;
   private String[] P09LE13_A3354CCStkAlb ;
   private int[] P09LE13_A3353CCStkPed ;
   private byte[] P09LE13_A3351CCStkReo ;
   private int[] P09LE13_A3350CCStkBar ;
   private java.util.Date[] P09LE13_A3348CCStkFec ;
   private String[] P09LE13_A3347CCStkPri ;
   private String[] P09LE13_A3346TipMovCn ;
   private boolean[] P09LE13_n3346TipMovCn ;
   private String[] P09LE13_A3345TipMovCc ;
   private long[] P09LE13_A3342CCStkLin ;
   private String[] P09LE13_A719PrdNum ;
   private String[] P09LE13_A396EmprCod ;
   private java.math.BigDecimal[] P09LE13_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE13_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE13_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE13_A3910ValorS ;
   private java.math.BigDecimal[] P09LE13_A3909ValorE ;
   private String[] P09LE15_A3354CCStkAlb ;
   private java.math.BigDecimal[] P09LE15_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE15_A3916ValorEI ;
   private short[] P09LE15_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE15_A704PrdExiAlm ;
   private short[] P09LE15_A3358CCStkLen ;
   private String[] P09LE15_A3357CCStkDsc ;
   private String[] P09LE15_A3356CCStkHor ;
   private String[] P09LE15_A3355CCStkUsu ;
   private int[] P09LE15_A3353CCStkPed ;
   private String[] P09LE15_A3352CCStkPar ;
   private byte[] P09LE15_A3351CCStkReo ;
   private int[] P09LE15_A3350CCStkBar ;
   private java.util.Date[] P09LE15_A3348CCStkFec ;
   private String[] P09LE15_A3347CCStkPri ;
   private String[] P09LE15_A3346TipMovCn ;
   private boolean[] P09LE15_n3346TipMovCn ;
   private String[] P09LE15_A3345TipMovCc ;
   private long[] P09LE15_A3342CCStkLin ;
   private String[] P09LE15_A719PrdNum ;
   private String[] P09LE15_A396EmprCod ;
   private java.math.BigDecimal[] P09LE15_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE15_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE15_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE15_A3910ValorS ;
   private java.math.BigDecimal[] P09LE15_A3909ValorE ;
   private String[] P09LE17_A3355CCStkUsu ;
   private java.math.BigDecimal[] P09LE17_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE17_A3916ValorEI ;
   private short[] P09LE17_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE17_A704PrdExiAlm ;
   private short[] P09LE17_A3358CCStkLen ;
   private String[] P09LE17_A3357CCStkDsc ;
   private String[] P09LE17_A3356CCStkHor ;
   private String[] P09LE17_A3354CCStkAlb ;
   private int[] P09LE17_A3353CCStkPed ;
   private String[] P09LE17_A3352CCStkPar ;
   private byte[] P09LE17_A3351CCStkReo ;
   private int[] P09LE17_A3350CCStkBar ;
   private java.util.Date[] P09LE17_A3348CCStkFec ;
   private String[] P09LE17_A3347CCStkPri ;
   private String[] P09LE17_A3346TipMovCn ;
   private boolean[] P09LE17_n3346TipMovCn ;
   private String[] P09LE17_A3345TipMovCc ;
   private long[] P09LE17_A3342CCStkLin ;
   private String[] P09LE17_A719PrdNum ;
   private String[] P09LE17_A396EmprCod ;
   private java.math.BigDecimal[] P09LE17_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE17_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE17_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE17_A3910ValorS ;
   private java.math.BigDecimal[] P09LE17_A3909ValorE ;
   private String[] P09LE19_A3356CCStkHor ;
   private java.math.BigDecimal[] P09LE19_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE19_A3916ValorEI ;
   private short[] P09LE19_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE19_A704PrdExiAlm ;
   private short[] P09LE19_A3358CCStkLen ;
   private String[] P09LE19_A3357CCStkDsc ;
   private String[] P09LE19_A3355CCStkUsu ;
   private String[] P09LE19_A3354CCStkAlb ;
   private int[] P09LE19_A3353CCStkPed ;
   private String[] P09LE19_A3352CCStkPar ;
   private byte[] P09LE19_A3351CCStkReo ;
   private int[] P09LE19_A3350CCStkBar ;
   private java.util.Date[] P09LE19_A3348CCStkFec ;
   private String[] P09LE19_A3347CCStkPri ;
   private String[] P09LE19_A3346TipMovCn ;
   private boolean[] P09LE19_n3346TipMovCn ;
   private String[] P09LE19_A3345TipMovCc ;
   private long[] P09LE19_A3342CCStkLin ;
   private String[] P09LE19_A719PrdNum ;
   private String[] P09LE19_A396EmprCod ;
   private java.math.BigDecimal[] P09LE19_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE19_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE19_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE19_A3910ValorS ;
   private java.math.BigDecimal[] P09LE19_A3909ValorE ;
   private String[] P09LE21_A3357CCStkDsc ;
   private java.math.BigDecimal[] P09LE21_A3917ValorSI ;
   private java.math.BigDecimal[] P09LE21_A3916ValorEI ;
   private short[] P09LE21_A3839CcoCod ;
   private java.math.BigDecimal[] P09LE21_A704PrdExiAlm ;
   private short[] P09LE21_A3358CCStkLen ;
   private String[] P09LE21_A3356CCStkHor ;
   private String[] P09LE21_A3355CCStkUsu ;
   private String[] P09LE21_A3354CCStkAlb ;
   private int[] P09LE21_A3353CCStkPed ;
   private String[] P09LE21_A3352CCStkPar ;
   private byte[] P09LE21_A3351CCStkReo ;
   private int[] P09LE21_A3350CCStkBar ;
   private java.util.Date[] P09LE21_A3348CCStkFec ;
   private String[] P09LE21_A3347CCStkPri ;
   private String[] P09LE21_A3346TipMovCn ;
   private boolean[] P09LE21_n3346TipMovCn ;
   private String[] P09LE21_A3345TipMovCc ;
   private long[] P09LE21_A3342CCStkLin ;
   private String[] P09LE21_A719PrdNum ;
   private String[] P09LE21_A396EmprCod ;
   private java.math.BigDecimal[] P09LE21_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09LE21_A3349CCStkPre ;
   private java.math.BigDecimal[] P09LE21_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09LE21_A3910ValorS ;
   private java.math.BigDecimal[] P09LE21_A3909ValorE ;
   private GXSimpleCollection<String> AV65Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV70OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV75GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV76GridStateFilterValue ;
}

final  class ccstkswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Ccstkswwds_3_tfemprcod_sel ,
                                          String AV84Ccstkswwds_2_tfemprcod ,
                                          String AV87Ccstkswwds_5_tfprdnum_sel ,
                                          String AV86Ccstkswwds_4_tfprdnum ,
                                          long AV88Ccstkswwds_6_tfccstklin ,
                                          long AV89Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                          String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV94Ccstkswwds_12_tftipmovcc ,
                                          String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV96Ccstkswwds_14_tftipmovcn ,
                                          String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV98Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                          int AV103Ccstkswwds_21_tfccstkbar ,
                                          int AV104Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV105Ccstkswwds_23_tfccstkreo ,
                                          byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                          String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV107Ccstkswwds_25_tfccstkpar ,
                                          int AV109Ccstkswwds_27_tfccstkped ,
                                          int AV110Ccstkswwds_28_tfccstkped_to ,
                                          String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV111Ccstkswwds_29_tfccstkalb ,
                                          String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV113Ccstkswwds_31_tfccstkusu ,
                                          String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV115Ccstkswwds_33_tfccstkhor ,
                                          String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV117Ccstkswwds_35_tfccstkdsc ,
                                          short AV119Ccstkswwds_37_tfccstklen ,
                                          short AV120Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                          short AV123Ccstkswwds_41_tfccocod ,
                                          short AV124Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          String AV83Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[78];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T3.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T2.TipMovCn, T1.TipMovCc," ;
      scmdbuf += " T1.CCStkLin, T1.PrdNum, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPTIPMOV T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMovCc = T1.TipMovCc) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T2.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMovCn = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int2[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T3.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T3.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int2[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int2[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int2[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int2[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int2[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int2[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09LE5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Ccstkswwds_3_tfemprcod_sel ,
                                          String AV84Ccstkswwds_2_tfemprcod ,
                                          String AV87Ccstkswwds_5_tfprdnum_sel ,
                                          String AV86Ccstkswwds_4_tfprdnum ,
                                          long AV88Ccstkswwds_6_tfccstklin ,
                                          long AV89Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                          String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV94Ccstkswwds_12_tftipmovcc ,
                                          String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV96Ccstkswwds_14_tftipmovcn ,
                                          String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV98Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                          int AV103Ccstkswwds_21_tfccstkbar ,
                                          int AV104Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV105Ccstkswwds_23_tfccstkreo ,
                                          byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                          String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV107Ccstkswwds_25_tfccstkpar ,
                                          int AV109Ccstkswwds_27_tfccstkped ,
                                          int AV110Ccstkswwds_28_tfccstkped_to ,
                                          String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV111Ccstkswwds_29_tfccstkalb ,
                                          String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV113Ccstkswwds_31_tfccstkusu ,
                                          String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV115Ccstkswwds_33_tfccstkhor ,
                                          String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV117Ccstkswwds_35_tfccstkdsc ,
                                          short AV119Ccstkswwds_37_tfccstklen ,
                                          short AV120Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                          short AV123Ccstkswwds_41_tfccocod ,
                                          short AV124Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          String AV83Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[78];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc," ;
      scmdbuf += " T1.CCStkLin, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int4[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int4[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int4[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int4[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int4[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int4[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int4[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int4[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int4[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int4[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int4[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int4[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int4[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int4[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int4[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int4[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int4[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09LE7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Ccstkswwds_3_tfemprcod_sel ,
                                          String AV84Ccstkswwds_2_tfemprcod ,
                                          String AV87Ccstkswwds_5_tfprdnum_sel ,
                                          String AV86Ccstkswwds_4_tfprdnum ,
                                          long AV88Ccstkswwds_6_tfccstklin ,
                                          long AV89Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                          String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV94Ccstkswwds_12_tftipmovcc ,
                                          String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV96Ccstkswwds_14_tftipmovcn ,
                                          String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV98Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                          int AV103Ccstkswwds_21_tfccstkbar ,
                                          int AV104Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV105Ccstkswwds_23_tfccstkreo ,
                                          byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                          String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV107Ccstkswwds_25_tfccstkpar ,
                                          int AV109Ccstkswwds_27_tfccstkped ,
                                          int AV110Ccstkswwds_28_tfccstkped_to ,
                                          String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV111Ccstkswwds_29_tfccstkalb ,
                                          String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV113Ccstkswwds_31_tfccstkusu ,
                                          String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV115Ccstkswwds_33_tfccstkhor ,
                                          String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV117Ccstkswwds_35_tfccstkdsc ,
                                          short AV119Ccstkswwds_37_tfccstklen ,
                                          short AV120Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                          short AV123Ccstkswwds_41_tfccocod ,
                                          short AV124Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          String AV83Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[78];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.TipMovCc, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TipMovCc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09LE9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Ccstkswwds_3_tfemprcod_sel ,
                                          String AV84Ccstkswwds_2_tfemprcod ,
                                          String AV87Ccstkswwds_5_tfprdnum_sel ,
                                          String AV86Ccstkswwds_4_tfprdnum ,
                                          long AV88Ccstkswwds_6_tfccstklin ,
                                          long AV89Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                          String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV94Ccstkswwds_12_tftipmovcc ,
                                          String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV96Ccstkswwds_14_tftipmovcn ,
                                          String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV98Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                          int AV103Ccstkswwds_21_tfccstkbar ,
                                          int AV104Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV105Ccstkswwds_23_tfccstkreo ,
                                          byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                          String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV107Ccstkswwds_25_tfccstkpar ,
                                          int AV109Ccstkswwds_27_tfccstkped ,
                                          int AV110Ccstkswwds_28_tfccstkped_to ,
                                          String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV111Ccstkswwds_29_tfccstkalb ,
                                          String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV113Ccstkswwds_31_tfccstkusu ,
                                          String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV115Ccstkswwds_33_tfccstkhor ,
                                          String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV117Ccstkswwds_35_tfccstkdsc ,
                                          short AV119Ccstkswwds_37_tfccstklen ,
                                          short AV120Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                          short AV123Ccstkswwds_41_tfccocod ,
                                          short AV124Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          String AV83Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[78];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TipMovCc, T1.EmprCod, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod," ;
      scmdbuf += " T3.PrdExiAlm, T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T2.TipMovCn," ;
      scmdbuf += " T1.CCStkLin, T1.PrdNum, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPTIPMOV T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMovCc = T1.TipMovCc) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T2.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMovCn = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int8[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T3.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int8[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T3.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int8[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int8[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int8[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int8[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int8[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int8[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int8[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipMovCc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09LE11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[78];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.CCStkPri, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int10[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int10[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int10[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int10[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int10[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int10[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int10[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int10[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int10[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int10[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int10[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int10[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int10[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkPri" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09LE13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[78];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.CCStkPar, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int12[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int12[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int12[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int12[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int12[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int12[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int12[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int12[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int12[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int12[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int12[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int12[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int12[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkPar" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09LE15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[78];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.CCStkAlb, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int14[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int14[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int14[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int14[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int14[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int14[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int14[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int14[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int14[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int14[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int14[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkAlb" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09LE17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[78];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.CCStkUsu, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkHor, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int16[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int16[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int16[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int16[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int16[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int16[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int16[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int16[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int16[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int16[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int16[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int16[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int16[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkUsu" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P09LE19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[78];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.CCStkHor, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkDsc, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int18[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int18[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int18[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int18[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int18[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int18[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int18[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int18[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int18[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int18[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int18[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int18[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int18[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int18[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int18[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int18[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int18[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int18[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int18[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int18[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int18[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int18[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int18[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int18[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkHor" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P09LE21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV85Ccstkswwds_3_tfemprcod_sel ,
                                           String AV84Ccstkswwds_2_tfemprcod ,
                                           String AV87Ccstkswwds_5_tfprdnum_sel ,
                                           String AV86Ccstkswwds_4_tfprdnum ,
                                           long AV88Ccstkswwds_6_tfccstklin ,
                                           long AV89Ccstkswwds_7_tfccstklin_to ,
                                           java.math.BigDecimal AV90Ccstkswwds_8_tfccstkcane ,
                                           java.math.BigDecimal AV91Ccstkswwds_9_tfccstkcane_to ,
                                           java.math.BigDecimal AV92Ccstkswwds_10_tfccstkcans ,
                                           java.math.BigDecimal AV93Ccstkswwds_11_tfccstkcans_to ,
                                           String AV95Ccstkswwds_13_tftipmovcc_sel ,
                                           String AV94Ccstkswwds_12_tftipmovcc ,
                                           String AV97Ccstkswwds_15_tftipmovcn_sel ,
                                           String AV96Ccstkswwds_14_tftipmovcn ,
                                           String AV99Ccstkswwds_17_tfccstkpri_sel ,
                                           String AV98Ccstkswwds_16_tfccstkpri ,
                                           java.util.Date AV100Ccstkswwds_18_tfccstkfec ,
                                           java.math.BigDecimal AV101Ccstkswwds_19_tfccstkpre ,
                                           java.math.BigDecimal AV102Ccstkswwds_20_tfccstkpre_to ,
                                           int AV103Ccstkswwds_21_tfccstkbar ,
                                           int AV104Ccstkswwds_22_tfccstkbar_to ,
                                           byte AV105Ccstkswwds_23_tfccstkreo ,
                                           byte AV106Ccstkswwds_24_tfccstkreo_to ,
                                           String AV108Ccstkswwds_26_tfccstkpar_sel ,
                                           String AV107Ccstkswwds_25_tfccstkpar ,
                                           int AV109Ccstkswwds_27_tfccstkped ,
                                           int AV110Ccstkswwds_28_tfccstkped_to ,
                                           String AV112Ccstkswwds_30_tfccstkalb_sel ,
                                           String AV111Ccstkswwds_29_tfccstkalb ,
                                           String AV114Ccstkswwds_32_tfccstkusu_sel ,
                                           String AV113Ccstkswwds_31_tfccstkusu ,
                                           String AV116Ccstkswwds_34_tfccstkhor_sel ,
                                           String AV115Ccstkswwds_33_tfccstkhor ,
                                           String AV118Ccstkswwds_36_tfccstkdsc_sel ,
                                           String AV117Ccstkswwds_35_tfccstkdsc ,
                                           short AV119Ccstkswwds_37_tfccstklen ,
                                           short AV120Ccstkswwds_38_tfccstklen_to ,
                                           java.math.BigDecimal AV121Ccstkswwds_39_tfprdexialm ,
                                           java.math.BigDecimal AV122Ccstkswwds_40_tfprdexialm_to ,
                                           short AV123Ccstkswwds_41_tfccocod ,
                                           short AV124Ccstkswwds_42_tfccocod_to ,
                                           java.math.BigDecimal AV129Ccstkswwds_47_tfvalorei ,
                                           java.math.BigDecimal AV130Ccstkswwds_48_tfvalorei_to ,
                                           java.math.BigDecimal AV131Ccstkswwds_49_tfvalorsi ,
                                           java.math.BigDecimal AV132Ccstkswwds_50_tfvalorsi_to ,
                                           String A396EmprCod ,
                                           String A719PrdNum ,
                                           long A3342CCStkLin ,
                                           java.math.BigDecimal A3343CCStkCanE ,
                                           java.math.BigDecimal A3344CCStkCanS ,
                                           String A3345TipMovCc ,
                                           String A3346TipMovCn ,
                                           String A3347CCStkPri ,
                                           java.util.Date A3348CCStkFec ,
                                           java.math.BigDecimal A3349CCStkPre ,
                                           int A3350CCStkBar ,
                                           byte A3351CCStkReo ,
                                           String A3352CCStkPar ,
                                           int A3353CCStkPed ,
                                           String A3354CCStkAlb ,
                                           String A3355CCStkUsu ,
                                           String A3356CCStkHor ,
                                           String A3357CCStkDsc ,
                                           short A3358CCStkLen ,
                                           java.math.BigDecimal A704PrdExiAlm ,
                                           short A3839CcoCod ,
                                           String AV83Ccstkswwds_1_filterfulltext ,
                                           java.math.BigDecimal A3909ValorE ,
                                           java.math.BigDecimal A3910ValorS ,
                                           java.math.BigDecimal A3916ValorEI ,
                                           java.math.BigDecimal A3917ValorSI ,
                                           java.math.BigDecimal AV125Ccstkswwds_43_tfvalore ,
                                           java.math.BigDecimal AV126Ccstkswwds_44_tfvalore_to ,
                                           java.math.BigDecimal AV127Ccstkswwds_45_tfvalors ,
                                           java.math.BigDecimal AV128Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[78];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.CCStkDsc, T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm," ;
      scmdbuf += " T1.CCStkLen, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE FROM (((TXPCCSTKS T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN" ;
      scmdbuf += " (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN" ;
      scmdbuf += " ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10)))," ;
      scmdbuf += " 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin" ;
      scmdbuf += " = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV88Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV89Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV96Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV98Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (0==AV103Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! (0==AV104Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( ! (0==AV105Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (0==AV106Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV107Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int20[57] = (byte)(1) ;
      }
      if ( ! (0==AV109Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int20[58] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int20[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV111Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int20[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV113Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int20[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV115Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int20[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int20[67] = (byte)(1) ;
      }
      if ( ! (0==AV119Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int20[68] = (byte)(1) ;
      }
      if ( ! (0==AV120Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int20[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int20[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int20[71] = (byte)(1) ;
      }
      if ( ! (0==AV123Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int20[72] = (byte)(1) ;
      }
      if ( ! (0==AV124Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int20[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int20[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int20[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int20[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int20[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkDsc" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P09LE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 1 :
                  return conditional_P09LE5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 2 :
                  return conditional_P09LE7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 3 :
                  return conditional_P09LE9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 4 :
                  return conditional_P09LE11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 5 :
                  return conditional_P09LE13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 6 :
                  return conditional_P09LE15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 7 :
                  return conditional_P09LE17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 8 :
                  return conditional_P09LE19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
            case 9 :
                  return conditional_P09LE21(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LE21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 2);
               ((long[]) buf[19])[0] = rslt.getLong(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 6);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 2);
               ((long[]) buf[19])[0] = rslt.getLong(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 6);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
      }
   }

}

