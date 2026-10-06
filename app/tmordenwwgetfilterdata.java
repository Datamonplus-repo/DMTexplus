package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordenwwgetfilterdata extends GXProcedure
{
   public tmordenwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenwwgetfilterdata.class ), "" );
   }

   public tmordenwwgetfilterdata( int remoteHandle ,
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
      tmordenwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmordenwwgetfilterdata.this.AV56DDOName = aP0;
      tmordenwwgetfilterdata.this.AV54SearchTxt = aP1;
      tmordenwwgetfilterdata.this.AV55SearchTxtTo = aP2;
      tmordenwwgetfilterdata.this.aP3 = aP3;
      tmordenwwgetfilterdata.this.aP4 = aP4;
      tmordenwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_PMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMMAQCODFOR") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQCODFOROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMDSCMQPLA") == 0 )
      {
         /* Execute user subroutine: 'LOADOMDSCMQPLAOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADOMUSUCREOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADOMTXTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMDURACION") == 0 )
      {
         /* Execute user subroutine: 'LOADOMDURACIONOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMNOT") == 0 )
      {
         /* Execute user subroutine: 'LOADOMNOTOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV60OptionsJson = AV59Options.toJSonString(false) ;
      AV63OptionsDescJson = AV62OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV64OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("TMOrdenWWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMOrdenWWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("TMOrdenWWGridState"), null, null);
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV14TFOMCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFOMCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV26TFPMCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFPMCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV75TFPMDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV76TFPMDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV16TFOMMaqCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV17TFOMMaqCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV20TFOMMaqDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV21TFOMMaqDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR") == 0 )
         {
            AV18TFOMMaqCodFor = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR_SEL") == 0 )
         {
            AV19TFOMMaqCodFor_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA") == 0 )
         {
            AV22TFOMDscMqPla = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA_SEL") == 0 )
         {
            AV23TFOMDscMqPla_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV24TFSMCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFSMCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV50TFOMEst_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFOMEst_Sels.fromJSonString(AV50TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV38TFOMUsuCre = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV39TFOMUsuCre_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV34TFOMFchCre = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV28TFOMTxt = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV29TFOMTxt_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV30TFOMFchPre = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV32TFOMFchCer = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION") == 0 )
         {
            AV36TFOMDuracion = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION_SEL") == 0 )
         {
            AV37TFOMDuracion_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOSREA") == 0 )
         {
            AV40TFOMCosRea = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFOMCosRea_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRRCOST") == 0 )
         {
            AV42TFOMRRCosT = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFOMRRCosT_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRCCOST") == 0 )
         {
            AV44TFOMRCCosT = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFOMRCCosT_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV46TFOMMRCosT = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFOMMRCosT_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCOST") == 0 )
         {
            AV48TFOMMCCosT = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFOMMCCosT_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV52TFOMNot = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV53TFOMNot_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV75TFPMDsc = AV54SearchTxt ;
      AV76TFPMDsc_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV7 */
      pr_default.execute(0, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PV2 = false ;
         A396EmprCod = P08PV7_A396EmprCod[0] ;
         A9473PMDsc = P08PV7_A9473PMDsc[0] ;
         n9473PMDsc = P08PV7_n9473PMDsc[0] ;
         A9464OMNot = P08PV7_A9464OMNot[0] ;
         A9439OMFchCer = P08PV7_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV7_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV7_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV7_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV7_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV7_A9428SMCod[0] ;
         n9428SMCod = P08PV7_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV7_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV7_A9426OMMaqCod[0] ;
         A9429PMCod = P08PV7_A9429PMCod[0] ;
         n9429PMCod = P08PV7_n9429PMCod[0] ;
         A9425OMCod = P08PV7_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV7_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV7_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV7_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV7_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV7_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV7_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV7_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV7_A9473PMDsc[0] ;
         n9473PMDsc = P08PV7_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV7_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV7_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV7_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV7_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV7_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PV7_A9473PMDsc[0], A9473PMDsc) == 0 ) )
                        {
                           brk8PV2 = false ;
                           A396EmprCod = P08PV7_A396EmprCod[0] ;
                           A9429PMCod = P08PV7_A9429PMCod[0] ;
                           n9429PMCod = P08PV7_n9429PMCod[0] ;
                           A9425OMCod = P08PV7_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV2 = true ;
                           pr_default.readNext(0);
                        }
                        if ( ! (GXutil.strcmp("", A9473PMDsc)==0) )
                        {
                           AV58Option = A9473PMDsc ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV2 )
         {
            brk8PV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOMMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFOMMaqCod = AV54SearchTxt ;
      AV17TFOMMaqCod_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV13 */
      pr_default.execute(1, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PV4 = false ;
         A396EmprCod = P08PV13_A396EmprCod[0] ;
         A9426OMMaqCod = P08PV13_A9426OMMaqCod[0] ;
         A9464OMNot = P08PV13_A9464OMNot[0] ;
         A9439OMFchCer = P08PV13_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV13_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV13_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV13_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV13_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV13_A9428SMCod[0] ;
         n9428SMCod = P08PV13_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV13_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV13_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV13_A9473PMDsc[0] ;
         n9473PMDsc = P08PV13_n9473PMDsc[0] ;
         A9429PMCod = P08PV13_A9429PMCod[0] ;
         n9429PMCod = P08PV13_n9429PMCod[0] ;
         A9425OMCod = P08PV13_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV13_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV13_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV13_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV13_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV13_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV13_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV13_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV13_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV13_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV13_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV13_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV13_A9473PMDsc[0] ;
         n9473PMDsc = P08PV13_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV13_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV13_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV13_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV13_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV13_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV13_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV13_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV13_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PV13_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
                        {
                           brk8PV4 = false ;
                           A396EmprCod = P08PV13_A396EmprCod[0] ;
                           A9425OMCod = P08PV13_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV4 = true ;
                           pr_default.readNext(1);
                        }
                        if ( ! (GXutil.strcmp("", A9426OMMaqCod)==0) )
                        {
                           AV58Option = A9426OMMaqCod ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV4 )
         {
            brk8PV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADOMMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFOMMaqDsc = AV54SearchTxt ;
      AV21TFOMMaqDsc_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV19 */
      pr_default.execute(2, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8PV6 = false ;
         A9426OMMaqCod = P08PV19_A9426OMMaqCod[0] ;
         A396EmprCod = P08PV19_A396EmprCod[0] ;
         A9464OMNot = P08PV19_A9464OMNot[0] ;
         A9439OMFchCer = P08PV19_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV19_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV19_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV19_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV19_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV19_A9428SMCod[0] ;
         n9428SMCod = P08PV19_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV19_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV19_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV19_A9473PMDsc[0] ;
         n9473PMDsc = P08PV19_n9473PMDsc[0] ;
         A9429PMCod = P08PV19_A9429PMCod[0] ;
         n9429PMCod = P08PV19_n9429PMCod[0] ;
         A9425OMCod = P08PV19_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV19_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV19_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV19_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV19_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV19_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV19_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV19_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV19_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV19_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV19_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV19_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV19_A9473PMDsc[0] ;
         n9473PMDsc = P08PV19_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV19_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV19_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV19_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV19_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV19_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV19_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV19_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV19_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08PV19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08PV19_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
                        {
                           brk8PV6 = false ;
                           A9425OMCod = P08PV19_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV6 = true ;
                           pr_default.readNext(2);
                        }
                        if ( ! (GXutil.strcmp("", A9427OMMaqDsc)==0) )
                        {
                           AV58Option = A9427OMMaqDsc ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           AV59Options.add(AV58Option, AV57InsertIndex);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV6 )
         {
            brk8PV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADOMMAQCODFOROPTIONS' Routine */
      returnInSub = false ;
      AV18TFOMMaqCodFor = AV54SearchTxt ;
      AV19TFOMMaqCodFor_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV25 */
      pr_default.execute(3, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P08PV25_A396EmprCod[0] ;
         A9464OMNot = P08PV25_A9464OMNot[0] ;
         A9439OMFchCer = P08PV25_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV25_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV25_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV25_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV25_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV25_A9428SMCod[0] ;
         n9428SMCod = P08PV25_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV25_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV25_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV25_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV25_A9473PMDsc[0] ;
         n9473PMDsc = P08PV25_n9473PMDsc[0] ;
         A9429PMCod = P08PV25_A9429PMCod[0] ;
         n9429PMCod = P08PV25_n9429PMCod[0] ;
         A9425OMCod = P08PV25_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV25_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV25_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV25_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV25_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV25_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV25_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV25_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV25_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV25_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV25_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV25_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV25_A9473PMDsc[0] ;
         n9473PMDsc = P08PV25_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV25_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV25_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV25_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV25_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV25_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV25_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV25_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV25_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
                        {
                           AV58Option = A13679OMMaqCodFo ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADOMDSCMQPLAOPTIONS' Routine */
      returnInSub = false ;
      AV22TFOMDscMqPla = AV54SearchTxt ;
      AV23TFOMDscMqPla_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV31 */
      pr_default.execute(4, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P08PV31_A396EmprCod[0] ;
         A9464OMNot = P08PV31_A9464OMNot[0] ;
         A9439OMFchCer = P08PV31_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV31_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV31_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV31_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV31_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV31_A9428SMCod[0] ;
         n9428SMCod = P08PV31_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV31_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV31_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV31_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV31_A9473PMDsc[0] ;
         n9473PMDsc = P08PV31_n9473PMDsc[0] ;
         A9429PMCod = P08PV31_A9429PMCod[0] ;
         n9429PMCod = P08PV31_n9429PMCod[0] ;
         A9425OMCod = P08PV31_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV31_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV31_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV31_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV31_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV31_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV31_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV31_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV31_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV31_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV31_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV31_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV31_A9473PMDsc[0] ;
         n9473PMDsc = P08PV31_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV31_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV31_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV31_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV31_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV31_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV31_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV31_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV31_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13678OMDscMqPla)==0) )
                        {
                           AV58Option = A13678OMDscMqPla ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADOMUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV38TFOMUsuCre = AV54SearchTxt ;
      AV39TFOMUsuCre_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV37 */
      pr_default.execute(5, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8PV10 = false ;
         A396EmprCod = P08PV37_A396EmprCod[0] ;
         A9437OMUsuCre = P08PV37_A9437OMUsuCre[0] ;
         A9464OMNot = P08PV37_A9464OMNot[0] ;
         A9439OMFchCer = P08PV37_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV37_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV37_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV37_A9436OMFchCre[0] ;
         A9428SMCod = P08PV37_A9428SMCod[0] ;
         n9428SMCod = P08PV37_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV37_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV37_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV37_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV37_A9473PMDsc[0] ;
         n9473PMDsc = P08PV37_n9473PMDsc[0] ;
         A9429PMCod = P08PV37_A9429PMCod[0] ;
         n9429PMCod = P08PV37_n9429PMCod[0] ;
         A9425OMCod = P08PV37_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV37_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV37_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV37_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV37_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV37_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV37_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV37_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV37_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV37_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV37_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV37_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV37_A9473PMDsc[0] ;
         n9473PMDsc = P08PV37_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV37_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV37_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV37_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV37_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV37_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV37_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV37_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV37_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08PV37_A9437OMUsuCre[0], A9437OMUsuCre) == 0 ) )
                        {
                           brk8PV10 = false ;
                           A396EmprCod = P08PV37_A396EmprCod[0] ;
                           A9425OMCod = P08PV37_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV10 = true ;
                           pr_default.readNext(5);
                        }
                        if ( ! (GXutil.strcmp("", A9437OMUsuCre)==0) )
                        {
                           AV58Option = A9437OMUsuCre ;
                           AV61OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!"))) ;
                           AV59Options.add(AV58Option, 0);
                           AV62OptionsDesc.add(AV61OptionDesc, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV10 )
         {
            brk8PV10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADOMTXTOPTIONS' Routine */
      returnInSub = false ;
      AV28TFOMTxt = AV54SearchTxt ;
      AV29TFOMTxt_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV43 */
      pr_default.execute(6, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8PV12 = false ;
         A396EmprCod = P08PV43_A396EmprCod[0] ;
         A9433OMTxt = P08PV43_A9433OMTxt[0] ;
         A9464OMNot = P08PV43_A9464OMNot[0] ;
         A9439OMFchCer = P08PV43_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV43_A9438OMFchPre[0] ;
         A9436OMFchCre = P08PV43_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV43_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV43_A9428SMCod[0] ;
         n9428SMCod = P08PV43_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV43_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV43_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV43_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV43_A9473PMDsc[0] ;
         n9473PMDsc = P08PV43_n9473PMDsc[0] ;
         A9429PMCod = P08PV43_A9429PMCod[0] ;
         n9429PMCod = P08PV43_n9429PMCod[0] ;
         A9425OMCod = P08PV43_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV43_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV43_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV43_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV43_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV43_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV43_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV43_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV43_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV43_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV43_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV43_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV43_A9473PMDsc[0] ;
         n9473PMDsc = P08PV43_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV43_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV43_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV43_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV43_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV43_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV43_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV43_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV43_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08PV43_A9433OMTxt[0], A9433OMTxt) == 0 ) )
                        {
                           brk8PV12 = false ;
                           A396EmprCod = P08PV43_A396EmprCod[0] ;
                           A9425OMCod = P08PV43_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV12 = true ;
                           pr_default.readNext(6);
                        }
                        if ( ! (GXutil.strcmp("", A9433OMTxt)==0) )
                        {
                           AV58Option = A9433OMTxt ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV12 )
         {
            brk8PV12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADOMDURACIONOPTIONS' Routine */
      returnInSub = false ;
      AV36TFOMDuracion = AV54SearchTxt ;
      AV37TFOMDuracion_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV49 */
      pr_default.execute(7, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = P08PV49_A396EmprCod[0] ;
         A9464OMNot = P08PV49_A9464OMNot[0] ;
         A9439OMFchCer = P08PV49_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV49_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV49_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV49_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV49_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV49_A9428SMCod[0] ;
         n9428SMCod = P08PV49_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV49_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV49_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV49_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV49_A9473PMDsc[0] ;
         n9473PMDsc = P08PV49_n9473PMDsc[0] ;
         A9429PMCod = P08PV49_A9429PMCod[0] ;
         n9429PMCod = P08PV49_n9429PMCod[0] ;
         A9425OMCod = P08PV49_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV49_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV49_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV49_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV49_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV49_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV49_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV49_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV49_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV49_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV49_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV49_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV49_A9473PMDsc[0] ;
         n9473PMDsc = P08PV49_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV49_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV49_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV49_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV49_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV49_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV49_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV49_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV49_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13680OMDuracion)==0) )
                        {
                           AV58Option = A13680OMDuracion ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADOMNOTOPTIONS' Routine */
      returnInSub = false ;
      AV52TFOMNot = AV54SearchTxt ;
      AV53TFOMNot_Sel = "" ;
      AV81Tmordenwwds_1_filterfulltext = AV72FilterFullText ;
      AV82Tmordenwwds_2_tfomcod = AV14TFOMCod ;
      AV83Tmordenwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV84Tmordenwwds_4_tfpmcod = AV26TFPMCod ;
      AV85Tmordenwwds_5_tfpmcod_to = AV27TFPMCod_To ;
      AV86Tmordenwwds_6_tfpmdsc = AV75TFPMDsc ;
      AV87Tmordenwwds_7_tfpmdsc_sel = AV76TFPMDsc_Sel ;
      AV88Tmordenwwds_8_tfommaqcod = AV16TFOMMaqCod ;
      AV89Tmordenwwds_9_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV90Tmordenwwds_10_tfommaqdsc = AV20TFOMMaqDsc ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV92Tmordenwwds_12_tfommaqcodfor = AV18TFOMMaqCodFor ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = AV19TFOMMaqCodFor_Sel ;
      AV94Tmordenwwds_14_tfomdscmqpla = AV22TFOMDscMqPla ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = AV23TFOMDscMqPla_Sel ;
      AV96Tmordenwwds_16_tfsmcod = AV24TFSMCod ;
      AV97Tmordenwwds_17_tfsmcod_to = AV25TFSMCod_To ;
      AV98Tmordenwwds_18_tfomest_sels = AV51TFOMEst_Sels ;
      AV99Tmordenwwds_19_tfomusucre = AV38TFOMUsuCre ;
      AV100Tmordenwwds_20_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      AV101Tmordenwwds_21_tfomfchcre = AV34TFOMFchCre ;
      AV102Tmordenwwds_22_tfomtxt = AV28TFOMTxt ;
      AV103Tmordenwwds_23_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV104Tmordenwwds_24_tfomfchpre = AV30TFOMFchPre ;
      AV105Tmordenwwds_25_tfomfchcer = AV32TFOMFchCer ;
      AV106Tmordenwwds_26_tfomduracion = AV36TFOMDuracion ;
      AV107Tmordenwwds_27_tfomduracion_sel = AV37TFOMDuracion_Sel ;
      AV108Tmordenwwds_28_tfomcosrea = AV40TFOMCosRea ;
      AV109Tmordenwwds_29_tfomcosrea_to = AV41TFOMCosRea_To ;
      AV110Tmordenwwds_30_tfomrrcost = AV42TFOMRRCosT ;
      AV111Tmordenwwds_31_tfomrrcost_to = AV43TFOMRRCosT_To ;
      AV112Tmordenwwds_32_tfomrccost = AV44TFOMRCCosT ;
      AV113Tmordenwwds_33_tfomrccost_to = AV45TFOMRCCosT_To ;
      AV114Tmordenwwds_34_tfommrcost = AV46TFOMMRCosT ;
      AV115Tmordenwwds_35_tfommrcost_to = AV47TFOMMRCosT_To ;
      AV116Tmordenwwds_36_tfommccost = AV48TFOMMCCosT ;
      AV117Tmordenwwds_37_tfommccost_to = AV49TFOMMCCosT_To ;
      AV118Tmordenwwds_38_tfomnot = AV52TFOMNot ;
      AV119Tmordenwwds_39_tfomnot_sel = AV53TFOMNot_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV98Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV82Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV84Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to) ,
                                           AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           AV86Tmordenwwds_6_tfpmdsc ,
                                           AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           AV88Tmordenwwds_8_tfommaqcod ,
                                           AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV90Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV96Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV98Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV100Tmordenwwds_20_tfomusucre_sel ,
                                           AV99Tmordenwwds_19_tfomusucre ,
                                           AV101Tmordenwwds_21_tfomfchcre ,
                                           AV103Tmordenwwds_23_tfomtxt_sel ,
                                           AV102Tmordenwwds_22_tfomtxt ,
                                           AV104Tmordenwwds_24_tfomfchpre ,
                                           AV105Tmordenwwds_25_tfomfchcer ,
                                           AV110Tmordenwwds_30_tfomrrcost ,
                                           AV111Tmordenwwds_31_tfomrrcost_to ,
                                           AV112Tmordenwwds_32_tfomrccost ,
                                           AV113Tmordenwwds_33_tfomrccost_to ,
                                           AV114Tmordenwwds_34_tfommrcost ,
                                           AV115Tmordenwwds_35_tfommrcost_to ,
                                           AV116Tmordenwwds_36_tfommccost ,
                                           AV117Tmordenwwds_37_tfommccost_to ,
                                           AV119Tmordenwwds_39_tfomnot_sel ,
                                           AV118Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV81Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV92Tmordenwwds_12_tfommaqcodfor ,
                                           AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV94Tmordenwwds_14_tfomdscmqpla ,
                                           AV107Tmordenwwds_27_tfomduracion_sel ,
                                           AV106Tmordenwwds_26_tfomduracion ,
                                           AV108Tmordenwwds_28_tfomcosrea ,
                                           AV109Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV92Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV92Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV94Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV94Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV86Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV86Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV88Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV88Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV90Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV90Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV99Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV99Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV102Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV102Tmordenwwds_22_tfomtxt), "%", "") ;
      lV118Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV118Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08PV55 */
      pr_default.execute(8, new Object[] {AV93Tmordenwwds_13_tfommaqcodfor_sel, AV92Tmordenwwds_12_tfommaqcodfor, lV92Tmordenwwds_12_tfommaqcodfor, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV93Tmordenwwds_13_tfommaqcodfor_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV94Tmordenwwds_14_tfomdscmqpla, lV94Tmordenwwds_14_tfomdscmqpla, AV95Tmordenwwds_15_tfomdscmqpla_sel, AV95Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV82Tmordenwwds_2_tfomcod), Integer.valueOf(AV83Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV84Tmordenwwds_4_tfpmcod), Integer.valueOf(AV85Tmordenwwds_5_tfpmcod_to), lV86Tmordenwwds_6_tfpmdsc, AV87Tmordenwwds_7_tfpmdsc_sel, lV88Tmordenwwds_8_tfommaqcod, AV89Tmordenwwds_9_tfommaqcod_sel, lV90Tmordenwwds_10_tfommaqdsc, AV91Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV96Tmordenwwds_16_tfsmcod), Integer.valueOf(AV97Tmordenwwds_17_tfsmcod_to), lV99Tmordenwwds_19_tfomusucre, AV100Tmordenwwds_20_tfomusucre_sel, AV101Tmordenwwds_21_tfomfchcre, lV102Tmordenwwds_22_tfomtxt, AV103Tmordenwwds_23_tfomtxt_sel, AV104Tmordenwwds_24_tfomfchpre, AV105Tmordenwwds_25_tfomfchcer, AV110Tmordenwwds_30_tfomrrcost, AV111Tmordenwwds_31_tfomrrcost_to, AV112Tmordenwwds_32_tfomrccost, AV113Tmordenwwds_33_tfomrccost_to, AV114Tmordenwwds_34_tfommrcost, AV115Tmordenwwds_35_tfommrcost_to, AV116Tmordenwwds_36_tfommccost, AV117Tmordenwwds_37_tfommccost_to, lV118Tmordenwwds_38_tfomnot, AV119Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8PV15 = false ;
         A396EmprCod = P08PV55_A396EmprCod[0] ;
         A9464OMNot = P08PV55_A9464OMNot[0] ;
         A9439OMFchCer = P08PV55_A9439OMFchCer[0] ;
         A9438OMFchPre = P08PV55_A9438OMFchPre[0] ;
         A9433OMTxt = P08PV55_A9433OMTxt[0] ;
         A9436OMFchCre = P08PV55_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08PV55_A9437OMUsuCre[0] ;
         A9428SMCod = P08PV55_A9428SMCod[0] ;
         n9428SMCod = P08PV55_n9428SMCod[0] ;
         A9427OMMaqDsc = P08PV55_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV55_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08PV55_A9426OMMaqCod[0] ;
         A9473PMDsc = P08PV55_A9473PMDsc[0] ;
         n9473PMDsc = P08PV55_n9473PMDsc[0] ;
         A9429PMCod = P08PV55_A9429PMCod[0] ;
         n9429PMCod = P08PV55_n9429PMCod[0] ;
         A9425OMCod = P08PV55_A9425OMCod[0] ;
         A13678OMDscMqPla = P08PV55_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV55_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV55_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV55_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08PV55_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08PV55_A9443OMRCCosT[0] ;
         A9445OMEst = P08PV55_A9445OMEst[0] ;
         A9442OMMRCosT = P08PV55_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08PV55_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08PV55_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PV55_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08PV55_A9473PMDsc[0] ;
         n9473PMDsc = P08PV55_n9473PMDsc[0] ;
         A9441OMMCCosT = P08PV55_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08PV55_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08PV55_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08PV55_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08PV55_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08PV55_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08PV55_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08PV55_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV106Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV107Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV81Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV81Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV108Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV109Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08PV55_A9464OMNot[0], A9464OMNot) == 0 ) )
                        {
                           brk8PV15 = false ;
                           A396EmprCod = P08PV55_A396EmprCod[0] ;
                           A9425OMCod = P08PV55_A9425OMCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk8PV15 = true ;
                           pr_default.readNext(8);
                        }
                        if ( ! (GXutil.strcmp("", A9464OMNot)==0) )
                        {
                           AV58Option = A9464OMNot ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8PV15 )
         {
            brk8PV15 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmordenwwgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = tmordenwwgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = tmordenwwgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60OptionsJson = "" ;
      AV63OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72FilterFullText = "" ;
      AV75TFPMDsc = "" ;
      AV76TFPMDsc_Sel = "" ;
      AV16TFOMMaqCod = "" ;
      AV17TFOMMaqCod_Sel = "" ;
      AV20TFOMMaqDsc = "" ;
      AV21TFOMMaqDsc_Sel = "" ;
      AV18TFOMMaqCodFor = "" ;
      AV19TFOMMaqCodFor_Sel = "" ;
      AV22TFOMDscMqPla = "" ;
      AV23TFOMDscMqPla_Sel = "" ;
      AV50TFOMEst_SelsJson = "" ;
      AV51TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38TFOMUsuCre = "" ;
      AV39TFOMUsuCre_Sel = "" ;
      AV34TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV28TFOMTxt = "" ;
      AV29TFOMTxt_Sel = "" ;
      AV30TFOMFchPre = GXutil.nullDate() ;
      AV32TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV36TFOMDuracion = "" ;
      AV37TFOMDuracion_Sel = "" ;
      AV40TFOMCosRea = DecimalUtil.ZERO ;
      AV41TFOMCosRea_To = DecimalUtil.ZERO ;
      AV42TFOMRRCosT = DecimalUtil.ZERO ;
      AV43TFOMRRCosT_To = DecimalUtil.ZERO ;
      AV44TFOMRCCosT = DecimalUtil.ZERO ;
      AV45TFOMRCCosT_To = DecimalUtil.ZERO ;
      AV46TFOMMRCosT = DecimalUtil.ZERO ;
      AV47TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV48TFOMMCCosT = DecimalUtil.ZERO ;
      AV49TFOMMCCosT_To = DecimalUtil.ZERO ;
      AV52TFOMNot = "" ;
      AV53TFOMNot_Sel = "" ;
      A9473PMDsc = "" ;
      AV81Tmordenwwds_1_filterfulltext = "" ;
      AV86Tmordenwwds_6_tfpmdsc = "" ;
      AV87Tmordenwwds_7_tfpmdsc_sel = "" ;
      AV88Tmordenwwds_8_tfommaqcod = "" ;
      AV89Tmordenwwds_9_tfommaqcod_sel = "" ;
      AV90Tmordenwwds_10_tfommaqdsc = "" ;
      AV91Tmordenwwds_11_tfommaqdsc_sel = "" ;
      AV92Tmordenwwds_12_tfommaqcodfor = "" ;
      AV93Tmordenwwds_13_tfommaqcodfor_sel = "" ;
      AV94Tmordenwwds_14_tfomdscmqpla = "" ;
      AV95Tmordenwwds_15_tfomdscmqpla_sel = "" ;
      AV98Tmordenwwds_18_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV99Tmordenwwds_19_tfomusucre = "" ;
      AV100Tmordenwwds_20_tfomusucre_sel = "" ;
      AV101Tmordenwwds_21_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV102Tmordenwwds_22_tfomtxt = "" ;
      AV103Tmordenwwds_23_tfomtxt_sel = "" ;
      AV104Tmordenwwds_24_tfomfchpre = GXutil.nullDate() ;
      AV105Tmordenwwds_25_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV106Tmordenwwds_26_tfomduracion = "" ;
      AV107Tmordenwwds_27_tfomduracion_sel = "" ;
      AV108Tmordenwwds_28_tfomcosrea = DecimalUtil.ZERO ;
      AV109Tmordenwwds_29_tfomcosrea_to = DecimalUtil.ZERO ;
      AV110Tmordenwwds_30_tfomrrcost = DecimalUtil.ZERO ;
      AV111Tmordenwwds_31_tfomrrcost_to = DecimalUtil.ZERO ;
      AV112Tmordenwwds_32_tfomrccost = DecimalUtil.ZERO ;
      AV113Tmordenwwds_33_tfomrccost_to = DecimalUtil.ZERO ;
      AV114Tmordenwwds_34_tfommrcost = DecimalUtil.ZERO ;
      AV115Tmordenwwds_35_tfommrcost_to = DecimalUtil.ZERO ;
      AV116Tmordenwwds_36_tfommccost = DecimalUtil.ZERO ;
      AV117Tmordenwwds_37_tfommccost_to = DecimalUtil.ZERO ;
      AV118Tmordenwwds_38_tfomnot = "" ;
      AV119Tmordenwwds_39_tfomnot_sel = "" ;
      lV81Tmordenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV92Tmordenwwds_12_tfommaqcodfor = "" ;
      lV94Tmordenwwds_14_tfomdscmqpla = "" ;
      lV86Tmordenwwds_6_tfpmdsc = "" ;
      lV88Tmordenwwds_8_tfommaqcod = "" ;
      lV90Tmordenwwds_10_tfommaqdsc = "" ;
      lV99Tmordenwwds_19_tfomusucre = "" ;
      lV102Tmordenwwds_22_tfomtxt = "" ;
      lV118Tmordenwwds_38_tfomnot = "" ;
      A9445OMEst = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9464OMNot = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      P08PV7_A396EmprCod = new String[] {""} ;
      P08PV7_A9473PMDsc = new String[] {""} ;
      P08PV7_n9473PMDsc = new boolean[] {false} ;
      P08PV7_A9464OMNot = new String[] {""} ;
      P08PV7_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV7_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV7_A9433OMTxt = new String[] {""} ;
      P08PV7_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV7_A9437OMUsuCre = new String[] {""} ;
      P08PV7_A9428SMCod = new int[1] ;
      P08PV7_n9428SMCod = new boolean[] {false} ;
      P08PV7_A9427OMMaqDsc = new String[] {""} ;
      P08PV7_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV7_A9426OMMaqCod = new String[] {""} ;
      P08PV7_A9429PMCod = new int[1] ;
      P08PV7_n9429PMCod = new boolean[] {false} ;
      P08PV7_A9425OMCod = new int[1] ;
      P08PV7_A13678OMDscMqPla = new String[] {""} ;
      P08PV7_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV7_A13679OMMaqCodFo = new String[] {""} ;
      P08PV7_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV7_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV7_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV7_A9445OMEst = new String[] {""} ;
      P08PV7_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV7_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV58Option = "" ;
      P08PV13_A396EmprCod = new String[] {""} ;
      P08PV13_A9426OMMaqCod = new String[] {""} ;
      P08PV13_A9464OMNot = new String[] {""} ;
      P08PV13_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV13_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV13_A9433OMTxt = new String[] {""} ;
      P08PV13_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV13_A9437OMUsuCre = new String[] {""} ;
      P08PV13_A9428SMCod = new int[1] ;
      P08PV13_n9428SMCod = new boolean[] {false} ;
      P08PV13_A9427OMMaqDsc = new String[] {""} ;
      P08PV13_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV13_A9473PMDsc = new String[] {""} ;
      P08PV13_n9473PMDsc = new boolean[] {false} ;
      P08PV13_A9429PMCod = new int[1] ;
      P08PV13_n9429PMCod = new boolean[] {false} ;
      P08PV13_A9425OMCod = new int[1] ;
      P08PV13_A13678OMDscMqPla = new String[] {""} ;
      P08PV13_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV13_A13679OMMaqCodFo = new String[] {""} ;
      P08PV13_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV13_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV13_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV13_A9445OMEst = new String[] {""} ;
      P08PV13_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV13_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV19_A9426OMMaqCod = new String[] {""} ;
      P08PV19_A396EmprCod = new String[] {""} ;
      P08PV19_A9464OMNot = new String[] {""} ;
      P08PV19_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV19_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV19_A9433OMTxt = new String[] {""} ;
      P08PV19_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV19_A9437OMUsuCre = new String[] {""} ;
      P08PV19_A9428SMCod = new int[1] ;
      P08PV19_n9428SMCod = new boolean[] {false} ;
      P08PV19_A9427OMMaqDsc = new String[] {""} ;
      P08PV19_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV19_A9473PMDsc = new String[] {""} ;
      P08PV19_n9473PMDsc = new boolean[] {false} ;
      P08PV19_A9429PMCod = new int[1] ;
      P08PV19_n9429PMCod = new boolean[] {false} ;
      P08PV19_A9425OMCod = new int[1] ;
      P08PV19_A13678OMDscMqPla = new String[] {""} ;
      P08PV19_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV19_A13679OMMaqCodFo = new String[] {""} ;
      P08PV19_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV19_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV19_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV19_A9445OMEst = new String[] {""} ;
      P08PV19_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV19_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV25_A396EmprCod = new String[] {""} ;
      P08PV25_A9464OMNot = new String[] {""} ;
      P08PV25_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV25_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV25_A9433OMTxt = new String[] {""} ;
      P08PV25_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV25_A9437OMUsuCre = new String[] {""} ;
      P08PV25_A9428SMCod = new int[1] ;
      P08PV25_n9428SMCod = new boolean[] {false} ;
      P08PV25_A9427OMMaqDsc = new String[] {""} ;
      P08PV25_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV25_A9426OMMaqCod = new String[] {""} ;
      P08PV25_A9473PMDsc = new String[] {""} ;
      P08PV25_n9473PMDsc = new boolean[] {false} ;
      P08PV25_A9429PMCod = new int[1] ;
      P08PV25_n9429PMCod = new boolean[] {false} ;
      P08PV25_A9425OMCod = new int[1] ;
      P08PV25_A13678OMDscMqPla = new String[] {""} ;
      P08PV25_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV25_A13679OMMaqCodFo = new String[] {""} ;
      P08PV25_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV25_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV25_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV25_A9445OMEst = new String[] {""} ;
      P08PV25_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV25_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV31_A396EmprCod = new String[] {""} ;
      P08PV31_A9464OMNot = new String[] {""} ;
      P08PV31_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV31_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV31_A9433OMTxt = new String[] {""} ;
      P08PV31_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV31_A9437OMUsuCre = new String[] {""} ;
      P08PV31_A9428SMCod = new int[1] ;
      P08PV31_n9428SMCod = new boolean[] {false} ;
      P08PV31_A9427OMMaqDsc = new String[] {""} ;
      P08PV31_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV31_A9426OMMaqCod = new String[] {""} ;
      P08PV31_A9473PMDsc = new String[] {""} ;
      P08PV31_n9473PMDsc = new boolean[] {false} ;
      P08PV31_A9429PMCod = new int[1] ;
      P08PV31_n9429PMCod = new boolean[] {false} ;
      P08PV31_A9425OMCod = new int[1] ;
      P08PV31_A13678OMDscMqPla = new String[] {""} ;
      P08PV31_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV31_A13679OMMaqCodFo = new String[] {""} ;
      P08PV31_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV31_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV31_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV31_A9445OMEst = new String[] {""} ;
      P08PV31_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV31_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV37_A396EmprCod = new String[] {""} ;
      P08PV37_A9437OMUsuCre = new String[] {""} ;
      P08PV37_A9464OMNot = new String[] {""} ;
      P08PV37_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV37_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV37_A9433OMTxt = new String[] {""} ;
      P08PV37_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV37_A9428SMCod = new int[1] ;
      P08PV37_n9428SMCod = new boolean[] {false} ;
      P08PV37_A9427OMMaqDsc = new String[] {""} ;
      P08PV37_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV37_A9426OMMaqCod = new String[] {""} ;
      P08PV37_A9473PMDsc = new String[] {""} ;
      P08PV37_n9473PMDsc = new boolean[] {false} ;
      P08PV37_A9429PMCod = new int[1] ;
      P08PV37_n9429PMCod = new boolean[] {false} ;
      P08PV37_A9425OMCod = new int[1] ;
      P08PV37_A13678OMDscMqPla = new String[] {""} ;
      P08PV37_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV37_A13679OMMaqCodFo = new String[] {""} ;
      P08PV37_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV37_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV37_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV37_A9445OMEst = new String[] {""} ;
      P08PV37_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV37_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV61OptionDesc = "" ;
      P08PV43_A396EmprCod = new String[] {""} ;
      P08PV43_A9433OMTxt = new String[] {""} ;
      P08PV43_A9464OMNot = new String[] {""} ;
      P08PV43_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV43_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV43_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV43_A9437OMUsuCre = new String[] {""} ;
      P08PV43_A9428SMCod = new int[1] ;
      P08PV43_n9428SMCod = new boolean[] {false} ;
      P08PV43_A9427OMMaqDsc = new String[] {""} ;
      P08PV43_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV43_A9426OMMaqCod = new String[] {""} ;
      P08PV43_A9473PMDsc = new String[] {""} ;
      P08PV43_n9473PMDsc = new boolean[] {false} ;
      P08PV43_A9429PMCod = new int[1] ;
      P08PV43_n9429PMCod = new boolean[] {false} ;
      P08PV43_A9425OMCod = new int[1] ;
      P08PV43_A13678OMDscMqPla = new String[] {""} ;
      P08PV43_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV43_A13679OMMaqCodFo = new String[] {""} ;
      P08PV43_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV43_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV43_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV43_A9445OMEst = new String[] {""} ;
      P08PV43_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV43_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV49_A396EmprCod = new String[] {""} ;
      P08PV49_A9464OMNot = new String[] {""} ;
      P08PV49_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV49_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV49_A9433OMTxt = new String[] {""} ;
      P08PV49_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV49_A9437OMUsuCre = new String[] {""} ;
      P08PV49_A9428SMCod = new int[1] ;
      P08PV49_n9428SMCod = new boolean[] {false} ;
      P08PV49_A9427OMMaqDsc = new String[] {""} ;
      P08PV49_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV49_A9426OMMaqCod = new String[] {""} ;
      P08PV49_A9473PMDsc = new String[] {""} ;
      P08PV49_n9473PMDsc = new boolean[] {false} ;
      P08PV49_A9429PMCod = new int[1] ;
      P08PV49_n9429PMCod = new boolean[] {false} ;
      P08PV49_A9425OMCod = new int[1] ;
      P08PV49_A13678OMDscMqPla = new String[] {""} ;
      P08PV49_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV49_A13679OMMaqCodFo = new String[] {""} ;
      P08PV49_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV49_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV49_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV49_A9445OMEst = new String[] {""} ;
      P08PV49_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV49_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV55_A396EmprCod = new String[] {""} ;
      P08PV55_A9464OMNot = new String[] {""} ;
      P08PV55_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV55_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV55_A9433OMTxt = new String[] {""} ;
      P08PV55_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08PV55_A9437OMUsuCre = new String[] {""} ;
      P08PV55_A9428SMCod = new int[1] ;
      P08PV55_n9428SMCod = new boolean[] {false} ;
      P08PV55_A9427OMMaqDsc = new String[] {""} ;
      P08PV55_n9427OMMaqDsc = new boolean[] {false} ;
      P08PV55_A9426OMMaqCod = new String[] {""} ;
      P08PV55_A9473PMDsc = new String[] {""} ;
      P08PV55_n9473PMDsc = new boolean[] {false} ;
      P08PV55_A9429PMCod = new int[1] ;
      P08PV55_n9429PMCod = new boolean[] {false} ;
      P08PV55_A9425OMCod = new int[1] ;
      P08PV55_A13678OMDscMqPla = new String[] {""} ;
      P08PV55_n13678OMDscMqPla = new boolean[] {false} ;
      P08PV55_A13679OMMaqCodFo = new String[] {""} ;
      P08PV55_n13679OMMaqCodFo = new boolean[] {false} ;
      P08PV55_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV55_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV55_A9445OMEst = new String[] {""} ;
      P08PV55_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PV55_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordenwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PV7_A396EmprCod, P08PV7_A9473PMDsc, P08PV7_n9473PMDsc, P08PV7_A9464OMNot, P08PV7_A9439OMFchCer, P08PV7_A9438OMFchPre, P08PV7_A9433OMTxt, P08PV7_A9436OMFchCre, P08PV7_A9437OMUsuCre, P08PV7_A9428SMCod,
            P08PV7_n9428SMCod, P08PV7_A9427OMMaqDsc, P08PV7_n9427OMMaqDsc, P08PV7_A9426OMMaqCod, P08PV7_A9429PMCod, P08PV7_n9429PMCod, P08PV7_A9425OMCod, P08PV7_A13678OMDscMqPla, P08PV7_n13678OMDscMqPla, P08PV7_A13679OMMaqCodFo,
            P08PV7_n13679OMMaqCodFo, P08PV7_A9441OMMCCosT, P08PV7_A9443OMRCCosT, P08PV7_A9445OMEst, P08PV7_A9442OMMRCosT, P08PV7_A9444OMRRCosT
            }
            , new Object[] {
            P08PV13_A396EmprCod, P08PV13_A9426OMMaqCod, P08PV13_A9464OMNot, P08PV13_A9439OMFchCer, P08PV13_A9438OMFchPre, P08PV13_A9433OMTxt, P08PV13_A9436OMFchCre, P08PV13_A9437OMUsuCre, P08PV13_A9428SMCod, P08PV13_n9428SMCod,
            P08PV13_A9427OMMaqDsc, P08PV13_n9427OMMaqDsc, P08PV13_A9473PMDsc, P08PV13_n9473PMDsc, P08PV13_A9429PMCod, P08PV13_n9429PMCod, P08PV13_A9425OMCod, P08PV13_A13678OMDscMqPla, P08PV13_n13678OMDscMqPla, P08PV13_A13679OMMaqCodFo,
            P08PV13_n13679OMMaqCodFo, P08PV13_A9441OMMCCosT, P08PV13_A9443OMRCCosT, P08PV13_A9445OMEst, P08PV13_A9442OMMRCosT, P08PV13_A9444OMRRCosT
            }
            , new Object[] {
            P08PV19_A9426OMMaqCod, P08PV19_A396EmprCod, P08PV19_A9464OMNot, P08PV19_A9439OMFchCer, P08PV19_A9438OMFchPre, P08PV19_A9433OMTxt, P08PV19_A9436OMFchCre, P08PV19_A9437OMUsuCre, P08PV19_A9428SMCod, P08PV19_n9428SMCod,
            P08PV19_A9427OMMaqDsc, P08PV19_n9427OMMaqDsc, P08PV19_A9473PMDsc, P08PV19_n9473PMDsc, P08PV19_A9429PMCod, P08PV19_n9429PMCod, P08PV19_A9425OMCod, P08PV19_A13678OMDscMqPla, P08PV19_n13678OMDscMqPla, P08PV19_A13679OMMaqCodFo,
            P08PV19_n13679OMMaqCodFo, P08PV19_A9441OMMCCosT, P08PV19_A9443OMRCCosT, P08PV19_A9445OMEst, P08PV19_A9442OMMRCosT, P08PV19_A9444OMRRCosT
            }
            , new Object[] {
            P08PV25_A396EmprCod, P08PV25_A9464OMNot, P08PV25_A9439OMFchCer, P08PV25_A9438OMFchPre, P08PV25_A9433OMTxt, P08PV25_A9436OMFchCre, P08PV25_A9437OMUsuCre, P08PV25_A9428SMCod, P08PV25_n9428SMCod, P08PV25_A9427OMMaqDsc,
            P08PV25_n9427OMMaqDsc, P08PV25_A9426OMMaqCod, P08PV25_A9473PMDsc, P08PV25_n9473PMDsc, P08PV25_A9429PMCod, P08PV25_n9429PMCod, P08PV25_A9425OMCod, P08PV25_A13678OMDscMqPla, P08PV25_n13678OMDscMqPla, P08PV25_A13679OMMaqCodFo,
            P08PV25_n13679OMMaqCodFo, P08PV25_A9441OMMCCosT, P08PV25_A9443OMRCCosT, P08PV25_A9445OMEst, P08PV25_A9442OMMRCosT, P08PV25_A9444OMRRCosT
            }
            , new Object[] {
            P08PV31_A396EmprCod, P08PV31_A9464OMNot, P08PV31_A9439OMFchCer, P08PV31_A9438OMFchPre, P08PV31_A9433OMTxt, P08PV31_A9436OMFchCre, P08PV31_A9437OMUsuCre, P08PV31_A9428SMCod, P08PV31_n9428SMCod, P08PV31_A9427OMMaqDsc,
            P08PV31_n9427OMMaqDsc, P08PV31_A9426OMMaqCod, P08PV31_A9473PMDsc, P08PV31_n9473PMDsc, P08PV31_A9429PMCod, P08PV31_n9429PMCod, P08PV31_A9425OMCod, P08PV31_A13678OMDscMqPla, P08PV31_n13678OMDscMqPla, P08PV31_A13679OMMaqCodFo,
            P08PV31_n13679OMMaqCodFo, P08PV31_A9441OMMCCosT, P08PV31_A9443OMRCCosT, P08PV31_A9445OMEst, P08PV31_A9442OMMRCosT, P08PV31_A9444OMRRCosT
            }
            , new Object[] {
            P08PV37_A396EmprCod, P08PV37_A9437OMUsuCre, P08PV37_A9464OMNot, P08PV37_A9439OMFchCer, P08PV37_A9438OMFchPre, P08PV37_A9433OMTxt, P08PV37_A9436OMFchCre, P08PV37_A9428SMCod, P08PV37_n9428SMCod, P08PV37_A9427OMMaqDsc,
            P08PV37_n9427OMMaqDsc, P08PV37_A9426OMMaqCod, P08PV37_A9473PMDsc, P08PV37_n9473PMDsc, P08PV37_A9429PMCod, P08PV37_n9429PMCod, P08PV37_A9425OMCod, P08PV37_A13678OMDscMqPla, P08PV37_n13678OMDscMqPla, P08PV37_A13679OMMaqCodFo,
            P08PV37_n13679OMMaqCodFo, P08PV37_A9441OMMCCosT, P08PV37_A9443OMRCCosT, P08PV37_A9445OMEst, P08PV37_A9442OMMRCosT, P08PV37_A9444OMRRCosT
            }
            , new Object[] {
            P08PV43_A396EmprCod, P08PV43_A9433OMTxt, P08PV43_A9464OMNot, P08PV43_A9439OMFchCer, P08PV43_A9438OMFchPre, P08PV43_A9436OMFchCre, P08PV43_A9437OMUsuCre, P08PV43_A9428SMCod, P08PV43_n9428SMCod, P08PV43_A9427OMMaqDsc,
            P08PV43_n9427OMMaqDsc, P08PV43_A9426OMMaqCod, P08PV43_A9473PMDsc, P08PV43_n9473PMDsc, P08PV43_A9429PMCod, P08PV43_n9429PMCod, P08PV43_A9425OMCod, P08PV43_A13678OMDscMqPla, P08PV43_n13678OMDscMqPla, P08PV43_A13679OMMaqCodFo,
            P08PV43_n13679OMMaqCodFo, P08PV43_A9441OMMCCosT, P08PV43_A9443OMRCCosT, P08PV43_A9445OMEst, P08PV43_A9442OMMRCosT, P08PV43_A9444OMRRCosT
            }
            , new Object[] {
            P08PV49_A396EmprCod, P08PV49_A9464OMNot, P08PV49_A9439OMFchCer, P08PV49_A9438OMFchPre, P08PV49_A9433OMTxt, P08PV49_A9436OMFchCre, P08PV49_A9437OMUsuCre, P08PV49_A9428SMCod, P08PV49_n9428SMCod, P08PV49_A9427OMMaqDsc,
            P08PV49_n9427OMMaqDsc, P08PV49_A9426OMMaqCod, P08PV49_A9473PMDsc, P08PV49_n9473PMDsc, P08PV49_A9429PMCod, P08PV49_n9429PMCod, P08PV49_A9425OMCod, P08PV49_A13678OMDscMqPla, P08PV49_n13678OMDscMqPla, P08PV49_A13679OMMaqCodFo,
            P08PV49_n13679OMMaqCodFo, P08PV49_A9441OMMCCosT, P08PV49_A9443OMRCCosT, P08PV49_A9445OMEst, P08PV49_A9442OMMRCosT, P08PV49_A9444OMRRCosT
            }
            , new Object[] {
            P08PV55_A396EmprCod, P08PV55_A9464OMNot, P08PV55_A9439OMFchCer, P08PV55_A9438OMFchPre, P08PV55_A9433OMTxt, P08PV55_A9436OMFchCre, P08PV55_A9437OMUsuCre, P08PV55_A9428SMCod, P08PV55_n9428SMCod, P08PV55_A9427OMMaqDsc,
            P08PV55_n9427OMMaqDsc, P08PV55_A9426OMMaqCod, P08PV55_A9473PMDsc, P08PV55_n9473PMDsc, P08PV55_A9429PMCod, P08PV55_n9429PMCod, P08PV55_A9425OMCod, P08PV55_A13678OMDscMqPla, P08PV55_n13678OMDscMqPla, P08PV55_A13679OMMaqCodFo,
            P08PV55_n13679OMMaqCodFo, P08PV55_A9441OMMCCosT, P08PV55_A9443OMRCCosT, P08PV55_A9445OMEst, P08PV55_A9442OMMRCosT, P08PV55_A9444OMRRCosT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV79GXV1 ;
   private int AV14TFOMCod ;
   private int AV15TFOMCod_To ;
   private int AV26TFPMCod ;
   private int AV27TFPMCod_To ;
   private int AV24TFSMCod ;
   private int AV25TFSMCod_To ;
   private int AV82Tmordenwwds_2_tfomcod ;
   private int AV83Tmordenwwds_3_tfomcod_to ;
   private int AV84Tmordenwwds_4_tfpmcod ;
   private int AV85Tmordenwwds_5_tfpmcod_to ;
   private int AV96Tmordenwwds_16_tfsmcod ;
   private int AV97Tmordenwwds_17_tfsmcod_to ;
   private int AV98Tmordenwwds_18_tfomest_sels_size ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int AV57InsertIndex ;
   private long AV66count ;
   private java.math.BigDecimal AV40TFOMCosRea ;
   private java.math.BigDecimal AV41TFOMCosRea_To ;
   private java.math.BigDecimal AV42TFOMRRCosT ;
   private java.math.BigDecimal AV43TFOMRRCosT_To ;
   private java.math.BigDecimal AV44TFOMRCCosT ;
   private java.math.BigDecimal AV45TFOMRCCosT_To ;
   private java.math.BigDecimal AV46TFOMMRCosT ;
   private java.math.BigDecimal AV47TFOMMRCosT_To ;
   private java.math.BigDecimal AV48TFOMMCCosT ;
   private java.math.BigDecimal AV49TFOMMCCosT_To ;
   private java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ;
   private java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to ;
   private java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ;
   private java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ;
   private java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ;
   private java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ;
   private java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ;
   private java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ;
   private java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ;
   private java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9440OMCosRea ;
   private String AV75TFPMDsc ;
   private String AV76TFPMDsc_Sel ;
   private String AV16TFOMMaqCod ;
   private String AV17TFOMMaqCod_Sel ;
   private String AV20TFOMMaqDsc ;
   private String AV21TFOMMaqDsc_Sel ;
   private String AV18TFOMMaqCodFor ;
   private String AV19TFOMMaqCodFor_Sel ;
   private String AV22TFOMDscMqPla ;
   private String AV23TFOMDscMqPla_Sel ;
   private String AV38TFOMUsuCre ;
   private String AV39TFOMUsuCre_Sel ;
   private String A9473PMDsc ;
   private String AV86Tmordenwwds_6_tfpmdsc ;
   private String AV87Tmordenwwds_7_tfpmdsc_sel ;
   private String AV88Tmordenwwds_8_tfommaqcod ;
   private String AV89Tmordenwwds_9_tfommaqcod_sel ;
   private String AV90Tmordenwwds_10_tfommaqdsc ;
   private String AV91Tmordenwwds_11_tfommaqdsc_sel ;
   private String AV92Tmordenwwds_12_tfommaqcodfor ;
   private String AV93Tmordenwwds_13_tfommaqcodfor_sel ;
   private String AV94Tmordenwwds_14_tfomdscmqpla ;
   private String AV95Tmordenwwds_15_tfomdscmqpla_sel ;
   private String AV99Tmordenwwds_19_tfomusucre ;
   private String AV100Tmordenwwds_20_tfomusucre_sel ;
   private String scmdbuf ;
   private String lV92Tmordenwwds_12_tfommaqcodfor ;
   private String lV94Tmordenwwds_14_tfomdscmqpla ;
   private String lV86Tmordenwwds_6_tfpmdsc ;
   private String lV88Tmordenwwds_8_tfommaqcod ;
   private String lV90Tmordenwwds_10_tfommaqdsc ;
   private String lV99Tmordenwwds_19_tfomusucre ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String A9437OMUsuCre ;
   private String A13679OMMaqCodFo ;
   private String A13678OMDscMqPla ;
   private String A396EmprCod ;
   private java.util.Date AV34TFOMFchCre ;
   private java.util.Date AV32TFOMFchCer ;
   private java.util.Date AV101Tmordenwwds_21_tfomfchcre ;
   private java.util.Date AV105Tmordenwwds_25_tfomfchcer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV30TFOMFchPre ;
   private java.util.Date AV104Tmordenwwds_24_tfomfchpre ;
   private java.util.Date A9438OMFchPre ;
   private boolean returnInSub ;
   private boolean brk8PV2 ;
   private boolean n9473PMDsc ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9429PMCod ;
   private boolean n13678OMDscMqPla ;
   private boolean n13679OMMaqCodFo ;
   private boolean brk8PV4 ;
   private boolean brk8PV6 ;
   private boolean brk8PV10 ;
   private boolean brk8PV12 ;
   private boolean brk8PV15 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV50TFOMEst_SelsJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV72FilterFullText ;
   private String AV28TFOMTxt ;
   private String AV29TFOMTxt_Sel ;
   private String AV36TFOMDuracion ;
   private String AV37TFOMDuracion_Sel ;
   private String AV52TFOMNot ;
   private String AV53TFOMNot_Sel ;
   private String AV81Tmordenwwds_1_filterfulltext ;
   private String AV102Tmordenwwds_22_tfomtxt ;
   private String AV103Tmordenwwds_23_tfomtxt_sel ;
   private String AV106Tmordenwwds_26_tfomduracion ;
   private String AV107Tmordenwwds_27_tfomduracion_sel ;
   private String AV118Tmordenwwds_38_tfomnot ;
   private String AV119Tmordenwwds_39_tfomnot_sel ;
   private String lV81Tmordenwwds_1_filterfulltext ;
   private String lV102Tmordenwwds_22_tfomtxt ;
   private String lV118Tmordenwwds_38_tfomnot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String AV58Option ;
   private String AV61OptionDesc ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PV7_A396EmprCod ;
   private String[] P08PV7_A9473PMDsc ;
   private boolean[] P08PV7_n9473PMDsc ;
   private String[] P08PV7_A9464OMNot ;
   private java.util.Date[] P08PV7_A9439OMFchCer ;
   private java.util.Date[] P08PV7_A9438OMFchPre ;
   private String[] P08PV7_A9433OMTxt ;
   private java.util.Date[] P08PV7_A9436OMFchCre ;
   private String[] P08PV7_A9437OMUsuCre ;
   private int[] P08PV7_A9428SMCod ;
   private boolean[] P08PV7_n9428SMCod ;
   private String[] P08PV7_A9427OMMaqDsc ;
   private boolean[] P08PV7_n9427OMMaqDsc ;
   private String[] P08PV7_A9426OMMaqCod ;
   private int[] P08PV7_A9429PMCod ;
   private boolean[] P08PV7_n9429PMCod ;
   private int[] P08PV7_A9425OMCod ;
   private String[] P08PV7_A13678OMDscMqPla ;
   private boolean[] P08PV7_n13678OMDscMqPla ;
   private String[] P08PV7_A13679OMMaqCodFo ;
   private boolean[] P08PV7_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV7_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV7_A9443OMRCCosT ;
   private String[] P08PV7_A9445OMEst ;
   private java.math.BigDecimal[] P08PV7_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV7_A9444OMRRCosT ;
   private String[] P08PV13_A396EmprCod ;
   private String[] P08PV13_A9426OMMaqCod ;
   private String[] P08PV13_A9464OMNot ;
   private java.util.Date[] P08PV13_A9439OMFchCer ;
   private java.util.Date[] P08PV13_A9438OMFchPre ;
   private String[] P08PV13_A9433OMTxt ;
   private java.util.Date[] P08PV13_A9436OMFchCre ;
   private String[] P08PV13_A9437OMUsuCre ;
   private int[] P08PV13_A9428SMCod ;
   private boolean[] P08PV13_n9428SMCod ;
   private String[] P08PV13_A9427OMMaqDsc ;
   private boolean[] P08PV13_n9427OMMaqDsc ;
   private String[] P08PV13_A9473PMDsc ;
   private boolean[] P08PV13_n9473PMDsc ;
   private int[] P08PV13_A9429PMCod ;
   private boolean[] P08PV13_n9429PMCod ;
   private int[] P08PV13_A9425OMCod ;
   private String[] P08PV13_A13678OMDscMqPla ;
   private boolean[] P08PV13_n13678OMDscMqPla ;
   private String[] P08PV13_A13679OMMaqCodFo ;
   private boolean[] P08PV13_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV13_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV13_A9443OMRCCosT ;
   private String[] P08PV13_A9445OMEst ;
   private java.math.BigDecimal[] P08PV13_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV13_A9444OMRRCosT ;
   private String[] P08PV19_A9426OMMaqCod ;
   private String[] P08PV19_A396EmprCod ;
   private String[] P08PV19_A9464OMNot ;
   private java.util.Date[] P08PV19_A9439OMFchCer ;
   private java.util.Date[] P08PV19_A9438OMFchPre ;
   private String[] P08PV19_A9433OMTxt ;
   private java.util.Date[] P08PV19_A9436OMFchCre ;
   private String[] P08PV19_A9437OMUsuCre ;
   private int[] P08PV19_A9428SMCod ;
   private boolean[] P08PV19_n9428SMCod ;
   private String[] P08PV19_A9427OMMaqDsc ;
   private boolean[] P08PV19_n9427OMMaqDsc ;
   private String[] P08PV19_A9473PMDsc ;
   private boolean[] P08PV19_n9473PMDsc ;
   private int[] P08PV19_A9429PMCod ;
   private boolean[] P08PV19_n9429PMCod ;
   private int[] P08PV19_A9425OMCod ;
   private String[] P08PV19_A13678OMDscMqPla ;
   private boolean[] P08PV19_n13678OMDscMqPla ;
   private String[] P08PV19_A13679OMMaqCodFo ;
   private boolean[] P08PV19_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV19_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV19_A9443OMRCCosT ;
   private String[] P08PV19_A9445OMEst ;
   private java.math.BigDecimal[] P08PV19_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV19_A9444OMRRCosT ;
   private String[] P08PV25_A396EmprCod ;
   private String[] P08PV25_A9464OMNot ;
   private java.util.Date[] P08PV25_A9439OMFchCer ;
   private java.util.Date[] P08PV25_A9438OMFchPre ;
   private String[] P08PV25_A9433OMTxt ;
   private java.util.Date[] P08PV25_A9436OMFchCre ;
   private String[] P08PV25_A9437OMUsuCre ;
   private int[] P08PV25_A9428SMCod ;
   private boolean[] P08PV25_n9428SMCod ;
   private String[] P08PV25_A9427OMMaqDsc ;
   private boolean[] P08PV25_n9427OMMaqDsc ;
   private String[] P08PV25_A9426OMMaqCod ;
   private String[] P08PV25_A9473PMDsc ;
   private boolean[] P08PV25_n9473PMDsc ;
   private int[] P08PV25_A9429PMCod ;
   private boolean[] P08PV25_n9429PMCod ;
   private int[] P08PV25_A9425OMCod ;
   private String[] P08PV25_A13678OMDscMqPla ;
   private boolean[] P08PV25_n13678OMDscMqPla ;
   private String[] P08PV25_A13679OMMaqCodFo ;
   private boolean[] P08PV25_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV25_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV25_A9443OMRCCosT ;
   private String[] P08PV25_A9445OMEst ;
   private java.math.BigDecimal[] P08PV25_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV25_A9444OMRRCosT ;
   private String[] P08PV31_A396EmprCod ;
   private String[] P08PV31_A9464OMNot ;
   private java.util.Date[] P08PV31_A9439OMFchCer ;
   private java.util.Date[] P08PV31_A9438OMFchPre ;
   private String[] P08PV31_A9433OMTxt ;
   private java.util.Date[] P08PV31_A9436OMFchCre ;
   private String[] P08PV31_A9437OMUsuCre ;
   private int[] P08PV31_A9428SMCod ;
   private boolean[] P08PV31_n9428SMCod ;
   private String[] P08PV31_A9427OMMaqDsc ;
   private boolean[] P08PV31_n9427OMMaqDsc ;
   private String[] P08PV31_A9426OMMaqCod ;
   private String[] P08PV31_A9473PMDsc ;
   private boolean[] P08PV31_n9473PMDsc ;
   private int[] P08PV31_A9429PMCod ;
   private boolean[] P08PV31_n9429PMCod ;
   private int[] P08PV31_A9425OMCod ;
   private String[] P08PV31_A13678OMDscMqPla ;
   private boolean[] P08PV31_n13678OMDscMqPla ;
   private String[] P08PV31_A13679OMMaqCodFo ;
   private boolean[] P08PV31_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV31_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV31_A9443OMRCCosT ;
   private String[] P08PV31_A9445OMEst ;
   private java.math.BigDecimal[] P08PV31_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV31_A9444OMRRCosT ;
   private String[] P08PV37_A396EmprCod ;
   private String[] P08PV37_A9437OMUsuCre ;
   private String[] P08PV37_A9464OMNot ;
   private java.util.Date[] P08PV37_A9439OMFchCer ;
   private java.util.Date[] P08PV37_A9438OMFchPre ;
   private String[] P08PV37_A9433OMTxt ;
   private java.util.Date[] P08PV37_A9436OMFchCre ;
   private int[] P08PV37_A9428SMCod ;
   private boolean[] P08PV37_n9428SMCod ;
   private String[] P08PV37_A9427OMMaqDsc ;
   private boolean[] P08PV37_n9427OMMaqDsc ;
   private String[] P08PV37_A9426OMMaqCod ;
   private String[] P08PV37_A9473PMDsc ;
   private boolean[] P08PV37_n9473PMDsc ;
   private int[] P08PV37_A9429PMCod ;
   private boolean[] P08PV37_n9429PMCod ;
   private int[] P08PV37_A9425OMCod ;
   private String[] P08PV37_A13678OMDscMqPla ;
   private boolean[] P08PV37_n13678OMDscMqPla ;
   private String[] P08PV37_A13679OMMaqCodFo ;
   private boolean[] P08PV37_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV37_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV37_A9443OMRCCosT ;
   private String[] P08PV37_A9445OMEst ;
   private java.math.BigDecimal[] P08PV37_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV37_A9444OMRRCosT ;
   private String[] P08PV43_A396EmprCod ;
   private String[] P08PV43_A9433OMTxt ;
   private String[] P08PV43_A9464OMNot ;
   private java.util.Date[] P08PV43_A9439OMFchCer ;
   private java.util.Date[] P08PV43_A9438OMFchPre ;
   private java.util.Date[] P08PV43_A9436OMFchCre ;
   private String[] P08PV43_A9437OMUsuCre ;
   private int[] P08PV43_A9428SMCod ;
   private boolean[] P08PV43_n9428SMCod ;
   private String[] P08PV43_A9427OMMaqDsc ;
   private boolean[] P08PV43_n9427OMMaqDsc ;
   private String[] P08PV43_A9426OMMaqCod ;
   private String[] P08PV43_A9473PMDsc ;
   private boolean[] P08PV43_n9473PMDsc ;
   private int[] P08PV43_A9429PMCod ;
   private boolean[] P08PV43_n9429PMCod ;
   private int[] P08PV43_A9425OMCod ;
   private String[] P08PV43_A13678OMDscMqPla ;
   private boolean[] P08PV43_n13678OMDscMqPla ;
   private String[] P08PV43_A13679OMMaqCodFo ;
   private boolean[] P08PV43_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV43_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV43_A9443OMRCCosT ;
   private String[] P08PV43_A9445OMEst ;
   private java.math.BigDecimal[] P08PV43_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV43_A9444OMRRCosT ;
   private String[] P08PV49_A396EmprCod ;
   private String[] P08PV49_A9464OMNot ;
   private java.util.Date[] P08PV49_A9439OMFchCer ;
   private java.util.Date[] P08PV49_A9438OMFchPre ;
   private String[] P08PV49_A9433OMTxt ;
   private java.util.Date[] P08PV49_A9436OMFchCre ;
   private String[] P08PV49_A9437OMUsuCre ;
   private int[] P08PV49_A9428SMCod ;
   private boolean[] P08PV49_n9428SMCod ;
   private String[] P08PV49_A9427OMMaqDsc ;
   private boolean[] P08PV49_n9427OMMaqDsc ;
   private String[] P08PV49_A9426OMMaqCod ;
   private String[] P08PV49_A9473PMDsc ;
   private boolean[] P08PV49_n9473PMDsc ;
   private int[] P08PV49_A9429PMCod ;
   private boolean[] P08PV49_n9429PMCod ;
   private int[] P08PV49_A9425OMCod ;
   private String[] P08PV49_A13678OMDscMqPla ;
   private boolean[] P08PV49_n13678OMDscMqPla ;
   private String[] P08PV49_A13679OMMaqCodFo ;
   private boolean[] P08PV49_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV49_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV49_A9443OMRCCosT ;
   private String[] P08PV49_A9445OMEst ;
   private java.math.BigDecimal[] P08PV49_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV49_A9444OMRRCosT ;
   private String[] P08PV55_A396EmprCod ;
   private String[] P08PV55_A9464OMNot ;
   private java.util.Date[] P08PV55_A9439OMFchCer ;
   private java.util.Date[] P08PV55_A9438OMFchPre ;
   private String[] P08PV55_A9433OMTxt ;
   private java.util.Date[] P08PV55_A9436OMFchCre ;
   private String[] P08PV55_A9437OMUsuCre ;
   private int[] P08PV55_A9428SMCod ;
   private boolean[] P08PV55_n9428SMCod ;
   private String[] P08PV55_A9427OMMaqDsc ;
   private boolean[] P08PV55_n9427OMMaqDsc ;
   private String[] P08PV55_A9426OMMaqCod ;
   private String[] P08PV55_A9473PMDsc ;
   private boolean[] P08PV55_n9473PMDsc ;
   private int[] P08PV55_A9429PMCod ;
   private boolean[] P08PV55_n9429PMCod ;
   private int[] P08PV55_A9425OMCod ;
   private String[] P08PV55_A13678OMDscMqPla ;
   private boolean[] P08PV55_n13678OMDscMqPla ;
   private String[] P08PV55_A13679OMMaqCodFo ;
   private boolean[] P08PV55_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08PV55_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08PV55_A9443OMRCCosT ;
   private String[] P08PV55_A9445OMEst ;
   private java.math.BigDecimal[] P08PV55_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08PV55_A9444OMRRCosT ;
   private GXSimpleCollection<String> AV51TFOMEst_Sels ;
   private GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class tmordenwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PV7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                          int AV82Tmordenwwds_2_tfomcod ,
                                          int AV83Tmordenwwds_3_tfomcod_to ,
                                          int AV84Tmordenwwds_4_tfpmcod ,
                                          int AV85Tmordenwwds_5_tfpmcod_to ,
                                          String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                          String AV86Tmordenwwds_6_tfpmdsc ,
                                          String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                          String AV88Tmordenwwds_8_tfommaqcod ,
                                          String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                          String AV90Tmordenwwds_10_tfommaqdsc ,
                                          int AV96Tmordenwwds_16_tfsmcod ,
                                          int AV97Tmordenwwds_17_tfsmcod_to ,
                                          int AV98Tmordenwwds_18_tfomest_sels_size ,
                                          String AV100Tmordenwwds_20_tfomusucre_sel ,
                                          String AV99Tmordenwwds_19_tfomusucre ,
                                          java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                          String AV103Tmordenwwds_23_tfomtxt_sel ,
                                          String AV102Tmordenwwds_22_tfomtxt ,
                                          java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                          java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                          java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                          java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                          java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                          java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                          java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                          java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                          java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                          java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                          String AV119Tmordenwwds_39_tfomnot_sel ,
                                          String AV118Tmordenwwds_38_tfomnot ,
                                          int A9425OMCod ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          int A9428SMCod ,
                                          String A9437OMUsuCre ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9433OMTxt ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT ,
                                          String A9464OMNot ,
                                          String AV81Tmordenwwds_1_filterfulltext ,
                                          String A13679OMMaqCodFo ,
                                          String A13678OMDscMqPla ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                          String AV92Tmordenwwds_12_tfommaqcodfor ,
                                          String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                          String AV94Tmordenwwds_14_tfomdscmqpla ,
                                          String AV107Tmordenwwds_27_tfomduracion_sel ,
                                          String AV106Tmordenwwds_26_tfomduracion ,
                                          java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                          java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.PMDsc, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.PMDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PV13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[39];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMMaqCod AS OMMaqCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.OMMaqCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08PV19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMMaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08PV25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[39];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08PV31( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[39];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08PV37( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[39];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMUsuCre, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.OMUsuCre" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08PV43( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[39];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMTxt, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.OMTxt" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08PV49( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[39];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P08PV55( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV98Tmordenwwds_18_tfomest_sels ,
                                           int AV82Tmordenwwds_2_tfomcod ,
                                           int AV83Tmordenwwds_3_tfomcod_to ,
                                           int AV84Tmordenwwds_4_tfpmcod ,
                                           int AV85Tmordenwwds_5_tfpmcod_to ,
                                           String AV87Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV86Tmordenwwds_6_tfpmdsc ,
                                           String AV89Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV88Tmordenwwds_8_tfommaqcod ,
                                           String AV91Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV90Tmordenwwds_10_tfommaqdsc ,
                                           int AV96Tmordenwwds_16_tfsmcod ,
                                           int AV97Tmordenwwds_17_tfsmcod_to ,
                                           int AV98Tmordenwwds_18_tfomest_sels_size ,
                                           String AV100Tmordenwwds_20_tfomusucre_sel ,
                                           String AV99Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV101Tmordenwwds_21_tfomfchcre ,
                                           String AV103Tmordenwwds_23_tfomtxt_sel ,
                                           String AV102Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV104Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV105Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV110Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV111Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV112Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV113Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV114Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV115Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV116Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV117Tmordenwwds_37_tfommccost_to ,
                                           String AV119Tmordenwwds_39_tfomnot_sel ,
                                           String AV118Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV81Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV93Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV92Tmordenwwds_12_tfommaqcodfor ,
                                           String AV95Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV94Tmordenwwds_14_tfomdscmqpla ,
                                           String AV107Tmordenwwds_27_tfomduracion_sel ,
                                           String AV106Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV108Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV109Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[39];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV82Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV96Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV97Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( AV98Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV99Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV118Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.OMNot" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_P08PV7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 1 :
                  return conditional_P08PV13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 2 :
                  return conditional_P08PV19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 3 :
                  return conditional_P08PV25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 4 :
                  return conditional_P08PV31(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 5 :
                  return conditional_P08PV37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 6 :
                  return conditional_P08PV43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 7 :
                  return conditional_P08PV49(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
            case 8 :
                  return conditional_P08PV55(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PV7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV31", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV49", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PV55", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
      }
   }

}

