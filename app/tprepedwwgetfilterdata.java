package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprepedwwgetfilterdata extends GXProcedure
{
   public tprepedwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprepedwwgetfilterdata.class ), "" );
   }

   public tprepedwwgetfilterdata( int remoteHandle ,
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
      tprepedwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprepedwwgetfilterdata.this.AV30DDOName = aP0;
      tprepedwwgetfilterdata.this.AV28SearchTxt = aP1;
      tprepedwwgetfilterdata.this.AV29SearchTxtTo = aP2;
      tprepedwwgetfilterdata.this.aP3 = aP3;
      tprepedwwgetfilterdata.this.aP4 = aP4;
      tprepedwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PREPRVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPREPRVDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PREPEDCON") == 0 )
      {
         /* Execute user subroutine: 'LOADPREPEDCONOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PREPEDPRI") == 0 )
      {
         /* Execute user subroutine: 'LOADPREPEDPRIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("TPREPEDWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPREPEDWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("TPREPEDWWGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVNUM") == 0 )
         {
            AV12TFPrePrvNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFPrePrvNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC") == 0 )
         {
            AV57TFPrePrvDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC_SEL") == 0 )
         {
            AV58TFPrePrvDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV16TFPedCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFPedCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDUNI") == 0 )
         {
            AV18TFPrePedUni = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrePedUni_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON") == 0 )
         {
            AV20TFPrePedCon = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON_SEL") == 0 )
         {
            AV21TFPrePedCon_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRE") == 0 )
         {
            AV22TFPrePedPre = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrePedPre_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDDTO") == 0 )
         {
            AV24TFPrePedDto = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrePedDto_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI") == 0 )
         {
            AV26TFPrePedPri = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI_SEL") == 0 )
         {
            AV27TFPrePedPri_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV59TFPrdPreAct = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrdPreAct_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV61TFTipDtoDto = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFTipDtoDto_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV28SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV68Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV69Tprepedwwds_2_tfemprcod = AV10TFEmprCod ;
      AV70Tprepedwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV71Tprepedwwds_4_tfpreprvnum = AV12TFPrePrvNum ;
      AV72Tprepedwwds_5_tfpreprvnum_to = AV13TFPrePrvNum_To ;
      AV73Tprepedwwds_6_tfpreprvdsc = AV57TFPrePrvDsc ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = AV58TFPrePrvDsc_Sel ;
      AV75Tprepedwwds_8_tfprdnum = AV14TFPrdNum ;
      AV76Tprepedwwds_9_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV77Tprepedwwds_10_tfpedcod = AV16TFPedCod ;
      AV78Tprepedwwds_11_tfpedcod_to = AV17TFPedCod_To ;
      AV79Tprepedwwds_12_tfprepeduni = AV18TFPrePedUni ;
      AV80Tprepedwwds_13_tfprepeduni_to = AV19TFPrePedUni_To ;
      AV81Tprepedwwds_14_tfprepedcon = AV20TFPrePedCon ;
      AV82Tprepedwwds_15_tfprepedcon_sel = AV21TFPrePedCon_Sel ;
      AV83Tprepedwwds_16_tfprepedpre = AV22TFPrePedPre ;
      AV84Tprepedwwds_17_tfprepedpre_to = AV23TFPrePedPre_To ;
      AV85Tprepedwwds_18_tfprepeddto = AV24TFPrePedDto ;
      AV86Tprepedwwds_19_tfprepeddto_to = AV25TFPrePedDto_To ;
      AV87Tprepedwwds_20_tfprepedpri = AV26TFPrePedPri ;
      AV88Tprepedwwds_21_tfprepedpri_sel = AV27TFPrePedPri_Sel ;
      AV89Tprepedwwds_22_tfprdpreact = AV59TFPrdPreAct ;
      AV90Tprepedwwds_23_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Tprepedwwds_24_tftipdtodto = AV61TFTipDtoDto ;
      AV92Tprepedwwds_25_tftipdtodto_to = AV62TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Tprepedwwds_3_tfemprcod_sel ,
                                           AV69Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV76Tprepedwwds_9_tfprdnum_sel ,
                                           AV75Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV77Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to) ,
                                           AV79Tprepedwwds_12_tfprepeduni ,
                                           AV80Tprepedwwds_13_tfprepeduni_to ,
                                           AV82Tprepedwwds_15_tfprepedcon_sel ,
                                           AV81Tprepedwwds_14_tfprepedcon ,
                                           AV83Tprepedwwds_16_tfprepedpre ,
                                           AV84Tprepedwwds_17_tfprepedpre_to ,
                                           AV85Tprepedwwds_18_tfprepeddto ,
                                           AV86Tprepedwwds_19_tfprepeddto_to ,
                                           AV88Tprepedwwds_21_tfprepedpri_sel ,
                                           AV87Tprepedwwds_20_tfprepedpri ,
                                           AV89Tprepedwwds_22_tfprdpreact ,
                                           AV90Tprepedwwds_23_tfprdpreact_to ,
                                           AV91Tprepedwwds_24_tftipdtodto ,
                                           AV92Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           AV68Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV73Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV73Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV69Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV75Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV75Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV81Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV81Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV87Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV87Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RH2 */
      pr_default.execute(0, new Object[] {AV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV73Tprepedwwds_6_tfpreprvdsc, lV73Tprepedwwds_6_tfpreprvdsc, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV74Tprepedwwds_7_tfpreprvdsc_sel, lV69Tprepedwwds_2_tfemprcod, AV70Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to), lV75Tprepedwwds_8_tfprdnum, AV76Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV77Tprepedwwds_10_tfpedcod), Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to), AV79Tprepedwwds_12_tfprepeduni, AV80Tprepedwwds_13_tfprepeduni_to, lV81Tprepedwwds_14_tfprepedcon, AV82Tprepedwwds_15_tfprepedcon_sel, AV83Tprepedwwds_16_tfprepedpre, AV84Tprepedwwds_17_tfprepedpre_to, AV85Tprepedwwds_18_tfprepeddto, AV86Tprepedwwds_19_tfprepeddto_to, lV87Tprepedwwds_20_tfprepedpri, AV88Tprepedwwds_21_tfprepedpri_sel, AV89Tprepedwwds_22_tfprdpreact, AV90Tprepedwwds_23_tfprdpreact_to, AV91Tprepedwwds_24_tftipdtodto, AV92Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8RH2 = false ;
         A835TipDtoCod = P08RH2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH2_n835TipDtoCod[0] ;
         A396EmprCod = P08RH2_A396EmprCod[0] ;
         A837TipDtoDto = P08RH2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH2_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RH2_A724PrdPreAct[0] ;
         A754PrePedPri = P08RH2_A754PrePedPri[0] ;
         n754PrePedPri = P08RH2_n754PrePedPri[0] ;
         A752PrePedDto = P08RH2_A752PrePedDto[0] ;
         n752PrePedDto = P08RH2_n752PrePedDto[0] ;
         A753PrePedPre = P08RH2_A753PrePedPre[0] ;
         n753PrePedPre = P08RH2_n753PrePedPre[0] ;
         A751PrePedCon = P08RH2_A751PrePedCon[0] ;
         n751PrePedCon = P08RH2_n751PrePedCon[0] ;
         A755PrePedUni = P08RH2_A755PrePedUni[0] ;
         n755PrePedUni = P08RH2_n755PrePedUni[0] ;
         A658PedCod = P08RH2_A658PedCod[0] ;
         n658PedCod = P08RH2_n658PedCod[0] ;
         A719PrdNum = P08RH2_A719PrdNum[0] ;
         A756PrePrvNum = P08RH2_A756PrePrvNum[0] ;
         A13791PrePrvDsc = P08RH2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH2_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RH2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH2_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RH2_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RH2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH2_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RH2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH2_n13791PrePrvDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08RH2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8RH2 = false ;
            A719PrdNum = P08RH2_A719PrdNum[0] ;
            A756PrePrvNum = P08RH2_A756PrePrvNum[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8RH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV32Option = A396EmprCod ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV33Options.add(AV32Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RH2 )
         {
            brk8RH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPREPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV57TFPrePrvDsc = AV28SearchTxt ;
      AV58TFPrePrvDsc_Sel = "" ;
      AV68Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV69Tprepedwwds_2_tfemprcod = AV10TFEmprCod ;
      AV70Tprepedwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV71Tprepedwwds_4_tfpreprvnum = AV12TFPrePrvNum ;
      AV72Tprepedwwds_5_tfpreprvnum_to = AV13TFPrePrvNum_To ;
      AV73Tprepedwwds_6_tfpreprvdsc = AV57TFPrePrvDsc ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = AV58TFPrePrvDsc_Sel ;
      AV75Tprepedwwds_8_tfprdnum = AV14TFPrdNum ;
      AV76Tprepedwwds_9_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV77Tprepedwwds_10_tfpedcod = AV16TFPedCod ;
      AV78Tprepedwwds_11_tfpedcod_to = AV17TFPedCod_To ;
      AV79Tprepedwwds_12_tfprepeduni = AV18TFPrePedUni ;
      AV80Tprepedwwds_13_tfprepeduni_to = AV19TFPrePedUni_To ;
      AV81Tprepedwwds_14_tfprepedcon = AV20TFPrePedCon ;
      AV82Tprepedwwds_15_tfprepedcon_sel = AV21TFPrePedCon_Sel ;
      AV83Tprepedwwds_16_tfprepedpre = AV22TFPrePedPre ;
      AV84Tprepedwwds_17_tfprepedpre_to = AV23TFPrePedPre_To ;
      AV85Tprepedwwds_18_tfprepeddto = AV24TFPrePedDto ;
      AV86Tprepedwwds_19_tfprepeddto_to = AV25TFPrePedDto_To ;
      AV87Tprepedwwds_20_tfprepedpri = AV26TFPrePedPri ;
      AV88Tprepedwwds_21_tfprepedpri_sel = AV27TFPrePedPri_Sel ;
      AV89Tprepedwwds_22_tfprdpreact = AV59TFPrdPreAct ;
      AV90Tprepedwwds_23_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Tprepedwwds_24_tftipdtodto = AV61TFTipDtoDto ;
      AV92Tprepedwwds_25_tftipdtodto_to = AV62TFTipDtoDto_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Tprepedwwds_3_tfemprcod_sel ,
                                           AV69Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV76Tprepedwwds_9_tfprdnum_sel ,
                                           AV75Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV77Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to) ,
                                           AV79Tprepedwwds_12_tfprepeduni ,
                                           AV80Tprepedwwds_13_tfprepeduni_to ,
                                           AV82Tprepedwwds_15_tfprepedcon_sel ,
                                           AV81Tprepedwwds_14_tfprepedcon ,
                                           AV83Tprepedwwds_16_tfprepedpre ,
                                           AV84Tprepedwwds_17_tfprepedpre_to ,
                                           AV85Tprepedwwds_18_tfprepeddto ,
                                           AV86Tprepedwwds_19_tfprepeddto_to ,
                                           AV88Tprepedwwds_21_tfprepedpri_sel ,
                                           AV87Tprepedwwds_20_tfprepedpri ,
                                           AV89Tprepedwwds_22_tfprdpreact ,
                                           AV90Tprepedwwds_23_tfprdpreact_to ,
                                           AV91Tprepedwwds_24_tftipdtodto ,
                                           AV92Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           AV68Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV73Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV73Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV69Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV75Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV75Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV81Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV81Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV87Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV87Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RH3 */
      pr_default.execute(1, new Object[] {AV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV73Tprepedwwds_6_tfpreprvdsc, lV73Tprepedwwds_6_tfpreprvdsc, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV74Tprepedwwds_7_tfpreprvdsc_sel, lV69Tprepedwwds_2_tfemprcod, AV70Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to), lV75Tprepedwwds_8_tfprdnum, AV76Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV77Tprepedwwds_10_tfpedcod), Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to), AV79Tprepedwwds_12_tfprepeduni, AV80Tprepedwwds_13_tfprepeduni_to, lV81Tprepedwwds_14_tfprepedcon, AV82Tprepedwwds_15_tfprepedcon_sel, AV83Tprepedwwds_16_tfprepedpre, AV84Tprepedwwds_17_tfprepedpre_to, AV85Tprepedwwds_18_tfprepeddto, AV86Tprepedwwds_19_tfprepeddto_to, lV87Tprepedwwds_20_tfprepedpri, AV88Tprepedwwds_21_tfprepedpri_sel, AV89Tprepedwwds_22_tfprdpreact, AV90Tprepedwwds_23_tfprdpreact_to, AV91Tprepedwwds_24_tftipdtodto, AV92Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A835TipDtoCod = P08RH3_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH3_n835TipDtoCod[0] ;
         A837TipDtoDto = P08RH3_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH3_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RH3_A724PrdPreAct[0] ;
         A754PrePedPri = P08RH3_A754PrePedPri[0] ;
         n754PrePedPri = P08RH3_n754PrePedPri[0] ;
         A752PrePedDto = P08RH3_A752PrePedDto[0] ;
         n752PrePedDto = P08RH3_n752PrePedDto[0] ;
         A753PrePedPre = P08RH3_A753PrePedPre[0] ;
         n753PrePedPre = P08RH3_n753PrePedPre[0] ;
         A751PrePedCon = P08RH3_A751PrePedCon[0] ;
         n751PrePedCon = P08RH3_n751PrePedCon[0] ;
         A755PrePedUni = P08RH3_A755PrePedUni[0] ;
         n755PrePedUni = P08RH3_n755PrePedUni[0] ;
         A658PedCod = P08RH3_A658PedCod[0] ;
         n658PedCod = P08RH3_n658PedCod[0] ;
         A719PrdNum = P08RH3_A719PrdNum[0] ;
         A756PrePrvNum = P08RH3_A756PrePrvNum[0] ;
         A396EmprCod = P08RH3_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RH3_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH3_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RH3_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH3_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RH3_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RH3_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH3_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RH3_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH3_n13791PrePrvDsc[0] ;
         if ( ! (GXutil.strcmp("", A13791PrePrvDsc)==0) )
         {
            AV32Option = A13791PrePrvDsc ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
            {
               AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
               AV40count = (long)(AV40count+1) ;
               AV38OptionIndexes.removeItem(AV31InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
            }
            else
            {
               AV33Options.add(AV32Option, AV31InsertIndex);
               AV38OptionIndexes.add("1", AV31InsertIndex);
            }
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV28SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV68Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV69Tprepedwwds_2_tfemprcod = AV10TFEmprCod ;
      AV70Tprepedwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV71Tprepedwwds_4_tfpreprvnum = AV12TFPrePrvNum ;
      AV72Tprepedwwds_5_tfpreprvnum_to = AV13TFPrePrvNum_To ;
      AV73Tprepedwwds_6_tfpreprvdsc = AV57TFPrePrvDsc ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = AV58TFPrePrvDsc_Sel ;
      AV75Tprepedwwds_8_tfprdnum = AV14TFPrdNum ;
      AV76Tprepedwwds_9_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV77Tprepedwwds_10_tfpedcod = AV16TFPedCod ;
      AV78Tprepedwwds_11_tfpedcod_to = AV17TFPedCod_To ;
      AV79Tprepedwwds_12_tfprepeduni = AV18TFPrePedUni ;
      AV80Tprepedwwds_13_tfprepeduni_to = AV19TFPrePedUni_To ;
      AV81Tprepedwwds_14_tfprepedcon = AV20TFPrePedCon ;
      AV82Tprepedwwds_15_tfprepedcon_sel = AV21TFPrePedCon_Sel ;
      AV83Tprepedwwds_16_tfprepedpre = AV22TFPrePedPre ;
      AV84Tprepedwwds_17_tfprepedpre_to = AV23TFPrePedPre_To ;
      AV85Tprepedwwds_18_tfprepeddto = AV24TFPrePedDto ;
      AV86Tprepedwwds_19_tfprepeddto_to = AV25TFPrePedDto_To ;
      AV87Tprepedwwds_20_tfprepedpri = AV26TFPrePedPri ;
      AV88Tprepedwwds_21_tfprepedpri_sel = AV27TFPrePedPri_Sel ;
      AV89Tprepedwwds_22_tfprdpreact = AV59TFPrdPreAct ;
      AV90Tprepedwwds_23_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Tprepedwwds_24_tftipdtodto = AV61TFTipDtoDto ;
      AV92Tprepedwwds_25_tftipdtodto_to = AV62TFTipDtoDto_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV70Tprepedwwds_3_tfemprcod_sel ,
                                           AV69Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV76Tprepedwwds_9_tfprdnum_sel ,
                                           AV75Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV77Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to) ,
                                           AV79Tprepedwwds_12_tfprepeduni ,
                                           AV80Tprepedwwds_13_tfprepeduni_to ,
                                           AV82Tprepedwwds_15_tfprepedcon_sel ,
                                           AV81Tprepedwwds_14_tfprepedcon ,
                                           AV83Tprepedwwds_16_tfprepedpre ,
                                           AV84Tprepedwwds_17_tfprepedpre_to ,
                                           AV85Tprepedwwds_18_tfprepeddto ,
                                           AV86Tprepedwwds_19_tfprepeddto_to ,
                                           AV88Tprepedwwds_21_tfprepedpri_sel ,
                                           AV87Tprepedwwds_20_tfprepedpri ,
                                           AV89Tprepedwwds_22_tfprdpreact ,
                                           AV90Tprepedwwds_23_tfprdpreact_to ,
                                           AV91Tprepedwwds_24_tftipdtodto ,
                                           AV92Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           AV68Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV73Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV73Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV69Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV75Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV75Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV81Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV81Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV87Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV87Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RH4 */
      pr_default.execute(2, new Object[] {AV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV73Tprepedwwds_6_tfpreprvdsc, lV73Tprepedwwds_6_tfpreprvdsc, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV74Tprepedwwds_7_tfpreprvdsc_sel, lV69Tprepedwwds_2_tfemprcod, AV70Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to), lV75Tprepedwwds_8_tfprdnum, AV76Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV77Tprepedwwds_10_tfpedcod), Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to), AV79Tprepedwwds_12_tfprepeduni, AV80Tprepedwwds_13_tfprepeduni_to, lV81Tprepedwwds_14_tfprepedcon, AV82Tprepedwwds_15_tfprepedcon_sel, AV83Tprepedwwds_16_tfprepedpre, AV84Tprepedwwds_17_tfprepedpre_to, AV85Tprepedwwds_18_tfprepeddto, AV86Tprepedwwds_19_tfprepeddto_to, lV87Tprepedwwds_20_tfprepedpri, AV88Tprepedwwds_21_tfprepedpri_sel, AV89Tprepedwwds_22_tfprdpreact, AV90Tprepedwwds_23_tfprdpreact_to, AV91Tprepedwwds_24_tftipdtodto, AV92Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8RH5 = false ;
         A835TipDtoCod = P08RH4_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH4_n835TipDtoCod[0] ;
         A719PrdNum = P08RH4_A719PrdNum[0] ;
         A837TipDtoDto = P08RH4_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH4_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RH4_A724PrdPreAct[0] ;
         A754PrePedPri = P08RH4_A754PrePedPri[0] ;
         n754PrePedPri = P08RH4_n754PrePedPri[0] ;
         A752PrePedDto = P08RH4_A752PrePedDto[0] ;
         n752PrePedDto = P08RH4_n752PrePedDto[0] ;
         A753PrePedPre = P08RH4_A753PrePedPre[0] ;
         n753PrePedPre = P08RH4_n753PrePedPre[0] ;
         A751PrePedCon = P08RH4_A751PrePedCon[0] ;
         n751PrePedCon = P08RH4_n751PrePedCon[0] ;
         A755PrePedUni = P08RH4_A755PrePedUni[0] ;
         n755PrePedUni = P08RH4_n755PrePedUni[0] ;
         A658PedCod = P08RH4_A658PedCod[0] ;
         n658PedCod = P08RH4_n658PedCod[0] ;
         A756PrePrvNum = P08RH4_A756PrePrvNum[0] ;
         A396EmprCod = P08RH4_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RH4_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH4_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RH4_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH4_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RH4_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RH4_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH4_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RH4_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH4_n13791PrePrvDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08RH4_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8RH5 = false ;
            A756PrePrvNum = P08RH4_A756PrePrvNum[0] ;
            A396EmprCod = P08RH4_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8RH5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV32Option = A719PrdNum ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RH5 )
         {
            brk8RH5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPREPEDCONOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPrePedCon = AV28SearchTxt ;
      AV21TFPrePedCon_Sel = "" ;
      AV68Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV69Tprepedwwds_2_tfemprcod = AV10TFEmprCod ;
      AV70Tprepedwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV71Tprepedwwds_4_tfpreprvnum = AV12TFPrePrvNum ;
      AV72Tprepedwwds_5_tfpreprvnum_to = AV13TFPrePrvNum_To ;
      AV73Tprepedwwds_6_tfpreprvdsc = AV57TFPrePrvDsc ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = AV58TFPrePrvDsc_Sel ;
      AV75Tprepedwwds_8_tfprdnum = AV14TFPrdNum ;
      AV76Tprepedwwds_9_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV77Tprepedwwds_10_tfpedcod = AV16TFPedCod ;
      AV78Tprepedwwds_11_tfpedcod_to = AV17TFPedCod_To ;
      AV79Tprepedwwds_12_tfprepeduni = AV18TFPrePedUni ;
      AV80Tprepedwwds_13_tfprepeduni_to = AV19TFPrePedUni_To ;
      AV81Tprepedwwds_14_tfprepedcon = AV20TFPrePedCon ;
      AV82Tprepedwwds_15_tfprepedcon_sel = AV21TFPrePedCon_Sel ;
      AV83Tprepedwwds_16_tfprepedpre = AV22TFPrePedPre ;
      AV84Tprepedwwds_17_tfprepedpre_to = AV23TFPrePedPre_To ;
      AV85Tprepedwwds_18_tfprepeddto = AV24TFPrePedDto ;
      AV86Tprepedwwds_19_tfprepeddto_to = AV25TFPrePedDto_To ;
      AV87Tprepedwwds_20_tfprepedpri = AV26TFPrePedPri ;
      AV88Tprepedwwds_21_tfprepedpri_sel = AV27TFPrePedPri_Sel ;
      AV89Tprepedwwds_22_tfprdpreact = AV59TFPrdPreAct ;
      AV90Tprepedwwds_23_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Tprepedwwds_24_tftipdtodto = AV61TFTipDtoDto ;
      AV92Tprepedwwds_25_tftipdtodto_to = AV62TFTipDtoDto_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV70Tprepedwwds_3_tfemprcod_sel ,
                                           AV69Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV76Tprepedwwds_9_tfprdnum_sel ,
                                           AV75Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV77Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to) ,
                                           AV79Tprepedwwds_12_tfprepeduni ,
                                           AV80Tprepedwwds_13_tfprepeduni_to ,
                                           AV82Tprepedwwds_15_tfprepedcon_sel ,
                                           AV81Tprepedwwds_14_tfprepedcon ,
                                           AV83Tprepedwwds_16_tfprepedpre ,
                                           AV84Tprepedwwds_17_tfprepedpre_to ,
                                           AV85Tprepedwwds_18_tfprepeddto ,
                                           AV86Tprepedwwds_19_tfprepeddto_to ,
                                           AV88Tprepedwwds_21_tfprepedpri_sel ,
                                           AV87Tprepedwwds_20_tfprepedpri ,
                                           AV89Tprepedwwds_22_tfprdpreact ,
                                           AV90Tprepedwwds_23_tfprdpreact_to ,
                                           AV91Tprepedwwds_24_tftipdtodto ,
                                           AV92Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           AV68Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV73Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV73Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV69Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV75Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV75Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV81Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV81Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV87Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV87Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RH5 */
      pr_default.execute(3, new Object[] {AV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV73Tprepedwwds_6_tfpreprvdsc, lV73Tprepedwwds_6_tfpreprvdsc, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV74Tprepedwwds_7_tfpreprvdsc_sel, lV69Tprepedwwds_2_tfemprcod, AV70Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to), lV75Tprepedwwds_8_tfprdnum, AV76Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV77Tprepedwwds_10_tfpedcod), Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to), AV79Tprepedwwds_12_tfprepeduni, AV80Tprepedwwds_13_tfprepeduni_to, lV81Tprepedwwds_14_tfprepedcon, AV82Tprepedwwds_15_tfprepedcon_sel, AV83Tprepedwwds_16_tfprepedpre, AV84Tprepedwwds_17_tfprepedpre_to, AV85Tprepedwwds_18_tfprepeddto, AV86Tprepedwwds_19_tfprepeddto_to, lV87Tprepedwwds_20_tfprepedpri, AV88Tprepedwwds_21_tfprepedpri_sel, AV89Tprepedwwds_22_tfprdpreact, AV90Tprepedwwds_23_tfprdpreact_to, AV91Tprepedwwds_24_tftipdtodto, AV92Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8RH7 = false ;
         A835TipDtoCod = P08RH5_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH5_n835TipDtoCod[0] ;
         A751PrePedCon = P08RH5_A751PrePedCon[0] ;
         n751PrePedCon = P08RH5_n751PrePedCon[0] ;
         A837TipDtoDto = P08RH5_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH5_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RH5_A724PrdPreAct[0] ;
         A754PrePedPri = P08RH5_A754PrePedPri[0] ;
         n754PrePedPri = P08RH5_n754PrePedPri[0] ;
         A752PrePedDto = P08RH5_A752PrePedDto[0] ;
         n752PrePedDto = P08RH5_n752PrePedDto[0] ;
         A753PrePedPre = P08RH5_A753PrePedPre[0] ;
         n753PrePedPre = P08RH5_n753PrePedPre[0] ;
         A755PrePedUni = P08RH5_A755PrePedUni[0] ;
         n755PrePedUni = P08RH5_n755PrePedUni[0] ;
         A658PedCod = P08RH5_A658PedCod[0] ;
         n658PedCod = P08RH5_n658PedCod[0] ;
         A719PrdNum = P08RH5_A719PrdNum[0] ;
         A756PrePrvNum = P08RH5_A756PrePrvNum[0] ;
         A396EmprCod = P08RH5_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RH5_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH5_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RH5_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH5_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RH5_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RH5_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH5_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RH5_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH5_n13791PrePrvDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08RH5_A751PrePedCon[0], A751PrePedCon) == 0 ) )
         {
            brk8RH7 = false ;
            A719PrdNum = P08RH5_A719PrdNum[0] ;
            A756PrePrvNum = P08RH5_A756PrePrvNum[0] ;
            A396EmprCod = P08RH5_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8RH7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A751PrePedCon)==0) )
         {
            AV32Option = A751PrePedCon ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A751PrePedCon, "@!"))) ;
            AV33Options.add(AV32Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RH7 )
         {
            brk8RH7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPREPEDPRIOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrePedPri = AV28SearchTxt ;
      AV27TFPrePedPri_Sel = "" ;
      AV68Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV69Tprepedwwds_2_tfemprcod = AV10TFEmprCod ;
      AV70Tprepedwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV71Tprepedwwds_4_tfpreprvnum = AV12TFPrePrvNum ;
      AV72Tprepedwwds_5_tfpreprvnum_to = AV13TFPrePrvNum_To ;
      AV73Tprepedwwds_6_tfpreprvdsc = AV57TFPrePrvDsc ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = AV58TFPrePrvDsc_Sel ;
      AV75Tprepedwwds_8_tfprdnum = AV14TFPrdNum ;
      AV76Tprepedwwds_9_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV77Tprepedwwds_10_tfpedcod = AV16TFPedCod ;
      AV78Tprepedwwds_11_tfpedcod_to = AV17TFPedCod_To ;
      AV79Tprepedwwds_12_tfprepeduni = AV18TFPrePedUni ;
      AV80Tprepedwwds_13_tfprepeduni_to = AV19TFPrePedUni_To ;
      AV81Tprepedwwds_14_tfprepedcon = AV20TFPrePedCon ;
      AV82Tprepedwwds_15_tfprepedcon_sel = AV21TFPrePedCon_Sel ;
      AV83Tprepedwwds_16_tfprepedpre = AV22TFPrePedPre ;
      AV84Tprepedwwds_17_tfprepedpre_to = AV23TFPrePedPre_To ;
      AV85Tprepedwwds_18_tfprepeddto = AV24TFPrePedDto ;
      AV86Tprepedwwds_19_tfprepeddto_to = AV25TFPrePedDto_To ;
      AV87Tprepedwwds_20_tfprepedpri = AV26TFPrePedPri ;
      AV88Tprepedwwds_21_tfprepedpri_sel = AV27TFPrePedPri_Sel ;
      AV89Tprepedwwds_22_tfprdpreact = AV59TFPrdPreAct ;
      AV90Tprepedwwds_23_tfprdpreact_to = AV60TFPrdPreAct_To ;
      AV91Tprepedwwds_24_tftipdtodto = AV61TFTipDtoDto ;
      AV92Tprepedwwds_25_tftipdtodto_to = AV62TFTipDtoDto_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV70Tprepedwwds_3_tfemprcod_sel ,
                                           AV69Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV76Tprepedwwds_9_tfprdnum_sel ,
                                           AV75Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV77Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to) ,
                                           AV79Tprepedwwds_12_tfprepeduni ,
                                           AV80Tprepedwwds_13_tfprepeduni_to ,
                                           AV82Tprepedwwds_15_tfprepedcon_sel ,
                                           AV81Tprepedwwds_14_tfprepedcon ,
                                           AV83Tprepedwwds_16_tfprepedpre ,
                                           AV84Tprepedwwds_17_tfprepedpre_to ,
                                           AV85Tprepedwwds_18_tfprepeddto ,
                                           AV86Tprepedwwds_19_tfprepeddto_to ,
                                           AV88Tprepedwwds_21_tfprepedpri_sel ,
                                           AV87Tprepedwwds_20_tfprepedpri ,
                                           AV89Tprepedwwds_22_tfprdpreact ,
                                           AV90Tprepedwwds_23_tfprdpreact_to ,
                                           AV91Tprepedwwds_24_tftipdtodto ,
                                           AV92Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           AV68Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV73Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV68Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV73Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV69Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV75Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV75Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV81Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV81Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV87Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV87Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RH6 */
      pr_default.execute(4, new Object[] {AV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, lV68Tprepedwwds_1_filterfulltext, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV73Tprepedwwds_6_tfpreprvdsc, lV73Tprepedwwds_6_tfpreprvdsc, AV74Tprepedwwds_7_tfpreprvdsc_sel, AV74Tprepedwwds_7_tfpreprvdsc_sel, lV69Tprepedwwds_2_tfemprcod, AV70Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV71Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV72Tprepedwwds_5_tfpreprvnum_to), lV75Tprepedwwds_8_tfprdnum, AV76Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV77Tprepedwwds_10_tfpedcod), Integer.valueOf(AV78Tprepedwwds_11_tfpedcod_to), AV79Tprepedwwds_12_tfprepeduni, AV80Tprepedwwds_13_tfprepeduni_to, lV81Tprepedwwds_14_tfprepedcon, AV82Tprepedwwds_15_tfprepedcon_sel, AV83Tprepedwwds_16_tfprepedpre, AV84Tprepedwwds_17_tfprepedpre_to, AV85Tprepedwwds_18_tfprepeddto, AV86Tprepedwwds_19_tfprepeddto_to, lV87Tprepedwwds_20_tfprepedpri, AV88Tprepedwwds_21_tfprepedpri_sel, AV89Tprepedwwds_22_tfprdpreact, AV90Tprepedwwds_23_tfprdpreact_to, AV91Tprepedwwds_24_tftipdtodto, AV92Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8RH9 = false ;
         A835TipDtoCod = P08RH6_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH6_n835TipDtoCod[0] ;
         A754PrePedPri = P08RH6_A754PrePedPri[0] ;
         n754PrePedPri = P08RH6_n754PrePedPri[0] ;
         A837TipDtoDto = P08RH6_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH6_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RH6_A724PrdPreAct[0] ;
         A752PrePedDto = P08RH6_A752PrePedDto[0] ;
         n752PrePedDto = P08RH6_n752PrePedDto[0] ;
         A753PrePedPre = P08RH6_A753PrePedPre[0] ;
         n753PrePedPre = P08RH6_n753PrePedPre[0] ;
         A751PrePedCon = P08RH6_A751PrePedCon[0] ;
         n751PrePedCon = P08RH6_n751PrePedCon[0] ;
         A755PrePedUni = P08RH6_A755PrePedUni[0] ;
         n755PrePedUni = P08RH6_n755PrePedUni[0] ;
         A658PedCod = P08RH6_A658PedCod[0] ;
         n658PedCod = P08RH6_n658PedCod[0] ;
         A719PrdNum = P08RH6_A719PrdNum[0] ;
         A756PrePrvNum = P08RH6_A756PrePrvNum[0] ;
         A396EmprCod = P08RH6_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RH6_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH6_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RH6_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RH6_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RH6_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RH6_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RH6_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RH6_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RH6_n13791PrePrvDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08RH6_A754PrePedPri[0], A754PrePedPri) == 0 ) )
         {
            brk8RH9 = false ;
            A719PrdNum = P08RH6_A719PrdNum[0] ;
            A756PrePrvNum = P08RH6_A756PrePrvNum[0] ;
            A396EmprCod = P08RH6_A396EmprCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8RH9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A754PrePedPri)==0) )
         {
            AV32Option = A754PrePedPri ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A754PrePedPri, "9"))) ;
            AV33Options.add(AV32Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RH9 )
         {
            brk8RH9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprepedwwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = tprepedwwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = tprepedwwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV63FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV57TFPrePrvDsc = "" ;
      AV58TFPrePrvDsc_Sel = "" ;
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV18TFPrePedUni = DecimalUtil.ZERO ;
      AV19TFPrePedUni_To = DecimalUtil.ZERO ;
      AV20TFPrePedCon = "" ;
      AV21TFPrePedCon_Sel = "" ;
      AV22TFPrePedPre = DecimalUtil.ZERO ;
      AV23TFPrePedPre_To = DecimalUtil.ZERO ;
      AV24TFPrePedDto = DecimalUtil.ZERO ;
      AV25TFPrePedDto_To = DecimalUtil.ZERO ;
      AV26TFPrePedPri = "" ;
      AV27TFPrePedPri_Sel = "" ;
      AV59TFPrdPreAct = DecimalUtil.ZERO ;
      AV60TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV61TFTipDtoDto = DecimalUtil.ZERO ;
      AV62TFTipDtoDto_To = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV68Tprepedwwds_1_filterfulltext = "" ;
      AV69Tprepedwwds_2_tfemprcod = "" ;
      AV70Tprepedwwds_3_tfemprcod_sel = "" ;
      AV73Tprepedwwds_6_tfpreprvdsc = "" ;
      AV74Tprepedwwds_7_tfpreprvdsc_sel = "" ;
      AV75Tprepedwwds_8_tfprdnum = "" ;
      AV76Tprepedwwds_9_tfprdnum_sel = "" ;
      AV79Tprepedwwds_12_tfprepeduni = DecimalUtil.ZERO ;
      AV80Tprepedwwds_13_tfprepeduni_to = DecimalUtil.ZERO ;
      AV81Tprepedwwds_14_tfprepedcon = "" ;
      AV82Tprepedwwds_15_tfprepedcon_sel = "" ;
      AV83Tprepedwwds_16_tfprepedpre = DecimalUtil.ZERO ;
      AV84Tprepedwwds_17_tfprepedpre_to = DecimalUtil.ZERO ;
      AV85Tprepedwwds_18_tfprepeddto = DecimalUtil.ZERO ;
      AV86Tprepedwwds_19_tfprepeddto_to = DecimalUtil.ZERO ;
      AV87Tprepedwwds_20_tfprepedpri = "" ;
      AV88Tprepedwwds_21_tfprepedpri_sel = "" ;
      AV89Tprepedwwds_22_tfprdpreact = DecimalUtil.ZERO ;
      AV90Tprepedwwds_23_tfprdpreact_to = DecimalUtil.ZERO ;
      AV91Tprepedwwds_24_tftipdtodto = DecimalUtil.ZERO ;
      AV92Tprepedwwds_25_tftipdtodto_to = DecimalUtil.ZERO ;
      lV68Tprepedwwds_1_filterfulltext = "" ;
      lV73Tprepedwwds_6_tfpreprvdsc = "" ;
      scmdbuf = "" ;
      lV69Tprepedwwds_2_tfemprcod = "" ;
      lV75Tprepedwwds_8_tfprdnum = "" ;
      lV81Tprepedwwds_14_tfprepedcon = "" ;
      lV87Tprepedwwds_20_tfprepedpri = "" ;
      A719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      A13791PrePrvDsc = "" ;
      P08RH2_A795PrvNum = new int[1] ;
      P08RH2_A835TipDtoCod = new byte[1] ;
      P08RH2_n835TipDtoCod = new boolean[] {false} ;
      P08RH2_A396EmprCod = new String[] {""} ;
      P08RH2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH2_n837TipDtoDto = new boolean[] {false} ;
      P08RH2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH2_A754PrePedPri = new String[] {""} ;
      P08RH2_n754PrePedPri = new boolean[] {false} ;
      P08RH2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH2_n752PrePedDto = new boolean[] {false} ;
      P08RH2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH2_n753PrePedPre = new boolean[] {false} ;
      P08RH2_A751PrePedCon = new String[] {""} ;
      P08RH2_n751PrePedCon = new boolean[] {false} ;
      P08RH2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH2_n755PrePedUni = new boolean[] {false} ;
      P08RH2_A658PedCod = new int[1] ;
      P08RH2_n658PedCod = new boolean[] {false} ;
      P08RH2_A719PrdNum = new String[] {""} ;
      P08RH2_A756PrePrvNum = new int[1] ;
      P08RH2_A13791PrePrvDsc = new String[] {""} ;
      P08RH2_n13791PrePrvDsc = new boolean[] {false} ;
      AV32Option = "" ;
      AV35OptionDesc = "" ;
      P08RH3_A795PrvNum = new int[1] ;
      P08RH3_A835TipDtoCod = new byte[1] ;
      P08RH3_n835TipDtoCod = new boolean[] {false} ;
      P08RH3_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH3_n837TipDtoDto = new boolean[] {false} ;
      P08RH3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH3_A754PrePedPri = new String[] {""} ;
      P08RH3_n754PrePedPri = new boolean[] {false} ;
      P08RH3_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH3_n752PrePedDto = new boolean[] {false} ;
      P08RH3_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH3_n753PrePedPre = new boolean[] {false} ;
      P08RH3_A751PrePedCon = new String[] {""} ;
      P08RH3_n751PrePedCon = new boolean[] {false} ;
      P08RH3_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH3_n755PrePedUni = new boolean[] {false} ;
      P08RH3_A658PedCod = new int[1] ;
      P08RH3_n658PedCod = new boolean[] {false} ;
      P08RH3_A719PrdNum = new String[] {""} ;
      P08RH3_A756PrePrvNum = new int[1] ;
      P08RH3_A396EmprCod = new String[] {""} ;
      P08RH3_A13791PrePrvDsc = new String[] {""} ;
      P08RH3_n13791PrePrvDsc = new boolean[] {false} ;
      P08RH4_A795PrvNum = new int[1] ;
      P08RH4_A835TipDtoCod = new byte[1] ;
      P08RH4_n835TipDtoCod = new boolean[] {false} ;
      P08RH4_A719PrdNum = new String[] {""} ;
      P08RH4_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH4_n837TipDtoDto = new boolean[] {false} ;
      P08RH4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH4_A754PrePedPri = new String[] {""} ;
      P08RH4_n754PrePedPri = new boolean[] {false} ;
      P08RH4_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH4_n752PrePedDto = new boolean[] {false} ;
      P08RH4_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH4_n753PrePedPre = new boolean[] {false} ;
      P08RH4_A751PrePedCon = new String[] {""} ;
      P08RH4_n751PrePedCon = new boolean[] {false} ;
      P08RH4_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH4_n755PrePedUni = new boolean[] {false} ;
      P08RH4_A658PedCod = new int[1] ;
      P08RH4_n658PedCod = new boolean[] {false} ;
      P08RH4_A756PrePrvNum = new int[1] ;
      P08RH4_A396EmprCod = new String[] {""} ;
      P08RH4_A13791PrePrvDsc = new String[] {""} ;
      P08RH4_n13791PrePrvDsc = new boolean[] {false} ;
      P08RH5_A795PrvNum = new int[1] ;
      P08RH5_A835TipDtoCod = new byte[1] ;
      P08RH5_n835TipDtoCod = new boolean[] {false} ;
      P08RH5_A751PrePedCon = new String[] {""} ;
      P08RH5_n751PrePedCon = new boolean[] {false} ;
      P08RH5_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH5_n837TipDtoDto = new boolean[] {false} ;
      P08RH5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH5_A754PrePedPri = new String[] {""} ;
      P08RH5_n754PrePedPri = new boolean[] {false} ;
      P08RH5_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH5_n752PrePedDto = new boolean[] {false} ;
      P08RH5_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH5_n753PrePedPre = new boolean[] {false} ;
      P08RH5_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH5_n755PrePedUni = new boolean[] {false} ;
      P08RH5_A658PedCod = new int[1] ;
      P08RH5_n658PedCod = new boolean[] {false} ;
      P08RH5_A719PrdNum = new String[] {""} ;
      P08RH5_A756PrePrvNum = new int[1] ;
      P08RH5_A396EmprCod = new String[] {""} ;
      P08RH5_A13791PrePrvDsc = new String[] {""} ;
      P08RH5_n13791PrePrvDsc = new boolean[] {false} ;
      P08RH6_A795PrvNum = new int[1] ;
      P08RH6_A835TipDtoCod = new byte[1] ;
      P08RH6_n835TipDtoCod = new boolean[] {false} ;
      P08RH6_A754PrePedPri = new String[] {""} ;
      P08RH6_n754PrePedPri = new boolean[] {false} ;
      P08RH6_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH6_n837TipDtoDto = new boolean[] {false} ;
      P08RH6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH6_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH6_n752PrePedDto = new boolean[] {false} ;
      P08RH6_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH6_n753PrePedPre = new boolean[] {false} ;
      P08RH6_A751PrePedCon = new String[] {""} ;
      P08RH6_n751PrePedCon = new boolean[] {false} ;
      P08RH6_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RH6_n755PrePedUni = new boolean[] {false} ;
      P08RH6_A658PedCod = new int[1] ;
      P08RH6_n658PedCod = new boolean[] {false} ;
      P08RH6_A719PrdNum = new String[] {""} ;
      P08RH6_A756PrePrvNum = new int[1] ;
      P08RH6_A396EmprCod = new String[] {""} ;
      P08RH6_A13791PrePrvDsc = new String[] {""} ;
      P08RH6_n13791PrePrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprepedwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08RH2_A795PrvNum, P08RH2_A835TipDtoCod, P08RH2_n835TipDtoCod, P08RH2_A396EmprCod, P08RH2_A837TipDtoDto, P08RH2_n837TipDtoDto, P08RH2_A724PrdPreAct, P08RH2_A754PrePedPri, P08RH2_n754PrePedPri, P08RH2_A752PrePedDto,
            P08RH2_n752PrePedDto, P08RH2_A753PrePedPre, P08RH2_n753PrePedPre, P08RH2_A751PrePedCon, P08RH2_n751PrePedCon, P08RH2_A755PrePedUni, P08RH2_n755PrePedUni, P08RH2_A658PedCod, P08RH2_n658PedCod, P08RH2_A719PrdNum,
            P08RH2_A756PrePrvNum, P08RH2_A13791PrePrvDsc, P08RH2_n13791PrePrvDsc
            }
            , new Object[] {
            P08RH3_A795PrvNum, P08RH3_A835TipDtoCod, P08RH3_n835TipDtoCod, P08RH3_A837TipDtoDto, P08RH3_n837TipDtoDto, P08RH3_A724PrdPreAct, P08RH3_A754PrePedPri, P08RH3_n754PrePedPri, P08RH3_A752PrePedDto, P08RH3_n752PrePedDto,
            P08RH3_A753PrePedPre, P08RH3_n753PrePedPre, P08RH3_A751PrePedCon, P08RH3_n751PrePedCon, P08RH3_A755PrePedUni, P08RH3_n755PrePedUni, P08RH3_A658PedCod, P08RH3_n658PedCod, P08RH3_A719PrdNum, P08RH3_A756PrePrvNum,
            P08RH3_A396EmprCod, P08RH3_A13791PrePrvDsc, P08RH3_n13791PrePrvDsc
            }
            , new Object[] {
            P08RH4_A795PrvNum, P08RH4_A835TipDtoCod, P08RH4_n835TipDtoCod, P08RH4_A719PrdNum, P08RH4_A837TipDtoDto, P08RH4_n837TipDtoDto, P08RH4_A724PrdPreAct, P08RH4_A754PrePedPri, P08RH4_n754PrePedPri, P08RH4_A752PrePedDto,
            P08RH4_n752PrePedDto, P08RH4_A753PrePedPre, P08RH4_n753PrePedPre, P08RH4_A751PrePedCon, P08RH4_n751PrePedCon, P08RH4_A755PrePedUni, P08RH4_n755PrePedUni, P08RH4_A658PedCod, P08RH4_n658PedCod, P08RH4_A756PrePrvNum,
            P08RH4_A396EmprCod, P08RH4_A13791PrePrvDsc, P08RH4_n13791PrePrvDsc
            }
            , new Object[] {
            P08RH5_A795PrvNum, P08RH5_A835TipDtoCod, P08RH5_n835TipDtoCod, P08RH5_A751PrePedCon, P08RH5_n751PrePedCon, P08RH5_A837TipDtoDto, P08RH5_n837TipDtoDto, P08RH5_A724PrdPreAct, P08RH5_A754PrePedPri, P08RH5_n754PrePedPri,
            P08RH5_A752PrePedDto, P08RH5_n752PrePedDto, P08RH5_A753PrePedPre, P08RH5_n753PrePedPre, P08RH5_A755PrePedUni, P08RH5_n755PrePedUni, P08RH5_A658PedCod, P08RH5_n658PedCod, P08RH5_A719PrdNum, P08RH5_A756PrePrvNum,
            P08RH5_A396EmprCod, P08RH5_A13791PrePrvDsc, P08RH5_n13791PrePrvDsc
            }
            , new Object[] {
            P08RH6_A795PrvNum, P08RH6_A835TipDtoCod, P08RH6_n835TipDtoCod, P08RH6_A754PrePedPri, P08RH6_n754PrePedPri, P08RH6_A837TipDtoDto, P08RH6_n837TipDtoDto, P08RH6_A724PrdPreAct, P08RH6_A752PrePedDto, P08RH6_n752PrePedDto,
            P08RH6_A753PrePedPre, P08RH6_n753PrePedPre, P08RH6_A751PrePedCon, P08RH6_n751PrePedCon, P08RH6_A755PrePedUni, P08RH6_n755PrePedUni, P08RH6_A658PedCod, P08RH6_n658PedCod, P08RH6_A719PrdNum, P08RH6_A756PrePrvNum,
            P08RH6_A396EmprCod, P08RH6_A13791PrePrvDsc, P08RH6_n13791PrePrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A835TipDtoCod ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV12TFPrePrvNum ;
   private int AV13TFPrePrvNum_To ;
   private int AV16TFPedCod ;
   private int AV17TFPedCod_To ;
   private int AV71Tprepedwwds_4_tfpreprvnum ;
   private int AV72Tprepedwwds_5_tfpreprvnum_to ;
   private int AV77Tprepedwwds_10_tfpedcod ;
   private int AV78Tprepedwwds_11_tfpedcod_to ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV18TFPrePedUni ;
   private java.math.BigDecimal AV19TFPrePedUni_To ;
   private java.math.BigDecimal AV22TFPrePedPre ;
   private java.math.BigDecimal AV23TFPrePedPre_To ;
   private java.math.BigDecimal AV24TFPrePedDto ;
   private java.math.BigDecimal AV25TFPrePedDto_To ;
   private java.math.BigDecimal AV59TFPrdPreAct ;
   private java.math.BigDecimal AV60TFPrdPreAct_To ;
   private java.math.BigDecimal AV61TFTipDtoDto ;
   private java.math.BigDecimal AV62TFTipDtoDto_To ;
   private java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ;
   private java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ;
   private java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ;
   private java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ;
   private java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ;
   private java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ;
   private java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ;
   private java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ;
   private java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ;
   private java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV57TFPrePrvDsc ;
   private String AV58TFPrePrvDsc_Sel ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV20TFPrePedCon ;
   private String AV21TFPrePedCon_Sel ;
   private String AV26TFPrePedPri ;
   private String AV27TFPrePedPri_Sel ;
   private String A396EmprCod ;
   private String AV69Tprepedwwds_2_tfemprcod ;
   private String AV70Tprepedwwds_3_tfemprcod_sel ;
   private String AV73Tprepedwwds_6_tfpreprvdsc ;
   private String AV74Tprepedwwds_7_tfpreprvdsc_sel ;
   private String AV75Tprepedwwds_8_tfprdnum ;
   private String AV76Tprepedwwds_9_tfprdnum_sel ;
   private String AV81Tprepedwwds_14_tfprepedcon ;
   private String AV82Tprepedwwds_15_tfprepedcon_sel ;
   private String AV87Tprepedwwds_20_tfprepedpri ;
   private String AV88Tprepedwwds_21_tfprepedpri_sel ;
   private String lV73Tprepedwwds_6_tfpreprvdsc ;
   private String scmdbuf ;
   private String lV69Tprepedwwds_2_tfemprcod ;
   private String lV75Tprepedwwds_8_tfprdnum ;
   private String lV81Tprepedwwds_14_tfprepedcon ;
   private String lV87Tprepedwwds_20_tfprepedpri ;
   private String A719PrdNum ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String A13791PrePrvDsc ;
   private boolean returnInSub ;
   private boolean brk8RH2 ;
   private boolean n835TipDtoCod ;
   private boolean n837TipDtoDto ;
   private boolean n754PrePedPri ;
   private boolean n752PrePedDto ;
   private boolean n753PrePedPre ;
   private boolean n751PrePedCon ;
   private boolean n755PrePedUni ;
   private boolean n658PedCod ;
   private boolean n13791PrePrvDsc ;
   private boolean brk8RH5 ;
   private boolean brk8RH7 ;
   private boolean brk8RH9 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV63FilterFullText ;
   private String AV68Tprepedwwds_1_filterfulltext ;
   private String lV68Tprepedwwds_1_filterfulltext ;
   private String AV32Option ;
   private String AV35OptionDesc ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08RH2_A795PrvNum ;
   private byte[] P08RH2_A835TipDtoCod ;
   private boolean[] P08RH2_n835TipDtoCod ;
   private String[] P08RH2_A396EmprCod ;
   private java.math.BigDecimal[] P08RH2_A837TipDtoDto ;
   private boolean[] P08RH2_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RH2_A724PrdPreAct ;
   private String[] P08RH2_A754PrePedPri ;
   private boolean[] P08RH2_n754PrePedPri ;
   private java.math.BigDecimal[] P08RH2_A752PrePedDto ;
   private boolean[] P08RH2_n752PrePedDto ;
   private java.math.BigDecimal[] P08RH2_A753PrePedPre ;
   private boolean[] P08RH2_n753PrePedPre ;
   private String[] P08RH2_A751PrePedCon ;
   private boolean[] P08RH2_n751PrePedCon ;
   private java.math.BigDecimal[] P08RH2_A755PrePedUni ;
   private boolean[] P08RH2_n755PrePedUni ;
   private int[] P08RH2_A658PedCod ;
   private boolean[] P08RH2_n658PedCod ;
   private String[] P08RH2_A719PrdNum ;
   private int[] P08RH2_A756PrePrvNum ;
   private String[] P08RH2_A13791PrePrvDsc ;
   private boolean[] P08RH2_n13791PrePrvDsc ;
   private int[] P08RH3_A795PrvNum ;
   private byte[] P08RH3_A835TipDtoCod ;
   private boolean[] P08RH3_n835TipDtoCod ;
   private java.math.BigDecimal[] P08RH3_A837TipDtoDto ;
   private boolean[] P08RH3_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RH3_A724PrdPreAct ;
   private String[] P08RH3_A754PrePedPri ;
   private boolean[] P08RH3_n754PrePedPri ;
   private java.math.BigDecimal[] P08RH3_A752PrePedDto ;
   private boolean[] P08RH3_n752PrePedDto ;
   private java.math.BigDecimal[] P08RH3_A753PrePedPre ;
   private boolean[] P08RH3_n753PrePedPre ;
   private String[] P08RH3_A751PrePedCon ;
   private boolean[] P08RH3_n751PrePedCon ;
   private java.math.BigDecimal[] P08RH3_A755PrePedUni ;
   private boolean[] P08RH3_n755PrePedUni ;
   private int[] P08RH3_A658PedCod ;
   private boolean[] P08RH3_n658PedCod ;
   private String[] P08RH3_A719PrdNum ;
   private int[] P08RH3_A756PrePrvNum ;
   private String[] P08RH3_A396EmprCod ;
   private String[] P08RH3_A13791PrePrvDsc ;
   private boolean[] P08RH3_n13791PrePrvDsc ;
   private int[] P08RH4_A795PrvNum ;
   private byte[] P08RH4_A835TipDtoCod ;
   private boolean[] P08RH4_n835TipDtoCod ;
   private String[] P08RH4_A719PrdNum ;
   private java.math.BigDecimal[] P08RH4_A837TipDtoDto ;
   private boolean[] P08RH4_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RH4_A724PrdPreAct ;
   private String[] P08RH4_A754PrePedPri ;
   private boolean[] P08RH4_n754PrePedPri ;
   private java.math.BigDecimal[] P08RH4_A752PrePedDto ;
   private boolean[] P08RH4_n752PrePedDto ;
   private java.math.BigDecimal[] P08RH4_A753PrePedPre ;
   private boolean[] P08RH4_n753PrePedPre ;
   private String[] P08RH4_A751PrePedCon ;
   private boolean[] P08RH4_n751PrePedCon ;
   private java.math.BigDecimal[] P08RH4_A755PrePedUni ;
   private boolean[] P08RH4_n755PrePedUni ;
   private int[] P08RH4_A658PedCod ;
   private boolean[] P08RH4_n658PedCod ;
   private int[] P08RH4_A756PrePrvNum ;
   private String[] P08RH4_A396EmprCod ;
   private String[] P08RH4_A13791PrePrvDsc ;
   private boolean[] P08RH4_n13791PrePrvDsc ;
   private int[] P08RH5_A795PrvNum ;
   private byte[] P08RH5_A835TipDtoCod ;
   private boolean[] P08RH5_n835TipDtoCod ;
   private String[] P08RH5_A751PrePedCon ;
   private boolean[] P08RH5_n751PrePedCon ;
   private java.math.BigDecimal[] P08RH5_A837TipDtoDto ;
   private boolean[] P08RH5_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RH5_A724PrdPreAct ;
   private String[] P08RH5_A754PrePedPri ;
   private boolean[] P08RH5_n754PrePedPri ;
   private java.math.BigDecimal[] P08RH5_A752PrePedDto ;
   private boolean[] P08RH5_n752PrePedDto ;
   private java.math.BigDecimal[] P08RH5_A753PrePedPre ;
   private boolean[] P08RH5_n753PrePedPre ;
   private java.math.BigDecimal[] P08RH5_A755PrePedUni ;
   private boolean[] P08RH5_n755PrePedUni ;
   private int[] P08RH5_A658PedCod ;
   private boolean[] P08RH5_n658PedCod ;
   private String[] P08RH5_A719PrdNum ;
   private int[] P08RH5_A756PrePrvNum ;
   private String[] P08RH5_A396EmprCod ;
   private String[] P08RH5_A13791PrePrvDsc ;
   private boolean[] P08RH5_n13791PrePrvDsc ;
   private int[] P08RH6_A795PrvNum ;
   private byte[] P08RH6_A835TipDtoCod ;
   private boolean[] P08RH6_n835TipDtoCod ;
   private String[] P08RH6_A754PrePedPri ;
   private boolean[] P08RH6_n754PrePedPri ;
   private java.math.BigDecimal[] P08RH6_A837TipDtoDto ;
   private boolean[] P08RH6_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RH6_A724PrdPreAct ;
   private java.math.BigDecimal[] P08RH6_A752PrePedDto ;
   private boolean[] P08RH6_n752PrePedDto ;
   private java.math.BigDecimal[] P08RH6_A753PrePedPre ;
   private boolean[] P08RH6_n753PrePedPre ;
   private String[] P08RH6_A751PrePedCon ;
   private boolean[] P08RH6_n751PrePedCon ;
   private java.math.BigDecimal[] P08RH6_A755PrePedUni ;
   private boolean[] P08RH6_n755PrePedUni ;
   private int[] P08RH6_A658PedCod ;
   private boolean[] P08RH6_n658PedCod ;
   private String[] P08RH6_A719PrdNum ;
   private int[] P08RH6_A756PrePrvNum ;
   private String[] P08RH6_A396EmprCod ;
   private String[] P08RH6_A13791PrePrvDsc ;
   private boolean[] P08RH6_n13791PrePrvDsc ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tprepedwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tprepedwwds_3_tfemprcod_sel ,
                                          String AV69Tprepedwwds_2_tfemprcod ,
                                          int AV71Tprepedwwds_4_tfpreprvnum ,
                                          int AV72Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV76Tprepedwwds_9_tfprdnum_sel ,
                                          String AV75Tprepedwwds_8_tfprdnum ,
                                          int AV77Tprepedwwds_10_tfpedcod ,
                                          int AV78Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ,
                                          String AV82Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV81Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ,
                                          String AV88Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV87Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          String AV68Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV73Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T1.EmprCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum," ;
      scmdbuf += " T1.PrePrvNum, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT" ;
      scmdbuf += " JOIN TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV75Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08RH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tprepedwwds_3_tfemprcod_sel ,
                                          String AV69Tprepedwwds_2_tfemprcod ,
                                          int AV71Tprepedwwds_4_tfpreprvnum ,
                                          int AV72Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV76Tprepedwwds_9_tfprdnum_sel ,
                                          String AV75Tprepedwwds_8_tfprdnum ,
                                          int AV77Tprepedwwds_10_tfpedcod ,
                                          int AV78Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ,
                                          String AV82Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV81Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ,
                                          String AV88Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV87Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          String AV68Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV73Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[40];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV75Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrePrvNum, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08RH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tprepedwwds_3_tfemprcod_sel ,
                                          String AV69Tprepedwwds_2_tfemprcod ,
                                          int AV71Tprepedwwds_4_tfpreprvnum ,
                                          int AV72Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV76Tprepedwwds_9_tfprdnum_sel ,
                                          String AV75Tprepedwwds_8_tfprdnum ,
                                          int AV77Tprepedwwds_10_tfpedcod ,
                                          int AV78Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ,
                                          String AV82Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV81Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ,
                                          String AV88Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV87Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          String AV68Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV73Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T1.PrdNum, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV75Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08RH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tprepedwwds_3_tfemprcod_sel ,
                                          String AV69Tprepedwwds_2_tfemprcod ,
                                          int AV71Tprepedwwds_4_tfpreprvnum ,
                                          int AV72Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV76Tprepedwwds_9_tfprdnum_sel ,
                                          String AV75Tprepedwwds_8_tfprdnum ,
                                          int AV77Tprepedwwds_10_tfpedcod ,
                                          int AV78Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ,
                                          String AV82Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV81Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ,
                                          String AV88Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV87Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          String AV68Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV73Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T1.PrePedCon, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV75Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrePedCon" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08RH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tprepedwwds_3_tfemprcod_sel ,
                                          String AV69Tprepedwwds_2_tfemprcod ,
                                          int AV71Tprepedwwds_4_tfpreprvnum ,
                                          int AV72Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV76Tprepedwwds_9_tfprdnum_sel ,
                                          String AV75Tprepedwwds_8_tfprdnum ,
                                          int AV77Tprepedwwds_10_tfpedcod ,
                                          int AV78Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV79Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV80Tprepedwwds_13_tfprepeduni_to ,
                                          String AV82Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV81Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV83Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV84Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV85Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV86Tprepedwwds_19_tfprepeddto_to ,
                                          String AV88Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV87Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV89Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV90Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV91Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV92Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          String AV68Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV74Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV73Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[40];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T1.PrePedPri, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV75Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrePedPri" ;
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
                  return conditional_P08RH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P08RH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P08RH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 3 :
                  return conditional_P08RH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 4 :
                  return conditional_P08RH6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 6);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

